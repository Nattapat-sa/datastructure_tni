
class Node {
	public int data;
	public Node next;

	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public String displayList() {
		boolean first = true;
		String display = "[";
		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}
		display += "]";
		return display;
	}

	public void clear() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {

		return head == null;
	}

	public void append(int value) {
		Node new_node = new Node(value);
		if (isEmpty()) {
			head = new_node;
			tail = new_node;
		} else {
			tail.next = new_node;
			tail = new_node;
		}

	}

	public Object get(int position) {
		Node node= head;
		int current_position=0;
		while(node!=null && current_position<position) {
			node=node.next;
			current_position++;
		}
		
		if(node==null) {
			return null;
		}
		return node.data;
		
	}

	public void set(int position, int value) {
		Node node= head;
		int current_position=0;
		while(node!=null && current_position<position) {
			node=node.next;
			current_position++;
		}
		
		if(node != null) {
			node.data=value;
		}
		System.out.println(node==null ? "Updated data fail…" : "Updated data success!!");
		
		

	}

	public boolean contains(int value) {
		if (!isEmpty()) {
			Node current_node = head;
			while (current_node != null && current_node.data != value) {
				current_node = current_node.next;
			}
			if (current_node != null) {
				return true;
			}

		}

		return false;
	}

	public void addAll(SinglyLinkedList otherlist) {
		if(!isEmpty() && !otherlist.isEmpty()) {
			tail.next = otherlist.head;
		}else if (isEmpty()&& !otherlist.isEmpty()) {
			head= otherlist.head;
			tail =otherlist.tail;
		}

	}

}
