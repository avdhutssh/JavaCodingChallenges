package Java.InterviewQuestions;

import java.util.Arrays;
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

}
