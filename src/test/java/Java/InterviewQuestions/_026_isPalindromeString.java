package Java.InterviewQuestions;

public class _026_isPalindromeString {

	public static void main(String[] args) {
		String str1 = "Madam"; // true
		String str2 = "Avdhut"; // false

		System.out.println(_01_Using_Brute_force_Approach(str1));
		System.out.println(_01_Using_Brute_force_Approach(str2));
	}

	private static boolean _01_Using_Brute_force_Approach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		str = str.toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
