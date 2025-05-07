grammar transpiler;

@parser :: members{
    private Combinator combinator = new Combinator();

    public void printAtEnd(){
        //System.out.println(combinator.toString());
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

OPARIT :  '+' | '-' | '*' | '/' | 'mod' | 'div' | 'MOD' | 'DIV';
OPCOMP : '<' | '>' | '<=' | '>=' | '=';

//--PARTE OPCIONAL--
INC : 'to' | 'downto';
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
    PROGRAM ID ';' blq[true, 0] '.' {System.out.println($blq.v);} |
    UNIT ID ';' dcllist[0] '.' {System.out.println($dcllist.v);};
blq[boolean is_main, int tab] returns [String v] : dcllist[$tab] BEGIN sentlist[$tab + 1] END {
    if(is_main){
        $v = $dcllist.v + "void main ( void )\n{\n"+ $sentlist.v + "\n}";
    }
    else{
        $v = $dcllist.v + $sentlist.v;
    }
};
dcllist[int tab] returns [String v] :
    {$v="";} |
    dcl[$tab] dcllist[$tab] {$v =$dcl.v + $dcllist.v;} ;
sentlist[int tab] returns [String v] : sent[$tab] sentlist_p[$tab] {$v =$sent.v + $sentlist_p.v;};
sentlist_p[int tab] returns [String v]: {$v="";}| sent[$tab] sentlist_p[tab] {$v =$sent.v + $sentlist_p.v;};

//--DECLARACIONES--
dcl[int tab] returns [String v] :
    defcte {$v= "\t".repeat($tab) + $defcte.v; } |
    defvar {$v= "\t".repeat($tab) + $defvar.v; } |
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
    CONSTINT {$v= $CONSTINT.text;}| CONSTLIT {$v= $CONSTLIT.text;};


// # variables # (fer) --> NS SI ESTA BIEN, REVISAR LA GRAMATICA
defvar returns [String v] : VAR defvarlist ';' {$v= $defvarlist.v;};
defvarlist returns [String v] : varlist ':' tbas defvarlist_p{$v = combinator.createVarlist($varlist.v, $tbas.v) + $defvarlist_p.v;};
defvarlist_p returns [String v]:
    {$v = ";\n";} |
    ';' varlist ':' tbas defvarlist_p {$v = ";\n" + combinator.createVarlist($varlist.v, $tbas.v) + $defvarlist_p.v;};
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
    if_ {$v = "\t".repeat($tabs) + $if_.v;} |
    while {$v= "\t".repeat($tabs) + "while";} |
    repeat {$v="\t".repeat($tabs) + "repeat";} |
    for {$v="\t".repeat($tabs) + "for";} |
    ID sent_p ';' {$v= "\t".repeat($tabs) + $ID.text + $sent_p.v + ";\n";};
if_ returns[String v] : 'if' expcond 'then' blq[false, 0] if_p {$v= combinator.createIf($expcond.v, $blq.v) + $if_p.v;};
if_p returns[String v]:  {$v= "";}| 'else' blq[false, 0] {$v= combinator.createElse($blq.v);};
while : 'while' expcond 'do' blq[false, 0];
repeat : 'repeat' blq[false, 0] 'until' expcond ';';
for : 'for' ID ':=' exp INC exp 'do' blq[false, 0];
sent_p returns[String v]:
    subparamlist {$v= $subparamlist.v;} |
    ':=' exp  {$v= "=" + $exp.v;}; //Incluye el proc_call y el asig, para evitar no determinismo


exp returns[String v] : factor exp_p {$v= $factor.v + $exp_p.v;};
exp_p returns[String v]:
    {$v= "";} |
    op factor exp_p {$v= $op.v + $factor.v;};
op returns [String v] :
    OPARIT{$v= $OPARIT.text;} |
    oplog{$v= $oplog.v;} |
    OPCOMP{$v= $OPCOMP.text;};
oplog returns [String v] :
    'or'{$v= "||";} |
    'and'{$v= "&&";};
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
    exp OPCOMP exp {$v= $exp.v + $OPCOMP.text + $exp.v;} |
    '(' exp ')' {$v= "( " + $exp.v + " )";} |
    'not' factorcond {$v= "!" + $factorcond.v;};