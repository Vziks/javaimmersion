package lesson018;

public class Main {
    public static void main(String[] args) {
        OverloadExample overload = new OverloadExample();

        System.out.println(overload.sumTwoDigits(5,6));
        System.out.println(overload.sumTwoDigits(8,3));
        System.out.println(overload.sumTwoDigits(5.7,6.9));
        System.out.println(overload.sumTwoDigits(5.17,6.29));


        OverloadChild overldChld = new OverloadChild();

        overldChld.sumTwoDigits(5);
        overldChld.sumTwoDigits(7);
        System.out.println(overldChld.sumTwoDigits(5,6));
        System.out.println(overldChld.sumTwoDigits(4,11));
    }
}
