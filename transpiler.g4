grammar transpiler;

/*
options {
    caseInsensitive = true;
} */


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
TBAS :  'INTEGER' | 'REAL' | 'BOOLEAN' | 'CHAR' | 'STRING' |
        'integer' | 'real' | 'boolean' | 'char' | 'string';
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
prg : PROGRAM ID ';' blq '.' | UNIT ID ';' dcllist '.' ;
blq : dcllist BEGIN sentlist END;
dcllist :  | dcl dcllist ;
sentlist : sent sentlist_p;
sentlist_p : | sent sentlist_p;

//--DECLARACIONES--
dcl : defcte | defvar | defproc | deffun;
defcte : CONST ctelist;
ctelist : ID '=' simpvalue ';' ctelist_p;
ctelist_p :  | ID '=' simpvalue ';' ctelist_p;
simpvalue : CONSTREAL | CONSTINT | CONSTLIT;
defvar : VAR defvarlist ';';
/*
defvarlist ::= varlist ":" TBAS | defvarlist ";" varlist ":" TBAS
*/
defvarlist : varlist ':' TBAS defvarlist_p;
defvarlist_p :  | ';' varlist ':' TBAS defvarlist_p;
varlist : ID varlist_p;
varlist_p :  | ',' ID varlist_p;
defproc :  PROCEDURE ID formal_paramlist ';' blq ';';
deffun : FUNCTION ID formal_paramlist ':' TBAS ';' blq ';';
formal_paramlist :  | '(' formal_param ')';
formal_param :  varlist ':' TBAS formal_param_p;
formal_param_p :  | ';' varlist ':' TBAS formal_param_p;


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
op :  OPARIT | OPLOG | OPCOMP;
factor :  simpvalue | '(' exp ')' | ID subparamlist;
subparamlist :    | '(' explist ')';
explist :  exp explist_p;
explist_p :  | ',' exp explist_p;
expcond : factorcond expcond_p;
expcond_p :  | OPLOG factorcond expcond_p;
factorcond: exp OPCOMP exp | '(' exp ')' | 'not' factorcond;
