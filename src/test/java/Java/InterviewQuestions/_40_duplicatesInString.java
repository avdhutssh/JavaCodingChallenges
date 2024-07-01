package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _40_duplicatesInString {

	public static void main(String[] args) {
		String str = "Great responsibility"; // r e t s i

		System.out.println("Using BFA: " + _01_Using_BruteForcePproach(str));
		System.out.println("Using HashMap: " + _02_Using_HashMap(str));

	}

	private static List<Character> _01_Using_BruteForcePproach(String str) {
		// Time complexity: O(n^2)
		// Space complexity: O(n)
		str = str.replaceAll("\\s", "");
		List<Character> duplicates = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (!duplicates.contains(str.charAt(i))) {
						duplicates.add(str.charAt(i));
					}
				}
			}
		}
		return duplicates;
	}

	private static String _02_Using_HashMap(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		StringBuilder duplicates = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				hm.put(ch, hm.getOrDefault(ch, 0) + 1);
			}
		}
		for (char ch : hm.keySet()) {
			if (hm.get(ch) > 1) {
				duplicates.append(ch).append(" ");
			}
		}
		return duplicates.toString();
	}

}
