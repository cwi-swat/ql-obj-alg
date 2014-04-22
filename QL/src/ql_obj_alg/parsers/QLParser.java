// Generated from src/ql_obj_alg/parsers/QLParser.java by ANTLR 4.2.2

package ql_obj_alg.parsers;
import static ql_obj_alg.object_algebra_interfaces.Tokens.*;
import noa.Builder;

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
		WS=25, INTEGER=26, BOOL=27, STRING=28, COMMENT=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "':'", "'{'", "'||'", "'>='", "'&&'", "'=='", 
		"'<'", "'}'", "'='", "'>'", "'if'", "'<='", "'!'", "'else'", "'('", "')'", 
		"'*'", "'+'", "'form'", "'-'", "TYPE", "ID", "WS", "INTEGER", "BOOL", 
		"STRING", "COMMENT"
	};
	public static final int
		RULE_s = 0, RULE_e = 1, RULE_f = 2;
	public static final String[] ruleNames = {
		"s", "e", "f"
	};

	@Override
	public String getGrammarFileName() { return "QLParser.java"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private ql_obj_alg.object_algebra_interfaces.IAllAlg builder;
	public void setBuilder(ql_obj_alg.object_algebra_interfaces.IAllAlg builder) { this.builder = builder; }
	private static java.util.List<Builder> lift(String name, java.util.List<?> ctxs) {
	 java.util.List<Builder> l = new java.util.ArrayList<Builder>();
		for (Object ctx: ctxs) {
			try {
				l.add((Builder)ctx.getClass().getField(name).get(ctx));
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
		public Builder _s;
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
			int _alt;
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6); match(13);
				setState(7); match(17);
				setState(8); ((SContext)_localctx).e_0 = e(0);
				setState(9); match(18);
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(10); ((SContext)_localctx).s = s();
						((SContext)_localctx).s_1.add(((SContext)_localctx).s);
						}
						} 
					}
					setState(15);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				((SContext)_localctx)._s =  (Builder)builder.iff((Builder)(((SContext)_localctx).e_0._e),lift("_s", ((SContext)_localctx).s_1));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18); match(13);
				setState(19); match(17);
				setState(20); ((SContext)_localctx).e_0 = e(0);
				setState(21); match(18);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13 || _la==ID) {
					{
					{
					setState(22); ((SContext)_localctx).s = s();
					((SContext)_localctx).s_1.add(((SContext)_localctx).s);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28); match(16);
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(29); ((SContext)_localctx).s = s();
						((SContext)_localctx).s_2.add(((SContext)_localctx).s);
						}
						} 
					}
					setState(34);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				((SContext)_localctx)._s =  (Builder)builder.iffelse((Builder)(((SContext)_localctx).e_0._e),lift("_s", ((SContext)_localctx).s_1),lift("_s", ((SContext)_localctx).s_2));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37); ((SContext)_localctx).ID_0 = match(ID);
				setState(38); match(3);
				setState(39); ((SContext)_localctx).STRING_1 = match(STRING);
				setState(40); ((SContext)_localctx).TYPE_2 = match(TYPE);
				setState(41); match(11);
				setState(42); match(17);
				setState(43); ((SContext)_localctx).e_3 = e(0);
				setState(44); match(18);
				((SContext)_localctx)._s =  (Builder)builder.question(id((((SContext)_localctx).ID_0!=null?((SContext)_localctx).ID_0.getText():null)),string((((SContext)_localctx).STRING_1!=null?((SContext)_localctx).STRING_1.getText():null)),type((((SContext)_localctx).TYPE_2!=null?((SContext)_localctx).TYPE_2.getText():null)),(Builder)(((SContext)_localctx).e_3._e));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47); ((SContext)_localctx).ID_0 = match(ID);
				setState(48); match(3);
				setState(49); ((SContext)_localctx).STRING_1 = match(STRING);
				setState(50); ((SContext)_localctx).TYPE_2 = match(TYPE);
				((SContext)_localctx)._s =  (Builder)builder.question(id((((SContext)_localctx).ID_0!=null?((SContext)_localctx).ID_0.getText():null)),string((((SContext)_localctx).STRING_1!=null?((SContext)_localctx).STRING_1.getText():null)),type((((SContext)_localctx).TYPE_2!=null?((SContext)_localctx).TYPE_2.getText():null)));
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
		public Builder _e;
		public EContext e_0;
		public Token BOOL_0;
		public Token STRING_0;
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
			setState(72);
			switch (_input.LA(1)) {
			case 15:
				{
				setState(55); match(15);
				setState(56); ((EContext)_localctx).e_0 = e(6);
				((EContext)_localctx)._e =  (Builder)builder.not((Builder)(((EContext)_localctx).e_0._e));
				}
				break;
			case BOOL:
				{
				setState(59); ((EContext)_localctx).BOOL_0 = match(BOOL);
				((EContext)_localctx)._e =  (Builder)builder.bool(bool((((EContext)_localctx).BOOL_0!=null?((EContext)_localctx).BOOL_0.getText():null)));
				}
				break;
			case STRING:
				{
				setState(61); ((EContext)_localctx).STRING_0 = match(STRING);
				((EContext)_localctx)._e =  (Builder)builder.string(string((((EContext)_localctx).STRING_0!=null?((EContext)_localctx).STRING_0.getText():null)));
				}
				break;
			case 17:
				{
				setState(63); match(17);
				setState(64); ((EContext)_localctx).e_0 = e(0);
				setState(65); match(18);
				((EContext)_localctx)._e =  (Builder)builder.bracket((Builder)(((EContext)_localctx).e_0._e));
				}
				break;
			case INTEGER:
				{
				setState(68); ((EContext)_localctx).INTEGER_0 = match(INTEGER);
				((EContext)_localctx)._e =  (Builder)builder.lit(integer((((EContext)_localctx).INTEGER_0!=null?((EContext)_localctx).INTEGER_0.getText():null)));
				}
				break;
			case ID:
				{
				setState(70); ((EContext)_localctx).ID_0 = match(ID);
				((EContext)_localctx)._e =  (Builder)builder.var(id((((EContext)_localctx).ID_0!=null?((EContext)_localctx).ID_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(74);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(75);
						((EContext)_localctx).op_100 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==1 || _la==19) ) {
							((EContext)_localctx).op_100 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(76); ((EContext)_localctx).e_1 = e(6);
						((EContext)_localctx)._e =  (Builder)((((EContext)_localctx).op_100!=null?((EContext)_localctx).op_100.getText():null).equals("/") ? builder.div((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : ((((EContext)_localctx).op_100!=null?((EContext)_localctx).op_100.getText():null).equals("*") ? builder.mul((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : null));
						}
						break;

					case 2:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(79);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(80);
						((EContext)_localctx).op_90 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==20 || _la==22) ) {
							((EContext)_localctx).op_90 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(81); ((EContext)_localctx).e_1 = e(5);
						((EContext)_localctx)._e =  (Builder)((((EContext)_localctx).op_90!=null?((EContext)_localctx).op_90.getText():null).equals("+") ? builder.add((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : ((((EContext)_localctx).op_90!=null?((EContext)_localctx).op_90.getText():null).equals("-") ? builder.sub((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : null));
						}
						break;

					case 3:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						((EContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 12) | (1L << 14))) != 0)) ) {
							((EContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(86); ((EContext)_localctx).e_1 = e(4);
						((EContext)_localctx)._e =  (Builder)((((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals("<=") ? builder.leq((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : ((((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals("!=") ? builder.neq((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : ((((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals(">=") ? builder.geq((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : ((((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals("==") ? builder.eq((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : ((((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals("<") ? builder.lt((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : ((((EContext)_localctx).op_80!=null?((EContext)_localctx).op_80.getText():null).equals(">") ? builder.gt((Builder)(((EContext)_localctx).e_0._e), (Builder)(((EContext)_localctx).e_1._e)) : null))))));
						}
						break;

					case 4:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90); match(7);
						setState(91); ((EContext)_localctx).e_1 = e(3);
						((EContext)_localctx)._e =  (Builder)builder.and((Builder)(((EContext)_localctx).e_0._e),(Builder)(((EContext)_localctx).e_1._e));
						}
						break;

					case 5:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.e_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(94);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(95); match(5);
						setState(96); ((EContext)_localctx).e_1 = e(2);
						((EContext)_localctx)._e =  (Builder)builder.or((Builder)(((EContext)_localctx).e_0._e),(Builder)(((EContext)_localctx).e_1._e));
						}
						break;
					}
					} 
				}
				setState(103);
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
		public Builder _f;
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
			setState(104); match(21);
			setState(105); ((FContext)_localctx).ID_0 = match(ID);
			setState(106); match(4);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==13 || _la==ID) {
				{
				{
				setState(107); ((FContext)_localctx).s = s();
				((FContext)_localctx).s_1.add(((FContext)_localctx).s);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113); match(10);
			((FContext)_localctx)._f =  (Builder)builder.form(id((((FContext)_localctx).ID_0!=null?((FContext)_localctx).ID_0.getText():null)),lift("_s", ((FContext)_localctx).s_1));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\7\2!\n\2\f\2\16\2"+
		"$\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3f\n\3\f"+
		"\3\16\3i\13\3\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4\3\4\3\4\3\4\3\4"+
		"\2\3\4\5\2\4\6\2\5\4\2\3\3\25\25\4\2\26\26\30\30\7\2\4\4\b\b\n\13\16\16"+
		"\20\20\u0084\2\66\3\2\2\2\4J\3\2\2\2\6j\3\2\2\2\b\t\7\17\2\2\t\n\7\23"+
		"\2\2\n\13\5\4\3\2\13\17\7\24\2\2\f\16\5\2\2\2\r\f\3\2\2\2\16\21\3\2\2"+
		"\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23\b\2\1"+
		"\2\23\67\3\2\2\2\24\25\7\17\2\2\25\26\7\23\2\2\26\27\5\4\3\2\27\33\7\24"+
		"\2\2\30\32\5\2\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2"+
		"\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\"\7\22\2\2\37!\5\2\2\2 \37\3\2\2\2"+
		"!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\b\2\1\2&\67\3"+
		"\2\2\2\'(\7\32\2\2()\7\5\2\2)*\7\36\2\2*+\7\31\2\2+,\7\r\2\2,-\7\23\2"+
		"\2-.\5\4\3\2./\7\24\2\2/\60\b\2\1\2\60\67\3\2\2\2\61\62\7\32\2\2\62\63"+
		"\7\5\2\2\63\64\7\36\2\2\64\65\7\31\2\2\65\67\b\2\1\2\66\b\3\2\2\2\66\24"+
		"\3\2\2\2\66\'\3\2\2\2\66\61\3\2\2\2\67\3\3\2\2\289\b\3\1\29:\7\21\2\2"+
		":;\5\4\3\b;<\b\3\1\2<K\3\2\2\2=>\7\35\2\2>K\b\3\1\2?@\7\36\2\2@K\b\3\1"+
		"\2AB\7\23\2\2BC\5\4\3\2CD\7\24\2\2DE\b\3\1\2EK\3\2\2\2FG\7\34\2\2GK\b"+
		"\3\1\2HI\7\32\2\2IK\b\3\1\2J8\3\2\2\2J=\3\2\2\2J?\3\2\2\2JA\3\2\2\2JF"+
		"\3\2\2\2JH\3\2\2\2Kg\3\2\2\2LM\f\7\2\2MN\t\2\2\2NO\5\4\3\bOP\b\3\1\2P"+
		"f\3\2\2\2QR\f\6\2\2RS\t\3\2\2ST\5\4\3\7TU\b\3\1\2Uf\3\2\2\2VW\f\5\2\2"+
		"WX\t\4\2\2XY\5\4\3\6YZ\b\3\1\2Zf\3\2\2\2[\\\f\4\2\2\\]\7\t\2\2]^\5\4\3"+
		"\5^_\b\3\1\2_f\3\2\2\2`a\f\3\2\2ab\7\7\2\2bc\5\4\3\4cd\b\3\1\2df\3\2\2"+
		"\2eL\3\2\2\2eQ\3\2\2\2eV\3\2\2\2e[\3\2\2\2e`\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2h\5\3\2\2\2ig\3\2\2\2jk\7\27\2\2kl\7\32\2\2lp\7\6\2\2mo\5"+
		"\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7"+
		"\f\2\2tu\b\4\1\2u\7\3\2\2\2\n\17\33\"\66Jegp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}