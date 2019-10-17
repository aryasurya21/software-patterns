package Singleton;

import java.util.Random;
import java.util.Vector;

public class Database {

	public static Database db = new Database(); 
	private Vector<String> tables = new Vector<>();
	private String id;
	private Random rand = new Random();
	
	private Database() {
		id = rand.nextInt(100)+"";
	}
	
	public static Database getInstance(){
		if(db == null){
			db = new Database();
		}
		return db;
	}
	
	public void addTable(String tableName){
		tables.add(tableName);
	}
	
	public void viewTable(){
		for (String t : tables) {
			System.out.println(t);
		}
	}
}
