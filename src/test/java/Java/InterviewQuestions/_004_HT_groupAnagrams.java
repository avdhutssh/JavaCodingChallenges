package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class _004_HT_groupAnagrams {

	public static void main(String[] args) {
	
        System.out.println(_01_Using_Hashmap(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})); //[[eat, tea, ate], [tan, nat], [bat]]
        System.out.println(_01_Using_Hashmap(new String[]{"abc", "cba", "bac", "foo", "bar"})); //[[abc, cba, bac], [foo], [bar]]
        System.out.println(_01_Using_Hashmap(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"})); //[[listen, silent], [triangle, integral], [garden, ranged]]

	}

	private static List<List<String>> _01_Using_Hashmap(String[] strings) {
		// Time complexity: O(NKlogK)
		// Space complexity: O(NK)
		HashMap<String, List<String>> anagramGroup = new HashMap<String, List<String>>();
		for (String str : strings) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String sortedStr = new String(chars);
			if(anagramGroup.containsKey(sortedStr)) {
				anagramGroup.get(sortedStr).add(str);
			}else {
				List<String> group = new ArrayList<String>();
				group.add(str);
				anagramGroup.put(sortedStr, group);
			}
		}	
		return new ArrayList<List<String>>(anagramGroup.values());
	}

}
