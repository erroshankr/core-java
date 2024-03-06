//VEG: paneer -> static
//NON-VEG: chicken + paneer -> non-static

public class Student {

    static {
        System.out.println("inside static block  of student 1");
    }
    static {
        System.out.println("inside static block  of student 2");
    }
    private String name;  // default val = null -> "xyz"
    private int studentID;
    public static String collegeName; // static variable : single copy is created and will be shared among all object

    public static void printDetails(){  // static method
        System.out.println("inside printDetails method");
   //     System.out.println(name); --> Not Accessible -> static method can access only static variables
   //     System.out.println(studenTID);
        System.out.println(collegeName);
     //   setName("Rekha"); --> Not accessible --> static method can call only static method
    }

    public void getDetails(){ // non -static method
        printDetails(); // Accessible --> non static methods can access both static & non-static methods.
        System.out.println(name+ " " + studentID + " "+collegeName); // --> non-static method can access both static/nonstatic variables
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){   // Read operation
        return this.name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public static void main(String[] args) {
    //    System.out.println(collegeName);
          collegeName="ABC";
   //     printDetails();
   //     Student.printDetails();
        Student s1 = new Student();
        System.out.println(s1.getCollegeName());
    }

}
