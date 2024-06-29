package Java.InterviewQuestions;

public class _36_sum_Of_Digits_Given_Number {

	public static void main(String[] args) {
		int num1 = 123; // 6
		int num2 = 69; // 15

		System.out.println(_01_Using_Brute_Force_Approach(num1));
		System.out.println(_01_Using_Brute_Force_Approach(num2));
		System.out.println("-----------------------------------");

		System.out.println(_02_Using_Recursion(num1));
		System.out.println(_02_Using_Recursion(num2));
		System.out.println("-----------------------------------");

		System.out.println(_03_Using_String_Conversion(num1));
		System.out.println(_03_Using_String_Conversion(num2));
	}

	private static int _01_Using_Brute_Force_Approach(int num) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	private static int _02_Using_Recursion(int num) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		if (num == 0) {
			return 0;
		}
		return num % 10 + _02_Using_Recursion(num / 10);
	}

	private static int _03_Using_String_Conversion(int num) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		String originalNum = String.valueOf(num);
		int sum = 0;
		for (char ch : originalNum.toCharArray()) {
			sum += Character.getNumericValue(ch);
		}
		return sum;
	}

}
