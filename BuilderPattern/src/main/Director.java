package main;

public class Director {
	protected Builder currBuilder;
	
	public Director(Builder currBuilder){
		super();
		this.currBuilder = currBuilder;
	}
	
	public void work(){
		//instance == equals of/bagian dari
		if(currBuilder instanceof ModernPhoneBuilder){
			currBuilder.setGeneral(true)
			.setInternet(true)
			.setMulmed(true)
			.setName("Xiaomi RedMi Note 4")
			.setProcessor("Android X")
			.setRam("5 GB");
		}
		else if(currBuilder instanceof OldPhoneBuilder){
			currBuilder.setGeneral(true)
			.setInternet(false)
			.setMulmed(false)
			.setName("Esia")
			.setProcessor("Intel Atom")
			.setRam("512 MB");
		}
	}
	
	public Phone getProduct(){
		return currBuilder.getProduct();
	}
}
