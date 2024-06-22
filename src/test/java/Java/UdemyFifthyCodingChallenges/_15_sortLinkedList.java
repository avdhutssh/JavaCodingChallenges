package Java.UdemyFifthyCodingChallenges;

public class _15_sortLinkedList {

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

		public void printList() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println("null");
		}

		public void append(int data) {
			if (head == null) {
				head = new Node(data);
				return;
			}
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
	}

	public void _01_Using_Bubble_Sort(LinkedList list) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		Node i = list.head;
		while (i != null) {
			Node j = list.head;
			while (j.next != null) {
				if (j.data > j.next.data) {
					int temp = j.data;
					j.data = j.next.data;
					j.next.data = temp;
				}
				j = j.next;
			}
			i = i.next;
		}
	}

//merge sort remain	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(4);
		list.append(8);
		list.append(1);
		list.append(6);
		list.append(2);
		list.append(5);

		System.out.println("Input: ");
		list.printList();

		_15_sortLinkedList ll = new _15_sortLinkedList();
		ll._01_Using_Bubble_Sort(list);

		System.out.println("Output: ");
		list.printList();
	}
}
