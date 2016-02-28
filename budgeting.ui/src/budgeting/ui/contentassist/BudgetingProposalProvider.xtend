/*
 * generated by Xtext
 */
package budgeting.ui.contentassist

import budgeting.ui.contentassist.antlr.internal.InternalBudgetingLexer
import org.antlr.runtime.ANTLRStringStream
import org.antlr.runtime.RecognitionException
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

class BudgetingProposalProvider extends AbstractBudgetingProposalProvider {
	override completeLibrary_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val fileName = context.resource.URI.trimFileExtension.lastSegment
		val lexer = new InternalBudgetingLexer(new ANTLRStringStream(fileName))
		try {
			lexer.mRULE_ID
			acceptor.accept(createCompletionProposal(fileName, context))
		} catch (RecognitionException e) {
		}
	}
	
	override completeYear_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val fileName = context.resource.URI.trimFileExtension.lastSegment
		try {
			val proposalYear = Integer.parseInt(fileName)
			if (proposalYear >= 2015 && proposalYear <= java.time.Year.now.value + 1) {
				acceptor.accept(createCompletionProposal(fileName, context))
			}
		} catch (NumberFormatException e) {
		}
	}
	
	override protected isValidProposal(String proposal, String prefix, ContentAssistContext context) {
		super.isValidProposal(proposal, prefix, context)
	}
	
	override protected doCreateIntProposals() {
		false
	}
	
	override protected doCreateIdProposals() {
		false
	}
}