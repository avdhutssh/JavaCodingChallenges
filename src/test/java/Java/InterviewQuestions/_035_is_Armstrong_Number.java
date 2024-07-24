package Java.InterviewQuestions;

public class _035_is_Armstrong_Number {

	public static void main(String[] args) {
		int num1 = 153;
		int num2 = 1634;
		int num3 = 5767;

		System.out.println(_01_Using_BruteForceApproach(num1));
		System.out.println(_01_Using_BruteForceApproach(num2));
		System.out.println(_01_Using_BruteForceApproach(num3));
		System.out.println("----------------------------------");

		System.out.println(_02_Using_String_Conversion(num1));
		System.out.println(_02_Using_String_Conversion(num2));
		System.out.println(_02_Using_String_Conversion(num3));
	}

	private static boolean _01_Using_BruteForceApproach(int num) {
		// Time complexity: O(d) d-> digits in num
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

	private static boolean _02_Using_String_Conversion(int num) {
		// Time complexity: O(d) d-> digits in num
		// Space complexity: O(1)
		String originalNum = String.valueOf(num);
		int digits = originalNum.length();
		int sum = 0;
		for (char ch : originalNum.toCharArray()) {
			int digit = Character.getNumericValue(ch);
			sum += Math.pow(digit, digits);
		}
		return sum == num;
	}
}
