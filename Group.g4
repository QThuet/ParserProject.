grammar Group;
expr: left=expr op=('*'|'/'|'%') right=expr    # InfixExpr
    | left=expr op=('+'|'-') right=expr        # InfixExpr
    | atom=INT                                 # NumberExpr
    | '(' expr ')'                             # ParenExpr 
    | atom=BYE                                 # ByeExpr
    ;

BYE  : ('bye'| 'exit') ;
INT  : [0-9]+;
WS   : [ \t\r]+ -> skip ;