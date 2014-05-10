// Generated from src;ql_obj_alg_extended;parse; by ANTLR 4.2.2

package ql_obj_alg_extended.parse;
import static ql_obj_alg.syntax.Tokens.*;
import static ql_obj_alg_extended.syntax.TokensWithProperty.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLWithCheckParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, TYPE=24, 
		ID=25, COMMENT=26, BOOL=27, STRING=28, INTEGER=29, WS=30, PROPERTY=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "':'", "'||'", "'>='", "'{'", "'&&'", "'=='", 
		"'<'", "'='", "'}'", "'if'", "'>'", "'<='", "'!'", "'$'", "'else'", "'('", 
		"')'", "'*'", "'+'", "'form'", "'-'", "TYPE", "ID", "COMMENT", "BOOL", 
		"STRING", "INTEGER", "WS", "PROPERTY"
	};
	public static final int
		RULE_form = 0, RULE_exp = 1, RULE_stmt = 2;
	public static final String[] ruleNames = {
		"form", "exp", "stmt"
	};

	@Override
	public String getGrammarFileName() { return "src;ql_obj_alg_extended;parse;"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private ql_obj_alg_extended.syntax.IAllAlgWithCheck builder;
	public void setBuilder(ql_obj_alg_extended.syntax.IAllAlgWithCheck builder) { this.builder = builder; }
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

	public QLWithCheckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormContext extends ParserRuleContext {
		public Object _form;
		public Token ID_0;
		public StmtContext stmt;
		public List<StmtContext> stmt_1 = new ArrayList<StmtContext>();
		public TerminalNode ID() { return getToken(QLWithCheckParser.ID, 0); }
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
		public Token PROPERTY_0;
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
		public TerminalNode ID() { return getToken(QLWithCheckParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(QLWithCheckParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(QLWithCheckParser.INTEGER, 0); }
		public TerminalNode PROPERTY() { return getToken(QLWithCheckParser.PROPERTY, 0); }
		public TerminalNode STRING() { return getToken(QLWithCheckParser.STRING, 0); }
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
			setState(38);
			switch (_input.LA(1)) {
			case 15:
				{
				setState(19); match(15);
				setState(20); ((ExpContext)_localctx).exp_0 = exp(6);
				((ExpContext)_localctx)._exp =  builder.not((((ExpContext)_localctx).exp_0._exp));
				}
				break;
			case PROPERTY:
				{
				setState(23); ((ExpContext)_localctx).PROPERTY_0 = match(PROPERTY);
				((ExpContext)_localctx)._exp =  builder.property(property((((ExpContext)_localctx).PROPERTY_0!=null?((ExpContext)_localctx).PROPERTY_0.getText():null)));
				}
				break;
			case 18:
				{
				setState(25); match(18);
				setState(26); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(27); match(19);
				((ExpContext)_localctx)._exp =  builder.bracket((((ExpContext)_localctx).exp_0._exp));
				}
				break;
			case INTEGER:
				{
				setState(30); ((ExpContext)_localctx).INTEGER_0 = match(INTEGER);
				((ExpContext)_localctx)._exp =  builder.lit(integer((((ExpContext)_localctx).INTEGER_0!=null?((ExpContext)_localctx).INTEGER_0.getText():null)));
				}
				break;
			case BOOL:
				{
				setState(32); ((ExpContext)_localctx).BOOL_0 = match(BOOL);
				((ExpContext)_localctx)._exp =  builder.bool(bool((((ExpContext)_localctx).BOOL_0!=null?((ExpContext)_localctx).BOOL_0.getText():null)));
				}
				break;
			case STRING:
				{
				setState(34); ((ExpContext)_localctx).STRING_0 = match(STRING);
				((ExpContext)_localctx)._exp =  builder.string(string((((ExpContext)_localctx).STRING_0!=null?((ExpContext)_localctx).STRING_0.getText():null)));
				}
				break;
			case ID:
				{
				setState(36); ((ExpContext)_localctx).ID_0 = match(ID);
				((ExpContext)_localctx)._exp =  builder.var(id((((ExpContext)_localctx).ID_0!=null?((ExpContext)_localctx).ID_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(40);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(41);
						((ExpContext)_localctx).op_100 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==1 || _la==20) ) {
							((ExpContext)_localctx).op_100 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(42); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_100!=null?((ExpContext)_localctx).op_100.getText():null).equals("/") ? builder.div(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_100!=null?((ExpContext)_localctx).op_100.getText():null).equals("*") ? builder.mul(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(45);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						((ExpContext)_localctx).op_90 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==21 || _la==23) ) {
							((ExpContext)_localctx).op_90 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(47); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_90!=null?((ExpContext)_localctx).op_90.getText():null).equals("+") ? builder.add(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_90!=null?((ExpContext)_localctx).op_90.getText():null).equals("-") ? builder.sub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(50);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(51);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 14))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(52); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.leq(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("!=") ? builder.neq(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.geq(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("==") ? builder.eq(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.lt(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.gt(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(55);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(56); match(7);
						setState(57); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.and((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(60);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(61); match(4);
						setState(62); ((ExpContext)_localctx).exp_1 = exp(2);
						((ExpContext)_localctx)._exp =  builder.or((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(69);
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
		public StmtContext stmt_3;
		public ExpContext exp_3;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(QLWithCheckParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(QLWithCheckParser.TYPE, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode STRING() { return getToken(QLWithCheckParser.STRING, 0); }
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
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(12);
				setState(71); match(18);
				setState(72); ((StmtContext)_localctx).exp_0 = exp(0);
				setState(73); match(19);
				setState(74); match(6);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(75); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_1.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81); match(11);
				((StmtContext)_localctx)._stmt =  builder.iff((((StmtContext)_localctx).exp_0._exp),lift("_stmt", ((StmtContext)_localctx).stmt_1));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); match(12);
				setState(85); match(18);
				setState(86); ((StmtContext)_localctx).exp_0 = exp(0);
				setState(87); match(19);
				setState(88); match(6);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(89); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_1.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95); match(11);
				setState(96); match(17);
				setState(97); match(6);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12 || _la==ID) {
					{
					{
					setState(98); ((StmtContext)_localctx).stmt = stmt();
					((StmtContext)_localctx).stmt_2.add(((StmtContext)_localctx).stmt);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104); match(11);
				((StmtContext)_localctx)._stmt =  builder.iffelse((((StmtContext)_localctx).exp_0._exp),lift("_stmt", ((StmtContext)_localctx).stmt_1),lift("_stmt", ((StmtContext)_localctx).stmt_2));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); ((StmtContext)_localctx).ID_0 = match(ID);
				setState(108); match(3);
				setState(109); ((StmtContext)_localctx).STRING_1 = match(STRING);
				setState(110); ((StmtContext)_localctx).TYPE_2 = match(TYPE);
				((StmtContext)_localctx)._stmt =  builder.question(id((((StmtContext)_localctx).ID_0!=null?((StmtContext)_localctx).ID_0.getText():null)),string((((StmtContext)_localctx).STRING_1!=null?((StmtContext)_localctx).STRING_1.getText():null)),type((((StmtContext)_localctx).TYPE_2!=null?((StmtContext)_localctx).TYPE_2.getText():null)));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112); ((StmtContext)_localctx).ID_0 = match(ID);
				setState(113); match(3);
				setState(114); ((StmtContext)_localctx).STRING_1 = match(STRING);
				setState(115); ((StmtContext)_localctx).TYPE_2 = match(TYPE);
				setState(116); match(16);
				setState(117); match(18);
				setState(118); ((StmtContext)_localctx).stmt_3 = stmt();
				setState(119); match(19);
				((StmtContext)_localctx)._stmt =  builder.checked_question(id((((StmtContext)_localctx).ID_0!=null?((StmtContext)_localctx).ID_0.getText():null)),string((((StmtContext)_localctx).STRING_1!=null?((StmtContext)_localctx).STRING_1.getText():null)),type((((StmtContext)_localctx).TYPE_2!=null?((StmtContext)_localctx).TYPE_2.getText():null)),(((StmtContext)_localctx).stmt_3._stmt));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122); ((StmtContext)_localctx).ID_0 = match(ID);
				setState(123); match(3);
				setState(124); ((StmtContext)_localctx).STRING_1 = match(STRING);
				setState(125); ((StmtContext)_localctx).TYPE_2 = match(TYPE);
				setState(126); match(10);
				setState(127); match(18);
				setState(128); ((StmtContext)_localctx).exp_3 = exp(0);
				setState(129); match(19);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3)\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3D\n\3\f\3\16\3G"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R\13\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\4\3\4\3\4\3\4\7\4f\n\4"+
		"\f\4\16\4i\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0087\n"+
		"\4\3\4\2\3\4\5\2\4\6\2\5\4\2\3\3\26\26\4\2\27\27\31\31\6\2\4\4\7\7\n\13"+
		"\17\20\u0098\2\b\3\2\2\2\4(\3\2\2\2\6\u0086\3\2\2\2\b\t\7\30\2\2\t\n\7"+
		"\33\2\2\n\16\7\b\2\2\13\r\5\6\4\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2"+
		"\2\16\17\3\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\r\2\2\22\23\b\2\1"+
		"\2\23\3\3\2\2\2\24\25\b\3\1\2\25\26\7\21\2\2\26\27\5\4\3\b\27\30\b\3\1"+
		"\2\30)\3\2\2\2\31\32\7!\2\2\32)\b\3\1\2\33\34\7\24\2\2\34\35\5\4\3\2\35"+
		"\36\7\25\2\2\36\37\b\3\1\2\37)\3\2\2\2 !\7\37\2\2!)\b\3\1\2\"#\7\35\2"+
		"\2#)\b\3\1\2$%\7\36\2\2%)\b\3\1\2&\'\7\33\2\2\')\b\3\1\2(\24\3\2\2\2("+
		"\31\3\2\2\2(\33\3\2\2\2( \3\2\2\2(\"\3\2\2\2($\3\2\2\2(&\3\2\2\2)E\3\2"+
		"\2\2*+\f\7\2\2+,\t\2\2\2,-\5\4\3\b-.\b\3\1\2.D\3\2\2\2/\60\f\6\2\2\60"+
		"\61\t\3\2\2\61\62\5\4\3\7\62\63\b\3\1\2\63D\3\2\2\2\64\65\f\5\2\2\65\66"+
		"\t\4\2\2\66\67\5\4\3\6\678\b\3\1\28D\3\2\2\29:\f\4\2\2:;\7\t\2\2;<\5\4"+
		"\3\5<=\b\3\1\2=D\3\2\2\2>?\f\3\2\2?@\7\6\2\2@A\5\4\3\4AB\b\3\1\2BD\3\2"+
		"\2\2C*\3\2\2\2C/\3\2\2\2C\64\3\2\2\2C9\3\2\2\2C>\3\2\2\2DG\3\2\2\2EC\3"+
		"\2\2\2EF\3\2\2\2F\5\3\2\2\2GE\3\2\2\2HI\7\16\2\2IJ\7\24\2\2JK\5\4\3\2"+
		"KL\7\25\2\2LP\7\b\2\2MO\5\6\4\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2QS\3\2\2\2RP\3\2\2\2ST\7\r\2\2TU\b\4\1\2U\u0087\3\2\2\2VW\7\16\2\2W"+
		"X\7\24\2\2XY\5\4\3\2YZ\7\25\2\2Z^\7\b\2\2[]\5\6\4\2\\[\3\2\2\2]`\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\r\2\2bc\7\23\2\2cg\7\b"+
		"\2\2df\5\6\4\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2"+
		"\2\2jk\7\r\2\2kl\b\4\1\2l\u0087\3\2\2\2mn\7\33\2\2no\7\5\2\2op\7\36\2"+
		"\2pq\7\32\2\2q\u0087\b\4\1\2rs\7\33\2\2st\7\5\2\2tu\7\36\2\2uv\7\32\2"+
		"\2vw\7\22\2\2wx\7\24\2\2xy\5\6\4\2yz\7\25\2\2z{\b\4\1\2{\u0087\3\2\2\2"+
		"|}\7\33\2\2}~\7\5\2\2~\177\7\36\2\2\177\u0080\7\32\2\2\u0080\u0081\7\f"+
		"\2\2\u0081\u0082\7\24\2\2\u0082\u0083\5\4\3\2\u0083\u0084\7\25\2\2\u0084"+
		"\u0085\b\4\1\2\u0085\u0087\3\2\2\2\u0086H\3\2\2\2\u0086V\3\2\2\2\u0086"+
		"m\3\2\2\2\u0086r\3\2\2\2\u0086|\3\2\2\2\u0087\7\3\2\2\2\n\16(CEP^g\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}