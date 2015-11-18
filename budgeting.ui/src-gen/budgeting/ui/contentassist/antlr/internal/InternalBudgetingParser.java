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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOLLAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'expense'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'", "'library'", "'{'", "'}'", "'uses'", "'budget'", "'actual'", "':'", "'income'"
    };
    public static final int RULE_DOLLAR=6;
    public static final int RULE_STRING=7;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


    // $ANTLR start "entryRuleEntry"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:200:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:201:1: ( ruleEntry EOF )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:202:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry361);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getEntryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry368); 

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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:209:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:213:2: ( ( ( rule__Entry__Group__0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:214:1: ( ( rule__Entry__Group__0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:214:1: ( ( rule__Entry__Group__0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:215:1: ( rule__Entry__Group__0 )
            {
             before(grammarAccess.getEntryAccess().getGroup()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:216:1: ( rule__Entry__Group__0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:216:2: rule__Entry__Group__0
            {
            pushFollow(FOLLOW_rule__Entry__Group__0_in_ruleEntry394);
            rule__Entry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "ruleMonthEnum"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:229:1: ruleMonthEnum : ( ( rule__MonthEnum__Alternatives ) ) ;
    public final void ruleMonthEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:233:1: ( ( ( rule__MonthEnum__Alternatives ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:234:1: ( ( rule__MonthEnum__Alternatives ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:234:1: ( ( rule__MonthEnum__Alternatives ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:235:1: ( rule__MonthEnum__Alternatives )
            {
             before(grammarAccess.getMonthEnumAccess().getAlternatives()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:236:1: ( rule__MonthEnum__Alternatives )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:236:2: rule__MonthEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__MonthEnum__Alternatives_in_ruleMonthEnum431);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:247:1: rule__BudgetingFile__Alternatives : ( ( ruleLibrary ) | ( ruleYear ) );
    public final void rule__BudgetingFile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:251:1: ( ( ruleLibrary ) | ( ruleYear ) )
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:252:1: ( ruleLibrary )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:252:1: ( ruleLibrary )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:253:1: ruleLibrary
                    {
                     before(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLibrary_in_rule__BudgetingFile__Alternatives466);
                    ruleLibrary();

                    state._fsp--;

                     after(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:258:6: ( ruleYear )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:258:6: ( ruleYear )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:259:1: ruleYear
                    {
                     before(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleYear_in_rule__BudgetingFile__Alternatives483);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:269:1: rule__Category__Alternatives_0 : ( ( ( rule__Category__IncomeAssignment_0_0 ) ) | ( 'expense' ) );
    public final void rule__Category__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:273:1: ( ( ( rule__Category__IncomeAssignment_0_0 ) ) | ( 'expense' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
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
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:274:1: ( ( rule__Category__IncomeAssignment_0_0 ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:274:1: ( ( rule__Category__IncomeAssignment_0_0 ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:275:1: ( rule__Category__IncomeAssignment_0_0 )
                    {
                     before(grammarAccess.getCategoryAccess().getIncomeAssignment_0_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:276:1: ( rule__Category__IncomeAssignment_0_0 )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:276:2: rule__Category__IncomeAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Category__IncomeAssignment_0_0_in_rule__Category__Alternatives_0515);
                    rule__Category__IncomeAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCategoryAccess().getIncomeAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:280:6: ( 'expense' )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:280:6: ( 'expense' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:281:1: 'expense'
                    {
                     before(grammarAccess.getCategoryAccess().getExpenseKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Category__Alternatives_0534); 
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


    // $ANTLR start "rule__MonthEnum__Alternatives"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:293:1: rule__MonthEnum__Alternatives : ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) );
    public final void rule__MonthEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:297:1: ( ( ( 'january' ) ) | ( ( 'february' ) ) | ( ( 'march' ) ) | ( ( 'april' ) ) | ( ( 'may' ) ) | ( ( 'june' ) ) | ( ( 'july' ) ) | ( ( 'august' ) ) | ( ( 'september' ) ) | ( ( 'october' ) ) | ( ( 'november' ) ) | ( ( 'december' ) ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            case 21:
                {
                alt3=9;
                }
                break;
            case 22:
                {
                alt3=10;
                }
                break;
            case 23:
                {
                alt3=11;
                }
                break;
            case 24:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:298:1: ( ( 'january' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:298:1: ( ( 'january' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:299:1: ( 'january' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:300:1: ( 'january' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:300:3: 'january'
                    {
                    match(input,13,FOLLOW_13_in_rule__MonthEnum__Alternatives569); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:305:6: ( ( 'february' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:305:6: ( ( 'february' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:306:1: ( 'february' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:307:1: ( 'february' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:307:3: 'february'
                    {
                    match(input,14,FOLLOW_14_in_rule__MonthEnum__Alternatives590); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:312:6: ( ( 'march' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:312:6: ( ( 'march' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:313:1: ( 'march' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:314:1: ( 'march' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:314:3: 'march'
                    {
                    match(input,15,FOLLOW_15_in_rule__MonthEnum__Alternatives611); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:319:6: ( ( 'april' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:319:6: ( ( 'april' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:320:1: ( 'april' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:321:1: ( 'april' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:321:3: 'april'
                    {
                    match(input,16,FOLLOW_16_in_rule__MonthEnum__Alternatives632); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:326:6: ( ( 'may' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:326:6: ( ( 'may' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:327:1: ( 'may' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:328:1: ( 'may' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:328:3: 'may'
                    {
                    match(input,17,FOLLOW_17_in_rule__MonthEnum__Alternatives653); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:333:6: ( ( 'june' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:333:6: ( ( 'june' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:334:1: ( 'june' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:335:1: ( 'june' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:335:3: 'june'
                    {
                    match(input,18,FOLLOW_18_in_rule__MonthEnum__Alternatives674); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:340:6: ( ( 'july' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:340:6: ( ( 'july' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:341:1: ( 'july' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:342:1: ( 'july' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:342:3: 'july'
                    {
                    match(input,19,FOLLOW_19_in_rule__MonthEnum__Alternatives695); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:347:6: ( ( 'august' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:347:6: ( ( 'august' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:348:1: ( 'august' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:349:1: ( 'august' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:349:3: 'august'
                    {
                    match(input,20,FOLLOW_20_in_rule__MonthEnum__Alternatives716); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:354:6: ( ( 'september' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:354:6: ( ( 'september' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:355:1: ( 'september' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:356:1: ( 'september' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:356:3: 'september'
                    {
                    match(input,21,FOLLOW_21_in_rule__MonthEnum__Alternatives737); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:361:6: ( ( 'october' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:361:6: ( ( 'october' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:362:1: ( 'october' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:363:1: ( 'october' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:363:3: 'october'
                    {
                    match(input,22,FOLLOW_22_in_rule__MonthEnum__Alternatives758); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:368:6: ( ( 'november' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:368:6: ( ( 'november' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:369:1: ( 'november' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:370:1: ( 'november' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:370:3: 'november'
                    {
                    match(input,23,FOLLOW_23_in_rule__MonthEnum__Alternatives779); 

                    }

                     after(grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:375:6: ( ( 'december' ) )
                    {
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:375:6: ( ( 'december' ) )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:376:1: ( 'december' )
                    {
                     before(grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:377:1: ( 'december' )
                    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:377:3: 'december'
                    {
                    match(input,24,FOLLOW_24_in_rule__MonthEnum__Alternatives800); 

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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:389:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:393:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:394:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__0833);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__1_in_rule__Library__Group__0836);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:401:1: rule__Library__Group__0__Impl : ( 'library' ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:405:1: ( ( 'library' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:406:1: ( 'library' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:406:1: ( 'library' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:407:1: 'library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Library__Group__0__Impl864); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:420:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:424:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:425:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__1895);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__2_in_rule__Library__Group__1898);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:432:1: rule__Library__Group__1__Impl : ( ( rule__Library__NameAssignment_1 ) ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:436:1: ( ( ( rule__Library__NameAssignment_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:437:1: ( ( rule__Library__NameAssignment_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:437:1: ( ( rule__Library__NameAssignment_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:438:1: ( rule__Library__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:439:1: ( rule__Library__NameAssignment_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:439:2: rule__Library__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl925);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:449:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:453:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:454:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__2955);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__3_in_rule__Library__Group__2958);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:461:1: rule__Library__Group__2__Impl : ( '{' ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:465:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:466:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:466:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:467:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Library__Group__2__Impl986); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:480:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:484:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:485:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31017);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31020);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:492:1: rule__Library__Group__3__Impl : ( ( rule__Library__CategoriesAssignment_3 )* ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:496:1: ( ( ( rule__Library__CategoriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:497:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:497:1: ( ( rule__Library__CategoriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:498:1: ( rule__Library__CategoriesAssignment_3 )*
            {
             before(grammarAccess.getLibraryAccess().getCategoriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:499:1: ( rule__Library__CategoriesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:499:2: rule__Library__CategoriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1047);
            	    rule__Library__CategoriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:509:1: rule__Library__Group__4 : rule__Library__Group__4__Impl ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:513:1: ( rule__Library__Group__4__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:514:2: rule__Library__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41078);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:520:1: rule__Library__Group__4__Impl : ( '}' ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:524:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:525:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:525:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:526:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Library__Group__4__Impl1106); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:549:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:553:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:554:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__01147);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__1_in_rule__Category__Group__01150);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:561:1: rule__Category__Group__0__Impl : ( ( rule__Category__Alternatives_0 ) ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:565:1: ( ( ( rule__Category__Alternatives_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:566:1: ( ( rule__Category__Alternatives_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:566:1: ( ( rule__Category__Alternatives_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:567:1: ( rule__Category__Alternatives_0 )
            {
             before(grammarAccess.getCategoryAccess().getAlternatives_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:568:1: ( rule__Category__Alternatives_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:568:2: rule__Category__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Category__Alternatives_0_in_rule__Category__Group__0__Impl1177);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:578:1: rule__Category__Group__1 : rule__Category__Group__1__Impl ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:582:1: ( rule__Category__Group__1__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:583:2: rule__Category__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__11207);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:589:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:593:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:594:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:594:1: ( ( rule__Category__NameAssignment_1 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:595:1: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:596:1: ( rule__Category__NameAssignment_1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:596:2: rule__Category__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_1_in_rule__Category__Group__1__Impl1234);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:610:1: rule__Year__Group__0 : rule__Year__Group__0__Impl rule__Year__Group__1 ;
    public final void rule__Year__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:614:1: ( rule__Year__Group__0__Impl rule__Year__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:615:2: rule__Year__Group__0__Impl rule__Year__Group__1
            {
            pushFollow(FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__01268);
            rule__Year__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__1_in_rule__Year__Group__01271);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:622:1: rule__Year__Group__0__Impl : ( ( rule__Year__NameAssignment_0 ) ) ;
    public final void rule__Year__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:626:1: ( ( ( rule__Year__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:627:1: ( ( rule__Year__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:627:1: ( ( rule__Year__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:628:1: ( rule__Year__NameAssignment_0 )
            {
             before(grammarAccess.getYearAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:629:1: ( rule__Year__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:629:2: rule__Year__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl1298);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:639:1: rule__Year__Group__1 : rule__Year__Group__1__Impl rule__Year__Group__2 ;
    public final void rule__Year__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:643:1: ( rule__Year__Group__1__Impl rule__Year__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:644:2: rule__Year__Group__1__Impl rule__Year__Group__2
            {
            pushFollow(FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__11328);
            rule__Year__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__2_in_rule__Year__Group__11331);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:651:1: rule__Year__Group__1__Impl : ( 'uses' ) ;
    public final void rule__Year__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:655:1: ( ( 'uses' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:656:1: ( 'uses' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:656:1: ( 'uses' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:657:1: 'uses'
            {
             before(grammarAccess.getYearAccess().getUsesKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Year__Group__1__Impl1359); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:670:1: rule__Year__Group__2 : rule__Year__Group__2__Impl rule__Year__Group__3 ;
    public final void rule__Year__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:674:1: ( rule__Year__Group__2__Impl rule__Year__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:675:2: rule__Year__Group__2__Impl rule__Year__Group__3
            {
            pushFollow(FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__21390);
            rule__Year__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__3_in_rule__Year__Group__21393);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:682:1: rule__Year__Group__2__Impl : ( ( rule__Year__LibraryAssignment_2 ) ) ;
    public final void rule__Year__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:686:1: ( ( ( rule__Year__LibraryAssignment_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:687:1: ( ( rule__Year__LibraryAssignment_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:687:1: ( ( rule__Year__LibraryAssignment_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:688:1: ( rule__Year__LibraryAssignment_2 )
            {
             before(grammarAccess.getYearAccess().getLibraryAssignment_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:689:1: ( rule__Year__LibraryAssignment_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:689:2: rule__Year__LibraryAssignment_2
            {
            pushFollow(FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl1420);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:699:1: rule__Year__Group__3 : rule__Year__Group__3__Impl rule__Year__Group__4 ;
    public final void rule__Year__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:703:1: ( rule__Year__Group__3__Impl rule__Year__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:704:2: rule__Year__Group__3__Impl rule__Year__Group__4
            {
            pushFollow(FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__31450);
            rule__Year__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__4_in_rule__Year__Group__31453);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:711:1: rule__Year__Group__3__Impl : ( '{' ) ;
    public final void rule__Year__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:715:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:716:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:716:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:717:1: '{'
            {
             before(grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Year__Group__3__Impl1481); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:730:1: rule__Year__Group__4 : rule__Year__Group__4__Impl rule__Year__Group__5 ;
    public final void rule__Year__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:734:1: ( rule__Year__Group__4__Impl rule__Year__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:735:2: rule__Year__Group__4__Impl rule__Year__Group__5
            {
            pushFollow(FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__41512);
            rule__Year__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Year__Group__5_in_rule__Year__Group__41515);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:742:1: rule__Year__Group__4__Impl : ( ( rule__Year__MonthsAssignment_4 )* ) ;
    public final void rule__Year__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:746:1: ( ( ( rule__Year__MonthsAssignment_4 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:747:1: ( ( rule__Year__MonthsAssignment_4 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:747:1: ( ( rule__Year__MonthsAssignment_4 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:748:1: ( rule__Year__MonthsAssignment_4 )*
            {
             before(grammarAccess.getYearAccess().getMonthsAssignment_4()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:749:1: ( rule__Year__MonthsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:749:2: rule__Year__MonthsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl1542);
            	    rule__Year__MonthsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:759:1: rule__Year__Group__5 : rule__Year__Group__5__Impl ;
    public final void rule__Year__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:763:1: ( rule__Year__Group__5__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:764:2: rule__Year__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__51573);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:770:1: rule__Year__Group__5__Impl : ( '}' ) ;
    public final void rule__Year__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:774:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:775:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:775:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:776:1: '}'
            {
             before(grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Year__Group__5__Impl1601); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:801:1: rule__Month__Group__0 : rule__Month__Group__0__Impl rule__Month__Group__1 ;
    public final void rule__Month__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:805:1: ( rule__Month__Group__0__Impl rule__Month__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:806:2: rule__Month__Group__0__Impl rule__Month__Group__1
            {
            pushFollow(FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__01644);
            rule__Month__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__1_in_rule__Month__Group__01647);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:813:1: rule__Month__Group__0__Impl : ( ( rule__Month__NameAssignment_0 ) ) ;
    public final void rule__Month__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:817:1: ( ( ( rule__Month__NameAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:818:1: ( ( rule__Month__NameAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:818:1: ( ( rule__Month__NameAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:819:1: ( rule__Month__NameAssignment_0 )
            {
             before(grammarAccess.getMonthAccess().getNameAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:820:1: ( rule__Month__NameAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:820:2: rule__Month__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl1674);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:830:1: rule__Month__Group__1 : rule__Month__Group__1__Impl rule__Month__Group__2 ;
    public final void rule__Month__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:834:1: ( rule__Month__Group__1__Impl rule__Month__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:835:2: rule__Month__Group__1__Impl rule__Month__Group__2
            {
            pushFollow(FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__11704);
            rule__Month__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__2_in_rule__Month__Group__11707);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:842:1: rule__Month__Group__1__Impl : ( 'budget' ) ;
    public final void rule__Month__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:846:1: ( ( 'budget' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:847:1: ( 'budget' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:847:1: ( 'budget' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:848:1: 'budget'
            {
             before(grammarAccess.getMonthAccess().getBudgetKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Month__Group__1__Impl1735); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:861:1: rule__Month__Group__2 : rule__Month__Group__2__Impl rule__Month__Group__3 ;
    public final void rule__Month__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:865:1: ( rule__Month__Group__2__Impl rule__Month__Group__3 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:866:2: rule__Month__Group__2__Impl rule__Month__Group__3
            {
            pushFollow(FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__21766);
            rule__Month__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__3_in_rule__Month__Group__21769);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:873:1: rule__Month__Group__2__Impl : ( '{' ) ;
    public final void rule__Month__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:877:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:878:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:878:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:879:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__2__Impl1797); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:892:1: rule__Month__Group__3 : rule__Month__Group__3__Impl rule__Month__Group__4 ;
    public final void rule__Month__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:896:1: ( rule__Month__Group__3__Impl rule__Month__Group__4 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:897:2: rule__Month__Group__3__Impl rule__Month__Group__4
            {
            pushFollow(FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__31828);
            rule__Month__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__4_in_rule__Month__Group__31831);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:904:1: rule__Month__Group__3__Impl : ( ( rule__Month__BudgetEntriesAssignment_3 )* ) ;
    public final void rule__Month__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:908:1: ( ( ( rule__Month__BudgetEntriesAssignment_3 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:909:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:909:1: ( ( rule__Month__BudgetEntriesAssignment_3 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:910:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesAssignment_3()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:911:1: ( rule__Month__BudgetEntriesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:911:2: rule__Month__BudgetEntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl1858);
            	    rule__Month__BudgetEntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:921:1: rule__Month__Group__4 : rule__Month__Group__4__Impl rule__Month__Group__5 ;
    public final void rule__Month__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:925:1: ( rule__Month__Group__4__Impl rule__Month__Group__5 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:926:2: rule__Month__Group__4__Impl rule__Month__Group__5
            {
            pushFollow(FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__41889);
            rule__Month__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__5_in_rule__Month__Group__41892);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:933:1: rule__Month__Group__4__Impl : ( '}' ) ;
    public final void rule__Month__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:937:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:938:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:938:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:939:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Month__Group__4__Impl1920); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:952:1: rule__Month__Group__5 : rule__Month__Group__5__Impl rule__Month__Group__6 ;
    public final void rule__Month__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:956:1: ( rule__Month__Group__5__Impl rule__Month__Group__6 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:957:2: rule__Month__Group__5__Impl rule__Month__Group__6
            {
            pushFollow(FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__51951);
            rule__Month__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__6_in_rule__Month__Group__51954);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:964:1: rule__Month__Group__5__Impl : ( 'actual' ) ;
    public final void rule__Month__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:968:1: ( ( 'actual' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:969:1: ( 'actual' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:969:1: ( 'actual' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:970:1: 'actual'
            {
             before(grammarAccess.getMonthAccess().getActualKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Month__Group__5__Impl1982); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:983:1: rule__Month__Group__6 : rule__Month__Group__6__Impl rule__Month__Group__7 ;
    public final void rule__Month__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:987:1: ( rule__Month__Group__6__Impl rule__Month__Group__7 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:988:2: rule__Month__Group__6__Impl rule__Month__Group__7
            {
            pushFollow(FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__62013);
            rule__Month__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__7_in_rule__Month__Group__62016);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:995:1: rule__Month__Group__6__Impl : ( '{' ) ;
    public final void rule__Month__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:999:1: ( ( '{' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1000:1: ( '{' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1000:1: ( '{' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1001:1: '{'
            {
             before(grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__Month__Group__6__Impl2044); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1014:1: rule__Month__Group__7 : rule__Month__Group__7__Impl rule__Month__Group__8 ;
    public final void rule__Month__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1018:1: ( rule__Month__Group__7__Impl rule__Month__Group__8 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1019:2: rule__Month__Group__7__Impl rule__Month__Group__8
            {
            pushFollow(FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__72075);
            rule__Month__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Month__Group__8_in_rule__Month__Group__72078);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1026:1: rule__Month__Group__7__Impl : ( ( rule__Month__ActualEntriesAssignment_7 )* ) ;
    public final void rule__Month__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1030:1: ( ( ( rule__Month__ActualEntriesAssignment_7 )* ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1031:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1031:1: ( ( rule__Month__ActualEntriesAssignment_7 )* )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1032:1: ( rule__Month__ActualEntriesAssignment_7 )*
            {
             before(grammarAccess.getMonthAccess().getActualEntriesAssignment_7()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1033:1: ( rule__Month__ActualEntriesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1033:2: rule__Month__ActualEntriesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl2105);
            	    rule__Month__ActualEntriesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1043:1: rule__Month__Group__8 : rule__Month__Group__8__Impl ;
    public final void rule__Month__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1047:1: ( rule__Month__Group__8__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1048:2: rule__Month__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__82136);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1054:1: rule__Month__Group__8__Impl : ( '}' ) ;
    public final void rule__Month__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1058:1: ( ( '}' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1059:1: ( '}' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1059:1: ( '}' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1060:1: '}'
            {
             before(grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__Month__Group__8__Impl2164); 
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


    // $ANTLR start "rule__Entry__Group__0"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1091:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1095:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1096:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_rule__Entry__Group__0__Impl_in_rule__Entry__Group__02213);
            rule__Entry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entry__Group__1_in_rule__Entry__Group__02216);
            rule__Entry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0"


    // $ANTLR start "rule__Entry__Group__0__Impl"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1103:1: rule__Entry__Group__0__Impl : ( ( rule__Entry__CategoryAssignment_0 ) ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1107:1: ( ( ( rule__Entry__CategoryAssignment_0 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1108:1: ( ( rule__Entry__CategoryAssignment_0 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1108:1: ( ( rule__Entry__CategoryAssignment_0 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1109:1: ( rule__Entry__CategoryAssignment_0 )
            {
             before(grammarAccess.getEntryAccess().getCategoryAssignment_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1110:1: ( rule__Entry__CategoryAssignment_0 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1110:2: rule__Entry__CategoryAssignment_0
            {
            pushFollow(FOLLOW_rule__Entry__CategoryAssignment_0_in_rule__Entry__Group__0__Impl2243);
            rule__Entry__CategoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getCategoryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0__Impl"


    // $ANTLR start "rule__Entry__Group__1"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1120:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1124:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1125:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_rule__Entry__Group__1__Impl_in_rule__Entry__Group__12273);
            rule__Entry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entry__Group__2_in_rule__Entry__Group__12276);
            rule__Entry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__1"


    // $ANTLR start "rule__Entry__Group__1__Impl"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1132:1: rule__Entry__Group__1__Impl : ( ':' ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1136:1: ( ( ':' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1137:1: ( ':' )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1137:1: ( ':' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1138:1: ':'
            {
             before(grammarAccess.getEntryAccess().getColonKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Entry__Group__1__Impl2304); 
             after(grammarAccess.getEntryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__1__Impl"


    // $ANTLR start "rule__Entry__Group__2"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1151:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1155:1: ( rule__Entry__Group__2__Impl )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1156:2: rule__Entry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Entry__Group__2__Impl_in_rule__Entry__Group__22335);
            rule__Entry__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__2"


    // $ANTLR start "rule__Entry__Group__2__Impl"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1162:1: rule__Entry__Group__2__Impl : ( ( rule__Entry__AmountAssignment_2 ) ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1166:1: ( ( ( rule__Entry__AmountAssignment_2 ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1167:1: ( ( rule__Entry__AmountAssignment_2 ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1167:1: ( ( rule__Entry__AmountAssignment_2 ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1168:1: ( rule__Entry__AmountAssignment_2 )
            {
             before(grammarAccess.getEntryAccess().getAmountAssignment_2()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1169:1: ( rule__Entry__AmountAssignment_2 )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1169:2: rule__Entry__AmountAssignment_2
            {
            pushFollow(FOLLOW_rule__Entry__AmountAssignment_2_in_rule__Entry__Group__2__Impl2362);
            rule__Entry__AmountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getAmountAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__2__Impl"


    // $ANTLR start "rule__Library__NameAssignment_1"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1186:1: rule__Library__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Library__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1190:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1191:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1191:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1192:1: RULE_ID
            {
             before(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Library__NameAssignment_12403); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1201:1: rule__Library__CategoriesAssignment_3 : ( ruleCategory ) ;
    public final void rule__Library__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1205:1: ( ( ruleCategory ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1206:1: ( ruleCategory )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1206:1: ( ruleCategory )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1207:1: ruleCategory
            {
             before(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_32434);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1216:1: rule__Category__IncomeAssignment_0_0 : ( ( 'income' ) ) ;
    public final void rule__Category__IncomeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1220:1: ( ( ( 'income' ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1221:1: ( ( 'income' ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1221:1: ( ( 'income' ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1222:1: ( 'income' )
            {
             before(grammarAccess.getCategoryAccess().getIncomeIncomeKeyword_0_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1223:1: ( 'income' )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1224:1: 'income'
            {
             before(grammarAccess.getCategoryAccess().getIncomeIncomeKeyword_0_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Category__IncomeAssignment_0_02470); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1239:1: rule__Category__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1243:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1244:1: ( RULE_ID )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1244:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1245:1: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Category__NameAssignment_12509); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1254:1: rule__Year__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__Year__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1258:1: ( ( RULE_INT ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1259:1: ( RULE_INT )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1259:1: ( RULE_INT )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1260:1: RULE_INT
            {
             before(grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Year__NameAssignment_02540); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1269:1: rule__Year__LibraryAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Year__LibraryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1273:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1274:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1274:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1275:1: ( RULE_ID )
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1276:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1277:1: RULE_ID
            {
             before(grammarAccess.getYearAccess().getLibraryLibraryIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_22575); 
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1288:1: rule__Year__MonthsAssignment_4 : ( ruleMonth ) ;
    public final void rule__Year__MonthsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1292:1: ( ( ruleMonth ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1293:1: ( ruleMonth )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1293:1: ( ruleMonth )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1294:1: ruleMonth
            {
             before(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_42610);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1303:1: rule__Month__NameAssignment_0 : ( ruleMonthEnum ) ;
    public final void rule__Month__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1307:1: ( ( ruleMonthEnum ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1308:1: ( ruleMonthEnum )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1308:1: ( ruleMonthEnum )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1309:1: ruleMonthEnum
            {
             before(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_02641);
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1318:1: rule__Month__BudgetEntriesAssignment_3 : ( ruleEntry ) ;
    public final void rule__Month__BudgetEntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1322:1: ( ( ruleEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1323:1: ( ruleEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1323:1: ( ruleEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1324:1: ruleEntry
            {
             before(grammarAccess.getMonthAccess().getBudgetEntriesEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntry_in_rule__Month__BudgetEntriesAssignment_32672);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getMonthAccess().getBudgetEntriesEntryParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1333:1: rule__Month__ActualEntriesAssignment_7 : ( ruleEntry ) ;
    public final void rule__Month__ActualEntriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1337:1: ( ( ruleEntry ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1338:1: ( ruleEntry )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1338:1: ( ruleEntry )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1339:1: ruleEntry
            {
             before(grammarAccess.getMonthAccess().getActualEntriesEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleEntry_in_rule__Month__ActualEntriesAssignment_72703);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getMonthAccess().getActualEntriesEntryParserRuleCall_7_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entry__CategoryAssignment_0"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1348:1: rule__Entry__CategoryAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Entry__CategoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1352:1: ( ( ( RULE_ID ) ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1353:1: ( ( RULE_ID ) )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1353:1: ( ( RULE_ID ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1354:1: ( RULE_ID )
            {
             before(grammarAccess.getEntryAccess().getCategoryCategoryCrossReference_0_0()); 
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1355:1: ( RULE_ID )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1356:1: RULE_ID
            {
             before(grammarAccess.getEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entry__CategoryAssignment_02738); 
             after(grammarAccess.getEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEntryAccess().getCategoryCategoryCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__CategoryAssignment_0"


    // $ANTLR start "rule__Entry__AmountAssignment_2"
    // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1367:1: rule__Entry__AmountAssignment_2 : ( RULE_DOLLAR ) ;
    public final void rule__Entry__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1371:1: ( ( RULE_DOLLAR ) )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1372:1: ( RULE_DOLLAR )
            {
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1372:1: ( RULE_DOLLAR )
            // ../budgeting.ui/src-gen/budgeting/ui/contentassist/antlr/internal/InternalBudgeting.g:1373:1: RULE_DOLLAR
            {
             before(grammarAccess.getEntryAccess().getAmountDOLLARTerminalRuleCall_2_0()); 
            match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_rule__Entry__AmountAssignment_22773); 
             after(grammarAccess.getEntryAccess().getAmountDOLLARTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__AmountAssignment_2"

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
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__0_in_ruleEntry394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthEnum__Alternatives_in_ruleMonthEnum431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_rule__BudgetingFile__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYear_in_rule__BudgetingFile__Alternatives483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__IncomeAssignment_0_0_in_rule__Category__Alternatives_0515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Category__Alternatives_0534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MonthEnum__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MonthEnum__Alternatives590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MonthEnum__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MonthEnum__Alternatives632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MonthEnum__Alternatives653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MonthEnum__Alternatives674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MonthEnum__Alternatives695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MonthEnum__Alternatives716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MonthEnum__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MonthEnum__Alternatives758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MonthEnum__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MonthEnum__Alternatives800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__0833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Library__Group__1_in_rule__Library__Group__0836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Library__Group__0__Impl864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__1895 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Library__Group__2_in_rule__Library__Group__1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__2955 = new BitSet(new long[]{0x0000000108001000L});
    public static final BitSet FOLLOW_rule__Library__Group__3_in_rule__Library__Group__2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Library__Group__2__Impl986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31017 = new BitSet(new long[]{0x0000000108001000L});
    public static final BitSet FOLLOW_rule__Library__Group__4_in_rule__Library__Group__31020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__CategoriesAssignment_3_in_rule__Library__Group__3__Impl1047 = new BitSet(new long[]{0x0000000100001002L});
    public static final BitSet FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__41078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Library__Group__4__Impl1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__01147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__01150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Alternatives_0_in_rule__Category__Group__0__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__11207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_1_in_rule__Category__Group__1__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__0__Impl_in_rule__Year__Group__01268 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Year__Group__1_in_rule__Year__Group__01271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__NameAssignment_0_in_rule__Year__Group__0__Impl1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__1__Impl_in_rule__Year__Group__11328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Year__Group__2_in_rule__Year__Group__11331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Year__Group__1__Impl1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__2__Impl_in_rule__Year__Group__21390 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Year__Group__3_in_rule__Year__Group__21393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__LibraryAssignment_2_in_rule__Year__Group__2__Impl1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__3__Impl_in_rule__Year__Group__31450 = new BitSet(new long[]{0x0000000009FFE000L});
    public static final BitSet FOLLOW_rule__Year__Group__4_in_rule__Year__Group__31453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Year__Group__3__Impl1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__Group__4__Impl_in_rule__Year__Group__41512 = new BitSet(new long[]{0x0000000009FFE000L});
    public static final BitSet FOLLOW_rule__Year__Group__5_in_rule__Year__Group__41515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Year__MonthsAssignment_4_in_rule__Year__Group__4__Impl1542 = new BitSet(new long[]{0x0000000001FFE002L});
    public static final BitSet FOLLOW_rule__Year__Group__5__Impl_in_rule__Year__Group__51573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Year__Group__5__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__0__Impl_in_rule__Month__Group__01644 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Month__Group__1_in_rule__Month__Group__01647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__NameAssignment_0_in_rule__Month__Group__0__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__1__Impl_in_rule__Month__Group__11704 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Month__Group__2_in_rule__Month__Group__11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Month__Group__1__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__2__Impl_in_rule__Month__Group__21766 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Month__Group__3_in_rule__Month__Group__21769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__2__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__3__Impl_in_rule__Month__Group__31828 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Month__Group__4_in_rule__Month__Group__31831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__BudgetEntriesAssignment_3_in_rule__Month__Group__3__Impl1858 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Month__Group__4__Impl_in_rule__Month__Group__41889 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Month__Group__5_in_rule__Month__Group__41892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Month__Group__4__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__5__Impl_in_rule__Month__Group__51951 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Month__Group__6_in_rule__Month__Group__51954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Month__Group__5__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__6__Impl_in_rule__Month__Group__62013 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Month__Group__7_in_rule__Month__Group__62016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Month__Group__6__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__Group__7__Impl_in_rule__Month__Group__72075 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Month__Group__8_in_rule__Month__Group__72078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Month__ActualEntriesAssignment_7_in_rule__Month__Group__7__Impl2105 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Month__Group__8__Impl_in_rule__Month__Group__82136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Month__Group__8__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__0__Impl_in_rule__Entry__Group__02213 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Entry__Group__1_in_rule__Entry__Group__02216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__CategoryAssignment_0_in_rule__Entry__Group__0__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__1__Impl_in_rule__Entry__Group__12273 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entry__Group__2_in_rule__Entry__Group__12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Entry__Group__1__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__Group__2__Impl_in_rule__Entry__Group__22335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entry__AmountAssignment_2_in_rule__Entry__Group__2__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Library__NameAssignment_12403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__Library__CategoriesAssignment_32434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Category__IncomeAssignment_0_02470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Category__NameAssignment_12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Year__NameAssignment_02540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Year__LibraryAssignment_22575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_rule__Year__MonthsAssignment_42610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthEnum_in_rule__Month__NameAssignment_02641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_rule__Month__BudgetEntriesAssignment_32672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_rule__Month__ActualEntriesAssignment_72703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entry__CategoryAssignment_02738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_rule__Entry__AmountAssignment_22773 = new BitSet(new long[]{0x0000000000000002L});

}