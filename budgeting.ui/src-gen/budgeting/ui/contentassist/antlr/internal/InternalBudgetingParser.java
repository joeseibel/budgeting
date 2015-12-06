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
    public String getGrammarFileName() { return "../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g"; }


     
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:60:1: entryRuleBudgetingFile : ruleBudgetingFile EOF ;
    public final void entryRuleBudgetingFile() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:61:1: ( ruleBudgetingFile EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:62:1: ruleBudgetingFile EOF
            {
             before(grammarAccess.getBudgetingFileRule()); 
            pushFollow(FOLLOW_ruleBudgetingFile_in_entryRuleBudgetingFile61);
            ruleBudgetingFile();

            state._fsp--;

             after(grammarAccess.getBudgetingFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBudgetingFile68); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:69:1: ruleBudgetingFile : ( ( rule__BudgetingFile__Alternatives ) ) ;
    public final void ruleBudgetingFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:73:2: ( ( ( rule__BudgetingFile__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:74:1: ( ( rule__BudgetingFile__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:74:1: ( ( rule__BudgetingFile__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:75:1: ( rule__BudgetingFile__Alternatives )
            {
             before(grammarAccess.getBudgetingFileAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:76:1: ( rule__BudgetingFile__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:76:2: rule__BudgetingFile__Alternatives
            {
            pushFollow(FOLLOW_rule__BudgetingFile__Alternatives_in_ruleBudgetingFile94);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:88:1: entryRuleLibrary : ruleLibrary EOF ;
    public final void entryRuleLibrary() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:89:1: ( ruleLibrary EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:90:1: ruleLibrary EOF
            {
             before(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_ruleLibrary_in_entryRuleLibrary121);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getLibraryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibrary128); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:97:1: ruleLibrary : ( ( rule__Library__Group__0 ) ) ;
    public final void ruleLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:101:2: ( ( ( rule__Library__Group__0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:102:1: ( ( rule__Library__Group__0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:102:1: ( ( rule__Library__Group__0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:103:1: ( rule__Library__Group__0 )
            {
             before(grammarAccess.getLibraryAccess().getGroup()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:104:1: ( rule__Library__Group__0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:104:2: rule__Library__Group__0
            {
            pushFollow(FOLLOW_rule__Library__Group__0_in_ruleLibrary154);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:116:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:117:1: ( ruleCategory EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:118:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory181);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory188); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:125:1: ruleCategory : ( ( rule__Category__Alternatives ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:129:2: ( ( ( rule__Category__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:130:1: ( ( rule__Category__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:130:1: ( ( rule__Category__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:131:1: ( rule__Category__Alternatives )
            {
             before(grammarAccess.getCategoryAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:132:1: ( rule__Category__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:132:2: rule__Category__Alternatives
            {
            pushFollow(FOLLOW_rule__Category__Alternatives_in_ruleCategory214);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:144:1: entryRuleYear : ruleYear EOF ;
    public final void entryRuleYear() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:145:1: ( ruleYear EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:146:1: ruleYear EOF
            {
             before(grammarAccess.getYearRule()); 
            pushFollow(FOLLOW_ruleYear_in_entryRuleYear241);
            ruleYear();

            state._fsp--;

             after(grammarAccess.getYearRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleYear248); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:153:1: ruleYear : ( ( rule__Year__Group__0 ) ) ;
    public final void ruleYear() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:157:2: ( ( ( rule__Year__Group__0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:158:1: ( ( rule__Year__Group__0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:158:1: ( ( rule__Year__Group__0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:159:1: ( rule__Year__Group__0 )
            {
             before(grammarAccess.getYearAccess().getGroup()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:160:1: ( rule__Year__Group__0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:160:2: rule__Year__Group__0
            {
            pushFollow(FOLLOW_rule__Year__Group__0_in_ruleYear274);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:172:1: entryRuleMonth : ruleMonth EOF ;
    public final void entryRuleMonth() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:173:1: ( ruleMonth EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:174:1: ruleMonth EOF
            {
             before(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_ruleMonth_in_entryRuleMonth301);
            ruleMonth();

            state._fsp--;

             after(grammarAccess.getMonthRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonth308); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:181:1: ruleMonth : ( ( rule__Month__Group__0 ) ) ;
    public final void ruleMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:185:2: ( ( ( rule__Month__Group__0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:186:1: ( ( rule__Month__Group__0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:186:1: ( ( rule__Month__Group__0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:187:1: ( rule__Month__Group__0 )
            {
             before(grammarAccess.getMonthAccess().getGroup()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:188:1: ( rule__Month__Group__0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:188:2: rule__Month__Group__0
            {
            pushFollow(FOLLOW_rule__Month__Group__0_in_ruleMonth334);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:200:1: entryRuleBudgetEntry : ruleBudgetEntry EOF ;
    public final void entryRuleBudgetEntry() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:201:1: ( ruleBudgetEntry EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:202:1: ruleBudgetEntry EOF
            {
             before(grammarAccess.getBudgetEntryRule()); 
            pushFollow(FOLLOW_ruleBudgetEntry_in_entryRuleBudgetEntry361);
            ruleBudgetEntry();

            state._fsp--;

             after(grammarAccess.getBudgetEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBudgetEntry368); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:209:1: ruleBudgetEntry : ( ( rule__BudgetEntry__Alternatives ) ) ;
    public final void ruleBudgetEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:213:2: ( ( ( rule__BudgetEntry__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:214:1: ( ( rule__BudgetEntry__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:214:1: ( ( rule__BudgetEntry__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:215:1: ( rule__BudgetEntry__Alternatives )
            {
             before(grammarAccess.getBudgetEntryAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:216:1: ( rule__BudgetEntry__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:216:2: rule__BudgetEntry__Alternatives
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Alternatives_in_ruleBudgetEntry394);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:228:1: entryRuleActualEntry : ruleActualEntry EOF ;
    public final void entryRuleActualEntry() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:229:1: ( ruleActualEntry EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:230:1: ruleActualEntry EOF
            {
             before(grammarAccess.getActualEntryRule()); 
            pushFollow(FOLLOW_ruleActualEntry_in_entryRuleActualEntry421);
            ruleActualEntry();

            state._fsp--;

             after(grammarAccess.getActualEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualEntry428); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:237:1: ruleActualEntry : ( ( rule__ActualEntry__Alternatives ) ) ;
    public final void ruleActualEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:241:2: ( ( ( rule__ActualEntry__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:242:1: ( ( rule__ActualEntry__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:242:1: ( ( rule__ActualEntry__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:243:1: ( rule__ActualEntry__Alternatives )
            {
             before(grammarAccess.getActualEntryAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:244:1: ( rule__ActualEntry__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:244:2: rule__ActualEntry__Alternatives
            {
            pushFollow(FOLLOW_rule__ActualEntry__Alternatives_in_ruleActualEntry454);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:256:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:257:1: ( ruleTransaction EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:258:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction481);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction488); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:265:1: ruleTransaction : ( ( rule__Transaction__Alternatives ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:269:2: ( ( ( rule__Transaction__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:270:1: ( ( rule__Transaction__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:270:1: ( ( rule__Transaction__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:271:1: ( rule__Transaction__Alternatives )
            {
             before(grammarAccess.getTransactionAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:272:1: ( rule__Transaction__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:272:2: rule__Transaction__Alternatives
            {
            pushFollow(FOLLOW_rule__Transaction__Alternatives_in_ruleTransaction514);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:284:1: entryRuleDollar : ruleDollar EOF ;
    public final void entryRuleDollar() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:285:1: ( ruleDollar EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:286:1: ruleDollar EOF
            {
             before(grammarAccess.getDollarRule()); 
            pushFollow(FOLLOW_ruleDollar_in_entryRuleDollar541);
            ruleDollar();

            state._fsp--;

             after(grammarAccess.getDollarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDollar548); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:293:1: ruleDollar : ( RULE_DECIMAL ) ;
    public final void ruleDollar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:297:2: ( ( RULE_DECIMAL ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:298:1: ( RULE_DECIMAL )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:298:1: ( RULE_DECIMAL )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:299:1: RULE_DECIMAL
            {
             before(grammarAccess.getDollarAccess().getDECIMALTerminalRuleCall()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleDollar574); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:312:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:313:1: ( ruleDouble EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:314:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble600);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble607); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:321:1: ruleDouble : ( ( rule__Double__Alternatives ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:325:2: ( ( ( rule__Double__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:326:1: ( ( rule__Double__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:326:1: ( ( rule__Double__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:327:1: ( rule__Double__Alternatives )
            {
             before(grammarAccess.getDoubleAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:328:1: ( rule__Double__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:328:2: rule__Double__Alternatives
            {
            pushFollow(FOLLOW_rule__Double__Alternatives_in_ruleDouble633);
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


    // $ANTLR start "ruleMonthEnum"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:341:1: ruleMonthEnum : ( ( rule__MonthEnum__Alternatives ) ) ;
    public final void ruleMonthEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:345:1: ( ( ( rule__MonthEnum__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:346:1: ( ( rule__MonthEnum__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:346:1: ( ( rule__MonthEnum__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:347:1: ( rule__MonthEnum__Alternatives )
            {
             before(grammarAccess.getMonthEnumAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:348:1: ( rule__MonthEnum__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:348:2: rule__MonthEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__MonthEnum__Alternatives_in_ruleMonthEnum670);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:359:1: rule__BudgetingFile__Alternatives : ( ( ruleLibrary ) | ( ruleYear ) );
    public final void rule__BudgetingFile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:363:1: ( ( ruleLibrary ) | ( ruleYear ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:364:1: ( ruleLibrary )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:364:1: ( ruleLibrary )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:365:1: ruleLibrary
                    {
                     before(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLibrary_in_rule__BudgetingFile__Alternatives705);
                    ruleLibrary();

                    state._fsp--;

                     after(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:370:6: ( ruleYear )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:370:6: ( ruleYear )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:371:1: ruleYear
                    {
                     before(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleYear_in_rule__BudgetingFile__Alternatives722);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:381:1: rule__Category__Alternatives : ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Group_1__0 ) ) );
    public final void rule__Category__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:385:1: ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:386:1: ( ( rule__Category__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:386:1: ( ( rule__Category__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:387:1: ( rule__Category__Group_0__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:388:1: ( rule__Category__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:388:2: rule__Category__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_0__0_in_rule__Category__Alternatives754);
                    rule__Category__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCategoryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:392:6: ( ( rule__Category__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:392:6: ( ( rule__Category__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:393:1: ( rule__Category__Group_1__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:394:1: ( rule__Category__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:394:2: rule__Category__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_1__0_in_rule__Category__Alternatives772);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:403:1: rule__BudgetEntry__Alternatives : ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) );
    public final void rule__BudgetEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:407:1: ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==35) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==RULE_ID) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==RULE_DECIMAL) ) {
                        alt3=1;
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:408:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:408:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:409:1: ( rule__BudgetEntry__Group_0__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:410:1: ( rule__BudgetEntry__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:410:2: rule__BudgetEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BudgetEntry__Group_0__0_in_rule__BudgetEntry__Alternatives805);
                    rule__BudgetEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBudgetEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:414:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:414:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:415:1: ( rule__BudgetEntry__Group_1__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:416:1: ( rule__BudgetEntry__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:416:2: rule__BudgetEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BudgetEntry__Group_1__0_in_rule__BudgetEntry__Alternatives823);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:425:1: rule__ActualEntry__Alternatives : ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) );
    public final void rule__ActualEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:429:1: ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:430:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:430:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:431:1: ( rule__ActualEntry__Group_0__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:432:1: ( rule__ActualEntry__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:432:2: rule__ActualEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualEntry__Group_0__0_in_rule__ActualEntry__Alternatives856);
                    rule__ActualEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActualEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:436:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:436:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:437:1: ( rule__ActualEntry__Group_1__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:438:1: ( rule__ActualEntry__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:438:2: rule__ActualEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ActualEntry__Group_1__0_in_rule__ActualEntry__Alternatives874);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:447:1: rule__Transaction__Alternatives : ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) );
    public final void rule__Transaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:451:1: ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:452:1: ( ( rule__Transaction__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:452:1: ( ( rule__Transaction__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:453:1: ( rule__Transaction__Group_0__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:454:1: ( rule__Transaction__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:454:2: rule__Transaction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_0__0_in_rule__Transaction__Alternatives907);
                    rule__Transaction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:458:6: ( ( rule__Transaction__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:458:6: ( ( rule__Transaction__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:459:1: ( rule__Transaction__Group_1__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:460:1: ( rule__Transaction__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:460:2: rule__Transaction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Alternatives925);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:469:1: rule__Double__Alternatives : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Double__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:473:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:474:1: ( RULE_INT )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:474:1: ( RULE_INT )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:475:1: RULE_INT
                    {
                     before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Alternatives958); 
                     after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:480:6: ( RULE_DECIMAL )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:480:6: ( RULE_DECIMAL )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:481:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getDoubleAccess().getDECIMALTerminalRuleCall_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Double__Alternatives975); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:491:1: rule__MonthEnum__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__MonthEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:495:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:496:1: ( ( 'january' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:496:1: ( ( 'january' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:497:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:498:1: ( 'january' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:498:3: 'january'
                    {
                    match(input,12,FOLLOW_12_in_rule__MonthEnum__Alternatives1008); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:503:6: ( ( 'february' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:503:6: ( ( 'february' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:504:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:505:1: ( 'february' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:505:3: 'february'
                    {
                    match(input,13,FOLLOW_13_in_rule__MonthEnum__Alternatives1029); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:510:6: ( ( 'march' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:510:6: ( ( 'march' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:511:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:512:1: ( 'march' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:512:3: 'march'
                    {
                    match(input,14,FOLLOW_14_in_rule__MonthEnum__Alternatives1050); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:517:6: ( ( 'april' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:517:6: ( ( 'april' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:518:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:519:1: ( 'april' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:519:3: 'april'
                    {
                    match(input,15,FOLLOW_15_in_rule__MonthEnum__Alternatives1071); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:524:6: ( ( 'may' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:524:6: ( ( 'may' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:525:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:526:1: ( 'may' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:526:3: 'may'
                    {
                    match(input,16,FOLLOW_16_in_rule__MonthEnum__Alternatives1092); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:531:6: ( ( 'june' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:531:6: ( ( 'june' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:532:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:533:1: ( 'june' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:533:3: 'june'
                    {
                    match(input,17,FOLLOW_17_in_rule__MonthEnum__Alternatives1113); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:538:6: ( ( 'july' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:538:6: ( ( 'july' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:539:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:540:1: ( 'july' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:540:3: 'july'
                    {
                    match(input,18,FOLLOW_18_in_rule__MonthEnum__Alternatives1134); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:545:6: ( ( 'august' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:545:6: ( ( 'august' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:546:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:547:1: ( 'august' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:547:3: 'august'
                    {
                    match(input,19,FOLLOW_19_in_rule__MonthEnum__Alternatives1155); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:552:6: ( ( 'september' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:552:6: ( ( 'september' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:553:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:554:1: ( 'september' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:554:3: 'september'
                    {
                    match(input,20,FOLLOW_20_in_rule__MonthEnum__Alternatives1176); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:559:6: ( ( 'october' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:559:6: ( ( 'october' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:560:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:561:1: ( 'october' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:561:3: 'october'
                    {
                    match(input,21,FOLLOW_21_in_rule__MonthEnum__Alternatives1197); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:566:6: ( ( 'november' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:566:6: ( ( 'november' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:567:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:568:1: ( 'november' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:568:3: 'november'
                    {
                    match(input,22,FOLLOW_22_in_rule__MonthEnum__Alternatives1218); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:573:6: ( ( 'december' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:573:6: ( ( 'december' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:574:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:575:1: ( 'december' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:575:3: 'december'
                    {
                    match(input,23,FOLLOW_23_in_rule__MonthEnum__Alternatives1239); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:587:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:591:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:592:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01272);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01275);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:599:1: rule__Library__Group__0__Impl : ( 'library' ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:603:1: ( ( 'library' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:604:1: ( 'library' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:604:1: ( 'library' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:605:1: 'library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Library__Group__0__Impl1303); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:618:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:622:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:623:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11334);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11337);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:630:1: rule__Library__Group__1__Impl : ( ( rule__Library__NameAssignment_1 ) ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:634:1: ( ( ( rule__Library__NameAssignment_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:635:1: ( ( rule__Library__NameAssignment_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:635:1: ( ( rule__Library__NameAssignment_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:636:1: ( rule__Library__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:637:1: ( rule__Library__NameAssignment_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:637:2: rule__Library__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1364);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:647:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:651:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:652:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21394);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21397);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:659:1: rule__Library__Group__2__Impl : ( '{' ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:663:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:664:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:664:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:665:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Library__Group__2__Impl1425); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:678:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:682:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:683:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31456);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31459);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:690:1: rule__Library__Group__3__Impl : ( ( rule__Library__CategoriesAssignment_3 )* ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:694:1: ( ( ( rule__Library__CategoriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:695:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:695:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:696:1: ( rule__Library__CategoriesAssignment_3 )*
            {
             before(grammarAccess.getLibraryAccess().getCategoriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:697:1: ( rule__Library__CategoriesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:697:2: rule__Library__CategoriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1486);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:707:1: rule__Library__Group__4 : rule__Library__Group__4__Impl ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:711:1: ( rule__Library__Group__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:712:2: rule__Library__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41517);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:718:1: rule__Library__Group__4__Impl : ( '}' ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:722:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:723:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:723:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:724:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Library__Group__4__Impl1545); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:747:1: rule__Category__Group_0__0 : rule__Category__Group_0__0__Impl rule__Category__Group_0__1 ;
    public final void rule__Category__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:751:1: ( rule__Category__Group_0__0__Impl rule__Category__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:752:2: rule__Category__Group_0__0__Impl rule__Category__Group_0__1
            {
            pushFollow(FOLLOW_rule__Category__Group_0__0__Impl_in_rule__Category__Group_0__01586);
            rule__Category__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_0__1_in_rule__Category__Group_0__01589);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:759:1: rule__Category__Group_0__0__Impl : ( () ) ;
    public final void rule__Category__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:763:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:764:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:764:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:765:1: ()
            {
             before(grammarAccess.getCategoryAccess().getIncomeCategoryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:766:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:768:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:778:1: rule__Category__Group_0__1 : rule__Category__Group_0__1__Impl rule__Category__Group_0__2 ;
    public final void rule__Category__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:782:1: ( rule__Category__Group_0__1__Impl rule__Category__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:783:2: rule__Category__Group_0__1__Impl rule__Category__Group_0__2
            {
            pushFollow(FOLLOW_rule__Category__Group_0__1__Impl_in_rule__Category__Group_0__11647);
            rule__Category__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_0__2_in_rule__Category__Group_0__11650);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:790:1: rule__Category__Group_0__1__Impl : ( 'income' ) ;
    public final void rule__Category__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:794:1: ( ( 'income' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:795:1: ( 'income' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:795:1: ( 'income' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:796:1: 'income'
            {
             before(grammarAccess.getCategoryAccess().getIncomeKeyword_0_1()); 
            match(input,27,FOLLOW_27_in_rule__Category__Group_0__1__Impl1678); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:809:1: rule__Category__Group_0__2 : rule__Category__Group_0__2__Impl ;
    public final void rule__Category__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:813:1: ( rule__Category__Group_0__2__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:814:2: rule__Category__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_0__2__Impl_in_rule__Category__Group_0__21709);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:820:1: rule__Category__Group_0__2__Impl : ( ( rule__Category__NameAssignment_0_2 ) ) ;
    public final void rule__Category__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:824:1: ( ( ( rule__Category__NameAssignment_0_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:825:1: ( ( rule__Category__NameAssignment_0_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:825:1: ( ( rule__Category__NameAssignment_0_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:826:1: ( rule__Category__NameAssignment_0_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_0_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:827:1: ( rule__Category__NameAssignment_0_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:827:2: rule__Category__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_0_2_in_rule__Category__Group_0__2__Impl1736);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:843:1: rule__Category__Group_1__0 : rule__Category__Group_1__0__Impl rule__Category__Group_1__1 ;
    public final void rule__Category__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:847:1: ( rule__Category__Group_1__0__Impl rule__Category__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:848:2: rule__Category__Group_1__0__Impl rule__Category__Group_1__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1__0__Impl_in_rule__Category__Group_1__01772);
            rule__Category__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__1_in_rule__Category__Group_1__01775);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:855:1: rule__Category__Group_1__0__Impl : ( () ) ;
    public final void rule__Category__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:859:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:860:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:860:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:861:1: ()
            {
             before(grammarAccess.getCategoryAccess().getExpenseCategoryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:862:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:864:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:874:1: rule__Category__Group_1__1 : rule__Category__Group_1__1__Impl rule__Category__Group_1__2 ;
    public final void rule__Category__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:878:1: ( rule__Category__Group_1__1__Impl rule__Category__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:879:2: rule__Category__Group_1__1__Impl rule__Category__Group_1__2
            {
            pushFollow(FOLLOW_rule__Category__Group_1__1__Impl_in_rule__Category__Group_1__11833);
            rule__Category__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__2_in_rule__Category__Group_1__11836);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:886:1: rule__Category__Group_1__1__Impl : ( 'expense' ) ;
    public final void rule__Category__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:890:1: ( ( 'expense' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:891:1: ( 'expense' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:891:1: ( 'expense' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:892:1: 'expense'
            {
             before(grammarAccess.getCategoryAccess().getExpenseKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__Category__Group_1__1__Impl1864); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:905:1: rule__Category__Group_1__2 : rule__Category__Group_1__2__Impl rule__Category__Group_1__3 ;
    public final void rule__Category__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:909:1: ( rule__Category__Group_1__2__Impl rule__Category__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:910:2: rule__Category__Group_1__2__Impl rule__Category__Group_1__3
            {
            pushFollow(FOLLOW_rule__Category__Group_1__2__Impl_in_rule__Category__Group_1__21895);
            rule__Category__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__3_in_rule__Category__Group_1__21898);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:917:1: rule__Category__Group_1__2__Impl : ( ( rule__Category__NameAssignment_1_2 ) ) ;
    public final void rule__Category__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:921:1: ( ( ( rule__Category__NameAssignment_1_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:922:1: ( ( rule__Category__NameAssignment_1_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:922:1: ( ( rule__Category__NameAssignment_1_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:923:1: ( rule__Category__NameAssignment_1_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:924:1: ( rule__Category__NameAssignment_1_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:924:2: rule__Category__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_1_2_in_rule__Category__Group_1__2__Impl1925);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:934:1: rule__Category__Group_1__3 : rule__Category__Group_1__3__Impl ;
    public final void rule__Category__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:938:1: ( rule__Category__Group_1__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:939:2: rule__Category__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1__3__Impl_in_rule__Category__Group_1__31955);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:945:1: rule__Category__Group_1__3__Impl : ( ( rule__Category__Group_1_3__0 )? ) ;
    public final void rule__Category__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:949:1: ( ( ( rule__Category__Group_1_3__0 )? ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:950:1: ( ( rule__Category__Group_1_3__0 )? )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:950:1: ( ( rule__Category__Group_1_3__0 )? )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:951:1: ( rule__Category__Group_1_3__0 )?
            {
             before(grammarAccess.getCategoryAccess().getGroup_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:952:1: ( rule__Category__Group_1_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:952:2: rule__Category__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_1_3__0_in_rule__Category__Group_1__3__Impl1982);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:970:1: rule__Category__Group_1_3__0 : rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1 ;
    public final void rule__Category__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:974:1: ( rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:975:2: rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__0__Impl_in_rule__Category__Group_1_3__02021);
            rule__Category__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__1_in_rule__Category__Group_1_3__02024);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:982:1: rule__Category__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__Category__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:986:1: ( ( '[' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:987:1: ( '[' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:987:1: ( '[' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:988:1: '['
            {
             before(grammarAccess.getCategoryAccess().getLeftSquareBracketKeyword_1_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Category__Group_1_3__0__Impl2052); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1001:1: rule__Category__Group_1_3__1 : rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2 ;
    public final void rule__Category__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1005:1: ( rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1006:2: rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__1__Impl_in_rule__Category__Group_1_3__12083);
            rule__Category__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__2_in_rule__Category__Group_1_3__12086);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1013:1: rule__Category__Group_1_3__1__Impl : ( ( rule__Category__PatternsAssignment_1_3_1 ) ) ;
    public final void rule__Category__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1017:1: ( ( ( rule__Category__PatternsAssignment_1_3_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1018:1: ( ( rule__Category__PatternsAssignment_1_3_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1018:1: ( ( rule__Category__PatternsAssignment_1_3_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1019:1: ( rule__Category__PatternsAssignment_1_3_1 )
            {
             before(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1020:1: ( rule__Category__PatternsAssignment_1_3_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1020:2: rule__Category__PatternsAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Category__PatternsAssignment_1_3_1_in_rule__Category__Group_1_3__1__Impl2113);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1030:1: rule__Category__Group_1_3__2 : rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3 ;
    public final void rule__Category__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1034:1: ( rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1035:2: rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__2__Impl_in_rule__Category__Group_1_3__22143);
            rule__Category__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__3_in_rule__Category__Group_1_3__22146);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1042:1: rule__Category__Group_1_3__2__Impl : ( ( rule__Category__Group_1_3_2__0 )* ) ;
    public final void rule__Category__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1046:1: ( ( ( rule__Category__Group_1_3_2__0 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1047:1: ( ( rule__Category__Group_1_3_2__0 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1047:1: ( ( rule__Category__Group_1_3_2__0 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1048:1: ( rule__Category__Group_1_3_2__0 )*
            {
             before(grammarAccess.getCategoryAccess().getGroup_1_3_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1049:1: ( rule__Category__Group_1_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1049:2: rule__Category__Group_1_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Category__Group_1_3_2__0_in_rule__Category__Group_1_3__2__Impl2173);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1059:1: rule__Category__Group_1_3__3 : rule__Category__Group_1_3__3__Impl ;
    public final void rule__Category__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1063:1: ( rule__Category__Group_1_3__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1064:2: rule__Category__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__3__Impl_in_rule__Category__Group_1_3__32204);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1070:1: rule__Category__Group_1_3__3__Impl : ( ']' ) ;
    public final void rule__Category__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1074:1: ( ( ']' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1075:1: ( ']' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1075:1: ( ']' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1076:1: ']'
            {
             before(grammarAccess.getCategoryAccess().getRightSquareBracketKeyword_1_3_3()); 
            match(input,30,FOLLOW_30_in_rule__Category__Group_1_3__3__Impl2232); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1097:1: rule__Category__Group_1_3_2__0 : rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1 ;
    public final void rule__Category__Group_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1101:1: ( rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1102:2: rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3_2__0__Impl_in_rule__Category__Group_1_3_2__02271);
            rule__Category__Group_1_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3_2__1_in_rule__Category__Group_1_3_2__02274);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1109:1: rule__Category__Group_1_3_2__0__Impl : ( ',' ) ;
    public final void rule__Category__Group_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1113:1: ( ( ',' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1114:1: ( ',' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1114:1: ( ',' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1115:1: ','
            {
             before(grammarAccess.getCategoryAccess().getCommaKeyword_1_3_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Category__Group_1_3_2__0__Impl2302); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1128:1: rule__Category__Group_1_3_2__1 : rule__Category__Group_1_3_2__1__Impl ;
    public final void rule__Category__Group_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1132:1: ( rule__Category__Group_1_3_2__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1133:2: rule__Category__Group_1_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3_2__1__Impl_in_rule__Category__Group_1_3_2__12333);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1139:1: rule__Category__Group_1_3_2__1__Impl : ( ( rule__Category__PatternsAssignment_1_3_2_1 ) ) ;
    public final void rule__Category__Group_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1143:1: ( ( ( rule__Category__PatternsAssignment_1_3_2_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1144:1: ( ( rule__Category__PatternsAssignment_1_3_2_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1144:1: ( ( rule__Category__PatternsAssignment_1_3_2_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1145:1: ( rule__Category__PatternsAssignment_1_3_2_1 )
            {
             before(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_2_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1146:1: ( rule__Category__PatternsAssignment_1_3_2_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1146:2: rule__Category__PatternsAssignment_1_3_2_1
            {
            pushFollow(FOLLOW_rule__Category__PatternsAssignment_1_3_2_1_in_rule__Category__Group_1_3_2__1__Impl2360);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1160:1: rule__Year__Group__0 : rule__Year__Group__0__Impl rule__Year__Group__1 ;
    public final void rule__Year__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1164:1: ( rule__Year__Group__0__Impl rule__Year__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1165:2: rule__Year__Group__0__Impl rule__Year__Group__1
            {
            pushFollow(FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__02394);
            rule__Year__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__1_in_rule__Year__Group__02397);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1172:1: rule__Year__Group__0__Impl : ( ( rule__Year__NameAssignment_0 ) ) ;
    public final void rule__Year__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1176:1: ( ( ( rule__Year__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1177:1: ( ( rule__Year__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1177:1: ( ( rule__Year__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1178:1: ( rule__Year__NameAssignment_0 )
            {
             before(grammarAccess.getYearAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1179:1: ( rule__Year__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1179:2: rule__Year__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl2424);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1189:1: rule__Year__Group__1 : rule__Year__Group__1__Impl rule__Year__Group__2 ;
    public final void rule__Year__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1193:1: ( rule__Year__Group__1__Impl rule__Year__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1194:2: rule__Year__Group__1__Impl rule__Year__Group__2
            {
            pushFollow(FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__12454);
            rule__Year__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__2_in_rule__Year__Group__12457);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1201:1: rule__Year__Group__1__Impl : ( 'uses' ) ;
    public final void rule__Year__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1205:1: ( ( 'uses' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1206:1: ( 'uses' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1206:1: ( 'uses' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1207:1: 'uses'
            {
             before(grammarAccess.getYearAccess().getUsesKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Year__Group__1__Impl2485); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1220:1: rule__Year__Group__2 : rule__Year__Group__2__Impl rule__Year__Group__3 ;
    public final void rule__Year__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1224:1: ( rule__Year__Group__2__Impl rule__Year__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1225:2: rule__Year__Group__2__Impl rule__Year__Group__3
            {
            pushFollow(FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__22516);
            rule__Year__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__3_in_rule__Year__Group__22519);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1232:1: rule__Year__Group__2__Impl : ( ( rule__Year__LibraryAssignment_2 ) ) ;
    public final void rule__Year__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1236:1: ( ( ( rule__Year__LibraryAssignment_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1237:1: ( ( rule__Year__LibraryAssignment_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1237:1: ( ( rule__Year__LibraryAssignment_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1238:1: ( rule__Year__LibraryAssignment_2 )
            {
             before(grammarAccess.getYearAccess().getLibraryAssignment_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1239:1: ( rule__Year__LibraryAssignment_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1239:2: rule__Year__LibraryAssignment_2
            {
            pushFollow(FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl2546);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1249:1: rule__Year__Group__3 : rule__Year__Group__3__Impl rule__Year__Group__4 ;
    public final void rule__Year__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1253:1: ( rule__Year__Group__3__Impl rule__Year__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1254:2: rule__Year__Group__3__Impl rule__Year__Group__4
            {
            pushFollow(FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__32576);
            rule__Year__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__4_in_rule__Year__Group__32579);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1261:1: rule__Year__Group__3__Impl : ( '{' ) ;
    public final void rule__Year__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1265:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1266:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1266:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1267:1: '{'
            {
             before(grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Year__Group__3__Impl2607); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1280:1: rule__Year__Group__4 : rule__Year__Group__4__Impl rule__Year__Group__5 ;
    public final void rule__Year__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1284:1: ( rule__Year__Group__4__Impl rule__Year__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1285:2: rule__Year__Group__4__Impl rule__Year__Group__5
            {
            pushFollow(FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__42638);
            rule__Year__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__5_in_rule__Year__Group__42641);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1292:1: rule__Year__Group__4__Impl : ( ( rule__Year__MonthsAssignment_4 )* ) ;
    public final void rule__Year__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1296:1: ( ( ( rule__Year__MonthsAssignment_4 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1297:1: ( ( rule__Year__MonthsAssignment_4 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1297:1: ( ( rule__Year__MonthsAssignment_4 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1298:1: ( rule__Year__MonthsAssignment_4 )*
            {
             before(grammarAccess.getYearAccess().getMonthsAssignment_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1299:1: ( rule__Year__MonthsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1299:2: rule__Year__MonthsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl2668);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1309:1: rule__Year__Group__5 : rule__Year__Group__5__Impl ;
    public final void rule__Year__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1313:1: ( rule__Year__Group__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1314:2: rule__Year__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__52699);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1320:1: rule__Year__Group__5__Impl : ( '}' ) ;
    public final void rule__Year__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1324:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1325:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1325:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1326:1: '}'
            {
             before(grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Year__Group__5__Impl2727); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1351:1: rule__Month__Group__0 : rule__Month__Group__0__Impl rule__Month__Group__1 ;
    public final void rule__Month__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1355:1: ( rule__Month__Group__0__Impl rule__Month__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1356:2: rule__Month__Group__0__Impl rule__Month__Group__1
            {
            pushFollow(FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__02770);
            rule__Month__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__1_in_rule__Month__Group__02773);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1363:1: rule__Month__Group__0__Impl : ( ( rule__Month__NameAssignment_0 ) ) ;
    public final void rule__Month__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1367:1: ( ( ( rule__Month__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1368:1: ( ( rule__Month__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1368:1: ( ( rule__Month__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1369:1: ( rule__Month__NameAssignment_0 )
            {
             before(grammarAccess.getMonthAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1370:1: ( rule__Month__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1370:2: rule__Month__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl2800);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1380:1: rule__Month__Group__1 : rule__Month__Group__1__Impl rule__Month__Group__2 ;
    public final void rule__Month__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1384:1: ( rule__Month__Group__1__Impl rule__Month__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1385:2: rule__Month__Group__1__Impl rule__Month__Group__2
            {
            pushFollow(FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__12830);
            rule__Month__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__2_in_rule__Month__Group__12833);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1392:1: rule__Month__Group__1__Impl : ( 'budget' ) ;
    public final void rule__Month__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1396:1: ( ( 'budget' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1397:1: ( 'budget' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1397:1: ( 'budget' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1398:1: 'budget'
            {
             before(grammarAccess.getMonthAccess().getBudgetKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Month__Group__1__Impl2861); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1411:1: rule__Month__Group__2 : rule__Month__Group__2__Impl rule__Month__Group__3 ;
    public final void rule__Month__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1415:1: ( rule__Month__Group__2__Impl rule__Month__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1416:2: rule__Month__Group__2__Impl rule__Month__Group__3
            {
            pushFollow(FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__22892);
            rule__Month__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__3_in_rule__Month__Group__22895);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1423:1: rule__Month__Group__2__Impl : ( '{' ) ;
    public final void rule__Month__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1427:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1428:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1428:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1429:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Month__Group__2__Impl2923); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1442:1: rule__Month__Group__3 : rule__Month__Group__3__Impl rule__Month__Group__4 ;
    public final void rule__Month__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1446:1: ( rule__Month__Group__3__Impl rule__Month__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1447:2: rule__Month__Group__3__Impl rule__Month__Group__4
            {
            pushFollow(FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__32954);
            rule__Month__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__4_in_rule__Month__Group__32957);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1454:1: rule__Month__Group__3__Impl : ( ( rule__Month__BudgetEntriesAssignment_3 )* ) ;
    public final void rule__Month__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1458:1: ( ( ( rule__Month__BudgetEntriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1459:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1459:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1460:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1461:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1461:2: rule__Month__BudgetEntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl2984);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1471:1: rule__Month__Group__4 : rule__Month__Group__4__Impl rule__Month__Group__5 ;
    public final void rule__Month__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1475:1: ( rule__Month__Group__4__Impl rule__Month__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1476:2: rule__Month__Group__4__Impl rule__Month__Group__5
            {
            pushFollow(FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__43015);
            rule__Month__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__5_in_rule__Month__Group__43018);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1483:1: rule__Month__Group__4__Impl : ( '}' ) ;
    public final void rule__Month__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1487:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1488:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1488:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1489:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__4__Impl3046); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1502:1: rule__Month__Group__5 : rule__Month__Group__5__Impl rule__Month__Group__6 ;
    public final void rule__Month__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1506:1: ( rule__Month__Group__5__Impl rule__Month__Group__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1507:2: rule__Month__Group__5__Impl rule__Month__Group__6
            {
            pushFollow(FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__53077);
            rule__Month__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__6_in_rule__Month__Group__53080);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1514:1: rule__Month__Group__5__Impl : ( 'actual' ) ;
    public final void rule__Month__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1518:1: ( ( 'actual' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1519:1: ( 'actual' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1519:1: ( 'actual' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1520:1: 'actual'
            {
             before(grammarAccess.getMonthAccess().getActualKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__Month__Group__5__Impl3108); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1533:1: rule__Month__Group__6 : rule__Month__Group__6__Impl rule__Month__Group__7 ;
    public final void rule__Month__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1537:1: ( rule__Month__Group__6__Impl rule__Month__Group__7 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1538:2: rule__Month__Group__6__Impl rule__Month__Group__7
            {
            pushFollow(FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__63139);
            rule__Month__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__7_in_rule__Month__Group__63142);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1545:1: rule__Month__Group__6__Impl : ( '{' ) ;
    public final void rule__Month__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1549:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1550:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1550:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1551:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Month__Group__6__Impl3170); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1564:1: rule__Month__Group__7 : rule__Month__Group__7__Impl rule__Month__Group__8 ;
    public final void rule__Month__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1568:1: ( rule__Month__Group__7__Impl rule__Month__Group__8 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1569:2: rule__Month__Group__7__Impl rule__Month__Group__8
            {
            pushFollow(FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__73201);
            rule__Month__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__8_in_rule__Month__Group__73204);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1576:1: rule__Month__Group__7__Impl : ( ( rule__Month__ActualEntriesAssignment_7 )* ) ;
    public final void rule__Month__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1580:1: ( ( ( rule__Month__ActualEntriesAssignment_7 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1581:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1581:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1582:1: ( rule__Month__ActualEntriesAssignment_7 )*
            {
             before(grammarAccess.getMonthAccess().getActualEntriesAssignment_7()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1583:1: ( rule__Month__ActualEntriesAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1583:2: rule__Month__ActualEntriesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl3231);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1593:1: rule__Month__Group__8 : rule__Month__Group__8__Impl ;
    public final void rule__Month__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1597:1: ( rule__Month__Group__8__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1598:2: rule__Month__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__83262);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1604:1: rule__Month__Group__8__Impl : ( '}' ) ;
    public final void rule__Month__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1608:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1609:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1609:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1610:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__8__Impl3290); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1641:1: rule__BudgetEntry__Group_0__0 : rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 ;
    public final void rule__BudgetEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1645:1: ( rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1646:2: rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__0__Impl_in_rule__BudgetEntry__Group_0__03339);
            rule__BudgetEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__1_in_rule__BudgetEntry__Group_0__03342);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1653:1: rule__BudgetEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1657:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1658:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1658:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1659:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1660:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1662:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1672:1: rule__BudgetEntry__Group_0__1 : rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 ;
    public final void rule__BudgetEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1676:1: ( rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1677:2: rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__1__Impl_in_rule__BudgetEntry__Group_0__13400);
            rule__BudgetEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__2_in_rule__BudgetEntry__Group_0__13403);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1684:1: rule__BudgetEntry__Group_0__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__BudgetEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1688:1: ( ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1689:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1689:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1690:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_0_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1691:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1691:2: rule__BudgetEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__CategoryAssignment_0_1_in_rule__BudgetEntry__Group_0__1__Impl3430);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1701:1: rule__BudgetEntry__Group_0__2 : rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 ;
    public final void rule__BudgetEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1705:1: ( rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1706:2: rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__2__Impl_in_rule__BudgetEntry__Group_0__23460);
            rule__BudgetEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__3_in_rule__BudgetEntry__Group_0__23463);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1713:1: rule__BudgetEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1717:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1718:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1718:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1719:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__BudgetEntry__Group_0__2__Impl3491); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1732:1: rule__BudgetEntry__Group_0__3 : rule__BudgetEntry__Group_0__3__Impl ;
    public final void rule__BudgetEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1736:1: ( rule__BudgetEntry__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1737:2: rule__BudgetEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__3__Impl_in_rule__BudgetEntry__Group_0__33522);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1743:1: rule__BudgetEntry__Group_0__3__Impl : ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__BudgetEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1747:1: ( ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1748:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1748:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1749:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountAssignment_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1750:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1750:2: rule__BudgetEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__AmountAssignment_0_3_in_rule__BudgetEntry__Group_0__3__Impl3549);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1768:1: rule__BudgetEntry__Group_1__0 : rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 ;
    public final void rule__BudgetEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1772:1: ( rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1773:2: rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__0__Impl_in_rule__BudgetEntry__Group_1__03587);
            rule__BudgetEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__1_in_rule__BudgetEntry__Group_1__03590);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1780:1: rule__BudgetEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1784:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1785:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1785:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1786:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1787:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1789:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1799:1: rule__BudgetEntry__Group_1__1 : rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 ;
    public final void rule__BudgetEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1803:1: ( rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1804:2: rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__1__Impl_in_rule__BudgetEntry__Group_1__13648);
            rule__BudgetEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__2_in_rule__BudgetEntry__Group_1__13651);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1811:1: rule__BudgetEntry__Group_1__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__BudgetEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1815:1: ( ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1816:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1816:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1817:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_1_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1818:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1818:2: rule__BudgetEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__CategoryAssignment_1_1_in_rule__BudgetEntry__Group_1__1__Impl3678);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1828:1: rule__BudgetEntry__Group_1__2 : rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 ;
    public final void rule__BudgetEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1832:1: ( rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1833:2: rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__2__Impl_in_rule__BudgetEntry__Group_1__23708);
            rule__BudgetEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__3_in_rule__BudgetEntry__Group_1__23711);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1840:1: rule__BudgetEntry__Group_1__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1844:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1845:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1845:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1846:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2()); 
            match(input,35,FOLLOW_35_in_rule__BudgetEntry__Group_1__2__Impl3739); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1859:1: rule__BudgetEntry__Group_1__3 : rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 ;
    public final void rule__BudgetEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1863:1: ( rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1864:2: rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__3__Impl_in_rule__BudgetEntry__Group_1__33770);
            rule__BudgetEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__4_in_rule__BudgetEntry__Group_1__33773);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1871:1: rule__BudgetEntry__Group_1__3__Impl : ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) ;
    public final void rule__BudgetEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1875:1: ( ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1876:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1876:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1877:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1878:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1878:2: rule__BudgetEntry__BaseEntryAssignment_1_3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__BaseEntryAssignment_1_3_in_rule__BudgetEntry__Group_1__3__Impl3800);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1888:1: rule__BudgetEntry__Group_1__4 : rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 ;
    public final void rule__BudgetEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1892:1: ( rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1893:2: rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__4__Impl_in_rule__BudgetEntry__Group_1__43830);
            rule__BudgetEntry__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__5_in_rule__BudgetEntry__Group_1__43833);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1900:1: rule__BudgetEntry__Group_1__4__Impl : ( '*' ) ;
    public final void rule__BudgetEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1904:1: ( ( '*' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1905:1: ( '*' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1905:1: ( '*' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1906:1: '*'
            {
             before(grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4()); 
            match(input,36,FOLLOW_36_in_rule__BudgetEntry__Group_1__4__Impl3861); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1919:1: rule__BudgetEntry__Group_1__5 : rule__BudgetEntry__Group_1__5__Impl ;
    public final void rule__BudgetEntry__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1923:1: ( rule__BudgetEntry__Group_1__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1924:2: rule__BudgetEntry__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__5__Impl_in_rule__BudgetEntry__Group_1__53892);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1930:1: rule__BudgetEntry__Group_1__5__Impl : ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) ;
    public final void rule__BudgetEntry__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1934:1: ( ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1935:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1935:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1936:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorAssignment_1_5()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1937:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1937:2: rule__BudgetEntry__FactorAssignment_1_5
            {
            pushFollow(FOLLOW_rule__BudgetEntry__FactorAssignment_1_5_in_rule__BudgetEntry__Group_1__5__Impl3919);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1959:1: rule__ActualEntry__Group_0__0 : rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 ;
    public final void rule__ActualEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1963:1: ( rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1964:2: rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__0__Impl_in_rule__ActualEntry__Group_0__03961);
            rule__ActualEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__1_in_rule__ActualEntry__Group_0__03964);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1971:1: rule__ActualEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1975:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1976:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1976:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1977:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1978:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1980:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1990:1: rule__ActualEntry__Group_0__1 : rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 ;
    public final void rule__ActualEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1994:1: ( rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1995:2: rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__1__Impl_in_rule__ActualEntry__Group_0__14022);
            rule__ActualEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__2_in_rule__ActualEntry__Group_0__14025);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2002:1: rule__ActualEntry__Group_0__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__ActualEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2006:1: ( ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2007:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2007:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2008:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_0_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2009:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2009:2: rule__ActualEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ActualEntry__CategoryAssignment_0_1_in_rule__ActualEntry__Group_0__1__Impl4052);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2019:1: rule__ActualEntry__Group_0__2 : rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 ;
    public final void rule__ActualEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2023:1: ( rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2024:2: rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__2__Impl_in_rule__ActualEntry__Group_0__24082);
            rule__ActualEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__3_in_rule__ActualEntry__Group_0__24085);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2031:1: rule__ActualEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__ActualEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2035:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2036:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2036:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2037:1: ':'
            {
             before(grammarAccess.getActualEntryAccess().getColonKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__ActualEntry__Group_0__2__Impl4113); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2050:1: rule__ActualEntry__Group_0__3 : rule__ActualEntry__Group_0__3__Impl ;
    public final void rule__ActualEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2054:1: ( rule__ActualEntry__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2055:2: rule__ActualEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__3__Impl_in_rule__ActualEntry__Group_0__34144);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2061:1: rule__ActualEntry__Group_0__3__Impl : ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__ActualEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2065:1: ( ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2066:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2066:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2067:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getActualEntryAccess().getAmountAssignment_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2068:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2068:2: rule__ActualEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_rule__ActualEntry__AmountAssignment_0_3_in_rule__ActualEntry__Group_0__3__Impl4171);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2086:1: rule__ActualEntry__Group_1__0 : rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 ;
    public final void rule__ActualEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2090:1: ( rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2091:2: rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__0__Impl_in_rule__ActualEntry__Group_1__04209);
            rule__ActualEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__1_in_rule__ActualEntry__Group_1__04212);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2098:1: rule__ActualEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2102:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2103:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2103:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2104:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2105:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2107:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2117:1: rule__ActualEntry__Group_1__1 : rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 ;
    public final void rule__ActualEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2121:1: ( rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2122:2: rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__1__Impl_in_rule__ActualEntry__Group_1__14270);
            rule__ActualEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__2_in_rule__ActualEntry__Group_1__14273);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2129:1: rule__ActualEntry__Group_1__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__ActualEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2133:1: ( ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2134:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2134:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2135:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_1_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2136:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2136:2: rule__ActualEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ActualEntry__CategoryAssignment_1_1_in_rule__ActualEntry__Group_1__1__Impl4300);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2146:1: rule__ActualEntry__Group_1__2 : rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 ;
    public final void rule__ActualEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2150:1: ( rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2151:2: rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__2__Impl_in_rule__ActualEntry__Group_1__24330);
            rule__ActualEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__3_in_rule__ActualEntry__Group_1__24333);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2158:1: rule__ActualEntry__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ActualEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2162:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2163:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2163:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2164:1: '{'
            {
             before(grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__ActualEntry__Group_1__2__Impl4361); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2177:1: rule__ActualEntry__Group_1__3 : rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 ;
    public final void rule__ActualEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2181:1: ( rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2182:2: rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__3__Impl_in_rule__ActualEntry__Group_1__34392);
            rule__ActualEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__4_in_rule__ActualEntry__Group_1__34395);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2189:1: rule__ActualEntry__Group_1__3__Impl : ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) ;
    public final void rule__ActualEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2193:1: ( ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2194:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2194:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2195:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2195:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2196:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2197:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2197:2: rule__ActualEntry__TransactionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4424);
            rule__ActualEntry__TransactionsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 

            }

            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2200:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2201:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2202:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2202:2: rule__ActualEntry__TransactionsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4436);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2213:1: rule__ActualEntry__Group_1__4 : rule__ActualEntry__Group_1__4__Impl ;
    public final void rule__ActualEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2217:1: ( rule__ActualEntry__Group_1__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2218:2: rule__ActualEntry__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__4__Impl_in_rule__ActualEntry__Group_1__44469);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2224:1: rule__ActualEntry__Group_1__4__Impl : ( '}' ) ;
    public final void rule__ActualEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2228:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2229:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2229:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2230:1: '}'
            {
             before(grammarAccess.getActualEntryAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,26,FOLLOW_26_in_rule__ActualEntry__Group_1__4__Impl4497); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2253:1: rule__Transaction__Group_0__0 : rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 ;
    public final void rule__Transaction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2257:1: ( rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2258:2: rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__0__Impl_in_rule__Transaction__Group_0__04538);
            rule__Transaction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__1_in_rule__Transaction__Group_0__04541);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2265:1: rule__Transaction__Group_0__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2269:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2270:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2270:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2271:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCashTransactionAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2272:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2274:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2284:1: rule__Transaction__Group_0__1 : rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 ;
    public final void rule__Transaction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2288:1: ( rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2289:2: rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__1__Impl_in_rule__Transaction__Group_0__14599);
            rule__Transaction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__2_in_rule__Transaction__Group_0__14602);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2296:1: rule__Transaction__Group_0__1__Impl : ( 'cash' ) ;
    public final void rule__Transaction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2300:1: ( ( 'cash' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2301:1: ( 'cash' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2301:1: ( 'cash' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2302:1: 'cash'
            {
             before(grammarAccess.getTransactionAccess().getCashKeyword_0_1()); 
            match(input,37,FOLLOW_37_in_rule__Transaction__Group_0__1__Impl4630); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2315:1: rule__Transaction__Group_0__2 : rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 ;
    public final void rule__Transaction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2319:1: ( rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2320:2: rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__2__Impl_in_rule__Transaction__Group_0__24661);
            rule__Transaction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__3_in_rule__Transaction__Group_0__24664);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2327:1: rule__Transaction__Group_0__2__Impl : ( ( rule__Transaction__AmountAssignment_0_2 ) ) ;
    public final void rule__Transaction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2331:1: ( ( ( rule__Transaction__AmountAssignment_0_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2332:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2332:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2333:1: ( rule__Transaction__AmountAssignment_0_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_0_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2334:1: ( rule__Transaction__AmountAssignment_0_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2334:2: rule__Transaction__AmountAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Transaction__AmountAssignment_0_2_in_rule__Transaction__Group_0__2__Impl4691);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2344:1: rule__Transaction__Group_0__3 : rule__Transaction__Group_0__3__Impl ;
    public final void rule__Transaction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2348:1: ( rule__Transaction__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2349:2: rule__Transaction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__3__Impl_in_rule__Transaction__Group_0__34721);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2355:1: rule__Transaction__Group_0__3__Impl : ( ( rule__Transaction__Group_0_3__0 )? ) ;
    public final void rule__Transaction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2359:1: ( ( ( rule__Transaction__Group_0_3__0 )? ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2360:1: ( ( rule__Transaction__Group_0_3__0 )? )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2360:1: ( ( rule__Transaction__Group_0_3__0 )? )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2361:1: ( rule__Transaction__Group_0_3__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2362:1: ( rule__Transaction__Group_0_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2362:2: rule__Transaction__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_0_3__0_in_rule__Transaction__Group_0__3__Impl4748);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2380:1: rule__Transaction__Group_0_3__0 : rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 ;
    public final void rule__Transaction__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2384:1: ( rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2385:2: rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0_3__0__Impl_in_rule__Transaction__Group_0_3__04787);
            rule__Transaction__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0_3__1_in_rule__Transaction__Group_0_3__04790);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2392:1: rule__Transaction__Group_0_3__0__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2396:1: ( ( 'on' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2397:1: ( 'on' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2397:1: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2398:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_0_3_0()); 
            match(input,38,FOLLOW_38_in_rule__Transaction__Group_0_3__0__Impl4818); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2411:1: rule__Transaction__Group_0_3__1 : rule__Transaction__Group_0_3__1__Impl ;
    public final void rule__Transaction__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2415:1: ( rule__Transaction__Group_0_3__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2416:2: rule__Transaction__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0_3__1__Impl_in_rule__Transaction__Group_0_3__14849);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2422:1: rule__Transaction__Group_0_3__1__Impl : ( ( rule__Transaction__DayAssignment_0_3_1 ) ) ;
    public final void rule__Transaction__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2426:1: ( ( ( rule__Transaction__DayAssignment_0_3_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2427:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2427:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2428:1: ( rule__Transaction__DayAssignment_0_3_1 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_0_3_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2429:1: ( rule__Transaction__DayAssignment_0_3_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2429:2: rule__Transaction__DayAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Transaction__DayAssignment_0_3_1_in_rule__Transaction__Group_0_3__1__Impl4876);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2443:1: rule__Transaction__Group_1__0 : rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 ;
    public final void rule__Transaction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2447:1: ( rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2448:2: rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__04910);
            rule__Transaction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__04913);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2455:1: rule__Transaction__Group_1__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2459:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2460:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2460:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2461:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCardTransactionAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2462:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2464:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2474:1: rule__Transaction__Group_1__1 : rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 ;
    public final void rule__Transaction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2478:1: ( rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2479:2: rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__14971);
            rule__Transaction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__2_in_rule__Transaction__Group_1__14974);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2486:1: rule__Transaction__Group_1__1__Impl : ( 'card' ) ;
    public final void rule__Transaction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2490:1: ( ( 'card' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2491:1: ( 'card' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2491:1: ( 'card' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2492:1: 'card'
            {
             before(grammarAccess.getTransactionAccess().getCardKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__Transaction__Group_1__1__Impl5002); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2505:1: rule__Transaction__Group_1__2 : rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 ;
    public final void rule__Transaction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2509:1: ( rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2510:2: rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__2__Impl_in_rule__Transaction__Group_1__25033);
            rule__Transaction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__3_in_rule__Transaction__Group_1__25036);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2517:1: rule__Transaction__Group_1__2__Impl : ( ( rule__Transaction__AmountAssignment_1_2 ) ) ;
    public final void rule__Transaction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2521:1: ( ( ( rule__Transaction__AmountAssignment_1_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2522:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2522:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2523:1: ( rule__Transaction__AmountAssignment_1_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_1_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2524:1: ( rule__Transaction__AmountAssignment_1_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2524:2: rule__Transaction__AmountAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Transaction__AmountAssignment_1_2_in_rule__Transaction__Group_1__2__Impl5063);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2534:1: rule__Transaction__Group_1__3 : rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 ;
    public final void rule__Transaction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2538:1: ( rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2539:2: rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__3__Impl_in_rule__Transaction__Group_1__35093);
            rule__Transaction__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__4_in_rule__Transaction__Group_1__35096);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2546:1: rule__Transaction__Group_1__3__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2550:1: ( ( 'on' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2551:1: ( 'on' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2551:1: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2552:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_1_3()); 
            match(input,38,FOLLOW_38_in_rule__Transaction__Group_1__3__Impl5124); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2565:1: rule__Transaction__Group_1__4 : rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 ;
    public final void rule__Transaction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2569:1: ( rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2570:2: rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__4__Impl_in_rule__Transaction__Group_1__45155);
            rule__Transaction__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__5_in_rule__Transaction__Group_1__45158);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2577:1: rule__Transaction__Group_1__4__Impl : ( ( rule__Transaction__DayAssignment_1_4 ) ) ;
    public final void rule__Transaction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2581:1: ( ( ( rule__Transaction__DayAssignment_1_4 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2582:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2582:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2583:1: ( rule__Transaction__DayAssignment_1_4 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_1_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2584:1: ( rule__Transaction__DayAssignment_1_4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2584:2: rule__Transaction__DayAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Transaction__DayAssignment_1_4_in_rule__Transaction__Group_1__4__Impl5185);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2594:1: rule__Transaction__Group_1__5 : rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 ;
    public final void rule__Transaction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2598:1: ( rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2599:2: rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__5__Impl_in_rule__Transaction__Group_1__55215);
            rule__Transaction__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__6_in_rule__Transaction__Group_1__55218);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2606:1: rule__Transaction__Group_1__5__Impl : ( 'from' ) ;
    public final void rule__Transaction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2610:1: ( ( 'from' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2611:1: ( 'from' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2611:1: ( 'from' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2612:1: 'from'
            {
             before(grammarAccess.getTransactionAccess().getFromKeyword_1_5()); 
            match(input,40,FOLLOW_40_in_rule__Transaction__Group_1__5__Impl5246); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2625:1: rule__Transaction__Group_1__6 : rule__Transaction__Group_1__6__Impl ;
    public final void rule__Transaction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2629:1: ( rule__Transaction__Group_1__6__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2630:2: rule__Transaction__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__6__Impl_in_rule__Transaction__Group_1__65277);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2636:1: rule__Transaction__Group_1__6__Impl : ( ( rule__Transaction__FromAssignment_1_6 ) ) ;
    public final void rule__Transaction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2640:1: ( ( ( rule__Transaction__FromAssignment_1_6 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2641:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2641:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2642:1: ( rule__Transaction__FromAssignment_1_6 )
            {
             before(grammarAccess.getTransactionAccess().getFromAssignment_1_6()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2643:1: ( rule__Transaction__FromAssignment_1_6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2643:2: rule__Transaction__FromAssignment_1_6
            {
            pushFollow(FOLLOW_rule__Transaction__FromAssignment_1_6_in_rule__Transaction__Group_1__6__Impl5304);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2668:1: rule__Library__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Library__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2672:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2673:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2673:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2674:1: RULE_ID
            {
             before(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Library__NameAssignment_15353); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2683:1: rule__Library__CategoriesAssignment_3 : ( ruleCategory ) ;
    public final void rule__Library__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2687:1: ( ( ruleCategory ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2688:1: ( ruleCategory )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2688:1: ( ruleCategory )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2689:1: ruleCategory
            {
             before(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_35384);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2698:1: rule__Category__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2702:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2703:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2703:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2704:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_0_25415); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2713:1: rule__Category__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2717:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2718:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2718:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2719:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_1_25446); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2728:1: rule__Category__PatternsAssignment_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Category__PatternsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2732:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2733:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2733:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2734:1: RULE_STRING
            {
             before(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_15477); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2743:1: rule__Category__PatternsAssignment_1_3_2_1 : ( RULE_STRING ) ;
    public final void rule__Category__PatternsAssignment_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2747:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2748:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2748:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2749:1: RULE_STRING
            {
             before(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_2_15508); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2758:1: rule__Year__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__Year__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2762:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2763:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2763:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2764:1: RULE_INT
            {
             before(grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Year__NameAssignment_05539); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2773:1: rule__Year__LibraryAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Year__LibraryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2777:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2778:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2778:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2779:1: ( RULE_ID )
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2780:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2781:1: RULE_ID
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_25574); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2792:1: rule__Year__MonthsAssignment_4 : ( ruleMonth ) ;
    public final void rule__Year__MonthsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2796:1: ( ( ruleMonth ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2797:1: ( ruleMonth )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2797:1: ( ruleMonth )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2798:1: ruleMonth
            {
             before(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_45609);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2807:1: rule__Month__NameAssignment_0 : ( ruleMonthEnum ) ;
    public final void rule__Month__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2811:1: ( ( ruleMonthEnum ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2812:1: ( ruleMonthEnum )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2812:1: ( ruleMonthEnum )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2813:1: ruleMonthEnum
            {
             before(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_05640);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2822:1: rule__Month__BudgetEntriesAssignment_3 : ( ruleBudgetEntry ) ;
    public final void rule__Month__BudgetEntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2826:1: ( ( ruleBudgetEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2827:1: ( ruleBudgetEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2827:1: ( ruleBudgetEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2828:1: ruleBudgetEntry
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBudgetEntry_in_rule__Month__BudgetEntriesAssignment_35671);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2837:1: rule__Month__ActualEntriesAssignment_7 : ( ruleActualEntry ) ;
    public final void rule__Month__ActualEntriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2841:1: ( ( ruleActualEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2842:1: ( ruleActualEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2842:1: ( ruleActualEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2843:1: ruleActualEntry
            {
             before(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleActualEntry_in_rule__Month__ActualEntriesAssignment_75702);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2852:1: rule__BudgetEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2856:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2857:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2857:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2858:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2859:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2860:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_0_15737); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2871:1: rule__BudgetEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__BudgetEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2875:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2876:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2876:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2877:1: ruleDollar
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__BudgetEntry__AmountAssignment_0_35772);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2886:1: rule__BudgetEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2890:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2891:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2891:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2892:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2893:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2894:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_1_15807); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2905:1: rule__BudgetEntry__BaseEntryAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__BaseEntryAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2909:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2910:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2910:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2911:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2912:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2913:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__BaseEntryAssignment_1_35846); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2924:1: rule__BudgetEntry__FactorAssignment_1_5 : ( ruleDouble ) ;
    public final void rule__BudgetEntry__FactorAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2928:1: ( ( ruleDouble ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2929:1: ( ruleDouble )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2929:1: ( ruleDouble )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2930:1: ruleDouble
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_ruleDouble_in_rule__BudgetEntry__FactorAssignment_1_55881);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2939:1: rule__ActualEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2943:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2944:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2944:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2945:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2946:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2947:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_0_15916); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2958:1: rule__ActualEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__ActualEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2962:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2963:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2963:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2964:1: ruleDollar
            {
             before(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__ActualEntry__AmountAssignment_0_35951);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2973:1: rule__ActualEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2977:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2978:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2978:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2979:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2980:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2981:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_1_15986); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2992:1: rule__ActualEntry__TransactionsAssignment_1_3 : ( ruleTransaction ) ;
    public final void rule__ActualEntry__TransactionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2996:1: ( ( ruleTransaction ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2997:1: ( ruleTransaction )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2997:1: ( ruleTransaction )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2998:1: ruleTransaction
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__ActualEntry__TransactionsAssignment_1_36021);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3007:1: rule__Transaction__AmountAssignment_0_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3011:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3012:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3012:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3013:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_0_26052);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3022:1: rule__Transaction__DayAssignment_0_3_1 : ( RULE_INT ) ;
    public final void rule__Transaction__DayAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3026:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3027:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3027:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3028:1: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_0_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_0_3_16083); 
             after(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_0_3_1_0()); 

            }


            }

        }
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3037:1: rule__Transaction__AmountAssignment_1_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3041:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3042:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3042:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3043:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_1_26114);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3052:1: rule__Transaction__DayAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__Transaction__DayAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3056:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3057:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3057:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3058:1: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_1_46145); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3067:1: rule__Transaction__FromAssignment_1_6 : ( RULE_STRING ) ;
    public final void rule__Transaction__FromAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3071:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3072:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3072:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3073:1: RULE_STRING
            {
             before(grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Transaction__FromAssignment_1_66176); 
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


 

    public static final BitSet FOLLOW_ruleBudgetingFile_in_entryRuleBudgetingFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBudgetingFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetingFile__Alternatives_in_ruleBudgetingFile94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibrary128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__0_in_ruleLibrary154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Alternatives_in_ruleCategory214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYear_in_entryRuleYear241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYear248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__0_in_ruleYear274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_entryRuleMonth301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonth308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__0_in_ruleMonth334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBudgetEntry_in_entryRuleBudgetEntry361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBudgetEntry368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Alternatives_in_ruleBudgetEntry394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualEntry_in_entryRuleActualEntry421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualEntry428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Alternatives_in_ruleActualEntry454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Alternatives_in_ruleTransaction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_entryRuleDollar541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDollar548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleDollar574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Alternatives_in_ruleDouble633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthEnum__Alternatives_in_ruleMonthEnum670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_rule__BudgetingFile__Alternatives705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYear_in_rule__BudgetingFile__Alternatives722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__0_in_rule__Category__Alternatives754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__0_in_rule__Category__Alternatives772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__0_in_rule__BudgetEntry__Alternatives805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__0_in_rule__BudgetEntry__Alternatives823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__0_in_rule__ActualEntry__Alternatives856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__0_in_rule__ActualEntry__Alternatives874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__0_in_rule__Transaction__Alternatives907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Alternatives925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Double__Alternatives975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MonthEnum__Alternatives1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MonthEnum__Alternatives1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MonthEnum__Alternatives1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MonthEnum__Alternatives1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MonthEnum__Alternatives1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MonthEnum__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MonthEnum__Alternatives1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MonthEnum__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MonthEnum__Alternatives1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MonthEnum__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MonthEnum__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MonthEnum__Alternatives1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01272 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Library__Group__0__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11334 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21394 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Library__Group__2__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31456 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1486 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Library__Group__4__Impl1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__0__Impl_in_rule__Category__Group_0__01586 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Category__Group_0__1_in_rule__Category__Group_0__01589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__1__Impl_in_rule__Category__Group_0__11647 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Category__Group_0__2_in_rule__Category__Group_0__11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Category__Group_0__1__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__2__Impl_in_rule__Category__Group_0__21709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_0_2_in_rule__Category__Group_0__2__Impl1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__0__Impl_in_rule__Category__Group_1__01772 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1__1_in_rule__Category__Group_1__01775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__1__Impl_in_rule__Category__Group_1__11833 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Category__Group_1__2_in_rule__Category__Group_1__11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Category__Group_1__1__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__2__Impl_in_rule__Category__Group_1__21895 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1__3_in_rule__Category__Group_1__21898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_1_2_in_rule__Category__Group_1__2__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__3__Impl_in_rule__Category__Group_1__31955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__0_in_rule__Category__Group_1__3__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__0__Impl_in_rule__Category__Group_1_3__02021 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__1_in_rule__Category__Group_1_3__02024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Category__Group_1_3__0__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__1__Impl_in_rule__Category__Group_1_3__12083 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__2_in_rule__Category__Group_1_3__12086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__PatternsAssignment_1_3_1_in_rule__Category__Group_1_3__1__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__2__Impl_in_rule__Category__Group_1_3__22143 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__3_in_rule__Category__Group_1_3__22146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__0_in_rule__Category__Group_1_3__2__Impl2173 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__3__Impl_in_rule__Category__Group_1_3__32204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Category__Group_1_3__3__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__0__Impl_in_rule__Category__Group_1_3_2__02271 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__1_in_rule__Category__Group_1_3_2__02274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Category__Group_1_3_2__0__Impl2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__1__Impl_in_rule__Category__Group_1_3_2__12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__PatternsAssignment_1_3_2_1_in_rule__Category__Group_1_3_2__1__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__02394 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Year__Group__1_in_rule__Year__Group__02397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__12454 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Year__Group__2_in_rule__Year__Group__12457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Year__Group__1__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__22516 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Year__Group__3_in_rule__Year__Group__22519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__32576 = new BitSet(new long[]{0x0000000004FFF000L});
    public static final BitSet FOLLOW_rule__Year__Group__4_in_rule__Year__Group__32579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Year__Group__3__Impl2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__42638 = new BitSet(new long[]{0x0000000004FFF000L});
    public static final BitSet FOLLOW_rule__Year__Group__5_in_rule__Year__Group__42641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl2668 = new BitSet(new long[]{0x0000000000FFF002L});
    public static final BitSet FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__52699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Year__Group__5__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__02770 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Month__Group__1_in_rule__Month__Group__02773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__12830 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Month__Group__2_in_rule__Month__Group__12833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Month__Group__1__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__22892 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__3_in_rule__Month__Group__22895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Month__Group__2__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__32954 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__4_in_rule__Month__Group__32957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl2984 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__43015 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Month__Group__5_in_rule__Month__Group__43018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__4__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__53077 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Month__Group__6_in_rule__Month__Group__53080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Month__Group__5__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__63139 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__7_in_rule__Month__Group__63142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Month__Group__6__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__73201 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__8_in_rule__Month__Group__73204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl3231 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__83262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__8__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__0__Impl_in_rule__BudgetEntry__Group_0__03339 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__1_in_rule__BudgetEntry__Group_0__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__1__Impl_in_rule__BudgetEntry__Group_0__13400 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__2_in_rule__BudgetEntry__Group_0__13403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__CategoryAssignment_0_1_in_rule__BudgetEntry__Group_0__1__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__2__Impl_in_rule__BudgetEntry__Group_0__23460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__3_in_rule__BudgetEntry__Group_0__23463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BudgetEntry__Group_0__2__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__3__Impl_in_rule__BudgetEntry__Group_0__33522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__AmountAssignment_0_3_in_rule__BudgetEntry__Group_0__3__Impl3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__0__Impl_in_rule__BudgetEntry__Group_1__03587 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__1_in_rule__BudgetEntry__Group_1__03590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__1__Impl_in_rule__BudgetEntry__Group_1__13648 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__2_in_rule__BudgetEntry__Group_1__13651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__CategoryAssignment_1_1_in_rule__BudgetEntry__Group_1__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__2__Impl_in_rule__BudgetEntry__Group_1__23708 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__3_in_rule__BudgetEntry__Group_1__23711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BudgetEntry__Group_1__2__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__3__Impl_in_rule__BudgetEntry__Group_1__33770 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__4_in_rule__BudgetEntry__Group_1__33773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__BaseEntryAssignment_1_3_in_rule__BudgetEntry__Group_1__3__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__4__Impl_in_rule__BudgetEntry__Group_1__43830 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__5_in_rule__BudgetEntry__Group_1__43833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BudgetEntry__Group_1__4__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__5__Impl_in_rule__BudgetEntry__Group_1__53892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__FactorAssignment_1_5_in_rule__BudgetEntry__Group_1__5__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__0__Impl_in_rule__ActualEntry__Group_0__03961 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__1_in_rule__ActualEntry__Group_0__03964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__1__Impl_in_rule__ActualEntry__Group_0__14022 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__2_in_rule__ActualEntry__Group_0__14025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__CategoryAssignment_0_1_in_rule__ActualEntry__Group_0__1__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__2__Impl_in_rule__ActualEntry__Group_0__24082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__3_in_rule__ActualEntry__Group_0__24085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ActualEntry__Group_0__2__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__3__Impl_in_rule__ActualEntry__Group_0__34144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__AmountAssignment_0_3_in_rule__ActualEntry__Group_0__3__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__0__Impl_in_rule__ActualEntry__Group_1__04209 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__1_in_rule__ActualEntry__Group_1__04212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__1__Impl_in_rule__ActualEntry__Group_1__14270 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__2_in_rule__ActualEntry__Group_1__14273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__CategoryAssignment_1_1_in_rule__ActualEntry__Group_1__1__Impl4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__2__Impl_in_rule__ActualEntry__Group_1__24330 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__3_in_rule__ActualEntry__Group_1__24333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActualEntry__Group_1__2__Impl4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__3__Impl_in_rule__ActualEntry__Group_1__34392 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__4_in_rule__ActualEntry__Group_1__34395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4424 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4436 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__4__Impl_in_rule__ActualEntry__Group_1__44469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ActualEntry__Group_1__4__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__0__Impl_in_rule__Transaction__Group_0__04538 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__1_in_rule__Transaction__Group_0__04541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__1__Impl_in_rule__Transaction__Group_0__14599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__2_in_rule__Transaction__Group_0__14602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Transaction__Group_0__1__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__2__Impl_in_rule__Transaction__Group_0__24661 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__3_in_rule__Transaction__Group_0__24664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AmountAssignment_0_2_in_rule__Transaction__Group_0__2__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__3__Impl_in_rule__Transaction__Group_0__34721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__0_in_rule__Transaction__Group_0__3__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__0__Impl_in_rule__Transaction__Group_0_3__04787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__1_in_rule__Transaction__Group_0_3__04790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Transaction__Group_0_3__0__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__1__Impl_in_rule__Transaction__Group_0_3__14849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__DayAssignment_0_3_1_in_rule__Transaction__Group_0_3__1__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__04910 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__04913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__14971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__2_in_rule__Transaction__Group_1__14974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Transaction__Group_1__1__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__2__Impl_in_rule__Transaction__Group_1__25033 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__3_in_rule__Transaction__Group_1__25036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AmountAssignment_1_2_in_rule__Transaction__Group_1__2__Impl5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__3__Impl_in_rule__Transaction__Group_1__35093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__4_in_rule__Transaction__Group_1__35096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Transaction__Group_1__3__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__4__Impl_in_rule__Transaction__Group_1__45155 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__5_in_rule__Transaction__Group_1__45158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__DayAssignment_1_4_in_rule__Transaction__Group_1__4__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__5__Impl_in_rule__Transaction__Group_1__55215 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__6_in_rule__Transaction__Group_1__55218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Transaction__Group_1__5__Impl5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__6__Impl_in_rule__Transaction__Group_1__65277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__FromAssignment_1_6_in_rule__Transaction__Group_1__6__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Library__NameAssignment_15353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_35384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_0_25415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_1_25446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_15477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_2_15508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Year__NameAssignment_05539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_25574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_45609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_05640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBudgetEntry_in_rule__Month__BudgetEntriesAssignment_35671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualEntry_in_rule__Month__ActualEntriesAssignment_75702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_0_15737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__BudgetEntry__AmountAssignment_0_35772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_1_15807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__BaseEntryAssignment_1_35846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__BudgetEntry__FactorAssignment_1_55881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_0_15916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__ActualEntry__AmountAssignment_0_35951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_1_15986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__ActualEntry__TransactionsAssignment_1_36021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_0_26052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_0_3_16083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_1_26114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_1_46145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Transaction__FromAssignment_1_66176 = new BitSet(new long[]{0x0000000000000002L});

}