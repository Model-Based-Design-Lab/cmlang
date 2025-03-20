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
import info.computationalmodeling.lang.markovchains.MarkovChainModel
import info.computationalmodeling.lang.MarkovChainSupport
import java.math.BigInteger
import java.lang.Math
import org.apache.commons.math3.fraction.BigFraction
/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MarkovChainsGeneratorOctave extends AbstractGenerator {


	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {


        for (m : resource.allContents.toIterable.filter(MarkovChainModel)) {
	        fsa.generateFile(
	            m.fullyQualifiedName.toString("/") + ".mat",
	            m.compile)                
	        fsa.generateFile(
	            m.fullyQualifiedName.toString("/") + ".LaTeX",
	            m.compileLaTeX)                
        }
	}




	def compile(MarkovChainModel m) {
		val states = MarkovChainSupport.getStates(m)
		val numbStates = states.length
		val stateIndex = MarkovChainSupport.createStateIndex(states)
		val trans = MarkovChainSupport.transitionProbabilities(m, states, stateIndex)
		
		val builder = new StringBuilder();
        builder.append("[").append("\n");
        var i = 0
        for (var r=0; r<numbStates;){
	        r++
	        for (var c=0; c<numbStates;){
	        	c++;
	        	builder.append(trans.get(i++).toString);
	        	if (c < numbStates) {
	        		builder.append(", ")
	        	} else {
	        		if (r < numbStates) {
	        			builder.append(";\n")
	        		}
	        	}
	        	
			}	        
        }
        builder.append("\n]\n");

        return builder.toString();
    }

	def scaleArray(BigInteger[] a, int r, BigInteger f) {
		for(var i=0; i<r; i++){
			a.set(i, a.get(i) * f)
		}
	}

	def toIntegerArray(double[] numbers) {
		var BigInteger[] result = newArrayOfSize(numbers.length)
		var f = new BigFraction(1,1)
		// invariant: the list of numbers up to i can be written as an irreducible set of integers, multiplied by the fraction f
		for (var i=0; i<numbers.length; i++) {
			val x = new BigFraction(numbers.get(i), 1e-3, 10)
			val c = f.numerator.gcd(x.numerator)
			val d = f.denominator.gcd(x.denominator)
			val alpha = f.numerator.divide(c)
			val pi = x.numerator.divide(c)
			val beta = f.denominator.divide(d)
			val xi = x.denominator.divide(d)
			scaleArray(result, i, alpha * xi)
			result.set(i, pi.multiply(beta))
			f = new BigFraction(c, d.multiply(beta).multiply(xi))
		}
		return f -> result
	}

	// to be improved, give a nice representation of the double value, round to a close 'round' number, e.g., 0.1 instead of 0.10000002
	// perhaps even select a number of decimal place for the whole matrix
	def prettyFmt(double d) {
		return String.format("%.3f", d)
	}

	def fractionLaTeXBuilder(BigFraction frac, int numbStates, BigInteger[] intTrans) {
		val builder = new StringBuilder();
        builder.append("\\frac{").append(frac.numerator.toString).append("}{").append(frac.denominator.toString).append("}\\cdot\n");
        builder.append("\\begin{bmatrix}").append("\n");
        var i = 0
        for (var r=0; r<numbStates;){
	        r++
	        for (var c=0; c<numbStates;){
	        	c++;
	        	builder.append(intTrans.get(i++));
	        	if (c < numbStates) {
	        		builder.append(" & ")
	        	} else {
	        		if (r <= numbStates) {
	        			builder.append("\\\\\n")
	        		}
	        	}
			}	        
        }
        builder.append("\\end{bmatrix}\n");
		return builder
	}

	def frac2double(BigFraction frac, BigInteger[] intArray, int len) {
		var result = newDoubleArrayOfSize(len)
		for (var i=0; i<len; i++){
			result.set(i, frac.doubleValue * intArray.get(i).doubleValue)		
		}
		return result
	}

	def maxExponent(double[] numbers) {
		var result = -100
		for (var i=0; i<numbers.length; i++) {
			if (numbers.get(i) != 0.0d) {
				val exp = (Math.ceil(Math.log10(Math.abs(numbers.get(i))))) as int
				if (exp > result) result = exp ;
			}
		}
		return result
	}

	def minExponent(double[] numbers) {
		var result = 100
		for (var i=0; i<numbers.length; i++) {
			if (numbers.get(i) != 0.0d) {
				val exp = (Math.ceil(Math.log10(Math.abs(numbers.get(i))))) as int
				if (exp < result) result = exp ;
			}
		}
		return result
	}
	
	def multiplyArray(double[] numbers, double factor) {
		var result = newDoubleArrayOfSize(numbers.length)
		for(var i=0; i<numbers.length; i++){
			result.set(i, numbers.get(i) * factor)
		}
		return result
	}

	def decimalLaTeXBuilder(BigFraction frac, int numbStates, BigInteger[] intTrans) {
		val builder = new StringBuilder();
        // TODO: optionally factor out common factor of ten
		// TODO: determine the number of decimals to show

		val dblProb = frac2double(frac, intTrans, numbStates*numbStates)
		val minExp = minExponent(dblProb)
		val maxExp = maxExponent(dblProb)
		var factor = 1.0d
		var String factorStr
		if (minExp >= 2) {
			factor = Math.pow(10.0d, minExp)
			factorStr = "10^{"+minExp.toString+"}"
		} else {
			if (maxExp <= -2) {
				factor = Math.pow(10.0d, maxExp)
				factorStr = "10^{"+minExp.toString+"}"
			}			
		}
		
		val dblProbFact = multiplyArray(dblProb, factor)

		if (factor != 1.0d) {
			builder.append(factorStr)
			builder.append("\\cdot\n")
		}

		builder.append("\\begin{bmatrix}").append("\n");
        var i = 0
        for (var r=0; r<numbStates;){
	        r++
	        for (var c=0; c<numbStates;){
	        	c++;
	        	builder.append(prettyFmt(dblProbFact.get(i++)));
	        	if (c < numbStates) {
	        		builder.append(" & ")
	        	} else {
	        		if (r <= numbStates) {
	        			builder.append("\\\\\n")
	        		}
	        	}
			}	        
        }
        builder.append("\\end{bmatrix}\n");
		return builder
	}


	def compileLaTeX(MarkovChainModel m) {
		val states = MarkovChainSupport.getStates(m)
		val numbStates = states.length
		val stateIndex = MarkovChainSupport.createStateIndex(states)
		val trans = MarkovChainSupport.transitionProbabilities(m, states, stateIndex)
		
		val fracTrans = toIntegerArray(trans)
		val frac = fracTrans.key
		val intTrans = fracTrans.value

		// if the denominator is too big, go for decimal representation

		var StringBuilder builder
		if (frac.denominator < BigInteger.valueOf(10000)) 
		{
			builder = fractionLaTeXBuilder(frac, numbStates, intTrans)
		}
		else
		{
			builder = decimalLaTeXBuilder(frac, numbStates, intTrans)
		}

        return builder.toString();
    }


	def asMatrix(MarkovChainModel m) '''
		«FOR s:MarkovChainSupport.getStates(m)»
			«s»;
		«ENDFOR»
    '''
}
