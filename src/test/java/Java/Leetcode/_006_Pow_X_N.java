package Java.Leetcode;

public class _006_Pow_X_N {

	public static void main(String... args) {
		System.out.println(_01_myPow(2.0, 0)); // 1.0
		System.out.println(_01_myPow(0.0, 5)); // 0.0
		System.out.println(_01_myPow(0.0, 0)); // 1.0
		System.out.println(_01_myPow(2.0, 3)); // 8.0
		System.out.println(_01_myPow(2.0, -3)); // 0.125
		System.out.println(_01_myPow(-2.0, 4)); // 16.0
		System.out.println(_01_myPow(-2.0, 3)); // -8.0
		System.out.println(_01_myPow(1.00001, 123456));// ~3.4368447521
		System.out.println(_01_myPow(2.0, -2147483648));// 0.0
		System.out.println(_01_myPow(0.5, 3)); // 0.125
		System.out.println(_01_myPow(0.5, -3)); // 8.0

	}

	public static double _01_myPow(double x, int n) {
		// Time complexity: O(log2n)
		// Space complexity: O(1)

		long num = Math.abs((long) n);
		double result = 1;
		while (num != 0) {
			if (num % 2 == 1) {
				result *= x;
				num -= 1;
			}
			x *= x;
			num /= 2;
		}

		return n < 0 ? 1 / result : result;
	}
}
