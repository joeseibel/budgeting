/*
 * generated by Xtext
 */
package budgeting.serializer;

import budgeting.budgeting.ActualAmountEntry;
import budgeting.budgeting.ActualTransactionEntry;
import budgeting.budgeting.BudgetAmountEntry;
import budgeting.budgeting.BudgetFactorEntry;
import budgeting.budgeting.BudgetingPackage;
import budgeting.budgeting.CardTransaction;
import budgeting.budgeting.CashTransaction;
import budgeting.budgeting.Category;
import budgeting.budgeting.Entry;
import budgeting.budgeting.Library;
import budgeting.budgeting.Month;
import budgeting.budgeting.Year;
import budgeting.services.BudgetingGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BudgetingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BudgetingGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BudgetingPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BudgetingPackage.ACTUAL_AMOUNT_ENTRY:
				sequence_ActualEntry(context, (ActualAmountEntry) semanticObject); 
				return; 
			case BudgetingPackage.ACTUAL_TRANSACTION_ENTRY:
				sequence_ActualEntry(context, (ActualTransactionEntry) semanticObject); 
				return; 
			case BudgetingPackage.BUDGET_AMOUNT_ENTRY:
				sequence_BudgetEntry(context, (BudgetAmountEntry) semanticObject); 
				return; 
			case BudgetingPackage.BUDGET_FACTOR_ENTRY:
				sequence_BudgetEntry(context, (BudgetFactorEntry) semanticObject); 
				return; 
			case BudgetingPackage.CARD_TRANSACTION:
				sequence_Transaction(context, (CardTransaction) semanticObject); 
				return; 
			case BudgetingPackage.CASH_TRANSACTION:
				sequence_Transaction(context, (CashTransaction) semanticObject); 
				return; 
			case BudgetingPackage.CATEGORY:
				sequence_Category(context, (Category) semanticObject); 
				return; 
			case BudgetingPackage.ENTRY:
				sequence_Entry(context, (Entry) semanticObject); 
				return; 
			case BudgetingPackage.LIBRARY:
				sequence_Library(context, (Library) semanticObject); 
				return; 
			case BudgetingPackage.MONTH:
				sequence_Month(context, (Month) semanticObject); 
				return; 
			case BudgetingPackage.YEAR:
				sequence_Year(context, (Year) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (category=[Category|ID] amount=Dollar)
	 */
	protected void sequence_ActualEntry(EObject context, ActualAmountEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.ACTUAL_ENTRY__CATEGORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.ACTUAL_ENTRY__CATEGORY));
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.ACTUAL_AMOUNT_ENTRY__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.ACTUAL_AMOUNT_ENTRY__AMOUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActualEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1(), semanticObject.getCategory());
		feeder.accept(grammarAccess.getActualEntryAccess().getAmountDollarParserRuleCall_0_3_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (category=[Category|ID] transactions+=Transaction+)
	 */
	protected void sequence_ActualEntry(EObject context, ActualTransactionEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (category=[Category|ID] amount=Dollar)
	 */
	protected void sequence_BudgetEntry(EObject context, BudgetAmountEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.BUDGET_ENTRY__CATEGORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.BUDGET_ENTRY__CATEGORY));
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.BUDGET_AMOUNT_ENTRY__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.BUDGET_AMOUNT_ENTRY__AMOUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_1_0_1(), semanticObject.getCategory());
		feeder.accept(grammarAccess.getBudgetEntryAccess().getAmountDollarParserRuleCall_0_3_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (category=[Category|ID] baseEntry=[BudgetEntry|ID] factor=Double)
	 */
	protected void sequence_BudgetEntry(EObject context, BudgetFactorEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.BUDGET_ENTRY__CATEGORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.BUDGET_ENTRY__CATEGORY));
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.BUDGET_FACTOR_ENTRY__BASE_ENTRY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.BUDGET_FACTOR_ENTRY__BASE_ENTRY));
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.BUDGET_FACTOR_ENTRY__FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.BUDGET_FACTOR_ENTRY__FACTOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBudgetEntryAccess().getCategoryCategoryIDTerminalRuleCall_1_1_0_1(), semanticObject.getCategory());
		feeder.accept(grammarAccess.getBudgetEntryAccess().getBaseEntryBudgetEntryIDTerminalRuleCall_1_3_0_1(), semanticObject.getBaseEntry());
		feeder.accept(grammarAccess.getBudgetEntryAccess().getFactorDoubleParserRuleCall_1_5_0(), semanticObject.getFactor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (income?='income'? name=ID)
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (category=[Category|ID] amount=Dollar)
	 */
	protected void sequence_Entry(EObject context, Entry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.ENTRY__CATEGORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.ENTRY__CATEGORY));
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.ENTRY__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.ENTRY__AMOUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntryAccess().getCategoryCategoryIDTerminalRuleCall_0_0_1(), semanticObject.getCategory());
		feeder.accept(grammarAccess.getEntryAccess().getAmountDollarParserRuleCall_2_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID categories+=Category*)
	 */
	protected void sequence_Library(EObject context, Library semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MonthEnum budgetEntries+=BudgetEntry* actualEntries+=ActualEntry*)
	 */
	protected void sequence_Month(EObject context, Month semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (amount=Dollar day=INT from=STRING)
	 */
	protected void sequence_Transaction(EObject context, CardTransaction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.TRANSACTION__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.TRANSACTION__AMOUNT));
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.TRANSACTION__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.TRANSACTION__DAY));
			if(transientValues.isValueTransient(semanticObject, BudgetingPackage.Literals.CARD_TRANSACTION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BudgetingPackage.Literals.CARD_TRANSACTION__FROM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransactionAccess().getAmountDollarParserRuleCall_1_2_0(), semanticObject.getAmount());
		feeder.accept(grammarAccess.getTransactionAccess().getDayINTTerminalRuleCall_1_4_0(), semanticObject.getDay());
		feeder.accept(grammarAccess.getTransactionAccess().getFromSTRINGTerminalRuleCall_1_6_0(), semanticObject.getFrom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (amount=Dollar day=INT?)
	 */
	protected void sequence_Transaction(EObject context, CashTransaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=INT library=[Library|ID] months+=Month*)
	 */
	protected void sequence_Year(EObject context, Year semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
