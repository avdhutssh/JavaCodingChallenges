package Java.InterviewQuestions;

public class _48_maximumConsecutiveOnesInarray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 }; // 5

		System.out.println(_01_Using_BruteForceApproach(arr));

	}

	private static int _01_Using_BruteForceApproach(int[] arr) {

		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {	
			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			maxCount = Math.max(maxCount, count);

		}
		return maxCount;
	}

}
