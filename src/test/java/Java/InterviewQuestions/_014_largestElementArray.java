package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class _014_largestElementArray {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2 }; // 100

		System.out.println(_01_Using_Linear_Scan(arr));

		System.out.println(_02_Using_BruteForceApproach(arr));

		System.out.println(_03_Using_Stream(arr));

		System.out.println(_04_Using_Priority_Queue(arr));

		System.out.println(_05_Using_Tree_Set(arr));
	}

	static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int largestElement = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestElement)
				largestElement = arr[i];
		}

		return largestElement;

	}

	static int _02_Using_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < arr.length; i++) {
			boolean isLargest = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					isLargest = false;
					break;
				}
			}
			if (isLargest) {
				return arr[i];
			}
		}
		return -1;
	}

	static int _03_Using_Stream(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		return Arrays.stream(arr).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
	}

	static int _04_Using_Priority_Queue(int[] arr) {
		// Time complexity: O(n+log(n))
		// Space complexity: O(n)
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int num : arr) {
			maxHeap.add(num);
		}
		return maxHeap.peek();
	}

	static int _05_Using_Tree_Set(int[] arr) {
		// Time complexity: O(nlog(n))
		// Space complexity: O(n)
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int num : arr) {
			ts.add(num);
		}
		return ts.last();
	}
}
