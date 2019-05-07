package lesson030;

public class SomeClass {

    public static void main(String[] args) {


        AbstractClass extendsClass = new ExtendsClass();


        System.out.println(extendsClass.getSomeInt());
        extendsClass.abstractMethod();
        System.out.println(extendsClass.getSomeInt());
        extendsClass.method();
        System.out.println(extendsClass.getSomeInt());
//        System.out.println(extendsClass.getValue());


    }
}
