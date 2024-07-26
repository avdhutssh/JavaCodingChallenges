package Java.InterviewQuestions;

import java.util.Arrays;

public class _083_Sort_Strings_In_Lexicographical_Order {

	public static void main(String[] args) {
		String strArray[] = { "Harit", "Girish", "Gritav", "Lovenish", "Nikhil", "Harman" };
		// Girish Gritav Harit Harman Lovenish Nikhil

		System.out.println("Using CompareTo Method: " + Arrays.toString(_01_Using_Compare_Method(strArray)));
	}

	private static String[] _01_Using_Compare_Method(String[] strArr) {

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

}
