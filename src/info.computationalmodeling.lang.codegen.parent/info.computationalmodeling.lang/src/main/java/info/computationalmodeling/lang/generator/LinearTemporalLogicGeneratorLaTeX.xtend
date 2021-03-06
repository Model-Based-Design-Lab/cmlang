/*
 * generated by Xtext 2.19.0
 */
package info.computationalmodeling.lang.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import info.computationalmodeling.lang.lineartemporallogic.LTLModel
import info.computationalmodeling.lang.lineartemporallogic.LTLFormula
import java.util.List
import info.computationalmodeling.lang.lineartemporallogic.LTLFormula1
import info.computationalmodeling.lang.lineartemporallogic.LTLFormula2
import info.computationalmodeling.lang.lineartemporallogic.LTLFormula3
import info.computationalmodeling.lang.lineartemporallogic.LTLFormula4
import info.computationalmodeling.lang.lineartemporallogic.LTLFormula5
import info.computationalmodeling.lang.lineartemporallogic.LTLFormula6
import info.computationalmodeling.lang.lineartemporallogic.SetOfSymbols
import info.computationalmodeling.lang.lineartemporallogic.Definition

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LinearTemporalLogicGeneratorLaTeX extends AbstractGenerator {


	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {


        for (m : resource.allContents.toIterable.filter(LTLModel)) {
	        fsa.generateFile(
	            m.fullyQualifiedName.toString("/") + ".LaTeX",
	            m.compileLaTeX)                
        }
	}


	def compileLaTeX(LTLModel m)  '''
		\begin{array}{l}
		«compileLTLFormula(m.formula)» \\
		«IF m.alphabet !== null»
		\mathrm{alphabet} ~\{«compileSetOfSymbols(m.alphabet)»\} \\
		«ENDIF»
		«IF m.definitions.length > 0»
		\mathrm{where} \\
		\begin{align}
		«compileDefinitions(m.definitions)»
		\end{align}\\
		«ENDIF»
		\end{array}
    '''

    def compileSetOfSymbols(SetOfSymbols ss) {
	return ss.symbols.join(", ")
    }

    def compileDefinitions(List<Definition> defs) '''
		«FOR d: defs»
			\mathit{«d.proposition»} & = \{«compileSetOfSymbols(d.symbols)»\} \\
		«ENDFOR»
    '''

    def CharSequence compileLTLFormula(LTLFormula re) {
	if (re.alternatives.length>0) {
		return compileLTLFormula1(re.formula) + compileOrTerms(re.alternatives)
	} else {
		return compileLTLFormula1(re.formula)
	}
    }

	def compileOrTerms(List<LTLFormula1> alt) {
		return " \\vee {" + (alt.map [a | a.compileLTLFormula1 ].join("} \\vee {")) + "}"
	}

    def compileLTLFormula1(LTLFormula1 re) {
	if (re.alternatives.length>0) {
		return compileLTLFormula2(re.formula) + compileAndTerms(re.alternatives)
	} else {
		return compileLTLFormula2(re.formula)
	}
    }

	def compileAndTerms(List<LTLFormula2> alt) {
		return " \\wedge {" + (alt.map [a | a.compileLTLFormula2 ].join("} \\wedge {")) + "}"
	}

    
    def CharSequence compileLTLFormula2(LTLFormula2 re) {
	//	subexpression1 = LTLFormula3 ('U' subexpression2 = LTLFormula3)?
		if (re.subexpression2 !== null) return compileUntilFormula(re.subexpression1, re.subexpression2)
		return compileLTLFormula3(re.subexpression1)
    }

    def compileUntilFormula(LTLFormula3 re1, LTLFormula2 re2) {
		return compileLTLFormula3(re1) + " U " + compileLTLFormula2(re2)
    }

    def CharSequence compileLTLFormula3(LTLFormula3 re) {
	//	subexpression1 = LTLFormula4 ('R' subexpression2 = LTLFormula4)?
		if (re.subexpression2 !== null) return compileReleaseFormula(re.subexpression1, re.subexpression2)
		return compileLTLFormula4(re.subexpression1)
    }

    def compileReleaseFormula(LTLFormula4 re1, LTLFormula3 re2) {
		return compileLTLFormula4(re1) + " R " + compileLTLFormula3(re2)
    }

    def CharSequence compileLTLFormula4(LTLFormula4 re) {
		if (re.consequence !== null) return compileLTLFormula5(re.subexpression) + compileImplicationFormula(re.consequence)
		return compileLTLFormula5(re.subexpression)
	}

    def CharSequence compileLTLFormula5(LTLFormula5 re) {
		if (re.nextSubexpression !== null) return compileNextFormula(re.nextSubexpression)
		if (re.eventuallySubexpression !== null) return compileEventuallyFormula(re.eventuallySubexpression)
		if (re.alwaysSubexpression !== null) return compileAlwaysFormula(re.alwaysSubexpression)
		if (re.notSubexpression !== null) return compileNotFormula(re.notSubexpression)
		return compileLTLFormula6(re.subexpression)
    }

    def compileNextFormula(LTLFormula5 re) {
		return " X " + compileLTLFormula5(re)
    }
    def compileEventuallyFormula(LTLFormula5 re) {
		return " F " + compileLTLFormula5(re)
    }
    def compileAlwaysFormula(LTLFormula5 re) {
		return " G " + compileLTLFormula5(re)
    }
    

    def compileImplicationFormula(LTLFormula4 re) {
		return " \\Rightarrow{} " + compileLTLFormula4(re)
    }

    def compileNotFormula(LTLFormula5 re) {
		return " \\neg " + compileLTLFormula5(re)
    }

    def compileLTLFormula6(LTLFormula6 re) {
	//				propositionExpression = PropositionExpression | '(' expression = LTLFormula ')'
		if (re.propositionExpression !== null) return compileProposition(re.propositionExpression)
		if (re.trueExpression !== null) return "{\\mathrm{true}}"
		if (re.falseExpression !== null) return "{\\mathrm{false}}"
		return compileInParentheses(re.expression)
    }
    
    def compileInParentheses(LTLFormula re) '''
    \left( {«re.compileLTLFormula»} \right)
    '''

    def compileProposition(String prop) {
	if (prop.charAt(0) == '\'') {
			return "\\mathit{"+prop.substring(1, prop.length-1)+"}"
	} else {
		return prop
	}
    }
    
    
}


