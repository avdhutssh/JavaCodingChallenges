package Java.UdemyFifthyCodingChallenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _08_longestSubstringWithoutRepeating {

	public static void main(String[] args) {
		String str1 = "abcdbeghef"; // 6
		String str2 = "aaaaa"; // 1
		String str3 = "eddy"; // 2

		System.out.println(_01_BruteForceApproach(str1));
		System.out.println(_01_BruteForceApproach(str2));
		System.out.println(_01_BruteForceApproach(str3));
		System.out.println("--------------------");
		
		System.out.println(_01_Using_HashMap(str1));
		System.out.println(_01_Using_HashMap(str2));
		System.out.println(_01_Using_HashMap(str3));

		System.out.println(lengthOfLongestSubstring(str1));
		System.out.println(lengthOfLongestSubstring(str2));
		System.out.println(lengthOfLongestSubstring(str3));
	}

	private static int _01_BruteForceApproach(String str) {
		// Time complexity: O(n^3)
		// Space complexity: O(n)
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String subStr = str.substring(i, j+1);
				if(isUnique(subStr) && subStr.length()>result.length()) {
					result = subStr;
				}
			}
			
		}
		return result.length();

	}

	public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
	
	private static int _01_Using_HashMap(String str) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int maxLen = 0;
		int start = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if(hm.containsKey(str.charAt(i))) {
				start = Math.max(start,hm.get(str.charAt(i))+1);
			}
			hm.put(str.charAt(i), i);
			maxLen = Math.max(maxLen, i-start+1);
			}
		return maxLen;

	}
	
	private static boolean isUnique(String subStr) {
		HashSet<Character> hs = new HashSet<Character>();
		for (Character ch : subStr.toCharArray()) {
			if(!hs.add(ch)) return false;
		}
		return true;
	}
}