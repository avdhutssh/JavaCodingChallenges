package Java.InterviewQuestions;

public class _085_Count_Number_Words_String {

	public static void main(String[] args) {
		String str = "    India Is My Country";

		System.out.println(_01_Using_Split_Method(str));
	}

	private static int _01_Using_Split_Method(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return str.trim().split("\\s+").length;
	}

}
