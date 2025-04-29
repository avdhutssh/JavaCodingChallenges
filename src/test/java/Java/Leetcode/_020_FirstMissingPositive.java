package Java.Leetcode;

public class _020_FirstMissingPositive {

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[] { 1, 2, 0 })); // Expected: 3
		System.out.println(firstMissingPositive(new int[] { 3, 4, -1, 1 })); // Expected: 2
		System.out.println(firstMissingPositive(new int[] { 7, 8, 9, 11, 12 })); // Expected: 1
		System.out.println(firstMissingPositive(new int[] { 1, 2, 3, 4, 5 })); // Expected: 6
		System.out.println(firstMissingPositive(new int[] {})); // Expected: 1
		System.out.println(firstMissingPositive(new int[] { -1, -2, -3 })); // Expected: 1
		System.out.println(firstMissingPositive(new int[] { 1, 1, 1 })); // Expected: 2
	}

	public static int firstMissingPositive(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0) {
				nums[i] = nums.length + 1;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (index < nums.length && nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				return i + 1;
			}
		}
		return nums.length + 1;
	}
}
