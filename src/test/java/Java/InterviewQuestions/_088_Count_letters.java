package Java.InterviewQuestions;

import java.util.HashMap;

public class _088_Count_letters {

	public static void main(String[] args) {
		String str = "GeeksForGeeks"; // r 1 s 2 e 4 F 1 G 2 k 2 o 1
		System.out.println(_01_Using_Map(str));
	}

	private static HashMap<Character, Integer> _01_Using_Map(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		HashMap<Character, Integer> hs = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				ch = Character.toLowerCase(ch);
				hs.put(ch, hs.getOrDefault(ch, 0) + 1);
			}
		}
		return hs;
	}

}
