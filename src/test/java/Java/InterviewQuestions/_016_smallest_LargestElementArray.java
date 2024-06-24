package Java.InterviewQuestions;

public class _016_smallest_LargestElementArray {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 1, 2 }; // smallest : 1, Largest : 100

		_01_Using_Linear_Search(arr);

	}

	private static void _01_Using_Linear_Search(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int smallest = arr[0];
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
			else if (arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.println("Smallest number: " + smallest + " , Largest number: " + largest);
	}

}
