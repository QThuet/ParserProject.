grammar Group;
/*
 * Parser Rules
 */

tokens {INDENT , DEDENT}

python_file: (function_def_expr | multi_input | NEWLINE) (function_def_expr | multi_input | NEWLINE)*;

multi_input: (single_input | multiLine_input) (single_input | multiLine_input)*;

multiLine_input: if_expr
                | for_expr
                | while_expr;

single_input: assignment_expr  NEWLINE 
            | mathmatical_expr  NEWLINE 
            | function_call_expr
            | NEWLINE 
            ;

assignment_expr: left=variable_expr op=ASSIGNS right=mathmatical_expr;

mathmatical_expr: left=mathmatical_expr op=(MULTIPLY | DIVIDE | MOD) right=mathmatical_expr  
          | left=mathmatical_expr op=(ADD | MINUS) right=mathmatical_expr   
          | OPENPAR mathmatical_expr CLOSEPAR 
          | INTEGER 
          | function_call_expr
          | variable_expr;

list_expr: variable_expr ASSIGN  OPENBRACKET (variable_expr | INTEGER | STRING | function_call_expr)( COMMA ((variable_expr | INTEGER | STRING | function_call_expr)))* CLOSEBRACKET ;

variable_expr: ID;


conditional_expr: mathmatical_expr CONDITIONAL mathmatical_expr
                | variable_expr;

star_conditional_expr:(NOT)? conditional_expr ( (AND|OR) (NOT)? conditional_expr )*;

if_expr     :IF OPENPAR star_conditional_expr CLOSEPAR  COLON  
            (INDENT multi_input DEDENT)
            ( ELIF OPENPAR star_conditional_expr CLOSEPAR  COLON 
            INDENT multi_input DEDENT)*
            ( ELSE  COLON 
            INDENT multi_input DEDENT)?;

for_expr:   FOR variable_expr IN list_expr COLON 
            (INDENT multi_input DEDENT);

while_expr: WHILE star_conditional_expr  COLON 
            (INDENT multi_input DEDENT);

function_def_expr: DEF variable_expr OPENPAR((assignment_expr)(COMMA assignment_expr)*)? CLOSEPAR   COLON 
                   (INDENT multi_input DEDENT);

function_call_expr: variable_expr OPENPAR((assignment_expr)(COMMA assignment_expr)*)? CLOSEPAR;

/*
 * Lexer Rules
 * Character interpreter and tokenizer
 */

ID         : ID_START ID_CONTINUE* ;
INTEGER    : NON_ZERO_DIGIT DIGIT* 
           | '0'
           ;
STRING      : '"' ( [a-z] | [A-Z] | SPACES |  NEWLINE  )* '"';

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
OPENPAR    : '(';
CLOSEPAR    : ')';
COLON       : ':';
ELSE        : 'else';
IF          : 'if';
ELIF        : 'elif';
OPENBRACKET : '[';
CLOSEBRACKET : ']';
BREAK      :'break';
CONTINUE   :'continue';
NEWLINE     : '\n';
COMMA       : ',';
FOR         : 'for';
IN          : 'in';
WHILE       : 'while';
DEF         : 'def';

LOOPCONTROL : BREAK | CONTINUE;

ASSIGNS    : ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN ;
CONDITIONAL: LESS | GREATER | EQLESS | EQGREATER | EQ | NOTEQ;

COMMENTS : ('#' .  NEWLINE | '"""' ( . | NEWLINE)*? '"""') -> skip;

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