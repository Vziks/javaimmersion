package lesson020;


public class Check {
    static Check check = new Check();
    int x = returnInt();

    static {
        System.out.println("static initializer");
    }

    {
        System.out.println(this.getClass().getName() + " initializer");
    }

    Check() {
        System.out.println(this.getClass().getName() + " constructor");
    }

    private int returnInt() {
        System.out.println(this.getClass().getName() + " returnInt method not static");
        return 2;
    }

    public static void main(String[] args) {
        new Check();
    }

}



