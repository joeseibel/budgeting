package budgeting.ui.editor.syntaxcoloring

import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class BudgetingHighlightingConfiguration extends DefaultHighlightingConfiguration {
	val public static String EXPENSE_ID = "EXPENSE_ID"
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(EXPENSE_ID, "Expense category", new TextStyle => [color = new RGB(255, 0, 0)])
	}
}