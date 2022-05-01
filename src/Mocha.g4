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
variable_declaration : data_type identifier_list ;
identifier_list : IDENTIFIER (OP_ASSIGN literal)? (',' identifier_list)? ;

/* ASSIGNMENT STATEMENT DEFINITION */
assignment_statement : IDENTIFIER OP_ASSIGN expression;

/* EXPRESSION DEFINITION */
expression
    : logical_expression
    | arithmetic_expression
    | relational_expression
    | ternary_expression ;

arithmetic_expression :
        expression_term
        | '(' arithmetic_expression ')'
        | arithmetic_expression(OP_MUL | OP_DIV) arithmetic_expression
        | arithmetic_expression(OP_ADD | OP_SUB) arithmetic_expression
        ;

/* RELATIONAL EXPRESSION DEFINITION */
relational_expression : expression_term (OP_EQUALS | OP_SMALLER | OP_GREATER | OP_SMALLER_EQUALS | OP_GREATER_EQUALS) expression_term ;

/* LOGICAL EXPRESSION DEFINITION */
logical_expression
    : expression_term (OP_LOGICAL_AND | OP_LOGICAL_OR) expression_term
    | OP_LOGICAL_NOT expression_term ;

/* TERNARY EXPRESSION DEFINITION */
ternary_expression : relational_expression OP_TERNARY_TRUE expression OP_TERNARY_FALSE expression ;

expression_term : IDENTIFIER | literal ;

if_else_statement : 'if' if_condition '{' body '}' ('else' '{' body '}')? ;
if_condition: relational_expression | logical_expression ;

for_statement : 'for' for_expression '{' body '}' ;
for_expression : IDENTIFIER OP_ASSIGN INTEGER_LITERAL 'to' INTEGER_LITERAL ;

while_statement: 'while' while_condition '{' body '}' ;
while_condition: relational_expression | logical_expression ;

for_in_range_statement: 'for' IDENTIFIER 'in' range '{' body '}' ;
range : INTEGER_LITERAL ',' INTEGER_LITERAL ;

print_statement: 'print' print_argument_list ;
print_argument_list
    : literal (',' print_argument_list)?
    | IDENTIFIER (',' print_argument_list)? ;

literal : INTEGER_LITERAL | FLOATING_POINT_LITERAL | BOOLEAN_LITERAL | STRING_LITERAL ;
/* DATA TYPE DEFINITIONS */
data_type : DATA_TYPE_INT | DATA_TYPE_FLOAT | DATA_TYPE_BOOLEAN | DATA_TYPE_STRING;

DATA_TYPE_INT       : 'int';
DATA_TYPE_FLOAT     : 'float';
DATA_TYPE_BOOLEAN   : 'boolean';
DATA_TYPE_STRING    : 'string';



/* LITERAL DEFINITION */

INTEGER_LITERAL : [+-]? [0-9] | [+-]? [1-9][0-9]+ ;
FLOATING_POINT_LITERAL : INTEGER_LITERAL '.' [0-9]+ ;
BOOLEAN_LITERAL : BOOLEAN_TRUE | BOOLEAN_FALSE ;
STRING_LITERAL : '"' .*? '"' ;
//LITERAL : INTEGER_LITERAL | FLOATING_POINT_LITERAL | BOOLEAN_LITERAL | STRING_LITERAL ;


BOOLEAN_TRUE : 'true' ;
BOOLEAN_FALSE : 'false' ;

WHITESPACE : [ \t\r\n]+ -> skip ;

/* ASSIGNMENT OPERATOR DEFINITION */
OP_ASSIGN : '=';

/* ARITHMETIC OPERATOR DEFINTIONS */
//OP_SET_ARITHMETIC : OP_ADD | OP_SUB | OP_MUL | OP_DIV;
OP_ADD : '+';
OP_SUB : '-';
OP_MUL : '*';
OP_DIV : '/';

/* RELATIONAL OPERATOR DEFINITIONS */
//OP_SET_RELATIONAL : OP_EQUALS | OP_SMALLER | OP_GREATER | OP_SMALLER_EQUALS | OP_GREATER_EQUALS;
OP_EQUALS : '==';
OP_SMALLER : '<';
OP_GREATER : '>';
OP_SMALLER_EQUALS : '<=';
OP_GREATER_EQUALS : '>=';

/* LOGICAL OPERATOR DEFINITIONS */
OP_LOGICAL_AND : '&&';
OP_LOGICAL_OR  : '||';
OP_LOGICAL_NOT : '!';

/* TERNARY OPERATOR DEFINITIONS */
OP_TERNARY_TRUE  : '?' ;
OP_TERNARY_FALSE : ':' ;
/* IDENTIFIER DEFINITION */
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;