package info.computationalmodeling.lang.codegen;

import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import info.computationalmodeling.lang.DataflowStandaloneSetup;
import info.computationalmodeling.lang.MaxPlusMatrixStandaloneSetup;
import info.computationalmodeling.lang.FiniteStateAutomataStandaloneSetup;
import info.computationalmodeling.lang.MarkovChainsStandaloneSetup;
import info.computationalmodeling.lang.RegularExpressionsStandaloneSetup;
import info.computationalmodeling.lang.LinearTemporalLogicStandaloneSetup;

import com.google.inject.Injector;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ComputationalModelingCompiler {

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IGenerator2 generator;

	@Inject
	private JavaIoFileSystemAccess fsa;

	private static void exitError(String msg) {
		System.out.println(msg);
		System.exit(-1);
	}

	private static void showUsage() {
		System.out.println("Usage:");
		System.out.println("computational-modeling-codegen <filename.sdf> <outputdir>");
	}

	public static void main(String[] args) {

		if (args.length != 2) {
			showUsage();
			exitError("Please provide an input file as an argument and an output directory.");
		}

		String filename = args[0];
		String outputdir = args[1];

		String ext = FilenameUtils.getExtension(filename).toUpperCase();
		if ((! ext.equals("SDF")) && (! ext.equals("MPM")) && (! ext.equals("FSA")) && (! ext.equals("DTMC")) && (! ext.equals("REGEX")) && (! ext.equals("LTL"))) {
			showUsage();
			exitError("The provided filename does not have a .sdf, .mpm, .fsa, .dtmc, .ltl or .regex extension.");
			}

		File f = new File(filename);
		if( (! f.exists()) || f.isDirectory()) {
			showUsage();
			exitError("The provided filename does not exist.");
		}

		File d = new File(outputdir);
		if (!d.exists() || ! d.isDirectory()) {
			showUsage();
			exitError("The output directory does not exist.");
		}

		Injector injector = null;
		
		switch (ext)
		{
		case "SDF":
			// do this only once per application
			injector = new DataflowStandaloneSetup().createInjectorAndDoEMFRegistration();
			break;
		case "MPM":
			// do this only once per application
			injector = new MaxPlusMatrixStandaloneSetup().createInjectorAndDoEMFRegistration();
			break;
		case "FSA":
			// do this only once per application
			injector = new FiniteStateAutomataStandaloneSetup().createInjectorAndDoEMFRegistration();
			break;
		case "DTMC":
			// do this only once per application
			injector = new MarkovChainsStandaloneSetup().createInjectorAndDoEMFRegistration();
			break;
		case "REGEX":
			// do this only once per application
			injector = new RegularExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
			break;
		case "LTL":
			// do this only once per application
			injector = new LinearTemporalLogicStandaloneSetup().createInjectorAndDoEMFRegistration();
			break;
		}
		
		if (injector != null) {
			ComputationalModelingCompiler comp = injector.getInstance(ComputationalModelingCompiler.class);
			comp.runGenerator(filename, outputdir);
		} else {
			exitError("Failed to create injector.");
		}
	}


	protected void runGenerator(String filename, String outputdir) {
		// obtain a resourceset
		ResourceSet resourceSet = resourceSetProvider.get();

		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI(filename), true);

		// Validation
		IResourceValidator validator = ((XtextResource)resource).getResourceServiceProvider().getResourceValidator();
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		boolean errorEncountered = false;
		for (Issue issue : issues) {
		  System.out.println(issue.getMessage());
		  if (issue.getSeverity() == Severity.ERROR) {
			  errorEncountered = true;
		  }
		}

		if (errorEncountered ) {
			System.exit(-1);
		}

		// Code Generator
		fsa.setOutputPath(outputdir);
		generator.doGenerate(resource, fsa, new GeneratorContext());
	}
}

