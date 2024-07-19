package Java.InterviewQuestions;

public class _78_Is_Anagram {

	public static void main(String[] args) {
		System.out.println(_01_Using_Brute_Force_Approach("Race", "Care")); // true
		System.out.println(_01_Using_Brute_Force_Approach("cat", "dog")); // false
		System.out.println(_01_Using_Brute_Force_Approach("Happy", "hapy")); // false
		System.out.println(_01_Using_Brute_Force_Approach("Happy", "hapyy")); // false

	}

	private static boolean _01_Using_Brute_Force_Approach(String str1, String str2) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		if (str1.length() != str2.length()) {
			return false;
		}

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		boolean[] visited = new boolean[str2.length()];
		
		for (int i = 0; i < str1.length(); i++) {
			boolean matchFound = false;
			for (int j = 0; j < str2.length(); j++) {
				if (!visited[j] && str1.charAt(i) == str2.charAt(j)) {
					visited[j] = true;
					matchFound = true;
					break;
				}
			}
			if (!matchFound) {
				return false;
			}
		}
		return true;
	}

}
