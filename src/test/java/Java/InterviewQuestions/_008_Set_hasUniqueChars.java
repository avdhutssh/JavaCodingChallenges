package Java.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _008_Set_hasUniqueChars {

	public static void main(String[] args) {
		String str1 = "abcdefg"; // should return true
		String str2 = "hello"; // should return false
		String str3 = ""; // should return true
		String str4 = "0123456789"; // should return true
		String str5 = "abacadaeaf"; // should return false
		System.out.println(_01_hasUnique(str1));
		System.out.println(_01_hasUnique(str2));
		System.out.println(_01_hasUnique(str3));
		System.out.println(_01_hasUnique(str4));
		System.out.println(_01_hasUnique(str5));
		System.out.println("--------------------------");
		System.out.println(_02_hasUnique(str1));
		System.out.println(_02_hasUnique(str2));
		System.out.println(_02_hasUnique(str3));
		System.out.println(_02_hasUnique(str4));
		System.out.println(_02_hasUnique(str5));
	}

	public static boolean _01_hasUnique(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Set<Character> charSet = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (charSet.contains(ch)) {
				return false;
			}
			charSet.add(ch);
		}

		return true;
	}

	public static boolean _02_hasUnique(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Set<Character> charSet = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
		return charSet.size() == str.length();
	}
}
