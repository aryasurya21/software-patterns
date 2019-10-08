package main;

public class OldPhoneBuilder implements Builder {
	
	private Phone myPhone;
	
	public OldPhoneBuilder(){
		myPhone = new Phone();
	}

	@Override
	public Builder setInternet(Boolean internet) {
		// TODO Auto-generated method stub
		myPhone.setInternet(internet);
		return this;
	}

	@Override
	public Builder setMulmed(Boolean mulmed) {
		// TODO Auto-generated method stub
		myPhone.setMulmed(mulmed);
		return this;
	}

	@Override
	public Builder setName(String name) {
		// TODO Auto-generated method stub
		myPhone.setNama(name);
		return this;
	}

	@Override
	public Builder setRam(String ram) {
		// TODO Auto-generated method stub
		myPhone.setRam(ram);
		return this;
	}

	@Override
	public Builder setProcessor(String processor) {
		// TODO Auto-generated method stub
		myPhone.setProcessor(processor);
		return this;
	}

	@Override
	public Builder setGeneral(Boolean general) {
		// TODO Auto-generated method stub
		myPhone.setGeneral(general);
		return this;
	}

	@Override
	public Phone getProduct() {
		// TODO Auto-generated method stub
		return myPhone;
	}

}
