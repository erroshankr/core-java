package arrays;

import java.sql.Struct;

// array: collection of homogenous elements
//String: array of characters
//
// String z =
public class StringDemo {

    public static void main(String[] args) {
        char[] ar = new char[5];
        ar[0]='p';
        ar[1]='r';
        ar[2]='i';
        ar[3]='y';
        ar[4]=' '; // empty character

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }

        System.out.println();

        String x = ""; // empty string --> Immutable -> once defined, cant be changed
        String[] ar2 = new String[5]; // array of array of characters
        ar2[0]="p";
        ar2[1]="5";
        ar2[2]="payal";
        ar2[3]="sneha";
        ar2[4]="Rani";

        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i] + " ");
        }

        Boolean[] ar3 = new Boolean[5];
        System.out.println(ar3.hashCode());

    }
}
