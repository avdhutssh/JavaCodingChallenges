package Java.InterviewQuestions;

public class _70_Sum_Of_All_Digits {

	public static void main(String[] args) {
		int num = 876; // 21
		System.out.println("Using Iterative Method: " + _01_Using_Iterative_Method(num));
		System.out.println("Using Recursion Method: " + _02_Using_Recursion(num));
		System.out.println("Using String Conversion: " + _03_Using_String_Conversion(num));
	}

	private static int _01_Using_Iterative_Method(int num) {
		// Time Complexity: O(nlogn)
		// Space Complexity: O(1)
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		return sum;
	}

	private static int _02_Using_Recursion(int num) {
		// Time Complexity: O(logn)
		// Space Complexity: O(logn)
		if (num == 0) {
			return 0;
		}
		return num % 10 + _02_Using_Recursion(num / 10);
	}

	private static int _03_Using_String_Conversion(int num) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		String numStr = Integer.toString(num);
		int sum = 0;
		for (Character ch : numStr.toCharArray()) {
			sum += ch - '0';
//			sum += Character.getNumericValue(ch);
		}
		return sum;
	}
}
