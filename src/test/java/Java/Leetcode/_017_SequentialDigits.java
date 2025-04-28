package Java.Leetcode;

import java.util.*;

public class _017_SequentialDigits {
	public static void main(String[] args) {
		System.out.println(sequentialDigits(100, 300)); // [123, 234]
		System.out.println(sequentialDigits(1000, 13000)); // [1234, 2345, 3456, 4567, 5678, 6789, 12345]
		System.out.println(sequentialDigits(10, 12)); // [12]
		System.out.println(sequentialDigits(58, 155)); // [67, 78, 89, 123]
		System.out.println(sequentialDigits(1, 9)); // [1,2,3,4,5,6,7,8,9]
		System.out.println(sequentialDigits(100000, 300000)); // [123456, 234567]
	}

	public static List<Integer> sequentialDigits(int low, int high) {
		// Time Complexity: O(1)
		// Space Complexity: O(1)
		
		String digits = "123456789";
		List<Integer> result = new ArrayList<>();
		for (int length = 1; length <= 9; length++) {
			for (int i = 0; i + length <= digits.length(); i++) {
				String substring = digits.substring(i, i + length);
				int value = Integer.valueOf(substring);
				if (value >= low && value <= high) {
					result.add(value);
				}
			}
		}
		return result;
	}
}
