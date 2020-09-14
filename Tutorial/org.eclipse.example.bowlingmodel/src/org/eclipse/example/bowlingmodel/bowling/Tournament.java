/**
 */
package org.eclipse.example.bowlingmodel.bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.example.bowlingmodel.bowling.Tournament#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.example.bowlingmodel.bowling.Tournament#getMatchups <em>Matchups</em>}</li>
 * </ul>
 *
 * @see org.eclipse.example.bowlingmodel.bowling.BowlingPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.example.bowlingmodel.bowling.TournamentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.example.bowlingmodel.bowling.TournamentType
	 * @see #setType(TournamentType)
	 * @see org.eclipse.example.bowlingmodel.bowling.BowlingPackage#getTournament_Type()
	 * @model
	 * @generated
	 */
	TournamentType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.example.bowlingmodel.bowling.Tournament#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.example.bowlingmodel.bowling.TournamentType
	 * @see #getType()
	 * @generated
	 */
	void setType(TournamentType value);

	/**
	 * Returns the value of the '<em><b>Matchups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.example.bowlingmodel.bowling.Matchup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchups</em>' containment reference list.
	 * @see org.eclipse.example.bowlingmodel.bowling.BowlingPackage#getTournament_Matchups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Matchup> getMatchups();

} // Tournament
