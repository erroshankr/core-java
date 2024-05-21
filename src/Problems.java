import java.util.HashMap;
import java.util.Map;

public class Problems {
    public static void main(String[] args) {
        int x = 312;  //
        System.out.println(convertNUmbertoWords(312));
    }

    private static String convertNUmbertoWords(int x) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
        map.put(13,"thirteen");
        map.put(14,"fourteen");
        map.put(15,"fifteen");
        map.put(16,"sixteen");
        map.put(17,"seventeen");
        map.put(18,"eighteen");
        map.put(19,"nineteen");
        map.put(20,"twenty");
        map.put(30,"thirty");
        map.put(40,"fourty");
        map.put(50,"fifty");
        map.put(60,"sixty");
        map.put(70,"seventy");
        map.put(80,"eighty");
        map.put(90,"ninety");

        if(x == 0){
            return "zero";
        }

        StringBuilder sb = new StringBuilder();

        if(x >= 100){ // 312
            int hundredts = x/100;
            sb.append(map.get(hundredts)).append(" ").append("hundred").append(" ");
            x = x%100;
            if(x > 0){
               // sb.append(" ");
            }
        }

        //
        if(x >= 20){
            int tenth = x /10;
            sb.append(map.get(tenth)).append(" ");
            x = x%10;
            if( x > 0){
                sb.append(map.get(x)).append(" ");
            }
        } else if (x >= 10) {
            sb.append(map.get(x)).append(" ");
        } else if (x > 0) {
            sb.append(map.get(x)).append(" ");
        }

        return sb.toString();
    }
}

// 645/1000 :645

// 764576476476
// %10 = 6/1 = 6   : 5
// %100 = 76/10 = 7  : 4
// %1000 = 476 = 476/100 = 4 : 6
// %10000 = 6476 = 6476/1000 = 6