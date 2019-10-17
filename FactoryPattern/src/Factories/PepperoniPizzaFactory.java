package Factories;

import Pizza.PepperoniPizza;
import Pizza.Pizza;

public class PepperoniPizzaFactory extends PizzaStore{

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new PepperoniPizza();
	}
}
