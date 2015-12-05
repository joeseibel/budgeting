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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECIMAL", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'expense'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'", "'library'", "'{'", "'}'", "'uses'", "'budget'", "'actual'", "':'", "'*'", "'cash'", "'on'", "'card'", "'from'", "'income'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:125:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:129:2: ( ( ( rule__Category__Group__0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:130:1: ( ( rule__Category__Group__0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:130:1: ( ( rule__Category__Group__0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:131:1: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:132:1: ( rule__Category__Group__0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:132:2: rule__Category__Group__0
            {
            pushFollow(FOLLOW_rule__Category__Group__0_in_ruleCategory214);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

            }


            }

        }
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

            if ( (LA1_0==25) ) {
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


    // $ANTLR start "rule__Category__Alternatives_0"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:383:1: rule__Category__Alternatives_0 : ( ( ( rule__Category__IncomeAssignment_0_0 ) ) | ( 'expense' ) );
    public final void rule__Category__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:387:1: ( ( ( rule__Category__IncomeAssignment_0_0 ) ) | ( 'expense' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==37) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:388:1: ( ( rule__Category__IncomeAssignment_0_0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:388:1: ( ( rule__Category__IncomeAssignment_0_0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:389:1: ( rule__Category__IncomeAssignment_0_0 )
                    {
                     before(grammarAccess.getCategoryAccess().getIncomeAssignment_0_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:390:1: ( rule__Category__IncomeAssignment_0_0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:390:2: rule__Category__IncomeAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Category__IncomeAssignment_0_0_in_rule__Category__Alternatives_0756);
                    rule__Category__IncomeAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCategoryAccess().getIncomeAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:394:6: ( 'expense' )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:394:6: ( 'expense' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:395:1: 'expense'
                    {
                     before(grammarAccess.getCategoryAccess().getExpenseKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Category__Alternatives_0775); 
                     after(grammarAccess.getCategoryAccess().getExpenseKeyword_0_1()); 

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
    // $ANTLR end "rule__Category__Alternatives_0"


    // $ANTLR start "rule__BudgetEntry__Alternatives"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:407:1: rule__BudgetEntry__Alternatives : ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) );
    public final void rule__BudgetEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:411:1: ( ( ( rule__BudgetEntry__Group_0__0 ) ) | ( ( rule__BudgetEntry__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==31) ) {
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:412:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:412:1: ( ( rule__BudgetEntry__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:413:1: ( rule__BudgetEntry__Group_0__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:414:1: ( rule__BudgetEntry__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:414:2: rule__BudgetEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BudgetEntry__Group_0__0_in_rule__BudgetEntry__Alternatives809);
                    rule__BudgetEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBudgetEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:418:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:418:6: ( ( rule__BudgetEntry__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:419:1: ( rule__BudgetEntry__Group_1__0 )
                    {
                     before(grammarAccess.getBudgetEntryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:420:1: ( rule__BudgetEntry__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:420:2: rule__BudgetEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BudgetEntry__Group_1__0_in_rule__BudgetEntry__Alternatives827);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:429:1: rule__ActualEntry__Alternatives : ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) );
    public final void rule__ActualEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:433:1: ( ( ( rule__ActualEntry__Group_0__0 ) ) | ( ( rule__ActualEntry__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==26) ) {
                    alt4=2;
                }
                else if ( (LA4_1==31) ) {
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:434:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:434:1: ( ( rule__ActualEntry__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:435:1: ( rule__ActualEntry__Group_0__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:436:1: ( rule__ActualEntry__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:436:2: rule__ActualEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualEntry__Group_0__0_in_rule__ActualEntry__Alternatives860);
                    rule__ActualEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActualEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:440:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:440:6: ( ( rule__ActualEntry__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:441:1: ( rule__ActualEntry__Group_1__0 )
                    {
                     before(grammarAccess.getActualEntryAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:442:1: ( rule__ActualEntry__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:442:2: rule__ActualEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ActualEntry__Group_1__0_in_rule__ActualEntry__Alternatives878);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:451:1: rule__Transaction__Alternatives : ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) );
    public final void rule__Transaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:455:1: ( ( ( rule__Transaction__Group_0__0 ) ) | ( ( rule__Transaction__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==35) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:456:1: ( ( rule__Transaction__Group_0__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:456:1: ( ( rule__Transaction__Group_0__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:457:1: ( rule__Transaction__Group_0__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:458:1: ( rule__Transaction__Group_0__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:458:2: rule__Transaction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_0__0_in_rule__Transaction__Alternatives911);
                    rule__Transaction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:462:6: ( ( rule__Transaction__Group_1__0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:462:6: ( ( rule__Transaction__Group_1__0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:463:1: ( rule__Transaction__Group_1__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:464:1: ( rule__Transaction__Group_1__0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:464:2: rule__Transaction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Alternatives929);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:473:1: rule__Double__Alternatives : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Double__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:477:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:478:1: ( RULE_INT )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:478:1: ( RULE_INT )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:479:1: RULE_INT
                    {
                     before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Alternatives962); 
                     after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:484:6: ( RULE_DECIMAL )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:484:6: ( RULE_DECIMAL )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:485:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getDoubleAccess().getDECIMALTerminalRuleCall_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Double__Alternatives979); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:495:1: rule__MonthEnum__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__MonthEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:499:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
                }
                break;
            case 19:
                {
                alt7=7;
                }
                break;
            case 20:
                {
                alt7=8;
                }
                break;
            case 21:
                {
                alt7=9;
                }
                break;
            case 22:
                {
                alt7=10;
                }
                break;
            case 23:
                {
                alt7=11;
                }
                break;
            case 24:
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:500:1: ( ( 'january' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:500:1: ( ( 'january' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:501:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:502:1: ( 'january' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:502:3: 'january'
                    {
                    match(input,13,FOLLOW_13_in_rule__MonthEnum__Alternatives1012); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:507:6: ( ( 'february' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:507:6: ( ( 'february' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:508:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:509:1: ( 'february' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:509:3: 'february'
                    {
                    match(input,14,FOLLOW_14_in_rule__MonthEnum__Alternatives1033); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:514:6: ( ( 'march' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:514:6: ( ( 'march' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:515:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:516:1: ( 'march' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:516:3: 'march'
                    {
                    match(input,15,FOLLOW_15_in_rule__MonthEnum__Alternatives1054); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:521:6: ( ( 'april' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:521:6: ( ( 'april' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:522:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:523:1: ( 'april' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:523:3: 'april'
                    {
                    match(input,16,FOLLOW_16_in_rule__MonthEnum__Alternatives1075); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:528:6: ( ( 'may' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:528:6: ( ( 'may' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:529:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:530:1: ( 'may' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:530:3: 'may'
                    {
                    match(input,17,FOLLOW_17_in_rule__MonthEnum__Alternatives1096); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:535:6: ( ( 'june' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:535:6: ( ( 'june' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:536:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:537:1: ( 'june' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:537:3: 'june'
                    {
                    match(input,18,FOLLOW_18_in_rule__MonthEnum__Alternatives1117); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:542:6: ( ( 'july' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:542:6: ( ( 'july' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:543:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:544:1: ( 'july' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:544:3: 'july'
                    {
                    match(input,19,FOLLOW_19_in_rule__MonthEnum__Alternatives1138); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:549:6: ( ( 'august' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:549:6: ( ( 'august' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:550:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:551:1: ( 'august' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:551:3: 'august'
                    {
                    match(input,20,FOLLOW_20_in_rule__MonthEnum__Alternatives1159); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:556:6: ( ( 'september' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:556:6: ( ( 'september' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:557:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:558:1: ( 'september' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:558:3: 'september'
                    {
                    match(input,21,FOLLOW_21_in_rule__MonthEnum__Alternatives1180); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:563:6: ( ( 'october' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:563:6: ( ( 'october' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:564:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:565:1: ( 'october' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:565:3: 'october'
                    {
                    match(input,22,FOLLOW_22_in_rule__MonthEnum__Alternatives1201); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:570:6: ( ( 'november' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:570:6: ( ( 'november' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:571:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:572:1: ( 'november' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:572:3: 'november'
                    {
                    match(input,23,FOLLOW_23_in_rule__MonthEnum__Alternatives1222); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:577:6: ( ( 'december' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:577:6: ( ( 'december' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:578:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:579:1: ( 'december' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:579:3: 'december'
                    {
                    match(input,24,FOLLOW_24_in_rule__MonthEnum__Alternatives1243); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:591:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:595:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:596:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01276);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01279);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:603:1: rule__Library__Group__0__Impl : ( 'library' ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:607:1: ( ( 'library' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:608:1: ( 'library' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:608:1: ( 'library' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:609:1: 'library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Library__Group__0__Impl1307); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:622:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:626:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:627:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11338);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11341);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:634:1: rule__Library__Group__1__Impl : ( ( rule__Library__NameAssignment_1 ) ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:638:1: ( ( ( rule__Library__NameAssignment_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:639:1: ( ( rule__Library__NameAssignment_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:639:1: ( ( rule__Library__NameAssignment_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:640:1: ( rule__Library__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:641:1: ( rule__Library__NameAssignment_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:641:2: rule__Library__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1368);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:651:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:655:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:656:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21398);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21401);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:663:1: rule__Library__Group__2__Impl : ( '{' ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:667:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:668:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:668:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:669:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Library__Group__2__Impl1429); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:682:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:686:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:687:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31460);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31463);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:694:1: rule__Library__Group__3__Impl : ( ( rule__Library__CategoriesAssignment_3 )* ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:698:1: ( ( ( rule__Library__CategoriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:699:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:699:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:700:1: ( rule__Library__CategoriesAssignment_3 )*
            {
             before(grammarAccess.getLibraryAccess().getCategoriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:701:1: ( rule__Library__CategoriesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12||LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:701:2: rule__Library__CategoriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1490);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:711:1: rule__Library__Group__4 : rule__Library__Group__4__Impl ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:715:1: ( rule__Library__Group__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:716:2: rule__Library__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41521);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:722:1: rule__Library__Group__4__Impl : ( '}' ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:726:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:727:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:727:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:728:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Library__Group__4__Impl1549); 
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


    // $ANTLR start "rule__Category__Group__0"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:751:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:755:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:756:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__01590);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__1_in_rule__Category__Group__01593);
            rule__Category__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:763:1: rule__Category__Group__0__Impl : ( ( rule__Category__Alternatives_0 ) ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:767:1: ( ( ( rule__Category__Alternatives_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:768:1: ( ( rule__Category__Alternatives_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:768:1: ( ( rule__Category__Alternatives_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:769:1: ( rule__Category__Alternatives_0 )
            {
             before(grammarAccess.getCategoryAccess().getAlternatives_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:770:1: ( rule__Category__Alternatives_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:770:2: rule__Category__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Category__Alternatives_0_in_rule__Category__Group__0__Impl1620);
            rule__Category__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:780:1: rule__Category__Group__1 : rule__Category__Group__1__Impl ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:784:1: ( rule__Category__Group__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:785:2: rule__Category__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__11650);
            rule__Category__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:791:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:795:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:796:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:796:1: ( ( rule__Category__NameAssignment_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:797:1: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:798:1: ( rule__Category__NameAssignment_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:798:2: rule__Category__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_1_in_rule__Category__Group__1__Impl1677);
            rule__Category__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Year__Group__0"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:812:1: rule__Year__Group__0 : rule__Year__Group__0__Impl rule__Year__Group__1 ;
    public final void rule__Year__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:816:1: ( rule__Year__Group__0__Impl rule__Year__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:817:2: rule__Year__Group__0__Impl rule__Year__Group__1
            {
            pushFollow(FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__01711);
            rule__Year__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__1_in_rule__Year__Group__01714);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:824:1: rule__Year__Group__0__Impl : ( ( rule__Year__NameAssignment_0 ) ) ;
    public final void rule__Year__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:828:1: ( ( ( rule__Year__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:829:1: ( ( rule__Year__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:829:1: ( ( rule__Year__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:830:1: ( rule__Year__NameAssignment_0 )
            {
             before(grammarAccess.getYearAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:831:1: ( rule__Year__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:831:2: rule__Year__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl1741);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:841:1: rule__Year__Group__1 : rule__Year__Group__1__Impl rule__Year__Group__2 ;
    public final void rule__Year__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:845:1: ( rule__Year__Group__1__Impl rule__Year__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:846:2: rule__Year__Group__1__Impl rule__Year__Group__2
            {
            pushFollow(FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__11771);
            rule__Year__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__2_in_rule__Year__Group__11774);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:853:1: rule__Year__Group__1__Impl : ( 'uses' ) ;
    public final void rule__Year__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:857:1: ( ( 'uses' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:858:1: ( 'uses' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:858:1: ( 'uses' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:859:1: 'uses'
            {
             before(grammarAccess.getYearAccess().getUsesKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Year__Group__1__Impl1802); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:872:1: rule__Year__Group__2 : rule__Year__Group__2__Impl rule__Year__Group__3 ;
    public final void rule__Year__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:876:1: ( rule__Year__Group__2__Impl rule__Year__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:877:2: rule__Year__Group__2__Impl rule__Year__Group__3
            {
            pushFollow(FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__21833);
            rule__Year__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__3_in_rule__Year__Group__21836);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:884:1: rule__Year__Group__2__Impl : ( ( rule__Year__LibraryAssignment_2 ) ) ;
    public final void rule__Year__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:888:1: ( ( ( rule__Year__LibraryAssignment_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:889:1: ( ( rule__Year__LibraryAssignment_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:889:1: ( ( rule__Year__LibraryAssignment_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:890:1: ( rule__Year__LibraryAssignment_2 )
            {
             before(grammarAccess.getYearAccess().getLibraryAssignment_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:891:1: ( rule__Year__LibraryAssignment_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:891:2: rule__Year__LibraryAssignment_2
            {
            pushFollow(FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl1863);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:901:1: rule__Year__Group__3 : rule__Year__Group__3__Impl rule__Year__Group__4 ;
    public final void rule__Year__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:905:1: ( rule__Year__Group__3__Impl rule__Year__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:906:2: rule__Year__Group__3__Impl rule__Year__Group__4
            {
            pushFollow(FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__31893);
            rule__Year__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__4_in_rule__Year__Group__31896);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:913:1: rule__Year__Group__3__Impl : ( '{' ) ;
    public final void rule__Year__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:917:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:918:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:918:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:919:1: '{'
            {
             before(grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Year__Group__3__Impl1924); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:932:1: rule__Year__Group__4 : rule__Year__Group__4__Impl rule__Year__Group__5 ;
    public final void rule__Year__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:936:1: ( rule__Year__Group__4__Impl rule__Year__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:937:2: rule__Year__Group__4__Impl rule__Year__Group__5
            {
            pushFollow(FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__41955);
            rule__Year__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__5_in_rule__Year__Group__41958);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:944:1: rule__Year__Group__4__Impl : ( ( rule__Year__MonthsAssignment_4 )* ) ;
    public final void rule__Year__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:948:1: ( ( ( rule__Year__MonthsAssignment_4 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:949:1: ( ( rule__Year__MonthsAssignment_4 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:949:1: ( ( rule__Year__MonthsAssignment_4 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:950:1: ( rule__Year__MonthsAssignment_4 )*
            {
             before(grammarAccess.getYearAccess().getMonthsAssignment_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:951:1: ( rule__Year__MonthsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:951:2: rule__Year__MonthsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl1985);
            	    rule__Year__MonthsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:961:1: rule__Year__Group__5 : rule__Year__Group__5__Impl ;
    public final void rule__Year__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:965:1: ( rule__Year__Group__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:966:2: rule__Year__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__52016);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:972:1: rule__Year__Group__5__Impl : ( '}' ) ;
    public final void rule__Year__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:976:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:977:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:977:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:978:1: '}'
            {
             before(grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Year__Group__5__Impl2044); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1003:1: rule__Month__Group__0 : rule__Month__Group__0__Impl rule__Month__Group__1 ;
    public final void rule__Month__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1007:1: ( rule__Month__Group__0__Impl rule__Month__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1008:2: rule__Month__Group__0__Impl rule__Month__Group__1
            {
            pushFollow(FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__02087);
            rule__Month__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__1_in_rule__Month__Group__02090);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1015:1: rule__Month__Group__0__Impl : ( ( rule__Month__NameAssignment_0 ) ) ;
    public final void rule__Month__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1019:1: ( ( ( rule__Month__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1020:1: ( ( rule__Month__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1020:1: ( ( rule__Month__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1021:1: ( rule__Month__NameAssignment_0 )
            {
             before(grammarAccess.getMonthAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1022:1: ( rule__Month__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1022:2: rule__Month__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl2117);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1032:1: rule__Month__Group__1 : rule__Month__Group__1__Impl rule__Month__Group__2 ;
    public final void rule__Month__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1036:1: ( rule__Month__Group__1__Impl rule__Month__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1037:2: rule__Month__Group__1__Impl rule__Month__Group__2
            {
            pushFollow(FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__12147);
            rule__Month__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__2_in_rule__Month__Group__12150);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1044:1: rule__Month__Group__1__Impl : ( 'budget' ) ;
    public final void rule__Month__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1048:1: ( ( 'budget' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1049:1: ( 'budget' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1049:1: ( 'budget' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1050:1: 'budget'
            {
             before(grammarAccess.getMonthAccess().getBudgetKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Month__Group__1__Impl2178); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1063:1: rule__Month__Group__2 : rule__Month__Group__2__Impl rule__Month__Group__3 ;
    public final void rule__Month__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1067:1: ( rule__Month__Group__2__Impl rule__Month__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1068:2: rule__Month__Group__2__Impl rule__Month__Group__3
            {
            pushFollow(FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__22209);
            rule__Month__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__3_in_rule__Month__Group__22212);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1075:1: rule__Month__Group__2__Impl : ( '{' ) ;
    public final void rule__Month__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1079:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1080:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1080:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1081:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__2__Impl2240); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1094:1: rule__Month__Group__3 : rule__Month__Group__3__Impl rule__Month__Group__4 ;
    public final void rule__Month__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1098:1: ( rule__Month__Group__3__Impl rule__Month__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1099:2: rule__Month__Group__3__Impl rule__Month__Group__4
            {
            pushFollow(FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__32271);
            rule__Month__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__4_in_rule__Month__Group__32274);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1106:1: rule__Month__Group__3__Impl : ( ( rule__Month__BudgetEntriesAssignment_3 )* ) ;
    public final void rule__Month__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1110:1: ( ( ( rule__Month__BudgetEntriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1111:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1111:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1112:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1113:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1113:2: rule__Month__BudgetEntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl2301);
            	    rule__Month__BudgetEntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1123:1: rule__Month__Group__4 : rule__Month__Group__4__Impl rule__Month__Group__5 ;
    public final void rule__Month__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1127:1: ( rule__Month__Group__4__Impl rule__Month__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1128:2: rule__Month__Group__4__Impl rule__Month__Group__5
            {
            pushFollow(FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__42332);
            rule__Month__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__5_in_rule__Month__Group__42335);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1135:1: rule__Month__Group__4__Impl : ( '}' ) ;
    public final void rule__Month__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1139:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1140:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1140:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1141:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Month__Group__4__Impl2363); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1154:1: rule__Month__Group__5 : rule__Month__Group__5__Impl rule__Month__Group__6 ;
    public final void rule__Month__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1158:1: ( rule__Month__Group__5__Impl rule__Month__Group__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1159:2: rule__Month__Group__5__Impl rule__Month__Group__6
            {
            pushFollow(FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__52394);
            rule__Month__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__6_in_rule__Month__Group__52397);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1166:1: rule__Month__Group__5__Impl : ( 'actual' ) ;
    public final void rule__Month__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1170:1: ( ( 'actual' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1171:1: ( 'actual' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1171:1: ( 'actual' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1172:1: 'actual'
            {
             before(grammarAccess.getMonthAccess().getActualKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Month__Group__5__Impl2425); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1185:1: rule__Month__Group__6 : rule__Month__Group__6__Impl rule__Month__Group__7 ;
    public final void rule__Month__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1189:1: ( rule__Month__Group__6__Impl rule__Month__Group__7 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1190:2: rule__Month__Group__6__Impl rule__Month__Group__7
            {
            pushFollow(FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__62456);
            rule__Month__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__7_in_rule__Month__Group__62459);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1197:1: rule__Month__Group__6__Impl : ( '{' ) ;
    public final void rule__Month__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1201:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1202:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1202:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1203:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__6__Impl2487); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1216:1: rule__Month__Group__7 : rule__Month__Group__7__Impl rule__Month__Group__8 ;
    public final void rule__Month__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1220:1: ( rule__Month__Group__7__Impl rule__Month__Group__8 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1221:2: rule__Month__Group__7__Impl rule__Month__Group__8
            {
            pushFollow(FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__72518);
            rule__Month__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__8_in_rule__Month__Group__72521);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1228:1: rule__Month__Group__7__Impl : ( ( rule__Month__ActualEntriesAssignment_7 )* ) ;
    public final void rule__Month__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1232:1: ( ( ( rule__Month__ActualEntriesAssignment_7 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1233:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1233:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1234:1: ( rule__Month__ActualEntriesAssignment_7 )*
            {
             before(grammarAccess.getMonthAccess().getActualEntriesAssignment_7()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1235:1: ( rule__Month__ActualEntriesAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1235:2: rule__Month__ActualEntriesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl2548);
            	    rule__Month__ActualEntriesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1245:1: rule__Month__Group__8 : rule__Month__Group__8__Impl ;
    public final void rule__Month__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1249:1: ( rule__Month__Group__8__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1250:2: rule__Month__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__82579);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1256:1: rule__Month__Group__8__Impl : ( '}' ) ;
    public final void rule__Month__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1260:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1261:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1261:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1262:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__Month__Group__8__Impl2607); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1293:1: rule__BudgetEntry__Group_0__0 : rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 ;
    public final void rule__BudgetEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1297:1: ( rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1298:2: rule__BudgetEntry__Group_0__0__Impl rule__BudgetEntry__Group_0__1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__0__Impl_in_rule__BudgetEntry__Group_0__02656);
            rule__BudgetEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__1_in_rule__BudgetEntry__Group_0__02659);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1305:1: rule__BudgetEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1309:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1310:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1310:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1311:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1312:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1314:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1324:1: rule__BudgetEntry__Group_0__1 : rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 ;
    public final void rule__BudgetEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1328:1: ( rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1329:2: rule__BudgetEntry__Group_0__1__Impl rule__BudgetEntry__Group_0__2
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__1__Impl_in_rule__BudgetEntry__Group_0__12717);
            rule__BudgetEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__2_in_rule__BudgetEntry__Group_0__12720);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1336:1: rule__BudgetEntry__Group_0__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__BudgetEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1340:1: ( ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1341:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1341:1: ( ( rule__BudgetEntry__CategoryAssignment_0_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1342:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_0_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1343:1: ( rule__BudgetEntry__CategoryAssignment_0_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1343:2: rule__BudgetEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__CategoryAssignment_0_1_in_rule__BudgetEntry__Group_0__1__Impl2747);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1353:1: rule__BudgetEntry__Group_0__2 : rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 ;
    public final void rule__BudgetEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1357:1: ( rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1358:2: rule__BudgetEntry__Group_0__2__Impl rule__BudgetEntry__Group_0__3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__2__Impl_in_rule__BudgetEntry__Group_0__22777);
            rule__BudgetEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__3_in_rule__BudgetEntry__Group_0__22780);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1365:1: rule__BudgetEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1369:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1370:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1370:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1371:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__BudgetEntry__Group_0__2__Impl2808); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1384:1: rule__BudgetEntry__Group_0__3 : rule__BudgetEntry__Group_0__3__Impl ;
    public final void rule__BudgetEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1388:1: ( rule__BudgetEntry__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1389:2: rule__BudgetEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_0__3__Impl_in_rule__BudgetEntry__Group_0__32839);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1395:1: rule__BudgetEntry__Group_0__3__Impl : ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__BudgetEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1399:1: ( ( ( rule__BudgetEntry__AmountAssignment_0_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1400:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1400:1: ( ( rule__BudgetEntry__AmountAssignment_0_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1401:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountAssignment_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1402:1: ( rule__BudgetEntry__AmountAssignment_0_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1402:2: rule__BudgetEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__AmountAssignment_0_3_in_rule__BudgetEntry__Group_0__3__Impl2866);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1420:1: rule__BudgetEntry__Group_1__0 : rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 ;
    public final void rule__BudgetEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1424:1: ( rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1425:2: rule__BudgetEntry__Group_1__0__Impl rule__BudgetEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__0__Impl_in_rule__BudgetEntry__Group_1__02904);
            rule__BudgetEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__1_in_rule__BudgetEntry__Group_1__02907);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1432:1: rule__BudgetEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__BudgetEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1436:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1437:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1437:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1438:1: ()
            {
             before(grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1439:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1441:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1451:1: rule__BudgetEntry__Group_1__1 : rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 ;
    public final void rule__BudgetEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1455:1: ( rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1456:2: rule__BudgetEntry__Group_1__1__Impl rule__BudgetEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__1__Impl_in_rule__BudgetEntry__Group_1__12965);
            rule__BudgetEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__2_in_rule__BudgetEntry__Group_1__12968);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1463:1: rule__BudgetEntry__Group_1__1__Impl : ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__BudgetEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1467:1: ( ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1468:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1468:1: ( ( rule__BudgetEntry__CategoryAssignment_1_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1469:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryAssignment_1_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1470:1: ( rule__BudgetEntry__CategoryAssignment_1_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1470:2: rule__BudgetEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BudgetEntry__CategoryAssignment_1_1_in_rule__BudgetEntry__Group_1__1__Impl2995);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1480:1: rule__BudgetEntry__Group_1__2 : rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 ;
    public final void rule__BudgetEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1484:1: ( rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1485:2: rule__BudgetEntry__Group_1__2__Impl rule__BudgetEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__2__Impl_in_rule__BudgetEntry__Group_1__23025);
            rule__BudgetEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__3_in_rule__BudgetEntry__Group_1__23028);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1492:1: rule__BudgetEntry__Group_1__2__Impl : ( ':' ) ;
    public final void rule__BudgetEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1496:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1497:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1497:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1498:1: ':'
            {
             before(grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2()); 
            match(input,31,FOLLOW_31_in_rule__BudgetEntry__Group_1__2__Impl3056); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1511:1: rule__BudgetEntry__Group_1__3 : rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 ;
    public final void rule__BudgetEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1515:1: ( rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1516:2: rule__BudgetEntry__Group_1__3__Impl rule__BudgetEntry__Group_1__4
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__3__Impl_in_rule__BudgetEntry__Group_1__33087);
            rule__BudgetEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__4_in_rule__BudgetEntry__Group_1__33090);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1523:1: rule__BudgetEntry__Group_1__3__Impl : ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) ;
    public final void rule__BudgetEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1527:1: ( ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1528:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1528:1: ( ( rule__BudgetEntry__BaseEntryAssignment_1_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1529:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1530:1: ( rule__BudgetEntry__BaseEntryAssignment_1_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1530:2: rule__BudgetEntry__BaseEntryAssignment_1_3
            {
            pushFollow(FOLLOW_rule__BudgetEntry__BaseEntryAssignment_1_3_in_rule__BudgetEntry__Group_1__3__Impl3117);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1540:1: rule__BudgetEntry__Group_1__4 : rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 ;
    public final void rule__BudgetEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1544:1: ( rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1545:2: rule__BudgetEntry__Group_1__4__Impl rule__BudgetEntry__Group_1__5
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__4__Impl_in_rule__BudgetEntry__Group_1__43147);
            rule__BudgetEntry__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__5_in_rule__BudgetEntry__Group_1__43150);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1552:1: rule__BudgetEntry__Group_1__4__Impl : ( '*' ) ;
    public final void rule__BudgetEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1556:1: ( ( '*' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1557:1: ( '*' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1557:1: ( '*' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1558:1: '*'
            {
             before(grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4()); 
            match(input,32,FOLLOW_32_in_rule__BudgetEntry__Group_1__4__Impl3178); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1571:1: rule__BudgetEntry__Group_1__5 : rule__BudgetEntry__Group_1__5__Impl ;
    public final void rule__BudgetEntry__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1575:1: ( rule__BudgetEntry__Group_1__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1576:2: rule__BudgetEntry__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__BudgetEntry__Group_1__5__Impl_in_rule__BudgetEntry__Group_1__53209);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1582:1: rule__BudgetEntry__Group_1__5__Impl : ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) ;
    public final void rule__BudgetEntry__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1586:1: ( ( ( rule__BudgetEntry__FactorAssignment_1_5 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1587:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1587:1: ( ( rule__BudgetEntry__FactorAssignment_1_5 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1588:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorAssignment_1_5()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1589:1: ( rule__BudgetEntry__FactorAssignment_1_5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1589:2: rule__BudgetEntry__FactorAssignment_1_5
            {
            pushFollow(FOLLOW_rule__BudgetEntry__FactorAssignment_1_5_in_rule__BudgetEntry__Group_1__5__Impl3236);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1611:1: rule__ActualEntry__Group_0__0 : rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 ;
    public final void rule__ActualEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1615:1: ( rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1616:2: rule__ActualEntry__Group_0__0__Impl rule__ActualEntry__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__0__Impl_in_rule__ActualEntry__Group_0__03278);
            rule__ActualEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__1_in_rule__ActualEntry__Group_0__03281);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1623:1: rule__ActualEntry__Group_0__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1627:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1628:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1628:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1629:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1630:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1632:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1642:1: rule__ActualEntry__Group_0__1 : rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 ;
    public final void rule__ActualEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1646:1: ( rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1647:2: rule__ActualEntry__Group_0__1__Impl rule__ActualEntry__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__1__Impl_in_rule__ActualEntry__Group_0__13339);
            rule__ActualEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__2_in_rule__ActualEntry__Group_0__13342);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1654:1: rule__ActualEntry__Group_0__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) ;
    public final void rule__ActualEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1658:1: ( ( ( rule__ActualEntry__CategoryAssignment_0_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1659:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1659:1: ( ( rule__ActualEntry__CategoryAssignment_0_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1660:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_0_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1661:1: ( rule__ActualEntry__CategoryAssignment_0_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1661:2: rule__ActualEntry__CategoryAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ActualEntry__CategoryAssignment_0_1_in_rule__ActualEntry__Group_0__1__Impl3369);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1671:1: rule__ActualEntry__Group_0__2 : rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 ;
    public final void rule__ActualEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1675:1: ( rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1676:2: rule__ActualEntry__Group_0__2__Impl rule__ActualEntry__Group_0__3
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__2__Impl_in_rule__ActualEntry__Group_0__23399);
            rule__ActualEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_0__3_in_rule__ActualEntry__Group_0__23402);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1683:1: rule__ActualEntry__Group_0__2__Impl : ( ':' ) ;
    public final void rule__ActualEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1687:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1688:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1688:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1689:1: ':'
            {
             before(grammarAccess.getActualEntryAccess().getColonKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__ActualEntry__Group_0__2__Impl3430); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1702:1: rule__ActualEntry__Group_0__3 : rule__ActualEntry__Group_0__3__Impl ;
    public final void rule__ActualEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1706:1: ( rule__ActualEntry__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1707:2: rule__ActualEntry__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_0__3__Impl_in_rule__ActualEntry__Group_0__33461);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1713:1: rule__ActualEntry__Group_0__3__Impl : ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) ;
    public final void rule__ActualEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1717:1: ( ( ( rule__ActualEntry__AmountAssignment_0_3 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1718:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1718:1: ( ( rule__ActualEntry__AmountAssignment_0_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1719:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            {
             before(grammarAccess.getActualEntryAccess().getAmountAssignment_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1720:1: ( rule__ActualEntry__AmountAssignment_0_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1720:2: rule__ActualEntry__AmountAssignment_0_3
            {
            pushFollow(FOLLOW_rule__ActualEntry__AmountAssignment_0_3_in_rule__ActualEntry__Group_0__3__Impl3488);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1738:1: rule__ActualEntry__Group_1__0 : rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 ;
    public final void rule__ActualEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1742:1: ( rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1743:2: rule__ActualEntry__Group_1__0__Impl rule__ActualEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__0__Impl_in_rule__ActualEntry__Group_1__03526);
            rule__ActualEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__1_in_rule__ActualEntry__Group_1__03529);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1750:1: rule__ActualEntry__Group_1__0__Impl : ( () ) ;
    public final void rule__ActualEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1754:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1755:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1755:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1756:1: ()
            {
             before(grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1757:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1759:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1769:1: rule__ActualEntry__Group_1__1 : rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 ;
    public final void rule__ActualEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1773:1: ( rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1774:2: rule__ActualEntry__Group_1__1__Impl rule__ActualEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__1__Impl_in_rule__ActualEntry__Group_1__13587);
            rule__ActualEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__2_in_rule__ActualEntry__Group_1__13590);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1781:1: rule__ActualEntry__Group_1__1__Impl : ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) ;
    public final void rule__ActualEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1785:1: ( ( ( rule__ActualEntry__CategoryAssignment_1_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1786:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1786:1: ( ( rule__ActualEntry__CategoryAssignment_1_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1787:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryAssignment_1_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1788:1: ( rule__ActualEntry__CategoryAssignment_1_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1788:2: rule__ActualEntry__CategoryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ActualEntry__CategoryAssignment_1_1_in_rule__ActualEntry__Group_1__1__Impl3617);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1798:1: rule__ActualEntry__Group_1__2 : rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 ;
    public final void rule__ActualEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1802:1: ( rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1803:2: rule__ActualEntry__Group_1__2__Impl rule__ActualEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__2__Impl_in_rule__ActualEntry__Group_1__23647);
            rule__ActualEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__3_in_rule__ActualEntry__Group_1__23650);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1810:1: rule__ActualEntry__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ActualEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1814:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1815:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1815:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1816:1: '{'
            {
             before(grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,26,FOLLOW_26_in_rule__ActualEntry__Group_1__2__Impl3678); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1829:1: rule__ActualEntry__Group_1__3 : rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 ;
    public final void rule__ActualEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1833:1: ( rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1834:2: rule__ActualEntry__Group_1__3__Impl rule__ActualEntry__Group_1__4
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__3__Impl_in_rule__ActualEntry__Group_1__33709);
            rule__ActualEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualEntry__Group_1__4_in_rule__ActualEntry__Group_1__33712);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1841:1: rule__ActualEntry__Group_1__3__Impl : ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) ;
    public final void rule__ActualEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1845:1: ( ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1846:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1846:1: ( ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1847:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) ) ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1847:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1848:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1849:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1849:2: rule__ActualEntry__TransactionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl3741);
            rule__ActualEntry__TransactionsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 

            }

            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1852:1: ( ( rule__ActualEntry__TransactionsAssignment_1_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1853:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsAssignment_1_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1854:1: ( rule__ActualEntry__TransactionsAssignment_1_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33||LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1854:2: rule__ActualEntry__TransactionsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl3753);
            	    rule__ActualEntry__TransactionsAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1865:1: rule__ActualEntry__Group_1__4 : rule__ActualEntry__Group_1__4__Impl ;
    public final void rule__ActualEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1869:1: ( rule__ActualEntry__Group_1__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1870:2: rule__ActualEntry__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__ActualEntry__Group_1__4__Impl_in_rule__ActualEntry__Group_1__43786);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1876:1: rule__ActualEntry__Group_1__4__Impl : ( '}' ) ;
    public final void rule__ActualEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1880:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1881:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1881:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1882:1: '}'
            {
             before(grammarAccess.getActualEntryAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,27,FOLLOW_27_in_rule__ActualEntry__Group_1__4__Impl3814); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1905:1: rule__Transaction__Group_0__0 : rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 ;
    public final void rule__Transaction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1909:1: ( rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1910:2: rule__Transaction__Group_0__0__Impl rule__Transaction__Group_0__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__0__Impl_in_rule__Transaction__Group_0__03855);
            rule__Transaction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__1_in_rule__Transaction__Group_0__03858);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1917:1: rule__Transaction__Group_0__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1921:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1922:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1922:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1923:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCashTransactionAction_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1924:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1926:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1936:1: rule__Transaction__Group_0__1 : rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 ;
    public final void rule__Transaction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1940:1: ( rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1941:2: rule__Transaction__Group_0__1__Impl rule__Transaction__Group_0__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__1__Impl_in_rule__Transaction__Group_0__13916);
            rule__Transaction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__2_in_rule__Transaction__Group_0__13919);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1948:1: rule__Transaction__Group_0__1__Impl : ( 'cash' ) ;
    public final void rule__Transaction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1952:1: ( ( 'cash' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1953:1: ( 'cash' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1953:1: ( 'cash' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1954:1: 'cash'
            {
             before(grammarAccess.getTransactionAccess().getCashKeyword_0_1()); 
            match(input,33,FOLLOW_33_in_rule__Transaction__Group_0__1__Impl3947); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1967:1: rule__Transaction__Group_0__2 : rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 ;
    public final void rule__Transaction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1971:1: ( rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1972:2: rule__Transaction__Group_0__2__Impl rule__Transaction__Group_0__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__2__Impl_in_rule__Transaction__Group_0__23978);
            rule__Transaction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0__3_in_rule__Transaction__Group_0__23981);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1979:1: rule__Transaction__Group_0__2__Impl : ( ( rule__Transaction__AmountAssignment_0_2 ) ) ;
    public final void rule__Transaction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1983:1: ( ( ( rule__Transaction__AmountAssignment_0_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1984:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1984:1: ( ( rule__Transaction__AmountAssignment_0_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1985:1: ( rule__Transaction__AmountAssignment_0_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_0_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1986:1: ( rule__Transaction__AmountAssignment_0_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1986:2: rule__Transaction__AmountAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Transaction__AmountAssignment_0_2_in_rule__Transaction__Group_0__2__Impl4008);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1996:1: rule__Transaction__Group_0__3 : rule__Transaction__Group_0__3__Impl ;
    public final void rule__Transaction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2000:1: ( rule__Transaction__Group_0__3__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2001:2: rule__Transaction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0__3__Impl_in_rule__Transaction__Group_0__34038);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2007:1: rule__Transaction__Group_0__3__Impl : ( ( rule__Transaction__Group_0_3__0 )? ) ;
    public final void rule__Transaction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2011:1: ( ( ( rule__Transaction__Group_0_3__0 )? ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2012:1: ( ( rule__Transaction__Group_0_3__0 )? )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2012:1: ( ( rule__Transaction__Group_0_3__0 )? )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2013:1: ( rule__Transaction__Group_0_3__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_0_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2014:1: ( rule__Transaction__Group_0_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2014:2: rule__Transaction__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_0_3__0_in_rule__Transaction__Group_0__3__Impl4065);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2032:1: rule__Transaction__Group_0_3__0 : rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 ;
    public final void rule__Transaction__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2036:1: ( rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2037:2: rule__Transaction__Group_0_3__0__Impl rule__Transaction__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0_3__0__Impl_in_rule__Transaction__Group_0_3__04104);
            rule__Transaction__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_0_3__1_in_rule__Transaction__Group_0_3__04107);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2044:1: rule__Transaction__Group_0_3__0__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2048:1: ( ( 'on' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2049:1: ( 'on' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2049:1: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2050:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_0_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Transaction__Group_0_3__0__Impl4135); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2063:1: rule__Transaction__Group_0_3__1 : rule__Transaction__Group_0_3__1__Impl ;
    public final void rule__Transaction__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2067:1: ( rule__Transaction__Group_0_3__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2068:2: rule__Transaction__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_0_3__1__Impl_in_rule__Transaction__Group_0_3__14166);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2074:1: rule__Transaction__Group_0_3__1__Impl : ( ( rule__Transaction__DayAssignment_0_3_1 ) ) ;
    public final void rule__Transaction__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2078:1: ( ( ( rule__Transaction__DayAssignment_0_3_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2079:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2079:1: ( ( rule__Transaction__DayAssignment_0_3_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2080:1: ( rule__Transaction__DayAssignment_0_3_1 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_0_3_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2081:1: ( rule__Transaction__DayAssignment_0_3_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2081:2: rule__Transaction__DayAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Transaction__DayAssignment_0_3_1_in_rule__Transaction__Group_0_3__1__Impl4193);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2095:1: rule__Transaction__Group_1__0 : rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 ;
    public final void rule__Transaction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2099:1: ( rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2100:2: rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__04227);
            rule__Transaction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__04230);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2107:1: rule__Transaction__Group_1__0__Impl : ( () ) ;
    public final void rule__Transaction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2111:1: ( ( () ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2112:1: ( () )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2112:1: ( () )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2113:1: ()
            {
             before(grammarAccess.getTransactionAccess().getCardTransactionAction_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2114:1: ()
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2116:1: 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2126:1: rule__Transaction__Group_1__1 : rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 ;
    public final void rule__Transaction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2130:1: ( rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2131:2: rule__Transaction__Group_1__1__Impl rule__Transaction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__14288);
            rule__Transaction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__2_in_rule__Transaction__Group_1__14291);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2138:1: rule__Transaction__Group_1__1__Impl : ( 'card' ) ;
    public final void rule__Transaction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2142:1: ( ( 'card' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2143:1: ( 'card' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2143:1: ( 'card' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2144:1: 'card'
            {
             before(grammarAccess.getTransactionAccess().getCardKeyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__Transaction__Group_1__1__Impl4319); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2157:1: rule__Transaction__Group_1__2 : rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 ;
    public final void rule__Transaction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2161:1: ( rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2162:2: rule__Transaction__Group_1__2__Impl rule__Transaction__Group_1__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__2__Impl_in_rule__Transaction__Group_1__24350);
            rule__Transaction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__3_in_rule__Transaction__Group_1__24353);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2169:1: rule__Transaction__Group_1__2__Impl : ( ( rule__Transaction__AmountAssignment_1_2 ) ) ;
    public final void rule__Transaction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2173:1: ( ( ( rule__Transaction__AmountAssignment_1_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2174:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2174:1: ( ( rule__Transaction__AmountAssignment_1_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2175:1: ( rule__Transaction__AmountAssignment_1_2 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_1_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2176:1: ( rule__Transaction__AmountAssignment_1_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2176:2: rule__Transaction__AmountAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Transaction__AmountAssignment_1_2_in_rule__Transaction__Group_1__2__Impl4380);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2186:1: rule__Transaction__Group_1__3 : rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 ;
    public final void rule__Transaction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2190:1: ( rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2191:2: rule__Transaction__Group_1__3__Impl rule__Transaction__Group_1__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__3__Impl_in_rule__Transaction__Group_1__34410);
            rule__Transaction__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__4_in_rule__Transaction__Group_1__34413);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2198:1: rule__Transaction__Group_1__3__Impl : ( 'on' ) ;
    public final void rule__Transaction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2202:1: ( ( 'on' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2203:1: ( 'on' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2203:1: ( 'on' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2204:1: 'on'
            {
             before(grammarAccess.getTransactionAccess().getOnKeyword_1_3()); 
            match(input,34,FOLLOW_34_in_rule__Transaction__Group_1__3__Impl4441); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2217:1: rule__Transaction__Group_1__4 : rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 ;
    public final void rule__Transaction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2221:1: ( rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2222:2: rule__Transaction__Group_1__4__Impl rule__Transaction__Group_1__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__4__Impl_in_rule__Transaction__Group_1__44472);
            rule__Transaction__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__5_in_rule__Transaction__Group_1__44475);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2229:1: rule__Transaction__Group_1__4__Impl : ( ( rule__Transaction__DayAssignment_1_4 ) ) ;
    public final void rule__Transaction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2233:1: ( ( ( rule__Transaction__DayAssignment_1_4 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2234:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2234:1: ( ( rule__Transaction__DayAssignment_1_4 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2235:1: ( rule__Transaction__DayAssignment_1_4 )
            {
             before(grammarAccess.getTransactionAccess().getDayAssignment_1_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2236:1: ( rule__Transaction__DayAssignment_1_4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2236:2: rule__Transaction__DayAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Transaction__DayAssignment_1_4_in_rule__Transaction__Group_1__4__Impl4502);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2246:1: rule__Transaction__Group_1__5 : rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 ;
    public final void rule__Transaction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2250:1: ( rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2251:2: rule__Transaction__Group_1__5__Impl rule__Transaction__Group_1__6
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__5__Impl_in_rule__Transaction__Group_1__54532);
            rule__Transaction__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__6_in_rule__Transaction__Group_1__54535);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2258:1: rule__Transaction__Group_1__5__Impl : ( 'from' ) ;
    public final void rule__Transaction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2262:1: ( ( 'from' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2263:1: ( 'from' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2263:1: ( 'from' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2264:1: 'from'
            {
             before(grammarAccess.getTransactionAccess().getFromKeyword_1_5()); 
            match(input,36,FOLLOW_36_in_rule__Transaction__Group_1__5__Impl4563); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2277:1: rule__Transaction__Group_1__6 : rule__Transaction__Group_1__6__Impl ;
    public final void rule__Transaction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2281:1: ( rule__Transaction__Group_1__6__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2282:2: rule__Transaction__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__6__Impl_in_rule__Transaction__Group_1__64594);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2288:1: rule__Transaction__Group_1__6__Impl : ( ( rule__Transaction__FromAssignment_1_6 ) ) ;
    public final void rule__Transaction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2292:1: ( ( ( rule__Transaction__FromAssignment_1_6 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2293:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2293:1: ( ( rule__Transaction__FromAssignment_1_6 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2294:1: ( rule__Transaction__FromAssignment_1_6 )
            {
             before(grammarAccess.getTransactionAccess().getFromAssignment_1_6()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2295:1: ( rule__Transaction__FromAssignment_1_6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2295:2: rule__Transaction__FromAssignment_1_6
            {
            pushFollow(FOLLOW_rule__Transaction__FromAssignment_1_6_in_rule__Transaction__Group_1__6__Impl4621);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2321:1: rule__Library__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Library__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2325:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2326:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2326:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2327:1: RULE_ID
            {
             before(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Library__NameAssignment_14671); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2336:1: rule__Library__CategoriesAssignment_3 : ( ruleCategory ) ;
    public final void rule__Library__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2340:1: ( ( ruleCategory ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2341:1: ( ruleCategory )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2341:1: ( ruleCategory )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2342:1: ruleCategory
            {
             before(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_34702);
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


    // $ANTLR start "rule__Category__IncomeAssignment_0_0"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2351:1: rule__Category__IncomeAssignment_0_0 : ( ( 'income' ) ) ;
    public final void rule__Category__IncomeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2355:1: ( ( ( 'income' ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2356:1: ( ( 'income' ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2356:1: ( ( 'income' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2357:1: ( 'income' )
            {
             before(grammarAccess.getCategoryAccess().getIncomeIncomeKeyword_0_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2358:1: ( 'income' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2359:1: 'income'
            {
             before(grammarAccess.getCategoryAccess().getIncomeIncomeKeyword_0_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Category__IncomeAssignment_0_04738); 
             after(grammarAccess.getCategoryAccess().getIncomeIncomeKeyword_0_0_0()); 

            }

             after(grammarAccess.getCategoryAccess().getIncomeIncomeKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__IncomeAssignment_0_0"


    // $ANTLR start "rule__Category__NameAssignment_1"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2374:1: rule__Category__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2378:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2379:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2379:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2380:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_14777); 
             after(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__NameAssignment_1"


    // $ANTLR start "rule__Year__NameAssignment_0"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2389:1: rule__Year__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__Year__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2393:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2394:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2394:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2395:1: RULE_INT
            {
             before(grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Year__NameAssignment_04808); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2404:1: rule__Year__LibraryAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Year__LibraryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2408:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2409:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2409:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2410:1: ( RULE_ID )
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2411:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2412:1: RULE_ID
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_24843); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2423:1: rule__Year__MonthsAssignment_4 : ( ruleMonth ) ;
    public final void rule__Year__MonthsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2427:1: ( ( ruleMonth ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2428:1: ( ruleMonth )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2428:1: ( ruleMonth )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2429:1: ruleMonth
            {
             before(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_44878);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2438:1: rule__Month__NameAssignment_0 : ( ruleMonthEnum ) ;
    public final void rule__Month__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2442:1: ( ( ruleMonthEnum ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2443:1: ( ruleMonthEnum )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2443:1: ( ruleMonthEnum )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2444:1: ruleMonthEnum
            {
             before(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_04909);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2453:1: rule__Month__BudgetEntriesAssignment_3 : ( ruleBudgetEntry ) ;
    public final void rule__Month__BudgetEntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2457:1: ( ( ruleBudgetEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2458:1: ( ruleBudgetEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2458:1: ( ruleBudgetEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2459:1: ruleBudgetEntry
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBudgetEntry_in_rule__Month__BudgetEntriesAssignment_34940);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2468:1: rule__Month__ActualEntriesAssignment_7 : ( ruleActualEntry ) ;
    public final void rule__Month__ActualEntriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2472:1: ( ( ruleActualEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2473:1: ( ruleActualEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2473:1: ( ruleActualEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2474:1: ruleActualEntry
            {
             before(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleActualEntry_in_rule__Month__ActualEntriesAssignment_74971);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2483:1: rule__BudgetEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2487:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2488:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2488:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2489:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2490:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2491:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_0_15006); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2502:1: rule__BudgetEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__BudgetEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2506:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2507:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2507:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2508:1: ruleDollar
            {
             before(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__BudgetEntry__AmountAssignment_0_35041);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2517:1: rule__BudgetEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2521:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2522:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2522:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2523:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2524:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2525:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_1_15076); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2536:1: rule__BudgetEntry__BaseEntryAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__BudgetEntry__BaseEntryAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2540:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2541:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2541:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2542:1: ( RULE_ID )
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2543:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2544:1: RULE_ID
            {
             before(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BudgetEntry__BaseEntryAssignment_1_35115); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2555:1: rule__BudgetEntry__FactorAssignment_1_5 : ( ruleDouble ) ;
    public final void rule__BudgetEntry__FactorAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2559:1: ( ( ruleDouble ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2560:1: ( ruleDouble )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2560:1: ( ruleDouble )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2561:1: ruleDouble
            {
             before(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_ruleDouble_in_rule__BudgetEntry__FactorAssignment_1_55150);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2570:1: rule__ActualEntry__CategoryAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2574:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2575:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2575:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2576:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2577:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2578:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_0_15185); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2589:1: rule__ActualEntry__AmountAssignment_0_3 : ( ruleDollar ) ;
    public final void rule__ActualEntry__AmountAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2593:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2594:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2594:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2595:1: ruleDollar
            {
             before(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__ActualEntry__AmountAssignment_0_35220);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2604:1: rule__ActualEntry__CategoryAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActualEntry__CategoryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2608:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2609:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2609:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2610:1: ( RULE_ID )
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2611:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2612:1: RULE_ID
            {
             before(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_1_15255); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2623:1: rule__ActualEntry__TransactionsAssignment_1_3 : ( ruleTransaction ) ;
    public final void rule__ActualEntry__TransactionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2627:1: ( ( ruleTransaction ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2628:1: ( ruleTransaction )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2628:1: ( ruleTransaction )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2629:1: ruleTransaction
            {
             before(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__ActualEntry__TransactionsAssignment_1_35290);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2638:1: rule__Transaction__AmountAssignment_0_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2642:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2643:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2643:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2644:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_0_25321);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2653:1: rule__Transaction__DayAssignment_0_3_1 : ( RULE_INT ) ;
    public final void rule__Transaction__DayAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2657:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2658:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2658:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2659:1: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_0_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_0_3_15352); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2668:1: rule__Transaction__AmountAssignment_1_2 : ( ruleDollar ) ;
    public final void rule__Transaction__AmountAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2672:1: ( ( ruleDollar ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2673:1: ( ruleDollar )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2673:1: ( ruleDollar )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2674:1: ruleDollar
            {
             before(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_1_25383);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2683:1: rule__Transaction__DayAssignment_1_4 : ( RULE_INT ) ;
    public final void rule__Transaction__DayAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2687:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2688:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2688:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2689:1: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_1_45414); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2698:1: rule__Transaction__FromAssignment_1_6 : ( RULE_STRING ) ;
    public final void rule__Transaction__FromAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2702:1: ( ( RULE_STRING ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2703:1: ( RULE_STRING )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2703:1: ( RULE_STRING )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:2704:1: RULE_STRING
            {
             before(grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Transaction__FromAssignment_1_65445); 
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
    public static final BitSet FOLLOW_rule__Category__Group__0_in_ruleCategory214 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Category__IncomeAssignment_0_0_in_rule__Category__Alternatives_0756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Category__Alternatives_0775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__0_in_rule__BudgetEntry__Alternatives809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__0_in_rule__BudgetEntry__Alternatives827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__0_in_rule__ActualEntry__Alternatives860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__0_in_rule__ActualEntry__Alternatives878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__0_in_rule__Transaction__Alternatives911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Alternatives962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Double__Alternatives979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MonthEnum__Alternatives1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MonthEnum__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MonthEnum__Alternatives1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MonthEnum__Alternatives1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MonthEnum__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MonthEnum__Alternatives1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MonthEnum__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MonthEnum__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MonthEnum__Alternatives1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MonthEnum__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MonthEnum__Alternatives1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MonthEnum__Alternatives1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01276 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Library__Group__0__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11338 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21398 = new BitSet(new long[]{0x0000002008001000L});
    public static final BitSet FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Library__Group__2__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31460 = new BitSet(new long[]{0x0000002008001000L});
    public static final BitSet FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1490 = new BitSet(new long[]{0x0000002000001002L});
    public static final BitSet FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Library__Group__4__Impl1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__01590 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__01593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Alternatives_0_in_rule__Category__Group__0__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_1_in_rule__Category__Group__1__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__01711 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Year__Group__1_in_rule__Year__Group__01714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__11771 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Year__Group__2_in_rule__Year__Group__11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Year__Group__1__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__21833 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Year__Group__3_in_rule__Year__Group__21836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__31893 = new BitSet(new long[]{0x0000000009FFE000L});
    public static final BitSet FOLLOW_rule__Year__Group__4_in_rule__Year__Group__31896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Year__Group__3__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__41955 = new BitSet(new long[]{0x0000000009FFE000L});
    public static final BitSet FOLLOW_rule__Year__Group__5_in_rule__Year__Group__41958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl1985 = new BitSet(new long[]{0x0000000001FFE002L});
    public static final BitSet FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__52016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Year__Group__5__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__02087 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Month__Group__1_in_rule__Month__Group__02090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__12147 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Month__Group__2_in_rule__Month__Group__12150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Month__Group__1__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__22209 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Month__Group__3_in_rule__Month__Group__22212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__2__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__32271 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Month__Group__4_in_rule__Month__Group__32274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl2301 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__42332 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Month__Group__5_in_rule__Month__Group__42335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Month__Group__4__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__52394 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Month__Group__6_in_rule__Month__Group__52397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Month__Group__5__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__62456 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Month__Group__7_in_rule__Month__Group__62459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__6__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__72518 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Month__Group__8_in_rule__Month__Group__72521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl2548 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__82579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Month__Group__8__Impl2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__0__Impl_in_rule__BudgetEntry__Group_0__02656 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__1_in_rule__BudgetEntry__Group_0__02659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__1__Impl_in_rule__BudgetEntry__Group_0__12717 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__2_in_rule__BudgetEntry__Group_0__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__CategoryAssignment_0_1_in_rule__BudgetEntry__Group_0__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__2__Impl_in_rule__BudgetEntry__Group_0__22777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__3_in_rule__BudgetEntry__Group_0__22780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BudgetEntry__Group_0__2__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_0__3__Impl_in_rule__BudgetEntry__Group_0__32839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__AmountAssignment_0_3_in_rule__BudgetEntry__Group_0__3__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__0__Impl_in_rule__BudgetEntry__Group_1__02904 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__1_in_rule__BudgetEntry__Group_1__02907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__1__Impl_in_rule__BudgetEntry__Group_1__12965 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__2_in_rule__BudgetEntry__Group_1__12968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__CategoryAssignment_1_1_in_rule__BudgetEntry__Group_1__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__2__Impl_in_rule__BudgetEntry__Group_1__23025 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__3_in_rule__BudgetEntry__Group_1__23028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BudgetEntry__Group_1__2__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__3__Impl_in_rule__BudgetEntry__Group_1__33087 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__4_in_rule__BudgetEntry__Group_1__33090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__BaseEntryAssignment_1_3_in_rule__BudgetEntry__Group_1__3__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__4__Impl_in_rule__BudgetEntry__Group_1__43147 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__5_in_rule__BudgetEntry__Group_1__43150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BudgetEntry__Group_1__4__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__Group_1__5__Impl_in_rule__BudgetEntry__Group_1__53209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BudgetEntry__FactorAssignment_1_5_in_rule__BudgetEntry__Group_1__5__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__0__Impl_in_rule__ActualEntry__Group_0__03278 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__1_in_rule__ActualEntry__Group_0__03281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__1__Impl_in_rule__ActualEntry__Group_0__13339 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__2_in_rule__ActualEntry__Group_0__13342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__CategoryAssignment_0_1_in_rule__ActualEntry__Group_0__1__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__2__Impl_in_rule__ActualEntry__Group_0__23399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__3_in_rule__ActualEntry__Group_0__23402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ActualEntry__Group_0__2__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_0__3__Impl_in_rule__ActualEntry__Group_0__33461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__AmountAssignment_0_3_in_rule__ActualEntry__Group_0__3__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__0__Impl_in_rule__ActualEntry__Group_1__03526 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__1_in_rule__ActualEntry__Group_1__03529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__1__Impl_in_rule__ActualEntry__Group_1__13587 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__2_in_rule__ActualEntry__Group_1__13590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__CategoryAssignment_1_1_in_rule__ActualEntry__Group_1__1__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__2__Impl_in_rule__ActualEntry__Group_1__23647 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__3_in_rule__ActualEntry__Group_1__23650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ActualEntry__Group_1__2__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__3__Impl_in_rule__ActualEntry__Group_1__33709 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__4_in_rule__ActualEntry__Group_1__33712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl3741 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__TransactionsAssignment_1_3_in_rule__ActualEntry__Group_1__3__Impl3753 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_rule__ActualEntry__Group_1__4__Impl_in_rule__ActualEntry__Group_1__43786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ActualEntry__Group_1__4__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__0__Impl_in_rule__Transaction__Group_0__03855 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__1_in_rule__Transaction__Group_0__03858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__1__Impl_in_rule__Transaction__Group_0__13916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__2_in_rule__Transaction__Group_0__13919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Transaction__Group_0__1__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__2__Impl_in_rule__Transaction__Group_0__23978 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__3_in_rule__Transaction__Group_0__23981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AmountAssignment_0_2_in_rule__Transaction__Group_0__2__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0__3__Impl_in_rule__Transaction__Group_0__34038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__0_in_rule__Transaction__Group_0__3__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__0__Impl_in_rule__Transaction__Group_0_3__04104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__1_in_rule__Transaction__Group_0_3__04107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Transaction__Group_0_3__0__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_0_3__1__Impl_in_rule__Transaction__Group_0_3__14166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__DayAssignment_0_3_1_in_rule__Transaction__Group_0_3__1__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__04227 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__04230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__14288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__2_in_rule__Transaction__Group_1__14291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Transaction__Group_1__1__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__2__Impl_in_rule__Transaction__Group_1__24350 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__3_in_rule__Transaction__Group_1__24353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__AmountAssignment_1_2_in_rule__Transaction__Group_1__2__Impl4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__3__Impl_in_rule__Transaction__Group_1__34410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__4_in_rule__Transaction__Group_1__34413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Transaction__Group_1__3__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__4__Impl_in_rule__Transaction__Group_1__44472 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__5_in_rule__Transaction__Group_1__44475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__DayAssignment_1_4_in_rule__Transaction__Group_1__4__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__5__Impl_in_rule__Transaction__Group_1__54532 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__6_in_rule__Transaction__Group_1__54535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Transaction__Group_1__5__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__6__Impl_in_rule__Transaction__Group_1__64594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__FromAssignment_1_6_in_rule__Transaction__Group_1__6__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Library__NameAssignment_14671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_34702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Category__IncomeAssignment_0_04738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_14777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Year__NameAssignment_04808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_24843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_44878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_04909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBudgetEntry_in_rule__Month__BudgetEntriesAssignment_34940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualEntry_in_rule__Month__ActualEntriesAssignment_74971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_0_15006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__BudgetEntry__AmountAssignment_0_35041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__CategoryAssignment_1_15076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BudgetEntry__BaseEntryAssignment_1_35115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__BudgetEntry__FactorAssignment_1_55150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_0_15185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__ActualEntry__AmountAssignment_0_35220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualEntry__CategoryAssignment_1_15255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__ActualEntry__TransactionsAssignment_1_35290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_0_25321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_0_3_15352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_rule__Transaction__AmountAssignment_1_25383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transaction__DayAssignment_1_45414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Transaction__FromAssignment_1_65445 = new BitSet(new long[]{0x0000000000000002L});

}