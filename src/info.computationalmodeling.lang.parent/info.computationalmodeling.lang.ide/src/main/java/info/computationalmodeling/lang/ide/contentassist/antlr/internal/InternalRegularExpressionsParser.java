package info.computationalmodeling.lang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import info.computationalmodeling.lang.services.RegularExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRegularExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EMPTYSET", "RULE_EPSILON", "RULE_SIMPLELETTER", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'regular'", "'expression'", "'='", "'where'", "'+'", "'.'", "'('", "')'", "'@'", "'*'", "'**'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SIMPLELETTER=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_EMPTYSET=4;
    public static final int RULE_ID=8;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_EPSILON=5;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRegularExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRegularExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRegularExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRegularExpressions.g"; }


    	private RegularExpressionsGrammarAccess grammarAccess;

    	public void setGrammarAccess(RegularExpressionsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRegExModel"
    // InternalRegularExpressions.g:53:1: entryRuleRegExModel : ruleRegExModel EOF ;
    public final void entryRuleRegExModel() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:54:1: ( ruleRegExModel EOF )
            // InternalRegularExpressions.g:55:1: ruleRegExModel EOF
            {
             before(grammarAccess.getRegExModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRegExModel();

            state._fsp--;

             after(grammarAccess.getRegExModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegExModel"


    // $ANTLR start "ruleRegExModel"
    // InternalRegularExpressions.g:62:1: ruleRegExModel : ( ( rule__RegExModel__Group__0 ) ) ;
    public final void ruleRegExModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:66:2: ( ( ( rule__RegExModel__Group__0 ) ) )
            // InternalRegularExpressions.g:67:2: ( ( rule__RegExModel__Group__0 ) )
            {
            // InternalRegularExpressions.g:67:2: ( ( rule__RegExModel__Group__0 ) )
            // InternalRegularExpressions.g:68:3: ( rule__RegExModel__Group__0 )
            {
             before(grammarAccess.getRegExModelAccess().getGroup()); 
            // InternalRegularExpressions.g:69:3: ( rule__RegExModel__Group__0 )
            // InternalRegularExpressions.g:69:4: rule__RegExModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegExModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegExModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegExModel"


    // $ANTLR start "entryRuleDefinition"
    // InternalRegularExpressions.g:78:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:79:1: ( ruleDefinition EOF )
            // InternalRegularExpressions.g:80:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalRegularExpressions.g:87:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:91:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalRegularExpressions.g:92:2: ( ( rule__Definition__Group__0 ) )
            {
            // InternalRegularExpressions.g:92:2: ( ( rule__Definition__Group__0 ) )
            // InternalRegularExpressions.g:93:3: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalRegularExpressions.g:94:3: ( rule__Definition__Group__0 )
            // InternalRegularExpressions.g:94:4: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleRegularExpression"
    // InternalRegularExpressions.g:103:1: entryRuleRegularExpression : ruleRegularExpression EOF ;
    public final void entryRuleRegularExpression() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:104:1: ( ruleRegularExpression EOF )
            // InternalRegularExpressions.g:105:1: ruleRegularExpression EOF
            {
             before(grammarAccess.getRegularExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularExpression();

            state._fsp--;

             after(grammarAccess.getRegularExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularExpression"


    // $ANTLR start "ruleRegularExpression"
    // InternalRegularExpressions.g:112:1: ruleRegularExpression : ( ( rule__RegularExpression__Group__0 ) ) ;
    public final void ruleRegularExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:116:2: ( ( ( rule__RegularExpression__Group__0 ) ) )
            // InternalRegularExpressions.g:117:2: ( ( rule__RegularExpression__Group__0 ) )
            {
            // InternalRegularExpressions.g:117:2: ( ( rule__RegularExpression__Group__0 ) )
            // InternalRegularExpressions.g:118:3: ( rule__RegularExpression__Group__0 )
            {
             before(grammarAccess.getRegularExpressionAccess().getGroup()); 
            // InternalRegularExpressions.g:119:3: ( rule__RegularExpression__Group__0 )
            // InternalRegularExpressions.g:119:4: rule__RegularExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularExpression"


    // $ANTLR start "entryRuleRegularExpression1"
    // InternalRegularExpressions.g:128:1: entryRuleRegularExpression1 : ruleRegularExpression1 EOF ;
    public final void entryRuleRegularExpression1() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:129:1: ( ruleRegularExpression1 EOF )
            // InternalRegularExpressions.g:130:1: ruleRegularExpression1 EOF
            {
             before(grammarAccess.getRegularExpression1Rule()); 
            pushFollow(FOLLOW_1);
            ruleRegularExpression1();

            state._fsp--;

             after(grammarAccess.getRegularExpression1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularExpression1"


    // $ANTLR start "ruleRegularExpression1"
    // InternalRegularExpressions.g:137:1: ruleRegularExpression1 : ( ( rule__RegularExpression1__Group__0 ) ) ;
    public final void ruleRegularExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:141:2: ( ( ( rule__RegularExpression1__Group__0 ) ) )
            // InternalRegularExpressions.g:142:2: ( ( rule__RegularExpression1__Group__0 ) )
            {
            // InternalRegularExpressions.g:142:2: ( ( rule__RegularExpression1__Group__0 ) )
            // InternalRegularExpressions.g:143:3: ( rule__RegularExpression1__Group__0 )
            {
             before(grammarAccess.getRegularExpression1Access().getGroup()); 
            // InternalRegularExpressions.g:144:3: ( rule__RegularExpression1__Group__0 )
            // InternalRegularExpressions.g:144:4: rule__RegularExpression1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularExpression1"


    // $ANTLR start "entryRuleRegularExpression2"
    // InternalRegularExpressions.g:153:1: entryRuleRegularExpression2 : ruleRegularExpression2 EOF ;
    public final void entryRuleRegularExpression2() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:154:1: ( ruleRegularExpression2 EOF )
            // InternalRegularExpressions.g:155:1: ruleRegularExpression2 EOF
            {
             before(grammarAccess.getRegularExpression2Rule()); 
            pushFollow(FOLLOW_1);
            ruleRegularExpression2();

            state._fsp--;

             after(grammarAccess.getRegularExpression2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularExpression2"


    // $ANTLR start "ruleRegularExpression2"
    // InternalRegularExpressions.g:162:1: ruleRegularExpression2 : ( ( rule__RegularExpression2__Group__0 ) ) ;
    public final void ruleRegularExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:166:2: ( ( ( rule__RegularExpression2__Group__0 ) ) )
            // InternalRegularExpressions.g:167:2: ( ( rule__RegularExpression2__Group__0 ) )
            {
            // InternalRegularExpressions.g:167:2: ( ( rule__RegularExpression2__Group__0 ) )
            // InternalRegularExpressions.g:168:3: ( rule__RegularExpression2__Group__0 )
            {
             before(grammarAccess.getRegularExpression2Access().getGroup()); 
            // InternalRegularExpressions.g:169:3: ( rule__RegularExpression2__Group__0 )
            // InternalRegularExpressions.g:169:4: rule__RegularExpression2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularExpression2"


    // $ANTLR start "entryRuleRegularExpression3"
    // InternalRegularExpressions.g:178:1: entryRuleRegularExpression3 : ruleRegularExpression3 EOF ;
    public final void entryRuleRegularExpression3() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:179:1: ( ruleRegularExpression3 EOF )
            // InternalRegularExpressions.g:180:1: ruleRegularExpression3 EOF
            {
             before(grammarAccess.getRegularExpression3Rule()); 
            pushFollow(FOLLOW_1);
            ruleRegularExpression3();

            state._fsp--;

             after(grammarAccess.getRegularExpression3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularExpression3"


    // $ANTLR start "ruleRegularExpression3"
    // InternalRegularExpressions.g:187:1: ruleRegularExpression3 : ( ( rule__RegularExpression3__Alternatives ) ) ;
    public final void ruleRegularExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:191:2: ( ( ( rule__RegularExpression3__Alternatives ) ) )
            // InternalRegularExpressions.g:192:2: ( ( rule__RegularExpression3__Alternatives ) )
            {
            // InternalRegularExpressions.g:192:2: ( ( rule__RegularExpression3__Alternatives ) )
            // InternalRegularExpressions.g:193:3: ( rule__RegularExpression3__Alternatives )
            {
             before(grammarAccess.getRegularExpression3Access().getAlternatives()); 
            // InternalRegularExpressions.g:194:3: ( rule__RegularExpression3__Alternatives )
            // InternalRegularExpressions.g:194:4: rule__RegularExpression3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression3Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularExpression3"


    // $ANTLR start "entryRuleEmptyLanguageExpression"
    // InternalRegularExpressions.g:203:1: entryRuleEmptyLanguageExpression : ruleEmptyLanguageExpression EOF ;
    public final void entryRuleEmptyLanguageExpression() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:204:1: ( ruleEmptyLanguageExpression EOF )
            // InternalRegularExpressions.g:205:1: ruleEmptyLanguageExpression EOF
            {
             before(grammarAccess.getEmptyLanguageExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyLanguageExpression();

            state._fsp--;

             after(grammarAccess.getEmptyLanguageExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmptyLanguageExpression"


    // $ANTLR start "ruleEmptyLanguageExpression"
    // InternalRegularExpressions.g:212:1: ruleEmptyLanguageExpression : ( RULE_EMPTYSET ) ;
    public final void ruleEmptyLanguageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:216:2: ( ( RULE_EMPTYSET ) )
            // InternalRegularExpressions.g:217:2: ( RULE_EMPTYSET )
            {
            // InternalRegularExpressions.g:217:2: ( RULE_EMPTYSET )
            // InternalRegularExpressions.g:218:3: RULE_EMPTYSET
            {
             before(grammarAccess.getEmptyLanguageExpressionAccess().getEMPTYSETTerminalRuleCall()); 
            match(input,RULE_EMPTYSET,FOLLOW_2); 
             after(grammarAccess.getEmptyLanguageExpressionAccess().getEMPTYSETTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyLanguageExpression"


    // $ANTLR start "entryRuleEmptyWordExpression"
    // InternalRegularExpressions.g:228:1: entryRuleEmptyWordExpression : ruleEmptyWordExpression EOF ;
    public final void entryRuleEmptyWordExpression() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:229:1: ( ruleEmptyWordExpression EOF )
            // InternalRegularExpressions.g:230:1: ruleEmptyWordExpression EOF
            {
             before(grammarAccess.getEmptyWordExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyWordExpression();

            state._fsp--;

             after(grammarAccess.getEmptyWordExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmptyWordExpression"


    // $ANTLR start "ruleEmptyWordExpression"
    // InternalRegularExpressions.g:237:1: ruleEmptyWordExpression : ( RULE_EPSILON ) ;
    public final void ruleEmptyWordExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:241:2: ( ( RULE_EPSILON ) )
            // InternalRegularExpressions.g:242:2: ( RULE_EPSILON )
            {
            // InternalRegularExpressions.g:242:2: ( RULE_EPSILON )
            // InternalRegularExpressions.g:243:3: RULE_EPSILON
            {
             before(grammarAccess.getEmptyWordExpressionAccess().getEPSILONTerminalRuleCall()); 
            match(input,RULE_EPSILON,FOLLOW_2); 
             after(grammarAccess.getEmptyWordExpressionAccess().getEPSILONTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyWordExpression"


    // $ANTLR start "entryRuleLetterExpression"
    // InternalRegularExpressions.g:253:1: entryRuleLetterExpression : ruleLetterExpression EOF ;
    public final void entryRuleLetterExpression() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:254:1: ( ruleLetterExpression EOF )
            // InternalRegularExpressions.g:255:1: ruleLetterExpression EOF
            {
             before(grammarAccess.getLetterExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLetterExpression();

            state._fsp--;

             after(grammarAccess.getLetterExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLetterExpression"


    // $ANTLR start "ruleLetterExpression"
    // InternalRegularExpressions.g:262:1: ruleLetterExpression : ( ruleLetter ) ;
    public final void ruleLetterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:266:2: ( ( ruleLetter ) )
            // InternalRegularExpressions.g:267:2: ( ruleLetter )
            {
            // InternalRegularExpressions.g:267:2: ( ruleLetter )
            // InternalRegularExpressions.g:268:3: ruleLetter
            {
             before(grammarAccess.getLetterExpressionAccess().getLetterParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleLetter();

            state._fsp--;

             after(grammarAccess.getLetterExpressionAccess().getLetterParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetterExpression"


    // $ANTLR start "entryRuleReferenceExpression"
    // InternalRegularExpressions.g:278:1: entryRuleReferenceExpression : ruleReferenceExpression EOF ;
    public final void entryRuleReferenceExpression() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:279:1: ( ruleReferenceExpression EOF )
            // InternalRegularExpressions.g:280:1: ruleReferenceExpression EOF
            {
             before(grammarAccess.getReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceExpression();

            state._fsp--;

             after(grammarAccess.getReferenceExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceExpression"


    // $ANTLR start "ruleReferenceExpression"
    // InternalRegularExpressions.g:287:1: ruleReferenceExpression : ( ( rule__ReferenceExpression__Group__0 ) ) ;
    public final void ruleReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:291:2: ( ( ( rule__ReferenceExpression__Group__0 ) ) )
            // InternalRegularExpressions.g:292:2: ( ( rule__ReferenceExpression__Group__0 ) )
            {
            // InternalRegularExpressions.g:292:2: ( ( rule__ReferenceExpression__Group__0 ) )
            // InternalRegularExpressions.g:293:3: ( rule__ReferenceExpression__Group__0 )
            {
             before(grammarAccess.getReferenceExpressionAccess().getGroup()); 
            // InternalRegularExpressions.g:294:3: ( rule__ReferenceExpression__Group__0 )
            // InternalRegularExpressions.g:294:4: rule__ReferenceExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceExpression"


    // $ANTLR start "entryRuleLetter"
    // InternalRegularExpressions.g:303:1: entryRuleLetter : ruleLetter EOF ;
    public final void entryRuleLetter() throws RecognitionException {
        try {
            // InternalRegularExpressions.g:304:1: ( ruleLetter EOF )
            // InternalRegularExpressions.g:305:1: ruleLetter EOF
            {
             before(grammarAccess.getLetterRule()); 
            pushFollow(FOLLOW_1);
            ruleLetter();

            state._fsp--;

             after(grammarAccess.getLetterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLetter"


    // $ANTLR start "ruleLetter"
    // InternalRegularExpressions.g:312:1: ruleLetter : ( ( rule__Letter__Alternatives ) ) ;
    public final void ruleLetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:316:2: ( ( ( rule__Letter__Alternatives ) ) )
            // InternalRegularExpressions.g:317:2: ( ( rule__Letter__Alternatives ) )
            {
            // InternalRegularExpressions.g:317:2: ( ( rule__Letter__Alternatives ) )
            // InternalRegularExpressions.g:318:3: ( rule__Letter__Alternatives )
            {
             before(grammarAccess.getLetterAccess().getAlternatives()); 
            // InternalRegularExpressions.g:319:3: ( rule__Letter__Alternatives )
            // InternalRegularExpressions.g:319:4: rule__Letter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Letter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLetterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetter"


    // $ANTLR start "rule__RegularExpression2__Alternatives_1"
    // InternalRegularExpressions.g:327:1: rule__RegularExpression2__Alternatives_1 : ( ( ( rule__RegularExpression2__KleeneAssignment_1_0 ) ) | ( ( rule__RegularExpression2__OmegaAssignment_1_1 ) ) );
    public final void rule__RegularExpression2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:331:1: ( ( ( rule__RegularExpression2__KleeneAssignment_1_0 ) ) | ( ( rule__RegularExpression2__OmegaAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRegularExpressions.g:332:2: ( ( rule__RegularExpression2__KleeneAssignment_1_0 ) )
                    {
                    // InternalRegularExpressions.g:332:2: ( ( rule__RegularExpression2__KleeneAssignment_1_0 ) )
                    // InternalRegularExpressions.g:333:3: ( rule__RegularExpression2__KleeneAssignment_1_0 )
                    {
                     before(grammarAccess.getRegularExpression2Access().getKleeneAssignment_1_0()); 
                    // InternalRegularExpressions.g:334:3: ( rule__RegularExpression2__KleeneAssignment_1_0 )
                    // InternalRegularExpressions.g:334:4: rule__RegularExpression2__KleeneAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression2__KleeneAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularExpression2Access().getKleeneAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRegularExpressions.g:338:2: ( ( rule__RegularExpression2__OmegaAssignment_1_1 ) )
                    {
                    // InternalRegularExpressions.g:338:2: ( ( rule__RegularExpression2__OmegaAssignment_1_1 ) )
                    // InternalRegularExpressions.g:339:3: ( rule__RegularExpression2__OmegaAssignment_1_1 )
                    {
                     before(grammarAccess.getRegularExpression2Access().getOmegaAssignment_1_1()); 
                    // InternalRegularExpressions.g:340:3: ( rule__RegularExpression2__OmegaAssignment_1_1 )
                    // InternalRegularExpressions.g:340:4: rule__RegularExpression2__OmegaAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression2__OmegaAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularExpression2Access().getOmegaAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression2__Alternatives_1"


    // $ANTLR start "rule__RegularExpression3__Alternatives"
    // InternalRegularExpressions.g:348:1: rule__RegularExpression3__Alternatives : ( ( ( rule__RegularExpression3__Group_0__0 ) ) | ( ( rule__RegularExpression3__Group_1__0 ) ) | ( ( rule__RegularExpression3__Group_2__0 ) ) | ( ( rule__RegularExpression3__Group_3__0 ) ) | ( ( rule__RegularExpression3__Group_4__0 ) ) );
    public final void rule__RegularExpression3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:352:1: ( ( ( rule__RegularExpression3__Group_0__0 ) ) | ( ( rule__RegularExpression3__Group_1__0 ) ) | ( ( rule__RegularExpression3__Group_2__0 ) ) | ( ( rule__RegularExpression3__Group_3__0 ) ) | ( ( rule__RegularExpression3__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_EMPTYSET:
                {
                alt2=1;
                }
                break;
            case RULE_EPSILON:
                {
                alt2=2;
                }
                break;
            case RULE_SIMPLELETTER:
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRegularExpressions.g:353:2: ( ( rule__RegularExpression3__Group_0__0 ) )
                    {
                    // InternalRegularExpressions.g:353:2: ( ( rule__RegularExpression3__Group_0__0 ) )
                    // InternalRegularExpressions.g:354:3: ( rule__RegularExpression3__Group_0__0 )
                    {
                     before(grammarAccess.getRegularExpression3Access().getGroup_0()); 
                    // InternalRegularExpressions.g:355:3: ( rule__RegularExpression3__Group_0__0 )
                    // InternalRegularExpressions.g:355:4: rule__RegularExpression3__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression3__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularExpression3Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRegularExpressions.g:359:2: ( ( rule__RegularExpression3__Group_1__0 ) )
                    {
                    // InternalRegularExpressions.g:359:2: ( ( rule__RegularExpression3__Group_1__0 ) )
                    // InternalRegularExpressions.g:360:3: ( rule__RegularExpression3__Group_1__0 )
                    {
                     before(grammarAccess.getRegularExpression3Access().getGroup_1()); 
                    // InternalRegularExpressions.g:361:3: ( rule__RegularExpression3__Group_1__0 )
                    // InternalRegularExpressions.g:361:4: rule__RegularExpression3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression3__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularExpression3Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRegularExpressions.g:365:2: ( ( rule__RegularExpression3__Group_2__0 ) )
                    {
                    // InternalRegularExpressions.g:365:2: ( ( rule__RegularExpression3__Group_2__0 ) )
                    // InternalRegularExpressions.g:366:3: ( rule__RegularExpression3__Group_2__0 )
                    {
                     before(grammarAccess.getRegularExpression3Access().getGroup_2()); 
                    // InternalRegularExpressions.g:367:3: ( rule__RegularExpression3__Group_2__0 )
                    // InternalRegularExpressions.g:367:4: rule__RegularExpression3__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression3__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularExpression3Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRegularExpressions.g:371:2: ( ( rule__RegularExpression3__Group_3__0 ) )
                    {
                    // InternalRegularExpressions.g:371:2: ( ( rule__RegularExpression3__Group_3__0 ) )
                    // InternalRegularExpressions.g:372:3: ( rule__RegularExpression3__Group_3__0 )
                    {
                     before(grammarAccess.getRegularExpression3Access().getGroup_3()); 
                    // InternalRegularExpressions.g:373:3: ( rule__RegularExpression3__Group_3__0 )
                    // InternalRegularExpressions.g:373:4: rule__RegularExpression3__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression3__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularExpression3Access().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRegularExpressions.g:377:2: ( ( rule__RegularExpression3__Group_4__0 ) )
                    {
                    // InternalRegularExpressions.g:377:2: ( ( rule__RegularExpression3__Group_4__0 ) )
                    // InternalRegularExpressions.g:378:3: ( rule__RegularExpression3__Group_4__0 )
                    {
                     before(grammarAccess.getRegularExpression3Access().getGroup_4()); 
                    // InternalRegularExpressions.g:379:3: ( rule__RegularExpression3__Group_4__0 )
                    // InternalRegularExpressions.g:379:4: rule__RegularExpression3__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression3__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularExpression3Access().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Alternatives"


    // $ANTLR start "rule__Letter__Alternatives"
    // InternalRegularExpressions.g:387:1: rule__Letter__Alternatives : ( ( RULE_SIMPLELETTER ) | ( RULE_STRING ) );
    public final void rule__Letter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:391:1: ( ( RULE_SIMPLELETTER ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SIMPLELETTER) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRegularExpressions.g:392:2: ( RULE_SIMPLELETTER )
                    {
                    // InternalRegularExpressions.g:392:2: ( RULE_SIMPLELETTER )
                    // InternalRegularExpressions.g:393:3: RULE_SIMPLELETTER
                    {
                     before(grammarAccess.getLetterAccess().getSIMPLELETTERTerminalRuleCall_0()); 
                    match(input,RULE_SIMPLELETTER,FOLLOW_2); 
                     after(grammarAccess.getLetterAccess().getSIMPLELETTERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRegularExpressions.g:398:2: ( RULE_STRING )
                    {
                    // InternalRegularExpressions.g:398:2: ( RULE_STRING )
                    // InternalRegularExpressions.g:399:3: RULE_STRING
                    {
                     before(grammarAccess.getLetterAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getLetterAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Letter__Alternatives"


    // $ANTLR start "rule__RegExModel__Group__0"
    // InternalRegularExpressions.g:408:1: rule__RegExModel__Group__0 : rule__RegExModel__Group__0__Impl rule__RegExModel__Group__1 ;
    public final void rule__RegExModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:412:1: ( rule__RegExModel__Group__0__Impl rule__RegExModel__Group__1 )
            // InternalRegularExpressions.g:413:2: rule__RegExModel__Group__0__Impl rule__RegExModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RegExModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegExModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__0"


    // $ANTLR start "rule__RegExModel__Group__0__Impl"
    // InternalRegularExpressions.g:420:1: rule__RegExModel__Group__0__Impl : ( 'regular' ) ;
    public final void rule__RegExModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:424:1: ( ( 'regular' ) )
            // InternalRegularExpressions.g:425:1: ( 'regular' )
            {
            // InternalRegularExpressions.g:425:1: ( 'regular' )
            // InternalRegularExpressions.g:426:2: 'regular'
            {
             before(grammarAccess.getRegExModelAccess().getRegularKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRegExModelAccess().getRegularKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__0__Impl"


    // $ANTLR start "rule__RegExModel__Group__1"
    // InternalRegularExpressions.g:435:1: rule__RegExModel__Group__1 : rule__RegExModel__Group__1__Impl rule__RegExModel__Group__2 ;
    public final void rule__RegExModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:439:1: ( rule__RegExModel__Group__1__Impl rule__RegExModel__Group__2 )
            // InternalRegularExpressions.g:440:2: rule__RegExModel__Group__1__Impl rule__RegExModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RegExModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegExModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__1"


    // $ANTLR start "rule__RegExModel__Group__1__Impl"
    // InternalRegularExpressions.g:447:1: rule__RegExModel__Group__1__Impl : ( 'expression' ) ;
    public final void rule__RegExModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:451:1: ( ( 'expression' ) )
            // InternalRegularExpressions.g:452:1: ( 'expression' )
            {
            // InternalRegularExpressions.g:452:1: ( 'expression' )
            // InternalRegularExpressions.g:453:2: 'expression'
            {
             before(grammarAccess.getRegExModelAccess().getExpressionKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRegExModelAccess().getExpressionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__1__Impl"


    // $ANTLR start "rule__RegExModel__Group__2"
    // InternalRegularExpressions.g:462:1: rule__RegExModel__Group__2 : rule__RegExModel__Group__2__Impl rule__RegExModel__Group__3 ;
    public final void rule__RegExModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:466:1: ( rule__RegExModel__Group__2__Impl rule__RegExModel__Group__3 )
            // InternalRegularExpressions.g:467:2: rule__RegExModel__Group__2__Impl rule__RegExModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RegExModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegExModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__2"


    // $ANTLR start "rule__RegExModel__Group__2__Impl"
    // InternalRegularExpressions.g:474:1: rule__RegExModel__Group__2__Impl : ( ( rule__RegExModel__NameAssignment_2 ) ) ;
    public final void rule__RegExModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:478:1: ( ( ( rule__RegExModel__NameAssignment_2 ) ) )
            // InternalRegularExpressions.g:479:1: ( ( rule__RegExModel__NameAssignment_2 ) )
            {
            // InternalRegularExpressions.g:479:1: ( ( rule__RegExModel__NameAssignment_2 ) )
            // InternalRegularExpressions.g:480:2: ( rule__RegExModel__NameAssignment_2 )
            {
             before(grammarAccess.getRegExModelAccess().getNameAssignment_2()); 
            // InternalRegularExpressions.g:481:2: ( rule__RegExModel__NameAssignment_2 )
            // InternalRegularExpressions.g:481:3: rule__RegExModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegExModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegExModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__2__Impl"


    // $ANTLR start "rule__RegExModel__Group__3"
    // InternalRegularExpressions.g:489:1: rule__RegExModel__Group__3 : rule__RegExModel__Group__3__Impl rule__RegExModel__Group__4 ;
    public final void rule__RegExModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:493:1: ( rule__RegExModel__Group__3__Impl rule__RegExModel__Group__4 )
            // InternalRegularExpressions.g:494:2: rule__RegExModel__Group__3__Impl rule__RegExModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RegExModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegExModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__3"


    // $ANTLR start "rule__RegExModel__Group__3__Impl"
    // InternalRegularExpressions.g:501:1: rule__RegExModel__Group__3__Impl : ( '=' ) ;
    public final void rule__RegExModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:505:1: ( ( '=' ) )
            // InternalRegularExpressions.g:506:1: ( '=' )
            {
            // InternalRegularExpressions.g:506:1: ( '=' )
            // InternalRegularExpressions.g:507:2: '='
            {
             before(grammarAccess.getRegExModelAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRegExModelAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__3__Impl"


    // $ANTLR start "rule__RegExModel__Group__4"
    // InternalRegularExpressions.g:516:1: rule__RegExModel__Group__4 : rule__RegExModel__Group__4__Impl rule__RegExModel__Group__5 ;
    public final void rule__RegExModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:520:1: ( rule__RegExModel__Group__4__Impl rule__RegExModel__Group__5 )
            // InternalRegularExpressions.g:521:2: rule__RegExModel__Group__4__Impl rule__RegExModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__RegExModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegExModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__4"


    // $ANTLR start "rule__RegExModel__Group__4__Impl"
    // InternalRegularExpressions.g:528:1: rule__RegExModel__Group__4__Impl : ( ( rule__RegExModel__ExpressionAssignment_4 ) ) ;
    public final void rule__RegExModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:532:1: ( ( ( rule__RegExModel__ExpressionAssignment_4 ) ) )
            // InternalRegularExpressions.g:533:1: ( ( rule__RegExModel__ExpressionAssignment_4 ) )
            {
            // InternalRegularExpressions.g:533:1: ( ( rule__RegExModel__ExpressionAssignment_4 ) )
            // InternalRegularExpressions.g:534:2: ( rule__RegExModel__ExpressionAssignment_4 )
            {
             before(grammarAccess.getRegExModelAccess().getExpressionAssignment_4()); 
            // InternalRegularExpressions.g:535:2: ( rule__RegExModel__ExpressionAssignment_4 )
            // InternalRegularExpressions.g:535:3: rule__RegExModel__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RegExModel__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegExModelAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__4__Impl"


    // $ANTLR start "rule__RegExModel__Group__5"
    // InternalRegularExpressions.g:543:1: rule__RegExModel__Group__5 : rule__RegExModel__Group__5__Impl ;
    public final void rule__RegExModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:547:1: ( rule__RegExModel__Group__5__Impl )
            // InternalRegularExpressions.g:548:2: rule__RegExModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegExModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__5"


    // $ANTLR start "rule__RegExModel__Group__5__Impl"
    // InternalRegularExpressions.g:554:1: rule__RegExModel__Group__5__Impl : ( ( rule__RegExModel__Group_5__0 )? ) ;
    public final void rule__RegExModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:558:1: ( ( ( rule__RegExModel__Group_5__0 )? ) )
            // InternalRegularExpressions.g:559:1: ( ( rule__RegExModel__Group_5__0 )? )
            {
            // InternalRegularExpressions.g:559:1: ( ( rule__RegExModel__Group_5__0 )? )
            // InternalRegularExpressions.g:560:2: ( rule__RegExModel__Group_5__0 )?
            {
             before(grammarAccess.getRegExModelAccess().getGroup_5()); 
            // InternalRegularExpressions.g:561:2: ( rule__RegExModel__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRegularExpressions.g:561:3: rule__RegExModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegExModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegExModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group__5__Impl"


    // $ANTLR start "rule__RegExModel__Group_5__0"
    // InternalRegularExpressions.g:570:1: rule__RegExModel__Group_5__0 : rule__RegExModel__Group_5__0__Impl rule__RegExModel__Group_5__1 ;
    public final void rule__RegExModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:574:1: ( rule__RegExModel__Group_5__0__Impl rule__RegExModel__Group_5__1 )
            // InternalRegularExpressions.g:575:2: rule__RegExModel__Group_5__0__Impl rule__RegExModel__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RegExModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegExModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group_5__0"


    // $ANTLR start "rule__RegExModel__Group_5__0__Impl"
    // InternalRegularExpressions.g:582:1: rule__RegExModel__Group_5__0__Impl : ( 'where' ) ;
    public final void rule__RegExModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:586:1: ( ( 'where' ) )
            // InternalRegularExpressions.g:587:1: ( 'where' )
            {
            // InternalRegularExpressions.g:587:1: ( 'where' )
            // InternalRegularExpressions.g:588:2: 'where'
            {
             before(grammarAccess.getRegExModelAccess().getWhereKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRegExModelAccess().getWhereKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group_5__0__Impl"


    // $ANTLR start "rule__RegExModel__Group_5__1"
    // InternalRegularExpressions.g:597:1: rule__RegExModel__Group_5__1 : rule__RegExModel__Group_5__1__Impl ;
    public final void rule__RegExModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:601:1: ( rule__RegExModel__Group_5__1__Impl )
            // InternalRegularExpressions.g:602:2: rule__RegExModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegExModel__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group_5__1"


    // $ANTLR start "rule__RegExModel__Group_5__1__Impl"
    // InternalRegularExpressions.g:608:1: rule__RegExModel__Group_5__1__Impl : ( ( rule__RegExModel__DefinitionsAssignment_5_1 )* ) ;
    public final void rule__RegExModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:612:1: ( ( ( rule__RegExModel__DefinitionsAssignment_5_1 )* ) )
            // InternalRegularExpressions.g:613:1: ( ( rule__RegExModel__DefinitionsAssignment_5_1 )* )
            {
            // InternalRegularExpressions.g:613:1: ( ( rule__RegExModel__DefinitionsAssignment_5_1 )* )
            // InternalRegularExpressions.g:614:2: ( rule__RegExModel__DefinitionsAssignment_5_1 )*
            {
             before(grammarAccess.getRegExModelAccess().getDefinitionsAssignment_5_1()); 
            // InternalRegularExpressions.g:615:2: ( rule__RegExModel__DefinitionsAssignment_5_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRegularExpressions.g:615:3: rule__RegExModel__DefinitionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RegExModel__DefinitionsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRegExModelAccess().getDefinitionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__Group_5__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalRegularExpressions.g:624:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:628:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalRegularExpressions.g:629:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // InternalRegularExpressions.g:636:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__SymbolAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:640:1: ( ( ( rule__Definition__SymbolAssignment_0 ) ) )
            // InternalRegularExpressions.g:641:1: ( ( rule__Definition__SymbolAssignment_0 ) )
            {
            // InternalRegularExpressions.g:641:1: ( ( rule__Definition__SymbolAssignment_0 ) )
            // InternalRegularExpressions.g:642:2: ( rule__Definition__SymbolAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getSymbolAssignment_0()); 
            // InternalRegularExpressions.g:643:2: ( rule__Definition__SymbolAssignment_0 )
            // InternalRegularExpressions.g:643:3: rule__Definition__SymbolAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__SymbolAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getSymbolAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // InternalRegularExpressions.g:651:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:655:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalRegularExpressions.g:656:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // InternalRegularExpressions.g:663:1: rule__Definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:667:1: ( ( '=' ) )
            // InternalRegularExpressions.g:668:1: ( '=' )
            {
            // InternalRegularExpressions.g:668:1: ( '=' )
            // InternalRegularExpressions.g:669:2: '='
            {
             before(grammarAccess.getDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // InternalRegularExpressions.g:678:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:682:1: ( rule__Definition__Group__2__Impl )
            // InternalRegularExpressions.g:683:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // InternalRegularExpressions.g:689:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__ExpressionAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:693:1: ( ( ( rule__Definition__ExpressionAssignment_2 ) ) )
            // InternalRegularExpressions.g:694:1: ( ( rule__Definition__ExpressionAssignment_2 ) )
            {
            // InternalRegularExpressions.g:694:1: ( ( rule__Definition__ExpressionAssignment_2 ) )
            // InternalRegularExpressions.g:695:2: ( rule__Definition__ExpressionAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getExpressionAssignment_2()); 
            // InternalRegularExpressions.g:696:2: ( rule__Definition__ExpressionAssignment_2 )
            // InternalRegularExpressions.g:696:3: rule__Definition__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__RegularExpression__Group__0"
    // InternalRegularExpressions.g:705:1: rule__RegularExpression__Group__0 : rule__RegularExpression__Group__0__Impl rule__RegularExpression__Group__1 ;
    public final void rule__RegularExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:709:1: ( rule__RegularExpression__Group__0__Impl rule__RegularExpression__Group__1 )
            // InternalRegularExpressions.g:710:2: rule__RegularExpression__Group__0__Impl rule__RegularExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RegularExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group__0"


    // $ANTLR start "rule__RegularExpression__Group__0__Impl"
    // InternalRegularExpressions.g:717:1: rule__RegularExpression__Group__0__Impl : ( ( rule__RegularExpression__ExpressionAssignment_0 ) ) ;
    public final void rule__RegularExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:721:1: ( ( ( rule__RegularExpression__ExpressionAssignment_0 ) ) )
            // InternalRegularExpressions.g:722:1: ( ( rule__RegularExpression__ExpressionAssignment_0 ) )
            {
            // InternalRegularExpressions.g:722:1: ( ( rule__RegularExpression__ExpressionAssignment_0 ) )
            // InternalRegularExpressions.g:723:2: ( rule__RegularExpression__ExpressionAssignment_0 )
            {
             before(grammarAccess.getRegularExpressionAccess().getExpressionAssignment_0()); 
            // InternalRegularExpressions.g:724:2: ( rule__RegularExpression__ExpressionAssignment_0 )
            // InternalRegularExpressions.g:724:3: rule__RegularExpression__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpressionAccess().getExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group__0__Impl"


    // $ANTLR start "rule__RegularExpression__Group__1"
    // InternalRegularExpressions.g:732:1: rule__RegularExpression__Group__1 : rule__RegularExpression__Group__1__Impl ;
    public final void rule__RegularExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:736:1: ( rule__RegularExpression__Group__1__Impl )
            // InternalRegularExpressions.g:737:2: rule__RegularExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group__1"


    // $ANTLR start "rule__RegularExpression__Group__1__Impl"
    // InternalRegularExpressions.g:743:1: rule__RegularExpression__Group__1__Impl : ( ( rule__RegularExpression__Group_1__0 )? ) ;
    public final void rule__RegularExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:747:1: ( ( ( rule__RegularExpression__Group_1__0 )? ) )
            // InternalRegularExpressions.g:748:1: ( ( rule__RegularExpression__Group_1__0 )? )
            {
            // InternalRegularExpressions.g:748:1: ( ( rule__RegularExpression__Group_1__0 )? )
            // InternalRegularExpressions.g:749:2: ( rule__RegularExpression__Group_1__0 )?
            {
             before(grammarAccess.getRegularExpressionAccess().getGroup_1()); 
            // InternalRegularExpressions.g:750:2: ( rule__RegularExpression__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRegularExpressions.g:750:3: rule__RegularExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group__1__Impl"


    // $ANTLR start "rule__RegularExpression__Group_1__0"
    // InternalRegularExpressions.g:759:1: rule__RegularExpression__Group_1__0 : rule__RegularExpression__Group_1__0__Impl rule__RegularExpression__Group_1__1 ;
    public final void rule__RegularExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:763:1: ( rule__RegularExpression__Group_1__0__Impl rule__RegularExpression__Group_1__1 )
            // InternalRegularExpressions.g:764:2: rule__RegularExpression__Group_1__0__Impl rule__RegularExpression__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__RegularExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1__0"


    // $ANTLR start "rule__RegularExpression__Group_1__0__Impl"
    // InternalRegularExpressions.g:771:1: rule__RegularExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__RegularExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:775:1: ( ( '+' ) )
            // InternalRegularExpressions.g:776:1: ( '+' )
            {
            // InternalRegularExpressions.g:776:1: ( '+' )
            // InternalRegularExpressions.g:777:2: '+'
            {
             before(grammarAccess.getRegularExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRegularExpressionAccess().getPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RegularExpression__Group_1__1"
    // InternalRegularExpressions.g:786:1: rule__RegularExpression__Group_1__1 : rule__RegularExpression__Group_1__1__Impl rule__RegularExpression__Group_1__2 ;
    public final void rule__RegularExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:790:1: ( rule__RegularExpression__Group_1__1__Impl rule__RegularExpression__Group_1__2 )
            // InternalRegularExpressions.g:791:2: rule__RegularExpression__Group_1__1__Impl rule__RegularExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__RegularExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1__1"


    // $ANTLR start "rule__RegularExpression__Group_1__1__Impl"
    // InternalRegularExpressions.g:798:1: rule__RegularExpression__Group_1__1__Impl : ( ( rule__RegularExpression__AlternativesAssignment_1_1 ) ) ;
    public final void rule__RegularExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:802:1: ( ( ( rule__RegularExpression__AlternativesAssignment_1_1 ) ) )
            // InternalRegularExpressions.g:803:1: ( ( rule__RegularExpression__AlternativesAssignment_1_1 ) )
            {
            // InternalRegularExpressions.g:803:1: ( ( rule__RegularExpression__AlternativesAssignment_1_1 ) )
            // InternalRegularExpressions.g:804:2: ( rule__RegularExpression__AlternativesAssignment_1_1 )
            {
             before(grammarAccess.getRegularExpressionAccess().getAlternativesAssignment_1_1()); 
            // InternalRegularExpressions.g:805:2: ( rule__RegularExpression__AlternativesAssignment_1_1 )
            // InternalRegularExpressions.g:805:3: rule__RegularExpression__AlternativesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression__AlternativesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpressionAccess().getAlternativesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RegularExpression__Group_1__2"
    // InternalRegularExpressions.g:813:1: rule__RegularExpression__Group_1__2 : rule__RegularExpression__Group_1__2__Impl ;
    public final void rule__RegularExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:817:1: ( rule__RegularExpression__Group_1__2__Impl )
            // InternalRegularExpressions.g:818:2: rule__RegularExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1__2"


    // $ANTLR start "rule__RegularExpression__Group_1__2__Impl"
    // InternalRegularExpressions.g:824:1: rule__RegularExpression__Group_1__2__Impl : ( ( rule__RegularExpression__Group_1_2__0 )* ) ;
    public final void rule__RegularExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:828:1: ( ( ( rule__RegularExpression__Group_1_2__0 )* ) )
            // InternalRegularExpressions.g:829:1: ( ( rule__RegularExpression__Group_1_2__0 )* )
            {
            // InternalRegularExpressions.g:829:1: ( ( rule__RegularExpression__Group_1_2__0 )* )
            // InternalRegularExpressions.g:830:2: ( rule__RegularExpression__Group_1_2__0 )*
            {
             before(grammarAccess.getRegularExpressionAccess().getGroup_1_2()); 
            // InternalRegularExpressions.g:831:2: ( rule__RegularExpression__Group_1_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRegularExpressions.g:831:3: rule__RegularExpression__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RegularExpression__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRegularExpressionAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1__2__Impl"


    // $ANTLR start "rule__RegularExpression__Group_1_2__0"
    // InternalRegularExpressions.g:840:1: rule__RegularExpression__Group_1_2__0 : rule__RegularExpression__Group_1_2__0__Impl rule__RegularExpression__Group_1_2__1 ;
    public final void rule__RegularExpression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:844:1: ( rule__RegularExpression__Group_1_2__0__Impl rule__RegularExpression__Group_1_2__1 )
            // InternalRegularExpressions.g:845:2: rule__RegularExpression__Group_1_2__0__Impl rule__RegularExpression__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__RegularExpression__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1_2__0"


    // $ANTLR start "rule__RegularExpression__Group_1_2__0__Impl"
    // InternalRegularExpressions.g:852:1: rule__RegularExpression__Group_1_2__0__Impl : ( '+' ) ;
    public final void rule__RegularExpression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:856:1: ( ( '+' ) )
            // InternalRegularExpressions.g:857:1: ( '+' )
            {
            // InternalRegularExpressions.g:857:1: ( '+' )
            // InternalRegularExpressions.g:858:2: '+'
            {
             before(grammarAccess.getRegularExpressionAccess().getPlusSignKeyword_1_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRegularExpressionAccess().getPlusSignKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1_2__0__Impl"


    // $ANTLR start "rule__RegularExpression__Group_1_2__1"
    // InternalRegularExpressions.g:867:1: rule__RegularExpression__Group_1_2__1 : rule__RegularExpression__Group_1_2__1__Impl ;
    public final void rule__RegularExpression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:871:1: ( rule__RegularExpression__Group_1_2__1__Impl )
            // InternalRegularExpressions.g:872:2: rule__RegularExpression__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1_2__1"


    // $ANTLR start "rule__RegularExpression__Group_1_2__1__Impl"
    // InternalRegularExpressions.g:878:1: rule__RegularExpression__Group_1_2__1__Impl : ( ( rule__RegularExpression__AlternativesAssignment_1_2_1 ) ) ;
    public final void rule__RegularExpression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:882:1: ( ( ( rule__RegularExpression__AlternativesAssignment_1_2_1 ) ) )
            // InternalRegularExpressions.g:883:1: ( ( rule__RegularExpression__AlternativesAssignment_1_2_1 ) )
            {
            // InternalRegularExpressions.g:883:1: ( ( rule__RegularExpression__AlternativesAssignment_1_2_1 ) )
            // InternalRegularExpressions.g:884:2: ( rule__RegularExpression__AlternativesAssignment_1_2_1 )
            {
             before(grammarAccess.getRegularExpressionAccess().getAlternativesAssignment_1_2_1()); 
            // InternalRegularExpressions.g:885:2: ( rule__RegularExpression__AlternativesAssignment_1_2_1 )
            // InternalRegularExpressions.g:885:3: rule__RegularExpression__AlternativesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression__AlternativesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpressionAccess().getAlternativesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__Group_1_2__1__Impl"


    // $ANTLR start "rule__RegularExpression1__Group__0"
    // InternalRegularExpressions.g:894:1: rule__RegularExpression1__Group__0 : rule__RegularExpression1__Group__0__Impl rule__RegularExpression1__Group__1 ;
    public final void rule__RegularExpression1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:898:1: ( rule__RegularExpression1__Group__0__Impl rule__RegularExpression1__Group__1 )
            // InternalRegularExpressions.g:899:2: rule__RegularExpression1__Group__0__Impl rule__RegularExpression1__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RegularExpression1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group__0"


    // $ANTLR start "rule__RegularExpression1__Group__0__Impl"
    // InternalRegularExpressions.g:906:1: rule__RegularExpression1__Group__0__Impl : ( ( rule__RegularExpression1__ExpressionAssignment_0 ) ) ;
    public final void rule__RegularExpression1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:910:1: ( ( ( rule__RegularExpression1__ExpressionAssignment_0 ) ) )
            // InternalRegularExpressions.g:911:1: ( ( rule__RegularExpression1__ExpressionAssignment_0 ) )
            {
            // InternalRegularExpressions.g:911:1: ( ( rule__RegularExpression1__ExpressionAssignment_0 ) )
            // InternalRegularExpressions.g:912:2: ( rule__RegularExpression1__ExpressionAssignment_0 )
            {
             before(grammarAccess.getRegularExpression1Access().getExpressionAssignment_0()); 
            // InternalRegularExpressions.g:913:2: ( rule__RegularExpression1__ExpressionAssignment_0 )
            // InternalRegularExpressions.g:913:3: rule__RegularExpression1__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression1__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression1Access().getExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group__0__Impl"


    // $ANTLR start "rule__RegularExpression1__Group__1"
    // InternalRegularExpressions.g:921:1: rule__RegularExpression1__Group__1 : rule__RegularExpression1__Group__1__Impl ;
    public final void rule__RegularExpression1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:925:1: ( rule__RegularExpression1__Group__1__Impl )
            // InternalRegularExpressions.g:926:2: rule__RegularExpression1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression1__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group__1"


    // $ANTLR start "rule__RegularExpression1__Group__1__Impl"
    // InternalRegularExpressions.g:932:1: rule__RegularExpression1__Group__1__Impl : ( ( rule__RegularExpression1__Group_1__0 )? ) ;
    public final void rule__RegularExpression1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:936:1: ( ( ( rule__RegularExpression1__Group_1__0 )? ) )
            // InternalRegularExpressions.g:937:1: ( ( rule__RegularExpression1__Group_1__0 )? )
            {
            // InternalRegularExpressions.g:937:1: ( ( rule__RegularExpression1__Group_1__0 )? )
            // InternalRegularExpressions.g:938:2: ( rule__RegularExpression1__Group_1__0 )?
            {
             before(grammarAccess.getRegularExpression1Access().getGroup_1()); 
            // InternalRegularExpressions.g:939:2: ( rule__RegularExpression1__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRegularExpressions.g:939:3: rule__RegularExpression1__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression1__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularExpression1Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group__1__Impl"


    // $ANTLR start "rule__RegularExpression1__Group_1__0"
    // InternalRegularExpressions.g:948:1: rule__RegularExpression1__Group_1__0 : rule__RegularExpression1__Group_1__0__Impl rule__RegularExpression1__Group_1__1 ;
    public final void rule__RegularExpression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:952:1: ( rule__RegularExpression1__Group_1__0__Impl rule__RegularExpression1__Group_1__1 )
            // InternalRegularExpressions.g:953:2: rule__RegularExpression1__Group_1__0__Impl rule__RegularExpression1__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__RegularExpression1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression1__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1__0"


    // $ANTLR start "rule__RegularExpression1__Group_1__0__Impl"
    // InternalRegularExpressions.g:960:1: rule__RegularExpression1__Group_1__0__Impl : ( '.' ) ;
    public final void rule__RegularExpression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:964:1: ( ( '.' ) )
            // InternalRegularExpressions.g:965:1: ( '.' )
            {
            // InternalRegularExpressions.g:965:1: ( '.' )
            // InternalRegularExpressions.g:966:2: '.'
            {
             before(grammarAccess.getRegularExpression1Access().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRegularExpression1Access().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1__0__Impl"


    // $ANTLR start "rule__RegularExpression1__Group_1__1"
    // InternalRegularExpressions.g:975:1: rule__RegularExpression1__Group_1__1 : rule__RegularExpression1__Group_1__1__Impl rule__RegularExpression1__Group_1__2 ;
    public final void rule__RegularExpression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:979:1: ( rule__RegularExpression1__Group_1__1__Impl rule__RegularExpression1__Group_1__2 )
            // InternalRegularExpressions.g:980:2: rule__RegularExpression1__Group_1__1__Impl rule__RegularExpression1__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__RegularExpression1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression1__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1__1"


    // $ANTLR start "rule__RegularExpression1__Group_1__1__Impl"
    // InternalRegularExpressions.g:987:1: rule__RegularExpression1__Group_1__1__Impl : ( ( rule__RegularExpression1__ConcatenationsAssignment_1_1 ) ) ;
    public final void rule__RegularExpression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:991:1: ( ( ( rule__RegularExpression1__ConcatenationsAssignment_1_1 ) ) )
            // InternalRegularExpressions.g:992:1: ( ( rule__RegularExpression1__ConcatenationsAssignment_1_1 ) )
            {
            // InternalRegularExpressions.g:992:1: ( ( rule__RegularExpression1__ConcatenationsAssignment_1_1 ) )
            // InternalRegularExpressions.g:993:2: ( rule__RegularExpression1__ConcatenationsAssignment_1_1 )
            {
             before(grammarAccess.getRegularExpression1Access().getConcatenationsAssignment_1_1()); 
            // InternalRegularExpressions.g:994:2: ( rule__RegularExpression1__ConcatenationsAssignment_1_1 )
            // InternalRegularExpressions.g:994:3: rule__RegularExpression1__ConcatenationsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression1__ConcatenationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression1Access().getConcatenationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1__1__Impl"


    // $ANTLR start "rule__RegularExpression1__Group_1__2"
    // InternalRegularExpressions.g:1002:1: rule__RegularExpression1__Group_1__2 : rule__RegularExpression1__Group_1__2__Impl ;
    public final void rule__RegularExpression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1006:1: ( rule__RegularExpression1__Group_1__2__Impl )
            // InternalRegularExpressions.g:1007:2: rule__RegularExpression1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression1__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1__2"


    // $ANTLR start "rule__RegularExpression1__Group_1__2__Impl"
    // InternalRegularExpressions.g:1013:1: rule__RegularExpression1__Group_1__2__Impl : ( ( rule__RegularExpression1__Group_1_2__0 )* ) ;
    public final void rule__RegularExpression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1017:1: ( ( ( rule__RegularExpression1__Group_1_2__0 )* ) )
            // InternalRegularExpressions.g:1018:1: ( ( rule__RegularExpression1__Group_1_2__0 )* )
            {
            // InternalRegularExpressions.g:1018:1: ( ( rule__RegularExpression1__Group_1_2__0 )* )
            // InternalRegularExpressions.g:1019:2: ( rule__RegularExpression1__Group_1_2__0 )*
            {
             before(grammarAccess.getRegularExpression1Access().getGroup_1_2()); 
            // InternalRegularExpressions.g:1020:2: ( rule__RegularExpression1__Group_1_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRegularExpressions.g:1020:3: rule__RegularExpression1__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RegularExpression1__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRegularExpression1Access().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1__2__Impl"


    // $ANTLR start "rule__RegularExpression1__Group_1_2__0"
    // InternalRegularExpressions.g:1029:1: rule__RegularExpression1__Group_1_2__0 : rule__RegularExpression1__Group_1_2__0__Impl rule__RegularExpression1__Group_1_2__1 ;
    public final void rule__RegularExpression1__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1033:1: ( rule__RegularExpression1__Group_1_2__0__Impl rule__RegularExpression1__Group_1_2__1 )
            // InternalRegularExpressions.g:1034:2: rule__RegularExpression1__Group_1_2__0__Impl rule__RegularExpression1__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__RegularExpression1__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression1__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1_2__0"


    // $ANTLR start "rule__RegularExpression1__Group_1_2__0__Impl"
    // InternalRegularExpressions.g:1041:1: rule__RegularExpression1__Group_1_2__0__Impl : ( '.' ) ;
    public final void rule__RegularExpression1__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1045:1: ( ( '.' ) )
            // InternalRegularExpressions.g:1046:1: ( '.' )
            {
            // InternalRegularExpressions.g:1046:1: ( '.' )
            // InternalRegularExpressions.g:1047:2: '.'
            {
             before(grammarAccess.getRegularExpression1Access().getFullStopKeyword_1_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRegularExpression1Access().getFullStopKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1_2__0__Impl"


    // $ANTLR start "rule__RegularExpression1__Group_1_2__1"
    // InternalRegularExpressions.g:1056:1: rule__RegularExpression1__Group_1_2__1 : rule__RegularExpression1__Group_1_2__1__Impl ;
    public final void rule__RegularExpression1__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1060:1: ( rule__RegularExpression1__Group_1_2__1__Impl )
            // InternalRegularExpressions.g:1061:2: rule__RegularExpression1__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression1__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1_2__1"


    // $ANTLR start "rule__RegularExpression1__Group_1_2__1__Impl"
    // InternalRegularExpressions.g:1067:1: rule__RegularExpression1__Group_1_2__1__Impl : ( ( rule__RegularExpression1__ConcatenationsAssignment_1_2_1 ) ) ;
    public final void rule__RegularExpression1__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1071:1: ( ( ( rule__RegularExpression1__ConcatenationsAssignment_1_2_1 ) ) )
            // InternalRegularExpressions.g:1072:1: ( ( rule__RegularExpression1__ConcatenationsAssignment_1_2_1 ) )
            {
            // InternalRegularExpressions.g:1072:1: ( ( rule__RegularExpression1__ConcatenationsAssignment_1_2_1 ) )
            // InternalRegularExpressions.g:1073:2: ( rule__RegularExpression1__ConcatenationsAssignment_1_2_1 )
            {
             before(grammarAccess.getRegularExpression1Access().getConcatenationsAssignment_1_2_1()); 
            // InternalRegularExpressions.g:1074:2: ( rule__RegularExpression1__ConcatenationsAssignment_1_2_1 )
            // InternalRegularExpressions.g:1074:3: rule__RegularExpression1__ConcatenationsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression1__ConcatenationsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression1Access().getConcatenationsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__Group_1_2__1__Impl"


    // $ANTLR start "rule__RegularExpression2__Group__0"
    // InternalRegularExpressions.g:1083:1: rule__RegularExpression2__Group__0 : rule__RegularExpression2__Group__0__Impl rule__RegularExpression2__Group__1 ;
    public final void rule__RegularExpression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1087:1: ( rule__RegularExpression2__Group__0__Impl rule__RegularExpression2__Group__1 )
            // InternalRegularExpressions.g:1088:2: rule__RegularExpression2__Group__0__Impl rule__RegularExpression2__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RegularExpression2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression2__Group__0"


    // $ANTLR start "rule__RegularExpression2__Group__0__Impl"
    // InternalRegularExpressions.g:1095:1: rule__RegularExpression2__Group__0__Impl : ( ( rule__RegularExpression2__SubexpressionAssignment_0 ) ) ;
    public final void rule__RegularExpression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1099:1: ( ( ( rule__RegularExpression2__SubexpressionAssignment_0 ) ) )
            // InternalRegularExpressions.g:1100:1: ( ( rule__RegularExpression2__SubexpressionAssignment_0 ) )
            {
            // InternalRegularExpressions.g:1100:1: ( ( rule__RegularExpression2__SubexpressionAssignment_0 ) )
            // InternalRegularExpressions.g:1101:2: ( rule__RegularExpression2__SubexpressionAssignment_0 )
            {
             before(grammarAccess.getRegularExpression2Access().getSubexpressionAssignment_0()); 
            // InternalRegularExpressions.g:1102:2: ( rule__RegularExpression2__SubexpressionAssignment_0 )
            // InternalRegularExpressions.g:1102:3: rule__RegularExpression2__SubexpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression2__SubexpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression2Access().getSubexpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression2__Group__0__Impl"


    // $ANTLR start "rule__RegularExpression2__Group__1"
    // InternalRegularExpressions.g:1110:1: rule__RegularExpression2__Group__1 : rule__RegularExpression2__Group__1__Impl ;
    public final void rule__RegularExpression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1114:1: ( rule__RegularExpression2__Group__1__Impl )
            // InternalRegularExpressions.g:1115:2: rule__RegularExpression2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression2__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression2__Group__1"


    // $ANTLR start "rule__RegularExpression2__Group__1__Impl"
    // InternalRegularExpressions.g:1121:1: rule__RegularExpression2__Group__1__Impl : ( ( rule__RegularExpression2__Alternatives_1 )? ) ;
    public final void rule__RegularExpression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1125:1: ( ( ( rule__RegularExpression2__Alternatives_1 )? ) )
            // InternalRegularExpressions.g:1126:1: ( ( rule__RegularExpression2__Alternatives_1 )? )
            {
            // InternalRegularExpressions.g:1126:1: ( ( rule__RegularExpression2__Alternatives_1 )? )
            // InternalRegularExpressions.g:1127:2: ( rule__RegularExpression2__Alternatives_1 )?
            {
             before(grammarAccess.getRegularExpression2Access().getAlternatives_1()); 
            // InternalRegularExpressions.g:1128:2: ( rule__RegularExpression2__Alternatives_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRegularExpressions.g:1128:3: rule__RegularExpression2__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularExpression2__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularExpression2Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression2__Group__1__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_0__0"
    // InternalRegularExpressions.g:1137:1: rule__RegularExpression3__Group_0__0 : rule__RegularExpression3__Group_0__0__Impl rule__RegularExpression3__Group_0__1 ;
    public final void rule__RegularExpression3__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1141:1: ( rule__RegularExpression3__Group_0__0__Impl rule__RegularExpression3__Group_0__1 )
            // InternalRegularExpressions.g:1142:2: rule__RegularExpression3__Group_0__0__Impl rule__RegularExpression3__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__RegularExpression3__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_0__0"


    // $ANTLR start "rule__RegularExpression3__Group_0__0__Impl"
    // InternalRegularExpressions.g:1149:1: rule__RegularExpression3__Group_0__0__Impl : ( () ) ;
    public final void rule__RegularExpression3__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1153:1: ( ( () ) )
            // InternalRegularExpressions.g:1154:1: ( () )
            {
            // InternalRegularExpressions.g:1154:1: ( () )
            // InternalRegularExpressions.g:1155:2: ()
            {
             before(grammarAccess.getRegularExpression3Access().getRegularExpression3Action_0_0()); 
            // InternalRegularExpressions.g:1156:2: ()
            // InternalRegularExpressions.g:1156:3: 
            {
            }

             after(grammarAccess.getRegularExpression3Access().getRegularExpression3Action_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_0__0__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_0__1"
    // InternalRegularExpressions.g:1164:1: rule__RegularExpression3__Group_0__1 : rule__RegularExpression3__Group_0__1__Impl ;
    public final void rule__RegularExpression3__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1168:1: ( rule__RegularExpression3__Group_0__1__Impl )
            // InternalRegularExpressions.g:1169:2: rule__RegularExpression3__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_0__1"


    // $ANTLR start "rule__RegularExpression3__Group_0__1__Impl"
    // InternalRegularExpressions.g:1175:1: rule__RegularExpression3__Group_0__1__Impl : ( ( rule__RegularExpression3__EmptyLangExpressionAssignment_0_1 ) ) ;
    public final void rule__RegularExpression3__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1179:1: ( ( ( rule__RegularExpression3__EmptyLangExpressionAssignment_0_1 ) ) )
            // InternalRegularExpressions.g:1180:1: ( ( rule__RegularExpression3__EmptyLangExpressionAssignment_0_1 ) )
            {
            // InternalRegularExpressions.g:1180:1: ( ( rule__RegularExpression3__EmptyLangExpressionAssignment_0_1 ) )
            // InternalRegularExpressions.g:1181:2: ( rule__RegularExpression3__EmptyLangExpressionAssignment_0_1 )
            {
             before(grammarAccess.getRegularExpression3Access().getEmptyLangExpressionAssignment_0_1()); 
            // InternalRegularExpressions.g:1182:2: ( rule__RegularExpression3__EmptyLangExpressionAssignment_0_1 )
            // InternalRegularExpressions.g:1182:3: rule__RegularExpression3__EmptyLangExpressionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__EmptyLangExpressionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression3Access().getEmptyLangExpressionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_0__1__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_1__0"
    // InternalRegularExpressions.g:1191:1: rule__RegularExpression3__Group_1__0 : rule__RegularExpression3__Group_1__0__Impl rule__RegularExpression3__Group_1__1 ;
    public final void rule__RegularExpression3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1195:1: ( rule__RegularExpression3__Group_1__0__Impl rule__RegularExpression3__Group_1__1 )
            // InternalRegularExpressions.g:1196:2: rule__RegularExpression3__Group_1__0__Impl rule__RegularExpression3__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__RegularExpression3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_1__0"


    // $ANTLR start "rule__RegularExpression3__Group_1__0__Impl"
    // InternalRegularExpressions.g:1203:1: rule__RegularExpression3__Group_1__0__Impl : ( () ) ;
    public final void rule__RegularExpression3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1207:1: ( ( () ) )
            // InternalRegularExpressions.g:1208:1: ( () )
            {
            // InternalRegularExpressions.g:1208:1: ( () )
            // InternalRegularExpressions.g:1209:2: ()
            {
             before(grammarAccess.getRegularExpression3Access().getRegularExpression3Action_1_0()); 
            // InternalRegularExpressions.g:1210:2: ()
            // InternalRegularExpressions.g:1210:3: 
            {
            }

             after(grammarAccess.getRegularExpression3Access().getRegularExpression3Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_1__0__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_1__1"
    // InternalRegularExpressions.g:1218:1: rule__RegularExpression3__Group_1__1 : rule__RegularExpression3__Group_1__1__Impl ;
    public final void rule__RegularExpression3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1222:1: ( rule__RegularExpression3__Group_1__1__Impl )
            // InternalRegularExpressions.g:1223:2: rule__RegularExpression3__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_1__1"


    // $ANTLR start "rule__RegularExpression3__Group_1__1__Impl"
    // InternalRegularExpressions.g:1229:1: rule__RegularExpression3__Group_1__1__Impl : ( ( rule__RegularExpression3__EmptyWordExpressionAssignment_1_1 ) ) ;
    public final void rule__RegularExpression3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1233:1: ( ( ( rule__RegularExpression3__EmptyWordExpressionAssignment_1_1 ) ) )
            // InternalRegularExpressions.g:1234:1: ( ( rule__RegularExpression3__EmptyWordExpressionAssignment_1_1 ) )
            {
            // InternalRegularExpressions.g:1234:1: ( ( rule__RegularExpression3__EmptyWordExpressionAssignment_1_1 ) )
            // InternalRegularExpressions.g:1235:2: ( rule__RegularExpression3__EmptyWordExpressionAssignment_1_1 )
            {
             before(grammarAccess.getRegularExpression3Access().getEmptyWordExpressionAssignment_1_1()); 
            // InternalRegularExpressions.g:1236:2: ( rule__RegularExpression3__EmptyWordExpressionAssignment_1_1 )
            // InternalRegularExpressions.g:1236:3: rule__RegularExpression3__EmptyWordExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__EmptyWordExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression3Access().getEmptyWordExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_1__1__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_2__0"
    // InternalRegularExpressions.g:1245:1: rule__RegularExpression3__Group_2__0 : rule__RegularExpression3__Group_2__0__Impl rule__RegularExpression3__Group_2__1 ;
    public final void rule__RegularExpression3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1249:1: ( rule__RegularExpression3__Group_2__0__Impl rule__RegularExpression3__Group_2__1 )
            // InternalRegularExpressions.g:1250:2: rule__RegularExpression3__Group_2__0__Impl rule__RegularExpression3__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__RegularExpression3__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_2__0"


    // $ANTLR start "rule__RegularExpression3__Group_2__0__Impl"
    // InternalRegularExpressions.g:1257:1: rule__RegularExpression3__Group_2__0__Impl : ( () ) ;
    public final void rule__RegularExpression3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1261:1: ( ( () ) )
            // InternalRegularExpressions.g:1262:1: ( () )
            {
            // InternalRegularExpressions.g:1262:1: ( () )
            // InternalRegularExpressions.g:1263:2: ()
            {
             before(grammarAccess.getRegularExpression3Access().getRegularExpression3Action_2_0()); 
            // InternalRegularExpressions.g:1264:2: ()
            // InternalRegularExpressions.g:1264:3: 
            {
            }

             after(grammarAccess.getRegularExpression3Access().getRegularExpression3Action_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_2__0__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_2__1"
    // InternalRegularExpressions.g:1272:1: rule__RegularExpression3__Group_2__1 : rule__RegularExpression3__Group_2__1__Impl ;
    public final void rule__RegularExpression3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1276:1: ( rule__RegularExpression3__Group_2__1__Impl )
            // InternalRegularExpressions.g:1277:2: rule__RegularExpression3__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_2__1"


    // $ANTLR start "rule__RegularExpression3__Group_2__1__Impl"
    // InternalRegularExpressions.g:1283:1: rule__RegularExpression3__Group_2__1__Impl : ( ( rule__RegularExpression3__LetterExpressionAssignment_2_1 ) ) ;
    public final void rule__RegularExpression3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1287:1: ( ( ( rule__RegularExpression3__LetterExpressionAssignment_2_1 ) ) )
            // InternalRegularExpressions.g:1288:1: ( ( rule__RegularExpression3__LetterExpressionAssignment_2_1 ) )
            {
            // InternalRegularExpressions.g:1288:1: ( ( rule__RegularExpression3__LetterExpressionAssignment_2_1 ) )
            // InternalRegularExpressions.g:1289:2: ( rule__RegularExpression3__LetterExpressionAssignment_2_1 )
            {
             before(grammarAccess.getRegularExpression3Access().getLetterExpressionAssignment_2_1()); 
            // InternalRegularExpressions.g:1290:2: ( rule__RegularExpression3__LetterExpressionAssignment_2_1 )
            // InternalRegularExpressions.g:1290:3: rule__RegularExpression3__LetterExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__LetterExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression3Access().getLetterExpressionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_2__1__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_3__0"
    // InternalRegularExpressions.g:1299:1: rule__RegularExpression3__Group_3__0 : rule__RegularExpression3__Group_3__0__Impl rule__RegularExpression3__Group_3__1 ;
    public final void rule__RegularExpression3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1303:1: ( rule__RegularExpression3__Group_3__0__Impl rule__RegularExpression3__Group_3__1 )
            // InternalRegularExpressions.g:1304:2: rule__RegularExpression3__Group_3__0__Impl rule__RegularExpression3__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__RegularExpression3__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_3__0"


    // $ANTLR start "rule__RegularExpression3__Group_3__0__Impl"
    // InternalRegularExpressions.g:1311:1: rule__RegularExpression3__Group_3__0__Impl : ( () ) ;
    public final void rule__RegularExpression3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1315:1: ( ( () ) )
            // InternalRegularExpressions.g:1316:1: ( () )
            {
            // InternalRegularExpressions.g:1316:1: ( () )
            // InternalRegularExpressions.g:1317:2: ()
            {
             before(grammarAccess.getRegularExpression3Access().getRegularExpression3Action_3_0()); 
            // InternalRegularExpressions.g:1318:2: ()
            // InternalRegularExpressions.g:1318:3: 
            {
            }

             after(grammarAccess.getRegularExpression3Access().getRegularExpression3Action_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_3__0__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_3__1"
    // InternalRegularExpressions.g:1326:1: rule__RegularExpression3__Group_3__1 : rule__RegularExpression3__Group_3__1__Impl ;
    public final void rule__RegularExpression3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1330:1: ( rule__RegularExpression3__Group_3__1__Impl )
            // InternalRegularExpressions.g:1331:2: rule__RegularExpression3__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_3__1"


    // $ANTLR start "rule__RegularExpression3__Group_3__1__Impl"
    // InternalRegularExpressions.g:1337:1: rule__RegularExpression3__Group_3__1__Impl : ( ( rule__RegularExpression3__ReferenceExpressionAssignment_3_1 ) ) ;
    public final void rule__RegularExpression3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1341:1: ( ( ( rule__RegularExpression3__ReferenceExpressionAssignment_3_1 ) ) )
            // InternalRegularExpressions.g:1342:1: ( ( rule__RegularExpression3__ReferenceExpressionAssignment_3_1 ) )
            {
            // InternalRegularExpressions.g:1342:1: ( ( rule__RegularExpression3__ReferenceExpressionAssignment_3_1 ) )
            // InternalRegularExpressions.g:1343:2: ( rule__RegularExpression3__ReferenceExpressionAssignment_3_1 )
            {
             before(grammarAccess.getRegularExpression3Access().getReferenceExpressionAssignment_3_1()); 
            // InternalRegularExpressions.g:1344:2: ( rule__RegularExpression3__ReferenceExpressionAssignment_3_1 )
            // InternalRegularExpressions.g:1344:3: rule__RegularExpression3__ReferenceExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__ReferenceExpressionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression3Access().getReferenceExpressionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_3__1__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_4__0"
    // InternalRegularExpressions.g:1353:1: rule__RegularExpression3__Group_4__0 : rule__RegularExpression3__Group_4__0__Impl rule__RegularExpression3__Group_4__1 ;
    public final void rule__RegularExpression3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1357:1: ( rule__RegularExpression3__Group_4__0__Impl rule__RegularExpression3__Group_4__1 )
            // InternalRegularExpressions.g:1358:2: rule__RegularExpression3__Group_4__0__Impl rule__RegularExpression3__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__RegularExpression3__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_4__0"


    // $ANTLR start "rule__RegularExpression3__Group_4__0__Impl"
    // InternalRegularExpressions.g:1365:1: rule__RegularExpression3__Group_4__0__Impl : ( '(' ) ;
    public final void rule__RegularExpression3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1369:1: ( ( '(' ) )
            // InternalRegularExpressions.g:1370:1: ( '(' )
            {
            // InternalRegularExpressions.g:1370:1: ( '(' )
            // InternalRegularExpressions.g:1371:2: '('
            {
             before(grammarAccess.getRegularExpression3Access().getLeftParenthesisKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRegularExpression3Access().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_4__0__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_4__1"
    // InternalRegularExpressions.g:1380:1: rule__RegularExpression3__Group_4__1 : rule__RegularExpression3__Group_4__1__Impl rule__RegularExpression3__Group_4__2 ;
    public final void rule__RegularExpression3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1384:1: ( rule__RegularExpression3__Group_4__1__Impl rule__RegularExpression3__Group_4__2 )
            // InternalRegularExpressions.g:1385:2: rule__RegularExpression3__Group_4__1__Impl rule__RegularExpression3__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__RegularExpression3__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_4__1"


    // $ANTLR start "rule__RegularExpression3__Group_4__1__Impl"
    // InternalRegularExpressions.g:1392:1: rule__RegularExpression3__Group_4__1__Impl : ( ( rule__RegularExpression3__ExpressionAssignment_4_1 ) ) ;
    public final void rule__RegularExpression3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1396:1: ( ( ( rule__RegularExpression3__ExpressionAssignment_4_1 ) ) )
            // InternalRegularExpressions.g:1397:1: ( ( rule__RegularExpression3__ExpressionAssignment_4_1 ) )
            {
            // InternalRegularExpressions.g:1397:1: ( ( rule__RegularExpression3__ExpressionAssignment_4_1 ) )
            // InternalRegularExpressions.g:1398:2: ( rule__RegularExpression3__ExpressionAssignment_4_1 )
            {
             before(grammarAccess.getRegularExpression3Access().getExpressionAssignment_4_1()); 
            // InternalRegularExpressions.g:1399:2: ( rule__RegularExpression3__ExpressionAssignment_4_1 )
            // InternalRegularExpressions.g:1399:3: rule__RegularExpression3__ExpressionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__ExpressionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularExpression3Access().getExpressionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_4__1__Impl"


    // $ANTLR start "rule__RegularExpression3__Group_4__2"
    // InternalRegularExpressions.g:1407:1: rule__RegularExpression3__Group_4__2 : rule__RegularExpression3__Group_4__2__Impl ;
    public final void rule__RegularExpression3__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1411:1: ( rule__RegularExpression3__Group_4__2__Impl )
            // InternalRegularExpressions.g:1412:2: rule__RegularExpression3__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularExpression3__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_4__2"


    // $ANTLR start "rule__RegularExpression3__Group_4__2__Impl"
    // InternalRegularExpressions.g:1418:1: rule__RegularExpression3__Group_4__2__Impl : ( ')' ) ;
    public final void rule__RegularExpression3__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1422:1: ( ( ')' ) )
            // InternalRegularExpressions.g:1423:1: ( ')' )
            {
            // InternalRegularExpressions.g:1423:1: ( ')' )
            // InternalRegularExpressions.g:1424:2: ')'
            {
             before(grammarAccess.getRegularExpression3Access().getRightParenthesisKeyword_4_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRegularExpression3Access().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__Group_4__2__Impl"


    // $ANTLR start "rule__ReferenceExpression__Group__0"
    // InternalRegularExpressions.g:1434:1: rule__ReferenceExpression__Group__0 : rule__ReferenceExpression__Group__0__Impl rule__ReferenceExpression__Group__1 ;
    public final void rule__ReferenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1438:1: ( rule__ReferenceExpression__Group__0__Impl rule__ReferenceExpression__Group__1 )
            // InternalRegularExpressions.g:1439:2: rule__ReferenceExpression__Group__0__Impl rule__ReferenceExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceExpression__Group__0"


    // $ANTLR start "rule__ReferenceExpression__Group__0__Impl"
    // InternalRegularExpressions.g:1446:1: rule__ReferenceExpression__Group__0__Impl : ( '@' ) ;
    public final void rule__ReferenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1450:1: ( ( '@' ) )
            // InternalRegularExpressions.g:1451:1: ( '@' )
            {
            // InternalRegularExpressions.g:1451:1: ( '@' )
            // InternalRegularExpressions.g:1452:2: '@'
            {
             before(grammarAccess.getReferenceExpressionAccess().getCommercialAtKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReferenceExpressionAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceExpression__Group__0__Impl"


    // $ANTLR start "rule__ReferenceExpression__Group__1"
    // InternalRegularExpressions.g:1461:1: rule__ReferenceExpression__Group__1 : rule__ReferenceExpression__Group__1__Impl ;
    public final void rule__ReferenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1465:1: ( rule__ReferenceExpression__Group__1__Impl )
            // InternalRegularExpressions.g:1466:2: rule__ReferenceExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceExpression__Group__1"


    // $ANTLR start "rule__ReferenceExpression__Group__1__Impl"
    // InternalRegularExpressions.g:1472:1: rule__ReferenceExpression__Group__1__Impl : ( ( rule__ReferenceExpression__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1476:1: ( ( ( rule__ReferenceExpression__ReferenceAssignment_1 ) ) )
            // InternalRegularExpressions.g:1477:1: ( ( rule__ReferenceExpression__ReferenceAssignment_1 ) )
            {
            // InternalRegularExpressions.g:1477:1: ( ( rule__ReferenceExpression__ReferenceAssignment_1 ) )
            // InternalRegularExpressions.g:1478:2: ( rule__ReferenceExpression__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceExpressionAccess().getReferenceAssignment_1()); 
            // InternalRegularExpressions.g:1479:2: ( rule__ReferenceExpression__ReferenceAssignment_1 )
            // InternalRegularExpressions.g:1479:3: rule__ReferenceExpression__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceExpression__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceExpressionAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceExpression__Group__1__Impl"


    // $ANTLR start "rule__RegExModel__NameAssignment_2"
    // InternalRegularExpressions.g:1488:1: rule__RegExModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegExModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1492:1: ( ( RULE_ID ) )
            // InternalRegularExpressions.g:1493:2: ( RULE_ID )
            {
            // InternalRegularExpressions.g:1493:2: ( RULE_ID )
            // InternalRegularExpressions.g:1494:3: RULE_ID
            {
             before(grammarAccess.getRegExModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegExModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__NameAssignment_2"


    // $ANTLR start "rule__RegExModel__ExpressionAssignment_4"
    // InternalRegularExpressions.g:1503:1: rule__RegExModel__ExpressionAssignment_4 : ( ruleRegularExpression ) ;
    public final void rule__RegExModel__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1507:1: ( ( ruleRegularExpression ) )
            // InternalRegularExpressions.g:1508:2: ( ruleRegularExpression )
            {
            // InternalRegularExpressions.g:1508:2: ( ruleRegularExpression )
            // InternalRegularExpressions.g:1509:3: ruleRegularExpression
            {
             before(grammarAccess.getRegExModelAccess().getExpressionRegularExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression();

            state._fsp--;

             after(grammarAccess.getRegExModelAccess().getExpressionRegularExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__ExpressionAssignment_4"


    // $ANTLR start "rule__RegExModel__DefinitionsAssignment_5_1"
    // InternalRegularExpressions.g:1518:1: rule__RegExModel__DefinitionsAssignment_5_1 : ( ruleDefinition ) ;
    public final void rule__RegExModel__DefinitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1522:1: ( ( ruleDefinition ) )
            // InternalRegularExpressions.g:1523:2: ( ruleDefinition )
            {
            // InternalRegularExpressions.g:1523:2: ( ruleDefinition )
            // InternalRegularExpressions.g:1524:3: ruleDefinition
            {
             before(grammarAccess.getRegExModelAccess().getDefinitionsDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getRegExModelAccess().getDefinitionsDefinitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegExModel__DefinitionsAssignment_5_1"


    // $ANTLR start "rule__Definition__SymbolAssignment_0"
    // InternalRegularExpressions.g:1533:1: rule__Definition__SymbolAssignment_0 : ( RULE_ID ) ;
    public final void rule__Definition__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1537:1: ( ( RULE_ID ) )
            // InternalRegularExpressions.g:1538:2: ( RULE_ID )
            {
            // InternalRegularExpressions.g:1538:2: ( RULE_ID )
            // InternalRegularExpressions.g:1539:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getSymbolIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getSymbolIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__SymbolAssignment_0"


    // $ANTLR start "rule__Definition__ExpressionAssignment_2"
    // InternalRegularExpressions.g:1548:1: rule__Definition__ExpressionAssignment_2 : ( ruleRegularExpression ) ;
    public final void rule__Definition__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1552:1: ( ( ruleRegularExpression ) )
            // InternalRegularExpressions.g:1553:2: ( ruleRegularExpression )
            {
            // InternalRegularExpressions.g:1553:2: ( ruleRegularExpression )
            // InternalRegularExpressions.g:1554:3: ruleRegularExpression
            {
             before(grammarAccess.getDefinitionAccess().getExpressionRegularExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getExpressionRegularExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ExpressionAssignment_2"


    // $ANTLR start "rule__RegularExpression__ExpressionAssignment_0"
    // InternalRegularExpressions.g:1563:1: rule__RegularExpression__ExpressionAssignment_0 : ( ruleRegularExpression1 ) ;
    public final void rule__RegularExpression__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1567:1: ( ( ruleRegularExpression1 ) )
            // InternalRegularExpressions.g:1568:2: ( ruleRegularExpression1 )
            {
            // InternalRegularExpressions.g:1568:2: ( ruleRegularExpression1 )
            // InternalRegularExpressions.g:1569:3: ruleRegularExpression1
            {
             before(grammarAccess.getRegularExpressionAccess().getExpressionRegularExpression1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression1();

            state._fsp--;

             after(grammarAccess.getRegularExpressionAccess().getExpressionRegularExpression1ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__ExpressionAssignment_0"


    // $ANTLR start "rule__RegularExpression__AlternativesAssignment_1_1"
    // InternalRegularExpressions.g:1578:1: rule__RegularExpression__AlternativesAssignment_1_1 : ( ruleRegularExpression1 ) ;
    public final void rule__RegularExpression__AlternativesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1582:1: ( ( ruleRegularExpression1 ) )
            // InternalRegularExpressions.g:1583:2: ( ruleRegularExpression1 )
            {
            // InternalRegularExpressions.g:1583:2: ( ruleRegularExpression1 )
            // InternalRegularExpressions.g:1584:3: ruleRegularExpression1
            {
             before(grammarAccess.getRegularExpressionAccess().getAlternativesRegularExpression1ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression1();

            state._fsp--;

             after(grammarAccess.getRegularExpressionAccess().getAlternativesRegularExpression1ParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__AlternativesAssignment_1_1"


    // $ANTLR start "rule__RegularExpression__AlternativesAssignment_1_2_1"
    // InternalRegularExpressions.g:1593:1: rule__RegularExpression__AlternativesAssignment_1_2_1 : ( ruleRegularExpression1 ) ;
    public final void rule__RegularExpression__AlternativesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1597:1: ( ( ruleRegularExpression1 ) )
            // InternalRegularExpressions.g:1598:2: ( ruleRegularExpression1 )
            {
            // InternalRegularExpressions.g:1598:2: ( ruleRegularExpression1 )
            // InternalRegularExpressions.g:1599:3: ruleRegularExpression1
            {
             before(grammarAccess.getRegularExpressionAccess().getAlternativesRegularExpression1ParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression1();

            state._fsp--;

             after(grammarAccess.getRegularExpressionAccess().getAlternativesRegularExpression1ParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression__AlternativesAssignment_1_2_1"


    // $ANTLR start "rule__RegularExpression1__ExpressionAssignment_0"
    // InternalRegularExpressions.g:1608:1: rule__RegularExpression1__ExpressionAssignment_0 : ( ruleRegularExpression2 ) ;
    public final void rule__RegularExpression1__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1612:1: ( ( ruleRegularExpression2 ) )
            // InternalRegularExpressions.g:1613:2: ( ruleRegularExpression2 )
            {
            // InternalRegularExpressions.g:1613:2: ( ruleRegularExpression2 )
            // InternalRegularExpressions.g:1614:3: ruleRegularExpression2
            {
             before(grammarAccess.getRegularExpression1Access().getExpressionRegularExpression2ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression2();

            state._fsp--;

             after(grammarAccess.getRegularExpression1Access().getExpressionRegularExpression2ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__ExpressionAssignment_0"


    // $ANTLR start "rule__RegularExpression1__ConcatenationsAssignment_1_1"
    // InternalRegularExpressions.g:1623:1: rule__RegularExpression1__ConcatenationsAssignment_1_1 : ( ruleRegularExpression2 ) ;
    public final void rule__RegularExpression1__ConcatenationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1627:1: ( ( ruleRegularExpression2 ) )
            // InternalRegularExpressions.g:1628:2: ( ruleRegularExpression2 )
            {
            // InternalRegularExpressions.g:1628:2: ( ruleRegularExpression2 )
            // InternalRegularExpressions.g:1629:3: ruleRegularExpression2
            {
             before(grammarAccess.getRegularExpression1Access().getConcatenationsRegularExpression2ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression2();

            state._fsp--;

             after(grammarAccess.getRegularExpression1Access().getConcatenationsRegularExpression2ParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__ConcatenationsAssignment_1_1"


    // $ANTLR start "rule__RegularExpression1__ConcatenationsAssignment_1_2_1"
    // InternalRegularExpressions.g:1638:1: rule__RegularExpression1__ConcatenationsAssignment_1_2_1 : ( ruleRegularExpression2 ) ;
    public final void rule__RegularExpression1__ConcatenationsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1642:1: ( ( ruleRegularExpression2 ) )
            // InternalRegularExpressions.g:1643:2: ( ruleRegularExpression2 )
            {
            // InternalRegularExpressions.g:1643:2: ( ruleRegularExpression2 )
            // InternalRegularExpressions.g:1644:3: ruleRegularExpression2
            {
             before(grammarAccess.getRegularExpression1Access().getConcatenationsRegularExpression2ParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression2();

            state._fsp--;

             after(grammarAccess.getRegularExpression1Access().getConcatenationsRegularExpression2ParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression1__ConcatenationsAssignment_1_2_1"


    // $ANTLR start "rule__RegularExpression2__SubexpressionAssignment_0"
    // InternalRegularExpressions.g:1653:1: rule__RegularExpression2__SubexpressionAssignment_0 : ( ruleRegularExpression3 ) ;
    public final void rule__RegularExpression2__SubexpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1657:1: ( ( ruleRegularExpression3 ) )
            // InternalRegularExpressions.g:1658:2: ( ruleRegularExpression3 )
            {
            // InternalRegularExpressions.g:1658:2: ( ruleRegularExpression3 )
            // InternalRegularExpressions.g:1659:3: ruleRegularExpression3
            {
             before(grammarAccess.getRegularExpression2Access().getSubexpressionRegularExpression3ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression3();

            state._fsp--;

             after(grammarAccess.getRegularExpression2Access().getSubexpressionRegularExpression3ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression2__SubexpressionAssignment_0"


    // $ANTLR start "rule__RegularExpression2__KleeneAssignment_1_0"
    // InternalRegularExpressions.g:1668:1: rule__RegularExpression2__KleeneAssignment_1_0 : ( ( '*' ) ) ;
    public final void rule__RegularExpression2__KleeneAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1672:1: ( ( ( '*' ) ) )
            // InternalRegularExpressions.g:1673:2: ( ( '*' ) )
            {
            // InternalRegularExpressions.g:1673:2: ( ( '*' ) )
            // InternalRegularExpressions.g:1674:3: ( '*' )
            {
             before(grammarAccess.getRegularExpression2Access().getKleeneAsteriskKeyword_1_0_0()); 
            // InternalRegularExpressions.g:1675:3: ( '*' )
            // InternalRegularExpressions.g:1676:4: '*'
            {
             before(grammarAccess.getRegularExpression2Access().getKleeneAsteriskKeyword_1_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRegularExpression2Access().getKleeneAsteriskKeyword_1_0_0()); 

            }

             after(grammarAccess.getRegularExpression2Access().getKleeneAsteriskKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression2__KleeneAssignment_1_0"


    // $ANTLR start "rule__RegularExpression2__OmegaAssignment_1_1"
    // InternalRegularExpressions.g:1687:1: rule__RegularExpression2__OmegaAssignment_1_1 : ( ( '**' ) ) ;
    public final void rule__RegularExpression2__OmegaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1691:1: ( ( ( '**' ) ) )
            // InternalRegularExpressions.g:1692:2: ( ( '**' ) )
            {
            // InternalRegularExpressions.g:1692:2: ( ( '**' ) )
            // InternalRegularExpressions.g:1693:3: ( '**' )
            {
             before(grammarAccess.getRegularExpression2Access().getOmegaAsteriskAsteriskKeyword_1_1_0()); 
            // InternalRegularExpressions.g:1694:3: ( '**' )
            // InternalRegularExpressions.g:1695:4: '**'
            {
             before(grammarAccess.getRegularExpression2Access().getOmegaAsteriskAsteriskKeyword_1_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRegularExpression2Access().getOmegaAsteriskAsteriskKeyword_1_1_0()); 

            }

             after(grammarAccess.getRegularExpression2Access().getOmegaAsteriskAsteriskKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression2__OmegaAssignment_1_1"


    // $ANTLR start "rule__RegularExpression3__EmptyLangExpressionAssignment_0_1"
    // InternalRegularExpressions.g:1706:1: rule__RegularExpression3__EmptyLangExpressionAssignment_0_1 : ( ruleEmptyLanguageExpression ) ;
    public final void rule__RegularExpression3__EmptyLangExpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1710:1: ( ( ruleEmptyLanguageExpression ) )
            // InternalRegularExpressions.g:1711:2: ( ruleEmptyLanguageExpression )
            {
            // InternalRegularExpressions.g:1711:2: ( ruleEmptyLanguageExpression )
            // InternalRegularExpressions.g:1712:3: ruleEmptyLanguageExpression
            {
             before(grammarAccess.getRegularExpression3Access().getEmptyLangExpressionEmptyLanguageExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmptyLanguageExpression();

            state._fsp--;

             after(grammarAccess.getRegularExpression3Access().getEmptyLangExpressionEmptyLanguageExpressionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__EmptyLangExpressionAssignment_0_1"


    // $ANTLR start "rule__RegularExpression3__EmptyWordExpressionAssignment_1_1"
    // InternalRegularExpressions.g:1721:1: rule__RegularExpression3__EmptyWordExpressionAssignment_1_1 : ( ruleEmptyWordExpression ) ;
    public final void rule__RegularExpression3__EmptyWordExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1725:1: ( ( ruleEmptyWordExpression ) )
            // InternalRegularExpressions.g:1726:2: ( ruleEmptyWordExpression )
            {
            // InternalRegularExpressions.g:1726:2: ( ruleEmptyWordExpression )
            // InternalRegularExpressions.g:1727:3: ruleEmptyWordExpression
            {
             before(grammarAccess.getRegularExpression3Access().getEmptyWordExpressionEmptyWordExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmptyWordExpression();

            state._fsp--;

             after(grammarAccess.getRegularExpression3Access().getEmptyWordExpressionEmptyWordExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__EmptyWordExpressionAssignment_1_1"


    // $ANTLR start "rule__RegularExpression3__LetterExpressionAssignment_2_1"
    // InternalRegularExpressions.g:1736:1: rule__RegularExpression3__LetterExpressionAssignment_2_1 : ( ruleLetterExpression ) ;
    public final void rule__RegularExpression3__LetterExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1740:1: ( ( ruleLetterExpression ) )
            // InternalRegularExpressions.g:1741:2: ( ruleLetterExpression )
            {
            // InternalRegularExpressions.g:1741:2: ( ruleLetterExpression )
            // InternalRegularExpressions.g:1742:3: ruleLetterExpression
            {
             before(grammarAccess.getRegularExpression3Access().getLetterExpressionLetterExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLetterExpression();

            state._fsp--;

             after(grammarAccess.getRegularExpression3Access().getLetterExpressionLetterExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__LetterExpressionAssignment_2_1"


    // $ANTLR start "rule__RegularExpression3__ReferenceExpressionAssignment_3_1"
    // InternalRegularExpressions.g:1751:1: rule__RegularExpression3__ReferenceExpressionAssignment_3_1 : ( ruleReferenceExpression ) ;
    public final void rule__RegularExpression3__ReferenceExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1755:1: ( ( ruleReferenceExpression ) )
            // InternalRegularExpressions.g:1756:2: ( ruleReferenceExpression )
            {
            // InternalRegularExpressions.g:1756:2: ( ruleReferenceExpression )
            // InternalRegularExpressions.g:1757:3: ruleReferenceExpression
            {
             before(grammarAccess.getRegularExpression3Access().getReferenceExpressionReferenceExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceExpression();

            state._fsp--;

             after(grammarAccess.getRegularExpression3Access().getReferenceExpressionReferenceExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__ReferenceExpressionAssignment_3_1"


    // $ANTLR start "rule__RegularExpression3__ExpressionAssignment_4_1"
    // InternalRegularExpressions.g:1766:1: rule__RegularExpression3__ExpressionAssignment_4_1 : ( ruleRegularExpression ) ;
    public final void rule__RegularExpression3__ExpressionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1770:1: ( ( ruleRegularExpression ) )
            // InternalRegularExpressions.g:1771:2: ( ruleRegularExpression )
            {
            // InternalRegularExpressions.g:1771:2: ( ruleRegularExpression )
            // InternalRegularExpressions.g:1772:3: ruleRegularExpression
            {
             before(grammarAccess.getRegularExpression3Access().getExpressionRegularExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularExpression();

            state._fsp--;

             after(grammarAccess.getRegularExpression3Access().getExpressionRegularExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularExpression3__ExpressionAssignment_4_1"


    // $ANTLR start "rule__ReferenceExpression__ReferenceAssignment_1"
    // InternalRegularExpressions.g:1781:1: rule__ReferenceExpression__ReferenceAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReferenceExpression__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRegularExpressions.g:1785:1: ( ( RULE_ID ) )
            // InternalRegularExpressions.g:1786:2: ( RULE_ID )
            {
            // InternalRegularExpressions.g:1786:2: ( RULE_ID )
            // InternalRegularExpressions.g:1787:3: RULE_ID
            {
             before(grammarAccess.getReferenceExpressionAccess().getReferenceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceExpressionAccess().getReferenceIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceExpression__ReferenceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000005000F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});

}