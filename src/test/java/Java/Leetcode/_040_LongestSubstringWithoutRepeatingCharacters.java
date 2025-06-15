package Java.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _040_LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println("--- Using Brute Force Approach ---");
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("abcabcbb")); // Output: 3 ("abc")
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("bbbbb")); // Output: 1 ("b")
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("pwwkew")); // Output: 3 ("wke")
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("")); // Output: 0
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA(" ")); // Output: 1 (" ")
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("au")); // Output: 2 ("au")
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("aab")); // Output: 2 ("ab")
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("dvdf")); // Output: 3 ("vdf")
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("anviaj")); // Output: 5 ("nviaj")
		System.out.println(_01_longestSubstringWithoutRepeatingCharacters_BFA("abcdefghijklmnopqrstuvwxyz")); // 26
	}

	private static int _01_longestSubstringWithoutRepeatingCharacters_BFA(String str) {
		// Time complexity: O(n^3)
		// Space complexity: O(n)

		if (str == null || str.length() == 0)
			return 0;

		int maxlen = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String sub = str.substring(i, j + 1);
				if (isUnique(sub)) {
					maxlen = Math.max(maxlen, sub.length());
				}
			}
		}

		return maxlen;
	}

	private static boolean isUnique(String sub) {

		Set<Character> hs = new HashSet<Character>();
		for (char ch : sub.toCharArray()) {
			if (!hs.add(ch)) {
				return false;
			}
		}
		return true;
	}

}
