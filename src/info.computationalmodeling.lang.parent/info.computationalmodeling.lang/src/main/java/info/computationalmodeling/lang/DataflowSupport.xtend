package info.computationalmodeling.lang

import java.util.HashMap
import info.computationalmodeling.lang.dataflow.Edge
import info.computationalmodeling.lang.dataflow.DataflowModel
import info.computationalmodeling.lang.dataflow.ActorAnnotation
import info.computationalmodeling.lang.dataflow.Actor
import info.computationalmodeling.lang.dataflow.Input
import info.computationalmodeling.lang.dataflow.Output
import info.computationalmodeling.lang.dataflow.EdgeAnnotation
import java.util.Set
import java.util.HashSet

class DataflowSupport {

	public HashMap<String,HashMap<String,String>> actorProperties = new HashMap<String,HashMap<String,String>>() 
	public HashMap<String,HashMap<String,String>> channelProperties = new HashMap<String,HashMap<String,String>>() 
	public HashMap<Edge,String> channelNames = new HashMap<Edge,String> 
	// ports: map from actor to map from name to pair of rate, in/out 
	public HashMap<String,HashMap<String,Pair<Integer,String>>> ports = new HashMap<String,HashMap<String,Pair<Integer,String>>>  
	// link between channels 'src'/'dst' and port names
	public HashMap<String,HashMap<String,String>> portnames = new HashMap<String,HashMap<String,String>>()

	public HashSet<String> inputNames = new HashSet<String>
	public HashSet<String> outputNames = new HashSet<String>

	int DEFAULT_ACTOR_EXECUTION_TIME = 1


	def getChannelNames(DataflowModel m){
		var n = 0
		for(e: m.edges) {
			var chname = ""
			if (e.specs !== null){
				for (a: e.specs.annotations) {
					if (a.name !== null) {
						chname = a.name
						
					}
				}
			}
			if (chname == "") {
				chname = "chan"+n.toString()
				n = n + 1
			}
			this.channelProperties.put(chname, new HashMap<String,String>())
			this.channelNames.put(e, chname)
		}
	}


	def addProperty(HashMap<String, HashMap<String, String>> dict, String iname, String pname, String pvalue) {
		if ( dict.get(iname) === null ) {
			dict.put(iname, new HashMap<String, String>())
		}
		dict.get(iname).put(pname, pvalue)
	}

	def void addActorProperties(Actor a) {
		this.addProperty(this.actorProperties, a.name, "name", a.name)
		if (a.specs !== null) {
			for(ActorAnnotation ann: a.specs.annotations){
				if (ann.executiontime !== null) {
					this.addProperty(this.actorProperties, a.name, "executiontime", ann.executiontime.toString())
				}
			}
		}
	}

	def void extractActorProperties(DataflowModel m) {
		actorProperties = new HashMap<String, HashMap<String,String>>()
		for(Edge e: m.edges) {
			this.addActorProperties(e.srcact)
			this.addActorProperties(e.dstact)
		}
	}

	def void extractInputOutputNames(DataflowModel m) {
		for(Input i: m.inputs) {
			this.inputNames.add(i.name)
		}
		for(Output o: m.outputs) {
			this.outputNames.add(o.name)
		}
	}


	def void addChannelProperties(Edge e) {
		val ename = this.channelNames.get(e) 
		this.addProperty(this.channelProperties, ename, "name", ename)
		// set default values
		this.addProperty(this.channelProperties, ename, "initialtokens", "0")
		this.addProperty(this.channelProperties, ename, "prodrate", "1")
		this.addProperty(this.channelProperties, ename, "consrate", "1")
		if (e.specs !== null) {
			for(EdgeAnnotation ann: e.specs.annotations){
				if (ann.initialtokens != 0) {
					this.addProperty(this.channelProperties, ename, "initialtokens", ann.initialtokens.toString())
				}

				// 0 is the default int value when not specified.
				// should change if we want to allow rates of 0
				if (ann.prodrate != 0) {
					this.addProperty(this.channelProperties, ename, "prodrate", ann.prodrate.toString())
				}

				if (ann.consrate != 0) {
					this.addProperty(this.channelProperties, ename, "consrate", ann.consrate.toString())
				}

				if (ann.tokensize != 0) {
					this.addProperty(this.channelProperties, ename, "tokensize", ann.tokensize.toString())
				}
			}
		}
	}

	def int getProdRate(Edge e) {
		val ename = this.channelNames.get(e) 
		return Integer.parseInt(this.channelProperties.get(ename).get("prodrate"))
	}

	def int getConsRate(Edge e) {
		val ename = this.channelNames.get(e) 
		return Integer.parseInt(this.channelProperties.get(ename).get("consrate"))
	}

	def int getInitialTokens(Edge e) {
		val ename = this.channelNames.get(e) 
		return Integer.parseInt(this.channelProperties.get(ename).get("initialtokens"))
	}
	
	def double getExecutionTime(String actor) {
		if (this.actorProperties.containsKey(actor)) {
			if (this.actorProperties.get(actor).containsKey("executiontime")) {
				return Double.parseDouble(this.actorProperties.get(actor).get("executiontime"))
			}
		}
		return DEFAULT_ACTOR_EXECUTION_TIME
	}

	def void extractChannelProperties(DataflowModel m) {
		channelProperties = new HashMap<String, HashMap<String,String>>()
		for(Edge e: m.edges) {
			this.addChannelProperties(e)
		}
	}

	def Set<String> setOfActors(DataflowModel m){
		var result = new HashSet<String>;
		for(Edge e: m.edges) {
			result.add(e.srcact.name)
			result.add(e.dstact.name)
		}
		return result
	}


	def addPort(String aname, String ename, String dir, String pname, Integer prate, String pdir){
		if (this.ports.get(aname) === null) {
			this.ports.put(aname, new HashMap<String,Pair<Integer,String>>())
		}
		this.ports.get(aname).put(pname, new Pair<Integer,String>(prate, pdir))
		if (this.portnames.get(ename) === null) {
			this.portnames.put(ename, new HashMap<String,String>())
		}
		this.portnames.get(ename).put(dir, pname)
	}

    def determinePortNames(DataflowModel m) {
    	for (e: m.edges) {
    		val ename = this.channelNames.get(e)
			// add port for source actor
    		var pname = e.srcact.name + "_to_" + ename
    		var rate = this.channelProperties.get(ename).get("prodrate")
    		var prate = (rate === null) ? 1 : Integer.parseInt(rate)
    		this.addPort(e.srcact.name, ename, "src", pname, prate, "out")
			// add port for dest actor
    		pname = ename + "_to_" + e.dstact.name
    		rate = this.channelProperties.get(ename).get("consrate")
    		prate = (rate === null) ? 1 : Integer.parseInt(rate)
    		this.addPort(e.dstact.name, ename, "dst", pname, prate, "in")
    	}
    }
    
    def getPortsOfActor(String aname) {
    	return this.ports.get(aname)
    }
    
    
    def String getDstPortName(Edge e) {
    	return this.portnames.get(this.channelNames.get(e)).get("dst")
    }

    def String getSrcPortName(Edge e) {
    	return this.portnames.get(this.channelNames.get(e)).get("src")
    }


	
}
