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

    public boolean _01_By_Two_Pointer_technique(LinkedList list){
        int length = 0;
        Node left = list.head;
        Node temp = list.head;
        while(temp!=null){
            length++;
            temp =temp.next;
        }
        for(int i=0; i<length/2;i++){
            Node right = list.head;
            for(int j =0; j<length-i-1; j++){
                right = right.next;
            }
            if(left.data!=right.data) return false;
            left = left.next;
        }
        return true;
    } 
		
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList(new Node(1, new Node(2, new Node(3, new Node(2, new Node(1, null))))));
		LinkedList list2 = new LinkedList(new Node(8, new Node(3, new Node(1, new Node(8,null)))));
		LinkedList list3 = new LinkedList(new Node(6, null));
		

		_11_isPalindromeLinkedList exercise = new _11_isPalindromeLinkedList();
		System.out.println(exercise._01_By_Two_Pointer_technique(list1));
		System.out.println(exercise._01_By_Two_Pointer_technique(list2));
		System.out.println(exercise._01_By_Two_Pointer_technique(list3));
		System.out.println("--------------------------------------------");

	}
}
