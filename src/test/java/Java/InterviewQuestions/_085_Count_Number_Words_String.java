package Java.InterviewQuestions;

import java.util.StringTokenizer;

public class _085_Count_Number_Words_String {

	public static void main(String[] args) {
		String str = "    India Is My Country";

		System.out.println("Using Trim and Split method: " + _01_Using_Split_Method(str));
		System.out.println("Using Iteration: " + _02_Using_Iteration(str));
		System.out.println("Using StringTokenizer: " + _03_Using_StringTokenizer(str));
		
	}

	private static int _01_Using_Split_Method(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return str.trim().split("\\s+").length;
	}

	private static int _02_Using_Iteration(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		if (str == null || str.isEmpty()) {
			return 0;
		}
		int wordCount = 0;
		boolean isWord = false;
		int endOfLine = str.length() - 1;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) && i != endOfLine) {
				isWord = true;
			} else if (!Character.isLetter(str.charAt(i)) && isWord) {
				wordCount++;
				isWord = false;
			} else if (Character.isLetter(str.charAt(i)) && i == endOfLine) {
				wordCount++;
			}
		}
		return wordCount;
	}
	
	private static int _03_Using_StringTokenizer(String str){
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		StringTokenizer st = new StringTokenizer(str);
		return st.countTokens();
		
	}
}
