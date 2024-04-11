package interfacedemo;

public class TestMain {
    public static void main(String[] args) {
    //    Shape s1 = new Shape();
        Rectangle r1 = new Rectangle();
        System.out.println(r1.findArea(5,4));
        r1.printMySizeDetails(5,4);
        r1.printMyFig();

        Circle c1 = new Circle();
        System.out.println(c1.findArea(4,4));
        c1.printMySizeDetails(4,4);
        c1.printMyFig();

      //  Rectangle r2 = new Circle(); not allowed

        Shape s1 = new Circle();
        double res = s1.findArea(4,4); // run time polymorphism
        System.out.println(res);
     //   s1.printMySizeDetails(3,3);  NOT ALLOWED
        s1.printMyFig();

        Size s2 = new Rectangle();
        s2.printMySizeDetails(4,5);
     // s2.findArea(4,5);  NOT ALLOWED
        s2.printMyFig();

     //   Shape s3 = new Size();

        Circle c2 = new Circle();
        c2.printMyFig();


    }
}
