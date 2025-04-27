package Java.Leetcode;

import java.util.Arrays;

public class _008_MoveZeroes {

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 0, 3, 12 };
		int[] arr2 = { 0, 0, 0, 0, 1 };
		int[] arr3 = { 1, 2, 3, 4 };
		int[] arr4 = { 0, 0, 0, 0 };
		int[] arr5 = { 1, 0, 0, 2, 3 };
		int[] arr6 = { 1 };
		int[] arr7 = { 0 };
		int[] arr8 = { 1, 2, 0, 0, 3, 0, 4, 5 };

		_01_moveZeroes(arr1);
		_01_moveZeroes(arr2);
		_01_moveZeroes(arr3);
		_01_moveZeroes(arr4);
		_01_moveZeroes(arr5);
		_01_moveZeroes(arr6);
		_01_moveZeroes(arr7);
		_01_moveZeroes(arr8);

		System.out.println(Arrays.toString(arr1)); // [1,3,12,0,0]
		System.out.println(Arrays.toString(arr2)); // [1,0,0,0,0]
		System.out.println(Arrays.toString(arr3)); // [1,2,3,4]
		System.out.println(Arrays.toString(arr4)); // [0,0,0,0]
		System.out.println(Arrays.toString(arr5)); // [1,2,3,0,0]
		System.out.println(Arrays.toString(arr6)); // [1]
		System.out.println(Arrays.toString(arr7)); // [0]
		System.out.println(Arrays.toString(arr8)); // [1,2,3,4,5,0,0,0]
	}

	public static void _01_moveZeroes(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int index = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[index++] = num;
			}
		}
		while (index < nums.length) {
			nums[index++] = 0;
		}
	}
}
