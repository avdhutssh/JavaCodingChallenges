package Java.InterviewQuestions;

public class _028_removeLeadingZeros {

	public static void main(String[] args) {
		String str1 = "00000123569";// 123569
		String str2 = "000012356090";// 12356090

		System.out.println("Using Brute Force : " + _01_Using_Brute_Force_Approach(str1));
		System.out.println("Using Brute Force : " + _01_Using_Brute_Force_Approach(str2));
		System.out.println("-----------------------------------------------------------");

		System.out.println("Using Substring : " + _02_Using_Substring(str1));
		System.out.println("Using Substring : " + _02_Using_Substring(str2));
		System.out.println("-----------------------------------------------------------");

		System.out.println("Using RegX : " + _03_Using_RegX(str1));
		System.out.println("Using RegX : " + _03_Using_RegX(str2));
		System.out.println("-----------------------------------------------------------");
	}

	private static String _01_Using_Brute_Force_Approach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		String result = "";
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0') {
				start = i;
				break;
			}
		}

		for (int i = start; i < str.length(); i++) {
			result += str.charAt(i);
		}
		return result;
	}

	private static String _02_Using_Substring(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0') {
				return str.substring(i);
			}
		}
		return str;

	}

	private static String _03_Using_RegX(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		return str.replaceFirst("^0+(?!$)", "");
	}
}
