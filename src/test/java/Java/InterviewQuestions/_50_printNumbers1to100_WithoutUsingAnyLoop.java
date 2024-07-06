package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _50_printNumbers1to100_WithoutUsingAnyLoop {

	public static void main(String[] args) {

		_01_Using_Recursion(1);
		System.out.println("\n"
				+ "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		_02_Using_Stream();
		System.out.println("\n"
				+ "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		_03_Using_Array();
		System.out.println("\n"
				+ "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

	private static void _01_Using_Recursion(int n) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		if (n <= 100) {
			System.out.print(n + " ");
			_01_Using_Recursion(n + 1);
		}
	}

	private static void _02_Using_Stream() {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		IntStream.rangeClosed(1, 100).forEach(n -> System.out.print(n + " "));
	}

	private static void _03_Using_Array() {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int[] numbers = new int[100];
		Arrays.setAll(numbers, i -> i + 1);
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
	}
}
