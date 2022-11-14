package info.computationalmodeling.lang

import java.util.HashMap
import java.util.HashSet
import info.computationalmodeling.lang.finitestateautomata.FiniteStateAutomatonModel
import info.computationalmodeling.lang.finitestateautomata.Edge
import info.computationalmodeling.lang.finitestateautomata.State
import info.computationalmodeling.lang.finitestateautomata.UndecoratedState
import org.eclipse.emf.common.util.EList
import info.computationalmodeling.lang.finitestateautomata.EdgeAnnotation

class FiniteStateAutomataSupport {

	public String FsaEpsilonSymbol = "#"
	public String VisualizationEpsilonSymbol = "&epsilon;"

	public HashSet<String> setOfStates = new HashSet<String>() 
	public HashSet<String> setOfInitialStates = new HashSet<String>() 
	public HashSet<String> setOfFinalStates = new HashSet<String>() 
	public HashMap<String,HashSet<String>> stateProperties = new HashMap<String,HashSet<String>>() 
	public HashMap<String,HashMap<String,HashSet<String>>> edgeRelation = new HashMap<String,HashMap<String,HashSet<String>>>() 
	public HashMap<Edge,String> edgeLabels = new HashMap<Edge,String>() 
	public HashMap<String,String> stateToolTips = new HashMap<String,String>() 
	public HashMap<State,String> stateNames = new HashMap<State,String>() 

	def getEdgeLabel(Edge e) {
		if (this.edgeLabels.containsKey(e)) {
			return this.edgeLabels.get(e)
		}
		return ""
	} 

	def void extractProperties(FiniteStateAutomatonModel m){
		this.setOfStates =  new HashSet<String>;
		this.setOfInitialStates =  new HashSet<String>;
		this.setOfFinalStates =  new HashSet<String>;
		for(Edge e: m.edges) {
			this.setOfStates.add(stateName(e.srcstate))
			this.setOfStates.add(stateName(e.dststate))
			this.extractStateProperties(e.srcstate)
			this.extractStateProperties(e.dststate)
			this.extractEdgeRelations(stateName(e.srcstate), stateName(e.dststate), e.specs?.annotations)
			this.extractEdgeLabels(e)
		}
		for(State s: m.states) {
			this.setOfStates.add(stateName(s))
			this.extractStateProperties(s)
		}
		for(String s: this.setOfStates) {
			if (this.stateProperties.get(s).contains('initial')) {
				this.setOfInitialStates.add(s)
			}
			if (this.stateProperties.get(s).contains('final')) {
				this.setOfFinalStates.add(s)
			}
		}
	}
	
	def extractEdgeRelations(String srcState, String dstState, EList<EdgeAnnotation> edgeAnnotations) {
		if (! this.edgeRelation.containsKey(srcState)) {
			this.edgeRelation.put(srcState, new HashMap<String, HashSet<String>>())
		}
		if (! this.edgeRelation.get(srcState).containsKey(dstState)) {
			this.edgeRelation.get(srcState).put(dstState, new HashSet<String>())
		}
		if (edgeAnnotations !== null) {
			for (a: edgeAnnotations){
					this.edgeRelation.get(srcState).get(dstState).add(a.symbol)
			}
		} else  {
			// edge without annotation is epsilon transition
			this.edgeRelation.get(srcState).get(dstState).add(FsaEpsilonSymbol)
		}	
	}
	
	def extractEdgeLabels(Edge e) {
		if (e.specs === null) {
			this.edgeLabels.put(e, VisualizationEpsilonSymbol)
			return
		}
		var labels = new HashSet<String>()
		for (a: e.specs.annotations){
			if (a.symbol == FsaEpsilonSymbol) {
				labels.add(VisualizationEpsilonSymbol)
			} else{
				labels.add(a.symbol)
			}
		}		
		this.edgeLabels.put(e, String.join(",", labels))
	}

	def extractStateProperties(State state) {
		if (! this.stateProperties.containsKey(stateName(state))) {
			this.stateProperties.put(stateName(state), new HashSet<String>())
		}
		if (! this.stateToolTips.containsKey(stateName(state))) {
			this.stateToolTips.put(stateName(state), state.stateName)
		}
		if (state.specs !== null) {
			for(a:state.specs.annotations) {
				var String value
				if (a.initial !== null) {
					value = "initial"
				}
				if (a.final !== null) {
					value = "final"
				}
				if (value=="i") value = "initial"
				if (value=="f") value = "final"
				this.stateProperties.get(stateName(state)).add(value)
				if (a.acceptanceSets !== null) {
					if(a.acceptanceSets.size>0) {
						val acceptanceSet = "{" + String.join(", ", a.acceptanceSets) + "}"
						this.stateToolTips.put(stateName(state), stateName(state) + " acceptance sets: " + acceptanceSet)				
					}
				}
			}
		}
	}

	def stateName(State s) {
		return stateName(s.ustate)
	}

	def stateName(EList<UndecoratedState> l) {
		return l.map[UndecoratedState us | stateName(us)]
	}

	def String stateName(UndecoratedState s) {
		if (stateNames.containsKey(s)) return stateNames.get(s)
		if (s.name !== null) return s.name
		if (s.stateSet !== null) return '''{«String.join(',', stateName(s.stateSet.states))»}'''
		if (s.stateTuple !== null) return '''(«String.join(',', stateName(s.stateTuple.states))»)'''
		return "error!"
	}
	
}
