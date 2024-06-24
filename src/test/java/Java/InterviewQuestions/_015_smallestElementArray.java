package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.min;

public class _015_smallestElementArray {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 1, 2 }; // 1

		System.out.println(_01_Using_Linear_Scan(arr));

		System.out.println(_02_Using_BruteForceApproach(arr));
		
		System.out.println(_03_Using_Stream(arr));
	}

	private static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int smallestNumber = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				smallestNumber = arr[i];
			}
		}
		return smallestNumber;
	}

	private static int _02_Using_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < arr.length; i++) {
			boolean isSmallest = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					isSmallest = false;
					break;
				}
			}
			if (isSmallest) {
				return arr[i];
			}
		}
		return -1;
	}

	private static int _03_Using_Stream(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)

		return Arrays.stream(arr).min().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
	}
}
