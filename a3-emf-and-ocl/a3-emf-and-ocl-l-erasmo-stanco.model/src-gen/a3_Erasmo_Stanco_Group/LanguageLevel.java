/**
 */
package a3_Erasmo_Stanco_Group;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Language Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getLanguageLevel()
 * @model
 * @generated
 */
public enum LanguageLevel implements Enumerator {
	/**
	 * The '<em><b>A1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A1_VALUE
	 * @generated
	 * @ordered
	 */
	A1(0, "A1", "A1"),

	/**
	 * The '<em><b>A2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A2_VALUE
	 * @generated
	 * @ordered
	 */
	A2(0, "A2", "A2"),

	/**
	 * The '<em><b>B1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B1_VALUE
	 * @generated
	 * @ordered
	 */
	B1(0, "B1", "B1"),

	/**
	 * The '<em><b>B2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B2_VALUE
	 * @generated
	 * @ordered
	 */
	B2(0, "B2", "B2"),

	/**
	 * The '<em><b>C1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C1_VALUE
	 * @generated
	 * @ordered
	 */
	C1(0, "C1", "C1"),

	/**
	 * The '<em><b>C2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C2_VALUE
	 * @generated
	 * @ordered
	 */
	C2(0, "C2", "C2");

	/**
	 * The '<em><b>A1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A1_VALUE = 0;

	/**
	 * The '<em><b>A2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A2_VALUE = 0;

	/**
	 * The '<em><b>B1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B1_VALUE = 0;

	/**
	 * The '<em><b>B2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B2_VALUE = 0;

	/**
	 * The '<em><b>C1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C1_VALUE = 0;

	/**
	 * The '<em><b>C2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C2_VALUE = 0;

	/**
	 * An array of all the '<em><b>Language Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LanguageLevel[] VALUES_ARRAY =
		new LanguageLevel[] {
			A1,
			A2,
			B1,
			B2,
			C1,
			C2,
		};

	/**
	 * A public read-only list of all the '<em><b>Language Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LanguageLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Language Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LanguageLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Language Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LanguageLevel get(int value) {
		switch (value) {
			case A1_VALUE: return A1;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LanguageLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LanguageLevel
