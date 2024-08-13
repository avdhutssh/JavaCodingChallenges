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

}
