package abstraction;

//Abstraction : Steering of car ->
//Encapsulation: hidden Internal functionality of Steering -> process of wrapping/binding data into a single unit
// Both abstraction & encapsulation deals with data-hiding but
// abstraction: main goal is removing complexities and making it simpler for use
//encapsulation: main goal is to provide data security
//Abstract class & Interface
//abstract class :
//1. 'abstract' keyword used before class keyword
//2: Abstract class must have 'abstract' keyword used before class keyword.
//3. Abstract class may or may not have abstract method(s).
//4. If any method in a class is abstract, then class also must be abstract.
//5: Abstract Class can have both abstract & non-abstract methods or none of these.
//6: Abstract class can not be instantiated -> we can not make object of abstract class
//7: All abstract methods in abstract class have to be implemented by its derivative/child class by extending abstract class.
//8. If derivative class is not implementing any of abstract methods of parent, then derivative class also must be abstract
//9: abstract method: 'abstract' keyword in method, method without body , just having defination.
//10: abstract class can not have non abstract method without body.

// Bank Account: 5L : user
// Manager,clerk : Data hiding --> encapsulation --> data protection
public abstract class Gender { // if a class has at-least one abstract method, class must be declared as 'abstract'.

    public abstract void printGender(); // Abstract class may or may not have abstract methods.
    // only method defination,  no body

    public void printDetails(){ // non-abstract method allowed
        System.out.println("Inside abstract class");
    }

    public abstract void tellMyName();

}
