package Java.InterviewQuestions;

public class _127_Each_Row_And_Column_In_Matrix_Ascending {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7, 11 }, { 2, 5, 8, 12 }, { 3, 6, 9, 16 }, { 10, 13, 14, 17 } };
		int target1 = 5; // Output: true
		int target2 = 18; // Output: false

//		         𝐀𝐩𝐩𝐫𝐨𝐚𝐜𝐡:
//		         Start at the top right of the matrix.
//		         If the current number equals the target, return True.
//		         If the current number is greater than the target, move left.
//		         If the current number is less than the target, move down.
//		         Continue until you find the number or exit the matrix bounds.

		System.out.println(searchTargetInMatrix(matrix, target1));
		System.out.println(searchTargetInMatrix(matrix, target2));

	}

	private static boolean searchTargetInMatrix(int[][] matrix, int target) {
		// Time Complexity: O(m+n)
		// Space Complexity: O(1)

		int rows = matrix.length;
		int cols = matrix[0].length;

		if (matrix == null || rows == 0 || cols == 0) {
			return false;
		}

		int row = 0;
		int col = cols - 1;

		while (row < rows && col >= 0) {
			if (matrix[row][col] == target)
				return true;
			if (matrix[row][col] > target)
				col--;
			if (matrix[row][col] < target)
				row++;
		}

		return false;
	}

}
