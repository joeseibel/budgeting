/*
 * generated by Xtext
 */
package budgeting.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.contentassist.IContentProposalPriorities;
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import budgeting.ui.contentassist.BudgetingProposalPriorities;
import budgeting.ui.editor.model.edit.BudgetingTextEditComposer;
import budgeting.ui.editor.syntaxcoloring.BudgetingAntlrTokenToAttributeIdMapper;
import budgeting.ui.editor.syntaxcoloring.BudgetingHighlightingConfiguration;
import budgeting.ui.editor.syntaxcoloring.BudgetingSemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BudgetingUiModule extends budgeting.ui.AbstractBudgetingUiModule {
	public BudgetingUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return BudgetingAntlrTokenToAttributeIdMapper.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return BudgetingHighlightingConfiguration.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return BudgetingSemanticHighlightingCalculator.class;
	}
	
	public Class<? extends IContentProposalPriorities> bindIContentProposalPriorities() {
		return BudgetingProposalPriorities.class;
	}
	
	public Class<? extends ITextEditComposer> bindITextEditComposer() {
		return BudgetingTextEditComposer.class;
	}
}