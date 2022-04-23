/*
 * generated by Xtext 2.19.0
 */
package org.xtext.computationalmodelling.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.xtext.computationalmodelling.regularexpressions.RegExModel
import org.xtext.computationalmodelling.regularexpressions.RegularExpression
import java.util.List
import org.xtext.computationalmodelling.regularexpressions.RegularExpression1
import org.xtext.computationalmodelling.regularexpressions.RegularExpression2
import org.xtext.computationalmodelling.regularexpressions.RegularExpression3
import org.xtext.computationalmodelling.regularexpressions.ReferenceExpression
import org.xtext.computationalmodelling.regularexpressions.Definition

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RegularExpressionsGeneratorLaTeX extends AbstractGenerator {


	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {


        for (m : resource.allContents.toIterable.filter(RegExModel)) {
	        fsa.generateFile(
	            m.fullyQualifiedName.toString("/") + ".LaTeX",
	            m.compileLaTeX)                
        }
	}


	def compileLaTeX(RegExModel m)  '''
		\begin{array}{l}
		«compileRegularExpression(m.expression)» \\
		«IF m.definitions.length > 0»
		\mathrm{where} \\
		\begin{align}
		«compileDefinitions(m.definitions)»
		\end{align}\\
		«ENDIF»
		\end{array}
    '''
    
    def compileDefinitions(List<Definition> defs) '''
		«FOR d: defs»
			«d.symbol» & = «compileRegularExpression(d.expression)» \\
		«ENDFOR»
    '''


    def CharSequence compileRegularExpression(RegularExpression re) {
	if (re.alternatives.length>0) {
		return compileRegularExpression1(re.expression) + compileAlternatives(re.alternatives)
	} else {
		return compileRegularExpression1(re.expression)
	}
    }

	def compileAlternatives(List<RegularExpression1> alt) {
		return " + {" + (alt.map [a | a.compileRegularExpression1 ].join("} + {")) + "}"
	}

    def compileRegularExpression1(RegularExpression1 re) {
	if (re.concatenations.length>0) {
		return "{" + compileRegularExpression2(re.expression) + "} \\cdot{} "+ compileConcatenations(re.concatenations)
	} else {
		return compileRegularExpression2(re.expression)
	}
    }

	def compileConcatenations(List<RegularExpression2> concats) {
		return "{" + (concats.map [c | c.compileRegularExpression2 ].join("} \\cdot{} {")) + "}"
	}
    
    def compileRegularExpression2(RegularExpression2 re) {
	if (re.kleene !== null) return compileKleene(re.subexpression)
	if (re.omega !== null) return compileOmega(re.subexpression)
	return compileRegularExpression3(re.subexpression)
    }
    
    def compileInParentheses(RegularExpression re) '''
    \left( {«re.compileRegularExpression»} \right)
    '''
    
    def compileKleene(RegularExpression3 re) '''
	{«re.compileRegularExpression3»}^*
    '''

    def compileOmega(RegularExpression3 re) '''
	{«re.compileRegularExpression3»}^{\omega{}}
    '''

    def compileRegularExpression3(RegularExpression3 re) {
	if (re.emptyLangExpression !== null) return compileEmptyLanguage()
	if (re.emptyWordExpression !== null) return compileEmptyWord()
	if (re.letterExpression !== null) return compileLetter(re.letterExpression)
	if (re.referenceExpression !== null) return compileReference(re.referenceExpression)
	return compileInParentheses(re.expression)
    }
    
    def compileEmptyLanguage() '''
    \emptyset{}
    '''

    def compileEmptyWord() '''
    \epsilon{}
    '''
    
    def compileLetter(String letter) {
	if (letter.charAt(0) == '\'') {
			return "\\mathrm{"+letter.substring(1, letter.length-1)+"}"
	} else {
		return letter
	}
    }

    def compileReference(ReferenceExpression e) {
	return "\\mathit{"+e.reference+"}"
    }
    
}


