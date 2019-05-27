package lesson011.opp_access_modifiers.two;

import lesson011.opp_access_modifiers.one.One;

public class SecondClass extends One {
    void method() {
        // Extends we see only protected, public variables

        j = 5;
        z = 6;
    }
}
