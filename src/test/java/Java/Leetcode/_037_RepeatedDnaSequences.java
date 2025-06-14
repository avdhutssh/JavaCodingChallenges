package Java.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _037_RepeatedDnaSequences {

	public static void main(String[] args) {

		System.out.println(_01_findRepeatedDnaSequences_HM("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")); // [AAAAACCCCC,																						// CCCCCAAAAA]
		System.out.println(_01_findRepeatedDnaSequences_HM("AAAAAAAAAAAA")); // [AAAAAAAAAA]
		System.out.println(_01_findRepeatedDnaSequences_HM("A")); // []
		System.out.println(_01_findRepeatedDnaSequences_HM("")); // []
		System.out.println(_01_findRepeatedDnaSequences_HM("AGTCAGTCAG")); // []

	}

	private static List _01_findRepeatedDnaSequences_HM(String str) {

		Map<String, Integer> hm = new HashMap<>();
		for (int i = 0; i <= str.length() - 10; i++) {
			String sub = str.substring(i, i + 10);
			hm.put(sub, hm.getOrDefault(sub, 0) + 1);
		}

		List<String> al = new ArrayList<>();
		for (Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				al.add(entry.getKey());
			}
		}
		return al;
	}

}
