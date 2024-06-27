package Java.InterviewQuestions;

public class _026_isPalindromeString {

	public static void main(String[] args) {
		String str1 = "Madam"; // true
		String str2 = "Avdhut"; // false
		String str3 = "A man a plan a canal Panama";

		System.out.println(_01_Using_Brute_force_Approach(str1));
		System.out.println(_01_Using_Brute_force_Approach(str2));
		System.out.println(_01_Using_Brute_force_Approach(str3));	
		System.out.println("----------------------------------");
		
		System.out.println(_02_Using_String_Reverse(str1));
		System.out.println(_02_Using_String_Reverse(str2));
		System.out.println(_02_Using_String_Reverse(str3));
	}

	private static boolean _01_Using_Brute_force_Approach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		str = str.trim().replaceAll("\\s+","").toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean _02_Using_String_Reverse(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		str = str.trim().replaceAll("\\s+","").toLowerCase();
		String reverseStr= new StringBuilder(str).reverse().toString();
		return str.equals(reverseStr);
	}
}
