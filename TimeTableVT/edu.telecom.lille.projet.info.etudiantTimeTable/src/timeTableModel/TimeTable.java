/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)
import java.util.*;
// End of user code

/**
 * Description of TimeTable.
 * 
 * @author Duruisseaux Victor
 */
public class TimeTable {
	/**
	 * Description of the property bookings.
	 */
	public HashSet<Booking> bookings = new HashSet<Booking>();

	/**
	 * Description of the property groupID.
	 */
	//private String groupID;

	/**
	 * Description of the property timeTablesID.
	 */
	private int timeTablesID;

	// Start of user code (user defined attributes for TimeTable)

	// End of user code

	/**
	 * The constructor.
	 */
	public TimeTable() {
		// Start of user code constructor for TimeTable)
		super();
		// End of user code
	}

	/**
	 * Description of the method getTimeTable.
	 * @param int 
	 */
	//public void getTimeTable(Object int) {
		// Start of user code for method getTimeTable
		// End of user code
	}

	/**
	 * Description of the method setTimeTable.
	 * @param int 
	 */
	//public void setTimeTable(Object int) {
		// Start of user code for method setTimeTable
		// End of user code
	}

	// Start of user code (user defined methods for TimeTable)

	// End of user code
	/**
	 * Returns bookings.
	 * @return bookings 
	 */
	public HashSet<Booking> getBookings() {
		return this.bookings;
	}
	
	public void setList_booking(HashSet<Booking> newList_booking) {
		this.bookings = newList_booking;
	}
	/**
	 * Returns groupID.
	 * @return groupID 
	 */
	//public String getGroupID() {
		return this.groupID;
	}

	/**
	 * Sets a value to attribute groupID. 
	 * @param newGroupID 
	 */
	//public void setGroupID(String newGroupID) {
		this.groupID = newGroupID;
	}

	/**
	 * Returns timeTablesID.
	 * @return timeTablesID 
	 */
	public int getTimeTablesID() {
		return this.timeTablesID;
	}

	/**
	 * Sets a value to attribute timeTablesID. 
	 * @param newTimeTablesID 
	 */
	public void setTimeTablesID(int newTimeTablesID) {
		this.timeTablesID = newTimeTablesID;
	}

}
