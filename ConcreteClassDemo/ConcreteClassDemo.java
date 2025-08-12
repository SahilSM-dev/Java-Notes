package ConcreteClassDemo;
// Interface
interface Vehicle{
    void start();
    void stop ();
}

//Abstract class
abstract class FourWheeler implements Vehicle{
    //Concrete method
    public void wheels(){
        System.out.println("I have 4 wheels");
    }
}

class Car extends FourWheeler{
    public void start(){
        System.out.println("Car has started");
    }
    public void stop(){
        System.out.println("Car has stopped");
    }
    public void drive(){
        System.out.println("Car is driving");
    }
}

public class ConcreteClassDemo {
    public static void main(String[] args) {
        Car myCar = new Car(); // Instantiating concrete class
        myCar.start();
        myCar.wheels();
        myCar.drive();
        myCar.stop();
    }
}
