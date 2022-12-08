grammar Group;
/*
 * Parser Rules
 */

tokens {INDENT , DEDENT}

python_file:(function_def_expr)*
            (multi_input)*;

multi_input: (single_input | multiLine_input)*;

multiLine_input: if_expr
                | for_expr
                | while_expr;

single_input: assignment_expr '\n'
            | mathmatical_expr '\n'
            | function_call_expr
            |'\n'
            ;

assignment_expr: left=variable_expr op=ASSIGNS right=mathmatical_expr;

mathmatical_expr: left=mathmatical_expr op=(MULTIPLY | DIVIDE | MOD) right=mathmatical_expr  
          | left=mathmatical_expr op=(ADD | MINUS) right=mathmatical_expr   
          | '('mathmatical_expr')'
          | INTEGER 
          | function_call_expr
          | variable_expr;

list_expr: variable_expr '=' '['(variable_expr | INTEGER | STRING | function_call_expr)(','((variable_expr | INTEGER | STRING | function_call_expr)))*']';

variable_expr: ID;


conditional_expr: mathmatical_expr CONDITIONAL mathmatical_expr
                | variable_expr;

star_conditional_expr:(NOT)? conditional_expr ( (AND|OR) (NOT)? conditional_expr )*;

if_expr     :'if''(' star_conditional_expr ')'':' 
            (INDENT multi_input DEDENT)
            ('elif''(' star_conditional_expr ')'':'
            INDENT multi_input DEDENT)*
            ('else'':'
            INDENT multi_input DEDENT)?;

for_expr:   'for' variable_expr 'in' list_expr':'
            (INDENT multi_input DEDENT);

while_expr: 'while' star_conditional_expr ':'
            (INDENT multi_input DEDENT);

function_def_expr: 'def' variable_expr '('((assignment_expr)(', 'assignment_expr)*)?')' ':'
                   (INDENT multi_input DEDENT);

function_call_expr: variable_expr '('((assignment_expr)(', 'assignment_expr)*)?')' ;

/*
 * Lexer Rules
 * Character interpreter and tokenizer
 */

ID         : ID_START ID_CONTINUE* ;
INTEGER    : NON_ZERO_DIGIT DIGIT* 
           | '0'
           ;
STRING      : '"' ( [a-z] | [A-Z] | SPACES | '\n' )* '"';

BOOL       : TRUE|FALSE;

ASSIGN     : '=';
ADD        : '+';
MINUS      : '-';
MULTIPLY   : '*';
DIVIDE     : '/';
MOD        : '%';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
LESS       : '<';
GREATER    : '>';
EQLESS     : '<=';
EQGREATER  : '>=';
NOTEQ      : '!=';
EQ         : '==';
AND        : 'and';
OR         : 'or';
NOT        : 'not';
TRUE       : 'True';
FALSE      : 'False';

BREAK      :'break';
CONTINUE   :'continue';

LOOPCONTROL : BREAK | CONTINUE;

ASSIGNS    : ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN ;
CONDITIONAL: LESS | GREATER | EQLESS | EQGREATER | EQ | NOTEQ;

COMMENTS : '#' ~ '\n' | '"""' [ ~|'\n']* '"""' -> skip;

WHITESPACE : SPACES -> skip;

/*
 * Fragments
 * Base Characters to be used in lexer rules
 */

fragment NON_ZERO_DIGIT
    : [1-9]
    ;

fragment DIGIT
    : [0-9]
    ;

fragment SPACES
    : [ \t\r]+
    ;

fragment ID_START
    : [A-Z]
    | [a-z]
    | '_'
    ;

fragment ID_CONTINUE
    : ID_START
    | [A-Z]
    | [a-z]
    | '_'
    | [0-9]
    ;