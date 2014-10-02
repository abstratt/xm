/**
 */
package xmbase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbase.AssociationRole#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbase.XmbasePackage#getAssociationRole()
 * @model
 * @generated
 */
public interface AssociationRole extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xmbase.Association#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' container reference.
	 * @see #setAssociation(Association)
	 * @see xmbase.XmbasePackage#getAssociationRole_Association()
	 * @see xmbase.Association#getRoles
	 * @model opposite="roles" transient="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link xmbase.AssociationRole#getAssociation <em>Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' container reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

} // AssociationRole
