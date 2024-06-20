package Java.UdemyFifthyCodingChallenges;

import java.util.HashMap;
import java.util.Map.Entry;

public class _12_longestPalindromeLength {

	public static void main(String[] args) {
		String str1 = "abbaba"; // 5 baaab
		String str2 = "abbaaa"; // 6
		String str3 = "abbabab";// 7
		String str4 = "abdccdceeebebc"; // 13

		System.out.println(_01_By_Using_HashMap(str1));
		System.out.println(_01_By_Using_HashMap(str2));
		System.out.println(_01_By_Using_HashMap(str3));
		System.out.println(_01_By_Using_HashMap(str4));

	}

	private static int _01_By_Using_HashMap(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			hm.put(str.charAt(i), (hm.getOrDefault(str.charAt(i), 0)) + 1);
		}
		int len = 0;
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			int value = 0;
			if (entry.getValue() % 2 != 0) {
				value = entry.getValue() - 1;
			} else {
				value = entry.getValue();
			}
			len += value;
		}
		return (str.length() % 2 == 0) ? len + 1 : len;
	}

}
