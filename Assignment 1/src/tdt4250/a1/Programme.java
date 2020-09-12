/**
 */
package tdt4250.a1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.Programme#getYears <em>Years</em>}</li>
 *   <li>{@link tdt4250.a1.Programme#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.a1.Programme#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.A1Package#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' attribute.
	 * @see #setYears(int)
	 * @see tdt4250.a1.A1Package#getProgramme_Years()
	 * @model
	 * @generated
	 */
	int getYears();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Programme#getYears <em>Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years</em>' attribute.
	 * @see #getYears()
	 * @generated
	 */
	void setYears(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.a1.A1Package#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see tdt4250.a1.A1Package#getProgramme_Specialisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

} // Programme
