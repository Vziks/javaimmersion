package lesson020;

public class Main {

    public static void main(String[] args) {
        StaticExample.method();
        StaticExample.i = 6;

        System.out.println("StaticExample.x " + StaticExample.x);

        StaticExample staticObj01 = new StaticExample();
        StaticExample staticObj02 = new StaticExample();


        System.out.println("staticObj01.i " + staticObj01.i);
        System.out.println("staticObj01.j " + staticObj01.j);


        System.out.println("staticObj02.i = " + staticObj02.i);
        System.out.println("staticObj02.j = " + staticObj02.j);


        staticObj01.i = 20;

        System.out.println("staticObj01.i = " + staticObj01.i);
        System.out.println("staticObj02.i = " + staticObj02.i);
        System.out.println("StaticExample.i = " + StaticExample.i);


        StaticExample.i = 30;

        System.out.println("staticObj01.i = " + staticObj01.i);
        System.out.println("staticObj02.i = " + staticObj02.i);
        System.out.println("StaticExample.i = " + StaticExample.i);



        System.out.println(StaticExample.x);

    }
}
