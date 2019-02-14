package lesson020;

public class StaticExample {
    static int i;
    static int x;
    int j;

    static {
        System.out.println("Static initializer");
    }
    {
        System.out.println("initializer instance");
    }
    StaticExample(){
        x++;
        System.out.println("Constructor");
    }

    static void method(){
        System.out.println("Static method");
    }
}
