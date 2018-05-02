package linkedlist;

import linkedlist.LinkedList.Node;

public class Insert_Node_at_the_head {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void append(int newdata) {
		
		Node newNode = new Node(newdata);
		
		if(head == null) {
			
			head = new Node(newdata);
			return;
		}
		
		newNode.next = null;
		
		Node last = head;
		
		while(last.next != null) {
			
			last = last.next;
		}
		
		last.next = newNode;
		
		return;
	
	}
	
	public void push(int newdata) {
		Node push = new Node(newdata);
		push.next = head;
		head = push;
	}
	

	public void printlist() {
		Node p = head;
		while (p.next != null) {
			System.out.println(p.data+" ");
			p = p.next;
		}
	}
	
	public static void main(String[] args) {
		Insert_Node_at_the_head list = new Insert_Node_at_the_head();
		list.push(3);
		list.push(26);
		list.append(2);
		list.printlist();

	}

}
