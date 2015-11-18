package budgeting.conversion

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException

class BudgetingValueConverterService extends DefaultTerminalConverters {
	//This was done because char literals do not exist in Xtend
	val static char DOT = '.'
	
	@ValueConverter(rule = "DOLLAR")
	def IValueConverter<Long> DOLLAR() {
		new IValueConverter<Long> {
			override toValue(String string, INode node) throws ValueConverterException {
				if (string == null) {
					0L
				} else {
					Long.parseUnsignedLong(new StringBuilder(string).deleteCharAt(string.indexOf(DOT)).toString)
				}
			}
			
			override toString(Long value) throws ValueConverterException {
				value / 100 + "." + value % 100
			}
		}
	}
}