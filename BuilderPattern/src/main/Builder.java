package main;

public interface Builder {
	public Builder setInternet(Boolean internet);
	public Builder setMulmed(Boolean mulmed);
	public Builder setName(String name);
	public Builder setRam(String ram);
	public Builder setProcessor(String processor);
	public Builder setGeneral(Boolean general);

	public Phone getProduct();
}
