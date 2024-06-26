package Java.InterviewQuestions;

public class _023_removeAllWhiteSpacesFromString {

	public static void main(String[] args) {
		String str = "Hello World 123";
		
		System.out.println(_01_UsingReplaceAll(str));
		
		System.out.println(_02_Using_CharArray(str));

	}

	private static String _01_UsingReplaceAll(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return str.replaceAll("\\s", "");
	}

	private static String _02_Using_CharArray(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		char[] arr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char c : arr) {
			if(c!=' ') {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
}
