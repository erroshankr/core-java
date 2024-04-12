package encapsulation_demo_1;

public class ItStudent extends Student {

    public static void main(String[] args){
        ItStudent s2 = new ItStudent();
    //    System.out.println("name: " + s2.name() + " , rollNo: " + s2.rollNo + " , totalMarks: " + s2.totalmarks + " , grade: " + s2.grade);
         System.out.println("dept: " + s2.deptName);

        Student s3 = new ItStudent();
   //       System.out.println("name: " + s2.name() + " , rollNo: " + s2.rollNo + " , totalMarks: " + s2.totalmarks + " , grade: " + s2.grade);
         System.out.println("dept: " + s3.deptName);


    }
}


// private : same class
// public: everywhere
// default: same package
// protected : same package and different package using extend