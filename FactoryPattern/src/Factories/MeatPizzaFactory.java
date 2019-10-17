package Factories;

import Pizza.Pizza;
import Pizza.MeatPizza;

public class MeatPizzaFactory extends PizzaStore {


	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new MeatPizza();
	}
}
