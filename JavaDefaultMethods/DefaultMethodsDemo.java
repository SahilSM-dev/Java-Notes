package JavaDefaultMethods;

interface Vehicle {
    void start();

    default void horn(){
        System.out.println("Beep beep!");
    }
}

class Car implements  Vehicle {
    public void start(){
        System.out.println("Car started.");
    }

    //Optionally override default method
    @Override
    public  void horn(){
        System.out.println("Car horn: Honk honk!");
    }
}

class Bike implements Vehicle{
    // Implementing abstract method

    public void start(){
        System.out.println("Bike started.");
    }

    // Overriding default method is optional
}

public class DefaultMethodsDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.horn();

        Vehicle bike = new Bike();
        bike.start();
        bike.horn();

    }
}
