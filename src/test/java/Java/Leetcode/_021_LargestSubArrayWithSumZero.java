package Java.Leetcode;

import java.util.HashMap;

public class _021_LargestSubArrayWithSumZero {

	public static void main(String[] args) {
		System.out.println(maxLen(new int[] { 15, -2, 2, -8, 1, 7, 10, 23 })); // Expected: 5 (from index 1 to 5)
		System.out.println(maxLen(new int[] { 1, 2, 3 })); // Expected: 0 (no subarray with sum 0)
		System.out.println(maxLen(new int[] { 1, -1, 3, -3 })); // Expected: 4 (whole array)
		System.out.println(maxLen(new int[] { 0, 0, 0, 0 })); // Expected: 4 (all elements are 0)
		System.out.println(maxLen(new int[] { 4, -1, -3, -2, 2 })); // Expected: 5 (whole array)
		System.out.println(maxLen(new int[] {})); // Expected: 0 (empty array)
	}

	static int maxLen(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		int sum = 0, len = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0) {
				len = i + 1;
			} else if (hm.containsKey(sum)) {
				len = Math.max(len, i - hm.get(sum));
			} else {
				hm.put(sum, i);
			}
		}
		return len;
	}
}
