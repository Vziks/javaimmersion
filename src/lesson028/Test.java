package lesson028;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Test
 *
 * @author Anton Prokhorov
 */
public class Test {

    public static void main(String[] args) {
//        int result = 0;
//        for (int i = 0; i < 5; i++) {
//            if (i == 3) {
//                result += 10;
//            } else {
//                result += i;
//            }
//        }
//        System.out.println(result);

        long startTime = System.currentTimeMillis();
        System.out.println(luckyTickets());
        long finishTime = System.currentTimeMillis();

        System.out.println("That took: " + (finishTime - startTime) + " ms");


    }

    public static int luckyTickets() {
        int sumRepeat = 0;

        Map<Integer, Integer> repeatCount = new HashMap<>();
        for (int key = 1; key <= 27; key++) {
            repeatCount.put(key, 0);
        }

        System.out.println(repeatCount);

        for (int number = 1; number <= 999; number++) {
            int current = number;
            int sum = 0;
            while (current > 0) {
                sum += current % 10;
                current /= 10;
            }
            repeatCount.put(sum,
                    repeatCount.get(sum) + 1);
        }
        System.out.println(repeatCount);
        for (int value : repeatCount.values()) {
            sumRepeat += Math.pow(value, 2);
        }

        System.out.println(repeatCount);

        return sumRepeat;
    }

    public static int symmetrical() {
        int count = 0;
        for (int hour = 0; hour < 24; hour++) {
            switch (hour % 10) {
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    count++;
                    break;
            }
        }
        return count;
    }

    public static int symmetrical2() {
        int x = 0; //счетчик итераций
        int y = 0; //счетчик симметричных совпадений
        int h1 = 0; // первая цифра часов
        int h2 = 0; // вторая цифра часов
        int m1 = 0; // первая цифра минут
        int m2 = 0; // вторая цифра минут

        while (x < 1440) {

// сравниваем попарно, первую цифру часов h1 со второй цифрой минут m2 и вторую цифру часов h2 с первой цифрой минут m1. В случае совпадения увеличиваем счетчик у на 1. Выводим на печать совпавшее время и показания счетчика y.


            if (h1 == m2 && h2 == m1) {
                y++;

            }

            m2++;// отсчитываем минуты

// в случае достижения 10 минут обнуляем вторую цифру минут и увеличиваем первую цифру минут на единицу

            if (m2 % 10 == 0) {
                m2 = 0;
                m1++;
            }

// при достижении 60 минут увеличиваем счетчик часа на единицу, обнуляем десятки минут

            if (m1 == 6) {
                m1 = 0;
                h2++;
            }

// в случае достижения 10 часов обнуляем вторую цифру часа и увеличиваем первую цифру часа на единицу

            if (h2 > 0 && h2 % 10 == 0) {
                h2 = 0;
                h1++;
            }

// если время достигло 24 часов, останавливаем цикл
            if (h1 == 2 && h2 == 4) {
                break;
            }
// увеличиваем счетчик цикла в конце каждой итерации
            x++;
        }
        // выводим на печать ответ задачи
        return y;

    }
}
