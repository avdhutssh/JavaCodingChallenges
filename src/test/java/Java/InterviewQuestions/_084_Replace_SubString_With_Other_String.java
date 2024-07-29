package Java.InterviewQuestions;

import java.util.Arrays;

public class _084_Replace_SubString_With_Other_String {

	public static void main(String[] args) {
		String str1 = "Learn Lead and Succeed in Efforts";
		String toBeReplaced = "in";
		String toReplacedWith = "with";

		System.out.println(_01_Using_Array(str1, toBeReplaced, toReplacedWith));

	}

	private static String _01_Using_Array(String str, String toBeReplaced, String toReplacedWith) {
		// Time Complexity: O(n+k)
		// Space Complexity: O(n)
		String[] strArr = str.split(toBeReplaced);
		String result = "";
		for (int i = 0; i <= strArr.length - 1; i++) {
			String st = strArr[i];
			result += st;
			if (i != strArr.length - 1) {
				result += toReplacedWith;
			}
		}
		return result;
	}

}
