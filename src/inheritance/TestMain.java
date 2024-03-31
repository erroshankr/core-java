package inheritance;

import abstraction.Gender;
import inheritance.Animal;
import inheritance.Dog;
import inheritance.Lion;

public class TestMain {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.printDetails("Sheru","Brown");  // Dog.java

        Lion l1 = new Lion();
        l1.printDetails("Simba","Yellow"); // Lion.java

        Animal a1 = new Animal();
        a1.printDetails("No-name","No-color"); // Animal.java

        Animal a2 = new Dog(); // Run time polymorphism
        a2.printDetails("Animal-Dog","Black"); // Dog.java // Run time polymorphism

        Animal a3 = new Lion();
        a3.printDetails("Animal-Lion", "Green"); // Lion.java

      //  Lion l2 = new Dog();
      //  Dog d2 = new Lion();
      // There is no relation between these 2 classes.

     //  Gender g1 = new Gender(); // abstract class cant be instantiated.


    }
}
