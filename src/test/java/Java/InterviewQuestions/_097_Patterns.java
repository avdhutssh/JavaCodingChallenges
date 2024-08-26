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
		pattern2(5);

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
	
}
