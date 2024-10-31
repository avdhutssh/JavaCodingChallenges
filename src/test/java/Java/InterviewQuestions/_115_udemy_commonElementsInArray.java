package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _115_udemy_commonElementsInArray {

	public static void main(String[] args) {

		int[] array1A = { 1, 3, 4, 6, 7, 9 };
		int[] array2A = { 1, 2, 4, 5, 9, 10 };
		// commonElements(array1A, array2A) should return [1, 4, 9] (an array).

		int[] array1B = { 1, 2, 9, 10, 11, 12 };
		int[] array2B = { 0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15 };
		// commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

		int[] array1C = { 0, 1, 2, 3, 4, 5 };
		int[] array2C = { 6, 7, 8, 9, 10, 11 };
		// common_elements(array1C, array2C) should return [] (an empty array).
		System.out.println(Arrays.toString(_01_Using_HashSet(array1A, array2A)));
		System.out.println(Arrays.toString(_01_Using_HashSet(array1B, array2B)));
		System.out.println(Arrays.toString(_01_Using_HashSet(array1C, array2C)));

		System.out.println("---------------------------------------");

		System.out.println(Arrays.toString(_02_Optimize(array1A, array2A)));
		System.out.println(Arrays.toString(_02_Optimize(array1B, array2B)));
		System.out.println(Arrays.toString(_02_Optimize(array1C, array2C)));

	}

	private static Integer[] _01_Using_HashSet(int[] array1, int[] array2) {
		// Time Complexity: O(n+m)
		// Space Complexity: O(n+min(n,m))
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		for (int num : array1) {
			hs.add(num);
		}
		for (int num : array2) {
			if (!hs.add(num)) {
				al.add(num);
			}
		}
		Integer[] resultInArray = new Integer[al.size()];
		return al.toArray(resultInArray);

	}

	private static Integer[] _02_Optimize(int[] array1, int[] array2) {
		// Time Complexity: O(n+m)
		// Space Complexity: O(min(n,m))
		ArrayList<Integer> al = new ArrayList<>();
		int left = 0;
		int right = 0;
		while (left < array1.length && right < array2.length) {
			if (array1[left] < array2[right]) {
				left++;
			} else if (array1[left] > array2[right]) {
				right++;
			} else {
				al.add(array1[left]);
				left++;
				right++;
			}
		}
		Integer[] resultInArray = new Integer[al.size()];
		return al.toArray(resultInArray);

	}
}
