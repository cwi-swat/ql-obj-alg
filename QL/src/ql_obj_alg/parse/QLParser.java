// Generated from src/ql_obj_alg/parse/ by ANTLR 4.2.2

package ql_obj_alg.parse;
import static ql_obj_alg.syntax.Tokens.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, TYPE=23, ID=24, 
		STRING=25, INTEGER=26, BOOL=27, WS=28, COMMENT=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "':'", "'||'", "'>='", "'{'", "'&&'", "'=='", 
		"'<'", "'='", "'}'", "'>'", "'if'", "'<='", "'!'", "'else'", "'('", "')'", 
		"'*'", "'+'", "'form'", "'-'", "TYPE", "ID", "STRING", "INTEGER", "BOOL", 
		"WS", "COMMENT"
	};
	public static final int
		RULE_s = 0, RULE_e = 1, RULE_f = 2;
	public static final String[] ruleNames = {
		"s", "e", "f"
	};

	@Override
	public String getGrammarFileName() { return "parse"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private ql_obj_alg.syntax.IAllAlg builder;
	public void setBuilder(ql_obj_alg.syntax.IAllAlg builder) { this.builder = builder; }
	private static <X> java.util.List<X> lift(String name, java.util.List<?> ctxs, X ...heads) {
	  java.util.List<X> l = new java.util.ArrayList<X>();
	  for (X h: heads) { l.add(h); }
	  for (Object ctx: ctxs) {
	    try {
	      l.add((X)ctx.getClass().getField(name).get(ctx));
	    } catch (Throwable e) {
	      throw new RuntimeException(e);
	    }
	  }
	  return l;
	}

	public QLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public Object _s;
		public EContext e_0;
		public SContext s;
		public List<SContext> s_1 = new ArrayList<SContext>();
		public List<SContext> s_2 = new ArrayList<SContext>();
		public Token ID_0;
		public Token STRING_1;
		public Token TYPE_2;
		public EContext e_3;
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(QLParser.TYPE, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode STRING() { return getToken(QLParser.STRING, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6); match(13);
				setState(7); match(17);
				setState(8); ((SContext)_localctx).e_0 = e(0);
				setState(9); match(18);
				setState(10); match(6);
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13 || _la==ID) {
					{
					{
					setState(11); ((SContext)_localctx).s = s();
					((SContext)_localctx).s_1.add(((SContext)_localctx).s);
					}
					}
					setState(16);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(17); match(11);
				((SContext)_localctx)._s =  builder.iff((((SContext)_localctx).e_0._e),lift("_s", ((SContext)_localctx).s_1));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20); match(13);
				setState(21); match(17);
				setState(22); ((SContext)_localctx).e_0 = e(0);
				setState(23); match(18);
				setState(24); match(6);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13 || _la==ID) {
					{
					{
					setState(25); ((SContext)_localctx).s = s();
					((SContext)_localctx).s_1.add(((SContext)_localctx).s);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(31); match(11);
				setState(32); match(16);
				setState(33); match(6);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13 || _la==ID) {
					{
					{
					setState(34); ((SContext)_localctx).s = s();
					((SContext)_localctx).s_2.add(((SContext)_localctx).s);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40); match(11);
				((SContext)_localctx)._s =  builder.iffelse((((SContext)_localctx).e_0._e),lift("_s", ((SContext)_localctx).s_1),lift("_s", ((SContext)_localctx).s_2));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); ((SContext)_localctx).ID_0 = match(ID);
				setState(44); match(3);
				setState(45); ((SContext)_localctx).STRING_1 = match(STRING);
				setState(46); ((SContext)_localctx).TYPE_2 = match(TYPE);
				((SContext)_localctx)._s =  builder.question(id((((SContext)_localctx).ID_0!=null?((SContext)_localctx).ID_0.getText():null)),string((((SContext)_localctx).STRING_1!=null?((SContext)_localctx).STRING_1.getText():null)),type((((SContext)_localctx).TYPE_2!=null?((SContext)_localctx).TYPE_2.getText():null)));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48); ((SContext)_localctx).ID_0 = match(ID);
				setState(49); match(3);
				setState(50); ((SContext)_localctx).STRING_1 = match(STRING);
				setState(51); ((SContext)_localctx).TYPE_2 = match(TYPE);
				setState(52); match(10);
				setState(53); match(17);
				setState(54); ((SContext)_localctx).e_3 = e(0);
				setState(55); match(18);
				((SContext)_localctx)._s =  builder.question(id((((SContext)_localctx).ID_0!=null?((SContext)_localctx).ID_0.getText():null)),string((((SContext)_localctx).STRING_1!=null?((SContext)_localctx).STRING_1.getText():null)),type((((SContext)_localctx).TYPE_2!=null?((SContext)_localctx).TYPE_2.getText():null)),(((SContext)_localctx).e_3._e));
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

	public static class EContext extends ParserRuleContext {
		public Object _e;
		public EContext e_0;
		public Token STRING_0;
		public Token BOOL_0;
		public Token INTEGER_0;
		public Token ID_0;
		public Token op_100;
		public EContext e_1;
		public Token op_90;
		public Token op_80;
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public TerminalNode BOOL() { return getToken(QLParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(QLParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(QLParser.STRING, 0); }
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			switch (_input.LA(1)) {
			case 15:
				{
				setState(61); match(15);
				setState(62); ((EContext)_localctx).e_0 = e(6);
				((EContext)_localctx)._e =  builder.not((((EContext)_localctx).e_0._e));
				}
				break;
			case STRING:
				{
				setState(65); ((EContext)_localctx).STRING_0 = match(STRING);
				((EContext)_localctx)._e =  builder.string(string((((EContext)_localctx).STRING_0!=null?((EContext)_localctx).STRING_0.getText():null)));
				}
				break;
			case BOOL:
				{
				setState(67); ((EContext)_localctx).BOOL_0 = match(BOOL);
				((EContext)_localctx)._e =  builder.bool(bool((((EContext)_localctx).BOOL_0!=null?((EContext)_localctx).BOOL_0.getText():null)));
				}
				break;
			case 17:
				{
				setState(69); match(17);
				setState(70); ((EContext)_localctx).e_0 = e(0);
				setState(71); match(18);
				((EContext)_localctx)._e =  builder.bracket((((EContext)_localctx).e_0._e));
				}
				break;
			case INTEGER:
				{
				setState(74); ((EContext)_localctx).INTEGER_0 = match(INTEGER);
				((EContext)_localctx)._e =  builder.lit(integer((((EContext)_localctx).INTEGER_0!=null?((EContext)_localctx).INTEGER_0.getText():null)));
				}
				break;
			case ID:
				{
				setState(76); ((EContext)_localctx).ID_0 = match(ID);
				((EContext)_localctx)._e =  builder.var(id((((EContext)_localctx).ID_0!=null?((EContext)_localctx).ID_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(80);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(81);
						((EContext)_localctx).op_100 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==1 || _la==19) ) {
							((EContext)_localctx).op_100 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(82); ((EContext)_localctx).e_1 = e(6);
						((EContext)_localctx)._e =  (((EContext)_localctx).op_100!=null?((EContext)_localctx).op_100.getText():null).equals("/") ? builder.div(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : (((EContext)_localctx).op_100!=null?((EContext)_localctx).op_100.getText():null).equals("*") ? builder.mul(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : null;
						}
						break;

					case 2:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						((EContext)_localctx).op_90 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==20 || _la==22) ) {
							((EContext)_localctx).op_90 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(87); ((EContext)_localctx).e_1 = e(5);
						((EContext)_localctx)._e =  (((EContext)_localctx).op_90!=null?((EContext)_localctx).op_90.getText():null).equals("+") ? builder.add(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : (((EContext)_localctx).op_90!=null?((EContext)_localctx).op_90.getText():null).equals("-") ? builder.sub(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : null;
						}
						break;

					case 3:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(90);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(91);
						((EContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 8) | (1L << 9) | (1L << 12) | (1L << 14))) != 0)) ) {
							((EContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(92); ((EContext)_localctx).e_1 = e(4);
						((EContext)_localctx)._e =  (((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals("<=") ? builder.leq(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : (((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals("!=") ? builder.neq(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : (((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals(">=") ? builder.geq(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : (((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals("==") ? builder.eq(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : (((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals("<") ? builder.lt(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : (((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals(">") ? builder.gt(((EContext)_localctx).e_0._e, ((EContext)_localctx).e_1._e) : null;
						}
						break;

					case 4:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(95);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(96); match(7);
						setState(97); ((EContext)_localctx).e_1 = e(3);
						((EContext)_localctx)._e =  builder.and((((EContext)_localctx).e_0._e),(((EContext)_localctx).e_1._e));
						}
						break;

					case 5:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(100);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(101); match(4);
						setState(102); ((EContext)_localctx).e_1 = e(2);
						((EContext)_localctx)._e =  builder.or((((EContext)_localctx).e_0._e),(((EContext)_localctx).e_1._e));
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class FContext extends ParserRuleContext {
		public Object _f;
		public Token ID_0;
		public SContext s;
		public List<SContext> s_1 = new ArrayList<SContext>();
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_f);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(21);
			setState(111); ((FContext)_localctx).ID_0 = match(ID);
			setState(112); match(6);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==13 || _la==ID) {
				{
				{
				setState(113); ((FContext)_localctx).s = s();
				((FContext)_localctx).s_1.add(((FContext)_localctx).s);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119); match(11);
			((FContext)_localctx)._f =  builder.form(id((((FContext)_localctx).ID_0!=null?((FContext)_localctx).ID_0.getText():null)),lift("_s", ((FContext)_localctx).s_1));
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
		case 1: return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 4);

		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);

		case 4: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\2\3\2"+
		"\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\4\3\4\3\4\3\4\7\4u\n\4\f\4\16\4x\13"+
		"\4\3\4\3\4\3\4\3\4\2\3\4\5\2\4\6\2\5\4\2\3\3\25\25\4\2\26\26\30\30\7\2"+
		"\4\4\7\7\n\13\16\16\20\20\u008a\2<\3\2\2\2\4P\3\2\2\2\6p\3\2\2\2\b\t\7"+
		"\17\2\2\t\n\7\23\2\2\n\13\5\4\3\2\13\f\7\24\2\2\f\20\7\b\2\2\r\17\5\2"+
		"\2\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2"+
		"\2\2\22\20\3\2\2\2\23\24\7\r\2\2\24\25\b\2\1\2\25=\3\2\2\2\26\27\7\17"+
		"\2\2\27\30\7\23\2\2\30\31\5\4\3\2\31\32\7\24\2\2\32\36\7\b\2\2\33\35\5"+
		"\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2"+
		"\2 \36\3\2\2\2!\"\7\r\2\2\"#\7\22\2\2#\'\7\b\2\2$&\5\2\2\2%$\3\2\2\2&"+
		")\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\r\2\2+,\b\2\1"+
		"\2,=\3\2\2\2-.\7\32\2\2./\7\5\2\2/\60\7\33\2\2\60\61\7\31\2\2\61=\b\2"+
		"\1\2\62\63\7\32\2\2\63\64\7\5\2\2\64\65\7\33\2\2\65\66\7\31\2\2\66\67"+
		"\7\f\2\2\678\7\23\2\289\5\4\3\29:\7\24\2\2:;\b\2\1\2;=\3\2\2\2<\b\3\2"+
		"\2\2<\26\3\2\2\2<-\3\2\2\2<\62\3\2\2\2=\3\3\2\2\2>?\b\3\1\2?@\7\21\2\2"+
		"@A\5\4\3\bAB\b\3\1\2BQ\3\2\2\2CD\7\33\2\2DQ\b\3\1\2EF\7\35\2\2FQ\b\3\1"+
		"\2GH\7\23\2\2HI\5\4\3\2IJ\7\24\2\2JK\b\3\1\2KQ\3\2\2\2LM\7\34\2\2MQ\b"+
		"\3\1\2NO\7\32\2\2OQ\b\3\1\2P>\3\2\2\2PC\3\2\2\2PE\3\2\2\2PG\3\2\2\2PL"+
		"\3\2\2\2PN\3\2\2\2Qm\3\2\2\2RS\f\7\2\2ST\t\2\2\2TU\5\4\3\bUV\b\3\1\2V"+
		"l\3\2\2\2WX\f\6\2\2XY\t\3\2\2YZ\5\4\3\7Z[\b\3\1\2[l\3\2\2\2\\]\f\5\2\2"+
		"]^\t\4\2\2^_\5\4\3\6_`\b\3\1\2`l\3\2\2\2ab\f\4\2\2bc\7\t\2\2cd\5\4\3\5"+
		"de\b\3\1\2el\3\2\2\2fg\f\3\2\2gh\7\6\2\2hi\5\4\3\4ij\b\3\1\2jl\3\2\2\2"+
		"kR\3\2\2\2kW\3\2\2\2k\\\3\2\2\2ka\3\2\2\2kf\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2n\5\3\2\2\2om\3\2\2\2pq\7\27\2\2qr\7\32\2\2rv\7\b\2\2su\5"+
		"\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7"+
		"\r\2\2z{\b\4\1\2{\7\3\2\2\2\n\20\36\'<Pkmv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}