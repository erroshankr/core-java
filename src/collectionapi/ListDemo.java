package collectionapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) { // int,float,double,boolean,char,short..
        int[] ar = new int[5];// 0,0,0,0,0
        Integer[] ar3 = new Integer[5];
        ar[2] = 0; // 0,0,0,0,0
        int[] ar1 = new int[6];// 0,0,0,0,0,0
    //    int[] ar2 = new int[Integer.MAX_VALUE];

        List<Integer> li = new ArrayList<>(); // default capacity = 10
    //    li.add(5); // li.add(Integer.valueOf(5));
        List<Character> l2 = new ArrayList<>();
    //    l2.add(65);
 //       System.out.println(li.size()); // null,a2,a3,a4,a5,a6,a7,a8,a9,null

  //      System.out.println(Arrays.toString(li.toArray()));

        li.add(1);
        li.add(2);
        li.add(2);
        li.add(3);
        li.add(6);
        li.add(12);
        li.add(24);
        li.add(56);
        li.add(65);
        li.add(77);
        li.add(11);

   //     li.add(1,null); // will not work bcoz size of list is still 0
   //     li.add(0,null); // will work bcoz we are adding value to 1st index in the list

        // [1,3,4,3,6,3]




  //      System.out.println(li.size());
  //      System.out.println(Arrays.toString(li.toArray()));
  //      System.out.println(li.get(1)); // ar[index]
        li.add(1,51);
  //      System.out.println(Arrays.toString(li.toArray()));
  //      System.out.println(li.get(1)); // ar[index]

        List<Student> l3 = new ArrayList<>();
       // l3.add(12);
       // l3.add("ram");
        Student s1 = new Student();
        s1.setName("Ram");
       // s1.setRollNo(2);
        Student s2 = new Student();
        s2.setName("Shyam");
       // s2.setRollNo(4);
        Student s3 = new Student();
        s3.setName("harshit");
       // s3.setRollNo(3);
        l3.add(s1);
        l3.add(s2);
        l3.add(s3);

        l3.remove(1);
        l3.remove(s2);


    //    Student[] ar = new Student[2];

     //   li.remove(1); // removes element from a given index
        li.remove(Integer.valueOf(52)); // removes the given object
        System.out.println(Arrays.toString(li.toArray()));
    //    System.out.println(li.lastIndexOf(24));

        //


    // 1st aproach of converting list to array
        Object[] reversedArr = li.reversed().toArray(); // toArray() method returns Object[]

        // using for loop
        int[] revArr = new int[li.size()];
        for (int i=0 ; i < revArr.length; i++) {
            revArr[i] = (Integer)reversedArr[i];
        }


    // 2nd Approach
        List<Integer> revList = li.reversed();
       int[] revArr2 =  revList.stream().mapToInt(Integer::intValue).toArray(); // method referencing in Streaming API

      /*  int[] revArr2 = new int[revList.size()];
        for(int i =0 ; i < revList.size() ; i++){
            revArr2[i] = (int)revList.get(i);
        }*/

     //   List<int[]> l3 = Arrays.asList(revArr2, revArr, ar);
         List<Integer> l4 = new ArrayList<>();
        for (int i = 0; i < revArr2.length; i++) {
            l4.add(revArr2[i]);
        }


        // Array to list
        List<Integer> l8 = new ArrayList<>();
        List<Integer> l5 =  Arrays.stream(revArr2).boxed().toList(); // boxed method changes primitive value to Wrapper, unboxing means wrapper to primitive
        List<Integer> l6 =  Arrays.stream(revArr).boxed().toList();
        List<Integer> l7 =  Arrays.stream(ar).boxed().toList();
        l8.addAll(l5);
        l8.addAll(l6);
        l8.addAll(l7);


//[2,4,5,9]  -> [4,8,10,18]
    /* int[] inp = {2,4,5,9};
     int[] res = new int[inp.length];
        for (int i = 0; i < inp.length; i++) {
            res[i] = 2*inp[i];
        }
        System.out.println("old Arr :" + Arrays.toString(res));
     int[] res2 = Arrays.stream(inp).map(x -> 2*x).toArray();
        System.out.println("new Arr :" + Arrays.toString(res2));

        System.out.println(Collections.frequency(li, 51));*/

       int z = 5;
       Integer z1 = Integer.valueOf(z); // boxing
       int z2 = z1.intValue();  // unboxing

       float z3 = 4.2f;
       Float z4 = Float.valueOf(z3); // boxing -> wrapper
       float z5 =  z4.floatValue(); // unboxing -> primitive

   //    li.clear();
        System.out.println(li.size());

        // add, addAll, remove, reversed, clear, size
   //     Collections.shuffle(li);
        System.out.println(Arrays.toString(li.toArray()));
        Collections.rotate(li,-1);
        System.out.println(Arrays.toString(li.toArray()));
        List<Integer> l10 = new ArrayList<>(Collections.nCopies(li.size(),0));
        System.out.println(l10.size());
        Collections.copy(l10, li);
        System.out.println(l10.size());
        System.out.println(l10);
        Collections.replaceAll(l10,2,20);
        System.out.println(l10);
   //   Collections.fill(l10,5);
   //   System.out.println(l10);
        Collections.swap(l10,3,5);
        System.out.println(l10);

    }
}

// Important for List
// sequence of insertion is maintained
// duplication is allowed
// index based operations can be performed (fetching value by index, removing value by index)
// contains only objects
// no size restriction, adjusts size automatically

//{1,3,4,2,4,5} -< {3,1,4,2,4,5}
// li.get(1) = 3
//{1,3,4,2,5}  -> li.get(4) -> 5, actually we inserted 4

// arr[i] --> li.get(i)

// Student --> name, dept, marks
// Ram, ECE, 80 - s1
// Shyam, CS, 70 -s2
// Raghav, ME, 91 - s3
// Rupa, CS, 90 - s4
// List<Student> students

//[Raghav,Rupa,Ram,Shyam] --> sort by marks in descending
//[Raghav,Ram,Rupa,Shyam] --> sort by name asc
//[Shyam,Rupa,Ram,Raghav]

// 80 : Ram
// 91 : Shyam
// 91 : Raghav
// 90 : Rupa

// Collections.sort(map.keySet())
// Collections.reversed(new ArrayList<>(set)); : 91,90,80,70
// map.get(91)
