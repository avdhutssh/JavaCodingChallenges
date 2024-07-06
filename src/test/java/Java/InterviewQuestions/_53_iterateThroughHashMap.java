package Java.InterviewQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class _53_iterateThroughHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("India", "New Delhi");
		hm.put("France", "Paris");
		hm.put("Germany", "Berlin");
		hm.put("Australia", "Canberra");

		_01_Using_EntrySet(hm);
		System.out.println("---------------------------");
		_02_Using_KeySet(hm);
		System.out.println("---------------------------");

	}

	private static void _01_Using_EntrySet(HashMap<String, String> hm) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		for (Entry<String, String> entry : hm.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

	}

	private static void _02_Using_KeySet(HashMap<String, String> hm) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		for (String key : hm.keySet()) {
			System.out.println("Key: " + key + ", Value: " + hm.get(key));
		}

	}
}
