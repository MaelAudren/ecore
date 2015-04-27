/**
 */
package org.occiware.clouddesigner.OCCI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.occiware.clouddesigner.OCCI.OCCIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface OCCIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OCCI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OCCI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OCCIPackage eINSTANCE = org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.CategoryImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TERM = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.AttributeImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MUTABLE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Multiple values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTIPLE_VALUES = 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.KindImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 2;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__TERM = CATEGORY__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__SCHEME = CATEGORY__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ATTRIBUTES = CATEGORY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__PARENT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ACTIONS = CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ENTITIES = CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.ActionImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TERM = CATEGORY__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SCHEME = CATEGORY__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ATTRIBUTES = CATEGORY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.MixinImpl <em>Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.MixinImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getMixin()
	 * @generated
	 */
	int MIXIN = 4;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__TERM = CATEGORY__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__SCHEME = CATEGORY__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ATTRIBUTES = CATEGORY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ACTIONS = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__DEPENDS = CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__APPLIES = CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ENTITIES = CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.EntityImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KIND = 1;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MIXINS = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.AttributeStateImpl <em>Attribute State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.AttributeStateImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getAttributeState()
	 * @generated
	 */
	int ATTRIBUTE_STATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.ResourceImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__KIND = ENTITY__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MIXINS = ENTITY__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ATTRIBUTES = ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LINKS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.LinkImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__KIND = ENTITY__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MIXINS = ENTITY__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTES = ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.ExtensionImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__KINDS = 3;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MIXINS = 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TYPES = 5;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.OCCI.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.ConfigurationImpl
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__USE = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>All Resources Links Targets In Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getURI()
	 * @generated
	 */
	int URI = 11;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getString()
	 * @generated
	 */
	int STRING = 12;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 13;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 14;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Category#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Category#getTerm()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Category#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Category#getScheme()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Category#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Category#getTitle()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Category#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Category#getAttributes()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Attributes();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Attribute#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Attribute#isMutable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for the reference '{@link org.occiware.clouddesigner.OCCI.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Attribute#isMultiple_values <em>Multiple values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple values</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Attribute#isMultiple_values()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Multiple_values();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for the reference '{@link org.occiware.clouddesigner.OCCI.Kind#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Kind#getParent()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Kind#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Kind#getActions()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Actions();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.OCCI.Kind#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Kind#getEntities()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Entities();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Mixin <em>Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Mixin
	 * @generated
	 */
	EClass getMixin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Mixin#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Mixin#getActions()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Actions();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.OCCI.Mixin#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Mixin#getDepends()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Depends();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.OCCI.Mixin#getApplies <em>Applies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Mixin#getApplies()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Applies();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.OCCI.Mixin#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Mixin#getEntities()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Entities();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the reference '{@link org.occiware.clouddesigner.OCCI.Entity#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Entity#getKind()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Kind();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.OCCI.Entity#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Entity#getMixins()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Mixins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.OCCI.Entity#IdUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Unique</em>' operation.
	 * @see org.occiware.clouddesigner.OCCI.Entity#IdUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__IdUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.OCCI.Entity#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Unique</em>' operation.
	 * @see org.occiware.clouddesigner.OCCI.Entity#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__AttributesNameUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.AttributeState <em>Attribute State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute State</em>'.
	 * @see org.occiware.clouddesigner.OCCI.AttributeState
	 * @generated
	 */
	EClass getAttributeState();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.AttributeState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.OCCI.AttributeState#getName()
	 * @see #getAttributeState()
	 * @generated
	 */
	EAttribute getAttributeState_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.AttributeState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.occiware.clouddesigner.OCCI.AttributeState#getValue()
	 * @see #getAttributeState()
	 * @generated
	 */
	EAttribute getAttributeState_Value();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Resource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Resource#getLinks()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Links();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the container reference '{@link org.occiware.clouddesigner.OCCI.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link org.occiware.clouddesigner.OCCI.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Extension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Extension#getName()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.OCCI.Extension#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Extension#getScheme()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Scheme();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.OCCI.Extension#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Extension#getImport()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Extension#getKinds <em>Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kinds</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Extension#getKinds()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Kinds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Extension#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mixins</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Extension#getMixins()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Mixins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Extension#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Extension#getTypes()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Types();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.OCCI.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.OCCI.Configuration#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Configuration#getUse()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Use();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.OCCI.Configuration#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.occiware.clouddesigner.OCCI.Configuration#getResources()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Resources();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.OCCI.Configuration#AllResourcesLinksTargetsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Links Targets In Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Links Targets In Configuration</em>' operation.
	 * @see org.occiware.clouddesigner.OCCI.Configuration#AllResourcesLinksTargetsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesLinksTargetsInConfiguration__DiagnosticChain_Map();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OCCIFactory getOCCIFactory();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.CategoryImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TERM = eINSTANCE.getCategory_Term();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__SCHEME = eINSTANCE.getCategory_Scheme();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TITLE = eINSTANCE.getCategory_Title();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ATTRIBUTES = eINSTANCE.getCategory_Attributes();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.AttributeImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MUTABLE = eINSTANCE.getAttribute_Mutable();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Multiple values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MULTIPLE_VALUES = eINSTANCE.getAttribute_Multiple_values();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.KindImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__PARENT = eINSTANCE.getKind_Parent();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__ACTIONS = eINSTANCE.getKind_Actions();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__ENTITIES = eINSTANCE.getKind_Entities();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.ActionImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.MixinImpl <em>Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.MixinImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getMixin()
		 * @generated
		 */
		EClass MIXIN = eINSTANCE.getMixin();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__ACTIONS = eINSTANCE.getMixin_Actions();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__DEPENDS = eINSTANCE.getMixin_Depends();

		/**
		 * The meta object literal for the '<em><b>Applies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__APPLIES = eINSTANCE.getMixin_Applies();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__ENTITIES = eINSTANCE.getMixin_Entities();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.EntityImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__KIND = eINSTANCE.getEntity_Kind();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__MIXINS = eINSTANCE.getEntity_Mixins();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Id Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__IdUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__AttributesNameUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.AttributeStateImpl <em>Attribute State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.AttributeStateImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getAttributeState()
		 * @generated
		 */
		EClass ATTRIBUTE_STATE = eINSTANCE.getAttributeState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_STATE__NAME = eINSTANCE.getAttributeState_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_STATE__VALUE = eINSTANCE.getAttributeState_Value();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.ResourceImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LINKS = eINSTANCE.getResource_Links();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.LinkImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.ExtensionImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAME = eINSTANCE.getExtension_Name();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__SCHEME = eINSTANCE.getExtension_Scheme();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__IMPORT = eINSTANCE.getExtension_Import();

		/**
		 * The meta object literal for the '<em><b>Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__KINDS = eINSTANCE.getExtension_Kinds();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__MIXINS = eINSTANCE.getExtension_Mixins();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__TYPES = eINSTANCE.getExtension_Types();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.OCCI.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.ConfigurationImpl
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__USE = eINSTANCE.getConfiguration_Use();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__RESOURCES = eINSTANCE.getConfiguration_Resources();

		/**
		 * The meta object literal for the '<em><b>All Resources Links Targets In Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__AllResourcesLinksTargetsInConfiguration__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.OCCI.impl.OCCIPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

	}

} //OCCIPackage
