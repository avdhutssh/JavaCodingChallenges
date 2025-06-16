package Java.Leetcode;

public class _041_ReverseWordsInString {

	public static void main(String[] args) {
		System.out.println("--- Using In-Place Approach ---");
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("the sky is blue")); // "blue is sky the"
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("  hello world  ")); // "world hello"
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("a good   example")); // "example good a"
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("  Bob    Loves  Alice  ")); // "Alice Loves Bob"
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("Alice")); // "Alice"
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("")); // ""
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("   ")); // ""
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("1 2 3 4 5")); // "5 4 3 2 1"
		System.out.println(_01_reverseWords_Optimized_InPlaceApporach("a")); // "a"
	}

	public static String _01_reverseWords_Optimized_InPlaceApporach(String s) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		if (s == null || s.isEmpty()) {
			return s;
		}

		char[] charArr = s.toCharArray();
		reverse(charArr, 0, charArr.length - 1);
		reverseWords(charArr);
		return cleanupSpaces(charArr);
	}

	private static void reverse(char[] charArr, int left, int right) {
		while (left < right) {
			char tmp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = tmp;
			left++;
			right--;
		}

	}

	private static void reverseWords(char[] charArr) {
		int left = 0;
		int right = 0;
		while (left < charArr.length) {
			while (left < charArr.length && charArr[left] == ' ')
				left++;
			right = left;

			while (right < charArr.length && charArr[right] != ' ')
				right++;
			reverse(charArr, left, right - 1);
			left = right;
		}

	}

	private static String cleanupSpaces(char[] charArr) {

		int left = 0;
		int right = 0;
		while (right < charArr.length) {
			while (right < charArr.length && charArr[right] == ' ')
				right++;
			while (right < charArr.length && charArr[right] != ' ') {
				charArr[left++] = charArr[right++];
			}
			while (right < charArr.length && charArr[right] == ' ')
				right++;
			if (right < charArr.length) {
				charArr[left++] = ' ';
			}
		}
		return new String(charArr).substring(0, left);
	}
}
