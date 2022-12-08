# Generated from Group.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GroupParser import GroupParser
else:
    from GroupParser import GroupParser

# This class defines a complete listener for a parse tree produced by GroupParser.
class GroupListener(ParseTreeListener):

    # Enter a parse tree produced by GroupParser#python_file.
    def enterPython_file(self, ctx:GroupParser.Python_fileContext):
        pass

    # Exit a parse tree produced by GroupParser#python_file.
    def exitPython_file(self, ctx:GroupParser.Python_fileContext):
        pass


    # Enter a parse tree produced by GroupParser#multi_input.
    def enterMulti_input(self, ctx:GroupParser.Multi_inputContext):
        pass

    # Exit a parse tree produced by GroupParser#multi_input.
    def exitMulti_input(self, ctx:GroupParser.Multi_inputContext):
        pass


    # Enter a parse tree produced by GroupParser#multiLine_input.
    def enterMultiLine_input(self, ctx:GroupParser.MultiLine_inputContext):
        pass

    # Exit a parse tree produced by GroupParser#multiLine_input.
    def exitMultiLine_input(self, ctx:GroupParser.MultiLine_inputContext):
        pass


    # Enter a parse tree produced by GroupParser#single_input.
    def enterSingle_input(self, ctx:GroupParser.Single_inputContext):
        pass

    # Exit a parse tree produced by GroupParser#single_input.
    def exitSingle_input(self, ctx:GroupParser.Single_inputContext):
        pass


    # Enter a parse tree produced by GroupParser#assignment_expr.
    def enterAssignment_expr(self, ctx:GroupParser.Assignment_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#assignment_expr.
    def exitAssignment_expr(self, ctx:GroupParser.Assignment_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#mathmatical_expr.
    def enterMathmatical_expr(self, ctx:GroupParser.Mathmatical_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#mathmatical_expr.
    def exitMathmatical_expr(self, ctx:GroupParser.Mathmatical_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#list_expr.
    def enterList_expr(self, ctx:GroupParser.List_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#list_expr.
    def exitList_expr(self, ctx:GroupParser.List_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#variable_expr.
    def enterVariable_expr(self, ctx:GroupParser.Variable_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#variable_expr.
    def exitVariable_expr(self, ctx:GroupParser.Variable_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#conditional_expr.
    def enterConditional_expr(self, ctx:GroupParser.Conditional_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#conditional_expr.
    def exitConditional_expr(self, ctx:GroupParser.Conditional_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#star_conditional_expr.
    def enterStar_conditional_expr(self, ctx:GroupParser.Star_conditional_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#star_conditional_expr.
    def exitStar_conditional_expr(self, ctx:GroupParser.Star_conditional_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#if_expr.
    def enterIf_expr(self, ctx:GroupParser.If_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#if_expr.
    def exitIf_expr(self, ctx:GroupParser.If_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#for_expr.
    def enterFor_expr(self, ctx:GroupParser.For_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#for_expr.
    def exitFor_expr(self, ctx:GroupParser.For_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#while_expr.
    def enterWhile_expr(self, ctx:GroupParser.While_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#while_expr.
    def exitWhile_expr(self, ctx:GroupParser.While_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#function_def_expr.
    def enterFunction_def_expr(self, ctx:GroupParser.Function_def_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#function_def_expr.
    def exitFunction_def_expr(self, ctx:GroupParser.Function_def_exprContext):
        pass


    # Enter a parse tree produced by GroupParser#function_call_expr.
    def enterFunction_call_expr(self, ctx:GroupParser.Function_call_exprContext):
        pass

    # Exit a parse tree produced by GroupParser#function_call_expr.
    def exitFunction_call_expr(self, ctx:GroupParser.Function_call_exprContext):
        pass



del GroupParser