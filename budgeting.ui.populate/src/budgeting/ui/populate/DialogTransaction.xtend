package budgeting.ui.populate

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
package class DialogTransaction {
	val int day
	val String from
	val long amount
	String category
}