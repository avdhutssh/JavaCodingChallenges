package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class _75_Remove_Sublist_From_List {

	public static void main(String[] args) {
		// Remove all the elements in the sublist whose index is between fromIndex,
		// inclusive, and toIndex, exclusive

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		List<Integer> list2 = new CustomArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		List<Integer> list3 = new CustomArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		List<Integer> list4 = new CustomArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		// fromIndex = 2, endIndex = 4 , Output [1, 2, 5, 6, 7, 8]

		System.out.println("Using Sublist and Clear Method: " + _01_Using_Sublist_And_Clear_Method(list1, 2, 4));
		System.out.println("Using Remove Range Method: " + _02_Using_RemoveRange_Method(list2, 2, 4));
		System.out.println("Using Linked List: " + _03_Using_LinkedList(list3, 2, 4));
		System.out.println("Using Iteration: " + _04_Using_Iteration(list4, 2, 4));
	}

	private static List<Integer> _01_Using_Sublist_And_Clear_Method(List<Integer> list, int start, int end) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		list.subList(start, end).clear();
		return list;
	}

	private static List<Integer> _02_Using_RemoveRange_Method(List<Integer> list, int start, int end) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		CustomArrayList<Integer> customList = (CustomArrayList<Integer>) list;
		customList.removeRange(start, end);
		return customList;
	}

	static class CustomArrayList<E> extends ArrayList<E> {
		public CustomArrayList() {
			super();
		}

		public CustomArrayList(List<E> list) {
			super(list);
		}

		@Override
		protected void removeRange(int fromIndex, int toIndex) {
			super.removeRange(fromIndex, toIndex);
		}
	}

	private static List<Integer> _03_Using_LinkedList(List<Integer> list, int start, int end) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		LinkedList<Integer> ll = new LinkedList<Integer>(list);
		int count = end - start;
		for (int i = 0; i < count; i++) {
			ll.remove(start);
		}
		return ll;
	}

	private static List<Integer> _04_Using_Iteration(List<Integer> list, int start, int end) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		for (int i = start; i < end; i++) {
			list.remove(start);
		}
		return list;
	}
}
