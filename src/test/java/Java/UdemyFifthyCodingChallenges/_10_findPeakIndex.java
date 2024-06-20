package Java.UdemyFifthyCodingChallenges;

public class _10_findPeakIndex {

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 8, 3 }; // 2
		int[] arr2 = { 1, 3, 4, 7, 8 }; // 4
		int[] arr3 = { 1, 5, 2, 6, 6, 3 }; // 1, 3, 4

		System.out.println(_01_ByTraversingWholeArray(arr1));
		System.out.println(_01_ByTraversingWholeArray(arr2));
		System.out.println(_01_ByTraversingWholeArray(arr3));
		System.out.println("-----------------------------------");
	}

	private static int _01_ByTraversingWholeArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if ((i == 0 || arr[i] >= arr[i - 1]) && (i == arr.length - 1 || arr[i] >= arr[i + 1]))
				return i;
		}

		return 0;
	}

}