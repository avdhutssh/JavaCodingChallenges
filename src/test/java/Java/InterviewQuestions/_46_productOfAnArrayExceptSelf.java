package Java.InterviewQuestions;

import java.util.Arrays;

public class _46_productOfAnArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 5, 6, 2 }; // Output: prod[] = {180, 600, 360, 300, 900}

		System.out.println("Using BFA : " + Arrays.toString(_01_Using_Brute_Force_Approach(arr)));

	}

	private static int[] _01_Using_Brute_Force_Approach(int[] arr) {

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

}
