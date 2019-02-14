package lesson023;


public class EqualsString {


    public static void main(String[] args) {


        String equals01 = new String("String");
//        String equals01 = "String";

        String equals02 = equals01;
        System.out.println("Class объекта equals01 = " + equals01.getClass().getName());
        System.out.println("Class объекта equals02 = " + equals02.getClass().getName());

        System.out.println("Equals сравнение equals01 и equals02 = " + equals01.equals(equals02));
        System.out.printf("Равенство equals01 и equals02 = %b \n", equals01 == equals02);

//            equals01 = equals01 + new String("s");
//        equals02 = equals02 + "s";
        equals01 = equals01 + "s";
        System.out.println("Добавляем букву");
        System.out.println("Equals сравнение equals01 и equals02 = " + equals01.equals(equals02));
        System.out.printf("Равенство equals01 и equals02 = %b \n", equals01 == equals02);

//            equals01 = new String("String");
        equals01 = "String";
//        equals01 = "String";

        System.out.println("Equals сравнение equals01 и equals02 = " + equals01.equals(equals02));
        System.out.printf("Равенство equals01 и equals02 = %b \n", equals01 == equals02);
    }
}
