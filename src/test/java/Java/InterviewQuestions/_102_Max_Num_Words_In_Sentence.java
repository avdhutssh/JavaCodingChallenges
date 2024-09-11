package Java.InterviewQuestions;

import java.util.Arrays;

public class _102_Max_Num_Words_In_Sentence {
	public static void main(String[] args) {
		String[] sentences1 = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }; // 6
		String[] sentences2 = { "please wait", "continue to fight", "continue to win" }; // 3

		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(sentences1));
		System.out.println("Using BFA: " + _01_Using_BruteForceApproach(sentences2));
		System.out.println("--------------------------------------------------");
		System.out.println("Using Streams: " + _02_Using_Streams(sentences1));
		System.out.println("Using Streams: " + _02_Using_Streams(sentences2));
		System.out.println("--------------------------------------------------");

	}

	private static int _01_Using_BruteForceApproach(String[] sentences) {
		// Time complexity: O(n * m)
		// Space complexity: O(1)
		int max = 0;
		for (String str : sentences) {
			String[] sentence = str.split("\\s+");
			max = Math.max(max, sentence.length);
		}
		return max;
	}

	private static int _02_Using_Streams(String[] sentences) {
		// Time complexity: O(n * m)
		// Space complexity: O(n)
		return Arrays.stream(sentences).mapToInt(sentence -> sentence.split("\\s+").length).max().orElse(0);
	}
}
