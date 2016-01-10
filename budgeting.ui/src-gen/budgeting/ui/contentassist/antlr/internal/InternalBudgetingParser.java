package budgeting.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import budgeting.services.BudgetingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBudgetingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECIMAL", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'", "'library'", "'{'", "'}'", "'income'", "'expense'", "'['", "']'", "','", "'uses'", "'budget'", "'actual'", "':'", "'*'", "'cash'", "'on'", "'card'", "'from'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DECIMAL=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBudgetingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBudgetingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBudgetingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBudgeting.g"; }


     
     	private BudgetingGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BudgetingGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleBudgetingFile"
    // InternalBudgeting.g:60:1: entryRuleBudgetingFile : ruleBudgetingFile EOF ;
    public final void entryRuleBudgetingFile() throws RecognitionException {
        try {
            // InternalBudgeting.g:61:1: ( ruleBudgetingFile EOF )
            // InternalBudgeting.g:62:1: ruleBudgetingFile EOF
            {
             before(grammarAccess.getBudgetingFileRule()); 
            pushFollow(FOLLOW_1);
            ruleBudgetingFile();

            state._fsp--;

             after(grammarAccess.getBudgetingFileRule()); 
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
    // $ANTLR end "entryRuleBudgetingFile"


    // $ANTLR start "ruleBudgetingFile"
    // InternalBudgeting.g:69:1: ruleBudgetingFile : ( ( rule__BudgetingFile__Alternatives ) ) ;
    public final void ruleBudgetingFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:73:2: ( ( ( rule__BudgetingFile__Alternatives ) ) )
            // InternalBudgeting.g:74:1: ( ( rule__BudgetingFile__Alternatives ) )
            {
            // InternalBudgeting.g:74:1: ( ( rule__BudgetingFile__Alternatives ) )
            // InternalBudgeting.g:75:1: ( rule__BudgetingFile__Alternatives )
            {
             before(grammarAccess.getBudgetingFileAccess().getAlternatives()); 
            // InternalBudgeting.g:76:1: ( rule__BudgetingFile__Alternatives )
            // InternalBudgeting.g:76:2: rule__BudgetingFile__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BudgetingFile__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBudgetingFileAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBudgetingFile"


    // $ANTLR start "entryRuleLibrary"
    // InternalBudgeting.g:88:1: entryRuleLibrary : ruleLibrary EOF ;
    public final void entryRuleLibrary() throws RecognitionException {
        try {
            // InternalBudgeting.g:89:1: ( ruleLibrary EOF )
            // InternalBudgeting.g:90:1: ruleLibrary EOF
            {
             before(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getLibraryRule()); 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalBudgeting.g:97:1: ruleLibrary : ( ( rule__Library__Group__0 ) ) ;
    public final void ruleLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:101:2: ( ( ( rule__Library__Group__0 ) ) )
            // InternalBudgeting.g:102:1: ( ( rule__Library__Group__0 ) )
            {
            // InternalBudgeting.g:102:1: ( ( rule__Library__Group__0 ) )
            // InternalBudgeting.g:103:1: ( rule__Library__Group__0 )
            {
             before(grammarAccess.getLibraryAccess().getGroup()); 
            // InternalBudgeting.g:104:1: ( rule__Library__Group__0 )
            // InternalBudgeting.g:104:2: rule__Library__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleCategory"
    // InternalBudgeting.g:116:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalBudgeting.g:117:1: ( ruleCategory EOF )
            // InternalBudgeting.g:118:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalBudgeting.g:125:1: ruleCategory : ( ( rule__Category__Alternatives ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:129:2: ( ( ( rule__Category__Alternatives ) ) )
            // InternalBudgeting.g:130:1: ( ( rule__Category__Alternatives ) )
            {
            // InternalBudgeting.g:130:1: ( ( rule__Category__Alternatives ) )
            // InternalBudgeting.g:131:1: ( rule__Category__Alternatives )
            {
             before(grammarAccess.getCategoryAccess().getAlternatives()); 
            // InternalBudgeting.g:132:1: ( rule__Category__Alternatives )
            // InternalBudgeting.g:132:2: rule__Category__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Category__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleYear"
    // InternalBudgeting.g:144:1: entryRuleYear : ruleYear EOF ;
    public final void entryRuleYear() throws RecognitionException {
        try {
            // InternalBudgeting.g:145:1: ( ruleYear EOF )
            // InternalBudgeting.g:146:1: ruleYear EOF
            {
             before(grammarAccess.getYearRule()); 
            pushFollow(FOLLOW_1);
            ruleYear();

            state._fsp--;

             after(grammarAccess.getYearRule()); 
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
    // $ANTLR end "entryRuleYear"


    // $ANTLR start "ruleYear"
    // InternalBudgeting.g:153:1: ruleYear : ( ( rule__Year__Group__0 ) ) ;
    public final void ruleYear() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:157:2: ( ( ( rule__Year__Group__0 ) ) )
            // InternalBudgeting.g:158:1: ( ( rule__Year__Group__0 ) )
            {
            // InternalBudgeting.g:158:1: ( ( rule__Year__Group__0 ) )
            // InternalBudgeting.g:159:1: ( rule__Year__Group__0 )
            {
             before(grammarAccess.getYearAccess().getGroup()); 
            // InternalBudgeting.g:160:1: ( rule__Year__Group__0 )
            // InternalBudgeting.g:160:2: rule__Year__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Year__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYearAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYear"


    // $ANTLR start "entryRuleMonth"
    // InternalBudgeting.g:172:1: entryRuleMonth : ruleMonth EOF ;
    public final void entryRuleMonth() throws RecognitionException {
        try {
            // InternalBudgeting.g:173:1: ( ruleMonth EOF )
            // InternalBudgeting.g:174:1: ruleMonth EOF
            {
             before(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_1);
            ruleMonth();

            state._fsp--;

             after(grammarAccess.getMonthRule()); 
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
    // $ANTLR end "entryRuleMonth"


    // $ANTLR start "ruleMonth"
    // InternalBudgeting.g:181:1: ruleMonth : ( ( rule__Month__Group__0 ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:185:2: ( ( ( rule__Month__Group__0 ) ) )
            // InternalBudgeting.g:186:1: ( ( rule__Month__Group__0 ) )
            {
            // InternalBudgeting.g:186:1: ( ( rule__Month__Group__0 ) )
            // InternalBudgeting.g:187:1: ( rule__Month__Group__0 )
            {
             before(grammarAccess.getMonthAccess().getGroup()); 
            // InternalBudgeting.g:188:1: ( rule__Month__Group__0 )
            // InternalBudgeting.g:188:2: rule__Month__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Month__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonth"


    // $ANTLR start "entryRuleBudgetEntry"
    // InternalBudgeting.g:200:1: entryRuleBudgetEntry : ruleBudgetEntry EOF ;
    public final void entryRuleBudgetEntry() throws RecognitionException {
        try {
            // InternalBudgeting.g:201:1: ( ruleBudgetEntry EOF )
            // InternalBudgeting.g:202:1: ruleBudgetEntry EOF
            {
             before(grammarAccess.getBudgetEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleBudgetEntry();

            state._fsp--;

             after(grammarAccess.getBudgetEntryRule()); 
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
    // $ANTLR end "entryRuleBudgetEntry"


    // $ANTLR start "ruleBudgetEntry"
    // InternalBudgeting.g:209:1: ruleBudgetEntry : ( ( rule__BudgetEntry__Alternatives ) ) ;
    public final void ruleBudgetEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:213:2: ( ( ( rule__BudgetEntry__Alternatives ) ) )
            // InternalBudgeting.g:214:1: ( ( rule__BudgetEntry__Alternatives ) )
            {
            // InternalBudgeting.g:214:1: ( ( rule__BudgetEntry__Alternatives ) )
            // InternalBudgeting.g:215:1: ( rule__BudgetEntry__Alternatives )
            {
             before(grammarAccess.getBudgetEntryAccess().getAlternatives()); 
            // InternalBudgeting.g:216:1: ( rule__BudgetEntry__Alternatives )
            // InternalBudgeting.g:216:2: rule__BudgetEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBudgetEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBudgetEntry"


    // $ANTLR start "entryRuleActualEntry"
    // InternalBudgeting.g:228:1: entryRuleActualEntry : ruleActualEntry EOF ;
    public final void entryRuleActualEntry() throws RecognitionException {
        try {
            // InternalBudgeting.g:229:1: ( ruleActualEntry EOF )
            // InternalBudgeting.g:230:1: ruleActualEntry EOF
            {
             before(grammarAccess.getActualEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleActualEntry();

            state._fsp--;

             after(grammarAccess.getActualEntryRule()); 
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
    // $ANTLR end "entryRuleActualEntry"


    // $ANTLR start "ruleActualEntry"
    // InternalBudgeting.g:237:1: ruleActualEntry : ( ( rule__ActualEntry__Alternatives ) ) ;
    public final void ruleActualEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:241:2: ( ( ( rule__ActualEntry__Alternatives ) ) )
            // InternalBudgeting.g:242:1: ( ( rule__ActualEntry__Alternatives ) )
            {
            // InternalBudgeting.g:242:1: ( ( rule__ActualEntry__Alternatives ) )
            // InternalBudgeting.g:243:1: ( rule__ActualEntry__Alternatives )
            {
             before(grammarAccess.getActualEntryAccess().getAlternatives()); 
            // InternalBudgeting.g:244:1: ( rule__ActualEntry__Alternatives )
            // InternalBudgeting.g:244:2: rule__ActualEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActualEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActualEntry"


    // $ANTLR start "entryRuleTransaction"
    // InternalBudgeting.g:256:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalBudgeting.g:257:1: ( ruleTransaction EOF )
            // InternalBudgeting.g:258:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionRule()); 
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
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalBudgeting.g:265:1: ruleTransaction : ( ( rule__Transaction__Alternatives ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:269:2: ( ( ( rule__Transaction__Alternatives ) ) )
            // InternalBudgeting.g:270:1: ( ( rule__Transaction__Alternatives ) )
            {
            // InternalBudgeting.g:270:1: ( ( rule__Transaction__Alternatives ) )
            // InternalBudgeting.g:271:1: ( rule__Transaction__Alternatives )
            {
             before(grammarAccess.getTransactionAccess().getAlternatives()); 
            // InternalBudgeting.g:272:1: ( rule__Transaction__Alternatives )
            // InternalBudgeting.g:272:2: rule__Transaction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleDollar"
    // InternalBudgeting.g:284:1: entryRuleDollar : ruleDollar EOF ;
    public final void entryRuleDollar() throws RecognitionException {
        try {
            // InternalBudgeting.g:285:1: ( ruleDollar EOF )
            // InternalBudgeting.g:286:1: ruleDollar EOF
            {
             before(grammarAccess.getDollarRule()); 
            pushFollow(FOLLOW_1);
            ruleDollar();

            state._fsp--;

             after(grammarAccess.getDollarRule()); 
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
    // $ANTLR end "entryRuleDollar"


    // $ANTLR start "ruleDollar"
    // InternalBudgeting.g:293:1: ruleDollar : ( RULE_DECIMAL ) ;
    public final void ruleDollar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:297:2: ( ( RULE_DECIMAL ) )
            // InternalBudgeting.g:298:1: ( RULE_DECIMAL )
            {
            // InternalBudgeting.g:298:1: ( RULE_DECIMAL )
            // InternalBudgeting.g:299:1: RULE_DECIMAL
            {
             before(grammarAccess.getDollarAccess().getDECIMALTerminalRuleCall()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getDollarAccess().getDECIMALTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDollar"


    // $ANTLR start "entryRuleDouble"
    // InternalBudgeting.g:312:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalBudgeting.g:313:1: ( ruleDouble EOF )
            // InternalBudgeting.g:314:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalBudgeting.g:321:1: ruleDouble : ( ( rule__Double__Alternatives ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:325:2: ( ( ( rule__Double__Alternatives ) ) )
            // InternalBudgeting.g:326:1: ( ( rule__Double__Alternatives ) )
            {
            // InternalBudgeting.g:326:1: ( ( rule__Double__Alternatives ) )
            // InternalBudgeting.g:327:1: ( rule__Double__Alternatives )
            {
             before(grammarAccess.getDoubleAccess().getAlternatives()); 
            // InternalBudgeting.g:328:1: ( rule__Double__Alternatives )
            // InternalBudgeting.g:328:2: rule__Double__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Double__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleOptionalInt"
    // InternalBudgeting.g:340:1: entryRuleOptionalInt : ruleOptionalInt EOF ;
    public final void entryRuleOptionalInt() throws RecognitionException {
        try {
            // InternalBudgeting.g:341:1: ( ruleOptionalInt EOF )
            // InternalBudgeting.g:342:1: ruleOptionalInt EOF
            {
             before(grammarAccess.getOptionalIntRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionalInt();

            state._fsp--;

             after(grammarAccess.getOptionalIntRule()); 
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
    // $ANTLR end "entryRuleOptionalInt"


    // $ANTLR start "ruleOptionalInt"
    // InternalBudgeting.g:349:1: ruleOptionalInt : ( RULE_INT ) ;
    public final void ruleOptionalInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:353:2: ( ( RULE_INT ) )
            // InternalBudgeting.g:354:1: ( RULE_INT )
            {
            // InternalBudgeting.g:354:1: ( RULE_INT )
            // InternalBudgeting.g:355:1: RULE_INT
            {
             before(grammarAccess.getOptionalIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOptionalIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalInt"


    // $ANTLR start "ruleMonthEnum"
    // InternalBudgeting.g:369:1: ruleMonthEnum : ( ( rule__MonthEnum__Alternatives ) ) ;
    public final void ruleMonthEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:373:1: ( ( ( rule__MonthEnum__Alternatives ) ) )
            // InternalBudgeting.g:374:1: ( ( rule__MonthEnum__Alternatives ) )
            {
            // InternalBudgeting.g:374:1: ( ( rule__MonthEnum__Alternatives ) )
            // InternalBudgeting.g:375:1: ( rule__MonthEnum__Alternatives )
            {
             before(grammarAccess.getMonthEnumAccess().getAlternatives()); 
            // InternalBudgeting.g:376:1: ( rule__MonthEnum__Alternatives )
            // InternalBudgeting.g:376:2: rule__MonthEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MonthEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMonthEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonthEnum"


    // $ANTLR start "rule__BudgetingFile__Alternatives"
    // InternalBudgeting.g:387:1: rule__BudgetingFile__Alternatives : ( ( ruleLibrary ) | ( ruleYear ) );
    public final void rule__BudgetingFile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:391:1: ( ( ruleLibrary ) | ( ruleYear ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBudgeting.g:392:1: ( ruleLibrary )
                    {
                    // InternalBudgeting.g:392:1: ( ruleLibrary )
                    // InternalBudgeting.g:393:1: ruleLibrary
                    {
                     before(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLibrary();

                    state._fsp--;

                     after(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:398:6: ( ruleYear )
                    {
                    // InternalBudgeting.g:398:6: ( ruleYear )
                    // InternalBudgeting.g:399:1: ruleYear
                    {
                     before(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleYear();

                    state._fsp--;

                     after(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 

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
    // $ANTLR end "rule__BudgetingFile__Alternatives"


    // $ANTLR start "rule__Category__Alternatives"
    // InternalBudgeting.g:409:1: rule__Category__Alternatives : ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Group_1__0 ) ) );
    public final void rule__Category__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:413:1: ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBudgeting.g:414:1: ( ( rule__Category__Group_0__0 ) )
                    {
                    // InternalBudgeting.g:414:1: ( ( rule__Category__Group_0__0 ) )
                    // InternalBudgeting.g:415:1: ( rule__Category__Group_0__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_0()); 
                    // InternalBudgeting.g:416:1: ( rule__Category__Group_0__0 )
                    // InternalBudgeting.g:416:2: rule__Category__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Category__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCategoryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:420:6: ( ( rule__Category__Group_1__0 ) )
                    {
                    // InternalBudgeting.g:420:6: ( ( rule__Category__Group_1__0 ) )
                    // InternalBudgeting.g:421:1: ( rule__Category__Group_1__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_1()); 
                    // InternalBudgeting.g:422:1: ( rule__Category__Group_1__0 )
                    // InternalBudgeting.g:422:2: rule__Category__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Category__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCategoryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Category__Alternatives"


    // $ANTLR start "rule__BudgetEntry__Alternatives"
    // InternalBudgeting.g:431:1: rule__BudgetEntry__Alternatives : ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) );
    public final void rule__BudgetEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:435:1: ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==35) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==RULE_DECIMAL) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==RULE_ID) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBudgeting.g:436:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    {
                    // InternalBudgeting.g:436:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    // InternalBudgeting.g:437:1: ( rule__BudgetEntry__Group_0__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_0()); 
                    // InternalBudgeting.g:438:1: ( rule__BudgetEntry__Group_0__0 )
                    // InternalBudgeting.g:438:2: rule__BudgetEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BudgetEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBudgetEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:442:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    {
                    // InternalBudgeting.g:442:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    // InternalBudgeting.g:443:1: ( rule__BudgetEntry__Group_1__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_1()); 
                    // InternalBudgeting.g:444:1: ( rule__BudgetEntry__Group_1__0 )
                    // InternalBudgeting.g:444:2: rule__BudgetEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BudgetEntry__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBudgetEntryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BudgetEntry__Alternatives"


    // $ANTLR start "rule__ActualEntry__Alternatives"
    // InternalBudgeting.g:453:1: rule__ActualEntry__Alternatives : ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) );
    public final void rule__ActualEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:457:1: ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=2;
                }
                else if ( (LA4_1==35) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBudgeting.g:458:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    {
                    // InternalBudgeting.g:458:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    // InternalBudgeting.g:459:1: ( rule__ActualEntry__Group_0__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_0()); 
                    // InternalBudgeting.g:460:1: ( rule__ActualEntry__Group_0__0 )
                    // InternalBudgeting.g:460:2: rule__ActualEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActualEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActualEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:464:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    {
                    // InternalBudgeting.g:464:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    // InternalBudgeting.g:465:1: ( rule__ActualEntry__Group_1__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_1()); 
                    // InternalBudgeting.g:466:1: ( rule__ActualEntry__Group_1__0 )
                    // InternalBudgeting.g:466:2: rule__ActualEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActualEntry__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActualEntryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ActualEntry__Alternatives"


    // $ANTLR start "rule__Transaction__Alternatives"
    // InternalBudgeting.g:475:1: rule__Transaction__Alternatives : ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) );
    public final void rule__Transaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:479:1: ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==39) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBudgeting.g:480:1: ( ( rule__Transaction__Group_0__0 ) )
                    {
                    // InternalBudgeting.g:480:1: ( ( rule__Transaction__Group_0__0 ) )
                    // InternalBudgeting.g:481:1: ( rule__Transaction__Group_0__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_0()); 
                    // InternalBudgeting.g:482:1: ( rule__Transaction__Group_0__0 )
                    // InternalBudgeting.g:482:2: rule__Transaction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transaction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:486:6: ( ( rule__Transaction__Group_1__0 ) )
                    {
                    // InternalBudgeting.g:486:6: ( ( rule__Transaction__Group_1__0 ) )
                    // InternalBudgeting.g:487:1: ( rule__Transaction__Group_1__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_1()); 
                    // InternalBudgeting.g:488:1: ( rule__Transaction__Group_1__0 )
                    // InternalBudgeting.g:488:2: rule__Transaction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transaction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Transaction__Alternatives"


    // $ANTLR start "rule__Double__Alternatives"
    // InternalBudgeting.g:497:1: rule__Double__Alternatives : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Double__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:501:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_DECIMAL) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBudgeting.g:502:1: ( RULE_INT )
                    {
                    // InternalBudgeting.g:502:1: ( RULE_INT )
                    // InternalBudgeting.g:503:1: RULE_INT
                    {
                     before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:508:6: ( RULE_DECIMAL )
                    {
                    // InternalBudgeting.g:508:6: ( RULE_DECIMAL )
                    // InternalBudgeting.g:509:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getDoubleAccess().getDECIMALTerminalRuleCall_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_2); 
                     after(grammarAccess.getDoubleAccess().getDECIMALTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Double__Alternatives"


    // $ANTLR start "rule__MonthEnum__Alternatives"
    // InternalBudgeting.g:519:1: rule__MonthEnum__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__MonthEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:523:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 16:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
                }
                break;
            case 18:
                {
                alt7=7;
                }
                break;
            case 19:
                {
                alt7=8;
                }
                break;
            case 20:
                {
                alt7=9;
                }
                break;
            case 21:
                {
                alt7=10;
                }
                break;
            case 22:
                {
                alt7=11;
                }
                break;
            case 23:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBudgeting.g:524:1: ( ( 'january' ) )
                    {
                    // InternalBudgeting.g:524:1: ( ( 'january' ) )
                    // InternalBudgeting.g:525:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
                    // InternalBudgeting.g:526:1: ( 'january' )
                    // InternalBudgeting.g:526:3: 'january'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:531:6: ( ( 'february' ) )
                    {
                    // InternalBudgeting.g:531:6: ( ( 'february' ) )
                    // InternalBudgeting.g:532:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
                    // InternalBudgeting.g:533:1: ( 'february' )
                    // InternalBudgeting.g:533:3: 'february'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBudgeting.g:538:6: ( ( 'march' ) )
                    {
                    // InternalBudgeting.g:538:6: ( ( 'march' ) )
                    // InternalBudgeting.g:539:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
                    // InternalBudgeting.g:540:1: ( 'march' )
                    // InternalBudgeting.g:540:3: 'march'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBudgeting.g:545:6: ( ( 'april' ) )
                    {
                    // InternalBudgeting.g:545:6: ( ( 'april' ) )
                    // InternalBudgeting.g:546:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
                    // InternalBudgeting.g:547:1: ( 'april' )
                    // InternalBudgeting.g:547:3: 'april'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBudgeting.g:552:6: ( ( 'may' ) )
                    {
                    // InternalBudgeting.g:552:6: ( ( 'may' ) )
                    // InternalBudgeting.g:553:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
                    // InternalBudgeting.g:554:1: ( 'may' )
                    // InternalBudgeting.g:554:3: 'may'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBudgeting.g:559:6: ( ( 'june' ) )
                    {
                    // InternalBudgeting.g:559:6: ( ( 'june' ) )
                    // InternalBudgeting.g:560:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
                    // InternalBudgeting.g:561:1: ( 'june' )
                    // InternalBudgeting.g:561:3: 'june'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBudgeting.g:566:6: ( ( 'july' ) )
                    {
                    // InternalBudgeting.g:566:6: ( ( 'july' ) )
                    // InternalBudgeting.g:567:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
                    // InternalBudgeting.g:568:1: ( 'july' )
                    // InternalBudgeting.g:568:3: 'july'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBudgeting.g:573:6: ( ( 'august' ) )
                    {
                    // InternalBudgeting.g:573:6: ( ( 'august' ) )
                    // InternalBudgeting.g:574:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                    // InternalBudgeting.g:575:1: ( 'august' )
                    // InternalBudgeting.g:575:3: 'august'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBudgeting.g:580:6: ( ( 'september' ) )
                    {
                    // InternalBudgeting.g:580:6: ( ( 'september' ) )
                    // InternalBudgeting.g:581:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                    // InternalBudgeting.g:582:1: ( 'september' )
                    // InternalBudgeting.g:582:3: 'september'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBudgeting.g:587:6: ( ( 'october' ) )
                    {
                    // InternalBudgeting.g:587:6: ( ( 'october' ) )
                    // InternalBudgeting.g:588:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                    // InternalBudgeting.g:589:1: ( 'october' )
                    // InternalBudgeting.g:589:3: 'october'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalBudgeting.g:594:6: ( ( 'november' ) )
                    {
                    // InternalBudgeting.g:594:6: ( ( 'november' ) )
                    // InternalBudgeting.g:595:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                    // InternalBudgeting.g:596:1: ( 'november' )
                    // InternalBudgeting.g:596:3: 'november'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalBudgeting.g:601:6: ( ( 'december' ) )
                    {
                    // InternalBudgeting.g:601:6: ( ( 'december' ) )
                    // InternalBudgeting.g:602:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                    // InternalBudgeting.g:603:1: ( 'december' )
                    // InternalBudgeting.g:603:3: 'december'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 

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
    // $ANTLR end "rule__MonthEnum__Alternatives"


    // $ANTLR start "rule__Library__Group__0"
    // InternalBudgeting.g:615:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:619:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // InternalBudgeting.g:620:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0"


    // $ANTLR start "rule__Library__Group__0__Impl"
    // InternalBudgeting.g:627:1: rule__Library__Group__0__Impl : ( 'library' ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:631:1: ( ( 'library' ) )
            // InternalBudgeting.g:632:1: ( 'library' )
            {
            // InternalBudgeting.g:632:1: ( 'library' )
            // InternalBudgeting.g:633:1: 'library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0__Impl"


    // $ANTLR start "rule__Library__Group__1"
    // InternalBudgeting.g:646:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:650:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // InternalBudgeting.g:651:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1"


    // $ANTLR start "rule__Library__Group__1__Impl"
    // InternalBudgeting.g:658:1: rule__Library__Group__1__Impl : ( ( rule__Library__NameAssignment_1 ) ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:662:1: ( ( ( rule__Library__NameAssignment_1 ) ) )
            // InternalBudgeting.g:663:1: ( ( rule__Library__NameAssignment_1 ) )
            {
            // InternalBudgeting.g:663:1: ( ( rule__Library__NameAssignment_1 ) )
            // InternalBudgeting.g:664:1: ( rule__Library__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_1()); 
            // InternalBudgeting.g:665:1: ( rule__Library__NameAssignment_1 )
            // InternalBudgeting.g:665:2: rule__Library__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Library__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1__Impl"


    // $ANTLR start "rule__Library__Group__2"
    // InternalBudgeting.g:675:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:679:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // InternalBudgeting.g:680:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2"


    // $ANTLR start "rule__Library__Group__2__Impl"
    // InternalBudgeting.g:687:1: rule__Library__Group__2__Impl : ( '{' ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:691:1: ( ( '{' ) )
            // InternalBudgeting.g:692:1: ( '{' )
            {
            // InternalBudgeting.g:692:1: ( '{' )
            // InternalBudgeting.g:693:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2__Impl"


    // $ANTLR start "rule__Library__Group__3"
    // InternalBudgeting.g:706:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:710:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // InternalBudgeting.g:711:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3"


    // $ANTLR start "rule__Library__Group__3__Impl"
    // InternalBudgeting.g:718:1: rule__Library__Group__3__Impl : ( ( rule__Library__CategoriesAssignment_3 )* ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:722:1: ( ( ( rule__Library__CategoriesAssignment_3 )* ) )
            // InternalBudgeting.g:723:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            {
            // InternalBudgeting.g:723:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            // InternalBudgeting.g:724:1: ( rule__Library__CategoriesAssignment_3 )*
            {
             before(grammarAccess.getLibraryAccess().getCategoriesAssignment_3()); 
            // InternalBudgeting.g:725:1: ( rule__Library__CategoriesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBudgeting.g:725:2: rule__Library__CategoriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Library__CategoriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getCategoriesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3__Impl"


    // $ANTLR start "rule__Library__Group__4"
    // InternalBudgeting.g:735:1: rule__Library__Group__4 : rule__Library__Group__4__Impl ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:739:1: ( rule__Library__Group__4__Impl )
            // InternalBudgeting.g:740:2: rule__Library__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__4"


    // $ANTLR start "rule__Library__Group__4__Impl"
    // InternalBudgeting.g:746:1: rule__Library__Group__4__Impl : ( '}' ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:750:1: ( ( '}' ) )
            // InternalBudgeting.g:751:1: ( '}' )
            {
            // InternalBudgeting.g:751:1: ( '}' )
            // InternalBudgeting.g:752:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__4__Impl"


    // $ANTLR start "rule__Category__Group_0__0"
    // InternalBudgeting.g:775:1: rule__Category__Group_0__0 : rule__Category__Group_0__0__Impl rule__Category__Group_0__1 ;
    public final void rule__Category__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:779:1: ( rule__Category__Group_0__0__Impl rule__Category__Group_0__1 )
            // InternalBudgeting.g:780:2: rule__Category__Group_0__0__Impl rule__Category__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Category__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__0"


    // $ANTLR start "rule__Category__Group_0__0__Impl"
    // InternalBudgeting.g:787:1: rule__Category__Group_0__0__Impl : ( () ) ;
    public final void rule__Category__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:791:1: ( ( () ) )
            // InternalBudgeting.g:792:1: ( () )
            {
            // InternalBudgeting.g:792:1: ( () )
            // InternalBudgeting.g:793:1: ()
            {
             before(grammarAccess.getCategoryAccess().getIncomeCategoryAction_0_0()); 
            // InternalBudgeting.g:794:1: ()
            // InternalBudgeting.g:796:1: 
            {
            }

             after(grammarAccess.getCategoryAccess().getIncomeCategoryAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__0__Impl"


    // $ANTLR start "rule__Category__Group_0__1"
    // InternalBudgeting.g:806:1: rule__Category__Group_0__1 : rule__Category__Group_0__1__Impl rule__Category__Group_0__2 ;
    public final void rule__Category__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:810:1: ( rule__Category__Group_0__1__Impl rule__Category__Group_0__2 )
            // InternalBudgeting.g:811:2: rule__Category__Group_0__1__Impl rule__Category__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Category__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__1"


    // $ANTLR start "rule__Category__Group_0__1__Impl"
    // InternalBudgeting.g:818:1: rule__Category__Group_0__1__Impl : ( 'income' ) ;
    public final void rule__Category__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:822:1: ( ( 'income' ) )
            // InternalBudgeting.g:823:1: ( 'income' )
            {
            // InternalBudgeting.g:823:1: ( 'income' )
            // InternalBudgeting.g:824:1: 'income'
            {
             before(grammarAccess.getCategoryAccess().getIncomeKeyword_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getIncomeKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__1__Impl"


    // $ANTLR start "rule__Category__Group_0__2"
    // InternalBudgeting.g:837:1: rule__Category__Group_0__2 : rule__Category__Group_0__2__Impl ;
    public final void rule__Category__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:841:1: ( rule__Category__Group_0__2__Impl )
            // InternalBudgeting.g:842:2: rule__Category__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__2"


    // $ANTLR start "rule__Category__Group_0__2__Impl"
    // InternalBudgeting.g:848:1: rule__Category__Group_0__2__Impl : ( ( rule__Category__NameAssignment_0_2 ) ) ;
    public final void rule__Category__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:852:1: ( ( ( rule__Category__NameAssignment_0_2 ) ) )
            // InternalBudgeting.g:853:1: ( ( rule__Category__NameAssignment_0_2 ) )
            {
            // InternalBudgeting.g:853:1: ( ( rule__Category__NameAssignment_0_2 ) )
            // InternalBudgeting.g:854:1: ( rule__Category__NameAssignment_0_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_0_2()); 
            // InternalBudgeting.g:855:1: ( rule__Category__NameAssignment_0_2 )
            // InternalBudgeting.g:855:2: rule__Category__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__2__Impl"


    // $ANTLR start "rule__Category__Group_1__0"
    // InternalBudgeting.g:871:1: rule__Category__Group_1__0 : rule__Category__Group_1__0__Impl rule__Category__Group_1__1 ;
    public final void rule__Category__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:875:1: ( rule__Category__Group_1__0__Impl rule__Category__Group_1__1 )
            // InternalBudgeting.g:876:2: rule__Category__Group_1__0__Impl rule__Category__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Category__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1__0"


    // $ANTLR start "rule__Category__Group_1__0__Impl"
    // InternalBudgeting.g:883:1: rule__Category__Group_1__0__Impl : ( () ) ;
    public final void rule__Category__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:887:1: ( ( () ) )
            // InternalBudgeting.g:888:1: ( () )
            {
            // InternalBudgeting.g:888:1: ( () )
            // InternalBudgeting.g:889:1: ()
            {
             before(grammarAccess.getCategoryAccess().getExpenseCategoryAction_1_0()); 
            // InternalBudgeting.g:890:1: ()
            // InternalBudgeting.g:892:1: 
            {
            }

             after(grammarAccess.getCategoryAccess().getExpenseCategoryAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1__0__Impl"


    // $ANTLR start "rule__Category__Group_1__1"
    // InternalBudgeting.g:902:1: rule__Category__Group_1__1 : rule__Category__Group_1__1__Impl rule__Category__Group_1__2 ;
    public final void rule__Category__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:906:1: ( rule__Category__Group_1__1__Impl rule__Category__Group_1__2 )
            // InternalBudgeting.g:907:2: rule__Category__Group_1__1__Impl rule__Category__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Category__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1__1"


    // $ANTLR start "rule__Category__Group_1__1__Impl"
    // InternalBudgeting.g:914:1: rule__Category__Group_1__1__Impl : ( 'expense' ) ;
    public final void rule__Category__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:918:1: ( ( 'expense' ) )
            // InternalBudgeting.g:919:1: ( 'expense' )
            {
            // InternalBudgeting.g:919:1: ( 'expense' )
            // InternalBudgeting.g:920:1: 'expense'
            {
             before(grammarAccess.getCategoryAccess().getExpenseKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getExpenseKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1__1__Impl"


    // $ANTLR start "rule__Category__Group_1__2"
    // InternalBudgeting.g:933:1: rule__Category__Group_1__2 : rule__Category__Group_1__2__Impl rule__Category__Group_1__3 ;
    public final void rule__Category__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:937:1: ( rule__Category__Group_1__2__Impl rule__Category__Group_1__3 )
            // InternalBudgeting.g:938:2: rule__Category__Group_1__2__Impl rule__Category__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Category__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1__2"


    // $ANTLR start "rule__Category__Group_1__2__Impl"
    // InternalBudgeting.g:945:1: rule__Category__Group_1__2__Impl : ( ( rule__Category__NameAssignment_1_2 ) ) ;
    public final void rule__Category__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:949:1: ( ( ( rule__Category__NameAssignment_1_2 ) ) )
            // InternalBudgeting.g:950:1: ( ( rule__Category__NameAssignment_1_2 ) )
            {
            // InternalBudgeting.g:950:1: ( ( rule__Category__NameAssignment_1_2 ) )
            // InternalBudgeting.g:951:1: ( rule__Category__NameAssignment_1_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1_2()); 
            // InternalBudgeting.g:952:1: ( rule__Category__NameAssignment_1_2 )
            // InternalBudgeting.g:952:2: rule__Category__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1__2__Impl"


    // $ANTLR start "rule__Category__Group_1__3"
    // InternalBudgeting.g:962:1: rule__Category__Group_1__3 : rule__Category__Group_1__3__Impl ;
    public final void rule__Category__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:966:1: ( rule__Category__Group_1__3__Impl )
            // InternalBudgeting.g:967:2: rule__Category__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1__3"


    // $ANTLR start "rule__Category__Group_1__3__Impl"
    // InternalBudgeting.g:973:1: rule__Category__Group_1__3__Impl : ( ( rule__Category__Group_1_3__0 )? ) ;
    public final void rule__Category__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:977:1: ( ( ( rule__Category__Group_1_3__0 )? ) )
            // InternalBudgeting.g:978:1: ( ( rule__Category__Group_1_3__0 )? )
            {
            // InternalBudgeting.g:978:1: ( ( rule__Category__Group_1_3__0 )? )
            // InternalBudgeting.g:979:1: ( rule__Category__Group_1_3__0 )?
            {
             before(grammarAccess.getCategoryAccess().getGroup_1_3()); 
            // InternalBudgeting.g:980:1: ( rule__Category__Group_1_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBudgeting.g:980:2: rule__Category__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Category__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCategoryAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1__3__Impl"


    // $ANTLR start "rule__Category__Group_1_3__0"
    // InternalBudgeting.g:998:1: rule__Category__Group_1_3__0 : rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1 ;
    public final void rule__Category__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1002:1: ( rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1 )
            // InternalBudgeting.g:1003:2: rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Category__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3__0"


    // $ANTLR start "rule__Category__Group_1_3__0__Impl"
    // InternalBudgeting.g:1010:1: rule__Category__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__Category__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1014:1: ( ( '[' ) )
            // InternalBudgeting.g:1015:1: ( '[' )
            {
            // InternalBudgeting.g:1015:1: ( '[' )
            // InternalBudgeting.g:1016:1: '['
            {
             before(grammarAccess.getCategoryAccess().getLeftSquareBracketKeyword_1_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getLeftSquareBracketKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3__0__Impl"


    // $ANTLR start "rule__Category__Group_1_3__1"
    // InternalBudgeting.g:1029:1: rule__Category__Group_1_3__1 : rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2 ;
    public final void rule__Category__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1033:1: ( rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2 )
            // InternalBudgeting.g:1034:2: rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Category__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3__1"


    // $ANTLR start "rule__Category__Group_1_3__1__Impl"
    // InternalBudgeting.g:1041:1: rule__Category__Group_1_3__1__Impl : ( ( rule__Category__PatternsAssignment_1_3_1 ) ) ;
    public final void rule__Category__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1045:1: ( ( ( rule__Category__PatternsAssignment_1_3_1 ) ) )
            // InternalBudgeting.g:1046:1: ( ( rule__Category__PatternsAssignment_1_3_1 ) )
            {
            // InternalBudgeting.g:1046:1: ( ( rule__Category__PatternsAssignment_1_3_1 ) )
            // InternalBudgeting.g:1047:1: ( rule__Category__PatternsAssignment_1_3_1 )
            {
             before(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_1()); 
            // InternalBudgeting.g:1048:1: ( rule__Category__PatternsAssignment_1_3_1 )
            // InternalBudgeting.g:1048:2: rule__Category__PatternsAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__PatternsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3__1__Impl"


    // $ANTLR start "rule__Category__Group_1_3__2"
    // InternalBudgeting.g:1058:1: rule__Category__Group_1_3__2 : rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3 ;
    public final void rule__Category__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1062:1: ( rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3 )
            // InternalBudgeting.g:1063:2: rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3
            {
            pushFollow(FOLLOW_11);
            rule__Category__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_1_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3__2"


    // $ANTLR start "rule__Category__Group_1_3__2__Impl"
    // InternalBudgeting.g:1070:1: rule__Category__Group_1_3__2__Impl : ( ( rule__Category__Group_1_3_2__0 )* ) ;
    public final void rule__Category__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1074:1: ( ( ( rule__Category__Group_1_3_2__0 )* ) )
            // InternalBudgeting.g:1075:1: ( ( rule__Category__Group_1_3_2__0 )* )
            {
            // InternalBudgeting.g:1075:1: ( ( rule__Category__Group_1_3_2__0 )* )
            // InternalBudgeting.g:1076:1: ( rule__Category__Group_1_3_2__0 )*
            {
             before(grammarAccess.getCategoryAccess().getGroup_1_3_2()); 
            // InternalBudgeting.g:1077:1: ( rule__Category__Group_1_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBudgeting.g:1077:2: rule__Category__Group_1_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Category__Group_1_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCategoryAccess().getGroup_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3__2__Impl"


    // $ANTLR start "rule__Category__Group_1_3__3"
    // InternalBudgeting.g:1087:1: rule__Category__Group_1_3__3 : rule__Category__Group_1_3__3__Impl ;
    public final void rule__Category__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1091:1: ( rule__Category__Group_1_3__3__Impl )
            // InternalBudgeting.g:1092:2: rule__Category__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_1_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3__3"


    // $ANTLR start "rule__Category__Group_1_3__3__Impl"
    // InternalBudgeting.g:1098:1: rule__Category__Group_1_3__3__Impl : ( ']' ) ;
    public final void rule__Category__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1102:1: ( ( ']' ) )
            // InternalBudgeting.g:1103:1: ( ']' )
            {
            // InternalBudgeting.g:1103:1: ( ']' )
            // InternalBudgeting.g:1104:1: ']'
            {
             before(grammarAccess.getCategoryAccess().getRightSquareBracketKeyword_1_3_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getRightSquareBracketKeyword_1_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3__3__Impl"


    // $ANTLR start "rule__Category__Group_1_3_2__0"
    // InternalBudgeting.g:1125:1: rule__Category__Group_1_3_2__0 : rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1 ;
    public final void rule__Category__Group_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1129:1: ( rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1 )
            // InternalBudgeting.g:1130:2: rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Category__Group_1_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_1_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3_2__0"


    // $ANTLR start "rule__Category__Group_1_3_2__0__Impl"
    // InternalBudgeting.g:1137:1: rule__Category__Group_1_3_2__0__Impl : ( ',' ) ;
    public final void rule__Category__Group_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1141:1: ( ( ',' ) )
            // InternalBudgeting.g:1142:1: ( ',' )
            {
            // InternalBudgeting.g:1142:1: ( ',' )
            // InternalBudgeting.g:1143:1: ','
            {
             before(grammarAccess.getCategoryAccess().getCommaKeyword_1_3_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCommaKeyword_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3_2__0__Impl"


    // $ANTLR start "rule__Category__Group_1_3_2__1"
    // InternalBudgeting.g:1156:1: rule__Category__Group_1_3_2__1 : rule__Category__Group_1_3_2__1__Impl ;
    public final void rule__Category__Group_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1160:1: ( rule__Category__Group_1_3_2__1__Impl )
            // InternalBudgeting.g:1161:2: rule__Category__Group_1_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_1_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3_2__1"


    // $ANTLR start "rule__Category__Group_1_3_2__1__Impl"
    // InternalBudgeting.g:1167:1: rule__Category__Group_1_3_2__1__Impl : ( ( rule__Category__PatternsAssignment_1_3_2_1 ) ) ;
    public final void rule__Category__Group_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1171:1: ( ( ( rule__Category__PatternsAssignment_1_3_2_1 ) ) )
            // InternalBudgeting.g:1172:1: ( ( rule__Category__PatternsAssignment_1_3_2_1 ) )
            {
            // InternalBudgeting.g:1172:1: ( ( rule__Category__PatternsAssignment_1_3_2_1 ) )
            // InternalBudgeting.g:1173:1: ( rule__Category__PatternsAssignment_1_3_2_1 )
            {
             before(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_2_1()); 
            // InternalBudgeting.g:1174:1: ( rule__Category__PatternsAssignment_1_3_2_1 )
            // InternalBudgeting.g:1174:2: rule__Category__PatternsAssignment_1_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__PatternsAssignment_1_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_1_3_2__1__Impl"


    // $ANTLR start "rule__Year__Group__0"
    // InternalBudgeting.g:1188:1: rule__Year__Group__0 : rule__Year__Group__0__Impl rule__Year__Group__1 ;
    public final void rule__Year__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1192:1: ( rule__Year__Group__0__Impl rule__Year__Group__1 )
            // InternalBudgeting.g:1193:2: rule__Year__Group__0__Impl rule__Year__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Year__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Year__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__0"


    // $ANTLR start "rule__Year__Group__0__Impl"
    // InternalBudgeting.g:1200:1: rule__Year__Group__0__Impl : ( ( rule__Year__NameAssignment_0 ) ) ;
    public final void rule__Year__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1204:1: ( ( ( rule__Year__NameAssignment_0 ) ) )
            // InternalBudgeting.g:1205:1: ( ( rule__Year__NameAssignment_0 ) )
            {
            // InternalBudgeting.g:1205:1: ( ( rule__Year__NameAssignment_0 ) )
            // InternalBudgeting.g:1206:1: ( rule__Year__NameAssignment_0 )
            {
             before(grammarAccess.getYearAccess().getNameAssignment_0()); 
            // InternalBudgeting.g:1207:1: ( rule__Year__NameAssignment_0 )
            // InternalBudgeting.g:1207:2: rule__Year__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Year__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getYearAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__0__Impl"


    // $ANTLR start "rule__Year__Group__1"
    // InternalBudgeting.g:1217:1: rule__Year__Group__1 : rule__Year__Group__1__Impl rule__Year__Group__2 ;
    public final void rule__Year__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1221:1: ( rule__Year__Group__1__Impl rule__Year__Group__2 )
            // InternalBudgeting.g:1222:2: rule__Year__Group__1__Impl rule__Year__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Year__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Year__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__1"


    // $ANTLR start "rule__Year__Group__1__Impl"
    // InternalBudgeting.g:1229:1: rule__Year__Group__1__Impl : ( 'uses' ) ;
    public final void rule__Year__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1233:1: ( ( 'uses' ) )
            // InternalBudgeting.g:1234:1: ( 'uses' )
            {
            // InternalBudgeting.g:1234:1: ( 'uses' )
            // InternalBudgeting.g:1235:1: 'uses'
            {
             before(grammarAccess.getYearAccess().getUsesKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getYearAccess().getUsesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__1__Impl"


    // $ANTLR start "rule__Year__Group__2"
    // InternalBudgeting.g:1248:1: rule__Year__Group__2 : rule__Year__Group__2__Impl rule__Year__Group__3 ;
    public final void rule__Year__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1252:1: ( rule__Year__Group__2__Impl rule__Year__Group__3 )
            // InternalBudgeting.g:1253:2: rule__Year__Group__2__Impl rule__Year__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Year__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Year__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__2"


    // $ANTLR start "rule__Year__Group__2__Impl"
    // InternalBudgeting.g:1260:1: rule__Year__Group__2__Impl : ( ( rule__Year__LibraryAssignment_2 ) ) ;
    public final void rule__Year__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1264:1: ( ( ( rule__Year__LibraryAssignment_2 ) ) )
            // InternalBudgeting.g:1265:1: ( ( rule__Year__LibraryAssignment_2 ) )
            {
            // InternalBudgeting.g:1265:1: ( ( rule__Year__LibraryAssignment_2 ) )
            // InternalBudgeting.g:1266:1: ( rule__Year__LibraryAssignment_2 )
            {
             before(grammarAccess.getYearAccess().getLibraryAssignment_2()); 
            // InternalBudgeting.g:1267:1: ( rule__Year__LibraryAssignment_2 )
            // InternalBudgeting.g:1267:2: rule__Year__LibraryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Year__LibraryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getYearAccess().getLibraryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__2__Impl"


    // $ANTLR start "rule__Year__Group__3"
    // InternalBudgeting.g:1277:1: rule__Year__Group__3 : rule__Year__Group__3__Impl rule__Year__Group__4 ;
    public final void rule__Year__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1281:1: ( rule__Year__Group__3__Impl rule__Year__Group__4 )
            // InternalBudgeting.g:1282:2: rule__Year__Group__3__Impl rule__Year__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Year__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Year__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__3"


    // $ANTLR start "rule__Year__Group__3__Impl"
    // InternalBudgeting.g:1289:1: rule__Year__Group__3__Impl : ( '{' ) ;
    public final void rule__Year__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1293:1: ( ( '{' ) )
            // InternalBudgeting.g:1294:1: ( '{' )
            {
            // InternalBudgeting.g:1294:1: ( '{' )
            // InternalBudgeting.g:1295:1: '{'
            {
             before(grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__3__Impl"


    // $ANTLR start "rule__Year__Group__4"
    // InternalBudgeting.g:1308:1: rule__Year__Group__4 : rule__Year__Group__4__Impl rule__Year__Group__5 ;
    public final void rule__Year__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1312:1: ( rule__Year__Group__4__Impl rule__Year__Group__5 )
            // InternalBudgeting.g:1313:2: rule__Year__Group__4__Impl rule__Year__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Year__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Year__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__4"


    // $ANTLR start "rule__Year__Group__4__Impl"
    // InternalBudgeting.g:1320:1: rule__Year__Group__4__Impl : ( ( rule__Year__MonthsAssignment_4 )* ) ;
    public final void rule__Year__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1324:1: ( ( ( rule__Year__MonthsAssignment_4 )* ) )
            // InternalBudgeting.g:1325:1: ( ( rule__Year__MonthsAssignment_4 )* )
            {
            // InternalBudgeting.g:1325:1: ( ( rule__Year__MonthsAssignment_4 )* )
            // InternalBudgeting.g:1326:1: ( rule__Year__MonthsAssignment_4 )*
            {
             before(grammarAccess.getYearAccess().getMonthsAssignment_4()); 
            // InternalBudgeting.g:1327:1: ( rule__Year__MonthsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBudgeting.g:1327:2: rule__Year__MonthsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Year__MonthsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getYearAccess().getMonthsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__4__Impl"


    // $ANTLR start "rule__Year__Group__5"
    // InternalBudgeting.g:1337:1: rule__Year__Group__5 : rule__Year__Group__5__Impl ;
    public final void rule__Year__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1341:1: ( rule__Year__Group__5__Impl )
            // InternalBudgeting.g:1342:2: rule__Year__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Year__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__5"


    // $ANTLR start "rule__Year__Group__5__Impl"
    // InternalBudgeting.g:1348:1: rule__Year__Group__5__Impl : ( '}' ) ;
    public final void rule__Year__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1352:1: ( ( '}' ) )
            // InternalBudgeting.g:1353:1: ( '}' )
            {
            // InternalBudgeting.g:1353:1: ( '}' )
            // InternalBudgeting.g:1354:1: '}'
            {
             before(grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__Group__5__Impl"


    // $ANTLR start "rule__Month__Group__0"
    // InternalBudgeting.g:1379:1: rule__Month__Group__0 : rule__Month__Group__0__Impl rule__Month__Group__1 ;
    public final void rule__Month__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1383:1: ( rule__Month__Group__0__Impl rule__Month__Group__1 )
            // InternalBudgeting.g:1384:2: rule__Month__Group__0__Impl rule__Month__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Month__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Month__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__0"


    // $ANTLR start "rule__Month__Group__0__Impl"
    // InternalBudgeting.g:1391:1: rule__Month__Group__0__Impl : ( ( rule__Month__NameAssignment_0 ) ) ;
    public final void rule__Month__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1395:1: ( ( ( rule__Month__NameAssignment_0 ) ) )
            // InternalBudgeting.g:1396:1: ( ( rule__Month__NameAssignment_0 ) )
            {
            // InternalBudgeting.g:1396:1: ( ( rule__Month__NameAssignment_0 ) )
            // InternalBudgeting.g:1397:1: ( rule__Month__NameAssignment_0 )
            {
             before(grammarAccess.getMonthAccess().getNameAssignment_0()); 
            // InternalBudgeting.g:1398:1: ( rule__Month__NameAssignment_0 )
            // InternalBudgeting.g:1398:2: rule__Month__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Month__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMonthAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__0__Impl"


    // $ANTLR start "rule__Month__Group__1"
    // InternalBudgeting.g:1408:1: rule__Month__Group__1 : rule__Month__Group__1__Impl rule__Month__Group__2 ;
    public final void rule__Month__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1412:1: ( rule__Month__Group__1__Impl rule__Month__Group__2 )
            // InternalBudgeting.g:1413:2: rule__Month__Group__1__Impl rule__Month__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Month__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Month__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__1"


    // $ANTLR start "rule__Month__Group__1__Impl"
    // InternalBudgeting.g:1420:1: rule__Month__Group__1__Impl : ( 'budget' ) ;
    public final void rule__Month__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1424:1: ( ( 'budget' ) )
            // InternalBudgeting.g:1425:1: ( 'budget' )
            {
            // InternalBudgeting.g:1425:1: ( 'budget' )
            // InternalBudgeting.g:1426:1: 'budget'
            {
             before(grammarAccess.getMonthAccess().getBudgetKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMonthAccess().getBudgetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__1__Impl"


    // $ANTLR start "rule__Month__Group__2"
    // InternalBudgeting.g:1439:1: rule__Month__Group__2 : rule__Month__Group__2__Impl rule__Month__Group__3 ;
    public final void rule__Month__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1443:1: ( rule__Month__Group__2__Impl rule__Month__Group__3 )
            // InternalBudgeting.g:1444:2: rule__Month__Group__2__Impl rule__Month__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Month__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Month__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__2"


    // $ANTLR start "rule__Month__Group__2__Impl"
    // InternalBudgeting.g:1451:1: rule__Month__Group__2__Impl : ( '{' ) ;
    public final void rule__Month__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1455:1: ( ( '{' ) )
            // InternalBudgeting.g:1456:1: ( '{' )
            {
            // InternalBudgeting.g:1456:1: ( '{' )
            // InternalBudgeting.g:1457:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__2__Impl"


    // $ANTLR start "rule__Month__Group__3"
    // InternalBudgeting.g:1470:1: rule__Month__Group__3 : rule__Month__Group__3__Impl rule__Month__Group__4 ;
    public final void rule__Month__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1474:1: ( rule__Month__Group__3__Impl rule__Month__Group__4 )
            // InternalBudgeting.g:1475:2: rule__Month__Group__3__Impl rule__Month__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Month__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Month__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__3"


    // $ANTLR start "rule__Month__Group__3__Impl"
    // InternalBudgeting.g:1482:1: rule__Month__Group__3__Impl : ( ( rule__Month__BudgetEntriesAssignment_3 )* ) ;
    public final void rule__Month__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1486:1: ( ( ( rule__Month__BudgetEntriesAssignment_3 )* ) )
            // InternalBudgeting.g:1487:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            {
            // InternalBudgeting.g:1487:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            // InternalBudgeting.g:1488:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesAssignment_3()); 
            // InternalBudgeting.g:1489:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBudgeting.g:1489:2: rule__Month__BudgetEntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Month__BudgetEntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMonthAccess().getBudgetEntriesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__3__Impl"


    // $ANTLR start "rule__Month__Group__4"
    // InternalBudgeting.g:1499:1: rule__Month__Group__4 : rule__Month__Group__4__Impl rule__Month__Group__5 ;
    public final void rule__Month__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1503:1: ( rule__Month__Group__4__Impl rule__Month__Group__5 )
            // InternalBudgeting.g:1504:2: rule__Month__Group__4__Impl rule__Month__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Month__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Month__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__4"


    // $ANTLR start "rule__Month__Group__4__Impl"
    // InternalBudgeting.g:1511:1: rule__Month__Group__4__Impl : ( '}' ) ;
    public final void rule__Month__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1515:1: ( ( '}' ) )
            // InternalBudgeting.g:1516:1: ( '}' )
            {
            // InternalBudgeting.g:1516:1: ( '}' )
            // InternalBudgeting.g:1517:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__4__Impl"


    // $ANTLR start "rule__Month__Group__5"
    // InternalBudgeting.g:1530:1: rule__Month__Group__5 : rule__Month__Group__5__Impl rule__Month__Group__6 ;
    public final void rule__Month__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1534:1: ( rule__Month__Group__5__Impl rule__Month__Group__6 )
            // InternalBudgeting.g:1535:2: rule__Month__Group__5__Impl rule__Month__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Month__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Month__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__5"


    // $ANTLR start "rule__Month__Group__5__Impl"
    // InternalBudgeting.g:1542:1: rule__Month__Group__5__Impl : ( 'actual' ) ;
    public final void rule__Month__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1546:1: ( ( 'actual' ) )
            // InternalBudgeting.g:1547:1: ( 'actual' )
            {
            // InternalBudgeting.g:1547:1: ( 'actual' )
            // InternalBudgeting.g:1548:1: 'actual'
            {
             before(grammarAccess.getMonthAccess().getActualKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMonthAccess().getActualKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__5__Impl"


    // $ANTLR start "rule__Month__Group__6"
    // InternalBudgeting.g:1561:1: rule__Month__Group__6 : rule__Month__Group__6__Impl rule__Month__Group__7 ;
    public final void rule__Month__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1565:1: ( rule__Month__Group__6__Impl rule__Month__Group__7 )
            // InternalBudgeting.g:1566:2: rule__Month__Group__6__Impl rule__Month__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Month__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Month__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__6"


    // $ANTLR start "rule__Month__Group__6__Impl"
    // InternalBudgeting.g:1573:1: rule__Month__Group__6__Impl : ( '{' ) ;
    public final void rule__Month__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1577:1: ( ( '{' ) )
            // InternalBudgeting.g:1578:1: ( '{' )
            {
            // InternalBudgeting.g:1578:1: ( '{' )
            // InternalBudgeting.g:1579:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__6__Impl"


    // $ANTLR start "rule__Month__Group__7"
    // InternalBudgeting.g:1592:1: rule__Month__Group__7 : rule__Month__Group__7__Impl rule__Month__Group__8 ;
    public final void rule__Month__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1596:1: ( rule__Month__Group__7__Impl rule__Month__Group__8 )
            // InternalBudgeting.g:1597:2: rule__Month__Group__7__Impl rule__Month__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Month__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Month__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__7"


    // $ANTLR start "rule__Month__Group__7__Impl"
    // InternalBudgeting.g:1604:1: rule__Month__Group__7__Impl : ( ( rule__Month__ActualEntriesAssignment_7 )* ) ;
    public final void rule__Month__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1608:1: ( ( ( rule__Month__ActualEntriesAssignment_7 )* ) )
            // InternalBudgeting.g:1609:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            {
            // InternalBudgeting.g:1609:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            // InternalBudgeting.g:1610:1: ( rule__Month__ActualEntriesAssignment_7 )*
            {
             before(grammarAccess.getMonthAccess().getActualEntriesAssignment_7()); 
            // InternalBudgeting.g:1611:1: ( rule__Month__ActualEntriesAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBudgeting.g:1611:2: rule__Month__ActualEntriesAssignment_7
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Month__ActualEntriesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMonthAccess().getActualEntriesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__7__Impl"


    // $ANTLR start "rule__Month__Group__8"
    // InternalBudgeting.g:1621:1: rule__Month__Group__8 : rule__Month__Group__8__Impl ;
    public final void rule__Month__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1625:1: ( rule__Month__Group__8__Impl )
            // InternalBudgeting.g:1626:2: rule__Month__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Month__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__8"


    // $ANTLR start "rule__Month__Group__8__Impl"
    // InternalBudgeting.g:1632:1: rule__Month__Group__8__Impl : ( '}' ) ;
    public final void rule__Month__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1636:1: ( ( '}' ) )
            // InternalBudgeting.g:1637:1: ( '}' )
            {
            // InternalBudgeting.g:1637:1: ( '}' )
            // InternalBudgeting.g:1638:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__Group__8__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_0__0"
    // InternalBudgeting.g:1669:1: rule__BudgetEntry__Group_0__0 : rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 ;
    public final void rule__BudgetEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1673:1: ( rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 )
            // InternalBudgeting.g:1674:2: rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__BudgetEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_0__0"


    // $ANTLR start "rule__BudgetEntry__Group_0__0__Impl"
    // InternalBudgeting.g:1681:1: rule__BudgetEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1685:1: ( ( () ) )
            // InternalBudgeting.g:1686:1: ( () )
            {
            // InternalBudgeting.g:1686:1: ( () )
            // InternalBudgeting.g:1687:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0()); 
            // InternalBudgeting.g:1688:1: ()
            // InternalBudgeting.g:1690:1: 
            {
            }

             after(grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_0__0__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_0__1"
    // InternalBudgeting.g:1700:1: rule__BudgetEntry__Group_0__1 : rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 ;
    public final void rule__BudgetEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1704:1: ( rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 )
            // InternalBudgeting.g:1705:2: rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__BudgetEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_0__1"


    // $ANTLR start "rule__BudgetEntry__Group_0__1__Impl"
    // InternalBudgeting.g:1712:1: rule__BudgetEntry__Group_0__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__BudgetEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1716:1: ( ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) )
            // InternalBudgeting.g:1717:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            {
            // InternalBudgeting.g:1717:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            // InternalBudgeting.g:1718:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_0_1()); 
            // InternalBudgeting.g:1719:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            // InternalBudgeting.g:1719:2: rule__BudgetEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BudgetEntry__CategoryAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_0__1__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_0__2"
    // InternalBudgeting.g:1729:1: rule__BudgetEntry__Group_0__2 : rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 ;
    public final void rule__BudgetEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1733:1: ( rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 )
            // InternalBudgeting.g:1734:2: rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3
            {
            pushFollow(FOLLOW_21);
            rule__BudgetEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_0__2"


    // $ANTLR start "rule__BudgetEntry__Group_0__2__Impl"
    // InternalBudgeting.g:1741:1: rule__BudgetEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1745:1: ( ( ':' ) )
            // InternalBudgeting.g:1746:1: ( ':' )
            {
            // InternalBudgeting.g:1746:1: ( ':' )
            // InternalBudgeting.g:1747:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_0__2__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_0__3"
    // InternalBudgeting.g:1760:1: rule__BudgetEntry__Group_0__3 : rule__BudgetEntry__Group_0__3__Impl ;
    public final void rule__BudgetEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1764:1: ( rule__BudgetEntry__Group_0__3__Impl )
            // InternalBudgeting.g:1765:2: rule__BudgetEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_0__3"


    // $ANTLR start "rule__BudgetEntry__Group_0__3__Impl"
    // InternalBudgeting.g:1771:1: rule__BudgetEntry__Group_0__3__Impl : ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__BudgetEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1775:1: ( ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) )
            // InternalBudgeting.g:1776:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            {
            // InternalBudgeting.g:1776:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            // InternalBudgeting.g:1777:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountAssignment_0_3()); 
            // InternalBudgeting.g:1778:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            // InternalBudgeting.g:1778:2: rule__BudgetEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__BudgetEntry__AmountAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getBudgetEntryAccess().getAmountAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_0__3__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_1__0"
    // InternalBudgeting.g:1796:1: rule__BudgetEntry__Group_1__0 : rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 ;
    public final void rule__BudgetEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1800:1: ( rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 )
            // InternalBudgeting.g:1801:2: rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__BudgetEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__0"


    // $ANTLR start "rule__BudgetEntry__Group_1__0__Impl"
    // InternalBudgeting.g:1808:1: rule__BudgetEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1812:1: ( ( () ) )
            // InternalBudgeting.g:1813:1: ( () )
            {
            // InternalBudgeting.g:1813:1: ( () )
            // InternalBudgeting.g:1814:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0()); 
            // InternalBudgeting.g:1815:1: ()
            // InternalBudgeting.g:1817:1: 
            {
            }

             after(grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__0__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_1__1"
    // InternalBudgeting.g:1827:1: rule__BudgetEntry__Group_1__1 : rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 ;
    public final void rule__BudgetEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1831:1: ( rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 )
            // InternalBudgeting.g:1832:2: rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__BudgetEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__1"


    // $ANTLR start "rule__BudgetEntry__Group_1__1__Impl"
    // InternalBudgeting.g:1839:1: rule__BudgetEntry__Group_1__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__BudgetEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1843:1: ( ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) )
            // InternalBudgeting.g:1844:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            {
            // InternalBudgeting.g:1844:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            // InternalBudgeting.g:1845:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_1_1()); 
            // InternalBudgeting.g:1846:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            // InternalBudgeting.g:1846:2: rule__BudgetEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BudgetEntry__CategoryAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__1__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_1__2"
    // InternalBudgeting.g:1856:1: rule__BudgetEntry__Group_1__2 : rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 ;
    public final void rule__BudgetEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1860:1: ( rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 )
            // InternalBudgeting.g:1861:2: rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__BudgetEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__2"


    // $ANTLR start "rule__BudgetEntry__Group_1__2__Impl"
    // InternalBudgeting.g:1868:1: rule__BudgetEntry__Group_1__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1872:1: ( ( ':' ) )
            // InternalBudgeting.g:1873:1: ( ':' )
            {
            // InternalBudgeting.g:1873:1: ( ':' )
            // InternalBudgeting.g:1874:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__2__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_1__3"
    // InternalBudgeting.g:1887:1: rule__BudgetEntry__Group_1__3 : rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 ;
    public final void rule__BudgetEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1891:1: ( rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 )
            // InternalBudgeting.g:1892:2: rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4
            {
            pushFollow(FOLLOW_22);
            rule__BudgetEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__3"


    // $ANTLR start "rule__BudgetEntry__Group_1__3__Impl"
    // InternalBudgeting.g:1899:1: rule__BudgetEntry__Group_1__3__Impl : ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) ;
    public final void rule__BudgetEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1903:1: ( ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) )
            // InternalBudgeting.g:1904:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            {
            // InternalBudgeting.g:1904:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            // InternalBudgeting.g:1905:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryAssignment_1_3()); 
            // InternalBudgeting.g:1906:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            // InternalBudgeting.g:1906:2: rule__BudgetEntry__BaseEntryAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__BudgetEntry__BaseEntryAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getBudgetEntryAccess().getBaseEntryAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__3__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_1__4"
    // InternalBudgeting.g:1916:1: rule__BudgetEntry__Group_1__4 : rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 ;
    public final void rule__BudgetEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1920:1: ( rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 )
            // InternalBudgeting.g:1921:2: rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5
            {
            pushFollow(FOLLOW_23);
            rule__BudgetEntry__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__4"


    // $ANTLR start "rule__BudgetEntry__Group_1__4__Impl"
    // InternalBudgeting.g:1928:1: rule__BudgetEntry__Group_1__4__Impl : ( '*' ) ;
    public final void rule__BudgetEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1932:1: ( ( '*' ) )
            // InternalBudgeting.g:1933:1: ( '*' )
            {
            // InternalBudgeting.g:1933:1: ( '*' )
            // InternalBudgeting.g:1934:1: '*'
            {
             before(grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__4__Impl"


    // $ANTLR start "rule__BudgetEntry__Group_1__5"
    // InternalBudgeting.g:1947:1: rule__BudgetEntry__Group_1__5 : rule__BudgetEntry__Group_1__5__Impl ;
    public final void rule__BudgetEntry__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1951:1: ( rule__BudgetEntry__Group_1__5__Impl )
            // InternalBudgeting.g:1952:2: rule__BudgetEntry__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BudgetEntry__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__5"


    // $ANTLR start "rule__BudgetEntry__Group_1__5__Impl"
    // InternalBudgeting.g:1958:1: rule__BudgetEntry__Group_1__5__Impl : ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) ;
    public final void rule__BudgetEntry__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1962:1: ( ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) )
            // InternalBudgeting.g:1963:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            {
            // InternalBudgeting.g:1963:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            // InternalBudgeting.g:1964:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorAssignment_1_5()); 
            // InternalBudgeting.g:1965:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            // InternalBudgeting.g:1965:2: rule__BudgetEntry__FactorAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__BudgetEntry__FactorAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getBudgetEntryAccess().getFactorAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__Group_1__5__Impl"


    // $ANTLR start "rule__ActualEntry__Group_0__0"
    // InternalBudgeting.g:1987:1: rule__ActualEntry__Group_0__0 : rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 ;
    public final void rule__ActualEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:1991:1: ( rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 )
            // InternalBudgeting.g:1992:2: rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ActualEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_0__0"


    // $ANTLR start "rule__ActualEntry__Group_0__0__Impl"
    // InternalBudgeting.g:1999:1: rule__ActualEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2003:1: ( ( () ) )
            // InternalBudgeting.g:2004:1: ( () )
            {
            // InternalBudgeting.g:2004:1: ( () )
            // InternalBudgeting.g:2005:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0()); 
            // InternalBudgeting.g:2006:1: ()
            // InternalBudgeting.g:2008:1: 
            {
            }

             after(grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_0__0__Impl"


    // $ANTLR start "rule__ActualEntry__Group_0__1"
    // InternalBudgeting.g:2018:1: rule__ActualEntry__Group_0__1 : rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 ;
    public final void rule__ActualEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2022:1: ( rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 )
            // InternalBudgeting.g:2023:2: rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__ActualEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_0__1"


    // $ANTLR start "rule__ActualEntry__Group_0__1__Impl"
    // InternalBudgeting.g:2030:1: rule__ActualEntry__Group_0__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__ActualEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2034:1: ( ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) )
            // InternalBudgeting.g:2035:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            {
            // InternalBudgeting.g:2035:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            // InternalBudgeting.g:2036:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_0_1()); 
            // InternalBudgeting.g:2037:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            // InternalBudgeting.g:2037:2: rule__ActualEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ActualEntry__CategoryAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getCategoryAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_0__1__Impl"


    // $ANTLR start "rule__ActualEntry__Group_0__2"
    // InternalBudgeting.g:2047:1: rule__ActualEntry__Group_0__2 : rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 ;
    public final void rule__ActualEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2051:1: ( rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 )
            // InternalBudgeting.g:2052:2: rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3
            {
            pushFollow(FOLLOW_21);
            rule__ActualEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_0__2"


    // $ANTLR start "rule__ActualEntry__Group_0__2__Impl"
    // InternalBudgeting.g:2059:1: rule__ActualEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__ActualEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2063:1: ( ( ':' ) )
            // InternalBudgeting.g:2064:1: ( ':' )
            {
            // InternalBudgeting.g:2064:1: ( ':' )
            // InternalBudgeting.g:2065:1: ':'
            {
             before(grammarAccess.getActualEntryAccess().getColonKeyword_0_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActualEntryAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_0__2__Impl"


    // $ANTLR start "rule__ActualEntry__Group_0__3"
    // InternalBudgeting.g:2078:1: rule__ActualEntry__Group_0__3 : rule__ActualEntry__Group_0__3__Impl ;
    public final void rule__ActualEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2082:1: ( rule__ActualEntry__Group_0__3__Impl )
            // InternalBudgeting.g:2083:2: rule__ActualEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_0__3"


    // $ANTLR start "rule__ActualEntry__Group_0__3__Impl"
    // InternalBudgeting.g:2089:1: rule__ActualEntry__Group_0__3__Impl : ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__ActualEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2093:1: ( ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) )
            // InternalBudgeting.g:2094:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            {
            // InternalBudgeting.g:2094:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            // InternalBudgeting.g:2095:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getActualEntryAccess().getAmountAssignment_0_3()); 
            // InternalBudgeting.g:2096:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            // InternalBudgeting.g:2096:2: rule__ActualEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ActualEntry__AmountAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getAmountAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_0__3__Impl"


    // $ANTLR start "rule__ActualEntry__Group_1__0"
    // InternalBudgeting.g:2114:1: rule__ActualEntry__Group_1__0 : rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 ;
    public final void rule__ActualEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2118:1: ( rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 )
            // InternalBudgeting.g:2119:2: rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ActualEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__0"


    // $ANTLR start "rule__ActualEntry__Group_1__0__Impl"
    // InternalBudgeting.g:2126:1: rule__ActualEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2130:1: ( ( () ) )
            // InternalBudgeting.g:2131:1: ( () )
            {
            // InternalBudgeting.g:2131:1: ( () )
            // InternalBudgeting.g:2132:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0()); 
            // InternalBudgeting.g:2133:1: ()
            // InternalBudgeting.g:2135:1: 
            {
            }

             after(grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__0__Impl"


    // $ANTLR start "rule__ActualEntry__Group_1__1"
    // InternalBudgeting.g:2145:1: rule__ActualEntry__Group_1__1 : rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 ;
    public final void rule__ActualEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2149:1: ( rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 )
            // InternalBudgeting.g:2150:2: rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__ActualEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__1"


    // $ANTLR start "rule__ActualEntry__Group_1__1__Impl"
    // InternalBudgeting.g:2157:1: rule__ActualEntry__Group_1__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__ActualEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2161:1: ( ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) )
            // InternalBudgeting.g:2162:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            {
            // InternalBudgeting.g:2162:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            // InternalBudgeting.g:2163:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_1_1()); 
            // InternalBudgeting.g:2164:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            // InternalBudgeting.g:2164:2: rule__ActualEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ActualEntry__CategoryAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getCategoryAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__1__Impl"


    // $ANTLR start "rule__ActualEntry__Group_1__2"
    // InternalBudgeting.g:2174:1: rule__ActualEntry__Group_1__2 : rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 ;
    public final void rule__ActualEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2178:1: ( rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 )
            // InternalBudgeting.g:2179:2: rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3
            {
            pushFollow(FOLLOW_24);
            rule__ActualEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__2"


    // $ANTLR start "rule__ActualEntry__Group_1__2__Impl"
    // InternalBudgeting.g:2186:1: rule__ActualEntry__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ActualEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2190:1: ( ( '{' ) )
            // InternalBudgeting.g:2191:1: ( '{' )
            {
            // InternalBudgeting.g:2191:1: ( '{' )
            // InternalBudgeting.g:2192:1: '{'
            {
             before(grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__2__Impl"


    // $ANTLR start "rule__ActualEntry__Group_1__3"
    // InternalBudgeting.g:2205:1: rule__ActualEntry__Group_1__3 : rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 ;
    public final void rule__ActualEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2209:1: ( rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 )
            // InternalBudgeting.g:2210:2: rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4
            {
            pushFollow(FOLLOW_25);
            rule__ActualEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__3"


    // $ANTLR start "rule__ActualEntry__Group_1__3__Impl"
    // InternalBudgeting.g:2217:1: rule__ActualEntry__Group_1__3__Impl : ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) ;
    public final void rule__ActualEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2221:1: ( ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) )
            // InternalBudgeting.g:2222:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            {
            // InternalBudgeting.g:2222:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            // InternalBudgeting.g:2223:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            {
            // InternalBudgeting.g:2223:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) )
            // InternalBudgeting.g:2224:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // InternalBudgeting.g:2225:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            // InternalBudgeting.g:2225:2: rule__ActualEntry__TransactionsAssignment_1_3
            {
            pushFollow(FOLLOW_26);
            rule__ActualEntry__TransactionsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 

            }

            // InternalBudgeting.g:2228:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            // InternalBudgeting.g:2229:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // InternalBudgeting.g:2230:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBudgeting.g:2230:2: rule__ActualEntry__TransactionsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ActualEntry__TransactionsAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 

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
    // $ANTLR end "rule__ActualEntry__Group_1__3__Impl"


    // $ANTLR start "rule__ActualEntry__Group_1__4"
    // InternalBudgeting.g:2241:1: rule__ActualEntry__Group_1__4 : rule__ActualEntry__Group_1__4__Impl ;
    public final void rule__ActualEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2245:1: ( rule__ActualEntry__Group_1__4__Impl )
            // InternalBudgeting.g:2246:2: rule__ActualEntry__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActualEntry__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__4"


    // $ANTLR start "rule__ActualEntry__Group_1__4__Impl"
    // InternalBudgeting.g:2252:1: rule__ActualEntry__Group_1__4__Impl : ( '}' ) ;
    public final void rule__ActualEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2256:1: ( ( '}' ) )
            // InternalBudgeting.g:2257:1: ( '}' )
            {
            // InternalBudgeting.g:2257:1: ( '}' )
            // InternalBudgeting.g:2258:1: '}'
            {
             before(grammarAccess.getActualEntryAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActualEntryAccess().getRightCurlyBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__Group_1__4__Impl"


    // $ANTLR start "rule__Transaction__Group_0__0"
    // InternalBudgeting.g:2281:1: rule__Transaction__Group_0__0 : rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 ;
    public final void rule__Transaction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2285:1: ( rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 )
            // InternalBudgeting.g:2286:2: rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Transaction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0__0"


    // $ANTLR start "rule__Transaction__Group_0__0__Impl"
    // InternalBudgeting.g:2293:1: rule__Transaction__Group_0__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2297:1: ( ( () ) )
            // InternalBudgeting.g:2298:1: ( () )
            {
            // InternalBudgeting.g:2298:1: ( () )
            // InternalBudgeting.g:2299:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCashTransactionAction_0_0()); 
            // InternalBudgeting.g:2300:1: ()
            // InternalBudgeting.g:2302:1: 
            {
            }

             after(grammarAccess.getTransactionAccess().getCashTransactionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0__0__Impl"


    // $ANTLR start "rule__Transaction__Group_0__1"
    // InternalBudgeting.g:2312:1: rule__Transaction__Group_0__1 : rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 ;
    public final void rule__Transaction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2316:1: ( rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 )
            // InternalBudgeting.g:2317:2: rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__Transaction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0__1"


    // $ANTLR start "rule__Transaction__Group_0__1__Impl"
    // InternalBudgeting.g:2324:1: rule__Transaction__Group_0__1__Impl : ( 'cash' ) ;
    public final void rule__Transaction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2328:1: ( ( 'cash' ) )
            // InternalBudgeting.g:2329:1: ( 'cash' )
            {
            // InternalBudgeting.g:2329:1: ( 'cash' )
            // InternalBudgeting.g:2330:1: 'cash'
            {
             before(grammarAccess.getTransactionAccess().getCashKeyword_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getCashKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0__1__Impl"


    // $ANTLR start "rule__Transaction__Group_0__2"
    // InternalBudgeting.g:2343:1: rule__Transaction__Group_0__2 : rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 ;
    public final void rule__Transaction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2347:1: ( rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 )
            // InternalBudgeting.g:2348:2: rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3
            {
            pushFollow(FOLLOW_28);
            rule__Transaction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0__2"


    // $ANTLR start "rule__Transaction__Group_0__2__Impl"
    // InternalBudgeting.g:2355:1: rule__Transaction__Group_0__2__Impl : ( ( rule__Transaction__AmountAssignment_0_2 ) ) ;
    public final void rule__Transaction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2359:1: ( ( ( rule__Transaction__AmountAssignment_0_2 ) ) )
            // InternalBudgeting.g:2360:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            {
            // InternalBudgeting.g:2360:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            // InternalBudgeting.g:2361:1: ( rule__Transaction__AmountAssignment_0_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_0_2()); 
            // InternalBudgeting.g:2362:1: ( rule__Transaction__AmountAssignment_0_2 )
            // InternalBudgeting.g:2362:2: rule__Transaction__AmountAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__AmountAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getAmountAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0__2__Impl"


    // $ANTLR start "rule__Transaction__Group_0__3"
    // InternalBudgeting.g:2372:1: rule__Transaction__Group_0__3 : rule__Transaction__Group_0__3__Impl ;
    public final void rule__Transaction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2376:1: ( rule__Transaction__Group_0__3__Impl )
            // InternalBudgeting.g:2377:2: rule__Transaction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0__3"


    // $ANTLR start "rule__Transaction__Group_0__3__Impl"
    // InternalBudgeting.g:2383:1: rule__Transaction__Group_0__3__Impl : ( ( rule__Transaction__Group_0_3__0 )? ) ;
    public final void rule__Transaction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2387:1: ( ( ( rule__Transaction__Group_0_3__0 )? ) )
            // InternalBudgeting.g:2388:1: ( ( rule__Transaction__Group_0_3__0 )? )
            {
            // InternalBudgeting.g:2388:1: ( ( rule__Transaction__Group_0_3__0 )? )
            // InternalBudgeting.g:2389:1: ( rule__Transaction__Group_0_3__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_0_3()); 
            // InternalBudgeting.g:2390:1: ( rule__Transaction__Group_0_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBudgeting.g:2390:2: rule__Transaction__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transaction__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0__3__Impl"


    // $ANTLR start "rule__Transaction__Group_0_3__0"
    // InternalBudgeting.g:2408:1: rule__Transaction__Group_0_3__0 : rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 ;
    public final void rule__Transaction__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2412:1: ( rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 )
            // InternalBudgeting.g:2413:2: rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Transaction__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0_3__0"


    // $ANTLR start "rule__Transaction__Group_0_3__0__Impl"
    // InternalBudgeting.g:2420:1: rule__Transaction__Group_0_3__0__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2424:1: ( ( 'on' ) )
            // InternalBudgeting.g:2425:1: ( 'on' )
            {
            // InternalBudgeting.g:2425:1: ( 'on' )
            // InternalBudgeting.g:2426:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_0_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getOnKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0_3__0__Impl"


    // $ANTLR start "rule__Transaction__Group_0_3__1"
    // InternalBudgeting.g:2439:1: rule__Transaction__Group_0_3__1 : rule__Transaction__Group_0_3__1__Impl ;
    public final void rule__Transaction__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2443:1: ( rule__Transaction__Group_0_3__1__Impl )
            // InternalBudgeting.g:2444:2: rule__Transaction__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0_3__1"


    // $ANTLR start "rule__Transaction__Group_0_3__1__Impl"
    // InternalBudgeting.g:2450:1: rule__Transaction__Group_0_3__1__Impl : ( ( rule__Transaction__DayAssignment_0_3_1 ) ) ;
    public final void rule__Transaction__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2454:1: ( ( ( rule__Transaction__DayAssignment_0_3_1 ) ) )
            // InternalBudgeting.g:2455:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            {
            // InternalBudgeting.g:2455:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            // InternalBudgeting.g:2456:1: ( rule__Transaction__DayAssignment_0_3_1 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_0_3_1()); 
            // InternalBudgeting.g:2457:1: ( rule__Transaction__DayAssignment_0_3_1 )
            // InternalBudgeting.g:2457:2: rule__Transaction__DayAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__DayAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getDayAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_0_3__1__Impl"


    // $ANTLR start "rule__Transaction__Group_1__0"
    // InternalBudgeting.g:2471:1: rule__Transaction__Group_1__0 : rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 ;
    public final void rule__Transaction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2475:1: ( rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 )
            // InternalBudgeting.g:2476:2: rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Transaction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__0"


    // $ANTLR start "rule__Transaction__Group_1__0__Impl"
    // InternalBudgeting.g:2483:1: rule__Transaction__Group_1__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2487:1: ( ( () ) )
            // InternalBudgeting.g:2488:1: ( () )
            {
            // InternalBudgeting.g:2488:1: ( () )
            // InternalBudgeting.g:2489:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCardTransactionAction_1_0()); 
            // InternalBudgeting.g:2490:1: ()
            // InternalBudgeting.g:2492:1: 
            {
            }

             after(grammarAccess.getTransactionAccess().getCardTransactionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__0__Impl"


    // $ANTLR start "rule__Transaction__Group_1__1"
    // InternalBudgeting.g:2502:1: rule__Transaction__Group_1__1 : rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 ;
    public final void rule__Transaction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2506:1: ( rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 )
            // InternalBudgeting.g:2507:2: rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Transaction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__1"


    // $ANTLR start "rule__Transaction__Group_1__1__Impl"
    // InternalBudgeting.g:2514:1: rule__Transaction__Group_1__1__Impl : ( 'card' ) ;
    public final void rule__Transaction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2518:1: ( ( 'card' ) )
            // InternalBudgeting.g:2519:1: ( 'card' )
            {
            // InternalBudgeting.g:2519:1: ( 'card' )
            // InternalBudgeting.g:2520:1: 'card'
            {
             before(grammarAccess.getTransactionAccess().getCardKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getCardKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__1__Impl"


    // $ANTLR start "rule__Transaction__Group_1__2"
    // InternalBudgeting.g:2533:1: rule__Transaction__Group_1__2 : rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 ;
    public final void rule__Transaction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2537:1: ( rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 )
            // InternalBudgeting.g:2538:2: rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__Transaction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__2"


    // $ANTLR start "rule__Transaction__Group_1__2__Impl"
    // InternalBudgeting.g:2545:1: rule__Transaction__Group_1__2__Impl : ( ( rule__Transaction__AmountAssignment_1_2 ) ) ;
    public final void rule__Transaction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2549:1: ( ( ( rule__Transaction__AmountAssignment_1_2 ) ) )
            // InternalBudgeting.g:2550:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            {
            // InternalBudgeting.g:2550:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            // InternalBudgeting.g:2551:1: ( rule__Transaction__AmountAssignment_1_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_1_2()); 
            // InternalBudgeting.g:2552:1: ( rule__Transaction__AmountAssignment_1_2 )
            // InternalBudgeting.g:2552:2: rule__Transaction__AmountAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__AmountAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getAmountAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__2__Impl"


    // $ANTLR start "rule__Transaction__Group_1__3"
    // InternalBudgeting.g:2562:1: rule__Transaction__Group_1__3 : rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 ;
    public final void rule__Transaction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2566:1: ( rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 )
            // InternalBudgeting.g:2567:2: rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4
            {
            pushFollow(FOLLOW_29);
            rule__Transaction__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__3"


    // $ANTLR start "rule__Transaction__Group_1__3__Impl"
    // InternalBudgeting.g:2574:1: rule__Transaction__Group_1__3__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2578:1: ( ( 'on' ) )
            // InternalBudgeting.g:2579:1: ( 'on' )
            {
            // InternalBudgeting.g:2579:1: ( 'on' )
            // InternalBudgeting.g:2580:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_1_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getOnKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__3__Impl"


    // $ANTLR start "rule__Transaction__Group_1__4"
    // InternalBudgeting.g:2593:1: rule__Transaction__Group_1__4 : rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 ;
    public final void rule__Transaction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2597:1: ( rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 )
            // InternalBudgeting.g:2598:2: rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5
            {
            pushFollow(FOLLOW_30);
            rule__Transaction__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__4"


    // $ANTLR start "rule__Transaction__Group_1__4__Impl"
    // InternalBudgeting.g:2605:1: rule__Transaction__Group_1__4__Impl : ( ( rule__Transaction__DayAssignment_1_4 ) ) ;
    public final void rule__Transaction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2609:1: ( ( ( rule__Transaction__DayAssignment_1_4 ) ) )
            // InternalBudgeting.g:2610:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            {
            // InternalBudgeting.g:2610:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            // InternalBudgeting.g:2611:1: ( rule__Transaction__DayAssignment_1_4 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_1_4()); 
            // InternalBudgeting.g:2612:1: ( rule__Transaction__DayAssignment_1_4 )
            // InternalBudgeting.g:2612:2: rule__Transaction__DayAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__DayAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getDayAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__4__Impl"


    // $ANTLR start "rule__Transaction__Group_1__5"
    // InternalBudgeting.g:2622:1: rule__Transaction__Group_1__5 : rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 ;
    public final void rule__Transaction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2626:1: ( rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 )
            // InternalBudgeting.g:2627:2: rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6
            {
            pushFollow(FOLLOW_10);
            rule__Transaction__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__5"


    // $ANTLR start "rule__Transaction__Group_1__5__Impl"
    // InternalBudgeting.g:2634:1: rule__Transaction__Group_1__5__Impl : ( 'from' ) ;
    public final void rule__Transaction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2638:1: ( ( 'from' ) )
            // InternalBudgeting.g:2639:1: ( 'from' )
            {
            // InternalBudgeting.g:2639:1: ( 'from' )
            // InternalBudgeting.g:2640:1: 'from'
            {
             before(grammarAccess.getTransactionAccess().getFromKeyword_1_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getFromKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__5__Impl"


    // $ANTLR start "rule__Transaction__Group_1__6"
    // InternalBudgeting.g:2653:1: rule__Transaction__Group_1__6 : rule__Transaction__Group_1__6__Impl ;
    public final void rule__Transaction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2657:1: ( rule__Transaction__Group_1__6__Impl )
            // InternalBudgeting.g:2658:2: rule__Transaction__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__6"


    // $ANTLR start "rule__Transaction__Group_1__6__Impl"
    // InternalBudgeting.g:2664:1: rule__Transaction__Group_1__6__Impl : ( ( rule__Transaction__FromAssignment_1_6 ) ) ;
    public final void rule__Transaction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2668:1: ( ( ( rule__Transaction__FromAssignment_1_6 ) ) )
            // InternalBudgeting.g:2669:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            {
            // InternalBudgeting.g:2669:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            // InternalBudgeting.g:2670:1: ( rule__Transaction__FromAssignment_1_6 )
            {
             before(grammarAccess.getTransactionAccess().getFromAssignment_1_6()); 
            // InternalBudgeting.g:2671:1: ( rule__Transaction__FromAssignment_1_6 )
            // InternalBudgeting.g:2671:2: rule__Transaction__FromAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__FromAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getFromAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__6__Impl"


    // $ANTLR start "rule__Library__NameAssignment_1"
    // InternalBudgeting.g:2696:1: rule__Library__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Library__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2700:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:2701:1: ( RULE_ID )
            {
            // InternalBudgeting.g:2701:1: ( RULE_ID )
            // InternalBudgeting.g:2702:1: RULE_ID
            {
             before(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__NameAssignment_1"


    // $ANTLR start "rule__Library__CategoriesAssignment_3"
    // InternalBudgeting.g:2711:1: rule__Library__CategoriesAssignment_3 : ( ruleCategory ) ;
    public final void rule__Library__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2715:1: ( ( ruleCategory ) )
            // InternalBudgeting.g:2716:1: ( ruleCategory )
            {
            // InternalBudgeting.g:2716:1: ( ruleCategory )
            // InternalBudgeting.g:2717:1: ruleCategory
            {
             before(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__CategoriesAssignment_3"


    // $ANTLR start "rule__Category__NameAssignment_0_2"
    // InternalBudgeting.g:2726:1: rule__Category__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2730:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:2731:1: ( RULE_ID )
            {
            // InternalBudgeting.g:2731:1: ( RULE_ID )
            // InternalBudgeting.g:2732:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__NameAssignment_0_2"


    // $ANTLR start "rule__Category__NameAssignment_1_2"
    // InternalBudgeting.g:2741:1: rule__Category__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2745:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:2746:1: ( RULE_ID )
            {
            // InternalBudgeting.g:2746:1: ( RULE_ID )
            // InternalBudgeting.g:2747:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__NameAssignment_1_2"


    // $ANTLR start "rule__Category__PatternsAssignment_1_3_1"
    // InternalBudgeting.g:2756:1: rule__Category__PatternsAssignment_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Category__PatternsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2760:1: ( ( RULE_STRING ) )
            // InternalBudgeting.g:2761:1: ( RULE_STRING )
            {
            // InternalBudgeting.g:2761:1: ( RULE_STRING )
            // InternalBudgeting.g:2762:1: RULE_STRING
            {
             before(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__PatternsAssignment_1_3_1"


    // $ANTLR start "rule__Category__PatternsAssignment_1_3_2_1"
    // InternalBudgeting.g:2771:1: rule__Category__PatternsAssignment_1_3_2_1 : ( RULE_STRING ) ;
    public final void rule__Category__PatternsAssignment_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2775:1: ( ( RULE_STRING ) )
            // InternalBudgeting.g:2776:1: ( RULE_STRING )
            {
            // InternalBudgeting.g:2776:1: ( RULE_STRING )
            // InternalBudgeting.g:2777:1: RULE_STRING
            {
             before(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__PatternsAssignment_1_3_2_1"


    // $ANTLR start "rule__Year__NameAssignment_0"
    // InternalBudgeting.g:2786:1: rule__Year__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__Year__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2790:1: ( ( RULE_INT ) )
            // InternalBudgeting.g:2791:1: ( RULE_INT )
            {
            // InternalBudgeting.g:2791:1: ( RULE_INT )
            // InternalBudgeting.g:2792:1: RULE_INT
            {
             before(grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__NameAssignment_0"


    // $ANTLR start "rule__Year__LibraryAssignment_2"
    // InternalBudgeting.g:2801:1: rule__Year__LibraryAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Year__LibraryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2805:1: ( ( ( RULE_ID ) ) )
            // InternalBudgeting.g:2806:1: ( ( RULE_ID ) )
            {
            // InternalBudgeting.g:2806:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:2807:1: ( RULE_ID )
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
            // InternalBudgeting.g:2808:1: ( RULE_ID )
            // InternalBudgeting.g:2809:1: RULE_ID
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getYearAccess().getLibraryLibraryIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__LibraryAssignment_2"


    // $ANTLR start "rule__Year__MonthsAssignment_4"
    // InternalBudgeting.g:2820:1: rule__Year__MonthsAssignment_4 : ( ruleMonth ) ;
    public final void rule__Year__MonthsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2824:1: ( ( ruleMonth ) )
            // InternalBudgeting.g:2825:1: ( ruleMonth )
            {
            // InternalBudgeting.g:2825:1: ( ruleMonth )
            // InternalBudgeting.g:2826:1: ruleMonth
            {
             before(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMonth();

            state._fsp--;

             after(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Year__MonthsAssignment_4"


    // $ANTLR start "rule__Month__NameAssignment_0"
    // InternalBudgeting.g:2835:1: rule__Month__NameAssignment_0 : ( ruleMonthEnum ) ;
    public final void rule__Month__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2839:1: ( ( ruleMonthEnum ) )
            // InternalBudgeting.g:2840:1: ( ruleMonthEnum )
            {
            // InternalBudgeting.g:2840:1: ( ruleMonthEnum )
            // InternalBudgeting.g:2841:1: ruleMonthEnum
            {
             before(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMonthEnum();

            state._fsp--;

             after(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__NameAssignment_0"


    // $ANTLR start "rule__Month__BudgetEntriesAssignment_3"
    // InternalBudgeting.g:2850:1: rule__Month__BudgetEntriesAssignment_3 : ( ruleBudgetEntry ) ;
    public final void rule__Month__BudgetEntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2854:1: ( ( ruleBudgetEntry ) )
            // InternalBudgeting.g:2855:1: ( ruleBudgetEntry )
            {
            // InternalBudgeting.g:2855:1: ( ruleBudgetEntry )
            // InternalBudgeting.g:2856:1: ruleBudgetEntry
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBudgetEntry();

            state._fsp--;

             after(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__BudgetEntriesAssignment_3"


    // $ANTLR start "rule__Month__ActualEntriesAssignment_7"
    // InternalBudgeting.g:2865:1: rule__Month__ActualEntriesAssignment_7 : ( ruleActualEntry ) ;
    public final void rule__Month__ActualEntriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2869:1: ( ( ruleActualEntry ) )
            // InternalBudgeting.g:2870:1: ( ruleActualEntry )
            {
            // InternalBudgeting.g:2870:1: ( ruleActualEntry )
            // InternalBudgeting.g:2871:1: ruleActualEntry
            {
             before(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleActualEntry();

            state._fsp--;

             after(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Month__ActualEntriesAssignment_7"


    // $ANTLR start "rule__BudgetEntry__CategoryAssignment_0_1"
    // InternalBudgeting.g:2880:1: rule__BudgetEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2884:1: ( ( ( RULE_ID ) ) )
            // InternalBudgeting.g:2885:1: ( ( RULE_ID ) )
            {
            // InternalBudgeting.g:2885:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:2886:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // InternalBudgeting.g:2887:1: ( RULE_ID )
            // InternalBudgeting.g:2888:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__CategoryAssignment_0_1"


    // $ANTLR start "rule__BudgetEntry__AmountAssignment_0_3"
    // InternalBudgeting.g:2899:1: rule__BudgetEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__BudgetEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2903:1: ( ( ruleDollar ) )
            // InternalBudgeting.g:2904:1: ( ruleDollar )
            {
            // InternalBudgeting.g:2904:1: ( ruleDollar )
            // InternalBudgeting.g:2905:1: ruleDollar
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDollar();

            state._fsp--;

             after(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__AmountAssignment_0_3"


    // $ANTLR start "rule__BudgetEntry__CategoryAssignment_1_1"
    // InternalBudgeting.g:2914:1: rule__BudgetEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2918:1: ( ( ( RULE_ID ) ) )
            // InternalBudgeting.g:2919:1: ( ( RULE_ID ) )
            {
            // InternalBudgeting.g:2919:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:2920:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // InternalBudgeting.g:2921:1: ( RULE_ID )
            // InternalBudgeting.g:2922:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__CategoryAssignment_1_1"


    // $ANTLR start "rule__BudgetEntry__BaseEntryAssignment_1_3"
    // InternalBudgeting.g:2933:1: rule__BudgetEntry__BaseEntryAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__BaseEntryAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2937:1: ( ( ( RULE_ID ) ) )
            // InternalBudgeting.g:2938:1: ( ( RULE_ID ) )
            {
            // InternalBudgeting.g:2938:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:2939:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 
            // InternalBudgeting.g:2940:1: ( RULE_ID )
            // InternalBudgeting.g:2941:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__BaseEntryAssignment_1_3"


    // $ANTLR start "rule__BudgetEntry__FactorAssignment_1_5"
    // InternalBudgeting.g:2952:1: rule__BudgetEntry__FactorAssignment_1_5 : ( ruleDouble ) ;
    public final void rule__BudgetEntry__FactorAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2956:1: ( ( ruleDouble ) )
            // InternalBudgeting.g:2957:1: ( ruleDouble )
            {
            // InternalBudgeting.g:2957:1: ( ruleDouble )
            // InternalBudgeting.g:2958:1: ruleDouble
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BudgetEntry__FactorAssignment_1_5"


    // $ANTLR start "rule__ActualEntry__CategoryAssignment_0_1"
    // InternalBudgeting.g:2967:1: rule__ActualEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2971:1: ( ( ( RULE_ID ) ) )
            // InternalBudgeting.g:2972:1: ( ( RULE_ID ) )
            {
            // InternalBudgeting.g:2972:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:2973:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // InternalBudgeting.g:2974:1: ( RULE_ID )
            // InternalBudgeting.g:2975:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__CategoryAssignment_0_1"


    // $ANTLR start "rule__ActualEntry__AmountAssignment_0_3"
    // InternalBudgeting.g:2986:1: rule__ActualEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__ActualEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:2990:1: ( ( ruleDollar ) )
            // InternalBudgeting.g:2991:1: ( ruleDollar )
            {
            // InternalBudgeting.g:2991:1: ( ruleDollar )
            // InternalBudgeting.g:2992:1: ruleDollar
            {
             before(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDollar();

            state._fsp--;

             after(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__AmountAssignment_0_3"


    // $ANTLR start "rule__ActualEntry__CategoryAssignment_1_1"
    // InternalBudgeting.g:3001:1: rule__ActualEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:3005:1: ( ( ( RULE_ID ) ) )
            // InternalBudgeting.g:3006:1: ( ( RULE_ID ) )
            {
            // InternalBudgeting.g:3006:1: ( ( RULE_ID ) )
            // InternalBudgeting.g:3007:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // InternalBudgeting.g:3008:1: ( RULE_ID )
            // InternalBudgeting.g:3009:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__CategoryAssignment_1_1"


    // $ANTLR start "rule__ActualEntry__TransactionsAssignment_1_3"
    // InternalBudgeting.g:3020:1: rule__ActualEntry__TransactionsAssignment_1_3 : ( ruleTransaction ) ;
    public final void rule__ActualEntry__TransactionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:3024:1: ( ( ruleTransaction ) )
            // InternalBudgeting.g:3025:1: ( ruleTransaction )
            {
            // InternalBudgeting.g:3025:1: ( ruleTransaction )
            // InternalBudgeting.g:3026:1: ruleTransaction
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualEntry__TransactionsAssignment_1_3"


    // $ANTLR start "rule__Transaction__AmountAssignment_0_2"
    // InternalBudgeting.g:3035:1: rule__Transaction__AmountAssignment_0_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:3039:1: ( ( ruleDollar ) )
            // InternalBudgeting.g:3040:1: ( ruleDollar )
            {
            // InternalBudgeting.g:3040:1: ( ruleDollar )
            // InternalBudgeting.g:3041:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDollar();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__AmountAssignment_0_2"


    // $ANTLR start "rule__Transaction__DayAssignment_0_3_1"
    // InternalBudgeting.g:3050:1: rule__Transaction__DayAssignment_0_3_1 : ( ruleOptionalInt ) ;
    public final void rule__Transaction__DayAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:3054:1: ( ( ruleOptionalInt ) )
            // InternalBudgeting.g:3055:1: ( ruleOptionalInt )
            {
            // InternalBudgeting.g:3055:1: ( ruleOptionalInt )
            // InternalBudgeting.g:3056:1: ruleOptionalInt
            {
             before(grammarAccess.getTransactionAccess().getDayOptionalIntParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionalInt();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getDayOptionalIntParserRuleCall_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__DayAssignment_0_3_1"


    // $ANTLR start "rule__Transaction__AmountAssignment_1_2"
    // InternalBudgeting.g:3065:1: rule__Transaction__AmountAssignment_1_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:3069:1: ( ( ruleDollar ) )
            // InternalBudgeting.g:3070:1: ( ruleDollar )
            {
            // InternalBudgeting.g:3070:1: ( ruleDollar )
            // InternalBudgeting.g:3071:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDollar();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__AmountAssignment_1_2"


    // $ANTLR start "rule__Transaction__DayAssignment_1_4"
    // InternalBudgeting.g:3080:1: rule__Transaction__DayAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__Transaction__DayAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:3084:1: ( ( RULE_INT ) )
            // InternalBudgeting.g:3085:1: ( RULE_INT )
            {
            // InternalBudgeting.g:3085:1: ( RULE_INT )
            // InternalBudgeting.g:3086:1: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__DayAssignment_1_4"


    // $ANTLR start "rule__Transaction__FromAssignment_1_6"
    // InternalBudgeting.g:3095:1: rule__Transaction__FromAssignment_1_6 : ( RULE_STRING ) ;
    public final void rule__Transaction__FromAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBudgeting.g:3099:1: ( ( RULE_STRING ) )
            // InternalBudgeting.g:3100:1: ( RULE_STRING )
            {
            // InternalBudgeting.g:3100:1: ( RULE_STRING )
            // InternalBudgeting.g:3101:1: RULE_STRING
            {
             before(grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__FromAssignment_1_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004FFF000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000FFF002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});

}