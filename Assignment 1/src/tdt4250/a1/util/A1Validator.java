/**
 */
package tdt4250.a1.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.a1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.a1.A1Package
 * @generated
 */
public class A1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final A1Validator INSTANCE = new A1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.a1";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return A1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case A1Package.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case A1Package.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case A1Package.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case A1Package.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case A1Package.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case A1Package.COURSE_COMBINATION:
				return validateCourseCombination((CourseCombination)value, diagnostics, context);
			case A1Package.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_specialisationContainedInProgramme(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the specialisationContainedInProgramme constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__SPECIALISATION_CONTAINED_IN_PROGRAMME__EEXPRESSION = "self.specialiseIn = null or self.specialiseIn.eContainer() = self.eContainer().programme";

	/**
	 * Validates the specialisationContainedInProgramme constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_specialisationContainedInProgramme(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(A1Package.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "specialisationContainedInProgramme",
				 SEMESTER__SPECIALISATION_CONTAINED_IN_PROGRAMME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCombination(CourseCombination courseCombination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseCombination, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseCombination_needsEnoughCredits(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseCombination_courseLevelCombination(courseCombination, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the needsEnoughCredits constraint of '<em>Course Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE_COMBINATION__NEEDS_ENOUGH_CREDITS__EEXPRESSION = "self.credits->sum() > 30.0";

	/**
	 * Validates the needsEnoughCredits constraint of '<em>Course Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseCombination_needsEnoughCredits(CourseCombination courseCombination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (courseCombination.getCredits() < 30.0f) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "needsEnoughCredits", getObjectLabel(courseCombination, context) },
						 new Object[] { courseCombination },
						 context));
			} 
			return false;
		}
		return true;
	}

	/**
	 * Validates the courseLevelCombination constraint of '<em>Course Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseCombination_courseLevelCombination(CourseCombination courseCombination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// If the semester is at master level,
		// Check that no more than 22.5 credits are from lower level courses.
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		float sumBachelorCredits = 0.0f;
		
		for (Course course : courseCombination.getCourses()) {
			if (course.getLevel() <= 3 ) {
				sumBachelorCredits += course.getCredits();
			}
		}
		
		boolean masterLevel = false;
		int years = courseCombination.getSemester().getStudent().getProgramme().getYears();
		int semesterNumber = courseCombination.getSemester().getNumber();
		// Given that master is the last two years (i.e 4 semesters) of any programme:
		// Check that this semester is a master level semester.
		if (semesterNumber >= years*2 - 4) {
			masterLevel = true;
		}
		if (! masterLevel) {
			// This constraint is "disabled"
			return false;
		}
				
		if (sumBachelorCredits > 22.5f) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseLevelCombination", getObjectLabel(courseCombination, context) },
						 new Object[] { courseCombination },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //A1Validator
