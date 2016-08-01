package budgeting.ui.editor.model.edit

import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.ui.editor.model.edit.DefaultTextEditComposer

class BudgetingTextEditComposer extends DefaultTextEditComposer {
	override protected getSaveOptions() {
		SaveOptions.newBuilder.format.options
	}
}