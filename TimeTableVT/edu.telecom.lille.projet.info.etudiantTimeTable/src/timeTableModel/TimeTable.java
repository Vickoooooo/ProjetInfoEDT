/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.util.*;

// Start of user code (user defined imports)

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
	private String groupID;

	/**
	 * Description of the property timeTableID.
	 */
	private int timeTableID;

	/**
	 * The constructor.
	 */
	public TimeTable() {
		super();
	}

	/**
	 * Returns bookings.
	 * @return bookings 
	 */
	public HashSet<Booking> getBookings() {
		return this.bookings;
	}

	/**
	 * Returns groupID.
	 * @return groupID 
	 */
	public String getGroupID() {
		return this.groupID;
	}

	/**
	 * Sets a value to attribute groupID. 
	 * @param newGroupID 
	 */
	public void setGroupID(String newGroupID) {
		this.groupID = newGroupID;
	}

	/**
	 * Returns timeTablesID.
	 * @return timeTablesID 
	 */
	public int getTimeTableID() {
		return this.timeTableID;
	}

	/**
	 * Sets a value to attribute timeTablesID. 
	 * @param newTimeTablesID 
	 */
	public void setTimeTablesID(int newTimeTableID) {
		this.timeTableID = newTimeTableID;
	}

}

//End of user code