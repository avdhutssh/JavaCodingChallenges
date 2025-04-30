package Java.Leetcode;

public class _025_IsSubsequence {

	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "ahbgdc")); // true
		System.out.println(isSubsequence("axc", "ahbgdc")); // false
		System.out.println(isSubsequence("", "ahbgdc")); // true (empty string is always a subsequence)
		System.out.println(isSubsequence("abc", "")); // false
		System.out.println(isSubsequence("", "")); // true
		System.out.println(isSubsequence("abc", "abc")); // true
		System.out.println(isSubsequence("aec", "abcde")); // false
	}

	static boolean isSubsequence(String s, String t) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		if (s.isEmpty())
			return true;
		int p1 = 0, p2 = 0;
		while (p1 < s.length() && p2 < t.length()) {
			if (s.charAt(p1) == t.charAt(p2)) {
				p1++;
				p2++;
			} else {
				p2++;
			}
		}
		if (p1 == s.length())
			return true;
		return false;
	}
}
