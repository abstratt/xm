/**
 */
package xmbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.MapAction#getMapper <em>Mapper</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getMapAction()
 * @model
 * @generated
 */
public interface MapAction extends CollectionTransformingAction {
	/**
	 * Returns the value of the '<em><b>Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper</em>' containment reference.
	 * @see #setMapper(LiteralClosure)
	 * @see xmbehavior.XmbehaviorPackage#getMapAction_Mapper()
	 * @model containment="true"
	 * @generated
	 */
	LiteralClosure getMapper();

	/**
	 * Sets the value of the '{@link xmbehavior.MapAction#getMapper <em>Mapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper</em>' containment reference.
	 * @see #getMapper()
	 * @generated
	 */
	void setMapper(LiteralClosure value);

} // MapAction
