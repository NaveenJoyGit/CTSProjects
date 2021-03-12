package stack;

public class Main {

	public static void main(String[] args) throws Exception {
		MyStack st = new MyStack();
		
		st.push(8);
		st.push(78);
		st.push(12);
		st.push(34);
		st.push(4);
		
		st.pop();
		System.out.println(st.peek());
		
		
	}

}
