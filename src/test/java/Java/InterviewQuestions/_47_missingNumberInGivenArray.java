package Java.InterviewQuestions;

public class _47_missingNumberInGivenArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6 }; // 4

		System.out.println("Using BFA : " + _01_Using_Brute_Force_Approach(arr));

	}

	private static int _01_Using_Brute_Force_Approach(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int n = arr.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int num : arr) {
			actualSum += num;
		}
		return expectedSum - actualSum;
	}

}
