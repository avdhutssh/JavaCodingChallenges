package Java.InterviewQuestions;

public class _129_Max_Diff_In_Array_And_Their_Indexes {

	public static void main(String[] args) {

		int[] arr1 = { 6, 1, 3, 7, 8, 4, 1 }; // diff =7 and index[1,4] where (j>i)
		_01_UsingBruteForceApproach(arr1);
		_02_UsingOptimizedApproach(arr1);

	}

	private static void _01_UsingBruteForceApproach(int[] arr) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(1)

		System.out.println("Using Brute Force Approach: ");
		int maxDiff = Integer.MIN_VALUE;
		int indexI = -1;
		int indexJ = -1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = arr[j] - arr[i];
				if (diff > maxDiff) {
					maxDiff = diff;
					indexI = i;
					indexJ = j;
				}
			}
		}

		System.out.println("Difference: " + maxDiff);
		System.out.println("Index: [" + indexI + ", " + indexJ + "]");

//        return new int[] {maxDiff, indexI, indexJ};
	}

	private static void _02_UsingOptimizedApproach(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		System.out.println("Using Optimized Approach: ");

		int maxDiff = Integer.MIN_VALUE;
		int minElement = arr[0];
		int indexI = -1;
		int indexJ = -1;

		for (int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i] - minElement;
			if (diff > maxDiff) {
				maxDiff = diff;
				indexJ = i;
			}
			if (arr[i] < minElement) {
				minElement = arr[i];
				indexI = i;
			}

		}

		System.out.println("Difference: " + maxDiff);
		System.out.println("Index: [" + indexI + ", " + indexJ + "]");

//        return new int[] {maxDiff, indexI, indexJ};
	}
}
