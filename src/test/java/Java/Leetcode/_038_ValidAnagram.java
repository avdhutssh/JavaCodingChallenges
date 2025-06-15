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

	}

	private static boolean _01_isAnagram_Using_HM(String s, String t) {

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

}
