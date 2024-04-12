package encapsulation_demo_2;

import encapsulation_demo_1.Student;

public class EceStudent extends Student {
    public static void main(String[] args) {
        EceStudent e1 = new EceStudent();
        System.out.println("name: " + e1.name + " , rollNo: " + e1.rollNo + " , totalMarks: " + e1.totalmarks + " , grade: " + e1.grade);

    }
}
