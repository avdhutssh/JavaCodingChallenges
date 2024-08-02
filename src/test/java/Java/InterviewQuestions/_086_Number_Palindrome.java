package Java.InterviewQuestions;

public class _086_Number_Palindrome {

	public static void main(String[] args) {

		int num1 = 67876; // true
		int num2 = 3; // true
		int num3 = 123; // false

		System.out.println("By revesring the number: " + _01_By_Reversing_Number(num1));
		System.out.println("By revesring the number: " + _01_By_Reversing_Number(num2));
		System.out.println("By revesring the number: " + _01_By_Reversing_Number(num3));

	}

	private static boolean _01_By_Reversing_Number(int num) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int reverseNum = ReverseNum_Using_BFA(num);
		return (reverseNum == num) ? true : false;
	}

	private static int ReverseNum_Using_BFA(int num) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int reverseNum = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num /= 10;
		}
		return reverseNum;
	}

}
