package Java.Leetcode;

public class _004_FactorialTrailingZeroes {

	public static void main(String[] args) {
		System.out.println(_01_TrailingZeroes(5)); // Expected: 1
		System.out.println(_01_TrailingZeroes(10)); // Expected: 2
		System.out.println(_01_TrailingZeroes(25)); // Expected: 6
		System.out.println(_01_TrailingZeroes(0)); // Expected: 0
		System.out.println(_01_TrailingZeroes(100)); // Expected: 24
		System.out.println(_01_TrailingZeroes(125)); // Expected: 31
		System.out.println(_01_TrailingZeroes(1000)); // Expected: 249
	}

	private static int _01_TrailingZeroes(int n) {
		// Time complexity: O(log5 n)
		// Space complexity: O(1)

		int count = 0;
		int currentPowerFive = 5;
		while (n >= currentPowerFive) {
			count += (n / currentPowerFive);
			currentPowerFive *= 5;
		}
		return count;
	}

}
