package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _098_Find_Vowels_In_String {

	public static void main(String[] args) {
		String str = "Hello World"; // 3

		System.out.println("Using Simple Iteration: " + _01_Using_Iteration(str));
		System.out.println("Using RegEx: " + _02_Using_RegEx(str));
		System.out.println("Using Stream: " + _03_Using_Stream(str));

	}

	private static int _01_Using_Iteration(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int count = 0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	private static int _02_Using_RegEx(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int count = 0;
		Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			count++;
		}
		return count;
	}

	private static int _03_Using_Stream(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		return (int) str.toLowerCase().chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
	}

}
