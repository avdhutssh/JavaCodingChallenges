package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.min;

public class _019_secondLargestNumberArray {

	public static void main(String[] args) {
		int[] arr1 = { 2, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 11
		int[] arr2 = { 2, 100, 10, 50, 300 }; // 100
		int[] arr3 = { 2, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 11
		int[] arr4 = { 2, 100, 10, 50, 300 }; // 100

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
			throw new IllegalArgumentException("Array must contains atleast 2 elements");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("There is no second largest element");
		}

		return secondLargest;
	}

	private static int _02_By_Sorting_Array(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(1)
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i - 1] != arr[i]) {
				return arr[i - 1];
			}
		}
		throw new IllegalArgumentException("No Second Largest element");
	}

	private static int _03_By_Using_Priority_Queue(int[] arr) {
		// Time complexity: O(nlogk)
		// Space complexity: O(1)
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(2);
		Set<Integer> unique = new HashSet<Integer>();
		for (int num : arr) {
			if (unique.add(num)) {
				minHeap.offer(num);
				if (minHeap.size() > 2) {
					minHeap.poll();
				}
			}
		}
		return minHeap.poll();
	}

	private static int _04_By_Using_Tree_Set(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(n)
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int num : arr) {
			ts.add(num);
		}

		return ts.lower(ts.last());
	}

}
