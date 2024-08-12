package Java.InterviewQuestions;

public class _089_FizzBuzz {

	public static void main(String[] args) {
		// iber/ 3 print Fizz iber/ 5 print Buzz iber/ both 3 and 5 print FizzBuzz

		int num1 = 15; // 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz

		_01_Using_BruteForceApproach(num1);

	}

	private static void _01_Using_BruteForceApproach(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			} else if (i % 3 == 0) {
				System.out.print("Fizz ");
			} else if (i % 5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
