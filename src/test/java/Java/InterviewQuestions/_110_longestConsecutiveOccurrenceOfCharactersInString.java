package Java.InterviewQuestions;

public class _110_longestConsecutiveOccurrenceOfCharactersInString {

	public static void main(String[] args) {
		String str = "aayuipabcabcuioabcdefeg"; // 6
		System.out.println(_01_longestConsecutiveOccurrenceOfCharactersInString_BFA(str));

	}

	private static int _01_longestConsecutiveOccurrenceOfCharactersInString_BFA(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		if (str == null || str.length() == 0) {
			return 0;
		}

		int count = 1;
		int max = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1) + 1) {
				count++;
			} else {
				count = 1;
			}
			max = Math.max(max, count);
		}

		return max;
	}

}
