package Java.UdemyFifthyCodingChallenges;

public class _11_isPalindromeLinkedList {
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

	public Node reverseLinkedList(Node head) {
		Node temp = head;
		Node before = null;
		Node after = temp.next;
		while (temp != null) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
		return before;
	}

	public boolean _01_By_Two_Pointer_technique(LinkedList list) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		int length = 0;
		Node left = list.head;
		Node temp = list.head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		for (int i = 0; i < length / 2; i++) {
			Node right = list.head;
			for (int j = 0; j < length - i - 1; j++) {
				right = right.next;
			}
			if (left.data != right.data)
				return false;
			left = left.next;
		}
		return true;
	}

	public boolean _02_By_Reversing_Right_Half(LinkedList list) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		Node slow = list.head;
		Node fast = list.head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = reverseLinkedList(slow);
		Node head = list.head;
		while (slow != null) {
			if (slow.data != head.data)
				return false;
			slow = slow.next;
			head = head.next;
		}
		return true;
	}

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList(new Node(1, new Node(2, new Node(3, new Node(2, new Node(1, null))))));
		LinkedList list2 = new LinkedList(new Node(8, new Node(3, new Node(1, new Node(8, null)))));
		LinkedList list3 = new LinkedList(new Node(6, null));

		_11_isPalindromeLinkedList exercise = new _11_isPalindromeLinkedList();
		System.out.println(exercise._01_By_Two_Pointer_technique(list1));
		System.out.println(exercise._01_By_Two_Pointer_technique(list2));
		System.out.println(exercise._01_By_Two_Pointer_technique(list3));
		System.out.println("--------------------------------------------");
		
		System.out.println(exercise._02_By_Reversing_Right_Half(list1));
		System.out.println(exercise._02_By_Reversing_Right_Half(list2));
		System.out.println(exercise._02_By_Reversing_Right_Half(list3));

	}
}
