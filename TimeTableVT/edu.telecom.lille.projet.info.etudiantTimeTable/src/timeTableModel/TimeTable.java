/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)
import java.util.*;
//End of user code

/**
 * Classe TimeTable, constructer & methodes inherentes
 * @author Duruisseaux Victor
 */

public class TimeTable {
	/**
	 * L'ensemble des reservations du TimeTable.
	 */
	public static HashSet<Booking> bookings = new HashSet<Booking>();

	/**
	 * groupID est l'identifiant du groupe.
	 */
	private String groupID;

	/**
	 * timeTableID est l'identifiant du TimeTable.
	 */
	private int timeTableID;

	/**
	 * The constructor.
	 */
	public TimeTable(Integer groupID2) {
		super();
	timeTableID=groupID2;
	this.bookings = new HashSet<Booking>();
	}

	/**
	 * Méthode de class qui permet de renvoyer l'ensemble des réservations qui composent TimeTable
	 * @return bookings 
	 */
	public HashSet<Booking> getBookings() {
		return this.bookings;
	}

	/**
	 * Fonction permettant de récupérer la variable groupID.
	 * @return groupID 
	 */
	public int getGroupID() {
		return this.groupID;
	}

	/**
	 * Fonction permettant de modifier les paramètres de la variable groupID. 
	 * @param newGroupID 
	 */
	public void setGroupID(String newGroupID) {
		this.groupID = newGroupID;
	}

	/**
	 * Methode de classe qui permet d'ajouter une réservation à TimeTable.
	 * @param Booking book
	 */
	public void addBooking(Booking book){
		this.bookings.add(book);
	}
	
	
	/**
	 * Methode de classe qui permet de supprimer une réservation de TimeTable.
	 * @param Booking book
	 */
	public void removeBooking(Booking book){
		this.bookings.remove(book);
	}
	
	/**
	 * Methode de classe qui permet de modifier l'identifiant de TimeTable.
	 * @param newGroupId 
	 */
	public void settimeTableId(int newtimeTableId) {
		this.timeTableId = newtimeTableId;
	}
}

//End of user code