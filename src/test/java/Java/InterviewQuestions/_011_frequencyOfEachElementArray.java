package Java.InterviewQuestions;

public class _011_frequencyOfEachElementArray {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 20, 10, 10, 20, 5, 20 }; // 10 3 20 4 5 1

		_01_Using_BruteForceApproach(arr1);
	}

	private static void _01_Using_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(n)
		boolean[] visited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				int freq = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						visited[j] =true;
						freq++;
					}
				}
				System.out.println(arr[i] + " : " + freq);
			}
		}
	}

}
