package lesson033.order_of_initialization_of_fields_and_blocks;

public class SomeClass {
    {
        System.out.println("Init4");
    }
    static int i = 6;
    {
        System.out.println("Init3");
    }
    static {
        System.out.println("Static Init");
    }
    {
        System.out.println("Init");
    }
    SomeClass(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Init2");
    }
}
