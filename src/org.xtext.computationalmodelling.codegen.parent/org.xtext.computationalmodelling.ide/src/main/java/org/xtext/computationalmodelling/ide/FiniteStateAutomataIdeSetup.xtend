/*
 * generated by Xtext 2.19.0
 */
package org.xtext.computationalmodelling.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.computationalmodelling.FiniteStateAutomataRuntimeModule
import org.xtext.computationalmodelling.FiniteStateAutomataStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class FiniteStateAutomataIdeSetup extends FiniteStateAutomataStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FiniteStateAutomataRuntimeModule, new FiniteStateAutomataIdeModule))
	}
	
}
