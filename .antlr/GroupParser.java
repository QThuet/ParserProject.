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
		T__0=1, T__1=2, T__2=3, Variable_expr=4, ID=5, INTEGER=6, SRING=7, BOOL=8, 
		ASSIGN=9, ADD=10, MINUS=11, MULTIPLY=12, DIVIDE=13, MOD=14, ADD_ASSIGN=15, 
		SUB_ASSIGN=16, MUL_ASSIGN=17, DIV_ASSIGN=18, TRUE=19, FALSE=20, BREAK=21, 
		CONTINUE=22, LOOPCONTROL=23, ASSIGNS=24, COMMENTS=25, WHITESPACE=26;
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
			null, "'\n'", "'('", "')'", null, null, null, null, null, "'='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", "'True'", 
			"'False'", "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Variable_expr", "ID", "INTEGER", "SRING", "BOOL", 
			"ASSIGN", "ADD", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "TRUE", "FALSE", "BREAK", "CONTINUE", 
			"LOOPCONTROL", "ASSIGNS", "COMMENTS", "WHITESPACE"
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
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				assignment_expr();
				setState(7);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				mathmatical_expr(0);
				setState(10);
				match(T__0);
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
			setState(14);
			((Assignment_exprContext)_localctx).left = match(Variable_expr);
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNS) {
				{
				setState(15);
				((Assignment_exprContext)_localctx).op = match(ASSIGNS);
				setState(16);
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
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(20);
				match(T__1);
				setState(21);
				mathmatical_expr(0);
				setState(22);
				match(T__2);
				}
				break;
			case INTEGER:
				{
				setState(24);
				match(INTEGER);
				}
				break;
			case Variable_expr:
				{
				setState(25);
				match(Variable_expr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(34);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Mathmatical_exprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathmatical_expr);
						setState(28);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(29);
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
						setState(30);
						((Mathmatical_exprContext)_localctx).right = mathmatical_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Mathmatical_exprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathmatical_expr);
						setState(31);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(32);
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
						setState(33);
						((Mathmatical_exprContext)_localctx).right = mathmatical_expr(5);
						}
						break;
					}
					} 
				}
				setState(38);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\5\3\24\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\35\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4%\n\4"+
		"\f\4\16\4(\13\4\3\4\2\3\6\5\2\4\6\2\4\3\2\16\20\3\2\f\r\2,\2\16\3\2\2"+
		"\2\4\20\3\2\2\2\6\34\3\2\2\2\b\t\5\4\3\2\t\n\7\3\2\2\n\17\3\2\2\2\13\f"+
		"\5\6\4\2\f\r\7\3\2\2\r\17\3\2\2\2\16\b\3\2\2\2\16\13\3\2\2\2\17\3\3\2"+
		"\2\2\20\23\7\6\2\2\21\22\7\32\2\2\22\24\5\6\4\2\23\21\3\2\2\2\23\24\3"+
		"\2\2\2\24\5\3\2\2\2\25\26\b\4\1\2\26\27\7\4\2\2\27\30\5\6\4\2\30\31\7"+
		"\5\2\2\31\35\3\2\2\2\32\35\7\b\2\2\33\35\7\6\2\2\34\25\3\2\2\2\34\32\3"+
		"\2\2\2\34\33\3\2\2\2\35&\3\2\2\2\36\37\f\7\2\2\37 \t\2\2\2 %\5\6\4\b!"+
		"\"\f\6\2\2\"#\t\3\2\2#%\5\6\4\7$\36\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2\7\16\23\34$&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}