package Java.InterviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _43_countCapitalizedWordsInString {

	public static void main(String[] args) {
		String str1 = "AvdhutSatishShirgaonkar"; // 3
		String str2 = "UnderTaker Dead$%Man"; // 4

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str2));
		System.out.println("-------------------");

		System.out.println("Using Regular Expresson: " + _02_Using_Regular_Expression(str1));
		System.out.println("Using Regular Expresson: " + _02_Using_Regular_Expression(str2));
		System.out.println("-------------------");

	}

	private static int _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

	private static int _02_Using_Regular_Expression(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int count = 0;
		Pattern pattern = Pattern.compile("[A-Z]");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			count++;
		}
		return count;
	}

}
