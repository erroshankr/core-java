package strings;

public class StringQuestion {

    public static void main(String[] args) {
        String s1 = "";
        char ch = ' ';
//        System.out.println(s1.length());
        char[] ar = s1.toCharArray();
//        System.out.println(ar.length);
//        System.out.println(s1.split("").length);
        String[] sr = s1.split("");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        for (int i = 0; i < sr.length; i++) {
            System.out.println(sr[i]);
        }

        String s2 = "roshan is my name lgfiuscgherkuvghekrhvkehbj"; // 256bytes --> "r" + "o" + "s" + "h" + "a" + "n" = "roshan"
        String[] names = {"roshan", "is", "my", "name"}; // length = 3, space = 3*256
        //
        System.out.println(s2);
        System.out.println(names);

        System.out.println(s2.length()); // method
        System.out.println(names.length); // property

        String s3 = "My name is roshan";
        /*for (int i = 0; i < 10000; i++) {
            s3 += s3;
        }
        s3 = s3 + "full";*/
        System.out.println(s3);

        StringQuestion sq = new StringQuestion();
        System.out.println(sq);

        String s4 = "      This is my India         "; // "This is my India"
        String[] sAr = s4.split(" ");
        System.out.println(sAr.length);
    /*    boolean rightVal = false;
        String res = "";
        int start=0;
        int end= s4.length()-1; // 5


        for (start = 0; start < end && Character.isWhitespace(s4.charAt(start));start++);
        for (end = s4.length()-1; start < end && Character.isWhitespace(s4.charAt(end));end--);
        res = s4.substring(start,end+1);
        System.out.println(res);*/

        System.out.println(s4.trim()); // removed leading & lagging spaces from String

        System.out.println("roshan" + "kumar"); // roshankumar
        System.out.println("roshan".concat("kumar")); // + , concat

        String s5 = "My name is Khan. My name is Bob. My name is Sonoo.";
    //    String s6 = s5.replace("sh","xy");
     //   System.out.println(s6);
      //  System.out.println(s5.replace("is","was"));
        System.out.println(s5.replace("is","was")); // robshbn
        System.out.println(s5.replaceAll("is","was"));  // it replaces based on regex-> regular expression
    }

    @Override
    public String toString(){
        return "1234";
    }
}
