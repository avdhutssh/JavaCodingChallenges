package Java.InterviewQuestions;

import java.util.HashMap;

public class _032_longestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str1 = "abcdbeghef"; // 6
		String str2 = "aaaaaaaaaaaaaaabbbbbbbbbbbbbbbbb"; // 2
		String str3 = "eddy"; // 2

		System.out.println(_01_Using_HashMap(str1));
		System.out.println(_01_Using_HashMap(str2));
		System.out.println(_01_Using_HashMap(str3));
	}

	private static int _01_Using_HashMap(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int start = 0;
		int maxLen = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				start = Math.max(start, hm.get(str.charAt(i)) + 1);
			}
			hm.put(str.charAt(i), i);
			maxLen = Math.max(maxLen, i - start + 1);

		}
		return maxLen;
	}

}
