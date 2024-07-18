package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _77_Combine_Two_List {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

		System.out.println(_01_Using_AddAll_Method(list1, list2));
	}

	private static List<Integer> _01_Using_AddAll_Method(List<Integer> list1, List<Integer> list2) {
		// Time Complexity: O(n+m)
		// Space Complexity: O(n+m)
		List<Integer> combineList = new ArrayList<>();
		combineList.addAll(list1);
		combineList.addAll(list2);
		return combineList;
	}

}
