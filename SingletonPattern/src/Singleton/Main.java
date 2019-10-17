package Singleton;

public class Main {
	public Main(){
		Database db = Database.getInstance();
		Controller c = new Controller();
		db.addTable("msUser");
		db.addTable("msProduct");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
