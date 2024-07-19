package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class _78_Is_Anagram {

	public static void main(String[] args) {

		System.out.println("Using BFA");
		System.out.println(_01_Using_Brute_Force_Approach("Race", "Care")); // true
		System.out.println(_01_Using_Brute_Force_Approach("cat", "dog")); // false
		System.out.println(_01_Using_Brute_Force_Approach("Happy", "hapy")); // false
		System.out.println(_01_Using_Brute_Force_Approach("Happy", "hapyy")); // false

		System.out.println("\n" + "Using Sorting");
		System.out.println(_02_Using_Sorting("Race", "Care")); // true
		System.out.println(_02_Using_Sorting("cat", "dog")); // false
		System.out.println(_02_Using_Sorting("Happy", "hapy")); // false
		System.out.println(_02_Using_Sorting("Happy", "hapyy")); // false

		System.out.println("\n" + "Using Frequency Array");
		System.out.println(_03_Using_Frequenecy_Array("Race", "Care")); // true
		System.out.println(_03_Using_Frequenecy_Array("cat", "dog")); // false
		System.out.println(_03_Using_Frequenecy_Array("Happy", "hapy")); // false
		System.out.println(_03_Using_Frequenecy_Array("Happy", "hapyy")); // false

		System.out.println("\n" + "Using HashMap");
		System.out.println(_04_Using_HashMap("Race", "Care")); // true
		System.out.println(_04_Using_HashMap("cat", "dog")); // false
		System.out.println(_04_Using_HashMap("Happy", "hapy")); // false
		System.out.println(_04_Using_HashMap("Happy", "hapyy")); // false
	}

	private static boolean _01_Using_Brute_Force_Approach(String str1, String str2) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		if (str1.length() != str2.length()) {
			return false;
		}

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		boolean[] visited = new boolean[str2.length()];

		for (int i = 0; i < str1.length(); i++) {
			boolean matchFound = false;
			for (int j = 0; j < str2.length(); j++) {
				if (!visited[j] && str1.charAt(i) == str2.charAt(j)) {
					visited[j] = true;
					matchFound = true;
					break;
				}
			}
			if (!matchFound) {
				return false;
			}
		}
		return true;
	}

	private static boolean _02_Using_Sorting(String str1, String str2) {
		// Time Complexity: O(nlogn)
		// Space Complexity: O(n)
		if (str1.length() != str2.length()) {
			return false;
		}

		char[] str1Arr = str1.toLowerCase().toCharArray();
		char[] str2Arr = str2.toLowerCase().toCharArray();

		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		return Arrays.equals(str1Arr, str2Arr);
	}

	private static boolean _03_Using_Frequenecy_Array(String str1, String str2) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		if (str1.length() != str2.length()) {
			return false;
		}

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		int[] charCount = new int[26];
		for (char ch : str1.toCharArray()) {
			charCount[ch - 'a']++;
		}
		for (char ch : str2.toCharArray()) {
			charCount[ch - 'a']--;
		}

		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean _04_Using_HashMap(String str1, String str2) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		if (str1.length() != str2.length()) {
			return false;
		}

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : str1.toCharArray()) {
			hm.put(ch, hm.getOrDefault(hm, 0) + 1);
		}
		for (char ch : str2.toCharArray()) {
			if (!hm.containsKey(ch)) {
				return false;
			}
			hm.put(ch, hm.get(ch) - 1);
			if (hm.get(ch) == 0) {
				hm.remove(ch);
			}
		}

		return hm.isEmpty();
	}
}
