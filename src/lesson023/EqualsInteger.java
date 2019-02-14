package lesson023;

import java.util.Objects;

public class EqualsInteger {

    public static void main(String[] args) {
//        Integer equals01 = new Integer(7);
        Integer equals01 = 7;

        System.out.println("s01.getClass().getName(); = " + equals01.getClass().getName());

        Integer equals02 = equals01;

        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.printf("equals01==equals02 = %b \n", equals01 == equals02);

        equals01++;

        System.out.println("equals01 = " + equals01);
        System.out.println("equals02 = " + equals02);
        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.printf("equals01==equals02 = %b \n", equals01 == equals02);

        equals01 = 7;

        System.out.println("equals01 = " + equals01);
        System.out.println("equals02 = " + equals02);

        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.printf("equals01==equals02 = %b \n", equals01 == equals02);
    }
}