package inheritance;


import javax.xml.namespace.QName;
import java.util.stream.IntStream;

// super: immediate parent
// Overriding:: Inheritance -> parent-child relationship
// Overloading :: Polymorphism -> may or may not have parent child relationship
// this,super: both of these can be used to access variables/methods of current & parent class respectively.
// this,super : constructor call using this/super must be made from within a constructor only and it should be the 1st line.
public class Lion extends Animal{ // default(Zero arg) constructor is mandatory in parent class for inheritance to work.

    // super  := Animal a1 = new Animal(); : a1 -> super
    // this   := Lion l1 = new Lion(); : l1-> this
    public String name;  // Simba
    public boolean isWild;

    public Lion(){
     //    Lion l2 = new Lion("Lion-8");
    //    this("Lion-8"); // call to 2nd constructor from one must be the 1st call within 1st constructor
        System.out.println("Inside zero argument constructor of Lion");
     //   super.printDetails("Tiger","Red");
    }

    public Lion(String name){
      //  Animal a1 = new Animal("Fox","White");
        super("Fox","white");
        System.out.println("Inside single argument constructor of Lion");
        this.name = name;
   //     super.name="Simbi";
        System.out.println("name of parent is :"+ super.name );
      //  printDetails(name,"Black");
       /* Lion l1 = new Lion();
        l1.printDetails("Fox","White");*/
       /* Animal a1 = new Animal();
        a1.printDetails("Fox","White");*/
        super.printDetails("Fox","White"); // a1 is equivalent to super
        System.out.println(super.name);
    }

    // name & return type : same & one in remaining 3 signature field must be false
    public void printDetails(String name, String color, boolean isWild){  // overloading
  //      this("Lion-10"); --> constructor call using this/super can be made only from another constructor, not from any methods.
        System.out.println("Name: " + name + " & Color: " + color + " & isWild: " + isWild);
        super.printDetails("Fox","White"); // a1 is equivalent to super
        System.out.println(super.name);

    }

    //  signature: name, return type, access-specifier, number of parameters, sequence of data type of parameters : must be same
    public void printDetails(String name, boolean isWild, String color){  // method overriding -> signature of methods in parent & child class is exactly same
        System.out.println("Name: " + name + " & Color: " + color + " & isWild: " + isWild);
        super.printDetails("Fox","White"); // a1 is equivalent to super
        System.out.println(super.name);
    }


   @Override
    public void printDetails(String name, String color){
        System.out.println("Name: " + name + " & Color: " + color  + " from Lion class");
     //  super.printDetails("Fox","White"); // a1 is equivalent to super
     //  System.out.println(super.name);
    }
    public static void main(String[] args) {
    //    Lion l2 = new Lion();
     //   Lion l1 = new Lion(true);
        // On calling zero/parametrized constructor of child class, first call goes to zero arg constructor of immediate parent class provided there is no this/super call as 1st line within constructor.
        // This rule doesn't apply for variables & methods.super call to variables & methods can be made at any line.
     //   l1.printDetails("Lion-1","black"); // compile time polymorphism, static binding
    //    l1.printDetails("lion-3","red",true);
    //    Animal a2 = new Animal();
    //    a2.printDetails("Lion-7","White");// parent class object can not access child class behaviour

    //    System.out.println(l1.getClass());
    //    System.out.println("L1: "+l1.hashCode() + " & L2: " + l2.hashCode() );

        //parent reference is storing child object
    //    Animal a1 = new Lion(); //
    //    Animal a3 = new Lion(true);
      //  Lion l5 = new Animal(); child reference cant contain parent object
    //    a1.printDetails("lion-4","brown"); // runtime polymorphism, dynamic binding
      //  a1.printDetails("lion-6", false,"green"); // compilation error

    //    new Lion().printDetails();
    //    new Animal().printDetails();

      //  Lion l1 = new Lion(); -- this
    //    Animal a2 = new Animal("Simbi"); -- super
  //      Animal a3 = new Animal();
 //       System.out.println(a3.name);
       /* Lion l2 = new Lion("Simba"); // Animal a4 = new Animal();
        Lion l3 = new Lion("Simbaaaas");// a5
        System.out.println("name of Lion is : " + l2.name);*/

        Lion l1 = new Lion();


    }

// super : acts as a reference/object of the immediate parent class
// this: acts as an reference/object of the current class
// Java doesn't support multiple inheritance  , however it gives essence of this thro interface
// However , it supports multi-level inheritance
// Hybrid: multiple + multilevel
}
