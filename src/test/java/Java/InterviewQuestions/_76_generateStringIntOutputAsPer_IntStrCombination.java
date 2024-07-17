package Java.InterviewQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class _76_generateStringIntOutputAsPer_IntStrCombination {

	public static void main(String[] args) {
		// TASK: Let you have an input as "aabbBCccD" then the output should be
		// "a2b3c3d1"

		String str = "aabbBCccD"; // a2b3c3d1

		System.out.println("Using HashMap : " + _01_Using_HashMap(str));

	}

	private static String _01_Using_HashMap(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		str = str.toLowerCase();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		String result = "";
		for (char ch : str.toCharArray()) {
			if (hm.containsKey(ch)) {
				result += Character.toString(ch) + hm.get(ch);
				hm.remove(ch);
			}
		}
		return result;
	}

}
