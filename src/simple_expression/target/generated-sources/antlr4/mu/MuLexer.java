// Generated from mu\Mu.g4 by ANTLR 4.3
package mu;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, SCOL=16, ASSIGN=17, OPAR=18, 
		CPAR=19, OBRACE=20, CBRACE=21, TRUE=22, FALSE=23, NIL=24, IF=25, ELSE=26, 
		WHILE=27, LOG=28, ID=29, INT=30, FLOAT=31, STRING=32, COMMENT=33, SPACE=34, 
		OTHER=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'"
	};
	public static final String[] ruleNames = {
		"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", 
		"OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "IF", "ELSE", "WHILE", "LOG", 
		"ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
	};


	public MuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mu.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u009d"+
		"\n\36\f\36\16\36\u00a0\13\36\3\37\6\37\u00a3\n\37\r\37\16\37\u00a4\3 "+
		"\6 \u00a8\n \r \16 \u00a9\3 \3 \7 \u00ae\n \f \16 \u00b1\13 \3 \3 \6 "+
		"\u00b5\n \r \16 \u00b6\5 \u00b9\n \3!\3!\3!\3!\7!\u00bf\n!\f!\16!\u00c2"+
		"\13!\3!\3!\3\"\3\"\7\"\u00c8\n\"\f\"\16\"\u00cb\13\"\3\"\3\"\3#\3#\3#"+
		"\3#\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5"+
		"\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00dc\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5L"+
		"\3\2\2\2\7O\3\2\2\2\tR\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21\\"+
		"\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35"+
		"i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'s\3\2\2\2)u\3\2\2"+
		"\2+w\3\2\2\2-y\3\2\2\2/~\3\2\2\2\61\u0084\3\2\2\2\63\u0088\3\2\2\2\65"+
		"\u008b\3\2\2\2\67\u0090\3\2\2\29\u0096\3\2\2\2;\u009a\3\2\2\2=\u00a2\3"+
		"\2\2\2?\u00b8\3\2\2\2A\u00ba\3\2\2\2C\u00c5\3\2\2\2E\u00ce\3\2\2\2G\u00d2"+
		"\3\2\2\2IJ\7~\2\2JK\7~\2\2K\4\3\2\2\2LM\7(\2\2MN\7(\2\2N\6\3\2\2\2OP\7"+
		"?\2\2PQ\7?\2\2Q\b\3\2\2\2RS\7#\2\2ST\7?\2\2T\n\3\2\2\2UV\7@\2\2V\f\3\2"+
		"\2\2WX\7>\2\2X\16\3\2\2\2YZ\7@\2\2Z[\7?\2\2[\20\3\2\2\2\\]\7>\2\2]^\7"+
		"?\2\2^\22\3\2\2\2_`\7-\2\2`\24\3\2\2\2ab\7/\2\2b\26\3\2\2\2cd\7,\2\2d"+
		"\30\3\2\2\2ef\7\61\2\2f\32\3\2\2\2gh\7\'\2\2h\34\3\2\2\2ij\7`\2\2j\36"+
		"\3\2\2\2kl\7#\2\2l \3\2\2\2mn\7=\2\2n\"\3\2\2\2op\7?\2\2p$\3\2\2\2qr\7"+
		"*\2\2r&\3\2\2\2st\7+\2\2t(\3\2\2\2uv\7}\2\2v*\3\2\2\2wx\7\177\2\2x,\3"+
		"\2\2\2yz\7v\2\2z{\7t\2\2{|\7w\2\2|}\7g\2\2}.\3\2\2\2~\177\7h\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083"+
		"\60\3\2\2\2\u0084\u0085\7p\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087"+
		"\62\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a\64\3\2\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2"+
		"\u008f\66\3\2\2\2\u0090\u0091\7y\2\2\u0091\u0092\7j\2\2\u0092\u0093\7"+
		"k\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2\u00958\3\2\2\2\u0096\u0097"+
		"\7n\2\2\u0097\u0098\7q\2\2\u0098\u0099\7i\2\2\u0099:\3\2\2\2\u009a\u009e"+
		"\t\2\2\2\u009b\u009d\t\3\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f<\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a1\u00a3\t\4\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5>\3\2\2\2\u00a6\u00a8\t\4\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00af\7\60\2\2\u00ac\u00ae\t\4\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b9\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\7\60\2\2\u00b3"+
		"\u00b5\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00a7\3\2\2\2\u00b8"+
		"\u00b2\3\2\2\2\u00b9@\3\2\2\2\u00ba\u00c0\7$\2\2\u00bb\u00bf\n\5\2\2\u00bc"+
		"\u00bd\7$\2\2\u00bd\u00bf\7$\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7$\2\2\u00c4B\3\2\2\2\u00c5\u00c9"+
		"\7%\2\2\u00c6\u00c8\n\6\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cd\b\"\2\2\u00cdD\3\2\2\2\u00ce\u00cf\t\7\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\b#\2\2\u00d1F\3\2\2\2\u00d2\u00d3\13\2\2\2\u00d3"+
		"H\3\2\2\2\f\2\u009e\u00a4\u00a9\u00af\u00b6\u00b8\u00be\u00c0\u00c9\3"+
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