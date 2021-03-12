package queue;

public class Main {

	public static void main(String[] args) {

		MyQueue myq = new MyQueue();
		
		myq.enqueue(2);
		myq.enqueue(5);
		myq.enqueue(8);
		myq.enqueue(45);
		myq.enqueue(11);
		
		System.out.println(myq.dequeue());
		System.out.println(myq.peek());
		
	}

}
