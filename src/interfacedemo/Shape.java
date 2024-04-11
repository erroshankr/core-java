package interfacedemo;


//1. 'interface' : keyword is used to identify/create interfaces.
//2. 'implements' : keyword is used.
//3. all methods in interface is by-default public & abstract.interface can-not have non-abstract method.
//4. all variables in interface are by-default: public, static & final.
//5. Interface can not be instantiated-> can not make object.
//6. a class can implement one or more than one interface.
//7. all variables within interface is by default treated as public, static & final.
//8. Interface can extend only interface not a class/abstract class.
public interface Shape extends Figure,Size{ // interface can extend more than one interface at a time unlike normal class where a class can not extend more than 1 class at a time.

     double pi = 3.14;
  // public static final double pi = 3.14;

    double findArea(int x, int y);
  // public abstract double findPerimeter();
}


//MathBook.java (class)<--- Shape.java(class) <--- Book.java(class) --> This is typical inheritance
//MathBook.java (class)<--- Shape.java(interface) <--- Book.java(class) --> this chain is not possible