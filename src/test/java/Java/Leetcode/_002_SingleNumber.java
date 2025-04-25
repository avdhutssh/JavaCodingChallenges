package Java.Leetcode;

import java.util.HashSet;
import java.util.Set;

public class _002_SingleNumber {

	public static void main(String[] args) {
		System.out.println(_01_SingleNumber_BFA(new int[] { 4, 1, 2, 1, 2 })); // Expected: 4
		System.out.println(_01_SingleNumber_BFA(new int[] { 2, 2, 1 })); // Expected: 1
		System.out.println(_01_SingleNumber_BFA(new int[] { 1 })); // Expected: 1
		System.out.println(_01_SingleNumber_BFA(new int[] { 0, 1, 0 })); // Expected: 1
		System.out.println(_01_SingleNumber_BFA(new int[] { -1, -1, 0 })); // Expected: 0

		System.out.println("-----------------------------------");

		System.out.println(_02_SingleNumber_Optimized_Using_BitManipulation(new int[] { 4, 1, 2, 1, 2 })); // Expected:
																											// 4
		System.out.println(_02_SingleNumber_Optimized_Using_BitManipulation(new int[] { 2, 2, 1 })); // Expected: 1
		System.out.println(_02_SingleNumber_Optimized_Using_BitManipulation(new int[] { 1 })); // Expected: 1
		System.out.println(_02_SingleNumber_Optimized_Using_BitManipulation(new int[] { 0, 1, 0 })); // Expected: 1
		System.out.println(_02_SingleNumber_Optimized_Using_BitManipulation(new int[] { -1, -1, 0 })); // Expected: 0

	}

	private static int _01_SingleNumber_BFA(int[] nums) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		Set<Integer> hs = new HashSet<>();
		for (int num : nums) {
			if (hs.contains(num)) {
				hs.remove(num);
			} else {
				hs.add(num);
			}
		}
		return hs.iterator().next();
	}

	private static int _02_SingleNumber_Optimized_Using_BitManipulation(int[] nums) {
		// Time complexity: O(n)
		// Space complexity: O(1)

		int singleNum = 0;
		for (int num : nums) {
			singleNum = singleNum ^ num;
		}
		return singleNum;
	}

}
