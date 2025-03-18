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
import info.computationalmodeling.lang.services.MaxPlusMatrixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMaxPlusMatrixParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT", "RULE_INT", "RULE_NINT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'max-plus'", "'model'", "':'", "'matrices'", "'vector sequences'", "'event sequences'", "'='", "'['", "']'", "','", "'('", "')'", "'/'", "'-inf'"
    };
    public static final int RULE_NINT=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_FLOAT=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMaxPlusMatrixParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMaxPlusMatrixParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMaxPlusMatrixParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMaxPlusMatrix.g"; }


    	private MaxPlusMatrixGrammarAccess grammarAccess;

    	public void setGrammarAccess(MaxPlusMatrixGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMaxPlusMatrixModel"
    // InternalMaxPlusMatrix.g:53:1: entryRuleMaxPlusMatrixModel : ruleMaxPlusMatrixModel EOF ;
    public final void entryRuleMaxPlusMatrixModel() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:54:1: ( ruleMaxPlusMatrixModel EOF )
            // InternalMaxPlusMatrix.g:55:1: ruleMaxPlusMatrixModel EOF
            {
             before(grammarAccess.getMaxPlusMatrixModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxPlusMatrixModel();

            state._fsp--;

             after(grammarAccess.getMaxPlusMatrixModelRule()); 
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
    // $ANTLR end "entryRuleMaxPlusMatrixModel"


    // $ANTLR start "ruleMaxPlusMatrixModel"
    // InternalMaxPlusMatrix.g:62:1: ruleMaxPlusMatrixModel : ( ( rule__MaxPlusMatrixModel__Group__0 ) ) ;
    public final void ruleMaxPlusMatrixModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:66:2: ( ( ( rule__MaxPlusMatrixModel__Group__0 ) ) )
            // InternalMaxPlusMatrix.g:67:2: ( ( rule__MaxPlusMatrixModel__Group__0 ) )
            {
            // InternalMaxPlusMatrix.g:67:2: ( ( rule__MaxPlusMatrixModel__Group__0 ) )
            // InternalMaxPlusMatrix.g:68:3: ( rule__MaxPlusMatrixModel__Group__0 )
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getGroup()); 
            // InternalMaxPlusMatrix.g:69:3: ( rule__MaxPlusMatrixModel__Group__0 )
            // InternalMaxPlusMatrix.g:69:4: rule__MaxPlusMatrixModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxPlusMatrixModelAccess().getGroup()); 

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
    // $ANTLR end "ruleMaxPlusMatrixModel"


    // $ANTLR start "entryRuleMaxPlusMatrix"
    // InternalMaxPlusMatrix.g:78:1: entryRuleMaxPlusMatrix : ruleMaxPlusMatrix EOF ;
    public final void entryRuleMaxPlusMatrix() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:79:1: ( ruleMaxPlusMatrix EOF )
            // InternalMaxPlusMatrix.g:80:1: ruleMaxPlusMatrix EOF
            {
             before(grammarAccess.getMaxPlusMatrixRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxPlusMatrix();

            state._fsp--;

             after(grammarAccess.getMaxPlusMatrixRule()); 
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
    // $ANTLR end "entryRuleMaxPlusMatrix"


    // $ANTLR start "ruleMaxPlusMatrix"
    // InternalMaxPlusMatrix.g:87:1: ruleMaxPlusMatrix : ( ( rule__MaxPlusMatrix__Group__0 ) ) ;
    public final void ruleMaxPlusMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:91:2: ( ( ( rule__MaxPlusMatrix__Group__0 ) ) )
            // InternalMaxPlusMatrix.g:92:2: ( ( rule__MaxPlusMatrix__Group__0 ) )
            {
            // InternalMaxPlusMatrix.g:92:2: ( ( rule__MaxPlusMatrix__Group__0 ) )
            // InternalMaxPlusMatrix.g:93:3: ( rule__MaxPlusMatrix__Group__0 )
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getGroup()); 
            // InternalMaxPlusMatrix.g:94:3: ( rule__MaxPlusMatrix__Group__0 )
            // InternalMaxPlusMatrix.g:94:4: rule__MaxPlusMatrix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxPlusMatrixAccess().getGroup()); 

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
    // $ANTLR end "ruleMaxPlusMatrix"


    // $ANTLR start "entryRuleRow"
    // InternalMaxPlusMatrix.g:103:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:104:1: ( ruleRow EOF )
            // InternalMaxPlusMatrix.g:105:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalMaxPlusMatrix.g:112:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:116:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalMaxPlusMatrix.g:117:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalMaxPlusMatrix.g:117:2: ( ( rule__Row__Group__0 ) )
            // InternalMaxPlusMatrix.g:118:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalMaxPlusMatrix.g:119:3: ( rule__Row__Group__0 )
            // InternalMaxPlusMatrix.g:119:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleVectorSequence"
    // InternalMaxPlusMatrix.g:128:1: entryRuleVectorSequence : ruleVectorSequence EOF ;
    public final void entryRuleVectorSequence() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:129:1: ( ruleVectorSequence EOF )
            // InternalMaxPlusMatrix.g:130:1: ruleVectorSequence EOF
            {
             before(grammarAccess.getVectorSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleVectorSequence();

            state._fsp--;

             after(grammarAccess.getVectorSequenceRule()); 
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
    // $ANTLR end "entryRuleVectorSequence"


    // $ANTLR start "ruleVectorSequence"
    // InternalMaxPlusMatrix.g:137:1: ruleVectorSequence : ( ( rule__VectorSequence__Group__0 ) ) ;
    public final void ruleVectorSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:141:2: ( ( ( rule__VectorSequence__Group__0 ) ) )
            // InternalMaxPlusMatrix.g:142:2: ( ( rule__VectorSequence__Group__0 ) )
            {
            // InternalMaxPlusMatrix.g:142:2: ( ( rule__VectorSequence__Group__0 ) )
            // InternalMaxPlusMatrix.g:143:3: ( rule__VectorSequence__Group__0 )
            {
             before(grammarAccess.getVectorSequenceAccess().getGroup()); 
            // InternalMaxPlusMatrix.g:144:3: ( rule__VectorSequence__Group__0 )
            // InternalMaxPlusMatrix.g:144:4: rule__VectorSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVectorSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleVectorSequence"


    // $ANTLR start "entryRuleEventSequence"
    // InternalMaxPlusMatrix.g:153:1: entryRuleEventSequence : ruleEventSequence EOF ;
    public final void entryRuleEventSequence() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:154:1: ( ruleEventSequence EOF )
            // InternalMaxPlusMatrix.g:155:1: ruleEventSequence EOF
            {
             before(grammarAccess.getEventSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleEventSequence();

            state._fsp--;

             after(grammarAccess.getEventSequenceRule()); 
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
    // $ANTLR end "entryRuleEventSequence"


    // $ANTLR start "ruleEventSequence"
    // InternalMaxPlusMatrix.g:162:1: ruleEventSequence : ( ( rule__EventSequence__Group__0 ) ) ;
    public final void ruleEventSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:166:2: ( ( ( rule__EventSequence__Group__0 ) ) )
            // InternalMaxPlusMatrix.g:167:2: ( ( rule__EventSequence__Group__0 ) )
            {
            // InternalMaxPlusMatrix.g:167:2: ( ( rule__EventSequence__Group__0 ) )
            // InternalMaxPlusMatrix.g:168:3: ( rule__EventSequence__Group__0 )
            {
             before(grammarAccess.getEventSequenceAccess().getGroup()); 
            // InternalMaxPlusMatrix.g:169:3: ( rule__EventSequence__Group__0 )
            // InternalMaxPlusMatrix.g:169:4: rule__EventSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleEventSequence"


    // $ANTLR start "entryRuleLabels"
    // InternalMaxPlusMatrix.g:178:1: entryRuleLabels : ruleLabels EOF ;
    public final void entryRuleLabels() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:179:1: ( ruleLabels EOF )
            // InternalMaxPlusMatrix.g:180:1: ruleLabels EOF
            {
             before(grammarAccess.getLabelsRule()); 
            pushFollow(FOLLOW_1);
            ruleLabels();

            state._fsp--;

             after(grammarAccess.getLabelsRule()); 
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
    // $ANTLR end "entryRuleLabels"


    // $ANTLR start "ruleLabels"
    // InternalMaxPlusMatrix.g:187:1: ruleLabels : ( ( rule__Labels__Group__0 ) ) ;
    public final void ruleLabels() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:191:2: ( ( ( rule__Labels__Group__0 ) ) )
            // InternalMaxPlusMatrix.g:192:2: ( ( rule__Labels__Group__0 ) )
            {
            // InternalMaxPlusMatrix.g:192:2: ( ( rule__Labels__Group__0 ) )
            // InternalMaxPlusMatrix.g:193:3: ( rule__Labels__Group__0 )
            {
             before(grammarAccess.getLabelsAccess().getGroup()); 
            // InternalMaxPlusMatrix.g:194:3: ( rule__Labels__Group__0 )
            // InternalMaxPlusMatrix.g:194:4: rule__Labels__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Labels__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelsAccess().getGroup()); 

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
    // $ANTLR end "ruleLabels"


    // $ANTLR start "entryRuleElement"
    // InternalMaxPlusMatrix.g:203:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:204:1: ( ruleElement EOF )
            // InternalMaxPlusMatrix.g:205:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMaxPlusMatrix.g:212:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:216:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalMaxPlusMatrix.g:217:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalMaxPlusMatrix.g:217:2: ( ( rule__Element__Alternatives ) )
            // InternalMaxPlusMatrix.g:218:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalMaxPlusMatrix.g:219:3: ( rule__Element__Alternatives )
            // InternalMaxPlusMatrix.g:219:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleNumber"
    // InternalMaxPlusMatrix.g:228:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:229:1: ( ruleNumber EOF )
            // InternalMaxPlusMatrix.g:230:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMaxPlusMatrix.g:237:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:241:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalMaxPlusMatrix.g:242:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalMaxPlusMatrix.g:242:2: ( ( rule__Number__Alternatives ) )
            // InternalMaxPlusMatrix.g:243:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalMaxPlusMatrix.g:244:3: ( rule__Number__Alternatives )
            // InternalMaxPlusMatrix.g:244:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleRatio"
    // InternalMaxPlusMatrix.g:253:1: entryRuleRatio : ruleRatio EOF ;
    public final void entryRuleRatio() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:254:1: ( ruleRatio EOF )
            // InternalMaxPlusMatrix.g:255:1: ruleRatio EOF
            {
             before(grammarAccess.getRatioRule()); 
            pushFollow(FOLLOW_1);
            ruleRatio();

            state._fsp--;

             after(grammarAccess.getRatioRule()); 
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
    // $ANTLR end "entryRuleRatio"


    // $ANTLR start "ruleRatio"
    // InternalMaxPlusMatrix.g:262:1: ruleRatio : ( ( rule__Ratio__Group__0 ) ) ;
    public final void ruleRatio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:266:2: ( ( ( rule__Ratio__Group__0 ) ) )
            // InternalMaxPlusMatrix.g:267:2: ( ( rule__Ratio__Group__0 ) )
            {
            // InternalMaxPlusMatrix.g:267:2: ( ( rule__Ratio__Group__0 ) )
            // InternalMaxPlusMatrix.g:268:3: ( rule__Ratio__Group__0 )
            {
             before(grammarAccess.getRatioAccess().getGroup()); 
            // InternalMaxPlusMatrix.g:269:3: ( rule__Ratio__Group__0 )
            // InternalMaxPlusMatrix.g:269:4: rule__Ratio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ratio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatioAccess().getGroup()); 

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
    // $ANTLR end "ruleRatio"


    // $ANTLR start "entryRulePNInt"
    // InternalMaxPlusMatrix.g:278:1: entryRulePNInt : rulePNInt EOF ;
    public final void entryRulePNInt() throws RecognitionException {
        try {
            // InternalMaxPlusMatrix.g:279:1: ( rulePNInt EOF )
            // InternalMaxPlusMatrix.g:280:1: rulePNInt EOF
            {
             before(grammarAccess.getPNIntRule()); 
            pushFollow(FOLLOW_1);
            rulePNInt();

            state._fsp--;

             after(grammarAccess.getPNIntRule()); 
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
    // $ANTLR end "entryRulePNInt"


    // $ANTLR start "rulePNInt"
    // InternalMaxPlusMatrix.g:287:1: rulePNInt : ( ( rule__PNInt__Alternatives ) ) ;
    public final void rulePNInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:291:2: ( ( ( rule__PNInt__Alternatives ) ) )
            // InternalMaxPlusMatrix.g:292:2: ( ( rule__PNInt__Alternatives ) )
            {
            // InternalMaxPlusMatrix.g:292:2: ( ( rule__PNInt__Alternatives ) )
            // InternalMaxPlusMatrix.g:293:3: ( rule__PNInt__Alternatives )
            {
             before(grammarAccess.getPNIntAccess().getAlternatives()); 
            // InternalMaxPlusMatrix.g:294:3: ( rule__PNInt__Alternatives )
            // InternalMaxPlusMatrix.g:294:4: rule__PNInt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PNInt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPNIntAccess().getAlternatives()); 

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
    // $ANTLR end "rulePNInt"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalMaxPlusMatrix.g:302:1: rule__Element__Alternatives : ( ( ( rule__Element__NumAssignment_0 ) ) | ( ( rule__Element__InfAssignment_1 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:306:1: ( ( ( rule__Element__NumAssignment_0 ) ) | ( ( rule__Element__InfAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_FLOAT && LA1_0<=RULE_NINT)) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMaxPlusMatrix.g:307:2: ( ( rule__Element__NumAssignment_0 ) )
                    {
                    // InternalMaxPlusMatrix.g:307:2: ( ( rule__Element__NumAssignment_0 ) )
                    // InternalMaxPlusMatrix.g:308:3: ( rule__Element__NumAssignment_0 )
                    {
                     before(grammarAccess.getElementAccess().getNumAssignment_0()); 
                    // InternalMaxPlusMatrix.g:309:3: ( rule__Element__NumAssignment_0 )
                    // InternalMaxPlusMatrix.g:309:4: rule__Element__NumAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__NumAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getNumAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMaxPlusMatrix.g:313:2: ( ( rule__Element__InfAssignment_1 ) )
                    {
                    // InternalMaxPlusMatrix.g:313:2: ( ( rule__Element__InfAssignment_1 ) )
                    // InternalMaxPlusMatrix.g:314:3: ( rule__Element__InfAssignment_1 )
                    {
                     before(grammarAccess.getElementAccess().getInfAssignment_1()); 
                    // InternalMaxPlusMatrix.g:315:3: ( rule__Element__InfAssignment_1 )
                    // InternalMaxPlusMatrix.g:315:4: rule__Element__InfAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__InfAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getInfAssignment_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalMaxPlusMatrix.g:323:1: rule__Number__Alternatives : ( ( ( rule__Number__RatioAssignment_0 ) ) | ( ( rule__Number__ValueAssignment_1 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:327:1: ( ( ( rule__Number__RatioAssignment_0 ) ) | ( ( rule__Number__ValueAssignment_1 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_FLOAT && LA2_1<=RULE_NINT)||(LA2_1>=21 && LA2_1<=22)||LA2_1==26) ) {
                    alt2=2;
                }
                else if ( (LA2_1==25) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NINT:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||(LA2_2>=RULE_FLOAT && LA2_2<=RULE_NINT)||(LA2_2>=21 && LA2_2<=22)||LA2_2==26) ) {
                    alt2=2;
                }
                else if ( (LA2_2==25) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMaxPlusMatrix.g:328:2: ( ( rule__Number__RatioAssignment_0 ) )
                    {
                    // InternalMaxPlusMatrix.g:328:2: ( ( rule__Number__RatioAssignment_0 ) )
                    // InternalMaxPlusMatrix.g:329:3: ( rule__Number__RatioAssignment_0 )
                    {
                     before(grammarAccess.getNumberAccess().getRatioAssignment_0()); 
                    // InternalMaxPlusMatrix.g:330:3: ( rule__Number__RatioAssignment_0 )
                    // InternalMaxPlusMatrix.g:330:4: rule__Number__RatioAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__RatioAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getRatioAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMaxPlusMatrix.g:334:2: ( ( rule__Number__ValueAssignment_1 ) )
                    {
                    // InternalMaxPlusMatrix.g:334:2: ( ( rule__Number__ValueAssignment_1 ) )
                    // InternalMaxPlusMatrix.g:335:3: ( rule__Number__ValueAssignment_1 )
                    {
                     before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
                    // InternalMaxPlusMatrix.g:336:3: ( rule__Number__ValueAssignment_1 )
                    // InternalMaxPlusMatrix.g:336:4: rule__Number__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Number__ValueAlternatives_1_0"
    // InternalMaxPlusMatrix.g:344:1: rule__Number__ValueAlternatives_1_0 : ( ( rulePNInt ) | ( RULE_FLOAT ) );
    public final void rule__Number__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:348:1: ( ( rulePNInt ) | ( RULE_FLOAT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_NINT)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_FLOAT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMaxPlusMatrix.g:349:2: ( rulePNInt )
                    {
                    // InternalMaxPlusMatrix.g:349:2: ( rulePNInt )
                    // InternalMaxPlusMatrix.g:350:3: rulePNInt
                    {
                     before(grammarAccess.getNumberAccess().getValuePNIntParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePNInt();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getValuePNIntParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMaxPlusMatrix.g:355:2: ( RULE_FLOAT )
                    {
                    // InternalMaxPlusMatrix.g:355:2: ( RULE_FLOAT )
                    // InternalMaxPlusMatrix.g:356:3: RULE_FLOAT
                    {
                     before(grammarAccess.getNumberAccess().getValueFloatTerminalRuleCall_1_0_1()); 
                    match(input,RULE_FLOAT,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getValueFloatTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Number__ValueAlternatives_1_0"


    // $ANTLR start "rule__PNInt__Alternatives"
    // InternalMaxPlusMatrix.g:365:1: rule__PNInt__Alternatives : ( ( RULE_INT ) | ( RULE_NINT ) );
    public final void rule__PNInt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:369:1: ( ( RULE_INT ) | ( RULE_NINT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_NINT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMaxPlusMatrix.g:370:2: ( RULE_INT )
                    {
                    // InternalMaxPlusMatrix.g:370:2: ( RULE_INT )
                    // InternalMaxPlusMatrix.g:371:3: RULE_INT
                    {
                     before(grammarAccess.getPNIntAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getPNIntAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMaxPlusMatrix.g:376:2: ( RULE_NINT )
                    {
                    // InternalMaxPlusMatrix.g:376:2: ( RULE_NINT )
                    // InternalMaxPlusMatrix.g:377:3: RULE_NINT
                    {
                     before(grammarAccess.getPNIntAccess().getNINTTerminalRuleCall_1()); 
                    match(input,RULE_NINT,FOLLOW_2); 
                     after(grammarAccess.getPNIntAccess().getNINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__PNInt__Alternatives"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__0"
    // InternalMaxPlusMatrix.g:386:1: rule__MaxPlusMatrixModel__Group__0 : rule__MaxPlusMatrixModel__Group__0__Impl rule__MaxPlusMatrixModel__Group__1 ;
    public final void rule__MaxPlusMatrixModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:390:1: ( rule__MaxPlusMatrixModel__Group__0__Impl rule__MaxPlusMatrixModel__Group__1 )
            // InternalMaxPlusMatrix.g:391:2: rule__MaxPlusMatrixModel__Group__0__Impl rule__MaxPlusMatrixModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MaxPlusMatrixModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group__1();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__0"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__0__Impl"
    // InternalMaxPlusMatrix.g:398:1: rule__MaxPlusMatrixModel__Group__0__Impl : ( 'max-plus' ) ;
    public final void rule__MaxPlusMatrixModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:402:1: ( ( 'max-plus' ) )
            // InternalMaxPlusMatrix.g:403:1: ( 'max-plus' )
            {
            // InternalMaxPlusMatrix.g:403:1: ( 'max-plus' )
            // InternalMaxPlusMatrix.g:404:2: 'max-plus'
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getMaxPlusKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixModelAccess().getMaxPlusKeyword_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__0__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__1"
    // InternalMaxPlusMatrix.g:413:1: rule__MaxPlusMatrixModel__Group__1 : rule__MaxPlusMatrixModel__Group__1__Impl rule__MaxPlusMatrixModel__Group__2 ;
    public final void rule__MaxPlusMatrixModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:417:1: ( rule__MaxPlusMatrixModel__Group__1__Impl rule__MaxPlusMatrixModel__Group__2 )
            // InternalMaxPlusMatrix.g:418:2: rule__MaxPlusMatrixModel__Group__1__Impl rule__MaxPlusMatrixModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MaxPlusMatrixModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group__2();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__1"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__1__Impl"
    // InternalMaxPlusMatrix.g:425:1: rule__MaxPlusMatrixModel__Group__1__Impl : ( 'model' ) ;
    public final void rule__MaxPlusMatrixModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:429:1: ( ( 'model' ) )
            // InternalMaxPlusMatrix.g:430:1: ( 'model' )
            {
            // InternalMaxPlusMatrix.g:430:1: ( 'model' )
            // InternalMaxPlusMatrix.g:431:2: 'model'
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getModelKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixModelAccess().getModelKeyword_1()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__1__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__2"
    // InternalMaxPlusMatrix.g:440:1: rule__MaxPlusMatrixModel__Group__2 : rule__MaxPlusMatrixModel__Group__2__Impl rule__MaxPlusMatrixModel__Group__3 ;
    public final void rule__MaxPlusMatrixModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:444:1: ( rule__MaxPlusMatrixModel__Group__2__Impl rule__MaxPlusMatrixModel__Group__3 )
            // InternalMaxPlusMatrix.g:445:2: rule__MaxPlusMatrixModel__Group__2__Impl rule__MaxPlusMatrixModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MaxPlusMatrixModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group__3();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__2"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__2__Impl"
    // InternalMaxPlusMatrix.g:452:1: rule__MaxPlusMatrixModel__Group__2__Impl : ( ( rule__MaxPlusMatrixModel__NameAssignment_2 ) ) ;
    public final void rule__MaxPlusMatrixModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:456:1: ( ( ( rule__MaxPlusMatrixModel__NameAssignment_2 ) ) )
            // InternalMaxPlusMatrix.g:457:1: ( ( rule__MaxPlusMatrixModel__NameAssignment_2 ) )
            {
            // InternalMaxPlusMatrix.g:457:1: ( ( rule__MaxPlusMatrixModel__NameAssignment_2 ) )
            // InternalMaxPlusMatrix.g:458:2: ( rule__MaxPlusMatrixModel__NameAssignment_2 )
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getNameAssignment_2()); 
            // InternalMaxPlusMatrix.g:459:2: ( rule__MaxPlusMatrixModel__NameAssignment_2 )
            // InternalMaxPlusMatrix.g:459:3: rule__MaxPlusMatrixModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaxPlusMatrixModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__2__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__3"
    // InternalMaxPlusMatrix.g:467:1: rule__MaxPlusMatrixModel__Group__3 : rule__MaxPlusMatrixModel__Group__3__Impl rule__MaxPlusMatrixModel__Group__4 ;
    public final void rule__MaxPlusMatrixModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:471:1: ( rule__MaxPlusMatrixModel__Group__3__Impl rule__MaxPlusMatrixModel__Group__4 )
            // InternalMaxPlusMatrix.g:472:2: rule__MaxPlusMatrixModel__Group__3__Impl rule__MaxPlusMatrixModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MaxPlusMatrixModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group__4();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__3"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__3__Impl"
    // InternalMaxPlusMatrix.g:479:1: rule__MaxPlusMatrixModel__Group__3__Impl : ( ':' ) ;
    public final void rule__MaxPlusMatrixModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:483:1: ( ( ':' ) )
            // InternalMaxPlusMatrix.g:484:1: ( ':' )
            {
            // InternalMaxPlusMatrix.g:484:1: ( ':' )
            // InternalMaxPlusMatrix.g:485:2: ':'
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixModelAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__3__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__4"
    // InternalMaxPlusMatrix.g:494:1: rule__MaxPlusMatrixModel__Group__4 : rule__MaxPlusMatrixModel__Group__4__Impl rule__MaxPlusMatrixModel__Group__5 ;
    public final void rule__MaxPlusMatrixModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:498:1: ( rule__MaxPlusMatrixModel__Group__4__Impl rule__MaxPlusMatrixModel__Group__5 )
            // InternalMaxPlusMatrix.g:499:2: rule__MaxPlusMatrixModel__Group__4__Impl rule__MaxPlusMatrixModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__MaxPlusMatrixModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group__5();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__4"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__4__Impl"
    // InternalMaxPlusMatrix.g:506:1: rule__MaxPlusMatrixModel__Group__4__Impl : ( ( rule__MaxPlusMatrixModel__Group_4__0 )? ) ;
    public final void rule__MaxPlusMatrixModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:510:1: ( ( ( rule__MaxPlusMatrixModel__Group_4__0 )? ) )
            // InternalMaxPlusMatrix.g:511:1: ( ( rule__MaxPlusMatrixModel__Group_4__0 )? )
            {
            // InternalMaxPlusMatrix.g:511:1: ( ( rule__MaxPlusMatrixModel__Group_4__0 )? )
            // InternalMaxPlusMatrix.g:512:2: ( rule__MaxPlusMatrixModel__Group_4__0 )?
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getGroup_4()); 
            // InternalMaxPlusMatrix.g:513:2: ( rule__MaxPlusMatrixModel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMaxPlusMatrix.g:513:3: rule__MaxPlusMatrixModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxPlusMatrixModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxPlusMatrixModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__4__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__5"
    // InternalMaxPlusMatrix.g:521:1: rule__MaxPlusMatrixModel__Group__5 : rule__MaxPlusMatrixModel__Group__5__Impl rule__MaxPlusMatrixModel__Group__6 ;
    public final void rule__MaxPlusMatrixModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:525:1: ( rule__MaxPlusMatrixModel__Group__5__Impl rule__MaxPlusMatrixModel__Group__6 )
            // InternalMaxPlusMatrix.g:526:2: rule__MaxPlusMatrixModel__Group__5__Impl rule__MaxPlusMatrixModel__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__MaxPlusMatrixModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group__6();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__5"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__5__Impl"
    // InternalMaxPlusMatrix.g:533:1: rule__MaxPlusMatrixModel__Group__5__Impl : ( ( rule__MaxPlusMatrixModel__Group_5__0 )? ) ;
    public final void rule__MaxPlusMatrixModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:537:1: ( ( ( rule__MaxPlusMatrixModel__Group_5__0 )? ) )
            // InternalMaxPlusMatrix.g:538:1: ( ( rule__MaxPlusMatrixModel__Group_5__0 )? )
            {
            // InternalMaxPlusMatrix.g:538:1: ( ( rule__MaxPlusMatrixModel__Group_5__0 )? )
            // InternalMaxPlusMatrix.g:539:2: ( rule__MaxPlusMatrixModel__Group_5__0 )?
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getGroup_5()); 
            // InternalMaxPlusMatrix.g:540:2: ( rule__MaxPlusMatrixModel__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMaxPlusMatrix.g:540:3: rule__MaxPlusMatrixModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxPlusMatrixModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxPlusMatrixModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__5__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__6"
    // InternalMaxPlusMatrix.g:548:1: rule__MaxPlusMatrixModel__Group__6 : rule__MaxPlusMatrixModel__Group__6__Impl ;
    public final void rule__MaxPlusMatrixModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:552:1: ( rule__MaxPlusMatrixModel__Group__6__Impl )
            // InternalMaxPlusMatrix.g:553:2: rule__MaxPlusMatrixModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group__6__Impl();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__6"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group__6__Impl"
    // InternalMaxPlusMatrix.g:559:1: rule__MaxPlusMatrixModel__Group__6__Impl : ( ( rule__MaxPlusMatrixModel__Group_6__0 )? ) ;
    public final void rule__MaxPlusMatrixModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:563:1: ( ( ( rule__MaxPlusMatrixModel__Group_6__0 )? ) )
            // InternalMaxPlusMatrix.g:564:1: ( ( rule__MaxPlusMatrixModel__Group_6__0 )? )
            {
            // InternalMaxPlusMatrix.g:564:1: ( ( rule__MaxPlusMatrixModel__Group_6__0 )? )
            // InternalMaxPlusMatrix.g:565:2: ( rule__MaxPlusMatrixModel__Group_6__0 )?
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getGroup_6()); 
            // InternalMaxPlusMatrix.g:566:2: ( rule__MaxPlusMatrixModel__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMaxPlusMatrix.g:566:3: rule__MaxPlusMatrixModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxPlusMatrixModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxPlusMatrixModelAccess().getGroup_6()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group__6__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_4__0"
    // InternalMaxPlusMatrix.g:575:1: rule__MaxPlusMatrixModel__Group_4__0 : rule__MaxPlusMatrixModel__Group_4__0__Impl rule__MaxPlusMatrixModel__Group_4__1 ;
    public final void rule__MaxPlusMatrixModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:579:1: ( rule__MaxPlusMatrixModel__Group_4__0__Impl rule__MaxPlusMatrixModel__Group_4__1 )
            // InternalMaxPlusMatrix.g:580:2: rule__MaxPlusMatrixModel__Group_4__0__Impl rule__MaxPlusMatrixModel__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__MaxPlusMatrixModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group_4__1();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_4__0"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_4__0__Impl"
    // InternalMaxPlusMatrix.g:587:1: rule__MaxPlusMatrixModel__Group_4__0__Impl : ( 'matrices' ) ;
    public final void rule__MaxPlusMatrixModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:591:1: ( ( 'matrices' ) )
            // InternalMaxPlusMatrix.g:592:1: ( 'matrices' )
            {
            // InternalMaxPlusMatrix.g:592:1: ( 'matrices' )
            // InternalMaxPlusMatrix.g:593:2: 'matrices'
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getMatricesKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixModelAccess().getMatricesKeyword_4_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_4__0__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_4__1"
    // InternalMaxPlusMatrix.g:602:1: rule__MaxPlusMatrixModel__Group_4__1 : rule__MaxPlusMatrixModel__Group_4__1__Impl ;
    public final void rule__MaxPlusMatrixModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:606:1: ( rule__MaxPlusMatrixModel__Group_4__1__Impl )
            // InternalMaxPlusMatrix.g:607:2: rule__MaxPlusMatrixModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group_4__1__Impl();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_4__1"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_4__1__Impl"
    // InternalMaxPlusMatrix.g:613:1: rule__MaxPlusMatrixModel__Group_4__1__Impl : ( ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 ) ) ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )* ) ) ;
    public final void rule__MaxPlusMatrixModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:617:1: ( ( ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 ) ) ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )* ) ) )
            // InternalMaxPlusMatrix.g:618:1: ( ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 ) ) ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )* ) )
            {
            // InternalMaxPlusMatrix.g:618:1: ( ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 ) ) ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )* ) )
            // InternalMaxPlusMatrix.g:619:2: ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 ) ) ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )* )
            {
            // InternalMaxPlusMatrix.g:619:2: ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 ) )
            // InternalMaxPlusMatrix.g:620:3: ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getMatricesAssignment_4_1()); 
            // InternalMaxPlusMatrix.g:621:3: ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )
            // InternalMaxPlusMatrix.g:621:4: rule__MaxPlusMatrixModel__MatricesAssignment_4_1
            {
            pushFollow(FOLLOW_7);
            rule__MaxPlusMatrixModel__MatricesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMaxPlusMatrixModelAccess().getMatricesAssignment_4_1()); 

            }

            // InternalMaxPlusMatrix.g:624:2: ( ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )* )
            // InternalMaxPlusMatrix.g:625:3: ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )*
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getMatricesAssignment_4_1()); 
            // InternalMaxPlusMatrix.g:626:3: ( rule__MaxPlusMatrixModel__MatricesAssignment_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMaxPlusMatrix.g:626:4: rule__MaxPlusMatrixModel__MatricesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MaxPlusMatrixModel__MatricesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMaxPlusMatrixModelAccess().getMatricesAssignment_4_1()); 

            }


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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_4__1__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_5__0"
    // InternalMaxPlusMatrix.g:636:1: rule__MaxPlusMatrixModel__Group_5__0 : rule__MaxPlusMatrixModel__Group_5__0__Impl rule__MaxPlusMatrixModel__Group_5__1 ;
    public final void rule__MaxPlusMatrixModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:640:1: ( rule__MaxPlusMatrixModel__Group_5__0__Impl rule__MaxPlusMatrixModel__Group_5__1 )
            // InternalMaxPlusMatrix.g:641:2: rule__MaxPlusMatrixModel__Group_5__0__Impl rule__MaxPlusMatrixModel__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__MaxPlusMatrixModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group_5__1();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_5__0"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_5__0__Impl"
    // InternalMaxPlusMatrix.g:648:1: rule__MaxPlusMatrixModel__Group_5__0__Impl : ( 'vector sequences' ) ;
    public final void rule__MaxPlusMatrixModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:652:1: ( ( 'vector sequences' ) )
            // InternalMaxPlusMatrix.g:653:1: ( 'vector sequences' )
            {
            // InternalMaxPlusMatrix.g:653:1: ( 'vector sequences' )
            // InternalMaxPlusMatrix.g:654:2: 'vector sequences'
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getVectorSequencesKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixModelAccess().getVectorSequencesKeyword_5_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_5__0__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_5__1"
    // InternalMaxPlusMatrix.g:663:1: rule__MaxPlusMatrixModel__Group_5__1 : rule__MaxPlusMatrixModel__Group_5__1__Impl ;
    public final void rule__MaxPlusMatrixModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:667:1: ( rule__MaxPlusMatrixModel__Group_5__1__Impl )
            // InternalMaxPlusMatrix.g:668:2: rule__MaxPlusMatrixModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group_5__1__Impl();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_5__1"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_5__1__Impl"
    // InternalMaxPlusMatrix.g:674:1: rule__MaxPlusMatrixModel__Group_5__1__Impl : ( ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 ) ) ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )* ) ) ;
    public final void rule__MaxPlusMatrixModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:678:1: ( ( ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 ) ) ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )* ) ) )
            // InternalMaxPlusMatrix.g:679:1: ( ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 ) ) ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )* ) )
            {
            // InternalMaxPlusMatrix.g:679:1: ( ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 ) ) ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )* ) )
            // InternalMaxPlusMatrix.g:680:2: ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 ) ) ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )* )
            {
            // InternalMaxPlusMatrix.g:680:2: ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 ) )
            // InternalMaxPlusMatrix.g:681:3: ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getVectorsequencesAssignment_5_1()); 
            // InternalMaxPlusMatrix.g:682:3: ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )
            // InternalMaxPlusMatrix.g:682:4: rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1
            {
            pushFollow(FOLLOW_7);
            rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMaxPlusMatrixModelAccess().getVectorsequencesAssignment_5_1()); 

            }

            // InternalMaxPlusMatrix.g:685:2: ( ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )* )
            // InternalMaxPlusMatrix.g:686:3: ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )*
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getVectorsequencesAssignment_5_1()); 
            // InternalMaxPlusMatrix.g:687:3: ( rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMaxPlusMatrix.g:687:4: rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMaxPlusMatrixModelAccess().getVectorsequencesAssignment_5_1()); 

            }


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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_5__1__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_6__0"
    // InternalMaxPlusMatrix.g:697:1: rule__MaxPlusMatrixModel__Group_6__0 : rule__MaxPlusMatrixModel__Group_6__0__Impl rule__MaxPlusMatrixModel__Group_6__1 ;
    public final void rule__MaxPlusMatrixModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:701:1: ( rule__MaxPlusMatrixModel__Group_6__0__Impl rule__MaxPlusMatrixModel__Group_6__1 )
            // InternalMaxPlusMatrix.g:702:2: rule__MaxPlusMatrixModel__Group_6__0__Impl rule__MaxPlusMatrixModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__MaxPlusMatrixModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group_6__1();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_6__0"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_6__0__Impl"
    // InternalMaxPlusMatrix.g:709:1: rule__MaxPlusMatrixModel__Group_6__0__Impl : ( 'event sequences' ) ;
    public final void rule__MaxPlusMatrixModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:713:1: ( ( 'event sequences' ) )
            // InternalMaxPlusMatrix.g:714:1: ( 'event sequences' )
            {
            // InternalMaxPlusMatrix.g:714:1: ( 'event sequences' )
            // InternalMaxPlusMatrix.g:715:2: 'event sequences'
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getEventSequencesKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixModelAccess().getEventSequencesKeyword_6_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_6__0__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_6__1"
    // InternalMaxPlusMatrix.g:724:1: rule__MaxPlusMatrixModel__Group_6__1 : rule__MaxPlusMatrixModel__Group_6__1__Impl ;
    public final void rule__MaxPlusMatrixModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:728:1: ( rule__MaxPlusMatrixModel__Group_6__1__Impl )
            // InternalMaxPlusMatrix.g:729:2: rule__MaxPlusMatrixModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrixModel__Group_6__1__Impl();

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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_6__1"


    // $ANTLR start "rule__MaxPlusMatrixModel__Group_6__1__Impl"
    // InternalMaxPlusMatrix.g:735:1: rule__MaxPlusMatrixModel__Group_6__1__Impl : ( ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 ) ) ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )* ) ) ;
    public final void rule__MaxPlusMatrixModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:739:1: ( ( ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 ) ) ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )* ) ) )
            // InternalMaxPlusMatrix.g:740:1: ( ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 ) ) ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )* ) )
            {
            // InternalMaxPlusMatrix.g:740:1: ( ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 ) ) ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )* ) )
            // InternalMaxPlusMatrix.g:741:2: ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 ) ) ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )* )
            {
            // InternalMaxPlusMatrix.g:741:2: ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 ) )
            // InternalMaxPlusMatrix.g:742:3: ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getEventsequencesAssignment_6_1()); 
            // InternalMaxPlusMatrix.g:743:3: ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )
            // InternalMaxPlusMatrix.g:743:4: rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1
            {
            pushFollow(FOLLOW_7);
            rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMaxPlusMatrixModelAccess().getEventsequencesAssignment_6_1()); 

            }

            // InternalMaxPlusMatrix.g:746:2: ( ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )* )
            // InternalMaxPlusMatrix.g:747:3: ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )*
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getEventsequencesAssignment_6_1()); 
            // InternalMaxPlusMatrix.g:748:3: ( rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMaxPlusMatrix.g:748:4: rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMaxPlusMatrixModelAccess().getEventsequencesAssignment_6_1()); 

            }


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
    // $ANTLR end "rule__MaxPlusMatrixModel__Group_6__1__Impl"


    // $ANTLR start "rule__MaxPlusMatrix__Group__0"
    // InternalMaxPlusMatrix.g:758:1: rule__MaxPlusMatrix__Group__0 : rule__MaxPlusMatrix__Group__0__Impl rule__MaxPlusMatrix__Group__1 ;
    public final void rule__MaxPlusMatrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:762:1: ( rule__MaxPlusMatrix__Group__0__Impl rule__MaxPlusMatrix__Group__1 )
            // InternalMaxPlusMatrix.g:763:2: rule__MaxPlusMatrix__Group__0__Impl rule__MaxPlusMatrix__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MaxPlusMatrix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group__1();

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__0"


    // $ANTLR start "rule__MaxPlusMatrix__Group__0__Impl"
    // InternalMaxPlusMatrix.g:770:1: rule__MaxPlusMatrix__Group__0__Impl : ( ( rule__MaxPlusMatrix__NameAssignment_0 ) ) ;
    public final void rule__MaxPlusMatrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:774:1: ( ( ( rule__MaxPlusMatrix__NameAssignment_0 ) ) )
            // InternalMaxPlusMatrix.g:775:1: ( ( rule__MaxPlusMatrix__NameAssignment_0 ) )
            {
            // InternalMaxPlusMatrix.g:775:1: ( ( rule__MaxPlusMatrix__NameAssignment_0 ) )
            // InternalMaxPlusMatrix.g:776:2: ( rule__MaxPlusMatrix__NameAssignment_0 )
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getNameAssignment_0()); 
            // InternalMaxPlusMatrix.g:777:2: ( rule__MaxPlusMatrix__NameAssignment_0 )
            // InternalMaxPlusMatrix.g:777:3: rule__MaxPlusMatrix__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMaxPlusMatrixAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__0__Impl"


    // $ANTLR start "rule__MaxPlusMatrix__Group__1"
    // InternalMaxPlusMatrix.g:785:1: rule__MaxPlusMatrix__Group__1 : rule__MaxPlusMatrix__Group__1__Impl rule__MaxPlusMatrix__Group__2 ;
    public final void rule__MaxPlusMatrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:789:1: ( rule__MaxPlusMatrix__Group__1__Impl rule__MaxPlusMatrix__Group__2 )
            // InternalMaxPlusMatrix.g:790:2: rule__MaxPlusMatrix__Group__1__Impl rule__MaxPlusMatrix__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MaxPlusMatrix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group__2();

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__1"


    // $ANTLR start "rule__MaxPlusMatrix__Group__1__Impl"
    // InternalMaxPlusMatrix.g:797:1: rule__MaxPlusMatrix__Group__1__Impl : ( ( rule__MaxPlusMatrix__LabelsAssignment_1 )? ) ;
    public final void rule__MaxPlusMatrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:801:1: ( ( ( rule__MaxPlusMatrix__LabelsAssignment_1 )? ) )
            // InternalMaxPlusMatrix.g:802:1: ( ( rule__MaxPlusMatrix__LabelsAssignment_1 )? )
            {
            // InternalMaxPlusMatrix.g:802:1: ( ( rule__MaxPlusMatrix__LabelsAssignment_1 )? )
            // InternalMaxPlusMatrix.g:803:2: ( rule__MaxPlusMatrix__LabelsAssignment_1 )?
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getLabelsAssignment_1()); 
            // InternalMaxPlusMatrix.g:804:2: ( rule__MaxPlusMatrix__LabelsAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMaxPlusMatrix.g:804:3: rule__MaxPlusMatrix__LabelsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxPlusMatrix__LabelsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxPlusMatrixAccess().getLabelsAssignment_1()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__1__Impl"


    // $ANTLR start "rule__MaxPlusMatrix__Group__2"
    // InternalMaxPlusMatrix.g:812:1: rule__MaxPlusMatrix__Group__2 : rule__MaxPlusMatrix__Group__2__Impl rule__MaxPlusMatrix__Group__3 ;
    public final void rule__MaxPlusMatrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:816:1: ( rule__MaxPlusMatrix__Group__2__Impl rule__MaxPlusMatrix__Group__3 )
            // InternalMaxPlusMatrix.g:817:2: rule__MaxPlusMatrix__Group__2__Impl rule__MaxPlusMatrix__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MaxPlusMatrix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group__3();

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__2"


    // $ANTLR start "rule__MaxPlusMatrix__Group__2__Impl"
    // InternalMaxPlusMatrix.g:824:1: rule__MaxPlusMatrix__Group__2__Impl : ( '=' ) ;
    public final void rule__MaxPlusMatrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:828:1: ( ( '=' ) )
            // InternalMaxPlusMatrix.g:829:1: ( '=' )
            {
            // InternalMaxPlusMatrix.g:829:1: ( '=' )
            // InternalMaxPlusMatrix.g:830:2: '='
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getEqualsSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__2__Impl"


    // $ANTLR start "rule__MaxPlusMatrix__Group__3"
    // InternalMaxPlusMatrix.g:839:1: rule__MaxPlusMatrix__Group__3 : rule__MaxPlusMatrix__Group__3__Impl rule__MaxPlusMatrix__Group__4 ;
    public final void rule__MaxPlusMatrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:843:1: ( rule__MaxPlusMatrix__Group__3__Impl rule__MaxPlusMatrix__Group__4 )
            // InternalMaxPlusMatrix.g:844:2: rule__MaxPlusMatrix__Group__3__Impl rule__MaxPlusMatrix__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__MaxPlusMatrix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group__4();

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__3"


    // $ANTLR start "rule__MaxPlusMatrix__Group__3__Impl"
    // InternalMaxPlusMatrix.g:851:1: rule__MaxPlusMatrix__Group__3__Impl : ( '[' ) ;
    public final void rule__MaxPlusMatrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:855:1: ( ( '[' ) )
            // InternalMaxPlusMatrix.g:856:1: ( '[' )
            {
            // InternalMaxPlusMatrix.g:856:1: ( '[' )
            // InternalMaxPlusMatrix.g:857:2: '['
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getLeftSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__3__Impl"


    // $ANTLR start "rule__MaxPlusMatrix__Group__4"
    // InternalMaxPlusMatrix.g:866:1: rule__MaxPlusMatrix__Group__4 : rule__MaxPlusMatrix__Group__4__Impl rule__MaxPlusMatrix__Group__5 ;
    public final void rule__MaxPlusMatrix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:870:1: ( rule__MaxPlusMatrix__Group__4__Impl rule__MaxPlusMatrix__Group__5 )
            // InternalMaxPlusMatrix.g:871:2: rule__MaxPlusMatrix__Group__4__Impl rule__MaxPlusMatrix__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__MaxPlusMatrix__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group__5();

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__4"


    // $ANTLR start "rule__MaxPlusMatrix__Group__4__Impl"
    // InternalMaxPlusMatrix.g:878:1: rule__MaxPlusMatrix__Group__4__Impl : ( ( rule__MaxPlusMatrix__Group_4__0 )* ) ;
    public final void rule__MaxPlusMatrix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:882:1: ( ( ( rule__MaxPlusMatrix__Group_4__0 )* ) )
            // InternalMaxPlusMatrix.g:883:1: ( ( rule__MaxPlusMatrix__Group_4__0 )* )
            {
            // InternalMaxPlusMatrix.g:883:1: ( ( rule__MaxPlusMatrix__Group_4__0 )* )
            // InternalMaxPlusMatrix.g:884:2: ( rule__MaxPlusMatrix__Group_4__0 )*
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getGroup_4()); 
            // InternalMaxPlusMatrix.g:885:2: ( rule__MaxPlusMatrix__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMaxPlusMatrix.g:885:3: rule__MaxPlusMatrix__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MaxPlusMatrix__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMaxPlusMatrixAccess().getGroup_4()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__4__Impl"


    // $ANTLR start "rule__MaxPlusMatrix__Group__5"
    // InternalMaxPlusMatrix.g:893:1: rule__MaxPlusMatrix__Group__5 : rule__MaxPlusMatrix__Group__5__Impl ;
    public final void rule__MaxPlusMatrix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:897:1: ( rule__MaxPlusMatrix__Group__5__Impl )
            // InternalMaxPlusMatrix.g:898:2: rule__MaxPlusMatrix__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group__5__Impl();

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__5"


    // $ANTLR start "rule__MaxPlusMatrix__Group__5__Impl"
    // InternalMaxPlusMatrix.g:904:1: rule__MaxPlusMatrix__Group__5__Impl : ( ']' ) ;
    public final void rule__MaxPlusMatrix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:908:1: ( ( ']' ) )
            // InternalMaxPlusMatrix.g:909:1: ( ']' )
            {
            // InternalMaxPlusMatrix.g:909:1: ( ']' )
            // InternalMaxPlusMatrix.g:910:2: ']'
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getRightSquareBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__Group__5__Impl"


    // $ANTLR start "rule__MaxPlusMatrix__Group_4__0"
    // InternalMaxPlusMatrix.g:920:1: rule__MaxPlusMatrix__Group_4__0 : rule__MaxPlusMatrix__Group_4__0__Impl rule__MaxPlusMatrix__Group_4__1 ;
    public final void rule__MaxPlusMatrix__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:924:1: ( rule__MaxPlusMatrix__Group_4__0__Impl rule__MaxPlusMatrix__Group_4__1 )
            // InternalMaxPlusMatrix.g:925:2: rule__MaxPlusMatrix__Group_4__0__Impl rule__MaxPlusMatrix__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__MaxPlusMatrix__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group_4__1();

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
    // $ANTLR end "rule__MaxPlusMatrix__Group_4__0"


    // $ANTLR start "rule__MaxPlusMatrix__Group_4__0__Impl"
    // InternalMaxPlusMatrix.g:932:1: rule__MaxPlusMatrix__Group_4__0__Impl : ( ( rule__MaxPlusMatrix__RowsAssignment_4_0 ) ) ;
    public final void rule__MaxPlusMatrix__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:936:1: ( ( ( rule__MaxPlusMatrix__RowsAssignment_4_0 ) ) )
            // InternalMaxPlusMatrix.g:937:1: ( ( rule__MaxPlusMatrix__RowsAssignment_4_0 ) )
            {
            // InternalMaxPlusMatrix.g:937:1: ( ( rule__MaxPlusMatrix__RowsAssignment_4_0 ) )
            // InternalMaxPlusMatrix.g:938:2: ( rule__MaxPlusMatrix__RowsAssignment_4_0 )
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getRowsAssignment_4_0()); 
            // InternalMaxPlusMatrix.g:939:2: ( rule__MaxPlusMatrix__RowsAssignment_4_0 )
            // InternalMaxPlusMatrix.g:939:3: rule__MaxPlusMatrix__RowsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__RowsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMaxPlusMatrixAccess().getRowsAssignment_4_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__Group_4__0__Impl"


    // $ANTLR start "rule__MaxPlusMatrix__Group_4__1"
    // InternalMaxPlusMatrix.g:947:1: rule__MaxPlusMatrix__Group_4__1 : rule__MaxPlusMatrix__Group_4__1__Impl ;
    public final void rule__MaxPlusMatrix__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:951:1: ( rule__MaxPlusMatrix__Group_4__1__Impl )
            // InternalMaxPlusMatrix.g:952:2: rule__MaxPlusMatrix__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxPlusMatrix__Group_4__1__Impl();

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
    // $ANTLR end "rule__MaxPlusMatrix__Group_4__1"


    // $ANTLR start "rule__MaxPlusMatrix__Group_4__1__Impl"
    // InternalMaxPlusMatrix.g:958:1: rule__MaxPlusMatrix__Group_4__1__Impl : ( ( ',' )? ) ;
    public final void rule__MaxPlusMatrix__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:962:1: ( ( ( ',' )? ) )
            // InternalMaxPlusMatrix.g:963:1: ( ( ',' )? )
            {
            // InternalMaxPlusMatrix.g:963:1: ( ( ',' )? )
            // InternalMaxPlusMatrix.g:964:2: ( ',' )?
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getCommaKeyword_4_1()); 
            // InternalMaxPlusMatrix.g:965:2: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMaxPlusMatrix.g:965:3: ','
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMaxPlusMatrixAccess().getCommaKeyword_4_1()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__Group_4__1__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalMaxPlusMatrix.g:974:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:978:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalMaxPlusMatrix.g:979:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

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
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalMaxPlusMatrix.g:986:1: rule__Row__Group__0__Impl : ( '[' ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:990:1: ( ( '[' ) )
            // InternalMaxPlusMatrix.g:991:1: ( '[' )
            {
            // InternalMaxPlusMatrix.g:991:1: ( '[' )
            // InternalMaxPlusMatrix.g:992:2: '['
            {
             before(grammarAccess.getRowAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalMaxPlusMatrix.g:1001:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1005:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalMaxPlusMatrix.g:1006:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

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
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalMaxPlusMatrix.g:1013:1: rule__Row__Group__1__Impl : ( ( rule__Row__Group_1__0 )* ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1017:1: ( ( ( rule__Row__Group_1__0 )* ) )
            // InternalMaxPlusMatrix.g:1018:1: ( ( rule__Row__Group_1__0 )* )
            {
            // InternalMaxPlusMatrix.g:1018:1: ( ( rule__Row__Group_1__0 )* )
            // InternalMaxPlusMatrix.g:1019:2: ( rule__Row__Group_1__0 )*
            {
             before(grammarAccess.getRowAccess().getGroup_1()); 
            // InternalMaxPlusMatrix.g:1020:2: ( rule__Row__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_FLOAT && LA14_0<=RULE_NINT)||LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMaxPlusMatrix.g:1020:3: rule__Row__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Row__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalMaxPlusMatrix.g:1028:1: rule__Row__Group__2 : rule__Row__Group__2__Impl ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1032:1: ( rule__Row__Group__2__Impl )
            // InternalMaxPlusMatrix.g:1033:2: rule__Row__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__2__Impl();

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
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalMaxPlusMatrix.g:1039:1: rule__Row__Group__2__Impl : ( ']' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1043:1: ( ( ']' ) )
            // InternalMaxPlusMatrix.g:1044:1: ( ']' )
            {
            // InternalMaxPlusMatrix.g:1044:1: ( ']' )
            // InternalMaxPlusMatrix.g:1045:2: ']'
            {
             before(grammarAccess.getRowAccess().getRightSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group_1__0"
    // InternalMaxPlusMatrix.g:1055:1: rule__Row__Group_1__0 : rule__Row__Group_1__0__Impl rule__Row__Group_1__1 ;
    public final void rule__Row__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1059:1: ( rule__Row__Group_1__0__Impl rule__Row__Group_1__1 )
            // InternalMaxPlusMatrix.g:1060:2: rule__Row__Group_1__0__Impl rule__Row__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Row__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_1__1();

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
    // $ANTLR end "rule__Row__Group_1__0"


    // $ANTLR start "rule__Row__Group_1__0__Impl"
    // InternalMaxPlusMatrix.g:1067:1: rule__Row__Group_1__0__Impl : ( ( rule__Row__ElementsAssignment_1_0 ) ) ;
    public final void rule__Row__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1071:1: ( ( ( rule__Row__ElementsAssignment_1_0 ) ) )
            // InternalMaxPlusMatrix.g:1072:1: ( ( rule__Row__ElementsAssignment_1_0 ) )
            {
            // InternalMaxPlusMatrix.g:1072:1: ( ( rule__Row__ElementsAssignment_1_0 ) )
            // InternalMaxPlusMatrix.g:1073:2: ( rule__Row__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getRowAccess().getElementsAssignment_1_0()); 
            // InternalMaxPlusMatrix.g:1074:2: ( rule__Row__ElementsAssignment_1_0 )
            // InternalMaxPlusMatrix.g:1074:3: rule__Row__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Row__ElementsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getElementsAssignment_1_0()); 

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
    // $ANTLR end "rule__Row__Group_1__0__Impl"


    // $ANTLR start "rule__Row__Group_1__1"
    // InternalMaxPlusMatrix.g:1082:1: rule__Row__Group_1__1 : rule__Row__Group_1__1__Impl ;
    public final void rule__Row__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1086:1: ( rule__Row__Group_1__1__Impl )
            // InternalMaxPlusMatrix.g:1087:2: rule__Row__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_1__1__Impl();

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
    // $ANTLR end "rule__Row__Group_1__1"


    // $ANTLR start "rule__Row__Group_1__1__Impl"
    // InternalMaxPlusMatrix.g:1093:1: rule__Row__Group_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Row__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1097:1: ( ( ( ',' )? ) )
            // InternalMaxPlusMatrix.g:1098:1: ( ( ',' )? )
            {
            // InternalMaxPlusMatrix.g:1098:1: ( ( ',' )? )
            // InternalMaxPlusMatrix.g:1099:2: ( ',' )?
            {
             before(grammarAccess.getRowAccess().getCommaKeyword_1_1()); 
            // InternalMaxPlusMatrix.g:1100:2: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMaxPlusMatrix.g:1100:3: ','
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRowAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__Row__Group_1__1__Impl"


    // $ANTLR start "rule__VectorSequence__Group__0"
    // InternalMaxPlusMatrix.g:1109:1: rule__VectorSequence__Group__0 : rule__VectorSequence__Group__0__Impl rule__VectorSequence__Group__1 ;
    public final void rule__VectorSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1113:1: ( rule__VectorSequence__Group__0__Impl rule__VectorSequence__Group__1 )
            // InternalMaxPlusMatrix.g:1114:2: rule__VectorSequence__Group__0__Impl rule__VectorSequence__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VectorSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group__1();

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
    // $ANTLR end "rule__VectorSequence__Group__0"


    // $ANTLR start "rule__VectorSequence__Group__0__Impl"
    // InternalMaxPlusMatrix.g:1121:1: rule__VectorSequence__Group__0__Impl : ( ( rule__VectorSequence__NameAssignment_0 ) ) ;
    public final void rule__VectorSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1125:1: ( ( ( rule__VectorSequence__NameAssignment_0 ) ) )
            // InternalMaxPlusMatrix.g:1126:1: ( ( rule__VectorSequence__NameAssignment_0 ) )
            {
            // InternalMaxPlusMatrix.g:1126:1: ( ( rule__VectorSequence__NameAssignment_0 ) )
            // InternalMaxPlusMatrix.g:1127:2: ( rule__VectorSequence__NameAssignment_0 )
            {
             before(grammarAccess.getVectorSequenceAccess().getNameAssignment_0()); 
            // InternalMaxPlusMatrix.g:1128:2: ( rule__VectorSequence__NameAssignment_0 )
            // InternalMaxPlusMatrix.g:1128:3: rule__VectorSequence__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VectorSequence__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVectorSequenceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__VectorSequence__Group__0__Impl"


    // $ANTLR start "rule__VectorSequence__Group__1"
    // InternalMaxPlusMatrix.g:1136:1: rule__VectorSequence__Group__1 : rule__VectorSequence__Group__1__Impl rule__VectorSequence__Group__2 ;
    public final void rule__VectorSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1140:1: ( rule__VectorSequence__Group__1__Impl rule__VectorSequence__Group__2 )
            // InternalMaxPlusMatrix.g:1141:2: rule__VectorSequence__Group__1__Impl rule__VectorSequence__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__VectorSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group__2();

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
    // $ANTLR end "rule__VectorSequence__Group__1"


    // $ANTLR start "rule__VectorSequence__Group__1__Impl"
    // InternalMaxPlusMatrix.g:1148:1: rule__VectorSequence__Group__1__Impl : ( ( rule__VectorSequence__LabelsAssignment_1 )? ) ;
    public final void rule__VectorSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1152:1: ( ( ( rule__VectorSequence__LabelsAssignment_1 )? ) )
            // InternalMaxPlusMatrix.g:1153:1: ( ( rule__VectorSequence__LabelsAssignment_1 )? )
            {
            // InternalMaxPlusMatrix.g:1153:1: ( ( rule__VectorSequence__LabelsAssignment_1 )? )
            // InternalMaxPlusMatrix.g:1154:2: ( rule__VectorSequence__LabelsAssignment_1 )?
            {
             before(grammarAccess.getVectorSequenceAccess().getLabelsAssignment_1()); 
            // InternalMaxPlusMatrix.g:1155:2: ( rule__VectorSequence__LabelsAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMaxPlusMatrix.g:1155:3: rule__VectorSequence__LabelsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VectorSequence__LabelsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVectorSequenceAccess().getLabelsAssignment_1()); 

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
    // $ANTLR end "rule__VectorSequence__Group__1__Impl"


    // $ANTLR start "rule__VectorSequence__Group__2"
    // InternalMaxPlusMatrix.g:1163:1: rule__VectorSequence__Group__2 : rule__VectorSequence__Group__2__Impl rule__VectorSequence__Group__3 ;
    public final void rule__VectorSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1167:1: ( rule__VectorSequence__Group__2__Impl rule__VectorSequence__Group__3 )
            // InternalMaxPlusMatrix.g:1168:2: rule__VectorSequence__Group__2__Impl rule__VectorSequence__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__VectorSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group__3();

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
    // $ANTLR end "rule__VectorSequence__Group__2"


    // $ANTLR start "rule__VectorSequence__Group__2__Impl"
    // InternalMaxPlusMatrix.g:1175:1: rule__VectorSequence__Group__2__Impl : ( '=' ) ;
    public final void rule__VectorSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1179:1: ( ( '=' ) )
            // InternalMaxPlusMatrix.g:1180:1: ( '=' )
            {
            // InternalMaxPlusMatrix.g:1180:1: ( '=' )
            // InternalMaxPlusMatrix.g:1181:2: '='
            {
             before(grammarAccess.getVectorSequenceAccess().getEqualsSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVectorSequenceAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__VectorSequence__Group__2__Impl"


    // $ANTLR start "rule__VectorSequence__Group__3"
    // InternalMaxPlusMatrix.g:1190:1: rule__VectorSequence__Group__3 : rule__VectorSequence__Group__3__Impl rule__VectorSequence__Group__4 ;
    public final void rule__VectorSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1194:1: ( rule__VectorSequence__Group__3__Impl rule__VectorSequence__Group__4 )
            // InternalMaxPlusMatrix.g:1195:2: rule__VectorSequence__Group__3__Impl rule__VectorSequence__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__VectorSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group__4();

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
    // $ANTLR end "rule__VectorSequence__Group__3"


    // $ANTLR start "rule__VectorSequence__Group__3__Impl"
    // InternalMaxPlusMatrix.g:1202:1: rule__VectorSequence__Group__3__Impl : ( '[' ) ;
    public final void rule__VectorSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1206:1: ( ( '[' ) )
            // InternalMaxPlusMatrix.g:1207:1: ( '[' )
            {
            // InternalMaxPlusMatrix.g:1207:1: ( '[' )
            // InternalMaxPlusMatrix.g:1208:2: '['
            {
             before(grammarAccess.getVectorSequenceAccess().getLeftSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVectorSequenceAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__VectorSequence__Group__3__Impl"


    // $ANTLR start "rule__VectorSequence__Group__4"
    // InternalMaxPlusMatrix.g:1217:1: rule__VectorSequence__Group__4 : rule__VectorSequence__Group__4__Impl rule__VectorSequence__Group__5 ;
    public final void rule__VectorSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1221:1: ( rule__VectorSequence__Group__4__Impl rule__VectorSequence__Group__5 )
            // InternalMaxPlusMatrix.g:1222:2: rule__VectorSequence__Group__4__Impl rule__VectorSequence__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__VectorSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group__5();

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
    // $ANTLR end "rule__VectorSequence__Group__4"


    // $ANTLR start "rule__VectorSequence__Group__4__Impl"
    // InternalMaxPlusMatrix.g:1229:1: rule__VectorSequence__Group__4__Impl : ( ( rule__VectorSequence__Group_4__0 )* ) ;
    public final void rule__VectorSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1233:1: ( ( ( rule__VectorSequence__Group_4__0 )* ) )
            // InternalMaxPlusMatrix.g:1234:1: ( ( rule__VectorSequence__Group_4__0 )* )
            {
            // InternalMaxPlusMatrix.g:1234:1: ( ( rule__VectorSequence__Group_4__0 )* )
            // InternalMaxPlusMatrix.g:1235:2: ( rule__VectorSequence__Group_4__0 )*
            {
             before(grammarAccess.getVectorSequenceAccess().getGroup_4()); 
            // InternalMaxPlusMatrix.g:1236:2: ( rule__VectorSequence__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMaxPlusMatrix.g:1236:3: rule__VectorSequence__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__VectorSequence__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getVectorSequenceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__VectorSequence__Group__4__Impl"


    // $ANTLR start "rule__VectorSequence__Group__5"
    // InternalMaxPlusMatrix.g:1244:1: rule__VectorSequence__Group__5 : rule__VectorSequence__Group__5__Impl ;
    public final void rule__VectorSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1248:1: ( rule__VectorSequence__Group__5__Impl )
            // InternalMaxPlusMatrix.g:1249:2: rule__VectorSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group__5__Impl();

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
    // $ANTLR end "rule__VectorSequence__Group__5"


    // $ANTLR start "rule__VectorSequence__Group__5__Impl"
    // InternalMaxPlusMatrix.g:1255:1: rule__VectorSequence__Group__5__Impl : ( ']' ) ;
    public final void rule__VectorSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1259:1: ( ( ']' ) )
            // InternalMaxPlusMatrix.g:1260:1: ( ']' )
            {
            // InternalMaxPlusMatrix.g:1260:1: ( ']' )
            // InternalMaxPlusMatrix.g:1261:2: ']'
            {
             before(grammarAccess.getVectorSequenceAccess().getRightSquareBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVectorSequenceAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__VectorSequence__Group__5__Impl"


    // $ANTLR start "rule__VectorSequence__Group_4__0"
    // InternalMaxPlusMatrix.g:1271:1: rule__VectorSequence__Group_4__0 : rule__VectorSequence__Group_4__0__Impl rule__VectorSequence__Group_4__1 ;
    public final void rule__VectorSequence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1275:1: ( rule__VectorSequence__Group_4__0__Impl rule__VectorSequence__Group_4__1 )
            // InternalMaxPlusMatrix.g:1276:2: rule__VectorSequence__Group_4__0__Impl rule__VectorSequence__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__VectorSequence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group_4__1();

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
    // $ANTLR end "rule__VectorSequence__Group_4__0"


    // $ANTLR start "rule__VectorSequence__Group_4__0__Impl"
    // InternalMaxPlusMatrix.g:1283:1: rule__VectorSequence__Group_4__0__Impl : ( ( rule__VectorSequence__VectorsAssignment_4_0 ) ) ;
    public final void rule__VectorSequence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1287:1: ( ( ( rule__VectorSequence__VectorsAssignment_4_0 ) ) )
            // InternalMaxPlusMatrix.g:1288:1: ( ( rule__VectorSequence__VectorsAssignment_4_0 ) )
            {
            // InternalMaxPlusMatrix.g:1288:1: ( ( rule__VectorSequence__VectorsAssignment_4_0 ) )
            // InternalMaxPlusMatrix.g:1289:2: ( rule__VectorSequence__VectorsAssignment_4_0 )
            {
             before(grammarAccess.getVectorSequenceAccess().getVectorsAssignment_4_0()); 
            // InternalMaxPlusMatrix.g:1290:2: ( rule__VectorSequence__VectorsAssignment_4_0 )
            // InternalMaxPlusMatrix.g:1290:3: rule__VectorSequence__VectorsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__VectorSequence__VectorsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getVectorSequenceAccess().getVectorsAssignment_4_0()); 

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
    // $ANTLR end "rule__VectorSequence__Group_4__0__Impl"


    // $ANTLR start "rule__VectorSequence__Group_4__1"
    // InternalMaxPlusMatrix.g:1298:1: rule__VectorSequence__Group_4__1 : rule__VectorSequence__Group_4__1__Impl ;
    public final void rule__VectorSequence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1302:1: ( rule__VectorSequence__Group_4__1__Impl )
            // InternalMaxPlusMatrix.g:1303:2: rule__VectorSequence__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VectorSequence__Group_4__1__Impl();

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
    // $ANTLR end "rule__VectorSequence__Group_4__1"


    // $ANTLR start "rule__VectorSequence__Group_4__1__Impl"
    // InternalMaxPlusMatrix.g:1309:1: rule__VectorSequence__Group_4__1__Impl : ( ( ',' )? ) ;
    public final void rule__VectorSequence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1313:1: ( ( ( ',' )? ) )
            // InternalMaxPlusMatrix.g:1314:1: ( ( ',' )? )
            {
            // InternalMaxPlusMatrix.g:1314:1: ( ( ',' )? )
            // InternalMaxPlusMatrix.g:1315:2: ( ',' )?
            {
             before(grammarAccess.getVectorSequenceAccess().getCommaKeyword_4_1()); 
            // InternalMaxPlusMatrix.g:1316:2: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMaxPlusMatrix.g:1316:3: ','
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVectorSequenceAccess().getCommaKeyword_4_1()); 

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
    // $ANTLR end "rule__VectorSequence__Group_4__1__Impl"


    // $ANTLR start "rule__EventSequence__Group__0"
    // InternalMaxPlusMatrix.g:1325:1: rule__EventSequence__Group__0 : rule__EventSequence__Group__0__Impl rule__EventSequence__Group__1 ;
    public final void rule__EventSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1329:1: ( rule__EventSequence__Group__0__Impl rule__EventSequence__Group__1 )
            // InternalMaxPlusMatrix.g:1330:2: rule__EventSequence__Group__0__Impl rule__EventSequence__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EventSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSequence__Group__1();

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
    // $ANTLR end "rule__EventSequence__Group__0"


    // $ANTLR start "rule__EventSequence__Group__0__Impl"
    // InternalMaxPlusMatrix.g:1337:1: rule__EventSequence__Group__0__Impl : ( ( rule__EventSequence__NameAssignment_0 ) ) ;
    public final void rule__EventSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1341:1: ( ( ( rule__EventSequence__NameAssignment_0 ) ) )
            // InternalMaxPlusMatrix.g:1342:1: ( ( rule__EventSequence__NameAssignment_0 ) )
            {
            // InternalMaxPlusMatrix.g:1342:1: ( ( rule__EventSequence__NameAssignment_0 ) )
            // InternalMaxPlusMatrix.g:1343:2: ( rule__EventSequence__NameAssignment_0 )
            {
             before(grammarAccess.getEventSequenceAccess().getNameAssignment_0()); 
            // InternalMaxPlusMatrix.g:1344:2: ( rule__EventSequence__NameAssignment_0 )
            // InternalMaxPlusMatrix.g:1344:3: rule__EventSequence__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSequence__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventSequenceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__EventSequence__Group__0__Impl"


    // $ANTLR start "rule__EventSequence__Group__1"
    // InternalMaxPlusMatrix.g:1352:1: rule__EventSequence__Group__1 : rule__EventSequence__Group__1__Impl rule__EventSequence__Group__2 ;
    public final void rule__EventSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1356:1: ( rule__EventSequence__Group__1__Impl rule__EventSequence__Group__2 )
            // InternalMaxPlusMatrix.g:1357:2: rule__EventSequence__Group__1__Impl rule__EventSequence__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EventSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSequence__Group__2();

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
    // $ANTLR end "rule__EventSequence__Group__1"


    // $ANTLR start "rule__EventSequence__Group__1__Impl"
    // InternalMaxPlusMatrix.g:1364:1: rule__EventSequence__Group__1__Impl : ( '=' ) ;
    public final void rule__EventSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1368:1: ( ( '=' ) )
            // InternalMaxPlusMatrix.g:1369:1: ( '=' )
            {
            // InternalMaxPlusMatrix.g:1369:1: ( '=' )
            // InternalMaxPlusMatrix.g:1370:2: '='
            {
             before(grammarAccess.getEventSequenceAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEventSequenceAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__EventSequence__Group__1__Impl"


    // $ANTLR start "rule__EventSequence__Group__2"
    // InternalMaxPlusMatrix.g:1379:1: rule__EventSequence__Group__2 : rule__EventSequence__Group__2__Impl ;
    public final void rule__EventSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1383:1: ( rule__EventSequence__Group__2__Impl )
            // InternalMaxPlusMatrix.g:1384:2: rule__EventSequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSequence__Group__2__Impl();

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
    // $ANTLR end "rule__EventSequence__Group__2"


    // $ANTLR start "rule__EventSequence__Group__2__Impl"
    // InternalMaxPlusMatrix.g:1390:1: rule__EventSequence__Group__2__Impl : ( ( rule__EventSequence__SequenceAssignment_2 ) ) ;
    public final void rule__EventSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1394:1: ( ( ( rule__EventSequence__SequenceAssignment_2 ) ) )
            // InternalMaxPlusMatrix.g:1395:1: ( ( rule__EventSequence__SequenceAssignment_2 ) )
            {
            // InternalMaxPlusMatrix.g:1395:1: ( ( rule__EventSequence__SequenceAssignment_2 ) )
            // InternalMaxPlusMatrix.g:1396:2: ( rule__EventSequence__SequenceAssignment_2 )
            {
             before(grammarAccess.getEventSequenceAccess().getSequenceAssignment_2()); 
            // InternalMaxPlusMatrix.g:1397:2: ( rule__EventSequence__SequenceAssignment_2 )
            // InternalMaxPlusMatrix.g:1397:3: rule__EventSequence__SequenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventSequence__SequenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventSequenceAccess().getSequenceAssignment_2()); 

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
    // $ANTLR end "rule__EventSequence__Group__2__Impl"


    // $ANTLR start "rule__Labels__Group__0"
    // InternalMaxPlusMatrix.g:1406:1: rule__Labels__Group__0 : rule__Labels__Group__0__Impl rule__Labels__Group__1 ;
    public final void rule__Labels__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1410:1: ( rule__Labels__Group__0__Impl rule__Labels__Group__1 )
            // InternalMaxPlusMatrix.g:1411:2: rule__Labels__Group__0__Impl rule__Labels__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Labels__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Labels__Group__1();

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
    // $ANTLR end "rule__Labels__Group__0"


    // $ANTLR start "rule__Labels__Group__0__Impl"
    // InternalMaxPlusMatrix.g:1418:1: rule__Labels__Group__0__Impl : ( '(' ) ;
    public final void rule__Labels__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1422:1: ( ( '(' ) )
            // InternalMaxPlusMatrix.g:1423:1: ( '(' )
            {
            // InternalMaxPlusMatrix.g:1423:1: ( '(' )
            // InternalMaxPlusMatrix.g:1424:2: '('
            {
             before(grammarAccess.getLabelsAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLabelsAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Labels__Group__0__Impl"


    // $ANTLR start "rule__Labels__Group__1"
    // InternalMaxPlusMatrix.g:1433:1: rule__Labels__Group__1 : rule__Labels__Group__1__Impl rule__Labels__Group__2 ;
    public final void rule__Labels__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1437:1: ( rule__Labels__Group__1__Impl rule__Labels__Group__2 )
            // InternalMaxPlusMatrix.g:1438:2: rule__Labels__Group__1__Impl rule__Labels__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Labels__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Labels__Group__2();

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
    // $ANTLR end "rule__Labels__Group__1"


    // $ANTLR start "rule__Labels__Group__1__Impl"
    // InternalMaxPlusMatrix.g:1445:1: rule__Labels__Group__1__Impl : ( ( ( rule__Labels__Group_1__0 ) ) ( ( rule__Labels__Group_1__0 )* ) ) ;
    public final void rule__Labels__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1449:1: ( ( ( ( rule__Labels__Group_1__0 ) ) ( ( rule__Labels__Group_1__0 )* ) ) )
            // InternalMaxPlusMatrix.g:1450:1: ( ( ( rule__Labels__Group_1__0 ) ) ( ( rule__Labels__Group_1__0 )* ) )
            {
            // InternalMaxPlusMatrix.g:1450:1: ( ( ( rule__Labels__Group_1__0 ) ) ( ( rule__Labels__Group_1__0 )* ) )
            // InternalMaxPlusMatrix.g:1451:2: ( ( rule__Labels__Group_1__0 ) ) ( ( rule__Labels__Group_1__0 )* )
            {
            // InternalMaxPlusMatrix.g:1451:2: ( ( rule__Labels__Group_1__0 ) )
            // InternalMaxPlusMatrix.g:1452:3: ( rule__Labels__Group_1__0 )
            {
             before(grammarAccess.getLabelsAccess().getGroup_1()); 
            // InternalMaxPlusMatrix.g:1453:3: ( rule__Labels__Group_1__0 )
            // InternalMaxPlusMatrix.g:1453:4: rule__Labels__Group_1__0
            {
            pushFollow(FOLLOW_7);
            rule__Labels__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelsAccess().getGroup_1()); 

            }

            // InternalMaxPlusMatrix.g:1456:2: ( ( rule__Labels__Group_1__0 )* )
            // InternalMaxPlusMatrix.g:1457:3: ( rule__Labels__Group_1__0 )*
            {
             before(grammarAccess.getLabelsAccess().getGroup_1()); 
            // InternalMaxPlusMatrix.g:1458:3: ( rule__Labels__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMaxPlusMatrix.g:1458:4: rule__Labels__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Labels__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getLabelsAccess().getGroup_1()); 

            }


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
    // $ANTLR end "rule__Labels__Group__1__Impl"


    // $ANTLR start "rule__Labels__Group__2"
    // InternalMaxPlusMatrix.g:1467:1: rule__Labels__Group__2 : rule__Labels__Group__2__Impl ;
    public final void rule__Labels__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1471:1: ( rule__Labels__Group__2__Impl )
            // InternalMaxPlusMatrix.g:1472:2: rule__Labels__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Labels__Group__2__Impl();

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
    // $ANTLR end "rule__Labels__Group__2"


    // $ANTLR start "rule__Labels__Group__2__Impl"
    // InternalMaxPlusMatrix.g:1478:1: rule__Labels__Group__2__Impl : ( ')' ) ;
    public final void rule__Labels__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1482:1: ( ( ')' ) )
            // InternalMaxPlusMatrix.g:1483:1: ( ')' )
            {
            // InternalMaxPlusMatrix.g:1483:1: ( ')' )
            // InternalMaxPlusMatrix.g:1484:2: ')'
            {
             before(grammarAccess.getLabelsAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLabelsAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Labels__Group__2__Impl"


    // $ANTLR start "rule__Labels__Group_1__0"
    // InternalMaxPlusMatrix.g:1494:1: rule__Labels__Group_1__0 : rule__Labels__Group_1__0__Impl rule__Labels__Group_1__1 ;
    public final void rule__Labels__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1498:1: ( rule__Labels__Group_1__0__Impl rule__Labels__Group_1__1 )
            // InternalMaxPlusMatrix.g:1499:2: rule__Labels__Group_1__0__Impl rule__Labels__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Labels__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Labels__Group_1__1();

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
    // $ANTLR end "rule__Labels__Group_1__0"


    // $ANTLR start "rule__Labels__Group_1__0__Impl"
    // InternalMaxPlusMatrix.g:1506:1: rule__Labels__Group_1__0__Impl : ( ( rule__Labels__LabelAssignment_1_0 ) ) ;
    public final void rule__Labels__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1510:1: ( ( ( rule__Labels__LabelAssignment_1_0 ) ) )
            // InternalMaxPlusMatrix.g:1511:1: ( ( rule__Labels__LabelAssignment_1_0 ) )
            {
            // InternalMaxPlusMatrix.g:1511:1: ( ( rule__Labels__LabelAssignment_1_0 ) )
            // InternalMaxPlusMatrix.g:1512:2: ( rule__Labels__LabelAssignment_1_0 )
            {
             before(grammarAccess.getLabelsAccess().getLabelAssignment_1_0()); 
            // InternalMaxPlusMatrix.g:1513:2: ( rule__Labels__LabelAssignment_1_0 )
            // InternalMaxPlusMatrix.g:1513:3: rule__Labels__LabelAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Labels__LabelAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelsAccess().getLabelAssignment_1_0()); 

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
    // $ANTLR end "rule__Labels__Group_1__0__Impl"


    // $ANTLR start "rule__Labels__Group_1__1"
    // InternalMaxPlusMatrix.g:1521:1: rule__Labels__Group_1__1 : rule__Labels__Group_1__1__Impl ;
    public final void rule__Labels__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1525:1: ( rule__Labels__Group_1__1__Impl )
            // InternalMaxPlusMatrix.g:1526:2: rule__Labels__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Labels__Group_1__1__Impl();

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
    // $ANTLR end "rule__Labels__Group_1__1"


    // $ANTLR start "rule__Labels__Group_1__1__Impl"
    // InternalMaxPlusMatrix.g:1532:1: rule__Labels__Group_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Labels__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1536:1: ( ( ( ',' )? ) )
            // InternalMaxPlusMatrix.g:1537:1: ( ( ',' )? )
            {
            // InternalMaxPlusMatrix.g:1537:1: ( ( ',' )? )
            // InternalMaxPlusMatrix.g:1538:2: ( ',' )?
            {
             before(grammarAccess.getLabelsAccess().getCommaKeyword_1_1()); 
            // InternalMaxPlusMatrix.g:1539:2: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMaxPlusMatrix.g:1539:3: ','
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLabelsAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__Labels__Group_1__1__Impl"


    // $ANTLR start "rule__Ratio__Group__0"
    // InternalMaxPlusMatrix.g:1548:1: rule__Ratio__Group__0 : rule__Ratio__Group__0__Impl rule__Ratio__Group__1 ;
    public final void rule__Ratio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1552:1: ( rule__Ratio__Group__0__Impl rule__Ratio__Group__1 )
            // InternalMaxPlusMatrix.g:1553:2: rule__Ratio__Group__0__Impl rule__Ratio__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Ratio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ratio__Group__1();

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
    // $ANTLR end "rule__Ratio__Group__0"


    // $ANTLR start "rule__Ratio__Group__0__Impl"
    // InternalMaxPlusMatrix.g:1560:1: rule__Ratio__Group__0__Impl : ( ( rule__Ratio__NumeratorAssignment_0 ) ) ;
    public final void rule__Ratio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1564:1: ( ( ( rule__Ratio__NumeratorAssignment_0 ) ) )
            // InternalMaxPlusMatrix.g:1565:1: ( ( rule__Ratio__NumeratorAssignment_0 ) )
            {
            // InternalMaxPlusMatrix.g:1565:1: ( ( rule__Ratio__NumeratorAssignment_0 ) )
            // InternalMaxPlusMatrix.g:1566:2: ( rule__Ratio__NumeratorAssignment_0 )
            {
             before(grammarAccess.getRatioAccess().getNumeratorAssignment_0()); 
            // InternalMaxPlusMatrix.g:1567:2: ( rule__Ratio__NumeratorAssignment_0 )
            // InternalMaxPlusMatrix.g:1567:3: rule__Ratio__NumeratorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ratio__NumeratorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRatioAccess().getNumeratorAssignment_0()); 

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
    // $ANTLR end "rule__Ratio__Group__0__Impl"


    // $ANTLR start "rule__Ratio__Group__1"
    // InternalMaxPlusMatrix.g:1575:1: rule__Ratio__Group__1 : rule__Ratio__Group__1__Impl rule__Ratio__Group__2 ;
    public final void rule__Ratio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1579:1: ( rule__Ratio__Group__1__Impl rule__Ratio__Group__2 )
            // InternalMaxPlusMatrix.g:1580:2: rule__Ratio__Group__1__Impl rule__Ratio__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Ratio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ratio__Group__2();

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
    // $ANTLR end "rule__Ratio__Group__1"


    // $ANTLR start "rule__Ratio__Group__1__Impl"
    // InternalMaxPlusMatrix.g:1587:1: rule__Ratio__Group__1__Impl : ( '/' ) ;
    public final void rule__Ratio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1591:1: ( ( '/' ) )
            // InternalMaxPlusMatrix.g:1592:1: ( '/' )
            {
            // InternalMaxPlusMatrix.g:1592:1: ( '/' )
            // InternalMaxPlusMatrix.g:1593:2: '/'
            {
             before(grammarAccess.getRatioAccess().getSolidusKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRatioAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__Ratio__Group__1__Impl"


    // $ANTLR start "rule__Ratio__Group__2"
    // InternalMaxPlusMatrix.g:1602:1: rule__Ratio__Group__2 : rule__Ratio__Group__2__Impl ;
    public final void rule__Ratio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1606:1: ( rule__Ratio__Group__2__Impl )
            // InternalMaxPlusMatrix.g:1607:2: rule__Ratio__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ratio__Group__2__Impl();

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
    // $ANTLR end "rule__Ratio__Group__2"


    // $ANTLR start "rule__Ratio__Group__2__Impl"
    // InternalMaxPlusMatrix.g:1613:1: rule__Ratio__Group__2__Impl : ( ( rule__Ratio__DenominatorAssignment_2 ) ) ;
    public final void rule__Ratio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1617:1: ( ( ( rule__Ratio__DenominatorAssignment_2 ) ) )
            // InternalMaxPlusMatrix.g:1618:1: ( ( rule__Ratio__DenominatorAssignment_2 ) )
            {
            // InternalMaxPlusMatrix.g:1618:1: ( ( rule__Ratio__DenominatorAssignment_2 ) )
            // InternalMaxPlusMatrix.g:1619:2: ( rule__Ratio__DenominatorAssignment_2 )
            {
             before(grammarAccess.getRatioAccess().getDenominatorAssignment_2()); 
            // InternalMaxPlusMatrix.g:1620:2: ( rule__Ratio__DenominatorAssignment_2 )
            // InternalMaxPlusMatrix.g:1620:3: rule__Ratio__DenominatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ratio__DenominatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRatioAccess().getDenominatorAssignment_2()); 

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
    // $ANTLR end "rule__Ratio__Group__2__Impl"


    // $ANTLR start "rule__MaxPlusMatrixModel__NameAssignment_2"
    // InternalMaxPlusMatrix.g:1629:1: rule__MaxPlusMatrixModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MaxPlusMatrixModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1633:1: ( ( RULE_ID ) )
            // InternalMaxPlusMatrix.g:1634:2: ( RULE_ID )
            {
            // InternalMaxPlusMatrix.g:1634:2: ( RULE_ID )
            // InternalMaxPlusMatrix.g:1635:3: RULE_ID
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixModelAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__NameAssignment_2"


    // $ANTLR start "rule__MaxPlusMatrixModel__MatricesAssignment_4_1"
    // InternalMaxPlusMatrix.g:1644:1: rule__MaxPlusMatrixModel__MatricesAssignment_4_1 : ( ruleMaxPlusMatrix ) ;
    public final void rule__MaxPlusMatrixModel__MatricesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1648:1: ( ( ruleMaxPlusMatrix ) )
            // InternalMaxPlusMatrix.g:1649:2: ( ruleMaxPlusMatrix )
            {
            // InternalMaxPlusMatrix.g:1649:2: ( ruleMaxPlusMatrix )
            // InternalMaxPlusMatrix.g:1650:3: ruleMaxPlusMatrix
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getMatricesMaxPlusMatrixParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaxPlusMatrix();

            state._fsp--;

             after(grammarAccess.getMaxPlusMatrixModelAccess().getMatricesMaxPlusMatrixParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__MatricesAssignment_4_1"


    // $ANTLR start "rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1"
    // InternalMaxPlusMatrix.g:1659:1: rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1 : ( ruleVectorSequence ) ;
    public final void rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1663:1: ( ( ruleVectorSequence ) )
            // InternalMaxPlusMatrix.g:1664:2: ( ruleVectorSequence )
            {
            // InternalMaxPlusMatrix.g:1664:2: ( ruleVectorSequence )
            // InternalMaxPlusMatrix.g:1665:3: ruleVectorSequence
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getVectorsequencesVectorSequenceParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVectorSequence();

            state._fsp--;

             after(grammarAccess.getMaxPlusMatrixModelAccess().getVectorsequencesVectorSequenceParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__VectorsequencesAssignment_5_1"


    // $ANTLR start "rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1"
    // InternalMaxPlusMatrix.g:1674:1: rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1 : ( ruleEventSequence ) ;
    public final void rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1678:1: ( ( ruleEventSequence ) )
            // InternalMaxPlusMatrix.g:1679:2: ( ruleEventSequence )
            {
            // InternalMaxPlusMatrix.g:1679:2: ( ruleEventSequence )
            // InternalMaxPlusMatrix.g:1680:3: ruleEventSequence
            {
             before(grammarAccess.getMaxPlusMatrixModelAccess().getEventsequencesEventSequenceParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventSequence();

            state._fsp--;

             after(grammarAccess.getMaxPlusMatrixModelAccess().getEventsequencesEventSequenceParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrixModel__EventsequencesAssignment_6_1"


    // $ANTLR start "rule__MaxPlusMatrix__NameAssignment_0"
    // InternalMaxPlusMatrix.g:1689:1: rule__MaxPlusMatrix__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MaxPlusMatrix__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1693:1: ( ( RULE_ID ) )
            // InternalMaxPlusMatrix.g:1694:2: ( RULE_ID )
            {
            // InternalMaxPlusMatrix.g:1694:2: ( RULE_ID )
            // InternalMaxPlusMatrix.g:1695:3: RULE_ID
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMaxPlusMatrixAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__NameAssignment_0"


    // $ANTLR start "rule__MaxPlusMatrix__LabelsAssignment_1"
    // InternalMaxPlusMatrix.g:1704:1: rule__MaxPlusMatrix__LabelsAssignment_1 : ( ruleLabels ) ;
    public final void rule__MaxPlusMatrix__LabelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1708:1: ( ( ruleLabels ) )
            // InternalMaxPlusMatrix.g:1709:2: ( ruleLabels )
            {
            // InternalMaxPlusMatrix.g:1709:2: ( ruleLabels )
            // InternalMaxPlusMatrix.g:1710:3: ruleLabels
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getLabelsLabelsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabels();

            state._fsp--;

             after(grammarAccess.getMaxPlusMatrixAccess().getLabelsLabelsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__LabelsAssignment_1"


    // $ANTLR start "rule__MaxPlusMatrix__RowsAssignment_4_0"
    // InternalMaxPlusMatrix.g:1719:1: rule__MaxPlusMatrix__RowsAssignment_4_0 : ( ruleRow ) ;
    public final void rule__MaxPlusMatrix__RowsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1723:1: ( ( ruleRow ) )
            // InternalMaxPlusMatrix.g:1724:2: ( ruleRow )
            {
            // InternalMaxPlusMatrix.g:1724:2: ( ruleRow )
            // InternalMaxPlusMatrix.g:1725:3: ruleRow
            {
             before(grammarAccess.getMaxPlusMatrixAccess().getRowsRowParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getMaxPlusMatrixAccess().getRowsRowParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__MaxPlusMatrix__RowsAssignment_4_0"


    // $ANTLR start "rule__Row__ElementsAssignment_1_0"
    // InternalMaxPlusMatrix.g:1734:1: rule__Row__ElementsAssignment_1_0 : ( ruleElement ) ;
    public final void rule__Row__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1738:1: ( ( ruleElement ) )
            // InternalMaxPlusMatrix.g:1739:2: ( ruleElement )
            {
            // InternalMaxPlusMatrix.g:1739:2: ( ruleElement )
            // InternalMaxPlusMatrix.g:1740:3: ruleElement
            {
             before(grammarAccess.getRowAccess().getElementsElementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getRowAccess().getElementsElementParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Row__ElementsAssignment_1_0"


    // $ANTLR start "rule__VectorSequence__NameAssignment_0"
    // InternalMaxPlusMatrix.g:1749:1: rule__VectorSequence__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VectorSequence__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1753:1: ( ( RULE_ID ) )
            // InternalMaxPlusMatrix.g:1754:2: ( RULE_ID )
            {
            // InternalMaxPlusMatrix.g:1754:2: ( RULE_ID )
            // InternalMaxPlusMatrix.g:1755:3: RULE_ID
            {
             before(grammarAccess.getVectorSequenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVectorSequenceAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VectorSequence__NameAssignment_0"


    // $ANTLR start "rule__VectorSequence__LabelsAssignment_1"
    // InternalMaxPlusMatrix.g:1764:1: rule__VectorSequence__LabelsAssignment_1 : ( ruleLabels ) ;
    public final void rule__VectorSequence__LabelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1768:1: ( ( ruleLabels ) )
            // InternalMaxPlusMatrix.g:1769:2: ( ruleLabels )
            {
            // InternalMaxPlusMatrix.g:1769:2: ( ruleLabels )
            // InternalMaxPlusMatrix.g:1770:3: ruleLabels
            {
             before(grammarAccess.getVectorSequenceAccess().getLabelsLabelsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabels();

            state._fsp--;

             after(grammarAccess.getVectorSequenceAccess().getLabelsLabelsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VectorSequence__LabelsAssignment_1"


    // $ANTLR start "rule__VectorSequence__VectorsAssignment_4_0"
    // InternalMaxPlusMatrix.g:1779:1: rule__VectorSequence__VectorsAssignment_4_0 : ( ruleRow ) ;
    public final void rule__VectorSequence__VectorsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1783:1: ( ( ruleRow ) )
            // InternalMaxPlusMatrix.g:1784:2: ( ruleRow )
            {
            // InternalMaxPlusMatrix.g:1784:2: ( ruleRow )
            // InternalMaxPlusMatrix.g:1785:3: ruleRow
            {
             before(grammarAccess.getVectorSequenceAccess().getVectorsRowParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getVectorSequenceAccess().getVectorsRowParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__VectorSequence__VectorsAssignment_4_0"


    // $ANTLR start "rule__EventSequence__NameAssignment_0"
    // InternalMaxPlusMatrix.g:1794:1: rule__EventSequence__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EventSequence__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1798:1: ( ( RULE_ID ) )
            // InternalMaxPlusMatrix.g:1799:2: ( RULE_ID )
            {
            // InternalMaxPlusMatrix.g:1799:2: ( RULE_ID )
            // InternalMaxPlusMatrix.g:1800:3: RULE_ID
            {
             before(grammarAccess.getEventSequenceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventSequenceAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__EventSequence__NameAssignment_0"


    // $ANTLR start "rule__EventSequence__SequenceAssignment_2"
    // InternalMaxPlusMatrix.g:1809:1: rule__EventSequence__SequenceAssignment_2 : ( ruleRow ) ;
    public final void rule__EventSequence__SequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1813:1: ( ( ruleRow ) )
            // InternalMaxPlusMatrix.g:1814:2: ( ruleRow )
            {
            // InternalMaxPlusMatrix.g:1814:2: ( ruleRow )
            // InternalMaxPlusMatrix.g:1815:3: ruleRow
            {
             before(grammarAccess.getEventSequenceAccess().getSequenceRowParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getEventSequenceAccess().getSequenceRowParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EventSequence__SequenceAssignment_2"


    // $ANTLR start "rule__Labels__LabelAssignment_1_0"
    // InternalMaxPlusMatrix.g:1824:1: rule__Labels__LabelAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Labels__LabelAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1828:1: ( ( RULE_ID ) )
            // InternalMaxPlusMatrix.g:1829:2: ( RULE_ID )
            {
            // InternalMaxPlusMatrix.g:1829:2: ( RULE_ID )
            // InternalMaxPlusMatrix.g:1830:3: RULE_ID
            {
             before(grammarAccess.getLabelsAccess().getLabelIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLabelsAccess().getLabelIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Labels__LabelAssignment_1_0"


    // $ANTLR start "rule__Element__NumAssignment_0"
    // InternalMaxPlusMatrix.g:1839:1: rule__Element__NumAssignment_0 : ( ruleNumber ) ;
    public final void rule__Element__NumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1843:1: ( ( ruleNumber ) )
            // InternalMaxPlusMatrix.g:1844:2: ( ruleNumber )
            {
            // InternalMaxPlusMatrix.g:1844:2: ( ruleNumber )
            // InternalMaxPlusMatrix.g:1845:3: ruleNumber
            {
             before(grammarAccess.getElementAccess().getNumNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getElementAccess().getNumNumberParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Element__NumAssignment_0"


    // $ANTLR start "rule__Element__InfAssignment_1"
    // InternalMaxPlusMatrix.g:1854:1: rule__Element__InfAssignment_1 : ( ( '-inf' ) ) ;
    public final void rule__Element__InfAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1858:1: ( ( ( '-inf' ) ) )
            // InternalMaxPlusMatrix.g:1859:2: ( ( '-inf' ) )
            {
            // InternalMaxPlusMatrix.g:1859:2: ( ( '-inf' ) )
            // InternalMaxPlusMatrix.g:1860:3: ( '-inf' )
            {
             before(grammarAccess.getElementAccess().getInfInfKeyword_1_0()); 
            // InternalMaxPlusMatrix.g:1861:3: ( '-inf' )
            // InternalMaxPlusMatrix.g:1862:4: '-inf'
            {
             before(grammarAccess.getElementAccess().getInfInfKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getInfInfKeyword_1_0()); 

            }

             after(grammarAccess.getElementAccess().getInfInfKeyword_1_0()); 

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
    // $ANTLR end "rule__Element__InfAssignment_1"


    // $ANTLR start "rule__Number__RatioAssignment_0"
    // InternalMaxPlusMatrix.g:1873:1: rule__Number__RatioAssignment_0 : ( ruleRatio ) ;
    public final void rule__Number__RatioAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1877:1: ( ( ruleRatio ) )
            // InternalMaxPlusMatrix.g:1878:2: ( ruleRatio )
            {
            // InternalMaxPlusMatrix.g:1878:2: ( ruleRatio )
            // InternalMaxPlusMatrix.g:1879:3: ruleRatio
            {
             before(grammarAccess.getNumberAccess().getRatioRatioParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRatio();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getRatioRatioParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Number__RatioAssignment_0"


    // $ANTLR start "rule__Number__ValueAssignment_1"
    // InternalMaxPlusMatrix.g:1888:1: rule__Number__ValueAssignment_1 : ( ( rule__Number__ValueAlternatives_1_0 ) ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1892:1: ( ( ( rule__Number__ValueAlternatives_1_0 ) ) )
            // InternalMaxPlusMatrix.g:1893:2: ( ( rule__Number__ValueAlternatives_1_0 ) )
            {
            // InternalMaxPlusMatrix.g:1893:2: ( ( rule__Number__ValueAlternatives_1_0 ) )
            // InternalMaxPlusMatrix.g:1894:3: ( rule__Number__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getNumberAccess().getValueAlternatives_1_0()); 
            // InternalMaxPlusMatrix.g:1895:3: ( rule__Number__ValueAlternatives_1_0 )
            // InternalMaxPlusMatrix.g:1895:4: rule__Number__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAlternatives_1_0()); 

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
    // $ANTLR end "rule__Number__ValueAssignment_1"


    // $ANTLR start "rule__Ratio__NumeratorAssignment_0"
    // InternalMaxPlusMatrix.g:1903:1: rule__Ratio__NumeratorAssignment_0 : ( rulePNInt ) ;
    public final void rule__Ratio__NumeratorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1907:1: ( ( rulePNInt ) )
            // InternalMaxPlusMatrix.g:1908:2: ( rulePNInt )
            {
            // InternalMaxPlusMatrix.g:1908:2: ( rulePNInt )
            // InternalMaxPlusMatrix.g:1909:3: rulePNInt
            {
             before(grammarAccess.getRatioAccess().getNumeratorPNIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePNInt();

            state._fsp--;

             after(grammarAccess.getRatioAccess().getNumeratorPNIntParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Ratio__NumeratorAssignment_0"


    // $ANTLR start "rule__Ratio__DenominatorAssignment_2"
    // InternalMaxPlusMatrix.g:1918:1: rule__Ratio__DenominatorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Ratio__DenominatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMaxPlusMatrix.g:1922:1: ( ( RULE_INT ) )
            // InternalMaxPlusMatrix.g:1923:2: ( RULE_INT )
            {
            // InternalMaxPlusMatrix.g:1923:2: ( RULE_INT )
            // InternalMaxPlusMatrix.g:1924:3: RULE_INT
            {
             before(grammarAccess.getRatioAccess().getDenominatorINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRatioAccess().getDenominatorINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Ratio__DenominatorAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004200070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000072L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});

}