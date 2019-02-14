package lesson009;

public class Main {
    public static void main(String[] args) {

        double num1 = 10e+10;

        System.out.println(num1);
        System.out.println(StrictFP.notStrictFP(num1));
        System.out.println(StrictFP.strictFP(num1));

        //Cant not create instance of the Class/Type
        // Abstract abs = new Abstract(); // Error lesson009.Abstract is abstract; cannot be instantiated
        RealizeAbstract realizeabstract = new RealizeAbstract();

        realizeabstract.method();
    }

}
