package Java.InterviewQuestions;

import java.util.Arrays;

public class _016_smallest_LargestElementArray {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 1, 2 }; // smallest : 1, Largest : 100

		_01_Using_Linear_Search(arr);
		Arrays.stream(_02_Using_Linear_Search_Optimize(arr)).forEach(value -> System.out.print(value +" "));

	}

	private static void _01_Using_Linear_Search(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int smallest = arr[0];
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
			else if (arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.println("Smallest number: " + smallest + " , Largest number: " + largest);
	}

	private static int[] _02_Using_Linear_Search_Optimize(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array is empty or null");
		}

		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			largest = arr[i] >= largest ? arr[i] : largest;
			smallest = arr[i] <= smallest ? arr[i] : smallest;
		}
		return new int[] { smallest, largest };
	}
}
