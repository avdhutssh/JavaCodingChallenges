package Java.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _019_FindDuplicates {

	public static void main(String[] args) {
		System.out.println(_01_findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 })); // [2, 3]
		System.out.println(_01_findDuplicates(new int[] { 1, 1, 2 })); // [1]
		System.out.println(_01_findDuplicates(new int[] { 1 })); // []
		System.out.println(_01_findDuplicates(new int[] { 2, 2, 2, 2 })); // [2]
		System.out.println(_01_findDuplicates(new int[] { 3, 3, 3, 3, 4, 5, 6 })); // [3]
		System.out.println(_01_findDuplicates(new int[] {})); // []
	}

	static List<Integer> _01_findDuplicates(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int n = Math.abs(nums[i]);
			if (nums[n - 1] < 0) {
				list.add(n);
			} else {
				nums[n - 1] = -nums[n - 1];
			}
		}
		return list;
	}
}
