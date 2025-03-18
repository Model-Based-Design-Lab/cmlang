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
import info.computationalmodeling.lang.services.MarkovChainsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkovChainsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_NEGINT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'p'", "'reward'", "'r'", "'markov'", "'chain'", "'{'", "'}'", "'author'", "'='", "'-'", "'->'", "';'", "'probability'", "':'", "'['", "']'", "'initial'", "'/'"
    };
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
    public static final int T__30=30;
    public static final int RULE_NEGINT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_FLOAT=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMarkovChainsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarkovChainsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarkovChainsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMarkovChains.g"; }


    	private MarkovChainsGrammarAccess grammarAccess;

    	public void setGrammarAccess(MarkovChainsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMarkovChainModel"
    // InternalMarkovChains.g:53:1: entryRuleMarkovChainModel : ruleMarkovChainModel EOF ;
    public final void entryRuleMarkovChainModel() throws RecognitionException {
        try {
            // InternalMarkovChains.g:54:1: ( ruleMarkovChainModel EOF )
            // InternalMarkovChains.g:55:1: ruleMarkovChainModel EOF
            {
             before(grammarAccess.getMarkovChainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkovChainModel();

            state._fsp--;

             after(grammarAccess.getMarkovChainModelRule()); 
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
    // $ANTLR end "entryRuleMarkovChainModel"


    // $ANTLR start "ruleMarkovChainModel"
    // InternalMarkovChains.g:62:1: ruleMarkovChainModel : ( ( rule__MarkovChainModel__Group__0 ) ) ;
    public final void ruleMarkovChainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:66:2: ( ( ( rule__MarkovChainModel__Group__0 ) ) )
            // InternalMarkovChains.g:67:2: ( ( rule__MarkovChainModel__Group__0 ) )
            {
            // InternalMarkovChains.g:67:2: ( ( rule__MarkovChainModel__Group__0 ) )
            // InternalMarkovChains.g:68:3: ( rule__MarkovChainModel__Group__0 )
            {
             before(grammarAccess.getMarkovChainModelAccess().getGroup()); 
            // InternalMarkovChains.g:69:3: ( rule__MarkovChainModel__Group__0 )
            // InternalMarkovChains.g:69:4: rule__MarkovChainModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkovChainModelAccess().getGroup()); 

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
    // $ANTLR end "ruleMarkovChainModel"


    // $ANTLR start "entryRuleEdge"
    // InternalMarkovChains.g:78:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalMarkovChains.g:79:1: ( ruleEdge EOF )
            // InternalMarkovChains.g:80:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalMarkovChains.g:87:1: ruleEdge : ( ( rule__Edge__Alternatives ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:91:2: ( ( ( rule__Edge__Alternatives ) ) )
            // InternalMarkovChains.g:92:2: ( ( rule__Edge__Alternatives ) )
            {
            // InternalMarkovChains.g:92:2: ( ( rule__Edge__Alternatives ) )
            // InternalMarkovChains.g:93:3: ( rule__Edge__Alternatives )
            {
             before(grammarAccess.getEdgeAccess().getAlternatives()); 
            // InternalMarkovChains.g:94:3: ( rule__Edge__Alternatives )
            // InternalMarkovChains.g:94:4: rule__Edge__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleEdgeSpecs"
    // InternalMarkovChains.g:103:1: entryRuleEdgeSpecs : ruleEdgeSpecs EOF ;
    public final void entryRuleEdgeSpecs() throws RecognitionException {
        try {
            // InternalMarkovChains.g:104:1: ( ruleEdgeSpecs EOF )
            // InternalMarkovChains.g:105:1: ruleEdgeSpecs EOF
            {
             before(grammarAccess.getEdgeSpecsRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeSpecs();

            state._fsp--;

             after(grammarAccess.getEdgeSpecsRule()); 
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
    // $ANTLR end "entryRuleEdgeSpecs"


    // $ANTLR start "ruleEdgeSpecs"
    // InternalMarkovChains.g:112:1: ruleEdgeSpecs : ( ( rule__EdgeSpecs__Group__0 ) ) ;
    public final void ruleEdgeSpecs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:116:2: ( ( ( rule__EdgeSpecs__Group__0 ) ) )
            // InternalMarkovChains.g:117:2: ( ( rule__EdgeSpecs__Group__0 ) )
            {
            // InternalMarkovChains.g:117:2: ( ( rule__EdgeSpecs__Group__0 ) )
            // InternalMarkovChains.g:118:3: ( rule__EdgeSpecs__Group__0 )
            {
             before(grammarAccess.getEdgeSpecsAccess().getGroup()); 
            // InternalMarkovChains.g:119:3: ( rule__EdgeSpecs__Group__0 )
            // InternalMarkovChains.g:119:4: rule__EdgeSpecs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeSpecs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeSpecsAccess().getGroup()); 

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
    // $ANTLR end "ruleEdgeSpecs"


    // $ANTLR start "entryRuleEdgeAnnotation"
    // InternalMarkovChains.g:128:1: entryRuleEdgeAnnotation : ruleEdgeAnnotation EOF ;
    public final void entryRuleEdgeAnnotation() throws RecognitionException {
        try {
            // InternalMarkovChains.g:129:1: ( ruleEdgeAnnotation EOF )
            // InternalMarkovChains.g:130:1: ruleEdgeAnnotation EOF
            {
             before(grammarAccess.getEdgeAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeAnnotation();

            state._fsp--;

             after(grammarAccess.getEdgeAnnotationRule()); 
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
    // $ANTLR end "entryRuleEdgeAnnotation"


    // $ANTLR start "ruleEdgeAnnotation"
    // InternalMarkovChains.g:137:1: ruleEdgeAnnotation : ( ( rule__EdgeAnnotation__Alternatives ) ) ;
    public final void ruleEdgeAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:141:2: ( ( ( rule__EdgeAnnotation__Alternatives ) ) )
            // InternalMarkovChains.g:142:2: ( ( rule__EdgeAnnotation__Alternatives ) )
            {
            // InternalMarkovChains.g:142:2: ( ( rule__EdgeAnnotation__Alternatives ) )
            // InternalMarkovChains.g:143:3: ( rule__EdgeAnnotation__Alternatives )
            {
             before(grammarAccess.getEdgeAnnotationAccess().getAlternatives()); 
            // InternalMarkovChains.g:144:3: ( rule__EdgeAnnotation__Alternatives )
            // InternalMarkovChains.g:144:4: rule__EdgeAnnotation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAnnotationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEdgeAnnotation"


    // $ANTLR start "entryRuleState"
    // InternalMarkovChains.g:153:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMarkovChains.g:154:1: ( ruleState EOF )
            // InternalMarkovChains.g:155:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMarkovChains.g:162:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:166:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMarkovChains.g:167:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMarkovChains.g:167:2: ( ( rule__State__Group__0 ) )
            // InternalMarkovChains.g:168:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalMarkovChains.g:169:3: ( rule__State__Group__0 )
            // InternalMarkovChains.g:169:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateSpecs"
    // InternalMarkovChains.g:178:1: entryRuleStateSpecs : ruleStateSpecs EOF ;
    public final void entryRuleStateSpecs() throws RecognitionException {
        try {
            // InternalMarkovChains.g:179:1: ( ruleStateSpecs EOF )
            // InternalMarkovChains.g:180:1: ruleStateSpecs EOF
            {
             before(grammarAccess.getStateSpecsRule()); 
            pushFollow(FOLLOW_1);
            ruleStateSpecs();

            state._fsp--;

             after(grammarAccess.getStateSpecsRule()); 
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
    // $ANTLR end "entryRuleStateSpecs"


    // $ANTLR start "ruleStateSpecs"
    // InternalMarkovChains.g:187:1: ruleStateSpecs : ( ( rule__StateSpecs__Group__0 ) ) ;
    public final void ruleStateSpecs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:191:2: ( ( ( rule__StateSpecs__Group__0 ) ) )
            // InternalMarkovChains.g:192:2: ( ( rule__StateSpecs__Group__0 ) )
            {
            // InternalMarkovChains.g:192:2: ( ( rule__StateSpecs__Group__0 ) )
            // InternalMarkovChains.g:193:3: ( rule__StateSpecs__Group__0 )
            {
             before(grammarAccess.getStateSpecsAccess().getGroup()); 
            // InternalMarkovChains.g:194:3: ( rule__StateSpecs__Group__0 )
            // InternalMarkovChains.g:194:4: rule__StateSpecs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateSpecs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateSpecsAccess().getGroup()); 

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
    // $ANTLR end "ruleStateSpecs"


    // $ANTLR start "entryRuleStateAnnotation"
    // InternalMarkovChains.g:203:1: entryRuleStateAnnotation : ruleStateAnnotation EOF ;
    public final void entryRuleStateAnnotation() throws RecognitionException {
        try {
            // InternalMarkovChains.g:204:1: ( ruleStateAnnotation EOF )
            // InternalMarkovChains.g:205:1: ruleStateAnnotation EOF
            {
             before(grammarAccess.getStateAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleStateAnnotation();

            state._fsp--;

             after(grammarAccess.getStateAnnotationRule()); 
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
    // $ANTLR end "entryRuleStateAnnotation"


    // $ANTLR start "ruleStateAnnotation"
    // InternalMarkovChains.g:212:1: ruleStateAnnotation : ( ( rule__StateAnnotation__Alternatives ) ) ;
    public final void ruleStateAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:216:2: ( ( ( rule__StateAnnotation__Alternatives ) ) )
            // InternalMarkovChains.g:217:2: ( ( rule__StateAnnotation__Alternatives ) )
            {
            // InternalMarkovChains.g:217:2: ( ( rule__StateAnnotation__Alternatives ) )
            // InternalMarkovChains.g:218:3: ( rule__StateAnnotation__Alternatives )
            {
             before(grammarAccess.getStateAnnotationAccess().getAlternatives()); 
            // InternalMarkovChains.g:219:3: ( rule__StateAnnotation__Alternatives )
            // InternalMarkovChains.g:219:4: rule__StateAnnotation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAnnotationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStateAnnotation"


    // $ANTLR start "entryRuleProbability"
    // InternalMarkovChains.g:228:1: entryRuleProbability : ruleProbability EOF ;
    public final void entryRuleProbability() throws RecognitionException {
        try {
            // InternalMarkovChains.g:229:1: ( ruleProbability EOF )
            // InternalMarkovChains.g:230:1: ruleProbability EOF
            {
             before(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_1);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getProbabilityRule()); 
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
    // $ANTLR end "entryRuleProbability"


    // $ANTLR start "ruleProbability"
    // InternalMarkovChains.g:237:1: ruleProbability : ( ( rule__Probability__Alternatives ) ) ;
    public final void ruleProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:241:2: ( ( ( rule__Probability__Alternatives ) ) )
            // InternalMarkovChains.g:242:2: ( ( rule__Probability__Alternatives ) )
            {
            // InternalMarkovChains.g:242:2: ( ( rule__Probability__Alternatives ) )
            // InternalMarkovChains.g:243:3: ( rule__Probability__Alternatives )
            {
             before(grammarAccess.getProbabilityAccess().getAlternatives()); 
            // InternalMarkovChains.g:244:3: ( rule__Probability__Alternatives )
            // InternalMarkovChains.g:244:4: rule__Probability__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Probability__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProbability"


    // $ANTLR start "entryRulePosRatio"
    // InternalMarkovChains.g:253:1: entryRulePosRatio : rulePosRatio EOF ;
    public final void entryRulePosRatio() throws RecognitionException {
        try {
            // InternalMarkovChains.g:254:1: ( rulePosRatio EOF )
            // InternalMarkovChains.g:255:1: rulePosRatio EOF
            {
             before(grammarAccess.getPosRatioRule()); 
            pushFollow(FOLLOW_1);
            rulePosRatio();

            state._fsp--;

             after(grammarAccess.getPosRatioRule()); 
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
    // $ANTLR end "entryRulePosRatio"


    // $ANTLR start "rulePosRatio"
    // InternalMarkovChains.g:262:1: rulePosRatio : ( ( rule__PosRatio__Group__0 ) ) ;
    public final void rulePosRatio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:266:2: ( ( ( rule__PosRatio__Group__0 ) ) )
            // InternalMarkovChains.g:267:2: ( ( rule__PosRatio__Group__0 ) )
            {
            // InternalMarkovChains.g:267:2: ( ( rule__PosRatio__Group__0 ) )
            // InternalMarkovChains.g:268:3: ( rule__PosRatio__Group__0 )
            {
             before(grammarAccess.getPosRatioAccess().getGroup()); 
            // InternalMarkovChains.g:269:3: ( rule__PosRatio__Group__0 )
            // InternalMarkovChains.g:269:4: rule__PosRatio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PosRatio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPosRatioAccess().getGroup()); 

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
    // $ANTLR end "rulePosRatio"


    // $ANTLR start "entryRuleReward"
    // InternalMarkovChains.g:278:1: entryRuleReward : ruleReward EOF ;
    public final void entryRuleReward() throws RecognitionException {
        try {
            // InternalMarkovChains.g:279:1: ( ruleReward EOF )
            // InternalMarkovChains.g:280:1: ruleReward EOF
            {
             before(grammarAccess.getRewardRule()); 
            pushFollow(FOLLOW_1);
            ruleReward();

            state._fsp--;

             after(grammarAccess.getRewardRule()); 
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
    // $ANTLR end "entryRuleReward"


    // $ANTLR start "ruleReward"
    // InternalMarkovChains.g:287:1: ruleReward : ( ( rule__Reward__Alternatives ) ) ;
    public final void ruleReward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:291:2: ( ( ( rule__Reward__Alternatives ) ) )
            // InternalMarkovChains.g:292:2: ( ( rule__Reward__Alternatives ) )
            {
            // InternalMarkovChains.g:292:2: ( ( rule__Reward__Alternatives ) )
            // InternalMarkovChains.g:293:3: ( rule__Reward__Alternatives )
            {
             before(grammarAccess.getRewardAccess().getAlternatives()); 
            // InternalMarkovChains.g:294:3: ( rule__Reward__Alternatives )
            // InternalMarkovChains.g:294:4: rule__Reward__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reward__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRewardAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReward"


    // $ANTLR start "entryRulePosNegRatio"
    // InternalMarkovChains.g:303:1: entryRulePosNegRatio : rulePosNegRatio EOF ;
    public final void entryRulePosNegRatio() throws RecognitionException {
        try {
            // InternalMarkovChains.g:304:1: ( rulePosNegRatio EOF )
            // InternalMarkovChains.g:305:1: rulePosNegRatio EOF
            {
             before(grammarAccess.getPosNegRatioRule()); 
            pushFollow(FOLLOW_1);
            rulePosNegRatio();

            state._fsp--;

             after(grammarAccess.getPosNegRatioRule()); 
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
    // $ANTLR end "entryRulePosNegRatio"


    // $ANTLR start "rulePosNegRatio"
    // InternalMarkovChains.g:312:1: rulePosNegRatio : ( ( rule__PosNegRatio__Group__0 ) ) ;
    public final void rulePosNegRatio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:316:2: ( ( ( rule__PosNegRatio__Group__0 ) ) )
            // InternalMarkovChains.g:317:2: ( ( rule__PosNegRatio__Group__0 ) )
            {
            // InternalMarkovChains.g:317:2: ( ( rule__PosNegRatio__Group__0 ) )
            // InternalMarkovChains.g:318:3: ( rule__PosNegRatio__Group__0 )
            {
             before(grammarAccess.getPosNegRatioAccess().getGroup()); 
            // InternalMarkovChains.g:319:3: ( rule__PosNegRatio__Group__0 )
            // InternalMarkovChains.g:319:4: rule__PosNegRatio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PosNegRatio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPosNegRatioAccess().getGroup()); 

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
    // $ANTLR end "rulePosNegRatio"


    // $ANTLR start "rule__Edge__Alternatives"
    // InternalMarkovChains.g:327:1: rule__Edge__Alternatives : ( ( ( rule__Edge__Group_0__0 ) ) | ( ( rule__Edge__Group_1__0 ) ) );
    public final void rule__Edge__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:331:1: ( ( ( rule__Edge__Group_0__0 ) ) | ( ( rule__Edge__Group_1__0 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMarkovChains.g:332:2: ( ( rule__Edge__Group_0__0 ) )
                    {
                    // InternalMarkovChains.g:332:2: ( ( rule__Edge__Group_0__0 ) )
                    // InternalMarkovChains.g:333:3: ( rule__Edge__Group_0__0 )
                    {
                     before(grammarAccess.getEdgeAccess().getGroup_0()); 
                    // InternalMarkovChains.g:334:3: ( rule__Edge__Group_0__0 )
                    // InternalMarkovChains.g:334:4: rule__Edge__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edge__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEdgeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkovChains.g:338:2: ( ( rule__Edge__Group_1__0 ) )
                    {
                    // InternalMarkovChains.g:338:2: ( ( rule__Edge__Group_1__0 ) )
                    // InternalMarkovChains.g:339:3: ( rule__Edge__Group_1__0 )
                    {
                     before(grammarAccess.getEdgeAccess().getGroup_1()); 
                    // InternalMarkovChains.g:340:3: ( rule__Edge__Group_1__0 )
                    // InternalMarkovChains.g:340:4: rule__Edge__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Edge__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEdgeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Edge__Alternatives"


    // $ANTLR start "rule__EdgeAnnotation__Alternatives"
    // InternalMarkovChains.g:348:1: rule__EdgeAnnotation__Alternatives : ( ( ( rule__EdgeAnnotation__Group_0__0 ) ) | ( ( rule__EdgeAnnotation__ProbabilityAssignment_1 ) ) );
    public final void rule__EdgeAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:352:1: ( ( ( rule__EdgeAnnotation__Group_0__0 ) ) | ( ( rule__EdgeAnnotation__ProbabilityAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_FLOAT && LA2_0<=RULE_INT)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMarkovChains.g:353:2: ( ( rule__EdgeAnnotation__Group_0__0 ) )
                    {
                    // InternalMarkovChains.g:353:2: ( ( rule__EdgeAnnotation__Group_0__0 ) )
                    // InternalMarkovChains.g:354:3: ( rule__EdgeAnnotation__Group_0__0 )
                    {
                     before(grammarAccess.getEdgeAnnotationAccess().getGroup_0()); 
                    // InternalMarkovChains.g:355:3: ( rule__EdgeAnnotation__Group_0__0 )
                    // InternalMarkovChains.g:355:4: rule__EdgeAnnotation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeAnnotation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEdgeAnnotationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkovChains.g:359:2: ( ( rule__EdgeAnnotation__ProbabilityAssignment_1 ) )
                    {
                    // InternalMarkovChains.g:359:2: ( ( rule__EdgeAnnotation__ProbabilityAssignment_1 ) )
                    // InternalMarkovChains.g:360:3: ( rule__EdgeAnnotation__ProbabilityAssignment_1 )
                    {
                     before(grammarAccess.getEdgeAnnotationAccess().getProbabilityAssignment_1()); 
                    // InternalMarkovChains.g:361:3: ( rule__EdgeAnnotation__ProbabilityAssignment_1 )
                    // InternalMarkovChains.g:361:4: rule__EdgeAnnotation__ProbabilityAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeAnnotation__ProbabilityAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEdgeAnnotationAccess().getProbabilityAssignment_1()); 

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
    // $ANTLR end "rule__EdgeAnnotation__Alternatives"


    // $ANTLR start "rule__StateAnnotation__Alternatives"
    // InternalMarkovChains.g:369:1: rule__StateAnnotation__Alternatives : ( ( ( rule__StateAnnotation__Group_0__0 ) ) | ( ( rule__StateAnnotation__Group_1__0 ) ) );
    public final void rule__StateAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:373:1: ( ( ( rule__StateAnnotation__Group_0__0 ) ) | ( ( rule__StateAnnotation__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13||LA3_0==29) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMarkovChains.g:374:2: ( ( rule__StateAnnotation__Group_0__0 ) )
                    {
                    // InternalMarkovChains.g:374:2: ( ( rule__StateAnnotation__Group_0__0 ) )
                    // InternalMarkovChains.g:375:3: ( rule__StateAnnotation__Group_0__0 )
                    {
                     before(grammarAccess.getStateAnnotationAccess().getGroup_0()); 
                    // InternalMarkovChains.g:376:3: ( rule__StateAnnotation__Group_0__0 )
                    // InternalMarkovChains.g:376:4: rule__StateAnnotation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateAnnotation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAnnotationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkovChains.g:380:2: ( ( rule__StateAnnotation__Group_1__0 ) )
                    {
                    // InternalMarkovChains.g:380:2: ( ( rule__StateAnnotation__Group_1__0 ) )
                    // InternalMarkovChains.g:381:3: ( rule__StateAnnotation__Group_1__0 )
                    {
                     before(grammarAccess.getStateAnnotationAccess().getGroup_1()); 
                    // InternalMarkovChains.g:382:3: ( rule__StateAnnotation__Group_1__0 )
                    // InternalMarkovChains.g:382:4: rule__StateAnnotation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateAnnotation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAnnotationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StateAnnotation__Alternatives"


    // $ANTLR start "rule__StateAnnotation__Alternatives_0_0_0"
    // InternalMarkovChains.g:390:1: rule__StateAnnotation__Alternatives_0_0_0 : ( ( ( rule__StateAnnotation__Group_0_0_0_0__0 ) ) | ( 'p' ) );
    public final void rule__StateAnnotation__Alternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:394:1: ( ( ( rule__StateAnnotation__Group_0_0_0_0__0 ) ) | ( 'p' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMarkovChains.g:395:2: ( ( rule__StateAnnotation__Group_0_0_0_0__0 ) )
                    {
                    // InternalMarkovChains.g:395:2: ( ( rule__StateAnnotation__Group_0_0_0_0__0 ) )
                    // InternalMarkovChains.g:396:3: ( rule__StateAnnotation__Group_0_0_0_0__0 )
                    {
                     before(grammarAccess.getStateAnnotationAccess().getGroup_0_0_0_0()); 
                    // InternalMarkovChains.g:397:3: ( rule__StateAnnotation__Group_0_0_0_0__0 )
                    // InternalMarkovChains.g:397:4: rule__StateAnnotation__Group_0_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateAnnotation__Group_0_0_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAnnotationAccess().getGroup_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkovChains.g:401:2: ( 'p' )
                    {
                    // InternalMarkovChains.g:401:2: ( 'p' )
                    // InternalMarkovChains.g:402:3: 'p'
                    {
                     before(grammarAccess.getStateAnnotationAccess().getPKeyword_0_0_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStateAnnotationAccess().getPKeyword_0_0_0_1()); 

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
    // $ANTLR end "rule__StateAnnotation__Alternatives_0_0_0"


    // $ANTLR start "rule__StateAnnotation__Alternatives_1_0_0"
    // InternalMarkovChains.g:411:1: rule__StateAnnotation__Alternatives_1_0_0 : ( ( 'reward' ) | ( 'r' ) );
    public final void rule__StateAnnotation__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:415:1: ( ( 'reward' ) | ( 'r' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMarkovChains.g:416:2: ( 'reward' )
                    {
                    // InternalMarkovChains.g:416:2: ( 'reward' )
                    // InternalMarkovChains.g:417:3: 'reward'
                    {
                     before(grammarAccess.getStateAnnotationAccess().getRewardKeyword_1_0_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStateAnnotationAccess().getRewardKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkovChains.g:422:2: ( 'r' )
                    {
                    // InternalMarkovChains.g:422:2: ( 'r' )
                    // InternalMarkovChains.g:423:3: 'r'
                    {
                     before(grammarAccess.getStateAnnotationAccess().getRKeyword_1_0_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStateAnnotationAccess().getRKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__StateAnnotation__Alternatives_1_0_0"


    // $ANTLR start "rule__Probability__Alternatives"
    // InternalMarkovChains.g:432:1: rule__Probability__Alternatives : ( ( ( rule__Probability__RatioAssignment_0 ) ) | ( ( rule__Probability__FloatAssignment_1 ) ) | ( ( rule__Probability__IntAssignment_2 ) ) );
    public final void rule__Probability__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:436:1: ( ( ( rule__Probability__RatioAssignment_0 ) ) | ( ( rule__Probability__FloatAssignment_1 ) ) | ( ( rule__Probability__IntAssignment_2 ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=22 && LA6_1<=24)||LA6_1==28) ) {
                    alt6=3;
                }
                else if ( (LA6_1==30) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_FLOAT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMarkovChains.g:437:2: ( ( rule__Probability__RatioAssignment_0 ) )
                    {
                    // InternalMarkovChains.g:437:2: ( ( rule__Probability__RatioAssignment_0 ) )
                    // InternalMarkovChains.g:438:3: ( rule__Probability__RatioAssignment_0 )
                    {
                     before(grammarAccess.getProbabilityAccess().getRatioAssignment_0()); 
                    // InternalMarkovChains.g:439:3: ( rule__Probability__RatioAssignment_0 )
                    // InternalMarkovChains.g:439:4: rule__Probability__RatioAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Probability__RatioAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProbabilityAccess().getRatioAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkovChains.g:443:2: ( ( rule__Probability__FloatAssignment_1 ) )
                    {
                    // InternalMarkovChains.g:443:2: ( ( rule__Probability__FloatAssignment_1 ) )
                    // InternalMarkovChains.g:444:3: ( rule__Probability__FloatAssignment_1 )
                    {
                     before(grammarAccess.getProbabilityAccess().getFloatAssignment_1()); 
                    // InternalMarkovChains.g:445:3: ( rule__Probability__FloatAssignment_1 )
                    // InternalMarkovChains.g:445:4: rule__Probability__FloatAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Probability__FloatAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProbabilityAccess().getFloatAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMarkovChains.g:449:2: ( ( rule__Probability__IntAssignment_2 ) )
                    {
                    // InternalMarkovChains.g:449:2: ( ( rule__Probability__IntAssignment_2 ) )
                    // InternalMarkovChains.g:450:3: ( rule__Probability__IntAssignment_2 )
                    {
                     before(grammarAccess.getProbabilityAccess().getIntAssignment_2()); 
                    // InternalMarkovChains.g:451:3: ( rule__Probability__IntAssignment_2 )
                    // InternalMarkovChains.g:451:4: rule__Probability__IntAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Probability__IntAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getProbabilityAccess().getIntAssignment_2()); 

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
    // $ANTLR end "rule__Probability__Alternatives"


    // $ANTLR start "rule__Reward__Alternatives"
    // InternalMarkovChains.g:459:1: rule__Reward__Alternatives : ( ( ( rule__Reward__RatioAssignment_0 ) ) | ( ( rule__Reward__FloatAssignment_1 ) ) | ( ( rule__Reward__IntAssignment_2 ) ) | ( ( rule__Reward__NegintAssignment_3 ) ) );
    public final void rule__Reward__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:463:1: ( ( ( rule__Reward__RatioAssignment_0 ) ) | ( ( rule__Reward__FloatAssignment_1 ) ) | ( ( rule__Reward__IntAssignment_2 ) ) | ( ( rule__Reward__NegintAssignment_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==30) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==24||LA7_1==28) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NEGINT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==30) ) {
                    alt7=1;
                }
                else if ( (LA7_2==EOF||LA7_2==24||LA7_2==28) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMarkovChains.g:464:2: ( ( rule__Reward__RatioAssignment_0 ) )
                    {
                    // InternalMarkovChains.g:464:2: ( ( rule__Reward__RatioAssignment_0 ) )
                    // InternalMarkovChains.g:465:3: ( rule__Reward__RatioAssignment_0 )
                    {
                     before(grammarAccess.getRewardAccess().getRatioAssignment_0()); 
                    // InternalMarkovChains.g:466:3: ( rule__Reward__RatioAssignment_0 )
                    // InternalMarkovChains.g:466:4: rule__Reward__RatioAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reward__RatioAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewardAccess().getRatioAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkovChains.g:470:2: ( ( rule__Reward__FloatAssignment_1 ) )
                    {
                    // InternalMarkovChains.g:470:2: ( ( rule__Reward__FloatAssignment_1 ) )
                    // InternalMarkovChains.g:471:3: ( rule__Reward__FloatAssignment_1 )
                    {
                     before(grammarAccess.getRewardAccess().getFloatAssignment_1()); 
                    // InternalMarkovChains.g:472:3: ( rule__Reward__FloatAssignment_1 )
                    // InternalMarkovChains.g:472:4: rule__Reward__FloatAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reward__FloatAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewardAccess().getFloatAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMarkovChains.g:476:2: ( ( rule__Reward__IntAssignment_2 ) )
                    {
                    // InternalMarkovChains.g:476:2: ( ( rule__Reward__IntAssignment_2 ) )
                    // InternalMarkovChains.g:477:3: ( rule__Reward__IntAssignment_2 )
                    {
                     before(grammarAccess.getRewardAccess().getIntAssignment_2()); 
                    // InternalMarkovChains.g:478:3: ( rule__Reward__IntAssignment_2 )
                    // InternalMarkovChains.g:478:4: rule__Reward__IntAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reward__IntAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewardAccess().getIntAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMarkovChains.g:482:2: ( ( rule__Reward__NegintAssignment_3 ) )
                    {
                    // InternalMarkovChains.g:482:2: ( ( rule__Reward__NegintAssignment_3 ) )
                    // InternalMarkovChains.g:483:3: ( rule__Reward__NegintAssignment_3 )
                    {
                     before(grammarAccess.getRewardAccess().getNegintAssignment_3()); 
                    // InternalMarkovChains.g:484:3: ( rule__Reward__NegintAssignment_3 )
                    // InternalMarkovChains.g:484:4: rule__Reward__NegintAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reward__NegintAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewardAccess().getNegintAssignment_3()); 

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
    // $ANTLR end "rule__Reward__Alternatives"


    // $ANTLR start "rule__PosNegRatio__Alternatives_0"
    // InternalMarkovChains.g:492:1: rule__PosNegRatio__Alternatives_0 : ( ( ( rule__PosNegRatio__NumeratorAssignment_0_0 ) ) | ( ( rule__PosNegRatio__NegnumeratorAssignment_0_1 ) ) );
    public final void rule__PosNegRatio__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:496:1: ( ( ( rule__PosNegRatio__NumeratorAssignment_0_0 ) ) | ( ( rule__PosNegRatio__NegnumeratorAssignment_0_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_NEGINT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMarkovChains.g:497:2: ( ( rule__PosNegRatio__NumeratorAssignment_0_0 ) )
                    {
                    // InternalMarkovChains.g:497:2: ( ( rule__PosNegRatio__NumeratorAssignment_0_0 ) )
                    // InternalMarkovChains.g:498:3: ( rule__PosNegRatio__NumeratorAssignment_0_0 )
                    {
                     before(grammarAccess.getPosNegRatioAccess().getNumeratorAssignment_0_0()); 
                    // InternalMarkovChains.g:499:3: ( rule__PosNegRatio__NumeratorAssignment_0_0 )
                    // InternalMarkovChains.g:499:4: rule__PosNegRatio__NumeratorAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PosNegRatio__NumeratorAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPosNegRatioAccess().getNumeratorAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkovChains.g:503:2: ( ( rule__PosNegRatio__NegnumeratorAssignment_0_1 ) )
                    {
                    // InternalMarkovChains.g:503:2: ( ( rule__PosNegRatio__NegnumeratorAssignment_0_1 ) )
                    // InternalMarkovChains.g:504:3: ( rule__PosNegRatio__NegnumeratorAssignment_0_1 )
                    {
                     before(grammarAccess.getPosNegRatioAccess().getNegnumeratorAssignment_0_1()); 
                    // InternalMarkovChains.g:505:3: ( rule__PosNegRatio__NegnumeratorAssignment_0_1 )
                    // InternalMarkovChains.g:505:4: rule__PosNegRatio__NegnumeratorAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PosNegRatio__NegnumeratorAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPosNegRatioAccess().getNegnumeratorAssignment_0_1()); 

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
    // $ANTLR end "rule__PosNegRatio__Alternatives_0"


    // $ANTLR start "rule__MarkovChainModel__Group__0"
    // InternalMarkovChains.g:513:1: rule__MarkovChainModel__Group__0 : rule__MarkovChainModel__Group__0__Impl rule__MarkovChainModel__Group__1 ;
    public final void rule__MarkovChainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:517:1: ( rule__MarkovChainModel__Group__0__Impl rule__MarkovChainModel__Group__1 )
            // InternalMarkovChains.g:518:2: rule__MarkovChainModel__Group__0__Impl rule__MarkovChainModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MarkovChainModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group__1();

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
    // $ANTLR end "rule__MarkovChainModel__Group__0"


    // $ANTLR start "rule__MarkovChainModel__Group__0__Impl"
    // InternalMarkovChains.g:525:1: rule__MarkovChainModel__Group__0__Impl : ( ( rule__MarkovChainModel__Group_0__0 )? ) ;
    public final void rule__MarkovChainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:529:1: ( ( ( rule__MarkovChainModel__Group_0__0 )? ) )
            // InternalMarkovChains.g:530:1: ( ( rule__MarkovChainModel__Group_0__0 )? )
            {
            // InternalMarkovChains.g:530:1: ( ( rule__MarkovChainModel__Group_0__0 )? )
            // InternalMarkovChains.g:531:2: ( rule__MarkovChainModel__Group_0__0 )?
            {
             before(grammarAccess.getMarkovChainModelAccess().getGroup_0()); 
            // InternalMarkovChains.g:532:2: ( rule__MarkovChainModel__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMarkovChains.g:532:3: rule__MarkovChainModel__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MarkovChainModel__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMarkovChainModelAccess().getGroup_0()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group__0__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group__1"
    // InternalMarkovChains.g:540:1: rule__MarkovChainModel__Group__1 : rule__MarkovChainModel__Group__1__Impl rule__MarkovChainModel__Group__2 ;
    public final void rule__MarkovChainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:544:1: ( rule__MarkovChainModel__Group__1__Impl rule__MarkovChainModel__Group__2 )
            // InternalMarkovChains.g:545:2: rule__MarkovChainModel__Group__1__Impl rule__MarkovChainModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MarkovChainModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group__2();

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
    // $ANTLR end "rule__MarkovChainModel__Group__1"


    // $ANTLR start "rule__MarkovChainModel__Group__1__Impl"
    // InternalMarkovChains.g:552:1: rule__MarkovChainModel__Group__1__Impl : ( 'markov' ) ;
    public final void rule__MarkovChainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:556:1: ( ( 'markov' ) )
            // InternalMarkovChains.g:557:1: ( 'markov' )
            {
            // InternalMarkovChains.g:557:1: ( 'markov' )
            // InternalMarkovChains.g:558:2: 'markov'
            {
             before(grammarAccess.getMarkovChainModelAccess().getMarkovKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMarkovChainModelAccess().getMarkovKeyword_1()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group__1__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group__2"
    // InternalMarkovChains.g:567:1: rule__MarkovChainModel__Group__2 : rule__MarkovChainModel__Group__2__Impl rule__MarkovChainModel__Group__3 ;
    public final void rule__MarkovChainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:571:1: ( rule__MarkovChainModel__Group__2__Impl rule__MarkovChainModel__Group__3 )
            // InternalMarkovChains.g:572:2: rule__MarkovChainModel__Group__2__Impl rule__MarkovChainModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MarkovChainModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group__3();

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
    // $ANTLR end "rule__MarkovChainModel__Group__2"


    // $ANTLR start "rule__MarkovChainModel__Group__2__Impl"
    // InternalMarkovChains.g:579:1: rule__MarkovChainModel__Group__2__Impl : ( 'chain' ) ;
    public final void rule__MarkovChainModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:583:1: ( ( 'chain' ) )
            // InternalMarkovChains.g:584:1: ( 'chain' )
            {
            // InternalMarkovChains.g:584:1: ( 'chain' )
            // InternalMarkovChains.g:585:2: 'chain'
            {
             before(grammarAccess.getMarkovChainModelAccess().getChainKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMarkovChainModelAccess().getChainKeyword_2()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group__2__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group__3"
    // InternalMarkovChains.g:594:1: rule__MarkovChainModel__Group__3 : rule__MarkovChainModel__Group__3__Impl rule__MarkovChainModel__Group__4 ;
    public final void rule__MarkovChainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:598:1: ( rule__MarkovChainModel__Group__3__Impl rule__MarkovChainModel__Group__4 )
            // InternalMarkovChains.g:599:2: rule__MarkovChainModel__Group__3__Impl rule__MarkovChainModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MarkovChainModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group__4();

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
    // $ANTLR end "rule__MarkovChainModel__Group__3"


    // $ANTLR start "rule__MarkovChainModel__Group__3__Impl"
    // InternalMarkovChains.g:606:1: rule__MarkovChainModel__Group__3__Impl : ( ( rule__MarkovChainModel__NameAssignment_3 ) ) ;
    public final void rule__MarkovChainModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:610:1: ( ( ( rule__MarkovChainModel__NameAssignment_3 ) ) )
            // InternalMarkovChains.g:611:1: ( ( rule__MarkovChainModel__NameAssignment_3 ) )
            {
            // InternalMarkovChains.g:611:1: ( ( rule__MarkovChainModel__NameAssignment_3 ) )
            // InternalMarkovChains.g:612:2: ( rule__MarkovChainModel__NameAssignment_3 )
            {
             before(grammarAccess.getMarkovChainModelAccess().getNameAssignment_3()); 
            // InternalMarkovChains.g:613:2: ( rule__MarkovChainModel__NameAssignment_3 )
            // InternalMarkovChains.g:613:3: rule__MarkovChainModel__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarkovChainModelAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group__3__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group__4"
    // InternalMarkovChains.g:621:1: rule__MarkovChainModel__Group__4 : rule__MarkovChainModel__Group__4__Impl rule__MarkovChainModel__Group__5 ;
    public final void rule__MarkovChainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:625:1: ( rule__MarkovChainModel__Group__4__Impl rule__MarkovChainModel__Group__5 )
            // InternalMarkovChains.g:626:2: rule__MarkovChainModel__Group__4__Impl rule__MarkovChainModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MarkovChainModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group__5();

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
    // $ANTLR end "rule__MarkovChainModel__Group__4"


    // $ANTLR start "rule__MarkovChainModel__Group__4__Impl"
    // InternalMarkovChains.g:633:1: rule__MarkovChainModel__Group__4__Impl : ( '{' ) ;
    public final void rule__MarkovChainModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:637:1: ( ( '{' ) )
            // InternalMarkovChains.g:638:1: ( '{' )
            {
            // InternalMarkovChains.g:638:1: ( '{' )
            // InternalMarkovChains.g:639:2: '{'
            {
             before(grammarAccess.getMarkovChainModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMarkovChainModelAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group__4__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group__5"
    // InternalMarkovChains.g:648:1: rule__MarkovChainModel__Group__5 : rule__MarkovChainModel__Group__5__Impl rule__MarkovChainModel__Group__6 ;
    public final void rule__MarkovChainModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:652:1: ( rule__MarkovChainModel__Group__5__Impl rule__MarkovChainModel__Group__6 )
            // InternalMarkovChains.g:653:2: rule__MarkovChainModel__Group__5__Impl rule__MarkovChainModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MarkovChainModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group__6();

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
    // $ANTLR end "rule__MarkovChainModel__Group__5"


    // $ANTLR start "rule__MarkovChainModel__Group__5__Impl"
    // InternalMarkovChains.g:660:1: rule__MarkovChainModel__Group__5__Impl : ( ( rule__MarkovChainModel__EdgesAssignment_5 )* ) ;
    public final void rule__MarkovChainModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:664:1: ( ( ( rule__MarkovChainModel__EdgesAssignment_5 )* ) )
            // InternalMarkovChains.g:665:1: ( ( rule__MarkovChainModel__EdgesAssignment_5 )* )
            {
            // InternalMarkovChains.g:665:1: ( ( rule__MarkovChainModel__EdgesAssignment_5 )* )
            // InternalMarkovChains.g:666:2: ( rule__MarkovChainModel__EdgesAssignment_5 )*
            {
             before(grammarAccess.getMarkovChainModelAccess().getEdgesAssignment_5()); 
            // InternalMarkovChains.g:667:2: ( rule__MarkovChainModel__EdgesAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMarkovChains.g:667:3: rule__MarkovChainModel__EdgesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MarkovChainModel__EdgesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMarkovChainModelAccess().getEdgesAssignment_5()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group__5__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group__6"
    // InternalMarkovChains.g:675:1: rule__MarkovChainModel__Group__6 : rule__MarkovChainModel__Group__6__Impl ;
    public final void rule__MarkovChainModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:679:1: ( rule__MarkovChainModel__Group__6__Impl )
            // InternalMarkovChains.g:680:2: rule__MarkovChainModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group__6__Impl();

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
    // $ANTLR end "rule__MarkovChainModel__Group__6"


    // $ANTLR start "rule__MarkovChainModel__Group__6__Impl"
    // InternalMarkovChains.g:686:1: rule__MarkovChainModel__Group__6__Impl : ( '}' ) ;
    public final void rule__MarkovChainModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:690:1: ( ( '}' ) )
            // InternalMarkovChains.g:691:1: ( '}' )
            {
            // InternalMarkovChains.g:691:1: ( '}' )
            // InternalMarkovChains.g:692:2: '}'
            {
             before(grammarAccess.getMarkovChainModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMarkovChainModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group__6__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group_0__0"
    // InternalMarkovChains.g:702:1: rule__MarkovChainModel__Group_0__0 : rule__MarkovChainModel__Group_0__0__Impl rule__MarkovChainModel__Group_0__1 ;
    public final void rule__MarkovChainModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:706:1: ( rule__MarkovChainModel__Group_0__0__Impl rule__MarkovChainModel__Group_0__1 )
            // InternalMarkovChains.g:707:2: rule__MarkovChainModel__Group_0__0__Impl rule__MarkovChainModel__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__MarkovChainModel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group_0__1();

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
    // $ANTLR end "rule__MarkovChainModel__Group_0__0"


    // $ANTLR start "rule__MarkovChainModel__Group_0__0__Impl"
    // InternalMarkovChains.g:714:1: rule__MarkovChainModel__Group_0__0__Impl : ( 'author' ) ;
    public final void rule__MarkovChainModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:718:1: ( ( 'author' ) )
            // InternalMarkovChains.g:719:1: ( 'author' )
            {
            // InternalMarkovChains.g:719:1: ( 'author' )
            // InternalMarkovChains.g:720:2: 'author'
            {
             before(grammarAccess.getMarkovChainModelAccess().getAuthorKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMarkovChainModelAccess().getAuthorKeyword_0_0()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group_0__0__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group_0__1"
    // InternalMarkovChains.g:729:1: rule__MarkovChainModel__Group_0__1 : rule__MarkovChainModel__Group_0__1__Impl rule__MarkovChainModel__Group_0__2 ;
    public final void rule__MarkovChainModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:733:1: ( rule__MarkovChainModel__Group_0__1__Impl rule__MarkovChainModel__Group_0__2 )
            // InternalMarkovChains.g:734:2: rule__MarkovChainModel__Group_0__1__Impl rule__MarkovChainModel__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__MarkovChainModel__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group_0__2();

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
    // $ANTLR end "rule__MarkovChainModel__Group_0__1"


    // $ANTLR start "rule__MarkovChainModel__Group_0__1__Impl"
    // InternalMarkovChains.g:741:1: rule__MarkovChainModel__Group_0__1__Impl : ( '=' ) ;
    public final void rule__MarkovChainModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:745:1: ( ( '=' ) )
            // InternalMarkovChains.g:746:1: ( '=' )
            {
            // InternalMarkovChains.g:746:1: ( '=' )
            // InternalMarkovChains.g:747:2: '='
            {
             before(grammarAccess.getMarkovChainModelAccess().getEqualsSignKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMarkovChainModelAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group_0__1__Impl"


    // $ANTLR start "rule__MarkovChainModel__Group_0__2"
    // InternalMarkovChains.g:756:1: rule__MarkovChainModel__Group_0__2 : rule__MarkovChainModel__Group_0__2__Impl ;
    public final void rule__MarkovChainModel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:760:1: ( rule__MarkovChainModel__Group_0__2__Impl )
            // InternalMarkovChains.g:761:2: rule__MarkovChainModel__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__Group_0__2__Impl();

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
    // $ANTLR end "rule__MarkovChainModel__Group_0__2"


    // $ANTLR start "rule__MarkovChainModel__Group_0__2__Impl"
    // InternalMarkovChains.g:767:1: rule__MarkovChainModel__Group_0__2__Impl : ( ( rule__MarkovChainModel__AuthorAssignment_0_2 ) ) ;
    public final void rule__MarkovChainModel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:771:1: ( ( ( rule__MarkovChainModel__AuthorAssignment_0_2 ) ) )
            // InternalMarkovChains.g:772:1: ( ( rule__MarkovChainModel__AuthorAssignment_0_2 ) )
            {
            // InternalMarkovChains.g:772:1: ( ( rule__MarkovChainModel__AuthorAssignment_0_2 ) )
            // InternalMarkovChains.g:773:2: ( rule__MarkovChainModel__AuthorAssignment_0_2 )
            {
             before(grammarAccess.getMarkovChainModelAccess().getAuthorAssignment_0_2()); 
            // InternalMarkovChains.g:774:2: ( rule__MarkovChainModel__AuthorAssignment_0_2 )
            // InternalMarkovChains.g:774:3: rule__MarkovChainModel__AuthorAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MarkovChainModel__AuthorAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMarkovChainModelAccess().getAuthorAssignment_0_2()); 

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
    // $ANTLR end "rule__MarkovChainModel__Group_0__2__Impl"


    // $ANTLR start "rule__Edge__Group_0__0"
    // InternalMarkovChains.g:783:1: rule__Edge__Group_0__0 : rule__Edge__Group_0__0__Impl rule__Edge__Group_0__1 ;
    public final void rule__Edge__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:787:1: ( rule__Edge__Group_0__0__Impl rule__Edge__Group_0__1 )
            // InternalMarkovChains.g:788:2: rule__Edge__Group_0__0__Impl rule__Edge__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Edge__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_0__1();

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
    // $ANTLR end "rule__Edge__Group_0__0"


    // $ANTLR start "rule__Edge__Group_0__0__Impl"
    // InternalMarkovChains.g:795:1: rule__Edge__Group_0__0__Impl : ( ( rule__Edge__SrcstateAssignment_0_0 ) ) ;
    public final void rule__Edge__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:799:1: ( ( ( rule__Edge__SrcstateAssignment_0_0 ) ) )
            // InternalMarkovChains.g:800:1: ( ( rule__Edge__SrcstateAssignment_0_0 ) )
            {
            // InternalMarkovChains.g:800:1: ( ( rule__Edge__SrcstateAssignment_0_0 ) )
            // InternalMarkovChains.g:801:2: ( rule__Edge__SrcstateAssignment_0_0 )
            {
             before(grammarAccess.getEdgeAccess().getSrcstateAssignment_0_0()); 
            // InternalMarkovChains.g:802:2: ( rule__Edge__SrcstateAssignment_0_0 )
            // InternalMarkovChains.g:802:3: rule__Edge__SrcstateAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__SrcstateAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getSrcstateAssignment_0_0()); 

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
    // $ANTLR end "rule__Edge__Group_0__0__Impl"


    // $ANTLR start "rule__Edge__Group_0__1"
    // InternalMarkovChains.g:810:1: rule__Edge__Group_0__1 : rule__Edge__Group_0__1__Impl rule__Edge__Group_0__2 ;
    public final void rule__Edge__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:814:1: ( rule__Edge__Group_0__1__Impl rule__Edge__Group_0__2 )
            // InternalMarkovChains.g:815:2: rule__Edge__Group_0__1__Impl rule__Edge__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Edge__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_0__2();

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
    // $ANTLR end "rule__Edge__Group_0__1"


    // $ANTLR start "rule__Edge__Group_0__1__Impl"
    // InternalMarkovChains.g:822:1: rule__Edge__Group_0__1__Impl : ( ( '-' )* ) ;
    public final void rule__Edge__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:826:1: ( ( ( '-' )* ) )
            // InternalMarkovChains.g:827:1: ( ( '-' )* )
            {
            // InternalMarkovChains.g:827:1: ( ( '-' )* )
            // InternalMarkovChains.g:828:2: ( '-' )*
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_0_1()); 
            // InternalMarkovChains.g:829:2: ( '-' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMarkovChains.g:829:3: '-'
            	    {
            	    match(input,22,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__Edge__Group_0__1__Impl"


    // $ANTLR start "rule__Edge__Group_0__2"
    // InternalMarkovChains.g:837:1: rule__Edge__Group_0__2 : rule__Edge__Group_0__2__Impl rule__Edge__Group_0__3 ;
    public final void rule__Edge__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:841:1: ( rule__Edge__Group_0__2__Impl rule__Edge__Group_0__3 )
            // InternalMarkovChains.g:842:2: rule__Edge__Group_0__2__Impl rule__Edge__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__Edge__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_0__3();

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
    // $ANTLR end "rule__Edge__Group_0__2"


    // $ANTLR start "rule__Edge__Group_0__2__Impl"
    // InternalMarkovChains.g:849:1: rule__Edge__Group_0__2__Impl : ( '->' ) ;
    public final void rule__Edge__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:853:1: ( ( '->' ) )
            // InternalMarkovChains.g:854:1: ( '->' )
            {
            // InternalMarkovChains.g:854:1: ( '->' )
            // InternalMarkovChains.g:855:2: '->'
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusGreaterThanSignKeyword_0_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getHyphenMinusGreaterThanSignKeyword_0_2()); 

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
    // $ANTLR end "rule__Edge__Group_0__2__Impl"


    // $ANTLR start "rule__Edge__Group_0__3"
    // InternalMarkovChains.g:864:1: rule__Edge__Group_0__3 : rule__Edge__Group_0__3__Impl ;
    public final void rule__Edge__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:868:1: ( rule__Edge__Group_0__3__Impl )
            // InternalMarkovChains.g:869:2: rule__Edge__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group_0__3__Impl();

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
    // $ANTLR end "rule__Edge__Group_0__3"


    // $ANTLR start "rule__Edge__Group_0__3__Impl"
    // InternalMarkovChains.g:875:1: rule__Edge__Group_0__3__Impl : ( ( rule__Edge__DststateAssignment_0_3 ) ) ;
    public final void rule__Edge__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:879:1: ( ( ( rule__Edge__DststateAssignment_0_3 ) ) )
            // InternalMarkovChains.g:880:1: ( ( rule__Edge__DststateAssignment_0_3 ) )
            {
            // InternalMarkovChains.g:880:1: ( ( rule__Edge__DststateAssignment_0_3 ) )
            // InternalMarkovChains.g:881:2: ( rule__Edge__DststateAssignment_0_3 )
            {
             before(grammarAccess.getEdgeAccess().getDststateAssignment_0_3()); 
            // InternalMarkovChains.g:882:2: ( rule__Edge__DststateAssignment_0_3 )
            // InternalMarkovChains.g:882:3: rule__Edge__DststateAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Edge__DststateAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getDststateAssignment_0_3()); 

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
    // $ANTLR end "rule__Edge__Group_0__3__Impl"


    // $ANTLR start "rule__Edge__Group_1__0"
    // InternalMarkovChains.g:891:1: rule__Edge__Group_1__0 : rule__Edge__Group_1__0__Impl rule__Edge__Group_1__1 ;
    public final void rule__Edge__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:895:1: ( rule__Edge__Group_1__0__Impl rule__Edge__Group_1__1 )
            // InternalMarkovChains.g:896:2: rule__Edge__Group_1__0__Impl rule__Edge__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Edge__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_1__1();

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
    // $ANTLR end "rule__Edge__Group_1__0"


    // $ANTLR start "rule__Edge__Group_1__0__Impl"
    // InternalMarkovChains.g:903:1: rule__Edge__Group_1__0__Impl : ( ( rule__Edge__SrcstateAssignment_1_0 ) ) ;
    public final void rule__Edge__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:907:1: ( ( ( rule__Edge__SrcstateAssignment_1_0 ) ) )
            // InternalMarkovChains.g:908:1: ( ( rule__Edge__SrcstateAssignment_1_0 ) )
            {
            // InternalMarkovChains.g:908:1: ( ( rule__Edge__SrcstateAssignment_1_0 ) )
            // InternalMarkovChains.g:909:2: ( rule__Edge__SrcstateAssignment_1_0 )
            {
             before(grammarAccess.getEdgeAccess().getSrcstateAssignment_1_0()); 
            // InternalMarkovChains.g:910:2: ( rule__Edge__SrcstateAssignment_1_0 )
            // InternalMarkovChains.g:910:3: rule__Edge__SrcstateAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__SrcstateAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getSrcstateAssignment_1_0()); 

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
    // $ANTLR end "rule__Edge__Group_1__0__Impl"


    // $ANTLR start "rule__Edge__Group_1__1"
    // InternalMarkovChains.g:918:1: rule__Edge__Group_1__1 : rule__Edge__Group_1__1__Impl rule__Edge__Group_1__2 ;
    public final void rule__Edge__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:922:1: ( rule__Edge__Group_1__1__Impl rule__Edge__Group_1__2 )
            // InternalMarkovChains.g:923:2: rule__Edge__Group_1__1__Impl rule__Edge__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Edge__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_1__2();

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
    // $ANTLR end "rule__Edge__Group_1__1"


    // $ANTLR start "rule__Edge__Group_1__1__Impl"
    // InternalMarkovChains.g:930:1: rule__Edge__Group_1__1__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__Edge__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:934:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalMarkovChains.g:935:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalMarkovChains.g:935:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalMarkovChains.g:936:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalMarkovChains.g:936:2: ( ( '-' ) )
            // InternalMarkovChains.g:937:3: ( '-' )
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_1()); 
            // InternalMarkovChains.g:938:3: ( '-' )
            // InternalMarkovChains.g:938:4: '-'
            {
            match(input,22,FOLLOW_11); 

            }

             after(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_1()); 

            }

            // InternalMarkovChains.g:941:2: ( ( '-' )* )
            // InternalMarkovChains.g:942:3: ( '-' )*
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_1()); 
            // InternalMarkovChains.g:943:3: ( '-' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMarkovChains.g:943:4: '-'
            	    {
            	    match(input,22,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__Edge__Group_1__1__Impl"


    // $ANTLR start "rule__Edge__Group_1__2"
    // InternalMarkovChains.g:952:1: rule__Edge__Group_1__2 : rule__Edge__Group_1__2__Impl rule__Edge__Group_1__3 ;
    public final void rule__Edge__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:956:1: ( rule__Edge__Group_1__2__Impl rule__Edge__Group_1__3 )
            // InternalMarkovChains.g:957:2: rule__Edge__Group_1__2__Impl rule__Edge__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Edge__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_1__3();

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
    // $ANTLR end "rule__Edge__Group_1__2"


    // $ANTLR start "rule__Edge__Group_1__2__Impl"
    // InternalMarkovChains.g:964:1: rule__Edge__Group_1__2__Impl : ( ( rule__Edge__SpecsAssignment_1_2 ) ) ;
    public final void rule__Edge__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:968:1: ( ( ( rule__Edge__SpecsAssignment_1_2 ) ) )
            // InternalMarkovChains.g:969:1: ( ( rule__Edge__SpecsAssignment_1_2 ) )
            {
            // InternalMarkovChains.g:969:1: ( ( rule__Edge__SpecsAssignment_1_2 ) )
            // InternalMarkovChains.g:970:2: ( rule__Edge__SpecsAssignment_1_2 )
            {
             before(grammarAccess.getEdgeAccess().getSpecsAssignment_1_2()); 
            // InternalMarkovChains.g:971:2: ( rule__Edge__SpecsAssignment_1_2 )
            // InternalMarkovChains.g:971:3: rule__Edge__SpecsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Edge__SpecsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getSpecsAssignment_1_2()); 

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
    // $ANTLR end "rule__Edge__Group_1__2__Impl"


    // $ANTLR start "rule__Edge__Group_1__3"
    // InternalMarkovChains.g:979:1: rule__Edge__Group_1__3 : rule__Edge__Group_1__3__Impl rule__Edge__Group_1__4 ;
    public final void rule__Edge__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:983:1: ( rule__Edge__Group_1__3__Impl rule__Edge__Group_1__4 )
            // InternalMarkovChains.g:984:2: rule__Edge__Group_1__3__Impl rule__Edge__Group_1__4
            {
            pushFollow(FOLLOW_10);
            rule__Edge__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_1__4();

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
    // $ANTLR end "rule__Edge__Group_1__3"


    // $ANTLR start "rule__Edge__Group_1__3__Impl"
    // InternalMarkovChains.g:991:1: rule__Edge__Group_1__3__Impl : ( ( '-' )* ) ;
    public final void rule__Edge__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:995:1: ( ( ( '-' )* ) )
            // InternalMarkovChains.g:996:1: ( ( '-' )* )
            {
            // InternalMarkovChains.g:996:1: ( ( '-' )* )
            // InternalMarkovChains.g:997:2: ( '-' )*
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_3()); 
            // InternalMarkovChains.g:998:2: ( '-' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMarkovChains.g:998:3: '-'
            	    {
            	    match(input,22,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_3()); 

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
    // $ANTLR end "rule__Edge__Group_1__3__Impl"


    // $ANTLR start "rule__Edge__Group_1__4"
    // InternalMarkovChains.g:1006:1: rule__Edge__Group_1__4 : rule__Edge__Group_1__4__Impl rule__Edge__Group_1__5 ;
    public final void rule__Edge__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1010:1: ( rule__Edge__Group_1__4__Impl rule__Edge__Group_1__5 )
            // InternalMarkovChains.g:1011:2: rule__Edge__Group_1__4__Impl rule__Edge__Group_1__5
            {
            pushFollow(FOLLOW_5);
            rule__Edge__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group_1__5();

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
    // $ANTLR end "rule__Edge__Group_1__4"


    // $ANTLR start "rule__Edge__Group_1__4__Impl"
    // InternalMarkovChains.g:1018:1: rule__Edge__Group_1__4__Impl : ( '->' ) ;
    public final void rule__Edge__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1022:1: ( ( '->' ) )
            // InternalMarkovChains.g:1023:1: ( '->' )
            {
            // InternalMarkovChains.g:1023:1: ( '->' )
            // InternalMarkovChains.g:1024:2: '->'
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1_4()); 

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
    // $ANTLR end "rule__Edge__Group_1__4__Impl"


    // $ANTLR start "rule__Edge__Group_1__5"
    // InternalMarkovChains.g:1033:1: rule__Edge__Group_1__5 : rule__Edge__Group_1__5__Impl ;
    public final void rule__Edge__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1037:1: ( rule__Edge__Group_1__5__Impl )
            // InternalMarkovChains.g:1038:2: rule__Edge__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group_1__5__Impl();

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
    // $ANTLR end "rule__Edge__Group_1__5"


    // $ANTLR start "rule__Edge__Group_1__5__Impl"
    // InternalMarkovChains.g:1044:1: rule__Edge__Group_1__5__Impl : ( ( rule__Edge__DststateAssignment_1_5 ) ) ;
    public final void rule__Edge__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1048:1: ( ( ( rule__Edge__DststateAssignment_1_5 ) ) )
            // InternalMarkovChains.g:1049:1: ( ( rule__Edge__DststateAssignment_1_5 ) )
            {
            // InternalMarkovChains.g:1049:1: ( ( rule__Edge__DststateAssignment_1_5 ) )
            // InternalMarkovChains.g:1050:2: ( rule__Edge__DststateAssignment_1_5 )
            {
             before(grammarAccess.getEdgeAccess().getDststateAssignment_1_5()); 
            // InternalMarkovChains.g:1051:2: ( rule__Edge__DststateAssignment_1_5 )
            // InternalMarkovChains.g:1051:3: rule__Edge__DststateAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Edge__DststateAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getDststateAssignment_1_5()); 

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
    // $ANTLR end "rule__Edge__Group_1__5__Impl"


    // $ANTLR start "rule__EdgeSpecs__Group__0"
    // InternalMarkovChains.g:1060:1: rule__EdgeSpecs__Group__0 : rule__EdgeSpecs__Group__0__Impl rule__EdgeSpecs__Group__1 ;
    public final void rule__EdgeSpecs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1064:1: ( rule__EdgeSpecs__Group__0__Impl rule__EdgeSpecs__Group__1 )
            // InternalMarkovChains.g:1065:2: rule__EdgeSpecs__Group__0__Impl rule__EdgeSpecs__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EdgeSpecs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeSpecs__Group__1();

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
    // $ANTLR end "rule__EdgeSpecs__Group__0"


    // $ANTLR start "rule__EdgeSpecs__Group__0__Impl"
    // InternalMarkovChains.g:1072:1: rule__EdgeSpecs__Group__0__Impl : ( () ) ;
    public final void rule__EdgeSpecs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1076:1: ( ( () ) )
            // InternalMarkovChains.g:1077:1: ( () )
            {
            // InternalMarkovChains.g:1077:1: ( () )
            // InternalMarkovChains.g:1078:2: ()
            {
             before(grammarAccess.getEdgeSpecsAccess().getEdgeSpecsAction_0()); 
            // InternalMarkovChains.g:1079:2: ()
            // InternalMarkovChains.g:1079:3: 
            {
            }

             after(grammarAccess.getEdgeSpecsAccess().getEdgeSpecsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeSpecs__Group__0__Impl"


    // $ANTLR start "rule__EdgeSpecs__Group__1"
    // InternalMarkovChains.g:1087:1: rule__EdgeSpecs__Group__1 : rule__EdgeSpecs__Group__1__Impl rule__EdgeSpecs__Group__2 ;
    public final void rule__EdgeSpecs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1091:1: ( rule__EdgeSpecs__Group__1__Impl rule__EdgeSpecs__Group__2 )
            // InternalMarkovChains.g:1092:2: rule__EdgeSpecs__Group__1__Impl rule__EdgeSpecs__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EdgeSpecs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeSpecs__Group__2();

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
    // $ANTLR end "rule__EdgeSpecs__Group__1"


    // $ANTLR start "rule__EdgeSpecs__Group__1__Impl"
    // InternalMarkovChains.g:1099:1: rule__EdgeSpecs__Group__1__Impl : ( ( rule__EdgeSpecs__AnnotationsAssignment_1 ) ) ;
    public final void rule__EdgeSpecs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1103:1: ( ( ( rule__EdgeSpecs__AnnotationsAssignment_1 ) ) )
            // InternalMarkovChains.g:1104:1: ( ( rule__EdgeSpecs__AnnotationsAssignment_1 ) )
            {
            // InternalMarkovChains.g:1104:1: ( ( rule__EdgeSpecs__AnnotationsAssignment_1 ) )
            // InternalMarkovChains.g:1105:2: ( rule__EdgeSpecs__AnnotationsAssignment_1 )
            {
             before(grammarAccess.getEdgeSpecsAccess().getAnnotationsAssignment_1()); 
            // InternalMarkovChains.g:1106:2: ( rule__EdgeSpecs__AnnotationsAssignment_1 )
            // InternalMarkovChains.g:1106:3: rule__EdgeSpecs__AnnotationsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeSpecs__AnnotationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeSpecsAccess().getAnnotationsAssignment_1()); 

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
    // $ANTLR end "rule__EdgeSpecs__Group__1__Impl"


    // $ANTLR start "rule__EdgeSpecs__Group__2"
    // InternalMarkovChains.g:1114:1: rule__EdgeSpecs__Group__2 : rule__EdgeSpecs__Group__2__Impl ;
    public final void rule__EdgeSpecs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1118:1: ( rule__EdgeSpecs__Group__2__Impl )
            // InternalMarkovChains.g:1119:2: rule__EdgeSpecs__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeSpecs__Group__2__Impl();

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
    // $ANTLR end "rule__EdgeSpecs__Group__2"


    // $ANTLR start "rule__EdgeSpecs__Group__2__Impl"
    // InternalMarkovChains.g:1125:1: rule__EdgeSpecs__Group__2__Impl : ( ( rule__EdgeSpecs__Group_2__0 )* ) ;
    public final void rule__EdgeSpecs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1129:1: ( ( ( rule__EdgeSpecs__Group_2__0 )* ) )
            // InternalMarkovChains.g:1130:1: ( ( rule__EdgeSpecs__Group_2__0 )* )
            {
            // InternalMarkovChains.g:1130:1: ( ( rule__EdgeSpecs__Group_2__0 )* )
            // InternalMarkovChains.g:1131:2: ( rule__EdgeSpecs__Group_2__0 )*
            {
             before(grammarAccess.getEdgeSpecsAccess().getGroup_2()); 
            // InternalMarkovChains.g:1132:2: ( rule__EdgeSpecs__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMarkovChains.g:1132:3: rule__EdgeSpecs__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__EdgeSpecs__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEdgeSpecsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EdgeSpecs__Group__2__Impl"


    // $ANTLR start "rule__EdgeSpecs__Group_2__0"
    // InternalMarkovChains.g:1141:1: rule__EdgeSpecs__Group_2__0 : rule__EdgeSpecs__Group_2__0__Impl rule__EdgeSpecs__Group_2__1 ;
    public final void rule__EdgeSpecs__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1145:1: ( rule__EdgeSpecs__Group_2__0__Impl rule__EdgeSpecs__Group_2__1 )
            // InternalMarkovChains.g:1146:2: rule__EdgeSpecs__Group_2__0__Impl rule__EdgeSpecs__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__EdgeSpecs__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeSpecs__Group_2__1();

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
    // $ANTLR end "rule__EdgeSpecs__Group_2__0"


    // $ANTLR start "rule__EdgeSpecs__Group_2__0__Impl"
    // InternalMarkovChains.g:1153:1: rule__EdgeSpecs__Group_2__0__Impl : ( ';' ) ;
    public final void rule__EdgeSpecs__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1157:1: ( ( ';' ) )
            // InternalMarkovChains.g:1158:1: ( ';' )
            {
            // InternalMarkovChains.g:1158:1: ( ';' )
            // InternalMarkovChains.g:1159:2: ';'
            {
             before(grammarAccess.getEdgeSpecsAccess().getSemicolonKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEdgeSpecsAccess().getSemicolonKeyword_2_0()); 

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
    // $ANTLR end "rule__EdgeSpecs__Group_2__0__Impl"


    // $ANTLR start "rule__EdgeSpecs__Group_2__1"
    // InternalMarkovChains.g:1168:1: rule__EdgeSpecs__Group_2__1 : rule__EdgeSpecs__Group_2__1__Impl ;
    public final void rule__EdgeSpecs__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1172:1: ( rule__EdgeSpecs__Group_2__1__Impl )
            // InternalMarkovChains.g:1173:2: rule__EdgeSpecs__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeSpecs__Group_2__1__Impl();

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
    // $ANTLR end "rule__EdgeSpecs__Group_2__1"


    // $ANTLR start "rule__EdgeSpecs__Group_2__1__Impl"
    // InternalMarkovChains.g:1179:1: rule__EdgeSpecs__Group_2__1__Impl : ( ( rule__EdgeSpecs__AnnotationsAssignment_2_1 ) ) ;
    public final void rule__EdgeSpecs__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1183:1: ( ( ( rule__EdgeSpecs__AnnotationsAssignment_2_1 ) ) )
            // InternalMarkovChains.g:1184:1: ( ( rule__EdgeSpecs__AnnotationsAssignment_2_1 ) )
            {
            // InternalMarkovChains.g:1184:1: ( ( rule__EdgeSpecs__AnnotationsAssignment_2_1 ) )
            // InternalMarkovChains.g:1185:2: ( rule__EdgeSpecs__AnnotationsAssignment_2_1 )
            {
             before(grammarAccess.getEdgeSpecsAccess().getAnnotationsAssignment_2_1()); 
            // InternalMarkovChains.g:1186:2: ( rule__EdgeSpecs__AnnotationsAssignment_2_1 )
            // InternalMarkovChains.g:1186:3: rule__EdgeSpecs__AnnotationsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeSpecs__AnnotationsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeSpecsAccess().getAnnotationsAssignment_2_1()); 

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
    // $ANTLR end "rule__EdgeSpecs__Group_2__1__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_0__0"
    // InternalMarkovChains.g:1195:1: rule__EdgeAnnotation__Group_0__0 : rule__EdgeAnnotation__Group_0__0__Impl rule__EdgeAnnotation__Group_0__1 ;
    public final void rule__EdgeAnnotation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1199:1: ( rule__EdgeAnnotation__Group_0__0__Impl rule__EdgeAnnotation__Group_0__1 )
            // InternalMarkovChains.g:1200:2: rule__EdgeAnnotation__Group_0__0__Impl rule__EdgeAnnotation__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__EdgeAnnotation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_0__1();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0__0"


    // $ANTLR start "rule__EdgeAnnotation__Group_0__0__Impl"
    // InternalMarkovChains.g:1207:1: rule__EdgeAnnotation__Group_0__0__Impl : ( 'probability' ) ;
    public final void rule__EdgeAnnotation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1211:1: ( ( 'probability' ) )
            // InternalMarkovChains.g:1212:1: ( 'probability' )
            {
            // InternalMarkovChains.g:1212:1: ( 'probability' )
            // InternalMarkovChains.g:1213:2: 'probability'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getProbabilityKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getProbabilityKeyword_0_0()); 

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0__0__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_0__1"
    // InternalMarkovChains.g:1222:1: rule__EdgeAnnotation__Group_0__1 : rule__EdgeAnnotation__Group_0__1__Impl rule__EdgeAnnotation__Group_0__2 ;
    public final void rule__EdgeAnnotation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1226:1: ( rule__EdgeAnnotation__Group_0__1__Impl rule__EdgeAnnotation__Group_0__2 )
            // InternalMarkovChains.g:1227:2: rule__EdgeAnnotation__Group_0__1__Impl rule__EdgeAnnotation__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__EdgeAnnotation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_0__2();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0__1"


    // $ANTLR start "rule__EdgeAnnotation__Group_0__1__Impl"
    // InternalMarkovChains.g:1234:1: rule__EdgeAnnotation__Group_0__1__Impl : ( ':' ) ;
    public final void rule__EdgeAnnotation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1238:1: ( ( ':' ) )
            // InternalMarkovChains.g:1239:1: ( ':' )
            {
            // InternalMarkovChains.g:1239:1: ( ':' )
            // InternalMarkovChains.g:1240:2: ':'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0__1__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_0__2"
    // InternalMarkovChains.g:1249:1: rule__EdgeAnnotation__Group_0__2 : rule__EdgeAnnotation__Group_0__2__Impl ;
    public final void rule__EdgeAnnotation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1253:1: ( rule__EdgeAnnotation__Group_0__2__Impl )
            // InternalMarkovChains.g:1254:2: rule__EdgeAnnotation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_0__2__Impl();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0__2"


    // $ANTLR start "rule__EdgeAnnotation__Group_0__2__Impl"
    // InternalMarkovChains.g:1260:1: rule__EdgeAnnotation__Group_0__2__Impl : ( ( rule__EdgeAnnotation__ProbabilityAssignment_0_2 ) ) ;
    public final void rule__EdgeAnnotation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1264:1: ( ( ( rule__EdgeAnnotation__ProbabilityAssignment_0_2 ) ) )
            // InternalMarkovChains.g:1265:1: ( ( rule__EdgeAnnotation__ProbabilityAssignment_0_2 ) )
            {
            // InternalMarkovChains.g:1265:1: ( ( rule__EdgeAnnotation__ProbabilityAssignment_0_2 ) )
            // InternalMarkovChains.g:1266:2: ( rule__EdgeAnnotation__ProbabilityAssignment_0_2 )
            {
             before(grammarAccess.getEdgeAnnotationAccess().getProbabilityAssignment_0_2()); 
            // InternalMarkovChains.g:1267:2: ( rule__EdgeAnnotation__ProbabilityAssignment_0_2 )
            // InternalMarkovChains.g:1267:3: rule__EdgeAnnotation__ProbabilityAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__ProbabilityAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAnnotationAccess().getProbabilityAssignment_0_2()); 

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0__2__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMarkovChains.g:1276:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1280:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMarkovChains.g:1281:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalMarkovChains.g:1288:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1292:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalMarkovChains.g:1293:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalMarkovChains.g:1293:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalMarkovChains.g:1294:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalMarkovChains.g:1295:2: ( rule__State__NameAssignment_0 )
            // InternalMarkovChains.g:1295:3: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalMarkovChains.g:1303:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1307:1: ( rule__State__Group__1__Impl )
            // InternalMarkovChains.g:1308:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__1__Impl();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalMarkovChains.g:1314:1: rule__State__Group__1__Impl : ( ( rule__State__SpecsAssignment_1 )? ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1318:1: ( ( ( rule__State__SpecsAssignment_1 )? ) )
            // InternalMarkovChains.g:1319:1: ( ( rule__State__SpecsAssignment_1 )? )
            {
            // InternalMarkovChains.g:1319:1: ( ( rule__State__SpecsAssignment_1 )? )
            // InternalMarkovChains.g:1320:2: ( rule__State__SpecsAssignment_1 )?
            {
             before(grammarAccess.getStateAccess().getSpecsAssignment_1()); 
            // InternalMarkovChains.g:1321:2: ( rule__State__SpecsAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMarkovChains.g:1321:3: rule__State__SpecsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__SpecsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getSpecsAssignment_1()); 

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
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__StateSpecs__Group__0"
    // InternalMarkovChains.g:1330:1: rule__StateSpecs__Group__0 : rule__StateSpecs__Group__0__Impl rule__StateSpecs__Group__1 ;
    public final void rule__StateSpecs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1334:1: ( rule__StateSpecs__Group__0__Impl rule__StateSpecs__Group__1 )
            // InternalMarkovChains.g:1335:2: rule__StateSpecs__Group__0__Impl rule__StateSpecs__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__StateSpecs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateSpecs__Group__1();

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
    // $ANTLR end "rule__StateSpecs__Group__0"


    // $ANTLR start "rule__StateSpecs__Group__0__Impl"
    // InternalMarkovChains.g:1342:1: rule__StateSpecs__Group__0__Impl : ( () ) ;
    public final void rule__StateSpecs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1346:1: ( ( () ) )
            // InternalMarkovChains.g:1347:1: ( () )
            {
            // InternalMarkovChains.g:1347:1: ( () )
            // InternalMarkovChains.g:1348:2: ()
            {
             before(grammarAccess.getStateSpecsAccess().getStateSpecsAction_0()); 
            // InternalMarkovChains.g:1349:2: ()
            // InternalMarkovChains.g:1349:3: 
            {
            }

             after(grammarAccess.getStateSpecsAccess().getStateSpecsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateSpecs__Group__0__Impl"


    // $ANTLR start "rule__StateSpecs__Group__1"
    // InternalMarkovChains.g:1357:1: rule__StateSpecs__Group__1 : rule__StateSpecs__Group__1__Impl rule__StateSpecs__Group__2 ;
    public final void rule__StateSpecs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1361:1: ( rule__StateSpecs__Group__1__Impl rule__StateSpecs__Group__2 )
            // InternalMarkovChains.g:1362:2: rule__StateSpecs__Group__1__Impl rule__StateSpecs__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__StateSpecs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateSpecs__Group__2();

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
    // $ANTLR end "rule__StateSpecs__Group__1"


    // $ANTLR start "rule__StateSpecs__Group__1__Impl"
    // InternalMarkovChains.g:1369:1: rule__StateSpecs__Group__1__Impl : ( '[' ) ;
    public final void rule__StateSpecs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1373:1: ( ( '[' ) )
            // InternalMarkovChains.g:1374:1: ( '[' )
            {
            // InternalMarkovChains.g:1374:1: ( '[' )
            // InternalMarkovChains.g:1375:2: '['
            {
             before(grammarAccess.getStateSpecsAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStateSpecsAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__StateSpecs__Group__1__Impl"


    // $ANTLR start "rule__StateSpecs__Group__2"
    // InternalMarkovChains.g:1384:1: rule__StateSpecs__Group__2 : rule__StateSpecs__Group__2__Impl rule__StateSpecs__Group__3 ;
    public final void rule__StateSpecs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1388:1: ( rule__StateSpecs__Group__2__Impl rule__StateSpecs__Group__3 )
            // InternalMarkovChains.g:1389:2: rule__StateSpecs__Group__2__Impl rule__StateSpecs__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__StateSpecs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateSpecs__Group__3();

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
    // $ANTLR end "rule__StateSpecs__Group__2"


    // $ANTLR start "rule__StateSpecs__Group__2__Impl"
    // InternalMarkovChains.g:1396:1: rule__StateSpecs__Group__2__Impl : ( ( rule__StateSpecs__AnnotationsAssignment_2 ) ) ;
    public final void rule__StateSpecs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1400:1: ( ( ( rule__StateSpecs__AnnotationsAssignment_2 ) ) )
            // InternalMarkovChains.g:1401:1: ( ( rule__StateSpecs__AnnotationsAssignment_2 ) )
            {
            // InternalMarkovChains.g:1401:1: ( ( rule__StateSpecs__AnnotationsAssignment_2 ) )
            // InternalMarkovChains.g:1402:2: ( rule__StateSpecs__AnnotationsAssignment_2 )
            {
             before(grammarAccess.getStateSpecsAccess().getAnnotationsAssignment_2()); 
            // InternalMarkovChains.g:1403:2: ( rule__StateSpecs__AnnotationsAssignment_2 )
            // InternalMarkovChains.g:1403:3: rule__StateSpecs__AnnotationsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateSpecs__AnnotationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateSpecsAccess().getAnnotationsAssignment_2()); 

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
    // $ANTLR end "rule__StateSpecs__Group__2__Impl"


    // $ANTLR start "rule__StateSpecs__Group__3"
    // InternalMarkovChains.g:1411:1: rule__StateSpecs__Group__3 : rule__StateSpecs__Group__3__Impl rule__StateSpecs__Group__4 ;
    public final void rule__StateSpecs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1415:1: ( rule__StateSpecs__Group__3__Impl rule__StateSpecs__Group__4 )
            // InternalMarkovChains.g:1416:2: rule__StateSpecs__Group__3__Impl rule__StateSpecs__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__StateSpecs__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateSpecs__Group__4();

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
    // $ANTLR end "rule__StateSpecs__Group__3"


    // $ANTLR start "rule__StateSpecs__Group__3__Impl"
    // InternalMarkovChains.g:1423:1: rule__StateSpecs__Group__3__Impl : ( ( rule__StateSpecs__Group_3__0 )* ) ;
    public final void rule__StateSpecs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1427:1: ( ( ( rule__StateSpecs__Group_3__0 )* ) )
            // InternalMarkovChains.g:1428:1: ( ( rule__StateSpecs__Group_3__0 )* )
            {
            // InternalMarkovChains.g:1428:1: ( ( rule__StateSpecs__Group_3__0 )* )
            // InternalMarkovChains.g:1429:2: ( rule__StateSpecs__Group_3__0 )*
            {
             before(grammarAccess.getStateSpecsAccess().getGroup_3()); 
            // InternalMarkovChains.g:1430:2: ( rule__StateSpecs__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMarkovChains.g:1430:3: rule__StateSpecs__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__StateSpecs__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStateSpecsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__StateSpecs__Group__3__Impl"


    // $ANTLR start "rule__StateSpecs__Group__4"
    // InternalMarkovChains.g:1438:1: rule__StateSpecs__Group__4 : rule__StateSpecs__Group__4__Impl ;
    public final void rule__StateSpecs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1442:1: ( rule__StateSpecs__Group__4__Impl )
            // InternalMarkovChains.g:1443:2: rule__StateSpecs__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateSpecs__Group__4__Impl();

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
    // $ANTLR end "rule__StateSpecs__Group__4"


    // $ANTLR start "rule__StateSpecs__Group__4__Impl"
    // InternalMarkovChains.g:1449:1: rule__StateSpecs__Group__4__Impl : ( ']' ) ;
    public final void rule__StateSpecs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1453:1: ( ( ']' ) )
            // InternalMarkovChains.g:1454:1: ( ']' )
            {
            // InternalMarkovChains.g:1454:1: ( ']' )
            // InternalMarkovChains.g:1455:2: ']'
            {
             before(grammarAccess.getStateSpecsAccess().getRightSquareBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStateSpecsAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__StateSpecs__Group__4__Impl"


    // $ANTLR start "rule__StateSpecs__Group_3__0"
    // InternalMarkovChains.g:1465:1: rule__StateSpecs__Group_3__0 : rule__StateSpecs__Group_3__0__Impl rule__StateSpecs__Group_3__1 ;
    public final void rule__StateSpecs__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1469:1: ( rule__StateSpecs__Group_3__0__Impl rule__StateSpecs__Group_3__1 )
            // InternalMarkovChains.g:1470:2: rule__StateSpecs__Group_3__0__Impl rule__StateSpecs__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__StateSpecs__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateSpecs__Group_3__1();

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
    // $ANTLR end "rule__StateSpecs__Group_3__0"


    // $ANTLR start "rule__StateSpecs__Group_3__0__Impl"
    // InternalMarkovChains.g:1477:1: rule__StateSpecs__Group_3__0__Impl : ( ';' ) ;
    public final void rule__StateSpecs__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1481:1: ( ( ';' ) )
            // InternalMarkovChains.g:1482:1: ( ';' )
            {
            // InternalMarkovChains.g:1482:1: ( ';' )
            // InternalMarkovChains.g:1483:2: ';'
            {
             before(grammarAccess.getStateSpecsAccess().getSemicolonKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStateSpecsAccess().getSemicolonKeyword_3_0()); 

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
    // $ANTLR end "rule__StateSpecs__Group_3__0__Impl"


    // $ANTLR start "rule__StateSpecs__Group_3__1"
    // InternalMarkovChains.g:1492:1: rule__StateSpecs__Group_3__1 : rule__StateSpecs__Group_3__1__Impl ;
    public final void rule__StateSpecs__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1496:1: ( rule__StateSpecs__Group_3__1__Impl )
            // InternalMarkovChains.g:1497:2: rule__StateSpecs__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateSpecs__Group_3__1__Impl();

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
    // $ANTLR end "rule__StateSpecs__Group_3__1"


    // $ANTLR start "rule__StateSpecs__Group_3__1__Impl"
    // InternalMarkovChains.g:1503:1: rule__StateSpecs__Group_3__1__Impl : ( ( rule__StateSpecs__AnnotationsAssignment_3_1 ) ) ;
    public final void rule__StateSpecs__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1507:1: ( ( ( rule__StateSpecs__AnnotationsAssignment_3_1 ) ) )
            // InternalMarkovChains.g:1508:1: ( ( rule__StateSpecs__AnnotationsAssignment_3_1 ) )
            {
            // InternalMarkovChains.g:1508:1: ( ( rule__StateSpecs__AnnotationsAssignment_3_1 ) )
            // InternalMarkovChains.g:1509:2: ( rule__StateSpecs__AnnotationsAssignment_3_1 )
            {
             before(grammarAccess.getStateSpecsAccess().getAnnotationsAssignment_3_1()); 
            // InternalMarkovChains.g:1510:2: ( rule__StateSpecs__AnnotationsAssignment_3_1 )
            // InternalMarkovChains.g:1510:3: rule__StateSpecs__AnnotationsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StateSpecs__AnnotationsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateSpecsAccess().getAnnotationsAssignment_3_1()); 

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
    // $ANTLR end "rule__StateSpecs__Group_3__1__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_0__0"
    // InternalMarkovChains.g:1519:1: rule__StateAnnotation__Group_0__0 : rule__StateAnnotation__Group_0__0__Impl rule__StateAnnotation__Group_0__1 ;
    public final void rule__StateAnnotation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1523:1: ( rule__StateAnnotation__Group_0__0__Impl rule__StateAnnotation__Group_0__1 )
            // InternalMarkovChains.g:1524:2: rule__StateAnnotation__Group_0__0__Impl rule__StateAnnotation__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__StateAnnotation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_0__1();

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
    // $ANTLR end "rule__StateAnnotation__Group_0__0"


    // $ANTLR start "rule__StateAnnotation__Group_0__0__Impl"
    // InternalMarkovChains.g:1531:1: rule__StateAnnotation__Group_0__0__Impl : ( ( rule__StateAnnotation__Group_0_0__0 ) ) ;
    public final void rule__StateAnnotation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1535:1: ( ( ( rule__StateAnnotation__Group_0_0__0 ) ) )
            // InternalMarkovChains.g:1536:1: ( ( rule__StateAnnotation__Group_0_0__0 ) )
            {
            // InternalMarkovChains.g:1536:1: ( ( rule__StateAnnotation__Group_0_0__0 ) )
            // InternalMarkovChains.g:1537:2: ( rule__StateAnnotation__Group_0_0__0 )
            {
             before(grammarAccess.getStateAnnotationAccess().getGroup_0_0()); 
            // InternalMarkovChains.g:1538:2: ( rule__StateAnnotation__Group_0_0__0 )
            // InternalMarkovChains.g:1538:3: rule__StateAnnotation__Group_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_0_0__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAnnotationAccess().getGroup_0_0()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_0__0__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_0__1"
    // InternalMarkovChains.g:1546:1: rule__StateAnnotation__Group_0__1 : rule__StateAnnotation__Group_0__1__Impl ;
    public final void rule__StateAnnotation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1550:1: ( rule__StateAnnotation__Group_0__1__Impl )
            // InternalMarkovChains.g:1551:2: rule__StateAnnotation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_0__1__Impl();

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
    // $ANTLR end "rule__StateAnnotation__Group_0__1"


    // $ANTLR start "rule__StateAnnotation__Group_0__1__Impl"
    // InternalMarkovChains.g:1557:1: rule__StateAnnotation__Group_0__1__Impl : ( ( rule__StateAnnotation__InitprobAssignment_0_1 ) ) ;
    public final void rule__StateAnnotation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1561:1: ( ( ( rule__StateAnnotation__InitprobAssignment_0_1 ) ) )
            // InternalMarkovChains.g:1562:1: ( ( rule__StateAnnotation__InitprobAssignment_0_1 ) )
            {
            // InternalMarkovChains.g:1562:1: ( ( rule__StateAnnotation__InitprobAssignment_0_1 ) )
            // InternalMarkovChains.g:1563:2: ( rule__StateAnnotation__InitprobAssignment_0_1 )
            {
             before(grammarAccess.getStateAnnotationAccess().getInitprobAssignment_0_1()); 
            // InternalMarkovChains.g:1564:2: ( rule__StateAnnotation__InitprobAssignment_0_1 )
            // InternalMarkovChains.g:1564:3: rule__StateAnnotation__InitprobAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__InitprobAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAnnotationAccess().getInitprobAssignment_0_1()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_0__1__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_0_0__0"
    // InternalMarkovChains.g:1573:1: rule__StateAnnotation__Group_0_0__0 : rule__StateAnnotation__Group_0_0__0__Impl rule__StateAnnotation__Group_0_0__1 ;
    public final void rule__StateAnnotation__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1577:1: ( rule__StateAnnotation__Group_0_0__0__Impl rule__StateAnnotation__Group_0_0__1 )
            // InternalMarkovChains.g:1578:2: rule__StateAnnotation__Group_0_0__0__Impl rule__StateAnnotation__Group_0_0__1
            {
            pushFollow(FOLLOW_16);
            rule__StateAnnotation__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_0_0__1();

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
    // $ANTLR end "rule__StateAnnotation__Group_0_0__0"


    // $ANTLR start "rule__StateAnnotation__Group_0_0__0__Impl"
    // InternalMarkovChains.g:1585:1: rule__StateAnnotation__Group_0_0__0__Impl : ( ( rule__StateAnnotation__Alternatives_0_0_0 ) ) ;
    public final void rule__StateAnnotation__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1589:1: ( ( ( rule__StateAnnotation__Alternatives_0_0_0 ) ) )
            // InternalMarkovChains.g:1590:1: ( ( rule__StateAnnotation__Alternatives_0_0_0 ) )
            {
            // InternalMarkovChains.g:1590:1: ( ( rule__StateAnnotation__Alternatives_0_0_0 ) )
            // InternalMarkovChains.g:1591:2: ( rule__StateAnnotation__Alternatives_0_0_0 )
            {
             before(grammarAccess.getStateAnnotationAccess().getAlternatives_0_0_0()); 
            // InternalMarkovChains.g:1592:2: ( rule__StateAnnotation__Alternatives_0_0_0 )
            // InternalMarkovChains.g:1592:3: rule__StateAnnotation__Alternatives_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Alternatives_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAnnotationAccess().getAlternatives_0_0_0()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_0_0__0__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_0_0__1"
    // InternalMarkovChains.g:1600:1: rule__StateAnnotation__Group_0_0__1 : rule__StateAnnotation__Group_0_0__1__Impl ;
    public final void rule__StateAnnotation__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1604:1: ( rule__StateAnnotation__Group_0_0__1__Impl )
            // InternalMarkovChains.g:1605:2: rule__StateAnnotation__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_0_0__1__Impl();

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
    // $ANTLR end "rule__StateAnnotation__Group_0_0__1"


    // $ANTLR start "rule__StateAnnotation__Group_0_0__1__Impl"
    // InternalMarkovChains.g:1611:1: rule__StateAnnotation__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__StateAnnotation__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1615:1: ( ( ':' ) )
            // InternalMarkovChains.g:1616:1: ( ':' )
            {
            // InternalMarkovChains.g:1616:1: ( ':' )
            // InternalMarkovChains.g:1617:2: ':'
            {
             before(grammarAccess.getStateAnnotationAccess().getColonKeyword_0_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStateAnnotationAccess().getColonKeyword_0_0_1()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_0_0__1__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_0_0_0_0__0"
    // InternalMarkovChains.g:1627:1: rule__StateAnnotation__Group_0_0_0_0__0 : rule__StateAnnotation__Group_0_0_0_0__0__Impl rule__StateAnnotation__Group_0_0_0_0__1 ;
    public final void rule__StateAnnotation__Group_0_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1631:1: ( rule__StateAnnotation__Group_0_0_0_0__0__Impl rule__StateAnnotation__Group_0_0_0_0__1 )
            // InternalMarkovChains.g:1632:2: rule__StateAnnotation__Group_0_0_0_0__0__Impl rule__StateAnnotation__Group_0_0_0_0__1
            {
            pushFollow(FOLLOW_20);
            rule__StateAnnotation__Group_0_0_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_0_0_0_0__1();

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
    // $ANTLR end "rule__StateAnnotation__Group_0_0_0_0__0"


    // $ANTLR start "rule__StateAnnotation__Group_0_0_0_0__0__Impl"
    // InternalMarkovChains.g:1639:1: rule__StateAnnotation__Group_0_0_0_0__0__Impl : ( 'initial' ) ;
    public final void rule__StateAnnotation__Group_0_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1643:1: ( ( 'initial' ) )
            // InternalMarkovChains.g:1644:1: ( 'initial' )
            {
            // InternalMarkovChains.g:1644:1: ( 'initial' )
            // InternalMarkovChains.g:1645:2: 'initial'
            {
             before(grammarAccess.getStateAnnotationAccess().getInitialKeyword_0_0_0_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStateAnnotationAccess().getInitialKeyword_0_0_0_0_0()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_0_0_0_0__0__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_0_0_0_0__1"
    // InternalMarkovChains.g:1654:1: rule__StateAnnotation__Group_0_0_0_0__1 : rule__StateAnnotation__Group_0_0_0_0__1__Impl ;
    public final void rule__StateAnnotation__Group_0_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1658:1: ( rule__StateAnnotation__Group_0_0_0_0__1__Impl )
            // InternalMarkovChains.g:1659:2: rule__StateAnnotation__Group_0_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_0_0_0_0__1__Impl();

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
    // $ANTLR end "rule__StateAnnotation__Group_0_0_0_0__1"


    // $ANTLR start "rule__StateAnnotation__Group_0_0_0_0__1__Impl"
    // InternalMarkovChains.g:1665:1: rule__StateAnnotation__Group_0_0_0_0__1__Impl : ( 'probability' ) ;
    public final void rule__StateAnnotation__Group_0_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1669:1: ( ( 'probability' ) )
            // InternalMarkovChains.g:1670:1: ( 'probability' )
            {
            // InternalMarkovChains.g:1670:1: ( 'probability' )
            // InternalMarkovChains.g:1671:2: 'probability'
            {
             before(grammarAccess.getStateAnnotationAccess().getProbabilityKeyword_0_0_0_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStateAnnotationAccess().getProbabilityKeyword_0_0_0_0_1()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_0_0_0_0__1__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_1__0"
    // InternalMarkovChains.g:1681:1: rule__StateAnnotation__Group_1__0 : rule__StateAnnotation__Group_1__0__Impl rule__StateAnnotation__Group_1__1 ;
    public final void rule__StateAnnotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1685:1: ( rule__StateAnnotation__Group_1__0__Impl rule__StateAnnotation__Group_1__1 )
            // InternalMarkovChains.g:1686:2: rule__StateAnnotation__Group_1__0__Impl rule__StateAnnotation__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__StateAnnotation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_1__1();

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
    // $ANTLR end "rule__StateAnnotation__Group_1__0"


    // $ANTLR start "rule__StateAnnotation__Group_1__0__Impl"
    // InternalMarkovChains.g:1693:1: rule__StateAnnotation__Group_1__0__Impl : ( ( rule__StateAnnotation__Group_1_0__0 ) ) ;
    public final void rule__StateAnnotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1697:1: ( ( ( rule__StateAnnotation__Group_1_0__0 ) ) )
            // InternalMarkovChains.g:1698:1: ( ( rule__StateAnnotation__Group_1_0__0 ) )
            {
            // InternalMarkovChains.g:1698:1: ( ( rule__StateAnnotation__Group_1_0__0 ) )
            // InternalMarkovChains.g:1699:2: ( rule__StateAnnotation__Group_1_0__0 )
            {
             before(grammarAccess.getStateAnnotationAccess().getGroup_1_0()); 
            // InternalMarkovChains.g:1700:2: ( rule__StateAnnotation__Group_1_0__0 )
            // InternalMarkovChains.g:1700:3: rule__StateAnnotation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAnnotationAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_1__0__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_1__1"
    // InternalMarkovChains.g:1708:1: rule__StateAnnotation__Group_1__1 : rule__StateAnnotation__Group_1__1__Impl ;
    public final void rule__StateAnnotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1712:1: ( rule__StateAnnotation__Group_1__1__Impl )
            // InternalMarkovChains.g:1713:2: rule__StateAnnotation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_1__1__Impl();

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
    // $ANTLR end "rule__StateAnnotation__Group_1__1"


    // $ANTLR start "rule__StateAnnotation__Group_1__1__Impl"
    // InternalMarkovChains.g:1719:1: rule__StateAnnotation__Group_1__1__Impl : ( ( rule__StateAnnotation__RewardAssignment_1_1 ) ) ;
    public final void rule__StateAnnotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1723:1: ( ( ( rule__StateAnnotation__RewardAssignment_1_1 ) ) )
            // InternalMarkovChains.g:1724:1: ( ( rule__StateAnnotation__RewardAssignment_1_1 ) )
            {
            // InternalMarkovChains.g:1724:1: ( ( rule__StateAnnotation__RewardAssignment_1_1 ) )
            // InternalMarkovChains.g:1725:2: ( rule__StateAnnotation__RewardAssignment_1_1 )
            {
             before(grammarAccess.getStateAnnotationAccess().getRewardAssignment_1_1()); 
            // InternalMarkovChains.g:1726:2: ( rule__StateAnnotation__RewardAssignment_1_1 )
            // InternalMarkovChains.g:1726:3: rule__StateAnnotation__RewardAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__RewardAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAnnotationAccess().getRewardAssignment_1_1()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_1__1__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_1_0__0"
    // InternalMarkovChains.g:1735:1: rule__StateAnnotation__Group_1_0__0 : rule__StateAnnotation__Group_1_0__0__Impl rule__StateAnnotation__Group_1_0__1 ;
    public final void rule__StateAnnotation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1739:1: ( rule__StateAnnotation__Group_1_0__0__Impl rule__StateAnnotation__Group_1_0__1 )
            // InternalMarkovChains.g:1740:2: rule__StateAnnotation__Group_1_0__0__Impl rule__StateAnnotation__Group_1_0__1
            {
            pushFollow(FOLLOW_16);
            rule__StateAnnotation__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_1_0__1();

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
    // $ANTLR end "rule__StateAnnotation__Group_1_0__0"


    // $ANTLR start "rule__StateAnnotation__Group_1_0__0__Impl"
    // InternalMarkovChains.g:1747:1: rule__StateAnnotation__Group_1_0__0__Impl : ( ( rule__StateAnnotation__Alternatives_1_0_0 ) ) ;
    public final void rule__StateAnnotation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1751:1: ( ( ( rule__StateAnnotation__Alternatives_1_0_0 ) ) )
            // InternalMarkovChains.g:1752:1: ( ( rule__StateAnnotation__Alternatives_1_0_0 ) )
            {
            // InternalMarkovChains.g:1752:1: ( ( rule__StateAnnotation__Alternatives_1_0_0 ) )
            // InternalMarkovChains.g:1753:2: ( rule__StateAnnotation__Alternatives_1_0_0 )
            {
             before(grammarAccess.getStateAnnotationAccess().getAlternatives_1_0_0()); 
            // InternalMarkovChains.g:1754:2: ( rule__StateAnnotation__Alternatives_1_0_0 )
            // InternalMarkovChains.g:1754:3: rule__StateAnnotation__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Alternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAnnotationAccess().getAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_1_0__0__Impl"


    // $ANTLR start "rule__StateAnnotation__Group_1_0__1"
    // InternalMarkovChains.g:1762:1: rule__StateAnnotation__Group_1_0__1 : rule__StateAnnotation__Group_1_0__1__Impl ;
    public final void rule__StateAnnotation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1766:1: ( rule__StateAnnotation__Group_1_0__1__Impl )
            // InternalMarkovChains.g:1767:2: rule__StateAnnotation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateAnnotation__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__StateAnnotation__Group_1_0__1"


    // $ANTLR start "rule__StateAnnotation__Group_1_0__1__Impl"
    // InternalMarkovChains.g:1773:1: rule__StateAnnotation__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__StateAnnotation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1777:1: ( ( ':' ) )
            // InternalMarkovChains.g:1778:1: ( ':' )
            {
            // InternalMarkovChains.g:1778:1: ( ':' )
            // InternalMarkovChains.g:1779:2: ':'
            {
             before(grammarAccess.getStateAnnotationAccess().getColonKeyword_1_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStateAnnotationAccess().getColonKeyword_1_0_1()); 

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
    // $ANTLR end "rule__StateAnnotation__Group_1_0__1__Impl"


    // $ANTLR start "rule__PosRatio__Group__0"
    // InternalMarkovChains.g:1789:1: rule__PosRatio__Group__0 : rule__PosRatio__Group__0__Impl rule__PosRatio__Group__1 ;
    public final void rule__PosRatio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1793:1: ( rule__PosRatio__Group__0__Impl rule__PosRatio__Group__1 )
            // InternalMarkovChains.g:1794:2: rule__PosRatio__Group__0__Impl rule__PosRatio__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__PosRatio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosRatio__Group__1();

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
    // $ANTLR end "rule__PosRatio__Group__0"


    // $ANTLR start "rule__PosRatio__Group__0__Impl"
    // InternalMarkovChains.g:1801:1: rule__PosRatio__Group__0__Impl : ( ( rule__PosRatio__NumeratorAssignment_0 ) ) ;
    public final void rule__PosRatio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1805:1: ( ( ( rule__PosRatio__NumeratorAssignment_0 ) ) )
            // InternalMarkovChains.g:1806:1: ( ( rule__PosRatio__NumeratorAssignment_0 ) )
            {
            // InternalMarkovChains.g:1806:1: ( ( rule__PosRatio__NumeratorAssignment_0 ) )
            // InternalMarkovChains.g:1807:2: ( rule__PosRatio__NumeratorAssignment_0 )
            {
             before(grammarAccess.getPosRatioAccess().getNumeratorAssignment_0()); 
            // InternalMarkovChains.g:1808:2: ( rule__PosRatio__NumeratorAssignment_0 )
            // InternalMarkovChains.g:1808:3: rule__PosRatio__NumeratorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PosRatio__NumeratorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPosRatioAccess().getNumeratorAssignment_0()); 

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
    // $ANTLR end "rule__PosRatio__Group__0__Impl"


    // $ANTLR start "rule__PosRatio__Group__1"
    // InternalMarkovChains.g:1816:1: rule__PosRatio__Group__1 : rule__PosRatio__Group__1__Impl rule__PosRatio__Group__2 ;
    public final void rule__PosRatio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1820:1: ( rule__PosRatio__Group__1__Impl rule__PosRatio__Group__2 )
            // InternalMarkovChains.g:1821:2: rule__PosRatio__Group__1__Impl rule__PosRatio__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__PosRatio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosRatio__Group__2();

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
    // $ANTLR end "rule__PosRatio__Group__1"


    // $ANTLR start "rule__PosRatio__Group__1__Impl"
    // InternalMarkovChains.g:1828:1: rule__PosRatio__Group__1__Impl : ( '/' ) ;
    public final void rule__PosRatio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1832:1: ( ( '/' ) )
            // InternalMarkovChains.g:1833:1: ( '/' )
            {
            // InternalMarkovChains.g:1833:1: ( '/' )
            // InternalMarkovChains.g:1834:2: '/'
            {
             before(grammarAccess.getPosRatioAccess().getSolidusKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPosRatioAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__PosRatio__Group__1__Impl"


    // $ANTLR start "rule__PosRatio__Group__2"
    // InternalMarkovChains.g:1843:1: rule__PosRatio__Group__2 : rule__PosRatio__Group__2__Impl ;
    public final void rule__PosRatio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1847:1: ( rule__PosRatio__Group__2__Impl )
            // InternalMarkovChains.g:1848:2: rule__PosRatio__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PosRatio__Group__2__Impl();

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
    // $ANTLR end "rule__PosRatio__Group__2"


    // $ANTLR start "rule__PosRatio__Group__2__Impl"
    // InternalMarkovChains.g:1854:1: rule__PosRatio__Group__2__Impl : ( ( rule__PosRatio__DenominatorAssignment_2 ) ) ;
    public final void rule__PosRatio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1858:1: ( ( ( rule__PosRatio__DenominatorAssignment_2 ) ) )
            // InternalMarkovChains.g:1859:1: ( ( rule__PosRatio__DenominatorAssignment_2 ) )
            {
            // InternalMarkovChains.g:1859:1: ( ( rule__PosRatio__DenominatorAssignment_2 ) )
            // InternalMarkovChains.g:1860:2: ( rule__PosRatio__DenominatorAssignment_2 )
            {
             before(grammarAccess.getPosRatioAccess().getDenominatorAssignment_2()); 
            // InternalMarkovChains.g:1861:2: ( rule__PosRatio__DenominatorAssignment_2 )
            // InternalMarkovChains.g:1861:3: rule__PosRatio__DenominatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PosRatio__DenominatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPosRatioAccess().getDenominatorAssignment_2()); 

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
    // $ANTLR end "rule__PosRatio__Group__2__Impl"


    // $ANTLR start "rule__PosNegRatio__Group__0"
    // InternalMarkovChains.g:1870:1: rule__PosNegRatio__Group__0 : rule__PosNegRatio__Group__0__Impl rule__PosNegRatio__Group__1 ;
    public final void rule__PosNegRatio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1874:1: ( rule__PosNegRatio__Group__0__Impl rule__PosNegRatio__Group__1 )
            // InternalMarkovChains.g:1875:2: rule__PosNegRatio__Group__0__Impl rule__PosNegRatio__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__PosNegRatio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosNegRatio__Group__1();

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
    // $ANTLR end "rule__PosNegRatio__Group__0"


    // $ANTLR start "rule__PosNegRatio__Group__0__Impl"
    // InternalMarkovChains.g:1882:1: rule__PosNegRatio__Group__0__Impl : ( ( rule__PosNegRatio__Alternatives_0 ) ) ;
    public final void rule__PosNegRatio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1886:1: ( ( ( rule__PosNegRatio__Alternatives_0 ) ) )
            // InternalMarkovChains.g:1887:1: ( ( rule__PosNegRatio__Alternatives_0 ) )
            {
            // InternalMarkovChains.g:1887:1: ( ( rule__PosNegRatio__Alternatives_0 ) )
            // InternalMarkovChains.g:1888:2: ( rule__PosNegRatio__Alternatives_0 )
            {
             before(grammarAccess.getPosNegRatioAccess().getAlternatives_0()); 
            // InternalMarkovChains.g:1889:2: ( rule__PosNegRatio__Alternatives_0 )
            // InternalMarkovChains.g:1889:3: rule__PosNegRatio__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PosNegRatio__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPosNegRatioAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__PosNegRatio__Group__0__Impl"


    // $ANTLR start "rule__PosNegRatio__Group__1"
    // InternalMarkovChains.g:1897:1: rule__PosNegRatio__Group__1 : rule__PosNegRatio__Group__1__Impl rule__PosNegRatio__Group__2 ;
    public final void rule__PosNegRatio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1901:1: ( rule__PosNegRatio__Group__1__Impl rule__PosNegRatio__Group__2 )
            // InternalMarkovChains.g:1902:2: rule__PosNegRatio__Group__1__Impl rule__PosNegRatio__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__PosNegRatio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosNegRatio__Group__2();

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
    // $ANTLR end "rule__PosNegRatio__Group__1"


    // $ANTLR start "rule__PosNegRatio__Group__1__Impl"
    // InternalMarkovChains.g:1909:1: rule__PosNegRatio__Group__1__Impl : ( '/' ) ;
    public final void rule__PosNegRatio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1913:1: ( ( '/' ) )
            // InternalMarkovChains.g:1914:1: ( '/' )
            {
            // InternalMarkovChains.g:1914:1: ( '/' )
            // InternalMarkovChains.g:1915:2: '/'
            {
             before(grammarAccess.getPosNegRatioAccess().getSolidusKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPosNegRatioAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__PosNegRatio__Group__1__Impl"


    // $ANTLR start "rule__PosNegRatio__Group__2"
    // InternalMarkovChains.g:1924:1: rule__PosNegRatio__Group__2 : rule__PosNegRatio__Group__2__Impl ;
    public final void rule__PosNegRatio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1928:1: ( rule__PosNegRatio__Group__2__Impl )
            // InternalMarkovChains.g:1929:2: rule__PosNegRatio__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PosNegRatio__Group__2__Impl();

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
    // $ANTLR end "rule__PosNegRatio__Group__2"


    // $ANTLR start "rule__PosNegRatio__Group__2__Impl"
    // InternalMarkovChains.g:1935:1: rule__PosNegRatio__Group__2__Impl : ( ( rule__PosNegRatio__DenominatorAssignment_2 ) ) ;
    public final void rule__PosNegRatio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1939:1: ( ( ( rule__PosNegRatio__DenominatorAssignment_2 ) ) )
            // InternalMarkovChains.g:1940:1: ( ( rule__PosNegRatio__DenominatorAssignment_2 ) )
            {
            // InternalMarkovChains.g:1940:1: ( ( rule__PosNegRatio__DenominatorAssignment_2 ) )
            // InternalMarkovChains.g:1941:2: ( rule__PosNegRatio__DenominatorAssignment_2 )
            {
             before(grammarAccess.getPosNegRatioAccess().getDenominatorAssignment_2()); 
            // InternalMarkovChains.g:1942:2: ( rule__PosNegRatio__DenominatorAssignment_2 )
            // InternalMarkovChains.g:1942:3: rule__PosNegRatio__DenominatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PosNegRatio__DenominatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPosNegRatioAccess().getDenominatorAssignment_2()); 

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
    // $ANTLR end "rule__PosNegRatio__Group__2__Impl"


    // $ANTLR start "rule__MarkovChainModel__AuthorAssignment_0_2"
    // InternalMarkovChains.g:1951:1: rule__MarkovChainModel__AuthorAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__MarkovChainModel__AuthorAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1955:1: ( ( RULE_ID ) )
            // InternalMarkovChains.g:1956:2: ( RULE_ID )
            {
            // InternalMarkovChains.g:1956:2: ( RULE_ID )
            // InternalMarkovChains.g:1957:3: RULE_ID
            {
             before(grammarAccess.getMarkovChainModelAccess().getAuthorIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMarkovChainModelAccess().getAuthorIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__MarkovChainModel__AuthorAssignment_0_2"


    // $ANTLR start "rule__MarkovChainModel__NameAssignment_3"
    // InternalMarkovChains.g:1966:1: rule__MarkovChainModel__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__MarkovChainModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1970:1: ( ( RULE_ID ) )
            // InternalMarkovChains.g:1971:2: ( RULE_ID )
            {
            // InternalMarkovChains.g:1971:2: ( RULE_ID )
            // InternalMarkovChains.g:1972:3: RULE_ID
            {
             before(grammarAccess.getMarkovChainModelAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMarkovChainModelAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__MarkovChainModel__NameAssignment_3"


    // $ANTLR start "rule__MarkovChainModel__EdgesAssignment_5"
    // InternalMarkovChains.g:1981:1: rule__MarkovChainModel__EdgesAssignment_5 : ( ruleEdge ) ;
    public final void rule__MarkovChainModel__EdgesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:1985:1: ( ( ruleEdge ) )
            // InternalMarkovChains.g:1986:2: ( ruleEdge )
            {
            // InternalMarkovChains.g:1986:2: ( ruleEdge )
            // InternalMarkovChains.g:1987:3: ruleEdge
            {
             before(grammarAccess.getMarkovChainModelAccess().getEdgesEdgeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getMarkovChainModelAccess().getEdgesEdgeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__MarkovChainModel__EdgesAssignment_5"


    // $ANTLR start "rule__Edge__SrcstateAssignment_0_0"
    // InternalMarkovChains.g:1996:1: rule__Edge__SrcstateAssignment_0_0 : ( ruleState ) ;
    public final void rule__Edge__SrcstateAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2000:1: ( ( ruleState ) )
            // InternalMarkovChains.g:2001:2: ( ruleState )
            {
            // InternalMarkovChains.g:2001:2: ( ruleState )
            // InternalMarkovChains.g:2002:3: ruleState
            {
             before(grammarAccess.getEdgeAccess().getSrcstateStateParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getSrcstateStateParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Edge__SrcstateAssignment_0_0"


    // $ANTLR start "rule__Edge__DststateAssignment_0_3"
    // InternalMarkovChains.g:2011:1: rule__Edge__DststateAssignment_0_3 : ( ruleState ) ;
    public final void rule__Edge__DststateAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2015:1: ( ( ruleState ) )
            // InternalMarkovChains.g:2016:2: ( ruleState )
            {
            // InternalMarkovChains.g:2016:2: ( ruleState )
            // InternalMarkovChains.g:2017:3: ruleState
            {
             before(grammarAccess.getEdgeAccess().getDststateStateParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getDststateStateParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Edge__DststateAssignment_0_3"


    // $ANTLR start "rule__Edge__SrcstateAssignment_1_0"
    // InternalMarkovChains.g:2026:1: rule__Edge__SrcstateAssignment_1_0 : ( ruleState ) ;
    public final void rule__Edge__SrcstateAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2030:1: ( ( ruleState ) )
            // InternalMarkovChains.g:2031:2: ( ruleState )
            {
            // InternalMarkovChains.g:2031:2: ( ruleState )
            // InternalMarkovChains.g:2032:3: ruleState
            {
             before(grammarAccess.getEdgeAccess().getSrcstateStateParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getSrcstateStateParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Edge__SrcstateAssignment_1_0"


    // $ANTLR start "rule__Edge__SpecsAssignment_1_2"
    // InternalMarkovChains.g:2041:1: rule__Edge__SpecsAssignment_1_2 : ( ruleEdgeSpecs ) ;
    public final void rule__Edge__SpecsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2045:1: ( ( ruleEdgeSpecs ) )
            // InternalMarkovChains.g:2046:2: ( ruleEdgeSpecs )
            {
            // InternalMarkovChains.g:2046:2: ( ruleEdgeSpecs )
            // InternalMarkovChains.g:2047:3: ruleEdgeSpecs
            {
             before(grammarAccess.getEdgeAccess().getSpecsEdgeSpecsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEdgeSpecs();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getSpecsEdgeSpecsParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Edge__SpecsAssignment_1_2"


    // $ANTLR start "rule__Edge__DststateAssignment_1_5"
    // InternalMarkovChains.g:2056:1: rule__Edge__DststateAssignment_1_5 : ( ruleState ) ;
    public final void rule__Edge__DststateAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2060:1: ( ( ruleState ) )
            // InternalMarkovChains.g:2061:2: ( ruleState )
            {
            // InternalMarkovChains.g:2061:2: ( ruleState )
            // InternalMarkovChains.g:2062:3: ruleState
            {
             before(grammarAccess.getEdgeAccess().getDststateStateParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getDststateStateParserRuleCall_1_5_0()); 

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
    // $ANTLR end "rule__Edge__DststateAssignment_1_5"


    // $ANTLR start "rule__EdgeSpecs__AnnotationsAssignment_1"
    // InternalMarkovChains.g:2071:1: rule__EdgeSpecs__AnnotationsAssignment_1 : ( ruleEdgeAnnotation ) ;
    public final void rule__EdgeSpecs__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2075:1: ( ( ruleEdgeAnnotation ) )
            // InternalMarkovChains.g:2076:2: ( ruleEdgeAnnotation )
            {
            // InternalMarkovChains.g:2076:2: ( ruleEdgeAnnotation )
            // InternalMarkovChains.g:2077:3: ruleEdgeAnnotation
            {
             before(grammarAccess.getEdgeSpecsAccess().getAnnotationsEdgeAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEdgeAnnotation();

            state._fsp--;

             after(grammarAccess.getEdgeSpecsAccess().getAnnotationsEdgeAnnotationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EdgeSpecs__AnnotationsAssignment_1"


    // $ANTLR start "rule__EdgeSpecs__AnnotationsAssignment_2_1"
    // InternalMarkovChains.g:2086:1: rule__EdgeSpecs__AnnotationsAssignment_2_1 : ( ruleEdgeAnnotation ) ;
    public final void rule__EdgeSpecs__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2090:1: ( ( ruleEdgeAnnotation ) )
            // InternalMarkovChains.g:2091:2: ( ruleEdgeAnnotation )
            {
            // InternalMarkovChains.g:2091:2: ( ruleEdgeAnnotation )
            // InternalMarkovChains.g:2092:3: ruleEdgeAnnotation
            {
             before(grammarAccess.getEdgeSpecsAccess().getAnnotationsEdgeAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEdgeAnnotation();

            state._fsp--;

             after(grammarAccess.getEdgeSpecsAccess().getAnnotationsEdgeAnnotationParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__EdgeSpecs__AnnotationsAssignment_2_1"


    // $ANTLR start "rule__EdgeAnnotation__ProbabilityAssignment_0_2"
    // InternalMarkovChains.g:2101:1: rule__EdgeAnnotation__ProbabilityAssignment_0_2 : ( ruleProbability ) ;
    public final void rule__EdgeAnnotation__ProbabilityAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2105:1: ( ( ruleProbability ) )
            // InternalMarkovChains.g:2106:2: ( ruleProbability )
            {
            // InternalMarkovChains.g:2106:2: ( ruleProbability )
            // InternalMarkovChains.g:2107:3: ruleProbability
            {
             before(grammarAccess.getEdgeAnnotationAccess().getProbabilityProbabilityParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getEdgeAnnotationAccess().getProbabilityProbabilityParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__EdgeAnnotation__ProbabilityAssignment_0_2"


    // $ANTLR start "rule__EdgeAnnotation__ProbabilityAssignment_1"
    // InternalMarkovChains.g:2116:1: rule__EdgeAnnotation__ProbabilityAssignment_1 : ( ruleProbability ) ;
    public final void rule__EdgeAnnotation__ProbabilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2120:1: ( ( ruleProbability ) )
            // InternalMarkovChains.g:2121:2: ( ruleProbability )
            {
            // InternalMarkovChains.g:2121:2: ( ruleProbability )
            // InternalMarkovChains.g:2122:3: ruleProbability
            {
             before(grammarAccess.getEdgeAnnotationAccess().getProbabilityProbabilityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getEdgeAnnotationAccess().getProbabilityProbabilityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EdgeAnnotation__ProbabilityAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalMarkovChains.g:2131:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2135:1: ( ( RULE_ID ) )
            // InternalMarkovChains.g:2136:2: ( RULE_ID )
            {
            // InternalMarkovChains.g:2136:2: ( RULE_ID )
            // InternalMarkovChains.g:2137:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_0"


    // $ANTLR start "rule__State__SpecsAssignment_1"
    // InternalMarkovChains.g:2146:1: rule__State__SpecsAssignment_1 : ( ruleStateSpecs ) ;
    public final void rule__State__SpecsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2150:1: ( ( ruleStateSpecs ) )
            // InternalMarkovChains.g:2151:2: ( ruleStateSpecs )
            {
            // InternalMarkovChains.g:2151:2: ( ruleStateSpecs )
            // InternalMarkovChains.g:2152:3: ruleStateSpecs
            {
             before(grammarAccess.getStateAccess().getSpecsStateSpecsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStateSpecs();

            state._fsp--;

             after(grammarAccess.getStateAccess().getSpecsStateSpecsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__State__SpecsAssignment_1"


    // $ANTLR start "rule__StateSpecs__AnnotationsAssignment_2"
    // InternalMarkovChains.g:2161:1: rule__StateSpecs__AnnotationsAssignment_2 : ( ruleStateAnnotation ) ;
    public final void rule__StateSpecs__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2165:1: ( ( ruleStateAnnotation ) )
            // InternalMarkovChains.g:2166:2: ( ruleStateAnnotation )
            {
            // InternalMarkovChains.g:2166:2: ( ruleStateAnnotation )
            // InternalMarkovChains.g:2167:3: ruleStateAnnotation
            {
             before(grammarAccess.getStateSpecsAccess().getAnnotationsStateAnnotationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStateAnnotation();

            state._fsp--;

             after(grammarAccess.getStateSpecsAccess().getAnnotationsStateAnnotationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StateSpecs__AnnotationsAssignment_2"


    // $ANTLR start "rule__StateSpecs__AnnotationsAssignment_3_1"
    // InternalMarkovChains.g:2176:1: rule__StateSpecs__AnnotationsAssignment_3_1 : ( ruleStateAnnotation ) ;
    public final void rule__StateSpecs__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2180:1: ( ( ruleStateAnnotation ) )
            // InternalMarkovChains.g:2181:2: ( ruleStateAnnotation )
            {
            // InternalMarkovChains.g:2181:2: ( ruleStateAnnotation )
            // InternalMarkovChains.g:2182:3: ruleStateAnnotation
            {
             before(grammarAccess.getStateSpecsAccess().getAnnotationsStateAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStateAnnotation();

            state._fsp--;

             after(grammarAccess.getStateSpecsAccess().getAnnotationsStateAnnotationParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__StateSpecs__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__StateAnnotation__InitprobAssignment_0_1"
    // InternalMarkovChains.g:2191:1: rule__StateAnnotation__InitprobAssignment_0_1 : ( ruleProbability ) ;
    public final void rule__StateAnnotation__InitprobAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2195:1: ( ( ruleProbability ) )
            // InternalMarkovChains.g:2196:2: ( ruleProbability )
            {
            // InternalMarkovChains.g:2196:2: ( ruleProbability )
            // InternalMarkovChains.g:2197:3: ruleProbability
            {
             before(grammarAccess.getStateAnnotationAccess().getInitprobProbabilityParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getStateAnnotationAccess().getInitprobProbabilityParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__StateAnnotation__InitprobAssignment_0_1"


    // $ANTLR start "rule__StateAnnotation__RewardAssignment_1_1"
    // InternalMarkovChains.g:2206:1: rule__StateAnnotation__RewardAssignment_1_1 : ( ruleReward ) ;
    public final void rule__StateAnnotation__RewardAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2210:1: ( ( ruleReward ) )
            // InternalMarkovChains.g:2211:2: ( ruleReward )
            {
            // InternalMarkovChains.g:2211:2: ( ruleReward )
            // InternalMarkovChains.g:2212:3: ruleReward
            {
             before(grammarAccess.getStateAnnotationAccess().getRewardRewardParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReward();

            state._fsp--;

             after(grammarAccess.getStateAnnotationAccess().getRewardRewardParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__StateAnnotation__RewardAssignment_1_1"


    // $ANTLR start "rule__Probability__RatioAssignment_0"
    // InternalMarkovChains.g:2221:1: rule__Probability__RatioAssignment_0 : ( rulePosRatio ) ;
    public final void rule__Probability__RatioAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2225:1: ( ( rulePosRatio ) )
            // InternalMarkovChains.g:2226:2: ( rulePosRatio )
            {
            // InternalMarkovChains.g:2226:2: ( rulePosRatio )
            // InternalMarkovChains.g:2227:3: rulePosRatio
            {
             before(grammarAccess.getProbabilityAccess().getRatioPosRatioParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePosRatio();

            state._fsp--;

             after(grammarAccess.getProbabilityAccess().getRatioPosRatioParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Probability__RatioAssignment_0"


    // $ANTLR start "rule__Probability__FloatAssignment_1"
    // InternalMarkovChains.g:2236:1: rule__Probability__FloatAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Probability__FloatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2240:1: ( ( RULE_FLOAT ) )
            // InternalMarkovChains.g:2241:2: ( RULE_FLOAT )
            {
            // InternalMarkovChains.g:2241:2: ( RULE_FLOAT )
            // InternalMarkovChains.g:2242:3: RULE_FLOAT
            {
             before(grammarAccess.getProbabilityAccess().getFloatFloatTerminalRuleCall_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getProbabilityAccess().getFloatFloatTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Probability__FloatAssignment_1"


    // $ANTLR start "rule__Probability__IntAssignment_2"
    // InternalMarkovChains.g:2251:1: rule__Probability__IntAssignment_2 : ( RULE_INT ) ;
    public final void rule__Probability__IntAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2255:1: ( ( RULE_INT ) )
            // InternalMarkovChains.g:2256:2: ( RULE_INT )
            {
            // InternalMarkovChains.g:2256:2: ( RULE_INT )
            // InternalMarkovChains.g:2257:3: RULE_INT
            {
             before(grammarAccess.getProbabilityAccess().getIntINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProbabilityAccess().getIntINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Probability__IntAssignment_2"


    // $ANTLR start "rule__PosRatio__NumeratorAssignment_0"
    // InternalMarkovChains.g:2266:1: rule__PosRatio__NumeratorAssignment_0 : ( RULE_INT ) ;
    public final void rule__PosRatio__NumeratorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2270:1: ( ( RULE_INT ) )
            // InternalMarkovChains.g:2271:2: ( RULE_INT )
            {
            // InternalMarkovChains.g:2271:2: ( RULE_INT )
            // InternalMarkovChains.g:2272:3: RULE_INT
            {
             before(grammarAccess.getPosRatioAccess().getNumeratorINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPosRatioAccess().getNumeratorINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PosRatio__NumeratorAssignment_0"


    // $ANTLR start "rule__PosRatio__DenominatorAssignment_2"
    // InternalMarkovChains.g:2281:1: rule__PosRatio__DenominatorAssignment_2 : ( RULE_INT ) ;
    public final void rule__PosRatio__DenominatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2285:1: ( ( RULE_INT ) )
            // InternalMarkovChains.g:2286:2: ( RULE_INT )
            {
            // InternalMarkovChains.g:2286:2: ( RULE_INT )
            // InternalMarkovChains.g:2287:3: RULE_INT
            {
             before(grammarAccess.getPosRatioAccess().getDenominatorINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPosRatioAccess().getDenominatorINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PosRatio__DenominatorAssignment_2"


    // $ANTLR start "rule__Reward__RatioAssignment_0"
    // InternalMarkovChains.g:2296:1: rule__Reward__RatioAssignment_0 : ( rulePosNegRatio ) ;
    public final void rule__Reward__RatioAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2300:1: ( ( rulePosNegRatio ) )
            // InternalMarkovChains.g:2301:2: ( rulePosNegRatio )
            {
            // InternalMarkovChains.g:2301:2: ( rulePosNegRatio )
            // InternalMarkovChains.g:2302:3: rulePosNegRatio
            {
             before(grammarAccess.getRewardAccess().getRatioPosNegRatioParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePosNegRatio();

            state._fsp--;

             after(grammarAccess.getRewardAccess().getRatioPosNegRatioParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Reward__RatioAssignment_0"


    // $ANTLR start "rule__Reward__FloatAssignment_1"
    // InternalMarkovChains.g:2311:1: rule__Reward__FloatAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__Reward__FloatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2315:1: ( ( RULE_FLOAT ) )
            // InternalMarkovChains.g:2316:2: ( RULE_FLOAT )
            {
            // InternalMarkovChains.g:2316:2: ( RULE_FLOAT )
            // InternalMarkovChains.g:2317:3: RULE_FLOAT
            {
             before(grammarAccess.getRewardAccess().getFloatFloatTerminalRuleCall_1_0()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getRewardAccess().getFloatFloatTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Reward__FloatAssignment_1"


    // $ANTLR start "rule__Reward__IntAssignment_2"
    // InternalMarkovChains.g:2326:1: rule__Reward__IntAssignment_2 : ( RULE_INT ) ;
    public final void rule__Reward__IntAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2330:1: ( ( RULE_INT ) )
            // InternalMarkovChains.g:2331:2: ( RULE_INT )
            {
            // InternalMarkovChains.g:2331:2: ( RULE_INT )
            // InternalMarkovChains.g:2332:3: RULE_INT
            {
             before(grammarAccess.getRewardAccess().getIntINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRewardAccess().getIntINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Reward__IntAssignment_2"


    // $ANTLR start "rule__Reward__NegintAssignment_3"
    // InternalMarkovChains.g:2341:1: rule__Reward__NegintAssignment_3 : ( RULE_NEGINT ) ;
    public final void rule__Reward__NegintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2345:1: ( ( RULE_NEGINT ) )
            // InternalMarkovChains.g:2346:2: ( RULE_NEGINT )
            {
            // InternalMarkovChains.g:2346:2: ( RULE_NEGINT )
            // InternalMarkovChains.g:2347:3: RULE_NEGINT
            {
             before(grammarAccess.getRewardAccess().getNegintNEGINTTerminalRuleCall_3_0()); 
            match(input,RULE_NEGINT,FOLLOW_2); 
             after(grammarAccess.getRewardAccess().getNegintNEGINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Reward__NegintAssignment_3"


    // $ANTLR start "rule__PosNegRatio__NumeratorAssignment_0_0"
    // InternalMarkovChains.g:2356:1: rule__PosNegRatio__NumeratorAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__PosNegRatio__NumeratorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2360:1: ( ( RULE_INT ) )
            // InternalMarkovChains.g:2361:2: ( RULE_INT )
            {
            // InternalMarkovChains.g:2361:2: ( RULE_INT )
            // InternalMarkovChains.g:2362:3: RULE_INT
            {
             before(grammarAccess.getPosNegRatioAccess().getNumeratorINTTerminalRuleCall_0_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPosNegRatioAccess().getNumeratorINTTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__PosNegRatio__NumeratorAssignment_0_0"


    // $ANTLR start "rule__PosNegRatio__NegnumeratorAssignment_0_1"
    // InternalMarkovChains.g:2371:1: rule__PosNegRatio__NegnumeratorAssignment_0_1 : ( RULE_NEGINT ) ;
    public final void rule__PosNegRatio__NegnumeratorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2375:1: ( ( RULE_NEGINT ) )
            // InternalMarkovChains.g:2376:2: ( RULE_NEGINT )
            {
            // InternalMarkovChains.g:2376:2: ( RULE_NEGINT )
            // InternalMarkovChains.g:2377:3: RULE_NEGINT
            {
             before(grammarAccess.getPosNegRatioAccess().getNegnumeratorNEGINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_NEGINT,FOLLOW_2); 
             after(grammarAccess.getPosNegRatioAccess().getNegnumeratorNEGINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__PosNegRatio__NegnumeratorAssignment_0_1"


    // $ANTLR start "rule__PosNegRatio__DenominatorAssignment_2"
    // InternalMarkovChains.g:2386:1: rule__PosNegRatio__DenominatorAssignment_2 : ( RULE_INT ) ;
    public final void rule__PosNegRatio__DenominatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkovChains.g:2390:1: ( ( RULE_INT ) )
            // InternalMarkovChains.g:2391:2: ( RULE_INT )
            {
            // InternalMarkovChains.g:2391:2: ( RULE_INT )
            // InternalMarkovChains.g:2392:3: RULE_INT
            {
             before(grammarAccess.getPosNegRatioAccess().getDenominatorINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPosNegRatioAccess().getDenominatorINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PosNegRatio__DenominatorAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\51\uffff";
    static final String dfa_2s = "\1\4\1\26\1\15\1\5\1\uffff\1\31\3\32\1\5\1\uffff\1\32\2\5\5\30\1\15\1\26\2\6\1\31\3\32\2\30\1\32\2\5\5\30\2\6\2\30";
    static final String dfa_3s = "\1\4\1\33\1\35\1\31\1\uffff\1\31\3\32\1\31\1\uffff\1\32\1\6\1\7\1\36\1\34\2\36\1\34\1\35\1\27\2\6\1\31\3\32\2\34\1\32\1\6\1\7\1\36\1\34\2\36\1\34\2\6\2\34";
    static final String dfa_4s = "\4\uffff\1\1\5\uffff\1\2\36\uffff";
    static final String dfa_5s = "\51\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\1\4\3\uffff\1\2",
            "\1\6\1\7\1\10\15\uffff\1\5",
            "\2\12\17\uffff\1\11\1\4\1\uffff\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\15",
            "\2\12\17\uffff\1\11\1\4\1\uffff\1\12",
            "",
            "\1\14",
            "\1\17\1\16",
            "\1\22\1\20\1\21",
            "\1\23\3\uffff\1\24\1\uffff\1\25",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24\1\uffff\1\26",
            "\1\23\3\uffff\1\24\1\uffff\1\26",
            "\1\23\3\uffff\1\24",
            "\1\30\1\31\1\32\15\uffff\1\27",
            "\1\3\1\4",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\37",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24",
            "\1\36",
            "\1\41\1\40",
            "\1\44\1\42\1\43",
            "\1\23\3\uffff\1\24\1\uffff\1\45",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24\1\uffff\1\46",
            "\1\23\3\uffff\1\24\1\uffff\1\46",
            "\1\23\3\uffff\1\24",
            "\1\47",
            "\1\50",
            "\1\23\3\uffff\1\24",
            "\1\23\3\uffff\1\24"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "327:1: rule__Edge__Alternatives : ( ( ( rule__Edge__Group_0__0 ) ) | ( ( rule__Edge__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000002000E000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});

}