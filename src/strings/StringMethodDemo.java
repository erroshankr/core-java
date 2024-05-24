package strings;

public class StringMethodDemo {

    public static void main(String[] args) {
        //substring : breaks string into multiple parts based on index value
        // substring(int startIndex)

        String s1 = "hospital";

        String str = s1.substring(2); // separate s1 from index 2 and create a new string  -> spital
        String str1 = s1.substring(2,5); // separate s1 from index 2(include) until 5(exclude) , (2,5-1) -> {2,3,4} --> spi
        s1.substring(s1.length()-1);
        String s2 = s1 + ""; // since String is immutable, any operation on it will change the memory location
        String s3 = "hospital";

        System.out.println("s1-length: " + s1.length());
        System.out.println("s2-length: " + s2.length());

        // s1 == s2 : len(s1) = len(s2), seq of characters, both ref should point to same memory location(hashcode must be same).
        System.out.println("s1-hashcode: " + s1.hashCode() + " & s2-hashcode: " + s2.hashCode() + " & s3-hashcode: " + s3.hashCode());
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        System.out.println("S1-Memory address: " + Integer.toHexString(s1.hashCode()));
        System.out.println("S2-Memory address: " + Integer.toHexString(s2.hashCode())); // always prints the memory location of 1st element of the row.

        // if 2 objects have different hashcodes ---> they can not share same memory location
        // if 2 objects have same hashcodes --> Are they bound to share same memory location ? NO
        // hashing : 4 laptop and 50 e-books : 50c4: 50/4=12
        // L0 :13 - 26 min : 100 min-> B1
        // L1 :13 - 26 min : 100 min
        // L2 :12 - 24 min : 100 min
        // L3 :12 - 24 min : 100 min
        // Tushar:100045646, Harshit:12356756, Satru:56443567 Kiron:217647649 : roll%4 - hashcode

        int x = Integer.MIN_VALUE;
        // 132
        System.out.println(Integer.toBinaryString(132));
        int[] ar = {1,2,3,4,5};

        //Arrays, Collections, String,Integer, Double, Boolean,Long, Float, Character
        String s4 = "b4u5z";  // String --> buz, {b,4,u,5,z}
        String res = ""; // "45"
        char[] cr= s4.toCharArray();
        for (int i = 0; i < cr.length; i++) {
           if(Character.isLetter(cr[i])){
               res = res + cr[i];
           }
        }
        System.out.println(res);
    }
}
