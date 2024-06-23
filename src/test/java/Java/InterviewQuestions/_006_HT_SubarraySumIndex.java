package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _006_HT_SubarraySumIndex {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 5 }, nums2 = { -1, 2, 3, -4, 5 }, nums3 = { 2, 3, 4, 5, 6 }, nums4 = {};
		int target1 = 9, target2 = 0, target3 = 3, target4 = 0;
		Arrays.stream(_01_BruteForceApproach(nums1, target1)).forEach(value -> System.out.print(value + " ")); // [1, 3]
		System.out.println();
		Arrays.stream(_01_BruteForceApproach(nums2, target2)).forEach(value -> System.out.print(value + " ")); // [0, 3]
		System.out.println();
		Arrays.stream(_01_BruteForceApproach(nums3, target3)).forEach(value -> System.out.print(value + " ")); // [1, 1]
		System.out.println();
		Arrays.stream(_01_BruteForceApproach(nums4, target4)).forEach(value -> System.out.print(value + " ")); // []
		System.out.println("-----------------------------------------------------");

		Arrays.stream(_02_Using_HashMap(nums1, target1)).forEach(value -> System.out.print(value + " ")); // [1, 3]
		System.out.println();
		Arrays.stream(_02_Using_HashMap(nums2, target2)).forEach(value -> System.out.print(value + " ")); // [0, 3]
		System.out.println();
		Arrays.stream(_02_Using_HashMap(nums3, target3)).forEach(value -> System.out.print(value + " ")); // [1, 1]
		System.out.println();
		Arrays.stream(_02_Using_HashMap(nums4, target4)).forEach(value -> System.out.print(value + " ")); // []
	}

	private static int[] _01_BruteForceApproach(int[] nums, int target) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum == target)
					return new int[] { i, j };
			}
		}
		return new int[] {};
	}

	static int[] _02_Using_HashMap(int[] arr, int target) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0;
		hm.put(0, -1);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (hm.containsKey(sum - target)) {
				return new int[] { hm.get(sum - target) + 1, i };
			}
			hm.put(sum, i);
		}
		return new int[] {};

	}
}
