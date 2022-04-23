/*
 * generated by Xtext 2.19.0
 */
package org.xtext.computationalmodelling.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.computationalmodelling.MaxPlusMatrixRuntimeModule
import com.google.inject.Guice



/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */

class MaxPlusMatrixGenerator extends AbstractGenerator {

    com.google.inject.Injector injector = Guice.createInjector(new MaxPlusMatrixRuntimeModule());
	MaxPlusMatrixGeneratorLaTeX genLaTeX = new MaxPlusMatrixGeneratorLaTeX();
//	MaxPlusMatrixGeneratorPython genPython = new MaxPlusMatrixGeneratorPython();

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		// generate both A and B
		
	    // first A
	    injector.injectMembers(genLaTeX);
		genLaTeX.doGenerate(resource, fsa, context);

		// then B
//	    injector.injectMembers(genPython);
//		genPython.doGenerate(resource, fsa, context);
	}

}
