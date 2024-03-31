package abstraction;

public class TestMain {

    public static void main(String[] args) {
     //   Gender g1 = new Gender(); --> cant instantiate abstract class
    /*    Male m1 = new Male();
        m1.printGender();

        Female f1 = new Female();
        f1.printGender();

        Gender g1 = new Male();
        g1.printGender();*/

     //   Gender g2 = new Gender();

        Gay g1 = new Gay();
        g1.printGender();

        Lesbian l1 = new Lesbian();
        l1.printGender();

        ThirdGender t1 = new Gay();
        t1.printGender();

        Gender g2 = new Lesbian();
        g2.printGender();
    }
}
