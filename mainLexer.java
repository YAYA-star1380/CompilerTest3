// Generated from C:\test\CompilerTest3\main.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mainLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, DIGIT=7, WS=8, EMAIL=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'21'", "'51'", "'+98'", "'0098'", "'13'", "'41'", "DIGIT", "WS", "EMAIL"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "DIGIT", "WS", "EMAIL", 
		"LOCAL_SUBPART", "DOMAIN_SUBPART"
	};


	public mainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "main.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\13Q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\6\t\62\n\t\r\t\16\t\63\3\t\3\t"+
		"\3\n\3\n\3\n\7\n;\n\n\f\n\16\n>\13\n\3\n\3\n\3\n\3\n\6\nD\n\n\r\n\16\n"+
		"E\3\13\6\13I\n\13\r\13\16\13J\3\f\6\fN\n\f\r\f\16\fO\2\r\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\2\23\13\1\25\2\1\27\2\1\3\2\6\3\2"+
		"\62;\5\2\f\f\17\17\"\"\f\2##&&((*/\62=??C\\aac|\u0080\u0080\6\2//\62;"+
		"C\\c|S\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\31\3\2\2\2\5\34\3"+
		"\2\2\2\7\37\3\2\2\2\t#\3\2\2\2\13(\3\2\2\2\r+\3\2\2\2\17.\3\2\2\2\21\61"+
		"\3\2\2\2\23\67\3\2\2\2\25H\3\2\2\2\27M\3\2\2\2\31\32\7\64\2\2\32\33\7"+
		"\63\2\2\33\4\3\2\2\2\34\35\7\67\2\2\35\36\7\63\2\2\36\6\3\2\2\2\37 \7"+
		"-\2\2 !\7;\2\2!\"\7:\2\2\"\b\3\2\2\2#$\7\62\2\2$%\7\62\2\2%&\7;\2\2&\'"+
		"\7:\2\2\'\n\3\2\2\2()\7\63\2\2)*\7\65\2\2*\f\3\2\2\2+,\7\66\2\2,-\7\63"+
		"\2\2-\16\3\2\2\2./\t\2\2\2/\20\3\2\2\2\60\62\t\3\2\2\61\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\t\2\2\66"+
		"\22\3\2\2\2\67<\5\25\13\289\7\60\2\29;\5\25\13\2:8\3\2\2\2;>\3\2\2\2<"+
		":\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7B\2\2@C\5\27\f\2AB\7\60\2\2"+
		"BD\5\27\f\2CA\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\24\3\2\2\2GI\t\4"+
		"\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\26\3\2\2\2LN\t\5\2\2ML\3"+
		"\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\30\3\2\2\2\b\2\63<EJO";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}