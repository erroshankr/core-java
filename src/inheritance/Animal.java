package inheritance;

public class Animal {

     String name; // Simbi
     String color;

    Animal(){
        System.out.println("Inside zero argument constructor of Animal");
    }

    Animal(String name){
        System.out.println("Inside single argument constructor of Animal");
        this.name= name;
    }
    Animal(String name, String color){
        System.out.println("Inside two argument constructor of Animal");
        this.name= name;
        this.color = color;
    }

     void printDetails(String name, String color){
        System.out.println("Name: " + name + " & Color: " + color + " from Animal class");
    }

    void printDetails(String name, String color, boolean isWild, int noOfLegs){
        System.out.println("name: " + name + " & color: " + color + " & wild: " + isWild + " & no of legs: " +noOfLegs );
    }

   /* public static void main(String[] args) {
     //   Animal a1 = new Animal("Lion","Yellow");
     //   a1.printDetails();
      //  Animal a2 = new Animal();
      //  printDetails();
    }*/
}
