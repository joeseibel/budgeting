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


    // $ANTLR start "entryRuleOptionalInt"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:340:1: entryRuleOptionalInt : ruleOptionalInt EOF ;
    public final void entryRuleOptionalInt() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:341:1: ( ruleOptionalInt EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:342:1: ruleOptionalInt EOF
            {
             before(grammarAccess.getOptionalIntRule()); 
            pushFollow(FOLLOW_ruleOptionalInt_in_entryRuleOptionalInt660);
            ruleOptionalInt();

            state._fsp--;

             after(grammarAccess.getOptionalIntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalInt667); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:349:1: ruleOptionalInt : ( RULE_INT ) ;
    public final void ruleOptionalInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:353:2: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:354:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:354:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:355:1: RULE_INT
            {
             before(grammarAccess.getOptionalIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOptionalInt693); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:369:1: ruleMonthEnum : ( ( rule__MonthEnum__Alternatives ) ) ;
    public final void ruleMonthEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:373:1: ( ( ( rule__MonthEnum__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:374:1: ( ( rule__MonthEnum__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:374:1: ( ( rule__MonthEnum__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:375:1: ( rule__MonthEnum__Alternatives )
            {
             before(grammarAccess.getMonthEnumAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:376:1: ( rule__MonthEnum__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:376:2: rule__MonthEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__MonthEnum__Alternatives_in_ruleMonthEnum729);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:387:1: rule__BudgetingFile__Alternatives : ( ( ruleLibrary ) | ( ruleYear ) );
    public final void rule__BudgetingFile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:391:1: ( ( ruleLibrary ) | ( ruleYear ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:392:1: ( ruleLibrary )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:392:1: ( ruleLibrary )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:393:1: ruleLibrary
                    {
                     before(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLibrary_in_rule__BudgetingFile__Alternatives764);
                    ruleLibrary();

                    state._fsp--;

                     after(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:398:6: ( ruleYear )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:398:6: ( ruleYear )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:399:1: ruleYear
                    {
                     before(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleYear_in_rule__BudgetingFile__Alternatives781);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:409:1: rule__Category__Alternatives : ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Group_1__0 ) ) );
    public final void rule__Category__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:413:1: ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:414:1: ( ( rule__Category__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:414:1: ( ( rule__Category__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:415:1: ( rule__Category__Group_0__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:416:1: ( rule__Category__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:416:2: rule__Category__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_0__0_in_rule__Category__Alternatives813);
                    rule__Category__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCategoryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:420:6: ( ( rule__Category__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:420:6: ( ( rule__Category__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:421:1: ( rule__Category__Group_1__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:422:1: ( rule__Category__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:422:2: rule__Category__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_1__0_in_rule__Category__Alternatives831);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:431:1: rule__BudgetEntry__Alternatives : ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) );
    public final void rule__BudgetEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:435:1: ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:436:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:436:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:437:1: ( rule__BudgetEntry__Group_0__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:438:1: ( rule__BudgetEntry__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:438:2: rule__BudgetEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BudgetEntry__Group_0__0_in_rule__BudgetEntry__Alternatives864);
                    rule__BudgetEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBudgetEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:442:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:442:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:443:1: ( rule__BudgetEntry__Group_1__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:444:1: ( rule__BudgetEntry__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:444:2: rule__BudgetEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BudgetEntry__Group_1__0_in_rule__BudgetEntry__Alternatives882);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:453:1: rule__ActualEntry__Alternatives : ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) );
    public final void rule__ActualEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:457:1: ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:458:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:458:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:459:1: ( rule__ActualEntry__Group_0__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:460:1: ( rule__ActualEntry__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:460:2: rule__ActualEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualEntry__Group_0__0_in_rule__ActualEntry__Alternatives915);
                    rule__ActualEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActualEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:464:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:464:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:465:1: ( rule__ActualEntry__Group_1__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:466:1: ( rule__ActualEntry__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:466:2: rule__ActualEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ActualEntry__Group_1__0_in_rule__ActualEntry__Alternatives933);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:475:1: rule__Transaction__Alternatives : ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) );
    public final void rule__Transaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:479:1: ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:480:1: ( ( rule__Transaction__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:480:1: ( ( rule__Transaction__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:481:1: ( rule__Transaction__Group_0__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:482:1: ( rule__Transaction__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:482:2: rule__Transaction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_0__0_in_rule__Transaction__Alternatives966);
                    rule__Transaction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:486:6: ( ( rule__Transaction__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:486:6: ( ( rule__Transaction__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:487:1: ( rule__Transaction__Group_1__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:488:1: ( rule__Transaction__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:488:2: rule__Transaction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Alternatives984);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:497:1: rule__Double__Alternatives : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Double__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:501:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:502:1: ( RULE_INT )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:502:1: ( RULE_INT )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:503:1: RULE_INT
                    {
                     before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Alternatives1017); 
                     after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:508:6: ( RULE_DECIMAL )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:508:6: ( RULE_DECIMAL )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:509:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getDoubleAccess().getDECIMALTerminalRuleCall_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Double__Alternatives1034); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:519:1: rule__MonthEnum__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__MonthEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:523:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:524:1: ( ( 'january' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:524:1: ( ( 'january' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:525:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:526:1: ( 'january' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:526:3: 'january'
                    {
                    match(input,12,FOLLOW_12_in_rule__MonthEnum__Alternatives1067); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:531:6: ( ( 'february' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:531:6: ( ( 'february' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:532:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:533:1: ( 'february' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:533:3: 'february'
                    {
                    match(input,13,FOLLOW_13_in_rule__MonthEnum__Alternatives1088); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:538:6: ( ( 'march' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:538:6: ( ( 'march' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:539:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:540:1: ( 'march' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:540:3: 'march'
                    {
                    match(input,14,FOLLOW_14_in_rule__MonthEnum__Alternatives1109); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:545:6: ( ( 'april' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:545:6: ( ( 'april' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:546:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:547:1: ( 'april' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:547:3: 'april'
                    {
                    match(input,15,FOLLOW_15_in_rule__MonthEnum__Alternatives1130); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:552:6: ( ( 'may' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:552:6: ( ( 'may' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:553:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:554:1: ( 'may' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:554:3: 'may'
                    {
                    match(input,16,FOLLOW_16_in_rule__MonthEnum__Alternatives1151); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:559:6: ( ( 'june' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:559:6: ( ( 'june' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:560:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:561:1: ( 'june' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:561:3: 'june'
                    {
                    match(input,17,FOLLOW_17_in_rule__MonthEnum__Alternatives1172); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:566:6: ( ( 'july' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:566:6: ( ( 'july' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:567:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:568:1: ( 'july' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:568:3: 'july'
                    {
                    match(input,18,FOLLOW_18_in_rule__MonthEnum__Alternatives1193); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:573:6: ( ( 'august' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:573:6: ( ( 'august' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:574:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:575:1: ( 'august' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:575:3: 'august'
                    {
                    match(input,19,FOLLOW_19_in_rule__MonthEnum__Alternatives1214); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:580:6: ( ( 'september' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:580:6: ( ( 'september' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:581:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:582:1: ( 'september' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:582:3: 'september'
                    {
                    match(input,20,FOLLOW_20_in_rule__MonthEnum__Alternatives1235); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:587:6: ( ( 'october' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:587:6: ( ( 'october' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:588:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:589:1: ( 'october' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:589:3: 'october'
                    {
                    match(input,21,FOLLOW_21_in_rule__MonthEnum__Alternatives1256); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:594:6: ( ( 'november' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:594:6: ( ( 'november' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:595:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:596:1: ( 'november' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:596:3: 'november'
                    {
                    match(input,22,FOLLOW_22_in_rule__MonthEnum__Alternatives1277); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:601:6: ( ( 'december' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:601:6: ( ( 'december' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:602:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:603:1: ( 'december' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:603:3: 'december'
                    {
                    match(input,23,FOLLOW_23_in_rule__MonthEnum__Alternatives1298); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:615:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:619:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:620:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01331);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01334);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:627:1: rule__Library__Group__0__Impl : ( 'library' ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:631:1: ( ( 'library' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:632:1: ( 'library' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:632:1: ( 'library' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:633:1: 'library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Library__Group__0__Impl1362); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:646:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:650:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:651:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11393);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11396);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:658:1: rule__Library__Group__1__Impl : ( ( rule__Library__NameAssignment_1 ) ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:662:1: ( ( ( rule__Library__NameAssignment_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:663:1: ( ( rule__Library__NameAssignment_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:663:1: ( ( rule__Library__NameAssignment_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:664:1: ( rule__Library__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:665:1: ( rule__Library__NameAssignment_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:665:2: rule__Library__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1423);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:675:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:679:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:680:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21453);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21456);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:687:1: rule__Library__Group__2__Impl : ( '{' ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:691:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:692:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:692:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:693:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Library__Group__2__Impl1484); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:706:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:710:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:711:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31515);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31518);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:718:1: rule__Library__Group__3__Impl : ( ( rule__Library__CategoriesAssignment_3 )* ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:722:1: ( ( ( rule__Library__CategoriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:723:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:723:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:724:1: ( rule__Library__CategoriesAssignment_3 )*
            {
             before(grammarAccess.getLibraryAccess().getCategoriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:725:1: ( rule__Library__CategoriesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:725:2: rule__Library__CategoriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1545);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:735:1: rule__Library__Group__4 : rule__Library__Group__4__Impl ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:739:1: ( rule__Library__Group__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:740:2: rule__Library__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41576);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:746:1: rule__Library__Group__4__Impl : ( '}' ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:750:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:751:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:751:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:752:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Library__Group__4__Impl1604); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:775:1: rule__Category__Group_0__0 : rule__Category__Group_0__0__Impl rule__Category__Group_0__1 ;
    public final void rule__Category__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:779:1: ( rule__Category__Group_0__0__Impl rule__Category__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:780:2: rule__Category__Group_0__0__Impl rule__Category__Group_0__1
            {
            pushFollow(FOLLOW_rule__Category__Group_0__0__Impl_in_rule__Category__Group_0__01645);
            rule__Category__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_0__1_in_rule__Category__Group_0__01648);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:787:1: rule__Category__Group_0__0__Impl : ( () ) ;
    public final void rule__Category__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:791:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:792:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:792:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:793:1: ()
            {
             before(grammarAccess.getCategoryAccess().getIncomeCategoryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:794:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:796:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:806:1: rule__Category__Group_0__1 : rule__Category__Group_0__1__Impl rule__Category__Group_0__2 ;
    public final void rule__Category__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:810:1: ( rule__Category__Group_0__1__Impl rule__Category__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:811:2: rule__Category__Group_0__1__Impl rule__Category__Group_0__2
            {
            pushFollow(FOLLOW_rule__Category__Group_0__1__Impl_in_rule__Category__Group_0__11706);
            rule__Category__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_0__2_in_rule__Category__Group_0__11709);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:818:1: rule__Category__Group_0__1__Impl : ( 'income' ) ;
    public final void rule__Category__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:822:1: ( ( 'income' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:823:1: ( 'income' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:823:1: ( 'income' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:824:1: 'income'
            {
             before(grammarAccess.getCategoryAccess().getIncomeKeyword_0_1()); 
            match(input,27,FOLLOW_27_in_rule__Category__Group_0__1__Impl1737); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:837:1: rule__Category__Group_0__2 : rule__Category__Group_0__2__Impl ;
    public final void rule__Category__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:841:1: ( rule__Category__Group_0__2__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:842:2: rule__Category__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_0__2__Impl_in_rule__Category__Group_0__21768);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:848:1: rule__Category__Group_0__2__Impl : ( ( rule__Category__NameAssignment_0_2 ) ) ;
    public final void rule__Category__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:852:1: ( ( ( rule__Category__NameAssignment_0_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:853:1: ( ( rule__Category__NameAssignment_0_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:853:1: ( ( rule__Category__NameAssignment_0_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:854:1: ( rule__Category__NameAssignment_0_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_0_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:855:1: ( rule__Category__NameAssignment_0_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:855:2: rule__Category__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_0_2_in_rule__Category__Group_0__2__Impl1795);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:871:1: rule__Category__Group_1__0 : rule__Category__Group_1__0__Impl rule__Category__Group_1__1 ;
    public final void rule__Category__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:875:1: ( rule__Category__Group_1__0__Impl rule__Category__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:876:2: rule__Category__Group_1__0__Impl rule__Category__Group_1__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1__0__Impl_in_rule__Category__Group_1__01831);
            rule__Category__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__1_in_rule__Category__Group_1__01834);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:883:1: rule__Category__Group_1__0__Impl : ( () ) ;
    public final void rule__Category__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:887:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:888:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:888:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:889:1: ()
            {
             before(grammarAccess.getCategoryAccess().getExpenseCategoryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:890:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:892:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:902:1: rule__Category__Group_1__1 : rule__Category__Group_1__1__Impl rule__Category__Group_1__2 ;
    public final void rule__Category__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:906:1: ( rule__Category__Group_1__1__Impl rule__Category__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:907:2: rule__Category__Group_1__1__Impl rule__Category__Group_1__2
            {
            pushFollow(FOLLOW_rule__Category__Group_1__1__Impl_in_rule__Category__Group_1__11892);
            rule__Category__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__2_in_rule__Category__Group_1__11895);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:914:1: rule__Category__Group_1__1__Impl : ( 'expense' ) ;
    public final void rule__Category__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:918:1: ( ( 'expense' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:919:1: ( 'expense' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:919:1: ( 'expense' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:920:1: 'expense'
            {
             before(grammarAccess.getCategoryAccess().getExpenseKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__Category__Group_1__1__Impl1923); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:933:1: rule__Category__Group_1__2 : rule__Category__Group_1__2__Impl rule__Category__Group_1__3 ;
    public final void rule__Category__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:937:1: ( rule__Category__Group_1__2__Impl rule__Category__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:938:2: rule__Category__Group_1__2__Impl rule__Category__Group_1__3
            {
            pushFollow(FOLLOW_rule__Category__Group_1__2__Impl_in_rule__Category__Group_1__21954);
            rule__Category__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1__3_in_rule__Category__Group_1__21957);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:945:1: rule__Category__Group_1__2__Impl : ( ( rule__Category__NameAssignment_1_2 ) ) ;
    public final void rule__Category__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:949:1: ( ( ( rule__Category__NameAssignment_1_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:950:1: ( ( rule__Category__NameAssignment_1_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:950:1: ( ( rule__Category__NameAssignment_1_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:951:1: ( rule__Category__NameAssignment_1_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:952:1: ( rule__Category__NameAssignment_1_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:952:2: rule__Category__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_1_2_in_rule__Category__Group_1__2__Impl1984);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:962:1: rule__Category__Group_1__3 : rule__Category__Group_1__3__Impl ;
    public final void rule__Category__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:966:1: ( rule__Category__Group_1__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:967:2: rule__Category__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1__3__Impl_in_rule__Category__Group_1__32014);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:973:1: rule__Category__Group_1__3__Impl : ( ( rule__Category__Group_1_3__0 )? ) ;
    public final void rule__Category__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:977:1: ( ( ( rule__Category__Group_1_3__0 )? ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:978:1: ( ( rule__Category__Group_1_3__0 )? )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:978:1: ( ( rule__Category__Group_1_3__0 )? )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:979:1: ( rule__Category__Group_1_3__0 )?
            {
             before(grammarAccess.getCategoryAccess().getGroup_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:980:1: ( rule__Category__Group_1_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:980:2: rule__Category__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Category__Group_1_3__0_in_rule__Category__Group_1__3__Impl2041);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:998:1: rule__Category__Group_1_3__0 : rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1 ;
    public final void rule__Category__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1002:1: ( rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1003:2: rule__Category__Group_1_3__0__Impl rule__Category__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__0__Impl_in_rule__Category__Group_1_3__02080);
            rule__Category__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__1_in_rule__Category__Group_1_3__02083);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1010:1: rule__Category__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__Category__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1014:1: ( ( '[' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1015:1: ( '[' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1015:1: ( '[' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1016:1: '['
            {
             before(grammarAccess.getCategoryAccess().getLeftSquareBracketKeyword_1_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Category__Group_1_3__0__Impl2111); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1029:1: rule__Category__Group_1_3__1 : rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2 ;
    public final void rule__Category__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1033:1: ( rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1034:2: rule__Category__Group_1_3__1__Impl rule__Category__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__1__Impl_in_rule__Category__Group_1_3__12142);
            rule__Category__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__2_in_rule__Category__Group_1_3__12145);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1041:1: rule__Category__Group_1_3__1__Impl : ( ( rule__Category__PatternsAssignment_1_3_1 ) ) ;
    public final void rule__Category__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1045:1: ( ( ( rule__Category__PatternsAssignment_1_3_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1046:1: ( ( rule__Category__PatternsAssignment_1_3_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1046:1: ( ( rule__Category__PatternsAssignment_1_3_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1047:1: ( rule__Category__PatternsAssignment_1_3_1 )
            {
             before(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1048:1: ( rule__Category__PatternsAssignment_1_3_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1048:2: rule__Category__PatternsAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Category__PatternsAssignment_1_3_1_in_rule__Category__Group_1_3__1__Impl2172);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1058:1: rule__Category__Group_1_3__2 : rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3 ;
    public final void rule__Category__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1062:1: ( rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1063:2: rule__Category__Group_1_3__2__Impl rule__Category__Group_1_3__3
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__2__Impl_in_rule__Category__Group_1_3__22202);
            rule__Category__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3__3_in_rule__Category__Group_1_3__22205);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1070:1: rule__Category__Group_1_3__2__Impl : ( ( rule__Category__Group_1_3_2__0 )* ) ;
    public final void rule__Category__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1074:1: ( ( ( rule__Category__Group_1_3_2__0 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1075:1: ( ( rule__Category__Group_1_3_2__0 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1075:1: ( ( rule__Category__Group_1_3_2__0 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1076:1: ( rule__Category__Group_1_3_2__0 )*
            {
             before(grammarAccess.getCategoryAccess().getGroup_1_3_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1077:1: ( rule__Category__Group_1_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1077:2: rule__Category__Group_1_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Category__Group_1_3_2__0_in_rule__Category__Group_1_3__2__Impl2232);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1087:1: rule__Category__Group_1_3__3 : rule__Category__Group_1_3__3__Impl ;
    public final void rule__Category__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1091:1: ( rule__Category__Group_1_3__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1092:2: rule__Category__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3__3__Impl_in_rule__Category__Group_1_3__32263);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1098:1: rule__Category__Group_1_3__3__Impl : ( ']' ) ;
    public final void rule__Category__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1102:1: ( ( ']' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1103:1: ( ']' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1103:1: ( ']' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1104:1: ']'
            {
             before(grammarAccess.getCategoryAccess().getRightSquareBracketKeyword_1_3_3()); 
            match(input,30,FOLLOW_30_in_rule__Category__Group_1_3__3__Impl2291); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1125:1: rule__Category__Group_1_3_2__0 : rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1 ;
    public final void rule__Category__Group_1_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1129:1: ( rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1130:2: rule__Category__Group_1_3_2__0__Impl rule__Category__Group_1_3_2__1
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3_2__0__Impl_in_rule__Category__Group_1_3_2__02330);
            rule__Category__Group_1_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group_1_3_2__1_in_rule__Category__Group_1_3_2__02333);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1137:1: rule__Category__Group_1_3_2__0__Impl : ( ',' ) ;
    public final void rule__Category__Group_1_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1141:1: ( ( ',' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1142:1: ( ',' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1142:1: ( ',' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1143:1: ','
            {
             before(grammarAccess.getCategoryAccess().getCommaKeyword_1_3_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Category__Group_1_3_2__0__Impl2361); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1156:1: rule__Category__Group_1_3_2__1 : rule__Category__Group_1_3_2__1__Impl ;
    public final void rule__Category__Group_1_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1160:1: ( rule__Category__Group_1_3_2__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1161:2: rule__Category__Group_1_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group_1_3_2__1__Impl_in_rule__Category__Group_1_3_2__12392);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1167:1: rule__Category__Group_1_3_2__1__Impl : ( ( rule__Category__PatternsAssignment_1_3_2_1 ) ) ;
    public final void rule__Category__Group_1_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1171:1: ( ( ( rule__Category__PatternsAssignment_1_3_2_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1172:1: ( ( rule__Category__PatternsAssignment_1_3_2_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1172:1: ( ( rule__Category__PatternsAssignment_1_3_2_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1173:1: ( rule__Category__PatternsAssignment_1_3_2_1 )
            {
             before(grammarAccess.getCategoryAccess().getPatternsAssignment_1_3_2_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1174:1: ( rule__Category__PatternsAssignment_1_3_2_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1174:2: rule__Category__PatternsAssignment_1_3_2_1
            {
            pushFollow(FOLLOW_rule__Category__PatternsAssignment_1_3_2_1_in_rule__Category__Group_1_3_2__1__Impl2419);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1188:1: rule__Year__Group__0 : rule__Year__Group__0__Impl rule__Year__Group__1 ;
    public final void rule__Year__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1192:1: ( rule__Year__Group__0__Impl rule__Year__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1193:2: rule__Year__Group__0__Impl rule__Year__Group__1
            {
            pushFollow(FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__02453);
            rule__Year__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__1_in_rule__Year__Group__02456);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1200:1: rule__Year__Group__0__Impl : ( ( rule__Year__NameAssignment_0 ) ) ;
    public final void rule__Year__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1204:1: ( ( ( rule__Year__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1205:1: ( ( rule__Year__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1205:1: ( ( rule__Year__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1206:1: ( rule__Year__NameAssignment_0 )
            {
             before(grammarAccess.getYearAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1207:1: ( rule__Year__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1207:2: rule__Year__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl2483);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1217:1: rule__Year__Group__1 : rule__Year__Group__1__Impl rule__Year__Group__2 ;
    public final void rule__Year__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1221:1: ( rule__Year__Group__1__Impl rule__Year__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1222:2: rule__Year__Group__1__Impl rule__Year__Group__2
            {
            pushFollow(FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__12513);
            rule__Year__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__2_in_rule__Year__Group__12516);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1229:1: rule__Year__Group__1__Impl : ( 'uses' ) ;
    public final void rule__Year__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1233:1: ( ( 'uses' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1234:1: ( 'uses' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1234:1: ( 'uses' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1235:1: 'uses'
            {
             before(grammarAccess.getYearAccess().getUsesKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Year__Group__1__Impl2544); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1248:1: rule__Year__Group__2 : rule__Year__Group__2__Impl rule__Year__Group__3 ;
    public final void rule__Year__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1252:1: ( rule__Year__Group__2__Impl rule__Year__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1253:2: rule__Year__Group__2__Impl rule__Year__Group__3
            {
            pushFollow(FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__22575);
            rule__Year__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__3_in_rule__Year__Group__22578);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1260:1: rule__Year__Group__2__Impl : ( ( rule__Year__LibraryAssignment_2 ) ) ;
    public final void rule__Year__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1264:1: ( ( ( rule__Year__LibraryAssignment_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1265:1: ( ( rule__Year__LibraryAssignment_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1265:1: ( ( rule__Year__LibraryAssignment_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1266:1: ( rule__Year__LibraryAssignment_2 )
            {
             before(grammarAccess.getYearAccess().getLibraryAssignment_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1267:1: ( rule__Year__LibraryAssignment_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1267:2: rule__Year__LibraryAssignment_2
            {
            pushFollow(FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl2605);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1277:1: rule__Year__Group__3 : rule__Year__Group__3__Impl rule__Year__Group__4 ;
    public final void rule__Year__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1281:1: ( rule__Year__Group__3__Impl rule__Year__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1282:2: rule__Year__Group__3__Impl rule__Year__Group__4
            {
            pushFollow(FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__32635);
            rule__Year__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__4_in_rule__Year__Group__32638);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1289:1: rule__Year__Group__3__Impl : ( '{' ) ;
    public final void rule__Year__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1293:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1294:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1294:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1295:1: '{'
            {
             before(grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Year__Group__3__Impl2666); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1308:1: rule__Year__Group__4 : rule__Year__Group__4__Impl rule__Year__Group__5 ;
    public final void rule__Year__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1312:1: ( rule__Year__Group__4__Impl rule__Year__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1313:2: rule__Year__Group__4__Impl rule__Year__Group__5
            {
            pushFollow(FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__42697);
            rule__Year__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__5_in_rule__Year__Group__42700);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1320:1: rule__Year__Group__4__Impl : ( ( rule__Year__MonthsAssignment_4 )* ) ;
    public final void rule__Year__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1324:1: ( ( ( rule__Year__MonthsAssignment_4 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1325:1: ( ( rule__Year__MonthsAssignment_4 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1325:1: ( ( rule__Year__MonthsAssignment_4 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1326:1: ( rule__Year__MonthsAssignment_4 )*
            {
             before(grammarAccess.getYearAccess().getMonthsAssignment_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1327:1: ( rule__Year__MonthsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1327:2: rule__Year__MonthsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl2727);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1337:1: rule__Year__Group__5 : rule__Year__Group__5__Impl ;
    public final void rule__Year__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1341:1: ( rule__Year__Group__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1342:2: rule__Year__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__52758);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1348:1: rule__Year__Group__5__Impl : ( '}' ) ;
    public final void rule__Year__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1352:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1353:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1353:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1354:1: '}'
            {
             before(grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Year__Group__5__Impl2786); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1379:1: rule__Month__Group__0 : rule__Month__Group__0__Impl rule__Month__Group__1 ;
    public final void rule__Month__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1383:1: ( rule__Month__Group__0__Impl rule__Month__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1384:2: rule__Month__Group__0__Impl rule__Month__Group__1
            {
            pushFollow(FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__02829);
            rule__Month__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__1_in_rule__Month__Group__02832);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1391:1: rule__Month__Group__0__Impl : ( ( rule__Month__NameAssignment_0 ) ) ;
    public final void rule__Month__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1395:1: ( ( ( rule__Month__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1396:1: ( ( rule__Month__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1396:1: ( ( rule__Month__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1397:1: ( rule__Month__NameAssignment_0 )
            {
             before(grammarAccess.getMonthAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1398:1: ( rule__Month__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1398:2: rule__Month__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl2859);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1408:1: rule__Month__Group__1 : rule__Month__Group__1__Impl rule__Month__Group__2 ;
    public final void rule__Month__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1412:1: ( rule__Month__Group__1__Impl rule__Month__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1413:2: rule__Month__Group__1__Impl rule__Month__Group__2
            {
            pushFollow(FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__12889);
            rule__Month__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__2_in_rule__Month__Group__12892);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1420:1: rule__Month__Group__1__Impl : ( 'budget' ) ;
    public final void rule__Month__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1424:1: ( ( 'budget' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1425:1: ( 'budget' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1425:1: ( 'budget' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1426:1: 'budget'
            {
             before(grammarAccess.getMonthAccess().getBudgetKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Month__Group__1__Impl2920); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1439:1: rule__Month__Group__2 : rule__Month__Group__2__Impl rule__Month__Group__3 ;
    public final void rule__Month__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1443:1: ( rule__Month__Group__2__Impl rule__Month__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1444:2: rule__Month__Group__2__Impl rule__Month__Group__3
            {
            pushFollow(FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__22951);
            rule__Month__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__3_in_rule__Month__Group__22954);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1451:1: rule__Month__Group__2__Impl : ( '{' ) ;
    public final void rule__Month__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1455:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1456:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1456:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1457:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Month__Group__2__Impl2982); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1470:1: rule__Month__Group__3 : rule__Month__Group__3__Impl rule__Month__Group__4 ;
    public final void rule__Month__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1474:1: ( rule__Month__Group__3__Impl rule__Month__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1475:2: rule__Month__Group__3__Impl rule__Month__Group__4
            {
            pushFollow(FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__33013);
            rule__Month__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__4_in_rule__Month__Group__33016);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1482:1: rule__Month__Group__3__Impl : ( ( rule__Month__BudgetEntriesAssignment_3 )* ) ;
    public final void rule__Month__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1486:1: ( ( ( rule__Month__BudgetEntriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1487:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1487:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1488:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1489:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1489:2: rule__Month__BudgetEntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl3043);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1499:1: rule__Month__Group__4 : rule__Month__Group__4__Impl rule__Month__Group__5 ;
    public final void rule__Month__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1503:1: ( rule__Month__Group__4__Impl rule__Month__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1504:2: rule__Month__Group__4__Impl rule__Month__Group__5
            {
            pushFollow(FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__43074);
            rule__Month__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__5_in_rule__Month__Group__43077);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1511:1: rule__Month__Group__4__Impl : ( '}' ) ;
    public final void rule__Month__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1515:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1516:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1516:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1517:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__4__Impl3105); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1530:1: rule__Month__Group__5 : rule__Month__Group__5__Impl rule__Month__Group__6 ;
    public final void rule__Month__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1534:1: ( rule__Month__Group__5__Impl rule__Month__Group__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1535:2: rule__Month__Group__5__Impl rule__Month__Group__6
            {
            pushFollow(FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__53136);
            rule__Month__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__6_in_rule__Month__Group__53139);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1542:1: rule__Month__Group__5__Impl : ( 'actual' ) ;
    public final void rule__Month__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1546:1: ( ( 'actual' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1547:1: ( 'actual' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1547:1: ( 'actual' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1548:1: 'actual'
            {
             before(grammarAccess.getMonthAccess().getActualKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__Month__Group__5__Impl3167); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1561:1: rule__Month__Group__6 : rule__Month__Group__6__Impl rule__Month__Group__7 ;
    public final void rule__Month__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1565:1: ( rule__Month__Group__6__Impl rule__Month__Group__7 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1566:2: rule__Month__Group__6__Impl rule__Month__Group__7
            {
            pushFollow(FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__63198);
            rule__Month__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__7_in_rule__Month__Group__63201);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1573:1: rule__Month__Group__6__Impl : ( '{' ) ;
    public final void rule__Month__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1577:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1578:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1578:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1579:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Month__Group__6__Impl3229); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1592:1: rule__Month__Group__7 : rule__Month__Group__7__Impl rule__Month__Group__8 ;
    public final void rule__Month__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1596:1: ( rule__Month__Group__7__Impl rule__Month__Group__8 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1597:2: rule__Month__Group__7__Impl rule__Month__Group__8
            {
            pushFollow(FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__73260);
            rule__Month__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__8_in_rule__Month__Group__73263);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1604:1: rule__Month__Group__7__Impl : ( ( rule__Month__ActualEntriesAssignment_7 )* ) ;
    public final void rule__Month__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1608:1: ( ( ( rule__Month__ActualEntriesAssignment_7 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1609:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1609:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1610:1: ( rule__Month__ActualEntriesAssignment_7 )*
            {
             before(grammarAccess.getMonthAccess().getActualEntriesAssignment_7()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1611:1: ( rule__Month__ActualEntriesAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1611:2: rule__Month__ActualEntriesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl3290);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1621:1: rule__Month__Group__8 : rule__Month__Group__8__Impl ;
    public final void rule__Month__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1625:1: ( rule__Month__Group__8__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1626:2: rule__Month__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__83321);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1632:1: rule__Month__Group__8__Impl : ( '}' ) ;
    public final void rule__Month__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1636:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1637:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1637:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1638:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__8__Impl3349); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1669:1: rule__BudgetEntry__Group_0__0 : rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 ;
    public final void rule__BudgetEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1673:1: ( rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1674:2: rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__0__Impl_in_rule__BudgetEntry__Group_0__03398);
            rule__BudgetEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__1_in_rule__BudgetEntry__Group_0__03401);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1681:1: rule__BudgetEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1685:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1686:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1686:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1687:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1688:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1690:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1700:1: rule__BudgetEntry__Group_0__1 : rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 ;
    public final void rule__BudgetEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1704:1: ( rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1705:2: rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__1__Impl_in_rule__BudgetEntry__Group_0__13459);
            rule__BudgetEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__2_in_rule__BudgetEntry__Group_0__13462);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1712:1: rule__BudgetEntry__Group_0__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__BudgetEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1716:1: ( ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1717:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1717:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1718:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_0_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1719:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1719:2: rule__BudgetEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__CategoryAssignment_0_1_in_rule__BudgetEntry__Group_0__1__Impl3489);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1729:1: rule__BudgetEntry__Group_0__2 : rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 ;
    public final void rule__BudgetEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1733:1: ( rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1734:2: rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__2__Impl_in_rule__BudgetEntry__Group_0__23519);
            rule__BudgetEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__3_in_rule__BudgetEntry__Group_0__23522);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1741:1: rule__BudgetEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1745:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1746:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1746:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1747:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__BudgetEntry__Group_0__2__Impl3550); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1760:1: rule__BudgetEntry__Group_0__3 : rule__BudgetEntry__Group_0__3__Impl ;
    public final void rule__BudgetEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1764:1: ( rule__BudgetEntry__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1765:2: rule__BudgetEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__3__Impl_in_rule__BudgetEntry__Group_0__33581);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1771:1: rule__BudgetEntry__Group_0__3__Impl : ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__BudgetEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1775:1: ( ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1776:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1776:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1777:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountAssignment_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1778:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1778:2: rule__BudgetEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__AmountAssignment_0_3_in_rule__BudgetEntry__Group_0__3__Impl3608);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1796:1: rule__BudgetEntry__Group_1__0 : rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 ;
    public final void rule__BudgetEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1800:1: ( rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1801:2: rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__0__Impl_in_rule__BudgetEntry__Group_1__03646);
            rule__BudgetEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__1_in_rule__BudgetEntry__Group_1__03649);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1808:1: rule__BudgetEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1812:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1813:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1813:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1814:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1815:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1817:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1827:1: rule__BudgetEntry__Group_1__1 : rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 ;
    public final void rule__BudgetEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1831:1: ( rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1832:2: rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__1__Impl_in_rule__BudgetEntry__Group_1__13707);
            rule__BudgetEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__2_in_rule__BudgetEntry__Group_1__13710);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1839:1: rule__BudgetEntry__Group_1__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__BudgetEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1843:1: ( ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1844:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1844:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1845:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_1_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1846:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1846:2: rule__BudgetEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__CategoryAssignment_1_1_in_rule__BudgetEntry__Group_1__1__Impl3737);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1856:1: rule__BudgetEntry__Group_1__2 : rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 ;
    public final void rule__BudgetEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1860:1: ( rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1861:2: rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__2__Impl_in_rule__BudgetEntry__Group_1__23767);
            rule__BudgetEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__3_in_rule__BudgetEntry__Group_1__23770);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1868:1: rule__BudgetEntry__Group_1__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1872:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1873:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1873:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1874:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2()); 
            match(input,35,FOLLOW_35_in_rule__BudgetEntry__Group_1__2__Impl3798); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1887:1: rule__BudgetEntry__Group_1__3 : rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 ;
    public final void rule__BudgetEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1891:1: ( rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1892:2: rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__3__Impl_in_rule__BudgetEntry__Group_1__33829);
            rule__BudgetEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__4_in_rule__BudgetEntry__Group_1__33832);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1899:1: rule__BudgetEntry__Group_1__3__Impl : ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) ;
    public final void rule__BudgetEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1903:1: ( ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1904:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1904:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1905:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1906:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1906:2: rule__BudgetEntry__BaseEntryAssignment_1_3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__BaseEntryAssignment_1_3_in_rule__BudgetEntry__Group_1__3__Impl3859);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1916:1: rule__BudgetEntry__Group_1__4 : rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 ;
    public final void rule__BudgetEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1920:1: ( rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1921:2: rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__4__Impl_in_rule__BudgetEntry__Group_1__43889);
            rule__BudgetEntry__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__5_in_rule__BudgetEntry__Group_1__43892);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1928:1: rule__BudgetEntry__Group_1__4__Impl : ( '*' ) ;
    public final void rule__BudgetEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1932:1: ( ( '*' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1933:1: ( '*' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1933:1: ( '*' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1934:1: '*'
            {
             before(grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4()); 
            match(input,36,FOLLOW_36_in_rule__BudgetEntry__Group_1__4__Impl3920); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1947:1: rule__BudgetEntry__Group_1__5 : rule__BudgetEntry__Group_1__5__Impl ;
    public final void rule__BudgetEntry__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1951:1: ( rule__BudgetEntry__Group_1__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1952:2: rule__BudgetEntry__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__5__Impl_in_rule__BudgetEntry__Group_1__53951);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1958:1: rule__BudgetEntry__Group_1__5__Impl : ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) ;
    public final void rule__BudgetEntry__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1962:1: ( ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1963:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1963:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1964:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorAssignment_1_5()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1965:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1965:2: rule__BudgetEntry__FactorAssignment_1_5
            {
            pushFollow(FOLLOW_rule__BudgetEntry__FactorAssignment_1_5_in_rule__BudgetEntry__Group_1__5__Impl3978);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1987:1: rule__ActualEntry__Group_0__0 : rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 ;
    public final void rule__ActualEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1991:1: ( rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1992:2: rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__0__Impl_in_rule__ActualEntry__Group_0__04020);
            rule__ActualEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__1_in_rule__ActualEntry__Group_0__04023);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1999:1: rule__ActualEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2003:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2004:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2004:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2005:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2006:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2008:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2018:1: rule__ActualEntry__Group_0__1 : rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 ;
    public final void rule__ActualEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2022:1: ( rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2023:2: rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__1__Impl_in_rule__ActualEntry__Group_0__14081);
            rule__ActualEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__2_in_rule__ActualEntry__Group_0__14084);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2030:1: rule__ActualEntry__Group_0__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__ActualEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2034:1: ( ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2035:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2035:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2036:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_0_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2037:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2037:2: rule__ActualEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ActualEntry__CategoryAssignment_0_1_in_rule__ActualEntry__Group_0__1__Impl4111);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2047:1: rule__ActualEntry__Group_0__2 : rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 ;
    public final void rule__ActualEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2051:1: ( rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2052:2: rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__2__Impl_in_rule__ActualEntry__Group_0__24141);
            rule__ActualEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__3_in_rule__ActualEntry__Group_0__24144);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2059:1: rule__ActualEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__ActualEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2063:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2064:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2064:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2065:1: ':'
            {
             before(grammarAccess.getActualEntryAccess().getColonKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__ActualEntry__Group_0__2__Impl4172); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2078:1: rule__ActualEntry__Group_0__3 : rule__ActualEntry__Group_0__3__Impl ;
    public final void rule__ActualEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2082:1: ( rule__ActualEntry__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2083:2: rule__ActualEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__3__Impl_in_rule__ActualEntry__Group_0__34203);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2089:1: rule__ActualEntry__Group_0__3__Impl : ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__ActualEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2093:1: ( ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2094:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2094:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2095:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getActualEntryAccess().getAmountAssignment_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2096:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2096:2: rule__ActualEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_rule__ActualEntry__AmountAssignment_0_3_in_rule__ActualEntry__Group_0__3__Impl4230);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2114:1: rule__ActualEntry__Group_1__0 : rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 ;
    public final void rule__ActualEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2118:1: ( rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2119:2: rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__0__Impl_in_rule__ActualEntry__Group_1__04268);
            rule__ActualEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__1_in_rule__ActualEntry__Group_1__04271);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2126:1: rule__ActualEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2130:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2131:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2131:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2132:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2133:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2135:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2145:1: rule__ActualEntry__Group_1__1 : rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 ;
    public final void rule__ActualEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2149:1: ( rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2150:2: rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__1__Impl_in_rule__ActualEntry__Group_1__14329);
            rule__ActualEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__2_in_rule__ActualEntry__Group_1__14332);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2157:1: rule__ActualEntry__Group_1__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__ActualEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2161:1: ( ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2162:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2162:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2163:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_1_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2164:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2164:2: rule__ActualEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ActualEntry__CategoryAssignment_1_1_in_rule__ActualEntry__Group_1__1__Impl4359);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2174:1: rule__ActualEntry__Group_1__2 : rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 ;
    public final void rule__ActualEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2178:1: ( rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2179:2: rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__2__Impl_in_rule__ActualEntry__Group_1__24389);
            rule__ActualEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__3_in_rule__ActualEntry__Group_1__24392);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2186:1: rule__ActualEntry__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ActualEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2190:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2191:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2191:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2192:1: '{'
            {
             before(grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__ActualEntry__Group_1__2__Impl4420); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2205:1: rule__ActualEntry__Group_1__3 : rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 ;
    public final void rule__ActualEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2209:1: ( rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2210:2: rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__3__Impl_in_rule__ActualEntry__Group_1__34451);
            rule__ActualEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__4_in_rule__ActualEntry__Group_1__34454);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2217:1: rule__ActualEntry__Group_1__3__Impl : ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) ;
    public final void rule__ActualEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2221:1: ( ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2222:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2222:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2223:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2223:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2224:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2225:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2225:2: rule__ActualEntry__TransactionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4483);
            rule__ActualEntry__TransactionsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 

            }

            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2228:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2229:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2230:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2230:2: rule__ActualEntry__TransactionsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4495);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2241:1: rule__ActualEntry__Group_1__4 : rule__ActualEntry__Group_1__4__Impl ;
    public final void rule__ActualEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2245:1: ( rule__ActualEntry__Group_1__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2246:2: rule__ActualEntry__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__4__Impl_in_rule__ActualEntry__Group_1__44528);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2252:1: rule__ActualEntry__Group_1__4__Impl : ( '}' ) ;
    public final void rule__ActualEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2256:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2257:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2257:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2258:1: '}'
            {
             before(grammarAccess.getActualEntryAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,26,FOLLOW_26_in_rule__ActualEntry__Group_1__4__Impl4556); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2281:1: rule__Transaction__Group_0__0 : rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 ;
    public final void rule__Transaction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2285:1: ( rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2286:2: rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__0__Impl_in_rule__Transaction__Group_0__04597);
            rule__Transaction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__1_in_rule__Transaction__Group_0__04600);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2293:1: rule__Transaction__Group_0__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2297:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2298:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2298:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2299:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCashTransactionAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2300:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2302:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2312:1: rule__Transaction__Group_0__1 : rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 ;
    public final void rule__Transaction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2316:1: ( rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2317:2: rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__1__Impl_in_rule__Transaction__Group_0__14658);
            rule__Transaction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__2_in_rule__Transaction__Group_0__14661);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2324:1: rule__Transaction__Group_0__1__Impl : ( 'cash' ) ;
    public final void rule__Transaction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2328:1: ( ( 'cash' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2329:1: ( 'cash' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2329:1: ( 'cash' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2330:1: 'cash'
            {
             before(grammarAccess.getTransactionAccess().getCashKeyword_0_1()); 
            match(input,37,FOLLOW_37_in_rule__Transaction__Group_0__1__Impl4689); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2343:1: rule__Transaction__Group_0__2 : rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 ;
    public final void rule__Transaction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2347:1: ( rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2348:2: rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__2__Impl_in_rule__Transaction__Group_0__24720);
            rule__Transaction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__3_in_rule__Transaction__Group_0__24723);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2355:1: rule__Transaction__Group_0__2__Impl : ( ( rule__Transaction__AmountAssignment_0_2 ) ) ;
    public final void rule__Transaction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2359:1: ( ( ( rule__Transaction__AmountAssignment_0_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2360:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2360:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2361:1: ( rule__Transaction__AmountAssignment_0_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_0_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2362:1: ( rule__Transaction__AmountAssignment_0_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2362:2: rule__Transaction__AmountAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Transaction__AmountAssignment_0_2_in_rule__Transaction__Group_0__2__Impl4750);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2372:1: rule__Transaction__Group_0__3 : rule__Transaction__Group_0__3__Impl ;
    public final void rule__Transaction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2376:1: ( rule__Transaction__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2377:2: rule__Transaction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__3__Impl_in_rule__Transaction__Group_0__34780);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2383:1: rule__Transaction__Group_0__3__Impl : ( ( rule__Transaction__Group_0_3__0 )? ) ;
    public final void rule__Transaction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2387:1: ( ( ( rule__Transaction__Group_0_3__0 )? ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2388:1: ( ( rule__Transaction__Group_0_3__0 )? )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2388:1: ( ( rule__Transaction__Group_0_3__0 )? )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2389:1: ( rule__Transaction__Group_0_3__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2390:1: ( rule__Transaction__Group_0_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2390:2: rule__Transaction__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_0_3__0_in_rule__Transaction__Group_0__3__Impl4807);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2408:1: rule__Transaction__Group_0_3__0 : rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 ;
    public final void rule__Transaction__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2412:1: ( rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2413:2: rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0_3__0__Impl_in_rule__Transaction__Group_0_3__04846);
            rule__Transaction__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0_3__1_in_rule__Transaction__Group_0_3__04849);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2420:1: rule__Transaction__Group_0_3__0__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2424:1: ( ( 'on' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2425:1: ( 'on' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2425:1: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2426:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_0_3_0()); 
            match(input,38,FOLLOW_38_in_rule__Transaction__Group_0_3__0__Impl4877); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2439:1: rule__Transaction__Group_0_3__1 : rule__Transaction__Group_0_3__1__Impl ;
    public final void rule__Transaction__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2443:1: ( rule__Transaction__Group_0_3__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2444:2: rule__Transaction__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0_3__1__Impl_in_rule__Transaction__Group_0_3__14908);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2450:1: rule__Transaction__Group_0_3__1__Impl : ( ( rule__Transaction__DayAssignment_0_3_1 ) ) ;
    public final void rule__Transaction__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2454:1: ( ( ( rule__Transaction__DayAssignment_0_3_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2455:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2455:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2456:1: ( rule__Transaction__DayAssignment_0_3_1 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_0_3_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2457:1: ( rule__Transaction__DayAssignment_0_3_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2457:2: rule__Transaction__DayAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Transaction__DayAssignment_0_3_1_in_rule__Transaction__Group_0_3__1__Impl4935);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2471:1: rule__Transaction__Group_1__0 : rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 ;
    public final void rule__Transaction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2475:1: ( rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2476:2: rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__04969);
            rule__Transaction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__04972);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2483:1: rule__Transaction__Group_1__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2487:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2488:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2488:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2489:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCardTransactionAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2490:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2492:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2502:1: rule__Transaction__Group_1__1 : rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 ;
    public final void rule__Transaction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2506:1: ( rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2507:2: rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__15030);
            rule__Transaction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__2_in_rule__Transaction__Group_1__15033);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2514:1: rule__Transaction__Group_1__1__Impl : ( 'card' ) ;
    public final void rule__Transaction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2518:1: ( ( 'card' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2519:1: ( 'card' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2519:1: ( 'card' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2520:1: 'card'
            {
             before(grammarAccess.getTransactionAccess().getCardKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__Transaction__Group_1__1__Impl5061); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2533:1: rule__Transaction__Group_1__2 : rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 ;
    public final void rule__Transaction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2537:1: ( rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2538:2: rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__2__Impl_in_rule__Transaction__Group_1__25092);
            rule__Transaction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__3_in_rule__Transaction__Group_1__25095);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2545:1: rule__Transaction__Group_1__2__Impl : ( ( rule__Transaction__AmountAssignment_1_2 ) ) ;
    public final void rule__Transaction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2549:1: ( ( ( rule__Transaction__AmountAssignment_1_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2550:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2550:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2551:1: ( rule__Transaction__AmountAssignment_1_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_1_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2552:1: ( rule__Transaction__AmountAssignment_1_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2552:2: rule__Transaction__AmountAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Transaction__AmountAssignment_1_2_in_rule__Transaction__Group_1__2__Impl5122);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2562:1: rule__Transaction__Group_1__3 : rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 ;
    public final void rule__Transaction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2566:1: ( rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2567:2: rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__3__Impl_in_rule__Transaction__Group_1__35152);
            rule__Transaction__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__4_in_rule__Transaction__Group_1__35155);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2574:1: rule__Transaction__Group_1__3__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2578:1: ( ( 'on' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2579:1: ( 'on' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2579:1: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2580:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_1_3()); 
            match(input,38,FOLLOW_38_in_rule__Transaction__Group_1__3__Impl5183); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2593:1: rule__Transaction__Group_1__4 : rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 ;
    public final void rule__Transaction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2597:1: ( rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2598:2: rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__4__Impl_in_rule__Transaction__Group_1__45214);
            rule__Transaction__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__5_in_rule__Transaction__Group_1__45217);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2605:1: rule__Transaction__Group_1__4__Impl : ( ( rule__Transaction__DayAssignment_1_4 ) ) ;
    public final void rule__Transaction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2609:1: ( ( ( rule__Transaction__DayAssignment_1_4 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2610:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2610:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2611:1: ( rule__Transaction__DayAssignment_1_4 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_1_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2612:1: ( rule__Transaction__DayAssignment_1_4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2612:2: rule__Transaction__DayAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Transaction__DayAssignment_1_4_in_rule__Transaction__Group_1__4__Impl5244);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2622:1: rule__Transaction__Group_1__5 : rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 ;
    public final void rule__Transaction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2626:1: ( rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2627:2: rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__5__Impl_in_rule__Transaction__Group_1__55274);
            rule__Transaction__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__6_in_rule__Transaction__Group_1__55277);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2634:1: rule__Transaction__Group_1__5__Impl : ( 'from' ) ;
    public final void rule__Transaction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2638:1: ( ( 'from' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2639:1: ( 'from' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2639:1: ( 'from' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2640:1: 'from'
            {
             before(grammarAccess.getTransactionAccess().getFromKeyword_1_5()); 
            match(input,40,FOLLOW_40_in_rule__Transaction__Group_1__5__Impl5305); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2653:1: rule__Transaction__Group_1__6 : rule__Transaction__Group_1__6__Impl ;
    public final void rule__Transaction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2657:1: ( rule__Transaction__Group_1__6__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2658:2: rule__Transaction__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__6__Impl_in_rule__Transaction__Group_1__65336);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2664:1: rule__Transaction__Group_1__6__Impl : ( ( rule__Transaction__FromAssignment_1_6 ) ) ;
    public final void rule__Transaction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2668:1: ( ( ( rule__Transaction__FromAssignment_1_6 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2669:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2669:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2670:1: ( rule__Transaction__FromAssignment_1_6 )
            {
             before(grammarAccess.getTransactionAccess().getFromAssignment_1_6()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2671:1: ( rule__Transaction__FromAssignment_1_6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2671:2: rule__Transaction__FromAssignment_1_6
            {
            pushFollow(FOLLOW_rule__Transaction__FromAssignment_1_6_in_rule__Transaction__Group_1__6__Impl5363);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2696:1: rule__Library__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Library__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2700:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2701:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2701:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2702:1: RULE_ID
            {
             before(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Library__NameAssignment_15412); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2711:1: rule__Library__CategoriesAssignment_3 : ( ruleCategory ) ;
    public final void rule__Library__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2715:1: ( ( ruleCategory ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2716:1: ( ruleCategory )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2716:1: ( ruleCategory )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2717:1: ruleCategory
            {
             before(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_35443);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2726:1: rule__Category__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2730:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2731:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2731:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2732:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_0_25474); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2741:1: rule__Category__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2745:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2746:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2746:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2747:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_1_25505); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2756:1: rule__Category__PatternsAssignment_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Category__PatternsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2760:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2761:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2761:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2762:1: RULE_STRING
            {
             before(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_15536); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2771:1: rule__Category__PatternsAssignment_1_3_2_1 : ( RULE_STRING ) ;
    public final void rule__Category__PatternsAssignment_1_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2775:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2776:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2776:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2777:1: RULE_STRING
            {
             before(grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_2_15567); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2786:1: rule__Year__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__Year__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2790:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2791:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2791:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2792:1: RULE_INT
            {
             before(grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Year__NameAssignment_05598); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2801:1: rule__Year__LibraryAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Year__LibraryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2805:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2806:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2806:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2807:1: ( RULE_ID )
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2808:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2809:1: RULE_ID
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_25633); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2820:1: rule__Year__MonthsAssignment_4 : ( ruleMonth ) ;
    public final void rule__Year__MonthsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2824:1: ( ( ruleMonth ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2825:1: ( ruleMonth )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2825:1: ( ruleMonth )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2826:1: ruleMonth
            {
             before(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_45668);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2835:1: rule__Month__NameAssignment_0 : ( ruleMonthEnum ) ;
    public final void rule__Month__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2839:1: ( ( ruleMonthEnum ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2840:1: ( ruleMonthEnum )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2840:1: ( ruleMonthEnum )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2841:1: ruleMonthEnum
            {
             before(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_05699);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2850:1: rule__Month__BudgetEntriesAssignment_3 : ( ruleBudgetEntry ) ;
    public final void rule__Month__BudgetEntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2854:1: ( ( ruleBudgetEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2855:1: ( ruleBudgetEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2855:1: ( ruleBudgetEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2856:1: ruleBudgetEntry
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBudgetEntry_in_rule__Month__BudgetEntriesAssignment_35730);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2865:1: rule__Month__ActualEntriesAssignment_7 : ( ruleActualEntry ) ;
    public final void rule__Month__ActualEntriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2869:1: ( ( ruleActualEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2870:1: ( ruleActualEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2870:1: ( ruleActualEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2871:1: ruleActualEntry
            {
             before(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleActualEntry_in_rule__Month__ActualEntriesAssignment_75761);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2880:1: rule__BudgetEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2884:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2885:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2885:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2886:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2887:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2888:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_0_15796); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2899:1: rule__BudgetEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__BudgetEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2903:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2904:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2904:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2905:1: ruleDollar
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__BudgetEntry__AmountAssignment_0_35831);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2914:1: rule__BudgetEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2918:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2919:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2919:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2920:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2921:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2922:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_1_15866); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2933:1: rule__BudgetEntry__BaseEntryAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__BaseEntryAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2937:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2938:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2938:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2939:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2940:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2941:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__BaseEntryAssignment_1_35905); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2952:1: rule__BudgetEntry__FactorAssignment_1_5 : ( ruleDouble ) ;
    public final void rule__BudgetEntry__FactorAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2956:1: ( ( ruleDouble ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2957:1: ( ruleDouble )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2957:1: ( ruleDouble )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2958:1: ruleDouble
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_ruleDouble_in_rule__BudgetEntry__FactorAssignment_1_55940);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2967:1: rule__ActualEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2971:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2972:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2972:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2973:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2974:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2975:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_0_15975); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2986:1: rule__ActualEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__ActualEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2990:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2991:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2991:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2992:1: ruleDollar
            {
             before(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__ActualEntry__AmountAssignment_0_36010);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3001:1: rule__ActualEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3005:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3006:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3006:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3007:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3008:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3009:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_1_16045); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3020:1: rule__ActualEntry__TransactionsAssignment_1_3 : ( ruleTransaction ) ;
    public final void rule__ActualEntry__TransactionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3024:1: ( ( ruleTransaction ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3025:1: ( ruleTransaction )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3025:1: ( ruleTransaction )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3026:1: ruleTransaction
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__ActualEntry__TransactionsAssignment_1_36080);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3035:1: rule__Transaction__AmountAssignment_0_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3039:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3040:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3040:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3041:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_0_26111);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3050:1: rule__Transaction__DayAssignment_0_3_1 : ( ruleOptionalInt ) ;
    public final void rule__Transaction__DayAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3054:1: ( ( ruleOptionalInt ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3055:1: ( ruleOptionalInt )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3055:1: ( ruleOptionalInt )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3056:1: ruleOptionalInt
            {
             before(grammarAccess.getTransactionAccess().getDayOptionalIntParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_ruleOptionalInt_in_rule__Transaction__DayAssignment_0_3_16142);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3065:1: rule__Transaction__AmountAssignment_1_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3069:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3070:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3070:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3071:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_1_26173);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3080:1: rule__Transaction__DayAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__Transaction__DayAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3084:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3085:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3085:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3086:1: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_1_46204); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3095:1: rule__Transaction__FromAssignment_1_6 : ( RULE_STRING ) ;
    public final void rule__Transaction__FromAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3099:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3100:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3100:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:3101:1: RULE_STRING
            {
             before(grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Transaction__FromAssignment_1_66235); 
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
    public static final BitSet FOLLOW_ruleOptionalInt_in_entryRuleOptionalInt660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalInt667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOptionalInt693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthEnum__Alternatives_in_ruleMonthEnum729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_rule__BudgetingFile__Alternatives764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYear_in_rule__BudgetingFile__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__0_in_rule__Category__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__0_in_rule__Category__Alternatives831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__0_in_rule__BudgetEntry__Alternatives864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__0_in_rule__BudgetEntry__Alternatives882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__0_in_rule__ActualEntry__Alternatives915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__0_in_rule__ActualEntry__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__0_in_rule__Transaction__Alternatives966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Alternatives984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Alternatives1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Double__Alternatives1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MonthEnum__Alternatives1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MonthEnum__Alternatives1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MonthEnum__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MonthEnum__Alternatives1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MonthEnum__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MonthEnum__Alternatives1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MonthEnum__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MonthEnum__Alternatives1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MonthEnum__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MonthEnum__Alternatives1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MonthEnum__Alternatives1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MonthEnum__Alternatives1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01331 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Library__Group__0__Impl1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11393 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21453 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Library__Group__2__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31515 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1545 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Library__Group__4__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__0__Impl_in_rule__Category__Group_0__01645 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Category__Group_0__1_in_rule__Category__Group_0__01648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__1__Impl_in_rule__Category__Group_0__11706 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Category__Group_0__2_in_rule__Category__Group_0__11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Category__Group_0__1__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_0__2__Impl_in_rule__Category__Group_0__21768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_0_2_in_rule__Category__Group_0__2__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__0__Impl_in_rule__Category__Group_1__01831 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1__1_in_rule__Category__Group_1__01834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__1__Impl_in_rule__Category__Group_1__11892 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Category__Group_1__2_in_rule__Category__Group_1__11895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Category__Group_1__1__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__2__Impl_in_rule__Category__Group_1__21954 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1__3_in_rule__Category__Group_1__21957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_1_2_in_rule__Category__Group_1__2__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1__3__Impl_in_rule__Category__Group_1__32014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__0_in_rule__Category__Group_1__3__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__0__Impl_in_rule__Category__Group_1_3__02080 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__1_in_rule__Category__Group_1_3__02083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Category__Group_1_3__0__Impl2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__1__Impl_in_rule__Category__Group_1_3__12142 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__2_in_rule__Category__Group_1_3__12145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__PatternsAssignment_1_3_1_in_rule__Category__Group_1_3__1__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__2__Impl_in_rule__Category__Group_1_3__22202 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__3_in_rule__Category__Group_1_3__22205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__0_in_rule__Category__Group_1_3__2__Impl2232 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3__3__Impl_in_rule__Category__Group_1_3__32263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Category__Group_1_3__3__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__0__Impl_in_rule__Category__Group_1_3_2__02330 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__1_in_rule__Category__Group_1_3_2__02333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Category__Group_1_3_2__0__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group_1_3_2__1__Impl_in_rule__Category__Group_1_3_2__12392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__PatternsAssignment_1_3_2_1_in_rule__Category__Group_1_3_2__1__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__02453 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Year__Group__1_in_rule__Year__Group__02456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__12513 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Year__Group__2_in_rule__Year__Group__12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Year__Group__1__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__22575 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Year__Group__3_in_rule__Year__Group__22578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__32635 = new BitSet(new long[]{0x0000000004FFF000L});
    public static final BitSet FOLLOW_rule__Year__Group__4_in_rule__Year__Group__32638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Year__Group__3__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__42697 = new BitSet(new long[]{0x0000000004FFF000L});
    public static final BitSet FOLLOW_rule__Year__Group__5_in_rule__Year__Group__42700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl2727 = new BitSet(new long[]{0x0000000000FFF002L});
    public static final BitSet FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__52758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Year__Group__5__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__02829 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Month__Group__1_in_rule__Month__Group__02832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__12889 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Month__Group__2_in_rule__Month__Group__12892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Month__Group__1__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__22951 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__3_in_rule__Month__Group__22954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Month__Group__2__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__33013 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__4_in_rule__Month__Group__33016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl3043 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__43074 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Month__Group__5_in_rule__Month__Group__43077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__4__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__53136 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Month__Group__6_in_rule__Month__Group__53139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Month__Group__5__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__63198 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__7_in_rule__Month__Group__63201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Month__Group__6__Impl3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__73260 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rule__Month__Group__8_in_rule__Month__Group__73263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl3290 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__83321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__8__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__0__Impl_in_rule__BudgetEntry__Group_0__03398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__1_in_rule__BudgetEntry__Group_0__03401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__1__Impl_in_rule__BudgetEntry__Group_0__13459 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__2_in_rule__BudgetEntry__Group_0__13462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__CategoryAssignment_0_1_in_rule__BudgetEntry__Group_0__1__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__2__Impl_in_rule__BudgetEntry__Group_0__23519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__3_in_rule__BudgetEntry__Group_0__23522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BudgetEntry__Group_0__2__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__3__Impl_in_rule__BudgetEntry__Group_0__33581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__AmountAssignment_0_3_in_rule__BudgetEntry__Group_0__3__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__0__Impl_in_rule__BudgetEntry__Group_1__03646 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__1_in_rule__BudgetEntry__Group_1__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__1__Impl_in_rule__BudgetEntry__Group_1__13707 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__2_in_rule__BudgetEntry__Group_1__13710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__CategoryAssignment_1_1_in_rule__BudgetEntry__Group_1__1__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__2__Impl_in_rule__BudgetEntry__Group_1__23767 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__3_in_rule__BudgetEntry__Group_1__23770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BudgetEntry__Group_1__2__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__3__Impl_in_rule__BudgetEntry__Group_1__33829 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__4_in_rule__BudgetEntry__Group_1__33832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__BaseEntryAssignment_1_3_in_rule__BudgetEntry__Group_1__3__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__4__Impl_in_rule__BudgetEntry__Group_1__43889 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__5_in_rule__BudgetEntry__Group_1__43892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BudgetEntry__Group_1__4__Impl3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__5__Impl_in_rule__BudgetEntry__Group_1__53951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__FactorAssignment_1_5_in_rule__BudgetEntry__Group_1__5__Impl3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__0__Impl_in_rule__ActualEntry__Group_0__04020 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__1_in_rule__ActualEntry__Group_0__04023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__1__Impl_in_rule__ActualEntry__Group_0__14081 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__2_in_rule__ActualEntry__Group_0__14084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__CategoryAssignment_0_1_in_rule__ActualEntry__Group_0__1__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__2__Impl_in_rule__ActualEntry__Group_0__24141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__3_in_rule__ActualEntry__Group_0__24144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ActualEntry__Group_0__2__Impl4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__3__Impl_in_rule__ActualEntry__Group_0__34203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__AmountAssignment_0_3_in_rule__ActualEntry__Group_0__3__Impl4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__0__Impl_in_rule__ActualEntry__Group_1__04268 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__1_in_rule__ActualEntry__Group_1__04271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__1__Impl_in_rule__ActualEntry__Group_1__14329 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__2_in_rule__ActualEntry__Group_1__14332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__CategoryAssignment_1_1_in_rule__ActualEntry__Group_1__1__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__2__Impl_in_rule__ActualEntry__Group_1__24389 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__3_in_rule__ActualEntry__Group_1__24392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActualEntry__Group_1__2__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__3__Impl_in_rule__ActualEntry__Group_1__34451 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__4_in_rule__ActualEntry__Group_1__34454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4483 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl4495 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__4__Impl_in_rule__ActualEntry__Group_1__44528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ActualEntry__Group_1__4__Impl4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__0__Impl_in_rule__Transaction__Group_0__04597 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__1_in_rule__Transaction__Group_0__04600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__1__Impl_in_rule__Transaction__Group_0__14658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__2_in_rule__Transaction__Group_0__14661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Transaction__Group_0__1__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__2__Impl_in_rule__Transaction__Group_0__24720 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__3_in_rule__Transaction__Group_0__24723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AmountAssignment_0_2_in_rule__Transaction__Group_0__2__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__3__Impl_in_rule__Transaction__Group_0__34780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__0_in_rule__Transaction__Group_0__3__Impl4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__0__Impl_in_rule__Transaction__Group_0_3__04846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__1_in_rule__Transaction__Group_0_3__04849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Transaction__Group_0_3__0__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__1__Impl_in_rule__Transaction__Group_0_3__14908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__DayAssignment_0_3_1_in_rule__Transaction__Group_0_3__1__Impl4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__04969 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__04972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__15030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__2_in_rule__Transaction__Group_1__15033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Transaction__Group_1__1__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__2__Impl_in_rule__Transaction__Group_1__25092 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__3_in_rule__Transaction__Group_1__25095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AmountAssignment_1_2_in_rule__Transaction__Group_1__2__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__3__Impl_in_rule__Transaction__Group_1__35152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__4_in_rule__Transaction__Group_1__35155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Transaction__Group_1__3__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__4__Impl_in_rule__Transaction__Group_1__45214 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__5_in_rule__Transaction__Group_1__45217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__DayAssignment_1_4_in_rule__Transaction__Group_1__4__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__5__Impl_in_rule__Transaction__Group_1__55274 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__6_in_rule__Transaction__Group_1__55277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Transaction__Group_1__5__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__6__Impl_in_rule__Transaction__Group_1__65336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__FromAssignment_1_6_in_rule__Transaction__Group_1__6__Impl5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Library__NameAssignment_15412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_35443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_0_25474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_1_25505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_15536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Category__PatternsAssignment_1_3_2_15567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Year__NameAssignment_05598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_25633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_45668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_05699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBudgetEntry_in_rule__Month__BudgetEntriesAssignment_35730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualEntry_in_rule__Month__ActualEntriesAssignment_75761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_0_15796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__BudgetEntry__AmountAssignment_0_35831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_1_15866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__BaseEntryAssignment_1_35905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__BudgetEntry__FactorAssignment_1_55940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_0_15975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__ActualEntry__AmountAssignment_0_36010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_1_16045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__ActualEntry__TransactionsAssignment_1_36080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_0_26111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalInt_in_rule__Transaction__DayAssignment_0_3_16142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_1_26173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_1_46204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Transaction__FromAssignment_1_66235 = new BitSet(new long[]{0x0000000000000002L});

}