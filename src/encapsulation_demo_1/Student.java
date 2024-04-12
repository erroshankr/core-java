package encapsulation_demo_1;

//1.Encapsulation is nothing but data hiding for security purpose
//2.It is implemented with the use of access-specifier
//3.Access-Specifier: private(within same class), default(within same package), protected(different package with extends keyword), ,public(everywhere)
//4.private : it can be accessed only within the class where it is defined.
public class Student implements Department{
    
    private String name; // roshan
    protected int totalmarks; // 100
    char grade; // A
    public int rollNo; // 5
    
     public Student(){
        this.name="Roshan";
        this.totalmarks=100;
        this.grade='A';
        this.rollNo=5;
    }

    public String getName() {
        return name; // copy by value
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(int totalmarks) {
        this.totalmarks = totalmarks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("name: " + s1.name + " , rollNo: " + s1.rollNo + " , totalmarks: " + s1.totalmarks + " , grade: " + s1.grade);
    }
}