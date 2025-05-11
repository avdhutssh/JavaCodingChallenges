package Java.Leetcode;

public class _036_LongestCommonPrefix {

	public static void main(String[] args) {
		// Edge cases
		String[] strs1 = { "flower", "flow", "flight" }; // Output: "fl"
		String[] strs2 = { "dog", "racecar", "car" }; // Output: ""
		String[] strs3 = { "interspecies", "interstellar", "interstate" }; // Output: "inters"
		String[] strs4 = { "a" }; // Output: "a"
		String[] strs5 = {}; // Output: ""

		System.out.println(_01_longestCommonPrefix_BFA(strs1));
		System.out.println(_01_longestCommonPrefix_BFA(strs2));
		System.out.println(_01_longestCommonPrefix_BFA(strs3));
		System.out.println(_01_longestCommonPrefix_BFA(strs4));
		System.out.println(_01_longestCommonPrefix_BFA(strs5));

		System.out.println("------------------------------");

		System.out.println(_02_longestCommonPrefix_Optimized(strs1));
		System.out.println(_02_longestCommonPrefix_Optimized(strs2));
		System.out.println(_02_longestCommonPrefix_Optimized(strs3));
		System.out.println(_02_longestCommonPrefix_Optimized(strs4));
		System.out.println(_02_longestCommonPrefix_Optimized(strs5));
	}

	private static String _02_longestCommonPrefix_Optimized(String[] strs) {
		// Time Complexity: O(n*m)
		// Space Complexity: O(1)

		if (strs == null || strs.length == 0) {
			return "";
		}
		String prefix = strs[0];
		for (int i = 0; i < strs.length; i++) {

			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}

	public static String _01_longestCommonPrefix_BFA(String[] strs) {
		// Time Complexity: O(n*m)
		// Space Complexity: O(1)

		if (strs == null || strs.length == 0)
			return "";
		for (int i = 0; i < strs[0].length(); i++) {
			char ch = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}

}
