package Java.InterviewQuestions;

public class _033_Swap_Two_Strings {

	public static void main(String[] args) {
		String s1 = "Avdhut";
		String s2 = "Shirgaonkar";
		_01_Without_Using_Temp_Variable(s1, s2);
		_02_Using_Temp_Variable(s1, s2);
		_03_Using_Array(s1, s2);

	}

	private static void _01_Without_Using_Temp_Variable(String s1, String s2) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		System.out.println("Before-> s1 : " + s1 + " s2 : " + s2);

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After-> s1 : " + s1 + " s2 : " + s2);

	}

	private static void _02_Using_Temp_Variable(String s1, String s2) {
		// Time complexity: O(1)
		// Space complexity: O(1)
		System.out.println("Before-> s1 : " + s1 + " s2 : " + s2);

		String s3 = s1;
		s1 = s2;
		s2 = s3;
		System.out.println("After-> s1 : " + s1 + " s2 : " + s2);

	}

	private static void _03_Using_Array(String s1, String s2) {
		// Time complexity: O(1)
		// Space complexity: O(1)
		System.out.println("Before-> s1 : " + s1 + " s2 : " + s2);

		String[] arr = { s1, s2 };
		arr[0] = s2;
		arr[1] = s1;
		s1 = arr[0];
		s2 = arr[1];
		System.out.println("After-> s1 : " + s1 + " s2 : " + s2);

	}
}
