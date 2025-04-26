package Java.Leetcode;

public class _003_isPalindromeNumber {

	public static void main(String[] args) {
		System.out.println(_01_IsPalindrome_ByReversingHalf(121)); // true
		System.out.println(_01_IsPalindrome_ByReversingHalf(-121)); // false
		System.out.println(_01_IsPalindrome_ByReversingHalf(10)); // false
		System.out.println(_01_IsPalindrome_ByReversingHalf(12321)); // true
		System.out.println(_01_IsPalindrome_ByReversingHalf(0)); // true
		
		System.out.println("-----------------------------------");
		
		
	}

	private static boolean _01_IsPalindrome_ByReversingHalf(int x) {
		// Time complexity: O(log x)
		// Space complexity: O(1)
		if (x < 0 || (x != 0 && x % 10 == 0)) {
			return false;
		}
		int reverseHalf = 0;
		while (x > reverseHalf) {
			reverseHalf = reverseHalf * 10 + x % 10;
			x /= 10;
		}
		return (reverseHalf == x) || (reverseHalf / 10 == x);
	}

}
