package lesson012;

public class Main {

    // final modifier declares as constant need assigment statement
    static int sttc01 = 20;
    static int sttc02;
    static SomeClass sclass001;
    static SomeClass sclass002 = new SomeClass();

    // final modifier declares as constant need assigment statement
    final int fnl = 20;
    final SomeClass sclass01 = new SomeClass();

    // Обьявление переменной/declaration statement
    int i02;
    SomeClass sclass02;

    // Определение переменной/assigment statement
    int i03 = 5;
    SomeClass sclass03 = new SomeClass();

    public static void main(String[] args) {

        // Static fields no need create instance
        System.out.println(Main.sttc01);
        System.out.println(Main.sttc02);
        System.out.println(Main.sclass001);
        System.out.println(Main.sclass002);
        System.out.println(Main.sclass002.z);

        Main mn = new Main();

        // Error cant not modifired it is const
        // mn.fnl = 50;
        // mn.sclass00 = new SomeClass();

        // Access to i01 variable defaul = 0;
        System.out.println(mn.i02);
        // Access to sclass01 variable defaul = null;
        System.out.println(mn.sclass02);

        // variable not assigment we cant access to z variable
        // Exception in thread "main" java.lang.NullPointerException
        //	at lesson012.Main.main(Main.java:22)
//        System.out.println(mn.sclass02.z);

        // Output: 5
        System.out.println(mn.i03);
        // Output: Представление обекта в стоке пример: lesson012.SomeClass@610455d6
        System.out.println(mn.sclass03);
        System.out.println(mn.sclass03.toString());
        // Access to SomeClass variable z.
        System.out.println(mn.sclass03.z);

    }
}
