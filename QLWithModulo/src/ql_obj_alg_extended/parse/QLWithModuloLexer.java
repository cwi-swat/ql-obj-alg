// Generated from src/ql_obj_alg_extended/parse/ by ANTLR 4.2.2

package ql_obj_alg_extended.parse;
import static ql_obj_alg.syntax.Tokens.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLWithModuloLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, WS=24, 
		COMMENT=25, INTEGER=26, STRING=27, TYPE=28, BOOL=29, ID=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'!='", "':'", "'||'", "'>='", "'{'", "'&&'", "'=='", "'<'", "'='", 
		"'}'", "'if'", "'>'", "'<='", "'!'", "'%'", "'else'", "'('", "')'", "'*'", 
		"'+'", "'form'", "'-'", "WS", "COMMENT", "INTEGER", "STRING", "TYPE", 
		"BOOL", "ID"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WS", "COMMENT", "INTEGER", 
		"STRING", "TYPE", "BOOL", "ID"
	};


	public QLWithModuloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "parse"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\6\31|\n\31\r\31"+
		"\16\31}\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0086\n\32\f\32\16\32\u0089"+
		"\13\32\3\32\3\32\3\32\3\32\3\33\6\33\u0090\n\33\r\33\16\33\u0091\3\34"+
		"\3\34\3\34\3\34\7\34\u0098\n\34\f\34\16\34\u009b\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u00b3\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u00be\n\36\3\37\3\37\7\37\u00c2\n\37\f\37\16\37\u00c5"+
		"\13\37\4\u0087\u0099\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= \3\2\7\5\2\13\f\17\17\"\"\3\2\62;\b\2$$^^ddp"+
		"pttvv\4\2C\\c|\6\2\62;C\\aac|\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2"+
		"\2\2\7D\3\2\2\2\tF\3\2\2\2\13I\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21Q\3\2"+
		"\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33]\3\2\2\2\35_\3"+
		"\2\2\2\37b\3\2\2\2!d\3\2\2\2#f\3\2\2\2%k\3\2\2\2\'m\3\2\2\2)o\3\2\2\2"+
		"+q\3\2\2\2-s\3\2\2\2/x\3\2\2\2\61{\3\2\2\2\63\u0081\3\2\2\2\65\u008f\3"+
		"\2\2\2\67\u0093\3\2\2\29\u00b2\3\2\2\2;\u00bd\3\2\2\2=\u00bf\3\2\2\2?"+
		"@\7\61\2\2@\4\3\2\2\2AB\7#\2\2BC\7?\2\2C\6\3\2\2\2DE\7<\2\2E\b\3\2\2\2"+
		"FG\7~\2\2GH\7~\2\2H\n\3\2\2\2IJ\7@\2\2JK\7?\2\2K\f\3\2\2\2LM\7}\2\2M\16"+
		"\3\2\2\2NO\7(\2\2OP\7(\2\2P\20\3\2\2\2QR\7?\2\2RS\7?\2\2S\22\3\2\2\2T"+
		"U\7>\2\2U\24\3\2\2\2VW\7?\2\2W\26\3\2\2\2XY\7\177\2\2Y\30\3\2\2\2Z[\7"+
		"k\2\2[\\\7h\2\2\\\32\3\2\2\2]^\7@\2\2^\34\3\2\2\2_`\7>\2\2`a\7?\2\2a\36"+
		"\3\2\2\2bc\7#\2\2c \3\2\2\2de\7\'\2\2e\"\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7"+
		"u\2\2ij\7g\2\2j$\3\2\2\2kl\7*\2\2l&\3\2\2\2mn\7+\2\2n(\3\2\2\2op\7,\2"+
		"\2p*\3\2\2\2qr\7-\2\2r,\3\2\2\2st\7h\2\2tu\7q\2\2uv\7t\2\2vw\7o\2\2w."+
		"\3\2\2\2xy\7/\2\2y\60\3\2\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\31\2\2\u0080\62\3\2\2\2\u0081\u0082"+
		"\7\61\2\2\u0082\u0083\7\61\2\2\u0083\u0087\3\2\2\2\u0084\u0086\13\2\2"+
		"\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\f\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\32\2\2\u008d\64\3\2\2\2\u008e\u0090\t\3\2"+
		"\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\66\3\2\2\2\u0093\u0099\7$\2\2\u0094\u0095\7^\2\2\u0095"+
		"\u0098\t\4\2\2\u0096\u0098\13\2\2\2\u0097\u0094\3\2\2\2\u0097\u0096\3"+
		"\2\2\2\u0098\u009b\3\2\2\2\u0099\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7$\2\2\u009d8\3\2\2\2\u009e"+
		"\u009f\7d\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7n\2\2"+
		"\u00a2\u00a3\7g\2\2\u00a3\u00a4\7c\2\2\u00a4\u00b3\7p\2\2\u00a5\u00a6"+
		"\7u\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00b3\7i\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2"+
		"\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\u00b3\7t\2\2\u00b2\u009e\3\2\2\2\u00b2\u00a5\3\2\2\2\u00b2"+
		"\u00ab\3\2\2\2\u00b3:\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6"+
		"\u00b7\7w\2\2\u00b7\u00be\7g\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7c\2\2"+
		"\u00ba\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00be\7g\2\2\u00bd\u00b4"+
		"\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be<\3\2\2\2\u00bf\u00c3\t\5\2\2\u00c0"+
		"\u00c2\t\6\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4>\3\2\2\2\u00c5\u00c3\3\2\2\2\13\2}\u0087"+
		"\u0091\u0097\u0099\u00b2\u00bd\u00c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}