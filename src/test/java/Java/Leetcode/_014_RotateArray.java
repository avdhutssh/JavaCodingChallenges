package Java.Leetcode;

import java.util.Arrays;

public class _014_RotateArray {

	public static void main(String[] args) {

		rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3); // Output: [5,6,7,1,2,3,4]
		rotate(new int[] { -1, -100, 3, 99 }, 2); // Output: [3,99,-1,-100]
		rotate(new int[] { 1 }, 0); // Output: [1] (no rotation)
		rotate(new int[] { 1, 2 }, 2); // Output: [1,2] (rotation by length)
		rotate(new int[] { 1, 2 }, 5); // Output: [2,1] (rotation by > length)
		rotate(new int[] {}, 1); // Output: []
	}

	public static void rotate(int[] nums, int k) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		if (nums == null || nums.length <= 1)
			return;

		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}
}
