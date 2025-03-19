grammar transpiler;

/*
options {
    caseInsensitive = true;
} */


//############################################
//           REGLAS SINTACTICAS
//############################################

fragment IDENTIFIER_START: [a-zA-Z];
fragment IDENTIFIER_PART: [a-zA-Z_0-9];

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
prg : ('PROGRAM' | 'program') ID ';' blq '.';
blq : dcllist ('BEGIN' | 'begin') sentlist ('END' | 'end');
dcllist :  | dcl dcllist ;
sentlist : sent sentlist_p;
sentlist_p : | sent sentlist_p;

//--DECLARACIONES--
dcl : defcte | defvar | defproc | deffun;
defcte : ('CONST' | 'const') ctelist;
ctelist : ID '=' simpvalue ';' ctelist_p;
ctelist_p :  | ID '=' simpvalue ';' ctelist_p;
simpvalue : FLOAT_NUM | INT_NUM | CONSTLIT;
defvar : ('VAR' | 'var') defvarlist ';';
defvarlist : varlist '.' tbas defvarlist_p;
defvarlist_p :  | ';' varlist '.' tbas defvarlist_p;
varlist : ID varlist_p;
varlist_p :  | ',' ID varlist_p;
defproc :  ('PROCEDURE' | 'procedure') ID formal_paramlist ';' blq ';';
deffun : ('FUNCTION' | 'function') ID formal_paramlist ':' tbas ';' blq ';';
formal_paramlist :  | '(' formal_param ')';
formal_param :  varlist ':' tbas formal_param_p;
formal_param_p :  | ';' varlist ':' tbas formal_param_p;
tbas :  'INTEGER' | 'REAL' | 'BOOLEAN' | 'CHAR' | 'STRING' |
        'integer' | 'real' | 'boolean' | 'char' | 'string';

//--ZONA DE SENTENCIAS--

//Tengo que mirarlo: original ->
//sent ::= asig ";" | proc_call ";"
//asig ::= ID ":=" exp
//exp ::= exp op exp | factor
sent : ID sent_p ';';
sent_p : subparamlist | ':=' exp;
exp   : factor exp_p;
exp_p :  | op factor exp_p;
op :  oparit; //esto es absurdo, no se quita por la parte opcional, será necesario porque hay más tipos de 'op'
oparit :  '+' | '-' | '*' | '/' | 'mod' | 'div' | 'MOD' | 'DIV';
factor :  simpvalue | '(' exp ')' | ID subparamlist;
subparamlist :    | '(' explist ')';
explist :  exp explist_p;
explist_p :  | ',' exp explist_p;