package patterns.factory;

public class OSFactory {

	public OS getInsance(String str) {
		if(str.equals("open")) {
			return new Android();
		}
		
		else if(str.equals("secure")) {
			return new IOS();
		}
		else
			return new Windows();
		
		
	}
	
}
