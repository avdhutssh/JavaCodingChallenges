package Java.InterviewQuestions;

public class _021_secondSmallest_LargestNumberArray {

	public static void main(String[] args) {
		int[] arr1 = { 3, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // SecondSmallest: 3 , SecondLargest: 11
		int[] arr2 = { 500, 100, 10, 50, 300 }; // SecondSmallest: 50 , SecondLargest: 300

		_01_Using_Linear_Scan(arr1);
		_01_Using_Linear_Scan(arr2);
	}

	private static void _01_Using_Linear_Scan(int[] arr) {

		int secondSmallest = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			} else if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}

		System.out.println("SecondSmallest: " + secondSmallest + " , SecondLargest: " + secondLargest);
	}
}
