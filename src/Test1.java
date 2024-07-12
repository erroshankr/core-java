import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        int[] ar = {1,0,0,1,0,1,1};
    //    int[] ar = {1,0,0,1,1,0,0,1};
        System.out.println(findCount(ar));
    }

    public static int findCount(int[] ar){
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0; // 1 + 2 = 3
        int sum = 0;

        map.put(0,1); // sum, count    0:3, 1:1, -1:1,

        for (int x : ar){
            if(x == 0){
                sum = sum -1;
            }
            if(x == 1){
                sum = sum + 1; // 1 -> 0 -> -1 -> 0 -> -1 -> 0 -> 1
            }

            if(map.containsKey(sum)){
                result = result + map.get(sum);
                map.put(sum, map.get(sum) + 1);
            }else{
                map.put(sum, 1);
            }
        }

        return result;
    }
}
