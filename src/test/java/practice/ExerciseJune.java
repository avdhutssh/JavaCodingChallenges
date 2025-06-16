package practice;

import java.util.stream.IntStream;

public class ExerciseJune {

	public static void main(String[] args) {

		System.out.println(_01_multiply(5, 10));

		System.out.println("-----------------------------------------");

		int[] maxDiffArr = { 1, 4, 8, 15, 17,27 };
		System.out.println(_02_MaxDiffBetweenAdjacentElementsInArr(maxDiffArr)); // 7

	}

	private static int _01_multiply(int num1, int num2) {
		// Time complexity: O(num2)
		// Space complexity: O(1)
		return IntStream.generate(() -> num1).limit(num2).sum();
	}

	private static int _02_MaxDiffBetweenAdjacentElementsInArr(int[] arr) {

		int maxDiff = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			maxDiff = Math.max(maxDiff, arr[i + 1] - arr[i]);
		}

		return maxDiff;
	}

}
