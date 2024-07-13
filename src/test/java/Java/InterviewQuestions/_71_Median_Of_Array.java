package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _71_Median_Of_Array {

	public static void main(String[] args) {
//		The median is a measure of central tendency that represents the middle value of a data set. 
//		If the data set is sorted, the median is:
//		The middle element if the number of elements (n) is odd.
//		The average of the two middle elements if n is even.

		int[] nums1 = { 1, 3, 4, 2, 7, 5 }; // 3.5
		int[] nums2 = { 3, 5, 1, 4, 2 }; // 3
		int[] nums3 = { 1, 3, 4, 2, 7, 5 }; // 3.5
		int[] nums4 = { 3, 5, 1, 4, 2 }; // 3

		System.out.println("Using Sorting: "+_01_By_Sorting_Array(nums1));
		System.out.println("Using Sorting: "+_01_By_Sorting_Array(nums2));

		System.out.println("Using Heap: "+_02_Using_Heap(nums3));
		System.out.println("Using Heap: "+_02_Using_Heap(nums4));
	}

	private static double _01_By_Sorting_Array(int[] nums) {
		// Time Complexity: O(nlogn)
		// Space Complexity: O(1)
		Arrays.sort(nums);
		int n = nums.length;
		if (n % 2 == 1) {
			return nums[n / 2];
		} else {
			return (nums[(n / 2) - 1] + nums[n / 2]) / 2.0;
		}
	}

	private static double _02_Using_Heap(int[] nums) {
		// Time Complexity: O(logn)
		// Space Complexity: O(nlogn)
//		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

		for (int num : nums) {
			maxHeap.offer(num);
			minHeap.offer(maxHeap.poll());
			if (maxHeap.size() < minHeap.size()) {
				maxHeap.offer(minHeap.poll());
			}
		}
		if (maxHeap.size() > minHeap.size()) {
			return maxHeap.peek();
		} else {
			return (maxHeap.peek() + minHeap.peek()) / 2.0;
		}
	}
}
