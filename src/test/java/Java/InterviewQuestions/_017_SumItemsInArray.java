package Java.InterviewQuestions;

public class _017_SumItemsInArray {

	public static void main(String[] args) {
		int[] arr = { 15, 12, 13, 10 }; // 50
		
		System.out.println(_01_Using_Linear_Search(arr));

	}

	private static int _01_Using_Linear_Search(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int sum = 0;
		for (int num : arr) {
			sum+=num;
		}
		return sum;
	}
}
