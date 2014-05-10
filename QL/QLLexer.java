// Generated from src/ql_obj_alg/parse/ by ANTLR 4.2.2

package ql_obj_alg.parse;
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
public class QLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, COMMENT=23, TYPE=24, 
		ID=25, STRING=26, BOOL=27, INTEGER=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'!='", "':'", "'||'", "'>='", "'{'", "'&&'", "'=='", "'<'", "'='", 
		"'}'", "'if'", "'>'", "'<='", "'!'", "'else'", "'('", "')'", "'*'", "'+'", 
		"'form'", "'-'", "COMMENT", "TYPE", "ID", "STRING", "BOOL", "INTEGER", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "COMMENT", "TYPE", "ID", "STRING", 
		"BOOL", "INTEGER", "WS"
	};


	public QLLexer(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00c2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30{\n\30\f\30"+
		"\16\30~\13\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0098"+
		"\n\31\3\32\3\32\7\32\u009c\n\32\f\32\16\32\u009f\13\32\3\33\3\33\3\33"+
		"\3\33\7\33\u00a5\n\33\f\33\16\33\u00a8\13\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00b5\n\34\3\35\6\35\u00b8\n\35\r"+
		"\35\16\35\u00b9\3\36\6\36\u00bd\n\36\r\36\16\36\u00be\3\36\3\36\4|\u00a6"+
		"\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37\3\2\7\4\2C\\c|\6\2\62;C\\aac|\b\2$$^^ddppttvv\3\2\62;\5\2\13\f\17"+
		"\17\"\"\u00ca\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13G\3\2"+
		"\2\2\rJ\3\2\2\2\17L\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3"+
		"\2\2\2\31X\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#g\3\2"+
		"\2\2%i\3\2\2\2\'k\3\2\2\2)m\3\2\2\2+o\3\2\2\2-t\3\2\2\2/v\3\2\2\2\61\u0097"+
		"\3\2\2\2\63\u0099\3\2\2\2\65\u00a0\3\2\2\2\67\u00b4\3\2\2\29\u00b7\3\2"+
		"\2\2;\u00bc\3\2\2\2=>\7\61\2\2>\4\3\2\2\2?@\7#\2\2@A\7?\2\2A\6\3\2\2\2"+
		"BC\7<\2\2C\b\3\2\2\2DE\7~\2\2EF\7~\2\2F\n\3\2\2\2GH\7@\2\2HI\7?\2\2I\f"+
		"\3\2\2\2JK\7}\2\2K\16\3\2\2\2LM\7(\2\2MN\7(\2\2N\20\3\2\2\2OP\7?\2\2P"+
		"Q\7?\2\2Q\22\3\2\2\2RS\7>\2\2S\24\3\2\2\2TU\7?\2\2U\26\3\2\2\2VW\7\177"+
		"\2\2W\30\3\2\2\2XY\7k\2\2YZ\7h\2\2Z\32\3\2\2\2[\\\7@\2\2\\\34\3\2\2\2"+
		"]^\7>\2\2^_\7?\2\2_\36\3\2\2\2`a\7#\2\2a \3\2\2\2bc\7g\2\2cd\7n\2\2de"+
		"\7u\2\2ef\7g\2\2f\"\3\2\2\2gh\7*\2\2h$\3\2\2\2ij\7+\2\2j&\3\2\2\2kl\7"+
		",\2\2l(\3\2\2\2mn\7-\2\2n*\3\2\2\2op\7h\2\2pq\7q\2\2qr\7t\2\2rs\7o\2\2"+
		"s,\3\2\2\2tu\7/\2\2u.\3\2\2\2vw\7\61\2\2wx\7\61\2\2x|\3\2\2\2y{\13\2\2"+
		"\2zy\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7\f\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\30\2\2\u0082\60\3\2\2"+
		"\2\u0083\u0084\7d\2\2\u0084\u0085\7q\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089\7c\2\2\u0089\u0098\7p\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2"+
		"\u008e\u008f\7p\2\2\u008f\u0098\7i\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094\u0095\7i\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0098\7t\2\2\u0097\u0083\3\2\2\2\u0097\u008a\3\2\2"+
		"\2\u0097\u0090\3\2\2\2\u0098\62\3\2\2\2\u0099\u009d\t\2\2\2\u009a\u009c"+
		"\t\3\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\64\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a6\7$\2\2"+
		"\u00a1\u00a2\7^\2\2\u00a2\u00a5\t\4\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a1"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7$"+
		"\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae"+
		"\7w\2\2\u00ae\u00b5\7g\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b5\7g\2\2\u00b4\u00ab\3\2\2"+
		"\2\u00b4\u00af\3\2\2\2\u00b58\3\2\2\2\u00b6\u00b8\t\5\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		":\3\2\2\2\u00bb\u00bd\t\6\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\b\36\2\2\u00c1<\3\2\2\2\13\2|\u0097\u009d\u00a4\u00a6\u00b4\u00b9\u00be"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}