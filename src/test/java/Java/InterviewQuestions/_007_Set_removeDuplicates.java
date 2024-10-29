package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _007_Set_removeDuplicates {

	public static void main(String[] args) {
		List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(_01_Using_SetBasedFiltering(myList));
		System.out.println(_02_Using_SetBasedFilteringWithDirectConversion(myList));
	}

	static List<Integer> _01_Using_SetBasedFiltering(List<Integer> elements) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Set<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < elements.size(); i++) {
			hs.add(elements.get(i));
		}
		return new ArrayList<Integer>(hs);
	}

	static List<Integer> _02_Using_SetBasedFilteringWithDirectConversion(List<Integer> elements) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Set<Integer> hs = new HashSet<Integer>(elements);
		return new ArrayList<Integer>(hs);
	}
}
