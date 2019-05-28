package lesson037.fors;

public class Run {

    public static void main(String[] args) {

        for (int x = 0, y = 0; x <= 5; x++, y += ++y) {
            System.out.println(y);
        }

        int i = 0;

        for (System.out.println("First start"); i <= 5; System.out.println("Print loop" + i), i++) {
            System.out.println(i);
        }

        i = 0;
        for (System.out.println("First start"); i <= 10; Run.method(i), i++) {
            System.out.println(i);
        }

        i = 0;
        Cls cls;
        for (System.out.println("First start"); i <= 6; cls = new Cls(i), i++) {
            System.out.println(i);
        }
    }

    private static void method(int i) {
        System.out.println("Print loop" + i);
    }
}


