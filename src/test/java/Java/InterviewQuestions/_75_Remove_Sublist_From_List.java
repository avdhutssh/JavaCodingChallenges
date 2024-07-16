package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _75_Remove_Sublist_From_List {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)); // fromIndex = 2, endIndex = 4
		// Output [1, 2, 5, 6, 7, 8]

		System.out.println("Using Sublist and Clear Method: "+_01_Using_Sublist_And_Clear_Method(list1, 2, 4));

	}

	private static List<Integer> _01_Using_Sublist_And_Clear_Method(List<Integer> list, int start, int end) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		list.subList(start, end).clear();
		return list;
	}

}
