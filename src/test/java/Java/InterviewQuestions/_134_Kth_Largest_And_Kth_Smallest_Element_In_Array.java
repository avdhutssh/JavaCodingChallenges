package Java.InterviewQuestions;

import java.util.Arrays;

public class _134_Kth_Largest_And_Kth_Smallest_Element_In_Array {

	public static void main(String[] args) {
		int[] arr1 = { 12, 3, 5, 7, 19 }; // 5 , 12
		int[] arr2 = { 12, 3, 5, 7, 19 }; // 5 , 12
		int[] arr3 = { 12 }; // null
		int K = 2;

		_01_By_Using_InBuilt_Sorting_Array(arr1, K);
		_01_By_Using_InBuilt_Sorting_Array(arr3, K);
	}

	private static void _01_By_Using_InBuilt_Sorting_Array(int[] arr, int K) {
		// Time complexity: O(nlog(n))
		// Space complexity: O(1)

		if (arr.length < K) {
			System.out.println("Array size is less than K");
			return;
		}
		
		Arrays.sort(arr);
		System.out.println("Kth Smallest: " + arr[K] + "\nKth Largest: " + arr[arr.length - K]);
	}

}
