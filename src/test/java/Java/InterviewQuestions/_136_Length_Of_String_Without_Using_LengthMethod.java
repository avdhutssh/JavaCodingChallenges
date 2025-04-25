package Java.InterviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _136_Length_Of_String_Without_Using_LengthMethod {
//How to find the length of the string without using length?

	public static void main(String[] args) {

		String str = "Avdhut"; // 6
		_01_Using_For_Each_Loop(str);
		_02_Using_IndexOutOfBound(str);
		_03_Using_LastIndexOf(str);
		_04_Using_PatternMatcher(str);

	}

	private static void _01_Using_For_Each_Loop(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int index = 0;
		for (char ch : str.toCharArray()) {
			index++;
		}
		System.out.println("Length of String for each loop is: " + index);
	}

	private static void _02_Using_IndexOutOfBound(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int index = 0;
		try {
			while (true) {
				char ch = str.charAt(index);
				index++;
			}
		} catch (StringIndexOutOfBoundsException e) {
		}
		System.out.println("Length of String using IndexOutOfBound is: " + index);
	}

	private static void _03_Using_LastIndexOf(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		System.out.println("Length of String using LastIndexOf method is: " + str.lastIndexOf(""));
	}

	private static void _04_Using_PatternMatcher(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		Matcher matcher = Pattern.compile("$").matcher(str);
		matcher.find();
		int length = matcher.end();
		System.out.println("Length of String using PatternMatcher is: " + length);
	}
}
