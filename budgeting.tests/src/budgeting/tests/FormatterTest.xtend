package budgeting.tests

import budgeting.BudgetingInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(BudgetingInjectorProvider)
class FormatterTest {
	@Inject
	extension FormatterTestHelper
	
	@Test
	def void testLibrary() {
		assertFormatted[
			expectation = '''
				library lib1 {
				}'''
			toBeFormatted = "library lib1{}"
		]
		assertFormatted[
			expectation = '''
				library lib1 {
					income income1
					expense expense1
					expense expense2 ["pattern1"]
					expense expense3 [
						"pattern1",
						"pattern2",
						"pattern3",
						"pattern4",
						"pattern5",
						"pattern6",
						"pattern7",
						"pattern8",
						"pattern9",
						"pattern10",
						"pattern11",
						"pattern12",
						"pattern13",
						"pattern14",
						"pattern15",
						"pattern16",
						"pattern17",
						"pattern18"
					]
				}'''
			toBeFormatted = 'library lib1{income income1 expense expense1 expense expense2["pattern1"]expense expense3[' +
				'"pattern1","pattern2","pattern3","pattern4","pattern5","pattern6","pattern7","pattern8","pattern9",' +
				'"pattern10","pattern11","pattern12","pattern13","pattern14","pattern15","pattern16","pattern17",' +
				'"pattern18"]}'
		]
	}
	
	@Test
	def void testYear() {
		assertFormatted[
			expectation = '''
				2016 uses lib1 {
				}'''
			toBeFormatted = "2016uses lib1{}"
		]
		assertFormatted[
			expectation = '''
				2016 uses lib1 {
					january budget {
					} actual {
					}
				
					february budget {
					} actual {
					}
				}'''
			toBeFormatted = "2016uses lib1{january budget{}actual{}february budget{}actual{}}"
		]
		assertFormatted[
			expectation = '''
				2016 uses lib1 {
					january budget {
						income1: 123.45
						expense1: income1 * 0.1
						expense2: 65.90
					} actual {
						income1: 34.09
						expense1: 55.00
						expense2: 12.00
					}
				
					february budget {
					} actual {
						expense1: 10.00
						expense2 {
							cash 5.34 on 14
							cash 8.45
							card 23.02 on 22 from "store1"
						}
					}
				}'''
			toBeFormatted = '2016uses lib1{january budget{income1:123.45expense1:income1*0.1expense2:65.90}actual{' +
				'income1:34.09expense1:55.00expense2:12.00}february budget{}actual{expense1:10.00expense2{cash 5.34on 14' +
				'cash 8.45card 23.02on 22from"store1"}}}'
		]
	}
}