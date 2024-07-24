package Java.InterviewQuestions;

public class _079_Recursion_Call_Stack {
	// Time Complexity: O(1)
	// Space Complexity: O(1)

	public static void main(String[] args) {
		method_One();
	}

	private static void method_One() {
		method_Two();
		System.out.println("One");

	}

	private static void method_Two() {
		method3();
		System.out.println("Two");

	}

	private static void method3() {
		System.out.println("Three");

	}

}
