package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class _012_duplicateElementsArray {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2 }; // 2 10 11

		System.out.println(_01_UsingBruteForceApproach(arr));
	}

	private static List<Integer> _01_UsingBruteForceApproach(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(n)
		List<Integer> duplicates = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (!duplicates.contains(arr[i])) {
						duplicates.add(arr[i]);
					}
				}
			}
		}
		return duplicates;
	}
}
