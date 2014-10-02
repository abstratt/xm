/**
 */
package xmbehavior.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xmbase.XmbasePackage;

import xmbehavior.Action;
import xmbehavior.Activity;
import xmbehavior.ApplyAction;
import xmbehavior.AttributeAction;
import xmbehavior.Block;
import xmbehavior.CallActionAction;
import xmbehavior.CallQueryAction;
import xmbehavior.ClosureParameter;
import xmbehavior.CollectionConsumingAction;
import xmbehavior.CollectionExpressionAction;
import xmbehavior.CollectionProducingAction;
import xmbehavior.CollectionStatement;
import xmbehavior.CollectionTransformingAction;
import xmbehavior.CreateObjectAction;
import xmbehavior.ExpressionAction;
import xmbehavior.ExtentAction;
import xmbehavior.FilterAction;
import xmbehavior.FinalAction;
import xmbehavior.FinalCollectionConsumingAction;
import xmbehavior.LiteralAction;
import xmbehavior.LiteralBooleanAction;
import xmbehavior.LiteralClosure;
import xmbehavior.LiteralCollectionAction;
import xmbehavior.LiteralDoubleAction;
import xmbehavior.LiteralIntAction;
import xmbehavior.LiteralMapAction;
import xmbehavior.LiteralMapEntry;
import xmbehavior.LiteralStringAction;
import xmbehavior.LocalDataAction;
import xmbehavior.MapAction;
import xmbehavior.NonObjectAction;
import xmbehavior.ObjectAction;
import xmbehavior.ObjectStatementAction;
import xmbehavior.OperationAction;
import xmbehavior.OriginalCollectionProducingAction;
import xmbehavior.ReadAttributeAction;
import xmbehavior.ReadLocalDataAction;
import xmbehavior.ReadSelfAction;
import xmbehavior.ReduceAction;
import xmbehavior.SimpleValueAction;
import xmbehavior.StatementAction;
import xmbehavior.TraverseManyAction;
import xmbehavior.ValueAction;
import xmbehavior.Variable;
import xmbehavior.WriteAttributeAction;
import xmbehavior.WriteLocalDataAction;
import xmbehavior.XmbehaviorFactory;
import xmbehavior.XmbehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmbehaviorPackageImpl extends EPackageImpl implements XmbehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalClosureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closureParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectStatementActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalDoubleActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalMapActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalCollectionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readAttributeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeAttributeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localDataActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLocalDataActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLocalDataActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callQueryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionProducingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originalCollectionProducingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionConsumingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTransformingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalCollectionConsumingActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traverseManyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionExpressionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionStatementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see xmbehavior.XmbehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmbehaviorPackageImpl() {
		super(eNS_URI, XmbehaviorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XmbehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmbehaviorPackage init() {
		if (isInited) return (XmbehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(XmbehaviorPackage.eNS_URI);

		// Obtain or create and register package
		XmbehaviorPackageImpl theXmbehaviorPackage = (XmbehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XmbehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XmbehaviorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XmbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXmbehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theXmbehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmbehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XmbehaviorPackage.eNS_URI, theXmbehaviorPackage);
		return theXmbehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Variables() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Block() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Actions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralClosure() {
		return literalClosureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosureParameter() {
		return closureParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueAction() {
		return valueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionAction() {
		return expressionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleValueAction() {
		return simpleValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementAction() {
		return statementActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectStatementAction() {
		return objectStatementActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralAction() {
		return literalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralDoubleAction() {
		return literalDoubleActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralDoubleAction_Value() {
		return (EAttribute)literalDoubleActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralIntAction() {
		return literalIntActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralIntAction_Value() {
		return (EAttribute)literalIntActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralStringAction() {
		return literalStringActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralStringAction_Value() {
		return (EAttribute)literalStringActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralMapAction() {
		return literalMapActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralMapAction_Entries() {
		return (EReference)literalMapActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralCollectionAction() {
		return literalCollectionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralCollectionAction_Values() {
		return (EReference)literalCollectionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralMapEntry() {
		return literalMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralMapEntry_Name() {
		return (EAttribute)literalMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralMapEntry_Value() {
		return (EReference)literalMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBooleanAction() {
		return literalBooleanActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBooleanAction_Value() {
		return (EAttribute)literalBooleanActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfAction() {
		return readSelfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAction() {
		return objectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAction_Target() {
		return (EReference)objectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonObjectAction() {
		return nonObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAction() {
		return attributeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAction_Attribute() {
		return (EReference)attributeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadAttributeAction() {
		return readAttributeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteAttributeAction() {
		return writeAttributeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteAttributeAction_Value() {
		return (EReference)writeAttributeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Activity() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__Context() {
		return variableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalDataAction() {
		return localDataActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalDataAction_LocalData() {
		return (EReference)localDataActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLocalDataAction() {
		return readLocalDataActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLocalDataAction() {
		return writeLocalDataActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteLocalDataAction_Value() {
		return (EReference)writeLocalDataActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectAction() {
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Class() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Arguments() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationAction() {
		return operationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationAction_Operation() {
		return (EReference)operationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationAction_Arguments() {
		return (EReference)operationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallActionAction() {
		return callActionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallQueryAction() {
		return callQueryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalAction() {
		return finalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalAction_ResultValue() {
		return (EReference)finalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionProducingAction() {
		return collectionProducingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOriginalCollectionProducingAction() {
		return originalCollectionProducingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionConsumingAction() {
		return collectionConsumingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionTransformingAction() {
		return collectionTransformingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalCollectionConsumingAction() {
		return finalCollectionConsumingActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraverseManyAction() {
		return traverseManyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraverseManyAction_Target() {
		return (EReference)traverseManyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraverseManyAction_End() {
		return (EReference)traverseManyActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtentAction() {
		return extentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtentAction_Class() {
		return (EReference)extentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterAction() {
		return filterActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterAction_Filter() {
		return (EReference)filterActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapAction() {
		return mapActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapAction_Mapper() {
		return (EReference)mapActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceAction() {
		return reduceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Reducer() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Initial() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyAction() {
		return applyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyAction_Applier() {
		return (EReference)applyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionExpressionAction() {
		return collectionExpressionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExpressionAction_Source() {
		return (EReference)collectionExpressionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExpressionAction_Transformers() {
		return (EReference)collectionExpressionActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExpressionAction_Destination() {
		return (EReference)collectionExpressionActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionStatement() {
		return collectionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionStatement_Source() {
		return (EReference)collectionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionStatement_Transformers() {
		return (EReference)collectionStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionStatement_Destination() {
		return (EReference)collectionStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmbehaviorFactory getXmbehaviorFactory() {
		return (XmbehaviorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__VARIABLES);
		createEReference(activityEClass, ACTIVITY__BLOCK);

		actionEClass = createEClass(ACTION);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__ACTIONS);

		literalClosureEClass = createEClass(LITERAL_CLOSURE);

		closureParameterEClass = createEClass(CLOSURE_PARAMETER);

		valueActionEClass = createEClass(VALUE_ACTION);

		expressionActionEClass = createEClass(EXPRESSION_ACTION);

		simpleValueActionEClass = createEClass(SIMPLE_VALUE_ACTION);

		statementActionEClass = createEClass(STATEMENT_ACTION);

		objectStatementActionEClass = createEClass(OBJECT_STATEMENT_ACTION);

		literalActionEClass = createEClass(LITERAL_ACTION);

		literalDoubleActionEClass = createEClass(LITERAL_DOUBLE_ACTION);
		createEAttribute(literalDoubleActionEClass, LITERAL_DOUBLE_ACTION__VALUE);

		literalIntActionEClass = createEClass(LITERAL_INT_ACTION);
		createEAttribute(literalIntActionEClass, LITERAL_INT_ACTION__VALUE);

		literalStringActionEClass = createEClass(LITERAL_STRING_ACTION);
		createEAttribute(literalStringActionEClass, LITERAL_STRING_ACTION__VALUE);

		literalMapActionEClass = createEClass(LITERAL_MAP_ACTION);
		createEReference(literalMapActionEClass, LITERAL_MAP_ACTION__ENTRIES);

		literalCollectionActionEClass = createEClass(LITERAL_COLLECTION_ACTION);
		createEReference(literalCollectionActionEClass, LITERAL_COLLECTION_ACTION__VALUES);

		literalMapEntryEClass = createEClass(LITERAL_MAP_ENTRY);
		createEAttribute(literalMapEntryEClass, LITERAL_MAP_ENTRY__NAME);
		createEReference(literalMapEntryEClass, LITERAL_MAP_ENTRY__VALUE);

		literalBooleanActionEClass = createEClass(LITERAL_BOOLEAN_ACTION);
		createEAttribute(literalBooleanActionEClass, LITERAL_BOOLEAN_ACTION__VALUE);

		readSelfActionEClass = createEClass(READ_SELF_ACTION);

		objectActionEClass = createEClass(OBJECT_ACTION);
		createEReference(objectActionEClass, OBJECT_ACTION__TARGET);

		nonObjectActionEClass = createEClass(NON_OBJECT_ACTION);

		attributeActionEClass = createEClass(ATTRIBUTE_ACTION);
		createEReference(attributeActionEClass, ATTRIBUTE_ACTION__ATTRIBUTE);

		readAttributeActionEClass = createEClass(READ_ATTRIBUTE_ACTION);

		writeAttributeActionEClass = createEClass(WRITE_ATTRIBUTE_ACTION);
		createEReference(writeAttributeActionEClass, WRITE_ATTRIBUTE_ACTION__VALUE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__ACTIVITY);
		createEOperation(variableEClass, VARIABLE___CONTEXT);

		localDataActionEClass = createEClass(LOCAL_DATA_ACTION);
		createEReference(localDataActionEClass, LOCAL_DATA_ACTION__LOCAL_DATA);

		readLocalDataActionEClass = createEClass(READ_LOCAL_DATA_ACTION);

		writeLocalDataActionEClass = createEClass(WRITE_LOCAL_DATA_ACTION);
		createEReference(writeLocalDataActionEClass, WRITE_LOCAL_DATA_ACTION__VALUE);

		createObjectActionEClass = createEClass(CREATE_OBJECT_ACTION);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__CLASS);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__ARGUMENTS);

		operationActionEClass = createEClass(OPERATION_ACTION);
		createEReference(operationActionEClass, OPERATION_ACTION__OPERATION);
		createEReference(operationActionEClass, OPERATION_ACTION__ARGUMENTS);

		callActionActionEClass = createEClass(CALL_ACTION_ACTION);

		callQueryActionEClass = createEClass(CALL_QUERY_ACTION);

		finalActionEClass = createEClass(FINAL_ACTION);
		createEReference(finalActionEClass, FINAL_ACTION__RESULT_VALUE);

		collectionProducingActionEClass = createEClass(COLLECTION_PRODUCING_ACTION);

		originalCollectionProducingActionEClass = createEClass(ORIGINAL_COLLECTION_PRODUCING_ACTION);

		collectionConsumingActionEClass = createEClass(COLLECTION_CONSUMING_ACTION);

		collectionTransformingActionEClass = createEClass(COLLECTION_TRANSFORMING_ACTION);

		finalCollectionConsumingActionEClass = createEClass(FINAL_COLLECTION_CONSUMING_ACTION);

		traverseManyActionEClass = createEClass(TRAVERSE_MANY_ACTION);
		createEReference(traverseManyActionEClass, TRAVERSE_MANY_ACTION__TARGET);
		createEReference(traverseManyActionEClass, TRAVERSE_MANY_ACTION__END);

		extentActionEClass = createEClass(EXTENT_ACTION);
		createEReference(extentActionEClass, EXTENT_ACTION__CLASS);

		filterActionEClass = createEClass(FILTER_ACTION);
		createEReference(filterActionEClass, FILTER_ACTION__FILTER);

		mapActionEClass = createEClass(MAP_ACTION);
		createEReference(mapActionEClass, MAP_ACTION__MAPPER);

		reduceActionEClass = createEClass(REDUCE_ACTION);
		createEReference(reduceActionEClass, REDUCE_ACTION__REDUCER);
		createEReference(reduceActionEClass, REDUCE_ACTION__INITIAL);

		applyActionEClass = createEClass(APPLY_ACTION);
		createEReference(applyActionEClass, APPLY_ACTION__APPLIER);

		collectionExpressionActionEClass = createEClass(COLLECTION_EXPRESSION_ACTION);
		createEReference(collectionExpressionActionEClass, COLLECTION_EXPRESSION_ACTION__SOURCE);
		createEReference(collectionExpressionActionEClass, COLLECTION_EXPRESSION_ACTION__TRANSFORMERS);
		createEReference(collectionExpressionActionEClass, COLLECTION_EXPRESSION_ACTION__DESTINATION);

		collectionStatementEClass = createEClass(COLLECTION_STATEMENT);
		createEReference(collectionStatementEClass, COLLECTION_STATEMENT__SOURCE);
		createEReference(collectionStatementEClass, COLLECTION_STATEMENT__TRANSFORMERS);
		createEReference(collectionStatementEClass, COLLECTION_STATEMENT__DESTINATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XmbasePackage theXmbasePackage = (XmbasePackage)EPackage.Registry.INSTANCE.getEPackage(XmbasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(theXmbasePackage.getBehavior());
		actionEClass.getESuperTypes().add(theXmbasePackage.getNamedElement());
		blockEClass.getESuperTypes().add(this.getStatementAction());
		literalClosureEClass.getESuperTypes().add(this.getActivity());
		literalClosureEClass.getESuperTypes().add(theXmbasePackage.getParameteredElement());
		literalClosureEClass.getESuperTypes().add(this.getLiteralAction());
		closureParameterEClass.getESuperTypes().add(theXmbasePackage.getParameter());
		valueActionEClass.getESuperTypes().add(this.getAction());
		expressionActionEClass.getESuperTypes().add(this.getValueAction());
		simpleValueActionEClass.getESuperTypes().add(this.getValueAction());
		statementActionEClass.getESuperTypes().add(this.getAction());
		objectStatementActionEClass.getESuperTypes().add(this.getStatementAction());
		objectStatementActionEClass.getESuperTypes().add(this.getObjectAction());
		literalActionEClass.getESuperTypes().add(this.getSimpleValueAction());
		literalDoubleActionEClass.getESuperTypes().add(this.getLiteralAction());
		literalIntActionEClass.getESuperTypes().add(this.getLiteralAction());
		literalStringActionEClass.getESuperTypes().add(this.getLiteralAction());
		literalMapActionEClass.getESuperTypes().add(this.getLiteralAction());
		literalCollectionActionEClass.getESuperTypes().add(this.getLiteralAction());
		literalCollectionActionEClass.getESuperTypes().add(this.getCollectionProducingAction());
		literalBooleanActionEClass.getESuperTypes().add(this.getLiteralAction());
		readSelfActionEClass.getESuperTypes().add(this.getSimpleValueAction());
		objectActionEClass.getESuperTypes().add(this.getAction());
		nonObjectActionEClass.getESuperTypes().add(this.getAction());
		attributeActionEClass.getESuperTypes().add(this.getObjectAction());
		readAttributeActionEClass.getESuperTypes().add(this.getAttributeAction());
		readAttributeActionEClass.getESuperTypes().add(this.getExpressionAction());
		writeAttributeActionEClass.getESuperTypes().add(this.getAttributeAction());
		writeAttributeActionEClass.getESuperTypes().add(this.getObjectStatementAction());
		variableEClass.getESuperTypes().add(theXmbasePackage.getLocalData());
		localDataActionEClass.getESuperTypes().add(this.getObjectAction());
		readLocalDataActionEClass.getESuperTypes().add(this.getLocalDataAction());
		readLocalDataActionEClass.getESuperTypes().add(this.getSimpleValueAction());
		writeLocalDataActionEClass.getESuperTypes().add(this.getLocalDataAction());
		writeLocalDataActionEClass.getESuperTypes().add(this.getStatementAction());
		createObjectActionEClass.getESuperTypes().add(this.getSimpleValueAction());
		operationActionEClass.getESuperTypes().add(this.getObjectAction());
		callActionActionEClass.getESuperTypes().add(this.getOperationAction());
		callActionActionEClass.getESuperTypes().add(this.getObjectStatementAction());
		callQueryActionEClass.getESuperTypes().add(this.getOperationAction());
		callQueryActionEClass.getESuperTypes().add(this.getExpressionAction());
		finalActionEClass.getESuperTypes().add(this.getStatementAction());
		collectionProducingActionEClass.getESuperTypes().add(this.getAction());
		originalCollectionProducingActionEClass.getESuperTypes().add(this.getCollectionProducingAction());
		collectionConsumingActionEClass.getESuperTypes().add(this.getAction());
		collectionTransformingActionEClass.getESuperTypes().add(this.getCollectionConsumingAction());
		collectionTransformingActionEClass.getESuperTypes().add(this.getCollectionProducingAction());
		finalCollectionConsumingActionEClass.getESuperTypes().add(this.getCollectionConsumingAction());
		traverseManyActionEClass.getESuperTypes().add(this.getOriginalCollectionProducingAction());
		extentActionEClass.getESuperTypes().add(this.getOriginalCollectionProducingAction());
		filterActionEClass.getESuperTypes().add(this.getCollectionTransformingAction());
		mapActionEClass.getESuperTypes().add(this.getCollectionTransformingAction());
		reduceActionEClass.getESuperTypes().add(this.getFinalCollectionConsumingAction());
		reduceActionEClass.getESuperTypes().add(this.getSimpleValueAction());
		applyActionEClass.getESuperTypes().add(this.getFinalCollectionConsumingAction());
		applyActionEClass.getESuperTypes().add(this.getStatementAction());
		collectionExpressionActionEClass.getESuperTypes().add(this.getValueAction());
		collectionStatementEClass.getESuperTypes().add(this.getStatementAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Variables(), this.getVariable(), this.getVariable_Activity(), "variables", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Block(), this.getBlock(), null, "block", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Actions(), this.getAction(), null, "actions", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalClosureEClass, LiteralClosure.class, "LiteralClosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(closureParameterEClass, ClosureParameter.class, "ClosureParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueActionEClass, ValueAction.class, "ValueAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionActionEClass, ExpressionAction.class, "ExpressionAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleValueActionEClass, SimpleValueAction.class, "SimpleValueAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementActionEClass, StatementAction.class, "StatementAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectStatementActionEClass, ObjectStatementAction.class, "ObjectStatementAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalActionEClass, LiteralAction.class, "LiteralAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalDoubleActionEClass, LiteralDoubleAction.class, "LiteralDoubleAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralDoubleAction_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1, LiteralDoubleAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalIntActionEClass, LiteralIntAction.class, "LiteralIntAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralIntAction_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, LiteralIntAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalStringActionEClass, LiteralStringAction.class, "LiteralStringAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralStringAction_Value(), theEcorePackage.getEString(), "value", null, 0, 1, LiteralStringAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalMapActionEClass, LiteralMapAction.class, "LiteralMapAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralMapAction_Entries(), this.getLiteralMapEntry(), null, "entries", null, 0, -1, LiteralMapAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalCollectionActionEClass, LiteralCollectionAction.class, "LiteralCollectionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralCollectionAction_Values(), this.getValueAction(), null, "values", null, 0, -1, LiteralCollectionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalMapEntryEClass, LiteralMapEntry.class, "LiteralMapEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralMapEntry_Name(), theEcorePackage.getEString(), "name", null, 0, 1, LiteralMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteralMapEntry_Value(), this.getValueAction(), null, "value", null, 0, 1, LiteralMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalBooleanActionEClass, LiteralBooleanAction.class, "LiteralBooleanAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBooleanAction_Value(), theEcorePackage.getEBoolean(), "value", null, 0, 1, LiteralBooleanAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readSelfActionEClass, ReadSelfAction.class, "ReadSelfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectActionEClass, ObjectAction.class, "ObjectAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectAction_Target(), this.getValueAction(), null, "target", null, 0, 1, ObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonObjectActionEClass, NonObjectAction.class, "NonObjectAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeActionEClass, AttributeAction.class, "AttributeAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeAction_Attribute(), theXmbasePackage.getAttribute(), null, "attribute", null, 0, 1, AttributeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readAttributeActionEClass, ReadAttributeAction.class, "ReadAttributeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(writeAttributeActionEClass, WriteAttributeAction.class, "WriteAttributeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteAttributeAction_Value(), this.getValueAction(), null, "value", null, 0, 1, WriteAttributeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Activity(), this.getActivity(), this.getActivity_Variables(), "activity", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVariable__Context(), theXmbasePackage.getBehavior(), "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(localDataActionEClass, LocalDataAction.class, "LocalDataAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalDataAction_LocalData(), theXmbasePackage.getLocalData(), null, "localData", null, 0, 1, LocalDataAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readLocalDataActionEClass, ReadLocalDataAction.class, "ReadLocalDataAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(writeLocalDataActionEClass, WriteLocalDataAction.class, "WriteLocalDataAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteLocalDataAction_Value(), this.getValueAction(), null, "value", null, 0, 1, WriteLocalDataAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateObjectAction_Class(), theXmbasePackage.getClass_(), null, "class", null, 0, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateObjectAction_Arguments(), this.getValueAction(), null, "arguments", null, 0, -1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationActionEClass, OperationAction.class, "OperationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationAction_Operation(), theXmbasePackage.getOperation(), null, "operation", null, 0, 1, OperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationAction_Arguments(), this.getValueAction(), null, "arguments", null, 0, -1, OperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callActionActionEClass, CallActionAction.class, "CallActionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callQueryActionEClass, CallQueryAction.class, "CallQueryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalActionEClass, FinalAction.class, "FinalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalAction_ResultValue(), this.getValueAction(), null, "resultValue", null, 0, 1, FinalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionProducingActionEClass, CollectionProducingAction.class, "CollectionProducingAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(originalCollectionProducingActionEClass, OriginalCollectionProducingAction.class, "OriginalCollectionProducingAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionConsumingActionEClass, CollectionConsumingAction.class, "CollectionConsumingAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionTransformingActionEClass, CollectionTransformingAction.class, "CollectionTransformingAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalCollectionConsumingActionEClass, FinalCollectionConsumingAction.class, "FinalCollectionConsumingAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traverseManyActionEClass, TraverseManyAction.class, "TraverseManyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraverseManyAction_Target(), this.getValueAction(), null, "target", null, 0, 1, TraverseManyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraverseManyAction_End(), theXmbasePackage.getAssociationRole(), null, "end", null, 0, 1, TraverseManyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extentActionEClass, ExtentAction.class, "ExtentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtentAction_Class(), theXmbasePackage.getClass_(), null, "class", null, 0, 1, ExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterActionEClass, FilterAction.class, "FilterAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterAction_Filter(), this.getLiteralClosure(), null, "filter", null, 0, 1, FilterAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapActionEClass, MapAction.class, "MapAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapAction_Mapper(), this.getLiteralClosure(), null, "mapper", null, 0, 1, MapAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reduceActionEClass, ReduceAction.class, "ReduceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReduceAction_Reducer(), this.getLiteralClosure(), null, "reducer", null, 0, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReduceAction_Initial(), this.getValueAction(), null, "initial", null, 0, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applyActionEClass, ApplyAction.class, "ApplyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplyAction_Applier(), this.getLiteralClosure(), null, "applier", null, 0, 1, ApplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionExpressionActionEClass, CollectionExpressionAction.class, "CollectionExpressionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionExpressionAction_Source(), this.getOriginalCollectionProducingAction(), null, "source", null, 0, 1, CollectionExpressionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionExpressionAction_Transformers(), this.getCollectionTransformingAction(), null, "transformers", null, 0, -1, CollectionExpressionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionExpressionAction_Destination(), this.getFinalCollectionConsumingAction(), null, "destination", null, 0, 1, CollectionExpressionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionStatementEClass, CollectionStatement.class, "CollectionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionStatement_Source(), this.getOriginalCollectionProducingAction(), null, "source", null, 0, 1, CollectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionStatement_Transformers(), this.getCollectionTransformingAction(), null, "transformers", null, 0, -1, CollectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionStatement_Destination(), this.getFinalCollectionConsumingAction(), null, "destination", null, 0, 1, CollectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XmbehaviorPackageImpl
