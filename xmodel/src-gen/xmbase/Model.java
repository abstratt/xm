/**
 */
package xmbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbase.Model#getTopLevelElements <em>Top Level Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbase.XmbasePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Namespace {
	/**
	 * Returns the value of the '<em><b>Top Level Elements</b></em>' containment reference list.
	 * The list contents are of type {@link xmbase.TopLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Level Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level Elements</em>' containment reference list.
	 * @see xmbase.XmbasePackage#getModel_TopLevelElements()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%xmbase.NamedElement%>> _children = this.getChildren();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%xmbase.NamedElement%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%xmbase.NamedElement%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%xmbase.NamedElement%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf((it instanceof <%xmbase.TopLevel%>));\n\t}\n};\n<%java.lang.Iterable%><<%xmbase.NamedElement%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%xmbase.NamedElement%>>filter(_children, _function);\n<%java.util.List%><<%xmbase.NamedElement%>> _list = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%xmbase.NamedElement%>>toList(_filter);\nreturn new <%org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList%>(_list);'"
	 * @generated
	 */
	EList<TopLevel> getTopLevelElements();

} // Model
