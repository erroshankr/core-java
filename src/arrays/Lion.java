package arrays;

public class Lion extends Animal {
    String name;
    String color;

    Lion(String name, String color){
        this.name= name;
        this.color=color;
    }
    Lion(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Lion l1 = new Lion("LT1","RED");
        Lion l2 = new Lion("LT2","White");
        Lion[] arr = new Lion[5];
        arr[0] = l1;
        arr[1]= l2;
 //       arr[2]=a1;  -> not correct as per inheritance

        Animal a2 = new Lion();
     //   Lion l1 = new Animal();

        // is Lion an object of animal class  -- yes becoz Lion is subclass of Animal
        Animal[] arr2 = new Animal[5];
        arr2[0]=l1;
        arr2[1]=l2;
        arr2[2]=a2;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }


    }
}
