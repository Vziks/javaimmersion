package lesson034.order_of_initialization_of_fields_and_blocks;

public class FirstClass {

    {
        System.out.println(this.getClass().getName() + " class. No static block 1");
    }

    {
        System.out.println(this.getClass().getName() + " class. No static block 2");
    }

    {
        System.out.println(this.getClass().getName() + " class. No static block 3");
    }

    static {
        System.out.println("FirstClass class. Static block 1");
    }

    static {
        System.out.println("FirstClass class. Static block 2");
    }

    public static String firstClass1 = psv("firstClass1");

    public String firstClass11 = pnsv("firstClass11");

    static {
        System.out.println("FirstClass class. Static block 3");
    }

    public static String firstClass2 = psv("firstClass2");

    private static String psv(String a) {
        System.out.println("FirstClass class. Static perem " + a);
        return a;
    }

    private String pnsv(String a) {
        System.out.println("FirstClass class. No static perem " + a);
        return a;
    }

    public FirstClass() {
        System.out.println(this.getClass() + " class. Constructor");
    }


    public String firstClass22 = pnsv("firstClass22");

    public static String firstClass3 = psv("firstClass3");

    {
        System.out.println(this.getClass().getName() + " class. No static block 4");
    }

    public String firstClass33 = pnsv("firstClass33");

}
