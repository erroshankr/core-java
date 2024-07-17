package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 12;
        ar[1] = 10;
        ar[2] = 11;
        ar[3] = 3;
        ar[4] = 5;

      selectionSort(ar);
        System.out.println(Arrays.toString(ar));
    }
//1. find the minimum value of the array
//2. swap the minimum value to the front of unsorted part of array
//3. navigate thro array continuously for n number of times and do same operation , given that n is length of array

// // 12,10,11,3,5 --> unsorted --> 3,10,11,12,5 --> 3,5,11,12,10 --> 3,5,10,12,11 --> 3,5,10,11,12
// minEle = 3;
// 3,5,12,10,11  -- > 3,5,12,10,11 -->3,5,10,11,12
    public static void selectionSort(int[] ar){  // 12,10,11,3,5
        int n = ar.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            for(int j= i+1; j < n ;j++){
                if(ar[j] < ar[minIndex]){
                    minIndex = j;
                }
            }

            int temp = ar[minIndex];
            ar[minIndex] = ar[i];
            ar[i] = temp;
        }
    }

    // time complexity : O(n^2)
    // space complexity : O(1)
}
