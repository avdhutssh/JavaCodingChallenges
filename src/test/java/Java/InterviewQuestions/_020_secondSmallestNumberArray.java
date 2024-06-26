package Java.InterviewQuestions;

public class _020_secondSmallestNumberArray {

	public static void main(String[] args) {
		int[] arr1 = { 3, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 3
		int[] arr2 = { 500, 100, 10, 50, 300 }; // 50
		int[] arr3 = { 3, 100, 10, 100, 2, 10, 11, 2, 11, 2 }; // 3
		int[] arr4 = { 500, 100, 10, 50, 300 }; // 50

		System.out.println(_01_Using_Linear_Scan(arr1));
		System.out.println(_01_Using_Linear_Scan(arr2));

//		System.out.println(_02_By_Sorting_Array(arr3));
//		System.out.println(_02_By_Sorting_Array(arr4));
//
//		System.out.println(_03_By_Using_Priority_Queue(arr1));
//		System.out.println(_03_By_Using_Priority_Queue(arr2));
//		
//		System.out.println(_04_By_Using_Tree_Set(arr1));
//		System.out.println(_04_By_Using_Tree_Set(arr2));

	}

	private static int _01_Using_Linear_Scan(int[] arr) {

		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must have atleast 2 elements");
		}

		int secondSmallest = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}

		if (secondSmallest == Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Arrays does not have second smallest number");
		}

		return secondSmallest;
	}

}
