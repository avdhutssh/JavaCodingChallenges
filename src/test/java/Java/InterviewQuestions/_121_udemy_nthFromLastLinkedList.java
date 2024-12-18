package Java.InterviewQuestions;

public class _121_udemy_nthFromLastLinkedList {

	static class Node {
		int value;
		Node child;

		Node(int value, Node child) {
			this.value = value;
			this.child = child;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static void main(String[] args) {
			Node current = new Node(1, null);
			for (int i = 2; i < 8; i++) {
				current = new Node(i, current);
			}
			Node head = current;
			// head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)

			Node current2 = new Node(4, null);
			for (int i = 3; i > 0; i--) {
				current2 = new Node(i, current2);
			}
			Node head2 = current2;
			// head2 = 1 -> 2 -> 3 -> 4 -> (null)

			System.out.println(nthFromLast(head, 1)); // should return 1.
			System.out.println(nthFromLast(head, 5)); // should return 5.
			System.out.println(nthFromLast(head2, 2)); // should return 3.
			System.out.println(nthFromLast(head2, 4)); // should return 1.
			System.out.println(nthFromLast(head2, 5)); // should return null.
			System.out.println(nthFromLast(null, 1)); // should return null.

			System.out.println("--------------------------------------------");

			System.out.println(nthFromLast_UsingTwoPassApproach(head, 1)); // should return 1.
			System.out.println(nthFromLast_UsingTwoPassApproach(head, 5)); // should return 5.
			System.out.println(nthFromLast_UsingTwoPassApproach(head2, 2)); // should return 3.
			System.out.println(nthFromLast_UsingTwoPassApproach(head2, 4)); // should return 1.
			System.out.println(nthFromLast_UsingTwoPassApproach(head2, 5)); // should return null.
			System.out.println(nthFromLast_UsingTwoPassApproach(null, 1)); // should return null.
		}
	}

	public static Node nthFromLast(Node head, int n) {
		// Time complexity: O(L) -> L = length of linked list
		// Space complexity: O(1)
		Node left = head;
		Node right = head;

		for (int i = 0; i < n; i++) {
			if (right == null)
				return null;
			right = right.child;
		}

		while (right != null) {
			left = left.child;
			right = right.child;
		}
		return left;

	}

	public static Node nthFromLast_UsingTwoPassApproach(Node head, int n) {
		// Time complexity: O(L)
		// Space complexity: O(1)
		Node current = head;
		int length = 0;
		
		while (current != null) {
			length++;
			current = current.child;
		}

		if (n > length)
			return null;

		int targetIndex = length - n;
		current = head;
		for (int i = 0; i < targetIndex; i++) {
			current = current.child;
		}

		return current;

	}

	public static String linkedListToString(Node head) {
		Node current = head;
		StringBuilder sb = new StringBuilder();
		while (current != null) {
			sb.append(String.valueOf(current.value));
			sb.append(" -> ");
			current = current.child;
		}
		sb.append("(null)");
		return sb.toString();
	}
}
