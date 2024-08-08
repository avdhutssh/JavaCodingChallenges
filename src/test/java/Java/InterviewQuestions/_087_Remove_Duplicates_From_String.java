package Java.InterviewQuestions;

import java.util.HashSet;

public class _087_Remove_Duplicates_From_String {

	public static void main(String[] args) {
		String str = "HappyNewYear"; // HapyNewYr

		System.out.println(_01_Using_HashSet(str));
	}

	private static String _01_Using_HashSet(String str) {

		HashSet<Character> hs = new HashSet<>();
		String result = "";
		for (char ch : str.toCharArray()) {
			if (hs.add(ch))
				result += ch;
		}
		return result;
	}

}
