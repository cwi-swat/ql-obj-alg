// Generated from src/ql_obj_alg_double_extention/parse/ by ANTLR 4.2.2

package ql_obj_alg_double_extention.parse;
import static ql_obj_alg_extended.syntax.TokensWithProperty.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLWithCheckAndModuloLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		WS=25, PROPERTY=26, COMMENT=27, INTEGER=28, STRING=29, TYPE=30, BOOL=31, 
		ID=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'!='", "':'", "'||'", "'>='", "'{'", "'&&'", "'=='", "'<'", "'='", 
		"'}'", "'if'", "'>'", "'<='", "'!'", "'$'", "'%'", "'else'", "'('", "')'", 
		"'*'", "'+'", "'form'", "'-'", "WS", "PROPERTY", "COMMENT", "INTEGER", 
		"STRING", "TYPE", "BOOL", "ID"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WS", 
		"PROPERTY", "COMMENT", "INTEGER", "STRING", "TYPE", "BOOL", "ID"
	};


	public QLWithCheckAndModuloLexer(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\6\32\u0082\n\32\r\32\16\32\u0083\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0093\n\33\3\34\3\34\3\34\3\34"+
		"\7\34\u0099\n\34\f\34\16\34\u009c\13\34\3\34\3\34\3\34\3\34\3\35\6\35"+
		"\u00a3\n\35\r\35\16\35\u00a4\3\36\3\36\3\36\3\36\7\36\u00ab\n\36\f\36"+
		"\16\36\u00ae\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00c6"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00d1\n \3!\3!\7!\u00d5\n!\f!\16!"+
		"\u00d8\13!\4\u009a\u00ac\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\7\5\2\13\f\17\17\"\"\3\2\62;"+
		"\b\2$$^^ddppttvv\4\2C\\c|\6\2\62;C\\aac|\u00e2\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7H\3\2\2\2\tJ\3\2\2\2\13M\3\2\2"+
		"\2\rP\3\2\2\2\17R\3\2\2\2\21U\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2"+
		"\2\2\31^\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37f\3\2\2\2!h\3\2\2\2#j\3\2\2"+
		"\2%l\3\2\2\2\'q\3\2\2\2)s\3\2\2\2+u\3\2\2\2-w\3\2\2\2/y\3\2\2\2\61~\3"+
		"\2\2\2\63\u0081\3\2\2\2\65\u0092\3\2\2\2\67\u0094\3\2\2\29\u00a2\3\2\2"+
		"\2;\u00a6\3\2\2\2=\u00c5\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2CD\7\61"+
		"\2\2D\4\3\2\2\2EF\7#\2\2FG\7?\2\2G\6\3\2\2\2HI\7<\2\2I\b\3\2\2\2JK\7~"+
		"\2\2KL\7~\2\2L\n\3\2\2\2MN\7@\2\2NO\7?\2\2O\f\3\2\2\2PQ\7}\2\2Q\16\3\2"+
		"\2\2RS\7(\2\2ST\7(\2\2T\20\3\2\2\2UV\7?\2\2VW\7?\2\2W\22\3\2\2\2XY\7>"+
		"\2\2Y\24\3\2\2\2Z[\7?\2\2[\26\3\2\2\2\\]\7\177\2\2]\30\3\2\2\2^_\7k\2"+
		"\2_`\7h\2\2`\32\3\2\2\2ab\7@\2\2b\34\3\2\2\2cd\7>\2\2de\7?\2\2e\36\3\2"+
		"\2\2fg\7#\2\2g \3\2\2\2hi\7&\2\2i\"\3\2\2\2jk\7\'\2\2k$\3\2\2\2lm\7g\2"+
		"\2mn\7n\2\2no\7u\2\2op\7g\2\2p&\3\2\2\2qr\7*\2\2r(\3\2\2\2st\7+\2\2t*"+
		"\3\2\2\2uv\7,\2\2v,\3\2\2\2wx\7-\2\2x.\3\2\2\2yz\7h\2\2z{\7q\2\2{|\7t"+
		"\2\2|}\7o\2\2}\60\3\2\2\2~\177\7/\2\2\177\62\3\2\2\2\u0080\u0082\t\2\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\32\2\2\u0086\64\3\2\2\2\u0087"+
		"\u0088\7n\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a\u008b\7i\2\2"+
		"\u008b\u008c\7v\2\2\u008c\u0093\7j\2\2\u008d\u008e\7x\2\2\u008e\u008f"+
		"\7c\2\2\u008f\u0090\7n\2\2\u0090\u0091\7w\2\2\u0091\u0093\7g\2\2\u0092"+
		"\u0087\3\2\2\2\u0092\u008d\3\2\2\2\u0093\66\3\2\2\2\u0094\u0095\7\61\2"+
		"\2\u0095\u0096\7\61\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\f\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\b\34\2\2\u00a08\3\2\2\2\u00a1\u00a3\t\3\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5:\3\2\2\2\u00a6\u00ac\7$\2\2\u00a7\u00a8\7^\2\2\u00a8\u00ab"+
		"\t\4\2\2\u00a9\u00ab\13\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7$\2\2\u00b0<\3\2\2\2\u00b1\u00b2"+
		"\7d\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00c6\7p\2\2\u00b8\u00b9\7u\2\2"+
		"\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00c6\7i\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7i\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\u00c6\7t\2\2\u00c5\u00b1\3\2\2\2\u00c5\u00b8\3\2\2\2\u00c5\u00be"+
		"\3\2\2\2\u00c6>\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7w\2\2\u00ca\u00d1\7g\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d1\7g\2\2\u00d0\u00c7\3\2\2"+
		"\2\u00d0\u00cb\3\2\2\2\u00d1@\3\2\2\2\u00d2\u00d6\t\5\2\2\u00d3\u00d5"+
		"\t\6\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7B\3\2\2\2\u00d8\u00d6\3\2\2\2\f\2\u0083\u0092\u009a"+
		"\u00a4\u00aa\u00ac\u00c5\u00d0\u00d6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}