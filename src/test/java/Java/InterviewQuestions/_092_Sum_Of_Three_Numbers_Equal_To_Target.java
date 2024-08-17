package Java.InterviewQuestions;

public class _092_Sum_Of_Three_Numbers_Equal_To_Target {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 12 };
		int target = 21;
		_01_Using_BruteForceApproach(arr, target);

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

}
