package Java.InterviewQuestions;

public class _029_removeTrailingZeros {

	public static void main(String[] args) {
		String str1 = "1230456000";   //1230456
		String str2 = "00001230456000";   //00001230456
		
		System.out.println("Using BFA: " + _01_Using_Brute_Force_Approach(str1));
		System.out.println("Using BFA: " + _01_Using_Brute_Force_Approach(str2));
		System.out.println("----------------------------------------------------");
		
		System.out.println("Using RegX: " + _02_Using_RegX(str1));
		System.out.println("Using RegX: " + _02_Using_RegX(str2));

	}

	private static String _01_Using_Brute_Force_Approach(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int end = str.length() - 1;
		while (end >= 0 && str.charAt(end) == '0') {
			end--;
		}
		return str.substring(0, end+1);
	}

	private static String _02_Using_RegX(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return str.replaceAll("0+$", "");
	}
	
}
