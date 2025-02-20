grammar transpiler;


fragment IDENTIFIER_START: [a-zA-Z];
fragment IDENTIFIER_PART: [a-zA-Z_0-9];


// KEYWORDS
FUNCTION: 'FUNCTION' | 'function';
BEGIN: 'BEGIN' | 'begin';
END: 'END' | 'end';
PROCEDURE: 'PROCEDURE' | 'procedure';
VAR: 'VAR' | 'var';
PROGRAM: 'PROGRAM' | 'program';
USES: 'USES' | 'uses';

// TYPES
CONST: 'CONST' | 'const' ;
INT: 'INTEGER' | 'integer';
FLOAT: 'REAL' | 'real';
CONSTINT: 'CONSTINT' | 'constint';
CONSTFLOAT: 'CONSTREAL' | 'constreal';

// CHARACTERS

DOT: '.';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
SEMICOLON: ';';
COLON: ':';
COMMA: ',';
WALRUS: ':='; // ASSIGN
PLUS: '+';
MINUS: '-';
TIMES: '*';
SLASH: '/';
AT: '@';
HASH: '#';
CARET: '^';
MOD: 'mod';
DIV: 'div';
EQUAL: '=';
NOT_EQUAL: '<>';
LESS_THAN: '<';
GREATER_THAN: '>';
LESS_OR_EQUAL: '<=';
GREATER_OR_EQUAL: '>=';
AND: 'and';
OR: 'or';
NOT: 'not';
IN: 'in';



//############################################
//           REGLAS SINTACTICAS
//############################################

// - LITERALS 
WHITE_SPACE: [ \t\r\n]+ -> skip;

// - ID
ID: IDENTIFIER_START IDENTIFIER_PART*;

// - NUMBERS
fragment NUM: [0-9]+;
INT_NUM: [-+]? NUM;
FLOAT_NUM: [-+]? (NUM ('.' NUM)?) ([eE] [-+]?NUM)?; // TIENE QUE HABER CIFRAS A LA IZQDA DEL PUNTO

fragment WORD:[a-zA-Z]+;
CONSTLIT: '\'' (WORD|'\\\''|~['])+ '\'';
// - STRINGS 
// STRING_LITERAL: '"' ~["]* '"'; // NO SE USAN STRINGS (CREEMOS)

// - COMMENTS 
ONE_LINE_COMMENT : '{' ~('}')* '}' -> skip;
MULTILINE_COMMENT : '(*' .*? '*)' -> skip;



//############################################
//ESPECIFICACION SINTATICA DEL LENGUAJE FUENTE
//############################################

prg : PROGRAM ID SEMICOLON blq DOT libimport*;
libimport: USES ID SEMICOLON;
blq : dcllist BEGIN sentlist END;
dcllist :  | dcllist dcl ;
sentlist : sent | sentlist sent;

// DECLARACIONES
dcl : defcte | defvar | defproc | deffun;
defcte : CONST ctelist;
ctelist : ID EQUAL simpvalue SEMICOLON | ctelist ID EQUAL simpvalue SEMICOLON;
simpvalue : FLOAT_NUM | INT_NUM | CONSTLIT;
defvar : VAR defvarlist SEMICOLON;
defvarlist : varlist COLON tbas | defvarlist SEMICOLON varlist COLON tbas;
varlist : ID | ID COMMA varlist;
defproc :  PROCEDURE ID formal_paramlist SEMICOLON blq SEMICOLON;
deffun : FUNCTION ID formal_paramlist COLON tbas SEMICOLON blq SEMICOLON;
formal_paramlist :  | OPEN_PAREN formal_param CLOSE_PAREN;
formal_param :  varlist COLON tbas | varlist COLON tbas SEMICOLON formal_param;
tbas :  INT | FLOAT;

//ZONA DE SENTENCIAS
sent :  asig SEMICOLON | proc_call SEMICOLON;
asig :  ID WALRUS exp;
exp :  exp op exp | factor;
op :  oparit;
oparit :  PLUS | MINUS | TIMES | DIV | MOD;
factor :  simpvalue | OPEN_PAREN exp CLOSE_PAREN | ID subparamlist;
subparamlist :    | OPEN_PAREN explist CLOSE_PAREN;
explist :  exp | exp COMMA explist;
proc_call :  ID subparamlist;