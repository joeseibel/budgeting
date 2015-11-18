/*
 * generated by Xtext
 */
package budgeting.serializer;

import budgeting.budgeting.BudgetingPackage;
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
	 *     (income?='income'? name=ID)
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (category=[Category|ID] amount=DOLLAR)
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
		feeder.accept(grammarAccess.getEntryAccess().getAmountDOLLARTerminalRuleCall_2_0(), semanticObject.getAmount());
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
	 *     (name=MonthEnum budgetEntries+=Entry* actualEntries+=Entry*)
	 */
	protected void sequence_Month(EObject context, Month semanticObject) {
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
