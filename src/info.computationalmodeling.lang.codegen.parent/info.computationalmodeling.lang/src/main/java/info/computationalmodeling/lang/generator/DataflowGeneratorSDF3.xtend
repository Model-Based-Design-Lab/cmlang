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
import info.computationalmodeling.lang.dataflow.DataflowModel
import info.computationalmodeling.lang.DataflowSupport
import java.util.Map

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DataflowGeneratorSDF3 extends AbstractGenerator {


	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {


        for (m : resource.allContents.toIterable.filter(DataflowModel)) {
			var ds = new DataflowSupport()
        	ds.getChannelNames(m)
        	ds.extractActorProperties(m)
        	ds.extractChannelProperties(m)
        	ds.determinePortNames(m)
	        fsa.generateFile(
	            m.fullyQualifiedName.toString("/") + ".sdfx",
	            m.compile(ds))
        }
	}



	// Below the code generation methods

	def compile(DataflowModel m, DataflowSupport ds) '''
		<?xml version="1.0" encoding="ISO-8859-1"?>
		<sdf3 xsi:noNamespaceSchemaLocation="http://www.es.ele.tue.nl/sdf3/xsd/sdf3-sdf.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.0" type="sdf">
			<applicationGraph name="«m.name»">
				<sdf name="«m.name»" type="«m.name»">
					«this.compileActorList(m, ds)»
					«this.compileChannelList(m, ds)»
					«this.compileInputOutputList(m, ds)»
				</sdf>
				<sdfProperties>
					«this.compileActorProperties(m, ds)»
					«this.compileChannelProperties(m, ds)»
				</sdfProperties>
			</applicationGraph>
		</sdf3>
    '''


	def compileActorList(DataflowModel m, DataflowSupport ds) '''
		«FOR a: ds.setOfActors(m)»
			«IF ds.isProperActor(a)»
			<actor name="«a»" type="«a»">
				«this.compilePortsOfActor(a, ds)»
			</actor>
			«ENDIF»
		«ENDFOR»
    '''

	def compileInputOutputList(DataflowModel m, DataflowSupport ds) '''
		«FOR a: ds.setOfInputActors(m)»
			<input name="«a»" type="«a»">
				«this.compilePortsOfInput(a, ds)»
			</input>
		«ENDFOR»
		«FOR a: ds.setOfOutputActors(m)»
			<output name="«a»" type="«a»">
				«this.compilePortsOfOutput(a, ds)»
			</output>
		«ENDFOR»
    '''


    def compilePortsOfActor(String a, DataflowSupport ds) '''
    	«FOR p: ds.getPortsOfActor(a).entrySet»
    		«this.compilePort(p)»
    	«ENDFOR»
    '''

    def compilePort(Map.Entry<String,Pair<Integer,String>> p) '''
		<port type="«p.getValue().getValue()»" name="«p.getKey()»" rate="«p.getValue().getKey()»"/>
    '''

	def compileChannelList(DataflowModel m, DataflowSupport ds) '''
		«FOR e: m.edges»
			check if src/dst are input or output
			<channel name="«ds.channelNames.get(e)»" dstPort="«ds.getDstPortName(e)»" dstActor="«e.dstact.name»" srcPort="«ds.getSrcPortName(e)»" srcActor="«e.srcact.name»" initialTokens="«ds.channelProperties.get(ds.channelNames.get(e)).get("initialtokens")»"/>
		«ENDFOR»
    '''

	def compileActorProperties(DataflowModel m, DataflowSupport ds)'''
		«FOR a: ds.setOfActors(m)»
			<actorProperties actor="«a»">
				<processor type="p1" default="true">
				<executionTime time="«ds.getExecutionTimeValue(a)»"/>
				</processor>
			</actorProperties>
		«ENDFOR»
	'''

	def compileChannelProperties(DataflowModel m, DataflowSupport ds)'''
		«FOR e: m.edges»
			<channelProperties channel="«ds.channelNames.get(e)»"/>
		«ENDFOR»
	'''


}
