package Java.InterviewQuestions;

public class _80_Factorial_OF_Number {

	public static void main(String[] args) {

		int num = 5; // 120
		System.out.println("Using Recursion: " + _01_Using_Recursion(num));

	}

	private static int _01_Using_Recursion(int num) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		if (num == 1) {
			return 1;
		}
		return num * _01_Using_Recursion(num - 1);
	}

}
