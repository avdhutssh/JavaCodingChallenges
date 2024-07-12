package Java.InterviewQuestions;

import java.util.Arrays;

public class _71_Median_Of_Array {

	public static void main(String[] args) {
//		The median is a measure of central tendency that represents the middle value of a data set. 
//		If the data set is sorted, the median is:
//		The middle element if the number of elements (n) is odd.
//		The average of the two middle elements if n is even.

		int[] nums1 = { 1, 3, 4, 2, 7, 5 }; // 3.5
		int[] nums2 = { 3, 5, 1, 4, 2 }; // 3

		System.out.println(_01_By_Sorting_Array(nums1));
		System.out.println(_01_By_Sorting_Array(nums2));
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

}
