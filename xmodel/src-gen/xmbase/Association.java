/**
 */
package xmbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbase.Association#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbase.XmbasePackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link xmbase.AssociationRole}.
	 * It is bidirectional and its opposite is '{@link xmbase.AssociationRole#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see xmbase.XmbasePackage#getAssociation_Roles()
	 * @see xmbase.AssociationRole#getAssociation
	 * @model opposite="association" containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<AssociationRole> getRoles();

} // Association
