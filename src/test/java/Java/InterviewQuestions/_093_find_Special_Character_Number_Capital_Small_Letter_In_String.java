package Java.InterviewQuestions;

public class _093_find_Special_Character_Number_Capital_Small_Letter_In_String {

	public static void main(String[] args) {
		String str = "#GeeKs01fOr@gEEks07";
//		Upper case letters : 5
//		Lower case letters : 8
//		Number : 4
//		Special characters : 2

		_01_Using_BruteForceApproach(str);

	}

	private static void _01_Using_BruteForceApproach(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		System.out.println("Using Brute Force: ");
		int upper = 0, lower = 0, number = 0, special = 0;
		for (char ch : str.toCharArray()) {
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				number++;
			} else {
				special++;
			}
		}

		System.out.println("Upper case letters : " + upper);
		System.out.println("Lower case letters : " + lower);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);

	}

}
