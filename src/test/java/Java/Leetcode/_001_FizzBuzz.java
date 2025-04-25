package Java.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class _001_FizzBuzz {

	public static void main(String[] args) {
		System.out.println(_01_FizzBuzz_Optimized(15));
		System.out.println("------------------------------------");
		System.out.println(_01_FizzBuzz_Optimized(1));
		System.out.println("------------------------------------");
		System.out.println(_01_FizzBuzz_Optimized(0));
		System.out.println("------------------------------------");
		System.out.println(_01_FizzBuzz_Optimized(3));

	}

	public static List<String> _01_FizzBuzz_Optimized(int n) {
		// Time complexity: O(n)
        // Space complexity: O(n)
		
		List<String> result = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				result.add("FizzBuzz");
			else if (i % 3 == 0)
				result.add("Fizz");
			else if (i % 5 == 0)
				result.add("Buzz");
			else
				result.add(i + "");
		}
		return result;
	}
}
