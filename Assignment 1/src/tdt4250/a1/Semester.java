/**
 */
package tdt4250.a1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link tdt4250.a1.Semester#getCourseCombination <em>Course Combination</em>}</li>
 *   <li>{@link tdt4250.a1.Semester#getSpecialiseIn <em>Specialise In</em>}</li>
 *   <li>{@link tdt4250.a1.Semester#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.A1Package#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='specialisationContainedInProgramme'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 specialisationContainedInProgramme='self.specialiseIn = null or self.specialiseIn.eContainer() = self.eContainer().programme'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see tdt4250.a1.A1Package#getSemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course Combination</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.CourseCombination#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Combination</em>' containment reference.
	 * @see #setCourseCombination(CourseCombination)
	 * @see tdt4250.a1.A1Package#getSemester_CourseCombination()
	 * @see tdt4250.a1.CourseCombination#getSemester
	 * @model opposite="semester" containment="true" required="true"
	 * @generated
	 */
	CourseCombination getCourseCombination();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Semester#getCourseCombination <em>Course Combination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Combination</em>' containment reference.
	 * @see #getCourseCombination()
	 * @generated
	 */
	void setCourseCombination(CourseCombination value);

	/**
	 * Returns the value of the '<em><b>Specialise In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialise In</em>' reference.
	 * @see #setSpecialiseIn(Specialisation)
	 * @see tdt4250.a1.A1Package#getSemester_SpecialiseIn()
	 * @model
	 * @generated
	 */
	Specialisation getSpecialiseIn();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Semester#getSpecialiseIn <em>Specialise In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialise In</em>' reference.
	 * @see #getSpecialiseIn()
	 * @generated
	 */
	void setSpecialiseIn(Specialisation value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.Student#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Student)
	 * @see tdt4250.a1.A1Package#getSemester_Student()
	 * @see tdt4250.a1.Student#getSemesters
	 * @model opposite="semesters" required="true" transient="false"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link tdt4250.a1.Semester#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

} // Semester
