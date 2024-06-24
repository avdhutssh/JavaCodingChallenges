package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class _013_ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 }; // 5, 4, 3, 2, 1
		Arrays.stream(_01_UsingSimpleLoop(arr)).forEach(value -> System.out.print(value + " "));
		System.out.println("\n" + "---------------------------------");

		Stack<Integer> reversedStack = _02_ReverseArrayUsingStack(arr);
		while (!reversedStack.isEmpty())
			System.out.print(reversedStack.pop() + " ");

		System.out.println("\n" + "---------------------------------");
		Arrays.stream(_03_Using_Two_Pointer_Technique(arr)).forEach(value -> System.out.print(value + " "));

	}

	private static int[] _01_UsingSimpleLoop(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int[] reverseArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reverseArr[i] = arr[arr.length - 1 - i];
		}
		return reverseArr;
	}

	private static Stack<Integer> _02_ReverseArrayUsingStack(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		Stack<Integer> st = new Stack<Integer>();
		for (int num : arr) {
			st.push(num);
		}
		return st;
	}

	private static int[] _03_Using_Two_Pointer_Technique(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}
}
