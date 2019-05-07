package lesson029;

public class Main {

    private int i = 10;


    public static void main(String[] args) {

        Main main = new Main();

        System.out.println(main.i);

        main.value(main);

        System.out.println(main.i);


    }

    private void value(Main main) {

        main.i = 20;

    }
}
