package Java.InterviewQuestions;

public class _100_Sorting_Sentence {

	public static void main(String[] args) {
		String str1 = "is2 sentence4 This1 a3"; // "This is a sentence"
		String str2 = "Myself2 Me1 I4 and3"; // "Me Myself and I"

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str2));

	}

	private static String _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		String result = "";
		String[] strArr = str.split("\\s+");
		String[] resultArr = new String[strArr.length];
		for (String s : strArr) {
			int index = (int) (s.charAt(s.length() - 1) - '0');
			resultArr[index - 1] = s.substring(0, s.length() - 1);
		}
		for (String s : resultArr) {
			result += s + " ";
		}
		return result;
	}

}
