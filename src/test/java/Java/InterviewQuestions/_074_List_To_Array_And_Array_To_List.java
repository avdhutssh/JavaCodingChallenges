package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class _074_List_To_Array_And_Array_To_List {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		// Convert list to array
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(Arrays.toString(list.stream().toArray(Integer[]::new)));

		// Convert array to list
		List<Integer> listFromArray = IntStream.of(arr).boxed().collect(Collectors.toList());
		System.out.println(listFromArray);

	}

}
