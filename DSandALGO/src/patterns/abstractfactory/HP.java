package patterns.abstractfactory;

public class HP extends Device {
	
	private String ram;
	private String processor;
	private String gpu;

	public HP(String ram, String processor, String gpu) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
	}


	@Override
	public String toString() {
		return "HP [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}



	@Override
	public String getDetails() {
		return "RAM of HP is " + this.ram;
	}

}
