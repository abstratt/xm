/**
 */
package xmbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbase.Namespace#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbase.XmbasePackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link xmbase.NamedElement}.
	 * It is bidirectional and its opposite is '{@link xmbase.NamedElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see xmbase.XmbasePackage#getNamespace_Children()
	 * @see xmbase.NamedElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<NamedElement> getChildren();

} // Namespace
