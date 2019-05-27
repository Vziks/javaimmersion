package lesson007.oop.oop;

public class Car extends Tranport {

    private int wheels = 4;
    private int speed = 120;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
