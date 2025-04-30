package Java.Leetcode;

import java.util.*;

public class _030_ThreeSum {

	public static void main(String[] args) {
		int[] nums1 = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(nums1)); // [[-1, -1, 2], [-1, 0, 1]]

		int[] nums2 = { 0, 0, 0, 0 };
		System.out.println(threeSum(nums2)); // [[0, 0, 0]]

		int[] nums3 = {};
		System.out.println(threeSum(nums3)); // []

		int[] nums4 = { 0 };
		System.out.println(threeSum(nums4)); // []

		int[] nums5 = { -2, 0, 1, 1, 2 };
		System.out.println(threeSum(nums5)); // [[-2, 0, 2], [-2, 1, 1]]
	}

	static List<List<Integer>> threeSum(int[] nums) {
		// Time Complexity: O(n^2)
		// Space Complexity: O(1) (excluding result list)

		Arrays.sort(nums);
		List<List<Integer>> triplets = new ArrayList<>();
		for (int i = 0; i <= nums.length - 3; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int left = i + 1, right = nums.length - 1;
				int target = 0 - nums[i];
				while (left < right) {
					if (nums[left] + nums[right] == target) {
						List<Integer> triplet = new ArrayList<>();
						triplet.add(nums[i]);
						triplet.add(nums[left]);
						triplet.add(nums[right]);
						triplets.add(triplet);
						while (left < nums.length - 1 && nums[left] == nums[left + 1])
							left++;
						while (right > 0 && nums[right] == nums[right - 1])
							right--;
						left++;
						right--;
					} else if (nums[left] + nums[right] < target) {
						left++;
					} else {
						right--;
					}
				}
			}

		}
		return triplets;
	}

}
