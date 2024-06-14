package Java.UdemyFifthyCodingChallenges;

import java.util.HashMap;
import java.util.HashSet;

public class _02_firstRepeatingCharacter {

	public static void main(String... args) {

		String str1 = "inside code"; // i
		String str2 = "programming"; // r
		String str3 = "abcd"; // /0
		String str4 = "abba"; // b

		System.out.println(_01_Using_HashSet(str1));
		System.out.println(_01_Using_HashSet(str2));
		System.out.println(_01_Using_HashSet(str3));
		System.out.println(_01_Using_HashSet(str4));
		System.out.println("-----------------------------");
		System.out.println(_02_BrureForceApproach(str1));
		System.out.println(_02_BrureForceApproach(str2));
		System.out.println(_02_BrureForceApproach(str3));
		System.out.println(_02_BrureForceApproach(str4));
		System.out.println("-----------------------------");
		System.out.println(_03_Using_HashMap(str1));
		System.out.println(_03_Using_HashMap(str2));
		System.out.println(_03_Using_HashMap(str3));
		System.out.println(_03_Using_HashMap(str4));
	}

	private static char _01_Using_HashSet(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashSet<Character> seen = new HashSet<Character>();
		for (char c : str.toCharArray()) {
			if (seen.contains(c))
				return c;
			seen.add(c);
		}
		return '\0';

	}

	private static char _02_BruteForceApproach(String str) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j))
					return str.charAt(i);
			}
		}
		return '\0';
	}

	private static char _03_Using_HashMap(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashMap<Character, Boolean> visited = new HashMap<Character, Boolean>();
		for (char c : str.toCharArray()) {
			if (visited.containsKey(c))
				return c;
			else
				visited.put(c, true);
		}
		return '\0';

	}
}
