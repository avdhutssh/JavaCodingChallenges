package Java.Leetcode;

import java.util.HashMap;

public class _010_RansomNote {

	public static void main(String[] args) {
		System.out.println(_01_RansomNote_UsingHashMap("a", "b")); // false
		System.out.println(_01_RansomNote_UsingHashMap("aa", "ab")); // false
		System.out.println(_01_RansomNote_UsingHashMap("aa", "aab")); // true
		System.out.println(_01_RansomNote_UsingHashMap("", "")); // true
		System.out.println(_01_RansomNote_UsingHashMap("a", "")); // false
		System.out.println(_01_RansomNote_UsingHashMap("", "abc")); // true
		System.out.println(_01_RansomNote_UsingHashMap("abc", "aabbcc")); // true
	}

	public static boolean _01_RansomNote_UsingHashMap(String ransomNote, String magazine) {
		// Time Complexity: O(m + n)
		// Space Complexity: O(1)

		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : magazine.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		for (char ch : ransomNote.toCharArray()) {
			if (hm.getOrDefault(ch, 0) > 0) {
				hm.put(ch, hm.get(ch) - 1);
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean _02_RansomNote_UsingFreqArray(String ransomNote, String magazine) {
		// Time Complexity: O(m + n)
		// Space Complexity: O(1)

		int[] freq = new int[26];
		for (char ch : magazine.toCharArray()) {
			freq[ch - 'a']++;
		}
		for (char ch : ransomNote.toCharArray()) {

			if (freq[ch - 'a'] == 0) {
				return false;
			}
			freq[ch - 'a']--;
		}
		return true;
	}
}
