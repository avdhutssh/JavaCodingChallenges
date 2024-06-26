package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class _022_oddEvenNumbersArray {

	public static void main(String[] args) {
		int[] arr = { 23, 55, 54, 9, 76, 66, 2, 91 }; // Even: 54 76 66 2 | Odd: 23 55 9 91
		_01_Using_Linear_Scan(arr);
	}

	private static void _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for (int num : arr) {
			if (num % 2 == 0) {
				even.add(num);
			} else {
				odd.add(num);
			}
		}
		System.out.println("Even: " + even + " | Odd: " + odd);
	}
}
