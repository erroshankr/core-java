package recursion;

public class RecDemo {
    public static void main(String[] args) {
        // 5 : 5+4+3+2+1 = 15
       // System.out.println(reversal("RAM"));
       // printNum(5);
        System.out.println(findSum(5)); // 15
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
}

//0 1 1 2 3 .....
