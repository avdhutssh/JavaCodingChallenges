package Java.UdemyFifthyCodingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public class _04_findDuplicate {

	public static void main(String[] args) {
		int[] arr1 = { 4, 2, 1, 3, 1 }; // 1
		int[] arr2 = { 1, 4, 2, 2, 5, 2 }; // 2

		System.out.println(_01_BruteForceApproach(arr1));
		System.out.println(_01_BruteForceApproach(arr2));
		System.out.println("--------------------");

		System.out.println(_02_Using_Sorting(arr1));
		System.out.println(_02_Using_Sorting(arr2));
		System.out.println("--------------------");

		System.out.println(_03_Using_HashSet(arr1));
		System.out.println(_03_Using_HashSet(arr2));
		System.out.println("--------------------");

		System.out.println(_04_Using_HashMap(arr1));
		System.out.println(_04_Using_HashMap(arr2));
		System.out.println("--------------------");

		System.out.println(_05_Using_Floyds_Cycle_Detection(arr1));
		System.out.println(_05_Using_Floyds_Cycle_Detection(arr2));

		int[] nums = { 1, 1, 2, 3, 2, 1, 4, 5, 4 };
		System.out.println(_06_Find_Duplicates_Using_HashMap(nums));
	}

	public static int _01_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					return arr[i];
			}
		}
		return 0;
	}

	public static int _02_Using_Sorting(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: depends on the sorting

		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1])
				return i;
		}
		return 0;
	}

	public static int _03_Using_HashSet(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int number : arr) {
			if (!hs.add(number))
				return number;
		}
		return 0;
	}

	public static int _04_Using_HashMap(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		for (int number : arr) {
			if (hm.containsKey(number))
				return number;
			else
				hm.put(number, true);
		}
		return 0;
	}

	public static int _05_Using_Floyds_Cycle_Detection(int[] arr) { // tortoise and hare
		// Time complexity: O(n)
		// Space complexity: O(1)
		int tortoise = 0, hare = 0;
		do {
			tortoise = arr[tortoise];
			hare = arr[arr[hare]];
		} while (tortoise != hare);
		tortoise = 0;
		while (tortoise != hare) {
			tortoise = arr[tortoise];
			hare = arr[hare];
		}
		return tortoise;
	}

	public static List<Integer> _06_Find_Duplicates_Using_HashMap(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int number : arr) {
			hm.put(number, hm.getOrDefault(number, 0) + 1);
		}
		List<Integer> duplicates = new ArrayList<Integer>();

		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1)
				duplicates.add(entry.getKey());
		}
		return duplicates;
	}
}
