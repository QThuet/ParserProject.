// Generated from c:\Users\qpt10\Desktop\Program work\POP\Group.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GroupParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Variable_expr=3, ID=4, INTEGER=5, ASSIGN=6, ADD=7, MINUS=8, 
		MULTIPLY=9, DIVIDE=10, MOD=11, ADD_ASSIGN=12, SUB_ASSIGN=13, MUL_ASSIGN=14, 
		DIV_ASSIGN=15, ASSIGNS=16, WHITESPACE=17;
	public static final int
		RULE_single_input = 0, RULE_assignment_expr = 1, RULE_mathmatical_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"single_input", "assignment_expr", "mathmatical_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Variable_expr", "ID", "INTEGER", "ASSIGN", "ADD", 
			"MINUS", "MULTIPLY", "DIVIDE", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "ASSIGNS", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Group.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GroupParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Single_inputContext extends ParserRuleContext {
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public Mathmatical_exprContext mathmatical_expr() {
			return getRuleContext(Mathmatical_exprContext.class,0);
		}
		public Single_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_input; }
	}

	public final Single_inputContext single_input() throws RecognitionException {
		Single_inputContext _localctx = new Single_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_single_input);
		try {
			setState(8);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				assignment_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				mathmatical_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_exprContext extends ParserRuleContext {
		public Token left;
		public Token op;
		public Mathmatical_exprContext right;
		public TerminalNode Variable_expr() { return getToken(GroupParser.Variable_expr, 0); }
		public TerminalNode ASSIGNS() { return getToken(GroupParser.ASSIGNS, 0); }
		public Mathmatical_exprContext mathmatical_expr() {
			return getRuleContext(Mathmatical_exprContext.class,0);
		}
		public Assignment_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expr; }
	}

	public final Assignment_exprContext assignment_expr() throws RecognitionException {
		Assignment_exprContext _localctx = new Assignment_exprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((Assignment_exprContext)_localctx).left = match(Variable_expr);
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNS) {
				{
				setState(11);
				((Assignment_exprContext)_localctx).op = match(ASSIGNS);
				setState(12);
				((Assignment_exprContext)_localctx).right = mathmatical_expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mathmatical_exprContext extends ParserRuleContext {
		public Mathmatical_exprContext left;
		public Token op;
		public Mathmatical_exprContext right;
		public List<Mathmatical_exprContext> mathmatical_expr() {
			return getRuleContexts(Mathmatical_exprContext.class);
		}
		public Mathmatical_exprContext mathmatical_expr(int i) {
			return getRuleContext(Mathmatical_exprContext.class,i);
		}
		public TerminalNode INTEGER() { return getToken(GroupParser.INTEGER, 0); }
		public TerminalNode Variable_expr() { return getToken(GroupParser.Variable_expr, 0); }
		public TerminalNode MULTIPLY() { return getToken(GroupParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(GroupParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(GroupParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(GroupParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(GroupParser.MINUS, 0); }
		public Mathmatical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathmatical_expr; }
	}

	public final Mathmatical_exprContext mathmatical_expr() throws RecognitionException {
		return mathmatical_expr(0);
	}

	private Mathmatical_exprContext mathmatical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mathmatical_exprContext _localctx = new Mathmatical_exprContext(_ctx, _parentState);
		Mathmatical_exprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_mathmatical_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(16);
				match(T__0);
				setState(17);
				mathmatical_expr(0);
				setState(18);
				match(T__1);
				}
				break;
			case INTEGER:
				{
				setState(20);
				match(INTEGER);
				}
				break;
			case Variable_expr:
				{
				setState(21);
				match(Variable_expr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Mathmatical_exprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathmatical_expr);
						setState(24);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(25);
						((Mathmatical_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
							((Mathmatical_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(26);
						((Mathmatical_exprContext)_localctx).right = mathmatical_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Mathmatical_exprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathmatical_expr);
						setState(27);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(28);
						((Mathmatical_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
							((Mathmatical_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(29);
						((Mathmatical_exprContext)_localctx).right = mathmatical_expr(5);
						}
						break;
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return mathmatical_expr_sempred((Mathmatical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathmatical_expr_sempred(Mathmatical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\5\2\13\n\2\3\3\3\3\3\3\5\3\20\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\31\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13\4"+
		"\3\4\2\3\6\5\2\4\6\2\4\3\2\13\r\3\2\t\n\2(\2\n\3\2\2\2\4\f\3\2\2\2\6\30"+
		"\3\2\2\2\b\13\5\4\3\2\t\13\5\6\4\2\n\b\3\2\2\2\n\t\3\2\2\2\13\3\3\2\2"+
		"\2\f\17\7\5\2\2\r\16\7\22\2\2\16\20\5\6\4\2\17\r\3\2\2\2\17\20\3\2\2\2"+
		"\20\5\3\2\2\2\21\22\b\4\1\2\22\23\7\3\2\2\23\24\5\6\4\2\24\25\7\4\2\2"+
		"\25\31\3\2\2\2\26\31\7\7\2\2\27\31\7\5\2\2\30\21\3\2\2\2\30\26\3\2\2\2"+
		"\30\27\3\2\2\2\31\"\3\2\2\2\32\33\f\7\2\2\33\34\t\2\2\2\34!\5\6\4\b\35"+
		"\36\f\6\2\2\36\37\t\3\2\2\37!\5\6\4\7 \32\3\2\2\2 \35\3\2\2\2!$\3\2\2"+
		"\2\" \3\2\2\2\"#\3\2\2\2#\7\3\2\2\2$\"\3\2\2\2\7\n\17\30 \"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}