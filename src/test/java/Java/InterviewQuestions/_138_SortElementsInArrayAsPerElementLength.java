package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _138_SortElementsInArrayAsPerElementLength {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<>(Arrays.asList("Jithin", "Arunima", "Akhil", "Matthew", "Benjamin"));
//        Sample output: [Akhil, Jithin, Arunima, Matthew, Benjamin])

		_01_Using_Comparator(names1);
	}

	private static void _01_Using_Comparator(List<String> names1) {
		// Time Complexity: O(nlogn)
		// Space Complexity: O(1)

		Comparator<String> comp = (name1, name2) -> Integer.compare(name1.length(), name2.length());
		Collections.sort(names1, comp);
		System.out.println(names1);
	}

}
