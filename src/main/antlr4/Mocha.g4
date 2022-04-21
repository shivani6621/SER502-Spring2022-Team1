grammar Mocha;

program : 'begin' body 'end';
body : statement*;
statement
        : variable_declaration
        | assignment_statement
        | if_else_statement
        | for_statement
        | while_statement
        | for_in_range_statement
        | print_statement
        ;

variable_declaration : data_type identifier_list;
data_type : 'int' | 'float' | 'boolean' | 'string';
identifier_list
                : IDENTIFIER
                | IDENTIFIER '=' literal
                | IDENTIFIER ',' identifier_list
                | IDENTIFIER '=' literal ',' identifier_list
                ;

literal : integral_literal | floating_point_literal | boolean_literal /*| string_literal*/;
integral_literal : SIGN? DIGIT | SIGN? NON_ZERO_DIGIT DIGITS;
floating_point_literal : SIGN? integral_literal '.' DIGITS;
/*string_literal : ''; */
boolean_literal : 'true' | 'false';

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
SIGN : [+-];
DIGIT : [0-9];
DIGITS : DIGIT+;
NON_ZERO_DIGIT : [1-9];
WS : [ \t\r\n]+ -> skip ;

assignment_statement : IDENTIFIER '=' literal
                | IDENTIFIER '=' arithmetic_expression;

/*# Grammar rules for assignment statement and expressions
<assignment_statement> → <identifier> = <expression>

<expression> → <arithmetic_expression> |
<relational_expression> |
<logical_expression> |
<ternary_expression> |
<expression_term>

<arithmetic_expression> → <arithmetic_expression_term> <arithmetic_expression_1>
<arithmetic_expression_1> → + <arithmetic_expression_term> <arithmetic_expression_1> |
- <arithmetic_expression_term> <arithmetic_expression_1> |
 ε

<arithmetic_expression_term> → <expression_term> <arithmetic_expression_term_1>
<arithmetic_expression_term_1> → * <expression_term> <arithmetic_expression_term_1> |
/ <expression_term> <arithmetic_expression_term_1> |
ε

<relational_expression> → <expression_term> <relational_operator> <expression_term>
<relational_operator> → c

<logical_expression> → <expression_term> <logical_operator_binary> <expression_term> |
<logical_operator_unary> <expression_term>
<logical_operator_binary> → and | or
<logical_operator_unary> → not

<ternary_expression> → <relational_expression> ? <ternary_result> : <ternary_result>
<ternary_result> → <arithmetic_expression> | <expression_term>

<expression_term> → <identifier> | <literal>*/



/*# Grammar rules for the if-else construct
<if_else_statement> → if <if_condition> \n { \n <statement> \n }
<if_else_statement> → if <if_condition> \n { \n <statement> \n } \n else \n { \n <statement> \n }
<if_condition> → <relational_expression> | <logical_expression>*/

// expression
// left recursion not handled yet
expression : 
        arithmetic_expression
        | relational_expression
        // | logical_expression
        // | ternary_expression
        | expression_term
        ;

arithmetic_expression : 
        arithmetic_expression '+' arithmetic_term
        | arithmetic_expression '-' arithmetic_term
        | arithmetic_term
        ;
arithmetic_term :
        arithmetic_term '*' expression_term
        | arithmetic_term '/' expression_term
        | expression_term
        ;

if_else_statement
                :   'if' '(' if_condition ')' statement ('else' statement)?
                ;

if_condition: relational_expression;

relational_expression: expression_term (('=='|'!='|'<'|'>'|'<='|'>=')) expression_term;

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
Equal : '==';
NotEqual : '!=';

expression_term: IDENTIFIER
               | literal
               | '(' arithmetic_expression ')'
               ;


/*# Grammar rules for the for construct
<for_statement> → for <for_expression> \n { \n <statement> \n }
<for_expression> → <identifier> = <digits> to <digits>*/

for_statement
             : 'for' for_expression '{' statement '}'
             ;

for_expression: IDENTIFIER '=' DIGIT 'to' DIGITS;


/*# Grammar rules for the while construct
<while_statement> → while 	<while_condition> \n { \n <statement> \n }
<while_condition> → <logical_expression> | <relational_expression>*/

while_statement: 'while' while_condition '{' statement '}';
while_condition: relational_expression;

/*# Grammar rules for the for in range construct
<for_in_range_statement> → for <identifier> in <range> \n { \n <statement> \n }
<range> → <digits> , <digits>*/

for_in_range_statement: 'for' IDENTIFIER 'In' range '{' statement '}';

range: DIGITS;

/*# Grammar rules for the print construct
<print_statement> → print <print_argument_list>
<print_argument_list> → <literal> |
<identifier> |
<literal> , <print_argument_list> |
<identifier>, <print_argument_list>*/

print_statement: 'print';



