package basics;

public class Television {

    // variable
    // method

    // Instance Variable: variables present inside a class but outside of any method
    // Instance variable if not initialized, takes its default value
    // dataType variable  --> 8 --> int:0,float:0.0f,double:0.0,long:0.0L,char:'',boolean:false,short:0,byte : primitive type : raw type
    // non-primitive: created with help of primitive type
    int x ; // 0 -> 4 byte
    // declare variable
    boolean b; // false -> 1 byte : 0/1
    float f; // 0.0 -> 4 bytes
    double d; // 0.0 --> 8 bytes
    long l; // 0  --> 8 bytes
    char z; // u0000 -> null character -> 2 bytes
    String s; // null -->
    short sh; // 0 --> 2 bytes
    byte b1; //0  : -->  1 byte : 100

    //String s = "Roshan@123" " char + int --> non primitive --> which does not come by default
    // int[] a = new int[5];

    public void printData(){ // M1
        int v =6;// local variable : variables defines inside a method, it can not be accessed outside method, initialization is mandatory to avoid compilation error
     //   declaration = initialization
        System.out.println(x);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(z);
        System.out.println(s);
        System.out.println(sh);
        System.out.println(b1);
      //  System.out.println(v); // --> compilation error becoz local variables dont take default value
    }


    public static void main(String[] args) { //M2 : predefined method of JVM which is invoked by JVM during execution // basics.Television.main(jgjh)
        Television t1 = new Television();  // new : it is used to create an object of class
        Television t2 = new Television();
        Television t3 = t1; // t3 is also pointing to t1
        t1.printData();
        System.out.println(t1.l);
    }/// Object: remote controller of class --> blue print
    // 10+100=110

    //  code-> JVM -> laptop --> ram : Hardware
    // compile: grammatical check: he is naching --> it just checks the syntax
    // run: execution of program

    // compile --> run
    // A.java --> compile --> success --> A.class(byte format-> Machine understandable format) --> A.class file is executed in JVM(Java )
    // Interpreter/translator -> which interprets java to machine understandable code & vice -versa
    // Java --java-->   Interpreter-->byte -->   Machine
    // Java --java-->  numeric <--Interpreter<--byte <--   Machine

    // compilation --> syntax checker + interpreter

    class Samsung{  // basics.Television$Samsung

        public void getPrice(){
            System.out.println("price is 10000");
        }

        class Harshit{ //basics.Television$Samsung$Harshit.class

        }

    }

    class Ashutosh{  // basics.Television$ashutosh.class

    }
}
