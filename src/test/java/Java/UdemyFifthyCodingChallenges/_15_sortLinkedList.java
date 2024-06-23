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

	static Node mergeSortedLists(Node head1, Node head2) {
		Node ptr1 = head1;
		Node ptr2 = head2;
		Node returnedHead = null;
		Node tail = null;
		Node lower;
		while (ptr1 != null || ptr2 != null) {
			if (ptr1 != null && ptr2 != null) {
				if (ptr1.data < ptr2.data) {
					lower = ptr1;
					ptr1 = ptr1.next;
				} else {
					lower = ptr2;
					ptr2 = ptr2.next;
				}
			} else if (ptr1 != null) {
				lower = ptr1;
				ptr1 = ptr1.next;
			} else {
				lower = ptr2;
				ptr2 = ptr2.next;
			}
			if (returnedHead == null) {
				returnedHead = lower;
				tail = lower;
			} else {
				tail.next = lower;
				tail = tail.next;
			}
		}
		return returnedHead;
	}

	static Node mergeSort(Node head) {
		if (head == null || head.next == null)
			return head;
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node headRightHalf = slow.next;
		slow.next = null;
		head = mergeSort(head);
		headRightHalf = mergeSort(headRightHalf);
		return mergeSortedLists(head, headRightHalf);
	}

	static void _02_Using_Merge_Sort(LinkedList list) {
		// Time complexity: O(nlogn)
		// Space complexity: O(logn)
		list.head = mergeSort(list.head);
	}

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
//		ll._01_Using_Bubble_Sort(list);
		ll._02_Using_Merge_Sort(list);

		System.out.println("Output: ");
		list.printList();
	}
}
