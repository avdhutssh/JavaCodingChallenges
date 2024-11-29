package Java.InterviewQuestions;

public class _131_Masked_Last_4_Letters {

	public static void main(String[] args) {

		System.out.println(_01_masked_Using_String_Manipulation(""));  // empty
		System.out.println(_01_masked_Using_String_Manipulation(null)); // empty
		System.out.println(_01_masked_Using_String_Manipulation("av")); // av
		System.out.println(_01_masked_Using_String_Manipulation("abcd")); // abcd
		System.out.println(_01_masked_Using_String_Manipulation("avdhutcool")); // avdhut####
		System.out.println(_01_masked_Using_String_Manipulation("avdhut")); // av####

	}

	private static String _01_masked_Using_String_Manipulation(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		
		if( str == null) {
			return "";
		}
		if(str.length()<=4) {
			return str;
		}
		
		StringBuilder maskedStr = new StringBuilder();
		int maskedLength = str.length() - 4;
		
		for (int i = 0; i < maskedLength; i++) {
			maskedStr.append(str.charAt(i));
		}
		for (int i = maskedLength; i < str.length(); i++) {
			maskedStr.append('#');
		}
		
		return maskedStr.toString();
	}

}
