/**
 */
package tdt4250.a1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.CourseCombination#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.a1.CourseCombination#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.a1.CourseCombination#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.A1Package#getCourseCombination()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsEnoughCredits courseLevelCombination'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 needsEnoughCredits='self.credits-&gt;sum() &gt; 30.0'"
 * @generated
 */
public interface CourseCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see tdt4250.a1.A1Package#getCourseCombination_Credits()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.a1.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.a1.A1Package#getCourseCombination_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.Semester#getCourseCombination <em>Course Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see tdt4250.a1.A1Package#getCourseCombination_Semester()
	 * @see tdt4250.a1.Semester#getCourseCombination
	 * @model opposite="courseCombination" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link tdt4250.a1.CourseCombination#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // CourseCombination
