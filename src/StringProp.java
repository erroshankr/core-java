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
        //       char ch = 'a'; //97
        //      System.out.println((int)ch);

        //      int x = 100;
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

        //    String x1 = "HARSHIT"; //{H,a,r,s,h,i,t}
        // x.toCharArray():
   /*     char[] res = new char[x1.length()];
        for (int i = 0; i < x1.length(); i++) {
            res[i] = x1.charAt(i);
        }*/

        //     System.out.println(Arrays.toString(res)); r,o,s,h,a,n
        //     System.out.println(Arrays.toString(x1.toCharArray()));

        // a:97, A:65 = 32
        // c - C = 32
        // c - 32 = C

/*        String rt = "";
        for (int i = 0; i < x1.length(); i= i+2) { // HARSHIT : hArShIt
            char ab = (char)(x1.charAt(i) + 32); // 0,2,4,6,8,
            rt = rt + ab; // h
        }

        System.out.println(rt);*/

        // HaRsHiT

        //     String s1 = "roshan-kumar-jha"; // is 'x' present or not : 11
        // {2,3,4,6,8,10} : 10 --> 7/2=3

        /*for (int i = 0,j=s1.length()-1; i < j ; i++,j--) {
            if(s1.charAt(i) == 'x' || s1.charAt(j)=='x'){
                System.out.println("x is present");
            }else{
                System.out.println("not present");
            }
        }*/

        /* char ch = ' ';
         String s2 = "";
        String[] ar = s1.split(""); // split method always returns String array
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(s1.toCharArray()));*/
        //roshan
     /*   String x = "x";
        String y = "";
        String z = "z";*/
        //    System.out.println(x+y+z); //xz :
        //    System.out.println(x+z); // xz :


    /*
    1. no of words in s
    2. interchange caps with small letter and vice-versa:  mY NAME IS sACHIN
    3. reverse the string without using String builder/buffer : Sachin is name My
    4.Make alternate word starting with caps: My name Is sachin
    5.Make last character of each word small
     */

        String s = "My name is Sachin";  // Sachin is name My
        System.out.println("Q1: " +s.split(" ").length);
        char[] ar = s.toCharArray();
        String res = "";
        for (int i = 0; i < ar.length; i++) {
            if(Character.isUpperCase(ar[i])){
                res = res + Character.toLowerCase(ar[i]) ;
            }
            else if(Character.isLowerCase(ar[i])){
                res = res + Character.toUpperCase(ar[i]);
            }
            else{
                res = res + ar[i];
            }

           /* if(ar[i] >= 97){ // lower case
                res = res + (char)(ar[i] -32); // upper case
            }
            else if(ar[i] >= 65 && ar[i] <= 90){ // upper case
                res = res + (char)(ar[i] + 32); // lower case
            }else{
                res = res + ar[i]; // no case change
            }*/

        }

        System.out.println("Q2: " + res);

       String[] arr = s.split(" "); //{My, name, is, Sachin}       5.Make last character of each word small
    //   String[] revAr = new String[arr.length]; // {Sachin, is, name, My}
        String resQ3 = "";
        int j = 0;
        // single pointer aproach
        for (int i = arr.length-1; i >= 0; i--) {
            resQ3 = resQ3 + arr[i] + " ";
            j++;
        }
        System.out.println("Q3: "+resQ3);

        String resQ4 = "";
        for (int i = 0; i < arr.length; i++) { // s = sachin -> s.substring(0) = sachin, s.substring(2)= chin, s.substring(0,1)= ach
            if(i % 2 == 0) {
                resQ4 = resQ4 + Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1)+ " ";
            }else{
                if(Character.isUpperCase(arr[i].charAt(0))){
                    arr[i] = Character.toLowerCase(arr[i].charAt(0)) + arr[i].substring(1);
                }
                resQ4 = resQ4 + arr[i] + " ";
            }
        }

        System.out.println("Q4: " + resQ4); // MY namE iS SachiN --> My name is Sachin

        String resQ5 = "";
        for (int i = 0; i < arr.length; i++) { //{My, name, is , Sachin}

            resQ5 = resQ5 + arr[i].substring(0,arr[i].length()-1) + arr[i].substring(arr[i].length()-1).toUpperCase() +" "; // Sachi+N = SachiN
        }

        System.out.println("Q5: " + resQ5);

        String s1 = "abcdef";
        String s2 = "abcdeg";

        System.out.println(s1.compareTo(s2));
        // compareTo returns integer
        // if res == 0 --> both strings have same character sequence
        // if res > 0 --> 2nd parameter will come first lexicographically
        // if res < 0 -> 1st parameter will come first lexicographically






    }
}
