package lesson020;

public class StatExample {
    int x = returnInt();
    static StatExample statexample = new StatExample(5);
    static int k = 4;
    int i = returnInt();
    static int j = returnIntStatic();

    static {
        System.out.println("static");
    }

    {
        System.out.println("clear");
    }

    StatExample() {
        System.out.println("constructor");
    }

    StatExample(int i) {
        System.out.println("constructor with arguments");
    }
    static int returnIntStatic() {
        System.out.println("returnIntStatic " + k);
        return StatExample.k;
    }

    int returnInt() {
        System.out.println("returnInt");
        return 2;
    }

    public static void main(String[] args) {
        new StatExample();
    }

}


