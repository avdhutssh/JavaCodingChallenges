package Java.InterviewQuestions;

import java.util.Arrays;

public class _42_reverseArray {

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' }; // e d c b a
		System.out.println("Using Temp Array: " + Arrays.toString(_01_Using_Temp_array(arr)));
		;

	}

	private static char[] _01_Using_Temp_array(char[] arr) {
		char[] temp = new char[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length - 1 - i];

		}
		return temp;
	}

}
