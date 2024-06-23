package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.checkerframework.checker.units.qual.K;

public class _012_duplicateElementsArray {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2 }; // 2 10 11

		System.out.println(_01_UsingBruteForceApproach(arr));
		System.out.println("---------------------------------");
		System.out.println(_02_Using_HashMap(arr));
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

	private static List<Integer> _02_Using_HashMap(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		List<Integer> duplicates = new ArrayList<>();
		for (int num : arr) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		for (int key : hm.keySet()) {
			if (hm.get(key) > 1) {
				duplicates.add(key);
			}
		}
		return duplicates;
	}
}
