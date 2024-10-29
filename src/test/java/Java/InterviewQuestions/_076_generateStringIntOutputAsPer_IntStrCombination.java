package Java.InterviewQuestions;

import java.util.HashMap;

public class _076_generateStringIntOutputAsPer_IntStrCombination {

	public static void main(String[] args) {
		// TASK: Let you have an input as "aabbBCccD" then the output should be
		// "a2b3c3d1"

		String str = "aabbBCccD"; // a2b3c3d1

		System.out.println("Using HashMap : " + _01_Using_HashMap(str));
		System.out.println("Using Array : " + _02_Using_Array(str));

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

	private static String _02_Using_Array(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		str = str.toLowerCase();
		int[] freq = new int[128];
		for (char ch : str.toCharArray()) {
			freq[ch]++;
		}
		boolean[] added = new boolean[128];
		StringBuilder result = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (!added[ch]) {
				result.append(ch).append(freq[ch]);
				added[ch]=true;
			}
		}
		return result.toString();
	}

}
