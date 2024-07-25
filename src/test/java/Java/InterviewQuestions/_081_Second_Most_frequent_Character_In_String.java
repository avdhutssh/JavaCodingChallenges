package Java.InterviewQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class _081_Second_Most_frequent_Character_In_String {

	public static void main(String[] args) {

		String str1 = "aabababa"; // b
		String str2 = "abcd"; // 0

		System.out.println(_01_Using_HashMap(str1));
		System.out.println(_01_Using_HashMap(str2));

	}

	private static char _01_Using_HashMap(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		int maxFreq = 0;
		int secondMaxFreq = 0;
		for (int value : hm.values()) {
			if (value > maxFreq) {
				secondMaxFreq = maxFreq;
				maxFreq = value;
			} else if (value > secondMaxFreq && value < maxFreq) {
				secondMaxFreq = value;
			}
		}
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()==secondMaxFreq) {
				return entry.getKey();
			}
		}
			return 0;

	}

}
