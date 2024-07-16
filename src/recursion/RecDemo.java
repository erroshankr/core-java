package recursion;

public class RecDemo {
    public static void main(String[] args) {
        // 5 : 5+4+3+2+1 = 15
       // System.out.println(reversal("RAM"));
       // printNum(5);
      //  System.out.println(findSum(5)); // 15
     //  geoProgression(2,2,40);
       printFibonacciSeries(10);

    }


    public static void printNum(int num){ // ip= 5, op = 0,1,2,3,4,5 using recursion
        if(num == 0){ // base condition/ terminating condition
            return;
        }
        printNum(num -1); // printNum(3), num = 2
        System.out.println(num); // 15
    }

    public static int findSum(int i) { // i = 5, sum = 5+4+3+2+1 = 15
        if(i == 1){
            return 1;
        }
        return findSum(i - 1) + i;

       /* int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum = sum + j;
        }*/
    }

    public static int findFactorial(int num){
        if(num == 0){
            return 1;
        }
        return findFactorial(num - 1) * num;
    }

    public static int power(int x , int y){ // x^y
        if(y == 0){
            return 1;
        }
        return x * power(x,y-1);
    }

    public static String reversal(String str){  // RAM -->  AMR
       if(str.isEmpty()){
           return str;
       }
       return reversal( str.substring(1)) + str.charAt(0); // AMR -> MRA  --> RAM
    }

    public static void geoProgression(int num, int factor, int limit){ //2,2,40
        if(num  > limit){
            return;
        }
        System.out.println(num); // GP in ascending order
        geoProgression(num*factor, factor, limit);
        System.out.println(num); // GP in descending order

    }

    public static int fibonacciSeq(int n){ // (n-1) + (n-2)
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacciSeq(n-1) + fibonacciSeq(n-2);
        }
    }  // fibonacciSeq(5)

    public static void printFibonacciSeries(int n){
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacciSeq(i)); // n*i
        }
    }

    // binary search using recursion
    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Target found
        } else if (array[mid] > target) {
            return binarySearch(array, target, left, mid - 1); // Search in the left half
        } else {
            return binarySearch(array, target, mid + 1, right); // Search in the right half
        }
    }
    //  0, 1, 1, 2, 3, 5, 8, 13

    // num =2, factor =2 --> 2,4,8,16,32,64
}

//0 1 1 2 3 .....
