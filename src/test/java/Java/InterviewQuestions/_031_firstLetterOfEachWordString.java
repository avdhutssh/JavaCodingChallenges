package Java.InterviewQuestions;

public class _031_firstLetterOfEachWordString {

	public static void main(String[] args) {
		String str = "  geeks for geeks   "; // gfg

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str));
		System.out.println("Using spilt and loop: " + _02_Using_Split_Loop(str));

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

	private static String _02_Using_Split_Loop(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		String result = "";
		String[] words = str.split("\\s+");
		for (String word : words) {
			if (!word.isEmpty()) {
				result += word.charAt(0);
			}
		}

		return result;
	}
}
