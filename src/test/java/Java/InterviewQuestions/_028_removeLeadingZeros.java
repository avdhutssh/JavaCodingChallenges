package Java.InterviewQuestions;

public class _028_removeLeadingZeros {

	public static void main(String[] args) {
		String str1 = "00000123569";// 123569
		String str2 = "000012356090";// 12356090

		System.out.println(_01_Using_Brute_Force_Approach(str1));
		System.out.println(_01_Using_Brute_Force_Approach(str2));
	}

	private static String _01_Using_Brute_Force_Approach(String str) {
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

}
