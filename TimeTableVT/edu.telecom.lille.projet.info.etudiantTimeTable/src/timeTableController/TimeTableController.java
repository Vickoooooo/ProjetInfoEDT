/* 2016, All rights reserved.
 *******************************************************************************/
package timeTableController;
// Start of user code (user defined imports)
import java.util.*;
import java.util.Map.Entry;
import timeTableModel.Booking;
import timeTableModel.Room;
import timeTableModel.TimeTable;
import timeTableModel.TimeTableDB;
// End of user code

/**
 * Classe qui implÈmente l'interface, contient de nombreuses fonction de gestion globale des emplois du temps
 * 
 * @author Victor Duruisseaux
 */
public class TimeTableController implements ITimeTableController {
	// Start of user code (user defined attributes for TimeTableController)
	/**
	 * timeTableDB Class.
	 */
	public TimeTableDB TimeTableDB;

	/**
	 * The constructor.
	 * @param tTfile 
	 */
	public TimeTableController(String tTfile) {
		super();
	}

	/**
	 * timeTableDB.
	 * @return timeTableDB 
	 */
	public TimeTableDB getTimeTableDB() {
		return this.TimeTableDB;
	}

	/**
	 * Sets a value to attribute timeTableDB. 
	 * @param newTimeTableDB 
	 */
	public void setTimeTableDB(TimeTableDB newTimeTableDB) {
		this.TimeTableDB=newTimeTableDB;
	}
	
	/**
	 * Get the values of the different roomId in a list of strings
	 * @return TabRoomsId
	 * 		Le tableau des TabRoomsId en string
	 */
	public String[] roomsToString() {
		HashSet<Room> RoomsSet = TimeTableDB.RoomsSet;		//RÈcupÈration du HashSet contenant les Rooms
		Iterator<Room> it1 = RoomsSet.iterator();			//Initialisation de l'itÈrateur et calcul de la longueur du tableau
		int i =RoomsSet.size();								//RÈcupÈration des roomsId sous la forme d'int conversion en string et ajout dans le tableau de sortie
		String TabRoomsId[] = new String[i];
		i =0;
		while (it1.hasNext()) {
			String cle = "" + it1.hasNext();
	    	TabRoomsId[i]=cle;
	    	i++;
		}
	    return TabRoomsId;
	}
	
	/**
	 * Fonction permettant de r√©cup√©rer tous les identifiants des salles sous la forme d'un 
	 * tableau de cha√Ænes de caract√®res o√π chaque ligne contient l'identifiant d'une salle.
	 * 
	 * @return
	 * 		Un tableau de String contenant toutes les informations de tous les groupes.
	 */
	public String[] roomsIdToString() {
		HashSet<Room> RoomsSet = TimeTableDB.RoomsSet;		//RÈcupÈration du HashSet contenant les Rooms
		Iterator<Room> it1 = RoomsSet.iterator();			//Initialisation de l'itÈrateur et calcul de la longueur du tableau
		int i =RoomsSet.size();								//RÈcupÈration des roomsId sous la forme d'int conversion en string et ajout dans le tableau de sortie
		String TabRoomsId[] = new String[i];
		i =0;
		while (it1.hasNext()) {
			Room RR = (Room)it1;
			it1.next();
			String cle = "" + RR.getRoomId();
	    	TabRoomsId[i]=cle;
	    	i++;
		}
	    return TabRoomsId;
	}
	
	/**
	 * Fonction permettant de r√©cup√©rer tous les identifiants des emplois du temps sous la forme d'un 
	 * tableau de cha√Ænes de caract√®res o√π chaque ligne contient l'identifiant d'un emploi du temps.
	 * 
	 * @return
	 * 		Un tableau de String contenant toutes les identifiants de tous les emplois du temps.
	 */
	public String[] timeTablesIDToString(){
		HashSet<Room> RoomsSet = TimeTableDB.RoomsSet;		//RÈcupÈration du HashSet contenant les Rooms
		Iterator<Room> it1 = RoomsSet.iterator();			//Initialisation de l'itÈrateur et calcul de la longueur du tableau
		int i =RoomsSet.size();								//RÈcupÈration des roomsId sous la forme d'int conversion en string et ajout dans le tableau de sortie
		String TabRoomsId[] = new String[i];
		i =0;
		while (it1.hasNext()) {
            Room RR = (Room)it1.next();
            String cle = "" + RR.getRoomId();
            TabRoomsId[i]=cle;
            i++;
        }
	    return TabRoomsId;
	}

	
	/**
     * Fonction qui supprime une salle et qui sauvegarde la base de donn√©es. 
     * @param roomId
     *         L'identifiant de la salle
     * @return
     *         Un boolean indiquant si la salle a bien √©t√© supprim√©e
     */
    public boolean removeRoom(int roomId) {

        Iterator<Room> parcourtRooms = TimeTableDB.RoomsSet.iterator();     // CrÈation d'un itÈrateur pour parcourir RoomsSet
        while(parcourtRooms.hasNext()){
            // on parcourt le set de rooms en cherchant un ÈlÈment Ègal
            //‡ l'id de la room que l'on veut supprimer
            if(parcourtRooms.next().getRoomId()== roomId){
                int capacity = parcourtRooms.next().getCapacity();       //RÈcupÈration de la capacitÈ de la salle
                Room Remove = new Room(roomId, capacity);                //CrÈation d'un Objet Room 
                TimeTableDB.RoomsSet.remove(Remove);                     //Supression de la salle 
                saveDB();
                return true;
            }
        }
        return false;

    }

	/**
	 * Fonction qui cr√©e un emploi du temps et qui le sauvegarde dans la base de donn√©es
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @return
	 * 		Un boolean indiquant si l'emploi du temps a bien √©t√© cr√©√©
	 */
	public boolean addTimeTable(int timeTableId) {
        TimeTable NewTT = new TimeTable(timeTableId);
        if (TimeTableDB.TTSet.contains(NewTT)){
            TimeTableDB.TTSet.add(NewTT);
            return true;
        }
        return false;
    }

	/**
	 * Fonction qui crÈe une salle et qui la sauvegarde dans la base de donnÈes. 
	 * @param roomId
	 * 		L'identifiant de la salle
	 * @param capacity
	 * 		La capacitÈ de la salle
	 * @return
	 * 		Un boolean indiquant si la salle a bien ÈtÈ crÈe
	 */
	public boolean addRoom(int roomId, int capacity){
		HashSet<Room> RoomsSet = TimeTableDB.RoomsSet;
		Room newroom = new Room(roomId,capacity);
		boolean b;
		if((RoomsSet.contains(newroom))){
			b=false;
		}
		else{
			b=true;
			RoomsSet.add(newroom);
		}
		saveDB();
		return b;
	}
	
	/**
	 * Fonction permettant de r√©cup√©rer le login du professeur qui a r√©alis√© la r√©servation dont l'identifiant est bookId dans l'emploi du temps dont l'identifiant est timeTableId. 
	 * @param timeTableId
	 * 		L'identifiant de l'emploi du temps
	 * @param bookId
	 * 		L'identifiant de r√©servation
	 * @return
	 * 		Le login du professeur qui a fait la r√©servation.
	 */
	@Override
	public String getTeacherLogin(int timeTableId, int bookId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Fonction qui r√©cup√®re l'identifiant de la salle r√©serv√©e dans l'emploi du temps dont l'identifiant est timeTableId et dont l'identifiant de r√©servation est bookId
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @param bookId
	 * 		L'identifiant de r√©servation
	 * @return
	 * 		L'identifiant de la salle r√©serv√©e si trouvÈe, 0 sinon
	 */
	@Override
	public int getRoom(int timeTableId, int bookId) {
		HashSet<TimeTable> TTSet = TimeTableDB.TTSet;
		Iterator<TimeTable> it1=TTSet.iterator();
		while(it1.hasNext()){//recherche du bon timetable
			TimeTable TT=(TimeTable)it1.next();
			if (TT.getGroupId()==timeTableId){//Si on a le bon TimeTable, il faut trouver la bonne reservation
				HashSet<Booking> Booking=TT.getBookings();
				Iterator<Booking> it2=Booking.iterator();
				while(it2.hasNext()){//recherche de la bonne reservation
					Booking BK=(Booking)it2.next();
					if(BK.getRoomId()==bookId){//renvoit de la room apres avoir trouver la bonne reservation
						int SalleID=BK.getRoomId();
						return SalleID;
					}
				}
			}
		}
		return 0;//si on a rien trouve, retourne 0, qui n'est normalement pas une id valable
	}


	/**
	 * Fonction qui supprime un emploi du temps et qui sauvegarde la base de donn√©es
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @return
	 * 		Un boolean indiquant si l'emploi du temps a bien √©t√© cr√©√©
	 */
	@Override
    public boolean removeTimeTable(int timeTableId) {
        Iterator<TimeTable> ItTT = timeTableModel.TimeTableDB.TTSet.iterator() ;    // CrÈation d'un itÈrateur pour parcourir RoomsSet
        while(ItTT.hasNext()){
                // on parcourt le set de timetable en cherchant un ÈlÈment Ègal
                //‡ l'id du timetable que l'on veut supprimer
                if(ItTT.next().getGroupId()== timeTableId){
                    TimeTable DelTT = new TimeTable(timeTableId);                //CrÈation d'un Objet TimeTable
                    timeTableModel.TimeTableDB.TTSet.remove(DelTT);                     //Supression de l'emploi du temps
                    saveDB();
                    return true;
                }
            }
            return false;
    }
	
	/**
	 * Fonction qui ajoute une r√©servation dans l'emploi du temps TimeTableId et qui la sauvegarde dans la base de donn√©es
	 * 
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @param bookingId
	 * 		L'identifiant de r√©servation
	 * @param login
	 * 		Le login du professeur faisant la r√©servation
	 * @param dateBegin
	 * 		La date de d√©but de r√©servation
	 * @param dateEnd
	 * 		La date de fin de r√©servation
	 * @param roomId
	 * 		L'identifiant de la salle r√©serv√©e
	 * @return
	 * 		Un boolean indiquant si la r√©servation a bien √©t√© faite
	 */
	@Override
    public boolean addBooking(int timeTableId, int bookingId, String login, Date dateBegin, Date dateEnd, int roomId) {
        Booking NewBooking = new Booking(bookingId,login,dateBegin,dateEnd,roomId); //creation de la nouvelle reservation suivant les parametres
        //TimeTable NewTT = new TimeTable (timeTableId);
        Iterator<TimeTable> ItTT = timeTableModel.TimeTableDB.TTSet.iterator() ;    // CrÈation d'un itÈrateur de timetable
        while(ItTT.hasNext()){//recherche du bon timetable
        	TimeTable TT=(TimeTable)ItTT.next();
            if(TT.getGroupId()== timeTableId){ //bon timetable trouvÈ
            	TT.addBooking(NewBooking);
                saveDB();
                return true;
            }
       }
    return false;
    }
	
	/**
	 * Fonction qui retourne les dates de d√©but et de fin des r√©servations de l'emploi du temps dont l'identifiant est timeTableId.
	 * 
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @param dateBegin
	 * 		Hashtable qui contiendra les dates de d√©but des r√©servations. La cl√© de la Hashtable correspond √† l'identifiant de r√©servation.
	 * @param dateEnd
	 * 		Hashtable qui contiendra les dates de fin des r√©servations. La cl√© de la Hashtable correspond √† l'identifiant de r√©servation.
	 */
	@Override
	public void getBookingsDate(int timeTableId, Hashtable<Integer, Date> dateBegin, Hashtable<Integer, Date> dateEnd) {
		// Public "void" mais doit retourner les dates ?
		
	}
	/**
	 * Fonction qui supprime la r√©servation dont l'identifiant est bookId dans l'emploi du temps timeTableId.
	 * 
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @param bookId
	 * 		L'identifiant de r√©servation √† supprimer
	 * @return
	 * 		Un boolean indiquant si la r√©servation a bien √©t√© supprim√©e
	 */
	@Override
    public boolean removeBook(int timeTableId, int bookId) {
        Iterator<TimeTable> ItTT = timeTableModel.TimeTableDB.TTSet.iterator();// CrÈation d'un itÈrateur pour parcourir TimeTableSet
        while(ItTT.hasNext()){
        	TimeTable TT=(TimeTable)ItTT.next();
            if(TT.getGroupId()== timeTableId){ //test pour trouver le bon TimeTable
            	Iterator<Booking> itBB = TimeTable.bookings.iterator();
                while(itBB.hasNext()){ //recherche de la bonne reservation parmis celle du bon TimeTable
                	Booking BB=(Booking)itBB.next();
                	if (BB.getbookId()==bookId){
                		TT.removeBooking(BB); //on supprime la reservation identifiÈe du bon TimeTable
                        saveDB();
                        return true;
                        }
                    }
               	}
        }
        return false;
    }
	
	/**
	 * Fonction qui r√©cup√®re le plus grand identifiant de r√©servation dans l'emploi du temps timeTableId.
	 * 
	 * @param timeTableId
	 * 		L'identifiant d'emploi du temps
	 * @return
	 * 		Le plus grand identifiant de r√©servation
	 */
	@Override
	public int getBookingsMaxId(int timeTableId){
        int max = 0;
        HashSet<TimeTable> TTSet = TimeTableDB.TTSet;
        Iterator<TimeTable> it1 = TimeTableDB.TTSet.iterator();   // Premier itÈrateur pour parcourir les TimeTable
        while(it1.hasNext()){
            TimeTable TT=(TimeTable)it1.next();
            if(TT.getGroupId() == timeTableId){             // On trouve le TimeTable correspondant
                HashSet<Booking> Booking=TT.getBookings();
                Iterator<Booking> it2=Booking.iterator();          // 2eme itÈrateur pour parcourir les bookings
                while (it2.hasNext()){
                    Booking BB = (Booking)it2.next();
                    if(BB.getbookId()>max){                  // recherche de maximum
                        max = BB.getbookId();
                    }
                }
            }
        }
        return max;
    }

	/**
     * Fonction permettant de r√©cup√©rer tous les identifiants des r√©servations de l'emploi du temps timeTableId sous la forme d'un 
     * tableau de cha√Ænes de caract√®res o√π chaque ligne contient l'identifiant d'une r√©servation.
     * 
     * @param timeTableId
     *             Un identifiant d'emploi du temps
     * @return
     *         Un tableau de String contenant toutes les informations de tous les groupes.
     */
    public String[] booksIDToString(){
        HashSet<Booking> Bookings = TimeTable.bookings;        //RÈcupÈration du HashSet contenant les Books
        Iterator<Booking> it1 = Bookings.iterator();            //Initialisation de l'itÈrateur et calcul de la longueur du tableau
        int i =Bookings.size();                                //RÈcupÈration des booksId sous la forme d'int conversion en string et ajout dans le tableau de sortie
        String TabBookId[] = new String[i];
        i =0;
        while (it1.hasNext()) {
            Booking BB = (Booking)it1.next();
            String cle = "" + BB.getbookId();
            TabBookId[i]=cle;
            i++;
        }
        return TabBookId;
    }
    /**
	 * Fonction sauvegardant la base de donn√©e dans un fichier XML.
	 * @return
	 * 		Un boolean indiquant si la sauvegarde a bien √©t√© r√©alis√©e.
	 */
    @Override
    public boolean saveDB() {
        this.TimeTableDB.saveDB();
        return false;
    }
    /**
	 * Fonction chargeant la base de donn√©e contenue dans un fichier XML.
	 * @return
	 * 		Un boolean indiquant si le chargement a bien √©t√© r√©alis√©e.
	 */
    @Override
    public boolean loadDB() {
        this.TimeTableDB.loadDB();
        return false;
    }

	// End of user code
	
}