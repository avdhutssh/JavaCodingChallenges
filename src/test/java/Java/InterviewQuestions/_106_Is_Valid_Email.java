package Java.InterviewQuestions;

public class _106_Is_Valid_Email {
	public static void main(String[] args) {
		String validMail = "avdhut1234@gmail.com";
		String invalidMail1 = "avdhut1234.com";
		String invalidMail2 = "avdhut@com";
		String invalidMail3 = "avd@com";
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(validMail));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(invalidMail1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(invalidMail2));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(invalidMail3));

	}

	private static boolean _01_Using_BruteForceApproach(String str) {

		if (!str.contains(".com")) {
			return false;
		}
		if (!str.contains("@")) {
			return false;
		}
		if (str.length() < 8) {
			return false;
		}
		return true;
	}
}
