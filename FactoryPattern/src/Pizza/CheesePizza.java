package Pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing cheese pizza..");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Baking cheese pizza..");
	}

}
