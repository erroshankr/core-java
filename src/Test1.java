import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int num = 15; //[1,2,3,4,5],[4,5,6],[7,8],[15]
        List<List<Integer>> result = findCombo(num);
        for (List<Integer> l: result) {
            System.out.println(Arrays.toString(l.toArray()));
        }
    }
    public static List<List<Integer>> findCombo(int n){
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            int sum = 0;
            List<Integer> tempList = new ArrayList<>();

            for (int num = i; num <= n; num++) {
                sum += num;
                tempList.add(num);

                if(sum == n){
                    result.add(new ArrayList<>(tempList));
                    break;
                }

                if(sum > n){
                    break;
                }
            }
        }

        return result;
    }
}
