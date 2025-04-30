package Java.Leetcode;

import java.util.Arrays;

public class _024_TwoSum_II_InputArrayIsSorted {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9))); // Expected: [1, 2]
		System.out.println(Arrays.toString(twoSum(new int[] { 1, 2, 3, 4, 4, 9, 56, 90 }, 8))); // Expected: [4, 5]
		System.out.println(Arrays.toString(twoSum(new int[] { 1, 3, 4, 5, 7, 10, 11 }, 9))); // Expected: [3, 5]
		System.out.println(Arrays.toString(twoSum(new int[] { 1, 2 }, 3))); // Expected: [1, 2]
		System.out.println(Arrays.toString(twoSum(new int[] { 5, 25, 75 }, 100))); // Expected: [2, 3]
	}

	static int[] twoSum(int[] numbers, int target) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sumCurrPair = numbers[left] + numbers[right];
			if (sumCurrPair == target) {
				break;
			} else if (sumCurrPair < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[] { left + 1, right + 1 };

	}

}
