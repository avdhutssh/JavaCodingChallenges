package Java.InterviewQuestions;

public class _126_Reverse_String_And_ReplaceSpaceWithPerc_While_Preserving_Words_Order {

	public static void main(String[] args) {

		String str1 = "India is my country"; // aidnI%si%ym%yrtnuoc

		System.out.println(_01_UsingBruteForceApproach(str1));

	}

	public static String _01_UsingBruteForceApproach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		StringBuilder sb = new StringBuilder();
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			sb.append(reverseString(words[i]));
			if (i != words.length-1) {
				sb.append("%");
			}
		}
		return sb.toString();

	}

	private static String reverseString(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
