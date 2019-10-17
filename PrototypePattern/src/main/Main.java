package main;

public class Main {
	public Main() {
		Bread currBread = new Bread("Chocolate","Roti Tawar");
		Bread clonedBread = currBread.cloneBread();
		currBread.setTopping("Cheese");
		
		System.out.println("Current Bread's Topping: "+currBread.getTopping());
		System.out.println("Cloned Bread's Topping: "+clonedBread.getTopping());
	
	}
	public static void main(String[] args) {
		new Main();
	}
}
