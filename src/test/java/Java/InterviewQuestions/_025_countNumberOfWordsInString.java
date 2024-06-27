package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _025_countNumberOfWordsInString {

	public static void main(String[] args) {
		String str = "    India Is My Country";

		System.out.println("Word Count using spilt: " + _01_Using_Split_Array(str));
		System.out.println("Word Count using StringTokenizer: " + _02_Using_StringTokenizer(str));
		System.out.println("Word Count using countWordsManually: " + _03_countWordsManually(str));
		System.out.println("Word Count using Regular Expression: " + _04_Using_Regular_Expression(str));
		System.out.println("Word Count using Stream: " + _05_Using_Stream(str));

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

	private static int _03_countWordsManually(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int count = 0;
		int EOL = str.length() - 1;
		boolean isWord = false;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) && i != EOL) {
				isWord = true;
			} else if (!Character.isLetter(str.charAt(i)) && isWord) {
				count++;
				isWord = false;
			} else if (Character.isLetter(str.charAt(i)) && i == EOL) {
				count++;
			}
		}

		return count;
	}

	private static int _04_Using_Regular_Expression(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int count = 0;
		Pattern pattern = Pattern.compile("\\b\\w+\\b");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			count++;
		}

		return count;
	}
	
	private static long _05_Using_Stream(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)


		return Arrays.stream(str.trim().split("\\s+")).count();
	}
}
