package Java.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _088_Count_letters {

	public static void main(String[] args) {
		String str = "GeeksForGeeks"; // r 1 s 2 e 4 F 1 G 2 k 2 o 1
		System.out.println("Using HashMap: " + _01_Using_HashMap(str));
		System.out.println("Using TreeMap: " + _02_Using_TreeMap(str));
	}

	private static HashMap<Character, Integer> _01_Using_HashMap(String str) {
		// Time complexity: O(nlogk) //k = number of unique elements
		// Space complexity: O(k)
		HashMap<Character, Integer> hs = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				ch = Character.toLowerCase(ch);
				hs.put(ch, hs.getOrDefault(ch, 0) + 1);
			}
		}
		return hs;
	}

	private static Map<Character, Integer> _02_Using_TreeMap(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		Map<Character, Integer> hs = new TreeMap<>();
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				ch = Character.toLowerCase(ch);
				hs.put(ch, hs.getOrDefault(ch, 0) + 1);
			}
		}
		return hs;
	}
}
