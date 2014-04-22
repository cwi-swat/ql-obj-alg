// Generated from src/ql_obj_alg/parsers/QLParser.java by ANTLR 4.2.2

package ql_obj_alg.parsers;
import static ql_obj_alg.object_algebra_interfaces.Tokens.*;

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
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, TYPE=23, ID=24, 
		WS=25, INTEGER=26, BOOL=27, STRING=28, COMMENT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'!='", "':'", "'{'", "'||'", "'>='", "'&&'", "'=='", "'<'", "'}'", 
		"'='", "'>'", "'if'", "'<='", "'!'", "'else'", "'('", "')'", "'*'", "'+'", 
		"'form'", "'-'", "TYPE", "ID", "WS", "INTEGER", "BOOL", "STRING", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "TYPE", "ID", "WS", "INTEGER", 
		"BOOL", "STRING", "COMMENT"
	};


	public QLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QLParser.java"; }

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
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u008b\n\30\3\31\3\31\7\31\u008f\n\31\f\31\16\31\u0092\13\31\3\32\6\32"+
		"\u0095\n\32\r\32\16\32\u0096\3\32\3\32\3\33\6\33\u009c\n\33\r\33\16\33"+
		"\u009d\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00a9\n\34\3"+
		"\35\3\35\3\35\3\35\7\35\u00af\n\35\f\35\16\35\u00b2\13\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\7\36\u00ba\n\36\f\36\16\36\u00bd\13\36\3\36\3\36\3"+
		"\36\3\36\4\u00b0\u00bb\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37\3\2\7\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17"+
		"\"\"\3\2\62;\b\2$$^^ddppttvv\u00ca\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7B\3\2\2"+
		"\2\tD\3\2\2\2\13F\3\2\2\2\rI\3\2\2\2\17L\3\2\2\2\21O\3\2\2\2\23R\3\2\2"+
		"\2\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35]\3\2\2\2\37`\3\2"+
		"\2\2!b\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'k\3\2\2\2)m\3\2\2\2+o\3\2\2\2-t\3"+
		"\2\2\2/\u008a\3\2\2\2\61\u008c\3\2\2\2\63\u0094\3\2\2\2\65\u009b\3\2\2"+
		"\2\67\u00a8\3\2\2\29\u00aa\3\2\2\2;\u00b5\3\2\2\2=>\7\61\2\2>\4\3\2\2"+
		"\2?@\7#\2\2@A\7?\2\2A\6\3\2\2\2BC\7<\2\2C\b\3\2\2\2DE\7}\2\2E\n\3\2\2"+
		"\2FG\7~\2\2GH\7~\2\2H\f\3\2\2\2IJ\7@\2\2JK\7?\2\2K\16\3\2\2\2LM\7(\2\2"+
		"MN\7(\2\2N\20\3\2\2\2OP\7?\2\2PQ\7?\2\2Q\22\3\2\2\2RS\7>\2\2S\24\3\2\2"+
		"\2TU\7\177\2\2U\26\3\2\2\2VW\7?\2\2W\30\3\2\2\2XY\7@\2\2Y\32\3\2\2\2Z"+
		"[\7k\2\2[\\\7h\2\2\\\34\3\2\2\2]^\7>\2\2^_\7?\2\2_\36\3\2\2\2`a\7#\2\2"+
		"a \3\2\2\2bc\7g\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2f\"\3\2\2\2gh\7*\2\2h$\3"+
		"\2\2\2ij\7+\2\2j&\3\2\2\2kl\7,\2\2l(\3\2\2\2mn\7-\2\2n*\3\2\2\2op\7h\2"+
		"\2pq\7q\2\2qr\7t\2\2rs\7o\2\2s,\3\2\2\2tu\7/\2\2u.\3\2\2\2vw\7d\2\2wx"+
		"\7q\2\2xy\7q\2\2yz\7n\2\2z{\7g\2\2{|\7c\2\2|\u008b\7p\2\2}~\7u\2\2~\177"+
		"\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u008b"+
		"\7i\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7i\2\2\u0088\u0089\7g\2\2\u0089\u008b\7t\2\2"+
		"\u008av\3\2\2\2\u008a}\3\2\2\2\u008a\u0083\3\2\2\2\u008b\60\3\2\2\2\u008c"+
		"\u0090\t\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\62\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\32"+
		"\2\2\u0099\64\3\2\2\2\u009a\u009c\t\5\2\2\u009b\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\66\3\2\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a9\7g\2\2"+
		"\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7"+
		"\7u\2\2\u00a7\u00a9\7g\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9"+
		"8\3\2\2\2\u00aa\u00b0\7$\2\2\u00ab\u00ac\7^\2\2\u00ac\u00af\t\6\2\2\u00ad"+
		"\u00af\13\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7\61\2\2"+
		"\u00b6\u00b7\7\61\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\b\36\2\2\u00c1<\3\2\2\2\13\2\u008a\u0090\u0096\u009d"+
		"\u00a8\u00ae\u00b0\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}