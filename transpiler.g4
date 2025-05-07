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
OPLOG : 'or' | 'and';
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
prg : PROGRAM ID ';' blq[true] '.' {System.out.println($blq.v);} | UNIT ID ';' dcllist '.' {System.out.println($dcllist.v);};
blq[boolean is_main] returns [String v] : dcllist BEGIN sentlist END {
    if(is_main){
        $v = $dcllist.v + "void main ( void )\n{\n"+ $sentlist.v + "\n}";
    }
    else{
        $v = $dcllist.v + $sentlist.v;
    }
};
dcllist returns [String v] :  {$v="";} | dcl dcllist {$v =$dcl.v + $dcllist.v;} ;
sentlist returns [String v] : sent sentlist_p {$v =$sent.v + $sentlist_p.v;};
sentlist_p returns [String v]: {$v="";}| sent sentlist_p {$v =$sent.v + $sentlist_p.v;};

//--DECLARACIONES--
dcl returns [String v] : defcte {$v= $defcte.v; } | defvar {$v= $defvar.v; }
    | defproc {$v= $defproc.v;} | deffun {$v= $deffun.v;};

// # constantes #
defcte returns [String v] : CONST ctelist {$v= $ctelist.v; };
ctelist returns [String v] : ID '=' simpvalue ';' ctelist_p {$v = combinator.createConst($ID.text, $simpvalue.v) +  $ctelist_p.v;};
ctelist_p returns [String v] : {$v= "";} | ID '=' simpvalue ';' ctelist_p{$v = combinator.createConst($ID.text, $simpvalue.v) +  $ctelist_p.v;};
simpvalue returns [String v] : CONSTREAL {$v= $CONSTREAL.text;} | CONSTINT {$v= $CONSTINT.text;}| CONSTLIT {$v= $CONSTLIT.text;};

// # variables # (fer) --> NS SI ESTA BIEN, REVISAR LA GRAMATICA
defvar returns [String v] : VAR defvarlist ';' {$v= $defvarlist.v;};
defvarlist returns [String v] : varlist ':' tbas defvarlist_p{$v = combinator.createVarlist($varlist.v, $tbas.v) + $defvarlist_p.v;};
defvarlist_p returns [String v]: {$v = ";\n";} | ';' varlist ':' tbas defvarlist_p {$v = ";\n" + combinator.createVarlist($varlist.v, $tbas.v) + $defvarlist_p.v;};
varlist returns[String v] : ID varlist_p {$v= $ID.text + $varlist_p.v;};
varlist_p returns[String v]: {$v= "";} | ',' ID varlist_p {$v= "," + $ID.text + $varlist_p.v;};

defproc returns[String v] :  PROCEDURE ID formal_paramlist ';' blq[false] ';' {$v= combinator.createFunction($ID.text,$formal_paramlist.v, "void", $blq.v);};

deffun returns[String v] : FUNCTION ID formal_paramlist ':' tbas ';' blq[false] ';'{$v= combinator.createFunction($ID.text,$formal_paramlist.v, $tbas.v, $blq.v);};

// # formal param list #
formal_paramlist returns[String v] :  {$v= "";} | '(' formal_param ')' {$v= "( " + $formal_param.v + " )";};
formal_param returns[String v] :  varlist ':' tbas formal_param_p {$v = combinator.createVarlist($varlist.v, $tbas.v) + $formal_param_p.v;};
formal_param_p returns[String v] : {$v= "";} | ';' varlist ':' tbas formal_param_p {$v = ", " + combinator.createVarlist($varlist.v, $tbas.v) + $formal_param_p.v;};

tbas returns[String v] : 'INTEGER'{$v="int";} | 'REAL'{$v="float";}|'integer'{$v="int";} | 'real'{$v="float";};


//--ZONA DE SENTENCIAS--
sent[int tabs] returns[String v] :if_ {$v = "\t".repeat(tabs) + $if_.v;} |
                                    while {$v= "\t".repeat(tabs) + "while";} |
                                    repeat {$v= "repeat";} | for {$v="\t".repeat(tabs) + "for";} |
                                    ID sent_p ';' {$v= "\t".repeat(tabs) + $ID.text + $sent_p.v + ";\n";};

if_ returns[String v] : 'if' expcond 'then' blq[false] if_p {$v= combinator.createIf($expcond.v, $blq.v) + $if_p.v;};
if_p returns[String v]:  {$v= "";}| 'else' blq[false] {$v= combinator.createElse($blq.v);};
while : 'while' expcond 'do' blq[false];
repeat : 'repeat' blq[false] 'until' expcond ';';
for : 'for' ID ':=' exp INC exp 'do' blq[false];
sent_p returns[String v]: subparamlist {$v= $subparamlist.v;}| ':=' exp  {$v= "=" + $exp.v;}; //Incluye el proc_call y el asig, para evitar no determinismo

exp returns[String v] : factor exp_p {$v= $factor.v + $exp_p.v;};
exp_p returns[String v]: {$v= "";}| op factor exp_p {$v= $op.v + $factor.v;};
op returns [String v] :  OPARIT{$v= $OPARIT.text;} | OPLOG{$v= $OPLOG.text;} | OPCOMP{$v= $OPCOMP.text;}; //TODO preguntar acerca de como pasar el OPLOG ya que no vale el .text (or -> ||)

factor returns[String v]:  simpvalue {$v= $simpvalue.v;}| '(' exp ')'{$v= "( " + $exp.v + " )";} | ID subparamlist {$v= $ID.text + $subparamlist.v;};
subparamlist returns[String v]:  {$v= "";} | '(' explist ')' {$v= "( " + $explist.v + " )";};
explist returns[String v]:  exp explist_p {$v= $exp.v + $explist_p.v;};
explist_p returns[String v]:   {$v= "";} | ',' exp explist_p  {$v= ", " + $exp.v + $explist_p.v;};
expcond returns[String v] : factorcond expcond_p {$v= $factorcond.v + $expcond_p.v;};
expcond_p returns[String v] : {$v= "";} | OPLOG factorcond expcond_p {$v= $OPLOG.text + $factorcond.v + $expcond_p.v;};
factorcond returns[String v] : exp OPCOMP exp {$v= $exp.v + $OPCOMP.text + $exp.v;} | '(' exp ')' {$v= "( " + $exp.v + " )";}| 'not' factorcond {$v= "!" + $factorcond.v;};
