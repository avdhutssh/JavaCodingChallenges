package Java.InterviewQuestions;

import java.util.Arrays;

public class _018_AscedingOrderArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 2, 8, 7, 1 }; // 1 2 5 7 8
		int[] arr1 = new int[] { 5, 2, 8, 7, 1 }; // 1 2 5 7 8

		System.out.println(Arrays.toString(_01_Using_Arrays_Sort(arr)));
		System.out.println("Bubble Sort: " + Arrays.toString(_02_Using_Bubble_Sort(arr1)));

	}

	static int[] _01_Using_Arrays_Sort(int[] arr) {
		// Time complexity: O(nlog(n))
		// Space complexity: O(n)
		int[] sortedArr = arr.clone();
		Arrays.sort(sortedArr);
		return sortedArr;
	}

	static int[] _02_Using_Bubble_Sort(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
