package inheritance;

public class Lion extends Animal{ // default(Zero arg) constructor is mandatory in parent class for inheritance to work.

    boolean isWild;

    Lion(){
        System.out.println("Inside zero argument constructor of Lion");
    }

    Lion(boolean isWild){
        System.out.println("Inside single argument constructor of Lion");
        this.isWild = isWild;
    }

    // name & return type : same & one in remaining 3 signature fiel must be false
    void printDetails(String name, String color, boolean isWild){  // overloading
        System.out.println("Name: " + name + " & Color: " + color + " & isWild: " + isWild);
    }

    //  signature: name, return type, access-specifier, number of parameters, sequence of parameters
    void printDetails(String name, String color){  // method overriding -> signature of methods in parent & child class is exactly same
        System.out.println("Name: " + name + " & Color: " + color + " & isWild: " + isWild);
    }
    public static void main(String[] args) {
        Lion l2 = new Lion();
        Lion l1 = new Lion(true);
        // On calling zero/parametrized constructor of child class, first call goes to zero arg constructor of immediate parent class.
        l1.printDetails("Lion-1","black"); // compile time polymorphism, static binding
        l1.printDetails("lion-3","red",true);
        Animal a2 = new Animal();
      //  a2.printDetails();// parent class object can not access child class behaviour

        System.out.println(l1.getClass());
        System.out.println("L1: "+l1.hashCode() + " & L2: " + l2.hashCode() );

        //parent reference is storing child object
        Animal a1 = new Lion(); //
      //  Lion l5 = new Animal(); child reference cant contain parent object
        a1.printDetails("lion-4","brown"); // runtime polymorphism, dynamic binding

    //    new Lion().printDetails();
    //    new Animal().printDetails();
    }

}
