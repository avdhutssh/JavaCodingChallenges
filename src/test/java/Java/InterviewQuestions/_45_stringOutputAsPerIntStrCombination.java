package Java.InterviewQuestions;

public class _45_stringOutputAsPerIntStrCombination {

	public static void main(String[] args) {
		String str = "a2b3c4"; // aabbbcccc

		System.out.println("Using BFA : " + _01_Using_Brute_Force_Approach(str));
		System.out.println("Using String Builder : " + _02_Using_String_Builder(str));

	}

	private static String _01_Using_Brute_Force_Approach(String str) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				result += str.charAt(i);
			} else {
				int num = Character.getNumericValue(str.charAt(i));
				for (int j = 1; j < num; j++) {
					result += str.charAt(i - 1);
				}
			}
		}
		return result;
	}

	private static String _02_Using_String_Builder(String str) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				result.append(str.charAt(i));
			} else {
				int num = Character.getNumericValue(str.charAt(i));
				for (int j = 1; j < num; j++) {
					result.append(str.charAt(i - 1));
				}
			}
		}
		return result.toString();
	}
}
