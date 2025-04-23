grammar transpiler;

@parser :: members{
    private Combinator combinator = new Combinator();

    public void printAtEnd(){
        System.out.println(combinator.toString());
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
prg : PROGRAM ID ';' blq '.' {combinator.addToCombinator($ID.text + $blq.v); printAtEnd();} | UNIT ID ';' dcllist '.' {combinator.addToCombinator($ID.text + $dcllist.v); printAtEnd();};
blq returns [String v] : dcllist BEGIN sentlist END {$v ="blq";};
dcllist returns [String v] :  | dcl dcllist ;
sentlist returns [String v] : sent sentlist_p;
sentlist_p : | sent sentlist_p;

//--DECLARACIONES--
dcl : defcte | defvar | defproc | deffun;
defcte returns [String v] : CONST ctelist {$v= $ctelist.v; System.out.print($ctelist.v);};
ctelist returns [String v] : ID '=' simpvalue ';' ctelist_p {$v = combinator.createConst($ID.text, $simpvalue.v) +  $ctelist_p.v;};
ctelist_p returns [String v] : {$v= "";} | ID '=' simpvalue ';' ctelist_p{$v = combinator.createConst($ID.text, $simpvalue.v) +  $ctelist_p.v;};
simpvalue returns [String v] : CONSTREAL {$v= $CONSTREAL.text;} | CONSTINT {$v= $CONSTINT.text;}| CONSTLIT {$v= $CONSTLIT.text;};
defvar : VAR defvarlist ';';


defvarlist : varlist ':' tbas defvarlist_p;
defvarlist_p :  | ';' varlist ':' tbas defvarlist_p;
varlist returns[String v] : ID varlist_p {$v= $ID.text + $varlist_p.v;};
varlist_p returns[String v]: {$v= "";} | ',' ID varlist_p {$v= "," + $ID.text + $varlist_p.v;};
defproc :  PROCEDURE ID formal_paramlist ';' blq ';';
deffun returns[String v] : FUNCTION ID formal_paramlist ':' tbas ';' blq ';'{$v= combinator.createFunction($ID.text,$formal_paramlist.text, $tbas.v, $blq.v);};
formal_paramlist returns [String v]: {$v="";} | '(' formal_param ')' {$v= "(" + $formal_param.v + ")";};
formal_param returns [String v] :  varlist ':' tbas formal_param_p {$v= $tbas.v + $varlist.v + ";\n" + $formal_param_p.v;};
formal_param_p returns [String v] : {$v="";} | ';' varlist ':' tbas formal_param_p {$v= $tbas.v + $varlist.v + ";\n" + $formal_param_p.v;};
tbas returns[String v] : 'INTEGER'{$v="int";} | 'REAL'{$v="float";}|'integer'{$v="int";} | 'real'{$v="float";};


//--ZONA DE SENTENCIAS--
sent: if | while | repeat | for |ID sent_p ';';
if: 'if' expcond 'then' blq if_p;
if_p :  | 'else' blq;
while : 'while' expcond 'do' blq;
repeat : 'repeat' blq 'until' expcond ';';
for : 'for' ID ':=' exp INC exp 'do' blq;
sent_p : subparamlist | ':=' exp; //Incluye el proc_call y el asig, para evitar no determinismo

exp : factor exp_p;
exp_p :  | op factor exp_p;
op returns [String v] :  OPARIT{$v= $OPARIT.text;} | OPLOG{$v= $OPLOG.text;} | OPCOMP{$v= $OPCOMP.text;};
factor :  simpvalue | '(' exp ')' | ID subparamlist;
subparamlist :    | '(' explist ')';
explist :  exp explist_p;
explist_p :  | ',' exp explist_p;
expcond : factorcond expcond_p;
expcond_p :  | OPLOG factorcond expcond_p;
factorcond: exp OPCOMP exp | '(' exp ')' | 'not' factorcond;
