package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class _005_HT_indicesOfTwoNumbersThatGivesTarget {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(_01_BruteForceApproach(new int[] { 2, 7, 11, 15 }, 9))); // [0, 1]
		System.out.println(Arrays.toString(_01_BruteForceApproach(new int[] { 3, 2, 4 }, 6))); // [1, 2]
		System.out.println(Arrays.toString(_01_BruteForceApproach(new int[] { 3, 3 }, 6))); // [0, 1]
		System.out.println(Arrays.toString(_01_BruteForceApproach(new int[] { 1, 2, 3, 4, 5 }, 10))); // []
		System.out.println(Arrays.toString(_01_BruteForceApproach(new int[] { 1, 2, 3, 4, 5 }, 7))); // [2, 3]
		System.out.println(Arrays.toString(_01_BruteForceApproach(new int[] { 1, 2, 3, 4, 5 }, 3))); // [0, 1]
		System.out.println(Arrays.toString(_01_BruteForceApproach(new int[] {}, 0))); // []
		
		System.out.println("-----------------------------------------");
		
		System.out.println(Arrays.toString(_02_Using_HashMap(new int[] { 2, 7, 11, 15 }, 9))); // [0, 1]
		System.out.println(Arrays.toString(_02_Using_HashMap(new int[] { 3, 2, 4 }, 6))); // [1, 2]
		System.out.println(Arrays.toString(_02_Using_HashMap(new int[] { 3, 3 }, 6))); // [0, 1]
		System.out.println(Arrays.toString(_02_Using_HashMap(new int[] { 1, 2, 3, 4, 5 }, 10))); // []
		System.out.println(Arrays.toString(_02_Using_HashMap(new int[] { 1, 2, 3, 4, 5 }, 7))); // [2, 3]
		System.out.println(Arrays.toString(_02_Using_HashMap(new int[] { 1, 2, 3, 4, 5 }, 3))); // [0, 1]
		System.out.println(Arrays.toString(_02_Using_HashMap(new int[] {}, 0))); // []
	}

	static int[] _01_BruteForceApproach(int[] arr, int target) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		int[] indices = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		return new int[0];
	}

	static int[] _02_Using_HashMap(int[] arr, int target) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int otherNumber = target - num;
			if (hm.containsKey(otherNumber)) {
				return new int[] { hm.get(otherNumber), i };
			}
			hm.put(arr[i], i);
		}
		return new int[] {};
	}

}
