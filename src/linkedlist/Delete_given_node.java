package linkedlist;

public class Delete_given_node {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printlist() {
		Node p = head;
		while(p != null) {
			System.out.print(p.data+ "");
			p = p.next;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void append(int d) {
		Node newNode = new Node(d);
		
		if(head == null) {
			head = new Node(d);
			return;
		}
		newNode.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return;
	}
	
	public void deleteNode(int position) {
		if (head == null) {
			return;
	}
		Node temp = head;
		if (position == 0) {
			head = temp.next;
			return;
		}
		for(int i = 0; temp!=null && i < position -1; i++) {
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null) {
			return;
		}
		Node next = temp.next.next;
		temp.next = next;
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
