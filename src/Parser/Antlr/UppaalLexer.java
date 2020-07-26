// Generated from C:/Users/57310/Documents/Github/XMLGrammar/src/Parser/Antlr\UppaalLexer.g4 by ANTLR 4.8
package Parser.Antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UppaalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DTD=1, SEA_WS=2, PROLOG_OPEN=3, NTA_OPEN=4, PROLOG_CLOSE=5, NAME_ATTRIBUTE=6, 
		EQUALS=7, STRING=8, PROLOG_WS=9, NTA_CLOSE=10, DECLARATION_OPEN=11, TEMPLATE_OPEN=12, 
		WS_NTA=13, DECLARATION_CLOSE=14, DECLARATION_TEXT=15, TEMPLATE_CLOSE=16, 
		X=17, Y=18, EQUALS_TEMPLATE=19, NUMBER=20, QUOTES=21, OPEN=22, NAME=23, 
		LOCATION=24, ID=25, TRANSITION=26, INIT=27, REF=28, OPEN_SLASH=29, CLOSE=30, 
		SLASH_CLOSE=31, IDENTIFIER=32, LABEL_OPEN=33, WS_TEMPLATE=34, LABEL_CLOSE=35, 
		LABEL_TEXT=36;
	public static final int
		PROLOG=1, NTA=2, DECLARATION=3, TEMPLATE=4, LABEL=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PROLOG", "NTA", "DECLARATION", "TEMPLATE", "LABEL"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DTD", "SEA_WS", "PROLOG_OPEN", "NTA_OPEN", "PROLOG_CLOSE", "NAME_ATTRIBUTE", 
			"EQUALS", "STRING", "PROLOG_WS", "DIGIT", "NameChar", "NameStartChar", 
			"NTA_CLOSE", "DECLARATION_OPEN", "TEMPLATE_OPEN", "WS_NTA", "DECLARATION_CLOSE", 
			"DECLARATION_TEXT", "TEMPLATE_CLOSE", "X", "Y", "EQUALS_TEMPLATE", "NUMBER", 
			"QUOTES", "OPEN", "NAME", "LOCATION", "ID", "TRANSITION", "INIT", "REF", 
			"OPEN_SLASH", "CLOSE", "SLASH_CLOSE", "IDENTIFIER", "Label_kind", "LABEL_OPEN", 
			"WS_TEMPLATE", "LABEL_CLOSE", "LABEL_TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'?>'", null, null, null, null, null, null, 
			null, null, null, null, null, "'x'", "'y'", null, null, "'\"'", "'<'", 
			"'name'", "'location'", "'id'", "'transition'", "'init'", "'ref'", "'</'", 
			"'>'", "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DTD", "SEA_WS", "PROLOG_OPEN", "NTA_OPEN", "PROLOG_CLOSE", "NAME_ATTRIBUTE", 
			"EQUALS", "STRING", "PROLOG_WS", "NTA_CLOSE", "DECLARATION_OPEN", "TEMPLATE_OPEN", 
			"WS_NTA", "DECLARATION_CLOSE", "DECLARATION_TEXT", "TEMPLATE_CLOSE", 
			"X", "Y", "EQUALS_TEMPLATE", "NUMBER", "QUOTES", "OPEN", "NAME", "LOCATION", 
			"ID", "TRANSITION", "INIT", "REF", "OPEN_SLASH", "CLOSE", "SLASH_CLOSE", 
			"IDENTIFIER", "LABEL_OPEN", "WS_TEMPLATE", "LABEL_CLOSE", "LABEL_TEXT"
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


	public UppaalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UppaalLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0216\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\3\2\3\2\3\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\3\2\3\3\6\3e\n\3\r"+
		"\3\16\3f\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5w"+
		"\n\5\f\5\16\5z\13\5\3\5\3\5\3\5\3\5\3\5\7\5\u0081\n\5\f\5\16\5\u0084\13"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7\u0091\n\7\f\7\16\7"+
		"\u0094\13\7\3\b\3\b\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3\t\3\t"+
		"\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b4\n\f\3\r\5\r\u00b7\n\r\3\16\3\16"+
		"\3\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0\13\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00c7\n\16\f\16\16\16\u00ca\13\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\7\17\u00d2\n\17\f\17\16\17\u00d5\13\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e4\n\17\f\17\16\17\u00e7"+
		"\13\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u00ef\n\20\f\20\16\20\u00f2"+
		"\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00fe\n"+
		"\20\f\20\16\20\u0101\13\20\3\20\3\20\3\20\3\20\3\21\6\21\u0108\n\21\r"+
		"\21\16\21\u0109\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0112\n\22\f\22\16"+
		"\22\u0115\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u0124\n\22\f\22\16\22\u0127\13\22\3\22\3\22\3\22\3\22"+
		"\3\23\6\23\u012e\n\23\r\23\16\23\u012f\3\24\3\24\3\24\3\24\7\24\u0136"+
		"\n\24\f\24\16\24\u0139\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u0145\n\24\f\24\16\24\u0148\13\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\5\30\u0155\n\30\3\30\6\30\u0158\n\30"+
		"\r\30\16\30\u0159\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\7$\u018f\n$\f$\16$\u0192\13$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01ba\n%\3&\3&\7&\u01be"+
		"\n&\f&\16&\u01c1\13&\3&\3&\3&\3&\3&\3&\3&\6&\u01ca\n&\r&\16&\u01cb\3&"+
		"\3&\3&\3&\3&\3&\7&\u01d4\n&\f&\16&\u01d7\13&\3&\3&\7&\u01db\n&\f&\16&"+
		"\u01de\13&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01ec\n&\3&\3&\3&\3"+
		"&\3\'\6\'\u01f3\n\'\r\'\16\'\u01f4\3\'\3\'\3(\3(\3(\3(\7(\u01fd\n(\f("+
		"\16(\u0200\13(\3(\3(\3(\3(\3(\3(\3(\7(\u0209\n(\f(\16(\u020c\13(\3(\3"+
		"(\3(\3(\3)\6)\u0213\n)\r)\16)\u0214\3^\2*\b\3\n\4\f\5\16\6\20\7\22\b\24"+
		"\t\26\n\30\13\32\2\34\2\36\2 \f\"\r$\16&\17(\20*\21,\22.\23\60\24\62\25"+
		"\64\26\66\278\30:\31<\32>\33@\34B\35D\36F\37H J!L\"N\2P#R$T%V&\b\2\3\4"+
		"\5\6\7\r\5\2\13\f\17\17\"\"\4\2$$>>\4\2))>>\3\2\62;\5\2\u00b9\u00b9\u0302"+
		"\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902"+
		"\ufdd1\ufdf2\uffff\3\2>>\3\2//\5\2C\\aac|\6\2\62;C\\aac|\4\2>>@@\2\u0231"+
		"\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\3\20\3\2\2\2\3\22\3"+
		"\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\4 \3\2\2\2\4\"\3\2\2\2\4"+
		"$\3\2\2\2\4&\3\2\2\2\5(\3\2\2\2\5*\3\2\2\2\6,\3\2\2\2\6.\3\2\2\2\6\60"+
		"\3\2\2\2\6\62\3\2\2\2\6\64\3\2\2\2\6\66\3\2\2\2\68\3\2\2\2\6:\3\2\2\2"+
		"\6<\3\2\2\2\6>\3\2\2\2\6@\3\2\2\2\6B\3\2\2\2\6D\3\2\2\2\6F\3\2\2\2\6H"+
		"\3\2\2\2\6J\3\2\2\2\6L\3\2\2\2\6P\3\2\2\2\6R\3\2\2\2\7T\3\2\2\2\7V\3\2"+
		"\2\2\bX\3\2\2\2\nd\3\2\2\2\fj\3\2\2\2\16t\3\2\2\2\20\u0089\3\2\2\2\22"+
		"\u008e\3\2\2\2\24\u0095\3\2\2\2\26\u00a7\3\2\2\2\30\u00a9\3\2\2\2\32\u00ad"+
		"\3\2\2\2\34\u00b3\3\2\2\2\36\u00b6\3\2\2\2 \u00b8\3\2\2\2\"\u00cf\3\2"+
		"\2\2$\u00ec\3\2\2\2&\u0107\3\2\2\2(\u010d\3\2\2\2*\u012d\3\2\2\2,\u0131"+
		"\3\2\2\2.\u014d\3\2\2\2\60\u014f\3\2\2\2\62\u0151\3\2\2\2\64\u0154\3\2"+
		"\2\2\66\u015b\3\2\2\28\u015d\3\2\2\2:\u015f\3\2\2\2<\u0164\3\2\2\2>\u016d"+
		"\3\2\2\2@\u0170\3\2\2\2B\u017b\3\2\2\2D\u0180\3\2\2\2F\u0184\3\2\2\2H"+
		"\u0187\3\2\2\2J\u0189\3\2\2\2L\u018c\3\2\2\2N\u01b9\3\2\2\2P\u01bb\3\2"+
		"\2\2R\u01f2\3\2\2\2T\u01f8\3\2\2\2V\u0212\3\2\2\2XY\7>\2\2YZ\7#\2\2Z^"+
		"\3\2\2\2[]\13\2\2\2\\[\3\2\2\2]`\3\2\2\2^_\3\2\2\2^\\\3\2\2\2_a\3\2\2"+
		"\2`^\3\2\2\2ab\7@\2\2b\t\3\2\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\b\3\2\2i\13\3\2\2\2jk\7>\2\2kl\7A\2\2lm\7z\2"+
		"\2mn\7o\2\2no\7n\2\2op\3\2\2\2pq\5\30\n\2qr\3\2\2\2rs\b\4\3\2s\r\3\2\2"+
		"\2tx\7>\2\2uw\t\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2"+
		"\2zx\3\2\2\2{|\7p\2\2|}\7v\2\2}~\7c\2\2~\u0082\3\2\2\2\177\u0081\t\2\2"+
		"\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7@\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\b\5\4\2\u0088\17\3\2\2\2\u0089\u008a\7A\2\2"+
		"\u008a\u008b\7@\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\6\5\2\u008d\21\3"+
		"\2\2\2\u008e\u0092\5\36\r\2\u008f\u0091\5\34\f\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0095\u0096\7?\2\2\u0096\25\3\2\2\2\u0097\u009b"+
		"\7$\2\2\u0098\u009a\n\3\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a8\7$\2\2\u009f\u00a3\7)\2\2\u00a0\u00a2\n\4\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\7)\2\2\u00a7\u0097\3\2"+
		"\2\2\u00a7\u009f\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\b\n\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\t\5\2\2\u00ae"+
		"\33\3\2\2\2\u00af\u00b4\5\36\r\2\u00b0\u00b4\4/\60\2\u00b1\u00b4\5\32"+
		"\13\2\u00b2\u00b4\t\6\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b7\t\7\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba"+
		"\7\61\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\b\16\5\2\u00ce!\3\2\2\2\u00cf\u00d3\7>\2\2\u00d0\u00d2"+
		"\t\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7f"+
		"\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7n\2\2\u00da\u00db"+
		"\7c\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e5\3\2\2"+
		"\2\u00e2\u00e4\t\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7@\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\17\6\2\u00eb#\3\2\2\2"+
		"\u00ec\u00f0\7>\2\2\u00ed\u00ef\t\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7o\2"+
		"\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa"+
		"\7v\2\2\u00fa\u00fb\7g\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\t\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7@\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\b\20\7\2\u0105%\3\2\2\2\u0106\u0108\t\2\2\2"+
		"\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\21\2\2\u010c\'\3\2\2\2\u010d"+
		"\u010e\7>\2\2\u010e\u010f\7\61\2\2\u010f\u0113\3\2\2\2\u0110\u0112\t\2"+
		"\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7f"+
		"\2\2\u0117\u0118\7g\2\2\u0118\u0119\7e\2\2\u0119\u011a\7n\2\2\u011a\u011b"+
		"\7c\2\2\u011b\u011c\7t\2\2\u011c\u011d\7c\2\2\u011d\u011e\7v\2\2\u011e"+
		"\u011f\7k\2\2\u011f\u0120\7q\2\2\u0120\u0121\7p\2\2\u0121\u0125\3\2\2"+
		"\2\u0122\u0124\t\2\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\7@\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b\22\5\2\u012b)\3\2\2\2"+
		"\u012c\u012e\n\b\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130+\3\2\2\2\u0131\u0132\7>\2\2\u0132\u0133"+
		"\7\61\2\2\u0133\u0137\3\2\2\2\u0134\u0136\t\2\2\2\u0135\u0134\3\2\2\2"+
		"\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7v\2\2\u013b\u013c\7g\2\2\u013c"+
		"\u013d\7o\2\2\u013d\u013e\7r\2\2\u013e\u013f\7n\2\2\u013f\u0140\7c\2\2"+
		"\u0140\u0141\7v\2\2\u0141\u0142\7g\2\2\u0142\u0146\3\2\2\2\u0143\u0145"+
		"\t\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7@"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b\24\5\2\u014c-\3\2\2\2\u014d\u014e"+
		"\7z\2\2\u014e/\3\2\2\2\u014f\u0150\7{\2\2\u0150\61\3\2\2\2\u0151\u0152"+
		"\7?\2\2\u0152\63\3\2\2\2\u0153\u0155\t\t\2\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0158\t\5\2\2\u0157\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\65\3\2\2\2\u015b\u015c\7$\2\2\u015c\67\3\2\2\2\u015d\u015e\7>\2\2\u015e"+
		"9\3\2\2\2\u015f\u0160\7p\2\2\u0160\u0161\7c\2\2\u0161\u0162\7o\2\2\u0162"+
		"\u0163\7g\2\2\u0163;\3\2\2\2\u0164\u0165\7n\2\2\u0165\u0166\7q\2\2\u0166"+
		"\u0167\7e\2\2\u0167\u0168\7c\2\2\u0168\u0169\7v\2\2\u0169\u016a\7k\2\2"+
		"\u016a\u016b\7q\2\2\u016b\u016c\7p\2\2\u016c=\3\2\2\2\u016d\u016e\7k\2"+
		"\2\u016e\u016f\7f\2\2\u016f?\3\2\2\2\u0170\u0171\7v\2\2\u0171\u0172\7"+
		"t\2\2\u0172\u0173\7c\2\2\u0173\u0174\7p\2\2\u0174\u0175\7u\2\2\u0175\u0176"+
		"\7k\2\2\u0176\u0177\7v\2\2\u0177\u0178\7k\2\2\u0178\u0179\7q\2\2\u0179"+
		"\u017a\7p\2\2\u017aA\3\2\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2\u017d"+
		"\u017e\7k\2\2\u017e\u017f\7v\2\2\u017fC\3\2\2\2\u0180\u0181\7t\2\2\u0181"+
		"\u0182\7g\2\2\u0182\u0183\7h\2\2\u0183E\3\2\2\2\u0184\u0185\7>\2\2\u0185"+
		"\u0186\7\61\2\2\u0186G\3\2\2\2\u0187\u0188\7@\2\2\u0188I\3\2\2\2\u0189"+
		"\u018a\7\61\2\2\u018a\u018b\7@\2\2\u018bK\3\2\2\2\u018c\u0190\t\n\2\2"+
		"\u018d\u018f\t\13\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191M\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0194\7$\2\2\u0194\u0195\7k\2\2\u0195\u0196\7p\2\2\u0196\u0197\7x\2\2"+
		"\u0197\u0198\7c\2\2\u0198\u0199\7t\2\2\u0199\u019a\7k\2\2\u019a\u019b"+
		"\7c\2\2\u019b\u019c\7p\2\2\u019c\u019d\7v\2\2\u019d\u01ba\7$\2\2\u019e"+
		"\u019f\7$\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7z\2\2\u01a1\u01a2\7r\2\2"+
		"\u01a2\u01a3\7q\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6"+
		"\7p\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7c\2\2\u01a9"+
		"\u01aa\7n\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7v\2\2"+
		"\u01ad\u01ae\7g\2\2\u01ae\u01ba\7$\2\2\u01af\u01b0\7$\2\2\u01b0\u01b1"+
		"\7e\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7o\2\2\u01b3\u01b4\7o\2\2\u01b4"+
		"\u01b5\7g\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7u\2\2"+
		"\u01b8\u01ba\7$\2\2\u01b9\u0193\3\2\2\2\u01b9\u019e\3\2\2\2\u01b9\u01af"+
		"\3\2\2\2\u01baO\3\2\2\2\u01bb\u01bf\7>\2\2\u01bc\u01be\t\2\2\2\u01bd\u01bc"+
		"\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4\7c\2"+
		"\2\u01c4\u01c5\7d\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7n\2\2\u01c7\u01c9"+
		"\3\2\2\2\u01c8\u01ca\t\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7m"+
		"\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7p\2\2\u01d0\u01d1\7f\2\2\u01d1\u01d5"+
		"\3\2\2\2\u01d2\u01d4\t\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01dc\5\62\27\2\u01d9\u01db\t\2\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01df\u01eb\5N%\2\u01e0\u01e1\7z\2\2\u01e1\u01e2"+
		"\5\62\27\2\u01e2\u01e3\7$\2\2\u01e3\u01e4\5\64\30\2\u01e4\u01e5\7$\2\2"+
		"\u01e5\u01e6\7{\2\2\u01e6\u01e7\5\62\27\2\u01e7\u01e8\7$\2\2\u01e8\u01e9"+
		"\5\64\30\2\u01e9\u01ea\7$\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e0\3\2\2\2"+
		"\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7@\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f0\b&\b\2\u01f0Q\3\2\2\2\u01f1\u01f3\t\2\2\2\u01f2\u01f1"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\b\'\2\2\u01f7S\3\2\2\2\u01f8\u01f9\7>\2\2\u01f9"+
		"\u01fa\7\61\2\2\u01fa\u01fe\3\2\2\2\u01fb\u01fd\t\2\2\2\u01fc\u01fb\3"+
		"\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7n\2\2\u0202\u0203\7c\2"+
		"\2\u0203\u0204\7d\2\2\u0204\u0205\7g\2\2\u0205\u0206\7n\2\2\u0206\u020a"+
		"\3\2\2\2\u0207\u0209\t\2\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020e\7@\2\2\u020e\u020f\3\2\2\2\u020f\u0210\b(\5\2\u0210U"+
		"\3\2\2\2\u0211\u0213\n\f\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215W\3\2\2\2+\2\3\4\5\6\7^fx\u0082"+
		"\u0092\u009b\u00a3\u00a7\u00b3\u00b6\u00be\u00c8\u00d3\u00e5\u00f0\u00ff"+
		"\u0109\u0113\u0125\u012f\u0137\u0146\u0154\u0159\u0190\u01b9\u01bf\u01cb"+
		"\u01d5\u01dc\u01eb\u01f4\u01fe\u020a\u0214\t\b\2\2\7\3\2\7\4\2\6\2\2\7"+
		"\5\2\7\6\2\7\7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}