package linkedlist;

public class Insert_Node_in_middle {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	
	public void push(int data) {
		Node push = new Node(data);
		push.next = head;
		head = push;
	}
	
	public void append(int data) {
		Node append = new Node(data);
		if (head == null) {
			head = new Node(data);
			return;
		}
		
		append.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = append;
		return;		
	}
	
	public void insertAfter(Node prev_node, int data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node newNode = new Node (data);
		newNode.next = prev_node.next;
		prev_node.next = newNode;
		return;
	}
	
	public void printlist() {
		Node p = head;
		while (p != null) {
			System.out.print(p.data +" ");
			p = p.next;
		}
	}

	public static void main(String[] args) {
		
		Insert_Node_in_middle list = new Insert_Node_in_middle();
		list.push(4);
		list.push(2);
		list.append(6);
		list.insertAfter(list.head.next.next, 8);
		System.out.println("\nCreated Linked list is: ");
		list.printlist();
	}

}
