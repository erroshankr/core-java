package exception;

// try,catch,finally : it actually handles exception: safety measure
// throw : used to throw/create exception object manually--> forcefully creates exception
// throws : declares that a method can throw exception--> it avoids handling exception --> no safety measure: always used with method
//          : it gives handling responsibility to its calling method
// custom exception
public class ExceptionDemo2 {

    public static void printData(int[] arr, String str, int index){
        try {
            int x = arr[index]; // 9

            if(x <= 2*str.length()){ // 9 <= 12
                try {
                    char ch = str.charAt(index); // s -> StringIndexOutofBoundEx
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Exception occurred in fetching index value from String");
                }finally {
                    System.out.println("Inside inner finally block");
                }
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred in fetching index value from array");
            System.out.println(e.getLocalizedMessage());
        }catch (NullPointerException e){
            System.out.println("Exception occurred in fetching index value in outer loop");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Exception occurred in fetching index value from array in line 25");
            System.out.println(e.getLocalizedMessage());
            try {
                System.out.println(index / 0);
            }catch (ArithmeticException e1){
                System.out.println("Exception occurred in dividing index/0");
            }
            System.out.println("Connection close");
        }finally {
            try {
                System.out.println(4 / 0);
            }catch (Exception e){
                System.out.println("Exception occurred in dividing 4/0");
            }finally {
                System.out.println("outer most finally");
            }
            System.out.println("Control in finally block");
        }/*finally{ // cant have more than one finally block for one pair of try-catch
            System.out.println("Another finally blockl");
        }*/

        System.out.println("Program ended");
    }

    public static void main(String[] args) throws RuntimeException {

        int[] ar = {2,4,3,5,5,6,7,9}; // len=4, index : 0-3
      //  printData(ar,"Roshan",7); // len = 6, index: 0-5
        try {
            testException(ar, "Roshan", 5);
        }catch (Exception e){
            System.out.println("Exception occurred in main method");
        }
     //   testException(ar, "Roshan", 5);
        System.out.println("exited respectfully");
    }

    public static void testException(int[] arr, String s, int index) throws RuntimeException,NullPointerException,ArithmeticException{
        int val = arr[index];
      /*  try {
            throw new ArithmeticException(); // throw: used to create exception object
        }catch (Exception e){
            System.out.println("Exception occurred");
        }*/
        if(index <10) {
            throw new RuntimeException(); // forcefully creates exception object
        }
    //    System.out.println("Program successful");
    //    System.out.println("My name is Roshan");
    }
}
