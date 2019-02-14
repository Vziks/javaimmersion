package lesson015;

public class Main {

    public static void main(String[] args) {
        /*
            Output:
            Default
         */
        Constructor cnstrctr01 = new Constructor();
        /*
            Output:
            Constructor with argument
         */
        Constructor cnstrctr02 = new Constructor(5);
        /*
            Output:
            Constructor with argument
            Constructor with 2 argument
         */
        Constructor cnstrctr03 = new Constructor(5, "line");


        Constructor02 cnt = new Constructor02();
        Constructor02 cnt3 = new Constructor02(4);
    }
}
