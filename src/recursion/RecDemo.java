package recursion;

public class RecDemo {
    public static void main(String[] args) {
        // 5 : 5+4+3+2+1 = 15
        System.out.println(reversal("RAM"));
    }


    public static int findSum(int i) { // i = 5, sum = 0
        if(i == 1){
            return 1;
        }
        return findSum(i - 1) + i;
    }

    public static int findFactorial(int num){
        if(num == 0){
            return 1;
        }
        return findFactorial(num - 1) * num;
    }

    public static int power(int x , int y){ // x^y
        if(y==0){
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
