grammar Mocha;

/*
# We define our language to have a set of statements between the begin and end keywords (both of them must be on a new line). Every statement must end with a new line character.
<program> → begin \n <statement> \n end
<statement> → <variable_declaration> \n <statement> |
<assignment_statement> \n <statement> |
<if_else_statement> \n <statement> |
<for_statement> \n <statement> |
<while_statement> \n <statement> |
<for_in_range_statement> \n <statement> |
<print_statement> \n <statement> |
ε
*/
program
        : 'begin' '\n' statement '\n' 'end'
        ;

statement
        : variable_declaration '\n' statement
        | assignment_statement '\n' statement
        | if_else_statement '\n' statement
        | for_statement '\n' statement
        | while_statement '\n' statement
        | for_in_range_statement '\n' statement
        | print_statement '\n' statement
        ;


/*# Grammar rules for variable declaration statement
<variable_declaration> → <data_type> <identifier_list>
<identifier_list> → <identifier> |
<identifier> = <literal> |
<identifier> , <identifier_list> |
<identifier> = <literal> , <identifier_list>
<data_type> → int | float | boolean | string*/

variable_declaration
                    : data_type identifier_list;

identifier_list
                : IDENTIFIER
                | IDENTIFIER '=' IDENTIFIER
                | IDENTIFIER ',' identifier_list
                | IDENTIFIER '=' IDENTIFIER ',' identifier_list
                ;

data_type
         : 'int'
         | 'float'
         | 'boolean'
         | 'string'
         ;

/*# For now, since this is the draft version of the document, we are using regex to define the <identifier> rule
<identifier> → [a-zA-Z_][a-zA-Z0-9_]*
<literal> → <integral_literal> |
<floating_point_literal> |
<boolean_literal> |
<string_literal>
<integral_literal> → <digit> |
<non_zero_digit> <digits> |
<sign> <non_zero_digit> <digits>
<floating_point_literal> → <integer_literal> . <digits> |
<sign> <integer_literal> . <digits>
<boolean_literal> → true | false

<string_literal> → “ <string_characters> ”
<string_characters> → <string_character> | <string_character> <string_characters>
<string_character> → <input_character> except “ and \ | <escape_character>*/

fragment
IDENTIFIER
        : [a-zA-Z_][a-zA-Z0-9_]
        ;

literal
        : integral_literal
        | floating_point_literal
        | boolean_literal
        | string_literal
        ;

integral_literal: ' ';

floating_point_literal: ' ';

string_literal: ' ';

boolean_literal: ' ';



/*# For now, since this is the draft version of the document, we are using plain english to define the <input_character> rule
<input_character> → all characters from the utf-8 character set
<escape_character> → \n | \t | \\ | \”

<sign> → + | -
<digits> → <digit> | <digit> <digits>
<digit> → 0 | <non_zero_digit>
<non_zero_digit> → 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9*/

fragment
SIGN
    : [+-]
    ;

digits: ' '
      ;

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
<relational_operator> → == | < | > | <= | >=

<logical_expression> → <expression_term> <logical_operator_binary> <expression_term> |
<logical_operator_unary> <expression_term>
<logical_operator_binary> → and | or
<logical_operator_unary> → not

<ternary_expression> → <relational_expression> ? <ternary_result> : <ternary_result>
<ternary_result> → <arithmetic_expression> | <expression_term>

<expression_term> → <identifier> | <literal>*/

assignment_statement: ' ';

/*# Grammar rules for the if-else construct
<if_else_statement> → if <if_condition> \n { \n <statement> \n }
<if_else_statement> → if <if_condition> \n { \n <statement> \n } \n else \n { \n <statement> \n }
<if_condition> → <relational_expression> | <logical_expression>*/

if_else_statement: ' ';



/*# Grammar rules for the for construct
<for_statement> → for <for_expression> \n { \n <statement> \n }
<for_expression> → <identifier> = <digits> to <digits>*/

for_statement: ' ';


/*# Grammar rules for the while construct
<while_statement> → while 	<while_condition> \n { \n <statement> \n }
<while_condition> → <logical_expression> | <relational_expression>*/

while_statement: ' ';

/*# Grammar rules for the for in range construct
<for_in_range_statement> → for <identifier> in <range> \n { \n <statement> \n }
<range> → <digits> , <digits>*/

for_in_range_statement: ' ';

/*# Grammar rules for the print construct
<print_statement> → print <print_argument_list>
<print_argument_list> → <literal> |
<identifier> |
<literal> , <print_argument_list> |
<identifier>, <print_argument_list>*/

print_statement: ' ';



