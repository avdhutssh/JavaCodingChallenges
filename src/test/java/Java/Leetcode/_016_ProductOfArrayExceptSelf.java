package Java.Leetcode;

import java.util.Arrays;

public class _016_ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 5, 6, 2 }; // Output: prod[] = {180, 600, 360, 300, 900}
		System.out.println("Using Prefix and Suffix : " + Arrays.toString(_01_Using_Prefix_Suffix(arr)));
		System.out.println(Arrays.toString(_02_Using_Prefix_Suffix(new int[] { 1, 2, 3, 4 }))); // [24,12,8,6]
		System.out.println(Arrays.toString(_02_Using_Prefix_Suffix(new int[] { 0, 1, 2, 3 }))); // [6,0,0,0]
		System.out.println(Arrays.toString(_02_Using_Prefix_Suffix(new int[] { 2, 3, 0, 4 }))); // [0,0,24,0]
		System.out.println(Arrays.toString(_02_Using_Prefix_Suffix(new int[] { 5 }))); // [1]
		System.out.println(Arrays.toString(_02_Using_Prefix_Suffix(new int[] { 0, 0 }))); // [0,0]

	}

	private static int[] _01_Using_Prefix_Suffix(int[] arr) {
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

	private static int[] _02_Using_Prefix_Suffix(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		int len = arr.length;
		int[] prefixProduct = new int[len];

		prefixProduct[0] = 1;
		for (int i = 1; i < len; i++) {
			prefixProduct[i] = arr[i - 1] * prefixProduct[i - 1];
		}

		int suffixProduct = 1;
		for (int i = len - 1; i >= 0; i--) {
			prefixProduct[i] = suffixProduct * prefixProduct[i];
			suffixProduct *= arr[i];
		}

		return prefixProduct;
	}

}
