package Java.InterviewQuestions;

public class _091_Palindrome_Substrings {

	public static void main(String[] args) {

		String str = "abaaa"; // a aa aaa aba b
		_01_UsingBruteForceApproach(str);

	}

	private static void _01_UsingBruteForceApproach(String str) {
		// Time complexity: O(n^3)
		// Space complexity: O(1)
		System.out.print("Using BFA: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String subStr = str.substring(i, j);
				if (isPalindrome(subStr)) {
					System.out.print(subStr+" ");
				}
			}
		}

	}

	static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

}
