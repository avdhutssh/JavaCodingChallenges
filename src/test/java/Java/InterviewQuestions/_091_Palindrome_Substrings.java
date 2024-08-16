package Java.InterviewQuestions;

public class _091_Palindrome_Substrings {

	public static void main(String[] args) {

		String str = "abaaa"; // a aa aaa aba b
		_01_UsingBruteForceApproach(str);
		System.out.println("\n"+"--------------------------------");
		_02_Using_Dynamic_Programming(str);

	}

	private static void _01_UsingBruteForceApproach(String str) {
		// Time complexity: O(n^3)
		// Space complexity: O(1)
		System.out.print("Using BFA: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String subStr = str.substring(i, j);
				if (isPalindrome(subStr)) {
					System.out.print(subStr + " ");
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

	private static void _02_Using_Dynamic_Programming(String str) {
		// Time complexity: O(n^2)
		// Space complexity: O(n^2)
		System.out.print("Using Dynamic Programming: ");
		int n = str.length();
		boolean[][] dp = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			dp[i][i] = true;
			System.out.print(str.charAt(i) + " ");
		}

		for (int i = 0; i < n-1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				dp[i][i + 1] = true;
				System.out.print(str.charAt(i) + "" + str.charAt(i + 1) + " ");
			}
		}

		for (int length = 3; length <= n; length++) {
			for (int i = 0; i <= n - length; i++) {
				int j = i + length - 1;
				if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
					dp[i][j] = true;
					System.out.print(str.substring(i, j + 1) + " ");
				}

			}

		}
	}
}
