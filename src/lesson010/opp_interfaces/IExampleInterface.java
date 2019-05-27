package lesson010.opp_interfaces;

public interface IExampleInterface {

    int MDFCTR = 5;

    int sum(int a, int b);

    void exampleMethod();
}

interface ISomeInterface extends IExampleInterface {

    void someMethod();
}
