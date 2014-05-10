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
		COMMENT=25, BOOL=26, INTEGER=27, STRING=28, WS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "':'", "'||'", "'>='", "'{'", "'&&'", "'=='", 
		"'<'", "'='", "'}'", "'if'", "'>'", "'<='", "'!'", "'else'", "'('", "')'", 
		"'*'", "'+'", "'form'", "'-'", "TYPE", "ID", "COMMENT", "BOOL", "INTEGER", 
		"STRING", "WS"
	};
	public static final int
		RULE_form = 0, RULE_exp = 1, RULE_stmt = 2;
	public static final String[] ruleNames = {
		"form", "exp", "stmt"
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
	public static class FormContext extends ParserRuleContext {
		public Object _form;
		public Token ID_0;
		public StmtContext stmt;
		public List<StmtContext> stmt_1 = new ArrayList<StmtContext>();
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); match(21);
			setState(7); ((FormContext)_localctx).ID_0 = match(ID);
			setState(8); match(6);
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==12 || _la==ID) {
				{
				{
				setState(9); ((FormContext)_localctx).stmt = stmt();
				((FormContext)_localctx).stmt_1.add(((FormContext)_localctx).stmt);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15); match(11);
			((FormContext)_localctx)._form =  builder.form(id((((FormContext)_localctx).ID_0!=null?((FormContext)_localctx).ID_0.getText():null)),lift("_stmt", ((FormContext)_localctx).stmt_1));
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

	public static class ExpContext extends ParserRuleContext {
		public Object _exp;
		public ExpContext exp_0;
		public Token INTEGER_0;
		public Token BOOL_0;
		public Token STRING_0;
		public Token ID_0;
		public Token op_100;
		public ExpContext exp_1;
		public Token op_90;
		public Token op_80;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(QLParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(QLParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(QLParser.STRING, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			switch (_input.LA(1)) {
			case 15:
				{
				setState(19); match(15);
				setState(20); ((ExpContext)_localctx).exp_0 = exp(6);
				((ExpContext)_localctx)._exp =  builder.not((((ExpContext)_localctx).exp_0._exp));
				}
				break;
			case INTEGER:
				{
				setState(23); ((ExpContext)_localctx).INTEGER_0 = match(INTEGER);
				((ExpContext)_localctx)._exp =  builder.lit(integer((((ExpContext)_localctx).INTEGER_0!=null?((ExpContext)_localctx).INTEGER_0.getText():null)));
				}
				break;
			case BOOL:
				{
				setState(25); ((ExpContext)_localctx).BOOL_0 = match(BOOL);
				((ExpContext)_localctx)._exp =  builder.bool(bool((((ExpContext)_localctx).BOOL_0!=null?((ExpContext)_localctx).BOOL_0.getText():null)));
				}
				break;
			case 17:
				{
				setState(27); match(17);
				setState(28); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(29); match(18);
				((ExpContext)_localctx)._exp =  builder.bracket((((ExpContext)_localctx).exp_0._exp));
				}
				break;
			case STRING:
				{
				setState(32); ((ExpContext)_localctx).STRING_0 = match(STRING);
				((ExpContext)_localctx)._exp =  builder.string(string((((ExpContext)_localctx).STRING_0!=null?((ExpContext)_localctx).STRING_0.getText():null)));
				}
				break;
			case ID:
				{
				setState(34); ((ExpContext)_localctx).ID_0 = match(ID);
				((ExpContext)_localctx)._exp =  builder.var(id((((ExpContext)_localctx).ID_0!=null?((ExpContext)_localctx).ID_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(38);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(39);
						((ExpContext)_localctx).op_100 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==1 || _la==19) ) {
							((ExpContext)_localctx).op_100 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(40); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_100!=null?((ExpContext)_localctx).op_100.getText():null).equals("/") ? builder.div(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_100!=null?((ExpContext)_localctx).op_100.getText():null).equals("*") ? builder.mul(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44);
						((ExpContext)_localctx).op_90 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==20 || _la==22) ) {
							((ExpContext)_localctx).op_90 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(45); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_90!=null?((ExpContext)_localctx).op_90.getText():null).equals("+") ? builder.add(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_90!=null?((ExpContext)_localctx).op_90.getText():null).equals("-") ? builder.sub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 14))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(50); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.leq(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("!=") ? builder.neq(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.geq(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("==") ? builder.eq(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.lt(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.gt(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(53);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(54); match(7);
						setState(55); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.and((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(58);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(59); match(4);
						setState(60); ((ExpContext)_localctx).exp_1 = exp(2);
						((ExpContext)_localctx)._exp =  builder.or((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class StmtContext extends ParserRuleContext {
		public Object _stmt;
		public ExpContext exp_0;
		public StmtContext stmt;
		public List<StmtContext> stmt_1 = new ArrayList<StmtContext>();
		public List<StmtContext> stmt_2 = new ArrayList<StmtContext>();
		public Token ID_0;
		public Token STRING_1;
		public Token TYPE_2;
		public ExpContext exp_3;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(QLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(QLParser.TYPE, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode STRING() { return getToken(QLParser.STRING, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		int _la;
		try {
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(12);
				setState(69); match(17);
				setState(70); ((StmtContext)_localctx).exp_0 = exp(0);
				setState(71); match(18);
				setState(72); match(6);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(73); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_1.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79); match(11);
				((StmtContext)_localctx)._stmt =  builder.iff((((StmtContext)_localctx).exp_0._exp),lift("_stmt", ((StmtContext)_localctx).stmt_1));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(12);
				setState(83); match(17);
				setState(84); ((StmtContext)_localctx).exp_0 = exp(0);
				setState(85); match(18);
				setState(86); match(6);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(87); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_1.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93); match(11);
				setState(94); match(16);
				setState(95); match(6);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(96); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_2.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102); match(11);
				((StmtContext)_localctx)._stmt =  builder.iffelse((((StmtContext)_localctx).exp_0._exp),lift("_stmt", ((StmtContext)_localctx).stmt_1),lift("_stmt", ((StmtContext)_localctx).stmt_2));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); ((StmtContext)_localctx).ID_0 = match(ID);
				setState(106); match(3);
				setState(107); ((StmtContext)_localctx).STRING_1 = match(STRING);
				setState(108); ((StmtContext)_localctx).TYPE_2 = match(TYPE);
				((StmtContext)_localctx)._stmt =  builder.question(id((((StmtContext)_localctx).ID_0!=null?((StmtContext)_localctx).ID_0.getText():null)),string((((StmtContext)_localctx).STRING_1!=null?((StmtContext)_localctx).STRING_1.getText():null)),type((((StmtContext)_localctx).TYPE_2!=null?((StmtContext)_localctx).TYPE_2.getText():null)));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110); ((StmtContext)_localctx).ID_0 = match(ID);
				setState(111); match(3);
				setState(112); ((StmtContext)_localctx).STRING_1 = match(STRING);
				setState(113); ((StmtContext)_localctx).TYPE_2 = match(TYPE);
				setState(114); match(10);
				setState(115); match(17);
				setState(116); ((StmtContext)_localctx).exp_3 = exp(0);
				setState(117); match(18);
				((StmtContext)_localctx)._stmt =  builder.question(id((((StmtContext)_localctx).ID_0!=null?((StmtContext)_localctx).ID_0.getText():null)),string((((StmtContext)_localctx).STRING_1!=null?((StmtContext)_localctx).STRING_1.getText():null)),type((((StmtContext)_localctx).TYPE_2!=null?((StmtContext)_localctx).TYPE_2.getText():null)),(((StmtContext)_localctx).exp_3._exp));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
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
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3B\n\3\f\3\16\3E\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\3\4\3\4\7\4d\n\4\f\4\16\4g\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4{\n\4\3\4\2\3\4\5\2\4\6\2\5\4\2\3\3\25\25\4\2\26\26\30\30\6\2\4"+
		"\4\7\7\n\13\17\20\u008a\2\b\3\2\2\2\4&\3\2\2\2\6z\3\2\2\2\b\t\7\27\2\2"+
		"\t\n\7\32\2\2\n\16\7\b\2\2\13\r\5\6\4\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f"+
		"\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\r\2\2\22\23"+
		"\b\2\1\2\23\3\3\2\2\2\24\25\b\3\1\2\25\26\7\21\2\2\26\27\5\4\3\b\27\30"+
		"\b\3\1\2\30\'\3\2\2\2\31\32\7\35\2\2\32\'\b\3\1\2\33\34\7\34\2\2\34\'"+
		"\b\3\1\2\35\36\7\23\2\2\36\37\5\4\3\2\37 \7\24\2\2 !\b\3\1\2!\'\3\2\2"+
		"\2\"#\7\36\2\2#\'\b\3\1\2$%\7\32\2\2%\'\b\3\1\2&\24\3\2\2\2&\31\3\2\2"+
		"\2&\33\3\2\2\2&\35\3\2\2\2&\"\3\2\2\2&$\3\2\2\2\'C\3\2\2\2()\f\7\2\2)"+
		"*\t\2\2\2*+\5\4\3\b+,\b\3\1\2,B\3\2\2\2-.\f\6\2\2./\t\3\2\2/\60\5\4\3"+
		"\7\60\61\b\3\1\2\61B\3\2\2\2\62\63\f\5\2\2\63\64\t\4\2\2\64\65\5\4\3\6"+
		"\65\66\b\3\1\2\66B\3\2\2\2\678\f\4\2\289\7\t\2\29:\5\4\3\5:;\b\3\1\2;"+
		"B\3\2\2\2<=\f\3\2\2=>\7\6\2\2>?\5\4\3\4?@\b\3\1\2@B\3\2\2\2A(\3\2\2\2"+
		"A-\3\2\2\2A\62\3\2\2\2A\67\3\2\2\2A<\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2D\5\3\2\2\2EC\3\2\2\2FG\7\16\2\2GH\7\23\2\2HI\5\4\3\2IJ\7\24\2\2J"+
		"N\7\b\2\2KM\5\6\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2"+
		"PN\3\2\2\2QR\7\r\2\2RS\b\4\1\2S{\3\2\2\2TU\7\16\2\2UV\7\23\2\2VW\5\4\3"+
		"\2WX\7\24\2\2X\\\7\b\2\2Y[\5\6\4\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\r\2\2`a\7\22\2\2ae\7\b\2\2bd\5\6\4\2c"+
		"b\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\r\2\2"+
		"ij\b\4\1\2j{\3\2\2\2kl\7\32\2\2lm\7\5\2\2mn\7\36\2\2no\7\31\2\2o{\b\4"+
		"\1\2pq\7\32\2\2qr\7\5\2\2rs\7\36\2\2st\7\31\2\2tu\7\f\2\2uv\7\23\2\2v"+
		"w\5\4\3\2wx\7\24\2\2xy\b\4\1\2y{\3\2\2\2zF\3\2\2\2zT\3\2\2\2zk\3\2\2\2"+
		"zp\3\2\2\2{\7\3\2\2\2\n\16&ACN\\ez";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}