package lesson017;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        EnumExample.TieSize tieB = EnumExample.TieSize.BIG;
        System.out.println(tieB);
        System.out.println(tieB.getMils());
        System.out.println(tieB.getName());
        System.out.println(tieB.getTieClass());

        EnumExample.TieSize tieM = EnumExample.TieSize.MEDIUM;
        System.out.println(tieM);
        System.out.println(tieM.getMils());
        System.out.println(tieM.getName());
        System.out.println(tieM.getTieClass());

        CoffeeSize coffeeSize = CoffeeSize.MEDIUM;
        System.out.println(coffeeSize);
        System.out.println(coffeeSize.mils);

        Random rand = new Random();

        rand.nextInt(10);
    }
}
