package lesson011.opp_access_modifiers.one;

public class ThreeClass extends One {

    void method(){
        // Extends we see only protected, public variables
        j = 6;
        z = 6;
    }
}
