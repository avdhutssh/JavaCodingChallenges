package Java.Leetcode;

import java.util.*;

public class _031_ValidParentheses {

    public static void main(String[] args) {
        System.out.println(_01_isValid("()"));              // true
        System.out.println(_01_isValid("()[]{}"));          // true
        System.out.println(_01_isValid("(]"));              // false
        System.out.println(_01_isValid("([)]"));            // false
        System.out.println(_01_isValid("{[]}"));            // true
        System.out.println(_01_isValid(""));                // true
        System.out.println(_01_isValid("("));               // false
        System.out.println(_01_isValid("]"));               // false
        System.out.println(_01_isValid("(((((["));          // false
    }

    static boolean _01_isValid(String s) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                char topElement = st.isEmpty() ? '#' : st.pop();
                if (topElement != hm.get(ch)) {
                    return false;
                }
            } else {
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
