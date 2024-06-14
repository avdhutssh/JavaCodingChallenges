package Java.LeetCode;

import java.util.HashMap;

public class _001_HT_CommonElementsInArray {

	public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

	}

    public static boolean itemInCommon(int[] array1, int[] array2){
        
        if(array1.length>array2.length){
            return itemInCommon(array2,array1);
        }
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
        for(int num : array1){
            hm.put(num, true);
        }
        for(int num: array2){
            if(hm.containsKey(num)) return true;
        }
        return false;
    }
}
