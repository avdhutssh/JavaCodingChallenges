package Java.InterviewQuestions;

import java.util.HashSet;

public class _47_missingNumberInGivenArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6 }; // 4

		System.out.println("Using BFA : " + _01_Using_Brute_Force_Approach(arr));
		System.out.println("Using HashSet : " + _02_Using_HashSet(arr));

	}

	private static int _01_Using_Brute_Force_Approach(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int n = arr.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int num : arr) {
			actualSum += num;
		}
		return expectedSum - actualSum;
	}

	private static int _02_Using_HashSet(int[] arr) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		HashSet<Integer> hs = new HashSet<>();
		for (int num : arr) {
			hs.add(num);
		}
		for (int i = 1; i <= arr.length; i++) {
			if (!hs.contains(i)) {
				return i;
			}
		}
		return -1;
	}
}
