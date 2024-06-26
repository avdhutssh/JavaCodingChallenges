package Java.InterviewQuestions;

public class _023_removeAllWhiteSpacesFromString {

	public static void main(String[] args) {
		String str = "Hello World 123";
		System.out.println(_01_UsingReplaceAll(str));

	}

	private static String _01_UsingReplaceAll(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return str.replaceAll("\\s", "");
	}

}
