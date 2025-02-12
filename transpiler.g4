grammar transpiler;

g: MULTILINE_COMMENT+;

fragment IDENTIFIER_START: [a-zA-Z_];
fragment IDENTIFIER_PART: [a-zA-Z_0-9];


// KEYWORDS

FUNCTION: 'FUNCTION';
BEGIN: 'BEGIN';
END: 'END';

// TYPES

INT: 'INTEGER';
FLOAT: 'REAL';
CONSTINT: 'CONSTINT';
CONSTFLOAT: 'CONSTREAL';

// LITERALS
WHITE_SPACE: [\t\r\n]+ -> skip;

// - NUMBERS

fragment NUM: [0-9]+;
INT_NUM: [-+]? NUM;
FLOAT_NUM: [-+]? (NUM ('.' NUM)?) ([eE] [-+]?NUM)?; // TIENE QUE HABER CIFRAS A LA IZQDA DEL PUNTO

WORD:[a-zA-Z]+;
CONSLIT: '\'' (WORD|'\\\''|~['])+ '\'';
// - STRINGS
// STRING_LITERAL: '"' ~["]* '"'; // NO SE USAN STRINGS (CREEMOS)




ONE_LINE_COMMENT : '{' ~[}\n]* '}';
// fragment FINAL_MULTILINE_COMMENT : '*)';
MULTILINE_COMMENT : '(*' .*? '*)';

ID: IDENTIFIER_START IDENTIFIER_PART*;


T: 'f';
