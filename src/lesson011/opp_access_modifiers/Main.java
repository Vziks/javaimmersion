package lesson011.opp_access_modifiers;

import lesson011.opp_access_modifiers.one.ThreeClass;
import lesson011.opp_access_modifiers.two.SecondClass;

public class Main {
    public static void main(String[] args) {
        ThreeClass three = new ThreeClass();
        SecondClass second = new SecondClass();

        three.setI(12);

        System.out.println(three.getI());
        System.out.println(second.getI());
    }
}
