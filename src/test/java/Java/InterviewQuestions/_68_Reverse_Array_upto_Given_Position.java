package Java.InterviewQuestions;

import java.util.Arrays;

public class _68_Reverse_Array_upto_Given_Position {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 }; // {5, 4, 3, 2, 1, 6, 7 }
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 }; // {5, 4, 3, 2, 1, 6 }

		System.out.println("Using BFA : " + Arrays.toString(_01_Using_BruteForceApproach(arr1, 5)));
		System.out.println("Using BFA : " + Arrays.toString(_01_Using_BruteForceApproach(arr2, 5)));
	}

	private static int[] _01_Using_BruteForceApproach(int[] arr, int position) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int[] result = new int[arr.length];
		int j = position-1;
		for (int i = 0; i < position; i++) {
			result[i] = arr[j--];
		}
		for(int i = position; i<arr.length;i++) {
			result[i] = arr[i];
		}
		return result;
	}

}
