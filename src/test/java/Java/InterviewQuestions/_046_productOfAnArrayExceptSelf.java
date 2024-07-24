package Java.InterviewQuestions;

import java.util.Arrays;

public class _046_productOfAnArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 5, 6, 2 }; // Output: prod[] = {180, 600, 360, 300, 900}

		System.out.println("Using BFA : " + Arrays.toString(_01_Using_Brute_Force_Approach(arr)));
		System.out.println("Using Prefix and Suffix : " + Arrays.toString(_02_Using_Prefix_Suffix(arr)));

	}

	private static int[] _01_Using_Brute_Force_Approach(int[] arr) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		int[] prod = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int product = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					product *= arr[j];

				}
			}
			prod[i] = product;
		}
		return prod;
	}

	private static int[] _02_Using_Prefix_Suffix(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int len = arr.length;
		int[] left = new int[len];
		int[] right = new int[len];
		int[] prod = new int[len];

		left[0] = 1;
		for (int i = 1; i < len; i++) {
			left[i] = arr[i - 1] * left[i - 1];
		}
		
		right[len - 1] = 1;
		for (int i = len - 2; i >= 0; i--) {
			right[i] = arr[i + 1] * right[i + 1];
		}
	
		for (int i = 0; i < len; i++) {
			prod[i] = left[i] * right[i];
		}

		return prod;

	}

}
