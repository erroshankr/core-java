package arrays;

import java.util.Arrays;

public class ArrayBasedProblems {

    /*
     Problem 1
     int[] = {3,2,5,7}
     */
    public boolean isAscendingSortedArray(int[] input){ //
        // if sorted return 'true' else 'false'
        if(input == null){
            return false;
        }
        if(input.length==1){
            return true;
        }
        // {5,5,6,8} : length = 4, index : 0,1,2,3
        for (int i = 0; i < input.length-3; i++) {
            if(input[i+3] > input[i]){
                return false;
            }
        }
        return true;
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
    public int[] swapElements(int[] input,int x, int y){ // 1,3,3,8  - 2,0    :5, y=0:1, --> 5,3,1,8

        /**
         * pehle input[2] ka value nikaal k kahi store karenge
         * input[0] ko input[2] daal diye
         * stored value ko input[0] me daal do
         */
          int tmp = input[2];
          input[2] = input[0];
          input[0] = tmp;


      return input;
    }

    /*
     Problem 6
     Complete the code below to insert an element into the given array at a given index and return modified array. Given that index value can
     be maximum the length of the array.
     */

    public int[] insertIntoArray(int[] input, int index, int value){
      return null;
    }

    public boolean checkTriplet(int a, int b , int c){
    /*    int num = Math.max(a,b);
        num = Math.max(num,c);*/
        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
            return true;
        }else{
            return false;
        }
    }

    // Arrays.sort : 23345576476476467474 : 2
    public static void main(String[] args) {
        ArrayBasedProblems a1 = new ArrayBasedProblems();
        int[] ar = {1,2,3,4,5};
      //  System.out.println(a1.findElementCount(ar,-5));
        System.out.println(a1.checkTriplet(3,4,6));
    }

}
