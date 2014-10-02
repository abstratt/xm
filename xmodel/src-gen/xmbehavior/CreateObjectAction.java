/**
 */
package xmbehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.CreateObjectAction#getClass_ <em>Class</em>}</li>
 *   <li>{@link xmbehavior.CreateObjectAction#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getCreateObjectAction()
 * @model
 * @generated
 */
public interface CreateObjectAction extends SimpleValueAction {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(xmbase.Class)
	 * @see xmbehavior.XmbehaviorPackage#getCreateObjectAction_Class()
	 * @model
	 * @generated
	 */
	xmbase.Class getClass_();

	/**
	 * Sets the value of the '{@link xmbehavior.CreateObjectAction#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(xmbase.Class value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link xmbehavior.ValueAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see xmbehavior.XmbehaviorPackage#getCreateObjectAction_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueAction> getArguments();

} // CreateObjectAction
