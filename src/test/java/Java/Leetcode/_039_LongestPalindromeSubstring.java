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

		System.out.println("\n----- BFA Solution -----");
		System.out.println(_02_longestPalindrome_UsingBFA("babad")); // Output: "bab" or "aba"
		System.out.println(_02_longestPalindrome_UsingBFA("cbbd")); // Output: "bb"
		System.out.println(_02_longestPalindrome_UsingBFA("a")); // Output: "a"
		System.out.println(_02_longestPalindrome_UsingBFA("ac")); // Output: "a" or "c"
		System.out.println(_02_longestPalindrome_UsingBFA("")); // Output: ""
		System.out.println(_02_longestPalindrome_UsingBFA("racecar")); // Output: "racecar"
		System.out.println(_02_longestPalindrome_UsingBFA("abccba")); // Output: "abccba"
		System.out.println(_02_longestPalindrome_UsingBFA("abcda")); // Output: "a"
		System.out.println(_02_longestPalindrome_UsingBFA("aaaa")); // Output: "aaaa"
		System.out.println(_02_longestPalindrome_UsingBFA("abcbaefgfe")); // Output: "efgfe" or "abcba"
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

	public static String _02_longestPalindrome_UsingBFA(String s) {
		// Time Complexity: O(n^3)
		// Space Complexity: O(1)

		if (s == null || s.isEmpty())
			return "";

		if (s.length() == 1)
			return s;

		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String current = s.substring(i,j);
				if(isPalindrome(current) && current.length() > longest.length() ) {
					longest = current;
				}
			}

		}
		return longest;
	}

	private static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}
}
