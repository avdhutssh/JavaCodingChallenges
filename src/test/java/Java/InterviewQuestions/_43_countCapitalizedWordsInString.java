package Java.InterviewQuestions;

public class _43_countCapitalizedWordsInString {

	public static void main(String[] args) {
		String str1 = "AvdhutSatishShirgaonkar"; // 3
		String str2 = "UnderTaker Dead$%Man"; // 4

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(str2));
		System.out.println("-------------------");

	}

	private static int _01_Using_BruteForceApproach(String str) {

		int count = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

}
