package Java.Leetcode;

public class _032_MaximumSubarray {

//	Kaden's Algorithm
	
	public static void main(String[] args) {

		System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 })); // 6
		System.out.println(maxSubArray(new int[] { 1 })); // 1
		System.out.println(maxSubArray(new int[] { 5, 4, -1, 7, 8 })); // 23
		System.out.println(maxSubArray(new int[] { -1, -2, -3, -4 })); // -1
		System.out.println(maxSubArray(new int[] { 1, 2, 3, 4, 5 })); // 15
		System.out.println(maxSubArray(new int[] { -2, -1 })); // -1
		System.out.println(maxSubArray(new int[] { 0 })); // 0
	}

	static int maxSubArray(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int maxSum = nums[0];
		int currSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currSum = Math.max(nums[i], currSum + nums[i]);
			maxSum = Math.max(maxSum, currSum);
		}

		return maxSum;
	}
}
