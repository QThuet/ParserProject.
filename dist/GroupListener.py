# Generated from Group.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GroupParser import GroupParser
else:
    from GroupParser import GroupParser

# This class defines a complete listener for a parse tree produced by GroupParser.
class GroupListener(ParseTreeListener):

    # Enter a parse tree produced by GroupParser#NumberExpr.
    def enterNumberExpr(self, ctx:GroupParser.NumberExprContext):
        pass

    # Exit a parse tree produced by GroupParser#NumberExpr.
    def exitNumberExpr(self, ctx:GroupParser.NumberExprContext):
        pass


    # Enter a parse tree produced by GroupParser#ByeExpr.
    def enterByeExpr(self, ctx:GroupParser.ByeExprContext):
        pass

    # Exit a parse tree produced by GroupParser#ByeExpr.
    def exitByeExpr(self, ctx:GroupParser.ByeExprContext):
        pass


    # Enter a parse tree produced by GroupParser#HelloExpr.
    def enterHelloExpr(self, ctx:GroupParser.HelloExprContext):
        pass

    # Exit a parse tree produced by GroupParser#HelloExpr.
    def exitHelloExpr(self, ctx:GroupParser.HelloExprContext):
        pass


    # Enter a parse tree produced by GroupParser#ParenExpr.
    def enterParenExpr(self, ctx:GroupParser.ParenExprContext):
        pass

    # Exit a parse tree produced by GroupParser#ParenExpr.
    def exitParenExpr(self, ctx:GroupParser.ParenExprContext):
        pass


    # Enter a parse tree produced by GroupParser#InfixExpr.
    def enterInfixExpr(self, ctx:GroupParser.InfixExprContext):
        pass

    # Exit a parse tree produced by GroupParser#InfixExpr.
    def exitInfixExpr(self, ctx:GroupParser.InfixExprContext):
        pass



del GroupParser