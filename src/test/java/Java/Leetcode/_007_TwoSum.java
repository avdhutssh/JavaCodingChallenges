package Java.Leetcode;

import java.util.HashMap;
import java.util.Arrays;

public class _007_TwoSum {

	public static void main(String[] args) {
		int[] arr1 = { 2, 7, 11, 15 };
		int[] arr2 = { 3, 2, 4 };
		int[] arr3 = { 3, 3 };
		int[] arr4 = { 1, 5, 1, 5 };
		int[] arr5 = { 1, 2, 3, 4, 5, 6 };
		int[] arr6 = { 1, 1, 1, 1 };
		int[] arr7 = { -3, 4, 3, 90 };
		int[] arr8 = { -1, -2, -3, -4, -5 };

		System.out.println(Arrays.toString(_01_twoSum(arr1, 9))); // [0,1]
		System.out.println(Arrays.toString(_01_twoSum(arr2, 6))); // [1,2]
		System.out.println(Arrays.toString(_01_twoSum(arr3, 6))); // [0,1]
		System.out.println(Arrays.toString(_01_twoSum(arr4, 10))); // [1,3]
		System.out.println(Arrays.toString(_01_twoSum(arr5, 11))); // [4,5]
		System.out.println(Arrays.toString(_01_twoSum(arr6, 2))); // [0,1]
		System.out.println(Arrays.toString(_01_twoSum(arr7, 0))); // [0,2]
		System.out.println(Arrays.toString(_01_twoSum(arr8, -8))); // [2,4]
	}

	public static int[] _01_twoSum(int[] nums, int target) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (hm.containsKey(complement)) {
				return new int[] { hm.get(complement), i };
			} else {
				hm.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
