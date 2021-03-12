package patterns.abstractfactory;

public class Dell extends Device {
	
	private String ram;
	private String processor;
	private String gpu;

	public Dell(String ram, String processor, String gpu) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
	}

	@Override
	public String getDetails() {
		return "RAM of Dell is " + this.ram;
	}

	@Override
	public String toString() {
		return "Dell [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}


}
