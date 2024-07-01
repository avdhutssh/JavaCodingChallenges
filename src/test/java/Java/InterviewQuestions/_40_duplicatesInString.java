package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class _40_duplicatesInString {

	public static void main(String[] args) {
		String str = "Great responsibility"; // r e t s i

		System.out.println(_01_Using_BruteForcePproach(str));

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

}
