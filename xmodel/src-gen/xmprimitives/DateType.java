/**
 */
package xmprimitives;

import javax.xml.datatype.XMLGregorianCalendar;

import xmbase.Primitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmprimitives.DateType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmprimitives.XmprimitivesPackage#getDateType()
 * @model
 * @generated
 */
public interface DateType extends Primitive {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(XMLGregorianCalendar)
	 * @see xmprimitives.XmprimitivesPackage#getDateType_Value()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link xmprimitives.DateType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XMLGregorianCalendar value);

} // DateType
