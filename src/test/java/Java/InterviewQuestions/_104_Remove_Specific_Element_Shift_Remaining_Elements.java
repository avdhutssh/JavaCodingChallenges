package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _104_Remove_Specific_Element_Shift_Remaining_Elements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; // element = 3, Output: arr[] = { 1, 2, 4, 5 }
		System.out.println("Using BFA: " + Arrays.toString(_01_Using_BruteForceApproach(arr, 3)));
		System.out.println("Using List: " + Arrays.toString(_02_Using_List(arr, 3)));
		System.out.print("Using InPlace Removal and Stream: ");
		Arrays.stream(arr, 0, _03_Using_InPlaceRemoval(arr, 3)).forEach(e -> System.out.print(e + " "));

	}

	private static int[] _01_Using_BruteForceApproach(int[] arr, int element) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int[] result = new int[arr.length - 1];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				result[j++] = arr[i];
			}

		}
		return result;
	}

	private static int[] _02_Using_List(int[] arr, int element) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				al.add(arr[i]);
			}
		}
		int[] result = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			result[i] = al.get(i);
		}
		return result;
	}

	private static int _03_Using_InPlaceRemoval(int[] arr, int element) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				arr[index++] = arr[i];
			}

		}
		return index;
	}

}
