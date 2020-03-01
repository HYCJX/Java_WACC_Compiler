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
		RULE_prog = 0, RULE_func = 1, RULE_param = 2, RULE_stat = 3, RULE_statSkip = 4, 
		RULE_statInitVar = 5, RULE_statAssignVar = 6, RULE_statRead = 7, RULE_statFree = 8, 
		RULE_statReturn = 9, RULE_statExit = 10, RULE_statPrint = 11, RULE_statPrintln = 12, 
		RULE_statCond = 13, RULE_statLoop = 14, RULE_statBegin = 15, RULE_assignLhs = 16, 
		RULE_assignRhs = 17, RULE_call = 18, RULE_newpair = 19, RULE_pairElem = 20, 
		RULE_pairElemFst = 21, RULE_pairElemSnd = 22, RULE_expr = 23, RULE_exprIntLit = 24, 
		RULE_exprBoolLit = 25, RULE_exprCharLit = 26, RULE_exprStrLit = 27, RULE_exprPairLit = 28, 
		RULE_exprParen = 29, RULE_exprUnop = 30, RULE_type = 31, RULE_baseType = 32, 
		RULE_pairType = 33, RULE_pairElemType = 34, RULE_arrayType = 35, RULE_arrayElem = 36, 
		RULE_intLiter = 37, RULE_arrayLiter = 38, RULE_ident = 39;
	public static final String[] ruleNames = {
		"prog", "func", "param", "stat", "statSkip", "statInitVar", "statAssignVar", 
		"statRead", "statFree", "statReturn", "statExit", "statPrint", "statPrintln", 
		"statCond", "statLoop", "statBegin", "assignLhs", "assignRhs", "call", 
		"newpair", "pairElem", "pairElemFst", "pairElemSnd", "expr", "exprIntLit", 
		"exprBoolLit", "exprCharLit", "exprStrLit", "exprPairLit", "exprParen", 
		"exprUnop", "type", "baseType", "pairType", "pairElemType", "arrayType", 
		"arrayElem", "intLiter", "arrayLiter", "ident"
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
			setState(80);
			match(BEGIN);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					func();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(87);
			stat(0);
			setState(88);
			match(END);
			setState(89);
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
			setState(91);
			type();
			setState(92);
			ident();
			setState(93);
			match(OPEN_PARENTHESES);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASE_TYPE || _la==PAIR) {
				{
				setState(94);
				param();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(95);
					match(COMMA);
					setState(96);
					param();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104);
			match(CLOSE_PARENTHESES);
			setState(105);
			match(IS);
			setState(106);
			stat(0);
			setState(107);
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
			setState(109);
			type();
			setState(110);
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
		public StatSkipContext statSkip() {
			return getRuleContext(StatSkipContext.class,0);
		}
		public StatInitVarContext statInitVar() {
			return getRuleContext(StatInitVarContext.class,0);
		}
		public StatAssignVarContext statAssignVar() {
			return getRuleContext(StatAssignVarContext.class,0);
		}
		public StatReadContext statRead() {
			return getRuleContext(StatReadContext.class,0);
		}
		public StatFreeContext statFree() {
			return getRuleContext(StatFreeContext.class,0);
		}
		public StatReturnContext statReturn() {
			return getRuleContext(StatReturnContext.class,0);
		}
		public StatExitContext statExit() {
			return getRuleContext(StatExitContext.class,0);
		}
		public StatPrintContext statPrint() {
			return getRuleContext(StatPrintContext.class,0);
		}
		public StatPrintlnContext statPrintln() {
			return getRuleContext(StatPrintlnContext.class,0);
		}
		public StatCondContext statCond() {
			return getRuleContext(StatCondContext.class,0);
		}
		public StatLoopContext statLoop() {
			return getRuleContext(StatLoopContext.class,0);
		}
		public StatBeginContext statBegin() {
			return getRuleContext(StatBeginContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(WaccParser.SEMICOLON, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStat(this);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SKIPS:
				{
				setState(113);
				statSkip();
				}
				break;
			case BASE_TYPE:
			case PAIR:
				{
				setState(114);
				statInitVar();
				}
				break;
			case FST:
			case SND:
			case IDENT:
				{
				setState(115);
				statAssignVar();
				}
				break;
			case READ:
				{
				setState(116);
				statRead();
				}
				break;
			case FREE:
				{
				setState(117);
				statFree();
				}
				break;
			case RETURN:
				{
				setState(118);
				statReturn();
				}
				break;
			case EXIT:
				{
				setState(119);
				statExit();
				}
				break;
			case PRINT:
				{
				setState(120);
				statPrint();
				}
				break;
			case PRINTLN:
				{
				setState(121);
				statPrintln();
				}
				break;
			case IF:
				{
				setState(122);
				statCond();
				}
				break;
			case WHILE:
				{
				setState(123);
				statLoop();
				}
				break;
			case BEGIN:
				{
				setState(124);
				statBegin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stat);
					setState(127);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(128);
					match(SEMICOLON);
					setState(129);
					stat(2);
					}
					} 
				}
				setState(134);
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

	public static class StatSkipContext extends ParserRuleContext {
		public TerminalNode SKIPS() { return getToken(WaccParser.SKIPS, 0); }
		public StatSkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statSkip; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatSkipContext statSkip() throws RecognitionException {
		StatSkipContext _localctx = new StatSkipContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statSkip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(SKIPS);
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

	public static class StatInitVarContext extends ParserRuleContext {
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
		public StatInitVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statInitVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatInitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatInitVarContext statInitVar() throws RecognitionException {
		StatInitVarContext _localctx = new StatInitVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statInitVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			type();
			setState(138);
			ident();
			setState(139);
			match(ASSIGN);
			setState(140);
			assignRhs();
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

	public static class StatAssignVarContext extends ParserRuleContext {
		public AssignLhsContext assignLhs() {
			return getRuleContext(AssignLhsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(WaccParser.ASSIGN, 0); }
		public AssignRhsContext assignRhs() {
			return getRuleContext(AssignRhsContext.class,0);
		}
		public StatAssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statAssignVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatAssignVarContext statAssignVar() throws RecognitionException {
		StatAssignVarContext _localctx = new StatAssignVarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statAssignVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			assignLhs();
			setState(143);
			match(ASSIGN);
			setState(144);
			assignRhs();
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

	public static class StatReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(WaccParser.READ, 0); }
		public AssignLhsContext assignLhs() {
			return getRuleContext(AssignLhsContext.class,0);
		}
		public StatReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statRead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatReadContext statRead() throws RecognitionException {
		StatReadContext _localctx = new StatReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(READ);
			setState(147);
			assignLhs();
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

	public static class StatFreeContext extends ParserRuleContext {
		public TerminalNode FREE() { return getToken(WaccParser.FREE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatFreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statFree; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatFree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatFreeContext statFree() throws RecognitionException {
		StatFreeContext _localctx = new StatFreeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statFree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FREE);
			setState(150);
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

	public static class StatReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(WaccParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatReturnContext statReturn() throws RecognitionException {
		StatReturnContext _localctx = new StatReturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(RETURN);
			setState(153);
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

	public static class StatExitContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(WaccParser.EXIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statExit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatExitContext statExit() throws RecognitionException {
		StatExitContext _localctx = new StatExitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statExit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(EXIT);
			setState(156);
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

	public static class StatPrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(WaccParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statPrint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatPrintContext statPrint() throws RecognitionException {
		StatPrintContext _localctx = new StatPrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(PRINT);
			setState(159);
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

	public static class StatPrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(WaccParser.PRINTLN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatPrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statPrintln; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatPrintlnContext statPrintln() throws RecognitionException {
		StatPrintlnContext _localctx = new StatPrintlnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statPrintln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(PRINTLN);
			setState(162);
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

	public static class StatCondContext extends ParserRuleContext {
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
		public StatCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statCond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatCondContext statCond() throws RecognitionException {
		StatCondContext _localctx = new StatCondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IF);
			setState(165);
			expr(0);
			setState(166);
			match(THEN);
			setState(167);
			stat(0);
			setState(168);
			match(ELSE);
			setState(169);
			stat(0);
			setState(170);
			match(FI);
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

	public static class StatLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(WaccParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(WaccParser.DO, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode DONE() { return getToken(WaccParser.DONE, 0); }
		public StatLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatLoopContext statLoop() throws RecognitionException {
		StatLoopContext _localctx = new StatLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WHILE);
			setState(173);
			expr(0);
			setState(174);
			match(DO);
			setState(175);
			stat(0);
			setState(176);
			match(DONE);
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

	public static class StatBeginContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(WaccParser.BEGIN, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode END() { return getToken(WaccParser.END, 0); }
		public StatBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statBegin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitStatBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatBeginContext statBegin() throws RecognitionException {
		StatBeginContext _localctx = new StatBeginContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(BEGIN);
			setState(179);
			stat(0);
			setState(180);
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

	public static class AssignLhsContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArrayElemContext arrayElem() {
			return getRuleContext(ArrayElemContext.class,0);
		}
		public PairElemContext pairElem() {
			return getRuleContext(PairElemContext.class,0);
		}
		public AssignLhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignLhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitAssignLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignLhsContext assignLhs() throws RecognitionException {
		AssignLhsContext _localctx = new AssignLhsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignLhs);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				arrayElem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				pairElem();
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
		public ArrayLiterContext arrayLiter() {
			return getRuleContext(ArrayLiterContext.class,0);
		}
		public PairElemContext pairElem() {
			return getRuleContext(PairElemContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewpairContext newpair() {
			return getRuleContext(NewpairContext.class,0);
		}
		public AssignRhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignRhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitAssignRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignRhsContext assignRhs() throws RecognitionException {
		AssignRhsContext _localctx = new AssignRhsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignRhs);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				arrayLiter();
				}
				break;
			case FST:
			case SND:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				pairElem();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				call();
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
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				expr(0);
				}
				break;
			case NEWPAIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				newpair();
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

	public static class CallContext extends ParserRuleContext {
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
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CALL);
			setState(195);
			ident();
			setState(196);
			match(OPEN_PARENTHESES);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PARENTHESES) | (1L << NOT) | (1L << NEG) | (1L << LENGTH) | (1L << ORD) | (1L << CHR) | (1L << ADD) | (1L << INT_LITER) | (1L << BOOL_LITER) | (1L << PAIR_LITER) | (1L << CHAR_LITER) | (1L << STR_LITER) | (1L << IDENT))) != 0)) {
				{
				setState(197);
				expr(0);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198);
					match(COMMA);
					setState(199);
					expr(0);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(207);
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

	public static class NewpairContext extends ParserRuleContext {
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
		public NewpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newpair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitNewpair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewpairContext newpair() throws RecognitionException {
		NewpairContext _localctx = new NewpairContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newpair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(NEWPAIR);
			setState(210);
			match(OPEN_PARENTHESES);
			setState(211);
			expr(0);
			setState(212);
			match(COMMA);
			setState(213);
			expr(0);
			setState(214);
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

	public static class PairElemContext extends ParserRuleContext {
		public PairElemFstContext pairElemFst() {
			return getRuleContext(PairElemFstContext.class,0);
		}
		public PairElemSndContext pairElemSnd() {
			return getRuleContext(PairElemSndContext.class,0);
		}
		public PairElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairElem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitPairElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairElemContext pairElem() throws RecognitionException {
		PairElemContext _localctx = new PairElemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pairElem);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FST:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				pairElemFst();
				}
				break;
			case SND:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				pairElemSnd();
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

	public static class PairElemFstContext extends ParserRuleContext {
		public TerminalNode FST() { return getToken(WaccParser.FST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PairElemFstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairElemFst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitPairElemFst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairElemFstContext pairElemFst() throws RecognitionException {
		PairElemFstContext _localctx = new PairElemFstContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pairElemFst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(FST);
			setState(221);
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

	public static class PairElemSndContext extends ParserRuleContext {
		public TerminalNode SND() { return getToken(WaccParser.SND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PairElemSndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairElemSnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitPairElemSnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairElemSndContext pairElemSnd() throws RecognitionException {
		PairElemSndContext _localctx = new PairElemSndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pairElemSnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(SND);
			setState(224);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprIntLitContext exprIntLit() {
			return getRuleContext(ExprIntLitContext.class,0);
		}
		public ExprBoolLitContext exprBoolLit() {
			return getRuleContext(ExprBoolLitContext.class,0);
		}
		public ExprCharLitContext exprCharLit() {
			return getRuleContext(ExprCharLitContext.class,0);
		}
		public ExprStrLitContext exprStrLit() {
			return getRuleContext(ExprStrLitContext.class,0);
		}
		public ExprPairLitContext exprPairLit() {
			return getRuleContext(ExprPairLitContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArrayElemContext arrayElem() {
			return getRuleContext(ArrayElemContext.class,0);
		}
		public ExprParenContext exprParen() {
			return getRuleContext(ExprParenContext.class,0);
		}
		public ExprUnopContext exprUnop() {
			return getRuleContext(ExprUnopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULDIVMOD() { return getToken(WaccParser.MULDIVMOD, 0); }
		public TerminalNode ADD() { return getToken(WaccParser.ADD, 0); }
		public TerminalNode NEG() { return getToken(WaccParser.NEG, 0); }
		public TerminalNode CMP() { return getToken(WaccParser.CMP, 0); }
		public TerminalNode EQ() { return getToken(WaccParser.EQ, 0); }
		public TerminalNode ANDOR() { return getToken(WaccParser.ANDOR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(227);
				exprIntLit();
				}
				break;
			case 2:
				{
				setState(228);
				exprBoolLit();
				}
				break;
			case 3:
				{
				setState(229);
				exprCharLit();
				}
				break;
			case 4:
				{
				setState(230);
				exprStrLit();
				}
				break;
			case 5:
				{
				setState(231);
				exprPairLit();
				}
				break;
			case 6:
				{
				setState(232);
				ident();
				}
				break;
			case 7:
				{
				setState(233);
				arrayElem();
				}
				break;
			case 8:
				{
				setState(234);
				exprParen();
				}
				break;
			case 9:
				{
				setState(235);
				exprUnop();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(239);
						match(MULDIVMOD);
						setState(240);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(242);
						_la = _input.LA(1);
						if ( !(_la==NEG || _la==ADD) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(245);
						match(CMP);
						setState(246);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(248);
						match(EQ);
						setState(249);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(251);
						match(ANDOR);
						setState(252);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ExprIntLitContext extends ParserRuleContext {
		public IntLiterContext intLiter() {
			return getRuleContext(IntLiterContext.class,0);
		}
		public ExprIntLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprIntLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprIntLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIntLitContext exprIntLit() throws RecognitionException {
		ExprIntLitContext _localctx = new ExprIntLitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exprIntLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			intLiter();
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

	public static class ExprBoolLitContext extends ParserRuleContext {
		public TerminalNode BOOL_LITER() { return getToken(WaccParser.BOOL_LITER, 0); }
		public ExprBoolLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBoolLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBoolLitContext exprBoolLit() throws RecognitionException {
		ExprBoolLitContext _localctx = new ExprBoolLitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprBoolLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(BOOL_LITER);
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

	public static class ExprCharLitContext extends ParserRuleContext {
		public TerminalNode CHAR_LITER() { return getToken(WaccParser.CHAR_LITER, 0); }
		public ExprCharLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCharLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprCharLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCharLitContext exprCharLit() throws RecognitionException {
		ExprCharLitContext _localctx = new ExprCharLitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exprCharLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(CHAR_LITER);
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

	public static class ExprStrLitContext extends ParserRuleContext {
		public TerminalNode STR_LITER() { return getToken(WaccParser.STR_LITER, 0); }
		public ExprStrLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStrLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprStrLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStrLitContext exprStrLit() throws RecognitionException {
		ExprStrLitContext _localctx = new ExprStrLitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprStrLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(STR_LITER);
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

	public static class ExprPairLitContext extends ParserRuleContext {
		public TerminalNode PAIR_LITER() { return getToken(WaccParser.PAIR_LITER, 0); }
		public ExprPairLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprPairLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprPairLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprPairLitContext exprPairLit() throws RecognitionException {
		ExprPairLitContext _localctx = new ExprPairLitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exprPairLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(PAIR_LITER);
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

	public static class ExprParenContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(WaccParser.OPEN_PARENTHESES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(WaccParser.CLOSE_PARENTHESES, 0); }
		public ExprParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprParen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprParenContext exprParen() throws RecognitionException {
		ExprParenContext _localctx = new ExprParenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exprParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(OPEN_PARENTHESES);
			setState(269);
			expr(0);
			setState(270);
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

	public static class ExprUnopContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(WaccParser.NOT, 0); }
		public TerminalNode NEG() { return getToken(WaccParser.NEG, 0); }
		public TerminalNode LENGTH() { return getToken(WaccParser.LENGTH, 0); }
		public TerminalNode ORD() { return getToken(WaccParser.ORD, 0); }
		public TerminalNode CHR() { return getToken(WaccParser.CHR, 0); }
		public ExprUnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprUnop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitExprUnop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprUnopContext exprUnop() throws RecognitionException {
		ExprUnopContext _localctx = new ExprUnopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exprUnop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NEG) | (1L << LENGTH) | (1L << ORD) | (1L << CHR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(273);
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
		enterRule(_localctx, 62, RULE_type);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				arrayType(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
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
		enterRule(_localctx, 64, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 66, RULE_pairType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(PAIR);
			setState(283);
			match(OPEN_PARENTHESES);
			setState(284);
			pairElemType();
			setState(285);
			match(COMMA);
			setState(286);
			pairElemType();
			setState(287);
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
		enterRule(_localctx, 68, RULE_pairElemType);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(PAIR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				baseType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_arrayType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASE_TYPE:
				{
				setState(295);
				baseType();
				setState(296);
				match(OPEN_BRACKET);
				setState(297);
				match(CLOSE_BRACKET);
				}
				break;
			case PAIR:
				{
				setState(299);
				pairType();
				setState(300);
				match(OPEN_BRACKET);
				setState(301);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arrayType);
					setState(305);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(306);
					match(OPEN_BRACKET);
					setState(307);
					match(CLOSE_BRACKET);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 72, RULE_arrayElem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			ident();
			setState(318); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(314);
					match(OPEN_BRACKET);
					setState(315);
					expr(0);
					setState(316);
					match(CLOSE_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class IntLiterContext extends ParserRuleContext {
		public TerminalNode INT_LITER() { return getToken(WaccParser.INT_LITER, 0); }
		public TerminalNode ADD() { return getToken(WaccParser.ADD, 0); }
		public TerminalNode NEG() { return getToken(WaccParser.NEG, 0); }
		public IntLiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitIntLiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiterContext intLiter() throws RecognitionException {
		IntLiterContext _localctx = new IntLiterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_intLiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG || _la==ADD) {
				{
				setState(322);
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

			setState(325);
			match(INT_LITER);
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

	public static class ArrayLiterContext extends ParserRuleContext {
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
		public ArrayLiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WaccParserVisitor ) return ((WaccParserVisitor<? extends T>)visitor).visitArrayLiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiterContext arrayLiter() throws RecognitionException {
		ArrayLiterContext _localctx = new ArrayLiterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayLiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(OPEN_BRACKET);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PARENTHESES) | (1L << NOT) | (1L << NEG) | (1L << LENGTH) | (1L << ORD) | (1L << CHR) | (1L << ADD) | (1L << INT_LITER) | (1L << BOOL_LITER) | (1L << PAIR_LITER) | (1L << CHAR_LITER) | (1L << STR_LITER) | (1L << IDENT))) != 0)) {
				{
				setState(328);
				expr(0);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(329);
					match(COMMA);
					setState(330);
					expr(0);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(338);
			match(CLOSE_BRACKET);
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
		enterRule(_localctx, 78, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return stat_sempred((StatContext)_localctx, predIndex);
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 35:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0159\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\7\2U\n"+
		"\2\f\2\16\2X\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3d\n\3\f\3"+
		"\16\3g\13\3\5\3i\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\3\5\7\5\u0085"+
		"\n\5\f\5\16\5\u0088\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00bc\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00c3\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00cb\n"+
		"\24\f\24\16\24\u00ce\13\24\5\24\u00d0\n\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\5\26\u00dd\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ef\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0100\n\31\f\31\16\31\u0103\13\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\5!\u0119"+
		"\n!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\5$\u0127\n$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u0132\n%\3%\3%\3%\7%\u0137\n%\f%\16%\u013a\13%\3&\3&\3&"+
		"\3&\3&\6&\u0141\n&\r&\16&\u0142\3\'\5\'\u0146\n\'\3\'\3\'\3(\3(\3(\3("+
		"\7(\u014e\n(\f(\16(\u0151\13(\5(\u0153\n(\3(\3(\3)\3)\3)\2\5\b\60H*\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NP\2\4\4\2  %%\3\2\37#\2\u015f\2R\3\2\2\2\4]\3\2\2\2\6o\3\2\2\2\b\177"+
		"\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3\2\2\2\16\u0090\3\2\2\2\20\u0094\3\2"+
		"\2\2\22\u0097\3\2\2\2\24\u009a\3\2\2\2\26\u009d\3\2\2\2\30\u00a0\3\2\2"+
		"\2\32\u00a3\3\2\2\2\34\u00a6\3\2\2\2\36\u00ae\3\2\2\2 \u00b4\3\2\2\2\""+
		"\u00bb\3\2\2\2$\u00c2\3\2\2\2&\u00c4\3\2\2\2(\u00d3\3\2\2\2*\u00dc\3\2"+
		"\2\2,\u00de\3\2\2\2.\u00e1\3\2\2\2\60\u00ee\3\2\2\2\62\u0104\3\2\2\2\64"+
		"\u0106\3\2\2\2\66\u0108\3\2\2\28\u010a\3\2\2\2:\u010c\3\2\2\2<\u010e\3"+
		"\2\2\2>\u0112\3\2\2\2@\u0118\3\2\2\2B\u011a\3\2\2\2D\u011c\3\2\2\2F\u0126"+
		"\3\2\2\2H\u0131\3\2\2\2J\u013b\3\2\2\2L\u0145\3\2\2\2N\u0149\3\2\2\2P"+
		"\u0156\3\2\2\2RV\7\7\2\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XV\3\2\2\2YZ\5\b\5\2Z[\7\b\2\2[\\\7\2\2\3\\\3\3\2\2\2]^"+
		"\5@!\2^_\5P)\2_h\7\3\2\2`e\5\6\4\2ab\7\5\2\2bd\5\6\4\2ca\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2h`\3\2\2\2hi\3\2\2\2ij\3\2"+
		"\2\2jk\7\4\2\2kl\7\t\2\2lm\5\b\5\2mn\7\b\2\2n\5\3\2\2\2op\5@!\2pq\5P)"+
		"\2q\7\3\2\2\2rs\b\5\1\2s\u0080\5\n\6\2t\u0080\5\f\7\2u\u0080\5\16\b\2"+
		"v\u0080\5\20\t\2w\u0080\5\22\n\2x\u0080\5\24\13\2y\u0080\5\26\f\2z\u0080"+
		"\5\30\r\2{\u0080\5\32\16\2|\u0080\5\34\17\2}\u0080\5\36\20\2~\u0080\5"+
		" \21\2\177r\3\2\2\2\177t\3\2\2\2\177u\3\2\2\2\177v\3\2\2\2\177w\3\2\2"+
		"\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177"+
		"}\3\2\2\2\177~\3\2\2\2\u0080\u0086\3\2\2\2\u0081\u0082\f\3\2\2\u0082\u0083"+
		"\7\6\2\2\u0083\u0085\5\b\5\4\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\t\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0089\u008a\7\n\2\2\u008a\13\3\2\2\2\u008b\u008c\5@!\2\u008c\u008d\5"+
		"P)\2\u008d\u008e\7\13\2\2\u008e\u008f\5$\23\2\u008f\r\3\2\2\2\u0090\u0091"+
		"\5\"\22\2\u0091\u0092\7\13\2\2\u0092\u0093\5$\23\2\u0093\17\3\2\2\2\u0094"+
		"\u0095\7\f\2\2\u0095\u0096\5\"\22\2\u0096\21\3\2\2\2\u0097\u0098\7\r\2"+
		"\2\u0098\u0099\5\60\31\2\u0099\23\3\2\2\2\u009a\u009b\7\16\2\2\u009b\u009c"+
		"\5\60\31\2\u009c\25\3\2\2\2\u009d\u009e\7\17\2\2\u009e\u009f\5\60\31\2"+
		"\u009f\27\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\5\60\31\2\u00a2\31"+
		"\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\5\60\31\2\u00a5\33\3\2\2\2\u00a6"+
		"\u00a7\7\22\2\2\u00a7\u00a8\5\60\31\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa"+
		"\5\b\5\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\5\b\5\2\u00ac\u00ad\7\25\2\2"+
		"\u00ad\35\3\2\2\2\u00ae\u00af\7\26\2\2\u00af\u00b0\5\60\31\2\u00b0\u00b1"+
		"\7\27\2\2\u00b1\u00b2\5\b\5\2\u00b2\u00b3\7\30\2\2\u00b3\37\3\2\2\2\u00b4"+
		"\u00b5\7\7\2\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7\7\b\2\2\u00b7!\3\2\2\2"+
		"\u00b8\u00bc\5P)\2\u00b9\u00bc\5J&\2\u00ba\u00bc\5*\26\2\u00bb\u00b8\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc#\3\2\2\2\u00bd\u00c3"+
		"\5N(\2\u00be\u00c3\5*\26\2\u00bf\u00c3\5&\24\2\u00c0\u00c3\5\60\31\2\u00c1"+
		"\u00c3\5(\25\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c5"+
		"\7\32\2\2\u00c5\u00c6\5P)\2\u00c6\u00cf\7\3\2\2\u00c7\u00cc\5\60\31\2"+
		"\u00c8\u00c9\7\5\2\2\u00c9\u00cb\5\60\31\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\7\4\2\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\31\2\2\u00d4\u00d5"+
		"\7\3\2\2\u00d5\u00d6\5\60\31\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8\5\60\31"+
		"\2\u00d8\u00d9\7\4\2\2\u00d9)\3\2\2\2\u00da\u00dd\5,\27\2\u00db\u00dd"+
		"\5.\30\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd+\3\2\2\2\u00de"+
		"\u00df\7\33\2\2\u00df\u00e0\5\60\31\2\u00e0-\3\2\2\2\u00e1\u00e2\7\34"+
		"\2\2\u00e2\u00e3\5\60\31\2\u00e3/\3\2\2\2\u00e4\u00e5\b\31\1\2\u00e5\u00ef"+
		"\5\62\32\2\u00e6\u00ef\5\64\33\2\u00e7\u00ef\5\66\34\2\u00e8\u00ef\58"+
		"\35\2\u00e9\u00ef\5:\36\2\u00ea\u00ef\5P)\2\u00eb\u00ef\5J&\2\u00ec\u00ef"+
		"\5<\37\2\u00ed\u00ef\5> \2\u00ee\u00e4\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee"+
		"\u00e7\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2"+
		"\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u0101\3\2\2\2\u00f0\u00f1\f\7\2\2\u00f1\u00f2\7$\2\2\u00f2\u0100\5\60"+
		"\31\b\u00f3\u00f4\f\6\2\2\u00f4\u00f5\t\2\2\2\u00f5\u0100\5\60\31\7\u00f6"+
		"\u00f7\f\5\2\2\u00f7\u00f8\7&\2\2\u00f8\u0100\5\60\31\6\u00f9\u00fa\f"+
		"\4\2\2\u00fa\u00fb\7\'\2\2\u00fb\u0100\5\60\31\5\u00fc\u00fd\f\3\2\2\u00fd"+
		"\u00fe\7(\2\2\u00fe\u0100\5\60\31\4\u00ff\u00f0\3\2\2\2\u00ff\u00f3\3"+
		"\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\61\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0104\u0105\5L\'\2\u0105\63\3\2\2\2\u0106\u0107"+
		"\7,\2\2\u0107\65\3\2\2\2\u0108\u0109\7.\2\2\u0109\67\3\2\2\2\u010a\u010b"+
		"\7/\2\2\u010b9\3\2\2\2\u010c\u010d\7-\2\2\u010d;\3\2\2\2\u010e\u010f\7"+
		"\3\2\2\u010f\u0110\5\60\31\2\u0110\u0111\7\4\2\2\u0111=\3\2\2\2\u0112"+
		"\u0113\t\3\2\2\u0113\u0114\5\60\31\2\u0114?\3\2\2\2\u0115\u0119\5B\"\2"+
		"\u0116\u0119\5H%\2\u0117\u0119\5D#\2\u0118\u0115\3\2\2\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0117\3\2\2\2\u0119A\3\2\2\2\u011a\u011b\7)\2\2\u011bC\3"+
		"\2\2\2\u011c\u011d\7*\2\2\u011d\u011e\7\3\2\2\u011e\u011f\5F$\2\u011f"+
		"\u0120\7\5\2\2\u0120\u0121\5F$\2\u0121\u0122\7\4\2\2\u0122E\3\2\2\2\u0123"+
		"\u0127\7*\2\2\u0124\u0127\5B\"\2\u0125\u0127\5H%\2\u0126\u0123\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127G\3\2\2\2\u0128\u0129\b"+
		"%\1\2\u0129\u012a\5B\"\2\u012a\u012b\7\35\2\2\u012b\u012c\7\36\2\2\u012c"+
		"\u0132\3\2\2\2\u012d\u012e\5D#\2\u012e\u012f\7\35\2\2\u012f\u0130\7\36"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u012d\3\2\2\2\u0132"+
		"\u0138\3\2\2\2\u0133\u0134\f\4\2\2\u0134\u0135\7\35\2\2\u0135\u0137\7"+
		"\36\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139I\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0140\5P)\2\u013c"+
		"\u013d\7\35\2\2\u013d\u013e\5\60\31\2\u013e\u013f\7\36\2\2\u013f\u0141"+
		"\3\2\2\2\u0140\u013c\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143K\3\2\2\2\u0144\u0146\t\2\2\2\u0145\u0144\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7+\2\2\u0148M\3\2"+
		"\2\2\u0149\u0152\7\35\2\2\u014a\u014f\5\60\31\2\u014b\u014c\7\5\2\2\u014c"+
		"\u014e\5\60\31\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3"+
		"\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u014a\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\36"+
		"\2\2\u0155O\3\2\2\2\u0156\u0157\7\60\2\2\u0157Q\3\2\2\2\27Veh\177\u0086"+
		"\u00bb\u00c2\u00cc\u00cf\u00dc\u00ee\u00ff\u0101\u0118\u0126\u0131\u0138"+
		"\u0142\u0145\u014f\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}