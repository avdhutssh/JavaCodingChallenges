package Java.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class _130_First_Non_Repeating_Character_Hard_Level {

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingLetter("stress")); // Output: "t"
		System.out.println(firstNonRepeatingLetter("sTreSS")); // Output: "T"
		System.out.println(firstNonRepeatingLetter("aabbcc")); // Output: ""
		System.out.println(firstNonRepeatingLetter("")); // Output: ""
		System.out.println(firstNonRepeatingLetter(null)); // Output: ""
		System.out.println(firstNonRepeatingLetter("rAceCar")); // Output: "e"
	}

	public static String firstNonRepeatingLetter(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		if (str == null || str.isEmpty()) {
			return "";
		}
		Map<Character, Integer> charFrequency = new HashMap<>();
		String lowerInput = str.toLowerCase();

		for (char c : lowerInput.toCharArray()) {
			charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < str.length(); i++) {
			char originalChar = str.charAt(i);
			char lowerChar = lowerInput.charAt(i);
			if (charFrequency.get(lowerChar) == 1) {
				return String.valueOf(originalChar);
			}
		}

		return "";
	}

}
