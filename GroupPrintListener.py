import sys
from antlr4 import *
from dist.GroupLexer import GroupLexer
from dist.GroupParser import GroupParser
from dist.GroupVisitor import GroupVisitor
from antlr4.tree.Trees import Trees

  
class MyVisitor(GroupVisitor):
    def visitNumberExpr(self, ctx):
        value = ctx.getText()
        return int(value)

    def visitParenExpr(self, ctx):
        return self.visit(ctx.expr())

    def visitInfixExpr(self, ctx):
        l = self.visit(ctx.left)
        r = self.visit(ctx.right)

        op = ctx.op.text
        operation =  {
        '+': lambda: l + r,
        '-': lambda: l - r,
        '*': lambda: l * r,
        '/': lambda: l / r,
        '%': lambda: l % r,
        }
        return operation.get(op, lambda: None)()

    def visitByeExpr(self, ctx):
        print(f"goodbye")
        sys.exit(0)

if __name__ == "__main__":
    while 1:
        data =  InputStream(input(">>> "))
        # lexer
        lexer = GroupLexer(data)
        stream = CommonTokenStream(lexer)
        # parser
        parser = GroupParser(stream)
        tree = parser.expr()
        # evaluator
        visitor = MyVisitor()
        #Trees.inspect(tree,parser)
        print(Trees.toStringTree(tree, None, parser))
        output = visitor.visit(tree)
        print(output)