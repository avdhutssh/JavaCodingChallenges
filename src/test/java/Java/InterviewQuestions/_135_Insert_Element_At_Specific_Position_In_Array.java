package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _135_Insert_Element_At_Specific_Position_In_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // [1, 2, 3, 4, 50, 5, 6, 7, 8, 9, 10]
		int element = 50;
		int position = 5;

		System.out.println(Arrays.toString(_01_Using_BruteForceApproach(arr, position, element)));
		System.out.println(Arrays.toString(_02_Using_List(arr, position, element)));
	}

	private static int[] _01_Using_BruteForceApproach(int[] arr, int position, int element) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int[] newArr = new int[arr.length + 1];
		for (int i = 0; i < newArr.length; i++) {
			if (i < position - 1) {
				newArr[i] = arr[i];
			} else if (i == position - 1) {
				newArr[i] = element;
			} else {
				newArr[i] = arr[i - 1];
			}
		}
		return newArr;
	}

	private static Object[] _02_Using_List(int[] arr, int position, int element) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			list.add(num);
		}

		list.add(position - 1, element);
		return list.toArray();
	}

}
