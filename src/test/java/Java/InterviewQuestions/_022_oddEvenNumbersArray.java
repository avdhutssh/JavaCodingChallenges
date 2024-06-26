package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _022_oddEvenNumbersArray {

	public static void main(String[] args) {
		int[] arr = { 23, 55, 54, 9, 76, 66, 2, 91 }; // Even: 54 76 66 2 | Odd: 23 55 9 91
		_01_Using_Linear_Scan(arr);
		_02_Using_Two_Arrays(arr);
		_03_Using_Streams(arr);
	}

	private static void _01_Using_Linear_Scan(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
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

	private static void _02_Using_Two_Arrays(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int[] even = new int[arr.length];
		int[] odd = new int[arr.length];
		int evenCount = 0, oddCount = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				even[evenCount++] = num;
			} else {
				odd[oddCount++] = num;
			}
		}
		System.out.println("Even: " + Arrays.toString(Arrays.copyOf(even, evenCount)) + " | Odd: "
				+ Arrays.toString(Arrays.copyOf(odd, oddCount)));
	}

	private static void _03_Using_Streams(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		List<Integer> even = Arrays.stream(arr).filter(num -> num % 2 == 0).boxed().collect(Collectors.toList());
		List<Integer> odd = Arrays.stream(arr).filter(num -> num % 2 != 0).boxed().collect(Collectors.toList());
		System.out.println("Even: " + even + " | Odd: " + odd);
	}
}
