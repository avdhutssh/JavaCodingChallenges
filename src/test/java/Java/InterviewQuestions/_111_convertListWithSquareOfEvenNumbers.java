package Java.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class _111_convertListWithSquareOfEvenNumbers {

	public static void main(String[] args) {
		List<Integer> givenList = Arrays.asList(1, 4, 3, 6, 8); // result = [1,16,3,36,64]

		System.out.println(_01_Using_BFA(givenList));
	}

	private static List<Integer> _01_Using_BFA(List<Integer> al) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		for (int i = 0; i < al.size(); i++) {
			if(al.get(i)%2==0) {
				double square = Math.pow(al.get(i), 2); 
				al.set(i, (int)square);
			}
		}
		return al;

	}

}
