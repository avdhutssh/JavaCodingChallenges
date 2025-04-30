package Java.Leetcode;

public class _027_SortColors {

	public static void main(String[] args) {
		int[] arr1 = { 2, 0, 2, 1, 1, 0 };
		sortColors(arr1);
		printArray(arr1); // Expected: [0, 0, 1, 1, 2, 2]

		int[] arr2 = { 2, 0, 1 };
		sortColors(arr2);
		printArray(arr2); // Expected: [0, 1, 2]

		int[] arr3 = { 0 };
		sortColors(arr3);
		printArray(arr3); // Expected: [0]

		int[] arr4 = { 1, 1, 1 };
		sortColors(arr4);
		printArray(arr4); // Expected: [1, 1, 1]

		int[] arr5 = { 2, 2, 2, 0, 0, 0 };
		sortColors(arr5);
		printArray(arr5); // Expected: [0, 0, 0, 2, 2, 2]

		int[] arr6 = {};
		sortColors(arr6);
		printArray(arr6); // Expected: []
	}

	static void sortColors(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int left = 0, mid = 0, right = nums.length - 1;
		while (mid <= right) {
			if (nums[mid] == 0) {
				swap(left, mid, nums);
				mid++;
				left++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(mid, right, nums);
				right--;
			}
		}
	}

	static void swap(int start, int end, int[] arr) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
