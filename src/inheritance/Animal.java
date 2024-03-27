package inheritance;

public class Animal {

     String name;
     String color;

    Animal(){
        System.out.println("Inside zero argument constructor of Animal");

    }
    Animal(String name, String color){
        System.out.println("Inside two argument constructor of Animal");
        this.name= name;
        this.color = color;
    }

     void printDetails(String name, String color){
        System.out.println("Name: " + name + " & Color: " + color);
    }

   /* public static void main(String[] args) {
     //   Animal a1 = new Animal("Lion","Yellow");
     //   a1.printDetails();
      //  Animal a2 = new Animal();
      //  printDetails();
    }*/
}
