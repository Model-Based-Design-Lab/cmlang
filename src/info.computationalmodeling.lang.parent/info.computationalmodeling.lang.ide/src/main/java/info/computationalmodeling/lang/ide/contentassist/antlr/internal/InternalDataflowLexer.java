package info.computationalmodeling.lang.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataflowLexer extends Lexer {
    public static final int RULE_NINT=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_FLOAT=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalDataflowLexer() {;} 
    public InternalDataflowLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDataflowLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDataflow.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:11:7: ( '-inf' )
            // InternalDataflow.g:11:9: '-inf'
            {
            match("-inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:12:7: ( 'dataflow' )
            // InternalDataflow.g:12:9: 'dataflow'
            {
            match("dataflow"); 


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
            // InternalDataflow.g:13:7: ( 'graph' )
            // InternalDataflow.g:13:9: 'graph'
            {
            match("graph"); 


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
            // InternalDataflow.g:14:7: ( '{' )
            // InternalDataflow.g:14:9: '{'
            {
            match('{'); 

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
            // InternalDataflow.g:15:7: ( '}' )
            // InternalDataflow.g:15:9: '}'
            {
            match('}'); 

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
            // InternalDataflow.g:16:7: ( 'author' )
            // InternalDataflow.g:16:9: 'author'
            {
            match("author"); 


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
            // InternalDataflow.g:17:7: ( '=' )
            // InternalDataflow.g:17:9: '='
            {
            match('='); 

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
            // InternalDataflow.g:18:7: ( 'inputs' )
            // InternalDataflow.g:18:9: 'inputs'
            {
            match("inputs"); 


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
            // InternalDataflow.g:19:7: ( ',' )
            // InternalDataflow.g:19:9: ','
            {
            match(','); 

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
            // InternalDataflow.g:20:7: ( 'outputs' )
            // InternalDataflow.g:20:9: 'outputs'
            {
            match("outputs"); 


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
            // InternalDataflow.g:21:7: ( '-' )
            // InternalDataflow.g:21:9: '-'
            {
            match('-'); 

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
            // InternalDataflow.g:22:7: ( '->' )
            // InternalDataflow.g:22:9: '->'
            {
            match("->"); 


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
            // InternalDataflow.g:23:7: ( ';' )
            // InternalDataflow.g:23:9: ';'
            {
            match(';'); 

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
            // InternalDataflow.g:24:7: ( 'initial' )
            // InternalDataflow.g:24:9: 'initial'
            {
            match("initial"); 


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
            // InternalDataflow.g:25:7: ( 'tokens' )
            // InternalDataflow.g:25:9: 'tokens'
            {
            match("tokens"); 


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
            // InternalDataflow.g:26:7: ( ':' )
            // InternalDataflow.g:26:9: ':'
            {
            match(':'); 

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
            // InternalDataflow.g:27:7: ( 'production' )
            // InternalDataflow.g:27:9: 'production'
            {
            match("production"); 


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
            // InternalDataflow.g:28:7: ( 'rate' )
            // InternalDataflow.g:28:9: 'rate'
            {
            match("rate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:29:7: ( 'consumption' )
            // InternalDataflow.g:29:9: 'consumption'
            {
            match("consumption"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:30:7: ( 'name' )
            // InternalDataflow.g:30:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:31:7: ( 'token' )
            // InternalDataflow.g:31:9: 'token'
            {
            match("token"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:32:7: ( 'size' )
            // InternalDataflow.g:32:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:33:7: ( '[' )
            // InternalDataflow.g:33:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:34:7: ( ']' )
            // InternalDataflow.g:34:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:35:7: ( 'execution' )
            // InternalDataflow.g:35:9: 'execution'
            {
            match("execution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:36:7: ( 'time' )
            // InternalDataflow.g:36:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:37:7: ( 'input' )
            // InternalDataflow.g:37:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:38:7: ( 'signals' )
            // InternalDataflow.g:38:9: 'signals'
            {
            match("signals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:39:7: ( '/' )
            // InternalDataflow.g:39:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_NINT"
    public final void mRULE_NINT() throws RecognitionException {
        try {
            int _type = RULE_NINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:3459:11: ( '-' RULE_INT )
            // InternalDataflow.g:3459:13: '-' RULE_INT
            {
            match('-'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NINT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:3461:12: ( ( '-' )? ( RULE_INT )? '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )? )
            // InternalDataflow.g:3461:14: ( '-' )? ( RULE_INT )? '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            {
            // InternalDataflow.g:3461:14: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDataflow.g:3461:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalDataflow.g:3461:19: ( RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataflow.g:3461:19: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            mRULE_INT(); 
            // InternalDataflow.g:3461:42: ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataflow.g:3461:43: ( 'E' | 'e' ) ( '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalDataflow.g:3461:53: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalDataflow.g:3461:53: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    mRULE_INT(); 

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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataflow.g:3463:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDataflow.g:3463:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDataflow.g:3463:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataflow.g:3463:11: '^'
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

            // InternalDataflow.g:3463:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDataflow.g:
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
            	    break loop6;
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
            // InternalDataflow.g:3465:10: ( ( '0' .. '9' )+ )
            // InternalDataflow.g:3465:12: ( '0' .. '9' )+
            {
            // InternalDataflow.g:3465:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDataflow.g:3465:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalDataflow.g:3467:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDataflow.g:3467:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDataflow.g:3467:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataflow.g:3467:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDataflow.g:3467:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDataflow.g:3467:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDataflow.g:3467:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDataflow.g:3467:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDataflow.g:3467:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDataflow.g:3467:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDataflow.g:3467:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalDataflow.g:3469:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDataflow.g:3469:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDataflow.g:3469:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDataflow.g:3469:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalDataflow.g:3471:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDataflow.g:3471:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDataflow.g:3471:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDataflow.g:3471:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalDataflow.g:3471:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataflow.g:3471:41: ( '\\r' )? '\\n'
                    {
                    // InternalDataflow.g:3471:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalDataflow.g:3471:41: '\\r'
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
            // InternalDataflow.g:3473:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDataflow.g:3473:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDataflow.g:3473:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDataflow.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalDataflow.g:3475:16: ( . )
            // InternalDataflow.g:3475:18: .
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
        // InternalDataflow.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_NINT | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=38;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalDataflow.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalDataflow.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalDataflow.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalDataflow.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalDataflow.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalDataflow.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalDataflow.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalDataflow.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalDataflow.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalDataflow.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalDataflow.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalDataflow.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalDataflow.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalDataflow.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalDataflow.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalDataflow.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalDataflow.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalDataflow.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalDataflow.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalDataflow.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalDataflow.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalDataflow.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalDataflow.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalDataflow.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalDataflow.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalDataflow.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalDataflow.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalDataflow.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalDataflow.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalDataflow.g:1:184: RULE_NINT
                {
                mRULE_NINT(); 

                }
                break;
            case 31 :
                // InternalDataflow.g:1:194: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 32 :
                // InternalDataflow.g:1:205: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalDataflow.g:1:213: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalDataflow.g:1:222: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalDataflow.g:1:234: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalDataflow.g:1:250: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalDataflow.g:1:266: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalDataflow.g:1:274: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\41\2\45\2\uffff\1\45\1\uffff\1\45\1\uffff\1\45\1\uffff\1\45\1\uffff\5\45\2\uffff\1\45\1\74\1\75\2\36\1\uffff\2\36\5\uffff\1\101\1\uffff\1\45\1\uffff\1\45\2\uffff\1\45\1\uffff\1\45\1\uffff\1\45\1\uffff\2\45\1\uffff\5\45\2\uffff\1\45\4\uffff\1\75\3\uffff\26\45\1\147\1\45\1\151\1\45\1\153\1\154\3\45\1\160\1\45\1\163\2\45\1\167\1\uffff\1\45\1\uffff\1\45\2\uffff\3\45\1\uffff\1\175\1\176\1\uffff\2\45\1\u0081\1\uffff\5\45\2\uffff\1\u0087\1\u0088\1\uffff\2\45\1\u008b\1\45\1\u008d\2\uffff\2\45\1\uffff\1\45\1\uffff\2\45\1\u0093\1\u0094\1\45\2\uffff\1\u0096\1\uffff";
    static final String DFA16_eofS =
        "\u0097\uffff";
    static final String DFA16_minS =
        "\1\0\1\56\1\141\1\162\2\uffff\1\165\1\uffff\1\156\1\uffff\1\165\1\uffff\1\151\1\uffff\1\162\1\141\1\157\1\141\1\151\2\uffff\1\170\1\52\1\56\1\60\1\101\1\uffff\2\0\5\uffff\1\56\1\uffff\1\164\1\uffff\1\141\2\uffff\1\164\1\uffff\1\151\1\uffff\1\164\1\uffff\1\153\1\155\1\uffff\1\157\1\164\1\156\1\155\1\147\2\uffff\1\145\4\uffff\1\56\3\uffff\1\141\1\160\1\150\1\165\1\164\1\160\2\145\1\144\1\145\1\163\2\145\1\156\1\143\1\146\1\150\1\157\1\164\1\151\1\165\1\156\1\60\1\165\1\60\1\165\2\60\1\141\1\165\1\154\1\60\1\162\1\60\1\141\1\164\1\60\1\uffff\1\143\1\uffff\1\155\2\uffff\1\154\1\164\1\157\1\uffff\2\60\1\uffff\1\154\1\163\1\60\1\uffff\1\164\1\160\1\163\1\151\1\167\2\uffff\2\60\1\uffff\1\151\1\164\1\60\1\157\1\60\2\uffff\1\157\1\151\1\uffff\1\156\1\uffff\1\156\1\157\2\60\1\156\2\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\151\1\141\1\162\2\uffff\1\165\1\uffff\1\156\1\uffff\1\165\1\uffff\1\157\1\uffff\1\162\1\141\1\157\1\141\1\151\2\uffff\1\170\1\57\2\71\1\172\1\uffff\2\uffff\5\uffff\1\71\1\uffff\1\164\1\uffff\1\141\2\uffff\1\164\1\uffff\1\160\1\uffff\1\164\1\uffff\1\153\1\155\1\uffff\1\157\1\164\1\156\1\155\1\172\2\uffff\1\145\4\uffff\1\71\3\uffff\1\141\1\160\1\150\1\165\1\164\1\160\2\145\1\144\1\145\1\163\2\145\1\156\1\143\1\146\1\150\1\157\1\164\1\151\1\165\1\156\1\172\1\165\1\172\1\165\2\172\1\141\1\165\1\154\1\172\1\162\1\172\1\141\1\164\1\172\1\uffff\1\143\1\uffff\1\155\2\uffff\1\154\1\164\1\157\1\uffff\2\172\1\uffff\1\154\1\163\1\172\1\uffff\1\164\1\160\1\163\1\151\1\167\2\uffff\2\172\1\uffff\1\151\1\164\1\172\1\157\1\172\2\uffff\1\157\1\151\1\uffff\1\156\1\uffff\1\156\1\157\2\172\1\156\2\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\5\1\uffff\1\7\1\uffff\1\11\1\uffff\1\15\1\uffff\1\20\5\uffff\1\27\1\30\5\uffff\1\40\2\uffff\1\45\1\46\1\1\1\14\1\13\1\uffff\1\37\1\uffff\1\40\1\uffff\1\4\1\5\1\uffff\1\7\1\uffff\1\11\1\uffff\1\15\2\uffff\1\20\5\uffff\1\27\1\30\1\uffff\1\43\1\44\1\35\1\41\1\uffff\1\42\1\45\1\36\45\uffff\1\32\1\uffff\1\22\1\uffff\1\24\1\26\3\uffff\1\3\2\uffff\1\33\3\uffff\1\25\5\uffff\1\6\1\10\2\uffff\1\17\5\uffff\1\16\1\12\2\uffff\1\34\1\uffff\1\2\5\uffff\1\31\1\21\1\uffff\1\23";
    static final String DFA16_specialS =
        "\1\1\32\uffff\1\2\1\0\172\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\33\4\36\1\34\4\36\1\11\1\1\1\30\1\26\12\27\1\15\1\13\1\36\1\7\3\36\32\32\1\23\1\36\1\24\1\31\1\32\1\36\1\6\1\32\1\20\1\2\1\25\1\32\1\3\1\32\1\10\4\32\1\21\1\12\1\16\1\32\1\17\1\22\1\14\6\32\1\4\1\36\1\5\uff82\36",
            "\1\43\1\uffff\12\42\4\uffff\1\40\52\uffff\1\37",
            "\1\44",
            "\1\46",
            "",
            "",
            "\1\51",
            "",
            "\1\53",
            "",
            "\1\55",
            "",
            "\1\60\5\uffff\1\57",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "",
            "\1\71",
            "\1\72\4\uffff\1\73",
            "\1\43\1\uffff\12\76",
            "\12\43",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\0\77",
            "\0\77",
            "",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\12\42",
            "",
            "\1\102",
            "",
            "\1\103",
            "",
            "",
            "\1\104",
            "",
            "\1\106\6\uffff\1\105",
            "",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\117\22\uffff\1\116",
            "",
            "",
            "\1\120",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\12\76",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\150",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\152",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\161",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\162\7\45",
            "\1\164",
            "\1\165",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\166\7\45",
            "",
            "\1\170",
            "",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\177",
            "\1\u0080",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0089",
            "\1\u008a",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008c",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0095",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_NINT | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_28 = input.LA(1);

                        s = -1;
                        if ( ((LA16_28>='\u0000' && LA16_28<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='-') ) {s = 1;}

                        else if ( (LA16_0=='d') ) {s = 2;}

                        else if ( (LA16_0=='g') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='a') ) {s = 6;}

                        else if ( (LA16_0=='=') ) {s = 7;}

                        else if ( (LA16_0=='i') ) {s = 8;}

                        else if ( (LA16_0==',') ) {s = 9;}

                        else if ( (LA16_0=='o') ) {s = 10;}

                        else if ( (LA16_0==';') ) {s = 11;}

                        else if ( (LA16_0=='t') ) {s = 12;}

                        else if ( (LA16_0==':') ) {s = 13;}

                        else if ( (LA16_0=='p') ) {s = 14;}

                        else if ( (LA16_0=='r') ) {s = 15;}

                        else if ( (LA16_0=='c') ) {s = 16;}

                        else if ( (LA16_0=='n') ) {s = 17;}

                        else if ( (LA16_0=='s') ) {s = 18;}

                        else if ( (LA16_0=='[') ) {s = 19;}

                        else if ( (LA16_0==']') ) {s = 20;}

                        else if ( (LA16_0=='e') ) {s = 21;}

                        else if ( (LA16_0=='/') ) {s = 22;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 23;}

                        else if ( (LA16_0=='.') ) {s = 24;}

                        else if ( (LA16_0=='^') ) {s = 25;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='b'||LA16_0=='f'||LA16_0=='h'||(LA16_0>='j' && LA16_0<='m')||LA16_0=='q'||(LA16_0>='u' && LA16_0<='z')) ) {s = 26;}

                        else if ( (LA16_0=='\"') ) {s = 27;}

                        else if ( (LA16_0=='\'') ) {s = 28;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 29;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='+')||LA16_0=='<'||(LA16_0>='>' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_27 = input.LA(1);

                        s = -1;
                        if ( ((LA16_27>='\u0000' && LA16_27<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}