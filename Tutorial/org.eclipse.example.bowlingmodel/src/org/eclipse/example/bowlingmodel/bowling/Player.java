/**
 */
package org.eclipse.example.bowlingmodel.bowling;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.example.bowlingmodel.bowling.Player#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.example.bowlingmodel.bowling.Player#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.eclipse.example.bowlingmodel.bowling.Player#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.example.bowlingmodel.bowling.Player#isIsProfessional <em>Is Professional</em>}</li>
 * </ul>
 *
 * @see org.eclipse.example.bowlingmodel.bowling.BowlingPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.example.bowlingmodel.bowling.BowlingPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.example.bowlingmodel.bowling.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(Date)
	 * @see org.eclipse.example.bowlingmodel.bowling.BowlingPackage#getPlayer_DateOfBirth()
	 * @model
	 * @generated
	 */
	Date getDateOfBirth();

	/**
	 * Sets the value of the '{@link org.eclipse.example.bowlingmodel.bowling.Player#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(Date value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.eclipse.example.bowlingmodel.bowling.BowlingPackage#getPlayer_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.example.bowlingmodel.bowling.Player#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Is Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Professional</em>' attribute.
	 * @see #setIsProfessional(boolean)
	 * @see org.eclipse.example.bowlingmodel.bowling.BowlingPackage#getPlayer_IsProfessional()
	 * @model
	 * @generated
	 */
	boolean isIsProfessional();

	/**
	 * Sets the value of the '{@link org.eclipse.example.bowlingmodel.bowling.Player#isIsProfessional <em>Is Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Professional</em>' attribute.
	 * @see #isIsProfessional()
	 * @generated
	 */
	void setIsProfessional(boolean value);

} // Player
