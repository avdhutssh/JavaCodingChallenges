package Java.InterviewQuestions;

public class _101_Remove_Vowels {
	public static void main(String[] args) {
		String str1 = "welcome to geeksforgeeks"; // "wlcm t gksfrgks"
		String str2 = "what is your name ?"; // "wht s yr nm ?"

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str2));
		System.out.println("--------------------------------------------------");
		System.out.println("Using IndexOf Method: " + _02_Using_IndexOfMethod(str1));
		System.out.println("Using IndexOf Method: " + _02_Using_IndexOfMethod(str2));
	}

	private static String _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		return str.replaceAll("[aeiouAEIOU]", "");
	}

	private static String _02_Using_IndexOfMethod(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if ("aeiouAEIOU".indexOf(ch) == -1) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
