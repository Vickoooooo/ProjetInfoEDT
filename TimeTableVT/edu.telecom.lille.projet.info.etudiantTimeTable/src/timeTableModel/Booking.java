/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)
import java.util.Date;
// End of user code

/**
 * Fonction permettant de cr�er une r�servation.
 * 
 * @author Duruisseaux Victor
 * @param <EDate>
 */
public class Booking {
	
	/**
	 * bookingID est l'identifiant de la r�servation.
	 */
	private int bookingID;
	
	/**
	 * login est l'identifiant du professeur.
	 */
	private String login;

	/**
	 * dateBegin est la date du d�but de r�servation.
	 */
	private Date dateBegin;

	/**
	 * dateEnd est la date de fin de r�servation.
	 */
	private Date dateEnd;

	/**
	 * roomID est l'identifiant de la salle dans laquelle se fait la r�servation.
	 */
	private int roomID;

	// Start of user code (user defined attributes for Booking)

	/**
	 * The constructor.
	 * Pour effectuer une r�servation, celle-ci a besoin d'un identifiant (reservationID), de l'identifiant du professeur qui fait la r�servation (identifiant), d'une date de d�but et de fin de r�servation (newDateDebut, newDateFin) ainsi que de l'identifiant de la salle r�serv� (salleID).
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
	 * Fonction permettant de r�cup�rer la date de d�but de r�servation (dateBegin).
	 * @return dateBegin 
	 */
	public Date getDateBegin() {
		return this.dateBegin;
	}

	/**
	 * Fonction permettant de modifier les paramettres de la varible dateBegin. 
	 * @param newDateBegin 
	 */
	public void setDateBegin(Date newDateBegin) {
		this.dateBegin = newDateBegin;
	}

	/**
	 * Fonction permettant de r�cup�rer la variable bookingID.
	 * @return bookingID 
	 */
	public int getBookingID() {
		return this.bookingID;
	}

	/**
	 * Fonction permettant de modifier les paramettres de la varible bookingID. 
	 * @param newBookingID 
	 */
	public void setBookingID(int newBookingID) {
		this.bookingID = newBookingID;
	}

	/**
	 * Fonction permettant de r�cup�rer la variable login.
	 * @return login 
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 * Fonction permettant de modifier les paramettres de la varible login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
		this.login = newLogin;
	}

	/**
	 * Fonction permettant de r�cup�rer la variable dateEnd.
	 * @return dateEnd 
	 */
	public Date getDateEnd() {
		return this.dateEnd;
	}

	/**
	 * Fonction permettant de modifier les paramettres de la varible dateEnd. 
	 * @param newDateEnd 
	 */
	public void setDateEnd(Date newDateEnd) {
		this.dateEnd = newDateEnd;
	}

	/**
	 * Fonction permettant de r�cup�rer la variable roomID.
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

	// End of user code
}
