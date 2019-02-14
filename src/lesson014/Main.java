package lesson014;

class Invoke {

    void method01(int intgr01, String strng01, int... array01) {
        System.out.println(intgr01);
        System.out.println(strng01);
        for (int lmnt : array01) {
            System.out.println(lmnt);
        }
    }

    void method02(int intgr02, String strng02, String... array02) {
        System.out.println(intgr02);
        System.out.println(strng02);
        for (String lmnt : array02) {
            System.out.println(lmnt);
        }
    }

    // Only one argument and it should be the last
    // void method03(int intgr03, String strng03, int... array03, int... array03) {
    // }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("// ... && [] argument");

        int[] array01 = {1, 2, 3, 4};
        String[] array02 = {"one", "two", "tree", "four"};

        Invoke nvk = new Invoke();

        nvk.method01(1, "string01", array01);
        nvk.method01(2, "string02", 1, 2, 3, 4, 5); // 1,2,3,4,5 it is array argument
        nvk.method02(1, "line01", array02);
        nvk.method02(2, "line02", "five", "six", "seven", "eight");
    }
}
