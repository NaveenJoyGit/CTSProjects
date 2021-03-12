package patterns.factory;

public class Main {

	public static void main(String[] args) {
		OSFactory osf = new OSFactory();
		OS os = osf.getInsance("secure");
		os.spec();
	}
	
}
