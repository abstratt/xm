/**
 */
package xmprimitives;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import xmbase.XmbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xmprimitives.XmprimitivesFactory
 * @model kind="package"
 * @generated
 */
public interface XmprimitivesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmprimitives";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "xmprimitives";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xmprimitives";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmprimitivesPackage eINSTANCE = xmprimitives.impl.XmprimitivesPackageImpl.init();

	/**
	 * The meta object id for the '{@link xmprimitives.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmprimitives.impl.StringTypeImpl
	 * @see xmprimitives.impl.XmprimitivesPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__PARENT = XmbasePackage.PRIMITIVE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = XmbasePackage.PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CHILDREN = XmbasePackage.PRIMITIVE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__VALUE = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = XmbasePackage.PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmprimitives.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmprimitives.impl.BooleanTypeImpl
	 * @see xmprimitives.impl.XmprimitivesPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__PARENT = XmbasePackage.PRIMITIVE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = XmbasePackage.PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__CHILDREN = XmbasePackage.PRIMITIVE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__VALUE = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = XmbasePackage.PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmprimitives.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmprimitives.impl.IntegerTypeImpl
	 * @see xmprimitives.impl.XmprimitivesPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__PARENT = XmbasePackage.PRIMITIVE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__NAME = XmbasePackage.PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__CHILDREN = XmbasePackage.PRIMITIVE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__VALUE = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = XmbasePackage.PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmprimitives.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmprimitives.impl.FloatTypeImpl
	 * @see xmprimitives.impl.XmprimitivesPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__PARENT = XmbasePackage.PRIMITIVE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__NAME = XmbasePackage.PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__CHILDREN = XmbasePackage.PRIMITIVE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__VALUE = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_OPERATION_COUNT = XmbasePackage.PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmprimitives.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmprimitives.impl.DateTypeImpl
	 * @see xmprimitives.impl.XmprimitivesPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__PARENT = XmbasePackage.PRIMITIVE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__NAME = XmbasePackage.PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__CHILDREN = XmbasePackage.PRIMITIVE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__VALUE = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_OPERATION_COUNT = XmbasePackage.PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmprimitives.impl.DecimalTypeImpl <em>Decimal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmprimitives.impl.DecimalTypeImpl
	 * @see xmprimitives.impl.XmprimitivesPackageImpl#getDecimalType()
	 * @generated
	 */
	int DECIMAL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__PARENT = XmbasePackage.PRIMITIVE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__NAME = XmbasePackage.PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__CHILDREN = XmbasePackage.PRIMITIVE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE__VALUE = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE_FEATURE_COUNT = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_TYPE_OPERATION_COUNT = XmbasePackage.PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmprimitives.impl.MemoTypeImpl <em>Memo Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmprimitives.impl.MemoTypeImpl
	 * @see xmprimitives.impl.XmprimitivesPackageImpl#getMemoType()
	 * @generated
	 */
	int MEMO_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_TYPE__PARENT = XmbasePackage.PRIMITIVE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_TYPE__NAME = XmbasePackage.PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_TYPE__CHILDREN = XmbasePackage.PRIMITIVE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_TYPE__VALUE = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_TYPE_FEATURE_COUNT = XmbasePackage.PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Memo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_TYPE_OPERATION_COUNT = XmbasePackage.PRIMITIVE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xmprimitives.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see xmprimitives.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link xmprimitives.StringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmprimitives.StringType#getValue()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Value();

	/**
	 * Returns the meta object for class '{@link xmprimitives.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see xmprimitives.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link xmprimitives.BooleanType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmprimitives.BooleanType#isValue()
	 * @see #getBooleanType()
	 * @generated
	 */
	EAttribute getBooleanType_Value();

	/**
	 * Returns the meta object for class '{@link xmprimitives.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see xmprimitives.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link xmprimitives.IntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmprimitives.IntegerType#getValue()
	 * @see #getIntegerType()
	 * @generated
	 */
	EAttribute getIntegerType_Value();

	/**
	 * Returns the meta object for class '{@link xmprimitives.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see xmprimitives.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for the attribute '{@link xmprimitives.FloatType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmprimitives.FloatType#getValue()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Value();

	/**
	 * Returns the meta object for class '{@link xmprimitives.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see xmprimitives.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for the attribute '{@link xmprimitives.DateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmprimitives.DateType#getValue()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Value();

	/**
	 * Returns the meta object for class '{@link xmprimitives.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Type</em>'.
	 * @see xmprimitives.DecimalType
	 * @generated
	 */
	EClass getDecimalType();

	/**
	 * Returns the meta object for the attribute '{@link xmprimitives.DecimalType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmprimitives.DecimalType#getValue()
	 * @see #getDecimalType()
	 * @generated
	 */
	EAttribute getDecimalType_Value();

	/**
	 * Returns the meta object for class '{@link xmprimitives.MemoType <em>Memo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memo Type</em>'.
	 * @see xmprimitives.MemoType
	 * @generated
	 */
	EClass getMemoType();

	/**
	 * Returns the meta object for the attribute '{@link xmprimitives.MemoType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmprimitives.MemoType#getValue()
	 * @see #getMemoType()
	 * @generated
	 */
	EAttribute getMemoType_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmprimitivesFactory getXmprimitivesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xmprimitives.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmprimitives.impl.StringTypeImpl
		 * @see xmprimitives.impl.XmprimitivesPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__VALUE = eINSTANCE.getStringType_Value();

		/**
		 * The meta object literal for the '{@link xmprimitives.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmprimitives.impl.BooleanTypeImpl
		 * @see xmprimitives.impl.XmprimitivesPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_TYPE__VALUE = eINSTANCE.getBooleanType_Value();

		/**
		 * The meta object literal for the '{@link xmprimitives.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmprimitives.impl.IntegerTypeImpl
		 * @see xmprimitives.impl.XmprimitivesPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE__VALUE = eINSTANCE.getIntegerType_Value();

		/**
		 * The meta object literal for the '{@link xmprimitives.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmprimitives.impl.FloatTypeImpl
		 * @see xmprimitives.impl.XmprimitivesPackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__VALUE = eINSTANCE.getFloatType_Value();

		/**
		 * The meta object literal for the '{@link xmprimitives.impl.DateTypeImpl <em>Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmprimitives.impl.DateTypeImpl
		 * @see xmprimitives.impl.XmprimitivesPackageImpl#getDateType()
		 * @generated
		 */
		EClass DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TYPE__VALUE = eINSTANCE.getDateType_Value();

		/**
		 * The meta object literal for the '{@link xmprimitives.impl.DecimalTypeImpl <em>Decimal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmprimitives.impl.DecimalTypeImpl
		 * @see xmprimitives.impl.XmprimitivesPackageImpl#getDecimalType()
		 * @generated
		 */
		EClass DECIMAL_TYPE = eINSTANCE.getDecimalType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_TYPE__VALUE = eINSTANCE.getDecimalType_Value();

		/**
		 * The meta object literal for the '{@link xmprimitives.impl.MemoTypeImpl <em>Memo Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmprimitives.impl.MemoTypeImpl
		 * @see xmprimitives.impl.XmprimitivesPackageImpl#getMemoType()
		 * @generated
		 */
		EClass MEMO_TYPE = eINSTANCE.getMemoType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMO_TYPE__VALUE = eINSTANCE.getMemoType_Value();

	}

} //XmprimitivesPackage
