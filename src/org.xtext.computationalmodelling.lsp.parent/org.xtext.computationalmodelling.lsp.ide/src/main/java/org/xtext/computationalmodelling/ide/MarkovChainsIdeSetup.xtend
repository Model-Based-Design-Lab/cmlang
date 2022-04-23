/*
 * generated by Xtext 2.20.0
 */
package org.xtext.computationalmodelling.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.computationalmodelling.MarkovChainsRuntimeModule
import org.xtext.computationalmodelling.MarkovChainsStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MarkovChainsIdeSetup extends MarkovChainsStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MarkovChainsRuntimeModule, new MarkovChainsIdeModule))
	}
	
}
