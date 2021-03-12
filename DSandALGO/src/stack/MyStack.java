package stack;

import linkedlist.MyLinkedList;

public class MyStack {
	
	private MyLinkedList ll = new MyLinkedList();
	
	void push(int data) {
		ll.add(data);
	}
	
	int pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Cannot pop");
		}
		return ll.removeLast();
	}
	
	int peek() throws Exception {
		 return ll.getLast();
	}

}
