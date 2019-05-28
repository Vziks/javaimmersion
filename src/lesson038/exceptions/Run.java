package lesson038.exceptions;

public class Run {
    public static void main(String[] args) throws RuntimeException {

        for (int i = 10; i >= 0; i--) {
            try {
                System.out.println(method(i));
            } catch (RuntimeException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Always running");
            }
        }

    }

    private static int method(int i) throws RuntimeException {
        if (i == 0) throw new RuntimeException();
        return 10 / i;
    }
}
