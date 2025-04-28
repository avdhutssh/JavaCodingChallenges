package Java.Leetcode;

import java.util.HashSet;

public class _011_ContainsDuplicate {

	public static void main(String[] args) {

		System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4, 5 })); // false
		System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 })); // true
		System.out.println(containsDuplicate(new int[] {})); // false (empty array)
		System.out.println(containsDuplicate(new int[] { 0 })); // false (single element)
		System.out.println(containsDuplicate(new int[] { -1, -2, -3, -1 })); // true (negative numbers)
		System.out.println(containsDuplicate(new int[] { 2, 2, 2, 2, 2 })); // true (all elements same)
	}

	public static boolean containsDuplicate(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		HashSet<Integer> hs = new HashSet<>();
		for (int num : nums) {
			if (!hs.add(num)) {
				return true;
			}
		}
		return false;
	}
}
