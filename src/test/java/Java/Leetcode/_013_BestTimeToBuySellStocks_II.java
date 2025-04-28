package Java.Leetcode;

public class _013_BestTimeToBuySellStocks_II {

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 })); // Output: 7
		System.out.println(maxProfit(new int[] { 1, 2, 3, 4, 5 })); // Output: 4
		System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 })); // Output: 0
		System.out.println(maxProfit(new int[] { 1 })); // Output: 0 (only one price)
		System.out.println(maxProfit(new int[] {})); // Output: 0 (empty array)
		System.out.println(maxProfit(new int[] { 2, 1, 4, 5, 2, 9, 7 })); // Output: 11
	}

	public static int maxProfit(int[] prices) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)

		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				profit += prices[i] - prices[i - 1];
			}
		}
		return profit;
	}
}
