package Java.InterviewQuestions;

public class _014_largestElementArray {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2 }; // 100

		System.out.println(_01_Using_Linear_Scan(arr));
	}

	static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int largestElement = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestElement)
				largestElement = arr[i];
		}

		return largestElement;

	}
}
