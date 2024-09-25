package Java.InterviewQuestions;

public class _107_Uppercase_First_Letter_Of_Each_Word {

	public static void main(String[] args) {

		String str1 = "avdhut is a great person";
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str1));

	}

	private static String _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		StringBuilder result = new StringBuilder();
		String[] words = str.split("\\s+");
		for (String word : words) {
			result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
		}
		return result.toString();
	}

}
