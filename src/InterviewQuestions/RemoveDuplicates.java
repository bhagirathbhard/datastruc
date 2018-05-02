package InterviewQuestions;


//Write a program to remove duplicates from an unsorted LinkedList
//Also Follow up -- How would you solve this problem if a temporary buffer is not allowed.

public class RemoveDuplicates {
	
	Node head;
	
	class Node {
		Node next;
		int data;
		
		Node(int d){
			next = null;
			data = d;
		}
	}

	public void printlist() {
		Node print = head;
		while(print != null) {
			System.out.print(print.data + " ");
			print = print.next;
		}
		return;
	}
	
	public void push(int data) {
		Node push = new Node(data);
		push.next = head;
		head = push;
	}

	public void append(int data) {
		Node append = new Node(data);
		if(head == null) {
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
			System.out.println("previous node cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prev_node.next;
		prev_node.next = newNode;
		return;
	}

	public static void main(String[] args) {
		RemoveDuplicates list = new RemoveDuplicates();
		System.out.print("the given linkedlist is : ");
		list.push(2);
		list.append(4);
		list.append(6);
		list.append(10);
		list.insertAfter(list.head.next.next, 8);
		list.printlist();
		// Trying to understand duplicates
	}

}
