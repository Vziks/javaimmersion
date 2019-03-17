import java.util.Locale;
import java.util.Scanner;

/**
 * Class Test
 *
 * @author Anton Prokhorov
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.ENGLISH);

        double number = scanner.nextDouble();

        if (number == 1) {
            System.out.println("number = " + number);
        } else if (number == 2) {
            System.out.println("number = " + number);
        } else if (number == 3 || number == 4) {
            System.out.println("number = " + number);
        } else {
            System.out.println("number = " + number);
        }

        int count = 5;

        while (count > 0) {
            --count;
        }

        do {
            --count;
        } while (count < 0);
    }
}
