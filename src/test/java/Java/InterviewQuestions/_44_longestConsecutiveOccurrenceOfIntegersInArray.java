package Java.InterviewQuestions;

import java.util.HashSet;

public class _44_longestConsecutiveOccurrenceOfIntegersInArray {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 }; // 4

		System.out.println(_01_Using_BruteForceApproach(arr));
		System.out.println(findLongestConsecutiveSequence(arr));
		

	}

	private static int _01_Using_BruteForceApproach(int[] arr) {
		// Time complexity: O(n)
		// Space complexity: O(1)
		int count = 0;
		int max = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] + 1 == arr[i + 1]) {
				count++;
			} else {
				count = 0;
			}
			max = Math.max(max, count + 1);
		}
		return max;
	}

    private static int findLongestConsecutiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
