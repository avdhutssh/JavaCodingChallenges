package Java.InterviewQuestions;

import java.util.HashMap;

public class _100_Sorting_Sentence {

	public static void main(String[] args) {
		String str1 = "is2 sentence4 This1 a3"; // "This is a sentence"
		String str2 = "Myself2 Me1 I4 and3"; // "Me Myself and I"

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str2));
		System.out.println("--------------------------------------------------");
		System.out.println("Using Optimized Approach: " + _02_Using_OptimizedApproach(str1));
		System.out.println("Using Optimized Approach: " + _02_Using_OptimizedApproach(str2));
		System.out.println("--------------------------------------------------");
		System.out.println("Using HashMap: " + _03_Using_HashMap(str1));
		System.out.println("Using HashMap: " + _03_Using_HashMap(str2));

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

	private static String _02_Using_OptimizedApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		String[] words = str.split("\\s+");
		String[] bucket = new String[words.length];
		for (String word : words) {
			int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
			bucket[index] = word.substring(0, word.length() - 1);

		}
		return String.join(" ", bucket);
	}

	private static String _03_Using_HashMap(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		String[] words = str.split("\\s+");
		HashMap<Integer, String> hs = new HashMap<>();
		for (String word : words) {
			int index = Character.getNumericValue(word.charAt(word.length() - 1));
			hs.put(index, word.substring(0, word.length() - 1));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= words.length; i++) {
			sb.append(hs.get(i)).append(" ");
		}
		return sb.toString().trim();
	}
}
