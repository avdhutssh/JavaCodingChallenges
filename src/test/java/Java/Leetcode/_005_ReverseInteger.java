package Java.Leetcode;

public class _005_ReverseInteger {

	public static void main(String[] args) {
		System.out.println(_01_ReverseInteger(123)); // Expected: 321
		System.out.println(_01_ReverseInteger(-123)); // Expected: -321
		System.out.println(_01_ReverseInteger(120)); // Expected: 21
		System.out.println(_01_ReverseInteger(0)); // Expected: 0
		System.out.println(_01_ReverseInteger(1534236469)); // Expected: 0 (overflow case)
		System.out.println(_01_ReverseInteger(-2147483648)); // Expected: 0 (overflow case)
	}

	private static int _01_ReverseInteger(int x) {
		// Time complexity: O(log10 x)
		// Space complexity: O(1)

		int min = Integer.MIN_VALUE; // -2,147,483,648
		int max = Integer.MAX_VALUE; // 2,147,483,647
		int reverseNum = 0;
		while (x != 0) {
			if (reverseNum > max / 10 || reverseNum < min / 10) {
				return 0;
			}
			reverseNum = reverseNum * 10 + x % 10;
			x /= 10;
		}
		return reverseNum;
	}

}
