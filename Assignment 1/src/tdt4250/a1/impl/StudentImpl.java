/**
 */
package tdt4250.a1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.a1.A1Package;
import tdt4250.a1.Programme;
import tdt4250.a1.Semester;
import tdt4250.a1.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.impl.StudentImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link tdt4250.a1.impl.StudentImpl#getStudentID <em>Student ID</em>}</li>
 *   <li>{@link tdt4250.a1.impl.StudentImpl#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The cached value of the '{@link #getProgramme() <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programme programme;

	/**
	 * The default value of the '{@link #getStudentID() <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentID()
	 * @generated
	 * @ordered
	 */
	protected static final int STUDENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStudentID() <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentID()
	 * @generated
	 * @ordered
	 */
	protected int studentID = STUDENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (programme != null && programme.eIsProxy()) {
			InternalEObject oldProgramme = (InternalEObject)programme;
			programme = (Programme)eResolveProxy(oldProgramme);
			if (programme != oldProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, A1Package.STUDENT__PROGRAMME, oldProgramme, programme));
			}
		}
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetProgramme() {
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		Programme oldProgramme = programme;
		programme = newProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STUDENT__PROGRAMME, oldProgramme, programme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStudentID() {
		return studentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudentID(int newStudentID) {
		int oldStudentID = studentID;
		studentID = newStudentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STUDENT__STUDENT_ID, oldStudentID, studentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, A1Package.STUDENT__SEMESTERS, A1Package.SEMESTER__STUDENT);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A1Package.STUDENT__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
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
			case A1Package.STUDENT__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A1Package.STUDENT__PROGRAMME:
				if (resolve) return getProgramme();
				return basicGetProgramme();
			case A1Package.STUDENT__STUDENT_ID:
				return getStudentID();
			case A1Package.STUDENT__SEMESTERS:
				return getSemesters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A1Package.STUDENT__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case A1Package.STUDENT__STUDENT_ID:
				setStudentID((Integer)newValue);
				return;
			case A1Package.STUDENT__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
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
			case A1Package.STUDENT__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case A1Package.STUDENT__STUDENT_ID:
				setStudentID(STUDENT_ID_EDEFAULT);
				return;
			case A1Package.STUDENT__SEMESTERS:
				getSemesters().clear();
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
			case A1Package.STUDENT__PROGRAMME:
				return programme != null;
			case A1Package.STUDENT__STUDENT_ID:
				return studentID != STUDENT_ID_EDEFAULT;
			case A1Package.STUDENT__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
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
		result.append(" (studentID: ");
		result.append(studentID);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
