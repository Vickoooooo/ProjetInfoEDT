package timeTableModel;
import java.util.*;

/**
 * 
 * Cette classe gere la base de données d'emplois du temps. Elle doit permettre de sauvegarder et charger les emplois du temps ainsi que les salles à  partir d'un fichier XML. 
 * La structure du fichier XML devra être la même que celle du fichier TimeTableDB.xml.
 * @see <a href="../../TimeTableDB.xml">TimeTableDB.xml</a> 
 * 
 * @author Thomas Mercier
 * @version 06/2016
 * 
 */

public class TimeTableDB {
	
	/**
	 * 
	 * Le fichier contenant la base de données.
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
	 * 		Le nom du fichier qui contient la base de donnÃ©es.
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
	 * 		Le nom du fichier qui contient la base de donnÃ©es.
	 */
	
	public String getFile() {
		return file;
	}
	/**
	 * Setter de file
	 * 
	 * @param file
	 * 		Le nom du fichier qui contient la base de donnÃ©es.
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
			/* On récupère tous les élément "Room" du fichier XML */
			List<Element> listRooms = rootNode.getChildren("Room");
			List<Element> listTimetables = rootNode.getChildren("Timetable");
			/*récupération des salles dans la base de données*/
			for(Element xmlRoom : listRooms){
				int roomId = Integer.parseInt(xmlRoom.getChildText("RoomId"));
				int capacity = Integer.parseInt(xmlRoom.getChildText("Capacity"));
				Room newRoom = new Room(roomId,capacity);
				this.rooms.add(newRoom);
			}
		}