package Java.InterviewQuestions;

import java.util.Stack;

public class _73_Leader_Of_Array {

	public static void main(String[] args) {
		// A leader in an array is an element that is greater than all the elements to
		// its right side.
		// The rightmost element is always a leader.

		int[] arr = { 16, 17, 4, 3, 5, 2 }; // 17 5 2

		_01_Using_Brute_Force_Approach(arr);
		System.out.println("\n" + "----------------------------");

		_02_Using_Pointer_Simple_Iteration(arr);
		System.out.println("\n" + "----------------------------");

		System.out.println("Using Stack: " + _03_Using_Stack(arr));

	}

	private static void _01_Using_Brute_Force_Approach(int[] arr) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(1)
		System.out.print("Using BFA: ");
		for (int i = 0; i < arr.length; i++) {
			boolean isLeader = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					isLeader = false;
				}
			}
			if (isLeader) {
				System.out.print(arr[i] + " ");
			}
		}

	}

	private static void _02_Using_Pointer_Simple_Iteration(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int n = arr.length;
		int maxRight = arr[n - 1];
		System.out.print("Using Pointer and Simple Iteration: " + maxRight + " ");
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > maxRight) {
				maxRight = arr[i];
				System.out.print(arr[i] + " ");
			}
		}

	}

	private static Stack<Integer> _03_Using_Stack(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		Stack<Integer> stack = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (stack.isEmpty() || arr[i] > stack.peek()) {
				stack.push(arr[i]);
			}

		}
		return stack;
	}
}
