package Java.Leetcode;

import java.util.Arrays;

public class _009_BestTimeToBuySellStocks {

	public static void main(String[] args) {
		// Test Cases
		int[] arr1 = { 7, 1, 5, 3, 6, 4 };
		int[] arr2 = { 7, 6, 4, 3, 1 };
		int[] arr3 = { 1, 2, 3, 4, 5 };
		int[] arr4 = { 2, 4, 1 };
		int[] arr5 = { 1 };
		int[] arr6 = {};
		int[] arr7 = { 3, 3, 5, 0, 0, 3, 1, 4 };

		System.out.println(maxProfit(arr1)); // Expected: 5
		System.out.println(maxProfit(arr2)); // Expected: 0
		System.out.println(maxProfit(arr3)); // Expected: 4
		System.out.println(maxProfit(arr4)); // Expected: 2
		System.out.println(maxProfit(arr5)); // Expected: 0
		System.out.println(maxProfit(arr6)); // Expected: 0
		System.out.println(maxProfit(arr7)); // Expected: 4
	}

	public static int maxProfit(int[] prices) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		if (prices.length == 0)
			return 0;
		int maxProfit = 0;
		int buyAt = prices[0];
		for (int currentPrice : prices) {
			maxProfit = Math.max(maxProfit, currentPrice - buyAt);
			if (buyAt > currentPrice) {
				buyAt = currentPrice;
			}
		}
		return maxProfit;
	}
}
