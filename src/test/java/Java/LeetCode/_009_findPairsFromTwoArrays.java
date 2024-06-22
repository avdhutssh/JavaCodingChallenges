package Java.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _009_findPairsFromTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 4, 6, 8, 10 };
		int target = 7;

		List<int[]> pairs = findPairs(arr1, arr2, target);
		for (int[] pair : pairs) {
			System.out.println(Arrays.toString(pair));
		}

	}

	public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
		List<int[]> pairs = new ArrayList<int[]>();
		Set<Integer> hs = new HashSet<Integer>();
		for (int num : arr1) {
			hs.add(num);
		}
		for (int num : arr2) {
			if (hs.contains(target - num)) {
				pairs.add(new int[] { target - num, num });
			}
			hs.add(num);
		}
		return pairs;
	}

}
