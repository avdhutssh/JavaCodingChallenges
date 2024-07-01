package Java.InterviewQuestions;

public class _39_countNumber_Of_Characters_In_String {

	public static void main(String[] args) {
		String str = "The best of both worlds"; // 19

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str));
		System.out.println("Using Replace All method: " + _02_Using_String_Method_ReplaceAll(str));
	}

	private static int _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		if (str.length() == 0 || str.isEmpty()) {
			return 0;
		}
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				count++;
			}
		}
		return count;
	}

	private static int _02_Using_String_Method_ReplaceAll(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		return str.replaceAll("\\s", "").length();
	}
}
