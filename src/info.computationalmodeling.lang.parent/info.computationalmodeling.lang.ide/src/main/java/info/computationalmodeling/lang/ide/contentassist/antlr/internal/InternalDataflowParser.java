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
import info.computationalmodeling.lang.services.DataflowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataflowParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT", "RULE_INT", "RULE_NINT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-inf'", "'dataflow'", "'graph'", "'{'", "'}'", "'author'", "'='", "'inputs'", "','", "'outputs'", "'-'", "'->'", "';'", "'initial'", "'tokens'", "':'", "'production'", "'rate'", "'consumption'", "'name'", "'token'", "'size'", "'['", "']'", "'execution'", "'time'", "'input'", "'signals'", "'/'"
    };
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


        public InternalDataflowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataflowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataflowParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataflow.g"; }


    	private DataflowGrammarAccess grammarAccess;

    	public void setGrammarAccess(DataflowGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDataflowModel"
    // InternalDataflow.g:53:1: entryRuleDataflowModel : ruleDataflowModel EOF ;
    public final void entryRuleDataflowModel() throws RecognitionException {
        try {
            // InternalDataflow.g:54:1: ( ruleDataflowModel EOF )
            // InternalDataflow.g:55:1: ruleDataflowModel EOF
            {
             before(grammarAccess.getDataflowModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDataflowModel();

            state._fsp--;

             after(grammarAccess.getDataflowModelRule()); 
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
    // $ANTLR end "entryRuleDataflowModel"


    // $ANTLR start "ruleDataflowModel"
    // InternalDataflow.g:62:1: ruleDataflowModel : ( ( rule__DataflowModel__Group__0 ) ) ;
    public final void ruleDataflowModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:66:2: ( ( ( rule__DataflowModel__Group__0 ) ) )
            // InternalDataflow.g:67:2: ( ( rule__DataflowModel__Group__0 ) )
            {
            // InternalDataflow.g:67:2: ( ( rule__DataflowModel__Group__0 ) )
            // InternalDataflow.g:68:3: ( rule__DataflowModel__Group__0 )
            {
             before(grammarAccess.getDataflowModelAccess().getGroup()); 
            // InternalDataflow.g:69:3: ( rule__DataflowModel__Group__0 )
            // InternalDataflow.g:69:4: rule__DataflowModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataflowModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataflowModel"


    // $ANTLR start "entryRuleEdge"
    // InternalDataflow.g:78:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalDataflow.g:79:1: ( ruleEdge EOF )
            // InternalDataflow.g:80:1: ruleEdge EOF
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
    // InternalDataflow.g:87:1: ruleEdge : ( ( rule__Edge__Alternatives ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:91:2: ( ( ( rule__Edge__Alternatives ) ) )
            // InternalDataflow.g:92:2: ( ( rule__Edge__Alternatives ) )
            {
            // InternalDataflow.g:92:2: ( ( rule__Edge__Alternatives ) )
            // InternalDataflow.g:93:3: ( rule__Edge__Alternatives )
            {
             before(grammarAccess.getEdgeAccess().getAlternatives()); 
            // InternalDataflow.g:94:3: ( rule__Edge__Alternatives )
            // InternalDataflow.g:94:4: rule__Edge__Alternatives
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
    // InternalDataflow.g:103:1: entryRuleEdgeSpecs : ruleEdgeSpecs EOF ;
    public final void entryRuleEdgeSpecs() throws RecognitionException {
        try {
            // InternalDataflow.g:104:1: ( ruleEdgeSpecs EOF )
            // InternalDataflow.g:105:1: ruleEdgeSpecs EOF
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
    // InternalDataflow.g:112:1: ruleEdgeSpecs : ( ( rule__EdgeSpecs__Group__0 ) ) ;
    public final void ruleEdgeSpecs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:116:2: ( ( ( rule__EdgeSpecs__Group__0 ) ) )
            // InternalDataflow.g:117:2: ( ( rule__EdgeSpecs__Group__0 ) )
            {
            // InternalDataflow.g:117:2: ( ( rule__EdgeSpecs__Group__0 ) )
            // InternalDataflow.g:118:3: ( rule__EdgeSpecs__Group__0 )
            {
             before(grammarAccess.getEdgeSpecsAccess().getGroup()); 
            // InternalDataflow.g:119:3: ( rule__EdgeSpecs__Group__0 )
            // InternalDataflow.g:119:4: rule__EdgeSpecs__Group__0
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
    // InternalDataflow.g:128:1: entryRuleEdgeAnnotation : ruleEdgeAnnotation EOF ;
    public final void entryRuleEdgeAnnotation() throws RecognitionException {
        try {
            // InternalDataflow.g:129:1: ( ruleEdgeAnnotation EOF )
            // InternalDataflow.g:130:1: ruleEdgeAnnotation EOF
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
    // InternalDataflow.g:137:1: ruleEdgeAnnotation : ( ( rule__EdgeAnnotation__Alternatives ) ) ;
    public final void ruleEdgeAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:141:2: ( ( ( rule__EdgeAnnotation__Alternatives ) ) )
            // InternalDataflow.g:142:2: ( ( rule__EdgeAnnotation__Alternatives ) )
            {
            // InternalDataflow.g:142:2: ( ( rule__EdgeAnnotation__Alternatives ) )
            // InternalDataflow.g:143:3: ( rule__EdgeAnnotation__Alternatives )
            {
             before(grammarAccess.getEdgeAnnotationAccess().getAlternatives()); 
            // InternalDataflow.g:144:3: ( rule__EdgeAnnotation__Alternatives )
            // InternalDataflow.g:144:4: rule__EdgeAnnotation__Alternatives
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


    // $ANTLR start "entryRuleActor"
    // InternalDataflow.g:153:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalDataflow.g:154:1: ( ruleActor EOF )
            // InternalDataflow.g:155:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalDataflow.g:162:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:166:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalDataflow.g:167:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalDataflow.g:167:2: ( ( rule__Actor__Group__0 ) )
            // InternalDataflow.g:168:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalDataflow.g:169:3: ( rule__Actor__Group__0 )
            // InternalDataflow.g:169:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleActorSpecs"
    // InternalDataflow.g:178:1: entryRuleActorSpecs : ruleActorSpecs EOF ;
    public final void entryRuleActorSpecs() throws RecognitionException {
        try {
            // InternalDataflow.g:179:1: ( ruleActorSpecs EOF )
            // InternalDataflow.g:180:1: ruleActorSpecs EOF
            {
             before(grammarAccess.getActorSpecsRule()); 
            pushFollow(FOLLOW_1);
            ruleActorSpecs();

            state._fsp--;

             after(grammarAccess.getActorSpecsRule()); 
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
    // $ANTLR end "entryRuleActorSpecs"


    // $ANTLR start "ruleActorSpecs"
    // InternalDataflow.g:187:1: ruleActorSpecs : ( ( rule__ActorSpecs__Group__0 ) ) ;
    public final void ruleActorSpecs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:191:2: ( ( ( rule__ActorSpecs__Group__0 ) ) )
            // InternalDataflow.g:192:2: ( ( rule__ActorSpecs__Group__0 ) )
            {
            // InternalDataflow.g:192:2: ( ( rule__ActorSpecs__Group__0 ) )
            // InternalDataflow.g:193:3: ( rule__ActorSpecs__Group__0 )
            {
             before(grammarAccess.getActorSpecsAccess().getGroup()); 
            // InternalDataflow.g:194:3: ( rule__ActorSpecs__Group__0 )
            // InternalDataflow.g:194:4: rule__ActorSpecs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActorSpecs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorSpecsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActorSpecs"


    // $ANTLR start "entryRuleActorAnnotation"
    // InternalDataflow.g:203:1: entryRuleActorAnnotation : ruleActorAnnotation EOF ;
    public final void entryRuleActorAnnotation() throws RecognitionException {
        try {
            // InternalDataflow.g:204:1: ( ruleActorAnnotation EOF )
            // InternalDataflow.g:205:1: ruleActorAnnotation EOF
            {
             before(grammarAccess.getActorAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleActorAnnotation();

            state._fsp--;

             after(grammarAccess.getActorAnnotationRule()); 
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
    // $ANTLR end "entryRuleActorAnnotation"


    // $ANTLR start "ruleActorAnnotation"
    // InternalDataflow.g:212:1: ruleActorAnnotation : ( ( rule__ActorAnnotation__Group__0 ) ) ;
    public final void ruleActorAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:216:2: ( ( ( rule__ActorAnnotation__Group__0 ) ) )
            // InternalDataflow.g:217:2: ( ( rule__ActorAnnotation__Group__0 ) )
            {
            // InternalDataflow.g:217:2: ( ( rule__ActorAnnotation__Group__0 ) )
            // InternalDataflow.g:218:3: ( rule__ActorAnnotation__Group__0 )
            {
             before(grammarAccess.getActorAnnotationAccess().getGroup()); 
            // InternalDataflow.g:219:3: ( rule__ActorAnnotation__Group__0 )
            // InternalDataflow.g:219:4: rule__ActorAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActorAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActorAnnotation"


    // $ANTLR start "entryRuleInputSignals"
    // InternalDataflow.g:228:1: entryRuleInputSignals : ruleInputSignals EOF ;
    public final void entryRuleInputSignals() throws RecognitionException {
        try {
            // InternalDataflow.g:229:1: ( ruleInputSignals EOF )
            // InternalDataflow.g:230:1: ruleInputSignals EOF
            {
             before(grammarAccess.getInputSignalsRule()); 
            pushFollow(FOLLOW_1);
            ruleInputSignals();

            state._fsp--;

             after(grammarAccess.getInputSignalsRule()); 
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
    // $ANTLR end "entryRuleInputSignals"


    // $ANTLR start "ruleInputSignals"
    // InternalDataflow.g:237:1: ruleInputSignals : ( ( rule__InputSignals__Group__0 ) ) ;
    public final void ruleInputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:241:2: ( ( ( rule__InputSignals__Group__0 ) ) )
            // InternalDataflow.g:242:2: ( ( rule__InputSignals__Group__0 ) )
            {
            // InternalDataflow.g:242:2: ( ( rule__InputSignals__Group__0 ) )
            // InternalDataflow.g:243:3: ( rule__InputSignals__Group__0 )
            {
             before(grammarAccess.getInputSignalsAccess().getGroup()); 
            // InternalDataflow.g:244:3: ( rule__InputSignals__Group__0 )
            // InternalDataflow.g:244:4: rule__InputSignals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputSignals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputSignals"


    // $ANTLR start "entryRuleSignal"
    // InternalDataflow.g:253:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalDataflow.g:254:1: ( ruleSignal EOF )
            // InternalDataflow.g:255:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalDataflow.g:262:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:266:2: ( ( ( rule__Signal__Group__0 ) ) )
            // InternalDataflow.g:267:2: ( ( rule__Signal__Group__0 ) )
            {
            // InternalDataflow.g:267:2: ( ( rule__Signal__Group__0 ) )
            // InternalDataflow.g:268:3: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // InternalDataflow.g:269:3: ( rule__Signal__Group__0 )
            // InternalDataflow.g:269:4: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleTimeStamp"
    // InternalDataflow.g:278:1: entryRuleTimeStamp : ruleTimeStamp EOF ;
    public final void entryRuleTimeStamp() throws RecognitionException {
        try {
            // InternalDataflow.g:279:1: ( ruleTimeStamp EOF )
            // InternalDataflow.g:280:1: ruleTimeStamp EOF
            {
             before(grammarAccess.getTimeStampRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getTimeStampRule()); 
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
    // $ANTLR end "entryRuleTimeStamp"


    // $ANTLR start "ruleTimeStamp"
    // InternalDataflow.g:287:1: ruleTimeStamp : ( ( rule__TimeStamp__Alternatives ) ) ;
    public final void ruleTimeStamp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:291:2: ( ( ( rule__TimeStamp__Alternatives ) ) )
            // InternalDataflow.g:292:2: ( ( rule__TimeStamp__Alternatives ) )
            {
            // InternalDataflow.g:292:2: ( ( rule__TimeStamp__Alternatives ) )
            // InternalDataflow.g:293:3: ( rule__TimeStamp__Alternatives )
            {
             before(grammarAccess.getTimeStampAccess().getAlternatives()); 
            // InternalDataflow.g:294:3: ( rule__TimeStamp__Alternatives )
            // InternalDataflow.g:294:4: rule__TimeStamp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeStamp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeStampAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeStamp"


    // $ANTLR start "entryRuleNumber"
    // InternalDataflow.g:303:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalDataflow.g:304:1: ( ruleNumber EOF )
            // InternalDataflow.g:305:1: ruleNumber EOF
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
    // InternalDataflow.g:312:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:316:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalDataflow.g:317:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalDataflow.g:317:2: ( ( rule__Number__Alternatives ) )
            // InternalDataflow.g:318:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalDataflow.g:319:3: ( rule__Number__Alternatives )
            // InternalDataflow.g:319:4: rule__Number__Alternatives
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
    // InternalDataflow.g:328:1: entryRuleRatio : ruleRatio EOF ;
    public final void entryRuleRatio() throws RecognitionException {
        try {
            // InternalDataflow.g:329:1: ( ruleRatio EOF )
            // InternalDataflow.g:330:1: ruleRatio EOF
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
    // InternalDataflow.g:337:1: ruleRatio : ( ( rule__Ratio__Group__0 ) ) ;
    public final void ruleRatio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:341:2: ( ( ( rule__Ratio__Group__0 ) ) )
            // InternalDataflow.g:342:2: ( ( rule__Ratio__Group__0 ) )
            {
            // InternalDataflow.g:342:2: ( ( rule__Ratio__Group__0 ) )
            // InternalDataflow.g:343:3: ( rule__Ratio__Group__0 )
            {
             before(grammarAccess.getRatioAccess().getGroup()); 
            // InternalDataflow.g:344:3: ( rule__Ratio__Group__0 )
            // InternalDataflow.g:344:4: rule__Ratio__Group__0
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
    // InternalDataflow.g:353:1: entryRulePNInt : rulePNInt EOF ;
    public final void entryRulePNInt() throws RecognitionException {
        try {
            // InternalDataflow.g:354:1: ( rulePNInt EOF )
            // InternalDataflow.g:355:1: rulePNInt EOF
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
    // InternalDataflow.g:362:1: rulePNInt : ( ( rule__PNInt__Alternatives ) ) ;
    public final void rulePNInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:366:2: ( ( ( rule__PNInt__Alternatives ) ) )
            // InternalDataflow.g:367:2: ( ( rule__PNInt__Alternatives ) )
            {
            // InternalDataflow.g:367:2: ( ( rule__PNInt__Alternatives ) )
            // InternalDataflow.g:368:3: ( rule__PNInt__Alternatives )
            {
             before(grammarAccess.getPNIntAccess().getAlternatives()); 
            // InternalDataflow.g:369:3: ( rule__PNInt__Alternatives )
            // InternalDataflow.g:369:4: rule__PNInt__Alternatives
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


    // $ANTLR start "entryRuleInput"
    // InternalDataflow.g:378:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalDataflow.g:379:1: ( ruleInput EOF )
            // InternalDataflow.g:380:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalDataflow.g:387:1: ruleInput : ( ( rule__Input__NameAssignment ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:391:2: ( ( ( rule__Input__NameAssignment ) ) )
            // InternalDataflow.g:392:2: ( ( rule__Input__NameAssignment ) )
            {
            // InternalDataflow.g:392:2: ( ( rule__Input__NameAssignment ) )
            // InternalDataflow.g:393:3: ( rule__Input__NameAssignment )
            {
             before(grammarAccess.getInputAccess().getNameAssignment()); 
            // InternalDataflow.g:394:3: ( rule__Input__NameAssignment )
            // InternalDataflow.g:394:4: rule__Input__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalDataflow.g:403:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalDataflow.g:404:1: ( ruleOutput EOF )
            // InternalDataflow.g:405:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalDataflow.g:412:1: ruleOutput : ( ( rule__Output__NameAssignment ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:416:2: ( ( ( rule__Output__NameAssignment ) ) )
            // InternalDataflow.g:417:2: ( ( rule__Output__NameAssignment ) )
            {
            // InternalDataflow.g:417:2: ( ( rule__Output__NameAssignment ) )
            // InternalDataflow.g:418:3: ( rule__Output__NameAssignment )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment()); 
            // InternalDataflow.g:419:3: ( rule__Output__NameAssignment )
            // InternalDataflow.g:419:4: rule__Output__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Output__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "rule__Edge__Alternatives"
    // InternalDataflow.g:427:1: rule__Edge__Alternatives : ( ( ( rule__Edge__Group_0__0 ) ) | ( ( rule__Edge__Group_1__0 ) ) );
    public final void rule__Edge__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:431:1: ( ( ( rule__Edge__Group_0__0 ) ) | ( ( rule__Edge__Group_1__0 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalDataflow.g:432:2: ( ( rule__Edge__Group_0__0 ) )
                    {
                    // InternalDataflow.g:432:2: ( ( rule__Edge__Group_0__0 ) )
                    // InternalDataflow.g:433:3: ( rule__Edge__Group_0__0 )
                    {
                     before(grammarAccess.getEdgeAccess().getGroup_0()); 
                    // InternalDataflow.g:434:3: ( rule__Edge__Group_0__0 )
                    // InternalDataflow.g:434:4: rule__Edge__Group_0__0
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
                    // InternalDataflow.g:438:2: ( ( rule__Edge__Group_1__0 ) )
                    {
                    // InternalDataflow.g:438:2: ( ( rule__Edge__Group_1__0 ) )
                    // InternalDataflow.g:439:3: ( rule__Edge__Group_1__0 )
                    {
                     before(grammarAccess.getEdgeAccess().getGroup_1()); 
                    // InternalDataflow.g:440:3: ( rule__Edge__Group_1__0 )
                    // InternalDataflow.g:440:4: rule__Edge__Group_1__0
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
    // InternalDataflow.g:448:1: rule__EdgeAnnotation__Alternatives : ( ( ( rule__EdgeAnnotation__Group_0__0 ) ) | ( ( rule__EdgeAnnotation__Group_1__0 ) ) | ( ( rule__EdgeAnnotation__Group_2__0 ) ) | ( ( rule__EdgeAnnotation__Group_3__0 ) ) | ( ( rule__EdgeAnnotation__Group_4__0 ) ) );
    public final void rule__EdgeAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:452:1: ( ( ( rule__EdgeAnnotation__Group_0__0 ) ) | ( ( rule__EdgeAnnotation__Group_1__0 ) ) | ( ( rule__EdgeAnnotation__Group_2__0 ) ) | ( ( rule__EdgeAnnotation__Group_3__0 ) ) | ( ( rule__EdgeAnnotation__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 26:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 33:
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
                    // InternalDataflow.g:453:2: ( ( rule__EdgeAnnotation__Group_0__0 ) )
                    {
                    // InternalDataflow.g:453:2: ( ( rule__EdgeAnnotation__Group_0__0 ) )
                    // InternalDataflow.g:454:3: ( rule__EdgeAnnotation__Group_0__0 )
                    {
                     before(grammarAccess.getEdgeAnnotationAccess().getGroup_0()); 
                    // InternalDataflow.g:455:3: ( rule__EdgeAnnotation__Group_0__0 )
                    // InternalDataflow.g:455:4: rule__EdgeAnnotation__Group_0__0
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
                    // InternalDataflow.g:459:2: ( ( rule__EdgeAnnotation__Group_1__0 ) )
                    {
                    // InternalDataflow.g:459:2: ( ( rule__EdgeAnnotation__Group_1__0 ) )
                    // InternalDataflow.g:460:3: ( rule__EdgeAnnotation__Group_1__0 )
                    {
                     before(grammarAccess.getEdgeAnnotationAccess().getGroup_1()); 
                    // InternalDataflow.g:461:3: ( rule__EdgeAnnotation__Group_1__0 )
                    // InternalDataflow.g:461:4: rule__EdgeAnnotation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeAnnotation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEdgeAnnotationAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataflow.g:465:2: ( ( rule__EdgeAnnotation__Group_2__0 ) )
                    {
                    // InternalDataflow.g:465:2: ( ( rule__EdgeAnnotation__Group_2__0 ) )
                    // InternalDataflow.g:466:3: ( rule__EdgeAnnotation__Group_2__0 )
                    {
                     before(grammarAccess.getEdgeAnnotationAccess().getGroup_2()); 
                    // InternalDataflow.g:467:3: ( rule__EdgeAnnotation__Group_2__0 )
                    // InternalDataflow.g:467:4: rule__EdgeAnnotation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeAnnotation__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEdgeAnnotationAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataflow.g:471:2: ( ( rule__EdgeAnnotation__Group_3__0 ) )
                    {
                    // InternalDataflow.g:471:2: ( ( rule__EdgeAnnotation__Group_3__0 ) )
                    // InternalDataflow.g:472:3: ( rule__EdgeAnnotation__Group_3__0 )
                    {
                     before(grammarAccess.getEdgeAnnotationAccess().getGroup_3()); 
                    // InternalDataflow.g:473:3: ( rule__EdgeAnnotation__Group_3__0 )
                    // InternalDataflow.g:473:4: rule__EdgeAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeAnnotation__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEdgeAnnotationAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataflow.g:477:2: ( ( rule__EdgeAnnotation__Group_4__0 ) )
                    {
                    // InternalDataflow.g:477:2: ( ( rule__EdgeAnnotation__Group_4__0 ) )
                    // InternalDataflow.g:478:3: ( rule__EdgeAnnotation__Group_4__0 )
                    {
                     before(grammarAccess.getEdgeAnnotationAccess().getGroup_4()); 
                    // InternalDataflow.g:479:3: ( rule__EdgeAnnotation__Group_4__0 )
                    // InternalDataflow.g:479:4: rule__EdgeAnnotation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeAnnotation__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEdgeAnnotationAccess().getGroup_4()); 

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


    // $ANTLR start "rule__TimeStamp__Alternatives"
    // InternalDataflow.g:487:1: rule__TimeStamp__Alternatives : ( ( ruleNumber ) | ( '-inf' ) );
    public final void rule__TimeStamp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:491:1: ( ( ruleNumber ) | ( '-inf' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_FLOAT && LA3_0<=RULE_NINT)) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataflow.g:492:2: ( ruleNumber )
                    {
                    // InternalDataflow.g:492:2: ( ruleNumber )
                    // InternalDataflow.g:493:3: ruleNumber
                    {
                     before(grammarAccess.getTimeStampAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getTimeStampAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflow.g:498:2: ( '-inf' )
                    {
                    // InternalDataflow.g:498:2: ( '-inf' )
                    // InternalDataflow.g:499:3: '-inf'
                    {
                     before(grammarAccess.getTimeStampAccess().getInfKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTimeStampAccess().getInfKeyword_1()); 

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
    // $ANTLR end "rule__TimeStamp__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalDataflow.g:508:1: rule__Number__Alternatives : ( ( ( rule__Number__RatioAssignment_0 ) ) | ( ( rule__Number__ValueAssignment_1 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:512:1: ( ( ( rule__Number__RatioAssignment_0 ) ) | ( ( rule__Number__ValueAssignment_1 ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==21||LA4_1==25||LA4_1==36) ) {
                    alt4=2;
                }
                else if ( (LA4_1==41) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NINT:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==41) ) {
                    alt4=1;
                }
                else if ( (LA4_2==EOF||LA4_2==21||LA4_2==25||LA4_2==36) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDataflow.g:513:2: ( ( rule__Number__RatioAssignment_0 ) )
                    {
                    // InternalDataflow.g:513:2: ( ( rule__Number__RatioAssignment_0 ) )
                    // InternalDataflow.g:514:3: ( rule__Number__RatioAssignment_0 )
                    {
                     before(grammarAccess.getNumberAccess().getRatioAssignment_0()); 
                    // InternalDataflow.g:515:3: ( rule__Number__RatioAssignment_0 )
                    // InternalDataflow.g:515:4: rule__Number__RatioAssignment_0
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
                    // InternalDataflow.g:519:2: ( ( rule__Number__ValueAssignment_1 ) )
                    {
                    // InternalDataflow.g:519:2: ( ( rule__Number__ValueAssignment_1 ) )
                    // InternalDataflow.g:520:3: ( rule__Number__ValueAssignment_1 )
                    {
                     before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
                    // InternalDataflow.g:521:3: ( rule__Number__ValueAssignment_1 )
                    // InternalDataflow.g:521:4: rule__Number__ValueAssignment_1
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
    // InternalDataflow.g:529:1: rule__Number__ValueAlternatives_1_0 : ( ( rulePNInt ) | ( RULE_FLOAT ) );
    public final void rule__Number__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:533:1: ( ( rulePNInt ) | ( RULE_FLOAT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_NINT)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_FLOAT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataflow.g:534:2: ( rulePNInt )
                    {
                    // InternalDataflow.g:534:2: ( rulePNInt )
                    // InternalDataflow.g:535:3: rulePNInt
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
                    // InternalDataflow.g:540:2: ( RULE_FLOAT )
                    {
                    // InternalDataflow.g:540:2: ( RULE_FLOAT )
                    // InternalDataflow.g:541:3: RULE_FLOAT
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
    // InternalDataflow.g:550:1: rule__PNInt__Alternatives : ( ( RULE_INT ) | ( RULE_NINT ) );
    public final void rule__PNInt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:554:1: ( ( RULE_INT ) | ( RULE_NINT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_NINT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataflow.g:555:2: ( RULE_INT )
                    {
                    // InternalDataflow.g:555:2: ( RULE_INT )
                    // InternalDataflow.g:556:3: RULE_INT
                    {
                     before(grammarAccess.getPNIntAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getPNIntAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataflow.g:561:2: ( RULE_NINT )
                    {
                    // InternalDataflow.g:561:2: ( RULE_NINT )
                    // InternalDataflow.g:562:3: RULE_NINT
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


    // $ANTLR start "rule__DataflowModel__Group__0"
    // InternalDataflow.g:571:1: rule__DataflowModel__Group__0 : rule__DataflowModel__Group__0__Impl rule__DataflowModel__Group__1 ;
    public final void rule__DataflowModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:575:1: ( rule__DataflowModel__Group__0__Impl rule__DataflowModel__Group__1 )
            // InternalDataflow.g:576:2: rule__DataflowModel__Group__0__Impl rule__DataflowModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataflowModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__1();

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
    // $ANTLR end "rule__DataflowModel__Group__0"


    // $ANTLR start "rule__DataflowModel__Group__0__Impl"
    // InternalDataflow.g:583:1: rule__DataflowModel__Group__0__Impl : ( ( rule__DataflowModel__Group_0__0 )? ) ;
    public final void rule__DataflowModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:587:1: ( ( ( rule__DataflowModel__Group_0__0 )? ) )
            // InternalDataflow.g:588:1: ( ( rule__DataflowModel__Group_0__0 )? )
            {
            // InternalDataflow.g:588:1: ( ( rule__DataflowModel__Group_0__0 )? )
            // InternalDataflow.g:589:2: ( rule__DataflowModel__Group_0__0 )?
            {
             before(grammarAccess.getDataflowModelAccess().getGroup_0()); 
            // InternalDataflow.g:590:2: ( rule__DataflowModel__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataflow.g:590:3: rule__DataflowModel__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataflowModel__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataflowModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__0__Impl"


    // $ANTLR start "rule__DataflowModel__Group__1"
    // InternalDataflow.g:598:1: rule__DataflowModel__Group__1 : rule__DataflowModel__Group__1__Impl rule__DataflowModel__Group__2 ;
    public final void rule__DataflowModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:602:1: ( rule__DataflowModel__Group__1__Impl rule__DataflowModel__Group__2 )
            // InternalDataflow.g:603:2: rule__DataflowModel__Group__1__Impl rule__DataflowModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DataflowModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__2();

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
    // $ANTLR end "rule__DataflowModel__Group__1"


    // $ANTLR start "rule__DataflowModel__Group__1__Impl"
    // InternalDataflow.g:610:1: rule__DataflowModel__Group__1__Impl : ( 'dataflow' ) ;
    public final void rule__DataflowModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:614:1: ( ( 'dataflow' ) )
            // InternalDataflow.g:615:1: ( 'dataflow' )
            {
            // InternalDataflow.g:615:1: ( 'dataflow' )
            // InternalDataflow.g:616:2: 'dataflow'
            {
             before(grammarAccess.getDataflowModelAccess().getDataflowKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getDataflowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__1__Impl"


    // $ANTLR start "rule__DataflowModel__Group__2"
    // InternalDataflow.g:625:1: rule__DataflowModel__Group__2 : rule__DataflowModel__Group__2__Impl rule__DataflowModel__Group__3 ;
    public final void rule__DataflowModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:629:1: ( rule__DataflowModel__Group__2__Impl rule__DataflowModel__Group__3 )
            // InternalDataflow.g:630:2: rule__DataflowModel__Group__2__Impl rule__DataflowModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DataflowModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__3();

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
    // $ANTLR end "rule__DataflowModel__Group__2"


    // $ANTLR start "rule__DataflowModel__Group__2__Impl"
    // InternalDataflow.g:637:1: rule__DataflowModel__Group__2__Impl : ( 'graph' ) ;
    public final void rule__DataflowModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:641:1: ( ( 'graph' ) )
            // InternalDataflow.g:642:1: ( 'graph' )
            {
            // InternalDataflow.g:642:1: ( 'graph' )
            // InternalDataflow.g:643:2: 'graph'
            {
             before(grammarAccess.getDataflowModelAccess().getGraphKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getGraphKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__2__Impl"


    // $ANTLR start "rule__DataflowModel__Group__3"
    // InternalDataflow.g:652:1: rule__DataflowModel__Group__3 : rule__DataflowModel__Group__3__Impl rule__DataflowModel__Group__4 ;
    public final void rule__DataflowModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:656:1: ( rule__DataflowModel__Group__3__Impl rule__DataflowModel__Group__4 )
            // InternalDataflow.g:657:2: rule__DataflowModel__Group__3__Impl rule__DataflowModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DataflowModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__4();

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
    // $ANTLR end "rule__DataflowModel__Group__3"


    // $ANTLR start "rule__DataflowModel__Group__3__Impl"
    // InternalDataflow.g:664:1: rule__DataflowModel__Group__3__Impl : ( ( rule__DataflowModel__NameAssignment_3 ) ) ;
    public final void rule__DataflowModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:668:1: ( ( ( rule__DataflowModel__NameAssignment_3 ) ) )
            // InternalDataflow.g:669:1: ( ( rule__DataflowModel__NameAssignment_3 ) )
            {
            // InternalDataflow.g:669:1: ( ( rule__DataflowModel__NameAssignment_3 ) )
            // InternalDataflow.g:670:2: ( rule__DataflowModel__NameAssignment_3 )
            {
             before(grammarAccess.getDataflowModelAccess().getNameAssignment_3()); 
            // InternalDataflow.g:671:2: ( rule__DataflowModel__NameAssignment_3 )
            // InternalDataflow.g:671:3: rule__DataflowModel__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataflowModelAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__3__Impl"


    // $ANTLR start "rule__DataflowModel__Group__4"
    // InternalDataflow.g:679:1: rule__DataflowModel__Group__4 : rule__DataflowModel__Group__4__Impl rule__DataflowModel__Group__5 ;
    public final void rule__DataflowModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:683:1: ( rule__DataflowModel__Group__4__Impl rule__DataflowModel__Group__5 )
            // InternalDataflow.g:684:2: rule__DataflowModel__Group__4__Impl rule__DataflowModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DataflowModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__5();

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
    // $ANTLR end "rule__DataflowModel__Group__4"


    // $ANTLR start "rule__DataflowModel__Group__4__Impl"
    // InternalDataflow.g:691:1: rule__DataflowModel__Group__4__Impl : ( '{' ) ;
    public final void rule__DataflowModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:695:1: ( ( '{' ) )
            // InternalDataflow.g:696:1: ( '{' )
            {
            // InternalDataflow.g:696:1: ( '{' )
            // InternalDataflow.g:697:2: '{'
            {
             before(grammarAccess.getDataflowModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__4__Impl"


    // $ANTLR start "rule__DataflowModel__Group__5"
    // InternalDataflow.g:706:1: rule__DataflowModel__Group__5 : rule__DataflowModel__Group__5__Impl rule__DataflowModel__Group__6 ;
    public final void rule__DataflowModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:710:1: ( rule__DataflowModel__Group__5__Impl rule__DataflowModel__Group__6 )
            // InternalDataflow.g:711:2: rule__DataflowModel__Group__5__Impl rule__DataflowModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__DataflowModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__6();

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
    // $ANTLR end "rule__DataflowModel__Group__5"


    // $ANTLR start "rule__DataflowModel__Group__5__Impl"
    // InternalDataflow.g:718:1: rule__DataflowModel__Group__5__Impl : ( ( rule__DataflowModel__Group_5__0 )? ) ;
    public final void rule__DataflowModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:722:1: ( ( ( rule__DataflowModel__Group_5__0 )? ) )
            // InternalDataflow.g:723:1: ( ( rule__DataflowModel__Group_5__0 )? )
            {
            // InternalDataflow.g:723:1: ( ( rule__DataflowModel__Group_5__0 )? )
            // InternalDataflow.g:724:2: ( rule__DataflowModel__Group_5__0 )?
            {
             before(grammarAccess.getDataflowModelAccess().getGroup_5()); 
            // InternalDataflow.g:725:2: ( rule__DataflowModel__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataflow.g:725:3: rule__DataflowModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataflowModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataflowModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__5__Impl"


    // $ANTLR start "rule__DataflowModel__Group__6"
    // InternalDataflow.g:733:1: rule__DataflowModel__Group__6 : rule__DataflowModel__Group__6__Impl rule__DataflowModel__Group__7 ;
    public final void rule__DataflowModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:737:1: ( rule__DataflowModel__Group__6__Impl rule__DataflowModel__Group__7 )
            // InternalDataflow.g:738:2: rule__DataflowModel__Group__6__Impl rule__DataflowModel__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__DataflowModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__7();

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
    // $ANTLR end "rule__DataflowModel__Group__6"


    // $ANTLR start "rule__DataflowModel__Group__6__Impl"
    // InternalDataflow.g:745:1: rule__DataflowModel__Group__6__Impl : ( ( rule__DataflowModel__Group_6__0 )? ) ;
    public final void rule__DataflowModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:749:1: ( ( ( rule__DataflowModel__Group_6__0 )? ) )
            // InternalDataflow.g:750:1: ( ( rule__DataflowModel__Group_6__0 )? )
            {
            // InternalDataflow.g:750:1: ( ( rule__DataflowModel__Group_6__0 )? )
            // InternalDataflow.g:751:2: ( rule__DataflowModel__Group_6__0 )?
            {
             before(grammarAccess.getDataflowModelAccess().getGroup_6()); 
            // InternalDataflow.g:752:2: ( rule__DataflowModel__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataflow.g:752:3: rule__DataflowModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataflowModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataflowModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__6__Impl"


    // $ANTLR start "rule__DataflowModel__Group__7"
    // InternalDataflow.g:760:1: rule__DataflowModel__Group__7 : rule__DataflowModel__Group__7__Impl rule__DataflowModel__Group__8 ;
    public final void rule__DataflowModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:764:1: ( rule__DataflowModel__Group__7__Impl rule__DataflowModel__Group__8 )
            // InternalDataflow.g:765:2: rule__DataflowModel__Group__7__Impl rule__DataflowModel__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__DataflowModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__8();

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
    // $ANTLR end "rule__DataflowModel__Group__7"


    // $ANTLR start "rule__DataflowModel__Group__7__Impl"
    // InternalDataflow.g:772:1: rule__DataflowModel__Group__7__Impl : ( ( rule__DataflowModel__EdgesAssignment_7 )* ) ;
    public final void rule__DataflowModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:776:1: ( ( ( rule__DataflowModel__EdgesAssignment_7 )* ) )
            // InternalDataflow.g:777:1: ( ( rule__DataflowModel__EdgesAssignment_7 )* )
            {
            // InternalDataflow.g:777:1: ( ( rule__DataflowModel__EdgesAssignment_7 )* )
            // InternalDataflow.g:778:2: ( rule__DataflowModel__EdgesAssignment_7 )*
            {
             before(grammarAccess.getDataflowModelAccess().getEdgesAssignment_7()); 
            // InternalDataflow.g:779:2: ( rule__DataflowModel__EdgesAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDataflow.g:779:3: rule__DataflowModel__EdgesAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DataflowModel__EdgesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDataflowModelAccess().getEdgesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__7__Impl"


    // $ANTLR start "rule__DataflowModel__Group__8"
    // InternalDataflow.g:787:1: rule__DataflowModel__Group__8 : rule__DataflowModel__Group__8__Impl rule__DataflowModel__Group__9 ;
    public final void rule__DataflowModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:791:1: ( rule__DataflowModel__Group__8__Impl rule__DataflowModel__Group__9 )
            // InternalDataflow.g:792:2: rule__DataflowModel__Group__8__Impl rule__DataflowModel__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__DataflowModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__9();

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
    // $ANTLR end "rule__DataflowModel__Group__8"


    // $ANTLR start "rule__DataflowModel__Group__8__Impl"
    // InternalDataflow.g:799:1: rule__DataflowModel__Group__8__Impl : ( '}' ) ;
    public final void rule__DataflowModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:803:1: ( ( '}' ) )
            // InternalDataflow.g:804:1: ( '}' )
            {
            // InternalDataflow.g:804:1: ( '}' )
            // InternalDataflow.g:805:2: '}'
            {
             before(grammarAccess.getDataflowModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__8__Impl"


    // $ANTLR start "rule__DataflowModel__Group__9"
    // InternalDataflow.g:814:1: rule__DataflowModel__Group__9 : rule__DataflowModel__Group__9__Impl ;
    public final void rule__DataflowModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:818:1: ( rule__DataflowModel__Group__9__Impl )
            // InternalDataflow.g:819:2: rule__DataflowModel__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group__9__Impl();

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
    // $ANTLR end "rule__DataflowModel__Group__9"


    // $ANTLR start "rule__DataflowModel__Group__9__Impl"
    // InternalDataflow.g:825:1: rule__DataflowModel__Group__9__Impl : ( ( rule__DataflowModel__InputsignalsAssignment_9 )? ) ;
    public final void rule__DataflowModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:829:1: ( ( ( rule__DataflowModel__InputsignalsAssignment_9 )? ) )
            // InternalDataflow.g:830:1: ( ( rule__DataflowModel__InputsignalsAssignment_9 )? )
            {
            // InternalDataflow.g:830:1: ( ( rule__DataflowModel__InputsignalsAssignment_9 )? )
            // InternalDataflow.g:831:2: ( rule__DataflowModel__InputsignalsAssignment_9 )?
            {
             before(grammarAccess.getDataflowModelAccess().getInputsignalsAssignment_9()); 
            // InternalDataflow.g:832:2: ( rule__DataflowModel__InputsignalsAssignment_9 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataflow.g:832:3: rule__DataflowModel__InputsignalsAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataflowModel__InputsignalsAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataflowModelAccess().getInputsignalsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group__9__Impl"


    // $ANTLR start "rule__DataflowModel__Group_0__0"
    // InternalDataflow.g:841:1: rule__DataflowModel__Group_0__0 : rule__DataflowModel__Group_0__0__Impl rule__DataflowModel__Group_0__1 ;
    public final void rule__DataflowModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:845:1: ( rule__DataflowModel__Group_0__0__Impl rule__DataflowModel__Group_0__1 )
            // InternalDataflow.g:846:2: rule__DataflowModel__Group_0__0__Impl rule__DataflowModel__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__DataflowModel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_0__1();

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
    // $ANTLR end "rule__DataflowModel__Group_0__0"


    // $ANTLR start "rule__DataflowModel__Group_0__0__Impl"
    // InternalDataflow.g:853:1: rule__DataflowModel__Group_0__0__Impl : ( 'author' ) ;
    public final void rule__DataflowModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:857:1: ( ( 'author' ) )
            // InternalDataflow.g:858:1: ( 'author' )
            {
            // InternalDataflow.g:858:1: ( 'author' )
            // InternalDataflow.g:859:2: 'author'
            {
             before(grammarAccess.getDataflowModelAccess().getAuthorKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getAuthorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_0__0__Impl"


    // $ANTLR start "rule__DataflowModel__Group_0__1"
    // InternalDataflow.g:868:1: rule__DataflowModel__Group_0__1 : rule__DataflowModel__Group_0__1__Impl rule__DataflowModel__Group_0__2 ;
    public final void rule__DataflowModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:872:1: ( rule__DataflowModel__Group_0__1__Impl rule__DataflowModel__Group_0__2 )
            // InternalDataflow.g:873:2: rule__DataflowModel__Group_0__1__Impl rule__DataflowModel__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__DataflowModel__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_0__2();

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
    // $ANTLR end "rule__DataflowModel__Group_0__1"


    // $ANTLR start "rule__DataflowModel__Group_0__1__Impl"
    // InternalDataflow.g:880:1: rule__DataflowModel__Group_0__1__Impl : ( '=' ) ;
    public final void rule__DataflowModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:884:1: ( ( '=' ) )
            // InternalDataflow.g:885:1: ( '=' )
            {
            // InternalDataflow.g:885:1: ( '=' )
            // InternalDataflow.g:886:2: '='
            {
             before(grammarAccess.getDataflowModelAccess().getEqualsSignKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_0__1__Impl"


    // $ANTLR start "rule__DataflowModel__Group_0__2"
    // InternalDataflow.g:895:1: rule__DataflowModel__Group_0__2 : rule__DataflowModel__Group_0__2__Impl ;
    public final void rule__DataflowModel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:899:1: ( rule__DataflowModel__Group_0__2__Impl )
            // InternalDataflow.g:900:2: rule__DataflowModel__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_0__2__Impl();

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
    // $ANTLR end "rule__DataflowModel__Group_0__2"


    // $ANTLR start "rule__DataflowModel__Group_0__2__Impl"
    // InternalDataflow.g:906:1: rule__DataflowModel__Group_0__2__Impl : ( ( rule__DataflowModel__AuthorAssignment_0_2 ) ) ;
    public final void rule__DataflowModel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:910:1: ( ( ( rule__DataflowModel__AuthorAssignment_0_2 ) ) )
            // InternalDataflow.g:911:1: ( ( rule__DataflowModel__AuthorAssignment_0_2 ) )
            {
            // InternalDataflow.g:911:1: ( ( rule__DataflowModel__AuthorAssignment_0_2 ) )
            // InternalDataflow.g:912:2: ( rule__DataflowModel__AuthorAssignment_0_2 )
            {
             before(grammarAccess.getDataflowModelAccess().getAuthorAssignment_0_2()); 
            // InternalDataflow.g:913:2: ( rule__DataflowModel__AuthorAssignment_0_2 )
            // InternalDataflow.g:913:3: rule__DataflowModel__AuthorAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__AuthorAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDataflowModelAccess().getAuthorAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_0__2__Impl"


    // $ANTLR start "rule__DataflowModel__Group_5__0"
    // InternalDataflow.g:922:1: rule__DataflowModel__Group_5__0 : rule__DataflowModel__Group_5__0__Impl rule__DataflowModel__Group_5__1 ;
    public final void rule__DataflowModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:926:1: ( rule__DataflowModel__Group_5__0__Impl rule__DataflowModel__Group_5__1 )
            // InternalDataflow.g:927:2: rule__DataflowModel__Group_5__0__Impl rule__DataflowModel__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__DataflowModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_5__1();

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
    // $ANTLR end "rule__DataflowModel__Group_5__0"


    // $ANTLR start "rule__DataflowModel__Group_5__0__Impl"
    // InternalDataflow.g:934:1: rule__DataflowModel__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__DataflowModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:938:1: ( ( 'inputs' ) )
            // InternalDataflow.g:939:1: ( 'inputs' )
            {
            // InternalDataflow.g:939:1: ( 'inputs' )
            // InternalDataflow.g:940:2: 'inputs'
            {
             before(grammarAccess.getDataflowModelAccess().getInputsKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getInputsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_5__0__Impl"


    // $ANTLR start "rule__DataflowModel__Group_5__1"
    // InternalDataflow.g:949:1: rule__DataflowModel__Group_5__1 : rule__DataflowModel__Group_5__1__Impl rule__DataflowModel__Group_5__2 ;
    public final void rule__DataflowModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:953:1: ( rule__DataflowModel__Group_5__1__Impl rule__DataflowModel__Group_5__2 )
            // InternalDataflow.g:954:2: rule__DataflowModel__Group_5__1__Impl rule__DataflowModel__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__DataflowModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_5__2();

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
    // $ANTLR end "rule__DataflowModel__Group_5__1"


    // $ANTLR start "rule__DataflowModel__Group_5__1__Impl"
    // InternalDataflow.g:961:1: rule__DataflowModel__Group_5__1__Impl : ( ( rule__DataflowModel__InputsAssignment_5_1 ) ) ;
    public final void rule__DataflowModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:965:1: ( ( ( rule__DataflowModel__InputsAssignment_5_1 ) ) )
            // InternalDataflow.g:966:1: ( ( rule__DataflowModel__InputsAssignment_5_1 ) )
            {
            // InternalDataflow.g:966:1: ( ( rule__DataflowModel__InputsAssignment_5_1 ) )
            // InternalDataflow.g:967:2: ( rule__DataflowModel__InputsAssignment_5_1 )
            {
             before(grammarAccess.getDataflowModelAccess().getInputsAssignment_5_1()); 
            // InternalDataflow.g:968:2: ( rule__DataflowModel__InputsAssignment_5_1 )
            // InternalDataflow.g:968:3: rule__DataflowModel__InputsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__InputsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDataflowModelAccess().getInputsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_5__1__Impl"


    // $ANTLR start "rule__DataflowModel__Group_5__2"
    // InternalDataflow.g:976:1: rule__DataflowModel__Group_5__2 : rule__DataflowModel__Group_5__2__Impl ;
    public final void rule__DataflowModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:980:1: ( rule__DataflowModel__Group_5__2__Impl )
            // InternalDataflow.g:981:2: rule__DataflowModel__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_5__2__Impl();

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
    // $ANTLR end "rule__DataflowModel__Group_5__2"


    // $ANTLR start "rule__DataflowModel__Group_5__2__Impl"
    // InternalDataflow.g:987:1: rule__DataflowModel__Group_5__2__Impl : ( ( rule__DataflowModel__Group_5_2__0 )* ) ;
    public final void rule__DataflowModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:991:1: ( ( ( rule__DataflowModel__Group_5_2__0 )* ) )
            // InternalDataflow.g:992:1: ( ( rule__DataflowModel__Group_5_2__0 )* )
            {
            // InternalDataflow.g:992:1: ( ( rule__DataflowModel__Group_5_2__0 )* )
            // InternalDataflow.g:993:2: ( rule__DataflowModel__Group_5_2__0 )*
            {
             before(grammarAccess.getDataflowModelAccess().getGroup_5_2()); 
            // InternalDataflow.g:994:2: ( rule__DataflowModel__Group_5_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDataflow.g:994:3: rule__DataflowModel__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DataflowModel__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataflowModelAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_5__2__Impl"


    // $ANTLR start "rule__DataflowModel__Group_5_2__0"
    // InternalDataflow.g:1003:1: rule__DataflowModel__Group_5_2__0 : rule__DataflowModel__Group_5_2__0__Impl rule__DataflowModel__Group_5_2__1 ;
    public final void rule__DataflowModel__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1007:1: ( rule__DataflowModel__Group_5_2__0__Impl rule__DataflowModel__Group_5_2__1 )
            // InternalDataflow.g:1008:2: rule__DataflowModel__Group_5_2__0__Impl rule__DataflowModel__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DataflowModel__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_5_2__1();

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
    // $ANTLR end "rule__DataflowModel__Group_5_2__0"


    // $ANTLR start "rule__DataflowModel__Group_5_2__0__Impl"
    // InternalDataflow.g:1015:1: rule__DataflowModel__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__DataflowModel__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1019:1: ( ( ',' ) )
            // InternalDataflow.g:1020:1: ( ',' )
            {
            // InternalDataflow.g:1020:1: ( ',' )
            // InternalDataflow.g:1021:2: ','
            {
             before(grammarAccess.getDataflowModelAccess().getCommaKeyword_5_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_5_2__0__Impl"


    // $ANTLR start "rule__DataflowModel__Group_5_2__1"
    // InternalDataflow.g:1030:1: rule__DataflowModel__Group_5_2__1 : rule__DataflowModel__Group_5_2__1__Impl ;
    public final void rule__DataflowModel__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1034:1: ( rule__DataflowModel__Group_5_2__1__Impl )
            // InternalDataflow.g:1035:2: rule__DataflowModel__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__DataflowModel__Group_5_2__1"


    // $ANTLR start "rule__DataflowModel__Group_5_2__1__Impl"
    // InternalDataflow.g:1041:1: rule__DataflowModel__Group_5_2__1__Impl : ( ( rule__DataflowModel__InputsAssignment_5_2_1 ) ) ;
    public final void rule__DataflowModel__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1045:1: ( ( ( rule__DataflowModel__InputsAssignment_5_2_1 ) ) )
            // InternalDataflow.g:1046:1: ( ( rule__DataflowModel__InputsAssignment_5_2_1 ) )
            {
            // InternalDataflow.g:1046:1: ( ( rule__DataflowModel__InputsAssignment_5_2_1 ) )
            // InternalDataflow.g:1047:2: ( rule__DataflowModel__InputsAssignment_5_2_1 )
            {
             before(grammarAccess.getDataflowModelAccess().getInputsAssignment_5_2_1()); 
            // InternalDataflow.g:1048:2: ( rule__DataflowModel__InputsAssignment_5_2_1 )
            // InternalDataflow.g:1048:3: rule__DataflowModel__InputsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__InputsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataflowModelAccess().getInputsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_5_2__1__Impl"


    // $ANTLR start "rule__DataflowModel__Group_6__0"
    // InternalDataflow.g:1057:1: rule__DataflowModel__Group_6__0 : rule__DataflowModel__Group_6__0__Impl rule__DataflowModel__Group_6__1 ;
    public final void rule__DataflowModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1061:1: ( rule__DataflowModel__Group_6__0__Impl rule__DataflowModel__Group_6__1 )
            // InternalDataflow.g:1062:2: rule__DataflowModel__Group_6__0__Impl rule__DataflowModel__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__DataflowModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_6__1();

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
    // $ANTLR end "rule__DataflowModel__Group_6__0"


    // $ANTLR start "rule__DataflowModel__Group_6__0__Impl"
    // InternalDataflow.g:1069:1: rule__DataflowModel__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__DataflowModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1073:1: ( ( 'outputs' ) )
            // InternalDataflow.g:1074:1: ( 'outputs' )
            {
            // InternalDataflow.g:1074:1: ( 'outputs' )
            // InternalDataflow.g:1075:2: 'outputs'
            {
             before(grammarAccess.getDataflowModelAccess().getOutputsKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getOutputsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_6__0__Impl"


    // $ANTLR start "rule__DataflowModel__Group_6__1"
    // InternalDataflow.g:1084:1: rule__DataflowModel__Group_6__1 : rule__DataflowModel__Group_6__1__Impl rule__DataflowModel__Group_6__2 ;
    public final void rule__DataflowModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1088:1: ( rule__DataflowModel__Group_6__1__Impl rule__DataflowModel__Group_6__2 )
            // InternalDataflow.g:1089:2: rule__DataflowModel__Group_6__1__Impl rule__DataflowModel__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__DataflowModel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_6__2();

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
    // $ANTLR end "rule__DataflowModel__Group_6__1"


    // $ANTLR start "rule__DataflowModel__Group_6__1__Impl"
    // InternalDataflow.g:1096:1: rule__DataflowModel__Group_6__1__Impl : ( ( rule__DataflowModel__OutputsAssignment_6_1 ) ) ;
    public final void rule__DataflowModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1100:1: ( ( ( rule__DataflowModel__OutputsAssignment_6_1 ) ) )
            // InternalDataflow.g:1101:1: ( ( rule__DataflowModel__OutputsAssignment_6_1 ) )
            {
            // InternalDataflow.g:1101:1: ( ( rule__DataflowModel__OutputsAssignment_6_1 ) )
            // InternalDataflow.g:1102:2: ( rule__DataflowModel__OutputsAssignment_6_1 )
            {
             before(grammarAccess.getDataflowModelAccess().getOutputsAssignment_6_1()); 
            // InternalDataflow.g:1103:2: ( rule__DataflowModel__OutputsAssignment_6_1 )
            // InternalDataflow.g:1103:3: rule__DataflowModel__OutputsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__OutputsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDataflowModelAccess().getOutputsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_6__1__Impl"


    // $ANTLR start "rule__DataflowModel__Group_6__2"
    // InternalDataflow.g:1111:1: rule__DataflowModel__Group_6__2 : rule__DataflowModel__Group_6__2__Impl ;
    public final void rule__DataflowModel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1115:1: ( rule__DataflowModel__Group_6__2__Impl )
            // InternalDataflow.g:1116:2: rule__DataflowModel__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_6__2__Impl();

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
    // $ANTLR end "rule__DataflowModel__Group_6__2"


    // $ANTLR start "rule__DataflowModel__Group_6__2__Impl"
    // InternalDataflow.g:1122:1: rule__DataflowModel__Group_6__2__Impl : ( ( rule__DataflowModel__Group_6_2__0 )* ) ;
    public final void rule__DataflowModel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1126:1: ( ( ( rule__DataflowModel__Group_6_2__0 )* ) )
            // InternalDataflow.g:1127:1: ( ( rule__DataflowModel__Group_6_2__0 )* )
            {
            // InternalDataflow.g:1127:1: ( ( rule__DataflowModel__Group_6_2__0 )* )
            // InternalDataflow.g:1128:2: ( rule__DataflowModel__Group_6_2__0 )*
            {
             before(grammarAccess.getDataflowModelAccess().getGroup_6_2()); 
            // InternalDataflow.g:1129:2: ( rule__DataflowModel__Group_6_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDataflow.g:1129:3: rule__DataflowModel__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DataflowModel__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDataflowModelAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_6__2__Impl"


    // $ANTLR start "rule__DataflowModel__Group_6_2__0"
    // InternalDataflow.g:1138:1: rule__DataflowModel__Group_6_2__0 : rule__DataflowModel__Group_6_2__0__Impl rule__DataflowModel__Group_6_2__1 ;
    public final void rule__DataflowModel__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1142:1: ( rule__DataflowModel__Group_6_2__0__Impl rule__DataflowModel__Group_6_2__1 )
            // InternalDataflow.g:1143:2: rule__DataflowModel__Group_6_2__0__Impl rule__DataflowModel__Group_6_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DataflowModel__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_6_2__1();

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
    // $ANTLR end "rule__DataflowModel__Group_6_2__0"


    // $ANTLR start "rule__DataflowModel__Group_6_2__0__Impl"
    // InternalDataflow.g:1150:1: rule__DataflowModel__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__DataflowModel__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1154:1: ( ( ',' ) )
            // InternalDataflow.g:1155:1: ( ',' )
            {
            // InternalDataflow.g:1155:1: ( ',' )
            // InternalDataflow.g:1156:2: ','
            {
             before(grammarAccess.getDataflowModelAccess().getCommaKeyword_6_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_6_2__0__Impl"


    // $ANTLR start "rule__DataflowModel__Group_6_2__1"
    // InternalDataflow.g:1165:1: rule__DataflowModel__Group_6_2__1 : rule__DataflowModel__Group_6_2__1__Impl ;
    public final void rule__DataflowModel__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1169:1: ( rule__DataflowModel__Group_6_2__1__Impl )
            // InternalDataflow.g:1170:2: rule__DataflowModel__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__DataflowModel__Group_6_2__1"


    // $ANTLR start "rule__DataflowModel__Group_6_2__1__Impl"
    // InternalDataflow.g:1176:1: rule__DataflowModel__Group_6_2__1__Impl : ( ( rule__DataflowModel__OutputsAssignment_6_2_1 ) ) ;
    public final void rule__DataflowModel__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1180:1: ( ( ( rule__DataflowModel__OutputsAssignment_6_2_1 ) ) )
            // InternalDataflow.g:1181:1: ( ( rule__DataflowModel__OutputsAssignment_6_2_1 ) )
            {
            // InternalDataflow.g:1181:1: ( ( rule__DataflowModel__OutputsAssignment_6_2_1 ) )
            // InternalDataflow.g:1182:2: ( rule__DataflowModel__OutputsAssignment_6_2_1 )
            {
             before(grammarAccess.getDataflowModelAccess().getOutputsAssignment_6_2_1()); 
            // InternalDataflow.g:1183:2: ( rule__DataflowModel__OutputsAssignment_6_2_1 )
            // InternalDataflow.g:1183:3: rule__DataflowModel__OutputsAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataflowModel__OutputsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataflowModelAccess().getOutputsAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__Group_6_2__1__Impl"


    // $ANTLR start "rule__Edge__Group_0__0"
    // InternalDataflow.g:1192:1: rule__Edge__Group_0__0 : rule__Edge__Group_0__0__Impl rule__Edge__Group_0__1 ;
    public final void rule__Edge__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1196:1: ( rule__Edge__Group_0__0__Impl rule__Edge__Group_0__1 )
            // InternalDataflow.g:1197:2: rule__Edge__Group_0__0__Impl rule__Edge__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflow.g:1204:1: rule__Edge__Group_0__0__Impl : ( ( rule__Edge__SrcactAssignment_0_0 ) ) ;
    public final void rule__Edge__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1208:1: ( ( ( rule__Edge__SrcactAssignment_0_0 ) ) )
            // InternalDataflow.g:1209:1: ( ( rule__Edge__SrcactAssignment_0_0 ) )
            {
            // InternalDataflow.g:1209:1: ( ( rule__Edge__SrcactAssignment_0_0 ) )
            // InternalDataflow.g:1210:2: ( rule__Edge__SrcactAssignment_0_0 )
            {
             before(grammarAccess.getEdgeAccess().getSrcactAssignment_0_0()); 
            // InternalDataflow.g:1211:2: ( rule__Edge__SrcactAssignment_0_0 )
            // InternalDataflow.g:1211:3: rule__Edge__SrcactAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__SrcactAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getSrcactAssignment_0_0()); 

            }


            }

        }
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
    // InternalDataflow.g:1219:1: rule__Edge__Group_0__1 : rule__Edge__Group_0__1__Impl rule__Edge__Group_0__2 ;
    public final void rule__Edge__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1223:1: ( rule__Edge__Group_0__1__Impl rule__Edge__Group_0__2 )
            // InternalDataflow.g:1224:2: rule__Edge__Group_0__1__Impl rule__Edge__Group_0__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflow.g:1231:1: rule__Edge__Group_0__1__Impl : ( ( '-' )* ) ;
    public final void rule__Edge__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1235:1: ( ( ( '-' )* ) )
            // InternalDataflow.g:1236:1: ( ( '-' )* )
            {
            // InternalDataflow.g:1236:1: ( ( '-' )* )
            // InternalDataflow.g:1237:2: ( '-' )*
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_0_1()); 
            // InternalDataflow.g:1238:2: ( '-' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDataflow.g:1238:3: '-'
            	    {
            	    match(input,23,FOLLOW_14); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDataflow.g:1246:1: rule__Edge__Group_0__2 : rule__Edge__Group_0__2__Impl rule__Edge__Group_0__3 ;
    public final void rule__Edge__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1250:1: ( rule__Edge__Group_0__2__Impl rule__Edge__Group_0__3 )
            // InternalDataflow.g:1251:2: rule__Edge__Group_0__2__Impl rule__Edge__Group_0__3
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
    // InternalDataflow.g:1258:1: rule__Edge__Group_0__2__Impl : ( '->' ) ;
    public final void rule__Edge__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1262:1: ( ( '->' ) )
            // InternalDataflow.g:1263:1: ( '->' )
            {
            // InternalDataflow.g:1263:1: ( '->' )
            // InternalDataflow.g:1264:2: '->'
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusGreaterThanSignKeyword_0_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDataflow.g:1273:1: rule__Edge__Group_0__3 : rule__Edge__Group_0__3__Impl ;
    public final void rule__Edge__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1277:1: ( rule__Edge__Group_0__3__Impl )
            // InternalDataflow.g:1278:2: rule__Edge__Group_0__3__Impl
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
    // InternalDataflow.g:1284:1: rule__Edge__Group_0__3__Impl : ( ( rule__Edge__DstactAssignment_0_3 ) ) ;
    public final void rule__Edge__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1288:1: ( ( ( rule__Edge__DstactAssignment_0_3 ) ) )
            // InternalDataflow.g:1289:1: ( ( rule__Edge__DstactAssignment_0_3 ) )
            {
            // InternalDataflow.g:1289:1: ( ( rule__Edge__DstactAssignment_0_3 ) )
            // InternalDataflow.g:1290:2: ( rule__Edge__DstactAssignment_0_3 )
            {
             before(grammarAccess.getEdgeAccess().getDstactAssignment_0_3()); 
            // InternalDataflow.g:1291:2: ( rule__Edge__DstactAssignment_0_3 )
            // InternalDataflow.g:1291:3: rule__Edge__DstactAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Edge__DstactAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getDstactAssignment_0_3()); 

            }


            }

        }
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
    // InternalDataflow.g:1300:1: rule__Edge__Group_1__0 : rule__Edge__Group_1__0__Impl rule__Edge__Group_1__1 ;
    public final void rule__Edge__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1304:1: ( rule__Edge__Group_1__0__Impl rule__Edge__Group_1__1 )
            // InternalDataflow.g:1305:2: rule__Edge__Group_1__0__Impl rule__Edge__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDataflow.g:1312:1: rule__Edge__Group_1__0__Impl : ( ( rule__Edge__SrcactAssignment_1_0 ) ) ;
    public final void rule__Edge__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1316:1: ( ( ( rule__Edge__SrcactAssignment_1_0 ) ) )
            // InternalDataflow.g:1317:1: ( ( rule__Edge__SrcactAssignment_1_0 ) )
            {
            // InternalDataflow.g:1317:1: ( ( rule__Edge__SrcactAssignment_1_0 ) )
            // InternalDataflow.g:1318:2: ( rule__Edge__SrcactAssignment_1_0 )
            {
             before(grammarAccess.getEdgeAccess().getSrcactAssignment_1_0()); 
            // InternalDataflow.g:1319:2: ( rule__Edge__SrcactAssignment_1_0 )
            // InternalDataflow.g:1319:3: rule__Edge__SrcactAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__SrcactAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getSrcactAssignment_1_0()); 

            }


            }

        }
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
    // InternalDataflow.g:1327:1: rule__Edge__Group_1__1 : rule__Edge__Group_1__1__Impl rule__Edge__Group_1__2 ;
    public final void rule__Edge__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1331:1: ( rule__Edge__Group_1__1__Impl rule__Edge__Group_1__2 )
            // InternalDataflow.g:1332:2: rule__Edge__Group_1__1__Impl rule__Edge__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflow.g:1339:1: rule__Edge__Group_1__1__Impl : ( ( ( '-' ) ) ( ( '-' )* ) ) ;
    public final void rule__Edge__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1343:1: ( ( ( ( '-' ) ) ( ( '-' )* ) ) )
            // InternalDataflow.g:1344:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            {
            // InternalDataflow.g:1344:1: ( ( ( '-' ) ) ( ( '-' )* ) )
            // InternalDataflow.g:1345:2: ( ( '-' ) ) ( ( '-' )* )
            {
            // InternalDataflow.g:1345:2: ( ( '-' ) )
            // InternalDataflow.g:1346:3: ( '-' )
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_1()); 
            // InternalDataflow.g:1347:3: ( '-' )
            // InternalDataflow.g:1347:4: '-'
            {
            match(input,23,FOLLOW_14); 

            }

             after(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_1()); 

            }

            // InternalDataflow.g:1350:2: ( ( '-' )* )
            // InternalDataflow.g:1351:3: ( '-' )*
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_1()); 
            // InternalDataflow.g:1352:3: ( '-' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDataflow.g:1352:4: '-'
            	    {
            	    match(input,23,FOLLOW_14); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDataflow.g:1361:1: rule__Edge__Group_1__2 : rule__Edge__Group_1__2__Impl rule__Edge__Group_1__3 ;
    public final void rule__Edge__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1365:1: ( rule__Edge__Group_1__2__Impl rule__Edge__Group_1__3 )
            // InternalDataflow.g:1366:2: rule__Edge__Group_1__2__Impl rule__Edge__Group_1__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflow.g:1373:1: rule__Edge__Group_1__2__Impl : ( ( rule__Edge__SpecsAssignment_1_2 ) ) ;
    public final void rule__Edge__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1377:1: ( ( ( rule__Edge__SpecsAssignment_1_2 ) ) )
            // InternalDataflow.g:1378:1: ( ( rule__Edge__SpecsAssignment_1_2 ) )
            {
            // InternalDataflow.g:1378:1: ( ( rule__Edge__SpecsAssignment_1_2 ) )
            // InternalDataflow.g:1379:2: ( rule__Edge__SpecsAssignment_1_2 )
            {
             before(grammarAccess.getEdgeAccess().getSpecsAssignment_1_2()); 
            // InternalDataflow.g:1380:2: ( rule__Edge__SpecsAssignment_1_2 )
            // InternalDataflow.g:1380:3: rule__Edge__SpecsAssignment_1_2
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
    // InternalDataflow.g:1388:1: rule__Edge__Group_1__3 : rule__Edge__Group_1__3__Impl rule__Edge__Group_1__4 ;
    public final void rule__Edge__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1392:1: ( rule__Edge__Group_1__3__Impl rule__Edge__Group_1__4 )
            // InternalDataflow.g:1393:2: rule__Edge__Group_1__3__Impl rule__Edge__Group_1__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataflow.g:1400:1: rule__Edge__Group_1__3__Impl : ( ( '-' )* ) ;
    public final void rule__Edge__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1404:1: ( ( ( '-' )* ) )
            // InternalDataflow.g:1405:1: ( ( '-' )* )
            {
            // InternalDataflow.g:1405:1: ( ( '-' )* )
            // InternalDataflow.g:1406:2: ( '-' )*
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusKeyword_1_3()); 
            // InternalDataflow.g:1407:2: ( '-' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataflow.g:1407:3: '-'
            	    {
            	    match(input,23,FOLLOW_14); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDataflow.g:1415:1: rule__Edge__Group_1__4 : rule__Edge__Group_1__4__Impl rule__Edge__Group_1__5 ;
    public final void rule__Edge__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1419:1: ( rule__Edge__Group_1__4__Impl rule__Edge__Group_1__5 )
            // InternalDataflow.g:1420:2: rule__Edge__Group_1__4__Impl rule__Edge__Group_1__5
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
    // InternalDataflow.g:1427:1: rule__Edge__Group_1__4__Impl : ( '->' ) ;
    public final void rule__Edge__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1431:1: ( ( '->' ) )
            // InternalDataflow.g:1432:1: ( '->' )
            {
            // InternalDataflow.g:1432:1: ( '->' )
            // InternalDataflow.g:1433:2: '->'
            {
             before(grammarAccess.getEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDataflow.g:1442:1: rule__Edge__Group_1__5 : rule__Edge__Group_1__5__Impl ;
    public final void rule__Edge__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1446:1: ( rule__Edge__Group_1__5__Impl )
            // InternalDataflow.g:1447:2: rule__Edge__Group_1__5__Impl
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
    // InternalDataflow.g:1453:1: rule__Edge__Group_1__5__Impl : ( ( rule__Edge__DstactAssignment_1_5 ) ) ;
    public final void rule__Edge__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1457:1: ( ( ( rule__Edge__DstactAssignment_1_5 ) ) )
            // InternalDataflow.g:1458:1: ( ( rule__Edge__DstactAssignment_1_5 ) )
            {
            // InternalDataflow.g:1458:1: ( ( rule__Edge__DstactAssignment_1_5 ) )
            // InternalDataflow.g:1459:2: ( rule__Edge__DstactAssignment_1_5 )
            {
             before(grammarAccess.getEdgeAccess().getDstactAssignment_1_5()); 
            // InternalDataflow.g:1460:2: ( rule__Edge__DstactAssignment_1_5 )
            // InternalDataflow.g:1460:3: rule__Edge__DstactAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Edge__DstactAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getDstactAssignment_1_5()); 

            }


            }

        }
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
    // InternalDataflow.g:1469:1: rule__EdgeSpecs__Group__0 : rule__EdgeSpecs__Group__0__Impl rule__EdgeSpecs__Group__1 ;
    public final void rule__EdgeSpecs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1473:1: ( rule__EdgeSpecs__Group__0__Impl rule__EdgeSpecs__Group__1 )
            // InternalDataflow.g:1474:2: rule__EdgeSpecs__Group__0__Impl rule__EdgeSpecs__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflow.g:1481:1: rule__EdgeSpecs__Group__0__Impl : ( () ) ;
    public final void rule__EdgeSpecs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1485:1: ( ( () ) )
            // InternalDataflow.g:1486:1: ( () )
            {
            // InternalDataflow.g:1486:1: ( () )
            // InternalDataflow.g:1487:2: ()
            {
             before(grammarAccess.getEdgeSpecsAccess().getEdgeSpecsAction_0()); 
            // InternalDataflow.g:1488:2: ()
            // InternalDataflow.g:1488:3: 
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
    // InternalDataflow.g:1496:1: rule__EdgeSpecs__Group__1 : rule__EdgeSpecs__Group__1__Impl rule__EdgeSpecs__Group__2 ;
    public final void rule__EdgeSpecs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1500:1: ( rule__EdgeSpecs__Group__1__Impl rule__EdgeSpecs__Group__2 )
            // InternalDataflow.g:1501:2: rule__EdgeSpecs__Group__1__Impl rule__EdgeSpecs__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataflow.g:1508:1: rule__EdgeSpecs__Group__1__Impl : ( ( rule__EdgeSpecs__AnnotationsAssignment_1 ) ) ;
    public final void rule__EdgeSpecs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1512:1: ( ( ( rule__EdgeSpecs__AnnotationsAssignment_1 ) ) )
            // InternalDataflow.g:1513:1: ( ( rule__EdgeSpecs__AnnotationsAssignment_1 ) )
            {
            // InternalDataflow.g:1513:1: ( ( rule__EdgeSpecs__AnnotationsAssignment_1 ) )
            // InternalDataflow.g:1514:2: ( rule__EdgeSpecs__AnnotationsAssignment_1 )
            {
             before(grammarAccess.getEdgeSpecsAccess().getAnnotationsAssignment_1()); 
            // InternalDataflow.g:1515:2: ( rule__EdgeSpecs__AnnotationsAssignment_1 )
            // InternalDataflow.g:1515:3: rule__EdgeSpecs__AnnotationsAssignment_1
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
    // InternalDataflow.g:1523:1: rule__EdgeSpecs__Group__2 : rule__EdgeSpecs__Group__2__Impl ;
    public final void rule__EdgeSpecs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1527:1: ( rule__EdgeSpecs__Group__2__Impl )
            // InternalDataflow.g:1528:2: rule__EdgeSpecs__Group__2__Impl
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
    // InternalDataflow.g:1534:1: rule__EdgeSpecs__Group__2__Impl : ( ( rule__EdgeSpecs__Group_2__0 )* ) ;
    public final void rule__EdgeSpecs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1538:1: ( ( ( rule__EdgeSpecs__Group_2__0 )* ) )
            // InternalDataflow.g:1539:1: ( ( rule__EdgeSpecs__Group_2__0 )* )
            {
            // InternalDataflow.g:1539:1: ( ( rule__EdgeSpecs__Group_2__0 )* )
            // InternalDataflow.g:1540:2: ( rule__EdgeSpecs__Group_2__0 )*
            {
             before(grammarAccess.getEdgeSpecsAccess().getGroup_2()); 
            // InternalDataflow.g:1541:2: ( rule__EdgeSpecs__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDataflow.g:1541:3: rule__EdgeSpecs__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__EdgeSpecs__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDataflow.g:1550:1: rule__EdgeSpecs__Group_2__0 : rule__EdgeSpecs__Group_2__0__Impl rule__EdgeSpecs__Group_2__1 ;
    public final void rule__EdgeSpecs__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1554:1: ( rule__EdgeSpecs__Group_2__0__Impl rule__EdgeSpecs__Group_2__1 )
            // InternalDataflow.g:1555:2: rule__EdgeSpecs__Group_2__0__Impl rule__EdgeSpecs__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataflow.g:1562:1: rule__EdgeSpecs__Group_2__0__Impl : ( ';' ) ;
    public final void rule__EdgeSpecs__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1566:1: ( ( ';' ) )
            // InternalDataflow.g:1567:1: ( ';' )
            {
            // InternalDataflow.g:1567:1: ( ';' )
            // InternalDataflow.g:1568:2: ';'
            {
             before(grammarAccess.getEdgeSpecsAccess().getSemicolonKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDataflow.g:1577:1: rule__EdgeSpecs__Group_2__1 : rule__EdgeSpecs__Group_2__1__Impl ;
    public final void rule__EdgeSpecs__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1581:1: ( rule__EdgeSpecs__Group_2__1__Impl )
            // InternalDataflow.g:1582:2: rule__EdgeSpecs__Group_2__1__Impl
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
    // InternalDataflow.g:1588:1: rule__EdgeSpecs__Group_2__1__Impl : ( ( rule__EdgeSpecs__AnnotationsAssignment_2_1 ) ) ;
    public final void rule__EdgeSpecs__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1592:1: ( ( ( rule__EdgeSpecs__AnnotationsAssignment_2_1 ) ) )
            // InternalDataflow.g:1593:1: ( ( rule__EdgeSpecs__AnnotationsAssignment_2_1 ) )
            {
            // InternalDataflow.g:1593:1: ( ( rule__EdgeSpecs__AnnotationsAssignment_2_1 ) )
            // InternalDataflow.g:1594:2: ( rule__EdgeSpecs__AnnotationsAssignment_2_1 )
            {
             before(grammarAccess.getEdgeSpecsAccess().getAnnotationsAssignment_2_1()); 
            // InternalDataflow.g:1595:2: ( rule__EdgeSpecs__AnnotationsAssignment_2_1 )
            // InternalDataflow.g:1595:3: rule__EdgeSpecs__AnnotationsAssignment_2_1
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
    // InternalDataflow.g:1604:1: rule__EdgeAnnotation__Group_0__0 : rule__EdgeAnnotation__Group_0__0__Impl rule__EdgeAnnotation__Group_0__1 ;
    public final void rule__EdgeAnnotation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1608:1: ( rule__EdgeAnnotation__Group_0__0__Impl rule__EdgeAnnotation__Group_0__1 )
            // InternalDataflow.g:1609:2: rule__EdgeAnnotation__Group_0__0__Impl rule__EdgeAnnotation__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDataflow.g:1616:1: rule__EdgeAnnotation__Group_0__0__Impl : ( ( rule__EdgeAnnotation__Group_0_0__0 )? ) ;
    public final void rule__EdgeAnnotation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1620:1: ( ( ( rule__EdgeAnnotation__Group_0_0__0 )? ) )
            // InternalDataflow.g:1621:1: ( ( rule__EdgeAnnotation__Group_0_0__0 )? )
            {
            // InternalDataflow.g:1621:1: ( ( rule__EdgeAnnotation__Group_0_0__0 )? )
            // InternalDataflow.g:1622:2: ( rule__EdgeAnnotation__Group_0_0__0 )?
            {
             before(grammarAccess.getEdgeAnnotationAccess().getGroup_0_0()); 
            // InternalDataflow.g:1623:2: ( rule__EdgeAnnotation__Group_0_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataflow.g:1623:3: rule__EdgeAnnotation__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EdgeAnnotation__Group_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeAnnotationAccess().getGroup_0_0()); 

            }


            }

        }
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
    // InternalDataflow.g:1631:1: rule__EdgeAnnotation__Group_0__1 : rule__EdgeAnnotation__Group_0__1__Impl ;
    public final void rule__EdgeAnnotation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1635:1: ( rule__EdgeAnnotation__Group_0__1__Impl )
            // InternalDataflow.g:1636:2: rule__EdgeAnnotation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_0__1__Impl();

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
    // InternalDataflow.g:1642:1: rule__EdgeAnnotation__Group_0__1__Impl : ( ( rule__EdgeAnnotation__InitialtokensAssignment_0_1 ) ) ;
    public final void rule__EdgeAnnotation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1646:1: ( ( ( rule__EdgeAnnotation__InitialtokensAssignment_0_1 ) ) )
            // InternalDataflow.g:1647:1: ( ( rule__EdgeAnnotation__InitialtokensAssignment_0_1 ) )
            {
            // InternalDataflow.g:1647:1: ( ( rule__EdgeAnnotation__InitialtokensAssignment_0_1 ) )
            // InternalDataflow.g:1648:2: ( rule__EdgeAnnotation__InitialtokensAssignment_0_1 )
            {
             before(grammarAccess.getEdgeAnnotationAccess().getInitialtokensAssignment_0_1()); 
            // InternalDataflow.g:1649:2: ( rule__EdgeAnnotation__InitialtokensAssignment_0_1 )
            // InternalDataflow.g:1649:3: rule__EdgeAnnotation__InitialtokensAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__InitialtokensAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAnnotationAccess().getInitialtokensAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EdgeAnnotation__Group_0_0__0"
    // InternalDataflow.g:1658:1: rule__EdgeAnnotation__Group_0_0__0 : rule__EdgeAnnotation__Group_0_0__0__Impl rule__EdgeAnnotation__Group_0_0__1 ;
    public final void rule__EdgeAnnotation__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1662:1: ( rule__EdgeAnnotation__Group_0_0__0__Impl rule__EdgeAnnotation__Group_0_0__1 )
            // InternalDataflow.g:1663:2: rule__EdgeAnnotation__Group_0_0__0__Impl rule__EdgeAnnotation__Group_0_0__1
            {
            pushFollow(FOLLOW_20);
            rule__EdgeAnnotation__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_0_0__1();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0_0__0"


    // $ANTLR start "rule__EdgeAnnotation__Group_0_0__0__Impl"
    // InternalDataflow.g:1670:1: rule__EdgeAnnotation__Group_0_0__0__Impl : ( 'initial' ) ;
    public final void rule__EdgeAnnotation__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1674:1: ( ( 'initial' ) )
            // InternalDataflow.g:1675:1: ( 'initial' )
            {
            // InternalDataflow.g:1675:1: ( 'initial' )
            // InternalDataflow.g:1676:2: 'initial'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getInitialKeyword_0_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getInitialKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_0_0__0__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_0_0__1"
    // InternalDataflow.g:1685:1: rule__EdgeAnnotation__Group_0_0__1 : rule__EdgeAnnotation__Group_0_0__1__Impl rule__EdgeAnnotation__Group_0_0__2 ;
    public final void rule__EdgeAnnotation__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1689:1: ( rule__EdgeAnnotation__Group_0_0__1__Impl rule__EdgeAnnotation__Group_0_0__2 )
            // InternalDataflow.g:1690:2: rule__EdgeAnnotation__Group_0_0__1__Impl rule__EdgeAnnotation__Group_0_0__2
            {
            pushFollow(FOLLOW_21);
            rule__EdgeAnnotation__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_0_0__2();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0_0__1"


    // $ANTLR start "rule__EdgeAnnotation__Group_0_0__1__Impl"
    // InternalDataflow.g:1697:1: rule__EdgeAnnotation__Group_0_0__1__Impl : ( 'tokens' ) ;
    public final void rule__EdgeAnnotation__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1701:1: ( ( 'tokens' ) )
            // InternalDataflow.g:1702:1: ( 'tokens' )
            {
            // InternalDataflow.g:1702:1: ( 'tokens' )
            // InternalDataflow.g:1703:2: 'tokens'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getTokensKeyword_0_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getTokensKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_0_0__1__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_0_0__2"
    // InternalDataflow.g:1712:1: rule__EdgeAnnotation__Group_0_0__2 : rule__EdgeAnnotation__Group_0_0__2__Impl ;
    public final void rule__EdgeAnnotation__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1716:1: ( rule__EdgeAnnotation__Group_0_0__2__Impl )
            // InternalDataflow.g:1717:2: rule__EdgeAnnotation__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_0_0__2__Impl();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_0_0__2"


    // $ANTLR start "rule__EdgeAnnotation__Group_0_0__2__Impl"
    // InternalDataflow.g:1723:1: rule__EdgeAnnotation__Group_0_0__2__Impl : ( ':' ) ;
    public final void rule__EdgeAnnotation__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1727:1: ( ( ':' ) )
            // InternalDataflow.g:1728:1: ( ':' )
            {
            // InternalDataflow.g:1728:1: ( ':' )
            // InternalDataflow.g:1729:2: ':'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_0_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_0_0__2__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_1__0"
    // InternalDataflow.g:1739:1: rule__EdgeAnnotation__Group_1__0 : rule__EdgeAnnotation__Group_1__0__Impl rule__EdgeAnnotation__Group_1__1 ;
    public final void rule__EdgeAnnotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1743:1: ( rule__EdgeAnnotation__Group_1__0__Impl rule__EdgeAnnotation__Group_1__1 )
            // InternalDataflow.g:1744:2: rule__EdgeAnnotation__Group_1__0__Impl rule__EdgeAnnotation__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__EdgeAnnotation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_1__1();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_1__0"


    // $ANTLR start "rule__EdgeAnnotation__Group_1__0__Impl"
    // InternalDataflow.g:1751:1: rule__EdgeAnnotation__Group_1__0__Impl : ( 'production' ) ;
    public final void rule__EdgeAnnotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1755:1: ( ( 'production' ) )
            // InternalDataflow.g:1756:1: ( 'production' )
            {
            // InternalDataflow.g:1756:1: ( 'production' )
            // InternalDataflow.g:1757:2: 'production'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getProductionKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getProductionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_1__0__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_1__1"
    // InternalDataflow.g:1766:1: rule__EdgeAnnotation__Group_1__1 : rule__EdgeAnnotation__Group_1__1__Impl rule__EdgeAnnotation__Group_1__2 ;
    public final void rule__EdgeAnnotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1770:1: ( rule__EdgeAnnotation__Group_1__1__Impl rule__EdgeAnnotation__Group_1__2 )
            // InternalDataflow.g:1771:2: rule__EdgeAnnotation__Group_1__1__Impl rule__EdgeAnnotation__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__EdgeAnnotation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_1__2();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_1__1"


    // $ANTLR start "rule__EdgeAnnotation__Group_1__1__Impl"
    // InternalDataflow.g:1778:1: rule__EdgeAnnotation__Group_1__1__Impl : ( 'rate' ) ;
    public final void rule__EdgeAnnotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1782:1: ( ( 'rate' ) )
            // InternalDataflow.g:1783:1: ( 'rate' )
            {
            // InternalDataflow.g:1783:1: ( 'rate' )
            // InternalDataflow.g:1784:2: 'rate'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getRateKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getRateKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_1__1__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_1__2"
    // InternalDataflow.g:1793:1: rule__EdgeAnnotation__Group_1__2 : rule__EdgeAnnotation__Group_1__2__Impl rule__EdgeAnnotation__Group_1__3 ;
    public final void rule__EdgeAnnotation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1797:1: ( rule__EdgeAnnotation__Group_1__2__Impl rule__EdgeAnnotation__Group_1__3 )
            // InternalDataflow.g:1798:2: rule__EdgeAnnotation__Group_1__2__Impl rule__EdgeAnnotation__Group_1__3
            {
            pushFollow(FOLLOW_23);
            rule__EdgeAnnotation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_1__3();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_1__2"


    // $ANTLR start "rule__EdgeAnnotation__Group_1__2__Impl"
    // InternalDataflow.g:1805:1: rule__EdgeAnnotation__Group_1__2__Impl : ( ':' ) ;
    public final void rule__EdgeAnnotation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1809:1: ( ( ':' ) )
            // InternalDataflow.g:1810:1: ( ':' )
            {
            // InternalDataflow.g:1810:1: ( ':' )
            // InternalDataflow.g:1811:2: ':'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_1_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_1__2__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_1__3"
    // InternalDataflow.g:1820:1: rule__EdgeAnnotation__Group_1__3 : rule__EdgeAnnotation__Group_1__3__Impl ;
    public final void rule__EdgeAnnotation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1824:1: ( rule__EdgeAnnotation__Group_1__3__Impl )
            // InternalDataflow.g:1825:2: rule__EdgeAnnotation__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_1__3__Impl();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_1__3"


    // $ANTLR start "rule__EdgeAnnotation__Group_1__3__Impl"
    // InternalDataflow.g:1831:1: rule__EdgeAnnotation__Group_1__3__Impl : ( ( rule__EdgeAnnotation__ProdrateAssignment_1_3 ) ) ;
    public final void rule__EdgeAnnotation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1835:1: ( ( ( rule__EdgeAnnotation__ProdrateAssignment_1_3 ) ) )
            // InternalDataflow.g:1836:1: ( ( rule__EdgeAnnotation__ProdrateAssignment_1_3 ) )
            {
            // InternalDataflow.g:1836:1: ( ( rule__EdgeAnnotation__ProdrateAssignment_1_3 ) )
            // InternalDataflow.g:1837:2: ( rule__EdgeAnnotation__ProdrateAssignment_1_3 )
            {
             before(grammarAccess.getEdgeAnnotationAccess().getProdrateAssignment_1_3()); 
            // InternalDataflow.g:1838:2: ( rule__EdgeAnnotation__ProdrateAssignment_1_3 )
            // InternalDataflow.g:1838:3: rule__EdgeAnnotation__ProdrateAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__ProdrateAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAnnotationAccess().getProdrateAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_1__3__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_2__0"
    // InternalDataflow.g:1847:1: rule__EdgeAnnotation__Group_2__0 : rule__EdgeAnnotation__Group_2__0__Impl rule__EdgeAnnotation__Group_2__1 ;
    public final void rule__EdgeAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1851:1: ( rule__EdgeAnnotation__Group_2__0__Impl rule__EdgeAnnotation__Group_2__1 )
            // InternalDataflow.g:1852:2: rule__EdgeAnnotation__Group_2__0__Impl rule__EdgeAnnotation__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__EdgeAnnotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_2__1();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_2__0"


    // $ANTLR start "rule__EdgeAnnotation__Group_2__0__Impl"
    // InternalDataflow.g:1859:1: rule__EdgeAnnotation__Group_2__0__Impl : ( 'consumption' ) ;
    public final void rule__EdgeAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1863:1: ( ( 'consumption' ) )
            // InternalDataflow.g:1864:1: ( 'consumption' )
            {
            // InternalDataflow.g:1864:1: ( 'consumption' )
            // InternalDataflow.g:1865:2: 'consumption'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getConsumptionKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getConsumptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_2__0__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_2__1"
    // InternalDataflow.g:1874:1: rule__EdgeAnnotation__Group_2__1 : rule__EdgeAnnotation__Group_2__1__Impl rule__EdgeAnnotation__Group_2__2 ;
    public final void rule__EdgeAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1878:1: ( rule__EdgeAnnotation__Group_2__1__Impl rule__EdgeAnnotation__Group_2__2 )
            // InternalDataflow.g:1879:2: rule__EdgeAnnotation__Group_2__1__Impl rule__EdgeAnnotation__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__EdgeAnnotation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_2__2();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_2__1"


    // $ANTLR start "rule__EdgeAnnotation__Group_2__1__Impl"
    // InternalDataflow.g:1886:1: rule__EdgeAnnotation__Group_2__1__Impl : ( 'rate' ) ;
    public final void rule__EdgeAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1890:1: ( ( 'rate' ) )
            // InternalDataflow.g:1891:1: ( 'rate' )
            {
            // InternalDataflow.g:1891:1: ( 'rate' )
            // InternalDataflow.g:1892:2: 'rate'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getRateKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getRateKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_2__1__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_2__2"
    // InternalDataflow.g:1901:1: rule__EdgeAnnotation__Group_2__2 : rule__EdgeAnnotation__Group_2__2__Impl rule__EdgeAnnotation__Group_2__3 ;
    public final void rule__EdgeAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1905:1: ( rule__EdgeAnnotation__Group_2__2__Impl rule__EdgeAnnotation__Group_2__3 )
            // InternalDataflow.g:1906:2: rule__EdgeAnnotation__Group_2__2__Impl rule__EdgeAnnotation__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__EdgeAnnotation__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_2__3();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_2__2"


    // $ANTLR start "rule__EdgeAnnotation__Group_2__2__Impl"
    // InternalDataflow.g:1913:1: rule__EdgeAnnotation__Group_2__2__Impl : ( ':' ) ;
    public final void rule__EdgeAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1917:1: ( ( ':' ) )
            // InternalDataflow.g:1918:1: ( ':' )
            {
            // InternalDataflow.g:1918:1: ( ':' )
            // InternalDataflow.g:1919:2: ':'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_2_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_2__2__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_2__3"
    // InternalDataflow.g:1928:1: rule__EdgeAnnotation__Group_2__3 : rule__EdgeAnnotation__Group_2__3__Impl ;
    public final void rule__EdgeAnnotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1932:1: ( rule__EdgeAnnotation__Group_2__3__Impl )
            // InternalDataflow.g:1933:2: rule__EdgeAnnotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_2__3__Impl();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_2__3"


    // $ANTLR start "rule__EdgeAnnotation__Group_2__3__Impl"
    // InternalDataflow.g:1939:1: rule__EdgeAnnotation__Group_2__3__Impl : ( ( rule__EdgeAnnotation__ConsrateAssignment_2_3 ) ) ;
    public final void rule__EdgeAnnotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1943:1: ( ( ( rule__EdgeAnnotation__ConsrateAssignment_2_3 ) ) )
            // InternalDataflow.g:1944:1: ( ( rule__EdgeAnnotation__ConsrateAssignment_2_3 ) )
            {
            // InternalDataflow.g:1944:1: ( ( rule__EdgeAnnotation__ConsrateAssignment_2_3 ) )
            // InternalDataflow.g:1945:2: ( rule__EdgeAnnotation__ConsrateAssignment_2_3 )
            {
             before(grammarAccess.getEdgeAnnotationAccess().getConsrateAssignment_2_3()); 
            // InternalDataflow.g:1946:2: ( rule__EdgeAnnotation__ConsrateAssignment_2_3 )
            // InternalDataflow.g:1946:3: rule__EdgeAnnotation__ConsrateAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__ConsrateAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAnnotationAccess().getConsrateAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_2__3__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_3__0"
    // InternalDataflow.g:1955:1: rule__EdgeAnnotation__Group_3__0 : rule__EdgeAnnotation__Group_3__0__Impl rule__EdgeAnnotation__Group_3__1 ;
    public final void rule__EdgeAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1959:1: ( rule__EdgeAnnotation__Group_3__0__Impl rule__EdgeAnnotation__Group_3__1 )
            // InternalDataflow.g:1960:2: rule__EdgeAnnotation__Group_3__0__Impl rule__EdgeAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__EdgeAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_3__1();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_3__0"


    // $ANTLR start "rule__EdgeAnnotation__Group_3__0__Impl"
    // InternalDataflow.g:1967:1: rule__EdgeAnnotation__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__EdgeAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1971:1: ( ( 'name' ) )
            // InternalDataflow.g:1972:1: ( 'name' )
            {
            // InternalDataflow.g:1972:1: ( 'name' )
            // InternalDataflow.g:1973:2: 'name'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_3__1"
    // InternalDataflow.g:1982:1: rule__EdgeAnnotation__Group_3__1 : rule__EdgeAnnotation__Group_3__1__Impl rule__EdgeAnnotation__Group_3__2 ;
    public final void rule__EdgeAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1986:1: ( rule__EdgeAnnotation__Group_3__1__Impl rule__EdgeAnnotation__Group_3__2 )
            // InternalDataflow.g:1987:2: rule__EdgeAnnotation__Group_3__1__Impl rule__EdgeAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__EdgeAnnotation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_3__2();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_3__1"


    // $ANTLR start "rule__EdgeAnnotation__Group_3__1__Impl"
    // InternalDataflow.g:1994:1: rule__EdgeAnnotation__Group_3__1__Impl : ( ':' ) ;
    public final void rule__EdgeAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:1998:1: ( ( ':' ) )
            // InternalDataflow.g:1999:1: ( ':' )
            {
            // InternalDataflow.g:1999:1: ( ':' )
            // InternalDataflow.g:2000:2: ':'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_3_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_3__2"
    // InternalDataflow.g:2009:1: rule__EdgeAnnotation__Group_3__2 : rule__EdgeAnnotation__Group_3__2__Impl ;
    public final void rule__EdgeAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2013:1: ( rule__EdgeAnnotation__Group_3__2__Impl )
            // InternalDataflow.g:2014:2: rule__EdgeAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_3__2__Impl();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_3__2"


    // $ANTLR start "rule__EdgeAnnotation__Group_3__2__Impl"
    // InternalDataflow.g:2020:1: rule__EdgeAnnotation__Group_3__2__Impl : ( ( rule__EdgeAnnotation__NameAssignment_3_2 ) ) ;
    public final void rule__EdgeAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2024:1: ( ( ( rule__EdgeAnnotation__NameAssignment_3_2 ) ) )
            // InternalDataflow.g:2025:1: ( ( rule__EdgeAnnotation__NameAssignment_3_2 ) )
            {
            // InternalDataflow.g:2025:1: ( ( rule__EdgeAnnotation__NameAssignment_3_2 ) )
            // InternalDataflow.g:2026:2: ( rule__EdgeAnnotation__NameAssignment_3_2 )
            {
             before(grammarAccess.getEdgeAnnotationAccess().getNameAssignment_3_2()); 
            // InternalDataflow.g:2027:2: ( rule__EdgeAnnotation__NameAssignment_3_2 )
            // InternalDataflow.g:2027:3: rule__EdgeAnnotation__NameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__NameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAnnotationAccess().getNameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_4__0"
    // InternalDataflow.g:2036:1: rule__EdgeAnnotation__Group_4__0 : rule__EdgeAnnotation__Group_4__0__Impl rule__EdgeAnnotation__Group_4__1 ;
    public final void rule__EdgeAnnotation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2040:1: ( rule__EdgeAnnotation__Group_4__0__Impl rule__EdgeAnnotation__Group_4__1 )
            // InternalDataflow.g:2041:2: rule__EdgeAnnotation__Group_4__0__Impl rule__EdgeAnnotation__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__EdgeAnnotation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_4__1();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_4__0"


    // $ANTLR start "rule__EdgeAnnotation__Group_4__0__Impl"
    // InternalDataflow.g:2048:1: rule__EdgeAnnotation__Group_4__0__Impl : ( 'token' ) ;
    public final void rule__EdgeAnnotation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2052:1: ( ( 'token' ) )
            // InternalDataflow.g:2053:1: ( 'token' )
            {
            // InternalDataflow.g:2053:1: ( 'token' )
            // InternalDataflow.g:2054:2: 'token'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getTokenKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getTokenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_4__0__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_4__1"
    // InternalDataflow.g:2063:1: rule__EdgeAnnotation__Group_4__1 : rule__EdgeAnnotation__Group_4__1__Impl rule__EdgeAnnotation__Group_4__2 ;
    public final void rule__EdgeAnnotation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2067:1: ( rule__EdgeAnnotation__Group_4__1__Impl rule__EdgeAnnotation__Group_4__2 )
            // InternalDataflow.g:2068:2: rule__EdgeAnnotation__Group_4__1__Impl rule__EdgeAnnotation__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__EdgeAnnotation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_4__2();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_4__1"


    // $ANTLR start "rule__EdgeAnnotation__Group_4__1__Impl"
    // InternalDataflow.g:2075:1: rule__EdgeAnnotation__Group_4__1__Impl : ( 'size' ) ;
    public final void rule__EdgeAnnotation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2079:1: ( ( 'size' ) )
            // InternalDataflow.g:2080:1: ( 'size' )
            {
            // InternalDataflow.g:2080:1: ( 'size' )
            // InternalDataflow.g:2081:2: 'size'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getSizeKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getSizeKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_4__1__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_4__2"
    // InternalDataflow.g:2090:1: rule__EdgeAnnotation__Group_4__2 : rule__EdgeAnnotation__Group_4__2__Impl rule__EdgeAnnotation__Group_4__3 ;
    public final void rule__EdgeAnnotation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2094:1: ( rule__EdgeAnnotation__Group_4__2__Impl rule__EdgeAnnotation__Group_4__3 )
            // InternalDataflow.g:2095:2: rule__EdgeAnnotation__Group_4__2__Impl rule__EdgeAnnotation__Group_4__3
            {
            pushFollow(FOLLOW_23);
            rule__EdgeAnnotation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_4__3();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_4__2"


    // $ANTLR start "rule__EdgeAnnotation__Group_4__2__Impl"
    // InternalDataflow.g:2102:1: rule__EdgeAnnotation__Group_4__2__Impl : ( ':' ) ;
    public final void rule__EdgeAnnotation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2106:1: ( ( ':' ) )
            // InternalDataflow.g:2107:1: ( ':' )
            {
            // InternalDataflow.g:2107:1: ( ':' )
            // InternalDataflow.g:2108:2: ':'
            {
             before(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_4_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getColonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_4__2__Impl"


    // $ANTLR start "rule__EdgeAnnotation__Group_4__3"
    // InternalDataflow.g:2117:1: rule__EdgeAnnotation__Group_4__3 : rule__EdgeAnnotation__Group_4__3__Impl ;
    public final void rule__EdgeAnnotation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2121:1: ( rule__EdgeAnnotation__Group_4__3__Impl )
            // InternalDataflow.g:2122:2: rule__EdgeAnnotation__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__Group_4__3__Impl();

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
    // $ANTLR end "rule__EdgeAnnotation__Group_4__3"


    // $ANTLR start "rule__EdgeAnnotation__Group_4__3__Impl"
    // InternalDataflow.g:2128:1: rule__EdgeAnnotation__Group_4__3__Impl : ( ( rule__EdgeAnnotation__TokensizeAssignment_4_3 ) ) ;
    public final void rule__EdgeAnnotation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2132:1: ( ( ( rule__EdgeAnnotation__TokensizeAssignment_4_3 ) ) )
            // InternalDataflow.g:2133:1: ( ( rule__EdgeAnnotation__TokensizeAssignment_4_3 ) )
            {
            // InternalDataflow.g:2133:1: ( ( rule__EdgeAnnotation__TokensizeAssignment_4_3 ) )
            // InternalDataflow.g:2134:2: ( rule__EdgeAnnotation__TokensizeAssignment_4_3 )
            {
             before(grammarAccess.getEdgeAnnotationAccess().getTokensizeAssignment_4_3()); 
            // InternalDataflow.g:2135:2: ( rule__EdgeAnnotation__TokensizeAssignment_4_3 )
            // InternalDataflow.g:2135:3: rule__EdgeAnnotation__TokensizeAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__EdgeAnnotation__TokensizeAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAnnotationAccess().getTokensizeAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__Group_4__3__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalDataflow.g:2144:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2148:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalDataflow.g:2149:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

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
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalDataflow.g:2156:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__NameAssignment_0 ) ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2160:1: ( ( ( rule__Actor__NameAssignment_0 ) ) )
            // InternalDataflow.g:2161:1: ( ( rule__Actor__NameAssignment_0 ) )
            {
            // InternalDataflow.g:2161:1: ( ( rule__Actor__NameAssignment_0 ) )
            // InternalDataflow.g:2162:2: ( rule__Actor__NameAssignment_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_0()); 
            // InternalDataflow.g:2163:2: ( rule__Actor__NameAssignment_0 )
            // InternalDataflow.g:2163:3: rule__Actor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalDataflow.g:2171:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2175:1: ( rule__Actor__Group__1__Impl )
            // InternalDataflow.g:2176:2: rule__Actor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__1__Impl();

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
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalDataflow.g:2182:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__SpecsAssignment_1 )? ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2186:1: ( ( ( rule__Actor__SpecsAssignment_1 )? ) )
            // InternalDataflow.g:2187:1: ( ( rule__Actor__SpecsAssignment_1 )? )
            {
            // InternalDataflow.g:2187:1: ( ( rule__Actor__SpecsAssignment_1 )? )
            // InternalDataflow.g:2188:2: ( rule__Actor__SpecsAssignment_1 )?
            {
             before(grammarAccess.getActorAccess().getSpecsAssignment_1()); 
            // InternalDataflow.g:2189:2: ( rule__Actor__SpecsAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataflow.g:2189:3: rule__Actor__SpecsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__SpecsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getSpecsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__ActorSpecs__Group__0"
    // InternalDataflow.g:2198:1: rule__ActorSpecs__Group__0 : rule__ActorSpecs__Group__0__Impl rule__ActorSpecs__Group__1 ;
    public final void rule__ActorSpecs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2202:1: ( rule__ActorSpecs__Group__0__Impl rule__ActorSpecs__Group__1 )
            // InternalDataflow.g:2203:2: rule__ActorSpecs__Group__0__Impl rule__ActorSpecs__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ActorSpecs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorSpecs__Group__1();

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
    // $ANTLR end "rule__ActorSpecs__Group__0"


    // $ANTLR start "rule__ActorSpecs__Group__0__Impl"
    // InternalDataflow.g:2210:1: rule__ActorSpecs__Group__0__Impl : ( () ) ;
    public final void rule__ActorSpecs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2214:1: ( ( () ) )
            // InternalDataflow.g:2215:1: ( () )
            {
            // InternalDataflow.g:2215:1: ( () )
            // InternalDataflow.g:2216:2: ()
            {
             before(grammarAccess.getActorSpecsAccess().getActorSpecsAction_0()); 
            // InternalDataflow.g:2217:2: ()
            // InternalDataflow.g:2217:3: 
            {
            }

             after(grammarAccess.getActorSpecsAccess().getActorSpecsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__Group__0__Impl"


    // $ANTLR start "rule__ActorSpecs__Group__1"
    // InternalDataflow.g:2225:1: rule__ActorSpecs__Group__1 : rule__ActorSpecs__Group__1__Impl rule__ActorSpecs__Group__2 ;
    public final void rule__ActorSpecs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2229:1: ( rule__ActorSpecs__Group__1__Impl rule__ActorSpecs__Group__2 )
            // InternalDataflow.g:2230:2: rule__ActorSpecs__Group__1__Impl rule__ActorSpecs__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ActorSpecs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorSpecs__Group__2();

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
    // $ANTLR end "rule__ActorSpecs__Group__1"


    // $ANTLR start "rule__ActorSpecs__Group__1__Impl"
    // InternalDataflow.g:2237:1: rule__ActorSpecs__Group__1__Impl : ( '[' ) ;
    public final void rule__ActorSpecs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2241:1: ( ( '[' ) )
            // InternalDataflow.g:2242:1: ( '[' )
            {
            // InternalDataflow.g:2242:1: ( '[' )
            // InternalDataflow.g:2243:2: '['
            {
             before(grammarAccess.getActorSpecsAccess().getLeftSquareBracketKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActorSpecsAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__Group__1__Impl"


    // $ANTLR start "rule__ActorSpecs__Group__2"
    // InternalDataflow.g:2252:1: rule__ActorSpecs__Group__2 : rule__ActorSpecs__Group__2__Impl rule__ActorSpecs__Group__3 ;
    public final void rule__ActorSpecs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2256:1: ( rule__ActorSpecs__Group__2__Impl rule__ActorSpecs__Group__3 )
            // InternalDataflow.g:2257:2: rule__ActorSpecs__Group__2__Impl rule__ActorSpecs__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ActorSpecs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorSpecs__Group__3();

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
    // $ANTLR end "rule__ActorSpecs__Group__2"


    // $ANTLR start "rule__ActorSpecs__Group__2__Impl"
    // InternalDataflow.g:2264:1: rule__ActorSpecs__Group__2__Impl : ( ( rule__ActorSpecs__AnnotationsAssignment_2 ) ) ;
    public final void rule__ActorSpecs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2268:1: ( ( ( rule__ActorSpecs__AnnotationsAssignment_2 ) ) )
            // InternalDataflow.g:2269:1: ( ( rule__ActorSpecs__AnnotationsAssignment_2 ) )
            {
            // InternalDataflow.g:2269:1: ( ( rule__ActorSpecs__AnnotationsAssignment_2 ) )
            // InternalDataflow.g:2270:2: ( rule__ActorSpecs__AnnotationsAssignment_2 )
            {
             before(grammarAccess.getActorSpecsAccess().getAnnotationsAssignment_2()); 
            // InternalDataflow.g:2271:2: ( rule__ActorSpecs__AnnotationsAssignment_2 )
            // InternalDataflow.g:2271:3: rule__ActorSpecs__AnnotationsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActorSpecs__AnnotationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActorSpecsAccess().getAnnotationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__Group__2__Impl"


    // $ANTLR start "rule__ActorSpecs__Group__3"
    // InternalDataflow.g:2279:1: rule__ActorSpecs__Group__3 : rule__ActorSpecs__Group__3__Impl rule__ActorSpecs__Group__4 ;
    public final void rule__ActorSpecs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2283:1: ( rule__ActorSpecs__Group__3__Impl rule__ActorSpecs__Group__4 )
            // InternalDataflow.g:2284:2: rule__ActorSpecs__Group__3__Impl rule__ActorSpecs__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__ActorSpecs__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorSpecs__Group__4();

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
    // $ANTLR end "rule__ActorSpecs__Group__3"


    // $ANTLR start "rule__ActorSpecs__Group__3__Impl"
    // InternalDataflow.g:2291:1: rule__ActorSpecs__Group__3__Impl : ( ( rule__ActorSpecs__Group_3__0 )* ) ;
    public final void rule__ActorSpecs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2295:1: ( ( ( rule__ActorSpecs__Group_3__0 )* ) )
            // InternalDataflow.g:2296:1: ( ( rule__ActorSpecs__Group_3__0 )* )
            {
            // InternalDataflow.g:2296:1: ( ( rule__ActorSpecs__Group_3__0 )* )
            // InternalDataflow.g:2297:2: ( rule__ActorSpecs__Group_3__0 )*
            {
             before(grammarAccess.getActorSpecsAccess().getGroup_3()); 
            // InternalDataflow.g:2298:2: ( rule__ActorSpecs__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDataflow.g:2298:3: rule__ActorSpecs__Group_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ActorSpecs__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getActorSpecsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__Group__3__Impl"


    // $ANTLR start "rule__ActorSpecs__Group__4"
    // InternalDataflow.g:2306:1: rule__ActorSpecs__Group__4 : rule__ActorSpecs__Group__4__Impl ;
    public final void rule__ActorSpecs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2310:1: ( rule__ActorSpecs__Group__4__Impl )
            // InternalDataflow.g:2311:2: rule__ActorSpecs__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorSpecs__Group__4__Impl();

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
    // $ANTLR end "rule__ActorSpecs__Group__4"


    // $ANTLR start "rule__ActorSpecs__Group__4__Impl"
    // InternalDataflow.g:2317:1: rule__ActorSpecs__Group__4__Impl : ( ']' ) ;
    public final void rule__ActorSpecs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2321:1: ( ( ']' ) )
            // InternalDataflow.g:2322:1: ( ']' )
            {
            // InternalDataflow.g:2322:1: ( ']' )
            // InternalDataflow.g:2323:2: ']'
            {
             before(grammarAccess.getActorSpecsAccess().getRightSquareBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActorSpecsAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__Group__4__Impl"


    // $ANTLR start "rule__ActorSpecs__Group_3__0"
    // InternalDataflow.g:2333:1: rule__ActorSpecs__Group_3__0 : rule__ActorSpecs__Group_3__0__Impl rule__ActorSpecs__Group_3__1 ;
    public final void rule__ActorSpecs__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2337:1: ( rule__ActorSpecs__Group_3__0__Impl rule__ActorSpecs__Group_3__1 )
            // InternalDataflow.g:2338:2: rule__ActorSpecs__Group_3__0__Impl rule__ActorSpecs__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__ActorSpecs__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorSpecs__Group_3__1();

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
    // $ANTLR end "rule__ActorSpecs__Group_3__0"


    // $ANTLR start "rule__ActorSpecs__Group_3__0__Impl"
    // InternalDataflow.g:2345:1: rule__ActorSpecs__Group_3__0__Impl : ( ';' ) ;
    public final void rule__ActorSpecs__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2349:1: ( ( ';' ) )
            // InternalDataflow.g:2350:1: ( ';' )
            {
            // InternalDataflow.g:2350:1: ( ';' )
            // InternalDataflow.g:2351:2: ';'
            {
             before(grammarAccess.getActorSpecsAccess().getSemicolonKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActorSpecsAccess().getSemicolonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__Group_3__0__Impl"


    // $ANTLR start "rule__ActorSpecs__Group_3__1"
    // InternalDataflow.g:2360:1: rule__ActorSpecs__Group_3__1 : rule__ActorSpecs__Group_3__1__Impl ;
    public final void rule__ActorSpecs__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2364:1: ( rule__ActorSpecs__Group_3__1__Impl )
            // InternalDataflow.g:2365:2: rule__ActorSpecs__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorSpecs__Group_3__1__Impl();

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
    // $ANTLR end "rule__ActorSpecs__Group_3__1"


    // $ANTLR start "rule__ActorSpecs__Group_3__1__Impl"
    // InternalDataflow.g:2371:1: rule__ActorSpecs__Group_3__1__Impl : ( ( rule__ActorSpecs__AnnotationsAssignment_3_1 ) ) ;
    public final void rule__ActorSpecs__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2375:1: ( ( ( rule__ActorSpecs__AnnotationsAssignment_3_1 ) ) )
            // InternalDataflow.g:2376:1: ( ( rule__ActorSpecs__AnnotationsAssignment_3_1 ) )
            {
            // InternalDataflow.g:2376:1: ( ( rule__ActorSpecs__AnnotationsAssignment_3_1 ) )
            // InternalDataflow.g:2377:2: ( rule__ActorSpecs__AnnotationsAssignment_3_1 )
            {
             before(grammarAccess.getActorSpecsAccess().getAnnotationsAssignment_3_1()); 
            // InternalDataflow.g:2378:2: ( rule__ActorSpecs__AnnotationsAssignment_3_1 )
            // InternalDataflow.g:2378:3: rule__ActorSpecs__AnnotationsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActorSpecs__AnnotationsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActorSpecsAccess().getAnnotationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__Group_3__1__Impl"


    // $ANTLR start "rule__ActorAnnotation__Group__0"
    // InternalDataflow.g:2387:1: rule__ActorAnnotation__Group__0 : rule__ActorAnnotation__Group__0__Impl rule__ActorAnnotation__Group__1 ;
    public final void rule__ActorAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2391:1: ( rule__ActorAnnotation__Group__0__Impl rule__ActorAnnotation__Group__1 )
            // InternalDataflow.g:2392:2: rule__ActorAnnotation__Group__0__Impl rule__ActorAnnotation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ActorAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorAnnotation__Group__1();

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
    // $ANTLR end "rule__ActorAnnotation__Group__0"


    // $ANTLR start "rule__ActorAnnotation__Group__0__Impl"
    // InternalDataflow.g:2399:1: rule__ActorAnnotation__Group__0__Impl : ( ( rule__ActorAnnotation__Group_0__0 )? ) ;
    public final void rule__ActorAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2403:1: ( ( ( rule__ActorAnnotation__Group_0__0 )? ) )
            // InternalDataflow.g:2404:1: ( ( rule__ActorAnnotation__Group_0__0 )? )
            {
            // InternalDataflow.g:2404:1: ( ( rule__ActorAnnotation__Group_0__0 )? )
            // InternalDataflow.g:2405:2: ( rule__ActorAnnotation__Group_0__0 )?
            {
             before(grammarAccess.getActorAnnotationAccess().getGroup_0()); 
            // InternalDataflow.g:2406:2: ( rule__ActorAnnotation__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataflow.g:2406:3: rule__ActorAnnotation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActorAnnotation__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAnnotationAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorAnnotation__Group__0__Impl"


    // $ANTLR start "rule__ActorAnnotation__Group__1"
    // InternalDataflow.g:2414:1: rule__ActorAnnotation__Group__1 : rule__ActorAnnotation__Group__1__Impl ;
    public final void rule__ActorAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2418:1: ( rule__ActorAnnotation__Group__1__Impl )
            // InternalDataflow.g:2419:2: rule__ActorAnnotation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorAnnotation__Group__1__Impl();

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
    // $ANTLR end "rule__ActorAnnotation__Group__1"


    // $ANTLR start "rule__ActorAnnotation__Group__1__Impl"
    // InternalDataflow.g:2425:1: rule__ActorAnnotation__Group__1__Impl : ( ( rule__ActorAnnotation__ExecutiontimeAssignment_1 ) ) ;
    public final void rule__ActorAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2429:1: ( ( ( rule__ActorAnnotation__ExecutiontimeAssignment_1 ) ) )
            // InternalDataflow.g:2430:1: ( ( rule__ActorAnnotation__ExecutiontimeAssignment_1 ) )
            {
            // InternalDataflow.g:2430:1: ( ( rule__ActorAnnotation__ExecutiontimeAssignment_1 ) )
            // InternalDataflow.g:2431:2: ( rule__ActorAnnotation__ExecutiontimeAssignment_1 )
            {
             before(grammarAccess.getActorAnnotationAccess().getExecutiontimeAssignment_1()); 
            // InternalDataflow.g:2432:2: ( rule__ActorAnnotation__ExecutiontimeAssignment_1 )
            // InternalDataflow.g:2432:3: rule__ActorAnnotation__ExecutiontimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActorAnnotation__ExecutiontimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAnnotationAccess().getExecutiontimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorAnnotation__Group__1__Impl"


    // $ANTLR start "rule__ActorAnnotation__Group_0__0"
    // InternalDataflow.g:2441:1: rule__ActorAnnotation__Group_0__0 : rule__ActorAnnotation__Group_0__0__Impl rule__ActorAnnotation__Group_0__1 ;
    public final void rule__ActorAnnotation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2445:1: ( rule__ActorAnnotation__Group_0__0__Impl rule__ActorAnnotation__Group_0__1 )
            // InternalDataflow.g:2446:2: rule__ActorAnnotation__Group_0__0__Impl rule__ActorAnnotation__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__ActorAnnotation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorAnnotation__Group_0__1();

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
    // $ANTLR end "rule__ActorAnnotation__Group_0__0"


    // $ANTLR start "rule__ActorAnnotation__Group_0__0__Impl"
    // InternalDataflow.g:2453:1: rule__ActorAnnotation__Group_0__0__Impl : ( 'execution' ) ;
    public final void rule__ActorAnnotation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2457:1: ( ( 'execution' ) )
            // InternalDataflow.g:2458:1: ( 'execution' )
            {
            // InternalDataflow.g:2458:1: ( 'execution' )
            // InternalDataflow.g:2459:2: 'execution'
            {
             before(grammarAccess.getActorAnnotationAccess().getExecutionKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getActorAnnotationAccess().getExecutionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorAnnotation__Group_0__0__Impl"


    // $ANTLR start "rule__ActorAnnotation__Group_0__1"
    // InternalDataflow.g:2468:1: rule__ActorAnnotation__Group_0__1 : rule__ActorAnnotation__Group_0__1__Impl rule__ActorAnnotation__Group_0__2 ;
    public final void rule__ActorAnnotation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2472:1: ( rule__ActorAnnotation__Group_0__1__Impl rule__ActorAnnotation__Group_0__2 )
            // InternalDataflow.g:2473:2: rule__ActorAnnotation__Group_0__1__Impl rule__ActorAnnotation__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__ActorAnnotation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorAnnotation__Group_0__2();

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
    // $ANTLR end "rule__ActorAnnotation__Group_0__1"


    // $ANTLR start "rule__ActorAnnotation__Group_0__1__Impl"
    // InternalDataflow.g:2480:1: rule__ActorAnnotation__Group_0__1__Impl : ( 'time' ) ;
    public final void rule__ActorAnnotation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2484:1: ( ( 'time' ) )
            // InternalDataflow.g:2485:1: ( 'time' )
            {
            // InternalDataflow.g:2485:1: ( 'time' )
            // InternalDataflow.g:2486:2: 'time'
            {
             before(grammarAccess.getActorAnnotationAccess().getTimeKeyword_0_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActorAnnotationAccess().getTimeKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorAnnotation__Group_0__1__Impl"


    // $ANTLR start "rule__ActorAnnotation__Group_0__2"
    // InternalDataflow.g:2495:1: rule__ActorAnnotation__Group_0__2 : rule__ActorAnnotation__Group_0__2__Impl ;
    public final void rule__ActorAnnotation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2499:1: ( rule__ActorAnnotation__Group_0__2__Impl )
            // InternalDataflow.g:2500:2: rule__ActorAnnotation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorAnnotation__Group_0__2__Impl();

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
    // $ANTLR end "rule__ActorAnnotation__Group_0__2"


    // $ANTLR start "rule__ActorAnnotation__Group_0__2__Impl"
    // InternalDataflow.g:2506:1: rule__ActorAnnotation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__ActorAnnotation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2510:1: ( ( ':' ) )
            // InternalDataflow.g:2511:1: ( ':' )
            {
            // InternalDataflow.g:2511:1: ( ':' )
            // InternalDataflow.g:2512:2: ':'
            {
             before(grammarAccess.getActorAnnotationAccess().getColonKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActorAnnotationAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorAnnotation__Group_0__2__Impl"


    // $ANTLR start "rule__InputSignals__Group__0"
    // InternalDataflow.g:2522:1: rule__InputSignals__Group__0 : rule__InputSignals__Group__0__Impl rule__InputSignals__Group__1 ;
    public final void rule__InputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2526:1: ( rule__InputSignals__Group__0__Impl rule__InputSignals__Group__1 )
            // InternalDataflow.g:2527:2: rule__InputSignals__Group__0__Impl rule__InputSignals__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__InputSignals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputSignals__Group__1();

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
    // $ANTLR end "rule__InputSignals__Group__0"


    // $ANTLR start "rule__InputSignals__Group__0__Impl"
    // InternalDataflow.g:2534:1: rule__InputSignals__Group__0__Impl : ( 'input' ) ;
    public final void rule__InputSignals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2538:1: ( ( 'input' ) )
            // InternalDataflow.g:2539:1: ( 'input' )
            {
            // InternalDataflow.g:2539:1: ( 'input' )
            // InternalDataflow.g:2540:2: 'input'
            {
             before(grammarAccess.getInputSignalsAccess().getInputKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInputSignalsAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSignals__Group__0__Impl"


    // $ANTLR start "rule__InputSignals__Group__1"
    // InternalDataflow.g:2549:1: rule__InputSignals__Group__1 : rule__InputSignals__Group__1__Impl rule__InputSignals__Group__2 ;
    public final void rule__InputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2553:1: ( rule__InputSignals__Group__1__Impl rule__InputSignals__Group__2 )
            // InternalDataflow.g:2554:2: rule__InputSignals__Group__1__Impl rule__InputSignals__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__InputSignals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputSignals__Group__2();

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
    // $ANTLR end "rule__InputSignals__Group__1"


    // $ANTLR start "rule__InputSignals__Group__1__Impl"
    // InternalDataflow.g:2561:1: rule__InputSignals__Group__1__Impl : ( 'signals' ) ;
    public final void rule__InputSignals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2565:1: ( ( 'signals' ) )
            // InternalDataflow.g:2566:1: ( 'signals' )
            {
            // InternalDataflow.g:2566:1: ( 'signals' )
            // InternalDataflow.g:2567:2: 'signals'
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInputSignalsAccess().getSignalsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSignals__Group__1__Impl"


    // $ANTLR start "rule__InputSignals__Group__2"
    // InternalDataflow.g:2576:1: rule__InputSignals__Group__2 : rule__InputSignals__Group__2__Impl ;
    public final void rule__InputSignals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2580:1: ( rule__InputSignals__Group__2__Impl )
            // InternalDataflow.g:2581:2: rule__InputSignals__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputSignals__Group__2__Impl();

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
    // $ANTLR end "rule__InputSignals__Group__2"


    // $ANTLR start "rule__InputSignals__Group__2__Impl"
    // InternalDataflow.g:2587:1: rule__InputSignals__Group__2__Impl : ( ( ( rule__InputSignals__SignalsAssignment_2 ) ) ( ( rule__InputSignals__SignalsAssignment_2 )* ) ) ;
    public final void rule__InputSignals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2591:1: ( ( ( ( rule__InputSignals__SignalsAssignment_2 ) ) ( ( rule__InputSignals__SignalsAssignment_2 )* ) ) )
            // InternalDataflow.g:2592:1: ( ( ( rule__InputSignals__SignalsAssignment_2 ) ) ( ( rule__InputSignals__SignalsAssignment_2 )* ) )
            {
            // InternalDataflow.g:2592:1: ( ( ( rule__InputSignals__SignalsAssignment_2 ) ) ( ( rule__InputSignals__SignalsAssignment_2 )* ) )
            // InternalDataflow.g:2593:2: ( ( rule__InputSignals__SignalsAssignment_2 ) ) ( ( rule__InputSignals__SignalsAssignment_2 )* )
            {
            // InternalDataflow.g:2593:2: ( ( rule__InputSignals__SignalsAssignment_2 ) )
            // InternalDataflow.g:2594:3: ( rule__InputSignals__SignalsAssignment_2 )
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsAssignment_2()); 
            // InternalDataflow.g:2595:3: ( rule__InputSignals__SignalsAssignment_2 )
            // InternalDataflow.g:2595:4: rule__InputSignals__SignalsAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__InputSignals__SignalsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getSignalsAssignment_2()); 

            }

            // InternalDataflow.g:2598:2: ( ( rule__InputSignals__SignalsAssignment_2 )* )
            // InternalDataflow.g:2599:3: ( rule__InputSignals__SignalsAssignment_2 )*
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsAssignment_2()); 
            // InternalDataflow.g:2600:3: ( rule__InputSignals__SignalsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDataflow.g:2600:4: rule__InputSignals__SignalsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__InputSignals__SignalsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInputSignalsAccess().getSignalsAssignment_2()); 

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
    // $ANTLR end "rule__InputSignals__Group__2__Impl"


    // $ANTLR start "rule__Signal__Group__0"
    // InternalDataflow.g:2610:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2614:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalDataflow.g:2615:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Signal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__1();

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
    // $ANTLR end "rule__Signal__Group__0"


    // $ANTLR start "rule__Signal__Group__0__Impl"
    // InternalDataflow.g:2622:1: rule__Signal__Group__0__Impl : ( ( rule__Signal__NameAssignment_0 ) ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2626:1: ( ( ( rule__Signal__NameAssignment_0 ) ) )
            // InternalDataflow.g:2627:1: ( ( rule__Signal__NameAssignment_0 ) )
            {
            // InternalDataflow.g:2627:1: ( ( rule__Signal__NameAssignment_0 ) )
            // InternalDataflow.g:2628:2: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // InternalDataflow.g:2629:2: ( rule__Signal__NameAssignment_0 )
            // InternalDataflow.g:2629:3: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__0__Impl"


    // $ANTLR start "rule__Signal__Group__1"
    // InternalDataflow.g:2637:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2641:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalDataflow.g:2642:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Signal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__2();

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
    // $ANTLR end "rule__Signal__Group__1"


    // $ANTLR start "rule__Signal__Group__1__Impl"
    // InternalDataflow.g:2649:1: rule__Signal__Group__1__Impl : ( '=' ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2653:1: ( ( '=' ) )
            // InternalDataflow.g:2654:1: ( '=' )
            {
            // InternalDataflow.g:2654:1: ( '=' )
            // InternalDataflow.g:2655:2: '='
            {
             before(grammarAccess.getSignalAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__1__Impl"


    // $ANTLR start "rule__Signal__Group__2"
    // InternalDataflow.g:2664:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2668:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalDataflow.g:2669:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Signal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__3();

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
    // $ANTLR end "rule__Signal__Group__2"


    // $ANTLR start "rule__Signal__Group__2__Impl"
    // InternalDataflow.g:2676:1: rule__Signal__Group__2__Impl : ( '[' ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2680:1: ( ( '[' ) )
            // InternalDataflow.g:2681:1: ( '[' )
            {
            // InternalDataflow.g:2681:1: ( '[' )
            // InternalDataflow.g:2682:2: '['
            {
             before(grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__2__Impl"


    // $ANTLR start "rule__Signal__Group__3"
    // InternalDataflow.g:2691:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2695:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalDataflow.g:2696:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Signal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__4();

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
    // $ANTLR end "rule__Signal__Group__3"


    // $ANTLR start "rule__Signal__Group__3__Impl"
    // InternalDataflow.g:2703:1: rule__Signal__Group__3__Impl : ( ( rule__Signal__Group_3__0 )? ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2707:1: ( ( ( rule__Signal__Group_3__0 )? ) )
            // InternalDataflow.g:2708:1: ( ( rule__Signal__Group_3__0 )? )
            {
            // InternalDataflow.g:2708:1: ( ( rule__Signal__Group_3__0 )? )
            // InternalDataflow.g:2709:2: ( rule__Signal__Group_3__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_3()); 
            // InternalDataflow.g:2710:2: ( rule__Signal__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_FLOAT && LA23_0<=RULE_NINT)||LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataflow.g:2710:3: rule__Signal__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signal__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__3__Impl"


    // $ANTLR start "rule__Signal__Group__4"
    // InternalDataflow.g:2718:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2722:1: ( rule__Signal__Group__4__Impl )
            // InternalDataflow.g:2723:2: rule__Signal__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__4__Impl();

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
    // $ANTLR end "rule__Signal__Group__4"


    // $ANTLR start "rule__Signal__Group__4__Impl"
    // InternalDataflow.g:2729:1: rule__Signal__Group__4__Impl : ( ']' ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2733:1: ( ( ']' ) )
            // InternalDataflow.g:2734:1: ( ']' )
            {
            // InternalDataflow.g:2734:1: ( ']' )
            // InternalDataflow.g:2735:2: ']'
            {
             before(grammarAccess.getSignalAccess().getRightSquareBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__4__Impl"


    // $ANTLR start "rule__Signal__Group_3__0"
    // InternalDataflow.g:2745:1: rule__Signal__Group_3__0 : rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 ;
    public final void rule__Signal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2749:1: ( rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 )
            // InternalDataflow.g:2750:2: rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Signal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group_3__1();

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
    // $ANTLR end "rule__Signal__Group_3__0"


    // $ANTLR start "rule__Signal__Group_3__0__Impl"
    // InternalDataflow.g:2757:1: rule__Signal__Group_3__0__Impl : ( ( rule__Signal__TimestampsAssignment_3_0 ) ) ;
    public final void rule__Signal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2761:1: ( ( ( rule__Signal__TimestampsAssignment_3_0 ) ) )
            // InternalDataflow.g:2762:1: ( ( rule__Signal__TimestampsAssignment_3_0 ) )
            {
            // InternalDataflow.g:2762:1: ( ( rule__Signal__TimestampsAssignment_3_0 ) )
            // InternalDataflow.g:2763:2: ( rule__Signal__TimestampsAssignment_3_0 )
            {
             before(grammarAccess.getSignalAccess().getTimestampsAssignment_3_0()); 
            // InternalDataflow.g:2764:2: ( rule__Signal__TimestampsAssignment_3_0 )
            // InternalDataflow.g:2764:3: rule__Signal__TimestampsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__TimestampsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getTimestampsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_3__0__Impl"


    // $ANTLR start "rule__Signal__Group_3__1"
    // InternalDataflow.g:2772:1: rule__Signal__Group_3__1 : rule__Signal__Group_3__1__Impl ;
    public final void rule__Signal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2776:1: ( rule__Signal__Group_3__1__Impl )
            // InternalDataflow.g:2777:2: rule__Signal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group_3__1__Impl();

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
    // $ANTLR end "rule__Signal__Group_3__1"


    // $ANTLR start "rule__Signal__Group_3__1__Impl"
    // InternalDataflow.g:2783:1: rule__Signal__Group_3__1__Impl : ( ( rule__Signal__Group_3_1__0 )* ) ;
    public final void rule__Signal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2787:1: ( ( ( rule__Signal__Group_3_1__0 )* ) )
            // InternalDataflow.g:2788:1: ( ( rule__Signal__Group_3_1__0 )* )
            {
            // InternalDataflow.g:2788:1: ( ( rule__Signal__Group_3_1__0 )* )
            // InternalDataflow.g:2789:2: ( rule__Signal__Group_3_1__0 )*
            {
             before(grammarAccess.getSignalAccess().getGroup_3_1()); 
            // InternalDataflow.g:2790:2: ( rule__Signal__Group_3_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDataflow.g:2790:3: rule__Signal__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Signal__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_3__1__Impl"


    // $ANTLR start "rule__Signal__Group_3_1__0"
    // InternalDataflow.g:2799:1: rule__Signal__Group_3_1__0 : rule__Signal__Group_3_1__0__Impl rule__Signal__Group_3_1__1 ;
    public final void rule__Signal__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2803:1: ( rule__Signal__Group_3_1__0__Impl rule__Signal__Group_3_1__1 )
            // InternalDataflow.g:2804:2: rule__Signal__Group_3_1__0__Impl rule__Signal__Group_3_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Signal__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group_3_1__1();

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
    // $ANTLR end "rule__Signal__Group_3_1__0"


    // $ANTLR start "rule__Signal__Group_3_1__0__Impl"
    // InternalDataflow.g:2811:1: rule__Signal__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Signal__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2815:1: ( ( ',' ) )
            // InternalDataflow.g:2816:1: ( ',' )
            {
            // InternalDataflow.g:2816:1: ( ',' )
            // InternalDataflow.g:2817:2: ','
            {
             before(grammarAccess.getSignalAccess().getCommaKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_3_1__0__Impl"


    // $ANTLR start "rule__Signal__Group_3_1__1"
    // InternalDataflow.g:2826:1: rule__Signal__Group_3_1__1 : rule__Signal__Group_3_1__1__Impl ;
    public final void rule__Signal__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2830:1: ( rule__Signal__Group_3_1__1__Impl )
            // InternalDataflow.g:2831:2: rule__Signal__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Signal__Group_3_1__1"


    // $ANTLR start "rule__Signal__Group_3_1__1__Impl"
    // InternalDataflow.g:2837:1: rule__Signal__Group_3_1__1__Impl : ( ( rule__Signal__TimestampsAssignment_3_1_1 ) ) ;
    public final void rule__Signal__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2841:1: ( ( ( rule__Signal__TimestampsAssignment_3_1_1 ) ) )
            // InternalDataflow.g:2842:1: ( ( rule__Signal__TimestampsAssignment_3_1_1 ) )
            {
            // InternalDataflow.g:2842:1: ( ( rule__Signal__TimestampsAssignment_3_1_1 ) )
            // InternalDataflow.g:2843:2: ( rule__Signal__TimestampsAssignment_3_1_1 )
            {
             before(grammarAccess.getSignalAccess().getTimestampsAssignment_3_1_1()); 
            // InternalDataflow.g:2844:2: ( rule__Signal__TimestampsAssignment_3_1_1 )
            // InternalDataflow.g:2844:3: rule__Signal__TimestampsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Signal__TimestampsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getTimestampsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_3_1__1__Impl"


    // $ANTLR start "rule__Ratio__Group__0"
    // InternalDataflow.g:2853:1: rule__Ratio__Group__0 : rule__Ratio__Group__0__Impl rule__Ratio__Group__1 ;
    public final void rule__Ratio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2857:1: ( rule__Ratio__Group__0__Impl rule__Ratio__Group__1 )
            // InternalDataflow.g:2858:2: rule__Ratio__Group__0__Impl rule__Ratio__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDataflow.g:2865:1: rule__Ratio__Group__0__Impl : ( ( rule__Ratio__NumeratorAssignment_0 ) ) ;
    public final void rule__Ratio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2869:1: ( ( ( rule__Ratio__NumeratorAssignment_0 ) ) )
            // InternalDataflow.g:2870:1: ( ( rule__Ratio__NumeratorAssignment_0 ) )
            {
            // InternalDataflow.g:2870:1: ( ( rule__Ratio__NumeratorAssignment_0 ) )
            // InternalDataflow.g:2871:2: ( rule__Ratio__NumeratorAssignment_0 )
            {
             before(grammarAccess.getRatioAccess().getNumeratorAssignment_0()); 
            // InternalDataflow.g:2872:2: ( rule__Ratio__NumeratorAssignment_0 )
            // InternalDataflow.g:2872:3: rule__Ratio__NumeratorAssignment_0
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
    // InternalDataflow.g:2880:1: rule__Ratio__Group__1 : rule__Ratio__Group__1__Impl rule__Ratio__Group__2 ;
    public final void rule__Ratio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2884:1: ( rule__Ratio__Group__1__Impl rule__Ratio__Group__2 )
            // InternalDataflow.g:2885:2: rule__Ratio__Group__1__Impl rule__Ratio__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalDataflow.g:2892:1: rule__Ratio__Group__1__Impl : ( '/' ) ;
    public final void rule__Ratio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2896:1: ( ( '/' ) )
            // InternalDataflow.g:2897:1: ( '/' )
            {
            // InternalDataflow.g:2897:1: ( '/' )
            // InternalDataflow.g:2898:2: '/'
            {
             before(grammarAccess.getRatioAccess().getSolidusKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDataflow.g:2907:1: rule__Ratio__Group__2 : rule__Ratio__Group__2__Impl ;
    public final void rule__Ratio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2911:1: ( rule__Ratio__Group__2__Impl )
            // InternalDataflow.g:2912:2: rule__Ratio__Group__2__Impl
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
    // InternalDataflow.g:2918:1: rule__Ratio__Group__2__Impl : ( ( rule__Ratio__DenominatorAssignment_2 ) ) ;
    public final void rule__Ratio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2922:1: ( ( ( rule__Ratio__DenominatorAssignment_2 ) ) )
            // InternalDataflow.g:2923:1: ( ( rule__Ratio__DenominatorAssignment_2 ) )
            {
            // InternalDataflow.g:2923:1: ( ( rule__Ratio__DenominatorAssignment_2 ) )
            // InternalDataflow.g:2924:2: ( rule__Ratio__DenominatorAssignment_2 )
            {
             before(grammarAccess.getRatioAccess().getDenominatorAssignment_2()); 
            // InternalDataflow.g:2925:2: ( rule__Ratio__DenominatorAssignment_2 )
            // InternalDataflow.g:2925:3: rule__Ratio__DenominatorAssignment_2
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


    // $ANTLR start "rule__DataflowModel__AuthorAssignment_0_2"
    // InternalDataflow.g:2934:1: rule__DataflowModel__AuthorAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__DataflowModel__AuthorAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2938:1: ( ( RULE_ID ) )
            // InternalDataflow.g:2939:2: ( RULE_ID )
            {
            // InternalDataflow.g:2939:2: ( RULE_ID )
            // InternalDataflow.g:2940:3: RULE_ID
            {
             before(grammarAccess.getDataflowModelAccess().getAuthorIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getAuthorIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__AuthorAssignment_0_2"


    // $ANTLR start "rule__DataflowModel__NameAssignment_3"
    // InternalDataflow.g:2949:1: rule__DataflowModel__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataflowModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2953:1: ( ( RULE_ID ) )
            // InternalDataflow.g:2954:2: ( RULE_ID )
            {
            // InternalDataflow.g:2954:2: ( RULE_ID )
            // InternalDataflow.g:2955:3: RULE_ID
            {
             before(grammarAccess.getDataflowModelAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataflowModelAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__NameAssignment_3"


    // $ANTLR start "rule__DataflowModel__InputsAssignment_5_1"
    // InternalDataflow.g:2964:1: rule__DataflowModel__InputsAssignment_5_1 : ( ruleInput ) ;
    public final void rule__DataflowModel__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2968:1: ( ( ruleInput ) )
            // InternalDataflow.g:2969:2: ( ruleInput )
            {
            // InternalDataflow.g:2969:2: ( ruleInput )
            // InternalDataflow.g:2970:3: ruleInput
            {
             before(grammarAccess.getDataflowModelAccess().getInputsInputParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getDataflowModelAccess().getInputsInputParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__InputsAssignment_5_1"


    // $ANTLR start "rule__DataflowModel__InputsAssignment_5_2_1"
    // InternalDataflow.g:2979:1: rule__DataflowModel__InputsAssignment_5_2_1 : ( ruleInput ) ;
    public final void rule__DataflowModel__InputsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2983:1: ( ( ruleInput ) )
            // InternalDataflow.g:2984:2: ( ruleInput )
            {
            // InternalDataflow.g:2984:2: ( ruleInput )
            // InternalDataflow.g:2985:3: ruleInput
            {
             before(grammarAccess.getDataflowModelAccess().getInputsInputParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getDataflowModelAccess().getInputsInputParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__InputsAssignment_5_2_1"


    // $ANTLR start "rule__DataflowModel__OutputsAssignment_6_1"
    // InternalDataflow.g:2994:1: rule__DataflowModel__OutputsAssignment_6_1 : ( ruleOutput ) ;
    public final void rule__DataflowModel__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:2998:1: ( ( ruleOutput ) )
            // InternalDataflow.g:2999:2: ( ruleOutput )
            {
            // InternalDataflow.g:2999:2: ( ruleOutput )
            // InternalDataflow.g:3000:3: ruleOutput
            {
             before(grammarAccess.getDataflowModelAccess().getOutputsOutputParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getDataflowModelAccess().getOutputsOutputParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__OutputsAssignment_6_1"


    // $ANTLR start "rule__DataflowModel__OutputsAssignment_6_2_1"
    // InternalDataflow.g:3009:1: rule__DataflowModel__OutputsAssignment_6_2_1 : ( ruleOutput ) ;
    public final void rule__DataflowModel__OutputsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3013:1: ( ( ruleOutput ) )
            // InternalDataflow.g:3014:2: ( ruleOutput )
            {
            // InternalDataflow.g:3014:2: ( ruleOutput )
            // InternalDataflow.g:3015:3: ruleOutput
            {
             before(grammarAccess.getDataflowModelAccess().getOutputsOutputParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getDataflowModelAccess().getOutputsOutputParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__OutputsAssignment_6_2_1"


    // $ANTLR start "rule__DataflowModel__EdgesAssignment_7"
    // InternalDataflow.g:3024:1: rule__DataflowModel__EdgesAssignment_7 : ( ruleEdge ) ;
    public final void rule__DataflowModel__EdgesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3028:1: ( ( ruleEdge ) )
            // InternalDataflow.g:3029:2: ( ruleEdge )
            {
            // InternalDataflow.g:3029:2: ( ruleEdge )
            // InternalDataflow.g:3030:3: ruleEdge
            {
             before(grammarAccess.getDataflowModelAccess().getEdgesEdgeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getDataflowModelAccess().getEdgesEdgeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__EdgesAssignment_7"


    // $ANTLR start "rule__DataflowModel__InputsignalsAssignment_9"
    // InternalDataflow.g:3039:1: rule__DataflowModel__InputsignalsAssignment_9 : ( ruleInputSignals ) ;
    public final void rule__DataflowModel__InputsignalsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3043:1: ( ( ruleInputSignals ) )
            // InternalDataflow.g:3044:2: ( ruleInputSignals )
            {
            // InternalDataflow.g:3044:2: ( ruleInputSignals )
            // InternalDataflow.g:3045:3: ruleInputSignals
            {
             before(grammarAccess.getDataflowModelAccess().getInputsignalsInputSignalsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleInputSignals();

            state._fsp--;

             after(grammarAccess.getDataflowModelAccess().getInputsignalsInputSignalsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataflowModel__InputsignalsAssignment_9"


    // $ANTLR start "rule__Edge__SrcactAssignment_0_0"
    // InternalDataflow.g:3054:1: rule__Edge__SrcactAssignment_0_0 : ( ruleActor ) ;
    public final void rule__Edge__SrcactAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3058:1: ( ( ruleActor ) )
            // InternalDataflow.g:3059:2: ( ruleActor )
            {
            // InternalDataflow.g:3059:2: ( ruleActor )
            // InternalDataflow.g:3060:3: ruleActor
            {
             before(grammarAccess.getEdgeAccess().getSrcactActorParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getSrcactActorParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__SrcactAssignment_0_0"


    // $ANTLR start "rule__Edge__DstactAssignment_0_3"
    // InternalDataflow.g:3069:1: rule__Edge__DstactAssignment_0_3 : ( ruleActor ) ;
    public final void rule__Edge__DstactAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3073:1: ( ( ruleActor ) )
            // InternalDataflow.g:3074:2: ( ruleActor )
            {
            // InternalDataflow.g:3074:2: ( ruleActor )
            // InternalDataflow.g:3075:3: ruleActor
            {
             before(grammarAccess.getEdgeAccess().getDstactActorParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getDstactActorParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__DstactAssignment_0_3"


    // $ANTLR start "rule__Edge__SrcactAssignment_1_0"
    // InternalDataflow.g:3084:1: rule__Edge__SrcactAssignment_1_0 : ( ruleActor ) ;
    public final void rule__Edge__SrcactAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3088:1: ( ( ruleActor ) )
            // InternalDataflow.g:3089:2: ( ruleActor )
            {
            // InternalDataflow.g:3089:2: ( ruleActor )
            // InternalDataflow.g:3090:3: ruleActor
            {
             before(grammarAccess.getEdgeAccess().getSrcactActorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getSrcactActorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__SrcactAssignment_1_0"


    // $ANTLR start "rule__Edge__SpecsAssignment_1_2"
    // InternalDataflow.g:3099:1: rule__Edge__SpecsAssignment_1_2 : ( ruleEdgeSpecs ) ;
    public final void rule__Edge__SpecsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3103:1: ( ( ruleEdgeSpecs ) )
            // InternalDataflow.g:3104:2: ( ruleEdgeSpecs )
            {
            // InternalDataflow.g:3104:2: ( ruleEdgeSpecs )
            // InternalDataflow.g:3105:3: ruleEdgeSpecs
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


    // $ANTLR start "rule__Edge__DstactAssignment_1_5"
    // InternalDataflow.g:3114:1: rule__Edge__DstactAssignment_1_5 : ( ruleActor ) ;
    public final void rule__Edge__DstactAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3118:1: ( ( ruleActor ) )
            // InternalDataflow.g:3119:2: ( ruleActor )
            {
            // InternalDataflow.g:3119:2: ( ruleActor )
            // InternalDataflow.g:3120:3: ruleActor
            {
             before(grammarAccess.getEdgeAccess().getDstactActorParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getDstactActorParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__DstactAssignment_1_5"


    // $ANTLR start "rule__EdgeSpecs__AnnotationsAssignment_1"
    // InternalDataflow.g:3129:1: rule__EdgeSpecs__AnnotationsAssignment_1 : ( ruleEdgeAnnotation ) ;
    public final void rule__EdgeSpecs__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3133:1: ( ( ruleEdgeAnnotation ) )
            // InternalDataflow.g:3134:2: ( ruleEdgeAnnotation )
            {
            // InternalDataflow.g:3134:2: ( ruleEdgeAnnotation )
            // InternalDataflow.g:3135:3: ruleEdgeAnnotation
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
    // InternalDataflow.g:3144:1: rule__EdgeSpecs__AnnotationsAssignment_2_1 : ( ruleEdgeAnnotation ) ;
    public final void rule__EdgeSpecs__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3148:1: ( ( ruleEdgeAnnotation ) )
            // InternalDataflow.g:3149:2: ( ruleEdgeAnnotation )
            {
            // InternalDataflow.g:3149:2: ( ruleEdgeAnnotation )
            // InternalDataflow.g:3150:3: ruleEdgeAnnotation
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


    // $ANTLR start "rule__EdgeAnnotation__InitialtokensAssignment_0_1"
    // InternalDataflow.g:3159:1: rule__EdgeAnnotation__InitialtokensAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__EdgeAnnotation__InitialtokensAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3163:1: ( ( RULE_INT ) )
            // InternalDataflow.g:3164:2: ( RULE_INT )
            {
            // InternalDataflow.g:3164:2: ( RULE_INT )
            // InternalDataflow.g:3165:3: RULE_INT
            {
             before(grammarAccess.getEdgeAnnotationAccess().getInitialtokensINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getInitialtokensINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__InitialtokensAssignment_0_1"


    // $ANTLR start "rule__EdgeAnnotation__ProdrateAssignment_1_3"
    // InternalDataflow.g:3174:1: rule__EdgeAnnotation__ProdrateAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__EdgeAnnotation__ProdrateAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3178:1: ( ( RULE_INT ) )
            // InternalDataflow.g:3179:2: ( RULE_INT )
            {
            // InternalDataflow.g:3179:2: ( RULE_INT )
            // InternalDataflow.g:3180:3: RULE_INT
            {
             before(grammarAccess.getEdgeAnnotationAccess().getProdrateINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getProdrateINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__ProdrateAssignment_1_3"


    // $ANTLR start "rule__EdgeAnnotation__ConsrateAssignment_2_3"
    // InternalDataflow.g:3189:1: rule__EdgeAnnotation__ConsrateAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__EdgeAnnotation__ConsrateAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3193:1: ( ( RULE_INT ) )
            // InternalDataflow.g:3194:2: ( RULE_INT )
            {
            // InternalDataflow.g:3194:2: ( RULE_INT )
            // InternalDataflow.g:3195:3: RULE_INT
            {
             before(grammarAccess.getEdgeAnnotationAccess().getConsrateINTTerminalRuleCall_2_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getConsrateINTTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__ConsrateAssignment_2_3"


    // $ANTLR start "rule__EdgeAnnotation__NameAssignment_3_2"
    // InternalDataflow.g:3204:1: rule__EdgeAnnotation__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__EdgeAnnotation__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3208:1: ( ( RULE_ID ) )
            // InternalDataflow.g:3209:2: ( RULE_ID )
            {
            // InternalDataflow.g:3209:2: ( RULE_ID )
            // InternalDataflow.g:3210:3: RULE_ID
            {
             before(grammarAccess.getEdgeAnnotationAccess().getNameIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getNameIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__NameAssignment_3_2"


    // $ANTLR start "rule__EdgeAnnotation__TokensizeAssignment_4_3"
    // InternalDataflow.g:3219:1: rule__EdgeAnnotation__TokensizeAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__EdgeAnnotation__TokensizeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3223:1: ( ( RULE_INT ) )
            // InternalDataflow.g:3224:2: ( RULE_INT )
            {
            // InternalDataflow.g:3224:2: ( RULE_INT )
            // InternalDataflow.g:3225:3: RULE_INT
            {
             before(grammarAccess.getEdgeAnnotationAccess().getTokensizeINTTerminalRuleCall_4_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEdgeAnnotationAccess().getTokensizeINTTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeAnnotation__TokensizeAssignment_4_3"


    // $ANTLR start "rule__Actor__NameAssignment_0"
    // InternalDataflow.g:3234:1: rule__Actor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3238:1: ( ( RULE_ID ) )
            // InternalDataflow.g:3239:2: ( RULE_ID )
            {
            // InternalDataflow.g:3239:2: ( RULE_ID )
            // InternalDataflow.g:3240:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_0"


    // $ANTLR start "rule__Actor__SpecsAssignment_1"
    // InternalDataflow.g:3249:1: rule__Actor__SpecsAssignment_1 : ( ruleActorSpecs ) ;
    public final void rule__Actor__SpecsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3253:1: ( ( ruleActorSpecs ) )
            // InternalDataflow.g:3254:2: ( ruleActorSpecs )
            {
            // InternalDataflow.g:3254:2: ( ruleActorSpecs )
            // InternalDataflow.g:3255:3: ruleActorSpecs
            {
             before(grammarAccess.getActorAccess().getSpecsActorSpecsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActorSpecs();

            state._fsp--;

             after(grammarAccess.getActorAccess().getSpecsActorSpecsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__SpecsAssignment_1"


    // $ANTLR start "rule__ActorSpecs__AnnotationsAssignment_2"
    // InternalDataflow.g:3264:1: rule__ActorSpecs__AnnotationsAssignment_2 : ( ruleActorAnnotation ) ;
    public final void rule__ActorSpecs__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3268:1: ( ( ruleActorAnnotation ) )
            // InternalDataflow.g:3269:2: ( ruleActorAnnotation )
            {
            // InternalDataflow.g:3269:2: ( ruleActorAnnotation )
            // InternalDataflow.g:3270:3: ruleActorAnnotation
            {
             before(grammarAccess.getActorSpecsAccess().getAnnotationsActorAnnotationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActorAnnotation();

            state._fsp--;

             after(grammarAccess.getActorSpecsAccess().getAnnotationsActorAnnotationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__AnnotationsAssignment_2"


    // $ANTLR start "rule__ActorSpecs__AnnotationsAssignment_3_1"
    // InternalDataflow.g:3279:1: rule__ActorSpecs__AnnotationsAssignment_3_1 : ( ruleActorAnnotation ) ;
    public final void rule__ActorSpecs__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3283:1: ( ( ruleActorAnnotation ) )
            // InternalDataflow.g:3284:2: ( ruleActorAnnotation )
            {
            // InternalDataflow.g:3284:2: ( ruleActorAnnotation )
            // InternalDataflow.g:3285:3: ruleActorAnnotation
            {
             before(grammarAccess.getActorSpecsAccess().getAnnotationsActorAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActorAnnotation();

            state._fsp--;

             after(grammarAccess.getActorSpecsAccess().getAnnotationsActorAnnotationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorSpecs__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__ActorAnnotation__ExecutiontimeAssignment_1"
    // InternalDataflow.g:3294:1: rule__ActorAnnotation__ExecutiontimeAssignment_1 : ( ruleNumber ) ;
    public final void rule__ActorAnnotation__ExecutiontimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3298:1: ( ( ruleNumber ) )
            // InternalDataflow.g:3299:2: ( ruleNumber )
            {
            // InternalDataflow.g:3299:2: ( ruleNumber )
            // InternalDataflow.g:3300:3: ruleNumber
            {
             before(grammarAccess.getActorAnnotationAccess().getExecutiontimeNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getActorAnnotationAccess().getExecutiontimeNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorAnnotation__ExecutiontimeAssignment_1"


    // $ANTLR start "rule__InputSignals__SignalsAssignment_2"
    // InternalDataflow.g:3309:1: rule__InputSignals__SignalsAssignment_2 : ( ruleSignal ) ;
    public final void rule__InputSignals__SignalsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3313:1: ( ( ruleSignal ) )
            // InternalDataflow.g:3314:2: ( ruleSignal )
            {
            // InternalDataflow.g:3314:2: ( ruleSignal )
            // InternalDataflow.g:3315:3: ruleSignal
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputSignals__SignalsAssignment_2"


    // $ANTLR start "rule__Signal__NameAssignment_0"
    // InternalDataflow.g:3324:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3328:1: ( ( RULE_ID ) )
            // InternalDataflow.g:3329:2: ( RULE_ID )
            {
            // InternalDataflow.g:3329:2: ( RULE_ID )
            // InternalDataflow.g:3330:3: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__NameAssignment_0"


    // $ANTLR start "rule__Signal__TimestampsAssignment_3_0"
    // InternalDataflow.g:3339:1: rule__Signal__TimestampsAssignment_3_0 : ( ruleTimeStamp ) ;
    public final void rule__Signal__TimestampsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3343:1: ( ( ruleTimeStamp ) )
            // InternalDataflow.g:3344:2: ( ruleTimeStamp )
            {
            // InternalDataflow.g:3344:2: ( ruleTimeStamp )
            // InternalDataflow.g:3345:3: ruleTimeStamp
            {
             before(grammarAccess.getSignalAccess().getTimestampsTimeStampParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getTimestampsTimeStampParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__TimestampsAssignment_3_0"


    // $ANTLR start "rule__Signal__TimestampsAssignment_3_1_1"
    // InternalDataflow.g:3354:1: rule__Signal__TimestampsAssignment_3_1_1 : ( ruleTimeStamp ) ;
    public final void rule__Signal__TimestampsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3358:1: ( ( ruleTimeStamp ) )
            // InternalDataflow.g:3359:2: ( ruleTimeStamp )
            {
            // InternalDataflow.g:3359:2: ( ruleTimeStamp )
            // InternalDataflow.g:3360:3: ruleTimeStamp
            {
             before(grammarAccess.getSignalAccess().getTimestampsTimeStampParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeStamp();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getTimestampsTimeStampParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__TimestampsAssignment_3_1_1"


    // $ANTLR start "rule__Number__RatioAssignment_0"
    // InternalDataflow.g:3369:1: rule__Number__RatioAssignment_0 : ( ruleRatio ) ;
    public final void rule__Number__RatioAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3373:1: ( ( ruleRatio ) )
            // InternalDataflow.g:3374:2: ( ruleRatio )
            {
            // InternalDataflow.g:3374:2: ( ruleRatio )
            // InternalDataflow.g:3375:3: ruleRatio
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
    // InternalDataflow.g:3384:1: rule__Number__ValueAssignment_1 : ( ( rule__Number__ValueAlternatives_1_0 ) ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3388:1: ( ( ( rule__Number__ValueAlternatives_1_0 ) ) )
            // InternalDataflow.g:3389:2: ( ( rule__Number__ValueAlternatives_1_0 ) )
            {
            // InternalDataflow.g:3389:2: ( ( rule__Number__ValueAlternatives_1_0 ) )
            // InternalDataflow.g:3390:3: ( rule__Number__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getNumberAccess().getValueAlternatives_1_0()); 
            // InternalDataflow.g:3391:3: ( rule__Number__ValueAlternatives_1_0 )
            // InternalDataflow.g:3391:4: rule__Number__ValueAlternatives_1_0
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
    // InternalDataflow.g:3399:1: rule__Ratio__NumeratorAssignment_0 : ( rulePNInt ) ;
    public final void rule__Ratio__NumeratorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3403:1: ( ( rulePNInt ) )
            // InternalDataflow.g:3404:2: ( rulePNInt )
            {
            // InternalDataflow.g:3404:2: ( rulePNInt )
            // InternalDataflow.g:3405:3: rulePNInt
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
    // InternalDataflow.g:3414:1: rule__Ratio__DenominatorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Ratio__DenominatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3418:1: ( ( RULE_INT ) )
            // InternalDataflow.g:3419:2: ( RULE_INT )
            {
            // InternalDataflow.g:3419:2: ( RULE_INT )
            // InternalDataflow.g:3420:3: RULE_INT
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


    // $ANTLR start "rule__Input__NameAssignment"
    // InternalDataflow.g:3429:1: rule__Input__NameAssignment : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3433:1: ( ( RULE_ID ) )
            // InternalDataflow.g:3434:2: ( RULE_ID )
            {
            // InternalDataflow.g:3434:2: ( RULE_ID )
            // InternalDataflow.g:3435:3: RULE_ID
            {
             before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NameAssignment"


    // $ANTLR start "rule__Output__NameAssignment"
    // InternalDataflow.g:3444:1: rule__Output__NameAssignment : ( RULE_ID ) ;
    public final void rule__Output__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataflow.g:3448:1: ( ( RULE_ID ) )
            // InternalDataflow.g:3449:2: ( RULE_ID )
            {
            // InternalDataflow.g:3449:2: ( RULE_ID )
            // InternalDataflow.g:3450:3: RULE_ID
            {
             before(grammarAccess.getOutputAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__NameAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\7\1\27\1\4\1\5\1\uffff\1\46\3\31\1\5\1\uffff\1\34\1\4\1\27\1\5\1\4\1\46\4\31\1\34\1\5\1\4\1\31";
    static final String dfa_3s = "\1\7\1\43\1\45\1\41\1\uffff\1\46\2\51\1\44\1\41\1\uffff\1\34\1\45\1\30\1\5\1\6\1\46\2\51\2\44\1\34\1\5\1\6\1\44";
    static final String dfa_4s = "\4\uffff\1\1\5\uffff\1\2\16\uffff";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\1\4\12\uffff\1\2",
            "\1\10\1\6\1\7\36\uffff\1\5",
            "\1\12\21\uffff\1\11\1\4\1\uffff\1\12\2\uffff\1\12\1\uffff\3\12",
            "",
            "\1\13",
            "\1\14\12\uffff\1\15\4\uffff\1\16",
            "\1\14\12\uffff\1\15\4\uffff\1\16",
            "\1\14\12\uffff\1\15",
            "\1\12\21\uffff\1\11\1\4\1\uffff\1\12\2\uffff\1\12\1\uffff\3\12",
            "",
            "\1\17",
            "\1\23\1\21\1\22\36\uffff\1\20",
            "\1\3\1\4",
            "\1\24",
            "\1\10\1\6\1\7",
            "\1\25",
            "\1\14\12\uffff\1\15\4\uffff\1\26",
            "\1\14\12\uffff\1\15\4\uffff\1\26",
            "\1\14\12\uffff\1\15",
            "\1\14\12\uffff\1\15",
            "\1\27",
            "\1\30",
            "\1\23\1\21\1\22",
            "\1\14\12\uffff\1\15"
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
            return "427:1: rule__Edge__Alternatives : ( ( ( rule__Edge__Group_0__0 ) ) | ( ( rule__Edge__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000520080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003A4000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000070L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003000002070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000002070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});

}