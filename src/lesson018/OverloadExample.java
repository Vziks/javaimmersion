package lesson018;

class OverloadExample {

    int sumTwoDigits(int a, int b) {
        return a + b;
    }


    double sumTwoDigits(double a, double b) {
        return a + b;
    }
}

class OverloadChild extends OverloadExample {
    void sumTwoDigits(int a) {
        System.out.println("Overload");
    }
    @Override
    int sumTwoDigits(int a, int b) {
        System.out.println("Override");
        return a + b + 111;
    }

}
