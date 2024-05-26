package strings;

public class StringMoreMethods {

    public static void main(String[] args) {

        // String constant pool is special memory location present in JVM where only string literals are stored
        // A1: location of "roshan" in string constant pool
        // string defined within double quotes, e.g "test" --> constant string value
        String s1 = "roshan"; // String s1 = new String("roshan");  --> new String created
        String s2 = "roshan"; // String s2 = s1;
        String s3 = "Roshan";
        String s4 = "RoShaN";
        String s5 = new String("roshan");
        String s6 = String.valueOf("roshan");

        System.out.println(s1 == s4); // length, sequence of characters, case sensitivity, hashcode & memory location [both value & memory based]
        System.out.println(s1.equals(s3)); // checks only length & sequence of characters & case sensitivity[value based only--> case sensitive]
        System.out.println(s1.equalsIgnoreCase(s3)); // checks only length & sequence of characters but no case sensitivity[value based but no case sensitivity]
        System.out.println(s1.equalsIgnoreCase(s5));


        System.out.println(s1 == s2); // true --> both are same String literal
        System.out.println(s1 == s3); // false --> value is different, no need to check memory
        System.out.println(s1 == s5); // false --> memory location different
        System.out.println(s1 == s6);


        String s7 = null; // object
        String s8 = new String("null"); // text -> sequence of characters enclosed within ""
        // -> it is pointing to an object which in turn is pointing to string constant pool.

        // Each unique string literal is stored only once.

        System.out.println(s7 == s8);
        String s9 = "null"; // --> it point directly in String constant pool where "null" is stored

        String s10 = "roshankumarjha";
        String s11 = "r"+"o"+"s"+"ha"+"n"+"kum"+"ar"+"jha"; // "roshankumarjha"
        String s12 = String.valueOf('r'+'o'+'s'+'h'+'a'+'n'+'k'+'u'+'m'+'a'+'r'+'j'+'h'+'a'); // casts integer into String
        System.out.println(s10.equals(s11)); // true
        System.out.println(s10 == s11); // true
        System.out.println(s11 == s12); // false
        System.out.println(s10 == s12); // false
        System.out.println('r'+'o'+'s'+'h'+'a'+'n'+'k'+'u'+'m'+'a'+'r'+'j'+'h'+'a');


        System.out.println(s10.contains("kumar"));
        System.out.println(s10.contains("roshanjha"));
        System.out.println(s10.contains("roshan"));

        System.out.println(s10.startsWith("roshan")); // true
        System.out.println(s10.startsWith("jha")); // false
        System.out.println(s10.startsWith("roshankumarjha")); // true

        System.out.println(s10.endsWith("roshan")); // false
        System.out.println(s10.endsWith("jha")); // true
        System.out.println(s10.endsWith("roshankumarjha")); // true
    }
}
