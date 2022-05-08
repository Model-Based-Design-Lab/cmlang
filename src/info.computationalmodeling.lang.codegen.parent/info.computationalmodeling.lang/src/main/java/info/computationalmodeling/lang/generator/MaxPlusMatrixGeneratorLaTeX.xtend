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
import info.computationalmodeling.lang.maxplusmatrix.MaxPlusMatrixModel
import info.computationalmodeling.lang.maxplusmatrix.MaxPlusMatrix
import info.computationalmodeling.lang.maxplusmatrix.VectorSequence
import info.computationalmodeling.lang.maxplusmatrix.EventSequence
import info.computationalmodeling.lang.maxplusmatrix.Row
import java.util.List
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MaxPlusMatrixGeneratorLaTeX extends AbstractGenerator {


	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {


        for (m : resource.allContents.toIterable.filter(MaxPlusMatrixModel)) {
	        fsa.generateFile(
	            m.fullyQualifiedName.toString("/") + ".LaTeX",
	            m.compileLaTeX)                
        }
	}


	def compileLaTeX(MaxPlusMatrixModel m)  '''
		\begin{array}{l}
		\begin{align}
		«IF m.matrices !== null»
			«FOR mt: m.matrices»
				«compileMatrix(mt)»
			«ENDFOR»
		«ENDIF»
		«IF m.vectorsequences !== null»
			«FOR mt: m.vectorsequences»
				«compileVectorSequence(mt)»
			«ENDFOR»
		«ENDIF»
		«IF m.eventsequences !== null»
			«FOR mt: m.eventsequences»
				«compileEventSequence(mt)»
			«ENDFOR»
		«ENDIF»
		\end{align}\\
		\end{array}
    '''
    
    def escapeUnderscore(String s) {
	return s.replaceAll("_", "\\\\_")
    }
    
    def compileMatrix(MaxPlusMatrix m) '''
	\mathit{«escapeUnderscore(m.name)»} &=
	\begin{pmatrix}
	«FOR r: m.rows»
		«compileRow(r)» \\
	«ENDFOR»
	\end{pmatrix} \\
    '''

    def compileVectorSequence(VectorSequence vs) '''
	\mathit{«escapeUnderscore(vs.name)»} &=
	\begin{pmatrix}
	«FOR r: transposeVectors(vs.vectors)»
		«compileRowOfStrings(r)» \\
	«ENDFOR»
	\end{pmatrix} \\
    '''

    def compileEventSequence(EventSequence es) '''
	\mathit{«escapeUnderscore(es.name)»} &=
	\left[
		\begin{array}{l}
		«compileRow(es.sequence)» \\
	\end{array} 
		\right]\\
    '''
    
	def transposeVectors(List<Row> vectors) {
		var res = new ArrayList<ArrayList<String>>()
		if (vectors.length == 0) {
			return res
		}
		var j = 0
		for (v: vectors) {
			var i = 0
			for (e: v.elements) {
				if (res.length <= i) {
					res.add(new ArrayList<String>())
					while (res.get(i).size() < j){
						res.get(i).add("-inf")
					}
				}				
				res.get(i).add(e)
				i += 1
			}
			j += 1
		}
		return res
	}

	def compileRow(Row r) {
		var res = ""
		var i = 0
		for (e: r.elements) {
			if (i > 0) {
				res += " & "
			}
			i = i+1
			if (e == "-inf") {
				res += " - \\infty{}"
			}
			else {
				res += e
			}
		}
		return res
	}
	
	def compileRowOfStrings(ArrayList<String> r) {
		var res = ""
		var i = 0
		for (e: r) {
			if (i > 0) {
				res += " & "
			}
			i = i+1
			if (e == "-inf") {
				res += " - \\infty{}"
			}
			else {
				res += e
			}
		}
		return res
	}
        
}


