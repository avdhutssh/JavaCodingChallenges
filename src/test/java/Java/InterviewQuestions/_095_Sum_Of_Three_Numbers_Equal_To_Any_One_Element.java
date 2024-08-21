package Java.InterviewQuestions;

public class _095_Sum_Of_Three_Numbers_Equal_To_Any_One_Element {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 8, 1, 9, 5 };
		_01_Using_BruteForceApproach(arr);

	}

	private static void _01_Using_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^4)
		// Space complexity: O(1)
		System.out.println("Using Brute Force: ");
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					for (int l = 0; l < n; l++) {
						if (arr[l] == sum) {
							System.out
									.println("Triplets for " + arr[l] + " are: " + arr[i] + " " + arr[j] + " " + arr[k]);
						}
					}
				}
			}
		}
	}
}
