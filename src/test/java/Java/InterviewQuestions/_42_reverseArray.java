package Java.InterviewQuestions;

import java.util.Arrays;

public class _42_reverseArray {

	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'c', 'd', 'e' }; // e d c b a
		char[] arr2 = { 'a', 'b', 'c', 'd', 'e' }; // e d c b a

		System.out.println("Using Temp Array: " + Arrays.toString(_01_Using_Temp_array(arr1)));
		System.out.println("Using Two Pointer Technique: " + Arrays.toString(_02_Using_Two_Pointer_Technique(arr2)));

	}

	private static char[] _01_Using_Temp_array(char[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		char[] temp = new char[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length - 1 - i];

		}
		return temp;
	}

	private static char[] _02_Using_Two_Pointer_Technique(char[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
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
