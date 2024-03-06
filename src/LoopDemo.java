public class LoopDemo {
    public static void main(String[] args) {
        int[] ar = new int[5];
        for (int i = 0; i < ar.length; i++) { // intialization -1 , condition -2, update -4, contentOfLoop-3
            System.out.println(ar[i]);
        }


        int counter =0;
        for (int x : ar){ // x is initialized with new value on every iteration.
            System.out.println(x); // x == ar[i]
            counter++;
        }
    }
}

// intialization -1 , condition -2, update -4, contentOfLoop-3
//1-2-3-4  -> 2,3,4 -> 2,3,4 .....
//


