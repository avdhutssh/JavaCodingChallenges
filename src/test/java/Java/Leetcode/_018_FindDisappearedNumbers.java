
package Java.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _018_FindDisappearedNumbers {

	public static void main(String[] args) {

		System.out.println(_01_findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 })); // Expected output: [5, 6]
		System.out.println(_01_findDisappearedNumbers(new int[] { 1, 1 })); // Expected output: [2]
		System.out.println(_01_findDisappearedNumbers(new int[] { 1 })); // Expected output: []
		System.out.println(_01_findDisappearedNumbers(new int[] { 1, 2, 3, 4, 5 })); // Expected output: []
		System.out.println(_01_findDisappearedNumbers(new int[] { 1, 2, 4, 5, 6, 7, 7 })); // Expected output: [3]
		System.out.println(_01_findDisappearedNumbers(new int[] {})); // Expected output: []
	}

	static List<Integer> _01_findDisappearedNumbers(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) -1;
			if (nums[index] > 0) {
				nums[index] *= -1;
			}
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				result.add(i + 1);
			}
		}
		return result;
	}
}
