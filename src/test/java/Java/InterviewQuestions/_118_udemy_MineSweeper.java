package Java.InterviewQuestions;

import java.util.Arrays;

public class _118_udemy_MineSweeper {

	public static void main(String[] args) {
		int[][] bombs1 = { { 0, 2 }, { 2, 0 } };
		System.out.println(Arrays.deepToString(mineSweeper(bombs1, 3, 3)));// should return:
		// [[0, 1, -1],
		// [1, 2, 1],
		// [-1, 1, 0]]

		int[][] bombs2 = { { 0, 0 }, { 0, 1 }, { 1, 2 } };
		System.out.println(Arrays.deepToString(mineSweeper(bombs2, 3, 4))); // should return:
		// [[-1, -1, 2, 1],
		// [2, 3, -1, 1],
		// [0, 1, 1, 1]]

		int[][] bombs3 = { { 1, 1 }, { 1, 2 }, { 2, 2 }, { 4, 3 } };
		System.out.println(Arrays.deepToString(mineSweeper(bombs3, 5, 5))); // should return:
		// [[1, 2, 2, 1, 0],
		// [1, -1, -1, 2, 0],
		// [1, 3, -1, 2, 0],
		// [0, 1, 2, 2, 1],
		// [0, 0, 1, -1, 1]]
	}

	public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
		// Time Complexity: O(numRows×numCols+b)
		// Space Complexity: O(numRows×numCols)

		int[][] field = new int[numRows][numCols];
		for (int[] bomb : bombs) {
			int rowIndex = bomb[0];
			int colIndex = bomb[1];
			field[rowIndex][colIndex] = -1;
			for (int i = rowIndex - 1; i < rowIndex + 2; i++) {
				for (int j = colIndex - 1; j < colIndex + 2; j++) {
					if (i >= 0 && i < numRows && j >= 0 && j < numCols && field[i][j] != -1) {
						field[i][j] += 1;
					}
				}
			}
		}
		return field;
	}

}
