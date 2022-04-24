package info.computationalmodeling.lang

import info.computationalmodeling.lang.markovchains.MarkovChainModel
import java.util.Set
import info.computationalmodeling.lang.markovchains.Edge
import info.computationalmodeling.lang.markovchains.State
import info.computationalmodeling.lang.markovchains.Probability
import info.computationalmodeling.lang.markovchains.Reward
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.Map

class MarkovChainSupport {

	public HashSet<String> setOfStates = new HashSet<String>() 
	public HashMap<String,String> stateRewardLabels = new HashMap<String,String>() 
	public HashMap<String,String> stateInitialProbabilityLabels = new HashMap<String,String>() 

	def void extractProperties(MarkovChainModel m){
		this.setOfStates =  new HashSet<String>;
		this.stateRewardLabels = new HashMap<String,String>() 
		this.stateInitialProbabilityLabels = new HashMap<String,String>() 
		
		for(Edge e: m.edges) {
			this.setOfStates.add(e.srcstate.name)
			this.setOfStates.add(e.dststate.name)
			this.extractStateProperties(e.srcstate)
			this.extractStateProperties(e.dststate)
		}
	}

	def extractStateProperties(State state) {
		if (! this.stateRewardLabels.containsKey(state.name)) {
			this.stateRewardLabels.put(state.name, "")
		}
		if (! this.stateInitialProbabilityLabels.containsKey(state.name)) {
			this.stateInitialProbabilityLabels.put(state.name, "")
		}
		if (state.specs !== null) {
			for(a:state.specs.annotations) {
				if (a.initprob !== null) {
					this.stateInitialProbabilityLabels.put(state.name, this.extractProbabilityLabel(a.initprob))
				}
				if (a.reward !== null) {
					this.stateRewardLabels.put(state.name, this.extractRewardLabel(a.reward))
				}

			}
		}
	}

	def extractRewardLabel(Reward rSpec) {
		if (rSpec.ratio !== null){
			if (rSpec.ratio.numerator != 0) {
				return rSpec.ratio.numerator.toString + "/" + rSpec.ratio.denominator.toString
			} else {
				return rSpec.ratio.negnumerator.toString + "/" + rSpec.ratio.denominator.toString
			}
		} else {
			if (rSpec.float !== null)
			{
				return rSpec.float.toString
			}
			else 
			{
				if (rSpec.negint === null) {
					return rSpec.int.toString
				} else {
					return rSpec.negint.toString
				}
			}
		}
	}

	def extractProbabilityLabel(Probability rSpec) {
		if (rSpec.ratio !== null){
			return rSpec.ratio.numerator.toString + "/" + rSpec.ratio.denominator.toString
		} else {
			if (rSpec.float !== null)
			{
				return rSpec.float.toString
			}
			else 
			{
				return rSpec.int.toString
			}
		}
	}

	
	def graphVizStateLabel(State s) {
		var nm = s.name
		return nm+"\\n"+this.stateRewardLabels.get(nm)+"\\n"+this.stateInitialProbabilityLabels.get(nm)
	}


	static def addEdgeStates(Edge edge, Set<String> states) {
		states.add(edge.srcstate.name)
		states.add(edge.dststate.name)
	}


	static def getStates(MarkovChainModel m) 
	{
		var Set<String> stateSet = new HashSet<String>()
		for (e: m.edges) {
			addEdgeStates(e, stateSet)
		}
		var result = new ArrayList<String>(stateSet)
		return result
	}

	static def addEdgeStatesECoreMap(Edge edge, HashMap<String,  info.computationalmodeling.lang.markovchains.State> map) {
		if (! map.containsKey(edge.srcstate.name)) {
			map.put(edge.srcstate.name, edge.srcstate)
		}
		if (! map.containsKey(edge.dststate.name)) {
			map.put(edge.dststate.name, edge.dststate)
		}
	}

	static def getStatesECoreMap(MarkovChainModel m) 
	{
		var HashMap<String, info.computationalmodeling.lang.markovchains.State> result = new HashMap<String, info.computationalmodeling.lang.markovchains.State>()
		for (e: m.edges) {
			addEdgeStatesECoreMap(e, result)
		}
		return result
	}

	static def createStateIndex(ArrayList<String> states) {
		var result = new HashMap<String, Integer>()
		var n = 0;
		for (s: states) {
			result.put(s, n++)
		}
		return result
	}

	static def initializeTransitionProbabilities(int numbStates) {
		var result = newDoubleArrayOfSize(numbStates * numbStates)
		// initialize the array 
		for (var k=0; k<numbStates*numbStates; k++){
			result.set(k, 0.0)
		}
		return result		
	}
	
	static def getRowTotal(double[] trans, int numbStates, int row) {
		var total = 0.0d
		var index = numbStates * row
		for(var c=0; c<numbStates; c++) {
			total += trans.get(index++)
		}
		return total
	}

	static def probabilityLabel(Edge e) {
		for (a: e.specs.annotations)
		{
			if (a.probability !== null) {
				var Probability pSpec = a.probability
				if (pSpec.ratio !== null){
					return pSpec.ratio.numerator.toString + "/" + pSpec.ratio.denominator.toString
				} else {
					if (pSpec.float !== null)
					{
						return pSpec.float
					}
					else 
					{
						return pSpec.int.toString
					}
				}
			}
		}
	}

	static def rewardLabel(State s) {
		if (s.specs === null){
			return ""
		}
		for (a: s.specs.annotations)
		{
			if (a.reward !== null) {
				var Reward rSpec = a.reward
				if (rSpec.ratio !== null){
					return rSpec.ratio.numerator.toString + "/" + rSpec.ratio.denominator.toString
				} else {
					if (rSpec.float !== null)
					{
						return rSpec.float
					}
					else 
					{
						return rSpec.int.toString
					}
				}
			}
		}
	}

	static def transitionProbabilities(MarkovChainModel m, ArrayList<String> states, Map<String, Integer> stateIndex) {
		var result = initializeTransitionProbabilities(states.length)
		val numbStates = states.length
		// iterate edges
		for (e: m.edges) {
			val annotations = e.specs.annotations
			val srcIndex = stateIndex.get(e.srcstate.name) // column index to matrix
			val dstIndex = stateIndex.get(e.dststate.name) // row index to matrix
			val index = srcIndex*numbStates + dstIndex
			for (a: annotations){
				if (a.probability !== null) {
					var Probability pSpec = a.probability
					var double p
					if (pSpec.ratio !== null){
						p = ((pSpec.ratio.numerator) as double) / ((pSpec.ratio.denominator) as double)					
					} else {
						if (pSpec.float !== null)
						{
							p = Float.parseFloat(pSpec.float)	
						}
						else 
						{
							p = pSpec.int								
						}
					}
					result.set(index, result.get(index) + p) 
				}		
			}	
		}
		// complete the implicit stay probabilities
		//  outgoing probabilities (rows) need to add up to 1.0
		for (var r=0; r<numbStates; r++) {
			val sum = getRowTotal(result, numbStates, r)
			val selfIndex = r * (numbStates + 1)  
			if (result.get(selfIndex) == 0.0d && sum < 1.0d) {
				result.set(selfIndex, result.get(selfIndex) + 1.0 - sum)
			}
		}
		return result
	}

	
}
