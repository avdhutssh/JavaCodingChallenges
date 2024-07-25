package Java.InterviewQuestions;

import java.util.HashMap;

public class _082_Frequency_Of_Character_In_String {

	public static void main(String[] args) {

		String str = "DevLabsAlliance";

		System.out.println("Using HashMap: " + _01_Using_HashMap(str));

	}

	private static HashMap<Character, Integer> _01_Using_HashMap(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		return hm;
	}

}
