package Java.Leetcode;

public class _012_LengthOfLastWord {

	public static void main(String[] args) {

		System.out.println(_01_lengthOfLastWord_Optimized("Hello World")); // 5
		System.out.println(_01_lengthOfLastWord_Optimized("   fly me   to   the moon  ")); // 4
		System.out.println(_01_lengthOfLastWord_Optimized("luffy is still joyboy")); // 6
		System.out.println(_01_lengthOfLastWord_Optimized("a")); // 1
		System.out.println(_01_lengthOfLastWord_Optimized(" ")); // 0
		System.out.println(_01_lengthOfLastWord_Optimized("Today is a nice day ")); // 3
		System.out.println(_01_lengthOfLastWord_Optimized("day")); // 3
		
		System.out.println("---------------------------------");
		
		System.out.println(_02_lengthOfLastWord_Optimized("Hello World")); // 5
		System.out.println(_02_lengthOfLastWord_Optimized("   fly me   to   the moon  ")); // 4
		System.out.println(_02_lengthOfLastWord_Optimized("luffy is still joyboy")); // 6
		System.out.println(_02_lengthOfLastWord_Optimized("a")); // 1
		System.out.println(_02_lengthOfLastWord_Optimized(" ")); // 0
		System.out.println(_02_lengthOfLastWord_Optimized("Today is a nice day ")); // 3
		System.out.println(_02_lengthOfLastWord_Optimized("day")); // 3
	}

	public static int _01_lengthOfLastWord_Optimized(String s) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int right = s.length() - 1;
		while (right >= 0 && s.charAt(right) == ' ') {
			right--;
		}
		int left = right;
		while (left >= 0 && s.charAt(left) != ' ') {
			left--;
		}

		return right - left;
	}

	public static int _02_lengthOfLastWord_Optimized(String s) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			} else if (count > 0) {
				return count;
			}
		}

		return count;
	}
}
