package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _077_Combine_Two_List {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
		

		System.out.println(_01_Using_AddAll_Method(list1, list2));
		System.out.println(_02_Using_Stream(list1, list2));
	}

	private static List<Integer> _01_Using_AddAll_Method(List<Integer> list1, List<Integer> list2) {
		// Time Complexity: O(n+m)
		// Space Complexity: O(n+m)
		List<Integer> combineList = new ArrayList<>();
		combineList.addAll(list1);
		combineList.addAll(list2);
		return combineList;
	}

	private static List<Integer> _02_Using_Stream(List<Integer> list1, List<Integer> list2) {
		// Time Complexity: O(n+m)
		// Space Complexity: O(n+m)
		return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
	}

}
