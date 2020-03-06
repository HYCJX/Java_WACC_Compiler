// Generated from WaccParser.g4 by ANTLR 4.7.1

    package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WaccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_PARENTHESES=1, CLOSE_PARENTHESES=2, COMMA=3, SEMICOLON=4, BEGIN=5, 
		END=6, IS=7, SKIPS=8, ASSIGN=9, READ=10, FREE=11, RETURN=12, EXIT=13, 
		PRINT=14, PRINTLN=15, IF=16, THEN=17, ELSE=18, FI=19, WHILE=20, DO=21, 
		DONE=22, NEWPAIR=23, CALL=24, FST=25, SND=26, OPEN_BRACKET=27, CLOSE_BRACKET=28, 
		NOT=29, NEG=30, LENGTH=31, ORD=32, CHR=33, MULDIVMOD=34, ADD=35, CMP=36, 
		EQ=37, ANDOR=38, BASE_TYPE=39, PAIR=40, INT_LITER=41, BOOL_LITER=42, PAIR_LITER=43, 
		CHAR_LITER=44, STR_LITER=45, IDENT=46, COMMENT=47, WS=48;
	public static final int
		RULE_prog = 0, RULE_func = 1, RULE_param = 2, RULE_stat = 3, RULE_assignLhs = 4, 
		RULE_assignRhs = 5, RULE_expr = 6, RULE_type = 7, RULE_baseType = 8, RULE_arrayType = 9, 
		RULE_pairType = 10, RULE_pairElemType = 11, RULE_arrayElem = 12, RULE_ident = 13, 
		RULE_pairFst = 14, RULE_pairSnd = 15;
	public static final String[] ruleNames = {
		"prog", "func", "param", "stat", "assignLhs", "assignRhs", "expr", "type", 
		"baseType", "arrayType", "pairType", "pairElemType", "arrayElem", "ident", 
		"pairFst", "pairSnd"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "';'", "'begin'", "'end'", "'is'", "'skip'", 
		"'='", "'read'", "'free'", "'return'", "'exit'", "'print'", "'println'", 
		"'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'done'", "'newpair'", 
		"'call'", "'fst'", "'snd'", "'['", "']'", "'!'", "'-'", "'len'", "'ord'", 
		"'chr'", null, "'+'", null, null, null, null, "'pair'", null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PARENTHESES", "CLOSE_PARENTHESES", "COMMA", "SEMICOLON", "BEGIN", 
		"END", "IS", "SKIPS", "ASSIGN", "READ", "FREE", "RETURN", "EXIT", "PRINT", 
		"PRINTLN", "IF", "THEN", "ELSE", "FI", "WHILE", "DO", "DONE", "NEWPAIR", 
		"CALL", "FST", "SND", "OPEN_BRACKET", "CLOSE_BRACKET", "NOT", "NEG", "LENGTH", 
		"ORD", "CHR", "MULDIVMOD", "ADD", "CMP", "EQ", "ANDOR", "BASE_TYPE", "PAIR", 
		"INT_LITER", "BOOL_LITER", "PAIR_LITER", "CHAR_LITER", "STR_LITER", "IDENT", 
		"COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WaccParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WaccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(WaccParser.BEGIN, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode END() { return getToken(WaccParser.END, 0); }
		public TerminalNode EOF() { return getToken(WaccParser.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(BEGIN);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					func();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(39);
			stat(0);
			setState(40);
			match(END);
			setState(41);
			match(EOF);
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

	public static class FuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(WaccParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(WaccParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode IS() { return getToken(WaccParser.IS, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode END() { return getToken(WaccParser.END, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WaccParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WaccParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			type();
			setState(44);
			ident();
			setState(45);
			match(OPEN_PARENTHESES);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASE_TYPE || _la==PAIR) {
				{
				setState(46);
				param();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(47);
					match(COMMA);
					setState(48);
					param();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(56);
			match(CLOSE_PARENTHESES);
			setState(57);
			match(IS);
			setState(58);
			stat(0);
			setState(59);
			match(END);
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

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			type();
			setState(62);
			ident();
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatPrintlnContext extends StatContext {
		public TerminalNode PRINTLN() { return getToken(WaccParser.PRINTLN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatPrintlnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatReadContext extends StatContext {
		public TerminalNode READ() { return getToken(WaccParser.READ, 0); }
		public AssignLhsContext assignLhs() {
			return getRuleContext(AssignLhsContext.class,0);
		}
		public StatReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatCondContext extends StatContext {
		public TerminalNode IF() { return getToken(WaccParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(WaccParser.THEN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(WaccParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(WaccParser.FI, 0); }
		public StatCondContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatAssignVarContext extends StatContext {
		public AssignLhsContext assignLhs() {
			return getRuleContext(AssignLhsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(WaccParser.ASSIGN, 0); }
		public AssignRhsContext assignRhs() {
			return getRuleContext(AssignRhsContext.class,0);
		}
		public StatAssignVarContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatExitContext extends StatContext {
		public TerminalNode EXIT() { return getToken(WaccParser.EXIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatExitContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatExit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatReturnContext extends StatContext {
		public TerminalNode RETURN() { return getToken(WaccParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatReturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatBeginContext extends StatContext {
		public TerminalNode BEGIN() { return getToken(WaccParser.BEGIN, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode END() { return getToken(WaccParser.END, 0); }
		public StatBeginContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatBegin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatSkipContext extends StatContext {
		public TerminalNode SKIPS() { return getToken(WaccParser.SKIPS, 0); }
		public StatSkipContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatLoopContext extends StatContext {
		public TerminalNode WHILE() { return getToken(WaccParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(WaccParser.DO, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode DONE() { return getToken(WaccParser.DONE, 0); }
		public StatLoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatPrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(WaccParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatPrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatComposeContext extends StatContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(WaccParser.SEMICOLON, 0); }
		public StatComposeContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatCompose(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatInitVarContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(WaccParser.ASSIGN, 0); }
		public AssignRhsContext assignRhs() {
			return getRuleContext(AssignRhsContext.class,0);
		}
		public StatInitVarContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatInitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatFreeContext extends StatContext {
		public TerminalNode FREE() { return getToken(WaccParser.FREE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatFreeContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatFree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		return stat(0);
	}

	private StatContext stat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatContext _localctx = new StatContext(_ctx, _parentState);
		StatContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_stat, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SKIPS:
				{
				_localctx = new StatSkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(SKIPS);
				}
				break;
			case FST:
			case SND:
			case IDENT:
				{
				_localctx = new StatAssignVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				assignLhs();
				setState(67);
				match(ASSIGN);
				setState(68);
				assignRhs();
				}
				break;
			case BASE_TYPE:
			case PAIR:
				{
				_localctx = new StatInitVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				type();
				setState(71);
				ident();
				setState(72);
				match(ASSIGN);
				setState(73);
				assignRhs();
				}
				break;
			case EXIT:
				{
				_localctx = new StatExitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(EXIT);
				setState(76);
				expr(0);
				}
				break;
			case FREE:
				{
				_localctx = new StatFreeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(FREE);
				setState(78);
				expr(0);
				}
				break;
			case PRINT:
				{
				_localctx = new StatPrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(PRINT);
				setState(80);
				expr(0);
				}
				break;
			case PRINTLN:
				{
				_localctx = new StatPrintlnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(PRINTLN);
				setState(82);
				expr(0);
				}
				break;
			case RETURN:
				{
				_localctx = new StatReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(RETURN);
				setState(84);
				expr(0);
				}
				break;
			case READ:
				{
				_localctx = new StatReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(READ);
				setState(86);
				assignLhs();
				}
				break;
			case BEGIN:
				{
				_localctx = new StatBeginContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(BEGIN);
				setState(88);
				stat(0);
				setState(89);
				match(END);
				}
				break;
			case IF:
				{
				_localctx = new StatCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(IF);
				setState(92);
				expr(0);
				setState(93);
				match(THEN);
				setState(94);
				stat(0);
				setState(95);
				match(ELSE);
				setState(96);
				stat(0);
				setState(97);
				match(FI);
				}
				break;
			case WHILE:
				{
				_localctx = new StatLoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(WHILE);
				setState(100);
				expr(0);
				setState(101);
				match(DO);
				setState(102);
				stat(0);
				setState(103);
				match(DONE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatComposeContext(new StatContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stat);
					setState(107);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(108);
					match(SEMICOLON);
					setState(109);
					stat(2);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class AssignLhsContext extends ParserRuleContext {
		public AssignLhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignLhs; }
	 
		public AssignLhsContext() { }
		public void copyFrom(AssignLhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LhsPairFstContext extends AssignLhsContext {
		public PairFstContext pairFst() {
			return getRuleContext(PairFstContext.class,0);
		}
		public LhsPairFstContext(AssignLhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitLhsPairFst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LhsIdentContext extends AssignLhsContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public LhsIdentContext(AssignLhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitLhsIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LhsArrElemContext extends AssignLhsContext {
		public ArrayElemContext arrayElem() {
			return getRuleContext(ArrayElemContext.class,0);
		}
		public LhsArrElemContext(AssignLhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitLhsArrElem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LhsPairSndContext extends AssignLhsContext {
		public PairSndContext pairSnd() {
			return getRuleContext(PairSndContext.class,0);
		}
		public LhsPairSndContext(AssignLhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitLhsPairSnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignLhsContext assignLhs() throws RecognitionException {
		AssignLhsContext _localctx = new AssignLhsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignLhs);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new LhsIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				ident();
				}
				break;
			case 2:
				_localctx = new LhsArrElemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				arrayElem();
				}
				break;
			case 3:
				_localctx = new LhsPairFstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				pairFst();
				}
				break;
			case 4:
				_localctx = new LhsPairSndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				pairSnd();
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

	public static class AssignRhsContext extends ParserRuleContext {
		public AssignRhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignRhs; }
	 
		public AssignRhsContext() { }
		public void copyFrom(AssignRhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RhsCallContext extends AssignRhsContext {
		public TerminalNode CALL() { return getToken(WaccParser.CALL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(WaccParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(WaccParser.CLOSE_PARENTHESES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WaccParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WaccParser.COMMA, i);
		}
		public RhsCallContext(AssignRhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitRhsCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RhsNewpairContext extends AssignRhsContext {
		public TerminalNode NEWPAIR() { return getToken(WaccParser.NEWPAIR, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(WaccParser.OPEN_PARENTHESES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(WaccParser.COMMA, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(WaccParser.CLOSE_PARENTHESES, 0); }
		public RhsNewpairContext(AssignRhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitRhsNewpair(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RhsArrLitContext extends AssignRhsContext {
		public TerminalNode OPEN_BRACKET() { return getToken(WaccParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(WaccParser.CLOSE_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WaccParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WaccParser.COMMA, i);
		}
		public RhsArrLitContext(AssignRhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitRhsArrLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RhsPairSndContext extends AssignRhsContext {
		public PairSndContext pairSnd() {
			return getRuleContext(PairSndContext.class,0);
		}
		public RhsPairSndContext(AssignRhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitRhsPairSnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RhsExprContext extends AssignRhsContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RhsExprContext(AssignRhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitRhsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RhsPairFstContext extends AssignRhsContext {
		public PairFstContext pairFst() {
			return getRuleContext(PairFstContext.class,0);
		}
		public RhsPairFstContext(AssignRhsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitRhsPairFst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignRhsContext assignRhs() throws RecognitionException {
		AssignRhsContext _localctx = new AssignRhsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignRhs);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				_localctx = new RhsArrLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(OPEN_BRACKET);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PARENTHESES) | (1L << NOT) | (1L << NEG) | (1L << LENGTH) | (1L << ORD) | (1L << CHR) | (1L << ADD) | (1L << INT_LITER) | (1L << BOOL_LITER) | (1L << PAIR_LITER) | (1L << CHAR_LITER) | (1L << STR_LITER) | (1L << IDENT))) != 0)) {
					{
					setState(122);
					expr(0);
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(123);
						match(COMMA);
						setState(124);
						expr(0);
						}
						}
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(132);
				match(CLOSE_BRACKET);
				}
				break;
			case CALL:
				_localctx = new RhsCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(CALL);
				setState(134);
				ident();
				setState(135);
				match(OPEN_PARENTHESES);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PARENTHESES) | (1L << NOT) | (1L << NEG) | (1L << LENGTH) | (1L << ORD) | (1L << CHR) | (1L << ADD) | (1L << INT_LITER) | (1L << BOOL_LITER) | (1L << PAIR_LITER) | (1L << CHAR_LITER) | (1L << STR_LITER) | (1L << IDENT))) != 0)) {
					{
					setState(136);
					expr(0);
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(137);
						match(COMMA);
						setState(138);
						expr(0);
						}
						}
						setState(143);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(146);
				match(CLOSE_PARENTHESES);
				}
				break;
			case OPEN_PARENTHESES:
			case NOT:
			case NEG:
			case LENGTH:
			case ORD:
			case CHR:
			case ADD:
			case INT_LITER:
			case BOOL_LITER:
			case PAIR_LITER:
			case CHAR_LITER:
			case STR_LITER:
			case IDENT:
				_localctx = new RhsExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				expr(0);
				}
				break;
			case NEWPAIR:
				_localctx = new RhsNewpairContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(NEWPAIR);
				setState(150);
				match(OPEN_PARENTHESES);
				setState(151);
				expr(0);
				setState(152);
				match(COMMA);
				setState(153);
				expr(0);
				setState(154);
				match(CLOSE_PARENTHESES);
				}
				break;
			case FST:
				_localctx = new RhsPairFstContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				pairFst();
				}
				break;
			case SND:
				_localctx = new RhsPairSndContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				pairSnd();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprUnaryOpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(WaccParser.NOT, 0); }
		public TerminalNode NEG() { return getToken(WaccParser.NEG, 0); }
		public TerminalNode LENGTH() { return getToken(WaccParser.LENGTH, 0); }
		public TerminalNode ORD() { return getToken(WaccParser.ORD, 0); }
		public TerminalNode CHR() { return getToken(WaccParser.CHR, 0); }
		public ExprUnaryOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULDIVMOD() { return getToken(WaccParser.MULDIVMOD, 0); }
		public ExprMulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCharLitContext extends ExprContext {
		public TerminalNode CHAR_LITER() { return getToken(WaccParser.CHAR_LITER, 0); }
		public ExprCharLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprCharLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntLitContext extends ExprContext {
		public TerminalNode INT_LITER() { return getToken(WaccParser.INT_LITER, 0); }
		public TerminalNode ADD() { return getToken(WaccParser.ADD, 0); }
		public TerminalNode NEG() { return getToken(WaccParser.NEG, 0); }
		public ExprIntLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprIntLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolLitContext extends ExprContext {
		public TerminalNode BOOL_LITER() { return getToken(WaccParser.BOOL_LITER, 0); }
		public ExprBoolLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenContext extends ExprContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(WaccParser.OPEN_PARENTHESES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(WaccParser.CLOSE_PARENTHESES, 0); }
		public ExprParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCmpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CMP() { return getToken(WaccParser.CMP, 0); }
		public ExprCmpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ANDOR() { return getToken(WaccParser.ANDOR, 0); }
		public ExprAndOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdentContext extends ExprContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprIdentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(WaccParser.EQ, 0); }
		public ExprEqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(WaccParser.ADD, 0); }
		public TerminalNode NEG() { return getToken(WaccParser.NEG, 0); }
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPairLitContext extends ExprContext {
		public TerminalNode PAIR_LITER() { return getToken(WaccParser.PAIR_LITER, 0); }
		public ExprPairLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprPairLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrElemContext extends ExprContext {
		public ArrayElemContext arrayElem() {
			return getRuleContext(ArrayElemContext.class,0);
		}
		public ExprArrElemContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprArrElem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStrlitContext extends ExprContext {
		public TerminalNode STR_LITER() { return getToken(WaccParser.STR_LITER, 0); }
		public ExprStrlitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprStrlit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ExprIntLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG || _la==ADD) {
					{
					setState(161);
					_la = _input.LA(1);
					if ( !(_la==NEG || _la==ADD) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(164);
				match(INT_LITER);
				}
				break;
			case 2:
				{
				_localctx = new ExprBoolLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(BOOL_LITER);
				}
				break;
			case 3:
				{
				_localctx = new ExprCharLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(CHAR_LITER);
				}
				break;
			case 4:
				{
				_localctx = new ExprStrlitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(STR_LITER);
				}
				break;
			case 5:
				{
				_localctx = new ExprPairLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(PAIR_LITER);
				}
				break;
			case 6:
				{
				_localctx = new ExprArrElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				arrayElem();
				}
				break;
			case 7:
				{
				_localctx = new ExprIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				ident();
				}
				break;
			case 8:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(OPEN_PARENTHESES);
				setState(172);
				expr(0);
				setState(173);
				match(CLOSE_PARENTHESES);
				}
				break;
			case 9:
				{
				_localctx = new ExprUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NEG) | (1L << LENGTH) | (1L << ORD) | (1L << CHR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				expr(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(180);
						match(MULDIVMOD);
						setState(181);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(183);
						_la = _input.LA(1);
						if ( !(_la==NEG || _la==ADD) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprCmpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(186);
						match(CMP);
						setState(187);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(189);
						match(EQ);
						setState(190);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(192);
						match(ANDOR);
						setState(193);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public PairTypeContext pairType() {
			return getRuleContext(PairTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				arrayType(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				pairType();
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode BASE_TYPE() { return getToken(WaccParser.BASE_TYPE, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(BASE_TYPE);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(WaccParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(WaccParser.CLOSE_BRACKET, 0); }
		public PairTypeContext pairType() {
			return getRuleContext(PairTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		return arrayType(0);
	}

	private ArrayTypeContext arrayType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, _parentState);
		ArrayTypeContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arrayType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASE_TYPE:
				{
				setState(207);
				baseType();
				setState(208);
				match(OPEN_BRACKET);
				setState(209);
				match(CLOSE_BRACKET);
				}
				break;
			case PAIR:
				{
				setState(211);
				pairType();
				setState(212);
				match(OPEN_BRACKET);
				setState(213);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arrayType);
					setState(217);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(218);
					match(OPEN_BRACKET);
					setState(219);
					match(CLOSE_BRACKET);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class PairTypeContext extends ParserRuleContext {
		public TerminalNode PAIR() { return getToken(WaccParser.PAIR, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(WaccParser.OPEN_PARENTHESES, 0); }
		public List<PairElemTypeContext> pairElemType() {
			return getRuleContexts(PairElemTypeContext.class);
		}
		public PairElemTypeContext pairElemType(int i) {
			return getRuleContext(PairElemTypeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(WaccParser.COMMA, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(WaccParser.CLOSE_PARENTHESES, 0); }
		public PairTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitPairType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairTypeContext pairType() throws RecognitionException {
		PairTypeContext _localctx = new PairTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pairType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(PAIR);
			setState(226);
			match(OPEN_PARENTHESES);
			setState(227);
			pairElemType();
			setState(228);
			match(COMMA);
			setState(229);
			pairElemType();
			setState(230);
			match(CLOSE_PARENTHESES);
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

	public static class PairElemTypeContext extends ParserRuleContext {
		public TerminalNode PAIR() { return getToken(WaccParser.PAIR, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public PairElemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairElemType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitPairElemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairElemTypeContext pairElemType() throws RecognitionException {
		PairElemTypeContext _localctx = new PairElemTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pairElemType);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(PAIR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				baseType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				arrayType(0);
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

	public static class ArrayElemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(WaccParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(WaccParser.OPEN_BRACKET, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(WaccParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(WaccParser.CLOSE_BRACKET, i);
		}
		public ArrayElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitArrayElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElemContext arrayElem() throws RecognitionException {
		ArrayElemContext _localctx = new ArrayElemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayElem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			ident();
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(238);
					match(OPEN_BRACKET);
					setState(239);
					expr(0);
					setState(240);
					match(CLOSE_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(WaccParser.IDENT, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(IDENT);
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

	public static class PairFstContext extends ParserRuleContext {
		public TerminalNode FST() { return getToken(WaccParser.FST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PairFstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairFst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitPairFst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairFstContext pairFst() throws RecognitionException {
		PairFstContext _localctx = new PairFstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pairFst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(FST);
			setState(249);
			expr(0);
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

	public static class PairSndContext extends ParserRuleContext {
		public TerminalNode SND() { return getToken(WaccParser.SND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PairSndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairSnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitPairSnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairSndContext pairSnd() throws RecognitionException {
		PairSndContext _localctx = new PairSndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pairSnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(SND);
			setState(252);
			expr(0);
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
		case 3:
			return stat_sempred((StatContext)_localctx, predIndex);
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return arrayType_sempred((ArrayTypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stat_sempred(StatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arrayType_sempred(ArrayTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0101\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\5\39\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5l\n\5\3\5\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5\3\6\3\6"+
		"\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13\7\5"+
		"\7\u0085\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091"+
		"\13\7\5\7\u0093\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u00a1\n\7\3\b\3\b\5\b\u00a5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00b4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13\b\3\t\3\t\3\t\5\t"+
		"\u00cd\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00da"+
		"\n\13\3\13\3\13\3\13\7\13\u00df\n\13\f\13\16\13\u00e2\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00ee\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\6\16\u00f5\n\16\r\16\16\16\u00f6\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\2\5\b\16\24\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\4"+
		"\2  %%\3\2\37#\2\u0120\2\"\3\2\2\2\4-\3\2\2\2\6?\3\2\2\2\bk\3\2\2\2\n"+
		"y\3\2\2\2\f\u00a0\3\2\2\2\16\u00b3\3\2\2\2\20\u00cc\3\2\2\2\22\u00ce\3"+
		"\2\2\2\24\u00d9\3\2\2\2\26\u00e3\3\2\2\2\30\u00ed\3\2\2\2\32\u00ef\3\2"+
		"\2\2\34\u00f8\3\2\2\2\36\u00fa\3\2\2\2 \u00fd\3\2\2\2\"&\7\7\2\2#%\5\4"+
		"\3\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\5"+
		"\b\5\2*+\7\b\2\2+,\7\2\2\3,\3\3\2\2\2-.\5\20\t\2./\5\34\17\2/8\7\3\2\2"+
		"\60\65\5\6\4\2\61\62\7\5\2\2\62\64\5\6\4\2\63\61\3\2\2\2\64\67\3\2\2\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\28\60\3\2\2\289\3"+
		"\2\2\29:\3\2\2\2:;\7\4\2\2;<\7\t\2\2<=\5\b\5\2=>\7\b\2\2>\5\3\2\2\2?@"+
		"\5\20\t\2@A\5\34\17\2A\7\3\2\2\2BC\b\5\1\2Cl\7\n\2\2DE\5\n\6\2EF\7\13"+
		"\2\2FG\5\f\7\2Gl\3\2\2\2HI\5\20\t\2IJ\5\34\17\2JK\7\13\2\2KL\5\f\7\2L"+
		"l\3\2\2\2MN\7\17\2\2Nl\5\16\b\2OP\7\r\2\2Pl\5\16\b\2QR\7\20\2\2Rl\5\16"+
		"\b\2ST\7\21\2\2Tl\5\16\b\2UV\7\16\2\2Vl\5\16\b\2WX\7\f\2\2Xl\5\n\6\2Y"+
		"Z\7\7\2\2Z[\5\b\5\2[\\\7\b\2\2\\l\3\2\2\2]^\7\22\2\2^_\5\16\b\2_`\7\23"+
		"\2\2`a\5\b\5\2ab\7\24\2\2bc\5\b\5\2cd\7\25\2\2dl\3\2\2\2ef\7\26\2\2fg"+
		"\5\16\b\2gh\7\27\2\2hi\5\b\5\2ij\7\30\2\2jl\3\2\2\2kB\3\2\2\2kD\3\2\2"+
		"\2kH\3\2\2\2kM\3\2\2\2kO\3\2\2\2kQ\3\2\2\2kS\3\2\2\2kU\3\2\2\2kW\3\2\2"+
		"\2kY\3\2\2\2k]\3\2\2\2ke\3\2\2\2lr\3\2\2\2mn\f\3\2\2no\7\6\2\2oq\5\b\5"+
		"\4pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\t\3\2\2\2tr\3\2\2\2uz\5\34"+
		"\17\2vz\5\32\16\2wz\5\36\20\2xz\5 \21\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2"+
		"yx\3\2\2\2z\13\3\2\2\2{\u0084\7\35\2\2|\u0081\5\16\b\2}~\7\5\2\2~\u0080"+
		"\5\16\b\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084|\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u00a1\7\36\2\2\u0087\u0088\7"+
		"\32\2\2\u0088\u0089\5\34\17\2\u0089\u0092\7\3\2\2\u008a\u008f\5\16\b\2"+
		"\u008b\u008c\7\5\2\2\u008c\u008e\5\16\b\2\u008d\u008b\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\7\4\2\2\u0095\u00a1\3\2\2\2\u0096\u00a1\5\16\b\2\u0097"+
		"\u0098\7\31\2\2\u0098\u0099\7\3\2\2\u0099\u009a\5\16\b\2\u009a\u009b\7"+
		"\5\2\2\u009b\u009c\5\16\b\2\u009c\u009d\7\4\2\2\u009d\u00a1\3\2\2\2\u009e"+
		"\u00a1\5\36\20\2\u009f\u00a1\5 \21\2\u00a0{\3\2\2\2\u00a0\u0087\3\2\2"+
		"\2\u00a0\u0096\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a4\b\b\1\2\u00a3\u00a5\t\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b4\7+"+
		"\2\2\u00a7\u00b4\7,\2\2\u00a8\u00b4\7.\2\2\u00a9\u00b4\7/\2\2\u00aa\u00b4"+
		"\7-\2\2\u00ab\u00b4\5\32\16\2\u00ac\u00b4\5\34\17\2\u00ad\u00ae\7\3\2"+
		"\2\u00ae\u00af\5\16\b\2\u00af\u00b0\7\4\2\2\u00b0\u00b4\3\2\2\2\u00b1"+
		"\u00b2\t\3\2\2\u00b2\u00b4\5\16\b\b\u00b3\u00a2\3\2\2\2\u00b3\u00a7\3"+
		"\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00c6\3\2\2\2\u00b5\u00b6\f\7\2\2\u00b6\u00b7\7$\2\2\u00b7"+
		"\u00c5\5\16\b\b\u00b8\u00b9\f\6\2\2\u00b9\u00ba\t\2\2\2\u00ba\u00c5\5"+
		"\16\b\7\u00bb\u00bc\f\5\2\2\u00bc\u00bd\7&\2\2\u00bd\u00c5\5\16\b\6\u00be"+
		"\u00bf\f\4\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c5\5\16\b\5\u00c1\u00c2\f"+
		"\3\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c5\5\16\b\4\u00c4\u00b5\3\2\2\2\u00c4"+
		"\u00b8\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c1\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\17\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cd\5\22\n\2\u00ca\u00cd\5\24"+
		"\13\2\u00cb\u00cd\5\26\f\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\21\3\2\2\2\u00ce\u00cf\7)\2\2\u00cf\23\3\2\2\2\u00d0"+
		"\u00d1\b\13\1\2\u00d1\u00d2\5\22\n\2\u00d2\u00d3\7\35\2\2\u00d3\u00d4"+
		"\7\36\2\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\5\26\f\2\u00d6\u00d7\7\35\2"+
		"\2\u00d7\u00d8\7\36\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9"+
		"\u00d5\3\2\2\2\u00da\u00e0\3\2\2\2\u00db\u00dc\f\4\2\2\u00dc\u00dd\7\35"+
		"\2\2\u00dd\u00df\7\36\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e0\3\2\2"+
		"\2\u00e3\u00e4\7*\2\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7"+
		"\7\5\2\2\u00e7\u00e8\5\30\r\2\u00e8\u00e9\7\4\2\2\u00e9\27\3\2\2\2\u00ea"+
		"\u00ee\7*\2\2\u00eb\u00ee\5\22\n\2\u00ec\u00ee\5\24\13\2\u00ed\u00ea\3"+
		"\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\31\3\2\2\2\u00ef"+
		"\u00f4\5\34\17\2\u00f0\u00f1\7\35\2\2\u00f1\u00f2\5\16\b\2\u00f2\u00f3"+
		"\7\36\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\33\3\2\2\2\u00f8\u00f9"+
		"\7\60\2\2\u00f9\35\3\2\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fc\5\16\b\2\u00fc"+
		"\37\3\2\2\2\u00fd\u00fe\7\34\2\2\u00fe\u00ff\5\16\b\2\u00ff!\3\2\2\2\26"+
		"&\658kry\u0081\u0084\u008f\u0092\u00a0\u00a4\u00b3\u00c4\u00c6\u00cc\u00d9"+
		"\u00e0\u00ed\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}