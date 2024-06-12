package Java.UdemyFifthyCodingChallenges;

import java.util.Arrays;
import java.util.HashMap;

public class _01_Find_Pair {

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 1, -3, 6 };

		System.out.println(_01_BruteForceApproach(arr1, 11));
		System.out.println(_01_BruteForceApproach(arr1, -2));
		System.out.println(_01_BruteForceApproach(arr1, 8));
		System.out.println("------------------------------------");
		System.out.println(_02_By_Sorting_Array(arr1, 11));
		System.out.println(_02_By_Sorting_Array(arr1, -2));
		System.out.println(_02_By_Sorting_Array(arr1, 8));
		System.out.println("------------------------------------");
		System.out.println(_03_Using_HashMap(arr1, 11));
		System.out.println(_03_Using_HashMap(arr1, -2));
		System.out.println(_03_Using_HashMap(arr1, 8));
	}

	private static boolean _01_BruteForceApproach(int[] arr, int k) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k)
					return true;
			}
		}
		return false;
	}

	private static boolean _02_By_Sorting_Array(int[] arr, int k) {
		// Time complexity: O(nlogn)
		// Space complexity: depends on the sorting
		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		while (left < right) {
			if (arr[left] + arr[right] == k)
				return true;
			else if (arr[left] + arr[right] < k)
				left++;
			else
				right--;

		}
		return false;

	}

	private static boolean _03_Using_HashMap(int[] arr, int k) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashMap<Integer, Boolean> present = new HashMap<Integer, Boolean>();
		for (int number : arr) {
			if (present.containsKey(k - number))
				return true;
			else
				present.put(number, true);
		}
		return false;
	}

}
