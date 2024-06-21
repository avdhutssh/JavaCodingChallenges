package Java.UdemyFifthyCodingChallenges;

public class _13_substrIndex {

	public static void main(String[] args) {
		String str1 = "inside", str2 = "side", str3="in", str4="code";
		
		System.out.println(_01_BruteForceApproach(str1,str2));  //2
		System.out.println(_01_BruteForceApproach(str1,str3));  //0
		System.out.println(_01_BruteForceApproach(str1,str4));  //-1

	}

    public static int _01_BruteForceApproach(String str1, String str2){
    	// Time complexity: O(nm)
    	// Space complexity: O(1)
        int n = str1.length();
        int m = str2.length();
        for(int i =0; i<=n-m; i++){
            boolean found = true;
            for(int j=0; j<m; j++){
                if(str1.charAt(i+j) != str2.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found) return i;
        }
        return -1;
    }
    
}
