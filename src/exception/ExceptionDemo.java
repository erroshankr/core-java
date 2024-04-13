package exception;
//error
//exception : present in java.lang : any event that disrupts normal execution/flow of program but it can be  recoverable/handled
//exception-handling: ability of the program to intercept run-time error, take corrective measures and continue normal execution
// error: Program flow cant be recovered
public class ExceptionDemo {
    public static void main(String[] args) {
        /*int x = 0;
        int y = 10;
        int res = y/x;
        System.out.println(res);*/

        int[] arr = {1,2,3,4}; // size = 4, index : 0-3
        int index = 20;
        checkException(arr,index);

    }

    public static void checkException(int[] arr, int index){
        try {
            System.out.println(arr[index]); // vulnerable code --> identify, correct & execute -> new ArrayIndexOutOfBoundsException();
            System.out.println(arr[index] + 1);
            String s = "Roshan";
            System.out.println(s.charAt(2));

         //   System.out.println(5 / 0);
        }
        /*}catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred in line 21");
            System.out.println(e);
         //   e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Exception occurred in line 24"); // hospital
        //    e.printStackTrace();
        } catch (IndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            System.out.println("Exception occurred in line 25"); // hospital
        //    e.printStackTrace();
        }catch (Exception e){
            System.out.println("Generic exception occured");
        }*/finally {
            System.out.println("All good now");
        }
        System.out.println("program executed");
        int z = 6;
        System.out.println(z+1);
    }


    /*
      x = y
      x*x = y*x
      x^2 = yx
      x^2 - y^2 = xy - y^2
      (x-y)(x+y) = y(x-y)
      (x+y) = ((x-y)/(x-y)) * y : 0/0 = 1 : incorrect --> indeterminate
      x+y = y
      2y = y
      2 = 1
     */
}
