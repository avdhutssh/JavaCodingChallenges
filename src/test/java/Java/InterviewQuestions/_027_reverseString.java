package Java.InterviewQuestions;

public class _027_reverseString {

	public static void main(String[] args) {
		String str = "Geeks"; // skeeG

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str));
		System.out.println("Using String Builder: " + _02_Using_String_Builder(str));

	}

	private static String _01_Using_BruteForceApproach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n^2)
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

	private static String _02_Using_String_Builder(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return new StringBuilder(str).reverse().toString();
	}

}
