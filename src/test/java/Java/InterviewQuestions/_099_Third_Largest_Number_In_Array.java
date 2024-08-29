package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class _099_Third_Largest_Number_In_Array {

	public static void main(String[] args) {
		int[] arr1 = { 2, 100, 10, 100, 5, 10, 11, 5, 11, 2 }; // 10
		int[] arr2 = { 2, 100, 10, 50, 300 }; // 50
		int[] arr3 = { 2, 100, 10, 100, 5, 10, 11, 5, 11, 2 }; // 10
		int[] arr4 = { 2, 100, 10, 50, 300 }; // 50

		System.out.println("Using Linear Scan: " + _01_Using_Linear_Scan(arr1));
		System.out.println("Using Linear Scan: " + _01_Using_Linear_Scan(arr2));

		System.out.println("By Sorting the Array: " + _02_By_Sorting_Array(arr1));
		System.out.println("By Sorting the Array: " + _02_By_Sorting_Array(arr2));

		System.out.println("Using Priority Queue: " + _03_Using_PriorityQueue(arr1));
		System.out.println("Using Priority Queue: " + _03_Using_PriorityQueue(arr2));
	}

	private static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must contains atleast 3 elements");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				thirdLargest = secondLargest;
				secondLargest = num;
			}
		}
		return thirdLargest;
	}

	private static int _02_By_Sorting_Array(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(1)
		Arrays.sort(arr);
		int uniqueCount = 0;
		int thirdLargest = 0;
		// [2, 2, 2, 2, 10, 10, 11, 11, 100, 100]

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i - 1] != arr[i]) {
				uniqueCount++;
				thirdLargest = arr[i];
			}
			if (uniqueCount == 3) {
				return thirdLargest;
			}
		}
		throw new IllegalArgumentException("No Second Largest element");

	}

	private static int _03_Using_PriorityQueue(int[] arr) {
		// Time complexity:O(n) =>  O(nlogk) as k= 3 -> O(nlog3) > O(n)
		// Space complexity: O(n)
		if (arr == null || arr.length < 3) {
			throw new IllegalArgumentException("Array should have at least 3 elements");
		}

		Set<Integer> uniqueNumbers = new HashSet<>();
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(3);

		for (int num : arr) {
			if (uniqueNumbers.add(num)) {
				if (minHeap.size() < 3) {
					minHeap.offer(num);
				} else if (num > minHeap.peek()) {
					minHeap.poll();
					minHeap.offer(num);
				}
			}
		}
		return minHeap.peek();

	}

}
