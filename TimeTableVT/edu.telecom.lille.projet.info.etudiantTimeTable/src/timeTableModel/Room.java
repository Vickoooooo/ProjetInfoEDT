/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)
import java.util.HashSet;
// End of user code

/**
 *  Classe Room, constructeur & methodes inherentes
 * 
 * @author Duruisseaux Victor
 */
public class Room {
	/**
	 * roomID est la variable de l'identifiant de la salle.
	 */
	private int roomID;

	/**
	 * capacity est la variable indiquent le nombred de places disponibles dans une salle.
	 */
	private int capacity;

	// Start of user code (user defined attributes for Room)

	// End of user code

	/**
	 * The constructor.
	 * @param roomID
	 * @param capacity
	 */
	public Room(int roomID, int capacity) {
		// Start of user code constructor for Room)
		super();
		this.roomID = roomID;
		this.capacity = capacity;
		// End of user code
	}

	
	/**
	 * Fonction permettant de récupérer la variable roomID.
	 * @return roomID 
	 */
	public int getRoomID() {
		return this.roomID;
	}

	/**
	 * Fonction permettant de modifier les paramettres de la varible roomID. 
	 * @param newRoomID 
	 */
	public void setRoomID(int newRoomID) {
		this.roomID = newRoomID;
	}

	/**
	 * Fonction permettant de récupérer la variable capacity.
	 * @return capacity 
	 */
	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * Fonction permettant de modifier les paramettres de la varible capacity. 
	 * @param newCapacity 
	 */
	public void setCapacity(int newCapacity) {
		this.capacity = newCapacity;
	}

}
