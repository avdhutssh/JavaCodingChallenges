package Java.InterviewQuestions;

public class _099_Third_Largest_Number_In_Array {

	public static void main(String[] args) {
		int[] arr1 = { 2, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 10
		int[] arr2 = { 2, 100, 10, 50, 300 }; // 50
		int[] arr3 = { 2, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 10
		int[] arr4 = { 2, 100, 10, 50, 300 }; // 50

		System.out.println("Using Linear Scan: " + _01_Using_Linear_Scan(arr1));
		System.out.println("Using Linear Scan: " + _01_Using_Linear_Scan(arr2));

	}

	private static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must contains atleast 3 elements");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				thirdLargest = secondLargest;
				secondLargest = num;
			}
		}
		return thirdLargest;
	}

}
