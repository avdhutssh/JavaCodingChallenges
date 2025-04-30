package Java.Leetcode;

public class _026_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 2 })); // Output: 2
		System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 })); // Output: 5
		System.out.println(removeDuplicates(new int[] { 1, 2, 3 })); // Output: 3
		System.out.println(removeDuplicates(new int[] { 1, 1, 1, 1 })); // Output: 1
		System.out.println(removeDuplicates(new int[] {})); // Output: 0
	}

	static int removeDuplicates(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		if (nums.length == 0)
			return 0;

		int left = 0, right = 0;
		while (right < nums.length) {
			if (nums[left] != nums[right]) {
				left++;
				nums[left] = nums[right];
			} else {
				right++;
			}
		}
		return left + 1;
	}
}
