package collectionapi;

import java.util.*;

//MAP : KEY : VALUE
// internally uses Set(Treeset, Hashset)
// 2 types -> HashMap, TreeMap
// keys are always unique, if duplicated then value will be updated as per last entry
public class MapDemo {

    public static void main(String[] args) {
      //  Map<Key, value>
        // entry --> key , value
        Map<Integer,String>  m1 = new HashMap<>(); // initialization
    //    System.out.println(m1.size()); // returns number of entries in a map

        m1.put(11,"Roshan"); // {11 : Roshan}
        m1.put(12,"Rekha");
        m1.put(11,"Shyam"); // key can not be duplicate, values can be duplicated

        // 11 : Shyam --> index 0
        // 12 : Rekha --> index 1

     //   System.out.println(m1.get(11)); // fetches value corresponding to that key.
        boolean re = m1.remove(1,"Roshan"); // removes a given entry from an index if present
        m1.remove(1); // removes entry from index 1
        m1.get(0); // rerturns value present against key 0
     //   System.out.println(m1.size());

        // hash bucket

        // map -> entry --> key, val
        for (Map.Entry<Integer,String> entry: m1.entrySet()) {
            System.out.println(entry.getKey() + " and " + entry.getValue());
        }

        for(Integer x : m1.keySet()){
            System.out.println( x + " and " + m1.get(x));
        }

        System.out.println(m1);

        Map<Integer,String> m2 = new TreeMap<>();
        m2.put(80,"Ram");
        m2.put(70,"Shyam");
        m2.put(91,"Raghav");
        m2.put(90,"Rupa");

        System.out.println(m2);
        // Student --> name, dept, marks
// Ram, ECE, 80 - s1
// Shyam, CS, 70 -s2
// Raghav, ME, 91 - s3
// Rupa, CS, 90 - s4
// List<Student> students


    }

}

// hashing: key % 10
// hash
// 1 -> "Roshan" -> "Shyam"
// 2 -> "Rekha"
// In map, if a key is added twice, value of that key will be updated to latest entry

// {11,12,11} -> Hashset
// hashing: key % 10
// 1
// 2
// in Set, if a value is added twice, then hashset won't get updated on latest entry