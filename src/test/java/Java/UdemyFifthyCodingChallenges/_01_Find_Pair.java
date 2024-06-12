package Java.UdemyFifthyCodingChallenges;

public class _01_Find_Pair {

	public static void main(String[] args) {
		int[] arr1 = {4, 5, 1, -3, 6};
		System.out.println(findpair(arr1, 11));
		int[] arr2 = {4, 5, 1, -3, 6};
		System.out.println(findpair(arr2, -2));
		int[] arr3 = {4, 5, 1, -3, 6};
		System.out.println(findpair(arr3, 8));
	}

	private static boolean findpair(int[] arr, int k) {
		for(int i =0; i<arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==k) {
					return true;
				}
				
			}
			
		}
		return false;
		
	}

}
