package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class ExerciseJune {

	public static void main(String[] args) {

		System.out.println(_01_multiply(5, 10));

		System.out.println("-----------------------------------------");

		int[] maxDiffArr = { 1, 4, 8, 15, 17, 27 };
		System.out.println(_02_MaxDiffBetweenAdjacentElementsInArr(maxDiffArr)); // 10

		System.out.println("-----------------------------------------");

		int[] a = { 1, 4, 5, 7 };
		int[] b = { 6, 4, 3, 7 };
		_03_compareArrayAndFindCommon(a, b); // 4 7

		System.out.println("\n-----------------------------------------");

		System.out.println(_04_factorial(5)); // 120

		System.out.println("-----------------------------------------");

		int[] missingNumArr = new int[] { 1, 2, 5, 6, 7, 3 };
		System.out.println(_05_missingNumber(missingNumArr)); // 4

		System.out.println("-----------------------------------------");

		System.out.println(_06_firstNonRepeatingChar("leetcode")); // l

		System.out.println("-----------------------------------------");

		System.out.println(_07_Using_Hashmap_groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
		// [[eat, tea, ate], [tan, nat], [bat]]
		System.out.println(_07_Using_Hashmap_groupAnagrams(new String[] { "abc", "cba", "bac", "foo", "bar" }));
		// [[abc, cba, bac], [foo], [bar]]
		System.out.println(_07_Using_Hashmap_groupAnagrams(
				new String[] { "listen", "silent", "triangle", "integral", "garden", "ranged" }));
		// [[listen, silent], [triangle, integral], [garden, ranged]]

		System.out.println("-----------------------------------------");

		System.out.println(
				Arrays.toString(_08_HashMap_indicesOfTwoNumbersThatGivesTarget(new int[] { 2, 7, 11, 15 }, 9)));
// [0, 1]
		System.out.println(Arrays.toString(_08_HashMap_indicesOfTwoNumbersThatGivesTarget(new int[] { 3, 2, 4 }, 6)));
// [1, 2]
		System.out.println(Arrays.toString(_08_HashMap_indicesOfTwoNumbersThatGivesTarget(new int[] { 3, 3 }, 6)));
// [0, 1]
		System.out.println(
				Arrays.toString(_08_HashMap_indicesOfTwoNumbersThatGivesTarget(new int[] { 1, 2, 3, 4, 5 }, 10)));
// []
		System.out.println(
				Arrays.toString(_08_HashMap_indicesOfTwoNumbersThatGivesTarget(new int[] { 1, 2, 3, 4, 5 }, 7)));
// [2, 3]
		System.out.println(
				Arrays.toString(_08_HashMap_indicesOfTwoNumbersThatGivesTarget(new int[] { 1, 2, 3, 4, 5 }, 3)));
// [0, 1]
		System.out.println(Arrays.toString(_08_HashMap_indicesOfTwoNumbersThatGivesTarget(new int[] {}, 0)));
// []

		System.out.println("-----------------------------------------");
		int[] nums1 = { 1, 2, 3, 4, 5 }, nums2 = { -1, 2, 3, -4, 5 }, nums3 = { 2, 3, 4, 5, 6 }, nums4 = {};
		int target1 = 9, target2 = 0, target3 = 3, target4 = 0;

		Arrays.stream(_009_HT_SubarraySumIndex(nums1, target1)).forEach(value -> System.out.print(value + " ")); // [1,
																													// 3]
		System.out.println();
		Arrays.stream(_009_HT_SubarraySumIndex(nums2, target2)).forEach(value -> System.out.print(value + " ")); // [0,
																													// 3]
		System.out.println();
		Arrays.stream(_009_HT_SubarraySumIndex(nums3, target3)).forEach(value -> System.out.print(value + " ")); // [1,
																													// 1]
		System.out.println();
		Arrays.stream(_009_HT_SubarraySumIndex(nums4, target4)).forEach(value -> System.out.print(value + " ")); // []

		System.out.println("-----------------------------------------");

		String str1 = "abcdefg"; // should return true
		String str2 = "hello"; // should return false
		String str3 = ""; // should return true
		String str4 = "0123456789"; // should return true
		String str5 = "abacadaeaf"; // should return false
		System.out.println(_10_hasUniqueOptimized(str1));
		System.out.println(_10_hasUniqueOptimized(str2));
		System.out.println(_10_hasUniqueOptimized(str3));
		System.out.println(_10_hasUniqueOptimized(str4));
		System.out.println(_10_hasUniqueOptimized(str5));
		
		System.out.println("-----------------------------------------");

		System.out.println("-----------------------------------------");

		System.out.println("-----------------------------------------");

	}

	private static boolean _10_hasUniqueOptimized(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		
		if (str.length() == 0)
			return true;
		if (str.length() > 128)
			return false;

		boolean[] seen = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			if (seen[str.charAt(i)]) {
				return false;
			}
			seen[str.charAt(i)] = true;
		}
		return true;
	}

	private static int _01_multiply(int num1, int num2) {
		// Time complexity: O(num2)
		// Space complexity: O(1)

		return IntStream.generate(() -> num1).limit(num2).sum();
	}

	private static int _02_MaxDiffBetweenAdjacentElementsInArr(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)

		int maxDiff = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			maxDiff = Math.max(maxDiff, arr[i + 1] - arr[i]);
		}

		return maxDiff;
	}

	private static void _03_compareArrayAndFindCommon(int[] a, int[] b) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int num : a) {
			hs.add(num);
		}
		for (int num : b) {
			if (!hs.add(num)) {
				System.out.print(num + " ");
			}
		}

	}

	private static int _04_factorial(int num) {
		// Time complexity: O(num)
		// Space complexity: O(1)

		int k = 1, factorial = 1;
		while (k <= num) {
			factorial *= k;
			k++;
		}
		return factorial;
	}

	private static int _05_missingNumber(int[] numbers) {
		// Time complexity: O(n)
		// Space complexity: O(1)

		int actualSum = 0;
		for (int num : numbers) {
			actualSum += num;
		}
		int totalNum = numbers.length + 1;
		int expectedSum = totalNum * (totalNum + 1) / 2;
		return expectedSum - actualSum;

	}

	private static Character _06_firstNonRepeatingChar(String str) {
		// Time complexity: O(n)
		// Space complexity: O(1)

		int[] counts = new int[128];
		for (char ch : str.toCharArray()) {
			counts[ch - 'a']++;
		}
		for (char ch : str.toCharArray()) {
			if (counts[ch - 'a'] == 1) {
				return ch;
			}
		}

		return '\0';
	}

	private static ArrayList<List<String>> _07_Using_Hashmap_groupAnagrams(String[] arr) {
		// Time complexity: O(NKlogK)
		// Space complexity: O(NK)
		HashMap<String, List<String>> hm = new HashMap<>();
		for (String str : arr) {
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr);
			String sortedStr = new String(charArr);
			if (hm.containsKey(sortedStr)) {
				hm.get(sortedStr).add(str);
			} else {
				List<String> anagramGroups = new ArrayList<String>();
				anagramGroups.add(str);
				hm.put(sortedStr, anagramGroups);
			}

		}
		return new ArrayList<List<String>>(hm.values());
	}

	private static int[] _08_HashMap_indicesOfTwoNumbersThatGivesTarget(int[] arr, int target) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int otherNum = target - arr[i];
			if (hm.containsKey(otherNum)) {
				return new int[] { hm.get(otherNum), i };
			}
			hm.put(arr[i], i);
		}
		return new int[] {};
	}

	private static int[] _009_HT_SubarraySumIndex(int[] arr, int target) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		HashMap<Integer, Integer> hm = new HashMap<>();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			hm.put(0, -1);
			if (hm.containsKey(sum - target)) {
				return new int[] { hm.get(sum - target) + 1, i };
			}
			hm.put(sum, i);
		}
		return new int[] {};
	}

}
