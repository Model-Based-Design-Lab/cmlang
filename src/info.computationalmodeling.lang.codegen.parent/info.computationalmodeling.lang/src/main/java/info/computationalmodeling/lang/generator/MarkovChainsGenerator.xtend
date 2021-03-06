/*
 * generated by Xtext 2.26.0
 */
package info.computationalmodeling.lang.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import info.computationalmodeling.lang.MarkovChainsRuntimeModule
import com.google.inject.Guice

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MarkovChainsGenerator extends AbstractGenerator {

    com.google.inject.Injector injector = Guice.createInjector(new MarkovChainsRuntimeModule());
	MarkovChainsGeneratorOctave genA = new MarkovChainsGeneratorOctave();
	MarkovChainsGeneratorGraphviz genB = new MarkovChainsGeneratorGraphviz();

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		// generate matrix description
		injector.injectMembers(genA);
		genA.doGenerate(resource, fsa, context);

		// generate graphviz description
		injector.injectMembers(genB);
		genB.doGenerate(resource, fsa, context);
	}

}
