package interfacedemo;

public interface Figure {

    default void printMyFig(){  // non-abstract
        System.out.println("Inside Figure Interface");
    }
    //   public abstract void printMyFig();
    //  void add(int x, int y);  // abstract

}
