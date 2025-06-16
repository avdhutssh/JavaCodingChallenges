package practice;

import java.util.HashSet;
import java.util.stream.IntStream;

public class ExerciseJune {

	public static void main(String[] args) {

		System.out.println(_01_multiply(5, 10));

		System.out.println("-----------------------------------------");

		int[] maxDiffArr = { 1, 4, 8, 15, 17, 27 };
		System.out.println(_02_MaxDiffBetweenAdjacentElementsInArr(maxDiffArr)); // 10

		System.out.println("-----------------------------------------");

		int[] a = { 1, 4, 5, 7 };
		int[] b = { 6, 4, 3, 7 };
		_03_compareArrayAndFindCommon(a, b); // 4 7

		System.out.println("\n-----------------------------------------");

		System.out.println(_04_factorial(5)); // 120

		System.out.println("-----------------------------------------");
	}

	private static int _01_multiply(int num1, int num2) {
		// Time complexity: O(num2)
		// Space complexity: O(1)

		return IntStream.generate(() -> num1).limit(num2).sum();
	}

	private static int _02_MaxDiffBetweenAdjacentElementsInArr(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)

		int maxDiff = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			maxDiff = Math.max(maxDiff, arr[i + 1] - arr[i]);
		}

		return maxDiff;
	}

	private static void _03_compareArrayAndFindCommon(int[] a, int[] b) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int num : a) {
			hs.add(num);
		}
		for (int num : b) {
			if (!hs.add(num)) {
				System.out.print(num + " ");
			}
		}

	}

	private static int _04_factorial(int num) {
		// Time complexity: O(num)
		// Space complexity: O(1)

		int k = 1, factorial = 1;
		while (k <= num) {
			factorial *= k;
			k++;
		}
		return factorial;
	}
}
