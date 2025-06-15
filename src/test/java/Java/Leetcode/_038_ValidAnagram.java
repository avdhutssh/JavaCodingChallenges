package Java.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class _038_ValidAnagram {

	public static void main(String[] args) {
		System.out.println(_01_isAnagram_Using_HM("anagram", "nagaram")); // true
		System.out.println(_01_isAnagram_Using_HM("rat", "car")); // false
		System.out.println(_01_isAnagram_Using_HM("a", "a")); // true
		System.out.println(_01_isAnagram_Using_HM("ab", "ba")); // true
		System.out.println(_01_isAnagram_Using_HM("", "")); // true
		System.out.println(_01_isAnagram_Using_HM("abc", "abcd")); // false

		System.out.println("--------------------------------------------");

		System.out.println(_02_isAnagram_Using_FrequencyArray("anagram", "nagaram")); // true
		System.out.println(_02_isAnagram_Using_FrequencyArray("rat", "car")); // false
		System.out.println(_02_isAnagram_Using_FrequencyArray("a", "a")); // true
		System.out.println(_02_isAnagram_Using_FrequencyArray("ab", "ba")); // true
		System.out.println(_02_isAnagram_Using_FrequencyArray("", "")); // true
		System.out.println(_02_isAnagram_Using_FrequencyArray("abc", "abcd")); // false

		System.out.println("--------------------------------------------");

		System.out.println(_03_isAnagram_Using_FrequencyArrayOptimized("anagram", "nagaram")); // true
		System.out.println(_03_isAnagram_Using_FrequencyArrayOptimized("rat", "car")); // false
		System.out.println(_03_isAnagram_Using_FrequencyArrayOptimized("a", "a")); // true
		System.out.println(_03_isAnagram_Using_FrequencyArrayOptimized("ab", "ba")); // true
		System.out.println(_03_isAnagram_Using_FrequencyArrayOptimized("", "")); // true
		System.out.println(_03_isAnagram_Using_FrequencyArrayOptimized("abc", "abcd")); // false

	}

	private static boolean _01_isAnagram_Using_HM(String s, String t) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		if (s.length() != t.length())
			return false;

		Map<Character, Integer> hm1 = new HashMap<>();
		Map<Character, Integer> hm2 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
		}
		for (Character key : hm1.keySet()) {
			if (!hm1.get(key).equals(hm2.get(key))) {
				return false;
			}
		}

		return true;
	}

	private static boolean _02_isAnagram_Using_FrequencyArray(String s, String t) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		if (s.length() != t.length())
			return false;

		int[] counter = new int[26];
		for (int i = 0; i < s.length(); i++) {
			counter[s.charAt(i) - 'a']++;
			counter[t.charAt(i) - 'a']--;
		}

		for (int count : counter) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}

	private static boolean _03_isAnagram_Using_FrequencyArrayOptimized(String s, String t) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		if (s.length() != t.length())
			return false;

		int[] counter = new int[26];
		for (int i = 0; i < s.length(); i++) {
			counter[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			counter[t.charAt(i) - 'a']--;
			if (counter[t.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
