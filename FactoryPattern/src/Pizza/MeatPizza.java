package Pizza;

public class MeatPizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println("Preparing meat pizza..");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Baking meat pizza..");
	}
}
