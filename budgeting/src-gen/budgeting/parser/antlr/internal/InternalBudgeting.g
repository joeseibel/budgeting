/*
 * generated by Xtext
 */
grammar InternalBudgeting;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package budgeting.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleBudgetingFile
entryRuleBudgetingFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBudgetingFileRule()); }
	 iv_ruleBudgetingFile=ruleBudgetingFile 
	 { $current=$iv_ruleBudgetingFile.current; } 
	 EOF 
;

// Rule BudgetingFile
ruleBudgetingFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBudgetingFileAccess().getLibraryParserRuleCall_0()); 
    }
    this_Library_0=ruleLibrary
    { 
        $current = $this_Library_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBudgetingFileAccess().getYearParserRuleCall_1()); 
    }
    this_Year_1=ruleYear
    { 
        $current = $this_Year_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleLibrary
entryRuleLibrary returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLibraryRule()); }
	 iv_ruleLibrary=ruleLibrary 
	 { $current=$iv_ruleLibrary.current; } 
	 EOF 
;

// Rule Library
ruleLibrary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='library' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLibraryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLibraryAccess().getCategoriesCategoryParserRuleCall_3_0()); 
	    }
		lv_categories_3_0=ruleCategory		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLibraryRule());
	        }
       		add(
       			$current, 
       			"categories",
        		lv_categories_3_0, 
        		"Category");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleCategory
entryRuleCategory returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCategoryRule()); }
	 iv_ruleCategory=ruleCategory 
	 { $current=$iv_ruleCategory.current; } 
	 EOF 
;

// Rule Category
ruleCategory returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getCategoryAccess().getIncomeCategoryAction_0_0(),
            $current);
    }
)	otherlv_1='income' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getIncomeKeyword_0_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCategoryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getCategoryAccess().getExpenseCategoryAction_1_0(),
            $current);
    }
)	otherlv_4='expense' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getExpenseKeyword_1_1());
    }
(
(
		lv_name_5_0=RULE_ID
		{
			newLeafNode(lv_name_5_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCategoryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"ID");
	    }

)
)(	otherlv_6='[' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getCategoryAccess().getLeftSquareBracketKeyword_1_3_0());
    }
(
(
		lv_patterns_7_0=RULE_STRING
		{
			newLeafNode(lv_patterns_7_0, grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCategoryRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"patterns",
        		lv_patterns_7_0, 
        		"STRING");
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getCategoryAccess().getCommaKeyword_1_3_2_0());
    }
(
(
		lv_patterns_9_0=RULE_STRING
		{
			newLeafNode(lv_patterns_9_0, grammarAccess.getCategoryAccess().getPatternsSTRINGTerminalRuleCall_1_3_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCategoryRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"patterns",
        		lv_patterns_9_0, 
        		"STRING");
	    }

)
))*	otherlv_10=']' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getCategoryAccess().getRightSquareBracketKeyword_1_3_3());
    }
)?))
;





// Entry rule entryRuleYear
entryRuleYear returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getYearRule()); }
	 iv_ruleYear=ruleYear 
	 { $current=$iv_ruleYear.current; } 
	 EOF 
;

// Rule Year
ruleYear returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_INT
		{
			newLeafNode(lv_name_0_0, grammarAccess.getYearAccess().getNameINTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getYearRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"INT");
	    }

)
)	otherlv_1='uses' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getYearAccess().getUsesKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getYearRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getYearAccess().getLibraryLibraryCrossReference_2_0()); 
	}

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getYearAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getYearAccess().getMonthsMonthParserRuleCall_4_0()); 
	    }
		lv_months_4_0=ruleMonth		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getYearRule());
	        }
       		add(
       			$current, 
       			"months",
        		lv_months_4_0, 
        		"Month");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getYearAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleMonth
entryRuleMonth returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMonthRule()); }
	 iv_ruleMonth=ruleMonth 
	 { $current=$iv_ruleMonth.current; } 
	 EOF 
;

// Rule Month
ruleMonth returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMonthAccess().getNameMonthEnumEnumRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleMonthEnum		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMonthRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"MonthEnum");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='budget' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMonthAccess().getBudgetKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMonthAccess().getBudgetEntriesBudgetEntryParserRuleCall_3_0()); 
	    }
		lv_budgetEntries_3_0=ruleBudgetEntry		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMonthRule());
	        }
       		add(
       			$current, 
       			"budgetEntries",
        		lv_budgetEntries_3_0, 
        		"BudgetEntry");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5='actual' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMonthAccess().getActualKeyword_5());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMonthAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMonthAccess().getActualEntriesActualEntryParserRuleCall_7_0()); 
	    }
		lv_actualEntries_7_0=ruleActualEntry		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMonthRule());
	        }
       		add(
       			$current, 
       			"actualEntries",
        		lv_actualEntries_7_0, 
        		"ActualEntry");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMonthAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleBudgetEntry
entryRuleBudgetEntry returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBudgetEntryRule()); }
	 iv_ruleBudgetEntry=ruleBudgetEntry 
	 { $current=$iv_ruleBudgetEntry.current; } 
	 EOF 
;

// Rule BudgetEntry
ruleBudgetEntry returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBudgetEntryAccess().getBudgetAmountEntryAction_0_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBudgetEntryRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBudgetEntryAccess().getColonKeyword_0_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
	    }
		lv_amount_3_0=ruleDollar		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBudgetEntryRule());
	        }
       		set(
       			$current, 
       			"amount",
        		lv_amount_3_0, 
        		"Dollar");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBudgetEntryAccess().getBudgetFactorEntryAction_1_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBudgetEntryRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getBudgetEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
	}

)
)	otherlv_6=':' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getBudgetEntryAccess().getColonKeyword_1_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBudgetEntryRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryCrossReference_1_3_0()); 
	}

)
)	otherlv_8='*' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getBudgetEntryAccess().getAsteriskKeyword_1_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0()); 
	    }
		lv_factor_9_0=ruleDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBudgetEntryRule());
	        }
       		set(
       			$current, 
       			"factor",
        		lv_factor_9_0, 
        		"Double");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleActualEntry
entryRuleActualEntry returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActualEntryRule()); }
	 iv_ruleActualEntry=ruleActualEntry 
	 { $current=$iv_ruleActualEntry.current; } 
	 EOF 
;

// Rule ActualEntry
ruleActualEntry returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getActualEntryAccess().getActualAmountEntryAction_0_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActualEntryRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_0_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getActualEntryAccess().getColonKeyword_0_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0()); 
	    }
		lv_amount_3_0=ruleDollar		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActualEntryRule());
	        }
       		set(
       			$current, 
       			"amount",
        		lv_amount_3_0, 
        		"Dollar");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getActualEntryAccess().getActualTransactionEntryAction_1_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActualEntryRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getActualEntryAccess().getCategoryCategoryCrossReference_1_1_0()); 
	}

)
)	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getActualEntryAccess().getLeftCurlyBracketKeyword_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActualEntryAccess().getTransactionsTransactionParserRuleCall_1_3_0()); 
	    }
		lv_transactions_7_0=ruleTransaction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActualEntryRule());
	        }
       		add(
       			$current, 
       			"transactions",
        		lv_transactions_7_0, 
        		"Transaction");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getActualEntryAccess().getRightCurlyBracketKeyword_1_4());
    }
))
;





// Entry rule entryRuleTransaction
entryRuleTransaction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransactionRule()); }
	 iv_ruleTransaction=ruleTransaction 
	 { $current=$iv_ruleTransaction.current; } 
	 EOF 
;

// Rule Transaction
ruleTransaction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTransactionAccess().getCashTransactionAction_0_0(),
            $current);
    }
)	otherlv_1='cash' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getCashKeyword_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_0_2_0()); 
	    }
		lv_amount_2_0=ruleDollar		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransactionRule());
	        }
       		set(
       			$current, 
       			"amount",
        		lv_amount_2_0, 
        		"Dollar");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='on' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getOnKeyword_0_3_0());
    }
(
(
		lv_day_4_0=RULE_INT
		{
			newLeafNode(lv_day_4_0, grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_0_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransactionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"day",
        		lv_day_4_0, 
        		"INT");
	    }

)
))?)
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTransactionAccess().getCardTransactionAction_1_0(),
            $current);
    }
)	otherlv_6='card' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTransactionAccess().getCardKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0()); 
	    }
		lv_amount_7_0=ruleDollar		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransactionRule());
	        }
       		set(
       			$current, 
       			"amount",
        		lv_amount_7_0, 
        		"Dollar");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8='on' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getTransactionAccess().getOnKeyword_1_3());
    }
(
(
		lv_day_9_0=RULE_INT
		{
			newLeafNode(lv_day_9_0, grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransactionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"day",
        		lv_day_9_0, 
        		"INT");
	    }

)
)	otherlv_10='from' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getTransactionAccess().getFromKeyword_1_5());
    }
(
(
		lv_from_11_0=RULE_STRING
		{
			newLeafNode(lv_from_11_0, grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransactionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"from",
        		lv_from_11_0, 
        		"STRING");
	    }

)
)))
;







// Entry rule entryRuleDollar
entryRuleDollar returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDollarRule()); } 
	 iv_ruleDollar=ruleDollar 
	 { $current=$iv_ruleDollar.current.getText(); }  
	 EOF 
;

// Rule Dollar
ruleDollar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_DECIMAL_0=RULE_DECIMAL    {
		$current.merge(this_DECIMAL_0);
    }

    { 
    newLeafNode(this_DECIMAL_0, grammarAccess.getDollarAccess().getDECIMALTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleDouble
entryRuleDouble returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDoubleRule()); } 
	 iv_ruleDouble=ruleDouble 
	 { $current=$iv_ruleDouble.current.getText(); }  
	 EOF 
;

// Rule Double
ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
    }

    |    this_DECIMAL_1=RULE_DECIMAL    {
		$current.merge(this_DECIMAL_1);
    }

    { 
    newLeafNode(this_DECIMAL_1, grammarAccess.getDoubleAccess().getDECIMALTerminalRuleCall_1()); 
    }
)
    ;





// Rule MonthEnum
ruleMonthEnum returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='january' 
	{
        $current = grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMonthEnumAccess().getJANUARYEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='february' 
	{
        $current = grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMonthEnumAccess().getFEBRUARYEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='march' 
	{
        $current = grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMonthEnumAccess().getMARCHEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='april' 
	{
        $current = grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getMonthEnumAccess().getAPRILEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='may' 
	{
        $current = grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getMonthEnumAccess().getMAYEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='june' 
	{
        $current = grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getMonthEnumAccess().getJUNEEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='july' 
	{
        $current = grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getMonthEnumAccess().getJULYEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='august' 
	{
        $current = grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getMonthEnumAccess().getAUGUSTEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='september' 
	{
        $current = grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getMonthEnumAccess().getSEPTEMBEREnumLiteralDeclaration_8()); 
    }
)
    |(	enumLiteral_9='october' 
	{
        $current = grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_9, grammarAccess.getMonthEnumAccess().getOCTOBEREnumLiteralDeclaration_9()); 
    }
)
    |(	enumLiteral_10='november' 
	{
        $current = grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_10, grammarAccess.getMonthEnumAccess().getNOVEMBEREnumLiteralDeclaration_10()); 
    }
)
    |(	enumLiteral_11='december' 
	{
        $current = grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_11, grammarAccess.getMonthEnumAccess().getDECEMBEREnumLiteralDeclaration_11()); 
    }
));



RULE_DECIMAL : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


