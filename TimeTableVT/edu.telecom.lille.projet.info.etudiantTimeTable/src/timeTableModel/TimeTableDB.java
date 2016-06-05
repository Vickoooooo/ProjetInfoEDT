package timeTableModel;
import java.util.*;

/**
 * 
 * Cette classe gere la base de donn�es d'emplois du temps. Elle doit permettre de sauvegarder et charger les emplois du temps ainsi que les salles � partir d'un fichier XML. 
 * La structure du fichier XML devra �tre la m�me que celle du fichier TimeTableDB.xml.
 * @see <a href="../../TimeTableDB.xml">TimeTableDB.xml</a> 
 * 
 * @author Thomas Mercier
 * @version 06/2016
 * 
 */

public class TimeTableDB {
	
	/**
	 * 
	 * Le fichier contenant la base de donn�es.
	 * 
	 */
	
	private String file;
	public HashSet<TeachersTimeTable> teachersTT;
	//public HashSet<TimetableStudent> studentsTT;
	public HashSet<Room> rooms;

	/**
	 * 
	 * Constructeur de TimeTableDB. 
	 * 
	 * @param file
	 * 		Le nom du fichier qui contient la base de données.
	 */
	
	public TimeTableDB(String file){
		super();
		this.setFile(file);
		teachersTT=new HashSet<TeachersTimeTable>();
		this.rooms=new HashSet<Room>();
	}
	/**
	 * Getter de file
	 * 
	 * @return 
	 * 		Le nom du fichier qui contient la base de données.
	 */
	
	public String getFile() {
		return file;
	}
	/**
	 * Setter de file
	 * 
	 * @param file
	 * 		Le nom du fichier qui contient la base de données.
	 */
	public void setFile(String file) {
		this.file = file;
	}

	public void loadDB(){
		SAXBuilder builder = new SAXBuilder();
		File fichierXML = new File(this.getFile());
		
		try {
			/* Parsing du fichier */
			Document document = builder.build(fichierXML);
			/* Racine du document XML : dans notre cas <TimeTablesDB> */
			Element rootNode = document.getRootElement();
			/* On r�cup�re tous les �l�ment "Room" du fichier XML */
			List<Element> listRooms = rootNode.getChildren("Room");
			List<Element> listTimetables = rootNode.getChildren("Timetable");
			/*r�cup�ration des salles dans la base de donn�es*/
			for(Element xmlRoom : listRooms){
				int roomId = Integer.parseInt(xmlRoom.getChildText("RoomId"));
				int capacity = Integer.parseInt(xmlRoom.getChildText("Capacity"));
				Room newRoom = new Room(roomId,capacity);
				this.rooms.add(newRoom);
			}
		}