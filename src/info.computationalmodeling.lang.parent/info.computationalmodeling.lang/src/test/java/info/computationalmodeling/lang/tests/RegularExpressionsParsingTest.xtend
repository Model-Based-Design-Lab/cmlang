/*
 * generated by Xtext 2.36.0
 */
package info.computationalmodeling.lang.tests

import com.google.inject.Inject
import info.computationalmodeling.lang.regularexpressions.RegExModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(RegularExpressionsInjectorProvider)
class RegularExpressionsParsingTest {
	@Inject
	ParseHelper<RegExModel> parseHelper
	
	@Test
	def void loadModel() {
// TODO: add test later
//		val result = parseHelper.parse('''
//			Hello Xtext!
//		''')
//		Assertions.assertNotNull(result)
//		val errors = result.eResource.errors
//		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
