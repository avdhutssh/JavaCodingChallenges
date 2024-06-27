package Java.InterviewQuestions;

import java.util.Stack;

public class _027_reverseString {

	public static void main(String[] args) {
		String str = "Geeks"; // skeeG

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str));
		System.out.println("Using String Builder: " + _02_Using_String_Builder(str));
		System.out.println("Using Stack: " + _03_Using_Stack(str));
		System.out.println("Using Recursion: " + _04_Using_Recursion(str));

	}

	private static String _01_Using_BruteForceApproach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n^2)
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

	private static String _02_Using_String_Builder(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return new StringBuilder(str).reverse().toString();
	}

	private static String _03_Using_Stack(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		String reverseStr = "";
		Stack<Character> st = new Stack<Character>();
		for (char ch : str.toCharArray()) {
			st.push(ch);
		}
		while (!st.isEmpty()) {
			reverseStr += st.pop();
		}
		return reverseStr;
	}

	private static String _04_Using_Recursion(String str) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		if (str.isEmpty()) {
			return str;
		}

		return _04_Using_Recursion(str.substring(1)) + str.charAt(0);
	}
}
