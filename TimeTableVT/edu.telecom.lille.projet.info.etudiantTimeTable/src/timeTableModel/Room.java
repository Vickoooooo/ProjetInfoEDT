/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Room.
 * 
 * @author Duruisseaux Victor
 */
public class Room {
	/**
	 * Description of the property roomID.
	 */
	private int roomID;

	/**
	 * Description of the property capacity.
	 */
	private int capacity;

	// Start of user code (user defined attributes for Room)

	// End of user code

	/**
	 * The constructor.
	 */
	public Room(int roomID, int capacity) {
		// Start of user code constructor for Room)
		super();
		this.roomID = roomID;
		this.capacity = capacity;
		// End of user code
	}

	
	/**
	 * Returns roomID.
	 * @return roomID 
	 */
	public int getRoomID() {
		return this.roomID;
	}

	/**
	 * Sets a value to attribute roomID. 
	 * @param newRoomID 
	 */
	public void setRoomID(int newRoomID) {
		this.roomID = newRoomID;
	}

	/**
	 * Returns capacity.
	 * @return capacity 
	 */
	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * Sets a value to attribute capacity. 
	 * @param newCapacity 
	 */
	public void setCapacity(int newCapacity) {
		this.capacity = newCapacity;
	}

}
