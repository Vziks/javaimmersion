package lesson011;

import lesson011.one.ThreeClass;
import lesson011.two.SecondClass;

public class Main {
    public static void main(String[] args) {
        ThreeClass three = new ThreeClass();
        SecondClass second = new SecondClass();

        three.setI(12);

        System.out.println(three.getI());
        System.out.println(second.getI());
    }
}
