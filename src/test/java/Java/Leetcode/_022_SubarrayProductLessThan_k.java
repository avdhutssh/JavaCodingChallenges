package Java.Leetcode;

public class _022_SubarrayProductLessThan_k {

    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100)); // Expected: 8
        System.out.println(numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0));       // Expected: 0
        System.out.println(numSubarrayProductLessThanK(new int[]{1, 1, 1}, 2));       // Expected: 6
        System.out.println(numSubarrayProductLessThanK(new int[]{1}, 2));            // Expected: 1
        System.out.println(numSubarrayProductLessThanK(new int[]{100}, 100));        // Expected: 0
        System.out.println(numSubarrayProductLessThanK(new int[]{}, 10));            // Expected: 0
    }

    static int numSubarrayProductLessThanK(int[] nums, int k) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
    	
        int prod =1;
        int count=0;
        int left=0;
        for(int right = 0; right<nums.length; right++){
            prod*= nums[right];
            while(left<=right && prod>=k){
                prod /=nums[left];
                left++;
            }
            count += right - left +1;
        }
        return count;
    }
}
