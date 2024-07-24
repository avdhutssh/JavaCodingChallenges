package Java.InterviewQuestions;

import java.util.Arrays;

public class _072_Merge_Two_Arrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 }, arr2 = { 2, 4, 6, 8 }; // [1, 3, 5, 7, 2, 4, 6, 8]

		System.out.println("Using Simple Iteration: " + Arrays.toString(_01_Using_Simple_Iteration(arr1, arr2)));
		System.out.println("Using Array Copy: " + Arrays.toString(_02_Using_Array_Copy(arr1, arr2)));
	}

	private static int[] _01_Using_Simple_Iteration(int[] arr1, int[] arr2) {
		// Time Complexity: O(n+m)
		// Space Complexity: O(n+m)
		int[] resultArr = new int[arr1.length + arr2.length];
		int i = 0;
		for (int num : arr1) {
			resultArr[i++] = num;
		}
		for (int num : arr2) {
			resultArr[i++] = num;
		}
		return resultArr;
	}

	private static int[] _02_Using_Array_Copy(int[] arr1, int[] arr2) {
		// Time Complexity: O(n+m)
		// Space Complexity: O(n+m)
		int[] resultArr = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, resultArr, 0, arr1.length);
		System.arraycopy(arr2, 0, resultArr, arr1.length, arr2.length);

		return resultArr;
	}
}
