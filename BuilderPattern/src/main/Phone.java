package main;

public class Phone {
	private String nama;
	private String ram;
	private String processor;
	private Boolean internet = false;
	private Boolean mulmed = false;
	//general maksudnya kaya telp sms pada hp bisa
	private Boolean general = false;
	
	public Phone(){
		
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public Boolean getInternet() {
		return internet;
	}

	public void setInternet(Boolean internet) {
		this.internet = internet;
	}

	public Boolean getMulmed() {
		return mulmed;
	}

	public void setMulmed(Boolean mulmed) {
		this.mulmed = mulmed;
	}

	public Boolean getGeneral() {
		return general;
	}

	public void setGeneral(Boolean general) {
		this.general = general;
	}
}
