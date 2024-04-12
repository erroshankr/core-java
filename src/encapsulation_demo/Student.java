package encapsulation_demo;

//1.Encapsulation is nothing but data hiding for security purpose
//2.It is implemented with the use of access-specifier
//3.Access-Specifier: private, protected, default,public
//4.private : it can be accessed only within the class where it is defined.
public class Student {
    
    private String name;
    protected int totalmarks;
    char grade;
    public int rollNo;
    
    public Student(){
        this.name="Roshan";
        this.totalmarks=100;
        this.grade='A';
        this.rollNo=5;
    }
    
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("name: " + s1.name + " , rollNo: " + s1.rollNo + " , totalmarks: " + s1.totalmarks + " , grade: " + s1.grade);
    }
}