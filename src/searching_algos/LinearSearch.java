package searching_algos;

public class LinearSearch { // given array may or may not be sorted

    public static void main(String[] args) {
        int[] ar = {2,4,0,1,9}; // search a num , if present return its index else return -1;
        LinearSearch l1 = new LinearSearch();
        System.out.println(l1.linearSearch(ar,5));
    }

    public int linearSearch(int[] inp, int num){
        for (int i = 0; i < inp.length; i++) {
            if(inp[i] == num){
                return i;
            }
        }
        return -1;
    }

}


// 2,4,0,1,9