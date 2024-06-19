package Java.UdemyFifthyCodingChallenges;

public class _09_reverseLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	static class LinkedList {
		Node head;

		LinkedList() {
			this.head = null;
		}

		LinkedList(Node head) {
			this.head = head;
		}

		// Method to print the list
		public void printList() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println("null");
		}
	}

	public void _01_By_Dealing_With_Links_Iteratively(LinkedList list) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		Node temp = list.head;
		Node before = null;
		Node after = temp.next;
		while (temp != null) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
		list.head = before;
	}

	static Node reverseNodes(Node node){
		  if(node == null || node.next == null)
		    return node;
		  Node reversed = reverseNodes(node.next);
		  node.next.next = node;
		  node.next = null;
		  return reversed;
		}

		static void _02_By_Dealing_With_Links_Recursively(LinkedList list){
		  list.head = reverseNodes(list.head);
		}
		
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList(new Node(5, new Node(3, new Node(6, new Node(4, new Node(7, null))))));
		LinkedList list2 = new LinkedList(new Node(1, new Node(2, new Node(3, null))));

		_09_reverseLinkedList exercise = new _09_reverseLinkedList();

		System.out.println("Original List 1:");
		list1.printList();
		exercise._01_By_Dealing_With_Links_Iteratively(list1);
		System.out.println("Reversed List 1:");
		list1.printList();

		System.out.println("Original List 2:");
		list2.printList();
		exercise._01_By_Dealing_With_Links_Iteratively(list2);
		System.out.println("Reversed List 2:");
		list2.printList();
		System.out.println("--------------------------------");
		
		System.out.println("Original List 1:");
		list1.printList();
		exercise._02_By_Dealing_With_Links_Recursively(list1);
		System.out.println("Reversed List 1:");
		list1.printList();

		System.out.println("Original List 2:");
		list2.printList();
		exercise._02_By_Dealing_With_Links_Recursively(list2);
		System.out.println("Reversed List 2:");
		list2.printList();
	}
}
