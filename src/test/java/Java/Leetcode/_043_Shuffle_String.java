package Java.Leetcode;

public class _043_Shuffle_String {

	public static void main(String[] args) {
		System.out.println(_01_restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 1, 2, 3 })); // "leetcode"
		System.out.println(_01_restoreString("abc", new int[] { 0, 1, 2 })); // "abc"
		System.out.println(_01_restoreString("aiohn", new int[] { 3, 1, 4, 2, 0 })); // "nihao"
		System.out.println(_01_restoreString("aaiougrt", new int[] { 4, 0, 2, 6, 7, 3, 1, 5 })); // "arigatou"
		System.out.println(_01_restoreString("a", new int[] { 0 })); // "a"
		System.out.println(_01_restoreString("", new int[] {})); // ""
		System.out.println(_01_restoreString("ab", new int[] { 1, 0 })); // "ba"
	}

	private static String _01_restoreString(String s, int[] indices) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		if (s.length() != indices.length) {
			return null;
		}
		char[] result = new char[indices.length];
		for (int i = 0; i < indices.length; i++) {
			result[indices[i]] = s.charAt(i);
		}
		return new String(result);
	}
}