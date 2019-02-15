package lesson025;


public class OverloadExample {
    public static void main(String[] args) {
        short sh = 5;
        Example exml = new Example();
        ExampleError exmlErr = new ExampleError();
        ExampleShortToIntegerError exampleshorttointegererror = new ExampleShortToIntegerError();
        ExampleShortWithoutError exampleshortwithouterror = new ExampleShortWithoutError();

        exml.method(sh);
        // Error
//        exmlErr.method(sh);

//        exampleshorttointegererror.method(sh);
        exampleshortwithouterror.method(sh);
    }
}


class Example {

//    void method(int i) {
//        System.out.println("int i = " + i);
//    }

//    void method(long i) {
//        System.out.println("long i = " + i);
//    }

    void method(Integer i) {
        System.out.println("Integer i = " + i);
    }

    void method(byte i) {
        System.out.println("byte i = " + i);
    }

//    void method(double i) {
//        System.out.println("double i = " + i);
//    }

    void method(byte... i) {
        System.out.println("byte i = " + i);
    }

//    void method(Short i) {
//        System.out.println("Short i = " + i);
//    }

//    void method(Object i) {
//        System.out.println("Object i = " + i);
//    }

    void method(Object... i) {
        System.out.println("Object...");
    }

//    void method(short... i) {
//        System.out.println("short...");
//    }

//    void method(short i) {
//        System.out.println("short i = " + i);
//    }


    void method(Byte i) {
        System.out.println("Byte i = " + i);
    }

//    Primitive -> AutoBoxByTypeAndArrays -> ObjectIfHave -> Arrays...

}


class ExampleError {
    // ERROR

    void method(Integer i) {
        System.out.println("Integer");
    }
//
//    void method(Short... i) {
//        System.out.println("short...");
//    }

    void method(Object... i) {
        System.out.println("Object...");
    }



    void method(short... i) {
        System.out.println("short...");
    }

}


class ExampleShortToIntegerError {
    // ERROR

    void method(Integer i) {
        System.out.println("Integer");
    }

    void method(short... i) {
        System.out.println("short...");
    }

    void method(Object... i) {
        System.out.println("Object...");
    }
}

class ExampleShortWithoutError {
    // ERROR

    void method(Integer i) {
        System.out.println("Integer");
    }

    void method(Short... i) {
        System.out.println("short...");
    }

    void method(Object... i) {
        System.out.println("Object...");
    }
}