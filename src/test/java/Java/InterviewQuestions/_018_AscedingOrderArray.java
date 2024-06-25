package Java.InterviewQuestions;

import java.util.Arrays;

public class _018_AscedingOrderArray {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 5, 2, 8, 7, 1 }; // 1 2 5 7 8
		int[] arr2 = new int[] { 5, 2, 8, 7, 1 }; // 1 2 5 7 8
		int[] arr3 = new int[] { 5, 2, 8, 7, 1 }; // 1 2 5 7 8
		int[] arr4 = new int[] { 5, 2, 8, 7, 1 }; // 1 2 5 7 8

		System.out.println("Arrays.sort: " + Arrays.toString(_01_Using_Arrays_Sort(arr1)));
		System.out.println("Bubble Sort: " + Arrays.toString(_02_Using_Bubble_Sort(arr2)));
		System.out.println("Selection Sort: " + Arrays.toString(_03_Using_Selection_Sort(arr3)));
		System.out.println("Insertion Sort: " + Arrays.toString(_04_Using_Insertion_Sort(arr4)));

	}

	static int[] _01_Using_Arrays_Sort(int[] arr) {
		// Time complexity: O(nlog(n))
		// Space complexity: O(nlogn)
		Arrays.sort(arr);
		return arr;
	}

	static int[] _02_Using_Bubble_Sort(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	static int[] _03_Using_Selection_Sort(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}
		return arr;
	}
	
	static int[] _04_Using_Insertion_Sort(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
	    for (int i = 1; i < arr.length; i++) {
	        int key = arr[i];
	        int j = i - 1;
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
	    return arr;
	}

}
