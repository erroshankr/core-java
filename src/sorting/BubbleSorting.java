package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// expensive operation :
public class BubbleSorting {

    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 12;
        ar[1] = 10;
        ar[2] = 11;
        ar[3] = 3;
        ar[4] = 5;

        // 12,10,11,3,5 -->
        // i=0 : 10,12,11,3,5 -> 10,11,12,3,5 -> 10,11,3,12,5 -> 10,11,3,5,12
        // i=1 : 10,3,11,5,12 -> 10,3,5,11,12
        // i=2 : 3,5,10,11,12
        // i=3 : 3,5,10,11,12
        // i=4 : 3,5,10,11,12
        bubbleSort(ar);

    }

    public static int[] bubbleSort(int[] ar){ // 12,10,11,3,5  --> 3,5,10,11,12
        int n = ar.length; // 5

        for (int i=0; i < n ;i++){ // i=4
            for (int j = 0; j < n-i-1; j++) { // j =0,1,2,3,4
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
        return ar;
    }

    // time complexity = O(n^2)
    // space complexity = O(1)
}
