package Java;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					break;
				}
			}
		}
		System.out.println(output[0] + " , " + output[1]);
		return output;

	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] n1 = { 2, 4, 5 };
		int[] n2 = { 2, 4, 5, 6, 9 };
		sol.twoSum(n1, 6);
		sol.twoSum(n2, 1);
	}
}