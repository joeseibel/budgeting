package budgeting.conversion

import java.text.NumberFormat
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode

import static budgeting.conversion.BudgetingValueConverterService.*

class BudgetingValueConverterService extends DefaultTerminalConverters {
	//This was done because char literals do not exist in Xtend
	val static char DOT = '.'
	val static FORMAT = NumberFormat.instance => [
		minimumIntegerDigits = 2
		maximumIntegerDigits = 2
	]
	
	@ValueConverter(rule = "Dollar")
	def IValueConverter<Long> Dollar() {
		new IValueConverter<Long> {
			override toValue(String string, INode node) throws ValueConverterException {
				if (string == null) {
					0L
				} else {
					val dotPosition = string.indexOf(DOT)
					if (string.length - dotPosition != 3) {
						throw new ValueConverterException("Dollar amount must have 2 digits after the decimal point.", node, null)
					} else {
						Long.parseUnsignedLong(new StringBuilder(string).deleteCharAt(dotPosition).toString)
					}
				}
			}
			
			override toString(Long value) throws ValueConverterException {
				value / 100 + "." + FORMAT.format(value % 100)
			}
		}
	}
}