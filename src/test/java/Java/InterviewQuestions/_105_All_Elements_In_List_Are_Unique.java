package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class _105_All_Elements_In_List_Are_Unique {

	public static void main(String... args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5); // true
		List<Integer> list2 = Arrays.asList(1, 2, 4, 5, 2); // false

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(list1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(list2));

		System.out.println("Using Stream: " + _02_Using_Stream(list1));
		System.out.println("Using Stream: " + _02_Using_Stream(list2));

		System.out.println("Using Set: " + _03_Using_Set(list1));
		System.out.println("Using Set: " + _03_Using_Set(list2));

	}

	private static boolean _01_Using_BruteForceApproach(List<Integer> list) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean _02_Using_Stream(List<Integer> list) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		return list.stream().distinct().count() == list.size();
	}

	private static boolean _03_Using_Set(List<Integer> list) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashSet<Integer> hs = new HashSet<>(list);
		return hs.size() == list.size();
	}

}
