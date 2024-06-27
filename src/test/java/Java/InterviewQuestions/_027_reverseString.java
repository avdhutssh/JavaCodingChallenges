package Java.InterviewQuestions;

public class _027_reverseString {

	public static void main(String[] args) {
		String str = "Geeks";

		System.out.println(_01_Using_BruteForceApproach(str));

	}

	private static String _01_Using_BruteForceApproach(String str) {
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

}
