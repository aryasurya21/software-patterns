package main;

import java.util.Scanner;

import Factories.CheesePizzaFactory;
import Factories.MeatPizzaFactory;
import Factories.PepperoniPizzaFactory;
import Factories.PizzaStore;

public class main {
	public main() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input pizza type: ");
		String type = scan.nextLine();
		PizzaStore ps;
		
		if(type.equals("Cheese")){
			ps = new CheesePizzaFactory();
		}
		else if(type.equals("Meat")){
			ps = new MeatPizzaFactory();
		}
		else if(type.equals("Pepperoni")){
			ps = new PepperoniPizzaFactory();
		}
	}
	
	public static void main(String[] args){
		new main();
	}
}
