package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class _69_ModeOfArray {

	public static void main(String[] args) {
//		The mode of an array is the value that appears most frequently in the array. 
//		If multiple values have the same highest frequency, then each of those values can be considered a mode

		int[] nums = { 1, 2, 2, 3, 4, 4, 4, 5, 5 }; // Example array

		System.out.println("The mode(s) of the array Using HM: " + _01_Using_HashMap(nums));
	}

	private static List<Integer> _01_Using_HashMap(int[] nums) {
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		HashMap<Integer, Integer> hm = new HashMap<>();
		int maxCount = 0;
		for (int num : nums) {
			int count = hm.getOrDefault(num, 0) + 1;
			hm.put(num, count);
			maxCount = Math.max(maxCount, count);
		}
		List<Integer> mode = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == maxCount) {
				mode.add(entry.getKey());
			}
		}
		return mode;
	}

}
