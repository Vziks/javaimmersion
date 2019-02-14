package lesson009;


class SecondExample extends Example {

}
/*
    Only one public class
 */

public class Example {
    private int i = 9;
}


abstract class Abstract {
    private int i = 9;
    // Declare abstract method, need realize in parent Class/Type
    abstract void method();
}

class RealizeAbstract extends Abstract {
    // Realize abstract method
    @Override
    void method(){
        //.. Do some
        System.out.println("RealizeAbstract method");
    }
}


final class FinalRealizeAbstract extends Abstract {

    @Override
    void method() {
        System.out.println("FinalRealizeAbstract method");
    }
}

// Final class canr not extends
//class Exaple1 extends FinalRealizeAbstract{
//
//}


class StrictFP {

    static double notStrictFP(double a) {
        return (a / 2) * 2;
    }

    static strictfp double strictFP(double a) {
        return (a / 2) * 2;
    }
}