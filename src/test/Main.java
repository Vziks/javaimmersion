package test;

public class Main {

    public static void main(String[] args) {
        One one = new One();
        one.someMethod();

        int i = 5;
        System.out.println(i++ + ++i); // 5 + 7
//        System.out.println(i++);
//        System.out.println(++i);
    }
}
