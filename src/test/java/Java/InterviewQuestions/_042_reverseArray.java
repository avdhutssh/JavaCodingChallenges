package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class _042_reverseArray {

	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'c', 'd', 'e' }; // e d c b a
		char[] arr2 = { 'a', 'b', 'c', 'd', 'e' }; // e d c b a
		char[] arr3 = { 'a', 'b', 'c', 'd', 'e' }; // e d c b a
		Character[] arr4 = { 'a', 'b', 'c', 'd', 'e' }; // e d c b a

		System.out.println("Using Temp Array: " + Arrays.toString(_01_Using_Temp_array(arr1)));
		System.out.println("Using Two Pointer Technique: " + Arrays.toString(_02_Using_Two_Pointer_Technique(arr2)));
		System.out.println("Using Stack: " + Arrays.toString(_03_Using_Stack(arr3)));
		System.out.println("Using Collection: " + Arrays.toString(_04_Using_Collections(arr4)));

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

	private static char[] _03_Using_Stack(char[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Stack<Character> stack = new Stack<Character>();
		for (char ch : arr) {
			stack.add(ch);
		}

		char[] reversedArr = new char[arr.length];
		int i = 0;
		while (!stack.isEmpty()) {
			reversedArr[i] = stack.pop();
			i++;
		}
		return reversedArr;
	}

	private static Character[] _04_Using_Collections(Character[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		List<Character> list = Arrays.asList(arr);
		Collections.reverse(list);
		return list.toArray(new Character[0]);
	}

}
