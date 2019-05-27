package lesson010.opp_interfaces;

public class SomeClass implements ISomeInterface{

    @Override
    public int sum(int a, int b) {
        // Final variable? cant not modified
        // MDFCTR = 6; // Eror
        return a + b * MDFCTR;
    }

    @Override
    public void exampleMethod() {
        System.out.println("exampleMethod");
    }

    @Override
    public void someMethod() {
        System.out.println("someMethod");
    }
}
