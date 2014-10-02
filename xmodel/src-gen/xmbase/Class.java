/**
 */
package xmbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbase.Class#getFeatures <em>Features</em>}</li>
 *   <li>{@link xmbase.Class#getOperations <em>Operations</em>}</li>
 *   <li>{@link xmbase.Class#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbase.XmbasePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link xmbase.ClassFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see xmbase.XmbasePackage#getClass_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link xmbase.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see xmbase.XmbasePackage#getClass_Operations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%xmbase.ClassFeature%>> _features = this.getFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%xmbase.ClassFeature%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%xmbase.ClassFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%xmbase.ClassFeature%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf((it instanceof <%xmbase.Operation%>));\n\t}\n};\n<%java.lang.Iterable%><<%xmbase.ClassFeature%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%xmbase.ClassFeature%>>filter(_features, _function);\n<%java.util.List%><<%xmbase.ClassFeature%>> _list = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%xmbase.ClassFeature%>>toList(_filter);\nreturn new <%org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList%>(_list);'"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link xmbase.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see xmbase.XmbasePackage#getClass_Attributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%xmbase.ClassFeature%>> _features = this.getFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%xmbase.ClassFeature%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%xmbase.ClassFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%xmbase.ClassFeature%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf((it instanceof <%xmbase.Attribute%>));\n\t}\n};\n<%java.lang.Iterable%><<%xmbase.ClassFeature%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%xmbase.ClassFeature%>>filter(_features, _function);\n<%java.util.List%><<%xmbase.ClassFeature%>> _list = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%xmbase.ClassFeature%>>toList(_filter);\nreturn new <%org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList%>(_list);'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Class
