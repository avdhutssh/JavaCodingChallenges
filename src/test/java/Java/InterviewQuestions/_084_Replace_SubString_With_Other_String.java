package Java.InterviewQuestions;

public class _084_Replace_SubString_With_Other_String {
	public static void main(String[] args) {
		String str1 = "Learn Lead and Succeed in Efforts";
		String toBeReplaced = "in";
		String toReplacedWith = "with";

		System.out.println("Using Array and split: " + _01_Using_Array(str1, toBeReplaced, toReplacedWith));
		System.out.println("Using Replace method: " + _02_Using_Replace(str1, toBeReplaced, toReplacedWith));
		System.out.println("Using ReplaceAll method: " + _03_Using_ReplaceAll(str1, toBeReplaced, toReplacedWith));
		System.out.println("Using indexOf method: " + _04_Using_IndexOf_Method(str1, toBeReplaced, toReplacedWith));

	}

	private static String _01_Using_Array(String str, String toBeReplaced, String toReplacedWith) {
		// Time Complexity: O(n+k)
		// Space Complexity: O(n)
		String[] strArr = str.split(toBeReplaced);
		StringBuilder result = new StringBuilder();
		result.append(strArr[0]).append(toReplacedWith).append(strArr[1]);
//		for (int i = 0; i <= strArr.length - 1; i++) {
//			String st = strArr[i];
//			result += st;
//			if (i != strArr.length - 1) {
//				result += toReplacedWith;
//			}
//		}
		return result.toString();
	}

	private static String _02_Using_Replace(String str, String target, String replacement) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		return str.replace(target, replacement);
	}

	private static String _03_Using_ReplaceAll(String str, String target, String replacement) {
		// Time Complexity: O(n)
		// Space Complexity: O(n);
		return str.replaceAll(target, replacement);
	}

	private static String _04_Using_IndexOf_Method(String str, String target, String replacement) {
		// Time Complexity: O(n+m*k)
		// Space Complexity: O(n)
		StringBuilder result = new StringBuilder();
		int targetLen = target.length();
		int start = 0;
		int index;

		while ((index = str.indexOf(target, start)) != -1) {
			result.append(str, start, index).append(replacement);
			start = index + targetLen;
		}
		result.append(str.substring(start));
		return result.toString();
	}
}
