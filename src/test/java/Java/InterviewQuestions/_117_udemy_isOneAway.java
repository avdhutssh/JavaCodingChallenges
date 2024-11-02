package Java.InterviewQuestions;

public class _117_udemy_isOneAway {

	public static void main(String[] args) {
		System.out.println(isOneAway("abcde", "abcd")); // should return true
		System.out.println(isOneAway("abde", "abcde")); // should return true
		System.out.println(isOneAway("a", "a")); // should return true
		System.out.println(isOneAway("abcdef", "abqdef")); // should return true
		System.out.println(isOneAway("abcdef", "abccef")); // should return true
		System.out.println(isOneAway("abcdef", "abcde")); // should return true
		System.out.println(isOneAway("aaa", "abc")); // should return false
		System.out.println(isOneAway("abcde", "abc")); // should return false
		System.out.println(isOneAway("abc", "abcde")); // should return false
		System.out.println(isOneAway("abc", "bcc")); // should return false
	}

	private static boolean isOneAway(String str1, String str2) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		
		if (Math.abs(str1.length() - str2.length()) >= 2) {
			return false;
		}
		if (str1.length() == str2.length()) {
			return isOneAwaySameLength(str1, str2);
		} else if (str1.length() > str2.length()) {
			return isOneAwayDiffLength(str1, str2);
		} else {
			return isOneAwayDiffLength(str2, str1);
		}

	}

	private static boolean isOneAwaySameLength(String str1, String str2) {
		int countDiff = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				countDiff++;
				if (countDiff > 1) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isOneAwayDiffLength(String str1, String str2) {
		int countDiff = 0;
		int i = 0;
		while (i < str2.length()) {
			if (str1.charAt(i + countDiff) != str2.charAt(i)) {
				countDiff++;
			} else {
				i++;
			}

		}
		return true;
	}

}
