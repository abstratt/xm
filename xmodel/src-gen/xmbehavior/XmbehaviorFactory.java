/**
 */
package xmbehavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xmbehavior.XmbehaviorPackage
 * @generated
 */
public interface XmbehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmbehaviorFactory eINSTANCE = xmbehavior.impl.XmbehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Literal Closure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Closure</em>'.
	 * @generated
	 */
	LiteralClosure createLiteralClosure();

	/**
	 * Returns a new object of class '<em>Closure Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closure Parameter</em>'.
	 * @generated
	 */
	ClosureParameter createClosureParameter();

	/**
	 * Returns a new object of class '<em>Literal Double Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Double Action</em>'.
	 * @generated
	 */
	LiteralDoubleAction createLiteralDoubleAction();

	/**
	 * Returns a new object of class '<em>Literal Int Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Int Action</em>'.
	 * @generated
	 */
	LiteralIntAction createLiteralIntAction();

	/**
	 * Returns a new object of class '<em>Literal String Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal String Action</em>'.
	 * @generated
	 */
	LiteralStringAction createLiteralStringAction();

	/**
	 * Returns a new object of class '<em>Literal Map Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Map Action</em>'.
	 * @generated
	 */
	LiteralMapAction createLiteralMapAction();

	/**
	 * Returns a new object of class '<em>Literal Collection Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Collection Action</em>'.
	 * @generated
	 */
	LiteralCollectionAction createLiteralCollectionAction();

	/**
	 * Returns a new object of class '<em>Literal Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Map Entry</em>'.
	 * @generated
	 */
	LiteralMapEntry createLiteralMapEntry();

	/**
	 * Returns a new object of class '<em>Literal Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Boolean Action</em>'.
	 * @generated
	 */
	LiteralBooleanAction createLiteralBooleanAction();

	/**
	 * Returns a new object of class '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Self Action</em>'.
	 * @generated
	 */
	ReadSelfAction createReadSelfAction();

	/**
	 * Returns a new object of class '<em>Read Attribute Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Attribute Action</em>'.
	 * @generated
	 */
	ReadAttributeAction createReadAttributeAction();

	/**
	 * Returns a new object of class '<em>Write Attribute Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Attribute Action</em>'.
	 * @generated
	 */
	WriteAttributeAction createWriteAttributeAction();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Read Local Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Local Data Action</em>'.
	 * @generated
	 */
	ReadLocalDataAction createReadLocalDataAction();

	/**
	 * Returns a new object of class '<em>Write Local Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Local Data Action</em>'.
	 * @generated
	 */
	WriteLocalDataAction createWriteLocalDataAction();

	/**
	 * Returns a new object of class '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Object Action</em>'.
	 * @generated
	 */
	CreateObjectAction createCreateObjectAction();

	/**
	 * Returns a new object of class '<em>Call Action Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Action Action</em>'.
	 * @generated
	 */
	CallActionAction createCallActionAction();

	/**
	 * Returns a new object of class '<em>Call Query Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Query Action</em>'.
	 * @generated
	 */
	CallQueryAction createCallQueryAction();

	/**
	 * Returns a new object of class '<em>Final Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Action</em>'.
	 * @generated
	 */
	FinalAction createFinalAction();

	/**
	 * Returns a new object of class '<em>Traverse Many Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traverse Many Action</em>'.
	 * @generated
	 */
	TraverseManyAction createTraverseManyAction();

	/**
	 * Returns a new object of class '<em>Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extent Action</em>'.
	 * @generated
	 */
	ExtentAction createExtentAction();

	/**
	 * Returns a new object of class '<em>Filter Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Action</em>'.
	 * @generated
	 */
	FilterAction createFilterAction();

	/**
	 * Returns a new object of class '<em>Map Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Action</em>'.
	 * @generated
	 */
	MapAction createMapAction();

	/**
	 * Returns a new object of class '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduce Action</em>'.
	 * @generated
	 */
	ReduceAction createReduceAction();

	/**
	 * Returns a new object of class '<em>Apply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Action</em>'.
	 * @generated
	 */
	ApplyAction createApplyAction();

	/**
	 * Returns a new object of class '<em>Collection Expression Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Expression Action</em>'.
	 * @generated
	 */
	CollectionExpressionAction createCollectionExpressionAction();

	/**
	 * Returns a new object of class '<em>Collection Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Statement</em>'.
	 * @generated
	 */
	CollectionStatement createCollectionStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmbehaviorPackage getXmbehaviorPackage();

} //XmbehaviorFactory
