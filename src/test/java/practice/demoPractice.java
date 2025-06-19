package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class demoPractice {

	public static void main(String[] args) {
//		int[] arr = new int[] { 5, 2, 8, 7, 1 }; // 1 2 5 7 8
//		System.out.println("Heap Sort: " + Arrays.toString(_05_Using_Heap_Sort(arr)));
//
//		String str = "    India Is My Country";
//		System.out.println("Word Count using countWordsManually: " + _03_countWordsManually(str));
//		
//		
		String str1 = "Madam"; // true
		String str2 = "Avdhut"; // false
		String str3 = "A man a plan a canal Panama";  //true
		
		System.out.println(_03_Using_Two_Pointer_Technique(str1));
		System.out.println(_03_Using_Two_Pointer_Technique(str2));
		System.out.println(_03_Using_Two_Pointer_Technique(str3));
		System.out.println("----------------------------------");

	}
	
	private static boolean _03_Using_Two_Pointer_Technique(String str) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		str = str.trim().replaceAll("[\\W_]", "").toLowerCase();
		int left = 0;
		int right = str.length() - 1;
		int i = 0;
		while (left < right) {
			if (str.charAt(left++) != str.charAt(right--)) {
				return false;
			}
		}
		return true;
	}
	
	private static int _03_countWordsManually(String str) {

		int count = 0;
		int EOL = str.length() - 1;
		boolean isWord = false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isWhitespace(ch) && i != EOL) {
				isWord = true;
			} else if (Character.isWhitespace(ch) && isWord) {
				count++;
				isWord = false;
			} else if (!Character.isWhitespace(ch) && i == EOL) {
				count++;
			}

		}
		return count;
	}

	private static int[] _05_Using_Heap_Sort(int[] arr) {

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int num : arr) {
			maxHeap.add(num);
		}
		int index = arr.length - 1;
		while (!maxHeap.isEmpty()) {
			arr[index--] = maxHeap.poll();
		}

		return arr;
	}

}
