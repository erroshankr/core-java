package interfacedemo;

public class Rectangle implements Shape,Size{
    @Override
    public double findArea(int x, int y) {
        return x*y;
    }

    /*
       Rectangle r = new Rectangle();
       r.findArea(2,3);

       Shape s = new Rectangle();
       s.findArea(2,3);

       Size s1 = new Rectangle();
       s1.findArea(2,3);


     */

    @Override
    public void printMySizeDetails(int x, int y) {
        System.out.println("Length: " + x + " & Breadth: " + y);
    }

    @Override
    public void printMyFig() {
        System.out.println("I am rectangle");
    }
}
