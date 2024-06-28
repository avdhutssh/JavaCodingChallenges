package Java.InterviewQuestions;

public class _029_removeTrailingZeros {

	public static void main(String[] args) {
		String str = "1230456000"; // 1230456
		System.out.println(_01_Using_Brute_Force_Approach(str));

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

}
