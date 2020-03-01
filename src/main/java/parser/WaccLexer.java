// Generated from WaccLexer.g4 by ANTLR 4.7.1

    package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WaccLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PARENTHESES", "CLOSE_PARENTHESES", "COMMA", "SEMICOLON", "BEGIN", 
		"END", "IS", "SKIPS", "ASSIGN", "READ", "FREE", "RETURN", "EXIT", "PRINT", 
		"PRINTLN", "IF", "THEN", "ELSE", "FI", "WHILE", "DO", "DONE", "NEWPAIR", 
		"CALL", "FST", "SND", "OPEN_BRACKET", "CLOSE_BRACKET", "NOT", "NEG", "LENGTH", 
		"ORD", "CHR", "MULDIVMOD", "ADD", "CMP", "EQ", "ANDOR", "BASE_TYPE", "PAIR", 
		"INT_LITER", "DIGIT", "BOOL_LITER", "PAIR_LITER", "CHAR_LITER", "CHARACTER", 
		"NORMAL_CHAR", "ESCAPED_CHAR", "STR_LITER", "IDENT", "LOWER_CASE", "UPPER_CASE", 
		"UNDER_SCORE", "COMMENT", "WS"
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


	public WaccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WaccLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u017a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\5%\u0102\n%\3"+
		"&\3&\3&\3&\5&\u0108\n&\3\'\3\'\3\'\3\'\5\'\u010e\n\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0121\n(\3)\3)\3)\3)\3)\3*\6*\u0129"+
		"\n*\r*\16*\u012a\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0138\n,\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3/\3/\5/\u0145\n/\3\60\3\60\3\61\3\61\3\61\3\62\3"+
		"\62\7\62\u014e\n\62\f\62\16\62\u0151\13\62\3\62\3\62\3\63\3\63\3\63\5"+
		"\63\u0158\n\63\3\63\3\63\3\63\3\63\7\63\u015e\n\63\f\63\16\63\u0161\13"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\7\67\u016b\n\67\f\67\16\67"+
		"\u016e\13\67\3\67\5\67\u0171\n\67\3\67\3\67\3\67\3\67\38\38\38\38\3\u016c"+
		"\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y-[.]\2_\2a\2c/e\60g\2i\2k\2m\61o\62"+
		"\3\2\7\5\2\'\',,\61\61\4\2>>@@\5\2$$))^^\13\2$$))\62\62^^ddhhppttvv\5"+
		"\2\13\f\17\17\"\"\2\u0185\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2c\3\2\2\2\2e"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2"+
		"\2\2\13y\3\2\2\2\r\177\3\2\2\2\17\u0083\3\2\2\2\21\u0086\3\2\2\2\23\u008b"+
		"\3\2\2\2\25\u008d\3\2\2\2\27\u0092\3\2\2\2\31\u0097\3\2\2\2\33\u009e\3"+
		"\2\2\2\35\u00a3\3\2\2\2\37\u00a9\3\2\2\2!\u00b1\3\2\2\2#\u00b4\3\2\2\2"+
		"%\u00b9\3\2\2\2\'\u00be\3\2\2\2)\u00c1\3\2\2\2+\u00c7\3\2\2\2-\u00ca\3"+
		"\2\2\2/\u00cf\3\2\2\2\61\u00d7\3\2\2\2\63\u00dc\3\2\2\2\65\u00e0\3\2\2"+
		"\2\67\u00e4\3\2\2\29\u00e6\3\2\2\2;\u00e8\3\2\2\2=\u00ea\3\2\2\2?\u00ec"+
		"\3\2\2\2A\u00f0\3\2\2\2C\u00f4\3\2\2\2E\u00f8\3\2\2\2G\u00fa\3\2\2\2I"+
		"\u0101\3\2\2\2K\u0107\3\2\2\2M\u010d\3\2\2\2O\u0120\3\2\2\2Q\u0122\3\2"+
		"\2\2S\u0128\3\2\2\2U\u012c\3\2\2\2W\u0137\3\2\2\2Y\u0139\3\2\2\2[\u013e"+
		"\3\2\2\2]\u0144\3\2\2\2_\u0146\3\2\2\2a\u0148\3\2\2\2c\u014b\3\2\2\2e"+
		"\u0157\3\2\2\2g\u0162\3\2\2\2i\u0164\3\2\2\2k\u0166\3\2\2\2m\u0168\3\2"+
		"\2\2o\u0176\3\2\2\2qr\7*\2\2r\4\3\2\2\2st\7+\2\2t\6\3\2\2\2uv\7.\2\2v"+
		"\b\3\2\2\2wx\7=\2\2x\n\3\2\2\2yz\7d\2\2z{\7g\2\2{|\7i\2\2|}\7k\2\2}~\7"+
		"p\2\2~\f\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082\7f\2"+
		"\2\u0082\16\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7u\2\2\u0085\20\3\2"+
		"\2\2\u0086\u0087\7u\2\2\u0087\u0088\7m\2\2\u0088\u0089\7k\2\2\u0089\u008a"+
		"\7r\2\2\u008a\22\3\2\2\2\u008b\u008c\7?\2\2\u008c\24\3\2\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7c\2\2\u0090\u0091\7f\2\2\u0091"+
		"\26\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7g\2\2\u0096\30\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7w\2\2\u009b\u009c\7t\2\2\u009c\u009d\7p\2\2"+
		"\u009d\32\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7z\2\2\u00a0\u00a1\7"+
		"k\2\2\u00a1\u00a2\7v\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5"+
		"\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\36\3\2\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0 \3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3\"\3\2\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8"+
		"\7p\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc"+
		"\7u\2\2\u00bc\u00bd\7g\2\2\u00bd&\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2\u00c6*\3\2\2\2\u00c7\u00c8"+
		"\7f\2\2\u00c8\u00c9\7q\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7g\2\2\u00ce.\3\2\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7r\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7t\2\2\u00d6\60\3\2\2\2\u00d7"+
		"\u00d8\7e\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7n\2\2"+
		"\u00db\62\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7"+
		"v\2\2\u00df\64\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3"+
		"\7f\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7]\2\2\u00e58\3\2\2\2\u00e6\u00e7"+
		"\7_\2\2\u00e7:\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7"+
		"/\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3"+
		"\7f\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7"+
		"\7t\2\2\u00f7D\3\2\2\2\u00f8\u00f9\t\2\2\2\u00f9F\3\2\2\2\u00fa\u00fb"+
		"\7-\2\2\u00fbH\3\2\2\2\u00fc\u0102\t\3\2\2\u00fd\u00fe\7@\2\2\u00fe\u0102"+
		"\7?\2\2\u00ff\u0100\7>\2\2\u0100\u0102\7?\2\2\u0101\u00fc\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0101\u00ff\3\2\2\2\u0102J\3\2\2\2\u0103\u0104\7?\2\2\u0104"+
		"\u0108\7?\2\2\u0105\u0106\7#\2\2\u0106\u0108\7?\2\2\u0107\u0103\3\2\2"+
		"\2\u0107\u0105\3\2\2\2\u0108L\3\2\2\2\u0109\u010a\7(\2\2\u010a\u010e\7"+
		"(\2\2\u010b\u010c\7~\2\2\u010c\u010e\7~\2\2\u010d\u0109\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010eN\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111"+
		"\u0121\7v\2\2\u0112\u0113\7d\2\2\u0113\u0114\7q\2\2\u0114\u0115\7q\2\2"+
		"\u0115\u0121\7n\2\2\u0116\u0117\7e\2\2\u0117\u0118\7j\2\2\u0118\u0119"+
		"\7c\2\2\u0119\u0121\7t\2\2\u011a\u011b\7u\2\2\u011b\u011c\7v\2\2\u011c"+
		"\u011d\7t\2\2\u011d\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0121\7i\2\2"+
		"\u0120\u010f\3\2\2\2\u0120\u0112\3\2\2\2\u0120\u0116\3\2\2\2\u0120\u011a"+
		"\3\2\2\2\u0121P\3\2\2\2\u0122\u0123\7r\2\2\u0123\u0124\7c\2\2\u0124\u0125"+
		"\7k\2\2\u0125\u0126\7t\2\2\u0126R\3\2\2\2\u0127\u0129\5U+\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"T\3\2\2\2\u012c\u012d\4\62;\2\u012dV\3\2\2\2\u012e\u012f\7v\2\2\u012f"+
		"\u0130\7t\2\2\u0130\u0131\7w\2\2\u0131\u0138\7g\2\2\u0132\u0133\7h\2\2"+
		"\u0133\u0134\7c\2\2\u0134\u0135\7n\2\2\u0135\u0136\7u\2\2\u0136\u0138"+
		"\7g\2\2\u0137\u012e\3\2\2\2\u0137\u0132\3\2\2\2\u0138X\3\2\2\2\u0139\u013a"+
		"\7p\2\2\u013a\u013b\7w\2\2\u013b\u013c\7n\2\2\u013c\u013d\7n\2\2\u013d"+
		"Z\3\2\2\2\u013e\u013f\7)\2\2\u013f\u0140\5]/\2\u0140\u0141\7)\2\2\u0141"+
		"\\\3\2\2\2\u0142\u0145\5_\60\2\u0143\u0145\5a\61\2\u0144\u0142\3\2\2\2"+
		"\u0144\u0143\3\2\2\2\u0145^\3\2\2\2\u0146\u0147\n\4\2\2\u0147`\3\2\2\2"+
		"\u0148\u0149\7^\2\2\u0149\u014a\t\5\2\2\u014ab\3\2\2\2\u014b\u014f\7$"+
		"\2\2\u014c\u014e\5]/\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0153\7$\2\2\u0153d\3\2\2\2\u0154\u0158\5k\66\2\u0155\u0158\5g\64\2\u0156"+
		"\u0158\5i\65\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2"+
		"\2\2\u0158\u015f\3\2\2\2\u0159\u015e\5k\66\2\u015a\u015e\5g\64\2\u015b"+
		"\u015e\5i\65\2\u015c\u015e\5U+\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2\2"+
		"\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160f\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\4c|\2\u0163h\3\2\2\2\u0164\u0165\4C\\\2\u0165j\3\2\2\2\u0166\u0167"+
		"\7a\2\2\u0167l\3\2\2\2\u0168\u016c\7%\2\2\u0169\u016b\13\2\2\2\u016a\u0169"+
		"\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\7\17\2\2\u0170\u016f\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\f\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\b\67\2\2\u0175n\3\2\2\2\u0176\u0177\t\6\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u0179\b8\2\2\u0179p\3\2\2\2\20\2\u0101\u0107"+
		"\u010d\u0120\u012a\u0137\u0144\u014f\u0157\u015d\u015f\u016c\u0170\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}