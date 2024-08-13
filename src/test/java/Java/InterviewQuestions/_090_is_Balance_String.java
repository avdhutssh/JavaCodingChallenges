package Java.InterviewQuestions;

import java.util.Stack;

public class _090_is_Balance_String {

	public static void main(String[] args) {
		System.out.println(_01_Using_Stack("[{()}]")); // true
		System.out.println(_01_Using_Stack("[({(})]")); // false
		System.out.println(_01_Using_Stack("{[}")); // false
		System.out.println(_01_Using_Stack("({}{}([{}]))")); // true
		System.out.println(_01_Using_Stack("({")); // false
		System.out.println(_01_Using_Stack("{[[(])]}")); // false
		System.out.println("--------------------------------------------");
		System.out.println(_02_Using_Recursion("[{()}]")); // true
		System.out.println(_02_Using_Recursion("[({(})]")); // false
		System.out.println(_02_Using_Recursion("{[}")); // false
		System.out.println(_02_Using_Recursion("({}{}([{}]))")); // true
		System.out.println(_02_Using_Recursion("({")); // false
		System.out.println(_02_Using_Recursion("{[[(])]}")); // false
	}

	private static boolean _01_Using_Stack(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Stack<Character> st = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (st.isEmpty()) {
					return false;
				}
				char last = st.pop();
				if ((ch == ')' && last != '(') || (ch == '}' && last != '{') || (ch == '[' && last != ']')) {
					return false;
				}
			}
		}
		return st.isEmpty();
	}

	private static boolean _02_Using_Recursion(String str) {
		// Time complexity: O(n^2)
		// Space complexity: O(n)
		if (str.length() == 0) {
			return true;
		}
		String reducedStr = str.replaceAll("\\(\\)", "").replaceAll("\\{\\}", "").replaceAll("\\[\\]", "");
		if (reducedStr.length() == str.length()) {
			return false;
		}
		return _02_Using_Recursion(reducedStr);
	}

}
