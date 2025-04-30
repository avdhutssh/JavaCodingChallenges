package Java.Leetcode;

public class _033_ContainerWithMostWater {

	public static void main(String[] args) {

		// Edge Case 1: Minimum input
		int[] height1 = { 1, 1 };
		System.out.println(maxArea(height1)); // Expected: 1

		// Edge Case 2: All heights equal
		int[] height2 = { 5, 5, 5, 5, 5 };
		System.out.println(maxArea(height2)); // Expected: 20

		// Edge Case 3: Decreasing height
		int[] height3 = { 9, 8, 7, 6, 5 };
		System.out.println(maxArea(height3)); // Expected: 20

		// Edge Case 4: Increasing height
		int[] height4 = { 1, 2, 3, 4, 5 };
		System.out.println(maxArea(height4)); // Expected: 6

		// Edge Case 5: Random heights
		int[] height5 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(height5)); // Expected: 49
	}

	static int maxArea(int[] height) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			int h = Math.min(height[left], height[right]);
			int w = right - left;
			int area = h * w;
			maxArea = Math.max(maxArea, area);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}
}
