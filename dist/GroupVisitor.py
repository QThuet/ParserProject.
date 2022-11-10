# Generated from Group.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GroupParser import GroupParser
else:
    from GroupParser import GroupParser

# This class defines a complete generic visitor for a parse tree produced by GroupParser.

class GroupVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GroupParser#NumberExpr.
    def visitNumberExpr(self, ctx:GroupParser.NumberExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GroupParser#ByeExpr.
    def visitByeExpr(self, ctx:GroupParser.ByeExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GroupParser#HelloExpr.
    def visitHelloExpr(self, ctx:GroupParser.HelloExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GroupParser#ParenExpr.
    def visitParenExpr(self, ctx:GroupParser.ParenExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GroupParser#InfixExpr.
    def visitInfixExpr(self, ctx:GroupParser.InfixExprContext):
        return self.visitChildren(ctx)



del GroupParser