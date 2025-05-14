grammar transpiler;

@header {
    import java.io.FileWriter;
    import java.io.IOException;
}

@parser :: members{
    private Combinator combinator = new Combinator();
    private FileWriter writer;

    private void printAtEnd(String text){
       openFile();
       closeFile(text);
    }

    private void openFile(){
        try {
            writer = new FileWriter("salida.c", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

        private void closeFile(String text) {
            try {
                writer.write(text);
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}


//############################################
//           REGLAS LEXICAS
//############################################

//--RESERVED WORDS--
PROGRAM : 'PROGRAM' | 'program';
BEGIN : 'BEGIN' | 'begin';
END : 'END' | 'end';
CONST: 'CONST' | 'const';
PROCEDURE: 'PROCEDURE' | 'procedure';
FUNCTION : 'FUNCTION' | 'function';
VAR : 'VAR' | 'var';


//--PARTE OPCIONAL--
UNIT : 'unit' | 'UNIT';

fragment IDENTIFIER_START: [a-zA-Z];
fragment IDENTIFIER_PART: [a-zA-Z_0-9];

//--LITERALS--
WHITE_SPACE: [ \t\r\n]+ -> skip;

//--ID--
ID: IDENTIFIER_START IDENTIFIER_PART*;

//--NUMBERS--
fragment NUM: [0-9]+;
CONSTINT: [-+]? NUM;

fragment FIXED_POINT: [-+]? NUM '.' NUM;
fragment EXPONENTIAL: [-+]? NUM [eE] [-+]? NUM;
fragment MIXED: FIXED_POINT [eE] [-+]? NUM;
CONSTREAL: (FIXED_POINT | EXPONENTIAL | MIXED);

//--LITERALS--
CONSTLIT: '\'' ('\\\''|~['])+ '\'';

//--COMMENTS--
ONE_LINE_COMMENT : '{' ~('}')* '}' -> skip;
MULTILINE_COMMENT : '(*' .*? '*)' -> skip;


//############################################
//ESPECIFICACION SINTATICA DEL LENGUAJE FUENTE
//############################################

//--PROGRAMA--
prg :
    PROGRAM ID ';' blq[true, 0] '.' {printAtEnd($blq.v);} |
    UNIT ID ';' dcllist[0] '.' {printAtEnd($dcllist.v);};
blq[boolean is_main, int tab] returns [String v] :  dcllist[$tab + (is_main ? 0: 1)] BEGIN sentlist[$tab + 1] END {
    if(is_main){
        $v = $dcllist.v + "void main ( void ) {\n"+ $sentlist.v + "\n}";
    }
    else{
        $v = $dcllist.v + $sentlist.v;
    }
};
dcllist[int tab] returns [String v] :
    {$v="";} |
    dcl[$tab] dcllist[$tab] {$v =$dcl.v + $dcllist.v;} ;
sentlist[int tab] returns [String v] : sent[$tab] sentlist_p[$tab] {$v =$sent.v + $sentlist_p.v;};
sentlist_p[int tab] returns [String v]: {$v="";}| sent[$tab] sentlist_p[$tab] {$v =$sent.v + $sentlist_p.v;};

//--DECLARACIONES--
dcl[int tab] returns [String v] :
    defcte {$v= "\t".repeat($tab) + $defcte.v; } |
    defvar[$tab] {$v= $defvar.v; } |
    defproc[$tab] {$v = $defproc.v;} |
    deffun[$tab] {$v= $deffun.v;};

// # constantes #
defcte returns [String v] : CONST ctelist {$v= $ctelist.v; };
ctelist returns [String v] : ID '=' simpvalue ';' ctelist_p {$v = combinator.createConst($ID.text, $simpvalue.v) +  $ctelist_p.v;};
ctelist_p returns [String v] :
    {$v= "";} |
    ID '=' simpvalue ';' ctelist_p{$v = combinator.createConst($ID.text, $simpvalue.v) +  $ctelist_p.v;};
simpvalue returns [String v] :
    CONSTREAL {$v= $CONSTREAL.text;} |
    CONSTINT {$v= $CONSTINT.text;}| CONSTLIT {$v= combinator.createConstLit($CONSTLIT.text);};


// # variables # (fer) --> NS SI ESTA BIEN, REVISAR LA GRAMATICA
defvar[int tabs] returns [String v] : VAR defvarlist[$tabs] ';' {$v= $defvarlist.v;};
defvarlist[int tab] returns [String v] : varlist ':' tbas defvarlist_p[$tab] {$v = combinator.createVarlist($varlist.v, "\t".repeat($tab) + $tbas.v) + $defvarlist_p.v;};
defvarlist_p[int tab] returns [String v]:
    {$v = ";\n";} |
    ';' varlist ':' tbas defvarlist_p[$tab] {$v = ";\n" + combinator.createVarlist($varlist.v, "\t".repeat($tab) + $tbas.v) + $defvarlist_p.v;};
varlist returns[String v] : ID varlist_p {$v= $ID.text + $varlist_p.v;};
varlist_p returns[String v]:
    {$v= "";} |
    ',' ID varlist_p {$v= "," + $ID.text + $varlist_p.v;};

defproc[int tab] returns[String v] :  PROCEDURE ID formal_paramlist ';' blq[false, $tab] ';' {$v= combinator.createFunction($ID.text,$formal_paramlist.v, "void", $blq.v);};
deffun[int tab] returns[String v] : FUNCTION ID formal_paramlist ':' tbas ';' blq[false, $tab] ';'{$v= combinator.createFunction($ID.text,$formal_paramlist.v, $tbas.v, $blq.v);};


// # formal param list #
formal_paramlist returns[String v] :
    {$v= "";} |
    '(' formal_param ')' {$v= "( " + $formal_param.v + " )";};
formal_param returns[String v] :  varlist ':' tbas formal_param_p {$v = combinator.createVarlist($varlist.v, $tbas.v) + $formal_param_p.v;};
formal_param_p returns[String v] :
    {$v= "";} |
    ';' varlist ':' tbas formal_param_p {$v = ", " + combinator.createVarlist($varlist.v, $tbas.v) + $formal_param_p.v;};
tbas returns[String v] :
    'INTEGER'{$v="int";} |
    'REAL'{$v="float";} |
    'integer'{$v="int";} |
    'real'{$v="float";};


//--ZONA DE SENTENCIAS--
sent[int tabs] returns[String v] :
    if_[$tabs] { $v = $if_.v;} |
    while_[$tabs] {$v = $while_.v;} |
    repeat[$tabs] {$v = $repeat.v;} |
    for_[$tabs] {$v = $for_.v;} |
    ID sent_p ';' {$v= "\t".repeat($tabs) + $ID.text + $sent_p.v + ";\n";};

if_[int tabs] returns[String v] : 'if' expcond 'then' blq[false, $tabs] if_p[$tabs] {$v= combinator.createIf($expcond.v, $blq.v, $tabs) + $if_p.v;};
if_p[int tabs] returns[String v]:  {$v= "";}| 'else' blq[false, $tabs] {$v= combinator.createElse($blq.v, $tabs);};
while_[int tabs] returns[String v]: 'while' expcond 'do' blq[false, $tabs]{$v= combinator.createWhile($expcond.v, $blq.v, $tabs);};
repeat[int tabs] returns[String v]: 'repeat' blq[false, $tabs] 'until' expcond ';'{$v = combinator.createDo($blq.v, $expcond.v, $tabs);};
for_[int tabs] returns[String v]: 'for' ID ':=' e1=exp inc e2=exp 'do' blq[false, $tabs] {$v = combinator.createFor($ID.text, $e1.v, $inc.v, $e2.v, $blq.v, $tabs);};
sent_p returns[String v]:
    subparamlist {$v= $subparamlist.v;} |
    ':=' exp  {$v= "=" + $exp.v;}; //Incluye el proc_call y el asig, para evitar no determinismo

inc returns[String v]: 'to'{$v = "<";} | 'downto'{$v = ">";};

exp returns[String v] : factor exp_p {$v= $factor.v + $exp_p.v;};
exp_p returns[String v]:
    {$v= "";} |
    op factor exp_p {$v= $op.v + $factor.v;};
op returns [String v] :
    oparit{$v= $oparit.v;} |
    oplog{$v= $oplog.v;} |
    opcomp{$v= $opcomp.v;};

oparit returns [String v] :  '+' {$v= "+";}| '-'{$v= "-";} | '*' {$v= "*";} | 'mod'{$v= "%";} | 'MOD'{$v= "%";} | 'div'{$v= "/";} | 'DIV'{$v= "/";};
oplog returns [String v] :
    'or'{$v= "||";} |
    'and'{$v= "&&";};


opcomp returns[String v]: '<'{$v= "<";} | '>' {$v= ">";}| '<=' {$v= "<=";}| '>=' {$v= ">=";}| '=' {$v= "==";};
factor returns[String v]:
    simpvalue {$v= $simpvalue.v;} |
    '(' exp ')'{$v= "( " + $exp.v + " )";} |
    ID subparamlist {$v= $ID.text + $subparamlist.v;};
subparamlist returns[String v]:
    {$v= "";} |
    '(' explist ')' {$v= "( " + $explist.v + " )";};
explist returns[String v]: exp explist_p {$v= $exp.v + $explist_p.v;};
explist_p returns[String v]:
    {$v= "";} |
    ',' exp explist_p  {$v= ", " + $exp.v + $explist_p.v;};
expcond returns[String v] : factorcond expcond_p {$v= $factorcond.v + $expcond_p.v;};
expcond_p returns[String v] :
    {$v= "";} |
    oplog factorcond expcond_p {$v= $oplog.v + $factorcond.v + $expcond_p.v;};
factorcond returns[String v] :
    exp opcomp exp {$v= $exp.v + $opcomp.v + $exp.v;} |
    '(' exp ')' {$v= "( " + $exp.v + " )";} |
    'not' factorcond {$v= "!" + $factorcond.v;};