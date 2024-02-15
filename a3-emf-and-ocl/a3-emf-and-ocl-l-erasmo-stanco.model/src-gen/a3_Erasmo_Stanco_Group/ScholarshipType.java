/**
 */
package a3_Erasmo_Stanco_Group;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scholarship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getScholarshipType()
 * @model
 * @generated
 */
public enum ScholarshipType implements Enumerator {
	/**
	 * The '<em><b>Program Country</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM_COUNTRY_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRAM_COUNTRY(0, "Program_Country", "Program_Country"),

	/**
	 * The '<em><b>Partner Country</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTNER_COUNTRY_VALUE
	 * @generated
	 * @ordered
	 */
	PARTNER_COUNTRY(0, "Partner_Country", "Partner_Country");

	/**
	 * The '<em><b>Program Country</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM_COUNTRY
	 * @model name="Program_Country"
	 * @generated
	 * @ordered
	 */
	public static final int PROGRAM_COUNTRY_VALUE = 0;

	/**
	 * The '<em><b>Partner Country</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTNER_COUNTRY
	 * @model name="Partner_Country"
	 * @generated
	 * @ordered
	 */
	public static final int PARTNER_COUNTRY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Scholarship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScholarshipType[] VALUES_ARRAY =
		new ScholarshipType[] {
			PROGRAM_COUNTRY,
			PARTNER_COUNTRY,
		};

	/**
	 * A public read-only list of all the '<em><b>Scholarship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScholarshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scholarship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScholarshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScholarshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scholarship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScholarshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScholarshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scholarship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScholarshipType get(int value) {
		switch (value) {
			case PROGRAM_COUNTRY_VALUE: return PROGRAM_COUNTRY;
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
	private ScholarshipType(int value, String name, String literal) {
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
	
} //ScholarshipType
