package Java.InterviewQuestions;

public class _089_FizzBuzz {

	public static void main(String[] args) {
// number/ 3 print Fizz number/ 5 print Buzz number/ both 3 and 5 print FizzBuzz else print number

		int num = 15; // 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz

		_01_Using_BruteForceApproach(num);
		_02_Using_StringConcatenation(num);

	}

	private static void _01_Using_BruteForceApproach(int num) {
		// Time complexity: O(n)
		// Space complexity: O(1)
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
		System.out.println();

	}

	private static void _02_Using_StringConcatenation(int num) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		String result = "";
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result += "FizzBuzz ";
			} else if (i % 3 == 0) {
				result += "Fizz ";
			} else if (i % 5 == 0) {
				result += "Buzz ";
			} else {
				result += String.valueOf(i+" ");
			}
		}
		System.out.println(result);
	}

}
