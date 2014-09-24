package xmodel.generator.mean

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import xmbase.Attribute
import xmbase.Class
import xmbase.Primitive
import xmbase.Type
import xmprimitives.BooleanType
import xmprimitives.DateType
import xmprimitives.DecimalType
import xmprimitives.FloatType
import xmprimitives.IntegerType
import xmprimitives.MemoType
import xmprimitives.StringType

class DomainModelGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		val classes = resource.allContents.filter(typeof(Class))

		classes.forEach[generateClass(it)]
	}

	def generateClass(Class clazz) '''
		var «clazz.name.toFirstLower»Schema = new Schema(«generateClassDef(clazz).toString.trim»);
	'''

	def generateClassDef(Class clazz) {
		return '''
	{
    	«clazz.attributes.map[generateSchemaAttribute(it)].join(',\n')»
	}
	'''
    }

	def generateSchemaAttribute(Attribute attribute) '''
		«attribute.name» : «generateTypeDef(attribute.elementType)»
	'''

	def generateTypeDef(Type type) {
		switch (type) {
			Primitive:
				generatePrimitiveDef(type)
			Class:
				generateClassDef(type)
		}
	}

	def generatePrimitiveDef(Primitive type) {
		#{
			StringType -> 'String',
			BooleanType -> 'Boolean',
			IntegerType -> 'Number',
			FloatType -> 'Number',
			DecimalType -> 'Number',
			DateType -> 'Date',
			MemoType -> 'String'
		}.get(type)
	}

}
