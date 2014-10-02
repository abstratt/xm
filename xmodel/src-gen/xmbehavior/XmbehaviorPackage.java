/**
 */
package xmbehavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see xmbehavior.XmbehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface XmbehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmbehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "xmbehavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xmbehavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmbehaviorPackage eINSTANCE = xmbehavior.impl.XmbehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ActivityImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VARIABLES = XmbasePackage.BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BLOCK = XmbasePackage.BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = XmbasePackage.BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = XmbasePackage.BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARENT = XmbasePackage.NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = XmbasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = XmbasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = XmbasePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.StatementActionImpl <em>Statement Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.StatementActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getStatementAction()
	 * @generated
	 */
	int STATEMENT_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ACTION__PARENT = ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Statement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.BlockImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PARENT = STATEMENT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = STATEMENT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ACTIONS = STATEMENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = STATEMENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralClosureImpl <em>Literal Closure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralClosureImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralClosure()
	 * @generated
	 */
	int LITERAL_CLOSURE = 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLOSURE__VARIABLES = ACTIVITY__VARIABLES;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLOSURE__BLOCK = ACTIVITY__BLOCK;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLOSURE__PARAMETERS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLOSURE__PARENT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLOSURE__NAME = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Literal Closure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLOSURE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Parametered Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLOSURE___PARAMETERED_BEHAVIOR = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Closure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLOSURE_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ClosureParameterImpl <em>Closure Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ClosureParameterImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getClosureParameter()
	 * @generated
	 */
	int CLOSURE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER__PARENT = XmbasePackage.PARAMETER__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER__NAME = XmbasePackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER__ELEMENT_TYPE = XmbasePackage.PARAMETER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER__REQUIRED = XmbasePackage.PARAMETER__REQUIRED;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER__MULTIVALUED = XmbasePackage.PARAMETER__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER__DIRECTION = XmbasePackage.PARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Parametered</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER__PARAMETERED = XmbasePackage.PARAMETER__PARAMETERED;

	/**
	 * The number of structural features of the '<em>Closure Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER_FEATURE_COUNT = XmbasePackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER___CONTEXT = XmbasePackage.PARAMETER___CONTEXT;

	/**
	 * The number of operations of the '<em>Closure Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_PARAMETER_OPERATION_COUNT = XmbasePackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ValueActionImpl <em>Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ValueActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getValueAction()
	 * @generated
	 */
	int VALUE_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTION__PARENT = ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ExpressionActionImpl <em>Expression Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ExpressionActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getExpressionAction()
	 * @generated
	 */
	int EXPRESSION_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION__PARENT = VALUE_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION__NAME = VALUE_ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Expression Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION_FEATURE_COUNT = VALUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACTION_OPERATION_COUNT = VALUE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.SimpleValueActionImpl <em>Simple Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.SimpleValueActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getSimpleValueAction()
	 * @generated
	 */
	int SIMPLE_VALUE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_ACTION__PARENT = VALUE_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_ACTION__NAME = VALUE_ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Simple Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_ACTION_FEATURE_COUNT = VALUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_ACTION_OPERATION_COUNT = VALUE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ObjectStatementActionImpl <em>Object Statement Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ObjectStatementActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getObjectStatementAction()
	 * @generated
	 */
	int OBJECT_STATEMENT_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_STATEMENT_ACTION__PARENT = STATEMENT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_STATEMENT_ACTION__NAME = STATEMENT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_STATEMENT_ACTION__TARGET = STATEMENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Statement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_STATEMENT_ACTION_FEATURE_COUNT = STATEMENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Statement Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_STATEMENT_ACTION_OPERATION_COUNT = STATEMENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralActionImpl <em>Literal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralAction()
	 * @generated
	 */
	int LITERAL_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ACTION__PARENT = SIMPLE_VALUE_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ACTION__NAME = SIMPLE_VALUE_ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Literal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ACTION_FEATURE_COUNT = SIMPLE_VALUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ACTION_OPERATION_COUNT = SIMPLE_VALUE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralDoubleActionImpl <em>Literal Double Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralDoubleActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralDoubleAction()
	 * @generated
	 */
	int LITERAL_DOUBLE_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE_ACTION__PARENT = LITERAL_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE_ACTION__NAME = LITERAL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE_ACTION__VALUE = LITERAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Double Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE_ACTION_FEATURE_COUNT = LITERAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Double Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DOUBLE_ACTION_OPERATION_COUNT = LITERAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralIntActionImpl <em>Literal Int Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralIntActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralIntAction()
	 * @generated
	 */
	int LITERAL_INT_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INT_ACTION__PARENT = LITERAL_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INT_ACTION__NAME = LITERAL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INT_ACTION__VALUE = LITERAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Int Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INT_ACTION_FEATURE_COUNT = LITERAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Int Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INT_ACTION_OPERATION_COUNT = LITERAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralStringActionImpl <em>Literal String Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralStringActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralStringAction()
	 * @generated
	 */
	int LITERAL_STRING_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_ACTION__PARENT = LITERAL_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_ACTION__NAME = LITERAL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_ACTION__VALUE = LITERAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_ACTION_FEATURE_COUNT = LITERAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal String Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_ACTION_OPERATION_COUNT = LITERAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralMapActionImpl <em>Literal Map Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralMapActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralMapAction()
	 * @generated
	 */
	int LITERAL_MAP_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ACTION__PARENT = LITERAL_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ACTION__NAME = LITERAL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ACTION__ENTRIES = LITERAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Map Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ACTION_FEATURE_COUNT = LITERAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Map Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ACTION_OPERATION_COUNT = LITERAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralCollectionActionImpl <em>Literal Collection Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralCollectionActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralCollectionAction()
	 * @generated
	 */
	int LITERAL_COLLECTION_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COLLECTION_ACTION__PARENT = LITERAL_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COLLECTION_ACTION__NAME = LITERAL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COLLECTION_ACTION__VALUES = LITERAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Collection Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COLLECTION_ACTION_FEATURE_COUNT = LITERAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Collection Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_COLLECTION_ACTION_OPERATION_COUNT = LITERAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralMapEntryImpl <em>Literal Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralMapEntryImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralMapEntry()
	 * @generated
	 */
	int LITERAL_MAP_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Literal Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Literal Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LiteralBooleanActionImpl <em>Literal Boolean Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LiteralBooleanActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralBooleanAction()
	 * @generated
	 */
	int LITERAL_BOOLEAN_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_ACTION__PARENT = LITERAL_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_ACTION__NAME = LITERAL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_ACTION__VALUE = LITERAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_ACTION_FEATURE_COUNT = LITERAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Boolean Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_ACTION_OPERATION_COUNT = LITERAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ReadSelfActionImpl <em>Read Self Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ReadSelfActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getReadSelfAction()
	 * @generated
	 */
	int READ_SELF_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__PARENT = SIMPLE_VALUE_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__NAME = SIMPLE_VALUE_ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Read Self Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION_FEATURE_COUNT = SIMPLE_VALUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Self Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION_OPERATION_COUNT = SIMPLE_VALUE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ObjectActionImpl <em>Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ObjectActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getObjectAction()
	 * @generated
	 */
	int OBJECT_ACTION = 19;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__PARENT = ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__TARGET = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.NonObjectActionImpl <em>Non Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.NonObjectActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getNonObjectAction()
	 * @generated
	 */
	int NON_OBJECT_ACTION = 20;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OBJECT_ACTION__PARENT = ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OBJECT_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Non Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OBJECT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OBJECT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.AttributeActionImpl <em>Attribute Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.AttributeActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getAttributeAction()
	 * @generated
	 */
	int ATTRIBUTE_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ACTION__PARENT = OBJECT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ACTION__NAME = OBJECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ACTION__TARGET = OBJECT_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ACTION__ATTRIBUTE = OBJECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ACTION_FEATURE_COUNT = OBJECT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ACTION_OPERATION_COUNT = OBJECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ReadAttributeActionImpl <em>Read Attribute Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ReadAttributeActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getReadAttributeAction()
	 * @generated
	 */
	int READ_ATTRIBUTE_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ATTRIBUTE_ACTION__PARENT = ATTRIBUTE_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ATTRIBUTE_ACTION__NAME = ATTRIBUTE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ATTRIBUTE_ACTION__TARGET = ATTRIBUTE_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ATTRIBUTE_ACTION__ATTRIBUTE = ATTRIBUTE_ACTION__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Read Attribute Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ATTRIBUTE_ACTION_FEATURE_COUNT = ATTRIBUTE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Attribute Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ATTRIBUTE_ACTION_OPERATION_COUNT = ATTRIBUTE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.WriteAttributeActionImpl <em>Write Attribute Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.WriteAttributeActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getWriteAttributeAction()
	 * @generated
	 */
	int WRITE_ATTRIBUTE_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ATTRIBUTE_ACTION__PARENT = ATTRIBUTE_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ATTRIBUTE_ACTION__NAME = ATTRIBUTE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ATTRIBUTE_ACTION__TARGET = ATTRIBUTE_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ATTRIBUTE_ACTION__ATTRIBUTE = ATTRIBUTE_ACTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ATTRIBUTE_ACTION__VALUE = ATTRIBUTE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Write Attribute Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ATTRIBUTE_ACTION_FEATURE_COUNT = ATTRIBUTE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Write Attribute Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ATTRIBUTE_ACTION_OPERATION_COUNT = ATTRIBUTE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.VariableImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PARENT = XmbasePackage.LOCAL_DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = XmbasePackage.LOCAL_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ELEMENT_TYPE = XmbasePackage.LOCAL_DATA__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__REQUIRED = XmbasePackage.LOCAL_DATA__REQUIRED;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MULTIVALUED = XmbasePackage.LOCAL_DATA__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ACTIVITY = XmbasePackage.LOCAL_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = XmbasePackage.LOCAL_DATA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___CONTEXT = XmbasePackage.LOCAL_DATA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = XmbasePackage.LOCAL_DATA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.LocalDataActionImpl <em>Local Data Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.LocalDataActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLocalDataAction()
	 * @generated
	 */
	int LOCAL_DATA_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_ACTION__PARENT = OBJECT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_ACTION__NAME = OBJECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_ACTION__TARGET = OBJECT_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Local Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_ACTION__LOCAL_DATA = OBJECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_ACTION_FEATURE_COUNT = OBJECT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_ACTION_OPERATION_COUNT = OBJECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ReadLocalDataActionImpl <em>Read Local Data Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ReadLocalDataActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getReadLocalDataAction()
	 * @generated
	 */
	int READ_LOCAL_DATA_ACTION = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LOCAL_DATA_ACTION__PARENT = LOCAL_DATA_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LOCAL_DATA_ACTION__NAME = LOCAL_DATA_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LOCAL_DATA_ACTION__TARGET = LOCAL_DATA_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Local Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LOCAL_DATA_ACTION__LOCAL_DATA = LOCAL_DATA_ACTION__LOCAL_DATA;

	/**
	 * The number of structural features of the '<em>Read Local Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LOCAL_DATA_ACTION_FEATURE_COUNT = LOCAL_DATA_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Local Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LOCAL_DATA_ACTION_OPERATION_COUNT = LOCAL_DATA_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.WriteLocalDataActionImpl <em>Write Local Data Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.WriteLocalDataActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getWriteLocalDataAction()
	 * @generated
	 */
	int WRITE_LOCAL_DATA_ACTION = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LOCAL_DATA_ACTION__PARENT = LOCAL_DATA_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LOCAL_DATA_ACTION__NAME = LOCAL_DATA_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LOCAL_DATA_ACTION__TARGET = LOCAL_DATA_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Local Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LOCAL_DATA_ACTION__LOCAL_DATA = LOCAL_DATA_ACTION__LOCAL_DATA;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LOCAL_DATA_ACTION__VALUE = LOCAL_DATA_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Write Local Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LOCAL_DATA_ACTION_FEATURE_COUNT = LOCAL_DATA_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Write Local Data Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LOCAL_DATA_ACTION_OPERATION_COUNT = LOCAL_DATA_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.CreateObjectActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCreateObjectAction()
	 * @generated
	 */
	int CREATE_OBJECT_ACTION = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__PARENT = SIMPLE_VALUE_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__NAME = SIMPLE_VALUE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__CLASS = SIMPLE_VALUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__ARGUMENTS = SIMPLE_VALUE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_FEATURE_COUNT = SIMPLE_VALUE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_OPERATION_COUNT = SIMPLE_VALUE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.OperationActionImpl <em>Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.OperationActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getOperationAction()
	 * @generated
	 */
	int OPERATION_ACTION = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__PARENT = OBJECT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__NAME = OBJECT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__TARGET = OBJECT_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__OPERATION = OBJECT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__ARGUMENTS = OBJECT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION_FEATURE_COUNT = OBJECT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION_OPERATION_COUNT = OBJECT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.CallActionActionImpl <em>Call Action Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.CallActionActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCallActionAction()
	 * @generated
	 */
	int CALL_ACTION_ACTION = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTION__PARENT = OPERATION_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTION__NAME = OPERATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTION__TARGET = OPERATION_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTION__OPERATION = OPERATION_ACTION__OPERATION;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTION__ARGUMENTS = OPERATION_ACTION__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Call Action Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTION_FEATURE_COUNT = OPERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Call Action Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_ACTION_OPERATION_COUNT = OPERATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.CallQueryActionImpl <em>Call Query Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.CallQueryActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCallQueryAction()
	 * @generated
	 */
	int CALL_QUERY_ACTION = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_ACTION__PARENT = OPERATION_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_ACTION__NAME = OPERATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_ACTION__TARGET = OPERATION_ACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_ACTION__OPERATION = OPERATION_ACTION__OPERATION;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_ACTION__ARGUMENTS = OPERATION_ACTION__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Call Query Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_ACTION_FEATURE_COUNT = OPERATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Call Query Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_QUERY_ACTION_OPERATION_COUNT = OPERATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.FinalActionImpl <em>Final Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.FinalActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getFinalAction()
	 * @generated
	 */
	int FINAL_ACTION = 32;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTION__PARENT = STATEMENT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTION__NAME = STATEMENT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTION__RESULT_VALUE = STATEMENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTION_FEATURE_COUNT = STATEMENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Final Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_ACTION_OPERATION_COUNT = STATEMENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.CollectionProducingActionImpl <em>Collection Producing Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.CollectionProducingActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionProducingAction()
	 * @generated
	 */
	int COLLECTION_PRODUCING_ACTION = 33;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PRODUCING_ACTION__PARENT = ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PRODUCING_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Collection Producing Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PRODUCING_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Producing Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_PRODUCING_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.OriginalCollectionProducingActionImpl <em>Original Collection Producing Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.OriginalCollectionProducingActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getOriginalCollectionProducingAction()
	 * @generated
	 */
	int ORIGINAL_COLLECTION_PRODUCING_ACTION = 34;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_COLLECTION_PRODUCING_ACTION__PARENT = COLLECTION_PRODUCING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_COLLECTION_PRODUCING_ACTION__NAME = COLLECTION_PRODUCING_ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Original Collection Producing Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_COLLECTION_PRODUCING_ACTION_FEATURE_COUNT = COLLECTION_PRODUCING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Original Collection Producing Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_COLLECTION_PRODUCING_ACTION_OPERATION_COUNT = COLLECTION_PRODUCING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.CollectionConsumingActionImpl <em>Collection Consuming Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.CollectionConsumingActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionConsumingAction()
	 * @generated
	 */
	int COLLECTION_CONSUMING_ACTION = 35;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_CONSUMING_ACTION__PARENT = ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_CONSUMING_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Collection Consuming Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_CONSUMING_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Consuming Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_CONSUMING_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.CollectionTransformingActionImpl <em>Collection Transforming Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.CollectionTransformingActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionTransformingAction()
	 * @generated
	 */
	int COLLECTION_TRANSFORMING_ACTION = 36;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TRANSFORMING_ACTION__PARENT = COLLECTION_CONSUMING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TRANSFORMING_ACTION__NAME = COLLECTION_CONSUMING_ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Collection Transforming Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TRANSFORMING_ACTION_FEATURE_COUNT = COLLECTION_CONSUMING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Transforming Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TRANSFORMING_ACTION_OPERATION_COUNT = COLLECTION_CONSUMING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.FinalCollectionConsumingActionImpl <em>Final Collection Consuming Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.FinalCollectionConsumingActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getFinalCollectionConsumingAction()
	 * @generated
	 */
	int FINAL_COLLECTION_CONSUMING_ACTION = 37;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COLLECTION_CONSUMING_ACTION__PARENT = COLLECTION_CONSUMING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COLLECTION_CONSUMING_ACTION__NAME = COLLECTION_CONSUMING_ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Final Collection Consuming Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COLLECTION_CONSUMING_ACTION_FEATURE_COUNT = COLLECTION_CONSUMING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final Collection Consuming Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_COLLECTION_CONSUMING_ACTION_OPERATION_COUNT = COLLECTION_CONSUMING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.TraverseManyActionImpl <em>Traverse Many Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.TraverseManyActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getTraverseManyAction()
	 * @generated
	 */
	int TRAVERSE_MANY_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSE_MANY_ACTION__PARENT = ORIGINAL_COLLECTION_PRODUCING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSE_MANY_ACTION__NAME = ORIGINAL_COLLECTION_PRODUCING_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSE_MANY_ACTION__TARGET = ORIGINAL_COLLECTION_PRODUCING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSE_MANY_ACTION__END = ORIGINAL_COLLECTION_PRODUCING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traverse Many Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSE_MANY_ACTION_FEATURE_COUNT = ORIGINAL_COLLECTION_PRODUCING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traverse Many Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVERSE_MANY_ACTION_OPERATION_COUNT = ORIGINAL_COLLECTION_PRODUCING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ExtentActionImpl <em>Extent Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ExtentActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getExtentAction()
	 * @generated
	 */
	int EXTENT_ACTION = 39;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_ACTION__PARENT = ORIGINAL_COLLECTION_PRODUCING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_ACTION__NAME = ORIGINAL_COLLECTION_PRODUCING_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_ACTION__CLASS = ORIGINAL_COLLECTION_PRODUCING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_ACTION_FEATURE_COUNT = ORIGINAL_COLLECTION_PRODUCING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_ACTION_OPERATION_COUNT = ORIGINAL_COLLECTION_PRODUCING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.FilterActionImpl <em>Filter Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.FilterActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getFilterAction()
	 * @generated
	 */
	int FILTER_ACTION = 40;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ACTION__PARENT = COLLECTION_TRANSFORMING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ACTION__NAME = COLLECTION_TRANSFORMING_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ACTION__FILTER = COLLECTION_TRANSFORMING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ACTION_FEATURE_COUNT = COLLECTION_TRANSFORMING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_ACTION_OPERATION_COUNT = COLLECTION_TRANSFORMING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.MapActionImpl <em>Map Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.MapActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getMapAction()
	 * @generated
	 */
	int MAP_ACTION = 41;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACTION__PARENT = COLLECTION_TRANSFORMING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACTION__NAME = COLLECTION_TRANSFORMING_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACTION__MAPPER = COLLECTION_TRANSFORMING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACTION_FEATURE_COUNT = COLLECTION_TRANSFORMING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Map Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACTION_OPERATION_COUNT = COLLECTION_TRANSFORMING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ReduceActionImpl <em>Reduce Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ReduceActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getReduceAction()
	 * @generated
	 */
	int REDUCE_ACTION = 42;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__PARENT = FINAL_COLLECTION_CONSUMING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__NAME = FINAL_COLLECTION_CONSUMING_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Reducer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDUCER = FINAL_COLLECTION_CONSUMING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__INITIAL = FINAL_COLLECTION_CONSUMING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reduce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION_FEATURE_COUNT = FINAL_COLLECTION_CONSUMING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reduce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION_OPERATION_COUNT = FINAL_COLLECTION_CONSUMING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.ApplyActionImpl <em>Apply Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.ApplyActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getApplyAction()
	 * @generated
	 */
	int APPLY_ACTION = 43;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_ACTION__PARENT = FINAL_COLLECTION_CONSUMING_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_ACTION__NAME = FINAL_COLLECTION_CONSUMING_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Applier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_ACTION__APPLIER = FINAL_COLLECTION_CONSUMING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apply Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_ACTION_FEATURE_COUNT = FINAL_COLLECTION_CONSUMING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Apply Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_ACTION_OPERATION_COUNT = FINAL_COLLECTION_CONSUMING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.CollectionExpressionActionImpl <em>Collection Expression Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.CollectionExpressionActionImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionExpressionAction()
	 * @generated
	 */
	int COLLECTION_EXPRESSION_ACTION = 44;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_ACTION__PARENT = VALUE_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_ACTION__NAME = VALUE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_ACTION__SOURCE = VALUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_ACTION__TRANSFORMERS = VALUE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_ACTION__DESTINATION = VALUE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collection Expression Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_ACTION_FEATURE_COUNT = VALUE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Collection Expression Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_ACTION_OPERATION_COUNT = VALUE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xmbehavior.impl.CollectionStatementImpl <em>Collection Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xmbehavior.impl.CollectionStatementImpl
	 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionStatement()
	 * @generated
	 */
	int COLLECTION_STATEMENT = 45;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_STATEMENT__PARENT = STATEMENT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_STATEMENT__NAME = STATEMENT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_STATEMENT__SOURCE = STATEMENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_STATEMENT__TRANSFORMERS = STATEMENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_STATEMENT__DESTINATION = STATEMENT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collection Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_STATEMENT_FEATURE_COUNT = STATEMENT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Collection Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_STATEMENT_OPERATION_COUNT = STATEMENT_ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xmbehavior.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see xmbehavior.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link xmbehavior.Activity#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see xmbehavior.Activity#getVariables()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.Activity#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see xmbehavior.Activity#getBlock()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Block();

	/**
	 * Returns the meta object for class '{@link xmbehavior.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see xmbehavior.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see xmbehavior.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link xmbehavior.Block#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see xmbehavior.Block#getActions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Actions();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralClosure <em>Literal Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Closure</em>'.
	 * @see xmbehavior.LiteralClosure
	 * @generated
	 */
	EClass getLiteralClosure();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ClosureParameter <em>Closure Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closure Parameter</em>'.
	 * @see xmbehavior.ClosureParameter
	 * @generated
	 */
	EClass getClosureParameter();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ValueAction <em>Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Action</em>'.
	 * @see xmbehavior.ValueAction
	 * @generated
	 */
	EClass getValueAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ExpressionAction <em>Expression Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Action</em>'.
	 * @see xmbehavior.ExpressionAction
	 * @generated
	 */
	EClass getExpressionAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.SimpleValueAction <em>Simple Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value Action</em>'.
	 * @see xmbehavior.SimpleValueAction
	 * @generated
	 */
	EClass getSimpleValueAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.StatementAction <em>Statement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Action</em>'.
	 * @see xmbehavior.StatementAction
	 * @generated
	 */
	EClass getStatementAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ObjectStatementAction <em>Object Statement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Statement Action</em>'.
	 * @see xmbehavior.ObjectStatementAction
	 * @generated
	 */
	EClass getObjectStatementAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralAction <em>Literal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Action</em>'.
	 * @see xmbehavior.LiteralAction
	 * @generated
	 */
	EClass getLiteralAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralDoubleAction <em>Literal Double Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Double Action</em>'.
	 * @see xmbehavior.LiteralDoubleAction
	 * @generated
	 */
	EClass getLiteralDoubleAction();

	/**
	 * Returns the meta object for the attribute '{@link xmbehavior.LiteralDoubleAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmbehavior.LiteralDoubleAction#getValue()
	 * @see #getLiteralDoubleAction()
	 * @generated
	 */
	EAttribute getLiteralDoubleAction_Value();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralIntAction <em>Literal Int Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Int Action</em>'.
	 * @see xmbehavior.LiteralIntAction
	 * @generated
	 */
	EClass getLiteralIntAction();

	/**
	 * Returns the meta object for the attribute '{@link xmbehavior.LiteralIntAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmbehavior.LiteralIntAction#getValue()
	 * @see #getLiteralIntAction()
	 * @generated
	 */
	EAttribute getLiteralIntAction_Value();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralStringAction <em>Literal String Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String Action</em>'.
	 * @see xmbehavior.LiteralStringAction
	 * @generated
	 */
	EClass getLiteralStringAction();

	/**
	 * Returns the meta object for the attribute '{@link xmbehavior.LiteralStringAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmbehavior.LiteralStringAction#getValue()
	 * @see #getLiteralStringAction()
	 * @generated
	 */
	EAttribute getLiteralStringAction_Value();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralMapAction <em>Literal Map Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Map Action</em>'.
	 * @see xmbehavior.LiteralMapAction
	 * @generated
	 */
	EClass getLiteralMapAction();

	/**
	 * Returns the meta object for the containment reference list '{@link xmbehavior.LiteralMapAction#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see xmbehavior.LiteralMapAction#getEntries()
	 * @see #getLiteralMapAction()
	 * @generated
	 */
	EReference getLiteralMapAction_Entries();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralCollectionAction <em>Literal Collection Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Collection Action</em>'.
	 * @see xmbehavior.LiteralCollectionAction
	 * @generated
	 */
	EClass getLiteralCollectionAction();

	/**
	 * Returns the meta object for the containment reference list '{@link xmbehavior.LiteralCollectionAction#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see xmbehavior.LiteralCollectionAction#getValues()
	 * @see #getLiteralCollectionAction()
	 * @generated
	 */
	EReference getLiteralCollectionAction_Values();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralMapEntry <em>Literal Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Map Entry</em>'.
	 * @see xmbehavior.LiteralMapEntry
	 * @generated
	 */
	EClass getLiteralMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link xmbehavior.LiteralMapEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xmbehavior.LiteralMapEntry#getName()
	 * @see #getLiteralMapEntry()
	 * @generated
	 */
	EAttribute getLiteralMapEntry_Name();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.LiteralMapEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see xmbehavior.LiteralMapEntry#getValue()
	 * @see #getLiteralMapEntry()
	 * @generated
	 */
	EReference getLiteralMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LiteralBooleanAction <em>Literal Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean Action</em>'.
	 * @see xmbehavior.LiteralBooleanAction
	 * @generated
	 */
	EClass getLiteralBooleanAction();

	/**
	 * Returns the meta object for the attribute '{@link xmbehavior.LiteralBooleanAction#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xmbehavior.LiteralBooleanAction#isValue()
	 * @see #getLiteralBooleanAction()
	 * @generated
	 */
	EAttribute getLiteralBooleanAction_Value();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Self Action</em>'.
	 * @see xmbehavior.ReadSelfAction
	 * @generated
	 */
	EClass getReadSelfAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ObjectAction <em>Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Action</em>'.
	 * @see xmbehavior.ObjectAction
	 * @generated
	 */
	EClass getObjectAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.ObjectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see xmbehavior.ObjectAction#getTarget()
	 * @see #getObjectAction()
	 * @generated
	 */
	EReference getObjectAction_Target();

	/**
	 * Returns the meta object for class '{@link xmbehavior.NonObjectAction <em>Non Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Object Action</em>'.
	 * @see xmbehavior.NonObjectAction
	 * @generated
	 */
	EClass getNonObjectAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.AttributeAction <em>Attribute Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Action</em>'.
	 * @see xmbehavior.AttributeAction
	 * @generated
	 */
	EClass getAttributeAction();

	/**
	 * Returns the meta object for the reference '{@link xmbehavior.AttributeAction#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see xmbehavior.AttributeAction#getAttribute()
	 * @see #getAttributeAction()
	 * @generated
	 */
	EReference getAttributeAction_Attribute();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ReadAttributeAction <em>Read Attribute Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Attribute Action</em>'.
	 * @see xmbehavior.ReadAttributeAction
	 * @generated
	 */
	EClass getReadAttributeAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.WriteAttributeAction <em>Write Attribute Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Attribute Action</em>'.
	 * @see xmbehavior.WriteAttributeAction
	 * @generated
	 */
	EClass getWriteAttributeAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.WriteAttributeAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see xmbehavior.WriteAttributeAction#getValue()
	 * @see #getWriteAttributeAction()
	 * @generated
	 */
	EReference getWriteAttributeAction_Value();

	/**
	 * Returns the meta object for class '{@link xmbehavior.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see xmbehavior.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the container reference '{@link xmbehavior.Variable#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see xmbehavior.Variable#getActivity()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Activity();

	/**
	 * Returns the meta object for the '{@link xmbehavior.Variable#context() <em>Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context</em>' operation.
	 * @see xmbehavior.Variable#context()
	 * @generated
	 */
	EOperation getVariable__Context();

	/**
	 * Returns the meta object for class '{@link xmbehavior.LocalDataAction <em>Local Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Data Action</em>'.
	 * @see xmbehavior.LocalDataAction
	 * @generated
	 */
	EClass getLocalDataAction();

	/**
	 * Returns the meta object for the reference '{@link xmbehavior.LocalDataAction#getLocalData <em>Local Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Data</em>'.
	 * @see xmbehavior.LocalDataAction#getLocalData()
	 * @see #getLocalDataAction()
	 * @generated
	 */
	EReference getLocalDataAction_LocalData();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ReadLocalDataAction <em>Read Local Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Local Data Action</em>'.
	 * @see xmbehavior.ReadLocalDataAction
	 * @generated
	 */
	EClass getReadLocalDataAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.WriteLocalDataAction <em>Write Local Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Local Data Action</em>'.
	 * @see xmbehavior.WriteLocalDataAction
	 * @generated
	 */
	EClass getWriteLocalDataAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.WriteLocalDataAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see xmbehavior.WriteLocalDataAction#getValue()
	 * @see #getWriteLocalDataAction()
	 * @generated
	 */
	EReference getWriteLocalDataAction_Value();

	/**
	 * Returns the meta object for class '{@link xmbehavior.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Object Action</em>'.
	 * @see xmbehavior.CreateObjectAction
	 * @generated
	 */
	EClass getCreateObjectAction();

	/**
	 * Returns the meta object for the reference '{@link xmbehavior.CreateObjectAction#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see xmbehavior.CreateObjectAction#getClass_()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EReference getCreateObjectAction_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link xmbehavior.CreateObjectAction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see xmbehavior.CreateObjectAction#getArguments()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EReference getCreateObjectAction_Arguments();

	/**
	 * Returns the meta object for class '{@link xmbehavior.OperationAction <em>Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Action</em>'.
	 * @see xmbehavior.OperationAction
	 * @generated
	 */
	EClass getOperationAction();

	/**
	 * Returns the meta object for the reference '{@link xmbehavior.OperationAction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see xmbehavior.OperationAction#getOperation()
	 * @see #getOperationAction()
	 * @generated
	 */
	EReference getOperationAction_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link xmbehavior.OperationAction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see xmbehavior.OperationAction#getArguments()
	 * @see #getOperationAction()
	 * @generated
	 */
	EReference getOperationAction_Arguments();

	/**
	 * Returns the meta object for class '{@link xmbehavior.CallActionAction <em>Call Action Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action Action</em>'.
	 * @see xmbehavior.CallActionAction
	 * @generated
	 */
	EClass getCallActionAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.CallQueryAction <em>Call Query Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Query Action</em>'.
	 * @see xmbehavior.CallQueryAction
	 * @generated
	 */
	EClass getCallQueryAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.FinalAction <em>Final Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Action</em>'.
	 * @see xmbehavior.FinalAction
	 * @generated
	 */
	EClass getFinalAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.FinalAction#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Value</em>'.
	 * @see xmbehavior.FinalAction#getResultValue()
	 * @see #getFinalAction()
	 * @generated
	 */
	EReference getFinalAction_ResultValue();

	/**
	 * Returns the meta object for class '{@link xmbehavior.CollectionProducingAction <em>Collection Producing Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Producing Action</em>'.
	 * @see xmbehavior.CollectionProducingAction
	 * @generated
	 */
	EClass getCollectionProducingAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.OriginalCollectionProducingAction <em>Original Collection Producing Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Original Collection Producing Action</em>'.
	 * @see xmbehavior.OriginalCollectionProducingAction
	 * @generated
	 */
	EClass getOriginalCollectionProducingAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.CollectionConsumingAction <em>Collection Consuming Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Consuming Action</em>'.
	 * @see xmbehavior.CollectionConsumingAction
	 * @generated
	 */
	EClass getCollectionConsumingAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.CollectionTransformingAction <em>Collection Transforming Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Transforming Action</em>'.
	 * @see xmbehavior.CollectionTransformingAction
	 * @generated
	 */
	EClass getCollectionTransformingAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.FinalCollectionConsumingAction <em>Final Collection Consuming Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Collection Consuming Action</em>'.
	 * @see xmbehavior.FinalCollectionConsumingAction
	 * @generated
	 */
	EClass getFinalCollectionConsumingAction();

	/**
	 * Returns the meta object for class '{@link xmbehavior.TraverseManyAction <em>Traverse Many Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traverse Many Action</em>'.
	 * @see xmbehavior.TraverseManyAction
	 * @generated
	 */
	EClass getTraverseManyAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.TraverseManyAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see xmbehavior.TraverseManyAction#getTarget()
	 * @see #getTraverseManyAction()
	 * @generated
	 */
	EReference getTraverseManyAction_Target();

	/**
	 * Returns the meta object for the reference '{@link xmbehavior.TraverseManyAction#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see xmbehavior.TraverseManyAction#getEnd()
	 * @see #getTraverseManyAction()
	 * @generated
	 */
	EReference getTraverseManyAction_End();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ExtentAction <em>Extent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent Action</em>'.
	 * @see xmbehavior.ExtentAction
	 * @generated
	 */
	EClass getExtentAction();

	/**
	 * Returns the meta object for the reference '{@link xmbehavior.ExtentAction#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see xmbehavior.ExtentAction#getClass_()
	 * @see #getExtentAction()
	 * @generated
	 */
	EReference getExtentAction_Class();

	/**
	 * Returns the meta object for class '{@link xmbehavior.FilterAction <em>Filter Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Action</em>'.
	 * @see xmbehavior.FilterAction
	 * @generated
	 */
	EClass getFilterAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.FilterAction#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see xmbehavior.FilterAction#getFilter()
	 * @see #getFilterAction()
	 * @generated
	 */
	EReference getFilterAction_Filter();

	/**
	 * Returns the meta object for class '{@link xmbehavior.MapAction <em>Map Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Action</em>'.
	 * @see xmbehavior.MapAction
	 * @generated
	 */
	EClass getMapAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.MapAction#getMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapper</em>'.
	 * @see xmbehavior.MapAction#getMapper()
	 * @see #getMapAction()
	 * @generated
	 */
	EReference getMapAction_Mapper();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ReduceAction <em>Reduce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduce Action</em>'.
	 * @see xmbehavior.ReduceAction
	 * @generated
	 */
	EClass getReduceAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.ReduceAction#getReducer <em>Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reducer</em>'.
	 * @see xmbehavior.ReduceAction#getReducer()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Reducer();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.ReduceAction#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see xmbehavior.ReduceAction#getInitial()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Initial();

	/**
	 * Returns the meta object for class '{@link xmbehavior.ApplyAction <em>Apply Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Action</em>'.
	 * @see xmbehavior.ApplyAction
	 * @generated
	 */
	EClass getApplyAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.ApplyAction#getApplier <em>Applier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applier</em>'.
	 * @see xmbehavior.ApplyAction#getApplier()
	 * @see #getApplyAction()
	 * @generated
	 */
	EReference getApplyAction_Applier();

	/**
	 * Returns the meta object for class '{@link xmbehavior.CollectionExpressionAction <em>Collection Expression Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Expression Action</em>'.
	 * @see xmbehavior.CollectionExpressionAction
	 * @generated
	 */
	EClass getCollectionExpressionAction();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.CollectionExpressionAction#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see xmbehavior.CollectionExpressionAction#getSource()
	 * @see #getCollectionExpressionAction()
	 * @generated
	 */
	EReference getCollectionExpressionAction_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link xmbehavior.CollectionExpressionAction#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see xmbehavior.CollectionExpressionAction#getTransformers()
	 * @see #getCollectionExpressionAction()
	 * @generated
	 */
	EReference getCollectionExpressionAction_Transformers();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.CollectionExpressionAction#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see xmbehavior.CollectionExpressionAction#getDestination()
	 * @see #getCollectionExpressionAction()
	 * @generated
	 */
	EReference getCollectionExpressionAction_Destination();

	/**
	 * Returns the meta object for class '{@link xmbehavior.CollectionStatement <em>Collection Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Statement</em>'.
	 * @see xmbehavior.CollectionStatement
	 * @generated
	 */
	EClass getCollectionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.CollectionStatement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see xmbehavior.CollectionStatement#getSource()
	 * @see #getCollectionStatement()
	 * @generated
	 */
	EReference getCollectionStatement_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link xmbehavior.CollectionStatement#getTransformers <em>Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformers</em>'.
	 * @see xmbehavior.CollectionStatement#getTransformers()
	 * @see #getCollectionStatement()
	 * @generated
	 */
	EReference getCollectionStatement_Transformers();

	/**
	 * Returns the meta object for the containment reference '{@link xmbehavior.CollectionStatement#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see xmbehavior.CollectionStatement#getDestination()
	 * @see #getCollectionStatement()
	 * @generated
	 */
	EReference getCollectionStatement_Destination();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmbehaviorFactory getXmbehaviorFactory();

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
		 * The meta object literal for the '{@link xmbehavior.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ActivityImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__VARIABLES = eINSTANCE.getActivity_Variables();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__BLOCK = eINSTANCE.getActivity_Block();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.BlockImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ACTIONS = eINSTANCE.getBlock_Actions();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralClosureImpl <em>Literal Closure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralClosureImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralClosure()
		 * @generated
		 */
		EClass LITERAL_CLOSURE = eINSTANCE.getLiteralClosure();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ClosureParameterImpl <em>Closure Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ClosureParameterImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getClosureParameter()
		 * @generated
		 */
		EClass CLOSURE_PARAMETER = eINSTANCE.getClosureParameter();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ValueActionImpl <em>Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ValueActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getValueAction()
		 * @generated
		 */
		EClass VALUE_ACTION = eINSTANCE.getValueAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ExpressionActionImpl <em>Expression Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ExpressionActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getExpressionAction()
		 * @generated
		 */
		EClass EXPRESSION_ACTION = eINSTANCE.getExpressionAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.SimpleValueActionImpl <em>Simple Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.SimpleValueActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getSimpleValueAction()
		 * @generated
		 */
		EClass SIMPLE_VALUE_ACTION = eINSTANCE.getSimpleValueAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.StatementActionImpl <em>Statement Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.StatementActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getStatementAction()
		 * @generated
		 */
		EClass STATEMENT_ACTION = eINSTANCE.getStatementAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ObjectStatementActionImpl <em>Object Statement Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ObjectStatementActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getObjectStatementAction()
		 * @generated
		 */
		EClass OBJECT_STATEMENT_ACTION = eINSTANCE.getObjectStatementAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralActionImpl <em>Literal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralAction()
		 * @generated
		 */
		EClass LITERAL_ACTION = eINSTANCE.getLiteralAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralDoubleActionImpl <em>Literal Double Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralDoubleActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralDoubleAction()
		 * @generated
		 */
		EClass LITERAL_DOUBLE_ACTION = eINSTANCE.getLiteralDoubleAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_DOUBLE_ACTION__VALUE = eINSTANCE.getLiteralDoubleAction_Value();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralIntActionImpl <em>Literal Int Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralIntActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralIntAction()
		 * @generated
		 */
		EClass LITERAL_INT_ACTION = eINSTANCE.getLiteralIntAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_INT_ACTION__VALUE = eINSTANCE.getLiteralIntAction_Value();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralStringActionImpl <em>Literal String Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralStringActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralStringAction()
		 * @generated
		 */
		EClass LITERAL_STRING_ACTION = eINSTANCE.getLiteralStringAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_STRING_ACTION__VALUE = eINSTANCE.getLiteralStringAction_Value();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralMapActionImpl <em>Literal Map Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralMapActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralMapAction()
		 * @generated
		 */
		EClass LITERAL_MAP_ACTION = eINSTANCE.getLiteralMapAction();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_MAP_ACTION__ENTRIES = eINSTANCE.getLiteralMapAction_Entries();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralCollectionActionImpl <em>Literal Collection Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralCollectionActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralCollectionAction()
		 * @generated
		 */
		EClass LITERAL_COLLECTION_ACTION = eINSTANCE.getLiteralCollectionAction();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_COLLECTION_ACTION__VALUES = eINSTANCE.getLiteralCollectionAction_Values();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralMapEntryImpl <em>Literal Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralMapEntryImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralMapEntry()
		 * @generated
		 */
		EClass LITERAL_MAP_ENTRY = eINSTANCE.getLiteralMapEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_MAP_ENTRY__NAME = eINSTANCE.getLiteralMapEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_MAP_ENTRY__VALUE = eINSTANCE.getLiteralMapEntry_Value();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LiteralBooleanActionImpl <em>Literal Boolean Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LiteralBooleanActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLiteralBooleanAction()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN_ACTION = eINSTANCE.getLiteralBooleanAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN_ACTION__VALUE = eINSTANCE.getLiteralBooleanAction_Value();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ReadSelfActionImpl <em>Read Self Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ReadSelfActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getReadSelfAction()
		 * @generated
		 */
		EClass READ_SELF_ACTION = eINSTANCE.getReadSelfAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ObjectActionImpl <em>Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ObjectActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getObjectAction()
		 * @generated
		 */
		EClass OBJECT_ACTION = eINSTANCE.getObjectAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ACTION__TARGET = eINSTANCE.getObjectAction_Target();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.NonObjectActionImpl <em>Non Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.NonObjectActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getNonObjectAction()
		 * @generated
		 */
		EClass NON_OBJECT_ACTION = eINSTANCE.getNonObjectAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.AttributeActionImpl <em>Attribute Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.AttributeActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getAttributeAction()
		 * @generated
		 */
		EClass ATTRIBUTE_ACTION = eINSTANCE.getAttributeAction();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ACTION__ATTRIBUTE = eINSTANCE.getAttributeAction_Attribute();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ReadAttributeActionImpl <em>Read Attribute Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ReadAttributeActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getReadAttributeAction()
		 * @generated
		 */
		EClass READ_ATTRIBUTE_ACTION = eINSTANCE.getReadAttributeAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.WriteAttributeActionImpl <em>Write Attribute Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.WriteAttributeActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getWriteAttributeAction()
		 * @generated
		 */
		EClass WRITE_ATTRIBUTE_ACTION = eINSTANCE.getWriteAttributeAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_ATTRIBUTE_ACTION__VALUE = eINSTANCE.getWriteAttributeAction_Value();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.VariableImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ACTIVITY = eINSTANCE.getVariable_Activity();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___CONTEXT = eINSTANCE.getVariable__Context();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.LocalDataActionImpl <em>Local Data Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.LocalDataActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getLocalDataAction()
		 * @generated
		 */
		EClass LOCAL_DATA_ACTION = eINSTANCE.getLocalDataAction();

		/**
		 * The meta object literal for the '<em><b>Local Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_DATA_ACTION__LOCAL_DATA = eINSTANCE.getLocalDataAction_LocalData();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ReadLocalDataActionImpl <em>Read Local Data Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ReadLocalDataActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getReadLocalDataAction()
		 * @generated
		 */
		EClass READ_LOCAL_DATA_ACTION = eINSTANCE.getReadLocalDataAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.WriteLocalDataActionImpl <em>Write Local Data Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.WriteLocalDataActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getWriteLocalDataAction()
		 * @generated
		 */
		EClass WRITE_LOCAL_DATA_ACTION = eINSTANCE.getWriteLocalDataAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_LOCAL_DATA_ACTION__VALUE = eINSTANCE.getWriteLocalDataAction_Value();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.CreateObjectActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCreateObjectAction()
		 * @generated
		 */
		EClass CREATE_OBJECT_ACTION = eINSTANCE.getCreateObjectAction();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT_ACTION__CLASS = eINSTANCE.getCreateObjectAction_Class();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT_ACTION__ARGUMENTS = eINSTANCE.getCreateObjectAction_Arguments();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.OperationActionImpl <em>Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.OperationActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getOperationAction()
		 * @generated
		 */
		EClass OPERATION_ACTION = eINSTANCE.getOperationAction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ACTION__OPERATION = eINSTANCE.getOperationAction_Operation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ACTION__ARGUMENTS = eINSTANCE.getOperationAction_Arguments();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.CallActionActionImpl <em>Call Action Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.CallActionActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCallActionAction()
		 * @generated
		 */
		EClass CALL_ACTION_ACTION = eINSTANCE.getCallActionAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.CallQueryActionImpl <em>Call Query Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.CallQueryActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCallQueryAction()
		 * @generated
		 */
		EClass CALL_QUERY_ACTION = eINSTANCE.getCallQueryAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.FinalActionImpl <em>Final Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.FinalActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getFinalAction()
		 * @generated
		 */
		EClass FINAL_ACTION = eINSTANCE.getFinalAction();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_ACTION__RESULT_VALUE = eINSTANCE.getFinalAction_ResultValue();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.CollectionProducingActionImpl <em>Collection Producing Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.CollectionProducingActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionProducingAction()
		 * @generated
		 */
		EClass COLLECTION_PRODUCING_ACTION = eINSTANCE.getCollectionProducingAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.OriginalCollectionProducingActionImpl <em>Original Collection Producing Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.OriginalCollectionProducingActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getOriginalCollectionProducingAction()
		 * @generated
		 */
		EClass ORIGINAL_COLLECTION_PRODUCING_ACTION = eINSTANCE.getOriginalCollectionProducingAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.CollectionConsumingActionImpl <em>Collection Consuming Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.CollectionConsumingActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionConsumingAction()
		 * @generated
		 */
		EClass COLLECTION_CONSUMING_ACTION = eINSTANCE.getCollectionConsumingAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.CollectionTransformingActionImpl <em>Collection Transforming Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.CollectionTransformingActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionTransformingAction()
		 * @generated
		 */
		EClass COLLECTION_TRANSFORMING_ACTION = eINSTANCE.getCollectionTransformingAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.FinalCollectionConsumingActionImpl <em>Final Collection Consuming Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.FinalCollectionConsumingActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getFinalCollectionConsumingAction()
		 * @generated
		 */
		EClass FINAL_COLLECTION_CONSUMING_ACTION = eINSTANCE.getFinalCollectionConsumingAction();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.TraverseManyActionImpl <em>Traverse Many Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.TraverseManyActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getTraverseManyAction()
		 * @generated
		 */
		EClass TRAVERSE_MANY_ACTION = eINSTANCE.getTraverseManyAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSE_MANY_ACTION__TARGET = eINSTANCE.getTraverseManyAction_Target();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVERSE_MANY_ACTION__END = eINSTANCE.getTraverseManyAction_End();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ExtentActionImpl <em>Extent Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ExtentActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getExtentAction()
		 * @generated
		 */
		EClass EXTENT_ACTION = eINSTANCE.getExtentAction();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT_ACTION__CLASS = eINSTANCE.getExtentAction_Class();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.FilterActionImpl <em>Filter Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.FilterActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getFilterAction()
		 * @generated
		 */
		EClass FILTER_ACTION = eINSTANCE.getFilterAction();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_ACTION__FILTER = eINSTANCE.getFilterAction_Filter();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.MapActionImpl <em>Map Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.MapActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getMapAction()
		 * @generated
		 */
		EClass MAP_ACTION = eINSTANCE.getMapAction();

		/**
		 * The meta object literal for the '<em><b>Mapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ACTION__MAPPER = eINSTANCE.getMapAction_Mapper();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ReduceActionImpl <em>Reduce Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ReduceActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getReduceAction()
		 * @generated
		 */
		EClass REDUCE_ACTION = eINSTANCE.getReduceAction();

		/**
		 * The meta object literal for the '<em><b>Reducer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__REDUCER = eINSTANCE.getReduceAction_Reducer();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__INITIAL = eINSTANCE.getReduceAction_Initial();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.ApplyActionImpl <em>Apply Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.ApplyActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getApplyAction()
		 * @generated
		 */
		EClass APPLY_ACTION = eINSTANCE.getApplyAction();

		/**
		 * The meta object literal for the '<em><b>Applier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY_ACTION__APPLIER = eINSTANCE.getApplyAction_Applier();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.CollectionExpressionActionImpl <em>Collection Expression Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.CollectionExpressionActionImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionExpressionAction()
		 * @generated
		 */
		EClass COLLECTION_EXPRESSION_ACTION = eINSTANCE.getCollectionExpressionAction();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPRESSION_ACTION__SOURCE = eINSTANCE.getCollectionExpressionAction_Source();

		/**
		 * The meta object literal for the '<em><b>Transformers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPRESSION_ACTION__TRANSFORMERS = eINSTANCE.getCollectionExpressionAction_Transformers();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPRESSION_ACTION__DESTINATION = eINSTANCE.getCollectionExpressionAction_Destination();

		/**
		 * The meta object literal for the '{@link xmbehavior.impl.CollectionStatementImpl <em>Collection Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xmbehavior.impl.CollectionStatementImpl
		 * @see xmbehavior.impl.XmbehaviorPackageImpl#getCollectionStatement()
		 * @generated
		 */
		EClass COLLECTION_STATEMENT = eINSTANCE.getCollectionStatement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_STATEMENT__SOURCE = eINSTANCE.getCollectionStatement_Source();

		/**
		 * The meta object literal for the '<em><b>Transformers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_STATEMENT__TRANSFORMERS = eINSTANCE.getCollectionStatement_Transformers();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_STATEMENT__DESTINATION = eINSTANCE.getCollectionStatement_Destination();

	}

} //XmbehaviorPackage
