package lesson023;

import java.util.Objects;

public class EqualsString {
    public static void main(String[] args) {


        {

            String s01 = new String("String");
            String s02 = "String";


            System.out.println(s01 == s02);

            System.out.println(new String("String") == "String");
//            String equals01 = new String("String");
            String equals01 = "String";

            System.out.println("s01.getClass().getName(); = " + s01.getClass().getName());

            String equals02 = equals01;

            System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
            System.out.print("equals01==equals02 = ");
            System.out.println(equals01 == equals02);

//            equals01 = equals01 + new String("s");
//            equals01 = equals01.concat("s");
            equals01 = equals01 + "s";

            System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
            System.out.print("equals01==equals02 = ");
            System.out.println(Objects.equals(equals01, equals02));

//            equals01 = new String("String");
            equals01 = "String";

            System.out.println("equals01.equals(equals02) = " + equals01.equals(equals02));
            System.out.print("equals01==equals02 = ");
            System.out.println(equals01 == equals02);
        }
    }
}
