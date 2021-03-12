package linkedlist;

public class MyLinkedList {
	
	Node head;
	
	public void add(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	public int removeLast() throws Exception {
		Node temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot remove when there is no element");
		}
		
		if(temp.next == null) {
			Node toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
		
	}
	
	public int getLast() throws Exception {
		Node temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot peek when there is no element");
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}

		return temp.data;
	}
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public static class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
}
