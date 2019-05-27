package lesson036.gcexample;

public class Run {
    public static void main(String[] args) {
        System.out.println(Check.count);
        for (int i = 0; i < 10000; i++) {
            new Check();
        }

        System.out.println(Check.count);

        while (Check.count > 0) {
            Run.method();
        }
    }

    private static void method() {
        System.out.println(Check.count);
    }
}
