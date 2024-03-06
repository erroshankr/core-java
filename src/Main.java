// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
/**
 * new:  create & allocate memory dynamically
 new : used for object creation
 new : used to call constructors
 new : it always returns reference of the class pointing to object
 */
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static { // block
        System.out.println("inside static block 1");
    }
    static { // block
        System.out.println("inside static block 2");

    }
    static { // block
        System.out.println("inside static block 3");
    }
    static { // block
        System.out.println("inside static block 4");
    }
    public static void main(String[] args) {
        System.out.println("inside main method");
        new Student();

        new Demo();

      /* Laptop l1 = new Laptop(); // it invokes zero argument constructor,
       l1.printData();*/
      /* Laptop l2 = new Laptop("Dell");
       l2.printData();
       Laptop l3 = new Laptop("Apple",1000,"Black");
       l3.printData();
       Laptop l4 = new Laptop(150,"HP","White");
       l4.printData();*/

      /*  Student s1 = new Student();
        Student s2 = new Student();
    //    s1.name= "roshan";
        s1.setName("ramesh");
        s1.setStudentID(567);
        s2.setName("shyam");
        s2.setStudentID(234);
      //  s1.setCollegeName("FIEM-Garia");
   //     Student.collegeName="xyz";
        s1.setCollegeName("abc");
        System.out.println(s1.getCollegeName());
        Student s3 =new Student();
        System.out.println(s3.getCollegeName());*/
        /*System.out.println(s1.getName() + " " +s1.getStudentID() + " "+s1.getCollegeName());
        System.out.println(s2.getName() + " " +s2.getStudentID() + " "+s2.getCollegeName());

        //s2.name="Shyam";

        Student s3 = new Student();
        s3.setCollegeName("XYZ");

    //    s2.setCollegeName("FIEM");
        System.out.println(s1.getName() + " " +s1.getStudentID() + " "+s1.getCollegeName());
        System.out.println(s2.getName() + " " +s2.getStudentID() + " "+s2.getCollegeName());*/
    //    s1.printDetails(); // static method with object
    //    Student.printDetails(); // static method without object, we dont need object creation for static method call
                                // static method can be accessed by ClassName.methodName();
    //    s1.getDetails(); // can not be called by class-name bcoz it getDetails is non-static method.

    //    System.out.println(s1.getCollegeName());
    }

    /*
    Github:
            Create a personal branch
            make your changes
            commit your change (saved in laptop/local system , still not resent in repository)
            push to origin (Now available in github repo)



            How to fetch all branches from github
              right click --> git -> fetch : fetches all branches in repo
     */
    /*
       datatypes, Object in Java
     */

    /**
     * int x = "ram"; : compilation error : type of x is pre-defined before initialization -> during compile time -> statically-typed
     * x = 5
     * x= "Ram" : type of x is defined after value initialization -> during runtime --> dynamically-typed
     */
    /**
     * javac Main.java
     * java Main.main(String[] ..)
     */

    static class Demo{ // innner class can be static but outer class can never be static
        static {
            System.out.println("inside demo static block");
        }
    }
}

/* class Demo{ // innner class can be static but outer cant be static
    static {
        System.out.println("inside demo static block");
    }*/
