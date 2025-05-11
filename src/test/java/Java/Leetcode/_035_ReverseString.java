package Java.Leetcode;

import java.util.Arrays;

public class _035_ReverseString {

	public static void main(String[] args) {

		char[] s1 = {}; // Empty array
		char[] s2 = { 'a' }; // Single character
		char[] s3 = { 'a', 'b' }; // Even number of characters
		char[] s4 = { 'h', 'e', 'l', 'l', 'o' };// Odd number of characters
		char[] s5 = { '1', '2', '3', '4', '5', '6' }; // Digits

		System.out.println(Arrays.toString(reverseString(s1))); // Output: (empty)
		System.out.println(Arrays.toString(reverseString(s2))); // Output: a
		System.out.println(Arrays.toString(reverseString(s3))); // Output: b a
		System.out.println(Arrays.toString(reverseString(s4))); // Output: o l l e h
		System.out.println(Arrays.toString(reverseString(s5))); // Output: 6 5 4 3 2 1

	}

	public static char[] reverseString(char[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}

}
