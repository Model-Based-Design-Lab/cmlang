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
import info.computationalmodeling.lang.services.LinearTemporalLogicGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLinearTemporalLogicParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LTLID", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ltl'", "'formula'", "'='", "'alphabet'", "'where'", "'{'", "'}'", "','", "'or'", "'and'", "'U'", "'R'", "'=>'", "'X'", "'F'", "'G'", "'not'", "'('", "')'", "'true'", "'false'"
    };
    public static final int RULE_LTLID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLinearTemporalLogicParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLinearTemporalLogicParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLinearTemporalLogicParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLinearTemporalLogic.g"; }


    	private LinearTemporalLogicGrammarAccess grammarAccess;

    	public void setGrammarAccess(LinearTemporalLogicGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLTLModel"
    // InternalLinearTemporalLogic.g:53:1: entryRuleLTLModel : ruleLTLModel EOF ;
    public final void entryRuleLTLModel() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:54:1: ( ruleLTLModel EOF )
            // InternalLinearTemporalLogic.g:55:1: ruleLTLModel EOF
            {
             before(grammarAccess.getLTLModelRule()); 
            pushFollow(FOLLOW_1);
            ruleLTLModel();

            state._fsp--;

             after(grammarAccess.getLTLModelRule()); 
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
    // $ANTLR end "entryRuleLTLModel"


    // $ANTLR start "ruleLTLModel"
    // InternalLinearTemporalLogic.g:62:1: ruleLTLModel : ( ( rule__LTLModel__Group__0 ) ) ;
    public final void ruleLTLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:66:2: ( ( ( rule__LTLModel__Group__0 ) ) )
            // InternalLinearTemporalLogic.g:67:2: ( ( rule__LTLModel__Group__0 ) )
            {
            // InternalLinearTemporalLogic.g:67:2: ( ( rule__LTLModel__Group__0 ) )
            // InternalLinearTemporalLogic.g:68:3: ( rule__LTLModel__Group__0 )
            {
             before(grammarAccess.getLTLModelAccess().getGroup()); 
            // InternalLinearTemporalLogic.g:69:3: ( rule__LTLModel__Group__0 )
            // InternalLinearTemporalLogic.g:69:4: rule__LTLModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LTLModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLTLModelAccess().getGroup()); 

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
    // $ANTLR end "ruleLTLModel"


    // $ANTLR start "entryRuleDefinition"
    // InternalLinearTemporalLogic.g:78:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:79:1: ( ruleDefinition EOF )
            // InternalLinearTemporalLogic.g:80:1: ruleDefinition EOF
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
    // InternalLinearTemporalLogic.g:87:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:91:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalLinearTemporalLogic.g:92:2: ( ( rule__Definition__Group__0 ) )
            {
            // InternalLinearTemporalLogic.g:92:2: ( ( rule__Definition__Group__0 ) )
            // InternalLinearTemporalLogic.g:93:3: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalLinearTemporalLogic.g:94:3: ( rule__Definition__Group__0 )
            // InternalLinearTemporalLogic.g:94:4: rule__Definition__Group__0
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


    // $ANTLR start "entryRuleSetOfSymbols"
    // InternalLinearTemporalLogic.g:103:1: entryRuleSetOfSymbols : ruleSetOfSymbols EOF ;
    public final void entryRuleSetOfSymbols() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:104:1: ( ruleSetOfSymbols EOF )
            // InternalLinearTemporalLogic.g:105:1: ruleSetOfSymbols EOF
            {
             before(grammarAccess.getSetOfSymbolsRule()); 
            pushFollow(FOLLOW_1);
            ruleSetOfSymbols();

            state._fsp--;

             after(grammarAccess.getSetOfSymbolsRule()); 
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
    // $ANTLR end "entryRuleSetOfSymbols"


    // $ANTLR start "ruleSetOfSymbols"
    // InternalLinearTemporalLogic.g:112:1: ruleSetOfSymbols : ( ( rule__SetOfSymbols__Group__0 ) ) ;
    public final void ruleSetOfSymbols() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:116:2: ( ( ( rule__SetOfSymbols__Group__0 ) ) )
            // InternalLinearTemporalLogic.g:117:2: ( ( rule__SetOfSymbols__Group__0 ) )
            {
            // InternalLinearTemporalLogic.g:117:2: ( ( rule__SetOfSymbols__Group__0 ) )
            // InternalLinearTemporalLogic.g:118:3: ( rule__SetOfSymbols__Group__0 )
            {
             before(grammarAccess.getSetOfSymbolsAccess().getGroup()); 
            // InternalLinearTemporalLogic.g:119:3: ( rule__SetOfSymbols__Group__0 )
            // InternalLinearTemporalLogic.g:119:4: rule__SetOfSymbols__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetOfSymbolsAccess().getGroup()); 

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
    // $ANTLR end "ruleSetOfSymbols"


    // $ANTLR start "entryRuleLTLFormula"
    // InternalLinearTemporalLogic.g:128:1: entryRuleLTLFormula : ruleLTLFormula EOF ;
    public final void entryRuleLTLFormula() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:129:1: ( ruleLTLFormula EOF )
            // InternalLinearTemporalLogic.g:130:1: ruleLTLFormula EOF
            {
             before(grammarAccess.getLTLFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleLTLFormula();

            state._fsp--;

             after(grammarAccess.getLTLFormulaRule()); 
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
    // $ANTLR end "entryRuleLTLFormula"


    // $ANTLR start "ruleLTLFormula"
    // InternalLinearTemporalLogic.g:137:1: ruleLTLFormula : ( ( rule__LTLFormula__Group__0 ) ) ;
    public final void ruleLTLFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:141:2: ( ( ( rule__LTLFormula__Group__0 ) ) )
            // InternalLinearTemporalLogic.g:142:2: ( ( rule__LTLFormula__Group__0 ) )
            {
            // InternalLinearTemporalLogic.g:142:2: ( ( rule__LTLFormula__Group__0 ) )
            // InternalLinearTemporalLogic.g:143:3: ( rule__LTLFormula__Group__0 )
            {
             before(grammarAccess.getLTLFormulaAccess().getGroup()); 
            // InternalLinearTemporalLogic.g:144:3: ( rule__LTLFormula__Group__0 )
            // InternalLinearTemporalLogic.g:144:4: rule__LTLFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormulaAccess().getGroup()); 

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
    // $ANTLR end "ruleLTLFormula"


    // $ANTLR start "entryRuleLTLFormula1"
    // InternalLinearTemporalLogic.g:153:1: entryRuleLTLFormula1 : ruleLTLFormula1 EOF ;
    public final void entryRuleLTLFormula1() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:154:1: ( ruleLTLFormula1 EOF )
            // InternalLinearTemporalLogic.g:155:1: ruleLTLFormula1 EOF
            {
             before(grammarAccess.getLTLFormula1Rule()); 
            pushFollow(FOLLOW_1);
            ruleLTLFormula1();

            state._fsp--;

             after(grammarAccess.getLTLFormula1Rule()); 
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
    // $ANTLR end "entryRuleLTLFormula1"


    // $ANTLR start "ruleLTLFormula1"
    // InternalLinearTemporalLogic.g:162:1: ruleLTLFormula1 : ( ( rule__LTLFormula1__Group__0 ) ) ;
    public final void ruleLTLFormula1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:166:2: ( ( ( rule__LTLFormula1__Group__0 ) ) )
            // InternalLinearTemporalLogic.g:167:2: ( ( rule__LTLFormula1__Group__0 ) )
            {
            // InternalLinearTemporalLogic.g:167:2: ( ( rule__LTLFormula1__Group__0 ) )
            // InternalLinearTemporalLogic.g:168:3: ( rule__LTLFormula1__Group__0 )
            {
             before(grammarAccess.getLTLFormula1Access().getGroup()); 
            // InternalLinearTemporalLogic.g:169:3: ( rule__LTLFormula1__Group__0 )
            // InternalLinearTemporalLogic.g:169:4: rule__LTLFormula1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula1Access().getGroup()); 

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
    // $ANTLR end "ruleLTLFormula1"


    // $ANTLR start "entryRuleLTLFormula2"
    // InternalLinearTemporalLogic.g:178:1: entryRuleLTLFormula2 : ruleLTLFormula2 EOF ;
    public final void entryRuleLTLFormula2() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:179:1: ( ruleLTLFormula2 EOF )
            // InternalLinearTemporalLogic.g:180:1: ruleLTLFormula2 EOF
            {
             before(grammarAccess.getLTLFormula2Rule()); 
            pushFollow(FOLLOW_1);
            ruleLTLFormula2();

            state._fsp--;

             after(grammarAccess.getLTLFormula2Rule()); 
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
    // $ANTLR end "entryRuleLTLFormula2"


    // $ANTLR start "ruleLTLFormula2"
    // InternalLinearTemporalLogic.g:187:1: ruleLTLFormula2 : ( ( rule__LTLFormula2__Group__0 ) ) ;
    public final void ruleLTLFormula2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:191:2: ( ( ( rule__LTLFormula2__Group__0 ) ) )
            // InternalLinearTemporalLogic.g:192:2: ( ( rule__LTLFormula2__Group__0 ) )
            {
            // InternalLinearTemporalLogic.g:192:2: ( ( rule__LTLFormula2__Group__0 ) )
            // InternalLinearTemporalLogic.g:193:3: ( rule__LTLFormula2__Group__0 )
            {
             before(grammarAccess.getLTLFormula2Access().getGroup()); 
            // InternalLinearTemporalLogic.g:194:3: ( rule__LTLFormula2__Group__0 )
            // InternalLinearTemporalLogic.g:194:4: rule__LTLFormula2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula2Access().getGroup()); 

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
    // $ANTLR end "ruleLTLFormula2"


    // $ANTLR start "entryRuleLTLFormula3"
    // InternalLinearTemporalLogic.g:203:1: entryRuleLTLFormula3 : ruleLTLFormula3 EOF ;
    public final void entryRuleLTLFormula3() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:204:1: ( ruleLTLFormula3 EOF )
            // InternalLinearTemporalLogic.g:205:1: ruleLTLFormula3 EOF
            {
             before(grammarAccess.getLTLFormula3Rule()); 
            pushFollow(FOLLOW_1);
            ruleLTLFormula3();

            state._fsp--;

             after(grammarAccess.getLTLFormula3Rule()); 
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
    // $ANTLR end "entryRuleLTLFormula3"


    // $ANTLR start "ruleLTLFormula3"
    // InternalLinearTemporalLogic.g:212:1: ruleLTLFormula3 : ( ( rule__LTLFormula3__Group__0 ) ) ;
    public final void ruleLTLFormula3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:216:2: ( ( ( rule__LTLFormula3__Group__0 ) ) )
            // InternalLinearTemporalLogic.g:217:2: ( ( rule__LTLFormula3__Group__0 ) )
            {
            // InternalLinearTemporalLogic.g:217:2: ( ( rule__LTLFormula3__Group__0 ) )
            // InternalLinearTemporalLogic.g:218:3: ( rule__LTLFormula3__Group__0 )
            {
             before(grammarAccess.getLTLFormula3Access().getGroup()); 
            // InternalLinearTemporalLogic.g:219:3: ( rule__LTLFormula3__Group__0 )
            // InternalLinearTemporalLogic.g:219:4: rule__LTLFormula3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula3Access().getGroup()); 

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
    // $ANTLR end "ruleLTLFormula3"


    // $ANTLR start "entryRuleLTLFormula4"
    // InternalLinearTemporalLogic.g:228:1: entryRuleLTLFormula4 : ruleLTLFormula4 EOF ;
    public final void entryRuleLTLFormula4() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:229:1: ( ruleLTLFormula4 EOF )
            // InternalLinearTemporalLogic.g:230:1: ruleLTLFormula4 EOF
            {
             before(grammarAccess.getLTLFormula4Rule()); 
            pushFollow(FOLLOW_1);
            ruleLTLFormula4();

            state._fsp--;

             after(grammarAccess.getLTLFormula4Rule()); 
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
    // $ANTLR end "entryRuleLTLFormula4"


    // $ANTLR start "ruleLTLFormula4"
    // InternalLinearTemporalLogic.g:237:1: ruleLTLFormula4 : ( ( rule__LTLFormula4__Group__0 ) ) ;
    public final void ruleLTLFormula4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:241:2: ( ( ( rule__LTLFormula4__Group__0 ) ) )
            // InternalLinearTemporalLogic.g:242:2: ( ( rule__LTLFormula4__Group__0 ) )
            {
            // InternalLinearTemporalLogic.g:242:2: ( ( rule__LTLFormula4__Group__0 ) )
            // InternalLinearTemporalLogic.g:243:3: ( rule__LTLFormula4__Group__0 )
            {
             before(grammarAccess.getLTLFormula4Access().getGroup()); 
            // InternalLinearTemporalLogic.g:244:3: ( rule__LTLFormula4__Group__0 )
            // InternalLinearTemporalLogic.g:244:4: rule__LTLFormula4__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula4__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula4Access().getGroup()); 

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
    // $ANTLR end "ruleLTLFormula4"


    // $ANTLR start "entryRuleLTLFormula5"
    // InternalLinearTemporalLogic.g:253:1: entryRuleLTLFormula5 : ruleLTLFormula5 EOF ;
    public final void entryRuleLTLFormula5() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:254:1: ( ruleLTLFormula5 EOF )
            // InternalLinearTemporalLogic.g:255:1: ruleLTLFormula5 EOF
            {
             before(grammarAccess.getLTLFormula5Rule()); 
            pushFollow(FOLLOW_1);
            ruleLTLFormula5();

            state._fsp--;

             after(grammarAccess.getLTLFormula5Rule()); 
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
    // $ANTLR end "entryRuleLTLFormula5"


    // $ANTLR start "ruleLTLFormula5"
    // InternalLinearTemporalLogic.g:262:1: ruleLTLFormula5 : ( ( rule__LTLFormula5__Alternatives ) ) ;
    public final void ruleLTLFormula5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:266:2: ( ( ( rule__LTLFormula5__Alternatives ) ) )
            // InternalLinearTemporalLogic.g:267:2: ( ( rule__LTLFormula5__Alternatives ) )
            {
            // InternalLinearTemporalLogic.g:267:2: ( ( rule__LTLFormula5__Alternatives ) )
            // InternalLinearTemporalLogic.g:268:3: ( rule__LTLFormula5__Alternatives )
            {
             before(grammarAccess.getLTLFormula5Access().getAlternatives()); 
            // InternalLinearTemporalLogic.g:269:3: ( rule__LTLFormula5__Alternatives )
            // InternalLinearTemporalLogic.g:269:4: rule__LTLFormula5__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula5Access().getAlternatives()); 

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
    // $ANTLR end "ruleLTLFormula5"


    // $ANTLR start "entryRuleLTLFormula6"
    // InternalLinearTemporalLogic.g:278:1: entryRuleLTLFormula6 : ruleLTLFormula6 EOF ;
    public final void entryRuleLTLFormula6() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:279:1: ( ruleLTLFormula6 EOF )
            // InternalLinearTemporalLogic.g:280:1: ruleLTLFormula6 EOF
            {
             before(grammarAccess.getLTLFormula6Rule()); 
            pushFollow(FOLLOW_1);
            ruleLTLFormula6();

            state._fsp--;

             after(grammarAccess.getLTLFormula6Rule()); 
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
    // $ANTLR end "entryRuleLTLFormula6"


    // $ANTLR start "ruleLTLFormula6"
    // InternalLinearTemporalLogic.g:287:1: ruleLTLFormula6 : ( ( rule__LTLFormula6__Alternatives ) ) ;
    public final void ruleLTLFormula6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:291:2: ( ( ( rule__LTLFormula6__Alternatives ) ) )
            // InternalLinearTemporalLogic.g:292:2: ( ( rule__LTLFormula6__Alternatives ) )
            {
            // InternalLinearTemporalLogic.g:292:2: ( ( rule__LTLFormula6__Alternatives ) )
            // InternalLinearTemporalLogic.g:293:3: ( rule__LTLFormula6__Alternatives )
            {
             before(grammarAccess.getLTLFormula6Access().getAlternatives()); 
            // InternalLinearTemporalLogic.g:294:3: ( rule__LTLFormula6__Alternatives )
            // InternalLinearTemporalLogic.g:294:4: rule__LTLFormula6__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula6__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula6Access().getAlternatives()); 

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
    // $ANTLR end "ruleLTLFormula6"


    // $ANTLR start "entryRulePropositionExpression"
    // InternalLinearTemporalLogic.g:303:1: entryRulePropositionExpression : rulePropositionExpression EOF ;
    public final void entryRulePropositionExpression() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:304:1: ( rulePropositionExpression EOF )
            // InternalLinearTemporalLogic.g:305:1: rulePropositionExpression EOF
            {
             before(grammarAccess.getPropositionExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePropositionExpression();

            state._fsp--;

             after(grammarAccess.getPropositionExpressionRule()); 
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
    // $ANTLR end "entryRulePropositionExpression"


    // $ANTLR start "rulePropositionExpression"
    // InternalLinearTemporalLogic.g:312:1: rulePropositionExpression : ( ruleProposition ) ;
    public final void rulePropositionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:316:2: ( ( ruleProposition ) )
            // InternalLinearTemporalLogic.g:317:2: ( ruleProposition )
            {
            // InternalLinearTemporalLogic.g:317:2: ( ruleProposition )
            // InternalLinearTemporalLogic.g:318:3: ruleProposition
            {
             before(grammarAccess.getPropositionExpressionAccess().getPropositionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleProposition();

            state._fsp--;

             after(grammarAccess.getPropositionExpressionAccess().getPropositionParserRuleCall()); 

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
    // $ANTLR end "rulePropositionExpression"


    // $ANTLR start "entryRuleProposition"
    // InternalLinearTemporalLogic.g:328:1: entryRuleProposition : ruleProposition EOF ;
    public final void entryRuleProposition() throws RecognitionException {
        try {
            // InternalLinearTemporalLogic.g:329:1: ( ruleProposition EOF )
            // InternalLinearTemporalLogic.g:330:1: ruleProposition EOF
            {
             before(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_1);
            ruleProposition();

            state._fsp--;

             after(grammarAccess.getPropositionRule()); 
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
    // $ANTLR end "entryRuleProposition"


    // $ANTLR start "ruleProposition"
    // InternalLinearTemporalLogic.g:337:1: ruleProposition : ( ( rule__Proposition__Alternatives ) ) ;
    public final void ruleProposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:341:2: ( ( ( rule__Proposition__Alternatives ) ) )
            // InternalLinearTemporalLogic.g:342:2: ( ( rule__Proposition__Alternatives ) )
            {
            // InternalLinearTemporalLogic.g:342:2: ( ( rule__Proposition__Alternatives ) )
            // InternalLinearTemporalLogic.g:343:3: ( rule__Proposition__Alternatives )
            {
             before(grammarAccess.getPropositionAccess().getAlternatives()); 
            // InternalLinearTemporalLogic.g:344:3: ( rule__Proposition__Alternatives )
            // InternalLinearTemporalLogic.g:344:4: rule__Proposition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Proposition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropositionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProposition"


    // $ANTLR start "rule__LTLFormula5__Alternatives"
    // InternalLinearTemporalLogic.g:352:1: rule__LTLFormula5__Alternatives : ( ( ( rule__LTLFormula5__Group_0__0 ) ) | ( ( rule__LTLFormula5__Group_1__0 ) ) | ( ( rule__LTLFormula5__Group_2__0 ) ) | ( ( rule__LTLFormula5__Group_3__0 ) ) | ( ( rule__LTLFormula5__SubexpressionAssignment_4 ) ) );
    public final void rule__LTLFormula5__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:356:1: ( ( ( rule__LTLFormula5__Group_0__0 ) ) | ( ( rule__LTLFormula5__Group_1__0 ) ) | ( ( rule__LTLFormula5__Group_2__0 ) ) | ( ( rule__LTLFormula5__Group_3__0 ) ) | ( ( rule__LTLFormula5__SubexpressionAssignment_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            case RULE_LTLID:
            case RULE_STRING:
            case 29:
            case 31:
            case 32:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLinearTemporalLogic.g:357:2: ( ( rule__LTLFormula5__Group_0__0 ) )
                    {
                    // InternalLinearTemporalLogic.g:357:2: ( ( rule__LTLFormula5__Group_0__0 ) )
                    // InternalLinearTemporalLogic.g:358:3: ( rule__LTLFormula5__Group_0__0 )
                    {
                     before(grammarAccess.getLTLFormula5Access().getGroup_0()); 
                    // InternalLinearTemporalLogic.g:359:3: ( rule__LTLFormula5__Group_0__0 )
                    // InternalLinearTemporalLogic.g:359:4: rule__LTLFormula5__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula5__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula5Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLinearTemporalLogic.g:363:2: ( ( rule__LTLFormula5__Group_1__0 ) )
                    {
                    // InternalLinearTemporalLogic.g:363:2: ( ( rule__LTLFormula5__Group_1__0 ) )
                    // InternalLinearTemporalLogic.g:364:3: ( rule__LTLFormula5__Group_1__0 )
                    {
                     before(grammarAccess.getLTLFormula5Access().getGroup_1()); 
                    // InternalLinearTemporalLogic.g:365:3: ( rule__LTLFormula5__Group_1__0 )
                    // InternalLinearTemporalLogic.g:365:4: rule__LTLFormula5__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula5__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula5Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLinearTemporalLogic.g:369:2: ( ( rule__LTLFormula5__Group_2__0 ) )
                    {
                    // InternalLinearTemporalLogic.g:369:2: ( ( rule__LTLFormula5__Group_2__0 ) )
                    // InternalLinearTemporalLogic.g:370:3: ( rule__LTLFormula5__Group_2__0 )
                    {
                     before(grammarAccess.getLTLFormula5Access().getGroup_2()); 
                    // InternalLinearTemporalLogic.g:371:3: ( rule__LTLFormula5__Group_2__0 )
                    // InternalLinearTemporalLogic.g:371:4: rule__LTLFormula5__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula5__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula5Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLinearTemporalLogic.g:375:2: ( ( rule__LTLFormula5__Group_3__0 ) )
                    {
                    // InternalLinearTemporalLogic.g:375:2: ( ( rule__LTLFormula5__Group_3__0 ) )
                    // InternalLinearTemporalLogic.g:376:3: ( rule__LTLFormula5__Group_3__0 )
                    {
                     before(grammarAccess.getLTLFormula5Access().getGroup_3()); 
                    // InternalLinearTemporalLogic.g:377:3: ( rule__LTLFormula5__Group_3__0 )
                    // InternalLinearTemporalLogic.g:377:4: rule__LTLFormula5__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula5__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula5Access().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLinearTemporalLogic.g:381:2: ( ( rule__LTLFormula5__SubexpressionAssignment_4 ) )
                    {
                    // InternalLinearTemporalLogic.g:381:2: ( ( rule__LTLFormula5__SubexpressionAssignment_4 ) )
                    // InternalLinearTemporalLogic.g:382:3: ( rule__LTLFormula5__SubexpressionAssignment_4 )
                    {
                     before(grammarAccess.getLTLFormula5Access().getSubexpressionAssignment_4()); 
                    // InternalLinearTemporalLogic.g:383:3: ( rule__LTLFormula5__SubexpressionAssignment_4 )
                    // InternalLinearTemporalLogic.g:383:4: rule__LTLFormula5__SubexpressionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula5__SubexpressionAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula5Access().getSubexpressionAssignment_4()); 

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
    // $ANTLR end "rule__LTLFormula5__Alternatives"


    // $ANTLR start "rule__LTLFormula6__Alternatives"
    // InternalLinearTemporalLogic.g:391:1: rule__LTLFormula6__Alternatives : ( ( ( rule__LTLFormula6__PropositionExpressionAssignment_0 ) ) | ( ( rule__LTLFormula6__TrueExpressionAssignment_1 ) ) | ( ( rule__LTLFormula6__FalseExpressionAssignment_2 ) ) | ( ( rule__LTLFormula6__Group_3__0 ) ) );
    public final void rule__LTLFormula6__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:395:1: ( ( ( rule__LTLFormula6__PropositionExpressionAssignment_0 ) ) | ( ( rule__LTLFormula6__TrueExpressionAssignment_1 ) ) | ( ( rule__LTLFormula6__FalseExpressionAssignment_2 ) ) | ( ( rule__LTLFormula6__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_LTLID:
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLinearTemporalLogic.g:396:2: ( ( rule__LTLFormula6__PropositionExpressionAssignment_0 ) )
                    {
                    // InternalLinearTemporalLogic.g:396:2: ( ( rule__LTLFormula6__PropositionExpressionAssignment_0 ) )
                    // InternalLinearTemporalLogic.g:397:3: ( rule__LTLFormula6__PropositionExpressionAssignment_0 )
                    {
                     before(grammarAccess.getLTLFormula6Access().getPropositionExpressionAssignment_0()); 
                    // InternalLinearTemporalLogic.g:398:3: ( rule__LTLFormula6__PropositionExpressionAssignment_0 )
                    // InternalLinearTemporalLogic.g:398:4: rule__LTLFormula6__PropositionExpressionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula6__PropositionExpressionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula6Access().getPropositionExpressionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLinearTemporalLogic.g:402:2: ( ( rule__LTLFormula6__TrueExpressionAssignment_1 ) )
                    {
                    // InternalLinearTemporalLogic.g:402:2: ( ( rule__LTLFormula6__TrueExpressionAssignment_1 ) )
                    // InternalLinearTemporalLogic.g:403:3: ( rule__LTLFormula6__TrueExpressionAssignment_1 )
                    {
                     before(grammarAccess.getLTLFormula6Access().getTrueExpressionAssignment_1()); 
                    // InternalLinearTemporalLogic.g:404:3: ( rule__LTLFormula6__TrueExpressionAssignment_1 )
                    // InternalLinearTemporalLogic.g:404:4: rule__LTLFormula6__TrueExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula6__TrueExpressionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula6Access().getTrueExpressionAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLinearTemporalLogic.g:408:2: ( ( rule__LTLFormula6__FalseExpressionAssignment_2 ) )
                    {
                    // InternalLinearTemporalLogic.g:408:2: ( ( rule__LTLFormula6__FalseExpressionAssignment_2 ) )
                    // InternalLinearTemporalLogic.g:409:3: ( rule__LTLFormula6__FalseExpressionAssignment_2 )
                    {
                     before(grammarAccess.getLTLFormula6Access().getFalseExpressionAssignment_2()); 
                    // InternalLinearTemporalLogic.g:410:3: ( rule__LTLFormula6__FalseExpressionAssignment_2 )
                    // InternalLinearTemporalLogic.g:410:4: rule__LTLFormula6__FalseExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula6__FalseExpressionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula6Access().getFalseExpressionAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLinearTemporalLogic.g:414:2: ( ( rule__LTLFormula6__Group_3__0 ) )
                    {
                    // InternalLinearTemporalLogic.g:414:2: ( ( rule__LTLFormula6__Group_3__0 ) )
                    // InternalLinearTemporalLogic.g:415:3: ( rule__LTLFormula6__Group_3__0 )
                    {
                     before(grammarAccess.getLTLFormula6Access().getGroup_3()); 
                    // InternalLinearTemporalLogic.g:416:3: ( rule__LTLFormula6__Group_3__0 )
                    // InternalLinearTemporalLogic.g:416:4: rule__LTLFormula6__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula6__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLTLFormula6Access().getGroup_3()); 

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
    // $ANTLR end "rule__LTLFormula6__Alternatives"


    // $ANTLR start "rule__Proposition__Alternatives"
    // InternalLinearTemporalLogic.g:424:1: rule__Proposition__Alternatives : ( ( RULE_LTLID ) | ( RULE_STRING ) );
    public final void rule__Proposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:428:1: ( ( RULE_LTLID ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LTLID) ) {
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
                    // InternalLinearTemporalLogic.g:429:2: ( RULE_LTLID )
                    {
                    // InternalLinearTemporalLogic.g:429:2: ( RULE_LTLID )
                    // InternalLinearTemporalLogic.g:430:3: RULE_LTLID
                    {
                     before(grammarAccess.getPropositionAccess().getLTLIDTerminalRuleCall_0()); 
                    match(input,RULE_LTLID,FOLLOW_2); 
                     after(grammarAccess.getPropositionAccess().getLTLIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLinearTemporalLogic.g:435:2: ( RULE_STRING )
                    {
                    // InternalLinearTemporalLogic.g:435:2: ( RULE_STRING )
                    // InternalLinearTemporalLogic.g:436:3: RULE_STRING
                    {
                     before(grammarAccess.getPropositionAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getPropositionAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Proposition__Alternatives"


    // $ANTLR start "rule__LTLModel__Group__0"
    // InternalLinearTemporalLogic.g:445:1: rule__LTLModel__Group__0 : rule__LTLModel__Group__0__Impl rule__LTLModel__Group__1 ;
    public final void rule__LTLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:449:1: ( rule__LTLModel__Group__0__Impl rule__LTLModel__Group__1 )
            // InternalLinearTemporalLogic.g:450:2: rule__LTLModel__Group__0__Impl rule__LTLModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LTLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLModel__Group__1();

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
    // $ANTLR end "rule__LTLModel__Group__0"


    // $ANTLR start "rule__LTLModel__Group__0__Impl"
    // InternalLinearTemporalLogic.g:457:1: rule__LTLModel__Group__0__Impl : ( 'ltl' ) ;
    public final void rule__LTLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:461:1: ( ( 'ltl' ) )
            // InternalLinearTemporalLogic.g:462:1: ( 'ltl' )
            {
            // InternalLinearTemporalLogic.g:462:1: ( 'ltl' )
            // InternalLinearTemporalLogic.g:463:2: 'ltl'
            {
             before(grammarAccess.getLTLModelAccess().getLtlKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLTLModelAccess().getLtlKeyword_0()); 

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
    // $ANTLR end "rule__LTLModel__Group__0__Impl"


    // $ANTLR start "rule__LTLModel__Group__1"
    // InternalLinearTemporalLogic.g:472:1: rule__LTLModel__Group__1 : rule__LTLModel__Group__1__Impl rule__LTLModel__Group__2 ;
    public final void rule__LTLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:476:1: ( rule__LTLModel__Group__1__Impl rule__LTLModel__Group__2 )
            // InternalLinearTemporalLogic.g:477:2: rule__LTLModel__Group__1__Impl rule__LTLModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LTLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLModel__Group__2();

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
    // $ANTLR end "rule__LTLModel__Group__1"


    // $ANTLR start "rule__LTLModel__Group__1__Impl"
    // InternalLinearTemporalLogic.g:484:1: rule__LTLModel__Group__1__Impl : ( 'formula' ) ;
    public final void rule__LTLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:488:1: ( ( 'formula' ) )
            // InternalLinearTemporalLogic.g:489:1: ( 'formula' )
            {
            // InternalLinearTemporalLogic.g:489:1: ( 'formula' )
            // InternalLinearTemporalLogic.g:490:2: 'formula'
            {
             before(grammarAccess.getLTLModelAccess().getFormulaKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLTLModelAccess().getFormulaKeyword_1()); 

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
    // $ANTLR end "rule__LTLModel__Group__1__Impl"


    // $ANTLR start "rule__LTLModel__Group__2"
    // InternalLinearTemporalLogic.g:499:1: rule__LTLModel__Group__2 : rule__LTLModel__Group__2__Impl rule__LTLModel__Group__3 ;
    public final void rule__LTLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:503:1: ( rule__LTLModel__Group__2__Impl rule__LTLModel__Group__3 )
            // InternalLinearTemporalLogic.g:504:2: rule__LTLModel__Group__2__Impl rule__LTLModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LTLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLModel__Group__3();

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
    // $ANTLR end "rule__LTLModel__Group__2"


    // $ANTLR start "rule__LTLModel__Group__2__Impl"
    // InternalLinearTemporalLogic.g:511:1: rule__LTLModel__Group__2__Impl : ( ( rule__LTLModel__NameAssignment_2 ) ) ;
    public final void rule__LTLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:515:1: ( ( ( rule__LTLModel__NameAssignment_2 ) ) )
            // InternalLinearTemporalLogic.g:516:1: ( ( rule__LTLModel__NameAssignment_2 ) )
            {
            // InternalLinearTemporalLogic.g:516:1: ( ( rule__LTLModel__NameAssignment_2 ) )
            // InternalLinearTemporalLogic.g:517:2: ( rule__LTLModel__NameAssignment_2 )
            {
             before(grammarAccess.getLTLModelAccess().getNameAssignment_2()); 
            // InternalLinearTemporalLogic.g:518:2: ( rule__LTLModel__NameAssignment_2 )
            // InternalLinearTemporalLogic.g:518:3: rule__LTLModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LTLModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLTLModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__LTLModel__Group__2__Impl"


    // $ANTLR start "rule__LTLModel__Group__3"
    // InternalLinearTemporalLogic.g:526:1: rule__LTLModel__Group__3 : rule__LTLModel__Group__3__Impl rule__LTLModel__Group__4 ;
    public final void rule__LTLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:530:1: ( rule__LTLModel__Group__3__Impl rule__LTLModel__Group__4 )
            // InternalLinearTemporalLogic.g:531:2: rule__LTLModel__Group__3__Impl rule__LTLModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__LTLModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLModel__Group__4();

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
    // $ANTLR end "rule__LTLModel__Group__3"


    // $ANTLR start "rule__LTLModel__Group__3__Impl"
    // InternalLinearTemporalLogic.g:538:1: rule__LTLModel__Group__3__Impl : ( '=' ) ;
    public final void rule__LTLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:542:1: ( ( '=' ) )
            // InternalLinearTemporalLogic.g:543:1: ( '=' )
            {
            // InternalLinearTemporalLogic.g:543:1: ( '=' )
            // InternalLinearTemporalLogic.g:544:2: '='
            {
             before(grammarAccess.getLTLModelAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLTLModelAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__LTLModel__Group__3__Impl"


    // $ANTLR start "rule__LTLModel__Group__4"
    // InternalLinearTemporalLogic.g:553:1: rule__LTLModel__Group__4 : rule__LTLModel__Group__4__Impl rule__LTLModel__Group__5 ;
    public final void rule__LTLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:557:1: ( rule__LTLModel__Group__4__Impl rule__LTLModel__Group__5 )
            // InternalLinearTemporalLogic.g:558:2: rule__LTLModel__Group__4__Impl rule__LTLModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__LTLModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLModel__Group__5();

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
    // $ANTLR end "rule__LTLModel__Group__4"


    // $ANTLR start "rule__LTLModel__Group__4__Impl"
    // InternalLinearTemporalLogic.g:565:1: rule__LTLModel__Group__4__Impl : ( ( rule__LTLModel__FormulaAssignment_4 ) ) ;
    public final void rule__LTLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:569:1: ( ( ( rule__LTLModel__FormulaAssignment_4 ) ) )
            // InternalLinearTemporalLogic.g:570:1: ( ( rule__LTLModel__FormulaAssignment_4 ) )
            {
            // InternalLinearTemporalLogic.g:570:1: ( ( rule__LTLModel__FormulaAssignment_4 ) )
            // InternalLinearTemporalLogic.g:571:2: ( rule__LTLModel__FormulaAssignment_4 )
            {
             before(grammarAccess.getLTLModelAccess().getFormulaAssignment_4()); 
            // InternalLinearTemporalLogic.g:572:2: ( rule__LTLModel__FormulaAssignment_4 )
            // InternalLinearTemporalLogic.g:572:3: rule__LTLModel__FormulaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LTLModel__FormulaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLTLModelAccess().getFormulaAssignment_4()); 

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
    // $ANTLR end "rule__LTLModel__Group__4__Impl"


    // $ANTLR start "rule__LTLModel__Group__5"
    // InternalLinearTemporalLogic.g:580:1: rule__LTLModel__Group__5 : rule__LTLModel__Group__5__Impl rule__LTLModel__Group__6 ;
    public final void rule__LTLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:584:1: ( rule__LTLModel__Group__5__Impl rule__LTLModel__Group__6 )
            // InternalLinearTemporalLogic.g:585:2: rule__LTLModel__Group__5__Impl rule__LTLModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__LTLModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLModel__Group__6();

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
    // $ANTLR end "rule__LTLModel__Group__5"


    // $ANTLR start "rule__LTLModel__Group__5__Impl"
    // InternalLinearTemporalLogic.g:592:1: rule__LTLModel__Group__5__Impl : ( ( rule__LTLModel__Group_5__0 )? ) ;
    public final void rule__LTLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:596:1: ( ( ( rule__LTLModel__Group_5__0 )? ) )
            // InternalLinearTemporalLogic.g:597:1: ( ( rule__LTLModel__Group_5__0 )? )
            {
            // InternalLinearTemporalLogic.g:597:1: ( ( rule__LTLModel__Group_5__0 )? )
            // InternalLinearTemporalLogic.g:598:2: ( rule__LTLModel__Group_5__0 )?
            {
             before(grammarAccess.getLTLModelAccess().getGroup_5()); 
            // InternalLinearTemporalLogic.g:599:2: ( rule__LTLModel__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLinearTemporalLogic.g:599:3: rule__LTLModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLTLModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__LTLModel__Group__5__Impl"


    // $ANTLR start "rule__LTLModel__Group__6"
    // InternalLinearTemporalLogic.g:607:1: rule__LTLModel__Group__6 : rule__LTLModel__Group__6__Impl ;
    public final void rule__LTLModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:611:1: ( rule__LTLModel__Group__6__Impl )
            // InternalLinearTemporalLogic.g:612:2: rule__LTLModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLModel__Group__6__Impl();

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
    // $ANTLR end "rule__LTLModel__Group__6"


    // $ANTLR start "rule__LTLModel__Group__6__Impl"
    // InternalLinearTemporalLogic.g:618:1: rule__LTLModel__Group__6__Impl : ( ( rule__LTLModel__Group_6__0 )? ) ;
    public final void rule__LTLModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:622:1: ( ( ( rule__LTLModel__Group_6__0 )? ) )
            // InternalLinearTemporalLogic.g:623:1: ( ( rule__LTLModel__Group_6__0 )? )
            {
            // InternalLinearTemporalLogic.g:623:1: ( ( rule__LTLModel__Group_6__0 )? )
            // InternalLinearTemporalLogic.g:624:2: ( rule__LTLModel__Group_6__0 )?
            {
             before(grammarAccess.getLTLModelAccess().getGroup_6()); 
            // InternalLinearTemporalLogic.g:625:2: ( rule__LTLModel__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLinearTemporalLogic.g:625:3: rule__LTLModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLTLModelAccess().getGroup_6()); 

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
    // $ANTLR end "rule__LTLModel__Group__6__Impl"


    // $ANTLR start "rule__LTLModel__Group_5__0"
    // InternalLinearTemporalLogic.g:634:1: rule__LTLModel__Group_5__0 : rule__LTLModel__Group_5__0__Impl rule__LTLModel__Group_5__1 ;
    public final void rule__LTLModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:638:1: ( rule__LTLModel__Group_5__0__Impl rule__LTLModel__Group_5__1 )
            // InternalLinearTemporalLogic.g:639:2: rule__LTLModel__Group_5__0__Impl rule__LTLModel__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__LTLModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLModel__Group_5__1();

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
    // $ANTLR end "rule__LTLModel__Group_5__0"


    // $ANTLR start "rule__LTLModel__Group_5__0__Impl"
    // InternalLinearTemporalLogic.g:646:1: rule__LTLModel__Group_5__0__Impl : ( 'alphabet' ) ;
    public final void rule__LTLModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:650:1: ( ( 'alphabet' ) )
            // InternalLinearTemporalLogic.g:651:1: ( 'alphabet' )
            {
            // InternalLinearTemporalLogic.g:651:1: ( 'alphabet' )
            // InternalLinearTemporalLogic.g:652:2: 'alphabet'
            {
             before(grammarAccess.getLTLModelAccess().getAlphabetKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLTLModelAccess().getAlphabetKeyword_5_0()); 

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
    // $ANTLR end "rule__LTLModel__Group_5__0__Impl"


    // $ANTLR start "rule__LTLModel__Group_5__1"
    // InternalLinearTemporalLogic.g:661:1: rule__LTLModel__Group_5__1 : rule__LTLModel__Group_5__1__Impl ;
    public final void rule__LTLModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:665:1: ( rule__LTLModel__Group_5__1__Impl )
            // InternalLinearTemporalLogic.g:666:2: rule__LTLModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLModel__Group_5__1__Impl();

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
    // $ANTLR end "rule__LTLModel__Group_5__1"


    // $ANTLR start "rule__LTLModel__Group_5__1__Impl"
    // InternalLinearTemporalLogic.g:672:1: rule__LTLModel__Group_5__1__Impl : ( ( rule__LTLModel__AlphabetAssignment_5_1 ) ) ;
    public final void rule__LTLModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:676:1: ( ( ( rule__LTLModel__AlphabetAssignment_5_1 ) ) )
            // InternalLinearTemporalLogic.g:677:1: ( ( rule__LTLModel__AlphabetAssignment_5_1 ) )
            {
            // InternalLinearTemporalLogic.g:677:1: ( ( rule__LTLModel__AlphabetAssignment_5_1 ) )
            // InternalLinearTemporalLogic.g:678:2: ( rule__LTLModel__AlphabetAssignment_5_1 )
            {
             before(grammarAccess.getLTLModelAccess().getAlphabetAssignment_5_1()); 
            // InternalLinearTemporalLogic.g:679:2: ( rule__LTLModel__AlphabetAssignment_5_1 )
            // InternalLinearTemporalLogic.g:679:3: rule__LTLModel__AlphabetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLModel__AlphabetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLModelAccess().getAlphabetAssignment_5_1()); 

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
    // $ANTLR end "rule__LTLModel__Group_5__1__Impl"


    // $ANTLR start "rule__LTLModel__Group_6__0"
    // InternalLinearTemporalLogic.g:688:1: rule__LTLModel__Group_6__0 : rule__LTLModel__Group_6__0__Impl rule__LTLModel__Group_6__1 ;
    public final void rule__LTLModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:692:1: ( rule__LTLModel__Group_6__0__Impl rule__LTLModel__Group_6__1 )
            // InternalLinearTemporalLogic.g:693:2: rule__LTLModel__Group_6__0__Impl rule__LTLModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__LTLModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLModel__Group_6__1();

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
    // $ANTLR end "rule__LTLModel__Group_6__0"


    // $ANTLR start "rule__LTLModel__Group_6__0__Impl"
    // InternalLinearTemporalLogic.g:700:1: rule__LTLModel__Group_6__0__Impl : ( 'where' ) ;
    public final void rule__LTLModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:704:1: ( ( 'where' ) )
            // InternalLinearTemporalLogic.g:705:1: ( 'where' )
            {
            // InternalLinearTemporalLogic.g:705:1: ( 'where' )
            // InternalLinearTemporalLogic.g:706:2: 'where'
            {
             before(grammarAccess.getLTLModelAccess().getWhereKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLTLModelAccess().getWhereKeyword_6_0()); 

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
    // $ANTLR end "rule__LTLModel__Group_6__0__Impl"


    // $ANTLR start "rule__LTLModel__Group_6__1"
    // InternalLinearTemporalLogic.g:715:1: rule__LTLModel__Group_6__1 : rule__LTLModel__Group_6__1__Impl ;
    public final void rule__LTLModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:719:1: ( rule__LTLModel__Group_6__1__Impl )
            // InternalLinearTemporalLogic.g:720:2: rule__LTLModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLModel__Group_6__1__Impl();

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
    // $ANTLR end "rule__LTLModel__Group_6__1"


    // $ANTLR start "rule__LTLModel__Group_6__1__Impl"
    // InternalLinearTemporalLogic.g:726:1: rule__LTLModel__Group_6__1__Impl : ( ( rule__LTLModel__DefinitionsAssignment_6_1 )* ) ;
    public final void rule__LTLModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:730:1: ( ( ( rule__LTLModel__DefinitionsAssignment_6_1 )* ) )
            // InternalLinearTemporalLogic.g:731:1: ( ( rule__LTLModel__DefinitionsAssignment_6_1 )* )
            {
            // InternalLinearTemporalLogic.g:731:1: ( ( rule__LTLModel__DefinitionsAssignment_6_1 )* )
            // InternalLinearTemporalLogic.g:732:2: ( rule__LTLModel__DefinitionsAssignment_6_1 )*
            {
             before(grammarAccess.getLTLModelAccess().getDefinitionsAssignment_6_1()); 
            // InternalLinearTemporalLogic.g:733:2: ( rule__LTLModel__DefinitionsAssignment_6_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_LTLID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLinearTemporalLogic.g:733:3: rule__LTLModel__DefinitionsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LTLModel__DefinitionsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLTLModelAccess().getDefinitionsAssignment_6_1()); 

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
    // $ANTLR end "rule__LTLModel__Group_6__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalLinearTemporalLogic.g:742:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:746:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalLinearTemporalLogic.g:747:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
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
    // InternalLinearTemporalLogic.g:754:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__PropositionAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:758:1: ( ( ( rule__Definition__PropositionAssignment_0 ) ) )
            // InternalLinearTemporalLogic.g:759:1: ( ( rule__Definition__PropositionAssignment_0 ) )
            {
            // InternalLinearTemporalLogic.g:759:1: ( ( rule__Definition__PropositionAssignment_0 ) )
            // InternalLinearTemporalLogic.g:760:2: ( rule__Definition__PropositionAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getPropositionAssignment_0()); 
            // InternalLinearTemporalLogic.g:761:2: ( rule__Definition__PropositionAssignment_0 )
            // InternalLinearTemporalLogic.g:761:3: rule__Definition__PropositionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__PropositionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getPropositionAssignment_0()); 

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
    // InternalLinearTemporalLogic.g:769:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:773:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalLinearTemporalLogic.g:774:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalLinearTemporalLogic.g:781:1: rule__Definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:785:1: ( ( '=' ) )
            // InternalLinearTemporalLogic.g:786:1: ( '=' )
            {
            // InternalLinearTemporalLogic.g:786:1: ( '=' )
            // InternalLinearTemporalLogic.g:787:2: '='
            {
             before(grammarAccess.getDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalLinearTemporalLogic.g:796:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:800:1: ( rule__Definition__Group__2__Impl )
            // InternalLinearTemporalLogic.g:801:2: rule__Definition__Group__2__Impl
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
    // InternalLinearTemporalLogic.g:807:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__SymbolsAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:811:1: ( ( ( rule__Definition__SymbolsAssignment_2 ) ) )
            // InternalLinearTemporalLogic.g:812:1: ( ( rule__Definition__SymbolsAssignment_2 ) )
            {
            // InternalLinearTemporalLogic.g:812:1: ( ( rule__Definition__SymbolsAssignment_2 ) )
            // InternalLinearTemporalLogic.g:813:2: ( rule__Definition__SymbolsAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getSymbolsAssignment_2()); 
            // InternalLinearTemporalLogic.g:814:2: ( rule__Definition__SymbolsAssignment_2 )
            // InternalLinearTemporalLogic.g:814:3: rule__Definition__SymbolsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__SymbolsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getSymbolsAssignment_2()); 

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


    // $ANTLR start "rule__SetOfSymbols__Group__0"
    // InternalLinearTemporalLogic.g:823:1: rule__SetOfSymbols__Group__0 : rule__SetOfSymbols__Group__0__Impl rule__SetOfSymbols__Group__1 ;
    public final void rule__SetOfSymbols__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:827:1: ( rule__SetOfSymbols__Group__0__Impl rule__SetOfSymbols__Group__1 )
            // InternalLinearTemporalLogic.g:828:2: rule__SetOfSymbols__Group__0__Impl rule__SetOfSymbols__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SetOfSymbols__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__Group__1();

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
    // $ANTLR end "rule__SetOfSymbols__Group__0"


    // $ANTLR start "rule__SetOfSymbols__Group__0__Impl"
    // InternalLinearTemporalLogic.g:835:1: rule__SetOfSymbols__Group__0__Impl : ( '{' ) ;
    public final void rule__SetOfSymbols__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:839:1: ( ( '{' ) )
            // InternalLinearTemporalLogic.g:840:1: ( '{' )
            {
            // InternalLinearTemporalLogic.g:840:1: ( '{' )
            // InternalLinearTemporalLogic.g:841:2: '{'
            {
             before(grammarAccess.getSetOfSymbolsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSetOfSymbolsAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__SetOfSymbols__Group__0__Impl"


    // $ANTLR start "rule__SetOfSymbols__Group__1"
    // InternalLinearTemporalLogic.g:850:1: rule__SetOfSymbols__Group__1 : rule__SetOfSymbols__Group__1__Impl rule__SetOfSymbols__Group__2 ;
    public final void rule__SetOfSymbols__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:854:1: ( rule__SetOfSymbols__Group__1__Impl rule__SetOfSymbols__Group__2 )
            // InternalLinearTemporalLogic.g:855:2: rule__SetOfSymbols__Group__1__Impl rule__SetOfSymbols__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SetOfSymbols__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__Group__2();

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
    // $ANTLR end "rule__SetOfSymbols__Group__1"


    // $ANTLR start "rule__SetOfSymbols__Group__1__Impl"
    // InternalLinearTemporalLogic.g:862:1: rule__SetOfSymbols__Group__1__Impl : ( ( rule__SetOfSymbols__SymbolsAssignment_1 ) ) ;
    public final void rule__SetOfSymbols__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:866:1: ( ( ( rule__SetOfSymbols__SymbolsAssignment_1 ) ) )
            // InternalLinearTemporalLogic.g:867:1: ( ( rule__SetOfSymbols__SymbolsAssignment_1 ) )
            {
            // InternalLinearTemporalLogic.g:867:1: ( ( rule__SetOfSymbols__SymbolsAssignment_1 ) )
            // InternalLinearTemporalLogic.g:868:2: ( rule__SetOfSymbols__SymbolsAssignment_1 )
            {
             before(grammarAccess.getSetOfSymbolsAccess().getSymbolsAssignment_1()); 
            // InternalLinearTemporalLogic.g:869:2: ( rule__SetOfSymbols__SymbolsAssignment_1 )
            // InternalLinearTemporalLogic.g:869:3: rule__SetOfSymbols__SymbolsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__SymbolsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetOfSymbolsAccess().getSymbolsAssignment_1()); 

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
    // $ANTLR end "rule__SetOfSymbols__Group__1__Impl"


    // $ANTLR start "rule__SetOfSymbols__Group__2"
    // InternalLinearTemporalLogic.g:877:1: rule__SetOfSymbols__Group__2 : rule__SetOfSymbols__Group__2__Impl rule__SetOfSymbols__Group__3 ;
    public final void rule__SetOfSymbols__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:881:1: ( rule__SetOfSymbols__Group__2__Impl rule__SetOfSymbols__Group__3 )
            // InternalLinearTemporalLogic.g:882:2: rule__SetOfSymbols__Group__2__Impl rule__SetOfSymbols__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SetOfSymbols__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__Group__3();

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
    // $ANTLR end "rule__SetOfSymbols__Group__2"


    // $ANTLR start "rule__SetOfSymbols__Group__2__Impl"
    // InternalLinearTemporalLogic.g:889:1: rule__SetOfSymbols__Group__2__Impl : ( ( rule__SetOfSymbols__Group_2__0 )* ) ;
    public final void rule__SetOfSymbols__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:893:1: ( ( ( rule__SetOfSymbols__Group_2__0 )* ) )
            // InternalLinearTemporalLogic.g:894:1: ( ( rule__SetOfSymbols__Group_2__0 )* )
            {
            // InternalLinearTemporalLogic.g:894:1: ( ( rule__SetOfSymbols__Group_2__0 )* )
            // InternalLinearTemporalLogic.g:895:2: ( rule__SetOfSymbols__Group_2__0 )*
            {
             before(grammarAccess.getSetOfSymbolsAccess().getGroup_2()); 
            // InternalLinearTemporalLogic.g:896:2: ( rule__SetOfSymbols__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLinearTemporalLogic.g:896:3: rule__SetOfSymbols__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SetOfSymbols__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSetOfSymbolsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SetOfSymbols__Group__2__Impl"


    // $ANTLR start "rule__SetOfSymbols__Group__3"
    // InternalLinearTemporalLogic.g:904:1: rule__SetOfSymbols__Group__3 : rule__SetOfSymbols__Group__3__Impl ;
    public final void rule__SetOfSymbols__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:908:1: ( rule__SetOfSymbols__Group__3__Impl )
            // InternalLinearTemporalLogic.g:909:2: rule__SetOfSymbols__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__Group__3__Impl();

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
    // $ANTLR end "rule__SetOfSymbols__Group__3"


    // $ANTLR start "rule__SetOfSymbols__Group__3__Impl"
    // InternalLinearTemporalLogic.g:915:1: rule__SetOfSymbols__Group__3__Impl : ( '}' ) ;
    public final void rule__SetOfSymbols__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:919:1: ( ( '}' ) )
            // InternalLinearTemporalLogic.g:920:1: ( '}' )
            {
            // InternalLinearTemporalLogic.g:920:1: ( '}' )
            // InternalLinearTemporalLogic.g:921:2: '}'
            {
             before(grammarAccess.getSetOfSymbolsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSetOfSymbolsAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SetOfSymbols__Group__3__Impl"


    // $ANTLR start "rule__SetOfSymbols__Group_2__0"
    // InternalLinearTemporalLogic.g:931:1: rule__SetOfSymbols__Group_2__0 : rule__SetOfSymbols__Group_2__0__Impl rule__SetOfSymbols__Group_2__1 ;
    public final void rule__SetOfSymbols__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:935:1: ( rule__SetOfSymbols__Group_2__0__Impl rule__SetOfSymbols__Group_2__1 )
            // InternalLinearTemporalLogic.g:936:2: rule__SetOfSymbols__Group_2__0__Impl rule__SetOfSymbols__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SetOfSymbols__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__Group_2__1();

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
    // $ANTLR end "rule__SetOfSymbols__Group_2__0"


    // $ANTLR start "rule__SetOfSymbols__Group_2__0__Impl"
    // InternalLinearTemporalLogic.g:943:1: rule__SetOfSymbols__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SetOfSymbols__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:947:1: ( ( ',' ) )
            // InternalLinearTemporalLogic.g:948:1: ( ',' )
            {
            // InternalLinearTemporalLogic.g:948:1: ( ',' )
            // InternalLinearTemporalLogic.g:949:2: ','
            {
             before(grammarAccess.getSetOfSymbolsAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSetOfSymbolsAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__SetOfSymbols__Group_2__0__Impl"


    // $ANTLR start "rule__SetOfSymbols__Group_2__1"
    // InternalLinearTemporalLogic.g:958:1: rule__SetOfSymbols__Group_2__1 : rule__SetOfSymbols__Group_2__1__Impl ;
    public final void rule__SetOfSymbols__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:962:1: ( rule__SetOfSymbols__Group_2__1__Impl )
            // InternalLinearTemporalLogic.g:963:2: rule__SetOfSymbols__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__Group_2__1__Impl();

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
    // $ANTLR end "rule__SetOfSymbols__Group_2__1"


    // $ANTLR start "rule__SetOfSymbols__Group_2__1__Impl"
    // InternalLinearTemporalLogic.g:969:1: rule__SetOfSymbols__Group_2__1__Impl : ( ( rule__SetOfSymbols__SymbolsAssignment_2_1 ) ) ;
    public final void rule__SetOfSymbols__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:973:1: ( ( ( rule__SetOfSymbols__SymbolsAssignment_2_1 ) ) )
            // InternalLinearTemporalLogic.g:974:1: ( ( rule__SetOfSymbols__SymbolsAssignment_2_1 ) )
            {
            // InternalLinearTemporalLogic.g:974:1: ( ( rule__SetOfSymbols__SymbolsAssignment_2_1 ) )
            // InternalLinearTemporalLogic.g:975:2: ( rule__SetOfSymbols__SymbolsAssignment_2_1 )
            {
             before(grammarAccess.getSetOfSymbolsAccess().getSymbolsAssignment_2_1()); 
            // InternalLinearTemporalLogic.g:976:2: ( rule__SetOfSymbols__SymbolsAssignment_2_1 )
            // InternalLinearTemporalLogic.g:976:3: rule__SetOfSymbols__SymbolsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SetOfSymbols__SymbolsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetOfSymbolsAccess().getSymbolsAssignment_2_1()); 

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
    // $ANTLR end "rule__SetOfSymbols__Group_2__1__Impl"


    // $ANTLR start "rule__LTLFormula__Group__0"
    // InternalLinearTemporalLogic.g:985:1: rule__LTLFormula__Group__0 : rule__LTLFormula__Group__0__Impl rule__LTLFormula__Group__1 ;
    public final void rule__LTLFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:989:1: ( rule__LTLFormula__Group__0__Impl rule__LTLFormula__Group__1 )
            // InternalLinearTemporalLogic.g:990:2: rule__LTLFormula__Group__0__Impl rule__LTLFormula__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LTLFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula__Group__1();

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
    // $ANTLR end "rule__LTLFormula__Group__0"


    // $ANTLR start "rule__LTLFormula__Group__0__Impl"
    // InternalLinearTemporalLogic.g:997:1: rule__LTLFormula__Group__0__Impl : ( ( rule__LTLFormula__FormulaAssignment_0 ) ) ;
    public final void rule__LTLFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1001:1: ( ( ( rule__LTLFormula__FormulaAssignment_0 ) ) )
            // InternalLinearTemporalLogic.g:1002:1: ( ( rule__LTLFormula__FormulaAssignment_0 ) )
            {
            // InternalLinearTemporalLogic.g:1002:1: ( ( rule__LTLFormula__FormulaAssignment_0 ) )
            // InternalLinearTemporalLogic.g:1003:2: ( rule__LTLFormula__FormulaAssignment_0 )
            {
             before(grammarAccess.getLTLFormulaAccess().getFormulaAssignment_0()); 
            // InternalLinearTemporalLogic.g:1004:2: ( rule__LTLFormula__FormulaAssignment_0 )
            // InternalLinearTemporalLogic.g:1004:3: rule__LTLFormula__FormulaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula__FormulaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormulaAccess().getFormulaAssignment_0()); 

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
    // $ANTLR end "rule__LTLFormula__Group__0__Impl"


    // $ANTLR start "rule__LTLFormula__Group__1"
    // InternalLinearTemporalLogic.g:1012:1: rule__LTLFormula__Group__1 : rule__LTLFormula__Group__1__Impl ;
    public final void rule__LTLFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1016:1: ( rule__LTLFormula__Group__1__Impl )
            // InternalLinearTemporalLogic.g:1017:2: rule__LTLFormula__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula__Group__1__Impl();

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
    // $ANTLR end "rule__LTLFormula__Group__1"


    // $ANTLR start "rule__LTLFormula__Group__1__Impl"
    // InternalLinearTemporalLogic.g:1023:1: rule__LTLFormula__Group__1__Impl : ( ( rule__LTLFormula__Group_1__0 )? ) ;
    public final void rule__LTLFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1027:1: ( ( ( rule__LTLFormula__Group_1__0 )? ) )
            // InternalLinearTemporalLogic.g:1028:1: ( ( rule__LTLFormula__Group_1__0 )? )
            {
            // InternalLinearTemporalLogic.g:1028:1: ( ( rule__LTLFormula__Group_1__0 )? )
            // InternalLinearTemporalLogic.g:1029:2: ( rule__LTLFormula__Group_1__0 )?
            {
             before(grammarAccess.getLTLFormulaAccess().getGroup_1()); 
            // InternalLinearTemporalLogic.g:1030:2: ( rule__LTLFormula__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLinearTemporalLogic.g:1030:3: rule__LTLFormula__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLTLFormulaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LTLFormula__Group__1__Impl"


    // $ANTLR start "rule__LTLFormula__Group_1__0"
    // InternalLinearTemporalLogic.g:1039:1: rule__LTLFormula__Group_1__0 : rule__LTLFormula__Group_1__0__Impl rule__LTLFormula__Group_1__1 ;
    public final void rule__LTLFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1043:1: ( rule__LTLFormula__Group_1__0__Impl rule__LTLFormula__Group_1__1 )
            // InternalLinearTemporalLogic.g:1044:2: rule__LTLFormula__Group_1__0__Impl rule__LTLFormula__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula__Group_1__1();

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
    // $ANTLR end "rule__LTLFormula__Group_1__0"


    // $ANTLR start "rule__LTLFormula__Group_1__0__Impl"
    // InternalLinearTemporalLogic.g:1051:1: rule__LTLFormula__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__LTLFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1055:1: ( ( 'or' ) )
            // InternalLinearTemporalLogic.g:1056:1: ( 'or' )
            {
            // InternalLinearTemporalLogic.g:1056:1: ( 'or' )
            // InternalLinearTemporalLogic.g:1057:2: 'or'
            {
             before(grammarAccess.getLTLFormulaAccess().getOrKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLTLFormulaAccess().getOrKeyword_1_0()); 

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
    // $ANTLR end "rule__LTLFormula__Group_1__0__Impl"


    // $ANTLR start "rule__LTLFormula__Group_1__1"
    // InternalLinearTemporalLogic.g:1066:1: rule__LTLFormula__Group_1__1 : rule__LTLFormula__Group_1__1__Impl rule__LTLFormula__Group_1__2 ;
    public final void rule__LTLFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1070:1: ( rule__LTLFormula__Group_1__1__Impl rule__LTLFormula__Group_1__2 )
            // InternalLinearTemporalLogic.g:1071:2: rule__LTLFormula__Group_1__1__Impl rule__LTLFormula__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__LTLFormula__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula__Group_1__2();

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
    // $ANTLR end "rule__LTLFormula__Group_1__1"


    // $ANTLR start "rule__LTLFormula__Group_1__1__Impl"
    // InternalLinearTemporalLogic.g:1078:1: rule__LTLFormula__Group_1__1__Impl : ( ( rule__LTLFormula__AlternativesAssignment_1_1 ) ) ;
    public final void rule__LTLFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1082:1: ( ( ( rule__LTLFormula__AlternativesAssignment_1_1 ) ) )
            // InternalLinearTemporalLogic.g:1083:1: ( ( rule__LTLFormula__AlternativesAssignment_1_1 ) )
            {
            // InternalLinearTemporalLogic.g:1083:1: ( ( rule__LTLFormula__AlternativesAssignment_1_1 ) )
            // InternalLinearTemporalLogic.g:1084:2: ( rule__LTLFormula__AlternativesAssignment_1_1 )
            {
             before(grammarAccess.getLTLFormulaAccess().getAlternativesAssignment_1_1()); 
            // InternalLinearTemporalLogic.g:1085:2: ( rule__LTLFormula__AlternativesAssignment_1_1 )
            // InternalLinearTemporalLogic.g:1085:3: rule__LTLFormula__AlternativesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula__AlternativesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormulaAccess().getAlternativesAssignment_1_1()); 

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
    // $ANTLR end "rule__LTLFormula__Group_1__1__Impl"


    // $ANTLR start "rule__LTLFormula__Group_1__2"
    // InternalLinearTemporalLogic.g:1093:1: rule__LTLFormula__Group_1__2 : rule__LTLFormula__Group_1__2__Impl ;
    public final void rule__LTLFormula__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1097:1: ( rule__LTLFormula__Group_1__2__Impl )
            // InternalLinearTemporalLogic.g:1098:2: rule__LTLFormula__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula__Group_1__2__Impl();

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
    // $ANTLR end "rule__LTLFormula__Group_1__2"


    // $ANTLR start "rule__LTLFormula__Group_1__2__Impl"
    // InternalLinearTemporalLogic.g:1104:1: rule__LTLFormula__Group_1__2__Impl : ( ( rule__LTLFormula__Group_1_2__0 )* ) ;
    public final void rule__LTLFormula__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1108:1: ( ( ( rule__LTLFormula__Group_1_2__0 )* ) )
            // InternalLinearTemporalLogic.g:1109:1: ( ( rule__LTLFormula__Group_1_2__0 )* )
            {
            // InternalLinearTemporalLogic.g:1109:1: ( ( rule__LTLFormula__Group_1_2__0 )* )
            // InternalLinearTemporalLogic.g:1110:2: ( rule__LTLFormula__Group_1_2__0 )*
            {
             before(grammarAccess.getLTLFormulaAccess().getGroup_1_2()); 
            // InternalLinearTemporalLogic.g:1111:2: ( rule__LTLFormula__Group_1_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLinearTemporalLogic.g:1111:3: rule__LTLFormula__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__LTLFormula__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLTLFormulaAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__LTLFormula__Group_1__2__Impl"


    // $ANTLR start "rule__LTLFormula__Group_1_2__0"
    // InternalLinearTemporalLogic.g:1120:1: rule__LTLFormula__Group_1_2__0 : rule__LTLFormula__Group_1_2__0__Impl rule__LTLFormula__Group_1_2__1 ;
    public final void rule__LTLFormula__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1124:1: ( rule__LTLFormula__Group_1_2__0__Impl rule__LTLFormula__Group_1_2__1 )
            // InternalLinearTemporalLogic.g:1125:2: rule__LTLFormula__Group_1_2__0__Impl rule__LTLFormula__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula__Group_1_2__1();

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
    // $ANTLR end "rule__LTLFormula__Group_1_2__0"


    // $ANTLR start "rule__LTLFormula__Group_1_2__0__Impl"
    // InternalLinearTemporalLogic.g:1132:1: rule__LTLFormula__Group_1_2__0__Impl : ( 'or' ) ;
    public final void rule__LTLFormula__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1136:1: ( ( 'or' ) )
            // InternalLinearTemporalLogic.g:1137:1: ( 'or' )
            {
            // InternalLinearTemporalLogic.g:1137:1: ( 'or' )
            // InternalLinearTemporalLogic.g:1138:2: 'or'
            {
             before(grammarAccess.getLTLFormulaAccess().getOrKeyword_1_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLTLFormulaAccess().getOrKeyword_1_2_0()); 

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
    // $ANTLR end "rule__LTLFormula__Group_1_2__0__Impl"


    // $ANTLR start "rule__LTLFormula__Group_1_2__1"
    // InternalLinearTemporalLogic.g:1147:1: rule__LTLFormula__Group_1_2__1 : rule__LTLFormula__Group_1_2__1__Impl ;
    public final void rule__LTLFormula__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1151:1: ( rule__LTLFormula__Group_1_2__1__Impl )
            // InternalLinearTemporalLogic.g:1152:2: rule__LTLFormula__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__LTLFormula__Group_1_2__1"


    // $ANTLR start "rule__LTLFormula__Group_1_2__1__Impl"
    // InternalLinearTemporalLogic.g:1158:1: rule__LTLFormula__Group_1_2__1__Impl : ( ( rule__LTLFormula__AlternativesAssignment_1_2_1 ) ) ;
    public final void rule__LTLFormula__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1162:1: ( ( ( rule__LTLFormula__AlternativesAssignment_1_2_1 ) ) )
            // InternalLinearTemporalLogic.g:1163:1: ( ( rule__LTLFormula__AlternativesAssignment_1_2_1 ) )
            {
            // InternalLinearTemporalLogic.g:1163:1: ( ( rule__LTLFormula__AlternativesAssignment_1_2_1 ) )
            // InternalLinearTemporalLogic.g:1164:2: ( rule__LTLFormula__AlternativesAssignment_1_2_1 )
            {
             before(grammarAccess.getLTLFormulaAccess().getAlternativesAssignment_1_2_1()); 
            // InternalLinearTemporalLogic.g:1165:2: ( rule__LTLFormula__AlternativesAssignment_1_2_1 )
            // InternalLinearTemporalLogic.g:1165:3: rule__LTLFormula__AlternativesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula__AlternativesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormulaAccess().getAlternativesAssignment_1_2_1()); 

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
    // $ANTLR end "rule__LTLFormula__Group_1_2__1__Impl"


    // $ANTLR start "rule__LTLFormula1__Group__0"
    // InternalLinearTemporalLogic.g:1174:1: rule__LTLFormula1__Group__0 : rule__LTLFormula1__Group__0__Impl rule__LTLFormula1__Group__1 ;
    public final void rule__LTLFormula1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1178:1: ( rule__LTLFormula1__Group__0__Impl rule__LTLFormula1__Group__1 )
            // InternalLinearTemporalLogic.g:1179:2: rule__LTLFormula1__Group__0__Impl rule__LTLFormula1__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__LTLFormula1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula1__Group__1();

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
    // $ANTLR end "rule__LTLFormula1__Group__0"


    // $ANTLR start "rule__LTLFormula1__Group__0__Impl"
    // InternalLinearTemporalLogic.g:1186:1: rule__LTLFormula1__Group__0__Impl : ( ( rule__LTLFormula1__FormulaAssignment_0 ) ) ;
    public final void rule__LTLFormula1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1190:1: ( ( ( rule__LTLFormula1__FormulaAssignment_0 ) ) )
            // InternalLinearTemporalLogic.g:1191:1: ( ( rule__LTLFormula1__FormulaAssignment_0 ) )
            {
            // InternalLinearTemporalLogic.g:1191:1: ( ( rule__LTLFormula1__FormulaAssignment_0 ) )
            // InternalLinearTemporalLogic.g:1192:2: ( rule__LTLFormula1__FormulaAssignment_0 )
            {
             before(grammarAccess.getLTLFormula1Access().getFormulaAssignment_0()); 
            // InternalLinearTemporalLogic.g:1193:2: ( rule__LTLFormula1__FormulaAssignment_0 )
            // InternalLinearTemporalLogic.g:1193:3: rule__LTLFormula1__FormulaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula1__FormulaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula1Access().getFormulaAssignment_0()); 

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
    // $ANTLR end "rule__LTLFormula1__Group__0__Impl"


    // $ANTLR start "rule__LTLFormula1__Group__1"
    // InternalLinearTemporalLogic.g:1201:1: rule__LTLFormula1__Group__1 : rule__LTLFormula1__Group__1__Impl ;
    public final void rule__LTLFormula1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1205:1: ( rule__LTLFormula1__Group__1__Impl )
            // InternalLinearTemporalLogic.g:1206:2: rule__LTLFormula1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula1__Group__1__Impl();

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
    // $ANTLR end "rule__LTLFormula1__Group__1"


    // $ANTLR start "rule__LTLFormula1__Group__1__Impl"
    // InternalLinearTemporalLogic.g:1212:1: rule__LTLFormula1__Group__1__Impl : ( ( rule__LTLFormula1__Group_1__0 )? ) ;
    public final void rule__LTLFormula1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1216:1: ( ( ( rule__LTLFormula1__Group_1__0 )? ) )
            // InternalLinearTemporalLogic.g:1217:1: ( ( rule__LTLFormula1__Group_1__0 )? )
            {
            // InternalLinearTemporalLogic.g:1217:1: ( ( rule__LTLFormula1__Group_1__0 )? )
            // InternalLinearTemporalLogic.g:1218:2: ( rule__LTLFormula1__Group_1__0 )?
            {
             before(grammarAccess.getLTLFormula1Access().getGroup_1()); 
            // InternalLinearTemporalLogic.g:1219:2: ( rule__LTLFormula1__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLinearTemporalLogic.g:1219:3: rule__LTLFormula1__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula1__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLTLFormula1Access().getGroup_1()); 

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
    // $ANTLR end "rule__LTLFormula1__Group__1__Impl"


    // $ANTLR start "rule__LTLFormula1__Group_1__0"
    // InternalLinearTemporalLogic.g:1228:1: rule__LTLFormula1__Group_1__0 : rule__LTLFormula1__Group_1__0__Impl rule__LTLFormula1__Group_1__1 ;
    public final void rule__LTLFormula1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1232:1: ( rule__LTLFormula1__Group_1__0__Impl rule__LTLFormula1__Group_1__1 )
            // InternalLinearTemporalLogic.g:1233:2: rule__LTLFormula1__Group_1__0__Impl rule__LTLFormula1__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula1__Group_1__1();

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
    // $ANTLR end "rule__LTLFormula1__Group_1__0"


    // $ANTLR start "rule__LTLFormula1__Group_1__0__Impl"
    // InternalLinearTemporalLogic.g:1240:1: rule__LTLFormula1__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__LTLFormula1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1244:1: ( ( 'and' ) )
            // InternalLinearTemporalLogic.g:1245:1: ( 'and' )
            {
            // InternalLinearTemporalLogic.g:1245:1: ( 'and' )
            // InternalLinearTemporalLogic.g:1246:2: 'and'
            {
             before(grammarAccess.getLTLFormula1Access().getAndKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLTLFormula1Access().getAndKeyword_1_0()); 

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
    // $ANTLR end "rule__LTLFormula1__Group_1__0__Impl"


    // $ANTLR start "rule__LTLFormula1__Group_1__1"
    // InternalLinearTemporalLogic.g:1255:1: rule__LTLFormula1__Group_1__1 : rule__LTLFormula1__Group_1__1__Impl rule__LTLFormula1__Group_1__2 ;
    public final void rule__LTLFormula1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1259:1: ( rule__LTLFormula1__Group_1__1__Impl rule__LTLFormula1__Group_1__2 )
            // InternalLinearTemporalLogic.g:1260:2: rule__LTLFormula1__Group_1__1__Impl rule__LTLFormula1__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__LTLFormula1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula1__Group_1__2();

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
    // $ANTLR end "rule__LTLFormula1__Group_1__1"


    // $ANTLR start "rule__LTLFormula1__Group_1__1__Impl"
    // InternalLinearTemporalLogic.g:1267:1: rule__LTLFormula1__Group_1__1__Impl : ( ( rule__LTLFormula1__AlternativesAssignment_1_1 ) ) ;
    public final void rule__LTLFormula1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1271:1: ( ( ( rule__LTLFormula1__AlternativesAssignment_1_1 ) ) )
            // InternalLinearTemporalLogic.g:1272:1: ( ( rule__LTLFormula1__AlternativesAssignment_1_1 ) )
            {
            // InternalLinearTemporalLogic.g:1272:1: ( ( rule__LTLFormula1__AlternativesAssignment_1_1 ) )
            // InternalLinearTemporalLogic.g:1273:2: ( rule__LTLFormula1__AlternativesAssignment_1_1 )
            {
             before(grammarAccess.getLTLFormula1Access().getAlternativesAssignment_1_1()); 
            // InternalLinearTemporalLogic.g:1274:2: ( rule__LTLFormula1__AlternativesAssignment_1_1 )
            // InternalLinearTemporalLogic.g:1274:3: rule__LTLFormula1__AlternativesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula1__AlternativesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula1Access().getAlternativesAssignment_1_1()); 

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
    // $ANTLR end "rule__LTLFormula1__Group_1__1__Impl"


    // $ANTLR start "rule__LTLFormula1__Group_1__2"
    // InternalLinearTemporalLogic.g:1282:1: rule__LTLFormula1__Group_1__2 : rule__LTLFormula1__Group_1__2__Impl ;
    public final void rule__LTLFormula1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1286:1: ( rule__LTLFormula1__Group_1__2__Impl )
            // InternalLinearTemporalLogic.g:1287:2: rule__LTLFormula1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula1__Group_1__2__Impl();

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
    // $ANTLR end "rule__LTLFormula1__Group_1__2"


    // $ANTLR start "rule__LTLFormula1__Group_1__2__Impl"
    // InternalLinearTemporalLogic.g:1293:1: rule__LTLFormula1__Group_1__2__Impl : ( ( rule__LTLFormula1__Group_1_2__0 )* ) ;
    public final void rule__LTLFormula1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1297:1: ( ( ( rule__LTLFormula1__Group_1_2__0 )* ) )
            // InternalLinearTemporalLogic.g:1298:1: ( ( rule__LTLFormula1__Group_1_2__0 )* )
            {
            // InternalLinearTemporalLogic.g:1298:1: ( ( rule__LTLFormula1__Group_1_2__0 )* )
            // InternalLinearTemporalLogic.g:1299:2: ( rule__LTLFormula1__Group_1_2__0 )*
            {
             before(grammarAccess.getLTLFormula1Access().getGroup_1_2()); 
            // InternalLinearTemporalLogic.g:1300:2: ( rule__LTLFormula1__Group_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLinearTemporalLogic.g:1300:3: rule__LTLFormula1__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__LTLFormula1__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLTLFormula1Access().getGroup_1_2()); 

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
    // $ANTLR end "rule__LTLFormula1__Group_1__2__Impl"


    // $ANTLR start "rule__LTLFormula1__Group_1_2__0"
    // InternalLinearTemporalLogic.g:1309:1: rule__LTLFormula1__Group_1_2__0 : rule__LTLFormula1__Group_1_2__0__Impl rule__LTLFormula1__Group_1_2__1 ;
    public final void rule__LTLFormula1__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1313:1: ( rule__LTLFormula1__Group_1_2__0__Impl rule__LTLFormula1__Group_1_2__1 )
            // InternalLinearTemporalLogic.g:1314:2: rule__LTLFormula1__Group_1_2__0__Impl rule__LTLFormula1__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula1__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula1__Group_1_2__1();

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
    // $ANTLR end "rule__LTLFormula1__Group_1_2__0"


    // $ANTLR start "rule__LTLFormula1__Group_1_2__0__Impl"
    // InternalLinearTemporalLogic.g:1321:1: rule__LTLFormula1__Group_1_2__0__Impl : ( 'and' ) ;
    public final void rule__LTLFormula1__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1325:1: ( ( 'and' ) )
            // InternalLinearTemporalLogic.g:1326:1: ( 'and' )
            {
            // InternalLinearTemporalLogic.g:1326:1: ( 'and' )
            // InternalLinearTemporalLogic.g:1327:2: 'and'
            {
             before(grammarAccess.getLTLFormula1Access().getAndKeyword_1_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLTLFormula1Access().getAndKeyword_1_2_0()); 

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
    // $ANTLR end "rule__LTLFormula1__Group_1_2__0__Impl"


    // $ANTLR start "rule__LTLFormula1__Group_1_2__1"
    // InternalLinearTemporalLogic.g:1336:1: rule__LTLFormula1__Group_1_2__1 : rule__LTLFormula1__Group_1_2__1__Impl ;
    public final void rule__LTLFormula1__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1340:1: ( rule__LTLFormula1__Group_1_2__1__Impl )
            // InternalLinearTemporalLogic.g:1341:2: rule__LTLFormula1__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula1__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__LTLFormula1__Group_1_2__1"


    // $ANTLR start "rule__LTLFormula1__Group_1_2__1__Impl"
    // InternalLinearTemporalLogic.g:1347:1: rule__LTLFormula1__Group_1_2__1__Impl : ( ( rule__LTLFormula1__AlternativesAssignment_1_2_1 ) ) ;
    public final void rule__LTLFormula1__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1351:1: ( ( ( rule__LTLFormula1__AlternativesAssignment_1_2_1 ) ) )
            // InternalLinearTemporalLogic.g:1352:1: ( ( rule__LTLFormula1__AlternativesAssignment_1_2_1 ) )
            {
            // InternalLinearTemporalLogic.g:1352:1: ( ( rule__LTLFormula1__AlternativesAssignment_1_2_1 ) )
            // InternalLinearTemporalLogic.g:1353:2: ( rule__LTLFormula1__AlternativesAssignment_1_2_1 )
            {
             before(grammarAccess.getLTLFormula1Access().getAlternativesAssignment_1_2_1()); 
            // InternalLinearTemporalLogic.g:1354:2: ( rule__LTLFormula1__AlternativesAssignment_1_2_1 )
            // InternalLinearTemporalLogic.g:1354:3: rule__LTLFormula1__AlternativesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula1__AlternativesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula1Access().getAlternativesAssignment_1_2_1()); 

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
    // $ANTLR end "rule__LTLFormula1__Group_1_2__1__Impl"


    // $ANTLR start "rule__LTLFormula2__Group__0"
    // InternalLinearTemporalLogic.g:1363:1: rule__LTLFormula2__Group__0 : rule__LTLFormula2__Group__0__Impl rule__LTLFormula2__Group__1 ;
    public final void rule__LTLFormula2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1367:1: ( rule__LTLFormula2__Group__0__Impl rule__LTLFormula2__Group__1 )
            // InternalLinearTemporalLogic.g:1368:2: rule__LTLFormula2__Group__0__Impl rule__LTLFormula2__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__LTLFormula2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula2__Group__1();

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
    // $ANTLR end "rule__LTLFormula2__Group__0"


    // $ANTLR start "rule__LTLFormula2__Group__0__Impl"
    // InternalLinearTemporalLogic.g:1375:1: rule__LTLFormula2__Group__0__Impl : ( ( rule__LTLFormula2__Subexpression1Assignment_0 ) ) ;
    public final void rule__LTLFormula2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1379:1: ( ( ( rule__LTLFormula2__Subexpression1Assignment_0 ) ) )
            // InternalLinearTemporalLogic.g:1380:1: ( ( rule__LTLFormula2__Subexpression1Assignment_0 ) )
            {
            // InternalLinearTemporalLogic.g:1380:1: ( ( rule__LTLFormula2__Subexpression1Assignment_0 ) )
            // InternalLinearTemporalLogic.g:1381:2: ( rule__LTLFormula2__Subexpression1Assignment_0 )
            {
             before(grammarAccess.getLTLFormula2Access().getSubexpression1Assignment_0()); 
            // InternalLinearTemporalLogic.g:1382:2: ( rule__LTLFormula2__Subexpression1Assignment_0 )
            // InternalLinearTemporalLogic.g:1382:3: rule__LTLFormula2__Subexpression1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula2__Subexpression1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula2Access().getSubexpression1Assignment_0()); 

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
    // $ANTLR end "rule__LTLFormula2__Group__0__Impl"


    // $ANTLR start "rule__LTLFormula2__Group__1"
    // InternalLinearTemporalLogic.g:1390:1: rule__LTLFormula2__Group__1 : rule__LTLFormula2__Group__1__Impl ;
    public final void rule__LTLFormula2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1394:1: ( rule__LTLFormula2__Group__1__Impl )
            // InternalLinearTemporalLogic.g:1395:2: rule__LTLFormula2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula2__Group__1__Impl();

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
    // $ANTLR end "rule__LTLFormula2__Group__1"


    // $ANTLR start "rule__LTLFormula2__Group__1__Impl"
    // InternalLinearTemporalLogic.g:1401:1: rule__LTLFormula2__Group__1__Impl : ( ( rule__LTLFormula2__Group_1__0 )? ) ;
    public final void rule__LTLFormula2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1405:1: ( ( ( rule__LTLFormula2__Group_1__0 )? ) )
            // InternalLinearTemporalLogic.g:1406:1: ( ( rule__LTLFormula2__Group_1__0 )? )
            {
            // InternalLinearTemporalLogic.g:1406:1: ( ( rule__LTLFormula2__Group_1__0 )? )
            // InternalLinearTemporalLogic.g:1407:2: ( rule__LTLFormula2__Group_1__0 )?
            {
             before(grammarAccess.getLTLFormula2Access().getGroup_1()); 
            // InternalLinearTemporalLogic.g:1408:2: ( rule__LTLFormula2__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLinearTemporalLogic.g:1408:3: rule__LTLFormula2__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula2__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLTLFormula2Access().getGroup_1()); 

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
    // $ANTLR end "rule__LTLFormula2__Group__1__Impl"


    // $ANTLR start "rule__LTLFormula2__Group_1__0"
    // InternalLinearTemporalLogic.g:1417:1: rule__LTLFormula2__Group_1__0 : rule__LTLFormula2__Group_1__0__Impl rule__LTLFormula2__Group_1__1 ;
    public final void rule__LTLFormula2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1421:1: ( rule__LTLFormula2__Group_1__0__Impl rule__LTLFormula2__Group_1__1 )
            // InternalLinearTemporalLogic.g:1422:2: rule__LTLFormula2__Group_1__0__Impl rule__LTLFormula2__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula2__Group_1__1();

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
    // $ANTLR end "rule__LTLFormula2__Group_1__0"


    // $ANTLR start "rule__LTLFormula2__Group_1__0__Impl"
    // InternalLinearTemporalLogic.g:1429:1: rule__LTLFormula2__Group_1__0__Impl : ( 'U' ) ;
    public final void rule__LTLFormula2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1433:1: ( ( 'U' ) )
            // InternalLinearTemporalLogic.g:1434:1: ( 'U' )
            {
            // InternalLinearTemporalLogic.g:1434:1: ( 'U' )
            // InternalLinearTemporalLogic.g:1435:2: 'U'
            {
             before(grammarAccess.getLTLFormula2Access().getUKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLTLFormula2Access().getUKeyword_1_0()); 

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
    // $ANTLR end "rule__LTLFormula2__Group_1__0__Impl"


    // $ANTLR start "rule__LTLFormula2__Group_1__1"
    // InternalLinearTemporalLogic.g:1444:1: rule__LTLFormula2__Group_1__1 : rule__LTLFormula2__Group_1__1__Impl ;
    public final void rule__LTLFormula2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1448:1: ( rule__LTLFormula2__Group_1__1__Impl )
            // InternalLinearTemporalLogic.g:1449:2: rule__LTLFormula2__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula2__Group_1__1__Impl();

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
    // $ANTLR end "rule__LTLFormula2__Group_1__1"


    // $ANTLR start "rule__LTLFormula2__Group_1__1__Impl"
    // InternalLinearTemporalLogic.g:1455:1: rule__LTLFormula2__Group_1__1__Impl : ( ( rule__LTLFormula2__Subexpression2Assignment_1_1 ) ) ;
    public final void rule__LTLFormula2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1459:1: ( ( ( rule__LTLFormula2__Subexpression2Assignment_1_1 ) ) )
            // InternalLinearTemporalLogic.g:1460:1: ( ( rule__LTLFormula2__Subexpression2Assignment_1_1 ) )
            {
            // InternalLinearTemporalLogic.g:1460:1: ( ( rule__LTLFormula2__Subexpression2Assignment_1_1 ) )
            // InternalLinearTemporalLogic.g:1461:2: ( rule__LTLFormula2__Subexpression2Assignment_1_1 )
            {
             before(grammarAccess.getLTLFormula2Access().getSubexpression2Assignment_1_1()); 
            // InternalLinearTemporalLogic.g:1462:2: ( rule__LTLFormula2__Subexpression2Assignment_1_1 )
            // InternalLinearTemporalLogic.g:1462:3: rule__LTLFormula2__Subexpression2Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula2__Subexpression2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula2Access().getSubexpression2Assignment_1_1()); 

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
    // $ANTLR end "rule__LTLFormula2__Group_1__1__Impl"


    // $ANTLR start "rule__LTLFormula3__Group__0"
    // InternalLinearTemporalLogic.g:1471:1: rule__LTLFormula3__Group__0 : rule__LTLFormula3__Group__0__Impl rule__LTLFormula3__Group__1 ;
    public final void rule__LTLFormula3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1475:1: ( rule__LTLFormula3__Group__0__Impl rule__LTLFormula3__Group__1 )
            // InternalLinearTemporalLogic.g:1476:2: rule__LTLFormula3__Group__0__Impl rule__LTLFormula3__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__LTLFormula3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula3__Group__1();

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
    // $ANTLR end "rule__LTLFormula3__Group__0"


    // $ANTLR start "rule__LTLFormula3__Group__0__Impl"
    // InternalLinearTemporalLogic.g:1483:1: rule__LTLFormula3__Group__0__Impl : ( ( rule__LTLFormula3__Subexpression1Assignment_0 ) ) ;
    public final void rule__LTLFormula3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1487:1: ( ( ( rule__LTLFormula3__Subexpression1Assignment_0 ) ) )
            // InternalLinearTemporalLogic.g:1488:1: ( ( rule__LTLFormula3__Subexpression1Assignment_0 ) )
            {
            // InternalLinearTemporalLogic.g:1488:1: ( ( rule__LTLFormula3__Subexpression1Assignment_0 ) )
            // InternalLinearTemporalLogic.g:1489:2: ( rule__LTLFormula3__Subexpression1Assignment_0 )
            {
             before(grammarAccess.getLTLFormula3Access().getSubexpression1Assignment_0()); 
            // InternalLinearTemporalLogic.g:1490:2: ( rule__LTLFormula3__Subexpression1Assignment_0 )
            // InternalLinearTemporalLogic.g:1490:3: rule__LTLFormula3__Subexpression1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula3__Subexpression1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula3Access().getSubexpression1Assignment_0()); 

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
    // $ANTLR end "rule__LTLFormula3__Group__0__Impl"


    // $ANTLR start "rule__LTLFormula3__Group__1"
    // InternalLinearTemporalLogic.g:1498:1: rule__LTLFormula3__Group__1 : rule__LTLFormula3__Group__1__Impl ;
    public final void rule__LTLFormula3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1502:1: ( rule__LTLFormula3__Group__1__Impl )
            // InternalLinearTemporalLogic.g:1503:2: rule__LTLFormula3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula3__Group__1__Impl();

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
    // $ANTLR end "rule__LTLFormula3__Group__1"


    // $ANTLR start "rule__LTLFormula3__Group__1__Impl"
    // InternalLinearTemporalLogic.g:1509:1: rule__LTLFormula3__Group__1__Impl : ( ( rule__LTLFormula3__Group_1__0 )? ) ;
    public final void rule__LTLFormula3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1513:1: ( ( ( rule__LTLFormula3__Group_1__0 )? ) )
            // InternalLinearTemporalLogic.g:1514:1: ( ( rule__LTLFormula3__Group_1__0 )? )
            {
            // InternalLinearTemporalLogic.g:1514:1: ( ( rule__LTLFormula3__Group_1__0 )? )
            // InternalLinearTemporalLogic.g:1515:2: ( rule__LTLFormula3__Group_1__0 )?
            {
             before(grammarAccess.getLTLFormula3Access().getGroup_1()); 
            // InternalLinearTemporalLogic.g:1516:2: ( rule__LTLFormula3__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLinearTemporalLogic.g:1516:3: rule__LTLFormula3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula3__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLTLFormula3Access().getGroup_1()); 

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
    // $ANTLR end "rule__LTLFormula3__Group__1__Impl"


    // $ANTLR start "rule__LTLFormula3__Group_1__0"
    // InternalLinearTemporalLogic.g:1525:1: rule__LTLFormula3__Group_1__0 : rule__LTLFormula3__Group_1__0__Impl rule__LTLFormula3__Group_1__1 ;
    public final void rule__LTLFormula3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1529:1: ( rule__LTLFormula3__Group_1__0__Impl rule__LTLFormula3__Group_1__1 )
            // InternalLinearTemporalLogic.g:1530:2: rule__LTLFormula3__Group_1__0__Impl rule__LTLFormula3__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula3__Group_1__1();

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
    // $ANTLR end "rule__LTLFormula3__Group_1__0"


    // $ANTLR start "rule__LTLFormula3__Group_1__0__Impl"
    // InternalLinearTemporalLogic.g:1537:1: rule__LTLFormula3__Group_1__0__Impl : ( 'R' ) ;
    public final void rule__LTLFormula3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1541:1: ( ( 'R' ) )
            // InternalLinearTemporalLogic.g:1542:1: ( 'R' )
            {
            // InternalLinearTemporalLogic.g:1542:1: ( 'R' )
            // InternalLinearTemporalLogic.g:1543:2: 'R'
            {
             before(grammarAccess.getLTLFormula3Access().getRKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLTLFormula3Access().getRKeyword_1_0()); 

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
    // $ANTLR end "rule__LTLFormula3__Group_1__0__Impl"


    // $ANTLR start "rule__LTLFormula3__Group_1__1"
    // InternalLinearTemporalLogic.g:1552:1: rule__LTLFormula3__Group_1__1 : rule__LTLFormula3__Group_1__1__Impl ;
    public final void rule__LTLFormula3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1556:1: ( rule__LTLFormula3__Group_1__1__Impl )
            // InternalLinearTemporalLogic.g:1557:2: rule__LTLFormula3__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula3__Group_1__1__Impl();

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
    // $ANTLR end "rule__LTLFormula3__Group_1__1"


    // $ANTLR start "rule__LTLFormula3__Group_1__1__Impl"
    // InternalLinearTemporalLogic.g:1563:1: rule__LTLFormula3__Group_1__1__Impl : ( ( rule__LTLFormula3__Subexpression2Assignment_1_1 ) ) ;
    public final void rule__LTLFormula3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1567:1: ( ( ( rule__LTLFormula3__Subexpression2Assignment_1_1 ) ) )
            // InternalLinearTemporalLogic.g:1568:1: ( ( rule__LTLFormula3__Subexpression2Assignment_1_1 ) )
            {
            // InternalLinearTemporalLogic.g:1568:1: ( ( rule__LTLFormula3__Subexpression2Assignment_1_1 ) )
            // InternalLinearTemporalLogic.g:1569:2: ( rule__LTLFormula3__Subexpression2Assignment_1_1 )
            {
             before(grammarAccess.getLTLFormula3Access().getSubexpression2Assignment_1_1()); 
            // InternalLinearTemporalLogic.g:1570:2: ( rule__LTLFormula3__Subexpression2Assignment_1_1 )
            // InternalLinearTemporalLogic.g:1570:3: rule__LTLFormula3__Subexpression2Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula3__Subexpression2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula3Access().getSubexpression2Assignment_1_1()); 

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
    // $ANTLR end "rule__LTLFormula3__Group_1__1__Impl"


    // $ANTLR start "rule__LTLFormula4__Group__0"
    // InternalLinearTemporalLogic.g:1579:1: rule__LTLFormula4__Group__0 : rule__LTLFormula4__Group__0__Impl rule__LTLFormula4__Group__1 ;
    public final void rule__LTLFormula4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1583:1: ( rule__LTLFormula4__Group__0__Impl rule__LTLFormula4__Group__1 )
            // InternalLinearTemporalLogic.g:1584:2: rule__LTLFormula4__Group__0__Impl rule__LTLFormula4__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__LTLFormula4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula4__Group__1();

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
    // $ANTLR end "rule__LTLFormula4__Group__0"


    // $ANTLR start "rule__LTLFormula4__Group__0__Impl"
    // InternalLinearTemporalLogic.g:1591:1: rule__LTLFormula4__Group__0__Impl : ( ( rule__LTLFormula4__SubexpressionAssignment_0 ) ) ;
    public final void rule__LTLFormula4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1595:1: ( ( ( rule__LTLFormula4__SubexpressionAssignment_0 ) ) )
            // InternalLinearTemporalLogic.g:1596:1: ( ( rule__LTLFormula4__SubexpressionAssignment_0 ) )
            {
            // InternalLinearTemporalLogic.g:1596:1: ( ( rule__LTLFormula4__SubexpressionAssignment_0 ) )
            // InternalLinearTemporalLogic.g:1597:2: ( rule__LTLFormula4__SubexpressionAssignment_0 )
            {
             before(grammarAccess.getLTLFormula4Access().getSubexpressionAssignment_0()); 
            // InternalLinearTemporalLogic.g:1598:2: ( rule__LTLFormula4__SubexpressionAssignment_0 )
            // InternalLinearTemporalLogic.g:1598:3: rule__LTLFormula4__SubexpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula4__SubexpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula4Access().getSubexpressionAssignment_0()); 

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
    // $ANTLR end "rule__LTLFormula4__Group__0__Impl"


    // $ANTLR start "rule__LTLFormula4__Group__1"
    // InternalLinearTemporalLogic.g:1606:1: rule__LTLFormula4__Group__1 : rule__LTLFormula4__Group__1__Impl ;
    public final void rule__LTLFormula4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1610:1: ( rule__LTLFormula4__Group__1__Impl )
            // InternalLinearTemporalLogic.g:1611:2: rule__LTLFormula4__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula4__Group__1__Impl();

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
    // $ANTLR end "rule__LTLFormula4__Group__1"


    // $ANTLR start "rule__LTLFormula4__Group__1__Impl"
    // InternalLinearTemporalLogic.g:1617:1: rule__LTLFormula4__Group__1__Impl : ( ( rule__LTLFormula4__Group_1__0 )? ) ;
    public final void rule__LTLFormula4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1621:1: ( ( ( rule__LTLFormula4__Group_1__0 )? ) )
            // InternalLinearTemporalLogic.g:1622:1: ( ( rule__LTLFormula4__Group_1__0 )? )
            {
            // InternalLinearTemporalLogic.g:1622:1: ( ( rule__LTLFormula4__Group_1__0 )? )
            // InternalLinearTemporalLogic.g:1623:2: ( rule__LTLFormula4__Group_1__0 )?
            {
             before(grammarAccess.getLTLFormula4Access().getGroup_1()); 
            // InternalLinearTemporalLogic.g:1624:2: ( rule__LTLFormula4__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLinearTemporalLogic.g:1624:3: rule__LTLFormula4__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LTLFormula4__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLTLFormula4Access().getGroup_1()); 

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
    // $ANTLR end "rule__LTLFormula4__Group__1__Impl"


    // $ANTLR start "rule__LTLFormula4__Group_1__0"
    // InternalLinearTemporalLogic.g:1633:1: rule__LTLFormula4__Group_1__0 : rule__LTLFormula4__Group_1__0__Impl rule__LTLFormula4__Group_1__1 ;
    public final void rule__LTLFormula4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1637:1: ( rule__LTLFormula4__Group_1__0__Impl rule__LTLFormula4__Group_1__1 )
            // InternalLinearTemporalLogic.g:1638:2: rule__LTLFormula4__Group_1__0__Impl rule__LTLFormula4__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula4__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula4__Group_1__1();

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
    // $ANTLR end "rule__LTLFormula4__Group_1__0"


    // $ANTLR start "rule__LTLFormula4__Group_1__0__Impl"
    // InternalLinearTemporalLogic.g:1645:1: rule__LTLFormula4__Group_1__0__Impl : ( '=>' ) ;
    public final void rule__LTLFormula4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1649:1: ( ( '=>' ) )
            // InternalLinearTemporalLogic.g:1650:1: ( '=>' )
            {
            // InternalLinearTemporalLogic.g:1650:1: ( '=>' )
            // InternalLinearTemporalLogic.g:1651:2: '=>'
            {
             before(grammarAccess.getLTLFormula4Access().getEqualsSignGreaterThanSignKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLTLFormula4Access().getEqualsSignGreaterThanSignKeyword_1_0()); 

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
    // $ANTLR end "rule__LTLFormula4__Group_1__0__Impl"


    // $ANTLR start "rule__LTLFormula4__Group_1__1"
    // InternalLinearTemporalLogic.g:1660:1: rule__LTLFormula4__Group_1__1 : rule__LTLFormula4__Group_1__1__Impl ;
    public final void rule__LTLFormula4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1664:1: ( rule__LTLFormula4__Group_1__1__Impl )
            // InternalLinearTemporalLogic.g:1665:2: rule__LTLFormula4__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula4__Group_1__1__Impl();

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
    // $ANTLR end "rule__LTLFormula4__Group_1__1"


    // $ANTLR start "rule__LTLFormula4__Group_1__1__Impl"
    // InternalLinearTemporalLogic.g:1671:1: rule__LTLFormula4__Group_1__1__Impl : ( ( rule__LTLFormula4__ConsequenceAssignment_1_1 ) ) ;
    public final void rule__LTLFormula4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1675:1: ( ( ( rule__LTLFormula4__ConsequenceAssignment_1_1 ) ) )
            // InternalLinearTemporalLogic.g:1676:1: ( ( rule__LTLFormula4__ConsequenceAssignment_1_1 ) )
            {
            // InternalLinearTemporalLogic.g:1676:1: ( ( rule__LTLFormula4__ConsequenceAssignment_1_1 ) )
            // InternalLinearTemporalLogic.g:1677:2: ( rule__LTLFormula4__ConsequenceAssignment_1_1 )
            {
             before(grammarAccess.getLTLFormula4Access().getConsequenceAssignment_1_1()); 
            // InternalLinearTemporalLogic.g:1678:2: ( rule__LTLFormula4__ConsequenceAssignment_1_1 )
            // InternalLinearTemporalLogic.g:1678:3: rule__LTLFormula4__ConsequenceAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula4__ConsequenceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula4Access().getConsequenceAssignment_1_1()); 

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
    // $ANTLR end "rule__LTLFormula4__Group_1__1__Impl"


    // $ANTLR start "rule__LTLFormula5__Group_0__0"
    // InternalLinearTemporalLogic.g:1687:1: rule__LTLFormula5__Group_0__0 : rule__LTLFormula5__Group_0__0__Impl rule__LTLFormula5__Group_0__1 ;
    public final void rule__LTLFormula5__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1691:1: ( rule__LTLFormula5__Group_0__0__Impl rule__LTLFormula5__Group_0__1 )
            // InternalLinearTemporalLogic.g:1692:2: rule__LTLFormula5__Group_0__0__Impl rule__LTLFormula5__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula5__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Group_0__1();

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
    // $ANTLR end "rule__LTLFormula5__Group_0__0"


    // $ANTLR start "rule__LTLFormula5__Group_0__0__Impl"
    // InternalLinearTemporalLogic.g:1699:1: rule__LTLFormula5__Group_0__0__Impl : ( 'X' ) ;
    public final void rule__LTLFormula5__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1703:1: ( ( 'X' ) )
            // InternalLinearTemporalLogic.g:1704:1: ( 'X' )
            {
            // InternalLinearTemporalLogic.g:1704:1: ( 'X' )
            // InternalLinearTemporalLogic.g:1705:2: 'X'
            {
             before(grammarAccess.getLTLFormula5Access().getXKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLTLFormula5Access().getXKeyword_0_0()); 

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
    // $ANTLR end "rule__LTLFormula5__Group_0__0__Impl"


    // $ANTLR start "rule__LTLFormula5__Group_0__1"
    // InternalLinearTemporalLogic.g:1714:1: rule__LTLFormula5__Group_0__1 : rule__LTLFormula5__Group_0__1__Impl ;
    public final void rule__LTLFormula5__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1718:1: ( rule__LTLFormula5__Group_0__1__Impl )
            // InternalLinearTemporalLogic.g:1719:2: rule__LTLFormula5__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Group_0__1__Impl();

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
    // $ANTLR end "rule__LTLFormula5__Group_0__1"


    // $ANTLR start "rule__LTLFormula5__Group_0__1__Impl"
    // InternalLinearTemporalLogic.g:1725:1: rule__LTLFormula5__Group_0__1__Impl : ( ( rule__LTLFormula5__NextSubexpressionAssignment_0_1 ) ) ;
    public final void rule__LTLFormula5__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1729:1: ( ( ( rule__LTLFormula5__NextSubexpressionAssignment_0_1 ) ) )
            // InternalLinearTemporalLogic.g:1730:1: ( ( rule__LTLFormula5__NextSubexpressionAssignment_0_1 ) )
            {
            // InternalLinearTemporalLogic.g:1730:1: ( ( rule__LTLFormula5__NextSubexpressionAssignment_0_1 ) )
            // InternalLinearTemporalLogic.g:1731:2: ( rule__LTLFormula5__NextSubexpressionAssignment_0_1 )
            {
             before(grammarAccess.getLTLFormula5Access().getNextSubexpressionAssignment_0_1()); 
            // InternalLinearTemporalLogic.g:1732:2: ( rule__LTLFormula5__NextSubexpressionAssignment_0_1 )
            // InternalLinearTemporalLogic.g:1732:3: rule__LTLFormula5__NextSubexpressionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__NextSubexpressionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula5Access().getNextSubexpressionAssignment_0_1()); 

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
    // $ANTLR end "rule__LTLFormula5__Group_0__1__Impl"


    // $ANTLR start "rule__LTLFormula5__Group_1__0"
    // InternalLinearTemporalLogic.g:1741:1: rule__LTLFormula5__Group_1__0 : rule__LTLFormula5__Group_1__0__Impl rule__LTLFormula5__Group_1__1 ;
    public final void rule__LTLFormula5__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1745:1: ( rule__LTLFormula5__Group_1__0__Impl rule__LTLFormula5__Group_1__1 )
            // InternalLinearTemporalLogic.g:1746:2: rule__LTLFormula5__Group_1__0__Impl rule__LTLFormula5__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula5__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Group_1__1();

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
    // $ANTLR end "rule__LTLFormula5__Group_1__0"


    // $ANTLR start "rule__LTLFormula5__Group_1__0__Impl"
    // InternalLinearTemporalLogic.g:1753:1: rule__LTLFormula5__Group_1__0__Impl : ( 'F' ) ;
    public final void rule__LTLFormula5__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1757:1: ( ( 'F' ) )
            // InternalLinearTemporalLogic.g:1758:1: ( 'F' )
            {
            // InternalLinearTemporalLogic.g:1758:1: ( 'F' )
            // InternalLinearTemporalLogic.g:1759:2: 'F'
            {
             before(grammarAccess.getLTLFormula5Access().getFKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLTLFormula5Access().getFKeyword_1_0()); 

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
    // $ANTLR end "rule__LTLFormula5__Group_1__0__Impl"


    // $ANTLR start "rule__LTLFormula5__Group_1__1"
    // InternalLinearTemporalLogic.g:1768:1: rule__LTLFormula5__Group_1__1 : rule__LTLFormula5__Group_1__1__Impl ;
    public final void rule__LTLFormula5__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1772:1: ( rule__LTLFormula5__Group_1__1__Impl )
            // InternalLinearTemporalLogic.g:1773:2: rule__LTLFormula5__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Group_1__1__Impl();

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
    // $ANTLR end "rule__LTLFormula5__Group_1__1"


    // $ANTLR start "rule__LTLFormula5__Group_1__1__Impl"
    // InternalLinearTemporalLogic.g:1779:1: rule__LTLFormula5__Group_1__1__Impl : ( ( rule__LTLFormula5__EventuallySubexpressionAssignment_1_1 ) ) ;
    public final void rule__LTLFormula5__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1783:1: ( ( ( rule__LTLFormula5__EventuallySubexpressionAssignment_1_1 ) ) )
            // InternalLinearTemporalLogic.g:1784:1: ( ( rule__LTLFormula5__EventuallySubexpressionAssignment_1_1 ) )
            {
            // InternalLinearTemporalLogic.g:1784:1: ( ( rule__LTLFormula5__EventuallySubexpressionAssignment_1_1 ) )
            // InternalLinearTemporalLogic.g:1785:2: ( rule__LTLFormula5__EventuallySubexpressionAssignment_1_1 )
            {
             before(grammarAccess.getLTLFormula5Access().getEventuallySubexpressionAssignment_1_1()); 
            // InternalLinearTemporalLogic.g:1786:2: ( rule__LTLFormula5__EventuallySubexpressionAssignment_1_1 )
            // InternalLinearTemporalLogic.g:1786:3: rule__LTLFormula5__EventuallySubexpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__EventuallySubexpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula5Access().getEventuallySubexpressionAssignment_1_1()); 

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
    // $ANTLR end "rule__LTLFormula5__Group_1__1__Impl"


    // $ANTLR start "rule__LTLFormula5__Group_2__0"
    // InternalLinearTemporalLogic.g:1795:1: rule__LTLFormula5__Group_2__0 : rule__LTLFormula5__Group_2__0__Impl rule__LTLFormula5__Group_2__1 ;
    public final void rule__LTLFormula5__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1799:1: ( rule__LTLFormula5__Group_2__0__Impl rule__LTLFormula5__Group_2__1 )
            // InternalLinearTemporalLogic.g:1800:2: rule__LTLFormula5__Group_2__0__Impl rule__LTLFormula5__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula5__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Group_2__1();

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
    // $ANTLR end "rule__LTLFormula5__Group_2__0"


    // $ANTLR start "rule__LTLFormula5__Group_2__0__Impl"
    // InternalLinearTemporalLogic.g:1807:1: rule__LTLFormula5__Group_2__0__Impl : ( 'G' ) ;
    public final void rule__LTLFormula5__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1811:1: ( ( 'G' ) )
            // InternalLinearTemporalLogic.g:1812:1: ( 'G' )
            {
            // InternalLinearTemporalLogic.g:1812:1: ( 'G' )
            // InternalLinearTemporalLogic.g:1813:2: 'G'
            {
             before(grammarAccess.getLTLFormula5Access().getGKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLTLFormula5Access().getGKeyword_2_0()); 

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
    // $ANTLR end "rule__LTLFormula5__Group_2__0__Impl"


    // $ANTLR start "rule__LTLFormula5__Group_2__1"
    // InternalLinearTemporalLogic.g:1822:1: rule__LTLFormula5__Group_2__1 : rule__LTLFormula5__Group_2__1__Impl ;
    public final void rule__LTLFormula5__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1826:1: ( rule__LTLFormula5__Group_2__1__Impl )
            // InternalLinearTemporalLogic.g:1827:2: rule__LTLFormula5__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Group_2__1__Impl();

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
    // $ANTLR end "rule__LTLFormula5__Group_2__1"


    // $ANTLR start "rule__LTLFormula5__Group_2__1__Impl"
    // InternalLinearTemporalLogic.g:1833:1: rule__LTLFormula5__Group_2__1__Impl : ( ( rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1 ) ) ;
    public final void rule__LTLFormula5__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1837:1: ( ( ( rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1 ) ) )
            // InternalLinearTemporalLogic.g:1838:1: ( ( rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1 ) )
            {
            // InternalLinearTemporalLogic.g:1838:1: ( ( rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1 ) )
            // InternalLinearTemporalLogic.g:1839:2: ( rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1 )
            {
             before(grammarAccess.getLTLFormula5Access().getAlwaysSubexpressionAssignment_2_1()); 
            // InternalLinearTemporalLogic.g:1840:2: ( rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1 )
            // InternalLinearTemporalLogic.g:1840:3: rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula5Access().getAlwaysSubexpressionAssignment_2_1()); 

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
    // $ANTLR end "rule__LTLFormula5__Group_2__1__Impl"


    // $ANTLR start "rule__LTLFormula5__Group_3__0"
    // InternalLinearTemporalLogic.g:1849:1: rule__LTLFormula5__Group_3__0 : rule__LTLFormula5__Group_3__0__Impl rule__LTLFormula5__Group_3__1 ;
    public final void rule__LTLFormula5__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1853:1: ( rule__LTLFormula5__Group_3__0__Impl rule__LTLFormula5__Group_3__1 )
            // InternalLinearTemporalLogic.g:1854:2: rule__LTLFormula5__Group_3__0__Impl rule__LTLFormula5__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula5__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Group_3__1();

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
    // $ANTLR end "rule__LTLFormula5__Group_3__0"


    // $ANTLR start "rule__LTLFormula5__Group_3__0__Impl"
    // InternalLinearTemporalLogic.g:1861:1: rule__LTLFormula5__Group_3__0__Impl : ( 'not' ) ;
    public final void rule__LTLFormula5__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1865:1: ( ( 'not' ) )
            // InternalLinearTemporalLogic.g:1866:1: ( 'not' )
            {
            // InternalLinearTemporalLogic.g:1866:1: ( 'not' )
            // InternalLinearTemporalLogic.g:1867:2: 'not'
            {
             before(grammarAccess.getLTLFormula5Access().getNotKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLTLFormula5Access().getNotKeyword_3_0()); 

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
    // $ANTLR end "rule__LTLFormula5__Group_3__0__Impl"


    // $ANTLR start "rule__LTLFormula5__Group_3__1"
    // InternalLinearTemporalLogic.g:1876:1: rule__LTLFormula5__Group_3__1 : rule__LTLFormula5__Group_3__1__Impl ;
    public final void rule__LTLFormula5__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1880:1: ( rule__LTLFormula5__Group_3__1__Impl )
            // InternalLinearTemporalLogic.g:1881:2: rule__LTLFormula5__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__Group_3__1__Impl();

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
    // $ANTLR end "rule__LTLFormula5__Group_3__1"


    // $ANTLR start "rule__LTLFormula5__Group_3__1__Impl"
    // InternalLinearTemporalLogic.g:1887:1: rule__LTLFormula5__Group_3__1__Impl : ( ( rule__LTLFormula5__NotSubexpressionAssignment_3_1 ) ) ;
    public final void rule__LTLFormula5__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1891:1: ( ( ( rule__LTLFormula5__NotSubexpressionAssignment_3_1 ) ) )
            // InternalLinearTemporalLogic.g:1892:1: ( ( rule__LTLFormula5__NotSubexpressionAssignment_3_1 ) )
            {
            // InternalLinearTemporalLogic.g:1892:1: ( ( rule__LTLFormula5__NotSubexpressionAssignment_3_1 ) )
            // InternalLinearTemporalLogic.g:1893:2: ( rule__LTLFormula5__NotSubexpressionAssignment_3_1 )
            {
             before(grammarAccess.getLTLFormula5Access().getNotSubexpressionAssignment_3_1()); 
            // InternalLinearTemporalLogic.g:1894:2: ( rule__LTLFormula5__NotSubexpressionAssignment_3_1 )
            // InternalLinearTemporalLogic.g:1894:3: rule__LTLFormula5__NotSubexpressionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula5__NotSubexpressionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula5Access().getNotSubexpressionAssignment_3_1()); 

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
    // $ANTLR end "rule__LTLFormula5__Group_3__1__Impl"


    // $ANTLR start "rule__LTLFormula6__Group_3__0"
    // InternalLinearTemporalLogic.g:1903:1: rule__LTLFormula6__Group_3__0 : rule__LTLFormula6__Group_3__0__Impl rule__LTLFormula6__Group_3__1 ;
    public final void rule__LTLFormula6__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1907:1: ( rule__LTLFormula6__Group_3__0__Impl rule__LTLFormula6__Group_3__1 )
            // InternalLinearTemporalLogic.g:1908:2: rule__LTLFormula6__Group_3__0__Impl rule__LTLFormula6__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__LTLFormula6__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula6__Group_3__1();

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
    // $ANTLR end "rule__LTLFormula6__Group_3__0"


    // $ANTLR start "rule__LTLFormula6__Group_3__0__Impl"
    // InternalLinearTemporalLogic.g:1915:1: rule__LTLFormula6__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LTLFormula6__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1919:1: ( ( '(' ) )
            // InternalLinearTemporalLogic.g:1920:1: ( '(' )
            {
            // InternalLinearTemporalLogic.g:1920:1: ( '(' )
            // InternalLinearTemporalLogic.g:1921:2: '('
            {
             before(grammarAccess.getLTLFormula6Access().getLeftParenthesisKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLTLFormula6Access().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__LTLFormula6__Group_3__0__Impl"


    // $ANTLR start "rule__LTLFormula6__Group_3__1"
    // InternalLinearTemporalLogic.g:1930:1: rule__LTLFormula6__Group_3__1 : rule__LTLFormula6__Group_3__1__Impl rule__LTLFormula6__Group_3__2 ;
    public final void rule__LTLFormula6__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1934:1: ( rule__LTLFormula6__Group_3__1__Impl rule__LTLFormula6__Group_3__2 )
            // InternalLinearTemporalLogic.g:1935:2: rule__LTLFormula6__Group_3__1__Impl rule__LTLFormula6__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__LTLFormula6__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LTLFormula6__Group_3__2();

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
    // $ANTLR end "rule__LTLFormula6__Group_3__1"


    // $ANTLR start "rule__LTLFormula6__Group_3__1__Impl"
    // InternalLinearTemporalLogic.g:1942:1: rule__LTLFormula6__Group_3__1__Impl : ( ( rule__LTLFormula6__ExpressionAssignment_3_1 ) ) ;
    public final void rule__LTLFormula6__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1946:1: ( ( ( rule__LTLFormula6__ExpressionAssignment_3_1 ) ) )
            // InternalLinearTemporalLogic.g:1947:1: ( ( rule__LTLFormula6__ExpressionAssignment_3_1 ) )
            {
            // InternalLinearTemporalLogic.g:1947:1: ( ( rule__LTLFormula6__ExpressionAssignment_3_1 ) )
            // InternalLinearTemporalLogic.g:1948:2: ( rule__LTLFormula6__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getLTLFormula6Access().getExpressionAssignment_3_1()); 
            // InternalLinearTemporalLogic.g:1949:2: ( rule__LTLFormula6__ExpressionAssignment_3_1 )
            // InternalLinearTemporalLogic.g:1949:3: rule__LTLFormula6__ExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula6__ExpressionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLTLFormula6Access().getExpressionAssignment_3_1()); 

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
    // $ANTLR end "rule__LTLFormula6__Group_3__1__Impl"


    // $ANTLR start "rule__LTLFormula6__Group_3__2"
    // InternalLinearTemporalLogic.g:1957:1: rule__LTLFormula6__Group_3__2 : rule__LTLFormula6__Group_3__2__Impl ;
    public final void rule__LTLFormula6__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1961:1: ( rule__LTLFormula6__Group_3__2__Impl )
            // InternalLinearTemporalLogic.g:1962:2: rule__LTLFormula6__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LTLFormula6__Group_3__2__Impl();

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
    // $ANTLR end "rule__LTLFormula6__Group_3__2"


    // $ANTLR start "rule__LTLFormula6__Group_3__2__Impl"
    // InternalLinearTemporalLogic.g:1968:1: rule__LTLFormula6__Group_3__2__Impl : ( ')' ) ;
    public final void rule__LTLFormula6__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1972:1: ( ( ')' ) )
            // InternalLinearTemporalLogic.g:1973:1: ( ')' )
            {
            // InternalLinearTemporalLogic.g:1973:1: ( ')' )
            // InternalLinearTemporalLogic.g:1974:2: ')'
            {
             before(grammarAccess.getLTLFormula6Access().getRightParenthesisKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLTLFormula6Access().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__LTLFormula6__Group_3__2__Impl"


    // $ANTLR start "rule__LTLModel__NameAssignment_2"
    // InternalLinearTemporalLogic.g:1984:1: rule__LTLModel__NameAssignment_2 : ( RULE_LTLID ) ;
    public final void rule__LTLModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:1988:1: ( ( RULE_LTLID ) )
            // InternalLinearTemporalLogic.g:1989:2: ( RULE_LTLID )
            {
            // InternalLinearTemporalLogic.g:1989:2: ( RULE_LTLID )
            // InternalLinearTemporalLogic.g:1990:3: RULE_LTLID
            {
             before(grammarAccess.getLTLModelAccess().getNameLTLIDTerminalRuleCall_2_0()); 
            match(input,RULE_LTLID,FOLLOW_2); 
             after(grammarAccess.getLTLModelAccess().getNameLTLIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__LTLModel__NameAssignment_2"


    // $ANTLR start "rule__LTLModel__FormulaAssignment_4"
    // InternalLinearTemporalLogic.g:1999:1: rule__LTLModel__FormulaAssignment_4 : ( ruleLTLFormula ) ;
    public final void rule__LTLModel__FormulaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2003:1: ( ( ruleLTLFormula ) )
            // InternalLinearTemporalLogic.g:2004:2: ( ruleLTLFormula )
            {
            // InternalLinearTemporalLogic.g:2004:2: ( ruleLTLFormula )
            // InternalLinearTemporalLogic.g:2005:3: ruleLTLFormula
            {
             before(grammarAccess.getLTLModelAccess().getFormulaLTLFormulaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;

             after(grammarAccess.getLTLModelAccess().getFormulaLTLFormulaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LTLModel__FormulaAssignment_4"


    // $ANTLR start "rule__LTLModel__AlphabetAssignment_5_1"
    // InternalLinearTemporalLogic.g:2014:1: rule__LTLModel__AlphabetAssignment_5_1 : ( ruleSetOfSymbols ) ;
    public final void rule__LTLModel__AlphabetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2018:1: ( ( ruleSetOfSymbols ) )
            // InternalLinearTemporalLogic.g:2019:2: ( ruleSetOfSymbols )
            {
            // InternalLinearTemporalLogic.g:2019:2: ( ruleSetOfSymbols )
            // InternalLinearTemporalLogic.g:2020:3: ruleSetOfSymbols
            {
             before(grammarAccess.getLTLModelAccess().getAlphabetSetOfSymbolsParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSetOfSymbols();

            state._fsp--;

             after(grammarAccess.getLTLModelAccess().getAlphabetSetOfSymbolsParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__LTLModel__AlphabetAssignment_5_1"


    // $ANTLR start "rule__LTLModel__DefinitionsAssignment_6_1"
    // InternalLinearTemporalLogic.g:2029:1: rule__LTLModel__DefinitionsAssignment_6_1 : ( ruleDefinition ) ;
    public final void rule__LTLModel__DefinitionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2033:1: ( ( ruleDefinition ) )
            // InternalLinearTemporalLogic.g:2034:2: ( ruleDefinition )
            {
            // InternalLinearTemporalLogic.g:2034:2: ( ruleDefinition )
            // InternalLinearTemporalLogic.g:2035:3: ruleDefinition
            {
             before(grammarAccess.getLTLModelAccess().getDefinitionsDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getLTLModelAccess().getDefinitionsDefinitionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__LTLModel__DefinitionsAssignment_6_1"


    // $ANTLR start "rule__Definition__PropositionAssignment_0"
    // InternalLinearTemporalLogic.g:2044:1: rule__Definition__PropositionAssignment_0 : ( RULE_LTLID ) ;
    public final void rule__Definition__PropositionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2048:1: ( ( RULE_LTLID ) )
            // InternalLinearTemporalLogic.g:2049:2: ( RULE_LTLID )
            {
            // InternalLinearTemporalLogic.g:2049:2: ( RULE_LTLID )
            // InternalLinearTemporalLogic.g:2050:3: RULE_LTLID
            {
             before(grammarAccess.getDefinitionAccess().getPropositionLTLIDTerminalRuleCall_0_0()); 
            match(input,RULE_LTLID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getPropositionLTLIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Definition__PropositionAssignment_0"


    // $ANTLR start "rule__Definition__SymbolsAssignment_2"
    // InternalLinearTemporalLogic.g:2059:1: rule__Definition__SymbolsAssignment_2 : ( ruleSetOfSymbols ) ;
    public final void rule__Definition__SymbolsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2063:1: ( ( ruleSetOfSymbols ) )
            // InternalLinearTemporalLogic.g:2064:2: ( ruleSetOfSymbols )
            {
            // InternalLinearTemporalLogic.g:2064:2: ( ruleSetOfSymbols )
            // InternalLinearTemporalLogic.g:2065:3: ruleSetOfSymbols
            {
             before(grammarAccess.getDefinitionAccess().getSymbolsSetOfSymbolsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSetOfSymbols();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getSymbolsSetOfSymbolsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Definition__SymbolsAssignment_2"


    // $ANTLR start "rule__SetOfSymbols__SymbolsAssignment_1"
    // InternalLinearTemporalLogic.g:2074:1: rule__SetOfSymbols__SymbolsAssignment_1 : ( RULE_LTLID ) ;
    public final void rule__SetOfSymbols__SymbolsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2078:1: ( ( RULE_LTLID ) )
            // InternalLinearTemporalLogic.g:2079:2: ( RULE_LTLID )
            {
            // InternalLinearTemporalLogic.g:2079:2: ( RULE_LTLID )
            // InternalLinearTemporalLogic.g:2080:3: RULE_LTLID
            {
             before(grammarAccess.getSetOfSymbolsAccess().getSymbolsLTLIDTerminalRuleCall_1_0()); 
            match(input,RULE_LTLID,FOLLOW_2); 
             after(grammarAccess.getSetOfSymbolsAccess().getSymbolsLTLIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SetOfSymbols__SymbolsAssignment_1"


    // $ANTLR start "rule__SetOfSymbols__SymbolsAssignment_2_1"
    // InternalLinearTemporalLogic.g:2089:1: rule__SetOfSymbols__SymbolsAssignment_2_1 : ( RULE_LTLID ) ;
    public final void rule__SetOfSymbols__SymbolsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2093:1: ( ( RULE_LTLID ) )
            // InternalLinearTemporalLogic.g:2094:2: ( RULE_LTLID )
            {
            // InternalLinearTemporalLogic.g:2094:2: ( RULE_LTLID )
            // InternalLinearTemporalLogic.g:2095:3: RULE_LTLID
            {
             before(grammarAccess.getSetOfSymbolsAccess().getSymbolsLTLIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_LTLID,FOLLOW_2); 
             after(grammarAccess.getSetOfSymbolsAccess().getSymbolsLTLIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__SetOfSymbols__SymbolsAssignment_2_1"


    // $ANTLR start "rule__LTLFormula__FormulaAssignment_0"
    // InternalLinearTemporalLogic.g:2104:1: rule__LTLFormula__FormulaAssignment_0 : ( ruleLTLFormula1 ) ;
    public final void rule__LTLFormula__FormulaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2108:1: ( ( ruleLTLFormula1 ) )
            // InternalLinearTemporalLogic.g:2109:2: ( ruleLTLFormula1 )
            {
            // InternalLinearTemporalLogic.g:2109:2: ( ruleLTLFormula1 )
            // InternalLinearTemporalLogic.g:2110:3: ruleLTLFormula1
            {
             before(grammarAccess.getLTLFormulaAccess().getFormulaLTLFormula1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula1();

            state._fsp--;

             after(grammarAccess.getLTLFormulaAccess().getFormulaLTLFormula1ParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LTLFormula__FormulaAssignment_0"


    // $ANTLR start "rule__LTLFormula__AlternativesAssignment_1_1"
    // InternalLinearTemporalLogic.g:2119:1: rule__LTLFormula__AlternativesAssignment_1_1 : ( ruleLTLFormula1 ) ;
    public final void rule__LTLFormula__AlternativesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2123:1: ( ( ruleLTLFormula1 ) )
            // InternalLinearTemporalLogic.g:2124:2: ( ruleLTLFormula1 )
            {
            // InternalLinearTemporalLogic.g:2124:2: ( ruleLTLFormula1 )
            // InternalLinearTemporalLogic.g:2125:3: ruleLTLFormula1
            {
             before(grammarAccess.getLTLFormulaAccess().getAlternativesLTLFormula1ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula1();

            state._fsp--;

             after(grammarAccess.getLTLFormulaAccess().getAlternativesLTLFormula1ParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LTLFormula__AlternativesAssignment_1_1"


    // $ANTLR start "rule__LTLFormula__AlternativesAssignment_1_2_1"
    // InternalLinearTemporalLogic.g:2134:1: rule__LTLFormula__AlternativesAssignment_1_2_1 : ( ruleLTLFormula1 ) ;
    public final void rule__LTLFormula__AlternativesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2138:1: ( ( ruleLTLFormula1 ) )
            // InternalLinearTemporalLogic.g:2139:2: ( ruleLTLFormula1 )
            {
            // InternalLinearTemporalLogic.g:2139:2: ( ruleLTLFormula1 )
            // InternalLinearTemporalLogic.g:2140:3: ruleLTLFormula1
            {
             before(grammarAccess.getLTLFormulaAccess().getAlternativesLTLFormula1ParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula1();

            state._fsp--;

             after(grammarAccess.getLTLFormulaAccess().getAlternativesLTLFormula1ParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__LTLFormula__AlternativesAssignment_1_2_1"


    // $ANTLR start "rule__LTLFormula1__FormulaAssignment_0"
    // InternalLinearTemporalLogic.g:2149:1: rule__LTLFormula1__FormulaAssignment_0 : ( ruleLTLFormula2 ) ;
    public final void rule__LTLFormula1__FormulaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2153:1: ( ( ruleLTLFormula2 ) )
            // InternalLinearTemporalLogic.g:2154:2: ( ruleLTLFormula2 )
            {
            // InternalLinearTemporalLogic.g:2154:2: ( ruleLTLFormula2 )
            // InternalLinearTemporalLogic.g:2155:3: ruleLTLFormula2
            {
             before(grammarAccess.getLTLFormula1Access().getFormulaLTLFormula2ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula2();

            state._fsp--;

             after(grammarAccess.getLTLFormula1Access().getFormulaLTLFormula2ParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LTLFormula1__FormulaAssignment_0"


    // $ANTLR start "rule__LTLFormula1__AlternativesAssignment_1_1"
    // InternalLinearTemporalLogic.g:2164:1: rule__LTLFormula1__AlternativesAssignment_1_1 : ( ruleLTLFormula2 ) ;
    public final void rule__LTLFormula1__AlternativesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2168:1: ( ( ruleLTLFormula2 ) )
            // InternalLinearTemporalLogic.g:2169:2: ( ruleLTLFormula2 )
            {
            // InternalLinearTemporalLogic.g:2169:2: ( ruleLTLFormula2 )
            // InternalLinearTemporalLogic.g:2170:3: ruleLTLFormula2
            {
             before(grammarAccess.getLTLFormula1Access().getAlternativesLTLFormula2ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula2();

            state._fsp--;

             after(grammarAccess.getLTLFormula1Access().getAlternativesLTLFormula2ParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LTLFormula1__AlternativesAssignment_1_1"


    // $ANTLR start "rule__LTLFormula1__AlternativesAssignment_1_2_1"
    // InternalLinearTemporalLogic.g:2179:1: rule__LTLFormula1__AlternativesAssignment_1_2_1 : ( ruleLTLFormula2 ) ;
    public final void rule__LTLFormula1__AlternativesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2183:1: ( ( ruleLTLFormula2 ) )
            // InternalLinearTemporalLogic.g:2184:2: ( ruleLTLFormula2 )
            {
            // InternalLinearTemporalLogic.g:2184:2: ( ruleLTLFormula2 )
            // InternalLinearTemporalLogic.g:2185:3: ruleLTLFormula2
            {
             before(grammarAccess.getLTLFormula1Access().getAlternativesLTLFormula2ParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula2();

            state._fsp--;

             after(grammarAccess.getLTLFormula1Access().getAlternativesLTLFormula2ParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__LTLFormula1__AlternativesAssignment_1_2_1"


    // $ANTLR start "rule__LTLFormula2__Subexpression1Assignment_0"
    // InternalLinearTemporalLogic.g:2194:1: rule__LTLFormula2__Subexpression1Assignment_0 : ( ruleLTLFormula3 ) ;
    public final void rule__LTLFormula2__Subexpression1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2198:1: ( ( ruleLTLFormula3 ) )
            // InternalLinearTemporalLogic.g:2199:2: ( ruleLTLFormula3 )
            {
            // InternalLinearTemporalLogic.g:2199:2: ( ruleLTLFormula3 )
            // InternalLinearTemporalLogic.g:2200:3: ruleLTLFormula3
            {
             before(grammarAccess.getLTLFormula2Access().getSubexpression1LTLFormula3ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula3();

            state._fsp--;

             after(grammarAccess.getLTLFormula2Access().getSubexpression1LTLFormula3ParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LTLFormula2__Subexpression1Assignment_0"


    // $ANTLR start "rule__LTLFormula2__Subexpression2Assignment_1_1"
    // InternalLinearTemporalLogic.g:2209:1: rule__LTLFormula2__Subexpression2Assignment_1_1 : ( ruleLTLFormula2 ) ;
    public final void rule__LTLFormula2__Subexpression2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2213:1: ( ( ruleLTLFormula2 ) )
            // InternalLinearTemporalLogic.g:2214:2: ( ruleLTLFormula2 )
            {
            // InternalLinearTemporalLogic.g:2214:2: ( ruleLTLFormula2 )
            // InternalLinearTemporalLogic.g:2215:3: ruleLTLFormula2
            {
             before(grammarAccess.getLTLFormula2Access().getSubexpression2LTLFormula2ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula2();

            state._fsp--;

             after(grammarAccess.getLTLFormula2Access().getSubexpression2LTLFormula2ParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LTLFormula2__Subexpression2Assignment_1_1"


    // $ANTLR start "rule__LTLFormula3__Subexpression1Assignment_0"
    // InternalLinearTemporalLogic.g:2224:1: rule__LTLFormula3__Subexpression1Assignment_0 : ( ruleLTLFormula4 ) ;
    public final void rule__LTLFormula3__Subexpression1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2228:1: ( ( ruleLTLFormula4 ) )
            // InternalLinearTemporalLogic.g:2229:2: ( ruleLTLFormula4 )
            {
            // InternalLinearTemporalLogic.g:2229:2: ( ruleLTLFormula4 )
            // InternalLinearTemporalLogic.g:2230:3: ruleLTLFormula4
            {
             before(grammarAccess.getLTLFormula3Access().getSubexpression1LTLFormula4ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula4();

            state._fsp--;

             after(grammarAccess.getLTLFormula3Access().getSubexpression1LTLFormula4ParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LTLFormula3__Subexpression1Assignment_0"


    // $ANTLR start "rule__LTLFormula3__Subexpression2Assignment_1_1"
    // InternalLinearTemporalLogic.g:2239:1: rule__LTLFormula3__Subexpression2Assignment_1_1 : ( ruleLTLFormula3 ) ;
    public final void rule__LTLFormula3__Subexpression2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2243:1: ( ( ruleLTLFormula3 ) )
            // InternalLinearTemporalLogic.g:2244:2: ( ruleLTLFormula3 )
            {
            // InternalLinearTemporalLogic.g:2244:2: ( ruleLTLFormula3 )
            // InternalLinearTemporalLogic.g:2245:3: ruleLTLFormula3
            {
             before(grammarAccess.getLTLFormula3Access().getSubexpression2LTLFormula3ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula3();

            state._fsp--;

             after(grammarAccess.getLTLFormula3Access().getSubexpression2LTLFormula3ParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LTLFormula3__Subexpression2Assignment_1_1"


    // $ANTLR start "rule__LTLFormula4__SubexpressionAssignment_0"
    // InternalLinearTemporalLogic.g:2254:1: rule__LTLFormula4__SubexpressionAssignment_0 : ( ruleLTLFormula5 ) ;
    public final void rule__LTLFormula4__SubexpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2258:1: ( ( ruleLTLFormula5 ) )
            // InternalLinearTemporalLogic.g:2259:2: ( ruleLTLFormula5 )
            {
            // InternalLinearTemporalLogic.g:2259:2: ( ruleLTLFormula5 )
            // InternalLinearTemporalLogic.g:2260:3: ruleLTLFormula5
            {
             before(grammarAccess.getLTLFormula4Access().getSubexpressionLTLFormula5ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula5();

            state._fsp--;

             after(grammarAccess.getLTLFormula4Access().getSubexpressionLTLFormula5ParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LTLFormula4__SubexpressionAssignment_0"


    // $ANTLR start "rule__LTLFormula4__ConsequenceAssignment_1_1"
    // InternalLinearTemporalLogic.g:2269:1: rule__LTLFormula4__ConsequenceAssignment_1_1 : ( ruleLTLFormula4 ) ;
    public final void rule__LTLFormula4__ConsequenceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2273:1: ( ( ruleLTLFormula4 ) )
            // InternalLinearTemporalLogic.g:2274:2: ( ruleLTLFormula4 )
            {
            // InternalLinearTemporalLogic.g:2274:2: ( ruleLTLFormula4 )
            // InternalLinearTemporalLogic.g:2275:3: ruleLTLFormula4
            {
             before(grammarAccess.getLTLFormula4Access().getConsequenceLTLFormula4ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula4();

            state._fsp--;

             after(grammarAccess.getLTLFormula4Access().getConsequenceLTLFormula4ParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LTLFormula4__ConsequenceAssignment_1_1"


    // $ANTLR start "rule__LTLFormula5__NextSubexpressionAssignment_0_1"
    // InternalLinearTemporalLogic.g:2284:1: rule__LTLFormula5__NextSubexpressionAssignment_0_1 : ( ruleLTLFormula5 ) ;
    public final void rule__LTLFormula5__NextSubexpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2288:1: ( ( ruleLTLFormula5 ) )
            // InternalLinearTemporalLogic.g:2289:2: ( ruleLTLFormula5 )
            {
            // InternalLinearTemporalLogic.g:2289:2: ( ruleLTLFormula5 )
            // InternalLinearTemporalLogic.g:2290:3: ruleLTLFormula5
            {
             before(grammarAccess.getLTLFormula5Access().getNextSubexpressionLTLFormula5ParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula5();

            state._fsp--;

             after(grammarAccess.getLTLFormula5Access().getNextSubexpressionLTLFormula5ParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__LTLFormula5__NextSubexpressionAssignment_0_1"


    // $ANTLR start "rule__LTLFormula5__EventuallySubexpressionAssignment_1_1"
    // InternalLinearTemporalLogic.g:2299:1: rule__LTLFormula5__EventuallySubexpressionAssignment_1_1 : ( ruleLTLFormula5 ) ;
    public final void rule__LTLFormula5__EventuallySubexpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2303:1: ( ( ruleLTLFormula5 ) )
            // InternalLinearTemporalLogic.g:2304:2: ( ruleLTLFormula5 )
            {
            // InternalLinearTemporalLogic.g:2304:2: ( ruleLTLFormula5 )
            // InternalLinearTemporalLogic.g:2305:3: ruleLTLFormula5
            {
             before(grammarAccess.getLTLFormula5Access().getEventuallySubexpressionLTLFormula5ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula5();

            state._fsp--;

             after(grammarAccess.getLTLFormula5Access().getEventuallySubexpressionLTLFormula5ParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LTLFormula5__EventuallySubexpressionAssignment_1_1"


    // $ANTLR start "rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1"
    // InternalLinearTemporalLogic.g:2314:1: rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1 : ( ruleLTLFormula5 ) ;
    public final void rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2318:1: ( ( ruleLTLFormula5 ) )
            // InternalLinearTemporalLogic.g:2319:2: ( ruleLTLFormula5 )
            {
            // InternalLinearTemporalLogic.g:2319:2: ( ruleLTLFormula5 )
            // InternalLinearTemporalLogic.g:2320:3: ruleLTLFormula5
            {
             before(grammarAccess.getLTLFormula5Access().getAlwaysSubexpressionLTLFormula5ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula5();

            state._fsp--;

             after(grammarAccess.getLTLFormula5Access().getAlwaysSubexpressionLTLFormula5ParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__LTLFormula5__AlwaysSubexpressionAssignment_2_1"


    // $ANTLR start "rule__LTLFormula5__NotSubexpressionAssignment_3_1"
    // InternalLinearTemporalLogic.g:2329:1: rule__LTLFormula5__NotSubexpressionAssignment_3_1 : ( ruleLTLFormula5 ) ;
    public final void rule__LTLFormula5__NotSubexpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2333:1: ( ( ruleLTLFormula5 ) )
            // InternalLinearTemporalLogic.g:2334:2: ( ruleLTLFormula5 )
            {
            // InternalLinearTemporalLogic.g:2334:2: ( ruleLTLFormula5 )
            // InternalLinearTemporalLogic.g:2335:3: ruleLTLFormula5
            {
             before(grammarAccess.getLTLFormula5Access().getNotSubexpressionLTLFormula5ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula5();

            state._fsp--;

             after(grammarAccess.getLTLFormula5Access().getNotSubexpressionLTLFormula5ParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__LTLFormula5__NotSubexpressionAssignment_3_1"


    // $ANTLR start "rule__LTLFormula5__SubexpressionAssignment_4"
    // InternalLinearTemporalLogic.g:2344:1: rule__LTLFormula5__SubexpressionAssignment_4 : ( ruleLTLFormula6 ) ;
    public final void rule__LTLFormula5__SubexpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2348:1: ( ( ruleLTLFormula6 ) )
            // InternalLinearTemporalLogic.g:2349:2: ( ruleLTLFormula6 )
            {
            // InternalLinearTemporalLogic.g:2349:2: ( ruleLTLFormula6 )
            // InternalLinearTemporalLogic.g:2350:3: ruleLTLFormula6
            {
             before(grammarAccess.getLTLFormula5Access().getSubexpressionLTLFormula6ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula6();

            state._fsp--;

             after(grammarAccess.getLTLFormula5Access().getSubexpressionLTLFormula6ParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LTLFormula5__SubexpressionAssignment_4"


    // $ANTLR start "rule__LTLFormula6__PropositionExpressionAssignment_0"
    // InternalLinearTemporalLogic.g:2359:1: rule__LTLFormula6__PropositionExpressionAssignment_0 : ( rulePropositionExpression ) ;
    public final void rule__LTLFormula6__PropositionExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2363:1: ( ( rulePropositionExpression ) )
            // InternalLinearTemporalLogic.g:2364:2: ( rulePropositionExpression )
            {
            // InternalLinearTemporalLogic.g:2364:2: ( rulePropositionExpression )
            // InternalLinearTemporalLogic.g:2365:3: rulePropositionExpression
            {
             before(grammarAccess.getLTLFormula6Access().getPropositionExpressionPropositionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropositionExpression();

            state._fsp--;

             after(grammarAccess.getLTLFormula6Access().getPropositionExpressionPropositionExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LTLFormula6__PropositionExpressionAssignment_0"


    // $ANTLR start "rule__LTLFormula6__TrueExpressionAssignment_1"
    // InternalLinearTemporalLogic.g:2374:1: rule__LTLFormula6__TrueExpressionAssignment_1 : ( ( 'true' ) ) ;
    public final void rule__LTLFormula6__TrueExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2378:1: ( ( ( 'true' ) ) )
            // InternalLinearTemporalLogic.g:2379:2: ( ( 'true' ) )
            {
            // InternalLinearTemporalLogic.g:2379:2: ( ( 'true' ) )
            // InternalLinearTemporalLogic.g:2380:3: ( 'true' )
            {
             before(grammarAccess.getLTLFormula6Access().getTrueExpressionTrueKeyword_1_0()); 
            // InternalLinearTemporalLogic.g:2381:3: ( 'true' )
            // InternalLinearTemporalLogic.g:2382:4: 'true'
            {
             before(grammarAccess.getLTLFormula6Access().getTrueExpressionTrueKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLTLFormula6Access().getTrueExpressionTrueKeyword_1_0()); 

            }

             after(grammarAccess.getLTLFormula6Access().getTrueExpressionTrueKeyword_1_0()); 

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
    // $ANTLR end "rule__LTLFormula6__TrueExpressionAssignment_1"


    // $ANTLR start "rule__LTLFormula6__FalseExpressionAssignment_2"
    // InternalLinearTemporalLogic.g:2393:1: rule__LTLFormula6__FalseExpressionAssignment_2 : ( ( 'false' ) ) ;
    public final void rule__LTLFormula6__FalseExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2397:1: ( ( ( 'false' ) ) )
            // InternalLinearTemporalLogic.g:2398:2: ( ( 'false' ) )
            {
            // InternalLinearTemporalLogic.g:2398:2: ( ( 'false' ) )
            // InternalLinearTemporalLogic.g:2399:3: ( 'false' )
            {
             before(grammarAccess.getLTLFormula6Access().getFalseExpressionFalseKeyword_2_0()); 
            // InternalLinearTemporalLogic.g:2400:3: ( 'false' )
            // InternalLinearTemporalLogic.g:2401:4: 'false'
            {
             before(grammarAccess.getLTLFormula6Access().getFalseExpressionFalseKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLTLFormula6Access().getFalseExpressionFalseKeyword_2_0()); 

            }

             after(grammarAccess.getLTLFormula6Access().getFalseExpressionFalseKeyword_2_0()); 

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
    // $ANTLR end "rule__LTLFormula6__FalseExpressionAssignment_2"


    // $ANTLR start "rule__LTLFormula6__ExpressionAssignment_3_1"
    // InternalLinearTemporalLogic.g:2412:1: rule__LTLFormula6__ExpressionAssignment_3_1 : ( ruleLTLFormula ) ;
    public final void rule__LTLFormula6__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLinearTemporalLogic.g:2416:1: ( ( ruleLTLFormula ) )
            // InternalLinearTemporalLogic.g:2417:2: ( ruleLTLFormula )
            {
            // InternalLinearTemporalLogic.g:2417:2: ( ruleLTLFormula )
            // InternalLinearTemporalLogic.g:2418:3: ruleLTLFormula
            {
             before(grammarAccess.getLTLFormula6Access().getExpressionLTLFormulaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;

             after(grammarAccess.getLTLFormula6Access().getExpressionLTLFormulaParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__LTLFormula6__ExpressionAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001BE000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});

}