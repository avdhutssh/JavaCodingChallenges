package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Iterator;

public class _52_shiftAllZerosOnLeft {

	public static void main(String[] args) {
		int[] arr1 = { 1, 0, 2, 0, 3, 0, 0, 0 }; // 0, 0, 0, 0, 0, 1, 2, 3
		

		System.out.println("Using Brute Force Approach: " + Arrays.toString(_01_Using_BruteForceApproach(arr1)));

	}

	private static int[] _01_Using_BruteForceApproach(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int index = arr.length;
		int[] result = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				result[index--] = arr[i];
			}
		}
		return result;
	}

}
