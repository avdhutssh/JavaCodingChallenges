package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _54_convertHashMap_To_ArrayList {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("India", "New Delhi");
		hm.put("France", "Paris");
		hm.put("Germany", "Berlin");
		hm.put("Australia", "Canberra");

		System.out.println(_01_Converting_KeysToArrayList(hm));

	}

	private static List<String> _01_Converting_KeysToArrayList(HashMap<String, String> hm) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return new ArrayList<String>(hm.keySet());

	}

}
