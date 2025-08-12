package JavaInterfaces;

import java.security.PublicKey;

interface Vehicle{
    int MAX_VALUE = 100;
    String COLOUR = "RED";

    void start();
    void stop();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car has started.");
    }

    public void stop(){
        System.out.println("Car has stopped.");
    }

    // Accessing interface fields
    public void displayFields(){
        System.out.println("Max: " + MAX_VALUE);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();

        // myCar.displayFields();
        // can't access displayFields() method as type of object is Vehicle
        // we need to cast it to Car type

        Car myVehicle = (Car) myCar;
        myVehicle.displayFields();

        // can also access interface variable like this
        System.out.println(Vehicle.COLOUR);
    }
}
