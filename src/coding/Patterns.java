package coding;

// https://prepinsta.com/pattern-programs-tutorial/
public class Patterns {



    /*
         * * * * *    i=1,j=1-5
           * * * *    i=2,j=2-5
             * * *    i=3,j=3-5
               * *    i=4,j=4-5
                 *    i=5,j=5
     */

    /*  j <= 5-i+1
         * * * * *   i=1,j=1,2,3,4,5
         * * * *     i=2,j=1,2,3,4
         * * *       i=3,j=1,2,3
         * *         i=4,j=1,2
         *           i=5,j=1
     */

    /*
         *           i=1,j=1
         * *         i=2,j=1,2
         * * *       i=3,j=1,2,3
         * * * *     i=4,j=1,2,3,4
         * * * * *   i=5,j=1,2,3,4,5
    */

    /*
                 *    i=1,j=5
               * *    i=2,j=4,5
             * * *    i=3,j=3,4,5
           * * * *    i=4,j=2,3,4,5
         * * * * *    i=5,j=1,2,3,4,5
     */

    /*
         *        *   i=0,j=0,4
           *    *     i=1, j=1,3
             *        i=2,j=2
           *    *     i=3,j=1,3
         *         *  i=4,j=0,4
     */

    /*
         * * * * *    i=1,j=1,2,3,4,5
         * *   * *    i=2,j=1,2,4,5
         *   *   *    i=3,j=1,3,5
         * *   * *    i=4,j=1,2,4,5
         * * * * *    i=5,j=1,2,3,4,5
     */

    /*
         *      i=1,j=1
         * *    i=2,j=1,2
         * * *  i=3,j=1,2,3
         * *    i=4,j=1,2
         *      i=5,j=1
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {  // i=1
            for (int j = 1; j <= 3 ; j++) { // j==1,2,3,4,5
                if(j==1) {
                    System.out.print("* ");
                }
                else if(j <= i && i <= 5/2 +1){
                    System.out.print("* ");
                }
                else if (j == 5-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
