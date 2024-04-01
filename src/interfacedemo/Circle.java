package interfacedemo;

public class Circle implements Shape,Size{
    @Override
    public double findArea(int x, int y) {
        return pi*x*y;
    }


    @Override
    public void printMySizeDetails(int x, int y) {
        System.out.println("My radius is: " + x);
    }

    @Override
    public void printMyFig() {
        System.out.println("I am circle");
    }
}
