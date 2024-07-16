package searching_algos;


// array must be sorted.
// step 1: divide array into 2 parts

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ar = {2,4,0,1,9}; // search a num , if present return its index else return -1;
        Arrays.sort(ar);
        BinarySearch l1 = new BinarySearch();
        System.out.println(l1.binarySearch(ar,5));

        Arrays.binarySearch(ar,4);
    }

    public int binarySearch(int[] ar, int i) {  // {0,1,2,4,9,11,13,14,15} :  3
       int mid = -1;
       int start = 0;
       int end = ar.length-1;

    //   List<Integer> l1 = new ArrayList<>(); O(n)

       while (start <= end){
           mid = start + ((end - start)/2);
           if(ar[mid] == i){
               return mid;
           }
           else if(ar[mid] < i){
               start = mid+1;
           }
           else if(ar[mid] > i){
               end = mid-1;
           }
       }

       return mid;
    }

}


// {0,1,2,4,9} : check if x present , x =9
// mid = (startIndex+endIndex)/2 : if length is even
// mid = (startIndex+endIndex)/2 + 1 : if length is odd
// arr[mid] = arr[2] = 2
// if(arr[mid] == x) --> return mid
// else if x > arr[mid] --> search in {4,9}
// else if x < arr[mid] --> search in {0,1}