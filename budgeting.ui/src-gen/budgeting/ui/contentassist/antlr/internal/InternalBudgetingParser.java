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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:286:1: entryRuleDollar : ruleDollar EOF ;
    public final void entryRuleDollar() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:287:1: ( ruleDollar EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:288:1: ruleDollar EOF
            {
             before(grammarAccess.getDollarRule()); 
            pushFollow(FOLLOW_ruleDollar_in_entryRuleDollar543);
            ruleDollar();

            state._fsp--;

             after(grammarAccess.getDollarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDollar550); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:295:1: ruleDollar : ( RULE_DECIMAL ) ;
    public final void ruleDollar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:299:2: ( ( RULE_DECIMAL ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:300:1: ( RULE_DECIMAL )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:300:1: ( RULE_DECIMAL )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:301:1: RULE_DECIMAL
            {
             before(grammarAccess.getDollarAccess().getDECIMALTerminalRuleCall()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleDollar576); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:314:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:315:1: ( ruleDouble EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:316:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble602);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble609); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:323:1: ruleDouble : ( ( rule__Double__Alternatives ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:327:2: ( ( ( rule__Double__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:328:1: ( ( rule__Double__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:328:1: ( ( rule__Double__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:329:1: ( rule__Double__Alternatives )
            {
             before(grammarAccess.getDoubleAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:330:1: ( rule__Double__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:330:2: rule__Double__Alternatives
            {
            pushFollow(FOLLOW_rule__Double__Alternatives_in_ruleDouble635);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:343:1: ruleMonthEnum : ( ( rule__MonthEnum__Alternatives ) ) ;
    public final void ruleMonthEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:347:1: ( ( ( rule__MonthEnum__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:348:1: ( ( rule__MonthEnum__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:348:1: ( ( rule__MonthEnum__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:349:1: ( rule__MonthEnum__Alternatives )
            {
             before(grammarAccess.getMonthEnumAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:350:1: ( rule__MonthEnum__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:350:2: rule__MonthEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__MonthEnum__Alternatives_in_ruleMonthEnum672);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:361:1: rule__BudgetingFile__Alternatives : ( ( ruleLibrary ) | ( ruleYear ) );
    public final void rule__BudgetingFile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:365:1: ( ( ruleLibrary ) | ( ruleYear ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:366:1: ( ruleLibrary )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:366:1: ( ruleLibrary )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:367:1: ruleLibrary
                    {
                     before(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLibrary_in_rule__BudgetingFile__Alternatives707);
                    ruleLibrary();

                    state._fsp--;

                     after(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:372:6: ( ruleYear )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:372:6: ( ruleYear )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:373:1: ruleYear
                    {
                     before(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleYear_in_rule__BudgetingFile__Alternatives724);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:383:1: rule__Category__Alternatives : ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Group_1__0 ) ) );
    public final void rule__Category__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:387:1: ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:388:1: ( ( rule__Category__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:388:1: ( ( rule__Category__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:389:1: ( rule__Category__Group_0__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:390:1: ( rule__Category__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:390:2: rule__Category__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_0__0_in_rule__Category__Alternatives756);
                    rule__Category__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCategoryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:394:6: ( ( rule__Category__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:394:6: ( ( rule__Category__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:395:1: ( rule__Category__Group_1__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:396:1: ( rule__Category__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:396:2: rule__Category__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_1__0_in_rule__Category__Alternatives774);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:405:1: rule__BudgetEntry__Alternatives : ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) );
    public final void rule__BudgetEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:409:1: ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:410:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:410:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:411:1: ( rule__BudgetEntry__Group_0__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:412:1: ( rule__BudgetEntry__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:412:2: rule__BudgetEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BudgetEntry__Group_0__0_in_rule__BudgetEntry__Alternatives807);
                    rule__BudgetEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBudgetEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:416:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:416:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:417:1: ( rule__BudgetEntry__Group_1__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:418:1: ( rule__BudgetEntry__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:418:2: rule__BudgetEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BudgetEntry__Group_1__0_in_rule__BudgetEntry__Alternatives825);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:427:1: rule__ActualEntry__Alternatives : ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) );
    public final void rule__ActualEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:431:1: ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:432:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:432:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:433:1: ( rule__ActualEntry__Group_0__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:434:1: ( rule__ActualEntry__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:434:2: rule__ActualEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualEntry__Group_0__0_in_rule__ActualEntry__Alternatives858);
                    rule__ActualEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActualEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:438:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:438:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:439:1: ( rule__ActualEntry__Group_1__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:440:1: ( rule__ActualEntry__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:440:2: rule__ActualEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ActualEntry__Group_1__0_in_rule__ActualEntry__Alternatives876);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:449:1: rule__Transaction__Alternatives : ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) );
    public final void rule__Transaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:453:1: ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:454:1: ( ( rule__Transaction__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:454:1: ( ( rule__Transaction__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:455:1: ( rule__Transaction__Group_0__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:456:1: ( rule__Transaction__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:456:2: rule__Transaction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_0__0_in_rule__Transaction__Alternatives909);
                    rule__Transaction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:460:6: ( ( rule__Transaction__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:460:6: ( ( rule__Transaction__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:461:1: ( rule__Transaction__Group_1__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:462:1: ( rule__Transaction__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:462:2: rule__Transaction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Alternatives927);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:471:1: rule__Double__Alternatives : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Double__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:475:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:476:1: ( RULE_INT )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:476:1: ( RULE_INT )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:477:1: RULE_INT
                    {
                     before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Alternatives960); 
                     after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:482:6: ( RULE_DECIMAL )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:482:6: ( RULE_DECIMAL )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:483:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getDoubleAccess().getDECIMALTerminalRuleCall_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Double__Alternatives977); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:493:1: rule__MonthEnum__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__MonthEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:497:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:498:1: ( ( 'january' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:498:1: ( ( 'january' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:499:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:500:1: ( 'january' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:500:3: 'january'
                    {
                    match(input,12,FOLLOW_12_in_rule__MonthEnum__Alternatives1010); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:505:6: ( ( 'february' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:505:6: ( ( 'february' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:506:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:507:1: ( 'february' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:507:3: 'february'
                    {
                    match(input,13,FOLLOW_13_in_rule__MonthEnum__Alternatives1031); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:512:6: ( ( 'march' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:512:6: ( ( 'march' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:513:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:514:1: ( 'march' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:514:3: 'march'
                    {
                    match(input,14,FOLLOW_14_in_rule__MonthEnum__Alternatives1052); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:519:6: ( ( 'april' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:519:6: ( ( 'april' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:520:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:521:1: ( 'april' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:521:3: 'april'
                    {
                    match(input,15,FOLLOW_15_in_rule__MonthEnum__Alternatives1073); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:526:6: ( ( 'may' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:526:6: ( ( 'may' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:527:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:528:1: ( 'may' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:528:3: 'may'
                    {
                    match(input,16,FOLLOW_16_in_rule__MonthEnum__Alternatives1094); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:533:6: ( ( 'june' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:533:6: ( ( 'june' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:534:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:535:1: ( 'june' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:535:3: 'june'
                    {
                    match(input,17,FOLLOW_17_in_rule__MonthEnum__Alternatives1115); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:540:6: ( ( 'july' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:540:6: ( ( 'july' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:541:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:542:1: ( 'july' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:542:3: 'july'
                    {
                    match(input,18,FOLLOW_18_in_rule__MonthEnum__Alternatives1136); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:547:6: ( ( 'august' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:547:6: ( ( 'august' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:548:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:549:1: ( 'august' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:549:3: 'august'
                    {
                    match(input,19,FOLLOW_19_in_rule__MonthEnum__Alternatives1157); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:554:6: ( ( 'september' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:554:6: ( ( 'september' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:555:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:556:1: ( 'september' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:556:3: 'september'
                    {
                    match(input,20,FOLLOW_20_in_rule__MonthEnum__Alternatives1178); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:561:6: ( ( 'october' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:561:6: ( ( 'october' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:562:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:563:1: ( 'october' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:563:3: 'october'
                    {
                    match(input,21,FOLLOW_21_in_rule__MonthEnum__Alternatives1199); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:568:6: ( ( 'november' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:568:6: ( ( 'november' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:569:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:570:1: ( 'november' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:570:3: 'november'
                    {
                    match(input,22,FOLLOW_22_in_rule__MonthEnum__Alternatives1220); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:575:6: ( ( 'december' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:575:6: ( ( 'december' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:576:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:577:1: ( 'december' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:577:3: 'december'
                    {
                    match(input,23,FOLLOW_23_in_rule__MonthEnum__Alternatives1241); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:589:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:593:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:594:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01274);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01277);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:601:1: rule__Library__Group__0__Impl : ( 'library' ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:605:1: ( ( 'library' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:606:1: ( 'library' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:606:1: ( 'library' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:607:1: 'library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Library__Group__0__Impl1305); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:620:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:624:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:625:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11336);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11339);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:632:1: rule__Library__Group__1__Impl : ( ( rule__Library__NameAssignment_1 ) ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:636:1: ( ( ( rule__Library__NameAssignment_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:637:1: ( ( rule__Library__NameAssignment_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:637:1: ( ( rule__Library__NameAssignment_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:638:1: ( rule__Library__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:639:1: ( rule__Library__NameAssignment_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:639:2: rule__Library__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1366);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:649:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:653:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:654:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21396);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21399);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:661:1: rule__Library__Group__2__Impl : ( '{' ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:665:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:666:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:666:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:667:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Library__Group__2__Impl1427); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:680:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:684:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:685:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31458);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31461);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:692:1: rule__Library__Group__3__Impl : ( ( rule__Library__CategoriesAssignment_3 )* ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:696:1: ( ( ( rule__Library__CategoriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:697:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:697:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:698:1: ( rule__Library__CategoriesAssignment_3 )*
            {
             before(grammarAccess.getLibraryAccess().getCategoriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:699:1: ( rule__Library__CategoriesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:699:2: rule__Library__CategoriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1488);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:709:1: rule__Library__Group__4 : rule__Library__Group__4__Impl ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:713:1: ( rule__Library__Group__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:714:2: rule__Library__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41519);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:720:1: rule__Library__Group__4__Impl : ( '}' ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:724:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:725:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:725:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:726:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Library__Group__4__Impl1547); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:749:1: rule__Category__Group_0__0 : rule__Category__Group_0__0__Impl rule__Category__Group_0__1 ;
    public final void rule__Category__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:753:1: ( rule__Category__Group_0__0__Impl rule__Category__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:754:2: rule__Category__Group_0__0__Impl rule__Category__Group_0__1
            {
            pushFollow(FOLLOW_rule__Category__Group_0__0__Impl_in_rule__Category__Group_0__01588);
            rule__Category__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_0__1_in_rule__Category__Group_0__01591);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:761:1: rule__Category__Group_0__0__Impl : ( () ) ;
    public final void rule__Category__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:765:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:766:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:766:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:767:1: ()
            {
             before(grammarAccess.getCategoryAccess().getIncomeCategoryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:768:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:770:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:780:1: rule__Category__Group_0__1 : rule__Category__Group_0__1__Impl rule__Category__Group_0__2 ;
    public final void rule__Category__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:784:1: ( rule__Category__Group_0__1__Impl rule__Category__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:785:2: rule__Category__Group_0__1__Impl rule__Category__Group_0__2
            {
            pushFollow(FOLLOW_rule__Category__Group_0__1__Impl_in_rule__Category__Group_0__11649);
            rule__Category__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_0__2_in_rule__Category__Group_0__11652);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:792:1: rule__Category__Group_0__1__Impl : ( 'income' ) ;
    public final void rule__Category__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:796:1: ( ( 'income' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:797:1: ( 'income' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:797:1: ( 'income' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:798:1: 'income'
            {
             before(grammarAccess.getCategoryAccess().getIncomeKeyword_0_1()); 
            match(input,27,FOLLOW_27_in_rule__Category__Group_0__1__Impl1680); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:811:1: rule__Category__Group_0__2 : rule__Category__Group_0__2__Impl ;
    public final void rule__Category__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:815:1: ( rule__Category__Group_0__2__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:816:2: rule__Category__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_0__2__Impl_in_rule__Category__Group_0__21711);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:822:1: rule__Category__Group_0__2__Impl : ( ( rule__Category__NameAssignment_0_2 ) ) ;
    public final void rule__Category__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:826:1: ( ( ( rule__Category__NameAssignment_0_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:827:1: ( ( rule__Category__NameAssignment_0_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:827:1: ( ( rule__Category__NameAssignment_0_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:828:1: ( rule__Category__NameAssignment_0_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_0_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:829:1: ( rule__Category__NameAssignment_0_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:829:2: rule__Category__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_0_2_in_rule__Category__Group_0__2__Impl1738);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:845:1: rule__Category__Group_1__0 : rule__Category__Group_1__0__Impl rule__Category__Group_1__1 ;
    public final void rule__Category__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:849:1: ( rule__Category__Group_1__0__Impl rule__Category__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:850:2: rule__Category__Group_1__0__Impl rule__Category__Group_1__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1__0__Impl_in_rule__Category__Group_1__01774);
            rule__Category__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__1_in_rule__Category__Group_1__01777);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:857:1: rule__Category__Group_1__0__Impl : ( () ) ;
    public final void rule__Category__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:861:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:862:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:862:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:863:1: ()
            {
             before(grammarAccess.getCategoryAccess().getExpenseCategoryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:864:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:866:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:876:1: rule__Category__Group_1__1 : rule__Category__Group_1__1__Impl rule__Category__Group_1__2 ;
    public final void rule__Category__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:880:1: ( rule__Category__Group_1__1__Impl rule__Category__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:881:2: rule__Category__Group_1__1__Impl rule__Category__Group_1__2
            {
            pushFollow(FOLLOW_rule__Category__Group_1__1__Impl_in_rule__Category__Group_1__11835);
            rule__Category__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__2_in_rule__Category__Group_1__11838);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:888:1: rule__Category__Group_1__1__Impl : ( 'expense' ) ;
    public final void rule__Category__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:892:1: ( ( 'expense' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:893:1: ( 'expense' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:893:1: ( 'expense' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:894:1: 'expense'
            {
             before(grammarAccess.getCategoryAccess().getExpenseKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__Category__Group_1__1__Impl1866); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:907:1: rule__Category__Group_1__2 : rule__Category__Group_1__2__Impl rule__Category__Group_1__3 ;
    public final void rule__Category__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:911:1: ( rule__Category__Group_1__2__Impl rule__Category__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:912:2: rule__Category__Group_1__2__Impl rule__Category__Group_1__3
            {
            pushFollow(FOLLOW_rule__Category__Group_1__2__Impl_in_rule__Category__Group_1__21897);
            rule__Category__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__3_in_rule__Category__Group_1__21900);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:919:1: rule__Category__Group_1__2__Impl : ( ( rule__Category__NameAssignment_1_2 ) ) ;
    public final void rule__Category__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:923:1: ( ( ( rule__Category__NameAssignment_1_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:924:1: ( ( rule__Category__NameAssignment_1_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:924:1: ( ( rule__Category__NameAssignment_1_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:925:1: ( rule__Category__NameAssignment_1_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:926:1: ( rule__Category__NameAssignment_1_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:926:2: rule__Category__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_1_2_in_rule__Category__Group_1__2__Impl1927);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:936:1: rule__Category__Group_1__3 : rule__Category__Group_1__3__Impl ;
    public final void rule__Category__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:940:1: ( rule__Category__Group_1__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:941:2: rule__Category__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1__3__Impl_in_rule__Category__Group_1__31957);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:947:1: rule__Category__Group_1__3__Impl : ( ( rule__Category__Group_1_3__0 )? ) ;
    public final void rule__Category__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:951:1: ( ( ( rule__Category__Group_1_3__0 )? ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:952:1: ( ( rule__Category__Group_1_3__0 )? )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:952:1: ( ( rule__Category__Group_1_3__0 )? )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:953:1: ( rule__Category__Group_1_3__0 )?
            {
             before(grammarAccess.getCategoryAccess().getGroup_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:954:1: ( rule__Category__Group_1_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:954:2: rule__Category__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_1_3__0_in_rule__Category__Group_1__3__Impl1984);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:972:1: rule__Category__Group_1_3__0 : rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1 ;
    public final void rule__Category__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:976:1: ( rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:977:2: rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__0__Impl_in_rule__Category__Group_1_3__02023);
            rule__Category__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__1_in_rule__Category__Group_1_3__02026);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:984:1: rule__Category__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__Category__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:988:1: ( ( '[' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:989:1: ( '[' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:989:1: ( '[' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:990:1: '['
            {
             before(grammarAccess.getCategoryAccess().getLeftSquareBracketKeyword_1_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Category__Group_1_3__0__Impl2054); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1003:1: rule__Category__Group_1_3__1 : rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2 ;
    public final void rule__Category__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1007:1: ( rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1008:2: rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__1__Impl_in_rule__Category__Group_1_3__12085);
            rule__Category__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__2_in_rule__Category__Group_1_3__12088);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1015:1: rule__Category__Group_1_3__1__Impl : ( ( rule__Category__PatternsAssignment_1_3_1 ) ) ;
    public final void rule__Category__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1019:1: ( ( ( rule__Category__PatternsAssignment_1_3_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1020:1: ( ( rule__Category__PatternsAssignment_1_3_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1020:1: ( ( rule__Category__PatternsAssignment_1_3_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1021:1: ( rule__Category__PatternsAssignment_1_3_1 )
            {
             before(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1022:1: ( rule__Category__PatternsAssignment_1_3_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1022:2: rule__Category__PatternsAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Category__PatternsAssignment_1_3_1_in_rule__Category__Group_1_3__1__Impl2115);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1032:1: rule__Category__Group_1_3__2 : rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3 ;
    public final void rule__Category__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1036:1: ( rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1037:2: rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__2__Impl_in_rule__Category__Group_1_3__22145);
            rule__Category__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__3_in_rule__Category__Group_1_3__22148);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1044:1: rule__Category__Group_1_3__2__Impl : ( ( rule__Category__Group_1_3_2__0 )* ) ;
    public final void rule__Category__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1048:1: ( ( ( rule__Category__Group_1_3_2__0 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1049:1: ( ( rule__Category__Group_1_3_2__0 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1049:1: ( ( rule__Category__Group_1_3_2__0 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1050:1: ( rule__Category__Group_1_3_2__0 )*
            {
             before(grammarAccess.getCategoryAccess().getGroup_1_3_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1051:1: ( rule__Category__Group_1_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1051:2: rule__Category__Group_1_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Category__Group_1_3_2__0_in_rule__Category__Group_1_3__2__Impl2175);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1061:1: rule__Category__Group_1_3__3 : rule__Category__Group_1_3__3__Impl ;
    public final void rule__Category__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1065:1: ( rule__Category__Group_1_3__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1066:2: rule__Category__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__3__Impl_in_rule__Category__Group_1_3__32206);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1072:1: rule__Category__Group_1_3__3__Impl : ( ']' ) ;
    public final void rule__Category__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1076:1: ( ( ']' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1077:1: ( ']' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1077:1: ( ']' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1078:1: ']'
            {
             before(grammarAccess.getCategoryAccess().getRightSquareBracketKeyword_1_3_3()); 
            match(input,30,FOLLOW_30_in_rule__Category__Group_1_3__3__Impl2234); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1099:1: rule__Category__Group_1_3_2__0 : rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1 ;
    public final void rule__Category__Group_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1103:1: ( rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1104:2: rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3_2__0__Impl_in_rule__Category__Group_1_3_2__02273);
            rule__Category__Group_1_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3_2__1_in_rule__Category__Group_1_3_2__02276);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1111:1: rule__Category__Group_1_3_2__0__Impl : ( ',' ) ;
    public final void rule__Category__Group_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1115:1: ( ( ',' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1116:1: ( ',' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1116:1: ( ',' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1117:1: ','
            {
             before(grammarAccess.getCategoryAccess().getCommaKeyword_1_3_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Category__Group_1_3_2__0__Impl2304); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1130:1: rule__Category__Group_1_3_2__1 : rule__Category__Group_1_3_2__1__Impl ;
    public final void rule__Category__Group_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1134:1: ( rule__Category__Group_1_3_2__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1135:2: rule__Category__Group_1_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3_2__1__Impl_in_rule__Category__Group_1_3_2__12335);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1141:1: rule__Category__Group_1_3_2__1__Impl : ( ( rule__Category__PatternsAssignment_1_3_2_1 ) ) ;
    public final void rule__Category__Group_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1145:1: ( ( ( rule__Category__PatternsAssignment_1_3_2_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1146:1: ( ( rule__Category__PatternsAssignment_1_3_2_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1146:1: ( ( rule__Category__PatternsAssignment_1_3_2_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1147:1: ( rule__Category__PatternsAssignment_1_3_2_1 )
            {
             before(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_2_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1148:1: ( rule__Category__PatternsAssignment_1_3_2_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1148:2: rule__Category__PatternsAssignment_1_3_2_1
            {
            pushFollow(FOLLOW_rule__Category__PatternsAssignment_1_3_2_1_in_rule__Category__Group_1_3_2__1__Impl2362);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1162:1: rule__Year__Group__0 : rule__Year__Group__0__Impl rule__Year__Group__1 ;
    public final void rule__Year__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1166:1: ( rule__Year__Group__0__Impl rule__Year__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1167:2: rule__Year__Group__0__Impl rule__Year__Group__1
            {
            pushFollow(FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__02396);
            rule__Year__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__1_in_rule__Year__Group__02399);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1174:1: rule__Year__Group__0__Impl : ( ( rule__Year__NameAssignment_0 ) ) ;
    public final void rule__Year__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1178:1: ( ( ( rule__Year__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1179:1: ( ( rule__Year__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1179:1: ( ( rule__Year__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1180:1: ( rule__Year__NameAssignment_0 )
            {
             before(grammarAccess.getYearAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1181:1: ( rule__Year__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1181:2: rule__Year__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl2426);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1191:1: rule__Year__Group__1 : rule__Year__Group__1__Impl rule__Year__Group__2 ;
    public final void rule__Year__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1195:1: ( rule__Year__Group__1__Impl rule__Year__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1196:2: rule__Year__Group__1__Impl rule__Year__Group__2
            {
            pushFollow(FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__12456);
            rule__Year__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__2_in_rule__Year__Group__12459);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1203:1: rule__Year__Group__1__Impl : ( 'uses' ) ;
    public final void rule__Year__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1207:1: ( ( 'uses' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1208:1: ( 'uses' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1208:1: ( 'uses' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1209:1: 'uses'
            {
             before(grammarAccess.getYearAccess().getUsesKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Year__Group__1__Impl2487); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1222:1: rule__Year__Group__2 : rule__Year__Group__2__Impl rule__Year__Group__3 ;
    public final void rule__Year__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1226:1: ( rule__Year__Group__2__Impl rule__Year__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1227:2: rule__Year__Group__2__Impl rule__Year__Group__3
            {
            pushFollow(FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__22518);
            rule__Year__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__3_in_rule__Year__Group__22521);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1234:1: rule__Year__Group__2__Impl : ( ( rule__Year__LibraryAssignment_2 ) ) ;
    public final void rule__Year__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1238:1: ( ( ( rule__Year__LibraryAssignment_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1239:1: ( ( rule__Year__LibraryAssignment_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1239:1: ( ( rule__Year__LibraryAssignment_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1240:1: ( rule__Year__LibraryAssignment_2 )
            {
             before(grammarAccess.getYearAccess().getLibraryAssignment_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1241:1: ( rule__Year__LibraryAssignment_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1241:2: rule__Year__LibraryAssignment_2
            {
            pushFollow(FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl2548);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1251:1: rule__Year__Group__3 : rule__Year__Group__3__Impl rule__Year__Group__4 ;
    public final void rule__Year__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1255:1: ( rule__Year__Group__3__Impl rule__Year__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1256:2: rule__Year__Group__3__Impl rule__Year__Group__4
            {
            pushFollow(FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__32578);
            rule__Year__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__4_in_rule__Year__Group__32581);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1263:1: rule__Year__Group__3__Impl : ( '{' ) ;
    public final void rule__Year__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1267:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1268:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1268:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1269:1: '{'
            {
             before(grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Year__Group__3__Impl2609); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1282:1: rule__Year__Group__4 : rule__Year__Group__4__Impl rule__Year__Group__5 ;
    public final void rule__Year__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1286:1: ( rule__Year__Group__4__Impl rule__Year__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1287:2: rule__Year__Group__4__Impl rule__Year__Group__5
            {
            pushFollow(FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__42640);
            rule__Year__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__5_in_rule__Year__Group__42643);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1294:1: rule__Year__Group__4__Impl : ( ( rule__Year__MonthsAssignment_4 )* ) ;
    public final void rule__Year__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1298:1: ( ( ( rule__Year__MonthsAssignment_4 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1299:1: ( ( rule__Year__MonthsAssignment_4 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1299:1: ( ( rule__Year__MonthsAssignment_4 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1300:1: ( rule__Year__MonthsAssignment_4 )*
            {
             before(grammarAccess.getYearAccess().getMonthsAssignment_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1301:1: ( rule__Year__MonthsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1301:2: rule__Year__MonthsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl2670);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1311:1: rule__Year__Group__5 : rule__Year__Group__5__Impl ;
    public final void rule__Year__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1315:1: ( rule__Year__Group__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1316:2: rule__Year__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__52701);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1322:1: rule__Year__Group__5__Impl : ( '}' ) ;
    public final void rule__Year__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1326:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1327:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1327:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1328:1: '}'
            {
             before(grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Year__Group__5__Impl2729); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1353:1: rule__Month__Group__0 : rule__Month__Group__0__Impl rule__Month__Group__1 ;
    public final void rule__Month__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1357:1: ( rule__Month__Group__0__Impl rule__Month__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1358:2: rule__Month__Group__0__Impl rule__Month__Group__1
            {
            pushFollow(FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__02772);
            rule__Month__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__1_in_rule__Month__Group__02775);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1365:1: rule__Month__Group__0__Impl : ( ( rule__Month__NameAssignment_0 ) ) ;
    public final void rule__Month__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1369:1: ( ( ( rule__Month__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1370:1: ( ( rule__Month__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1370:1: ( ( rule__Month__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1371:1: ( rule__Month__NameAssignment_0 )
            {
             before(grammarAccess.getMonthAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1372:1: ( rule__Month__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1372:2: rule__Month__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl2802);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1382:1: rule__Month__Group__1 : rule__Month__Group__1__Impl rule__Month__Group__2 ;
    public final void rule__Month__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1386:1: ( rule__Month__Group__1__Impl rule__Month__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1387:2: rule__Month__Group__1__Impl rule__Month__Group__2
            {
            pushFollow(FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__12832);
            rule__Month__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__2_in_rule__Month__Group__12835);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1394:1: rule__Month__Group__1__Impl : ( 'budget' ) ;
    public final void rule__Month__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1398:1: ( ( 'budget' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1399:1: ( 'budget' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1399:1: ( 'budget' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1400:1: 'budget'
            {
             before(grammarAccess.getMonthAccess().getBudgetKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Month__Group__1__Impl2863); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1413:1: rule__Month__Group__2 : rule__Month__Group__2__Impl rule__Month__Group__3 ;
    public final void rule__Month__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1417:1: ( rule__Month__Group__2__Impl rule__Month__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1418:2: rule__Month__Group__2__Impl rule__Month__Group__3
            {
            pushFollow(FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__22894);
            rule__Month__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__3_in_rule__Month__Group__22897);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1425:1: rule__Month__Group__2__Impl : ( '{' ) ;
    public final void rule__Month__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1429:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1430:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1430:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1431:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Month__Group__2__Impl2925); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1444:1: rule__Month__Group__3 : rule__Month__Group__3__Impl rule__Month__Group__4 ;
    public final void rule__Month__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1448:1: ( rule__Month__Group__3__Impl rule__Month__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1449:2: rule__Month__Group__3__Impl rule__Month__Group__4
            {
            pushFollow(FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__32956);
            rule__Month__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__4_in_rule__Month__Group__32959);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1456:1: rule__Month__Group__3__Impl : ( ( rule__Month__BudgetEntriesAssignment_3 )* ) ;
    public final void rule__Month__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1460:1: ( ( ( rule__Month__BudgetEntriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1461:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1461:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1462:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1463:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1463:2: rule__Month__BudgetEntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl2986);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1473:1: rule__Month__Group__4 : rule__Month__Group__4__Impl rule__Month__Group__5 ;
    public final void rule__Month__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1477:1: ( rule__Month__Group__4__Impl rule__Month__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1478:2: rule__Month__Group__4__Impl rule__Month__Group__5
            {
            pushFollow(FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__43017);
            rule__Month__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__5_in_rule__Month__Group__43020);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1485:1: rule__Month__Group__4__Impl : ( '}' ) ;
    public final void rule__Month__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1489:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1490:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1490:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1491:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__4__Impl3048); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1504:1: rule__Month__Group__5 : rule__Month__Group__5__Impl rule__Month__Group__6 ;
    public final void rule__Month__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1508:1: ( rule__Month__Group__5__Impl rule__Month__Group__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1509:2: rule__Month__Group__5__Impl rule__Month__Group__6
            {
            pushFollow(FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__53079);
            rule__Month__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__6_in_rule__Month__Group__53082);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1516:1: rule__Month__Group__5__Impl : ( 'actual' ) ;
    public final void rule__Month__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1520:1: ( ( 'actual' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1521:1: ( 'actual' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1521:1: ( 'actual' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1522:1: 'actual'
            {
             before(grammarAccess.getMonthAccess().getActualKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__Month__Group__5__Impl3110); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1535:1: rule__Month__Group__6 : rule__Month__Group__6__Impl rule__Month__Group__7 ;
    public final void rule__Month__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1539:1: ( rule__Month__Group__6__Impl rule__Month__Group__7 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1540:2: rule__Month__Group__6__Impl rule__Month__Group__7
            {
            pushFollow(FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__63141);
            rule__Month__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__7_in_rule__Month__Group__63144);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1547:1: rule__Month__Group__6__Impl : ( '{' ) ;
    public final void rule__Month__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1551:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1552:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1552:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1553:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Month__Group__6__Impl3172); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1566:1: rule__Month__Group__7 : rule__Month__Group__7__Impl rule__Month__Group__8 ;
    public final void rule__Month__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1570:1: ( rule__Month__Group__7__Impl rule__Month__Group__8 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1571:2: rule__Month__Group__7__Impl rule__Month__Group__8
            {
            pushFollow(FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__73203);
            rule__Month__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__8_in_rule__Month__Group__73206);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1578:1: rule__Month__Group__7__Impl : ( ( rule__Month__ActualEntriesAssignment_7 )* ) ;
    public final void rule__Month__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1582:1: ( ( ( rule__Month__ActualEntriesAssignment_7 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1583:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1583:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1584:1: ( rule__Month__ActualEntriesAssignment_7 )*
            {
             before(grammarAccess.getMonthAccess().getActualEntriesAssignment_7()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1585:1: ( rule__Month__ActualEntriesAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1585:2: rule__Month__ActualEntriesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl3233);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1595:1: rule__Month__Group__8 : rule__Month__Group__8__Impl ;
    public final void rule__Month__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1599:1: ( rule__Month__Group__8__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1600:2: rule__Month__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__83264);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1606:1: rule__Month__Group__8__Impl : ( '}' ) ;
    public final void rule__Month__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1610:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1611:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1611:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1612:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__8__Impl3292); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1643:1: rule__BudgetEntry__Group_0__0 : rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 ;
    public final void rule__BudgetEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1647:1: ( rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1648:2: rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__0__Impl_in_rule__BudgetEntry__Group_0__03341);
            rule__BudgetEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__1_in_rule__BudgetEntry__Group_0__03344);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1655:1: rule__BudgetEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1659:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1660:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1660:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1661:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1662:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1664:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1674:1: rule__BudgetEntry__Group_0__1 : rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 ;
    public final void rule__BudgetEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1678:1: ( rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1679:2: rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__1__Impl_in_rule__BudgetEntry__Group_0__13402);
            rule__BudgetEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__2_in_rule__BudgetEntry__Group_0__13405);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1686:1: rule__BudgetEntry__Group_0__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__BudgetEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1690:1: ( ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1691:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1691:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1692:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_0_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1693:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1693:2: rule__BudgetEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__CategoryAssignment_0_1_in_rule__BudgetEntry__Group_0__1__Impl3432);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1703:1: rule__BudgetEntry__Group_0__2 : rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 ;
    public final void rule__BudgetEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1707:1: ( rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1708:2: rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__2__Impl_in_rule__BudgetEntry__Group_0__23462);
            rule__BudgetEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__3_in_rule__BudgetEntry__Group_0__23465);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1715:1: rule__BudgetEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1719:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1720:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1720:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1721:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__BudgetEntry__Group_0__2__Impl3493); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1734:1: rule__BudgetEntry__Group_0__3 : rule__BudgetEntry__Group_0__3__Impl ;
    public final void rule__BudgetEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1738:1: ( rule__BudgetEntry__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1739:2: rule__BudgetEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__3__Impl_in_rule__BudgetEntry__Group_0__33524);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1745:1: rule__BudgetEntry__Group_0__3__Impl : ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__BudgetEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1749:1: ( ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1750:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1750:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1751:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountAssignment_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1752:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1752:2: rule__BudgetEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__AmountAssignment_0_3_in_rule__BudgetEntry__Group_0__3__Impl3551);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1770:1: rule__BudgetEntry__Group_1__0 : rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 ;
    public final void rule__BudgetEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1774:1: ( rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1775:2: rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__0__Impl_in_rule__BudgetEntry__Group_1__03589);
            rule__BudgetEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__1_in_rule__BudgetEntry__Group_1__03592);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1782:1: rule__BudgetEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1786:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1787:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1787:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1788:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1789:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1791:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1801:1: rule__BudgetEntry__Group_1__1 : rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 ;
    public final void rule__BudgetEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1805:1: ( rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1806:2: rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__1__Impl_in_rule__BudgetEntry__Group_1__13650);
            rule__BudgetEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__2_in_rule__BudgetEntry__Group_1__13653);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1813:1: rule__BudgetEntry__Group_1__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__BudgetEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1817:1: ( ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1818:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1818:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1819:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_1_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1820:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1820:2: rule__BudgetEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__CategoryAssignment_1_1_in_rule__BudgetEntry__Group_1__1__Impl3680);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1830:1: rule__BudgetEntry__Group_1__2 : rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 ;
    public final void rule__BudgetEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1834:1: ( rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1835:2: rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__2__Impl_in_rule__BudgetEntry__Group_1__23710);
            rule__BudgetEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__3_in_rule__BudgetEntry__Group_1__23713);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1842:1: rule__BudgetEntry__Group_1__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1846:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1847:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1847:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1848:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2()); 
            match(input,35,FOLLOW_35_in_rule__BudgetEntry__Group_1__2__Impl3741); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1861:1: rule__BudgetEntry__Group_1__3 : rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 ;
    public final void rule__BudgetEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1865:1: ( rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1866:2: rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__3__Impl_in_rule__BudgetEntry__Group_1__33772);
            rule__BudgetEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__4_in_rule__BudgetEntry__Group_1__33775);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1873:1: rule__BudgetEntry__Group_1__3__Impl : ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) ;
    public final void rule__BudgetEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1877:1: ( ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1878:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1878:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1879:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1880:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1880:2: rule__BudgetEntry__BaseEntryAssignment_1_3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__BaseEntryAssignment_1_3_in_rule__BudgetEntry__Group_1__3__Impl3802);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1890:1: rule__BudgetEntry__Group_1__4 : rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 ;
    public final void rule__BudgetEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1894:1: ( rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1895:2: rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__4__Impl_in_rule__BudgetEntry__Group_1__43832);
            rule__BudgetEntry__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__5_in_rule__BudgetEntry__Group_1__43835);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1902:1: rule__BudgetEntry__Group_1__4__Impl : ( '*' ) ;
    public final void rule__BudgetEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1906:1: ( ( '*' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1907:1: ( '*' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1907:1: ( '*' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1908:1: '*'
            {
             before(grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4()); 
            match(input,36,FOLLOW_36_in_rule__BudgetEntry__Group_1__4__Impl3863); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1921:1: rule__BudgetEntry__Group_1__5 : rule__BudgetEntry__Group_1__5__Impl ;
    public final void rule__BudgetEntry__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1925:1: ( rule__BudgetEntry__Group_1__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1926:2: rule__BudgetEntry__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__5__Impl_in_rule__BudgetEntry__Group_1__53894);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1932:1: rule__BudgetEntry__Group_1__5__Impl : ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) ;
    public final void rule__BudgetEntry__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1936:1: ( ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1937:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1937:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1938:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorAssignment_1_5()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1939:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1939:2: rule__BudgetEntry__FactorAssignment_1_5
            {
            pushFollow(FOLLOW_rule__BudgetEntry__FactorAssignment_1_5_in_rule__BudgetEntry__Group_1__5__Impl3921);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1961:1: rule__ActualEntry__Group_0__0 : rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 ;
    public final void rule__ActualEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1965:1: ( rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1966:2: rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__0__Impl_in_rule__ActualEntry__Group_0__03963);
            rule__ActualEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__1_in_rule__ActualEntry__Group_0__03966);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1973:1: rule__ActualEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1977:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1978:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1978:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1979:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1980:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1982:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1992:1: rule__ActualEntry__Group_0__1 : rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 ;
    public final void rule__ActualEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1996:1: ( rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1997:2: rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__1__Impl_in_rule__ActualEntry__Group_0__14024);
            rule__ActualEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__2_in_rule__ActualEntry__Group_0__14027);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2004:1: rule__ActualEntry__Group_0__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__ActualEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2008:1: ( ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2009:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2009:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2010:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_0_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2011:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2011:2: rule__ActualEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ActualEntry__CategoryAssignment_0_1_in_rule__ActualEntry__Group_0__1__Impl4054);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2021:1: rule__ActualEntry__Group_0__2 : rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 ;
    public final void rule__ActualEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2025:1: ( rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2026:2: rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__2__Impl_in_rule__ActualEntry__Group_0__24084);
            rule__ActualEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__3_in_rule__ActualEntry__Group_0__24087);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2033:1: rule__ActualEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__ActualEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2037:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2038:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2038:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2039:1: ':'
            {
             before(grammarAccess.getActualEntryAccess().getColonKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__ActualEntry__Group_0__2__Impl4115); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2052:1: rule__ActualEntry__Group_0__3 : rule__ActualEntry__Group_0__3__Impl ;
    public final void rule__ActualEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2056:1: ( rule__ActualEntry__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2057:2: rule__ActualEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__3__Impl_in_rule__ActualEntry__Group_0__34146);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2063:1: rule__ActualEntry__Group_0__3__Impl : ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__ActualEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2067:1: ( ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2068:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2068:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2069:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getActualEntryAccess().getAmountAssignment_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2070:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2070:2: rule__ActualEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_rule__ActualEntry__AmountAssignment_0_3_in_rule__ActualEntry__Group_0__3__Impl4173);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2088:1: rule__ActualEntry__Group_1__0 : rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 ;
    public final void rule__ActualEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2092:1: ( rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2093:2: rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__0__Impl_in_rule__ActualEntry__Group_1__04211);
            rule__ActualEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__1_in_rule__ActualEntry__Group_1__04214);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2100:1: rule__ActualEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2104:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2105:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2105:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2106:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2107:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2109:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2119:1: rule__ActualEntry__Group_1__1 : rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 ;
    public final void rule__ActualEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2123:1: ( rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2124:2: rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__1__Impl_in_rule__ActualEntry__Group_1__14272);
            rule__ActualEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__2_in_rule__ActualEntry__Group_1__14275);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2131:1: rule__ActualEntry__Group_1__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__ActualEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2135:1: ( ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2136:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2136:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2137:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_1_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2138:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2138:2: rule__ActualEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ActualEntry__CategoryAssignment_1_1_in_rule__ActualEntry__Group_1__1__Impl4302);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2148:1: rule__ActualEntry__Group_1__2 : rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 ;
    public final void rule__ActualEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2152:1: ( rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2153:2: rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__2__Impl_in_rule__ActualEntry__Group_1__24332);
            rule__ActualEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__3_in_rule__ActualEntry__Group_1__24335);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2160:1: rule__ActualEntry__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ActualEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2164:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2165:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2165:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2166:1: '{'
            {
             before(grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__ActualEntry__Group_1__2__Impl4363); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2179:1: rule__ActualEntry__Group_1__3 : rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 ;
    public final void rule__ActualEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2183:1: ( rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2184:2: rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__3__Impl_in_rule__ActualEntry__Group_1__34394);
            rule__ActualEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__4_in_rule__ActualEntry__Group_1__34397);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2191:1: rule__ActualEntry__Group_1__3__Impl : ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) ;
    public final void rule__ActualEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2195:1: ( ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2196:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2196:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2197:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2197:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2198:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2199:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2199:2: rule__ActualEntry__TransactionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4426);
            rule__ActualEntry__TransactionsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 

            }

            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2202:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2203:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2204:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2204:2: rule__ActualEntry__TransactionsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4438);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2215:1: rule__ActualEntry__Group_1__4 : rule__ActualEntry__Group_1__4__Impl ;
    public final void rule__ActualEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2219:1: ( rule__ActualEntry__Group_1__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2220:2: rule__ActualEntry__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__4__Impl_in_rule__ActualEntry__Group_1__44471);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2226:1: rule__ActualEntry__Group_1__4__Impl : ( '}' ) ;
    public final void rule__ActualEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2230:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2231:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2231:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2232:1: '}'
            {
             before(grammarAccess.getActualEntryAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,26,FOLLOW_26_in_rule__ActualEntry__Group_1__4__Impl4499); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2255:1: rule__Transaction__Group_0__0 : rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 ;
    public final void rule__Transaction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2259:1: ( rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2260:2: rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__0__Impl_in_rule__Transaction__Group_0__04540);
            rule__Transaction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__1_in_rule__Transaction__Group_0__04543);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2267:1: rule__Transaction__Group_0__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2271:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2272:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2272:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2273:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCashTransactionAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2274:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2276:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2286:1: rule__Transaction__Group_0__1 : rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 ;
    public final void rule__Transaction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2290:1: ( rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2291:2: rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__1__Impl_in_rule__Transaction__Group_0__14601);
            rule__Transaction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__2_in_rule__Transaction__Group_0__14604);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2298:1: rule__Transaction__Group_0__1__Impl : ( 'cash' ) ;
    public final void rule__Transaction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2302:1: ( ( 'cash' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2303:1: ( 'cash' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2303:1: ( 'cash' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2304:1: 'cash'
            {
             before(grammarAccess.getTransactionAccess().getCashKeyword_0_1()); 
            match(input,37,FOLLOW_37_in_rule__Transaction__Group_0__1__Impl4632); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2317:1: rule__Transaction__Group_0__2 : rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 ;
    public final void rule__Transaction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2321:1: ( rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2322:2: rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__2__Impl_in_rule__Transaction__Group_0__24663);
            rule__Transaction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__3_in_rule__Transaction__Group_0__24666);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2329:1: rule__Transaction__Group_0__2__Impl : ( ( rule__Transaction__AmountAssignment_0_2 ) ) ;
    public final void rule__Transaction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2333:1: ( ( ( rule__Transaction__AmountAssignment_0_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2334:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2334:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2335:1: ( rule__Transaction__AmountAssignment_0_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_0_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2336:1: ( rule__Transaction__AmountAssignment_0_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2336:2: rule__Transaction__AmountAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Transaction__AmountAssignment_0_2_in_rule__Transaction__Group_0__2__Impl4693);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2346:1: rule__Transaction__Group_0__3 : rule__Transaction__Group_0__3__Impl ;
    public final void rule__Transaction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2350:1: ( rule__Transaction__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2351:2: rule__Transaction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__3__Impl_in_rule__Transaction__Group_0__34723);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2357:1: rule__Transaction__Group_0__3__Impl : ( ( rule__Transaction__Group_0_3__0 )? ) ;
    public final void rule__Transaction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2361:1: ( ( ( rule__Transaction__Group_0_3__0 )? ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2362:1: ( ( rule__Transaction__Group_0_3__0 )? )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2362:1: ( ( rule__Transaction__Group_0_3__0 )? )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2363:1: ( rule__Transaction__Group_0_3__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2364:1: ( rule__Transaction__Group_0_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2364:2: rule__Transaction__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_0_3__0_in_rule__Transaction__Group_0__3__Impl4750);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2382:1: rule__Transaction__Group_0_3__0 : rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 ;
    public final void rule__Transaction__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2386:1: ( rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2387:2: rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0_3__0__Impl_in_rule__Transaction__Group_0_3__04789);
            rule__Transaction__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0_3__1_in_rule__Transaction__Group_0_3__04792);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2394:1: rule__Transaction__Group_0_3__0__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2398:1: ( ( 'on' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2399:1: ( 'on' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2399:1: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2400:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_0_3_0()); 
            match(input,38,FOLLOW_38_in_rule__Transaction__Group_0_3__0__Impl4820); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2413:1: rule__Transaction__Group_0_3__1 : rule__Transaction__Group_0_3__1__Impl ;
    public final void rule__Transaction__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2417:1: ( rule__Transaction__Group_0_3__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2418:2: rule__Transaction__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0_3__1__Impl_in_rule__Transaction__Group_0_3__14851);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2424:1: rule__Transaction__Group_0_3__1__Impl : ( ( rule__Transaction__DayAssignment_0_3_1 ) ) ;
    public final void rule__Transaction__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2428:1: ( ( ( rule__Transaction__DayAssignment_0_3_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2429:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2429:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2430:1: ( rule__Transaction__DayAssignment_0_3_1 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_0_3_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2431:1: ( rule__Transaction__DayAssignment_0_3_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2431:2: rule__Transaction__DayAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Transaction__DayAssignment_0_3_1_in_rule__Transaction__Group_0_3__1__Impl4878);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2445:1: rule__Transaction__Group_1__0 : rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 ;
    public final void rule__Transaction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2449:1: ( rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2450:2: rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__04912);
            rule__Transaction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__04915);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2457:1: rule__Transaction__Group_1__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2461:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2462:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2462:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2463:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCardTransactionAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2464:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2466:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2476:1: rule__Transaction__Group_1__1 : rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 ;
    public final void rule__Transaction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2480:1: ( rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2481:2: rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__14973);
            rule__Transaction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__2_in_rule__Transaction__Group_1__14976);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2488:1: rule__Transaction__Group_1__1__Impl : ( 'card' ) ;
    public final void rule__Transaction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2492:1: ( ( 'card' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2493:1: ( 'card' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2493:1: ( 'card' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2494:1: 'card'
            {
             before(grammarAccess.getTransactionAccess().getCardKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__Transaction__Group_1__1__Impl5004); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2507:1: rule__Transaction__Group_1__2 : rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 ;
    public final void rule__Transaction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2511:1: ( rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2512:2: rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__2__Impl_in_rule__Transaction__Group_1__25035);
            rule__Transaction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__3_in_rule__Transaction__Group_1__25038);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2519:1: rule__Transaction__Group_1__2__Impl : ( ( rule__Transaction__AmountAssignment_1_2 ) ) ;
    public final void rule__Transaction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2523:1: ( ( ( rule__Transaction__AmountAssignment_1_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2524:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2524:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2525:1: ( rule__Transaction__AmountAssignment_1_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_1_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2526:1: ( rule__Transaction__AmountAssignment_1_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2526:2: rule__Transaction__AmountAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Transaction__AmountAssignment_1_2_in_rule__Transaction__Group_1__2__Impl5065);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2536:1: rule__Transaction__Group_1__3 : rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 ;
    public final void rule__Transaction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2540:1: ( rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2541:2: rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__3__Impl_in_rule__Transaction__Group_1__35095);
            rule__Transaction__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__4_in_rule__Transaction__Group_1__35098);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2548:1: rule__Transaction__Group_1__3__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2552:1: ( ( 'on' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2553:1: ( 'on' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2553:1: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2554:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_1_3()); 
            match(input,38,FOLLOW_38_in_rule__Transaction__Group_1__3__Impl5126); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2567:1: rule__Transaction__Group_1__4 : rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 ;
    public final void rule__Transaction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2571:1: ( rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2572:2: rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__4__Impl_in_rule__Transaction__Group_1__45157);
            rule__Transaction__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__5_in_rule__Transaction__Group_1__45160);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2579:1: rule__Transaction__Group_1__4__Impl : ( ( rule__Transaction__DayAssignment_1_4 ) ) ;
    public final void rule__Transaction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2583:1: ( ( ( rule__Transaction__DayAssignment_1_4 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2584:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2584:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2585:1: ( rule__Transaction__DayAssignment_1_4 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_1_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2586:1: ( rule__Transaction__DayAssignment_1_4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2586:2: rule__Transaction__DayAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Transaction__DayAssignment_1_4_in_rule__Transaction__Group_1__4__Impl5187);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2596:1: rule__Transaction__Group_1__5 : rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 ;
    public final void rule__Transaction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2600:1: ( rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2601:2: rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__5__Impl_in_rule__Transaction__Group_1__55217);
            rule__Transaction__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__6_in_rule__Transaction__Group_1__55220);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2608:1: rule__Transaction__Group_1__5__Impl : ( 'from' ) ;
    public final void rule__Transaction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2612:1: ( ( 'from' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2613:1: ( 'from' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2613:1: ( 'from' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2614:1: 'from'
            {
             before(grammarAccess.getTransactionAccess().getFromKeyword_1_5()); 
            match(input,40,FOLLOW_40_in_rule__Transaction__Group_1__5__Impl5248); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2627:1: rule__Transaction__Group_1__6 : rule__Transaction__Group_1__6__Impl ;
    public final void rule__Transaction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2631:1: ( rule__Transaction__Group_1__6__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2632:2: rule__Transaction__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__6__Impl_in_rule__Transaction__Group_1__65279);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2638:1: rule__Transaction__Group_1__6__Impl : ( ( rule__Transaction__FromAssignment_1_6 ) ) ;
    public final void rule__Transaction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2642:1: ( ( ( rule__Transaction__FromAssignment_1_6 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2643:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2643:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2644:1: ( rule__Transaction__FromAssignment_1_6 )
            {
             before(grammarAccess.getTransactionAccess().getFromAssignment_1_6()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2645:1: ( rule__Transaction__FromAssignment_1_6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2645:2: rule__Transaction__FromAssignment_1_6
            {
            pushFollow(FOLLOW_rule__Transaction__FromAssignment_1_6_in_rule__Transaction__Group_1__6__Impl5306);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2671:1: rule__Library__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Library__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2675:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2676:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2676:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2677:1: RULE_ID
            {
             before(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Library__NameAssignment_15356); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2686:1: rule__Library__CategoriesAssignment_3 : ( ruleCategory ) ;
    public final void rule__Library__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2690:1: ( ( ruleCategory ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2691:1: ( ruleCategory )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2691:1: ( ruleCategory )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2692:1: ruleCategory
            {
             before(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_35387);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2701:1: rule__Category__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2705:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2706:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2706:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2707:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_0_25418); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2716:1: rule__Category__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2720:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2721:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2721:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2722:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_1_25449); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2731:1: rule__Category__PatternsAssignment_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Category__PatternsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2735:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2736:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2736:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2737:1: RULE_STRING
            {
             before(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_15480); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2746:1: rule__Category__PatternsAssignment_1_3_2_1 : ( RULE_STRING ) ;
    public final void rule__Category__PatternsAssignment_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2750:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2751:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2751:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2752:1: RULE_STRING
            {
             before(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_2_15511); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2761:1: rule__Year__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__Year__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2765:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2766:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2766:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2767:1: RULE_INT
            {
             before(grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Year__NameAssignment_05542); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2776:1: rule__Year__LibraryAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Year__LibraryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2780:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2781:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2781:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2782:1: ( RULE_ID )
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2783:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2784:1: RULE_ID
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_25577); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2795:1: rule__Year__MonthsAssignment_4 : ( ruleMonth ) ;
    public final void rule__Year__MonthsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2799:1: ( ( ruleMonth ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2800:1: ( ruleMonth )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2800:1: ( ruleMonth )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2801:1: ruleMonth
            {
             before(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_45612);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2810:1: rule__Month__NameAssignment_0 : ( ruleMonthEnum ) ;
    public final void rule__Month__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2814:1: ( ( ruleMonthEnum ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2815:1: ( ruleMonthEnum )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2815:1: ( ruleMonthEnum )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2816:1: ruleMonthEnum
            {
             before(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_05643);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2825:1: rule__Month__BudgetEntriesAssignment_3 : ( ruleBudgetEntry ) ;
    public final void rule__Month__BudgetEntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2829:1: ( ( ruleBudgetEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2830:1: ( ruleBudgetEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2830:1: ( ruleBudgetEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2831:1: ruleBudgetEntry
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBudgetEntry_in_rule__Month__BudgetEntriesAssignment_35674);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2840:1: rule__Month__ActualEntriesAssignment_7 : ( ruleActualEntry ) ;
    public final void rule__Month__ActualEntriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2844:1: ( ( ruleActualEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2845:1: ( ruleActualEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2845:1: ( ruleActualEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2846:1: ruleActualEntry
            {
             before(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleActualEntry_in_rule__Month__ActualEntriesAssignment_75705);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2855:1: rule__BudgetEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2859:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2860:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2860:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2861:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2862:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2863:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_0_15740); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2874:1: rule__BudgetEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__BudgetEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2878:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2879:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2879:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2880:1: ruleDollar
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__BudgetEntry__AmountAssignment_0_35775);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2889:1: rule__BudgetEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2893:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2894:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2894:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2895:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2896:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2897:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_1_15810); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2908:1: rule__BudgetEntry__BaseEntryAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__BaseEntryAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2912:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2913:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2913:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2914:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2915:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2916:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__BaseEntryAssignment_1_35849); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2927:1: rule__BudgetEntry__FactorAssignment_1_5 : ( ruleDouble ) ;
    public final void rule__BudgetEntry__FactorAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2931:1: ( ( ruleDouble ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2932:1: ( ruleDouble )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2932:1: ( ruleDouble )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2933:1: ruleDouble
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_ruleDouble_in_rule__BudgetEntry__FactorAssignment_1_55884);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2942:1: rule__ActualEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2946:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2947:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2947:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2948:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2949:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2950:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_0_15919); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2961:1: rule__ActualEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__ActualEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2965:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2966:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2966:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2967:1: ruleDollar
            {
             before(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__ActualEntry__AmountAssignment_0_35954);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2976:1: rule__ActualEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2980:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2981:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2981:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2982:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2983:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2984:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_1_15989); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2995:1: rule__ActualEntry__TransactionsAssignment_1_3 : ( ruleTransaction ) ;
    public final void rule__ActualEntry__TransactionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2999:1: ( ( ruleTransaction ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3000:1: ( ruleTransaction )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3000:1: ( ruleTransaction )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3001:1: ruleTransaction
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__ActualEntry__TransactionsAssignment_1_36024);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3010:1: rule__Transaction__AmountAssignment_0_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3014:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3015:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3015:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3016:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_0_26055);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3025:1: rule__Transaction__DayAssignment_0_3_1 : ( RULE_INT ) ;
    public final void rule__Transaction__DayAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3029:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3030:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3030:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3031:1: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_0_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_0_3_16086); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3040:1: rule__Transaction__AmountAssignment_1_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3044:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3045:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3045:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3046:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_1_26117);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3055:1: rule__Transaction__DayAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__Transaction__DayAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3059:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3060:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3060:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3061:1: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_1_46148); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3070:1: rule__Transaction__FromAssignment_1_6 : ( RULE_STRING ) ;
    public final void rule__Transaction__FromAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3074:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3075:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3075:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3076:1: RULE_STRING
            {
             before(grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Transaction__FromAssignment_1_66179); 
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
    public static final BitSet FOLLOW_ruleDollar_in_entryRuleDollar543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDollar550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleDollar576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Alternatives_in_ruleDouble635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthEnum__Alternatives_in_ruleMonthEnum672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_rule__BudgetingFile__Alternatives707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYear_in_rule__BudgetingFile__Alternatives724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__0_in_rule__Category__Alternatives756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__0_in_rule__Category__Alternatives774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__0_in_rule__BudgetEntry__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__0_in_rule__BudgetEntry__Alternatives825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__0_in_rule__ActualEntry__Alternatives858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__0_in_rule__ActualEntry__Alternatives876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__0_in_rule__Transaction__Alternatives909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Alternatives960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Double__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MonthEnum__Alternatives1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MonthEnum__Alternatives1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MonthEnum__Alternatives1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MonthEnum__Alternatives1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MonthEnum__Alternatives1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MonthEnum__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MonthEnum__Alternatives1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MonthEnum__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MonthEnum__Alternatives1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MonthEnum__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MonthEnum__Alternatives1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MonthEnum__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01274 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Library__Group__0__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11336 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21396 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Library__Group__2__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31458 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1488 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Library__Group__4__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__0__Impl_in_rule__Category__Group_0__01588 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Category__Group_0__1_in_rule__Category__Group_0__01591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__1__Impl_in_rule__Category__Group_0__11649 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Category__Group_0__2_in_rule__Category__Group_0__11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Category__Group_0__1__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__2__Impl_in_rule__Category__Group_0__21711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_0_2_in_rule__Category__Group_0__2__Impl1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__0__Impl_in_rule__Category__Group_1__01774 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1__1_in_rule__Category__Group_1__01777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__1__Impl_in_rule__Category__Group_1__11835 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Category__Group_1__2_in_rule__Category__Group_1__11838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Category__Group_1__1__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__2__Impl_in_rule__Category__Group_1__21897 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1__3_in_rule__Category__Group_1__21900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_1_2_in_rule__Category__Group_1__2__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__3__Impl_in_rule__Category__Group_1__31957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__0_in_rule__Category__Group_1__3__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__0__Impl_in_rule__Category__Group_1_3__02023 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__1_in_rule__Category__Group_1_3__02026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Category__Group_1_3__0__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__1__Impl_in_rule__Category__Group_1_3__12085 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__2_in_rule__Category__Group_1_3__12088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__PatternsAssignment_1_3_1_in_rule__Category__Group_1_3__1__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__2__Impl_in_rule__Category__Group_1_3__22145 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__3_in_rule__Category__Group_1_3__22148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__0_in_rule__Category__Group_1_3__2__Impl2175 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__3__Impl_in_rule__Category__Group_1_3__32206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Category__Group_1_3__3__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__0__Impl_in_rule__Category__Group_1_3_2__02273 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__1_in_rule__Category__Group_1_3_2__02276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Category__Group_1_3_2__0__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__1__Impl_in_rule__Category__Group_1_3_2__12335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__PatternsAssignment_1_3_2_1_in_rule__Category__Group_1_3_2__1__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__02396 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Year__Group__1_in_rule__Year__Group__02399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__12456 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Year__Group__2_in_rule__Year__Group__12459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Year__Group__1__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__22518 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Year__Group__3_in_rule__Year__Group__22521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__32578 = new BitSet(new long[]{0x0000000004FFF000L});
    public static final BitSet FOLLOW_rule__Year__Group__4_in_rule__Year__Group__32581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Year__Group__3__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__42640 = new BitSet(new long[]{0x0000000004FFF000L});
    public static final BitSet FOLLOW_rule__Year__Group__5_in_rule__Year__Group__42643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl2670 = new BitSet(new long[]{0x0000000000FFF002L});
    public static final BitSet FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__52701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Year__Group__5__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__02772 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Month__Group__1_in_rule__Month__Group__02775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__12832 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Month__Group__2_in_rule__Month__Group__12835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Month__Group__1__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__22894 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__3_in_rule__Month__Group__22897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Month__Group__2__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__32956 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__4_in_rule__Month__Group__32959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl2986 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__43017 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Month__Group__5_in_rule__Month__Group__43020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__4__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__53079 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Month__Group__6_in_rule__Month__Group__53082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Month__Group__5__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__63141 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__7_in_rule__Month__Group__63144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Month__Group__6__Impl3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__73203 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__8_in_rule__Month__Group__73206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl3233 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__83264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__8__Impl3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__0__Impl_in_rule__BudgetEntry__Group_0__03341 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__1_in_rule__BudgetEntry__Group_0__03344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__1__Impl_in_rule__BudgetEntry__Group_0__13402 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__2_in_rule__BudgetEntry__Group_0__13405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__CategoryAssignment_0_1_in_rule__BudgetEntry__Group_0__1__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__2__Impl_in_rule__BudgetEntry__Group_0__23462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__3_in_rule__BudgetEntry__Group_0__23465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BudgetEntry__Group_0__2__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__3__Impl_in_rule__BudgetEntry__Group_0__33524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__AmountAssignment_0_3_in_rule__BudgetEntry__Group_0__3__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__0__Impl_in_rule__BudgetEntry__Group_1__03589 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__1_in_rule__BudgetEntry__Group_1__03592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__1__Impl_in_rule__BudgetEntry__Group_1__13650 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__2_in_rule__BudgetEntry__Group_1__13653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__CategoryAssignment_1_1_in_rule__BudgetEntry__Group_1__1__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__2__Impl_in_rule__BudgetEntry__Group_1__23710 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__3_in_rule__BudgetEntry__Group_1__23713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BudgetEntry__Group_1__2__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__3__Impl_in_rule__BudgetEntry__Group_1__33772 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__4_in_rule__BudgetEntry__Group_1__33775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__BaseEntryAssignment_1_3_in_rule__BudgetEntry__Group_1__3__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__4__Impl_in_rule__BudgetEntry__Group_1__43832 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__5_in_rule__BudgetEntry__Group_1__43835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BudgetEntry__Group_1__4__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__5__Impl_in_rule__BudgetEntry__Group_1__53894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__FactorAssignment_1_5_in_rule__BudgetEntry__Group_1__5__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__0__Impl_in_rule__ActualEntry__Group_0__03963 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__1_in_rule__ActualEntry__Group_0__03966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__1__Impl_in_rule__ActualEntry__Group_0__14024 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__2_in_rule__ActualEntry__Group_0__14027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__CategoryAssignment_0_1_in_rule__ActualEntry__Group_0__1__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__2__Impl_in_rule__ActualEntry__Group_0__24084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__3_in_rule__ActualEntry__Group_0__24087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ActualEntry__Group_0__2__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__3__Impl_in_rule__ActualEntry__Group_0__34146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__AmountAssignment_0_3_in_rule__ActualEntry__Group_0__3__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__0__Impl_in_rule__ActualEntry__Group_1__04211 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__1_in_rule__ActualEntry__Group_1__04214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__1__Impl_in_rule__ActualEntry__Group_1__14272 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__2_in_rule__ActualEntry__Group_1__14275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__CategoryAssignment_1_1_in_rule__ActualEntry__Group_1__1__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__2__Impl_in_rule__ActualEntry__Group_1__24332 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__3_in_rule__ActualEntry__Group_1__24335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActualEntry__Group_1__2__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__3__Impl_in_rule__ActualEntry__Group_1__34394 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__4_in_rule__ActualEntry__Group_1__34397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4426 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4438 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__4__Impl_in_rule__ActualEntry__Group_1__44471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ActualEntry__Group_1__4__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__0__Impl_in_rule__Transaction__Group_0__04540 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__1_in_rule__Transaction__Group_0__04543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__1__Impl_in_rule__Transaction__Group_0__14601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__2_in_rule__Transaction__Group_0__14604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Transaction__Group_0__1__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__2__Impl_in_rule__Transaction__Group_0__24663 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__3_in_rule__Transaction__Group_0__24666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AmountAssignment_0_2_in_rule__Transaction__Group_0__2__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__3__Impl_in_rule__Transaction__Group_0__34723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__0_in_rule__Transaction__Group_0__3__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__0__Impl_in_rule__Transaction__Group_0_3__04789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__1_in_rule__Transaction__Group_0_3__04792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Transaction__Group_0_3__0__Impl4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__1__Impl_in_rule__Transaction__Group_0_3__14851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__DayAssignment_0_3_1_in_rule__Transaction__Group_0_3__1__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__04912 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__04915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__14973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__2_in_rule__Transaction__Group_1__14976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Transaction__Group_1__1__Impl5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__2__Impl_in_rule__Transaction__Group_1__25035 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__3_in_rule__Transaction__Group_1__25038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AmountAssignment_1_2_in_rule__Transaction__Group_1__2__Impl5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__3__Impl_in_rule__Transaction__Group_1__35095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__4_in_rule__Transaction__Group_1__35098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Transaction__Group_1__3__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__4__Impl_in_rule__Transaction__Group_1__45157 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__5_in_rule__Transaction__Group_1__45160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__DayAssignment_1_4_in_rule__Transaction__Group_1__4__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__5__Impl_in_rule__Transaction__Group_1__55217 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__6_in_rule__Transaction__Group_1__55220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Transaction__Group_1__5__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__6__Impl_in_rule__Transaction__Group_1__65279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__FromAssignment_1_6_in_rule__Transaction__Group_1__6__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Library__NameAssignment_15356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_35387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_0_25418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_1_25449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_15480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_2_15511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Year__NameAssignment_05542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_25577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_45612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_05643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBudgetEntry_in_rule__Month__BudgetEntriesAssignment_35674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualEntry_in_rule__Month__ActualEntriesAssignment_75705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_0_15740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__BudgetEntry__AmountAssignment_0_35775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_1_15810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__BaseEntryAssignment_1_35849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__BudgetEntry__FactorAssignment_1_55884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_0_15919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__ActualEntry__AmountAssignment_0_35954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_1_15989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__ActualEntry__TransactionsAssignment_1_36024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_0_26055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_0_3_16086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_1_26117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_1_46148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Transaction__FromAssignment_1_66179 = new BitSet(new long[]{0x0000000000000002L});

}