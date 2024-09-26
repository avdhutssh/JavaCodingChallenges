package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class _107_Uppercase_First_Letter_Of_Each_Word {

	public static void main(String[] args) {

		String str = "avdhut is a great person";
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str));
		System.out.println("Using Stream: " + _02_Using_Stream(str));

	}

	private static String _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		StringBuilder result = new StringBuilder();
		String[] words = str.split("\\s+");
		for (String word : words) {
			result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
		}
		return result.toString();
	}

	private static String _02_Using_Stream(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		return Arrays.stream(str.split("\\s+"))
				.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
				.collect(Collectors.joining(" "));
	}

}
