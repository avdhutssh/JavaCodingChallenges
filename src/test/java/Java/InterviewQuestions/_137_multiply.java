package Java.InterviewQuestions;

public class _137_multiply {

	public static void main(String[] args) {

		System.out.println(_01_multiply(5, 10)); // 50

	}

	private static int _01_multiply(int i, int j) {
		// Time complexity: O(j)
		// Space complexity: O(1)
		int sum = 0;
		int k = 1;
		while (k <= j) {
			sum += i;
			k++;
		}
		return sum;
	}

}
