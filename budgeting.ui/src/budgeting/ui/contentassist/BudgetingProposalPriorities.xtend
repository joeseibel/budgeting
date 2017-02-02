package budgeting.ui.contentassist

import budgeting.budgeting.MonthEnum
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentProposalPriorities
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal

class BudgetingProposalPriorities extends ContentProposalPriorities {
	override adjustKeywordPriority(ICompletionProposal proposal, String prefix) {
		if (proposal instanceof ConfigurableCompletionProposal) {
			val month = MonthEnum.get(proposal.displayString)
			if (month !== null) {
				proposal.priority = keywordPriority + MonthEnum.values.length - month.ordinal
			} else {
				super.adjustKeywordPriority(proposal, prefix)
			}
		} else {
			super.adjustKeywordPriority(proposal, prefix)
		}
	}
}