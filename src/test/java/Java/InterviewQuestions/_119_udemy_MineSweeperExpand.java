package Java.InterviewQuestions;

import java.util.ArrayDeque;
import java.util.Arrays;

public class _119_udemy_MineSweeperExpand {

	public static void main(String[] args) {
		int[][] field1 = { { 0, 0, 0, 0, 0 }, { 0, 1, 1, 1, 0 }, { 0, 1, -1, 1, 0 } };

		System.out.println(Arrays.deepToString(click(field1, 3, 5, 2, 2))); // should return:
// [[0, 0, 0, 0, 0],
//  [0, 1, 1, 1, 0],
//  [0, 1, -1, 1, 0]]

		System.out.println(Arrays.deepToString(click(field1, 3, 5, 1, 4))); // should return:
// [[-2, -2, -2, -2, -2],
//  [-2, 1, 1, 1, -2],
//  [-2, 1, -1, 1, -2]]

		int[][] field2 = { { -1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 0, 0, 1, 1 }, { 0, 0, 1, -1 } };

		System.out.println(Arrays.deepToString(click(field2, 4, 4, 0, 1))); // should return:
// [[-1, 1, 0, 0],
//  [1, 1, 0, 0],
//  [0, 0, 1, 1],
//  [0, 0, 1, -1]]

		System.out.println(Arrays.deepToString(click(field2, 4, 4, 1, 3))); // should return:
// [[-1, 1, -2, -2],
//  [1, 1, -2, -2],
//  [-2, -2, 1, 1],
//  [-2, -2, 1, -1]]
	}

	public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
		// Time Complexity: O(numRows×numCols)
		// Space Complexity: O(numRows×numCols)
		
		ArrayDeque<int[]> toCheck = new ArrayDeque<int[]>();
		if (field[givenI][givenJ] == 0) {
			field[givenI][givenJ] = -2;
			int[] coordinates = { givenI, givenJ };
			toCheck.add(coordinates);
		} else {
			return field;
		}

		while (!toCheck.isEmpty()) {
			int[] currentCoordinates = toCheck.remove();
			int currentI = currentCoordinates[0];
			int currentJ = currentCoordinates[1];
			for (int i = currentI - 1; i < currentI + 2; i++) {
				for (int j = currentJ - 1; j < currentJ + 2; j++) {
					if (i >= 0 && i < numRows && j >= 0 && j < numCols && field[i][j] == 0) {
						field[i][j] = -2;
						int[] coordinates = { i, j };
						toCheck.add(coordinates);
					}
				}
			}
		}

		return field;

	}

}
