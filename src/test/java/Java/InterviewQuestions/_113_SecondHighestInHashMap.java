package Java.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class _113_SecondHighestInHashMap {

	public static void main(String[] args) {

		Map<String, Integer> hs = Map.of("A", 10, "B", 20, "C", 5, "D", 20, "E", 15);
		System.out.println("Second Highest number in HashMap: "+_01_findSecondHighestValue(hs));

	}

	private static Integer _01_findSecondHighestValue(Map<String, Integer> hs) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		if (hs.size() < 2) {
			return null;
		}

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for (int value : hs.values()) {
			if (value > highest) {
				secondHighest = highest;
				highest = value;
			} else if (value > secondHighest && value < highest) {
				secondHighest = value;
			}
		}
		return secondHighest;
	}

}
