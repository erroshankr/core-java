import java.util.Arrays;

public class StringProp {

    //234 : 432
    public static void main(String[] args) {

       // int[] ar = new int[5];
        //System.out.println(ar.length); // length is property of an array
  /*      String s1 = "roShaN"; // 2 : A:65,a:97 :32--> {r,o,s,h,a,n}
        System.out.println(s1.length());
        System.out.println(s1.charAt(15));
        */

        // Each character is equivalent to some integer: character and integer are interchangable.
        char ch = 'a'; //97
  //      System.out.println((int)ch);

        int x = 100;
   //     System.out.println((char)x);

     //   char ar1 = new char[]; // A:65, Z=90 , a= 97
     /*   for(char cz = 'a'; cz <= 'z'; cz++){
            System.out.print(cz);
        }

        for (int i = 97; i <= 90; i++) {

        }*/

        // a-z


        /*char[] c1 = s1.toCharArray();
        int capCount=0;
        int smallCount =0;
        for (int i = 0; i < c1.length; i++) {
            if(c1[i] >= 97){
                smallCount++;
            }else{
                capCount++;
            }
        }*/
/*
        int capCount=0;
        int smallCount =0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) >= 97){
                smallCount++;
            }else{
                capCount++;
            }
        }




        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.toUpperCase().toLowerCase().toUpperCase());
        System.out.println("length of string: " + s1.length()); // length is a method in String

        String s2 = "This is my India"; // {T,h,i,s,,i,s,,m,y,,I,n,d,i,a} --> char array -> 16
        char[] ar = s2.toCharArray();
        System.out.println(ar.length); // 16

        // {This,is,my,India} -> String array -> 4
*//*

        String[] sr = new String[16];
        for (int i = 0; i < ; i++) {

        }
*//*

       // Array(70%) + additional method(30%) = String
        String s3 = "true";
        s3 = "3";
        s3="3.23";

       // in built types: int,char,float,boolean,double,long,short,byte: none of primitive types have default value as 'null'
*/

        String x1 = "HARSHIT"; //{H,a,r,s,h,i,t}
        // x.toCharArray():
        char[] res = new char[x1.length()];
        for (int i = 0; i < x1.length(); i++) {
            res[i] = x1.charAt(i);
        }

   //     System.out.println(Arrays.toString(res));
   //     System.out.println(Arrays.toString(x1.toCharArray()));

        // a:97, A:65 = 32
        // c - C = 32
        // c - 32 = C

        String rt = "";
        for (int i = 0; i < x1.length(); i= i+2) { // HARSHIT : hArShIt
            char ab = (char)(x1.charAt(i) + 32); // 0,2,4,6,8,
            rt = rt + ab; // h
        }

        System.out.println(rt);

        // HaRsHiT

    }
}
