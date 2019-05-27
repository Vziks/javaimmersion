package lesson034.order_of_initialization_of_fields_and_blocks;

public class SecondClass extends FirstClass {
    private int secondClass = bb(20);

    public SecondClass(int secondClass) {
        this.secondClass = secondClass;
    }

    private int bb(int x) {
        System.out.println("SecondClass class. No static perem " + x);
        return 0;
    }

    public SecondClass() {
        System.out.println(this.getClass().getName() + " class. Constructor");
    }

    {
        System.out.println(this.getClass().getName() + " class. No static block");
    }

    static {
        System.out.println("SecondClass class. Static block");
    }

}
