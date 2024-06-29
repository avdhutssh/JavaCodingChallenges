package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class _34_fibonacci_Series {

	public static void main(String[] args) {

		int num = 5; // 0,1,1,2,3

		System.out.println(_01_Using_Brute_Force_Approach(num));

	}

	private static List<Integer> _01_Using_Brute_Force_Approach(int num) {

		int a = 1, b = 1, sum = 0;
		List<Integer> fib = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			fib.add(sum);
			if (i == 2) {
				sum = 1;
			} else {
				sum += a;
				a = b;
				b = sum;
			}
		}
		return fib;

	}
}
