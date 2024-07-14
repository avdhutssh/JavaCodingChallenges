package Java.InterviewQuestions;

public class _73_Leader_Of_Array {

	public static void main(String[] args) {
		// A leader in an array is an element that is greater than all the elements to
		// its right side.
		// The rightmost element is always a leader.

		int[] arr = { 16, 17, 4, 3, 5, 2 }; // 17 5 2

		_01_Using_Brute_Force_Approach(arr);

	}

	private static void _01_Using_Brute_Force_Approach(int[] arr) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(1)
		System.out.print("Using BFA: ");
		for (int i = 0; i < arr.length; i++) {
			boolean isLeader = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					isLeader = false;
				}
			}
			if (isLeader) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
