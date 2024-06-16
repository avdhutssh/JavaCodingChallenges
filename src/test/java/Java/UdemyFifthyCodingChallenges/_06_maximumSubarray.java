package Java.UdemyFifthyCodingChallenges;

public class _06_maximumSubarray {

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, -6, 4, 2, -8, 3 }; // 6
		int[] arr2 = { 2, 3, -1, 4, -10, 2, 5 }; // 8
		int[] arr3 = { -3, -1, -2 }; // -1

		System.out.println(_01_BruteForceApproach(arr1));
		System.out.println(_01_BruteForceApproach(arr2));
		System.out.println(_01_BruteForceApproach(arr3));
		System.out.println("------------------------------");

		System.out.println(_02_Kadanes_algorithm(arr1));
		System.out.println(_02_Kadanes_algorithm(arr2));
		System.out.println(_02_Kadanes_algorithm(arr3));

	}

	public static int _01_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^3)
		// Space complexity: O(1)
		int maxSum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int actualSum = 0;
				for (int k = i; k <= j; k++) {
					actualSum += arr[k];
				}
				maxSum = Math.max(maxSum, actualSum);
			}
		}
		return maxSum;
	}

	public static int _02_Kadanes_algorithm(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int maxSum = arr[0], currentSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
