package Java.InterviewQuestions;

import java.util.Arrays;

public class _128_RotateArrayTo_N_Position {

	public static void main(String[] args) {
		int[] arr1 = { 4, 1, 8, 3, 6, 5 };
		System.out.println(Arrays.toString(_01_UsingBruteForceApproach(arr1, 2))); // {8,3,6,5,4,1}
		System.out.println(Arrays.toString(_01_UsingBruteForceApproach(arr1, 5))); // {5,4,1,8,3,6}
		System.out.println(Arrays.toString(_01_UsingBruteForceApproach(arr1, 6))); // {4,1,8,3,6,5}
		System.out.println(Arrays.toString(_01_UsingBruteForceApproach(arr1, 7))); // null

		System.out.println(Arrays.toString(_02_UsingInPlaceApproach(new int[] { 4, 1, 8, 3, 6, 5 }, 2))); // {8,3,6,5,4,1}
		System.out.println(Arrays.toString(_02_UsingInPlaceApproach(new int[] { 4, 1, 8, 3, 6, 5 }, 5))); // {5,4,1,8,3,6}
		System.out.println(Arrays.toString(_02_UsingInPlaceApproach(new int[] { 4, 1, 8, 3, 6, 5 }, 6))); // {4,1,8,3,6,5}
		System.out.println(Arrays.toString(_02_UsingInPlaceApproach(new int[] { 4, 1, 8, 3, 6, 5 }, 7))); // null
	}

	private static int[] _01_UsingBruteForceApproach(int[] arr, int position) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		if (position > arr.length)
			return null;
		int[] rotated = new int[arr.length];
		int index = 0;
		for (int i = position; i < rotated.length; i++) {
			rotated[index++] = arr[i];
		}
		for (int i = 0; i < position; i++) {
			rotated[index++] = arr[i];
		}
		return rotated;
	}

	private static int[] _02_UsingInPlaceApproach(int[] arr, int position) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		if (position > arr.length)
			return null;
		position = position % arr.length;
		if (position == 0)
			return arr;

		reverse(arr, 0, position - 1);
		reverse(arr, position, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
		return arr;

	}

	private static void reverse(int[] arr, int start, int end) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
