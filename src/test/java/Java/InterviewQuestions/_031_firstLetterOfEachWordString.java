package Java.InterviewQuestions;

public class _031_firstLetterOfEachWordString {

	public static void main(String[] args) {
		String str = "geeks for geeks"; // gfg

		System.out.println(_01_Using_BruteForceApproach(str));

	}

	private static String _01_Using_BruteForceApproach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		String result = "";
		boolean isSpace = true;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != ' ' && isSpace) {
				result += str.charAt(i);
				isSpace = false;
			}
			if (str.charAt(i) == ' ') {
				isSpace = true;
			}
		}
		return result;
	}

}
