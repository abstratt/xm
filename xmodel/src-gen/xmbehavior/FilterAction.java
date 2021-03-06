/**
 */
package xmbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.FilterAction#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getFilterAction()
 * @model
 * @generated
 */
public interface FilterAction extends CollectionTransformingAction {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(LiteralClosure)
	 * @see xmbehavior.XmbehaviorPackage#getFilterAction_Filter()
	 * @model containment="true"
	 * @generated
	 */
	LiteralClosure getFilter();

	/**
	 * Sets the value of the '{@link xmbehavior.FilterAction#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(LiteralClosure value);

} // FilterAction
