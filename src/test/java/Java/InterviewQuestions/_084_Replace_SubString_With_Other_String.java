package Java.InterviewQuestions;

public class _084_Replace_SubString_With_Other_String {

	public static void main(String[] args) {
		String str1 = "Learn Lead and Succeed in Efforts";
		String toBeReplaced = "in";
		String toReplacedWith = "with";

		System.out.println(_01_Using_Array(str1, toBeReplaced, toReplacedWith));
		System.out.println(_02_Using_Replace(str1, toBeReplaced, toReplacedWith));

	}

	private static String _01_Using_Array(String str, String toBeReplaced, String toReplacedWith) {
		// Time Complexity: O(n+k)
		// Space Complexity: O(n)
		System.out.println("Before Using Array: " + str);
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

	private static String _02_Using_Replace(String str, String target, String replacement) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		System.out.println("Before Using Replace: " + str);
		return str.replace(target, replacement);
	}
}
