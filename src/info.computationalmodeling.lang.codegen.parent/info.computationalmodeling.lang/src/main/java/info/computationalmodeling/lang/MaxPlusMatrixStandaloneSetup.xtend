/*
 * generated by Xtext 2.26.0
 */
package info.computationalmodeling.lang


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MaxPlusMatrixStandaloneSetup extends MaxPlusMatrixStandaloneSetupGenerated {

	def static void doSetup() {
		new MaxPlusMatrixStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}