import sys
from antlr4 import *
from GroupLexer import GroupLexer
from GroupParser import GroupParser

def main(argv):
    if len(sys.argv) > 1:
        in_ = FileStream(sys.argv[1])
    else:
        in_ = InputStream(sys.stdin.readline())
    
    lexer = GroupLexer(in_)
    tokens = CommonTokenStream(lexer)
    parser = GroupParser(tokens)
    tree = parser.prog()
    print(tree.toStringTree(recog = parser))

if __name__ == '__main__':
    main(sys.argv)