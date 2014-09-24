package xmodel.dsl.tests.generator.mean

import org.junit.Test
import xmbase.XmbaseFactory
import xmodel.generator.mean.DomainModelGenerator
import xmprimitives.XmprimitivesFactory
import org.junit.Assert

class MeanTests {
	@Test
	def test() {
		val generator = new DomainModelGenerator()
		val myClass = XmbaseFactory.eINSTANCE.createClass
		val attrib1 = XmbaseFactory.eINSTANCE.createAttribute
		attrib1.name = "name"
		attrib1.elementType = XmprimitivesFactory.eINSTANCE.createStringType
		val attrib2 = XmbaseFactory.eINSTANCE.createAttribute
		attrib2.name = "dateOfBirth"
		attrib1.elementType = XmprimitivesFactory.eINSTANCE.createStringType
		myClass.features += #[attrib1, attrib2]
		val result = generator.generateClass(myClass)
		Assert.assertEquals("foo", result)
	}	
}