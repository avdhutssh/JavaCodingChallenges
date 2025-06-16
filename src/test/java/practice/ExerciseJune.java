package practice;

import java.util.stream.IntStream;

public class ExerciseJune {

	public static void main(String[] args) {

		System.out.println(_01_multiply(5, 10));

	}

	private static int _01_multiply(int num1, int num2) {
		// Time complexity: O(num2)
		// Space complexity: O(1)
		return IntStream.generate(() -> num1).limit(num2).sum();
	}

}
