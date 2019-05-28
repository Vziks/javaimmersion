package lesson039.assertions;

public class Run {

    //for work add to VM option flag "-ea" to enable assertions
    // or command line "java -ea Run"
    public static void main(String[] args) {
        for (int i = 5; i >= -5; i--) {
            Run.method(i);
        }
    }

    private static void method(int i) {
        assert (i > 0) : "I need a positive number";
        System.out.println(i);
    }
}