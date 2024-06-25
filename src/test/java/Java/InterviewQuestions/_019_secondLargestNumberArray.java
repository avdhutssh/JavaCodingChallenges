package Java.InterviewQuestions;

import java.util.Arrays;

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

	}

	private static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		if(arr.length<2) {
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
		for (int i = arr.length-1; i >= 0; i--) {
			if(arr[i-1]!=arr[i]) {
				return arr[i-1];
			}		
		}
		throw new IllegalArgumentException("No Second Largest element");
	}
}
