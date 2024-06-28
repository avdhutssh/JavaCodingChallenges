package Java.InterviewQuestions;

public class _030_removeLeading_And_Trailing_Zeros {

	public static void main(String[] args) {
		String str1 = "1230456000000"; // 1230456
		String str2 = "00001230456000"; // 1230456

		System.out.println("Using BFA: " + _01_Using_Brute_Force_Approach(str1));
		System.out.println("Using BFA: " + _01_Using_Brute_Force_Approach(str2));
		System.out.println("----------------------------------------------------");

		System.out.println("Using RegX: " + _02_Using_Regular_Expression(str1));
		System.out.println("Using RegX: " + _02_Using_Regular_Expression(str2));
		System.out.println("----------------------------------------------------");
		
		System.out.println("Using RegX optimize: " + _03_Using_Regular_Expression_Optimize(str1));
		System.out.println("Using RegX optimize: " + _03_Using_Regular_Expression_Optimize(str2));
	}

	private static String _01_Using_Brute_Force_Approach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int start = 0;
		int end = str.length() - 1;
		while (start < str.length() && str.charAt(start) == '0') {
			start++;
		}
		while (end >= 0 && str.charAt(end) == '0') {
			end--;
		}

		return str.substring(start, end + 1);
	}

	private static String _02_Using_Regular_Expression(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		return str.replaceFirst("^0+", "").replaceAll("0+$", "");
	}

	private static String _03_Using_Regular_Expression_Optimize(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		return str.replaceAll("^0+|0+$", "");
	}
}
