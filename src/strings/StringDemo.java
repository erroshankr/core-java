package strings;

// collection of homogenous elements
// String: sequence of characters / array of characters --> it doesn't mean that character array is String
// String is IMMUTABLE
public class StringDemo {
    public static void main(String[] args) {
        char[] demo = new char[5]; // default value of char type data is null character , unicode = '\u0000' ,
     // Character[] demo = new Character[5];
    //    System.out.println(demo);

        demo[0] = 'b';
        demo[1] = 'c';
        demo[2] = 'x';
        demo[3] = 'z';
        demo[4] = 'm';

        String s1 = "";
      /*  for (int i = 0; i < demo.length ; i++) {
            s1 = s1 + demo[i];
        }

        System.out.println(s1);*/
 //       System.out.println(demo.length);


       /* Character ch = Character.valueOf('m');
        System.out.println(ch.charValue());
        Double d1 = Double.valueOf(5.2);
        double d2 = d1.doubleValue();
*/
     /*   Integer i1 = Integer.valueOf(6);
        int x = i1.intValue();
        System.out.println("Integer value: " + i1); // ref -> class@hashcode
*/
       /* String s2 = "roshan";
        System.out.println("roshan");
        System.out.println(s2);
        s2.toUpperCase();
        System.out.println(s2); // "ROSHAN"
       s2 = s2.toUpperCase();
        System.out.println(s2); // "ROSHAN" -> "roshan"*/

        String s3 = "roshan"; // String literal
        String s4 = "roshan"; // String literal

        // string literal having same value  --> share same location  : WHY ??

    //    System.out.println(s3);
   //     System.out.println(s3.toString());

        String s5 = new String("roshan");
        String s7 = new String("roshan");
    //    System.out.println(s5.toString()); // "roshan"
   //     System.out.println(s5);


        // ref check: length same, sequence of character same, memory same -> true
        // value check : length same, sequence of character same --> true --> No memory check

        System.out.println(s3 == s4); // true  --> ref check
        System.out.println(isSame(s3,s4)); // true --> value check


        System.out.println(s3 == s5); // false  --> ref check
        System.out.println(isSame(s3,s5)); // true  --> value

        String s6 = String.valueOf("roshan");

     //   String s7 = s3;


    //    System.out.println(isSame("roshan","roshan"));  // toString method will not be invoked

        // value same, length same, reference v same : String equality

    //    StringDemo sd = new StringDemo();
    //    System.out.println(sd);  // sd is still a reference but since its toString method is overridden to give a specific value, it is printing a value

     }

    @Override
    public String toString() {
        return "RoshanKrJha";
    }

    public static boolean isSame(String s1, String s2){ // roshan, roshaN
        if(s1.length() != s2.length()){
            return false;
        }
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
