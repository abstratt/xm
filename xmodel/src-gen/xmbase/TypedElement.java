/**
 */
package xmbase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbase.TypedElement#getElementType <em>Element Type</em>}</li>
 *   <li>{@link xmbase.TypedElement#isRequired <em>Required</em>}</li>
 *   <li>{@link xmbase.TypedElement#isMultivalued <em>Multivalued</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbase.XmbasePackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Type)
	 * @see xmbase.XmbasePackage#getTypedElement_ElementType()
	 * @model
	 * @generated
	 */
	Type getElementType();

	/**
	 * Sets the value of the '{@link xmbase.TypedElement#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Type value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see xmbase.XmbasePackage#getTypedElement_Required()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link xmbase.TypedElement#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multivalued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multivalued</em>' attribute.
	 * @see #setMultivalued(boolean)
	 * @see xmbase.XmbasePackage#getTypedElement_Multivalued()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMultivalued();

	/**
	 * Sets the value of the '{@link xmbase.TypedElement#isMultivalued <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multivalued</em>' attribute.
	 * @see #isMultivalued()
	 * @generated
	 */
	void setMultivalued(boolean value);

} // TypedElement
