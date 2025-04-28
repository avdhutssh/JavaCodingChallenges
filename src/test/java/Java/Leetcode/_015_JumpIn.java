package Java.Leetcode;

public class _015_JumpIn {

	public static void main(String[] args) {

		System.out.println(canJump(new int[] { 2, 3, 1, 1, 4 })); // true
		System.out.println(canJump(new int[] { 3, 2, 1, 0, 4 })); // false
		System.out.println(canJump(new int[] { 0 })); // true
		System.out.println(canJump(new int[] { 2, 0 })); // true
		System.out.println(canJump(new int[] { 1, 0, 1, 0 })); // false
		System.out.println(canJump(new int[] { 1, 2, 3 })); // true
		System.out.println(canJump(new int[] { 0, 2, 3 })); // false
	}

	public static boolean canJump(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int reachable = 0;
		for (int i = 0; i < nums.length && i <= reachable; i++) {
			reachable = Math.max(reachable, i + nums[i]);
			if (reachable >= nums.length - 1) {
				return true;
			}
		}
		return false;
	}
}
