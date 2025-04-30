package Java.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class _023_FindKDiffPairsInArray {

    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3, 1, 4, 1, 5}, 2)); // Expected: 2
        System.out.println(findPairs(new int[]{1, 2, 3, 4, 5}, 1)); // Expected: 4
        System.out.println(findPairs(new int[]{1, 3, 1, 5, 4}, 0)); // Expected: 1
        System.out.println(findPairs(new int[]{1, 1, 1, 2, 2}, 0)); // Expected: 2
        System.out.println(findPairs(new int[]{1, 2, 3, 4, 5}, 0)); // Expected: 0
        System.out.println(findPairs(new int[]{}, 1)); // Expected: 0
        System.out.println(findPairs(new int[]{1}, 0)); // Expected: 0
    }

    static int findPairs(int[] nums, int k) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
    	
        if (k < 0) return 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (k == 0) {
                if (entry.getValue() > 1) {
                    count++;
                }
            } else {
                if (hm.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
