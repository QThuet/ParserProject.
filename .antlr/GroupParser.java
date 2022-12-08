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
		ID=1, INTEGER=2, STRING=3, BOOL=4, ASSIGN=5, ADD=6, MINUS=7, MULTIPLY=8, 
		DIVIDE=9, MOD=10, ADD_ASSIGN=11, SUB_ASSIGN=12, MUL_ASSIGN=13, DIV_ASSIGN=14, 
		LESS=15, GREATER=16, EQLESS=17, EQGREATER=18, NOTEQ=19, EQ=20, AND=21, 
		OR=22, NOT=23, TRUE=24, FALSE=25, OPENPAR=26, CLOSEPAR=27, COLON=28, ELSE=29, 
		IF=30, ELIF=31, OPENBRACKET=32, CLOSEBRACKET=33, BREAK=34, CONTINUE=35, 
		NEWLINE=36, COMMA=37, FOR=38, IN=39, WHILE=40, DEF=41, LOOPCONTROL=42, 
		ASSIGNS=43, CONDITIONAL=44, COMMENTS=45, WHITESPACE=46, INDENT=47, DEDENT=48;
	public static final int
		RULE_python_file = 0, RULE_multi_input = 1, RULE_multiLine_input = 2, 
		RULE_single_input = 3, RULE_assignment_expr = 4, RULE_mathmatical_expr = 5, 
		RULE_list_expr = 6, RULE_variable_expr = 7, RULE_conditional_expr = 8, 
		RULE_star_conditional_expr = 9, RULE_if_expr = 10, RULE_for_expr = 11, 
		RULE_while_expr = 12, RULE_function_def_expr = 13, RULE_function_call_expr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"python_file", "multi_input", "multiLine_input", "single_input", "assignment_expr", 
			"mathmatical_expr", "list_expr", "variable_expr", "conditional_expr", 
			"star_conditional_expr", "if_expr", "for_expr", "while_expr", "function_def_expr", 
			"function_call_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'<'", "'>'", "'<='", "'>='", "'!='", 
			"'=='", "'and'", "'or'", "'not'", "'True'", "'False'", "'('", "')'", 
			"':'", "'else'", "'if'", "'elif'", "'['", "']'", "'break'", "'continue'", 
			"'\n'", "','", "'for'", "'in'", "'while'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "INTEGER", "STRING", "BOOL", "ASSIGN", "ADD", "MINUS", "MULTIPLY", 
			"DIVIDE", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"LESS", "GREATER", "EQLESS", "EQGREATER", "NOTEQ", "EQ", "AND", "OR", 
			"NOT", "TRUE", "FALSE", "OPENPAR", "CLOSEPAR", "COLON", "ELSE", "IF", 
			"ELIF", "OPENBRACKET", "CLOSEBRACKET", "BREAK", "CONTINUE", "NEWLINE", 
			"COMMA", "FOR", "IN", "WHILE", "DEF", "LOOPCONTROL", "ASSIGNS", "CONDITIONAL", 
			"COMMENTS", "WHITESPACE", "INDENT", "DEDENT"
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

	public static class Python_fileContext extends ParserRuleContext {
		public List<Function_def_exprContext> function_def_expr() {
			return getRuleContexts(Function_def_exprContext.class);
		}
		public Function_def_exprContext function_def_expr(int i) {
			return getRuleContext(Function_def_exprContext.class,i);
		}
		public List<Multi_inputContext> multi_input() {
			return getRuleContexts(Multi_inputContext.class);
		}
		public Multi_inputContext multi_input(int i) {
			return getRuleContext(Multi_inputContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GroupParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GroupParser.NEWLINE, i);
		}
		public Python_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_file; }
	}

	public final Python_fileContext python_file() throws RecognitionException {
		Python_fileContext _localctx = new Python_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_python_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(30);
				function_def_expr();
				}
				break;
			case 2:
				{
				setState(31);
				multi_input();
				}
				break;
			case 3:
				{
				setState(32);
				match(NEWLINE);
				}
				break;
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INTEGER) | (1L << OPENPAR) | (1L << IF) | (1L << NEWLINE) | (1L << FOR) | (1L << WHILE) | (1L << DEF))) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(35);
					function_def_expr();
					}
					break;
				case 2:
					{
					setState(36);
					multi_input();
					}
					break;
				case 3:
					{
					setState(37);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Multi_inputContext extends ParserRuleContext {
		public List<Single_inputContext> single_input() {
			return getRuleContexts(Single_inputContext.class);
		}
		public Single_inputContext single_input(int i) {
			return getRuleContext(Single_inputContext.class,i);
		}
		public List<MultiLine_inputContext> multiLine_input() {
			return getRuleContexts(MultiLine_inputContext.class);
		}
		public MultiLine_inputContext multiLine_input(int i) {
			return getRuleContext(MultiLine_inputContext.class,i);
		}
		public Multi_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_input; }
	}

	public final Multi_inputContext multi_input() throws RecognitionException {
		Multi_inputContext _localctx = new Multi_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multi_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INTEGER:
			case OPENPAR:
			case NEWLINE:
				{
				setState(43);
				single_input();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				{
				setState(44);
				multiLine_input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(49);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
					case INTEGER:
					case OPENPAR:
					case NEWLINE:
						{
						setState(47);
						single_input();
						}
						break;
					case IF:
					case FOR:
					case WHILE:
						{
						setState(48);
						multiLine_input();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class MultiLine_inputContext extends ParserRuleContext {
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public MultiLine_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLine_input; }
	}

	public final MultiLine_inputContext multiLine_input() throws RecognitionException {
		MultiLine_inputContext _localctx = new MultiLine_inputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiLine_input);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				if_expr();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				for_expr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				while_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Single_inputContext extends ParserRuleContext {
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GroupParser.NEWLINE, 0); }
		public Mathmatical_exprContext mathmatical_expr() {
			return getRuleContext(Mathmatical_exprContext.class,0);
		}
		public Function_call_exprContext function_call_expr() {
			return getRuleContext(Function_call_exprContext.class,0);
		}
		public Single_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_input; }
	}

	public final Single_inputContext single_input() throws RecognitionException {
		Single_inputContext _localctx = new Single_inputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_input);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				assignment_expr();
				setState(60);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				mathmatical_expr(0);
				setState(63);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				function_call_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(NEWLINE);
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
		public Variable_exprContext left;
		public Token op;
		public Mathmatical_exprContext right;
		public Variable_exprContext variable_expr() {
			return getRuleContext(Variable_exprContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_assignment_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((Assignment_exprContext)_localctx).left = variable_expr();
			setState(70);
			((Assignment_exprContext)_localctx).op = match(ASSIGNS);
			setState(71);
			((Assignment_exprContext)_localctx).right = mathmatical_expr(0);
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
		public TerminalNode OPENPAR() { return getToken(GroupParser.OPENPAR, 0); }
		public List<Mathmatical_exprContext> mathmatical_expr() {
			return getRuleContexts(Mathmatical_exprContext.class);
		}
		public Mathmatical_exprContext mathmatical_expr(int i) {
			return getRuleContext(Mathmatical_exprContext.class,i);
		}
		public TerminalNode CLOSEPAR() { return getToken(GroupParser.CLOSEPAR, 0); }
		public TerminalNode INTEGER() { return getToken(GroupParser.INTEGER, 0); }
		public Function_call_exprContext function_call_expr() {
			return getRuleContext(Function_call_exprContext.class,0);
		}
		public Variable_exprContext variable_expr() {
			return getRuleContext(Variable_exprContext.class,0);
		}
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_mathmatical_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(74);
				match(OPENPAR);
				setState(75);
				mathmatical_expr(0);
				setState(76);
				match(CLOSEPAR);
				}
				break;
			case 2:
				{
				setState(78);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(79);
				function_call_expr();
				}
				break;
			case 4:
				{
				setState(80);
				variable_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Mathmatical_exprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathmatical_expr);
						setState(83);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(84);
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
						setState(85);
						((Mathmatical_exprContext)_localctx).right = mathmatical_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Mathmatical_exprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathmatical_expr);
						setState(86);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(87);
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
						setState(88);
						((Mathmatical_exprContext)_localctx).right = mathmatical_expr(6);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class List_exprContext extends ParserRuleContext {
		public List<Variable_exprContext> variable_expr() {
			return getRuleContexts(Variable_exprContext.class);
		}
		public Variable_exprContext variable_expr(int i) {
			return getRuleContext(Variable_exprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroupParser.ASSIGN, 0); }
		public TerminalNode OPENBRACKET() { return getToken(GroupParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(GroupParser.CLOSEBRACKET, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(GroupParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(GroupParser.INTEGER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GroupParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GroupParser.STRING, i);
		}
		public List<Function_call_exprContext> function_call_expr() {
			return getRuleContexts(Function_call_exprContext.class);
		}
		public Function_call_exprContext function_call_expr(int i) {
			return getRuleContext(Function_call_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroupParser.COMMA, i);
		}
		public List_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expr; }
	}

	public final List_exprContext list_expr() throws RecognitionException {
		List_exprContext _localctx = new List_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			variable_expr();
			setState(95);
			match(ASSIGN);
			setState(96);
			match(OPENBRACKET);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(97);
				variable_expr();
				}
				break;
			case 2:
				{
				setState(98);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(99);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(100);
				function_call_expr();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(103);
				match(COMMA);
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(104);
					variable_expr();
					}
					break;
				case 2:
					{
					setState(105);
					match(INTEGER);
					}
					break;
				case 3:
					{
					setState(106);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(107);
					function_call_expr();
					}
					break;
				}
				}
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(CLOSEBRACKET);
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

	public static class Variable_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GroupParser.ID, 0); }
		public Variable_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_expr; }
	}

	public final Variable_exprContext variable_expr() throws RecognitionException {
		Variable_exprContext _localctx = new Variable_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
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

	public static class Conditional_exprContext extends ParserRuleContext {
		public List<Mathmatical_exprContext> mathmatical_expr() {
			return getRuleContexts(Mathmatical_exprContext.class);
		}
		public Mathmatical_exprContext mathmatical_expr(int i) {
			return getRuleContext(Mathmatical_exprContext.class,i);
		}
		public TerminalNode CONDITIONAL() { return getToken(GroupParser.CONDITIONAL, 0); }
		public Variable_exprContext variable_expr() {
			return getRuleContext(Variable_exprContext.class,0);
		}
		public Conditional_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expr; }
	}

	public final Conditional_exprContext conditional_expr() throws RecognitionException {
		Conditional_exprContext _localctx = new Conditional_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional_expr);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				mathmatical_expr(0);
				setState(120);
				match(CONDITIONAL);
				setState(121);
				mathmatical_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				variable_expr();
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

	public static class Star_conditional_exprContext extends ParserRuleContext {
		public List<Conditional_exprContext> conditional_expr() {
			return getRuleContexts(Conditional_exprContext.class);
		}
		public Conditional_exprContext conditional_expr(int i) {
			return getRuleContext(Conditional_exprContext.class,i);
		}
		public List<TerminalNode> NOT() { return getTokens(GroupParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(GroupParser.NOT, i);
		}
		public List<TerminalNode> AND() { return getTokens(GroupParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GroupParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(GroupParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GroupParser.OR, i);
		}
		public Star_conditional_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_conditional_expr; }
	}

	public final Star_conditional_exprContext star_conditional_expr() throws RecognitionException {
		Star_conditional_exprContext _localctx = new Star_conditional_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_star_conditional_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(126);
				match(NOT);
				}
			}

			setState(129);
			conditional_expr();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(131);
					match(NOT);
					}
				}

				setState(134);
				conditional_expr();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class If_exprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GroupParser.IF, 0); }
		public List<TerminalNode> OPENPAR() { return getTokens(GroupParser.OPENPAR); }
		public TerminalNode OPENPAR(int i) {
			return getToken(GroupParser.OPENPAR, i);
		}
		public List<Star_conditional_exprContext> star_conditional_expr() {
			return getRuleContexts(Star_conditional_exprContext.class);
		}
		public Star_conditional_exprContext star_conditional_expr(int i) {
			return getRuleContext(Star_conditional_exprContext.class,i);
		}
		public List<TerminalNode> CLOSEPAR() { return getTokens(GroupParser.CLOSEPAR); }
		public TerminalNode CLOSEPAR(int i) {
			return getToken(GroupParser.CLOSEPAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(GroupParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GroupParser.COLON, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(GroupParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(GroupParser.INDENT, i);
		}
		public List<Multi_inputContext> multi_input() {
			return getRuleContexts(Multi_inputContext.class);
		}
		public Multi_inputContext multi_input(int i) {
			return getRuleContext(Multi_inputContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(GroupParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(GroupParser.DEDENT, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(GroupParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(GroupParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(GroupParser.ELSE, 0); }
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF);
			setState(141);
			match(OPENPAR);
			setState(142);
			star_conditional_expr();
			setState(143);
			match(CLOSEPAR);
			setState(144);
			match(COLON);
			{
			setState(145);
			match(INDENT);
			setState(146);
			multi_input();
			setState(147);
			match(DEDENT);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(149);
				match(ELIF);
				setState(150);
				match(OPENPAR);
				setState(151);
				star_conditional_expr();
				setState(152);
				match(CLOSEPAR);
				setState(153);
				match(COLON);
				setState(154);
				match(INDENT);
				setState(155);
				multi_input();
				setState(156);
				match(DEDENT);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(163);
				match(ELSE);
				setState(164);
				match(COLON);
				setState(165);
				match(INDENT);
				setState(166);
				multi_input();
				setState(167);
				match(DEDENT);
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

	public static class For_exprContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GroupParser.FOR, 0); }
		public Variable_exprContext variable_expr() {
			return getRuleContext(Variable_exprContext.class,0);
		}
		public TerminalNode IN() { return getToken(GroupParser.IN, 0); }
		public List_exprContext list_expr() {
			return getRuleContext(List_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroupParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(GroupParser.INDENT, 0); }
		public Multi_inputContext multi_input() {
			return getRuleContext(Multi_inputContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(GroupParser.DEDENT, 0); }
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FOR);
			setState(172);
			variable_expr();
			setState(173);
			match(IN);
			setState(174);
			list_expr();
			setState(175);
			match(COLON);
			{
			setState(176);
			match(INDENT);
			setState(177);
			multi_input();
			setState(178);
			match(DEDENT);
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

	public static class While_exprContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GroupParser.WHILE, 0); }
		public Star_conditional_exprContext star_conditional_expr() {
			return getRuleContext(Star_conditional_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroupParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(GroupParser.INDENT, 0); }
		public Multi_inputContext multi_input() {
			return getRuleContext(Multi_inputContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(GroupParser.DEDENT, 0); }
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WHILE);
			setState(181);
			star_conditional_expr();
			setState(182);
			match(COLON);
			{
			setState(183);
			match(INDENT);
			setState(184);
			multi_input();
			setState(185);
			match(DEDENT);
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

	public static class Function_def_exprContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(GroupParser.DEF, 0); }
		public Variable_exprContext variable_expr() {
			return getRuleContext(Variable_exprContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(GroupParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(GroupParser.CLOSEPAR, 0); }
		public TerminalNode COLON() { return getToken(GroupParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(GroupParser.INDENT, 0); }
		public Multi_inputContext multi_input() {
			return getRuleContext(Multi_inputContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(GroupParser.DEDENT, 0); }
		public List<Assignment_exprContext> assignment_expr() {
			return getRuleContexts(Assignment_exprContext.class);
		}
		public Assignment_exprContext assignment_expr(int i) {
			return getRuleContext(Assignment_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroupParser.COMMA, i);
		}
		public Function_def_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def_expr; }
	}

	public final Function_def_exprContext function_def_expr() throws RecognitionException {
		Function_def_exprContext _localctx = new Function_def_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_def_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(DEF);
			setState(188);
			variable_expr();
			setState(189);
			match(OPENPAR);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(190);
				assignment_expr();
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191);
					match(COMMA);
					setState(192);
					assignment_expr();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(200);
			match(CLOSEPAR);
			setState(201);
			match(COLON);
			{
			setState(202);
			match(INDENT);
			setState(203);
			multi_input();
			setState(204);
			match(DEDENT);
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

	public static class Function_call_exprContext extends ParserRuleContext {
		public Variable_exprContext variable_expr() {
			return getRuleContext(Variable_exprContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(GroupParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(GroupParser.CLOSEPAR, 0); }
		public List<Assignment_exprContext> assignment_expr() {
			return getRuleContexts(Assignment_exprContext.class);
		}
		public Assignment_exprContext assignment_expr(int i) {
			return getRuleContext(Assignment_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroupParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroupParser.COMMA, i);
		}
		public Function_call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_expr; }
	}

	public final Function_call_exprContext function_call_expr() throws RecognitionException {
		Function_call_exprContext _localctx = new Function_call_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			variable_expr();
			setState(207);
			match(OPENPAR);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(208);
				assignment_expr();
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(209);
					match(COMMA);
					setState(210);
					assignment_expr();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(218);
			match(CLOSEPAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return mathmatical_expr_sempred((Mathmatical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathmatical_expr_sempred(Mathmatical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\5\2$\n"+
		"\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\5\3\60\n\3\3\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"T\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\7\bq\n\b\f\b\16\bt"+
		"\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\5\13\u0082"+
		"\n\13\3\13\3\13\3\13\5\13\u0087\n\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00ac\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c4\n\17\f\17\16\17\u00c7"+
		"\13\17\5\17\u00c9\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u00d6\n\20\f\20\16\20\u00d9\13\20\5\20\u00db\n\20\3\20\3"+
		"\20\3\20\2\3\f\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\n\f\3"+
		"\2\b\t\3\2\27\30\2\u00f2\2#\3\2\2\2\4/\3\2\2\2\6;\3\2\2\2\bE\3\2\2\2\n"+
		"G\3\2\2\2\fS\3\2\2\2\16`\3\2\2\2\20w\3\2\2\2\22~\3\2\2\2\24\u0081\3\2"+
		"\2\2\26\u008e\3\2\2\2\30\u00ad\3\2\2\2\32\u00b6\3\2\2\2\34\u00bd\3\2\2"+
		"\2\36\u00d0\3\2\2\2 $\5\34\17\2!$\5\4\3\2\"$\7&\2\2# \3\2\2\2#!\3\2\2"+
		"\2#\"\3\2\2\2$*\3\2\2\2%)\5\34\17\2&)\5\4\3\2\')\7&\2\2(%\3\2\2\2(&\3"+
		"\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\3\3\2\2\2,*\3\2\2\2-"+
		"\60\5\b\5\2.\60\5\6\4\2/-\3\2\2\2/.\3\2\2\2\60\65\3\2\2\2\61\64\5\b\5"+
		"\2\62\64\5\6\4\2\63\61\3\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2"+
		"\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\28<\5\26\f\29<\5\30\r\2:<\5"+
		"\32\16\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\5\n\6\2>?\7&\2\2?"+
		"F\3\2\2\2@A\5\f\7\2AB\7&\2\2BF\3\2\2\2CF\5\36\20\2DF\7&\2\2E=\3\2\2\2"+
		"E@\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GH\5\20\t\2HI\7-\2\2IJ\5\f\7"+
		"\2J\13\3\2\2\2KL\b\7\1\2LM\7\34\2\2MN\5\f\7\2NO\7\35\2\2OT\3\2\2\2PT\7"+
		"\4\2\2QT\5\36\20\2RT\5\20\t\2SK\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2"+
		"T]\3\2\2\2UV\f\b\2\2VW\t\2\2\2W\\\5\f\7\tXY\f\7\2\2YZ\t\3\2\2Z\\\5\f\7"+
		"\b[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_]\3\2"+
		"\2\2`a\5\20\t\2ab\7\7\2\2bg\7\"\2\2ch\5\20\t\2dh\7\4\2\2eh\7\5\2\2fh\5"+
		"\36\20\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hr\3\2\2\2in\7\'\2\2j"+
		"o\5\20\t\2ko\7\4\2\2lo\7\5\2\2mo\5\36\20\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2"+
		"\2nm\3\2\2\2oq\3\2\2\2pi\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2"+
		"\2tr\3\2\2\2uv\7#\2\2v\17\3\2\2\2wx\7\3\2\2x\21\3\2\2\2yz\5\f\7\2z{\7"+
		".\2\2{|\5\f\7\2|\177\3\2\2\2}\177\5\20\t\2~y\3\2\2\2~}\3\2\2\2\177\23"+
		"\3\2\2\2\u0080\u0082\7\31\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u008b\5\22\n\2\u0084\u0086\t\4\2\2\u0085\u0087"+
		"\7\31\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u008a\5\22\n\2\u0089\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7 \2\2\u008f\u0090\7\34\2\2\u0090\u0091\5\24\13\2\u0091\u0092\7"+
		"\35\2\2\u0092\u0093\7\36\2\2\u0093\u0094\7\61\2\2\u0094\u0095\5\4\3\2"+
		"\u0095\u0096\7\62\2\2\u0096\u00a2\3\2\2\2\u0097\u0098\7!\2\2\u0098\u0099"+
		"\7\34\2\2\u0099\u009a\5\24\13\2\u009a\u009b\7\35\2\2\u009b\u009c\7\36"+
		"\2\2\u009c\u009d\7\61\2\2\u009d\u009e\5\4\3\2\u009e\u009f\7\62\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u0097\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ab\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7\37\2\2\u00a6\u00a7\7\36\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9"+
		"\5\4\3\2\u00a9\u00aa\7\62\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a5\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\7(\2\2\u00ae\u00af\5"+
		"\20\t\2\u00af\u00b0\7)\2\2\u00b0\u00b1\5\16\b\2\u00b1\u00b2\7\36\2\2\u00b2"+
		"\u00b3\7\61\2\2\u00b3\u00b4\5\4\3\2\u00b4\u00b5\7\62\2\2\u00b5\31\3\2"+
		"\2\2\u00b6\u00b7\7*\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\7\36\2\2\u00b9"+
		"\u00ba\7\61\2\2\u00ba\u00bb\5\4\3\2\u00bb\u00bc\7\62\2\2\u00bc\33\3\2"+
		"\2\2\u00bd\u00be\7+\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c8\7\34\2\2\u00c0"+
		"\u00c5\5\n\6\2\u00c1\u00c2\7\'\2\2\u00c2\u00c4\5\n\6\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\35\2\2\u00cb\u00cc\7\36\2\2\u00cc"+
		"\u00cd\7\61\2\2\u00cd\u00ce\5\4\3\2\u00ce\u00cf\7\62\2\2\u00cf\35\3\2"+
		"\2\2\u00d0\u00d1\5\20\t\2\u00d1\u00da\7\34\2\2\u00d2\u00d7\5\n\6\2\u00d3"+
		"\u00d4\7\'\2\2\u00d4\u00d6\5\n\6\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\7\35\2\2\u00dd\37\3\2\2\2\32#(*/\63\65;ES[]gnr~\u0081"+
		"\u0086\u008b\u00a2\u00ab\u00c5\u00c8\u00d7\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}