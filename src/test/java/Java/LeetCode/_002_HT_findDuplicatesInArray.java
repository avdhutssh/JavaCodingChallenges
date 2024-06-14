package Java.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _002_HT_findDuplicatesInArray {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 2, 1, 4, 5, 4 };
		System.out.println(_01_BruteForceApproach(nums));
		System.out.println(_02_Using_HashMap(nums));

	}

	static List<Integer> _01_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^2)
		// Loop through the array O(n) and In the worst case, duplicates.contains(i) will be O(n) for each element, resulting in O(n^2)
		// Space complexity: O(n)
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		List<Integer> duplicates = new ArrayList<Integer>();
		for (int i : arr) {
			if (hm.containsKey(i)) {
				if (!duplicates.contains(i)) {
					duplicates.add(i);
				}
			} else {
				hm.put(i, true);
			}
		}
		return duplicates;
	}

	static List<Integer> _02_Using_HashMap(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		List<Integer> duplicates = new ArrayList<Integer>();
		for (int number : arr) {
			hm.put(number, hm.getOrDefault(number, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1)
				duplicates.add(entry.getKey());
		}
		return duplicates;
	}

}
