package Java.InterviewQuestions;

public class _097_Patterns {

	public static void main(String[] args) {
		// Refer pattern.md file

//		Trick:
//			1. Number of lines = number of rows = no. of times the outer loop will run
//			2. Identify for every row number
//			   A. how many columns are there
//			   B. Type of element (* or 1,2,3)
//			3. What do you need to print (* or numbers)
//			4. For number patterns , try not to use 0 as index for loop

//		pattern1(5);
//		pattern2(5);
//		pattern3(5);
//		pattern4(5);
//		pattern5(5);
//		pattern6(5);
//		pattern7(5);
//		pattern8(5);
//		pattern9(5);
//		pattern10(5);
//		pattern11(5);
//		pattern12(5);
//		pattern13(5);
//		pattern14(5);
		pattern15(5);

	}

	private static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private static void pattern5(int n) {
		for (int row = 1; row <= 2 * n - 1; row++) {
			int totalColInRow = row > n ? 2 * n - row : row;
			for (int col = 1; col <= totalColInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern6(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern7(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space < row; space++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern8(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern9(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * (n - row) + 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern10(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern11(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern12(int n) {
		for (int row = 1; row <= 2 * n - 1; row++) {
			int spaceTotal = row > n ? 2 * n - row - 1 : row - 1;
			int colTotal = row > n ? row - n + 1 : n - row + 1;
			for (int space = 1; space <= spaceTotal; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= colTotal; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern13(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				if (col == 1 || col == 2 * row - 1 || row == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void pattern14(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space < row; space++) {
				System.out.print(" ");
			}

			int totalCol = 2 * (n - row + 1) - 1;
			for (int col = 1; col <= totalCol; col++) {
				if (col == 1 || row == 1 || col == totalCol) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	private static void pattern15(int n) {
		for (int row = 1; row <= 2 * n - 1; row++) {
			int currentRow = row > n ? 2 * n - row : row;
			for (int space = 1; space <= n - currentRow; space++) {
				System.out.print(" ");
			}

			int totalCol = 2 * currentRow - 1;
			for (int col = 1; col <= totalCol; col++) {
				System.out.print((col == 1 || col == totalCol) ? "*" : " ");
			}
			System.out.println();
		}
	}

}
