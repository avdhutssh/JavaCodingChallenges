package Java.InterviewQuestions;

import java.util.Collections;
import java.util.LinkedList;

public class _59_Highest_Lowest_Values_List {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(33);
		// Max: 44 Min: 11

		_01_Using_BruteForceApproach(list);
		_02_Using_Collection_Methods(list);
		_03_Using_Stream(list);
		_04_Using_Sorting(list);
	}

	private static void _01_Using_BruteForceApproach(LinkedList<Integer> list) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int max = 0;
		int min = list.get(0);
		for (int num : list) {
			if (num > max)
				max = num;
			else if (num < min)
				min = num;
		}

		System.out.println("Max: " + max + " Min: " + min);

	}

	private static void _02_Using_Collection_Methods(LinkedList<Integer> list) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int max = Collections.max(list);
		int min = Collections.min(list);

		System.out.println("Max: " + max + " Min: " + min);

	}

	private static void _03_Using_Stream(LinkedList<Integer> list) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		int max = list.stream().max(Integer::compare).get();
		int min = list.stream().min(Integer::compare).get();

		System.out.println("Max: " + max + " Min: " + min);

	}

	private static void _04_Using_Sorting(LinkedList<Integer> list) {
		// Time Complexity: O(nlogn)
		// Space Complexity: O(1)
		Collections.sort(list);
		int max = list.get(list.size() - 1);
		int min = list.get(0);

		System.out.println("Max: " + max + " Min: " + min);

	}
}
