package Java.Leetcode;

import java.util.Arrays;

public class _029_MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]

		int[] nums3 = { 0 };
		int[] nums4 = { 1 };
		merge(nums3, 0, nums4, 1);
		System.out.println(Arrays.toString(nums3)); // [1]

		int[] nums5 = { 1 };
		int[] nums6 = {};
		merge(nums5, 1, nums6, 0);
		System.out.println(Arrays.toString(nums5)); // [1]

		int[] nums7 = { 2, 0 };
		int[] nums8 = { 1 };
		merge(nums7, 1, nums8, 1);
		System.out.println(Arrays.toString(nums7)); // [1, 2]

		int[] nums9 = { 4, 5, 6, 0, 0, 0 };
		int[] nums10 = { 1, 2, 3 };
		merge(nums9, 3, nums10, 3);
		System.out.println(Arrays.toString(nums9)); // [1, 2, 3, 4, 5, 6]
	}

	static void merge(int[] nums1, int m, int[] nums2, int n) {
		// Time Complexity: O(m + n)
		// Space Complexity: O(1)

		int p1 = m - 1;
		int p2 = n - 1;
		for (int i = nums1.length - 1; i >= 0; i--) {
			int valAtP1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
			int valAtP2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;
			if (valAtP1 > valAtP2) {
				nums1[i] = valAtP1;
				p1--;
			} else {
				nums1[i] = valAtP2;
				p2--;
			}
		}
	}
}
