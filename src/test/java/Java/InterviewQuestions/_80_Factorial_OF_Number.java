package Java.InterviewQuestions;

import java.util.stream.IntStream;

public class _80_Factorial_OF_Number {

	public static void main(String[] args) {

		int num = 5; // 120

		System.out.println("Using Recursion: " + _01_Using_Recursion(num));
		System.out.println("Using While Loop: " + _02_Using_While_Loop_Iteration(num));
		System.out.println("Using For Loop: " + _03_Using_For_Loop_Iteration(num));
		System.out.println("Using Stream: " + _04_Using_Stream(num));
	}

	private static int _01_Using_Recursion(int num) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		if (num == 1) {
			return 1;
		}
		return num * _01_Using_Recursion(num - 1);
	}

	private static int _02_Using_While_Loop_Iteration(int num) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int factorial = 1;
		while (num != 0) {
			factorial *= num;
			num -= 1;
		}
		return factorial;
	}

	private static int _03_Using_For_Loop_Iteration(int num) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
//		int factorial = 1;
//		for (int i = 1; i <= num; i++) {
//			factorial *= i;
//		}
		for (int i = num - 1; i >= 1; i--) {
			num *= i;
		}
		return num;
	}

	private static int _04_Using_Stream(int num) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		return IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
	}
}
