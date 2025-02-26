grammar transpiler;


fragment IDENTIFIER_START: [a-zA-Z];
fragment IDENTIFIER_PART: [a-zA-Z_0-9];




//############################################
//           REGLAS SINTACTICAS
//############################################

//--LITERALS--
WHITE_SPACE: [ \t\r\n]+ -> skip;

//--ID--
ID: IDENTIFIER_START IDENTIFIER_PART*;

//--NUMBERS--
fragment NUM: [0-9]+;
INT_NUM: [-+]? NUM;
FLOAT_NUM: [-+]? (NUM ('.' NUM)?) ([eE] [-+]?NUM)?; // TIENE QUE HABER CIFRAS A LA IZQDA DEL PUNTO

fragment WORD:[a-zA-Z]+;
CONSTLIT: '\'' (WORD|'\\\''|~['])+ '\'';
//--STRINGS--
// STRING_LITERAL: '"' ~["]* '"'; // NO SE USAN STRINGS (CREEMOS)

//--COMMENTS--
ONE_LINE_COMMENT : '{' ~('}')* '}' -> skip;
MULTILINE_COMMENT : '(*' .*? '*)' -> skip;



//############################################
//ESPECIFICACION SINTATICA DEL LENGUAJE FUENTE
//############################################

//--PROGRAMA--
prg : 'PROGRAM' | 'program' ID ';' blq '.' libimport*;
libimport: 'USES' | ID ';';
blq : dcllist ('BEGIN' | 'begin') sentlist ('END' | 'end');
dcllist :  | dcllist dcl ;
sentlist : sent sentlist_p;
sentlist_p : | sent sentlist_p;

//--DECLARACIONES--
dcl : defcte | defvar | defproc | deffun;
defcte : 'CONST' | 'const' ctelist;
ctelist : ID '=' simpvalue ';' |  ID '=' simpvalue ';' ctelist_p;
ctelist_p :  | ID '=' simpvalue ';' ctelist_p;
simpvalue : FLOAT_NUM | INT_NUM | CONSTLIT;
defvar : ('VAR' | 'VAR') defvarlist ';';
defvarlist : varlist '.' tbas | ';' varlist '.' tbas defvarlist_p;
defvarlist_p :  | ';' varlist '.' tbas defvarlist_p;
varlist : ID | ID ',' varlist;
defproc :  ('PROCEDURE' | 'procedure') ID formal_paramlist ';' blq ';';
deffun : ('FUNCTION' | 'function') ID formal_paramlist ':' tbas ';' blq ';';
formal_paramlist :  | '(' formal_param ')';
formal_param :  varlist ':' tbas | varlist ':' tbas ';' formal_param;
tbas :  'INTEGER' | 'REAL' | 'BOOLEAN' | 'CHAR' | 'STRING' |
        'integer' | 'real' | 'boolean' | 'char' | 'string';

//--ZONA DE SENTENCIAS--
sent :  asig ';' | proc_call ';';
asig :  ID ':=' exp;
exp : factor exp_p;
exp_p : op exp exp_p | ;
op :  oparit;
oparit :  '+' | '-' | '*' | '/' | 'mod' | 'div' | 'MOD' | 'DIV';
factor :  simpvalue | '(' exp ')' | ID subparamlist;
subparamlist :    | '(' explist ')';
explist :  exp | exp ',' explist;
proc_call :  ID subparamlist;
