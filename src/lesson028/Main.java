package lesson028;

/**
 * Class Main
 *
 * @author Anton Prokhorov
 */
public class Main {
    public static void main(String[] args) {
        new ClassLoader();
    }

}

class ClassLoader {

    static int in = method();

    public static int method() {
        System.out.println("Method");
        return 5;
    }

    static {
        System.out.println("Static");
    }

    {
        System.out.println("Block");
    }

    public ClassLoader() {
        System.out.println("Constructor");
    }
}