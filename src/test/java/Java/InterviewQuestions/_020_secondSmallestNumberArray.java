package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class _020_secondSmallestNumberArray {

	public static void main(String[] args) {
		int[] arr1 = { 3, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 3
		int[] arr2 = { 500, 100, 10, 50, 300 }; // 50
		int[] arr3 = { 3, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 3
		int[] arr4 = { 500, 100, 10, 50, 300 }; // 50

		System.out.println(_01_Using_Linear_Scan(arr1));
		System.out.println(_01_Using_Linear_Scan(arr2));

		System.out.println(_02_By_Sorting_Array(arr3));
		System.out.println(_02_By_Sorting_Array(arr4));

		System.out.println(_03_By_Using_Priority_Queue(arr1));
		System.out.println(_03_By_Using_Priority_Queue(arr2));

		System.out.println(_04_By_Using_Tree_Set(arr1));
		System.out.println(_04_By_Using_Tree_Set(arr2));

	}

	private static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must have atleast 2 elements");
		}

		int secondSmallest = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}

		if (secondSmallest == Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Arrays does not have second smallest number");
		}

		return secondSmallest;
	}

	private static int _02_By_Sorting_Array(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(1)
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[i + 1]) {
				return arr[i + 1];
			}
		}

		throw new IllegalArgumentException("No Second Largest element");
	}

	private static int _03_By_Using_Priority_Queue(int[] arr) {
		// Time complexity: O(nlogk)
		// Space complexity: O(1)
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		Set<Integer> uniqueElements = new HashSet<Integer>();
		for (int num : arr) {
			if (uniqueElements.add(num)) {
				maxHeap.offer(num);
				if (maxHeap.size() > 2) {
					maxHeap.poll();
				}
			}

		}

		return maxHeap.poll();
	}

	private static int _04_By_Using_Tree_Set(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(n)
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int num : arr) {
			ts.add(num);
		}
		return ts.higher(ts.first());
	}

}
