package Java.InterviewQuestions;

import java.util.Arrays;

public class _083_Sort_Strings_In_Lexicographical_Order {

	public static void main(String[] args) {
		String[] strArray1 = { "Harit", "girish", "Gritav", "Lovenish", "Nikhil", "Harman" };
		String[] strArray2 = { "Harit", "girish", "Gritav", "Lovenish", "Nikhil", "Harman" };
		String str3 = "Harit girish Gritav Lovenish Nikhil Harman";
		// girish Gritav Harit Harman Lovenish Nikhil

		System.out.println("Using CompareTo Method: " + Arrays.toString(_01_Using_Compare_Method(strArray1)));
		System.out.println("Using Arrays.sort: " + Arrays.toString(_02_Using_Arrays_Sort(strArray2)));
		System.out.println("Using Array and CompareTo method: " + _03_Using_Array_Compare_Method(str3));

	}

	private static String[] _01_Using_Compare_Method(String[] strArr) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(1)
		System.out.println("Before CompareTo Method: " + Arrays.toString(strArr));
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].compareToIgnoreCase(strArr[j]) > 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		return strArr;
	}

	private static String[] _02_Using_Arrays_Sort(String[] strArr) {
		// Time Complexity: O(nlogn)
		// Space Complexity: O(1)
		System.out.println("Before Arrays.sort: " + Arrays.toString(strArr));
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		return strArr;
	}

	private static String _03_Using_Array_Compare_Method(String str) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(1)
		String[] strArr = str.split("\\s+");
		System.out.println("Before Array and Compare Method:" + Arrays.toString(strArr));
		return Arrays.toString(_01_Using_Compare_Method(strArr));
	}
}
