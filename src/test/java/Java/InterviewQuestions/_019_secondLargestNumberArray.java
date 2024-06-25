package Java.InterviewQuestions;

public class _019_secondLargestNumberArray {

	public static void main(String[] args) {
		int[] arr1 = { 2, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 11
		int[] arr2 = { 2, 100, 10, 50, 300 }; // 100

		System.out.println(_01_Using_Linear_Scan(arr1));
		System.out.println(_01_Using_Linear_Scan(arr2));

	}

	private static int _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		if(arr.length<2) {
			throw new IllegalArgumentException("Array must contains atleast 2 elements");
		}
		int largest = 0, secondLargest = 0;
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

}
