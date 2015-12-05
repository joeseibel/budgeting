package budgeting.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import budgeting.services.BudgetingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBudgetingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'library'", "'{'", "'}'", "'income'", "'expense'", "'uses'", "'budget'", "'actual'", "':'", "'*'", "'cash'", "'on'", "'card'", "'from'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DECIMAL=7;
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
    public String getGrammarFileName() { return "../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g"; }



     	private BudgetingGrammarAccess grammarAccess;
     	
        public InternalBudgetingParser(TokenStream input, BudgetingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BudgetingFile";	
       	}
       	
       	@Override
       	protected BudgetingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBudgetingFile"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:68:1: entryRuleBudgetingFile returns [EObject current=null] : iv_ruleBudgetingFile= ruleBudgetingFile EOF ;
    public final EObject entryRuleBudgetingFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBudgetingFile = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:69:2: (iv_ruleBudgetingFile= ruleBudgetingFile EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:70:2: iv_ruleBudgetingFile= ruleBudgetingFile EOF
            {
             newCompositeNode(grammarAccess.getBudgetingFileRule()); 
            pushFollow(FOLLOW_ruleBudgetingFile_in_entryRuleBudgetingFile75);
            iv_ruleBudgetingFile=ruleBudgetingFile();

            state._fsp--;

             current =iv_ruleBudgetingFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBudgetingFile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBudgetingFile"


    // $ANTLR start "ruleBudgetingFile"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:77:1: ruleBudgetingFile returns [EObject current=null] : (this_Library_0= ruleLibrary | this_Year_1= ruleYear ) ;
    public final EObject ruleBudgetingFile() throws RecognitionException {
        EObject current = null;

        EObject this_Library_0 = null;

        EObject this_Year_1 = null;


         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:80:28: ( (this_Library_0= ruleLibrary | this_Year_1= ruleYear ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:81:1: (this_Library_0= ruleLibrary | this_Year_1= ruleYear )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:81:1: (this_Library_0= ruleLibrary | this_Year_1= ruleYear )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
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
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:82:5: this_Library_0= ruleLibrary
                    {
                     
                            newCompositeNode(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLibrary_in_ruleBudgetingFile132);
                    this_Library_0=ruleLibrary();

                    state._fsp--;

                     
                            current = this_Library_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:92:5: this_Year_1= ruleYear
                    {
                     
                            newCompositeNode(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleYear_in_ruleBudgetingFile159);
                    this_Year_1=ruleYear();

                    state._fsp--;

                     
                            current = this_Year_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBudgetingFile"


    // $ANTLR start "entryRuleLibrary"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:108:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:109:2: (iv_ruleLibrary= ruleLibrary EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:110:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_ruleLibrary_in_entryRuleLibrary194);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibrary204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:117:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_categories_3_0 = null;


         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:120:28: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}' ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:121:1: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}' )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:121:1: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}' )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:121:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLibrary241); 

                	newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
                
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:125:1: ( (lv_name_1_0= RULE_ID ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:126:1: (lv_name_1_0= RULE_ID )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:126:1: (lv_name_1_0= RULE_ID )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:127:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLibrary258); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLibraryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLibrary275); 

                	newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:147:1: ( (lv_categories_3_0= ruleCategory ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:148:1: (lv_categories_3_0= ruleCategory )
            	    {
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:148:1: (lv_categories_3_0= ruleCategory )
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:149:3: lv_categories_3_0= ruleCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCategory_in_ruleLibrary296);
            	    lv_categories_3_0=ruleCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"categories",
            	            		lv_categories_3_0, 
            	            		"Category");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleLibrary309); 

                	newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleCategory"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:177:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:178:2: (iv_ruleCategory= ruleCategory EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:179:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory345);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory355); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:186:1: ruleCategory returns [EObject current=null] : ( ( ( (lv_income_0_0= 'income' ) ) | otherlv_1= 'expense' ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token lv_income_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:189:28: ( ( ( ( (lv_income_0_0= 'income' ) ) | otherlv_1= 'expense' ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:190:1: ( ( ( (lv_income_0_0= 'income' ) ) | otherlv_1= 'expense' ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:190:1: ( ( ( (lv_income_0_0= 'income' ) ) | otherlv_1= 'expense' ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:190:2: ( ( (lv_income_0_0= 'income' ) ) | otherlv_1= 'expense' ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:190:2: ( ( (lv_income_0_0= 'income' ) ) | otherlv_1= 'expense' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:190:3: ( (lv_income_0_0= 'income' ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:190:3: ( (lv_income_0_0= 'income' ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:191:1: (lv_income_0_0= 'income' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:191:1: (lv_income_0_0= 'income' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:192:3: lv_income_0_0= 'income'
                    {
                    lv_income_0_0=(Token)match(input,15,FOLLOW_15_in_ruleCategory399); 

                            newLeafNode(lv_income_0_0, grammarAccess.getCategoryAccess().getIncomeIncomeKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCategoryRule());
                    	        }
                           		setWithLastConsumed(current, "income", true, "income");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:206:7: otherlv_1= 'expense'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCategory430); 

                        	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getExpenseKeyword_0_1());
                        

                    }
                    break;

            }

            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:210:2: ( (lv_name_2_0= RULE_ID ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:211:1: (lv_name_2_0= RULE_ID )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:211:1: (lv_name_2_0= RULE_ID )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:212:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCategory448); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleYear"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:236:1: entryRuleYear returns [EObject current=null] : iv_ruleYear= ruleYear EOF ;
    public final EObject entryRuleYear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYear = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:237:2: (iv_ruleYear= ruleYear EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:238:2: iv_ruleYear= ruleYear EOF
            {
             newCompositeNode(grammarAccess.getYearRule()); 
            pushFollow(FOLLOW_ruleYear_in_entryRuleYear489);
            iv_ruleYear=ruleYear();

            state._fsp--;

             current =iv_ruleYear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleYear499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYear"


    // $ANTLR start "ruleYear"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:245:1: ruleYear returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}' ) ;
    public final EObject ruleYear() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_months_4_0 = null;


         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:248:28: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}' ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:249:1: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}' )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:249:1: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}' )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:249:2: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}'
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:249:2: ( (lv_name_0_0= RULE_INT ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:250:1: (lv_name_0_0= RULE_INT )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:250:1: (lv_name_0_0= RULE_INT )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:251:3: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleYear541); 

            			newLeafNode(lv_name_0_0, grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getYearRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleYear558); 

                	newLeafNode(otherlv_1, grammarAccess.getYearAccess().getUsesKeyword_1());
                
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:271:1: ( (otherlv_2= RULE_ID ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:272:1: (otherlv_2= RULE_ID )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:272:1: (otherlv_2= RULE_ID )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:273:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getYearRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleYear578); 

            		newLeafNode(otherlv_2, grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleYear590); 

                	newLeafNode(otherlv_3, grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3());
                
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:288:1: ( (lv_months_4_0= ruleMonth ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=26 && LA4_0<=37)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:289:1: (lv_months_4_0= ruleMonth )
            	    {
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:289:1: (lv_months_4_0= ruleMonth )
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:290:3: lv_months_4_0= ruleMonth
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMonth_in_ruleYear611);
            	    lv_months_4_0=ruleMonth();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getYearRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"months",
            	            		lv_months_4_0, 
            	            		"Month");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleYear624); 

                	newLeafNode(otherlv_5, grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYear"


    // $ANTLR start "entryRuleMonth"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:318:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:319:2: (iv_ruleMonth= ruleMonth EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:320:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_ruleMonth_in_entryRuleMonth660);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonth670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonth"


    // $ANTLR start "ruleMonth"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:327:1: ruleMonth returns [EObject current=null] : ( ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}' ) ;
    public final EObject ruleMonth() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_name_0_0 = null;

        EObject lv_budgetEntries_3_0 = null;

        EObject lv_actualEntries_7_0 = null;


         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:330:28: ( ( ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}' ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:331:1: ( ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}' )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:331:1: ( ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}' )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:331:2: ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}'
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:331:2: ( (lv_name_0_0= ruleMonthEnum ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:332:1: (lv_name_0_0= ruleMonthEnum )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:332:1: (lv_name_0_0= ruleMonthEnum )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:333:3: lv_name_0_0= ruleMonthEnum
            {
             
            	        newCompositeNode(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMonthEnum_in_ruleMonth716);
            lv_name_0_0=ruleMonthEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMonthRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"MonthEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleMonth728); 

                	newLeafNode(otherlv_1, grammarAccess.getMonthAccess().getBudgetKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleMonth740); 

                	newLeafNode(otherlv_2, grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2());
                
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:357:1: ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:358:1: (lv_budgetEntries_3_0= ruleBudgetEntry )
            	    {
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:358:1: (lv_budgetEntries_3_0= ruleBudgetEntry )
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:359:3: lv_budgetEntries_3_0= ruleBudgetEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBudgetEntry_in_ruleMonth761);
            	    lv_budgetEntries_3_0=ruleBudgetEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMonthRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"budgetEntries",
            	            		lv_budgetEntries_3_0, 
            	            		"BudgetEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleMonth774); 

                	newLeafNode(otherlv_4, grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleMonth786); 

                	newLeafNode(otherlv_5, grammarAccess.getMonthAccess().getActualKeyword_5());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleMonth798); 

                	newLeafNode(otherlv_6, grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6());
                
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:387:1: ( (lv_actualEntries_7_0= ruleActualEntry ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:388:1: (lv_actualEntries_7_0= ruleActualEntry )
            	    {
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:388:1: (lv_actualEntries_7_0= ruleActualEntry )
            	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:389:3: lv_actualEntries_7_0= ruleActualEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActualEntry_in_ruleMonth819);
            	    lv_actualEntries_7_0=ruleActualEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMonthRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actualEntries",
            	            		lv_actualEntries_7_0, 
            	            		"ActualEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleMonth832); 

                	newLeafNode(otherlv_8, grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonth"


    // $ANTLR start "entryRuleBudgetEntry"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:417:1: entryRuleBudgetEntry returns [EObject current=null] : iv_ruleBudgetEntry= ruleBudgetEntry EOF ;
    public final EObject entryRuleBudgetEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBudgetEntry = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:418:2: (iv_ruleBudgetEntry= ruleBudgetEntry EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:419:2: iv_ruleBudgetEntry= ruleBudgetEntry EOF
            {
             newCompositeNode(grammarAccess.getBudgetEntryRule()); 
            pushFollow(FOLLOW_ruleBudgetEntry_in_entryRuleBudgetEntry868);
            iv_ruleBudgetEntry=ruleBudgetEntry();

            state._fsp--;

             current =iv_ruleBudgetEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBudgetEntry878); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBudgetEntry"


    // $ANTLR start "ruleBudgetEntry"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:426:1: ruleBudgetEntry returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) ) ) ;
    public final EObject ruleBudgetEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_amount_3_0 = null;

        AntlrDatatypeRuleToken lv_factor_9_0 = null;


         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:429:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) ) ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:430:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) ) )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:430:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==20) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==RULE_ID) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==RULE_DECIMAL) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:430:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:430:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:430:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:430:3: ()
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:431:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0(),
                                current);
                        

                    }

                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:436:2: ( (otherlv_1= RULE_ID ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:437:1: (otherlv_1= RULE_ID )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:437:1: (otherlv_1= RULE_ID )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:438:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBudgetEntryRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBudgetEntry933); 

                    		newLeafNode(otherlv_1, grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleBudgetEntry945); 

                        	newLeafNode(otherlv_2, grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:453:1: ( (lv_amount_3_0= ruleDollar ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:454:1: (lv_amount_3_0= ruleDollar )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:454:1: (lv_amount_3_0= ruleDollar )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:455:3: lv_amount_3_0= ruleDollar
                    {
                     
                    	        newCompositeNode(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDollar_in_ruleBudgetEntry966);
                    lv_amount_3_0=ruleDollar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBudgetEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_3_0, 
                            		"Dollar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:472:6: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:472:6: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:472:7: () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:472:7: ()
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:473:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0(),
                                current);
                        

                    }

                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:478:2: ( (otherlv_5= RULE_ID ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:479:1: (otherlv_5= RULE_ID )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:479:1: (otherlv_5= RULE_ID )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:480:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBudgetEntryRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBudgetEntry1003); 

                    		newLeafNode(otherlv_5, grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleBudgetEntry1015); 

                        	newLeafNode(otherlv_6, grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:495:1: ( (otherlv_7= RULE_ID ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:496:1: (otherlv_7= RULE_ID )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:496:1: (otherlv_7= RULE_ID )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:497:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBudgetEntryRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBudgetEntry1035); 

                    		newLeafNode(otherlv_7, grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleBudgetEntry1047); 

                        	newLeafNode(otherlv_8, grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:512:1: ( (lv_factor_9_0= ruleDouble ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:513:1: (lv_factor_9_0= ruleDouble )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:513:1: (lv_factor_9_0= ruleDouble )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:514:3: lv_factor_9_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDouble_in_ruleBudgetEntry1068);
                    lv_factor_9_0=ruleDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBudgetEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"factor",
                            		lv_factor_9_0, 
                            		"Double");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBudgetEntry"


    // $ANTLR start "entryRuleActualEntry"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:538:1: entryRuleActualEntry returns [EObject current=null] : iv_ruleActualEntry= ruleActualEntry EOF ;
    public final EObject entryRuleActualEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualEntry = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:539:2: (iv_ruleActualEntry= ruleActualEntry EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:540:2: iv_ruleActualEntry= ruleActualEntry EOF
            {
             newCompositeNode(grammarAccess.getActualEntryRule()); 
            pushFollow(FOLLOW_ruleActualEntry_in_entryRuleActualEntry1105);
            iv_ruleActualEntry=ruleActualEntry();

            state._fsp--;

             current =iv_ruleActualEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualEntry1115); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActualEntry"


    // $ANTLR start "ruleActualEntry"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:547:1: ruleActualEntry returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' ) ) ;
    public final EObject ruleActualEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_amount_3_0 = null;

        EObject lv_transactions_7_0 = null;


         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:550:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' ) ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:551:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' ) )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:551:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==20) ) {
                    alt9=1;
                }
                else if ( (LA9_1==13) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:551:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:551:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:551:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:551:3: ()
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:552:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0(),
                                current);
                        

                    }

                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:557:2: ( (otherlv_1= RULE_ID ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:558:1: (otherlv_1= RULE_ID )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:558:1: (otherlv_1= RULE_ID )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:559:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActualEntryRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualEntry1170); 

                    		newLeafNode(otherlv_1, grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleActualEntry1182); 

                        	newLeafNode(otherlv_2, grammarAccess.getActualEntryAccess().getColonKeyword_0_2());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:574:1: ( (lv_amount_3_0= ruleDollar ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:575:1: (lv_amount_3_0= ruleDollar )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:575:1: (lv_amount_3_0= ruleDollar )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:576:3: lv_amount_3_0= ruleDollar
                    {
                     
                    	        newCompositeNode(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDollar_in_ruleActualEntry1203);
                    lv_amount_3_0=ruleDollar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActualEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_3_0, 
                            		"Dollar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:593:6: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:593:6: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:593:7: () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}'
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:593:7: ()
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:594:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0(),
                                current);
                        

                    }

                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:599:2: ( (otherlv_5= RULE_ID ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:600:1: (otherlv_5= RULE_ID )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:600:1: (otherlv_5= RULE_ID )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:601:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActualEntryRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualEntry1240); 

                    		newLeafNode(otherlv_5, grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleActualEntry1252); 

                        	newLeafNode(otherlv_6, grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:616:1: ( (lv_transactions_7_0= ruleTransaction ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22||LA8_0==24) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:617:1: (lv_transactions_7_0= ruleTransaction )
                    	    {
                    	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:617:1: (lv_transactions_7_0= ruleTransaction )
                    	    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:618:3: lv_transactions_7_0= ruleTransaction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransaction_in_ruleActualEntry1273);
                    	    lv_transactions_7_0=ruleTransaction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActualEntryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transactions",
                    	            		lv_transactions_7_0, 
                    	            		"Transaction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleActualEntry1286); 

                        	newLeafNode(otherlv_8, grammarAccess.getActualEntryAccess().getRightCurlyBracketKeyword_1_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActualEntry"


    // $ANTLR start "entryRuleTransaction"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:646:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:647:2: (iv_ruleTransaction= ruleTransaction EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:648:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction1323);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction1333); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:655:1: ruleTransaction returns [EObject current=null] : ( ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) ) )? ) | ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_day_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_day_9_0=null;
        Token otherlv_10=null;
        Token lv_from_11_0=null;
        AntlrDatatypeRuleToken lv_amount_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_7_0 = null;


         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:658:28: ( ( ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) ) )? ) | ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) ) ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:659:1: ( ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) ) )? ) | ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) ) )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:659:1: ( ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) ) )? ) | ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:659:2: ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) ) )? )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:659:2: ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) ) )? )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:659:3: () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) ) )?
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:659:3: ()
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:660:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTransactionAccess().getCashTransactionAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleTransaction1380); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getCashKeyword_0_1());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:669:1: ( (lv_amount_2_0= ruleDollar ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:670:1: (lv_amount_2_0= ruleDollar )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:670:1: (lv_amount_2_0= ruleDollar )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:671:3: lv_amount_2_0= ruleDollar
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDollar_in_ruleTransaction1401);
                    lv_amount_2_0=ruleDollar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_2_0, 
                            		"Dollar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:687:2: (otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==23) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:687:4: otherlv_3= 'on' ( (lv_day_4_0= RULE_INT ) )
                            {
                            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleTransaction1414); 

                                	newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getOnKeyword_0_3_0());
                                
                            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:691:1: ( (lv_day_4_0= RULE_INT ) )
                            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:692:1: (lv_day_4_0= RULE_INT )
                            {
                            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:692:1: (lv_day_4_0= RULE_INT )
                            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:693:3: lv_day_4_0= RULE_INT
                            {
                            lv_day_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransaction1431); 

                            			newLeafNode(lv_day_4_0, grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_0_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTransactionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"day",
                                    		lv_day_4_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:710:6: ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:710:6: ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:710:7: () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:710:7: ()
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:711:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTransactionAccess().getCardTransactionAction_1_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTransaction1467); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransactionAccess().getCardKeyword_1_1());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:720:1: ( (lv_amount_7_0= ruleDollar ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:721:1: (lv_amount_7_0= ruleDollar )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:721:1: (lv_amount_7_0= ruleDollar )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:722:3: lv_amount_7_0= ruleDollar
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDollar_in_ruleTransaction1488);
                    lv_amount_7_0=ruleDollar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_7_0, 
                            		"Dollar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleTransaction1500); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransactionAccess().getOnKeyword_1_3());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:742:1: ( (lv_day_9_0= RULE_INT ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:743:1: (lv_day_9_0= RULE_INT )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:743:1: (lv_day_9_0= RULE_INT )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:744:3: lv_day_9_0= RULE_INT
                    {
                    lv_day_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransaction1517); 

                    			newLeafNode(lv_day_9_0, grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"day",
                            		lv_day_9_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleTransaction1534); 

                        	newLeafNode(otherlv_10, grammarAccess.getTransactionAccess().getFromKeyword_1_5());
                        
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:764:1: ( (lv_from_11_0= RULE_STRING ) )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:765:1: (lv_from_11_0= RULE_STRING )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:765:1: (lv_from_11_0= RULE_STRING )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:766:3: lv_from_11_0= RULE_STRING
                    {
                    lv_from_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransaction1551); 

                    			newLeafNode(lv_from_11_0, grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"from",
                            		lv_from_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleDollar"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:792:1: entryRuleDollar returns [String current=null] : iv_ruleDollar= ruleDollar EOF ;
    public final String entryRuleDollar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDollar = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:793:2: (iv_ruleDollar= ruleDollar EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:794:2: iv_ruleDollar= ruleDollar EOF
            {
             newCompositeNode(grammarAccess.getDollarRule()); 
            pushFollow(FOLLOW_ruleDollar_in_entryRuleDollar1596);
            iv_ruleDollar=ruleDollar();

            state._fsp--;

             current =iv_ruleDollar.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDollar1607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDollar"


    // $ANTLR start "ruleDollar"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:801:1: ruleDollar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECIMAL_0= RULE_DECIMAL ;
    public final AntlrDatatypeRuleToken ruleDollar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_0=null;

         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:804:28: (this_DECIMAL_0= RULE_DECIMAL )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:805:5: this_DECIMAL_0= RULE_DECIMAL
            {
            this_DECIMAL_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleDollar1646); 

            		current.merge(this_DECIMAL_0);
                
             
                newLeafNode(this_DECIMAL_0, grammarAccess.getDollarAccess().getDECIMALTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDollar"


    // $ANTLR start "entryRuleDouble"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:820:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:821:2: (iv_ruleDouble= ruleDouble EOF )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:822:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble1691);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble1702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:829:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DECIMAL_1= RULE_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:832:28: ( (this_INT_0= RULE_INT | this_DECIMAL_1= RULE_DECIMAL ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:833:1: (this_INT_0= RULE_INT | this_DECIMAL_1= RULE_DECIMAL )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:833:1: (this_INT_0= RULE_INT | this_DECIMAL_1= RULE_DECIMAL )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DECIMAL) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:833:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble1742); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:841:10: this_DECIMAL_1= RULE_DECIMAL
                    {
                    this_DECIMAL_1=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleDouble1768); 

                    		current.merge(this_DECIMAL_1);
                        
                     
                        newLeafNode(this_DECIMAL_1, grammarAccess.getDoubleAccess().getDECIMALTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "ruleMonthEnum"
    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:856:1: ruleMonthEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) ) ;
    public final Enumerator ruleMonthEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:858:28: ( ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) ) )
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:859:1: ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) )
            {
            // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:859:1: ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) )
            int alt13=12;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            case 30:
                {
                alt13=5;
                }
                break;
            case 31:
                {
                alt13=6;
                }
                break;
            case 32:
                {
                alt13=7;
                }
                break;
            case 33:
                {
                alt13=8;
                }
                break;
            case 34:
                {
                alt13=9;
                }
                break;
            case 35:
                {
                alt13=10;
                }
                break;
            case 36:
                {
                alt13=11;
                }
                break;
            case 37:
                {
                alt13=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:859:2: (enumLiteral_0= 'january' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:859:2: (enumLiteral_0= 'january' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:859:4: enumLiteral_0= 'january'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleMonthEnum1827); 

                            current = grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:865:6: (enumLiteral_1= 'february' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:865:6: (enumLiteral_1= 'february' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:865:8: enumLiteral_1= 'february'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleMonthEnum1844); 

                            current = grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:871:6: (enumLiteral_2= 'march' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:871:6: (enumLiteral_2= 'march' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:871:8: enumLiteral_2= 'march'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleMonthEnum1861); 

                            current = grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:877:6: (enumLiteral_3= 'april' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:877:6: (enumLiteral_3= 'april' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:877:8: enumLiteral_3= 'april'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_29_in_ruleMonthEnum1878); 

                            current = grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:883:6: (enumLiteral_4= 'may' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:883:6: (enumLiteral_4= 'may' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:883:8: enumLiteral_4= 'may'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_30_in_ruleMonthEnum1895); 

                            current = grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:889:6: (enumLiteral_5= 'june' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:889:6: (enumLiteral_5= 'june' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:889:8: enumLiteral_5= 'june'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_31_in_ruleMonthEnum1912); 

                            current = grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:895:6: (enumLiteral_6= 'july' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:895:6: (enumLiteral_6= 'july' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:895:8: enumLiteral_6= 'july'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_32_in_ruleMonthEnum1929); 

                            current = grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:901:6: (enumLiteral_7= 'august' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:901:6: (enumLiteral_7= 'august' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:901:8: enumLiteral_7= 'august'
                    {
                    enumLiteral_7=(Token)match(input,33,FOLLOW_33_in_ruleMonthEnum1946); 

                            current = grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:907:6: (enumLiteral_8= 'september' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:907:6: (enumLiteral_8= 'september' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:907:8: enumLiteral_8= 'september'
                    {
                    enumLiteral_8=(Token)match(input,34,FOLLOW_34_in_ruleMonthEnum1963); 

                            current = grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:913:6: (enumLiteral_9= 'october' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:913:6: (enumLiteral_9= 'october' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:913:8: enumLiteral_9= 'october'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_35_in_ruleMonthEnum1980); 

                            current = grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:919:6: (enumLiteral_10= 'november' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:919:6: (enumLiteral_10= 'november' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:919:8: enumLiteral_10= 'november'
                    {
                    enumLiteral_10=(Token)match(input,36,FOLLOW_36_in_ruleMonthEnum1997); 

                            current = grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:925:6: (enumLiteral_11= 'december' )
                    {
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:925:6: (enumLiteral_11= 'december' )
                    // ../budgeting/src-gen/budgeting/parser/antlr/internal/InternalBudgeting.g:925:8: enumLiteral_11= 'december'
                    {
                    enumLiteral_11=(Token)match(input,37,FOLLOW_37_in_ruleMonthEnum2014); 

                            current = grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonthEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBudgetingFile_in_entryRuleBudgetingFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBudgetingFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_ruleBudgetingFile132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYear_in_ruleBudgetingFile159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibrary204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLibrary241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLibrary258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLibrary275 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ruleCategory_in_ruleLibrary296 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleLibrary309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCategory399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16_in_ruleCategory430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCategory448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYear_in_entryRuleYear489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYear499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleYear541 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleYear558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleYear578 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleYear590 = new BitSet(new long[]{0x0000003FFC004000L});
    public static final BitSet FOLLOW_ruleMonth_in_ruleYear611 = new BitSet(new long[]{0x0000003FFC004000L});
    public static final BitSet FOLLOW_14_in_ruleYear624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonth_in_entryRuleMonth660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonth670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthEnum_in_ruleMonth716 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMonth728 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMonth740 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleBudgetEntry_in_ruleMonth761 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleMonth774 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMonth786 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMonth798 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleActualEntry_in_ruleMonth819 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleMonth832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBudgetEntry_in_entryRuleBudgetEntry868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBudgetEntry878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBudgetEntry933 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBudgetEntry945 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDollar_in_ruleBudgetEntry966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBudgetEntry1003 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBudgetEntry1015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBudgetEntry1035 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBudgetEntry1047 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleBudgetEntry1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualEntry_in_entryRuleActualEntry1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualEntry1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualEntry1170 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActualEntry1182 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDollar_in_ruleActualEntry1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualEntry1240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActualEntry1252 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleTransaction_in_ruleActualEntry1273 = new BitSet(new long[]{0x0000000001404000L});
    public static final BitSet FOLLOW_14_in_ruleActualEntry1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTransaction1380 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDollar_in_ruleTransaction1401 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleTransaction1414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransaction1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTransaction1467 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDollar_in_ruleTransaction1488 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransaction1500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransaction1517 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTransaction1534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransaction1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDollar_in_entryRuleDollar1596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDollar1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleDollar1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleDouble1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMonthEnum1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMonthEnum1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMonthEnum1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMonthEnum1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMonthEnum1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMonthEnum1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMonthEnum1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMonthEnum1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMonthEnum1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMonthEnum1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMonthEnum1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMonthEnum2014 = new BitSet(new long[]{0x0000000000000002L});

}