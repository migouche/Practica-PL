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

//--PARTE OPCIONAL--
TBAS :  'INTEGER' | 'REAL' | 'BOOLEAN' | 'CHAR' | 'STRING' |
        'integer' | 'real' | 'boolean' | 'char' | 'string';
INC : 'to' | 'downto';





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
prg : PROGRAM ID ';' blq '.';
blq : dcllist BEGIN sentlist END;
dcllist :  | dcl dcllist ;
sentlist : sent_master sentlist_p;
sentlist_p : | sent_master sentlist_p;

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

sent_master: if | while | repeat | for |sent;

sent : ID sent_p ';';
if: 'if' expcond 'then' blq 'else' blq;
while : 'while' expcond 'do' blq;
repeat : 'repeat' blq 'until' expcond ';';
for : 'for' ID ':=' exp INC exp 'do' blq;

sent_p : subparamlist | ':=' exp; //Incluye el proc_call y el asig, para evitar no determinismo

exp : factor exp_p;
exp_p :  | op factor exp_p;
op :  oparit | oplog | opcomp;
oparit :  '+' | '-' | '*' | '/' | 'mod' | 'div' | 'MOD' | 'DIV';
oplog : 'or' | 'and';
opcomp : '<' | '>' | '<=' | '>=' | '=';
factor :  simpvalue | '(' exp ')' | ID subparamlist;
subparamlist :    | '(' explist ')';
explist :  exp explist_p;
explist_p :  | ',' exp explist_p;

expcond : factorcond expcond_p;
expcond_p :  | oplog factorcond expcond_p;
factorcond: exp op exp | '(' exp ')' | 'not' factorcond;

//--SENTENCIAS CONTROL DE FLUJO--

/*
sent ::= ...
| "if" expcond "then" blq "else" blq
| "while" expcond "do" blq
| "repeat" blq "until" expcond ";"
| "for" ID ":=" exp inc exp "do" blq
inc ::= "to" | "downto"
*/





