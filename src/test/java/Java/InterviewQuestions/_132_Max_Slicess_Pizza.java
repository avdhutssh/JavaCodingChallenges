package Java.InterviewQuestions;

public class _132_Max_Slicess_Pizza {

	public static void main(String[] args) {
		
		System.out.println(_01_Max_Slices(1)); //2
		System.out.println(_01_Max_Slices(2)); //4
		System.out.println(_01_Max_Slices(3)); //7

	}

	private static int _01_Max_Slices(int n) {
		// Time Complexity: O(1)
		// Space Complexity: O(1)
		int slices = 1 + n*(n+1)/2;
		return slices;
	}

}
