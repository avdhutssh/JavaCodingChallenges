package Java.InterviewQuestions;

public class _70_Sum_Of_All_Digits {

	public static void main(String[] args) {
		int num = 876; // 21
		System.out.println("Using Iterative Method: " + _01_Using_Iterative_Method(num));

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

}
