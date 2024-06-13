package Java.UdemyFifthyCodingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

import org.apache.pdfbox.pdfparser.BruteForceParser;

public class _03_removeDuplicates {

	public static void main(String... args) {
		int[] arr1 = { 4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1 }; // [4, 2, 5, 3, 1]
		int[] arr2 = { 1, 1, 1, 1, 1, 1, 1, 1 }; // [1]
		int[] arr3 = { 4, 4, 2, 3, 2, 2, 4, 3 }; // [4, 2, 3]
		
		System.out.println("_01_BruteForceApproach");
		Arrays.stream(_01_BruteForceApproach(arr1)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		Arrays.stream(_01_BruteForceApproach(arr2)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		IntStream.of(_01_BruteForceApproach(arr3)).forEach(value -> System.out.print(value + " "));
		System.out.println("\n" + "-----------------------------");
		
		System.out.println("_02_By_Sorting_Array");
		Arrays.stream(_02_By_Sorting_Array(arr1)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		Arrays.stream(_02_By_Sorting_Array(arr2)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		IntStream.of(_02_By_Sorting_Array(arr3)).forEach(value -> System.out.print(value + " "));
		System.out.println("\n" + "-----------------------------");

		System.out.println("_03_Using_HashSet");
		Arrays.stream(_03_Using_HashSet(arr1)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		Arrays.stream(_03_Using_HashSet(arr2)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		IntStream.of(_03_Using_HashSet(arr3)).forEach(value -> System.out.print(value + " "));
		System.out.println("\n" + "-----------------------------");

		System.out.println("_04_Using_TreeSet");
		Arrays.stream(_04_Using_TreeSet(arr1)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		Arrays.stream(_04_Using_TreeSet(arr2)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		IntStream.of(_04_Using_TreeSet(arr3)).forEach(value -> System.out.print(value + " "));
		System.out.println("\n" + "-----------------------------");
		
		System.out.println("_05_Using_HashMap");
		Arrays.stream(_05_Using_HashMap(arr1)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		Arrays.stream(_05_Using_HashMap(arr2)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		IntStream.of(_05_Using_HashMap(arr3)).forEach(value -> System.out.print(value + " "));
		System.out.println("\n" + "-----------------------------");
		
		System.out.println("_06_Using_StreamAPI");
		Arrays.stream(_06_Using_StreamAPI(arr1)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		Arrays.stream(_06_Using_StreamAPI(arr2)).forEach(value -> System.out.print(value + " "));
		System.out.println();
		IntStream.of(_06_Using_StreamAPI(arr3)).forEach(value -> System.out.print(value + " "));
		System.out.println("\n" + "-----------------------------");
	}

	private static int[] _01_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(n)
		List<Integer> uniqueList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!uniqueList.contains(arr[i])) {
				uniqueList.add(arr[i]);
			}
		}
		int[] result = new int[uniqueList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = uniqueList.get(i);
		}
		return result;
	}

	private static int[] _02_By_Sorting_Array(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(n)
		Arrays.sort(arr);
		List<Integer> uniqueList = new ArrayList<Integer>();
		uniqueList.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				uniqueList.add(arr[i]);
			}
		}
		int[] result = new int[uniqueList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = uniqueList.get(i);
		}
		return result;
	}

	static int[] _03_Using_HashSet(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int number : arr) {
			hs.add(number);
		}
		int[] result = new int[hs.size()];
		int i = 0;
		for (int num : hs) {
			result[i++] = num;
		}
		return result;

	}

	static int[] _04_Using_TreeSet(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(n)
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int number : arr) {
			ts.add(number);
		}
		int[] result = new int[ts.size()];
		int i = 0;
		for (int num : ts) {
			result[i++] = num;
		}
		return result;
	}

	static int[] _05_Using_HashMap(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		for (int number : arr) {
			if (!hm.containsKey(number))
				hm.put(number, true);
		}
		int[] result = new int[hm.size()];
		int i = 0;
		for (int key : hm.keySet()) {
			result[i++] = key;
		}
		return result;
	}

	static int[] _06_Using_StreamAPI(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		return Arrays.stream(arr).distinct().toArray();
	}
	
}
