package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _011_frequencyOfEachElementArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 }; // 10 3 20 4 5 1

		_01_Using_BruteForceApproach(arr);
		System.out.println("------------------------");
		System.out.println(_02_Using_HashMap(arr));
		System.out.println("------------------------");
		System.out.println(_03_Using_TreeMap_Sorted_Output(arr));
		System.out.println("------------------------");
		System.out.println(_04_Using_LinkedHashMap(arr));
		System.out.println("------------------------");
		System.out.println(_05_By_Sorting_Array(arr));
	}

	private static void _01_Using_BruteForceApproach(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(n)
		boolean[] visited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				int freq = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						visited[j] = true;
						freq++;
					}
				}
				System.out.println(arr[i] + " : " + freq);
			}
		}
	}

	private static HashMap<Integer, Integer> _02_Using_HashMap(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		return freqMap;
	}

	private static TreeMap<Integer, Integer> _03_Using_TreeMap_Sorted_Output(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(n)
		TreeMap<Integer, Integer> freqMap = new TreeMap<Integer, Integer>();
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		return freqMap;
	}

	private static LinkedHashMap<Integer, Integer> _04_Using_LinkedHashMap(int[] arr) { // Preserve Insertion Order
		// Time complexity: O(n)
		// Space complexity: O(n)
		LinkedHashMap<Integer, Integer> freqMap = new LinkedHashMap<Integer, Integer>();
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		return freqMap;
	}
	
	private static HashMap<Integer, Integer> _05_By_Sorting_Array(int[] arr) {
		// Time complexity: O(nlogn)
		// Space complexity: O(n)
		Arrays.sort(arr);
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		int freq = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				freq++;
			} else {
				freqMap.put(arr[i - 1], freq);
				freq = 1;
			}
		}
		freqMap.put(arr[arr.length-1], freq);
		return freqMap;
	}

}
