package Singleton;

public class Controller {
	
	private Database db;
	public Controller() {
		// TODO Auto-generated constructor stub
		db = Database.getInstance();
		db.viewTable();
	}

}
