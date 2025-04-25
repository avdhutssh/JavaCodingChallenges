package Java.InterviewQuestions;

public class _133_DistinctPermutations {

	public static void main(String[] args) {

		printPermutations("ABC", "");

	}

	private static void printPermutations(String str, String ans) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		boolean[] isPresent = new boolean[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i+1);
			if (isPresent[ch - 'A'] == false) {
				printPermutations(ros, ans + ch);
			}
			isPresent[ch - 'A'] = true;

		}
	}

}
