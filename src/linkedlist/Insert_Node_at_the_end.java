package linkedlist;

public class Insert_Node_at_the_end {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public void append(int newdata) {
		Node newNode = new Node(newdata);

		if (head == null) {

			head = new Node(newdata);
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
	
	public void printlist() {
		Node p = head;
		while (p != null) {
			System.out.println(p.data + " ");
			p = p.next;
		}
		
	}
	

	public static void main(String[] args) {
		
		Insert_Node_at_the_end list = new Insert_Node_at_the_end();
		
		list.append(2);
		list.append(3);
		list.printlist();

	}

}
