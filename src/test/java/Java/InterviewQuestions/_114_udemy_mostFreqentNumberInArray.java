package Java.InterviewQuestions;

import java.util.HashMap;

public class _114_udemy_mostFreqentNumberInArray {
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 1, 3, 2, 1 }; // 1
		int[] array2 = { 3, 3, 1, 3, 2, 1 }; // 3
		int[] array3 = {}; // null
		int[] array4 = { 0 }; // 0
		int[] array5 = { 0, -1, 10, 10, -1, 10, -1, -1, -1, 1 }; // -1
		System.out.println("arr1: " + _01_Using_HashMap(array1));
		System.out.println("arr2: " + _01_Using_HashMap(array2));
		System.out.println("arr3: " + _01_Using_HashMap(array3));
		System.out.println("arr4: " + _01_Using_HashMap(array4));
		System.out.println("arr5: " + _01_Using_HashMap(array5));

	}

	public static Integer _01_Using_HashMap(int[] givenArray) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)

		if (givenArray.length == 0) {
			return null;
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int num : givenArray) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		Integer maxItem = null;
		int maxfrequency = Integer.MIN_VALUE;
		for (int key : hm.keySet()) {
			int frequency = hm.get(key);
			if (frequency > maxfrequency) {
				maxfrequency = frequency;
				maxItem = key;
			}
		}
		return maxItem;
	}
}
