package Java.InterviewQuestions;

public class _41_swapTwoNumbers {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 24;
		_01_Without_Using_Temp_Variable(num1, num2);
		_02_Using_Temp_Variable(num1, num2);
		_03_Using_Array(num1, num2);
	}

	private static void _01_Without_Using_Temp_Variable(int num1, int num2) {
		// Time complexity: O(1)
		// Space complexity: O(1)
		System.out.println("Before-> num1 : " + num1 + " num2 : " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After-> num1 : " + num1 + " num2 : " + num2);

	}

	private static void _02_Using_Temp_Variable(int num1, int num2) {
		// Time complexity: O(1)
		// Space complexity: O(1)
		System.out.println("Before-> num1 : " + num1 + " num2 : " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After-> num1 : " + num1 + " num2 : " + num2);

	}

	private static void _03_Using_Array(int num1, int num2) {
		// Time complexity: O(1)
		// Space complexity: O(1)
		System.out.println("Before-> num1 : " + num1 + " num2 : " + num2);
		int[] arr = { num1, num2 };
		num2 = arr[0];
		num1 = arr[1];
		System.out.println("After-> num1 : " + num1 + " num2 : " + num2);

	}

}
