/**
 */
package tdt4250.a1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import tdt4250.a1.A1Package;
import tdt4250.a1.CourseCombination;
import tdt4250.a1.Semester;
import tdt4250.a1.Specialisation;
import tdt4250.a1.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getCourseCombination <em>Course Combination</em>}</li>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getSpecialiseIn <em>Specialise In</em>}</li>
 *   <li>{@link tdt4250.a1.impl.SemesterImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseCombination() <em>Course Combination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCombination()
	 * @generated
	 * @ordered
	 */
	protected CourseCombination courseCombination;

	/**
	 * The cached value of the '{@link #getSpecialiseIn() <em>Specialise In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialiseIn()
	 * @generated
	 * @ordered
	 */
	protected Specialisation specialiseIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SEMESTER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseCombination getCourseCombination() {
		return courseCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseCombination(CourseCombination newCourseCombination, NotificationChain msgs) {
		CourseCombination oldCourseCombination = courseCombination;
		courseCombination = newCourseCombination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A1Package.SEMESTER__COURSE_COMBINATION, oldCourseCombination, newCourseCombination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseCombination(CourseCombination newCourseCombination) {
		if (newCourseCombination != courseCombination) {
			NotificationChain msgs = null;
			if (courseCombination != null)
				msgs = ((InternalEObject)courseCombination).eInverseRemove(this, A1Package.COURSE_COMBINATION__SEMESTER, CourseCombination.class, msgs);
			if (newCourseCombination != null)
				msgs = ((InternalEObject)newCourseCombination).eInverseAdd(this, A1Package.COURSE_COMBINATION__SEMESTER, CourseCombination.class, msgs);
			msgs = basicSetCourseCombination(newCourseCombination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SEMESTER__COURSE_COMBINATION, newCourseCombination, newCourseCombination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialisation getSpecialiseIn() {
		if (specialiseIn != null && specialiseIn.eIsProxy()) {
			InternalEObject oldSpecialiseIn = (InternalEObject)specialiseIn;
			specialiseIn = (Specialisation)eResolveProxy(oldSpecialiseIn);
			if (specialiseIn != oldSpecialiseIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, A1Package.SEMESTER__SPECIALISE_IN, oldSpecialiseIn, specialiseIn));
			}
		}
		return specialiseIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation basicGetSpecialiseIn() {
		return specialiseIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialiseIn(Specialisation newSpecialiseIn) {
		Specialisation oldSpecialiseIn = specialiseIn;
		specialiseIn = newSpecialiseIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SEMESTER__SPECIALISE_IN, oldSpecialiseIn, specialiseIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (eContainerFeatureID() != A1Package.SEMESTER__STUDENT) return null;
		return (Student)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, A1Package.SEMESTER__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != A1Package.SEMESTER__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, A1Package.STUDENT__SEMESTERS, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.SEMESTER__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A1Package.SEMESTER__COURSE_COMBINATION:
				if (courseCombination != null)
					msgs = ((InternalEObject)courseCombination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A1Package.SEMESTER__COURSE_COMBINATION, null, msgs);
				return basicSetCourseCombination((CourseCombination)otherEnd, msgs);
			case A1Package.SEMESTER__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Student)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A1Package.SEMESTER__COURSE_COMBINATION:
				return basicSetCourseCombination(null, msgs);
			case A1Package.SEMESTER__STUDENT:
				return basicSetStudent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case A1Package.SEMESTER__STUDENT:
				return eInternalContainer().eInverseRemove(this, A1Package.STUDENT__SEMESTERS, Student.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A1Package.SEMESTER__NUMBER:
				return getNumber();
			case A1Package.SEMESTER__COURSE_COMBINATION:
				return getCourseCombination();
			case A1Package.SEMESTER__SPECIALISE_IN:
				if (resolve) return getSpecialiseIn();
				return basicGetSpecialiseIn();
			case A1Package.SEMESTER__STUDENT:
				return getStudent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A1Package.SEMESTER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case A1Package.SEMESTER__COURSE_COMBINATION:
				setCourseCombination((CourseCombination)newValue);
				return;
			case A1Package.SEMESTER__SPECIALISE_IN:
				setSpecialiseIn((Specialisation)newValue);
				return;
			case A1Package.SEMESTER__STUDENT:
				setStudent((Student)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case A1Package.SEMESTER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case A1Package.SEMESTER__COURSE_COMBINATION:
				setCourseCombination((CourseCombination)null);
				return;
			case A1Package.SEMESTER__SPECIALISE_IN:
				setSpecialiseIn((Specialisation)null);
				return;
			case A1Package.SEMESTER__STUDENT:
				setStudent((Student)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case A1Package.SEMESTER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case A1Package.SEMESTER__COURSE_COMBINATION:
				return courseCombination != null;
			case A1Package.SEMESTER__SPECIALISE_IN:
				return specialiseIn != null;
			case A1Package.SEMESTER__STUDENT:
				return getStudent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
