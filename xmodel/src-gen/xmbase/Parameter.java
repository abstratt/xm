/**
 */
package xmbase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbase.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link xmbase.Parameter#getParametered <em>Parametered</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbase.XmbasePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends LocalData {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link xmbase.ParameterDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see xmbase.ParameterDirection
	 * @see #setDirection(ParameterDirection)
	 * @see xmbase.XmbasePackage#getParameter_Direction()
	 * @model unique="false"
	 * @generated
	 */
	ParameterDirection getDirection();

	/**
	 * Sets the value of the '{@link xmbase.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see xmbase.ParameterDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirection value);

	/**
	 * Returns the value of the '<em><b>Parametered</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link xmbase.ParameteredElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametered</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametered</em>' container reference.
	 * @see #setParametered(ParameteredElement)
	 * @see xmbase.XmbasePackage#getParameter_Parametered()
	 * @see xmbase.ParameteredElement#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	ParameteredElement getParametered();

	/**
	 * Sets the value of the '{@link xmbase.Parameter#getParametered <em>Parametered</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametered</em>' container reference.
	 * @see #getParametered()
	 * @generated
	 */
	void setParametered(ParameteredElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%xmbase.ParameteredElement%> _parametered = this.getParametered();\nreturn _parametered.parameteredBehavior();'"
	 * @generated
	 */
	Behavior context();

} // Parameter
