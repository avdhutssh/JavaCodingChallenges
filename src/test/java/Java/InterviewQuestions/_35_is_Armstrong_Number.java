package Java.InterviewQuestions;

public class _35_is_Armstrong_Number {

	public static void main(String[] args) {
		int num1 = 153;
		int num2 = 1634;
		int num3 = 5767;

		System.out.println(_01_using_BruteForceApproach(num1));
		System.out.println(_01_using_BruteForceApproach(num2));
		System.out.println(_01_using_BruteForceApproach(num3));
		System.out.println("----------------------------------");

	}

	private static boolean _01_using_BruteForceApproach(int num) {
		// Time complexity: O(num.length)
		// Space complexity: O(1)
		int originalNum = num;
		int sum = 0;
		int digits = Integer.toString(num).length();
		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num /= 10;
		}
		return sum == originalNum;
	}

}
