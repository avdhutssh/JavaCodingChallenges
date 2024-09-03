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
//		pattern15(5);
//		pattern16(5);
//		pattern17(5);
//		pattern18(5);
//		pattern19(5);
//		pattern20(5);
//		pattern21(5);
//		pattern22(5);
		pattern23(3);
//		pattern26(6);

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

	private static void pattern16(int n) {
		for (int row = 0; row < n; row++) {
			for (int space = 1; space < n - row; space++) {
				System.out.print("  ");
			}
			int value = 1;
			for (int col = 0; col <= row; col++) {
				System.out.print(value + "   ");
				value = value * (row - col) / (col + 1);
			}
			System.out.println();
		}
	}

	private static void pattern17(int n) {
		for (int row = 1; row <= 2 * n - 1; row++) {
			int currentRow = row > n ? 2 * n - row : row;
			for (int space = 0; space < n - currentRow; space++) {
				System.out.print(" ");
			}
			for (int col = currentRow; col >= 1; col--) {
				System.out.print(col);
			}
			for (int col = 2; col <= currentRow; col++) {
				System.out.print(col);
			}
			System.out.println();
		}

	}

	private static void pattern18(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int currentRow = row > n ? 2 * n - row + 1 : row;
			for (int col = 1; col <= n - currentRow + 1; col++) {
				System.out.print("*");
			}
			for (int space = 0; space < 2 * (currentRow - 1); space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= n - currentRow + 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void pattern19(int n) {
		for (int row = 1; row <= 2 * n - 1; row++) {
			int currentRow = row > n ? 2 * n - row : row;
			for (int col = 1; col <= currentRow; col++) {
				System.out.print("*");
			}
			for (int space = 1; space <= 2 * n - 2 * currentRow; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= currentRow; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void pattern20(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= 1; col++) {
				System.out.print("*");
			}
			for (int space = 1; space <= 2; space++) {
				if (row == 1 || row == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int col = 1; col <= 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void pattern21(int n) {
		// Floyd's triangle
		int count = 1;
		for (int row = 1; row <= n; row++) {
			for (int col = 0; col < row; col++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

	private static void pattern22(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 0; col < row; col++) {
				if ((row + col) % 2 == 1) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();
		}

	}

	private static void pattern23(int n) {
		// Incorrect
        int rows = n;
        int columns = n*n;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i == 0 && (j == 3 || j == 7)) ||
                    (i == 1 && (j == 2 || j == 5 || j == 8)) ||
                    (i == 2 && (j == 1 || j == 4 || j == 7 || j == 8))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


	private static void pattern26(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 0; col < n - row + 1; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}
}
