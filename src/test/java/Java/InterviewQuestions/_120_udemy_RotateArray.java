package Java.InterviewQuestions;

import java.util.Arrays;

public class _120_udemy_RotateArray {

	public static void main(String[] args) {
		int a1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(rotate_Out_Of_Place(a1, 3))) ; // should return:
		// [[7, 4, 1],
		// [8, 5, 2],
		// [9, 6, 3]]

		int a2[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.deepToString(rotate_Out_Of_Place(a2, 4))); // should return:
		// [[13, 9, 5, 1],
		// [14, 10, 6, 2],
		// [15, 11, 7, 3],
		// [16, 12, 8, 4]]
	}

	public static int[][] rotate_Out_Of_Place(int[][] a, int n) {
		// Time complexity: O(n^2)
		// Space complexity: O(n^2)
		int[][] rotated = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotated[j][n - 1 - i] = a[i][j];
			}
		}
		return rotated;
	}

}
