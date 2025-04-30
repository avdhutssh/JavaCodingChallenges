package Java.Leetcode;

public class _028_IsPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
		System.out.println(isPalindrome("race a car")); // false
		System.out.println(isPalindrome(" ")); // true
		System.out.println(isPalindrome("a.")); // true
		System.out.println(isPalindrome("0P")); // false
		System.out.println(isPalindrome("")); // true
		System.out.println(isPalindrome("Able was I, ere I saw Elba")); // true
	}

	static boolean isPalindrome(String s) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int left = 0, right = s.length() - 1;
		while (left <= right) {
			char c1 = s.charAt(left);
			char c2 = s.charAt(right);
			if (Character.isLetterOrDigit(c1) == false)
				left++;
			else if (Character.isLetterOrDigit(c2) == false)
				right--;
			else {
				if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
					return false;
				}
				left++;
				right--;
			}
		}
		return true;
	}
}
