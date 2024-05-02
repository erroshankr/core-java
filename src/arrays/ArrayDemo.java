package arrays;

//array: collection of homogenous elements
//homogenous : same type
public class ArrayDemo {

   /* @Override
    public String toString() {
        return "This is an object of ArrayDemo class";
    }*/

    // int,float,boolean,long,double,short,char,byte
    static {
        System.out.println("this is static block");
    }
    public static void main(String[] args, int x) {
        System.out.println("inside overloaded method");
    }
       public static void main(String[] xyz) { // entry
        System.out.println("inside main");
           System.out.println("length of string array :" + xyz.length);
           for (int i = 0; i < xyz.length; i++) {
               System.out.println(xyz[i]);
           }

     //   Boolean[] ar1 = new Boolean[5]; // size declaration is mandatory in array : index: 0,1,2,3,4
     //   boolean[] ar2 = new boolean[5];
     //   int[] ar = new int[5]; // It stores integer values
      //  Integer[] ar3 = new Integer[5]; // It stores Integer object
       // int []ar : allocates 5 blocks of memory at a given space
        // it allocates 5 memory blocks and initializes them with default value.{0,0,0,0,0}
        // default value of object is NULL and default value of primitive is a specific value.
        /*for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }*/

    //    int x = 5; // primitive type
    //    Integer y = Integer.valueOf(x); // wrapper type -> wrapping
        // x is just a value but y is an java object.
       // System.out.println(y.hashCode());
       // System.out.println(y.intValue()); // unwrapping
        //System.out.println(y);

       /* ArrayDemo a1 = new ArrayDemo();
        ArrayDemo a2 = new ArrayDemo();
        System.out.println(a2);*/
     // dataType[] arrayName = new dataType[size];
        int[] ar = new int[5]; // length of array = size of array = 5, index : 0,1,2,3,4 : 5a: 0,0,0,0,0
        ar[0]= 5;
        ar[1]=6;
        ar[4]=15; // 5,6,0,0,10
        /*for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }*/

     //   System.out.println(ar.hashCode());
        int z = 10;
      //  System.out.println(ar[10]);
        // time complexity:
        // insert at given index: O(1)
        // insert : O(n)
        // delete at given index: O(n)
        // read: O(1)
        // update at given index: O(1)
        // search : O(n)
        // access : O(1)
        // {1,3,5,7,9} : length = 5, index: [0,1,2,3,4] --> ar[length] :- ArrayIndexofOutBound (2,7), (2,7], [2,7), [2,7],{2,7} -> {0,1,2,3,4}-
        // ar[length - 1] : last element of the array
       /* System.out.println(ar.length); // length is a property of an array: max index = length - 1
        for (int i = 0; i <= ar.length-1; i++) {
            System.out.println(ar[i]);  // ar[0],ar[1],ar[2],ar[3],ar[4]
        }
        for (int i = 0; i < ar.length; i++) {

        }*/
         // arrayOfInterest[1]
    }
}
