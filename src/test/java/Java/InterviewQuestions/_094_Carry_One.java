package Java.InterviewQuestions;

import java.util.Arrays;

public class _094_Carry_One {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 }; // [1, 2, 3, 5]
		int[] arr2 = { 1, 2, 9, 9 }; // [1, 3, 0, 0]
		int[] arr3 = { 9, 9, 9, 9 }; // [1, 0, 0, 0, 0]

		System.out.println("Using BFA: " + Arrays.toString(_01_Using_BruteForceApproach(arr1)));
		System.out.println("Using BFA: " + Arrays.toString(_01_Using_BruteForceApproach(arr2)));
		System.out.println("Using BFA: " + Arrays.toString(_01_Using_BruteForceApproach(arr3)));

	}

	static int[] _01_Using_BruteForceApproach(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int carry = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			int sum = arr[i] + carry;
			arr[i] = sum % 10;
			carry = sum / 10;
		}
		if (carry > 0) {
			int[] result = new int[arr.length + 1];
			result[0] = carry;
			System.arraycopy(arr, 0, result, 1, arr.length);
			return result;
		}
		return arr;
	}
}
