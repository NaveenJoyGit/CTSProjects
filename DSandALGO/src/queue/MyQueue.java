package queue;

import linkedlist.MyLinkedList.Node;

public class MyQueue {

	private Node head, rear;
	
	public void enqueue(int data) {
		Node toAdd = new Node(data);
 
		if(head == null) {
			head = rear = toAdd;
		}
		
		rear.next = toAdd;
		rear = rear.next;
	}
	
	public int dequeue() {
		if(head == null) {
			return (Integer) null;
		}
		
		Node temp = head;
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		return temp.data;
	}
	
	public int peek() {
		if(head == null) {
			return (Integer) null;
		}
		return head.data;
	}
	
}
