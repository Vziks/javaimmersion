package lesson004;

class MyInt {
    private int a;

    public MyInt(int a) {
        this.a = a;
    }

    public void set(int b) {
        a = b;
    }

    @Override
    public String toString() {
        return "" + a;
    }
}

public class Test {
    public static void main(String[] args) {
        int x = 3;
        MyInt y = new MyInt(3);
        System.out.println("x = " + x + ", y = " + y);
        doSomething(x, y);
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void doSomething(int a, MyInt b) {
        a = 5;
        b.set(5);
        b = new MyInt(10);
    }
}
