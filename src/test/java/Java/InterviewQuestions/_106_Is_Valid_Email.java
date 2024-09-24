package Java.InterviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		
		System.out.println("Using RegX: " + isValidEmail(validMail));
		System.out.println("Using RegX: " + isValidEmail(invalidMail1));
		System.out.println("Using RegX: " + isValidEmail(invalidMail2));
		System.out.println("Using RegX: " + isValidEmail(invalidMail3));

	}

	private static boolean _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
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
	
    

    public static boolean isValidEmail(String email) {
		// Time complexity: O(n)
		// Space complexity: O(1)
    	final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
