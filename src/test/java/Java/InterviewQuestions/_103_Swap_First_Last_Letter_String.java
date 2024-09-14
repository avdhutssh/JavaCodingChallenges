package Java.InterviewQuestions;

import java.util.Arrays;

public class _103_Swap_First_Last_Letter_String {

	public static void main(String[] args) {
		String str = "That is a sample"; // thaT si a eampls
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str));
		System.out.println("Using StringBuilder: " + _02_Using_StringBuilder(str));

	}

	private static String _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		String[] words = str.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			String first = words[i].substring(0, 1);
			String last = words[i].substring(words[i].length() - 1);
			if (words[i].length() == 1) {
				words[i] = first;
			} else if (words[i].length() <= 2) {
				words[i] = last + first;
			} else {
				words[i] = last + words[i].substring(1, words[i].length() - 1) + first;
			}
		}
		return String.join(" ", words);
	}

	private static String _02_Using_StringBuilder(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		String[] words = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			if(word.length()>1) {
				sb.append(word.charAt(word.length()-1)).append(word.substring(1,word.length()-1)).append(word.charAt(0));
			}else {
				sb.append(word);
			}
			sb.append(" ");
		}
		return sb.toString();
	}
}
