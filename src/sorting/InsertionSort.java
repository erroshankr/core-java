package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 12;
        ar[1] = 10;
        ar[2] = 11;
        ar[3] = 3;
        ar[4] = 5;

        insertionSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    /*
    1. start with 2nd element assuming 1st is already sorted
    2. Compare teh current element  with elements in sorted portion of teh array
    3. Shift all elements greater than current element one position toward right
     */

    private static void insertionSort(int[] ar) {  // // 12,10,11,3,5 --> 10,12,11,3,5 --> 10,11,12,3,5 -> 3,10,11,12,5 --> 3,5,10,11,12
      int n = ar.length;

        for (int i = 1; i < n; ++i) {
            int key = ar[i];
            int j = i-1;

            while(j >= 0 && ar[j] > key){
                ar[j+1] = ar[j];
                j = j-1;
            }

            ar[j+1] = key;
        }

    }
}

// time complexity : O(n^2)
// space complexity: O(1)
