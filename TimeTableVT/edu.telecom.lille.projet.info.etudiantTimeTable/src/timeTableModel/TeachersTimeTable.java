/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;


// Start of user code (user defined imports)
import timeTableModel.TimeTable;
import time.util.*;
// End of user code

/**
 * Description of TeachersTimeTable.
 * 
 * @author Duruisseaux Victor
 */
public class TeachersTimeTable extends TimeTable {
	// Start of user code (user defined attributes for TeachersTimeTable)
	private Integer timeTablesId;
	// End of user code

	/**
	 * The constructor.
	 * @param timeTablesID
	 */
	public TeachersTimeTable(Integer timeTableID) {
		// Start of user code constructor for TeachersTimeTable)
		super(timeTableID);
		this.timeTablesID = timeTablesID;
		this.bookings = new HashSet<Booking>();
		// End of user code
	}
	 
	// Start of user code (user defined methods for TeachersTimeTable)
	
	// End of user code


}
