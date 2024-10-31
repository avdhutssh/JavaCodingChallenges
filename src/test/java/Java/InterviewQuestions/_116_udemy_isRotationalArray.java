package Java.InterviewQuestions;

public class _116_udemy_isRotationalArray {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array2a = { 4, 5, 6, 7, 8, 1, 2, 3 };
		// isRotation(array1, array2a) should return false.
		int[] array2b = { 4, 5, 6, 7, 1, 2, 3 };
		// isRotation(array1, array2b) should return true.
		int[] array2c = { 4, 5, 6, 9, 1, 2, 3 };
		// isRotation(array1, array2c) should return false.
		int[] array2d = { 4, 6, 5, 7, 1, 2, 3 };
		// isRotation(array1, array2d) should return false.
		int[] array2e = { 4, 5, 6, 7, 0, 2, 3 };
		// isRotation(array1, array2e) should return false.
		int[] array2f = { 1, 2, 3, 4, 5, 6, 7 };
		// isRotation(array1, array2f) should return true.

		System.out.println(_01_ConcatenateApproach(array1, array2a));
		System.out.println(_01_ConcatenateApproach(array1, array2b));
		System.out.println(_01_ConcatenateApproach(array1, array2c));
		System.out.println(_01_ConcatenateApproach(array1, array2d));
		System.out.println(_01_ConcatenateApproach(array1, array2e));
		System.out.println(_01_ConcatenateApproach(array1, array2f));

		System.out.println("----------------------------------------");

		System.out.println(_02_Optimize(array1, array2a));
		System.out.println(_02_Optimize(array1, array2b));
		System.out.println(_02_Optimize(array1, array2c));
		System.out.println(_02_Optimize(array1, array2d));
		System.out.println(_02_Optimize(array1, array2e));
		System.out.println(_02_Optimize(array1, array2f));

	}

	private static boolean _01_ConcatenateApproach(int[] arr1, int[] arr2) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		if (arr1.length != arr2.length)
			return false;

		String str1 = arrayToString(arr1);
		String str2 = arrayToString(arr2);
		String combinedStr = str1 + str1;

		return combinedStr.contains(str2);
	}

	private static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int num : arr) {
			sb.append(num).append(",");
		}
		return sb.toString();
	}

	private static boolean _02_Optimize(int[] arr1, int[] arr2) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		if (arr1.length != arr2.length)
			return false;

		int keyLock = -1;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == arr1[0]) {
				keyLock = i;
				break;
			}
		}

		if (keyLock == -1)
			return false;

		for (int i = 0; i < arr1.length; i++) {
			int j = (keyLock + i) % arr1.length;
			if (arr1[i] != arr2[j])
				return false;
		}

		return true;
	}

}
