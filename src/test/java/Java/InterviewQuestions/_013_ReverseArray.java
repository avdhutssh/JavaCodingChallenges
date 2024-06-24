package Java.InterviewQuestions;

import java.util.Arrays;

public class _013_ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };	// 5, 4, 3, 2, 1
		Arrays.stream(_01_UsingBruteForceApproach(arr)).forEach(value-> System.out.print(value+" "));
		System.out.println("\n"+ "---------------------------------");
	}

	private static int[] _01_UsingBruteForceApproach(int[] arr) {
		int[] reverseArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reverseArr[i] = arr[arr.length-1-i];
		}
		return reverseArr;	
	}
}
