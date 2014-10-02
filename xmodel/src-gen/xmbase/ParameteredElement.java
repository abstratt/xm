/**
 */
package xmbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbase.ParameteredElement#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbase.XmbasePackage#getParameteredElement()
 * @model
 * @generated
 */
public interface ParameteredElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link xmbase.Parameter}.
	 * It is bidirectional and its opposite is '{@link xmbase.Parameter#getParametered <em>Parametered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see xmbase.XmbasePackage#getParameteredElement_Parameters()
	 * @see xmbase.Parameter#getParametered
	 * @model opposite="parametered" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Behavior parameteredBehavior();

} // ParameteredElement
