package interfacedemo;

// public class Square implements Perimeter,Shape extends Rectangle {
// Square(class) : Perimeter,Shape(Interface)  : Rectangle(class)
public class Square extends Rectangle implements Perimeter,Shape{
    // Square(Class) : Rectangle(Class) : Perimeter,Shape(Interface)

    // Square extends Rectangle : CORRECT
    // Square implements Perimeter & Shape  : CORRECT
    // Rectangle implements Perimeter & Shape   : INCORRECT

    @Override
    public void printMyPerimeter(int x, int y) {
        System.out.println("Perimeter is : " + 4*x);
    }
}
