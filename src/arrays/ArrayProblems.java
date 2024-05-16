package arrays;

import java.util.Arrays;
import java.util.*;

public class ArrayProblems {

    //
    public int[] removeDuplicates(int[] input){ // {2,2,4,2,5} ->{2,4,5}

        int[] ar = new int[input.length]; // {0,0,0,0,0}

        for (int i = 0; i < input.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < input.length; j++) {
                if(ar[i] == ar[j+1]){
                    isDuplicate = true;
                    break;
                }
            }
        }
       return null;
    }

    public int[] findDuplicates(int[] arr){ // 5,2,5,2,9 -> 5,2,9
       Arrays.sort(arr);
        int[] res = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j] && index < arr.length ){
                   res[index++] = arr[i];
                }
            }
        }
        return res;
    }


    public int[] intersectedArray(int[] ar1, int[] ar2){
        int len = Math.min(ar1.length,ar2.length);
        int[] res = new int[len];
        int index = 0;
        for (int i = 0; i < ar1.length; i++) { // 4
            for (int j = 0; j < ar2.length; j++) { //5
                if(ar1[i]==ar2[j] && index < len){
                    res[index++] = ar1[i];
                }
            }
        }
        return res;
    }

    public int[] mergeArray(int[] ar1, int[] ar2) { // 5,4
        int[] res = new int[ar1.length+ar2.length]; //9
        int index = 0; // 0-8
        for (int i = 0; i < ar1.length; i++) {
            res[index++] = ar1[i]; // index 0-4
        }

        //index = 5

        for (int i = 0; i < ar2.length; i++) { //4
            res[index++] = ar2[i];
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayProblems a1 = new ArrayProblems();
     //   int[] ar = a1.findDuplicates(new int[]{2,5,2,5,9,9,3});
      //  System.out.println(Arrays.toString(ar));
      //  int[] ar = a1.intersectedArray(new int[]{1,3,5,7}, new int[]{2,3,6,7,9});
       // System.out.println(Arrays.toString(ar));
        int[] ar = a1.mergeArray(new int[]{1,3,5,7}, new int[]{2,3,6,7,9});
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
