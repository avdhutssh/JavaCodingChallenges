package Java.InterviewQuestions;

import java.util.Stack;

public class _026_isPalindromeString {

	public static void main(String[] args) {
		String str1 = "Madam"; // true
		String str2 = "Avdhut"; // false
		String str3 = "A man a plan a canal Panama";

		System.out.println(_01_Using_Brute_force_Approach(str1));
		System.out.println(_01_Using_Brute_force_Approach(str2));
		System.out.println(_01_Using_Brute_force_Approach(str3));
		System.out.println("----------------------------------");

		System.out.println(_02_Using_String_Reverse(str1));
		System.out.println(_02_Using_String_Reverse(str2));
		System.out.println(_02_Using_String_Reverse(str3));
		System.out.println("----------------------------------");

		System.out.println(_03_Using_Two_Pointer_Technique(str1));
		System.out.println(_03_Using_Two_Pointer_Technique(str2));
		System.out.println(_03_Using_Two_Pointer_Technique(str3));
		System.out.println("----------------------------------");

		System.out.println(_04_Using_Recursion(str1.trim().replaceAll("[\\W_]", "").toLowerCase()));
		System.out.println(_04_Using_Recursion(str2.trim().replaceAll("[\\W_]", "").toLowerCase()));
		System.out.println(_04_Using_Recursion(str3.trim().replaceAll("[\\W_]", "").toLowerCase()));
		System.out.println("----------------------------------");

		System.out.println(_05_Using_Stack(str1));
		System.out.println(_05_Using_Stack(str2));
		System.out.println(_05_Using_Stack(str3));
	}

	private static boolean _01_Using_Brute_force_Approach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		str = str.trim().replaceAll("\\s+", "").toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean _02_Using_String_Reverse(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		str = str.trim().replaceAll("\\s+", "").toLowerCase();
		String reverseStr = new StringBuilder(str).reverse().toString();
		return str.equals(reverseStr);
	}

	private static boolean _03_Using_Two_Pointer_Technique(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		str = str.trim().replaceAll("[\\W_]", "").toLowerCase();
		int left = 0;
		int right = str.length() - 1;
		int i = 0;
		while (left != right) {
			if (str.charAt(left++) != str.charAt(right--)) {
				return false;
			}
		}
		return true;
	}

	private static boolean _04_Using_Recursion(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		if (str.length() <= 1) {
			return true;
		}
		if (str.charAt(0) != str.charAt(str.length() - 1)) {
			return false;
		}
		return _04_Using_Recursion(str.substring(1, str.length() - 1));
	}

	private static boolean _05_Using_Stack(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		str = str.trim().replaceAll("[\\W_]", "").toLowerCase();
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length() / 2; i++) {
			st.push(str.charAt(i));
		}
		for (int i = (str.length() + 1) / 2; i < str.length(); i++) {
			if (st.pop() != str.charAt(i)) {
				return false;
			}
		}
		return true;

	}

}
