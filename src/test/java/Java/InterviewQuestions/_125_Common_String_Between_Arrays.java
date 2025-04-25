package Java.InterviewQuestions;

import java.util.HashSet;

public class _125_Common_String_Between_Arrays {

	public static void main(String[] args) {
		String[] a1 = { "apple", "banana", "single", "Laxmi", "Raghu" };
		String[] a2 = { "june", "july", "apple", "april", "Laxmi" };
		// ["apple", "Laxmi"]

		System.out.println(_01_Using_HashSet(a1, a2));

	}

	private static HashSet<String> _01_Using_HashSet(String[] arr1, String[] arr2) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashSet<String> uniqueStr = new HashSet<>();
		HashSet<String> commonStr = new HashSet<>();

		for (String str : arr1) {
			uniqueStr.add(str);
		}

		for (String str : arr2) {
			if (!uniqueStr.add(str)) {
				commonStr.add(str);
			}
		}
		return commonStr;
	}

}
