/*
 * generated by Xtext 2.26.0
 */
package info.computationalmodeling.lang


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DataflowStandaloneSetup extends DataflowStandaloneSetupGenerated {

	def static void doSetup() {
		new DataflowStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}