package Java.Leetcode;

public class _034_MajorityElement {

//	Boyer-Moore Voting Algorithm
	public static void main(String[] args) {
		// Edge case 1: Single element
		int[] nums1 = { 3 };
		System.out.println(majorityElement(nums1)); // Output: 3

		// Edge case 2: All elements are the same
		int[] nums2 = { 2, 2, 2, 2 };
		System.out.println(majorityElement(nums2)); // Output: 2

		// Edge case 3: Alternating pattern with clear majority
		int[] nums3 = { 1, 2, 1, 1, 3, 1, 4 };
		System.out.println(majorityElement(nums3)); // Output: 1

		// Edge case 4: Majority at end
		int[] nums4 = { 5, 5, 5, 1, 2, 5, 5 };
		System.out.println(majorityElement(nums4)); // Output: 5

		// Edge case 5: Minimum size of valid majority element
		int[] nums5 = { 6, 7, 6 };
		System.out.println(majorityElement(nums5)); // Output: 6
	}

	public static int majorityElement(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		
		int count = 0;
		int majorityElement = 0;

		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				majorityElement = nums[i];
			}
			if (majorityElement == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		return majorityElement;
	}
}
