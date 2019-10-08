package main;

public class Main {

	public Main() {
		/* Builder Pattern without Director */
		Builder myBuilder = new OldPhoneBuilder();
		myBuilder.setGeneral(true)
		.setInternet(false)
		.setMulmed(false)
		.setName("Esia")
		.setProcessor("Intel Atom")
		.setRam("512 MB");
		
		Builder myBuilder2 = new ModernPhoneBuilder();
		myBuilder2.setGeneral(true)
		.setInternet(true)
		.setMulmed(true)
		.setName("Xiaomi RedMi Note 4")
		.setProcessor("Android X")
		.setRam("5 GB");
		
		Phone oldPhone = myBuilder.getProduct();
		Phone modernPhone = myBuilder2.getProduct();
		
		System.out.println("Nama HP: "+oldPhone.getNama()+"\nProcessor: "
		+oldPhone.getProcessor()+"\nRAM: "+oldPhone.getRam());
		
		System.out.println("=================");
		
		System.out.println("Nama HP: "+modernPhone.getNama()+"\nProcessor: "
				+modernPhone.getProcessor()+"\nRAM: "+modernPhone.getRam());
		/* End Builder Pattern without Director */
		
		System.out.println("\n");
		
		/* Builder Pattern with Director */
		Director myDirector = new Director(new OldPhoneBuilder());

		myDirector.work();
		Phone myPhone = myDirector.getProduct();
		
		System.out.println("Nama HP: "+myPhone.getNama()+"\nProcessor: "
		+myPhone.getProcessor()+"\nRAM: "+myPhone.getRam());
		/* End Builder Pattern with Director */
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
