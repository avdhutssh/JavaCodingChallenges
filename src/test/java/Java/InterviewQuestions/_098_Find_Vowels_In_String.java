package Java.InterviewQuestions;

public class _098_Find_Vowels_In_String {

	public static void main(String[] args) {
		String str = "Hello World"; // 3

		System.out.println("Using Simple Iteration: " + _01_Using_Iteration(str));

	}

	private static int _01_Using_Iteration(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int count = 0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

}
