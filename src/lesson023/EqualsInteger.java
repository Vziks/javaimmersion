package lesson023;

import java.util.Objects;

public class EqualsInteger {

    public static void main(String[] args) {
        Integer equals01 = 7;
        Integer equals02 = equals01;

        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.print("equals01==equals02 = ");
        System.out.println(equals01 == equals02);


        equals01++;
//        equals01 = "Strings";

        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.print("equals01==equals02 = ");
        System.out.println(equals01 == equals02);

        equals01 = 7;

        System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
        System.out.print("equals01==equals02 = ");
        System.out.println(equals01 == equals02);
    }
}
//equals01.equals(equals02) = true
//        equals01==equals02 = true
//        equals01.equals(equals02) = false
//        equals01==equals02 = false
//        equals01.equals(equals02) = true
//        equals01==equals02 = true