package lesson030;

abstract class AbstractClass {

    private int someInt;

    abstract void abstractMethod();

    void method() {
        setSomeInt(50);
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }
}
