/**
 */
package xmprimitives;

import java.math.BigDecimal;

import xmbase.Primitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmprimitives.DecimalType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmprimitives.XmprimitivesPackage#getDecimalType()
 * @model
 * @generated
 */
public interface DecimalType extends Primitive {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see xmprimitives.XmprimitivesPackage#getDecimalType_Value()
	 * @model unique="false"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link xmprimitives.DecimalType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

} // DecimalType
