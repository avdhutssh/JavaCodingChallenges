package Java.InterviewQuestions;

import java.util.Arrays;

public class _018_AscedingOrderArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 2, 8, 7, 1 }; // 1 2 5 7 8

		System.out.println(Arrays.toString(_01_Using_Arrays_Sort(arr)));

	}

	static int[] _01_Using_Arrays_Sort(int[] arr) {
		// Time complexity: O(nlog(n))
		// Space complexity: O(n)
		int[] sortedArr = arr.clone();
		Arrays.sort(sortedArr);
		return sortedArr;

	}
}
