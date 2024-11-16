package Java.InterviewQuestions;

import java.util.Arrays;

public class _124_Sort_Array_Of_0s_1s_2s {

	public static void main(String[] args) {

		int[] arr1 = { 2, 0, 0, 1, 0, 2, 1 }; // [0, 0, 0, 1, 1, 2, 2]
		int[] arr2 = { 0, 1, 0, 2, 1, 1, 0, 2, 2, 0, 1 }; // [0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2]

		System.out.println(Arrays.toString(_01_UsingBruteForceApproach(arr1)));
		System.out.println(Arrays.toString(_01_UsingBruteForceApproach(arr2)));

		int[] arr3 = { 2, 0, 0, 1, 0, 2, 1 }; // [0, 0, 0, 1, 1, 2, 2]
		int[] arr4 = { 0, 1, 0, 2, 1, 1, 0, 2, 2, 0, 1 }; // [0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2]

		System.out.println(Arrays.toString(_02_Using_Three_Way_Partitioning(arr3)));
		System.out.println(Arrays.toString(_02_Using_Three_Way_Partitioning(arr4)));

	}

	private static int[] _01_UsingBruteForceApproach(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		System.out.print("Using BFA: ");

		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;
		int index = 0;
		for (int num : arr) {
			if (num == 0) {
				countZero++;
			} else if (num == 1) {
				countOne++;
			} else {
				countTwo++;
			}
		}
		while (index < countZero) {
			arr[index++] = 0;
		}
		while (index < countZero + countOne) {
			arr[index++] = 1;
		}
		while (index < countZero + countOne + countTwo) {
			arr[index++] = 2;
		}
		return arr;

	}

	public static int[] _02_Using_Three_Way_Partitioning(int[] arr) { // Dutch National Flag Algorithm
		// Time complexity: O(n)
		// Space complexity: O(1)
		System.out.print("Using Three Way Partitioning: ");
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swapArr(arr, mid, low);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swapArr(arr, high, mid);
				high--;
			}
		}
		return arr;
	}

	private static void swapArr(int[] arr, int mid, int low) {
		int temp = arr[mid];
		arr[mid] = arr[low];
		arr[low] = temp;

	}
}
