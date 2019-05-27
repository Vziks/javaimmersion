package lesson011.opp_access_modifiers.two;

import lesson011.opp_access_modifiers.one.One;

public class Two {
    void methos(){
        One one = new One();
        // We see only z variable;
        one.z = 5;
    }
}