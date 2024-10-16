package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _112_PatternMatch {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("badc", "abab", "dddd", "dede", "yyxx");
		String pattern = "baba";
		List<String> result = findMatchingElements(list, pattern);
		System.out.println(result); // Output: [abab, dddd, dede]
	}

	private static List<String> findMatchingElements(List<String> list, String pattern) {
		List<String> result = new ArrayList<>();

		for (String word : list) {
			if (isAllSameCharacter(word) || (word.length() == pattern.length() && followsPattern(word, pattern))) {
				result.add(word);
			}
		}
		return result;
	}

	private static boolean isAllSameCharacter(String str) {

		char firstChar = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != firstChar) {
				return false;
			}
		}
		return true;
	}

	private static boolean followsPattern(String word, String pattern) {

		HashMap<Character, Character> wordToPat = new HashMap<>();
		HashMap<Character, Character> patToWord = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			char wChar = word.charAt(i);
			char pChar = pattern.charAt(i);

			if (!wordToPat.containsKey(wChar)) {
				wordToPat.put(wChar, pChar);
			}

			if (!patToWord.containsKey(pChar)) {
				patToWord.put(pChar, wChar);
			}

			if (wordToPat.get(wChar) != pChar || patToWord.get(pChar) != wChar) {
				return false;
			}
		}
		return true;
	}

}
