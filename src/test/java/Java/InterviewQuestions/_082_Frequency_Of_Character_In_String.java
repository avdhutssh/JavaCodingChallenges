package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _082_Frequency_Of_Character_In_String {

	public static void main(String[] args) {

		String str = "DevLabsAlliance";

		System.out.println("Using HashMap: " + _01_Using_HashMap(str));
		_02_Using_Array(str);

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

	private static void _02_Using_Array(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		str = str.toLowerCase();
		int[] charCount = new int[256];
		List<Character> unique = new ArrayList<>();
		for (char ch : str.toCharArray()) {
			charCount[ch]++;
		}
		System.out.println("Using Array: ");
		for (char ch : str.toCharArray()) {
			if (charCount[ch] > 0) {
				if (!unique.contains(ch)) {
					System.out.print(ch + "=" + charCount[ch] + " , ");
					unique.add(ch);
				}
			}
		}
	}

}
