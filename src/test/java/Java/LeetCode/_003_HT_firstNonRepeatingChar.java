package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class _003_HT_firstNonRepeatingChar {

	public static void main(String[] args) {

		String str1 = "leetcode";
		String str2 = "hello";
		String str3 = "aabbcc";
		System.out.println(_01_BruteForceApproach(str1)); // l
		System.out.println(_01_BruteForceApproach(str2)); // h
		System.out.println(_01_BruteForceApproach(str3)); // null
		System.out.println("---------------------------------");
		
		System.out.println(_02_Using_HashMap(str1)); // l
		System.out.println(_02_Using_HashMap(str2)); // h
		System.out.println(_02_Using_HashMap(str3)); // null
		System.out.println("---------------------------------");
	}

	private static Character _01_BruteForceApproach(String str) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < str.length(); i++) {
			boolean isRepeating = false;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					isRepeating = true;
					break;
				}
			}
			if (!isRepeating)
				return str.charAt(i);

		}
		return '\0';
	}
	
	private static Character _02_Using_HashMap(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		for(char ch : str.toCharArray()) {
			if(hm.get(ch)==1) return ch;
		}
		return '\0';
	}
	
}
