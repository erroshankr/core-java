package collectionapi;

import java.util.*;
import java.util.stream.Collectors;

// Set is an interface that extends Collection interface
// duplicate elements are not allowed in set
// Insertion sequence is not maintained
// Index based operation is not permitted.
public class SetDemo {

    // 1,3,4,5,7,1,8 : 7 --> 1,3,4,5,7,8

    public static void main(String[] args) {
        int[] inp = {1,4,5,1,7,8};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < inp.length; i++) {
            boolean res = set.add(inp[i]);
            if(!res){
                System.out.println(inp[i] +" is duplicate");
            }
        }


        /*int index = 0;
        for (Integer x: set) {
            if(index == 5) {  // li.get(5)
                System.out.println(x);
            }
            index++;
        }*/

        System.out.println(set);

    //    int index = 0;
        for (Integer x: set) {
            System.out.println(x);
      //      index++;
        }

        set.remove(3);
        System.out.println(set);
        System.out.println(set.contains(51));
        System.out.println(set.isEmpty());
        Object[] ar = set.toArray();
        int[] arr1 = set.stream().mapToInt(Integer::intValue).toArray();  // converts set into array
        Set<Integer> set2 = Arrays.stream(arr1).boxed().collect(Collectors.toSet()); // converts array to set

        // {2,4,6,7,6,2,9} -> {2,4,6,7,9}
        // {2,4,6,7,6,2,9} ->
        System.out.println(set.size());  // 5
        set.add(null);
        set.add(null);
        System.out.println(set.size()); // 6
        System.out.println("***************** TreeSet *******************"); // removes duplicate, makes entry sorted in ascending order
        int[] inp1 = {1,8,5,1,7,4};  // {1,4,5,7,8}
        System.out.println( new ArrayList<>(Arrays.stream(inp1).boxed().collect(Collectors.toSet())).reversed().stream().mapToInt(Integer::intValue).toArray());

        Set<Integer> tset = new TreeSet<>();
        for (int i = 0; i < inp1.length; i++) {
            tset.add(inp[i]);
        }
        System.out.println(tset);
        Collections.reverse(new ArrayList<>(set));

        int[] inp2 = {20,18,5,20,7,4};  // {1,4,5,7,8}

        // List -> Indexed based operation, duplication allowed
        // Set -> Indexed based operation not followed, duplication not allowed
        // Indexed based operation + Duplication not required --> use list with duplication check using Contains method
        List<Integer> l3 = new ArrayList<>();
        for (int i = 0; i < inp2.length; i++) {
            if(!l3.contains(inp2[i])){
                l3.add(inp2[i]);
            }
        }

        Set<Integer> set3 = new HashSet<>();  // it uses hashing technique to store elements.
        for (Integer x: inp2) {
            System.out.println("Insertion element: "+ x);
            set3.add(x);
        }
        System.out.println(l3);
        System.out.println(set3);
    //    System.out.println(printData(inp2));
    //    System.out.println(new TreeSet<>(printData(inp2)));

        // index rearangement in set is becoz of its add method implementation that uses map to store value which in turn uses hashing.
        // how hashing is used will be discussed during Map implementation.
    }


}
