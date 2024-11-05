package Java.InterviewQuestions;

import java.util.Arrays;

public class _120_udemy_RotateArray {

	public static void main(String[] args) {
		int a1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(rotate_Out_Of_Place(a1, 3)));
		System.out.println(Arrays.deepToString(rotate_In_Place(a1, 3)));
		// should return:
		// [[7, 4, 1],
		// [8, 5, 2],
		// [9, 6, 3]]

		int a2[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.deepToString(rotate_Out_Of_Place(a2, 4)));
		System.out.println(Arrays.deepToString(rotate_In_Place(a2, 4)));
		// should return:
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

	private static int[][] rotate_In_Place(int[][] a, int n) {

		for (int i = 0; i < Math.ceil(n / 2.0); i++) {
			for (int j = 0; j < Math.floor(n / 2.0); j++) {
				int[] temp = new int[4];
				int currentI = i;
				int currentJ = j;
				for (int k = 0; k < 4; k++) {
					temp[k] = a[currentI][currentJ];
					int[] newcoordinates = rotateSub(currentI, currentJ, n);
					currentI = newcoordinates[0];
					currentJ = newcoordinates[1];
				}

				for (int k = 0; k < 4; k++) {
					a[currentI][currentJ] = temp[(k + 3) % 4];
					int[] newcoordinates = rotateSub(currentI, currentJ, n);
					currentI = newcoordinates[0];
					currentJ = newcoordinates[1];
				}
			}
		}
		return a;
	}

	private static int[] rotateSub(int i, int j, int n) {
		return new int[] { j, n - 1 - i };
	}

}
