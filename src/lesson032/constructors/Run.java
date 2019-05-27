package lesson032.constructors;

public class Run {
    public static void main(String[] args) {



        ConstructorEx constructorEx1 = new ConstructorEx();
        ConstructorEx constructorEx2 = new ConstructorEx(20);

        constructorEx1.notify();

        System.out.println(constructorEx1.i);
        System.out.println(constructorEx2.i);

    }
}
