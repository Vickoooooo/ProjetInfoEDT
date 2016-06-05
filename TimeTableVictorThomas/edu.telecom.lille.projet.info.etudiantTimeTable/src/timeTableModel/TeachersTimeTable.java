/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

//Start of user code (user defined imports)
import java.util.*;
//End of user code

// Start of user code (user defined methods for TeachersTimeTable)

/**
 * Description of TeachersTimeTable.
 * 
 * @author Duruisseaux Victor
 */
public class TeachersTimeTable extends TimeTable {
	
	private String timeTableID;
	public HashSet<Booking> bookings;

	/**
	 * The constructor.
	 * TeachersTimeTable est une classe fille de TimeTable.
	 * 
	 * @param timeTableID
	 */
	public TeachersTimeTable(Integer timeTableID) {
		// Start of user code constructor for TeachersTimeTable)
		super(timeTableID);
		
		String TimeTableIDString;
		TimeTableIDString = "" + TimeTableID;
		this.TimeTableID=TimeTableIDString;
		
		this.bookings = new HashSet<Booking>();
		// End of user code
	}
	 
	// End of user code


}
