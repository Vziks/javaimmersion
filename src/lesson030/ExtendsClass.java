package lesson030;

public class ExtendsClass extends AbstractClass{
    @Override
    void abstractMethod() {
        this.setSomeInt(40);
    }

    @Override
    void method() {
        setSomeInt(100);
    }

    public int getValue() {
        return this.getSomeInt();
    }
}
