package Java.InterviewQuestions;

import java.util.Arrays;

public class _104_Remove_Specific_Element_Shift_Remaining_Elements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; //element = 3, Output: arr[] = { 1, 2, 4, 5 }
		System.out.println("Using BFA: " + Arrays.toString(_01_Using_BruteForceApproach(arr,3)));
				

	}

	private static int[] _01_Using_BruteForceApproach(int[] arr,int element) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int[] result = new int[arr.length-1];
		int j =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=element) {
				result[j++] = arr[i];
			}
			
		}
		return result;
	}

}
