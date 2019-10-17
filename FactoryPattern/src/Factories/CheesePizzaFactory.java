package Factories;

import Pizza.CheesePizza;
import Pizza.Pizza;

public class CheesePizzaFactory extends PizzaStore{

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new CheesePizza();
	}
}
