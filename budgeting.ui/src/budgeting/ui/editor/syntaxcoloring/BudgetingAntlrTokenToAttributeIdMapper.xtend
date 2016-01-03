package budgeting.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration

class BudgetingAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	override protected calculateId(String tokenName, int tokenType) {
		if (tokenName == "RULE_DECIMAL") {
			DefaultHighlightingConfiguration.NUMBER_ID
		} else {
			super.calculateId(tokenName, tokenType)
		}
	}
}