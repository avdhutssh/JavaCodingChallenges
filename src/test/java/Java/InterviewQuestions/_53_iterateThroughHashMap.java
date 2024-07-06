package Java.InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.fontbox.cff.CharStringCommand.Key;

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
		_03_Using_Values(hm);
		System.out.println("---------------------------");
		_04_Using_ForEach(hm);
		System.out.println("---------------------------");
		_05_Using_Iterator(hm);
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

	private static void _03_Using_Values(HashMap<String, String> hm) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		for (String value : hm.values()) {
			System.out.println("Value: " + value);
		}

	}

	private static void _04_Using_ForEach(HashMap<String, String> hm) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		hm.forEach((Key, value) -> System.out.println("Key: " + Key + ", Value: " + value));
	}

	private static void _05_Using_Iterator(HashMap<String, String> hm) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		Iterator<Entry<String, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
