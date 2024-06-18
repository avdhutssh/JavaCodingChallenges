package Java.UdemyFifthyCodingChallenges;

import java.util.HashSet;

public class _08_longestSubstringWithoutRepeating {

	public static void main(String[] args) {
		String str1 = "abcdbeghef"; // 6
		String str2 = "aaaaa"; // 1
		String str3 = "eddy"; // 2

		System.out.println(_01_BruteForceApproach(str1));
		System.out.println(_01_BruteForceApproach(str2));
		System.out.println(_01_BruteForceApproach(str3));

	}

	private static int _01_BruteForceApproach(String str) {
		// Time complexity: O(n^3)
		// Space complexity: O(n)
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String subStr = str.substring(i, j+1);
				if(isUnique(subStr) && subStr.length()>result.length()) {
					result = subStr;
//					System.out.println(result);
				}
			}
			
		}
		return result.length();

	}

	private static boolean isUnique(String subStr) {
		HashSet<Character> hs = new HashSet<Character>();
		for (Character ch : subStr.toCharArray()) {
			if(!hs.add(ch)) return false;
		}
		return true;
	}
}