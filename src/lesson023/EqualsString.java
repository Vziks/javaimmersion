package lesson023;


public class EqualsString {


    public static void main(String[] args) {

//        MyObj o1 = new MyObj();
//        MyObj o2 = o1;
//
//        System.out.println("o1.i = " + o1.i);
//        System.out.println("o2.i = " + o2.i);
//
//        o2.i = 7;
//
////        o2.method();
////        o2.method();
//
//        System.out.println("o1.i = " + o1.i);
//        System.out.println("o2.i = " + o2.i);

        String equals01 = new String("Blaaaaaa");
//        String equals01 = "Blaaaaaa";

        String equals02 = equals01;

        System.out.println("Equals сравнение equals01 и equals02 = " + equals01.equals(equals02));
        System.out.printf("Равенство equals01 и equals02 = %b \n", equals01 == equals02);

//            equals01 = equals01 + new String("s");
//        equals02 = equals02 + "s";
        equals01 = equals01 + "s";
        System.out.println("Добавляем букву");
        System.out.println("Equals сравнение equals01 и equals02 = " + equals01.equals(equals02));
        System.out.printf("Равенство equals01 и equals02 = %b \n", equals01 == equals02);

//            equals01 = new String("String");
        equals01 = "Blaaaaaa";
//        equals01 = "String";

        System.out.println("Equals сравнение equals01 и equals02 = " + equals01.equals(equals02));
        System.out.printf("Равенство equals01 и equals02 = %b \n", equals01 == equals02);
    }
}


class MyObj {
    int i = 5;
    public void method (){
        this.i++;
    }
}