/*
 * generated by Xtext 2.19.0
 */
package org.xtext.computationalmodelling


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MarkovChainsStandaloneSetup extends MarkovChainsStandaloneSetupGenerated {

	def static void doSetup() {
		new MarkovChainsStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}