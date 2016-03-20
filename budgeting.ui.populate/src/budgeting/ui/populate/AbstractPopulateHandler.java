package budgeting.ui.populate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.eclipse.core.commands.AbstractHandler;

import budgeting.budgeting.Month;

/*
 * The only purpose of this file is to utilize try-with-resources, which is not
 * supported in Xtend. See https://bugs.eclipse.org/bugs/show_bug.cgi?id=366020
 * If this feature is ever included in Xtend, then the code in this file should
 * be moved into PopulateHandler
 */
abstract class AbstractPopulateHandler extends AbstractHandler {
	protected Object parseCardFile(final String fileName, final Month selectedMonth, final int selectedYear) throws IOException {
		final BufferedReader reader = new BufferedReader(new FileReader(fileName));
		try (final CSVParser parser = CSVFormat.DEFAULT.withHeader().withIgnoreSurroundingSpaces().parse(reader)) {
			return parseCardFileImpl(parser, selectedMonth, selectedYear);
		}
	}
	
	protected abstract Object parseCardFileImpl(CSVParser parser, Month selectedMonth, int selectedYear) throws IOException;
}