// Generated from c:\Users\qpt10\Desktop\Program work\POP\Group.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GroupLexer extends Lexer {
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
		ASSIGNS=43, CONDITIONAL=44, COMMENTS=45, WHITESPACE=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "INTEGER", "STRING", "BOOL", "ASSIGN", "ADD", "MINUS", "MULTIPLY", 
			"DIVIDE", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"LESS", "GREATER", "EQLESS", "EQGREATER", "NOTEQ", "EQ", "AND", "OR", 
			"NOT", "TRUE", "FALSE", "OPENPAR", "CLOSEPAR", "COLON", "ELSE", "IF", 
			"ELIF", "OPENBRACKET", "CLOSEBRACKET", "BREAK", "CONTINUE", "NEWLINE", 
			"COMMA", "FOR", "IN", "WHILE", "DEF", "LOOPCONTROL", "ASSIGNS", "CONDITIONAL", 
			"COMMENTS", "WHITESPACE", "NON_ZERO_DIGIT", "DIGIT", "SPACES", "ID_START", 
			"ID_CONTINUE"
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
			"COMMENTS", "WHITESPACE"
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


	public GroupLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Group.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u013e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\3\3\3\7\3s\n\3\f\3\16\3v\13\3"+
		"\3\3\5\3y\n\3\3\4\3\4\3\4\3\4\7\4\177\n\4\f\4\16\4\u0082\13\4\3\4\3\4"+
		"\3\5\3\5\5\5\u0088\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\5+\u0105\n+\3,\3,\3,\3"+
		",\3,\5,\u010c\n,\3-\3-\3-\3-\3-\3-\5-\u0114\n-\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\7.\u011f\n.\f.\16.\u0122\13.\3.\3.\3.\5.\u0127\n.\3.\3.\3/\3/\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\6\62\u0134\n\62\r\62\16\62\u0135\3\63\5\63"+
		"\u0139\n\63\3\64\3\64\5\64\u013d\n\64\3\u0120\2\65\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2e\2g\2\3\2\b\4\2C\\c|\3\2\63;\3\2\62;\5\2"+
		"\13\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u014e\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3i\3\2\2\2\5x\3\2\2\2\7z\3\2\2\2\t\u0087"+
		"\3\2\2\2\13\u0089\3\2\2\2\r\u008b\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3"+
		"\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u0098\3\2"+
		"\2\2\33\u009b\3\2\2\2\35\u009e\3\2\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2"+
		"#\u00a5\3\2\2\2%\u00a8\3\2\2\2\'\u00ab\3\2\2\2)\u00ae\3\2\2\2+\u00b1\3"+
		"\2\2\2-\u00b5\3\2\2\2/\u00b8\3\2\2\2\61\u00bc\3\2\2\2\63\u00c1\3\2\2\2"+
		"\65\u00c7\3\2\2\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00d2"+
		"\3\2\2\2?\u00d5\3\2\2\2A\u00da\3\2\2\2C\u00dc\3\2\2\2E\u00de\3\2\2\2G"+
		"\u00e4\3\2\2\2I\u00ed\3\2\2\2K\u00ef\3\2\2\2M\u00f1\3\2\2\2O\u00f5\3\2"+
		"\2\2Q\u00f8\3\2\2\2S\u00fe\3\2\2\2U\u0104\3\2\2\2W\u010b\3\2\2\2Y\u0113"+
		"\3\2\2\2[\u0126\3\2\2\2]\u012a\3\2\2\2_\u012e\3\2\2\2a\u0130\3\2\2\2c"+
		"\u0133\3\2\2\2e\u0138\3\2\2\2g\u013c\3\2\2\2im\5e\63\2jl\5g\64\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\4\3\2\2\2om\3\2\2\2pt\5_\60\2qs\5"+
		"a\61\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uy\3\2\2\2vt\3\2\2\2wy\7"+
		"\62\2\2xp\3\2\2\2xw\3\2\2\2y\6\3\2\2\2z\u0080\7$\2\2{\177\t\2\2\2|\177"+
		"\5c\62\2}\177\5I%\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7$\2\2\u0084\b\3\2\2\2\u0085\u0088\5\61\31\2\u0086\u0088"+
		"\5\63\32\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\n\3\2\2\2\u0089"+
		"\u008a\7?\2\2\u008a\f\3\2\2\2\u008b\u008c\7-\2\2\u008c\16\3\2\2\2\u008d"+
		"\u008e\7/\2\2\u008e\20\3\2\2\2\u008f\u0090\7,\2\2\u0090\22\3\2\2\2\u0091"+
		"\u0092\7\61\2\2\u0092\24\3\2\2\2\u0093\u0094\7\'\2\2\u0094\26\3\2\2\2"+
		"\u0095\u0096\7-\2\2\u0096\u0097\7?\2\2\u0097\30\3\2\2\2\u0098\u0099\7"+
		"/\2\2\u0099\u009a\7?\2\2\u009a\32\3\2\2\2\u009b\u009c\7,\2\2\u009c\u009d"+
		"\7?\2\2\u009d\34\3\2\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"\36\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7@\2\2\u00a4"+
		"\"\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7?\2\2\u00a7$\3\2\2\2\u00a8"+
		"\u00a9\7@\2\2\u00a9\u00aa\7?\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad(\3\2\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"*\3\2\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4"+
		",\3\2\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7.\3\2\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7v\2\2\u00bb\60\3\2\2\2\u00bc\u00bd"+
		"\7V\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\62\3\2\2\2\u00c1\u00c2\7H\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7n\2\2\u00c4"+
		"\u00c5\7u\2\2\u00c5\u00c6\7g\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8"+
		"\66\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc"+
		":\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7h\2\2\u00d4"+
		">\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7h\2\2\u00d9@\3\2\2\2\u00da\u00db\7]\2\2\u00dbB\3\2\2\2\u00dc\u00dd"+
		"\7_\2\2\u00ddD\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7m\2\2\u00e3F\3\2\2\2\u00e4\u00e5"+
		"\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ecH\3\2\2\2\u00ed\u00ee\7\f\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7.\2\2"+
		"\u00f0L\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7t\2"+
		"\2\u00f4N\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7P\3\2\2\2"+
		"\u00f8\u00f9\7y\2\2\u00f9\u00fa\7j\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc"+
		"\7n\2\2\u00fc\u00fd\7g\2\2\u00fdR\3\2\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7h\2\2\u0101T\3\2\2\2\u0102\u0105\5E#\2\u0103\u0105"+
		"\5G$\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105V\3\2\2\2\u0106\u010c"+
		"\5\13\6\2\u0107\u010c\5\27\f\2\u0108\u010c\5\31\r\2\u0109\u010c\5\33\16"+
		"\2\u010a\u010c\5\35\17\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b"+
		"\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010cX\3\2\2\2"+
		"\u010d\u0114\5\37\20\2\u010e\u0114\5!\21\2\u010f\u0114\5#\22\2\u0110\u0114"+
		"\5%\23\2\u0111\u0114\5)\25\2\u0112\u0114\5\'\24\2\u0113\u010d\3\2\2\2"+
		"\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0112\3\2\2\2\u0114Z\3\2\2\2\u0115\u0116\7%\2\2\u0116\u0117"+
		"\13\2\2\2\u0117\u0127\5I%\2\u0118\u0119\7$\2\2\u0119\u011a\7$\2\2\u011a"+
		"\u011b\7$\2\2\u011b\u0120\3\2\2\2\u011c\u011f\13\2\2\2\u011d\u011f\5I"+
		"%\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0124\7$\2\2\u0124\u0125\7$\2\2\u0125\u0127\7$\2\2\u0126\u0115"+
		"\3\2\2\2\u0126\u0118\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b.\2\2\u0129"+
		"\\\3\2\2\2\u012a\u012b\5c\62\2\u012b\u012c\3\2\2\2\u012c\u012d\b/\2\2"+
		"\u012d^\3\2\2\2\u012e\u012f\t\3\2\2\u012f`\3\2\2\2\u0130\u0131\t\4\2\2"+
		"\u0131b\3\2\2\2\u0132\u0134\t\5\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136d\3\2\2\2\u0137\u0139"+
		"\t\6\2\2\u0138\u0137\3\2\2\2\u0139f\3\2\2\2\u013a\u013d\5e\63\2\u013b"+
		"\u013d\t\7\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013dh\3\2\2\2"+
		"\22\2mtx~\u0080\u0087\u0104\u010b\u0113\u011e\u0120\u0126\u0135\u0138"+
		"\u013c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}