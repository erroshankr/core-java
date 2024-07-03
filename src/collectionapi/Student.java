package collectionapi;

import java.util.*;
public class Student {

    String name;
    Map<String, Integer> subMarksMap;  // store subject & marks

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getSubMarksMap() {
        return subMarksMap;
    }

    public void setSubMarksMap(Map<String, Integer> subMarksMap) {
        this.subMarksMap = subMarksMap;
    }


// Ram -> Eng-60,Math-80,Science-90

    public static void main(String[] args) {



        Student s1 = new Student();
        s1.setName("Ram");
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("English", 60);
        m1.put("Maths",80);
        m1.put("Science",90);
        s1.setSubMarksMap(m1);
        System.out.println(s1);

        Student s2 = new Student();
        s2.setName("Shyam");
        Map<String,Integer> m2 = new HashMap<>();
        m2.put("English", 65);
        m2.put("Maths",82);
        m2.put("Science",92);
        s2.setSubMarksMap(m2);
        System.out.println(s2);

        Student[] ar = new Student[2];
        ar[0] = s1;
        ar[1] = s2;
        System.out.println(Arrays.toString(ar));

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s2);

        System.out.println(set);



    }

    @Override
    public String toString(){
        return this.name + ":" + this.subMarksMap;
    }

   /* @Override
    public int compareTo(Student s) {
        return this.getName().compareTo(s.getName());  // equal -> 0, a1>a2 -> +ve integer, a1 <a2 -> -ve integer
    }*/
}