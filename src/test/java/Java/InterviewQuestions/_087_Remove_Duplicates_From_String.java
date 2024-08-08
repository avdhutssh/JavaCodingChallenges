package Java.InterviewQuestions;

import java.util.HashSet;

public class _087_Remove_Duplicates_From_String {

	public static void main(String[] args) {
		String str = "HappyNewYear"; // HapyNewYr

		System.out.println("Using HashSet: " + _01_Using_HashSet(str));
		System.out.println("Using Arrays: " + _02_Using_Array(str));
		System.out.println("Using StringBuilder: " + _03_Using_StringBuilder(str));
	}

	private static String _01_Using_HashSet(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		HashSet<Character> hs = new HashSet<>();
		String result = "";
		for (char ch : str.toCharArray()) {
			if (hs.add(ch))
				result += ch;
		}
		return result;
	}

	private static String _02_Using_Array(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		boolean[] exists = new boolean[256];
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (!exists[ch]) {
				exists[ch] = true;
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	private static String _03_Using_StringBuilder(String str) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			String subStr = str.substring(0, i);
			if (!subStr.contains(String.valueOf(str.charAt(i)))) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}
