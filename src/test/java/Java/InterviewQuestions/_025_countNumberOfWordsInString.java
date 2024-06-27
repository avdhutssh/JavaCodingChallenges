package Java.InterviewQuestions;

import java.util.StringTokenizer;

public class _025_countNumberOfWordsInString {

	public static void main(String[] args) {
		String str = "    India Is My Country";

		System.out.println("Word Count using spilt: " + _01_Using_Split_Array(str));
		System.out.println("Word Count using StringTokenizer: " + _02_Using_StringTokenizer(str));

	}

	private static int _01_Using_Split_Array(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		String[] words = str.trim().split(" ");
		return words.length;
	}

	private static int _02_Using_StringTokenizer(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		StringTokenizer st = new StringTokenizer(str);
		return st.countTokens();
	}

}
