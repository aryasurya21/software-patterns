package main;

public class Bread {
	private String topping;
	private String type;
	
	public Bread(String topping, String type) {
		super();
		this.topping = topping;
		this.type = type;
	}
	
	public void setTopping(String topping) {
		this.topping = topping;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType(){
		return this.type;
	}
	
	public String getTopping(){
		return this.topping;
	}
	
	public Bread cloneBread(){
		Bread clonedBread = new Bread(this.getTopping(),this.getType());
		return clonedBread;
	}
}
