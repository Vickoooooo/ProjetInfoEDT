/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;
import java.util.*;


// Start of user code (user defined imports)

/**
 * Description of TeachersTimeTable.
 * 
 * @author Duruisseaux Victor
 */
public class TeachersTimeTable extends TimeTable {
	
	private int timeTableID;
	public HashSet<Booking> bookings;

	/**
	 * The constructor.
	 * @param timeTableID
	 */
	public TeachersTimeTable(Integer timeTableID) {
		// Start of user code constructor for TeachersTimeTable)
		//super(timeTableID);
		this.timeTableID = timeTableID;
		this.bookings = new HashSet<Booking>();
		// End of user code
	}
	 
	// Start of user code (user defined methods for TeachersTimeTable)
	
	public int getTimeTableID() {
		return this.timeTableID;
	}
	
	public void setTimeTableID(int newTimeTableID) {
		this.timeTableID=newTimeTableID;
	}
	
	
	// End of user code


}
