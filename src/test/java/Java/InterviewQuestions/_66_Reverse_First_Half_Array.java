package Java.InterviewQuestions;

import java.util.Arrays;

public class _66_Reverse_First_Half_Array {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 }; // {3,2,1,4,5,6,7}
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 }; // {3,2,1,4,5,6}
		System.out.println(Arrays.toString(_01_Using_BruteForceApproach(arr1)));
		System.out.println(Arrays.toString(_01_Using_BruteForceApproach(arr2)));

	}

	private static int[] _01_Using_BruteForceApproach(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int[] result = new int[arr.length];
		int mid = arr.length / 2;
		int j = 0;
		for (int i = mid-1; i >= 0; i--) {
			result[j++] = arr[i];

		}
		for (int i = mid; i < arr.length; i++) {
			result[i] = arr[i];
		}
		return result;
	}

}
