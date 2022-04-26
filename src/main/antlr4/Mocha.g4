grammar Mocha;

program : 'begin' body 'end' ;
body : statement* ;
statement
    : variable_declaration
    | assignment_statement
    | if_else_statement
    | for_statement
    | while_statement
    | for_in_range_statement
    | print_statement ;

/* VARIABLE DECLARATION DEFINITION */
variable_declaration : DATA_TYPE identifier_list ;
identifier_list : IDENTIFIER (OP_ASSIGN LITERAL)? (',' identifier_list)? ;

/* ASSIGNMENT STATEMENT DEFINITION */
assignment_statement : IDENTIFIER OP_ASSIGN expression ;

/* EXPRESSION DEFINITION */
expression
    : arithmetic_expression
    | relational_expression
    | logical_expression
    | ternary_expression
    | expression_term ;

/* ARITHMETIC EXPRESSION DEFINITION */
arithmetic_expression : arithmetic_expression_term arithmetic_expression_1;
arithmetic_expression_1
                    : (OP_ADD arithmetic_expression_term arithmetic_expression_1
                    | OP_SUB arithmetic_expression_term arithmetic_expression_1)? ;
arithmetic_expression_term : expression_term arithmetic_expression_term_1 ;
arithmetic_expression_term_1
                    : (OP_MUL expression_term arithmetic_expression_term_1
                    | OP_DIV expression_term arithmetic_expression_term_1 )? ;

/* RELATIONAL EXPRESSION DEFINITION */
relational_expression : expression_term OP_SET_RELATIONAL expression_term ;

/* LOGICAL EXPRESSION DEFINITION */
logical_expression
    : expression_term OP_SET_LOGICAL_BIN expression_term
    | OP_SET_LOGICAL_uni expression_term ;

/* TERNARY EXPRESSION DEFINITION */
ternary_expression : relational_expression OP_TERNARY_TRUE expression OP_TERNARY_FALSE expression ;

expression_term : IDENTIFIER | LITERAL ;

if_else_statement : 'if' if_condition '{' statement '}' ('else' '{' statement '}')? ;
if_condition: relational_expression | logical_expression ;

for_statement : 'for' for_expression '{' statement '}' ;
for_expression : IDENTIFIER OP_ASSIGN INTEGER_LITERAL 'to' INTEGER_LITERAL ;

while_statement: 'while' while_condition '{' statement '}' ;
while_condition: relational_expression | logical_expression ;

for_in_range_statement: 'for' IDENTIFIER 'in' range '{' statement '}' ;
range : INTEGER_LITERAL ',' INTEGER_LITERAL ;

print_statement: 'print' print_argument_list ;
print_argument_list
    : LITERAL (',' print_argument_list)?
    | IDENTIFIER (',' print_argument_list)? ;

/* DATA TYPE DEFINITIONS */
DATA_TYPE : DATA_TYPE_INT | DATA_TYPE_FLOAT | DATA_TYPE_BOOLEAN | DATA_TYPE_STRING;
DATA_TYPE_INT       : 'int';
DATA_TYPE_FLOAT     : 'float';
DATA_TYPE_BOOLEAN   : 'boolean';
DATA_TYPE_STRING    : 'string';

/* IDENTIFIER DEFINITION */
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;

/* LITERAL DEFINITION */
LITERAL : INTEGER_LITERAL | FLOATING_POINT_LITERAL | BOOLEAN_LITERAL | STRING_LITERAL ;
INTEGER_LITERAL : [+-]? [0-9] | [+-]? [1-9][0-9]+ ;
FLOATING_POINT_LITERAL : INTEGER_LITERAL '.' [0-9]+ ;
BOOLEAN_LITERAL : BOOLEAN_TRUE | BOOLEAN_FALSE ;
STRING_LITERAL : '"' .*? '"' ;

BOOLEAN_TRUE : 'true' ;
BOOLEAN_FALSE : 'false' ;

WHITESPACE : [ \t\r\n]+ -> skip ;

/* ASSIGNMENT OPERATOR DEFINITION */
OP_ASSIGN : '=';

/* ARITHMETIC OPERATOR DEFINTIONS */
OP_SET_ARITHMETIC : OP_ADD | OP_SUB | OP_MUL | OP_DIV;
OP_ADD : '+';
OP_SUB : '-';
OP_MUL : '*';
OP_DIV : '/';

/* RELATIONAL OPERATOR DEFINITIONS */
OP_SET_RELATIONAL : OP_EQUALS | OP_SMALLER | OP_GREATER | OP_SMALLER_EQUALS | OP_GREATER_EQUALS;
OP_EQUALS : '==';
OP_SMALLER : '<';
OP_GREATER : '>';
OP_SMALLER_EQUALS : '<=';
OP_GREATER_EQUALS : '>=';

/* LOGICAL OPERATOR DEFINITIONS */
OP_SET_LOGICAL : OP_SET_LOGICAL_UNI | OP_SET_LOGICAL_BIN;
OP_SET_LOGICAL_UNI : OP_LOGICAL_NOT;
OP_SET_LOGICAL_BIN : OP_LOGICAL_AND | OP_LOGICAL_OR;
OP_LOGICAL_AND : 'and';
OP_LOGICAL_OR  : 'or';
OP_LOGICAL_NOT : 'not';

/* TERNARY OPERATOR DEFINITIONS */
OP_TERNARY_TRUE  : '?' ;
OP_TERNARY_FALSE : ':' ;
