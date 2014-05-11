// Generated from src/ql_obj_alg_extended/parse/ by ANTLR 4.2.2

package ql_obj_alg_extended.parse;
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
public class QLWithModuloParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, WS=24, 
		COMMENT=25, INTEGER=26, STRING=27, TYPE=28, BOOL=29, ID=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "':'", "'||'", "'>='", "'{'", "'&&'", "'=='", 
		"'<'", "'='", "'}'", "'if'", "'>'", "'<='", "'!'", "'%'", "'else'", "'('", 
		"')'", "'*'", "'+'", "'form'", "'-'", "WS", "COMMENT", "INTEGER", "STRING", 
		"TYPE", "BOOL", "ID"
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


	private ql_obj_alg_extended.syntax.IAllAlgWithModulo builder;
	public void setBuilder(ql_obj_alg_extended.syntax.IAllAlgWithModulo builder) { this.builder = builder; }
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

	public QLWithModuloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormContext extends ParserRuleContext {
		public Object _form;
		public Token ID_0;
		public StmtContext stmt;
		public List<StmtContext> stmt_1 = new ArrayList<StmtContext>();
		public TerminalNode ID() { return getToken(QLWithModuloParser.ID, 0); }
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
			setState(6); match(22);
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
		public Token STRING_0;
		public Token BOOL_0;
		public Token INTEGER_0;
		public Token ID_0;
		public Token op_100;
		public ExpContext exp_1;
		public Token op_90;
		public Token op_80;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(QLWithModuloParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(QLWithModuloParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(QLWithModuloParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(QLWithModuloParser.STRING, 0); }
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
			case STRING:
				{
				setState(23); ((ExpContext)_localctx).STRING_0 = match(STRING);
				((ExpContext)_localctx)._exp =  builder.string(string((((ExpContext)_localctx).STRING_0!=null?((ExpContext)_localctx).STRING_0.getText():null)));
				}
				break;
			case BOOL:
				{
				setState(25); ((ExpContext)_localctx).BOOL_0 = match(BOOL);
				((ExpContext)_localctx)._exp =  builder.bool(bool((((ExpContext)_localctx).BOOL_0!=null?((ExpContext)_localctx).BOOL_0.getText():null)));
				}
				break;
			case 18:
				{
				setState(27); match(18);
				setState(28); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(29); match(19);
				((ExpContext)_localctx)._exp =  builder.bracket((((ExpContext)_localctx).exp_0._exp));
				}
				break;
			case INTEGER:
				{
				setState(32); ((ExpContext)_localctx).INTEGER_0 = match(INTEGER);
				((ExpContext)_localctx)._exp =  builder.lit(integer((((ExpContext)_localctx).INTEGER_0!=null?((ExpContext)_localctx).INTEGER_0.getText():null)));
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 16) | (1L << 20))) != 0)) ) {
							((ExpContext)_localctx).op_100 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(40); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_100!=null?((ExpContext)_localctx).op_100.getText():null).equals("/") ? builder.div(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_100!=null?((ExpContext)_localctx).op_100.getText():null).equals("%") ? builder.mod(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_100!=null?((ExpContext)_localctx).op_100.getText():null).equals("*") ? builder.mul(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
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
						if ( !(_la==21 || _la==23) ) {
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
		public Token ID_0;
		public Token STRING_1;
		public Token TYPE_2;
		public ExpContext exp_3;
		public ExpContext exp_0;
		public StmtContext stmt;
		public List<StmtContext> stmt_1 = new ArrayList<StmtContext>();
		public List<StmtContext> stmt_2 = new ArrayList<StmtContext>();
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(QLWithModuloParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(QLWithModuloParser.TYPE, 0); }
		public TerminalNode STRING() { return getToken(QLWithModuloParser.STRING, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
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
				setState(68); ((StmtContext)_localctx).ID_0 = match(ID);
				setState(69); match(3);
				setState(70); ((StmtContext)_localctx).STRING_1 = match(STRING);
				setState(71); ((StmtContext)_localctx).TYPE_2 = match(TYPE);
				setState(72); match(10);
				setState(73); match(18);
				setState(74); ((StmtContext)_localctx).exp_3 = exp(0);
				setState(75); match(19);
				((StmtContext)_localctx)._stmt =  builder.question(id((((StmtContext)_localctx).ID_0!=null?((StmtContext)_localctx).ID_0.getText():null)),string((((StmtContext)_localctx).STRING_1!=null?((StmtContext)_localctx).STRING_1.getText():null)),type((((StmtContext)_localctx).TYPE_2!=null?((StmtContext)_localctx).TYPE_2.getText():null)),(((StmtContext)_localctx).exp_3._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); ((StmtContext)_localctx).ID_0 = match(ID);
				setState(79); match(3);
				setState(80); ((StmtContext)_localctx).STRING_1 = match(STRING);
				setState(81); ((StmtContext)_localctx).TYPE_2 = match(TYPE);
				((StmtContext)_localctx)._stmt =  builder.question(id((((StmtContext)_localctx).ID_0!=null?((StmtContext)_localctx).ID_0.getText():null)),string((((StmtContext)_localctx).STRING_1!=null?((StmtContext)_localctx).STRING_1.getText():null)),type((((StmtContext)_localctx).TYPE_2!=null?((StmtContext)_localctx).TYPE_2.getText():null)));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); match(12);
				setState(84); match(18);
				setState(85); ((StmtContext)_localctx).exp_0 = exp(0);
				setState(86); match(19);
				setState(87); match(6);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(88); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_1.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94); match(11);
				((StmtContext)_localctx)._stmt =  builder.iff((((StmtContext)_localctx).exp_0._exp),lift("_stmt", ((StmtContext)_localctx).stmt_1));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); match(12);
				setState(98); match(18);
				setState(99); ((StmtContext)_localctx).exp_0 = exp(0);
				setState(100); match(19);
				setState(101); match(6);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(102); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_1.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108); match(11);
				setState(109); match(17);
				setState(110); match(6);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(111); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_2.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117); match(11);
				((StmtContext)_localctx)._stmt =  builder.iffelse((((StmtContext)_localctx).exp_0._exp),lift("_stmt", ((StmtContext)_localctx).stmt_1),lift("_stmt", ((StmtContext)_localctx).stmt_2));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 }\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\3\2\3\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\'\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3B\n\3\f\3\16\3E\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"j\n\4\f\4\16\4m\13\4\3\4\3\4\3\4\3\4\7\4s\n\4\f\4\16\4v\13\4\3\4\3\4\3"+
		"\4\5\4{\n\4\3\4\2\3\4\5\2\4\6\2\5\5\2\3\3\22\22\26\26\4\2\27\27\31\31"+
		"\6\2\4\4\7\7\n\13\17\20\u008a\2\b\3\2\2\2\4&\3\2\2\2\6z\3\2\2\2\b\t\7"+
		"\30\2\2\t\n\7 \2\2\n\16\7\b\2\2\13\r\5\6\4\2\f\13\3\2\2\2\r\20\3\2\2\2"+
		"\16\f\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\r\2\2"+
		"\22\23\b\2\1\2\23\3\3\2\2\2\24\25\b\3\1\2\25\26\7\21\2\2\26\27\5\4\3\b"+
		"\27\30\b\3\1\2\30\'\3\2\2\2\31\32\7\35\2\2\32\'\b\3\1\2\33\34\7\37\2\2"+
		"\34\'\b\3\1\2\35\36\7\24\2\2\36\37\5\4\3\2\37 \7\25\2\2 !\b\3\1\2!\'\3"+
		"\2\2\2\"#\7\34\2\2#\'\b\3\1\2$%\7 \2\2%\'\b\3\1\2&\24\3\2\2\2&\31\3\2"+
		"\2\2&\33\3\2\2\2&\35\3\2\2\2&\"\3\2\2\2&$\3\2\2\2\'C\3\2\2\2()\f\7\2\2"+
		")*\t\2\2\2*+\5\4\3\b+,\b\3\1\2,B\3\2\2\2-.\f\6\2\2./\t\3\2\2/\60\5\4\3"+
		"\7\60\61\b\3\1\2\61B\3\2\2\2\62\63\f\5\2\2\63\64\t\4\2\2\64\65\5\4\3\6"+
		"\65\66\b\3\1\2\66B\3\2\2\2\678\f\4\2\289\7\t\2\29:\5\4\3\5:;\b\3\1\2;"+
		"B\3\2\2\2<=\f\3\2\2=>\7\6\2\2>?\5\4\3\4?@\b\3\1\2@B\3\2\2\2A(\3\2\2\2"+
		"A-\3\2\2\2A\62\3\2\2\2A\67\3\2\2\2A<\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2D\5\3\2\2\2EC\3\2\2\2FG\7 \2\2GH\7\5\2\2HI\7\35\2\2IJ\7\36\2\2JK\7"+
		"\f\2\2KL\7\24\2\2LM\5\4\3\2MN\7\25\2\2NO\b\4\1\2O{\3\2\2\2PQ\7 \2\2QR"+
		"\7\5\2\2RS\7\35\2\2ST\7\36\2\2T{\b\4\1\2UV\7\16\2\2VW\7\24\2\2WX\5\4\3"+
		"\2XY\7\25\2\2Y]\7\b\2\2Z\\\5\6\4\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\r\2\2ab\b\4\1\2b{\3\2\2\2cd\7\16\2\2de"+
		"\7\24\2\2ef\5\4\3\2fg\7\25\2\2gk\7\b\2\2hj\5\6\4\2ih\3\2\2\2jm\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\r\2\2op\7\23\2\2pt\7\b\2"+
		"\2qs\5\6\4\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2"+
		"\2wx\7\r\2\2xy\b\4\1\2y{\3\2\2\2zF\3\2\2\2zP\3\2\2\2zU\3\2\2\2zc\3\2\2"+
		"\2{\7\3\2\2\2\n\16&AC]ktz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}