/**
 * constructor: used to initialize object
 * constructor:name same as classname with letter-case
 * it does not have return type but returns the object of teh class
 *if we have multiple constructor of class--> same access-specifier & same number of parameter but parameter sequence is different : Constructor overloading
 * access-specifier : TODO
 * this: acts as reference of current class object.
 * this: used to differentiate between instance & local variable.
 *this: used to call other overloaded constructor of class.
 * can not be used with static method.  --> bcoz static method does not require object creation.
 */
public class Laptop {
    String name;
    int price;
    String color;

    public void printData(){
        System.out.println("name: "+ name + " price: "+price + " color: "+color);
    }

    //constructor
    //used to initialize object

    public Laptop(){
        this(1500,"ASUS","Blue"); // new laptop(1500,"Asus","blue")  --> 'this' is used here to call other constructor of the class
        this.printData();
       /*
       Laptop l1 = new Laptop()
       l1.printdata();  // l1 == this
        */
    }
    public Laptop(String name){
        System.out.println("inside 1 argument constructor");
        this.name = name;  // this == new Laptop();
    }

    public Laptop(String name,int price, String color){
        System.out.println("inside 3 argument constructor with string as 1st parameter");

        this.name = name;
        this.price=price;
        this.color=color;
    }

    public Laptop(int price, String name,String color){
        System.out.println("inside 3 argument constructor with integer as 1st parameter");
        this.name = name;
        this.price=price;
        this.color=color;
    }


}
