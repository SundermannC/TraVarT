package at.jku.cps.travart.core.formats.afm.parser;

// Generated from src/main/java/at/jku/cps/travart/core/formats/afm/parser/AFM.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AFMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ADD=15, SUB=16, MULT=17, 
		DIV=18, MOD=19, POW=20, ASIG=21, ABS=22, MAX=23, MIN=24, COS=25, SIN=26, 
		SUM=27, AND=28, OR=29, NOT=30, IFF=31, IMPLIES=32, REQUIRES=33, EXCLUDES=34, 
		HIGHER_THAN=35, LOWER_THAN=36, HIGHER_EQUAL_THAN=37, LOWER_EQUAL_THAN=38, 
		EQUAL=39, DISTINCT=40, INTEGER=41, WORD=42, INT=43, DOUBLE=44, STRING=45, 
		SPACE=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ADD", "SUB", "MULT", "DIV", 
			"MOD", "POW", "ASIG", "ABS", "MAX", "MIN", "COS", "SIN", "SUM", "AND", 
			"OR", "NOT", "IFF", "IMPLIES", "REQUIRES", "EXCLUDES", "HIGHER_THAN", 
			"LOWER_THAN", "HIGHER_EQUAL_THAN", "LOWER_EQUAL_THAN", "EQUAL", "DISTINCT", 
			"INTEGER", "WORD", "INT", "DOUBLE", "STRING", "SPACE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%Relationships'", "';'", "':'", "'['", "','", "']'", "'{'", "'}'", 
			"'%Attributes'", "'.'", "'to'", "'%Constraints'", "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'='", "'abs'", "'max'", "'min'", 
			"'cos'", "'sin'", "'sum'", "'AND'", "'OR'", "'NOT'", "'IFF'", "'IMPLIES'", 
			"'REQUIRES'", "'EXCLUDES'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'Integer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ADD", "SUB", "MULT", "DIV", "MOD", "POW", "ASIG", 
			"ABS", "MAX", "MIN", "COS", "SIN", "SUM", "AND", "OR", "NOT", "IFF", 
			"IMPLIES", "REQUIRES", "EXCLUDES", "HIGHER_THAN", "LOWER_THAN", "HIGHER_EQUAL_THAN", 
			"LOWER_EQUAL_THAN", "EQUAL", "DISTINCT", "INTEGER", "WORD", "INT", "DOUBLE", 
			"STRING", "SPACE", "WS"
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


	public AFMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AFM.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u013a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\7+\u010a\n+\f+\16+\u010d\13+\3,\3,\3,\7,\u0112"+
		"\n,\f,\16,\u0115\13,\5,\u0117\n,\3-\3-\7-\u011b\n-\f-\16-\u011e\13-\3"+
		"-\3-\6-\u0122\n-\r-\16-\u0123\3.\3.\7.\u0128\n.\f.\16.\u012b\13.\3.\3"+
		".\3/\6/\u0130\n/\r/\16/\u0131\3\60\6\60\u0135\n\60\r\60\16\60\u0136\3"+
		"\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\t\4\2"+
		"C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2$$\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\2\u0141\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3a\3\2\2\2\5p\3\2\2\2\7r\3\2\2\2\tt\3\2\2\2\13v\3\2\2\2\rx\3\2\2"+
		"\2\17z\3\2\2\2\21|\3\2\2\2\23~\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3\2\2"+
		"\2\31\u008f\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2"+
		"!\u00a2\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00aa\3"+
		"\2\2\2+\u00ac\3\2\2\2-\u00ae\3\2\2\2/\u00b2\3\2\2\2\61\u00b6\3\2\2\2\63"+
		"\u00ba\3\2\2\2\65\u00be\3\2\2\2\67\u00c2\3\2\2\29\u00c6\3\2\2\2;\u00ca"+
		"\3\2\2\2=\u00cd\3\2\2\2?\u00d1\3\2\2\2A\u00d5\3\2\2\2C\u00dd\3\2\2\2E"+
		"\u00e6\3\2\2\2G\u00ef\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f6\3\2"+
		"\2\2O\u00f9\3\2\2\2Q\u00fc\3\2\2\2S\u00ff\3\2\2\2U\u0107\3\2\2\2W\u0116"+
		"\3\2\2\2Y\u0118\3\2\2\2[\u0125\3\2\2\2]\u012f\3\2\2\2_\u0134\3\2\2\2a"+
		"b\7\'\2\2bc\7T\2\2cd\7g\2\2de\7n\2\2ef\7c\2\2fg\7v\2\2gh\7k\2\2hi\7q\2"+
		"\2ij\7p\2\2jk\7u\2\2kl\7j\2\2lm\7k\2\2mn\7r\2\2no\7u\2\2o\4\3\2\2\2pq"+
		"\7=\2\2q\6\3\2\2\2rs\7<\2\2s\b\3\2\2\2tu\7]\2\2u\n\3\2\2\2vw\7.\2\2w\f"+
		"\3\2\2\2xy\7_\2\2y\16\3\2\2\2z{\7}\2\2{\20\3\2\2\2|}\7\177\2\2}\22\3\2"+
		"\2\2~\177\7\'\2\2\177\u0080\7C\2\2\u0080\u0081\7v\2\2\u0081\u0082\7v\2"+
		"\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7d\2\2\u0085\u0086"+
		"\7w\2\2\u0086\u0087\7v\2\2\u0087\u0088\7g\2\2\u0088\u0089\7u\2\2\u0089"+
		"\24\3\2\2\2\u008a\u008b\7\60\2\2\u008b\26\3\2\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7q\2\2\u008e\30\3\2\2\2\u008f\u0090\7\'\2\2\u0090\u0091\7E\2\2"+
		"\u0091\u0092\7q\2\2\u0092\u0093\7p\2\2\u0093\u0094\7u\2\2\u0094\u0095"+
		"\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7c\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\u009b\7u\2\2\u009b\32\3\2\2\2\u009c"+
		"\u009d\7*\2\2\u009d\34\3\2\2\2\u009e\u009f\7+\2\2\u009f\36\3\2\2\2\u00a0"+
		"\u00a1\7-\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7/\2\2\u00a3\"\3\2\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7&\3\2\2\2\u00a8"+
		"\u00a9\7\'\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7`\2\2\u00ab*\3\2\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad,\3\2\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7d\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7z\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7p\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7w\2\2\u00c4"+
		"\u00c5\7o\2\2\u00c58\3\2\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7P\2\2\u00c8"+
		"\u00c9\7F\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7Q\2\2\u00cb\u00cc\7T\2\2\u00cc"+
		"<\3\2\2\2\u00cd\u00ce\7P\2\2\u00ce\u00cf\7Q\2\2\u00cf\u00d0\7V\2\2\u00d0"+
		">\3\2\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7H\2\2\u00d3\u00d4\7H\2\2\u00d4"+
		"@\3\2\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7O\2\2\u00d7\u00d8\7R\2\2\u00d8"+
		"\u00d9\7N\2\2\u00d9\u00da\7K\2\2\u00da\u00db\7G\2\2\u00db\u00dc\7U\2\2"+
		"\u00dcB\3\2\2\2\u00dd\u00de\7T\2\2\u00de\u00df\7G\2\2\u00df\u00e0\7S\2"+
		"\2\u00e0\u00e1\7W\2\2\u00e1\u00e2\7K\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4"+
		"\7G\2\2\u00e4\u00e5\7U\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8"+
		"\7Z\2\2\u00e8\u00e9\7E\2\2\u00e9\u00ea\7N\2\2\u00ea\u00eb\7W\2\2\u00eb"+
		"\u00ec\7F\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7U\2\2\u00eeF\3\2\2\2\u00ef"+
		"\u00f0\7@\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2J\3\2\2\2\u00f3\u00f4"+
		"\7@\2\2\u00f4\u00f5\7?\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8N\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa\u00fb\7?\2\2\u00fbP\3"+
		"\2\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe\7?\2\2\u00feR\3\2\2\2\u00ff\u0100"+
		"\7K\2\2\u0100\u0101\7p\2\2\u0101\u0102\7v\2\2\u0102\u0103\7g\2\2\u0103"+
		"\u0104\7i\2\2\u0104\u0105\7g\2\2\u0105\u0106\7t\2\2\u0106T\3\2\2\2\u0107"+
		"\u010b\t\2\2\2\u0108\u010a\t\3\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cV\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010e\u0117\7\62\2\2\u010f\u0113\t\4\2\2\u0110\u0112\t\5\2\2"+
		"\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u010e\3\2\2\2\u0116"+
		"\u010f\3\2\2\2\u0117X\3\2\2\2\u0118\u011c\t\4\2\2\u0119\u011b\t\5\2\2"+
		"\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\7\60\2\2"+
		"\u0120\u0122\t\5\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124Z\3\2\2\2\u0125\u0129\7$\2\2\u0126\u0128"+
		"\n\6\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7$"+
		"\2\2\u012d\\\3\2\2\2\u012e\u0130\t\7\2\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132^\3\2\2\2\u0133"+
		"\u0135\t\b\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b\60\2\2\u0139"+
		"`\3\2\2\2\f\2\u0109\u010b\u0113\u0116\u011c\u0123\u0129\u0131\u0136\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}