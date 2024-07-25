package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _081_Second_Most_frequent_Character_In_String {

	public static void main(String[] args) {

		String str1 = "aabababa"; // b
		String str2 = "abcd"; // 0

		System.out.println("Using HashMap: " + _01_Using_HashMap(str1));
		System.out.println("Using HashMap: " + _01_Using_HashMap(str2));

		System.out.println("Using HashMap and Sorting: " + _02_Using_HashMap_And_Sorting(str1));
		System.out.println("Using HashMap and Sorting: " + _02_Using_HashMap_And_Sorting(str2));

		System.out.println("Using Array and Passes: " + _03_Using_Two_Passes_Array(str1));
		System.out.println("Using Array and Passes: " + _03_Using_Two_Passes_Array(str2));
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
			if (entry.getValue() == secondMaxFreq) {
				return entry.getKey();
			}
		}
		return 0;

	}

	private static char _02_Using_HashMap_And_Sorting(String str) {
		// Time Complexity: O(nlogn)
		// Space Complexity: O(n)
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(hm.entrySet());
		sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		if (sortedEntries.size() > 1) {
			return sortedEntries.get(1).getKey();
		} else {
			throw new IllegalArgumentException("No second most frequent character found.");
		}

	}

	private static char _03_Using_Two_Passes_Array(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int[] charCount = new int[256];
		for (char c : str.toCharArray()) {
			charCount[c]++;
		}
		int firstMax = 0, secondMax = 0;
		for (int count : charCount) {
			if (count > firstMax) {
				secondMax = firstMax;
				firstMax = count;
			} else if (count > secondMax && count < firstMax) {
				secondMax = count;
			}
		}
		for (char c : str.toCharArray()) {
			if (charCount[c] == secondMax) {
				return c;
			}
		}
		return 0;

	}
}
