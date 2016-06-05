/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)
import java.util.Date;
// End of user code

/**
 * Description of Booking.
 * 
 * @author Duruisseaux Victor
 * @param <EDate>
 */
public class Booking {
	
	/**
	 * Description of the property bookingID.
	 */
	private int bookingID;
	
	/**
	 * Description of the property login.
	 */
	private String login;

	/**
	 * Description of the property dateBegin.
	 */
	private Date dateBegin;

	/**
	 * Description of the property dateEnd.
	 */
	private Date dateEnd;

	/**
	 * Description of the property roomID.
	 */
	private int roomID;

	/**
	 * Description of the property rooms.
	 */
	//public HashSet<Room> rooms = new HashSet<Room>();

	// Start of user code (user defined attributes for Booking)

	/**
	 * The constructor.
	 */
	public Booking(int reservationID, String identifiant, Date newDateDebut, Date newDateFin, int salleID) {
		// Start of user code constructor for Booking)
		this.bookingID = reservationID;
		this.login = identifiant;
		this.dateBegin = newDateDebut;
		this.dateEnd = newDateFin;
		this.roomID = salleID;
		// End of user code
	}

	/**
	 * Description of the method getBookingMaxID.
	 * @param int 
	 */
	public void getBookingMaxID(int timeTableID) {
	}


	/**
	 * Returns dateBegin.
	 * @return dateBegin 
	 */
	public Date getDateBegin() {
		return this.dateBegin;
	}

	/**
	 * Sets a value to attribute dateBegin. 
	 * @param newDateBegin 
	 */
	public void setDateBegin(Date newDateBegin) {
		this.dateBegin = newDateBegin;
	}

	/**
	 * Returns bookingID.
	 * @return bookingID 
	 */
	public int getBookingID() {
		return this.bookingID;
	}

	/**
	 * Sets a value to attribute bookingID. 
	 * @param newBookingID 
	 */
	public void setBookingID(int newBookingID) {
		this.bookingID = newBookingID;
	}

	/**
	 * Returns login.
	 * @return login 
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 * Sets a value to attribute login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
		this.login = newLogin;
	}

	/**
	 * Returns dateEnd.
	 * @return dateEnd 
	 */
	public Date getDateEnd() {
		return this.dateEnd;
	}

	/**
	 * Sets a value to attribute dateEnd. 
	 * @param newDateEnd 
	 */
	public void setDateEnd(Date newDateEnd) {
		this.dateEnd = newDateEnd;
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

	// End of user code
}
