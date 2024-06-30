package Java.InterviewQuestions;

import java.util.Stack;

public class _37_reverse_Number {

	public static void main(String[] args) {
		int num1 = 456; // 654
		int num2 = 899; // 998

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(num1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(num2));
		System.out.println("--------------------------------");

		System.out.println("Using String Builder: " + _02_Using_String_Builder(num1));
		System.out.println("Using String Builder: " + _02_Using_String_Builder(num2));
		System.out.println("--------------------------------");

		System.out.println("Using Recursion: " + _03_Using_Recursion(num1, 0));
		System.out.println("Using Recursion: " + _03_Using_Recursion(num2, 0));
		System.out.println("--------------------------------");

		System.out.println("Using Stack: " + _04_Using_Stack(num1));
		System.out.println("Using Stack: " + _04_Using_Stack(num2));
	}

	private static int _01_Using_BruteForceApproach(int num) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int reverseNum = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num /= 10;
		}
		return reverseNum;
	}

	private static String _02_Using_String_Builder(int num) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		String numStr = Integer.toString(num);
		return new StringBuilder(numStr).reverse().toString();
	}

	private static int _03_Using_Recursion(int num, int reverse) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		if (num == 0) {
			return reverse;
		}
		return _03_Using_Recursion(num / 10, reverse * 10 + num % 10);
	}

	private static int _04_Using_Stack(int num) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Stack<Integer> st = new Stack<Integer>();
		while (num != 0) {
			st.push(num % 10);
			num /= 10;
		}

		int reverseNum = 0;
		int place = 1;
		while (!st.isEmpty()) {
			reverseNum += st.pop() * place;
			place *= 10;
		}
		return reverseNum;
	}
}
