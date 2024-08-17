package Java.InterviewQuestions;

import java.util.Arrays;

public class _092_Sum_Of_Three_Numbers_Equal_To_Target {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 15, 12 };
		int target = 21;
		_01_Using_BruteForceApproach(arr, target);
		_02_Using_TwoPointerApproach_Sorting(arr, target);

	}

	private static void _01_Using_BruteForceApproach(int[] arr, int target) {
		// Time complexity: O(n^3)
		// Space complexity: O(1)
		System.out.println("Using Brute Force: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}

		}
	}

	private static void _02_Using_TwoPointerApproach_Sorting(int[] arr, int target) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		System.out.println("Using Two Pointer Approach with Sorting: ");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int left = i + 1;
			int right = arr.length - 1;
			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if (sum == target) {
					System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
					left++;
					right--;
				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
			}

		}
	}
}
