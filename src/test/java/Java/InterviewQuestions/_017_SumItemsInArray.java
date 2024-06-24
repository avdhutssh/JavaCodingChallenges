package Java.InterviewQuestions;

import java.util.Arrays;

public class _017_SumItemsInArray {

	public static void main(String[] args) {
		int[] arr = { 15, 12, 13, 10 }; // 50

		System.out.println(_01_Using_For_loop(arr));
		System.out.println(_02_Using_While_loop(arr));
		System.out.println(_03_Using_Streams(arr));
		System.out.println(_04_Using_Recursion(arr));

	}

	private static int _01_Using_For_loop(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}

	private static int _02_Using_While_loop(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int sum = 0;
		int i = 0;
		while (i < arr.length) {
			sum += arr[i];
			i++;
		}
		return sum;
	}

	private static int _03_Using_Streams(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		return Arrays.stream(arr).sum();
	}

	private static int _04_Using_Recursion(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		return recursiveSum(arr, arr.length - 1);
	}

	private static int recursiveSum(int[] arr, int index) {
		if (index < 0) {
			return 0;
		}
		return arr[index] + recursiveSum(arr, index - 1);
	}
}
