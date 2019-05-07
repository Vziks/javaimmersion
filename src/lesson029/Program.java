package lesson029;

public class Program {
    public static void main(String[] args) {
        work();
    }

    private static void work() {
        try {
            work();
        } finally {
            work();
        }
    }
}
