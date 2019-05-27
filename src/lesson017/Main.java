package lesson017;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        EnumExample.TieSize tieB = EnumExample.TieSize.BIG;
        print(tieB);

        EnumExample.TieSize tieM = EnumExample.TieSize.MEDIUM;
        print(tieM);

        CoffeeSize coffeeSize = CoffeeSize.MEDIUM;
        System.out.println(coffeeSize);
        System.out.println(coffeeSize.mils);

        Random rand = new Random();

        rand.nextInt(10);
    }

    private static void print(EnumExample.TieSize tie) {
        System.out.println(tie);
        System.out.println(tie.getMils());
        System.out.println(tie.getName());
        System.out.println(tie.getTieClass());
    }
}
