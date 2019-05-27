package lesson007.oop;

import lesson007.oop.oop.Car;
import lesson007.oop.oop.Tranport;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getSpeed());
        System.out.println(car.getWheels());

        Tranport[] tranports = new Tranport[5];
        for (Tranport trans : tranports) {
            trans = new Car();
            // Fill array
            Arrays.fill(tranports, trans);
        }

        //Access by index
        System.out.println(tranports[1].getSpeed());

        // Object has private field, cant access to him
        //! System.out.println(tranports[1].speed);

        //Loop array
        for (Tranport trans1 : tranports) {
            System.out.println(trans1.getSpeed());
        }
    }
}
