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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'library'", "'{'", "'}'", "'income'", "'expense'", "'['", "','", "']'", "'uses'", "'budget'", "'actual'", "':'", "'*'", "'cash'", "'on'", "'card'", "'from'", "'january'", "'february'", "'march'", "'april'", "'may'", "'june'", "'july'", "'august'", "'september'", "'october'", "'november'", "'december'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    // InternalBudgeting.g:68:1: entryRuleBudgetingFile returns [EObject current=null] : iv_ruleBudgetingFile= ruleBudgetingFile EOF ;
    public final EObject entryRuleBudgetingFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBudgetingFile = null;


        try {
            // InternalBudgeting.g:69:2: (iv_ruleBudgetingFile= ruleBudgetingFile EOF )
            // InternalBudgeting.g:70:2: iv_ruleBudgetingFile= ruleBudgetingFile EOF
            {
             newCompositeNode(grammarAccess.getBudgetingFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBudgetingFile=ruleBudgetingFile();

            state._fsp--;

             current =iv_ruleBudgetingFile; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:77:1: ruleBudgetingFile returns [EObject current=null] : (this_Library_0= ruleLibrary | this_Year_1= ruleYear ) ;
    public final EObject ruleBudgetingFile() throws RecognitionException {
        EObject current = null;

        EObject this_Library_0 = null;

        EObject this_Year_1 = null;


         enterRule(); 
            
        try {
            // InternalBudgeting.g:80:28: ( (this_Library_0= ruleLibrary | this_Year_1= ruleYear ) )
            // InternalBudgeting.g:81:1: (this_Library_0= ruleLibrary | this_Year_1= ruleYear )
            {
            // InternalBudgeting.g:81:1: (this_Library_0= ruleLibrary | this_Year_1= ruleYear )
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
                    // InternalBudgeting.g:82:5: this_Library_0= ruleLibrary
                    {
                     
                            newCompositeNode(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Library_0=ruleLibrary();

                    state._fsp--;

                     
                            current = this_Library_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:92:5: this_Year_1= ruleYear
                    {
                     
                            newCompositeNode(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalBudgeting.g:108:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalBudgeting.g:109:2: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalBudgeting.g:110:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:117:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_categories_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBudgeting.g:120:28: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}' ) )
            // InternalBudgeting.g:121:1: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}' )
            {
            // InternalBudgeting.g:121:1: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}' )
            // InternalBudgeting.g:121:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_categories_3_0= ruleCategory ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
                
            // InternalBudgeting.g:125:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalBudgeting.g:126:1: (lv_name_1_0= RULE_ID )
            {
            // InternalBudgeting.g:126:1: (lv_name_1_0= RULE_ID )
            // InternalBudgeting.g:127:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLibraryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalBudgeting.g:147:1: ( (lv_categories_3_0= ruleCategory ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBudgeting.g:148:1: (lv_categories_3_0= ruleCategory )
            	    {
            	    // InternalBudgeting.g:148:1: (lv_categories_3_0= ruleCategory )
            	    // InternalBudgeting.g:149:3: lv_categories_3_0= ruleCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_categories_3_0=ruleCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"categories",
            	            		lv_categories_3_0, 
            	            		"budgeting.Budgeting.Category");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBudgeting.g:177:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalBudgeting.g:178:2: (iv_ruleCategory= ruleCategory EOF )
            // InternalBudgeting.g:179:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:186:1: ruleCategory returns [EObject current=null] : ( ( () otherlv_1= 'income' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'expense' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' )? ) ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_patterns_7_0=null;
        Token otherlv_8=null;
        Token lv_patterns_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // InternalBudgeting.g:189:28: ( ( ( () otherlv_1= 'income' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'expense' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' )? ) ) )
            // InternalBudgeting.g:190:1: ( ( () otherlv_1= 'income' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'expense' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' )? ) )
            {
            // InternalBudgeting.g:190:1: ( ( () otherlv_1= 'income' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'expense' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBudgeting.g:190:2: ( () otherlv_1= 'income' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // InternalBudgeting.g:190:2: ( () otherlv_1= 'income' ( (lv_name_2_0= RULE_ID ) ) )
                    // InternalBudgeting.g:190:3: () otherlv_1= 'income' ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalBudgeting.g:190:3: ()
                    // InternalBudgeting.g:191:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCategoryAccess().getIncomeCategoryAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                        	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getIncomeKeyword_0_1());
                        
                    // InternalBudgeting.g:200:1: ( (lv_name_2_0= RULE_ID ) )
                    // InternalBudgeting.g:201:1: (lv_name_2_0= RULE_ID )
                    {
                    // InternalBudgeting.g:201:1: (lv_name_2_0= RULE_ID )
                    // InternalBudgeting.g:202:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCategoryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:219:6: ( () otherlv_4= 'expense' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' )? )
                    {
                    // InternalBudgeting.g:219:6: ( () otherlv_4= 'expense' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' )? )
                    // InternalBudgeting.g:219:7: () otherlv_4= 'expense' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' )?
                    {
                    // InternalBudgeting.g:219:7: ()
                    // InternalBudgeting.g:220:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCategoryAccess().getExpenseCategoryAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getExpenseKeyword_1_1());
                        
                    // InternalBudgeting.g:229:1: ( (lv_name_5_0= RULE_ID ) )
                    // InternalBudgeting.g:230:1: (lv_name_5_0= RULE_ID )
                    {
                    // InternalBudgeting.g:230:1: (lv_name_5_0= RULE_ID )
                    // InternalBudgeting.g:231:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCategoryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }

                    // InternalBudgeting.g:247:2: (otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalBudgeting.g:247:4: otherlv_6= '[' ( (lv_patterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )* otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_7); 

                                	newLeafNode(otherlv_6, grammarAccess.getCategoryAccess().getLeftSquareBracketKeyword_1_3_0());
                                
                            // InternalBudgeting.g:251:1: ( (lv_patterns_7_0= RULE_STRING ) )
                            // InternalBudgeting.g:252:1: (lv_patterns_7_0= RULE_STRING )
                            {
                            // InternalBudgeting.g:252:1: (lv_patterns_7_0= RULE_STRING )
                            // InternalBudgeting.g:253:3: lv_patterns_7_0= RULE_STRING
                            {
                            lv_patterns_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                            			newLeafNode(lv_patterns_7_0, grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCategoryRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"patterns",
                                    		lv_patterns_7_0, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }


                            }

                            // InternalBudgeting.g:269:2: (otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==18) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalBudgeting.g:269:4: otherlv_8= ',' ( (lv_patterns_9_0= RULE_STRING ) )
                            	    {
                            	    otherlv_8=(Token)match(input,18,FOLLOW_7); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getCategoryAccess().getCommaKeyword_1_3_2_0());
                            	        
                            	    // InternalBudgeting.g:273:1: ( (lv_patterns_9_0= RULE_STRING ) )
                            	    // InternalBudgeting.g:274:1: (lv_patterns_9_0= RULE_STRING )
                            	    {
                            	    // InternalBudgeting.g:274:1: (lv_patterns_9_0= RULE_STRING )
                            	    // InternalBudgeting.g:275:3: lv_patterns_9_0= RULE_STRING
                            	    {
                            	    lv_patterns_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                            	    			newLeafNode(lv_patterns_9_0, grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_2_1_0()); 
                            	    		

                            	    	        if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getCategoryRule());
                            	    	        }
                            	           		addWithLastConsumed(
                            	           			current, 
                            	           			"patterns",
                            	            		lv_patterns_9_0, 
                            	            		"org.eclipse.xtext.common.Terminals.STRING");
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,19,FOLLOW_2); 

                                	newLeafNode(otherlv_10, grammarAccess.getCategoryAccess().getRightSquareBracketKeyword_1_3_3());
                                

                            }
                            break;

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleYear"
    // InternalBudgeting.g:303:1: entryRuleYear returns [EObject current=null] : iv_ruleYear= ruleYear EOF ;
    public final EObject entryRuleYear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYear = null;


        try {
            // InternalBudgeting.g:304:2: (iv_ruleYear= ruleYear EOF )
            // InternalBudgeting.g:305:2: iv_ruleYear= ruleYear EOF
            {
             newCompositeNode(grammarAccess.getYearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYear=ruleYear();

            state._fsp--;

             current =iv_ruleYear; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:312:1: ruleYear returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}' ) ;
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
            // InternalBudgeting.g:315:28: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}' ) )
            // InternalBudgeting.g:316:1: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}' )
            {
            // InternalBudgeting.g:316:1: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}' )
            // InternalBudgeting.g:316:2: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_months_4_0= ruleMonth ) )* otherlv_5= '}'
            {
            // InternalBudgeting.g:316:2: ( (lv_name_0_0= RULE_INT ) )
            // InternalBudgeting.g:317:1: (lv_name_0_0= RULE_INT )
            {
            // InternalBudgeting.g:317:1: (lv_name_0_0= RULE_INT )
            // InternalBudgeting.g:318:3: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            			newLeafNode(lv_name_0_0, grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getYearRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getYearAccess().getUsesKeyword_1());
                
            // InternalBudgeting.g:338:1: ( (otherlv_2= RULE_ID ) )
            // InternalBudgeting.g:339:1: (otherlv_2= RULE_ID )
            {
            // InternalBudgeting.g:339:1: (otherlv_2= RULE_ID )
            // InternalBudgeting.g:340:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getYearRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            		newLeafNode(otherlv_2, grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalBudgeting.g:355:1: ( (lv_months_4_0= ruleMonth ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=29 && LA6_0<=40)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBudgeting.g:356:1: (lv_months_4_0= ruleMonth )
            	    {
            	    // InternalBudgeting.g:356:1: (lv_months_4_0= ruleMonth )
            	    // InternalBudgeting.g:357:3: lv_months_4_0= ruleMonth
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_months_4_0=ruleMonth();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getYearRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"months",
            	            		lv_months_4_0, 
            	            		"budgeting.Budgeting.Month");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBudgeting.g:385:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // InternalBudgeting.g:386:2: (iv_ruleMonth= ruleMonth EOF )
            // InternalBudgeting.g:387:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:394:1: ruleMonth returns [EObject current=null] : ( ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}' ) ;
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
            // InternalBudgeting.g:397:28: ( ( ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}' ) )
            // InternalBudgeting.g:398:1: ( ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}' )
            {
            // InternalBudgeting.g:398:1: ( ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}' )
            // InternalBudgeting.g:398:2: ( (lv_name_0_0= ruleMonthEnum ) ) otherlv_1= 'budget' otherlv_2= '{' ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )* otherlv_4= '}' otherlv_5= 'actual' otherlv_6= '{' ( (lv_actualEntries_7_0= ruleActualEntry ) )* otherlv_8= '}'
            {
            // InternalBudgeting.g:398:2: ( (lv_name_0_0= ruleMonthEnum ) )
            // InternalBudgeting.g:399:1: (lv_name_0_0= ruleMonthEnum )
            {
            // InternalBudgeting.g:399:1: (lv_name_0_0= ruleMonthEnum )
            // InternalBudgeting.g:400:3: lv_name_0_0= ruleMonthEnum
            {
             
            	        newCompositeNode(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleMonthEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMonthRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"budgeting.Budgeting.MonthEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getMonthAccess().getBudgetKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_12); 

                	newLeafNode(otherlv_2, grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalBudgeting.g:424:1: ( (lv_budgetEntries_3_0= ruleBudgetEntry ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBudgeting.g:425:1: (lv_budgetEntries_3_0= ruleBudgetEntry )
            	    {
            	    // InternalBudgeting.g:425:1: (lv_budgetEntries_3_0= ruleBudgetEntry )
            	    // InternalBudgeting.g:426:3: lv_budgetEntries_3_0= ruleBudgetEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_budgetEntries_3_0=ruleBudgetEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMonthRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"budgetEntries",
            	            		lv_budgetEntries_3_0, 
            	            		"budgeting.Budgeting.BudgetEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_13); 

                	newLeafNode(otherlv_4, grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,22,FOLLOW_4); 

                	newLeafNode(otherlv_5, grammarAccess.getMonthAccess().getActualKeyword_5());
                
            otherlv_6=(Token)match(input,13,FOLLOW_12); 

                	newLeafNode(otherlv_6, grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalBudgeting.g:454:1: ( (lv_actualEntries_7_0= ruleActualEntry ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBudgeting.g:455:1: (lv_actualEntries_7_0= ruleActualEntry )
            	    {
            	    // InternalBudgeting.g:455:1: (lv_actualEntries_7_0= ruleActualEntry )
            	    // InternalBudgeting.g:456:3: lv_actualEntries_7_0= ruleActualEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_actualEntries_7_0=ruleActualEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMonthRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actualEntries",
            	            		lv_actualEntries_7_0, 
            	            		"budgeting.Budgeting.ActualEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBudgeting.g:484:1: entryRuleBudgetEntry returns [EObject current=null] : iv_ruleBudgetEntry= ruleBudgetEntry EOF ;
    public final EObject entryRuleBudgetEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBudgetEntry = null;


        try {
            // InternalBudgeting.g:485:2: (iv_ruleBudgetEntry= ruleBudgetEntry EOF )
            // InternalBudgeting.g:486:2: iv_ruleBudgetEntry= ruleBudgetEntry EOF
            {
             newCompositeNode(grammarAccess.getBudgetEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBudgetEntry=ruleBudgetEntry();

            state._fsp--;

             current =iv_ruleBudgetEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:493:1: ruleBudgetEntry returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) ) ) ;
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
            // InternalBudgeting.g:496:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) ) ) )
            // InternalBudgeting.g:497:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) ) )
            {
            // InternalBudgeting.g:497:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==RULE_ID) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==RULE_DECIMAL) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
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
                    // InternalBudgeting.g:497:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) )
                    {
                    // InternalBudgeting.g:497:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) )
                    // InternalBudgeting.g:497:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) )
                    {
                    // InternalBudgeting.g:497:3: ()
                    // InternalBudgeting.g:498:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0(),
                                current);
                        

                    }

                    // InternalBudgeting.g:503:2: ( (otherlv_1= RULE_ID ) )
                    // InternalBudgeting.g:504:1: (otherlv_1= RULE_ID )
                    {
                    // InternalBudgeting.g:504:1: (otherlv_1= RULE_ID )
                    // InternalBudgeting.g:505:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBudgetEntryRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_1, grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_15); 

                        	newLeafNode(otherlv_2, grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2());
                        
                    // InternalBudgeting.g:520:1: ( (lv_amount_3_0= ruleDollar ) )
                    // InternalBudgeting.g:521:1: (lv_amount_3_0= ruleDollar )
                    {
                    // InternalBudgeting.g:521:1: (lv_amount_3_0= ruleDollar )
                    // InternalBudgeting.g:522:3: lv_amount_3_0= ruleDollar
                    {
                     
                    	        newCompositeNode(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_amount_3_0=ruleDollar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBudgetEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_3_0, 
                            		"budgeting.Budgeting.Dollar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:539:6: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) )
                    {
                    // InternalBudgeting.g:539:6: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) ) )
                    // InternalBudgeting.g:539:7: () ( (otherlv_5= RULE_ID ) ) otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) otherlv_8= '*' ( (lv_factor_9_0= ruleDouble ) )
                    {
                    // InternalBudgeting.g:539:7: ()
                    // InternalBudgeting.g:540:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0(),
                                current);
                        

                    }

                    // InternalBudgeting.g:545:2: ( (otherlv_5= RULE_ID ) )
                    // InternalBudgeting.g:546:1: (otherlv_5= RULE_ID )
                    {
                    // InternalBudgeting.g:546:1: (otherlv_5= RULE_ID )
                    // InternalBudgeting.g:547:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBudgetEntryRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_5, grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2());
                        
                    // InternalBudgeting.g:562:1: ( (otherlv_7= RULE_ID ) )
                    // InternalBudgeting.g:563:1: (otherlv_7= RULE_ID )
                    {
                    // InternalBudgeting.g:563:1: (otherlv_7= RULE_ID )
                    // InternalBudgeting.g:564:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBudgetEntryRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_16); 

                    		newLeafNode(otherlv_7, grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_17); 

                        	newLeafNode(otherlv_8, grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4());
                        
                    // InternalBudgeting.g:579:1: ( (lv_factor_9_0= ruleDouble ) )
                    // InternalBudgeting.g:580:1: (lv_factor_9_0= ruleDouble )
                    {
                    // InternalBudgeting.g:580:1: (lv_factor_9_0= ruleDouble )
                    // InternalBudgeting.g:581:3: lv_factor_9_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_factor_9_0=ruleDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBudgetEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"factor",
                            		lv_factor_9_0, 
                            		"budgeting.Budgeting.Double");
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
    // InternalBudgeting.g:605:1: entryRuleActualEntry returns [EObject current=null] : iv_ruleActualEntry= ruleActualEntry EOF ;
    public final EObject entryRuleActualEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualEntry = null;


        try {
            // InternalBudgeting.g:606:2: (iv_ruleActualEntry= ruleActualEntry EOF )
            // InternalBudgeting.g:607:2: iv_ruleActualEntry= ruleActualEntry EOF
            {
             newCompositeNode(grammarAccess.getActualEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActualEntry=ruleActualEntry();

            state._fsp--;

             current =iv_ruleActualEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:614:1: ruleActualEntry returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' ) ) ;
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
            // InternalBudgeting.g:617:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' ) ) )
            // InternalBudgeting.g:618:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' ) )
            {
            // InternalBudgeting.g:618:1: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==23) ) {
                    alt11=1;
                }
                else if ( (LA11_1==13) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBudgeting.g:618:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) )
                    {
                    // InternalBudgeting.g:618:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) ) )
                    // InternalBudgeting.g:618:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_amount_3_0= ruleDollar ) )
                    {
                    // InternalBudgeting.g:618:3: ()
                    // InternalBudgeting.g:619:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0(),
                                current);
                        

                    }

                    // InternalBudgeting.g:624:2: ( (otherlv_1= RULE_ID ) )
                    // InternalBudgeting.g:625:1: (otherlv_1= RULE_ID )
                    {
                    // InternalBudgeting.g:625:1: (otherlv_1= RULE_ID )
                    // InternalBudgeting.g:626:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActualEntryRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_1, grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_15); 

                        	newLeafNode(otherlv_2, grammarAccess.getActualEntryAccess().getColonKeyword_0_2());
                        
                    // InternalBudgeting.g:641:1: ( (lv_amount_3_0= ruleDollar ) )
                    // InternalBudgeting.g:642:1: (lv_amount_3_0= ruleDollar )
                    {
                    // InternalBudgeting.g:642:1: (lv_amount_3_0= ruleDollar )
                    // InternalBudgeting.g:643:3: lv_amount_3_0= ruleDollar
                    {
                     
                    	        newCompositeNode(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_amount_3_0=ruleDollar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActualEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_3_0, 
                            		"budgeting.Budgeting.Dollar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:660:6: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' )
                    {
                    // InternalBudgeting.g:660:6: ( () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}' )
                    // InternalBudgeting.g:660:7: () ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_transactions_7_0= ruleTransaction ) )+ otherlv_8= '}'
                    {
                    // InternalBudgeting.g:660:7: ()
                    // InternalBudgeting.g:661:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0(),
                                current);
                        

                    }

                    // InternalBudgeting.g:666:2: ( (otherlv_5= RULE_ID ) )
                    // InternalBudgeting.g:667:1: (otherlv_5= RULE_ID )
                    {
                    // InternalBudgeting.g:667:1: (otherlv_5= RULE_ID )
                    // InternalBudgeting.g:668:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActualEntryRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_4); 

                    		newLeafNode(otherlv_5, grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_18); 

                        	newLeafNode(otherlv_6, grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2());
                        
                    // InternalBudgeting.g:683:1: ( (lv_transactions_7_0= ruleTransaction ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==25||LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBudgeting.g:684:1: (lv_transactions_7_0= ruleTransaction )
                    	    {
                    	    // InternalBudgeting.g:684:1: (lv_transactions_7_0= ruleTransaction )
                    	    // InternalBudgeting.g:685:3: lv_transactions_7_0= ruleTransaction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_19);
                    	    lv_transactions_7_0=ruleTransaction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActualEntryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transactions",
                    	            		lv_transactions_7_0, 
                    	            		"budgeting.Budgeting.Transaction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBudgeting.g:713:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalBudgeting.g:714:2: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalBudgeting.g:715:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:722:1: ruleTransaction returns [EObject current=null] : ( ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) ) )? ) | ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_day_9_0=null;
        Token otherlv_10=null;
        Token lv_from_11_0=null;
        AntlrDatatypeRuleToken lv_amount_2_0 = null;

        AntlrDatatypeRuleToken lv_day_4_0 = null;

        AntlrDatatypeRuleToken lv_amount_7_0 = null;


         enterRule(); 
            
        try {
            // InternalBudgeting.g:725:28: ( ( ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) ) )? ) | ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) ) ) )
            // InternalBudgeting.g:726:1: ( ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) ) )? ) | ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) ) )
            {
            // InternalBudgeting.g:726:1: ( ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) ) )? ) | ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBudgeting.g:726:2: ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) ) )? )
                    {
                    // InternalBudgeting.g:726:2: ( () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) ) )? )
                    // InternalBudgeting.g:726:3: () otherlv_1= 'cash' ( (lv_amount_2_0= ruleDollar ) ) (otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) ) )?
                    {
                    // InternalBudgeting.g:726:3: ()
                    // InternalBudgeting.g:727:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTransactionAccess().getCashTransactionAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_15); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getCashKeyword_0_1());
                        
                    // InternalBudgeting.g:736:1: ( (lv_amount_2_0= ruleDollar ) )
                    // InternalBudgeting.g:737:1: (lv_amount_2_0= ruleDollar )
                    {
                    // InternalBudgeting.g:737:1: (lv_amount_2_0= ruleDollar )
                    // InternalBudgeting.g:738:3: lv_amount_2_0= ruleDollar
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_20);
                    lv_amount_2_0=ruleDollar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_2_0, 
                            		"budgeting.Budgeting.Dollar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalBudgeting.g:754:2: (otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==26) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalBudgeting.g:754:4: otherlv_3= 'on' ( (lv_day_4_0= ruleOptionalInt ) )
                            {
                            otherlv_3=(Token)match(input,26,FOLLOW_21); 

                                	newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getOnKeyword_0_3_0());
                                
                            // InternalBudgeting.g:758:1: ( (lv_day_4_0= ruleOptionalInt ) )
                            // InternalBudgeting.g:759:1: (lv_day_4_0= ruleOptionalInt )
                            {
                            // InternalBudgeting.g:759:1: (lv_day_4_0= ruleOptionalInt )
                            // InternalBudgeting.g:760:3: lv_day_4_0= ruleOptionalInt
                            {
                             
                            	        newCompositeNode(grammarAccess.getTransactionAccess().getDayOptionalIntParserRuleCall_0_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_2);
                            lv_day_4_0=ruleOptionalInt();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTransactionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"day",
                                    		lv_day_4_0, 
                                    		"budgeting.Budgeting.OptionalInt");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:777:6: ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) )
                    {
                    // InternalBudgeting.g:777:6: ( () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) ) )
                    // InternalBudgeting.g:777:7: () otherlv_6= 'card' ( (lv_amount_7_0= ruleDollar ) ) otherlv_8= 'on' ( (lv_day_9_0= RULE_INT ) ) otherlv_10= 'from' ( (lv_from_11_0= RULE_STRING ) )
                    {
                    // InternalBudgeting.g:777:7: ()
                    // InternalBudgeting.g:778:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTransactionAccess().getCardTransactionAction_1_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_15); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransactionAccess().getCardKeyword_1_1());
                        
                    // InternalBudgeting.g:787:1: ( (lv_amount_7_0= ruleDollar ) )
                    // InternalBudgeting.g:788:1: (lv_amount_7_0= ruleDollar )
                    {
                    // InternalBudgeting.g:788:1: (lv_amount_7_0= ruleDollar )
                    // InternalBudgeting.g:789:3: lv_amount_7_0= ruleDollar
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_22);
                    lv_amount_7_0=ruleDollar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_7_0, 
                            		"budgeting.Budgeting.Dollar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_21); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransactionAccess().getOnKeyword_1_3());
                        
                    // InternalBudgeting.g:809:1: ( (lv_day_9_0= RULE_INT ) )
                    // InternalBudgeting.g:810:1: (lv_day_9_0= RULE_INT )
                    {
                    // InternalBudgeting.g:810:1: (lv_day_9_0= RULE_INT )
                    // InternalBudgeting.g:811:3: lv_day_9_0= RULE_INT
                    {
                    lv_day_9_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    			newLeafNode(lv_day_9_0, grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"day",
                            		lv_day_9_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,28,FOLLOW_7); 

                        	newLeafNode(otherlv_10, grammarAccess.getTransactionAccess().getFromKeyword_1_5());
                        
                    // InternalBudgeting.g:831:1: ( (lv_from_11_0= RULE_STRING ) )
                    // InternalBudgeting.g:832:1: (lv_from_11_0= RULE_STRING )
                    {
                    // InternalBudgeting.g:832:1: (lv_from_11_0= RULE_STRING )
                    // InternalBudgeting.g:833:3: lv_from_11_0= RULE_STRING
                    {
                    lv_from_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_from_11_0, grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"from",
                            		lv_from_11_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

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
    // InternalBudgeting.g:857:1: entryRuleDollar returns [String current=null] : iv_ruleDollar= ruleDollar EOF ;
    public final String entryRuleDollar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDollar = null;


        try {
            // InternalBudgeting.g:858:2: (iv_ruleDollar= ruleDollar EOF )
            // InternalBudgeting.g:859:2: iv_ruleDollar= ruleDollar EOF
            {
             newCompositeNode(grammarAccess.getDollarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDollar=ruleDollar();

            state._fsp--;

             current =iv_ruleDollar.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:866:1: ruleDollar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECIMAL_0= RULE_DECIMAL ;
    public final AntlrDatatypeRuleToken ruleDollar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_0=null;

         enterRule(); 
            
        try {
            // InternalBudgeting.g:869:28: (this_DECIMAL_0= RULE_DECIMAL )
            // InternalBudgeting.g:870:5: this_DECIMAL_0= RULE_DECIMAL
            {
            this_DECIMAL_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

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
    // InternalBudgeting.g:885:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalBudgeting.g:886:2: (iv_ruleDouble= ruleDouble EOF )
            // InternalBudgeting.g:887:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBudgeting.g:894:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DECIMAL_1= RULE_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // InternalBudgeting.g:897:28: ( (this_INT_0= RULE_INT | this_DECIMAL_1= RULE_DECIMAL ) )
            // InternalBudgeting.g:898:1: (this_INT_0= RULE_INT | this_DECIMAL_1= RULE_DECIMAL )
            {
            // InternalBudgeting.g:898:1: (this_INT_0= RULE_INT | this_DECIMAL_1= RULE_DECIMAL )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_DECIMAL) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBudgeting.g:898:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:906:10: this_DECIMAL_1= RULE_DECIMAL
                    {
                    this_DECIMAL_1=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOptionalInt"
    // InternalBudgeting.g:921:1: entryRuleOptionalInt returns [String current=null] : iv_ruleOptionalInt= ruleOptionalInt EOF ;
    public final String entryRuleOptionalInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptionalInt = null;


        try {
            // InternalBudgeting.g:922:2: (iv_ruleOptionalInt= ruleOptionalInt EOF )
            // InternalBudgeting.g:923:2: iv_ruleOptionalInt= ruleOptionalInt EOF
            {
             newCompositeNode(grammarAccess.getOptionalIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionalInt=ruleOptionalInt();

            state._fsp--;

             current =iv_ruleOptionalInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOptionalInt"


    // $ANTLR start "ruleOptionalInt"
    // InternalBudgeting.g:930:1: ruleOptionalInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleOptionalInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // InternalBudgeting.g:933:28: (this_INT_0= RULE_INT )
            // InternalBudgeting.g:934:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getOptionalIntAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleOptionalInt"


    // $ANTLR start "ruleMonthEnum"
    // InternalBudgeting.g:949:1: ruleMonthEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) ) ;
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
            // InternalBudgeting.g:951:28: ( ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) ) )
            // InternalBudgeting.g:952:1: ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) )
            {
            // InternalBudgeting.g:952:1: ( (enumLiteral_0= 'january' ) | (enumLiteral_1= 'february' ) | (enumLiteral_2= 'march' ) | (enumLiteral_3= 'april' ) | (enumLiteral_4= 'may' ) | (enumLiteral_5= 'june' ) | (enumLiteral_6= 'july' ) | (enumLiteral_7= 'august' ) | (enumLiteral_8= 'september' ) | (enumLiteral_9= 'october' ) | (enumLiteral_10= 'november' ) | (enumLiteral_11= 'december' ) )
            int alt15=12;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            case 33:
                {
                alt15=5;
                }
                break;
            case 34:
                {
                alt15=6;
                }
                break;
            case 35:
                {
                alt15=7;
                }
                break;
            case 36:
                {
                alt15=8;
                }
                break;
            case 37:
                {
                alt15=9;
                }
                break;
            case 38:
                {
                alt15=10;
                }
                break;
            case 39:
                {
                alt15=11;
                }
                break;
            case 40:
                {
                alt15=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBudgeting.g:952:2: (enumLiteral_0= 'january' )
                    {
                    // InternalBudgeting.g:952:2: (enumLiteral_0= 'january' )
                    // InternalBudgeting.g:952:4: enumLiteral_0= 'january'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalBudgeting.g:958:6: (enumLiteral_1= 'february' )
                    {
                    // InternalBudgeting.g:958:6: (enumLiteral_1= 'february' )
                    // InternalBudgeting.g:958:8: enumLiteral_1= 'february'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalBudgeting.g:964:6: (enumLiteral_2= 'march' )
                    {
                    // InternalBudgeting.g:964:6: (enumLiteral_2= 'march' )
                    // InternalBudgeting.g:964:8: enumLiteral_2= 'march'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalBudgeting.g:970:6: (enumLiteral_3= 'april' )
                    {
                    // InternalBudgeting.g:970:6: (enumLiteral_3= 'april' )
                    // InternalBudgeting.g:970:8: enumLiteral_3= 'april'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalBudgeting.g:976:6: (enumLiteral_4= 'may' )
                    {
                    // InternalBudgeting.g:976:6: (enumLiteral_4= 'may' )
                    // InternalBudgeting.g:976:8: enumLiteral_4= 'may'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalBudgeting.g:982:6: (enumLiteral_5= 'june' )
                    {
                    // InternalBudgeting.g:982:6: (enumLiteral_5= 'june' )
                    // InternalBudgeting.g:982:8: enumLiteral_5= 'june'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalBudgeting.g:988:6: (enumLiteral_6= 'july' )
                    {
                    // InternalBudgeting.g:988:6: (enumLiteral_6= 'july' )
                    // InternalBudgeting.g:988:8: enumLiteral_6= 'july'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalBudgeting.g:994:6: (enumLiteral_7= 'august' )
                    {
                    // InternalBudgeting.g:994:6: (enumLiteral_7= 'august' )
                    // InternalBudgeting.g:994:8: enumLiteral_7= 'august'
                    {
                    enumLiteral_7=(Token)match(input,36,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalBudgeting.g:1000:6: (enumLiteral_8= 'september' )
                    {
                    // InternalBudgeting.g:1000:6: (enumLiteral_8= 'september' )
                    // InternalBudgeting.g:1000:8: enumLiteral_8= 'september'
                    {
                    enumLiteral_8=(Token)match(input,37,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalBudgeting.g:1006:6: (enumLiteral_9= 'october' )
                    {
                    // InternalBudgeting.g:1006:6: (enumLiteral_9= 'october' )
                    // InternalBudgeting.g:1006:8: enumLiteral_9= 'october'
                    {
                    enumLiteral_9=(Token)match(input,38,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalBudgeting.g:1012:6: (enumLiteral_10= 'november' )
                    {
                    // InternalBudgeting.g:1012:6: (enumLiteral_10= 'november' )
                    // InternalBudgeting.g:1012:8: enumLiteral_10= 'november'
                    {
                    enumLiteral_10=(Token)match(input,39,FOLLOW_2); 

                            current = grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // InternalBudgeting.g:1018:6: (enumLiteral_11= 'december' )
                    {
                    // InternalBudgeting.g:1018:6: (enumLiteral_11= 'december' )
                    // InternalBudgeting.g:1018:8: enumLiteral_11= 'december'
                    {
                    enumLiteral_11=(Token)match(input,40,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001FFE0004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000A004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});

}