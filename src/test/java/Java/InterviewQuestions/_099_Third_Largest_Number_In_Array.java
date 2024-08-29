package Java.InterviewQuestions;

import java.util.Arrays;

public class _099_Third_Largest_Number_In_Array {

	public static void main(String[] args) {
		int[] arr1 = { 2, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 10
		int[] arr2 = { 2, 100, 10, 50, 300 }; // 50
		int[] arr3 = { 2, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 10
		int[] arr4 = { 2, 100, 10, 50, 300 }; // 50

		System.out.println("Using Linear Scan: " + _01_Using_Linear_Scan(arr1));
		System.out.println("Using Linear Scan: " + _01_Using_Linear_Scan(arr2));

		System.out.println("By Sorting the Array: " + _02_By_Sorting_Array(arr1));
		System.out.println("By Sorting the Array: " + _02_By_Sorting_Array(arr2));
	}

	private static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must contains atleast 3 elements");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				thirdLargest = secondLargest;
				secondLargest = num;
			}
		}
		return thirdLargest;
	}

	private static int _02_By_Sorting_Array(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(1)
		Arrays.sort(arr);
		int uniqueCount = 0;
		int thirdLargest = 0;
		// [2, 2, 2, 2, 10, 10, 11, 11, 100, 100]

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i - 1] != arr[i]) {
				uniqueCount++;
				thirdLargest=arr[i];
			}
			if (uniqueCount == 3) {
				return thirdLargest;
			}
		}
		throw new IllegalArgumentException("No Second Largest element");

	}
}
