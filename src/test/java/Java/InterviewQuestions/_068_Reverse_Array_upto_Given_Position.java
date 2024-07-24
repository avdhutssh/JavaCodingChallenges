package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class _068_Reverse_Array_upto_Given_Position {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 }; // {5, 4, 3, 2, 1, 6, 7 }
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 }; // {5, 4, 3, 2, 1, 6 }
		int[] arr3 = new int[] { 1, 2, 3, 4, 5, 6 }; // {5, 4, 3, 2, 1, 6 }

		System.out.println("Using BFA : " + Arrays.toString(_01_Using_BruteForceApproach(arr1, 5)));
		System.out.println("Using BFA : " + Arrays.toString(_01_Using_BruteForceApproach(arr2, 5)));

		System.out
				.println("Using Simple loop with temp : " + Arrays.toString(_02_Using_Simple_Iteration_Temp(arr1, 5)));

		System.out.println("Using Stack : " + Arrays.toString(_03_Using_Stack(arr2, 5)));
		
		System.out.println("Using Two Pointer Approach : " + Arrays.toString(_04_Using_Two_Pointer_Approach(arr3, 5)));
	}

	private static int[] _01_Using_BruteForceApproach(int[] arr, int position) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		int[] result = new int[arr.length];
		int j = position - 1;
		for (int i = 0; i < position; i++) {
			result[i] = arr[j--];
		}
		for (int i = position; i < arr.length; i++) {
			result[i] = arr[i];
		}
		return result;
	}

	private static int[] _02_Using_Simple_Iteration_Temp(int[] arr, int position) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		for (int i = 0; i < position; i++) {
			int temp = arr[i];
			arr[i] = arr[position - 1];
			arr[position - 1] = temp;
		}

		return arr;
	}

	private static int[] _03_Using_Stack(int[] arr, int position) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < position; i++) {
			stack.push(arr[i]);
		}
		for (int i = 0; i < position; i++) {
			arr[i] = stack.pop();
		}
		return arr;
	}

	private static int[] _04_Using_Two_Pointer_Approach(int[] arr, int position) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int start = 0;
		int end = position - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
		return arr;
	}
}
