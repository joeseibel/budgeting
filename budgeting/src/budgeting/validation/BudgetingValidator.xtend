package budgeting.validation

import budgeting.budgeting.ActualAmountEntry
import budgeting.budgeting.ActualTransactionEntry
import budgeting.budgeting.BudgetAmountEntry
import budgeting.budgeting.BudgetFactorEntry
import budgeting.budgeting.BudgetingPackage
import budgeting.budgeting.CardTransaction
import budgeting.budgeting.CashTransaction
import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.Library
import budgeting.budgeting.Month
import budgeting.budgeting.MonthEnum
import budgeting.budgeting.Year
import budgeting.services.BudgetingGrammarAccess
import com.google.inject.Inject
import java.time.DateTimeException
import java.time.LocalDate
import java.util.OptionalLong
import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.validation.Check

import static extension budgeting.BudgetingUtil.calculateAmount
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

class BudgetingValidator extends AbstractBudgetingValidator {
	val public static String MONTHS_OUT_OF_ORDER = "MONTHS_OUT_OF_ORDER"
	val public static String TRANSACTIONS_OUT_OF_ORDER = "TRANSACTIONS_OUT_OF_ORDER"
	
	@Inject
	IValueConverterService converterService
	@Inject
	BudgetingGrammarAccess grammarAccess
	
	//TODO QuickFix
	@Check
	def void checkLibraryName(Library library) {
		val libName = library.name
		val fileName = library.eResource.URI.trimFileExtension.lastSegment
		if (libName != fileName) {
			error('''"«libName»" does not match filename "«fileName»"''', BudgetingPackage.eINSTANCE.library_Name)
		}
	}
	
	@Check
	def void checkPatternValidity(ExpenseCategory expense) {
		expense.patterns.forEach[pattern, index | try {
			Pattern.compile(pattern)
		} catch (PatternSyntaxException e) {
			error("Invalid pattern: " + e.description, BudgetingPackage.eINSTANCE.expenseCategory_Patterns, index)
		}]
	}
	
	//TODO QuickFix
	@Check
	def void checkDuplicatePatterns(ExpenseCategory expense) {
		val duplicates = expense.patterns.indexed.groupBy[value].filter[pattern, pairs | pairs.size > 1]
		duplicates.mapValues[map[key]].forEach[pattern, indicies | indicies.forEach[index |
			warning('''Duplicate pattern "«pattern»"''', BudgetingPackage.eINSTANCE.expenseCategory_Patterns, index)
		]]
	}
	
	@Check
	def void checkPatternDuplicatedInMultipleCategories(Library library) {
		val expenseCategories = library.categories.filter(ExpenseCategory)
		val patternsAndCategories = expenseCategories.map[category | category.patterns.toSet.map[pattern | pattern -> category]].flatten
		val multiples = patternsAndCategories.groupBy[key].filter[pattern, pairs | pairs.size > 1]
		multiples.mapValues[map[value]].forEach[pattern, categories | categories.forEach[category | category.patterns.indexed.filter[value == pattern].forEach[
			error('''Pattern "«pattern»" found in multiple categories''', category, BudgetingPackage.eINSTANCE.expenseCategory_Patterns, key)
		]]]
	}
	
	//TODO QuickFix
	@Check
	def void checkYearName(Year year) {
		val yearName = year.name
		val fileName = year.eResource.URI.trimFileExtension.lastSegment
		if (yearName.toString != fileName) {
			error('''"«yearName»" does not match filename "«fileName»"''', BudgetingPackage.eINSTANCE.year_Name)
		}
	}
	
	@Check
	def void checkYearNameRange(Year year) {
		if (year.name < 2015) {
			warning('''Check year "«year.name»". It seems to be too early''', BudgetingPackage.eINSTANCE.year_Name)
		} else if (year.name > java.time.Year.now.value + 1) {
			warning('''Check year "«year.name»". It seems to be too late''', BudgetingPackage.eINSTANCE.year_Name)
		}
	}
	
	@Check
	def void checkDuplicateMonths(Year year) {
		val duplicates = year.months.groupBy[name].filter[monthName, months | months.size > 1]
		duplicates.values.flatten.forEach[
			error('''Duplicate month "«name»"''', it, BudgetingPackage.eINSTANCE.month_Name)
		]
	}
	
	@Check
	def void checkMonthOrdering(Year year) {
		if (year.months != year.months.sortBy[name]) {
			warning("Month entries are out of order", BudgetingPackage.eINSTANCE.year_Name, MONTHS_OUT_OF_ORDER)
		}
	}
	
	@Check
	def void checkActualEntriesInFutureMonth(Month month) {
		if (!month.actualEntries.empty) {
			val yearName = month.getContainerOfType(Year).name
			val now = LocalDate.now
			if (yearName > now.year || (yearName == now.year && month.name > now.month)) {
				error('''"«month.name»" contains actual entries even though it is in the future''', BudgetingPackage.eINSTANCE.month_Name)
			}
		}
	}
	
	@Check
	def void checkDuplicateBudgetEntries(Month month) {
		val duplicates = month.budgetEntries.groupBy[category].filter[category, budgetEntries | budgetEntries.size > 1]
		duplicates.values.flatten.forEach[
			error('''Duplicate budget entry for category "«category.name»"''', it, BudgetingPackage.eINSTANCE.budgetEntry_Category)
		]
	}
	
	@Check
	def void checkDuplicateActualEntries(Month month) {
		val duplicates = month.actualEntries.groupBy[category].filter[category, actualEntries | actualEntries.size > 1]
		duplicates.values.flatten.forEach[
			error('''Duplicate actual entry for category "«category.name»"''', it, BudgetingPackage.eINSTANCE.actualEntry_Category)
		]
	}
	
	@Check
	def void checkCyclicBudgetFactorDependency(BudgetFactorEntry budgetEntry) {
		val visitedEntries = newHashSet(budgetEntry)
		var currentEntry = budgetEntry
		while (currentEntry?.baseEntry instanceof BudgetFactorEntry) {
			val baseEntry = currentEntry.baseEntry as BudgetFactorEntry
			currentEntry = if (visitedEntries.contains(baseEntry)) {
				error('''Cycle detected for budget entry "«budgetEntry.category.name»"''', BudgetingPackage.eINSTANCE.budgetFactorEntry_BaseEntry)
				null
			} else {
				visitedEntries += baseEntry
				baseEntry
			}
		}
	}
	
	@Check
	def void checkDayRange(CashTransaction transaction) {
		if (transaction.day != null) {
			try {
				LocalDate.of(transaction.getContainerOfType(Year).name, transaction.getContainerOfType(Month).name.ordinal + 1, transaction.day)
			} catch (DateTimeException e) {
				error('''Day "«transaction.day»" is out of range''', BudgetingPackage.eINSTANCE.cashTransaction_Day)
			}
		}
	}
	
	@Check
	def void checkDayRange(CardTransaction transaction) {
		try {
			LocalDate.of(transaction.getContainerOfType(Year).name, transaction.getContainerOfType(Month).name.ordinal + 1, transaction.day)
		} catch (DateTimeException e) {
			error('''Day "«transaction.day»" is out of range''', BudgetingPackage.eINSTANCE.cardTransaction_Day)
		}
	}
	
	@Check
	def void checkTransactionEntryIsExpense(ActualTransactionEntry actualEntry) {
		if (!actualEntry.category.eIsProxy && !(actualEntry.category instanceof ExpenseCategory)) {
			error('''"«actualEntry.category.name»" is not an expense category''', BudgetingPackage.eINSTANCE.actualEntry_Category)
		}
	}
	
	@Check
	def void checkTransactionOrdering(ActualTransactionEntry actualEntry) {
		val days = actualEntry.transactions.map[switch it {
			CashTransaction: day
			CardTransaction: day
		}].filterNull.toList
		if (days != days.sort) {
			error("Transactions are out of order", BudgetingPackage.eINSTANCE.actualEntry_Category, TRANSACTIONS_OUT_OF_ORDER)
		}
	}
	
	@Check
	def void checkZeroSumBudget(Month month) {
		//Don't validate if there are linking errors or if there are duplicate budget entries.
		val noDuplicates = month.budgetEntries.map[category].toSet.size == month.budgetEntries.size
		if (month.budgetEntries.forall[!category.eIsProxy] && noDuplicates) {
			val amounts = month.budgetEntries.map[
				val entryAmount = switch it {
					BudgetAmountEntry: OptionalLong.of(amount)
					BudgetFactorEntry: calculateAmount
				}
				if (category instanceof ExpenseCategory && entryAmount.present) {
					OptionalLong.of(-entryAmount.asLong)
				} else {
					entryAmount
				}
			]
			if (!amounts.empty && amounts.forall[present]) {
				val sum = amounts.map[asLong].sum
				if (sum != 0L) {
					error("Sum of budget entries is " + converterService.toString(sum, grammarAccess.dollarRule.name), BudgetingPackage.eINSTANCE.month_Name)
				}
			}
		}
	}
	
	@Check
	def void checkZeroSumActual(Month month) {
		//Only validate if the month is in the past, there are no linking errors, and there are no duplicate actual entries.
		val yearName = month.getContainerOfType(Year).name
		val now = LocalDate.now
		val inPast = yearName < now.year || (yearName == now.year && month.name < now.month)
		val noDuplicates = month.actualEntries.map[category].toSet.size == month.actualEntries.size
		if (!month.actualEntries.empty && inPast && month.actualEntries.forall[!category.eIsProxy] && noDuplicates) {
			val amounts = month.actualEntries.map[
				val entryAmount = switch it {
					ActualAmountEntry: amount
					ActualTransactionEntry: transactions.map[amount].sum
				}
				if (category instanceof ExpenseCategory) {
					-entryAmount
				} else {
					entryAmount
				}
			]
			val sum = amounts.sum
			if (sum != 0L) {
				error("Sum of actual entries in past month is " + converterService.toString(sum, grammarAccess.dollarRule.name), BudgetingPackage.eINSTANCE.month_Name)
			}
		}
	}
	
	def private static operator_greaterThan(MonthEnum a, java.time.Month b) {
		a.ordinal > b.ordinal
	}
	
	def private static operator_lessThan(MonthEnum a, java.time.Month b) {
		a.ordinal < b.ordinal
	}
	
	def private static sum(Iterable<Long> iterable) {
		iterable.reduce[$0 + $1]
	}
}