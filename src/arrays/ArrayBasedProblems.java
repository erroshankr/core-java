package arrays;

import java.util.Arrays;

public class ArrayBasedProblems {

    /*
     Problem 1
     int[] = {3,2,5,7}
     */
    public boolean isAscendingSortedArray(int[] input){
        // if sorted return 'true' else 'false'
        return false;
    }

    /* Problem 2
     Complete method below and return the number of elements strictly greater than X in given array
     */
    public int findElementCount(int[] input, int X){ // {1,2,3,4,5} , 3 --> 2
        int res = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] > X){
                res++;
            }
        }
        return res;
    }

    /* Problem 3
      Complete the below code to return an array having maximum & 2nd maximum value respectively
      */
    public int[] findMaxElements(int[] input){
       return null;
    }

    /* Problem 4
    Complete below code to return the maximum frequency of an element in the given array.
     */
    public int countMaxFreq(int[] nums){
       return -1;
    }

    /* Problem 5
    Complete the code below to return the swapped array formed by exchanging the elements at x & y respectively. If given indices are invalid
    return empty array.
     */
    public int[] swapElements(int[] input,int x, int y){
      return null;
    }

    /*
     Problem 6
     Complete the code below to insert an element into the given array at a given index and return modified array. Given that index value can
     be maximum the length of the array.
     */

    public int[] insertIntoArray(int[] input, int index, int value){
      return null;
    }

    public static void main(String[] args) {
        ArrayBasedProblems a1 = new ArrayBasedProblems();
        int[] ar = {1,2,3,4,5};
        System.out.println(a1.findElementCount(ar,-5));
    }

}
