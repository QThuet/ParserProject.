grammar Group;
/*
 * Parser Rules
 */

single_input: assignment_expr
            | mathmatical_expr
            ;

//assign_expr: ID ASSIGN arithmetic_expr;
//augment_assign_expr: ID (ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN) arithmetic_expr;

assignment_expr: left=Variable_expr (op=ASSIGNS right=mathmatical_expr)?;

mathmatical_expr: left=mathmatical_expr op=(MULTIPLY | DIVIDE | MOD) right=mathmatical_expr  
          | left=mathmatical_expr op=(ADD | MINUS) right=mathmatical_expr   
          | '('mathmatical_expr')'
          | INTEGER 
          | Variable_expr;

Variable_expr: ID;

/*
 * Lexer Rules
 * Character interpreter and tokenizer
 */

ID         : ID_START ID_CONTINUE* ;
INTEGER    : NON_ZERO_DIGIT DIGIT* 
           | '0'
           ;

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

ASSIGNS    : ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN ;

WHITESPACE : SPACES -> skip ;

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