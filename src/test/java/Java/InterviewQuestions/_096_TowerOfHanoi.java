package Java.InterviewQuestions;

public class _096_TowerOfHanoi {

	static int count = 1;

	public static void main(String[] args) {

		tower(4, "A", "B", "C");

	}

	private static void tower(int n, String start, String temp, String end) {
		// Time complexity: O(2^n)
		// Space complexity: O(N)
		if (n == 1) {
			System.out.println(count + " Move " + start + " to " + end);
			count++;
		} else {
			tower(n - 1, start, end, temp);
			System.out.println(count + " Move " + start + " to " + end);
			count++;
			tower(n - 1, temp, start, end);
		}

	}

}
