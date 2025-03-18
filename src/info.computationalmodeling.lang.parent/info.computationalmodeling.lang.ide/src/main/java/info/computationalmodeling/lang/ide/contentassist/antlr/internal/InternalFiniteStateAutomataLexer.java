package info.computationalmodeling.lang.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFiniteStateAutomataLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_FINAL=5;
    public static final int RULE_INITIAL=4;
    public static final int RULE_EPSILONSYMBOL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalFiniteStateAutomataLexer() {;} 
    public InternalFiniteStateAutomataLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFiniteStateAutomataLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFiniteStateAutomata.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:11:7: ( ',' )
            // InternalFiniteStateAutomata.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:12:7: ( ';' )
            // InternalFiniteStateAutomata.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:13:7: ( 'finite' )
            // InternalFiniteStateAutomata.g:13:9: 'finite'
            {
            match("finite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:14:7: ( 'state' )
            // InternalFiniteStateAutomata.g:14:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:15:7: ( 'automaton' )
            // InternalFiniteStateAutomata.g:15:9: 'automaton'
            {
            match("automaton"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:16:7: ( '{' )
            // InternalFiniteStateAutomata.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:17:7: ( '}' )
            // InternalFiniteStateAutomata.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:18:7: ( 'author' )
            // InternalFiniteStateAutomata.g:18:9: 'author'
            {
            match("author"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:19:7: ( '=' )
            // InternalFiniteStateAutomata.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:20:7: ( 'states' )
            // InternalFiniteStateAutomata.g:20:9: 'states'
            {
            match("states"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:21:7: ( '-' )
            // InternalFiniteStateAutomata.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:22:7: ( '->' )
            // InternalFiniteStateAutomata.g:22:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:23:7: ( '(' )
            // InternalFiniteStateAutomata.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:24:7: ( ')' )
            // InternalFiniteStateAutomata.g:24:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:25:7: ( '[' )
            // InternalFiniteStateAutomata.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:26:7: ( ']' )
            // InternalFiniteStateAutomata.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:27:7: ( '.' )
            // InternalFiniteStateAutomata.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_FINAL"
    public final void mRULE_FINAL() throws RecognitionException {
        try {
            int _type = RULE_FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2790:12: ( ( 'final' | 'f' ) )
            // InternalFiniteStateAutomata.g:2790:14: ( 'final' | 'f' )
            {
            // InternalFiniteStateAutomata.g:2790:14: ( 'final' | 'f' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='f') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='i') ) {
                    alt1=1;
                }
                else {
                    alt1=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFiniteStateAutomata.g:2790:15: 'final'
                    {
                    match("final"); 


                    }
                    break;
                case 2 :
                    // InternalFiniteStateAutomata.g:2790:23: 'f'
                    {
                    match('f'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FINAL"

    // $ANTLR start "RULE_INITIAL"
    public final void mRULE_INITIAL() throws RecognitionException {
        try {
            int _type = RULE_INITIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2792:14: ( ( 'initial' | 'i' ) )
            // InternalFiniteStateAutomata.g:2792:16: ( 'initial' | 'i' )
            {
            // InternalFiniteStateAutomata.g:2792:16: ( 'initial' | 'i' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='i') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFiniteStateAutomata.g:2792:17: 'initial'
                    {
                    match("initial"); 


                    }
                    break;
                case 2 :
                    // InternalFiniteStateAutomata.g:2792:27: 'i'
                    {
                    match('i'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INITIAL"

    // $ANTLR start "RULE_EPSILONSYMBOL"
    public final void mRULE_EPSILONSYMBOL() throws RecognitionException {
        try {
            int _type = RULE_EPSILONSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2794:20: ( '#' )
            // InternalFiniteStateAutomata.g:2794:22: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EPSILONSYMBOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2796:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFiniteStateAutomata.g:2796:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFiniteStateAutomata.g:2796:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFiniteStateAutomata.g:2796:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalFiniteStateAutomata.g:2796:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFiniteStateAutomata.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2798:10: ( ( '0' .. '9' )+ )
            // InternalFiniteStateAutomata.g:2798:12: ( '0' .. '9' )+
            {
            // InternalFiniteStateAutomata.g:2798:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFiniteStateAutomata.g:2798:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2800:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFiniteStateAutomata.g:2800:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFiniteStateAutomata.g:2800:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFiniteStateAutomata.g:2800:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFiniteStateAutomata.g:2800:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalFiniteStateAutomata.g:2800:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFiniteStateAutomata.g:2800:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFiniteStateAutomata.g:2800:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFiniteStateAutomata.g:2800:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFiniteStateAutomata.g:2800:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFiniteStateAutomata.g:2800:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2802:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFiniteStateAutomata.g:2802:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFiniteStateAutomata.g:2802:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFiniteStateAutomata.g:2802:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2804:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFiniteStateAutomata.g:2804:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFiniteStateAutomata.g:2804:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFiniteStateAutomata.g:2804:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalFiniteStateAutomata.g:2804:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFiniteStateAutomata.g:2804:41: ( '\\r' )? '\\n'
                    {
                    // InternalFiniteStateAutomata.g:2804:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFiniteStateAutomata.g:2804:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2806:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFiniteStateAutomata.g:2806:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFiniteStateAutomata.g:2806:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFiniteStateAutomata.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFiniteStateAutomata.g:2808:16: ( . )
            // InternalFiniteStateAutomata.g:2808:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalFiniteStateAutomata.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_FINAL | RULE_INITIAL | RULE_EPSILONSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=27;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalFiniteStateAutomata.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalFiniteStateAutomata.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalFiniteStateAutomata.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalFiniteStateAutomata.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalFiniteStateAutomata.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalFiniteStateAutomata.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalFiniteStateAutomata.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalFiniteStateAutomata.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalFiniteStateAutomata.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalFiniteStateAutomata.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalFiniteStateAutomata.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalFiniteStateAutomata.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalFiniteStateAutomata.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalFiniteStateAutomata.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalFiniteStateAutomata.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalFiniteStateAutomata.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalFiniteStateAutomata.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalFiniteStateAutomata.g:1:112: RULE_FINAL
                {
                mRULE_FINAL(); 

                }
                break;
            case 19 :
                // InternalFiniteStateAutomata.g:1:123: RULE_INITIAL
                {
                mRULE_INITIAL(); 

                }
                break;
            case 20 :
                // InternalFiniteStateAutomata.g:1:136: RULE_EPSILONSYMBOL
                {
                mRULE_EPSILONSYMBOL(); 

                }
                break;
            case 21 :
                // InternalFiniteStateAutomata.g:1:155: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalFiniteStateAutomata.g:1:163: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalFiniteStateAutomata.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalFiniteStateAutomata.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalFiniteStateAutomata.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalFiniteStateAutomata.g:1:216: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalFiniteStateAutomata.g:1:224: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\3\uffff\1\34\2\35\3\uffff\1\44\5\uffff\1\53\1\uffff\1\30\2\uffff\3\30\4\uffff\1\35\2\uffff\2\35\12\uffff\1\35\7\uffff\13\35\1\34\1\104\3\35\1\110\1\111\1\uffff\1\35\1\113\1\35\2\uffff\1\35\1\uffff\1\53\1\35\1\117\1\uffff";
    static final String DFA14_eofS =
        "\120\uffff";
    static final String DFA14_minS =
        "\1\0\2\uffff\1\60\1\164\1\165\3\uffff\1\76\5\uffff\1\60\1\uffff\1\101\2\uffff\2\0\1\52\4\uffff\1\156\2\uffff\1\141\1\164\12\uffff\1\151\7\uffff\1\141\1\164\1\150\2\164\1\154\1\145\1\155\1\157\1\151\1\145\2\60\1\141\1\162\1\141\2\60\1\uffff\1\164\1\60\1\154\2\uffff\1\157\1\uffff\1\60\1\156\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\uffff\1\172\1\164\1\165\3\uffff\1\76\5\uffff\1\172\1\uffff\1\172\2\uffff\2\uffff\1\57\4\uffff\1\156\2\uffff\1\141\1\164\12\uffff\1\151\7\uffff\1\151\1\164\1\157\2\164\1\154\1\145\1\155\1\157\1\151\1\145\2\172\1\141\1\162\1\141\2\172\1\uffff\1\164\1\172\1\154\2\uffff\1\157\1\uffff\1\172\1\156\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\1\7\1\11\1\uffff\1\15\1\16\1\17\1\20\1\21\1\uffff\1\24\1\uffff\1\25\1\26\3\uffff\1\32\1\33\1\1\1\2\1\uffff\1\22\1\25\2\uffff\1\6\1\7\1\11\1\14\1\13\1\15\1\16\1\17\1\20\1\21\1\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32\22\uffff\1\4\3\uffff\1\3\1\12\1\uffff\1\10\3\uffff\1\5";
    static final String DFA14_specialS =
        "\1\1\23\uffff\1\2\1\0\72\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\1\20\3\30\1\25\1\12\1\13\2\30\1\1\1\11\1\16\1\26\12\23\1\30\1\2\1\30\1\10\3\30\32\22\1\14\1\30\1\15\1\21\1\22\1\30\1\5\4\22\1\3\2\22\1\17\11\22\1\4\7\22\1\6\1\30\1\7\uff82\30",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\33\21\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\52\14\35",
            "",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "",
            "",
            "\1\62",
            "",
            "",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\7\uffff\1\66",
            "\1\70",
            "\1\72\6\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\22\35\1\103\7\35",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\112",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\114",
            "",
            "",
            "\1\115",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\116",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_FINAL | RULE_INITIAL | RULE_EPSILONSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_21 = input.LA(1);

                        s = -1;
                        if ( ((LA14_21>='\u0000' && LA14_21<='\uFFFF')) ) {s = 46;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0==',') ) {s = 1;}

                        else if ( (LA14_0==';') ) {s = 2;}

                        else if ( (LA14_0=='f') ) {s = 3;}

                        else if ( (LA14_0=='s') ) {s = 4;}

                        else if ( (LA14_0=='a') ) {s = 5;}

                        else if ( (LA14_0=='{') ) {s = 6;}

                        else if ( (LA14_0=='}') ) {s = 7;}

                        else if ( (LA14_0=='=') ) {s = 8;}

                        else if ( (LA14_0=='-') ) {s = 9;}

                        else if ( (LA14_0=='(') ) {s = 10;}

                        else if ( (LA14_0==')') ) {s = 11;}

                        else if ( (LA14_0=='[') ) {s = 12;}

                        else if ( (LA14_0==']') ) {s = 13;}

                        else if ( (LA14_0=='.') ) {s = 14;}

                        else if ( (LA14_0=='i') ) {s = 15;}

                        else if ( (LA14_0=='#') ) {s = 16;}

                        else if ( (LA14_0=='^') ) {s = 17;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='z')) ) {s = 18;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 19;}

                        else if ( (LA14_0=='\"') ) {s = 20;}

                        else if ( (LA14_0=='\'') ) {s = 21;}

                        else if ( (LA14_0=='/') ) {s = 22;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 23;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0==':'||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( ((LA14_20>='\u0000' && LA14_20<='\uFFFF')) ) {s = 46;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}