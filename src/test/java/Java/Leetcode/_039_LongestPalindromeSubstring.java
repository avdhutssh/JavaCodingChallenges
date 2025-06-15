package Java.Leetcode;

public class _039_LongestPalindromeSubstring {

	public static void main(String[] args) {

		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("babad")); // Output: "bab" or "aba"
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("cbbd")); // Output: "bb"
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("a")); // Output: "a"
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("ac")); // Output: "a" or "c"
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("")); // Output: ""
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("racecar")); // Output: "racecar"
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("abccba")); // Output: "abccba"
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("abcda")); // Output: "a"
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("aaaa")); // Output: "aaaa"
		System.out.println(_01_longestPalindrome_UsingExpandAroundCentre("abcbaefgfe")); // Output: "efgfe"
	}

	public static String _01_longestPalindrome_UsingExpandAroundCentre(String s) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(1)

		if (s.isEmpty())
			return "";
		
		int start = 0;
		int end = 0;

		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCentre(s, i, i);
			int len2 = expandAroundCentre(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private static int expandAroundCentre(String s, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}
}
