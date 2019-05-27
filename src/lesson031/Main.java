package lesson031;

class See {
    int i;

    See(int y) {
        i = y;

    }

    public See() {

    }


    long someMethod(){
        return 1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3};

        See seee1 = new See(5);


        Obj obj1 = new Obj();
        Obj obj2 = new Obj();

        System.out.println(obj1.getI());
        System.out.println(obj2.getI());

        Main.someMethod(obj1, 20);
        Main.someMethod(obj2, 30);

        System.out.println(obj1.getI());
        System.out.println(obj2.getI());

        for (int i : arrInt) {
            System.out.println(i);
        }
        // Массив тоже перенается по ссылке.
        Main.otherMethod(arrInt);

        for (int i : arrInt) {
            System.out.println(i);
        }

    }

    private static void someMethod(Obj o, int num) {
        o.setI(num);
    }

    private static void otherMethod(int[] arrInt) {
        arrInt[0] = 5;
    }

}
