package Factories;

import Pizza.CheesePizza;
import Pizza.MeatPizza;
import Pizza.Pizza;

public abstract class PizzaStore {

	public PizzaStore() {
		Pizza p = createPizza();
		p.prepare();
		p.bake();
	}
	
	public abstract Pizza createPizza();
}
